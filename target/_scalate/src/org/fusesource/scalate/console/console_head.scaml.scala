/* NOTE this file is autogenerated by Scalate : see http://scalate.fusesource.org/ */
package org.fusesource.scalate.console

import scala.collection.JavaConversions._
import org.fusesource.scalate.support.TemplateConversions._

object $_scalate_$console_head_scaml {
  def $_scalate_$render($_scalate_$_context: _root_.org.fusesource.scalate.RenderContext): Unit = {
    import _root_.org.fusesource.scalate.support.RenderHelper.{sanitize=>$_scalate_$_sanitize, preserve=>$_scalate_$_preserve, indent=>$_scalate_$_indent, smart_sanitize=>$_scalate_$_smart_sanitize, attributes=>$_scalate_$_attributes}
    ;{
      implicit val context: org.fusesource.scalate.servlet.ServletRenderContext = $_scalate_$_context.attribute("context")
      import context._
      
      
      //
      //       Copyright (C) 2009-2010 the original author or authors.

      //       See the notice.md file distributed with this work for additional

      //       information regarding copyright ownership.

      //
      //       Licensed under the Apache License, Version 2.0 (the "License");

      //       you may not use this file except in compliance with the License.

      //       You may obtain a copy of the License at

      //
      //           http://www.apache.org/licenses/LICENSE-2.0

      //
      //       Unless required by applicable law or agreed to in writing, software

      //       distributed under the License is distributed on an "AS IS" BASIS,

      //       WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

      //       See the License for the specific language governing permissions and

      //       limitations under the License.

      //
      ;{
        val consoleHelper: ConsoleHelper = $_scalate_$_context.attributeOrElse("consoleHelper", new ConsoleHelper(context))
        import consoleHelper._
                if (isDevelopmentMode)
{
                    if (optionEnabled("body"))
{
            //             var base="http://alexgorbatchev.com/pub/sh/2.1.364"

                        var base="http://scalate.fusesource.org/repo/tools/SyntaxHighlighter/2.1.364"

            $_scalate_$_context << ( "<link" );
            $_scalate_$_context << $_scalate_$_attributes( $_scalate_$_context, List( (
                "href"
              ,
                "" + $_scalate_$_context.value(                base
, false) + "/styles/shCore.css"
              ), (
                "rel"
              ,
                "stylesheet"
              ), (
                "type"
              ,
                "text/css"
            ) ) )
            $_scalate_$_context << ( "/>\n<link" );
            $_scalate_$_context << $_scalate_$_attributes( $_scalate_$_context, List( (
                "href"
              ,
                "" + $_scalate_$_context.value(                base
, false) + "//styles/shThemeDefault.css"
              ), (
                "rel"
              ,
                "stylesheet"
              ), (
                "type"
              ,
                "text/css"
            ) ) )
            $_scalate_$_context << ( "/>\n<script" );
            $_scalate_$_context << $_scalate_$_attributes( $_scalate_$_context, List( (
                "src"
              ,
                "" + $_scalate_$_context.value(                base
, false) + "/scripts/shCore.js"
              ), (
                "type"
              ,
                "text/javascript"
            ) ) )
            $_scalate_$_context << ( "></script>\n<script" );
            $_scalate_$_context << $_scalate_$_attributes( $_scalate_$_context, List( (
                "src"
              ,
                "" + $_scalate_$_context.value(                base
, false) + "/scripts/shBrushXml.js"
              ), (
                "type"
              ,
                "text/javascript"
            ) ) )
            $_scalate_$_context << ( "></script>\n" );
          }
        }
      }
    }
  }
}


class $_scalate_$console_head_scaml extends _root_.org.fusesource.scalate.Template {
  def render(context: _root_.org.fusesource.scalate.RenderContext): Unit = $_scalate_$console_head_scaml.$_scalate_$render(context)
}
