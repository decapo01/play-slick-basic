
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Seq[Cat],Seq[Dog],RequestHeader,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(cats: Seq[Cat], dogs: Seq[Dog])(implicit request: RequestHeader, messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.87*/("""

"""),_display_(/*3.2*/main("Cat & Dog database")/*3.28*/ {_display_(Seq[Any](format.raw/*3.30*/("""
"""),format.raw/*4.1*/("""<div>
  <div id="cats">
    <h2>Insert a kitty cat here:</h2>

    <form action="/insert/cat" method="POST">
			"""),_display_(/*9.5*/helper/*9.11*/.CSRF.formField),format.raw/*9.26*/("""
      """),format.raw/*10.7*/("""<input name="name" type="text" placeholder="name your feline friend"/>
      <input name="color" type="text" placeholder="enter the color of this kitty cat"/>
      <input type="submit"/>
    </form>

    <h2>Previously inserted cats:</h2>
    <table>
      <tr><th>Name</th><th>Color</th></tr>
      """),_display_(/*18.8*/for(c <- cats) yield /*18.22*/{_display_(Seq[Any](format.raw/*18.23*/(""" 
      """),format.raw/*19.7*/("""<tr><td>"""),_display_(/*19.16*/c/*19.17*/.name),format.raw/*19.22*/("""</td><td>"""),_display_(/*19.32*/c/*19.33*/.color),format.raw/*19.39*/("""</td></tr>
      """)))}),format.raw/*20.8*/("""
    """),format.raw/*21.5*/("""</table>
  </div>

  <div id="dogs">
    <h2>Insert a kitty dog here:</h2>

    <form action="/insert/dog" method="POST">
			"""),_display_(/*28.5*/helper/*28.11*/.CSRF.formField),format.raw/*28.26*/("""
      """),format.raw/*29.7*/("""<input name="name" type="text" placeholder="name your canine friend"/>
      <input name="color" type="text" placeholder="enter the color of this kitty dog"/>
      <input type="submit"/>
    </form>

    <h2>Previously inserted dogs:</h2>
    <table>
      <tr><th>Name</th><th>Color</th></tr>
      """),_display_(/*37.8*/for(d <- dogs) yield /*37.22*/{_display_(Seq[Any](format.raw/*37.23*/(""" 
      """),format.raw/*38.7*/("""<tr><td>"""),_display_(/*38.16*/d/*38.17*/.name),format.raw/*38.22*/("""</td><td>"""),_display_(/*38.32*/d/*38.33*/.color),format.raw/*38.39*/("""</td></tr>
      """)))}),format.raw/*39.8*/("""
    """),format.raw/*40.5*/("""</table>
  </div>
</div>
""")))}),format.raw/*43.2*/("""
"""))
      }
    }
  }

  def render(cats:Seq[Cat],dogs:Seq[Dog],request:RequestHeader,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(cats,dogs)(request,messages)

  def f:((Seq[Cat],Seq[Dog]) => (RequestHeader,Messages) => play.twirl.api.HtmlFormat.Appendable) = (cats,dogs) => (request,messages) => apply(cats,dogs)(request,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Jan 28 20:56:52 CST 2018
                  SOURCE: /home/decapo/apps/play-slick-basic/app/views/index.scala.html
                  HASH: 015b050142695a1b9e191139f33bf7b6aeb1c864
                  MATRIX: 763->1|943->86|971->89|1005->115|1044->117|1071->118|1209->231|1223->237|1258->252|1292->259|1620->561|1650->575|1689->576|1724->584|1760->593|1770->594|1796->599|1833->609|1843->610|1870->616|1918->634|1950->639|2102->765|2117->771|2153->786|2187->793|2515->1095|2545->1109|2584->1110|2619->1118|2655->1127|2665->1128|2691->1133|2728->1143|2738->1144|2765->1150|2813->1168|2845->1173|2901->1199
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|34->9|34->9|34->9|35->10|43->18|43->18|43->18|44->19|44->19|44->19|44->19|44->19|44->19|44->19|45->20|46->21|53->28|53->28|53->28|54->29|62->37|62->37|62->37|63->38|63->38|63->38|63->38|63->38|63->38|63->38|64->39|65->40|68->43
                  -- GENERATED --
              */
          