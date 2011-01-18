package org.jboss.easyscala

import javax.ws.rs.{GET, Path, Produces}
import javax.ws.rs.ext.Provider

@Provider
@Path("/root")
class RootService {

  @GET
  @Path("/hello")
  @Produces(Array("text/xml", "application/json"))
  def getMediaType = "hello"

  @GET
  @Path("/hello")
  @Produces(Array("text/html"))
  def getHTML = "hello"
}
