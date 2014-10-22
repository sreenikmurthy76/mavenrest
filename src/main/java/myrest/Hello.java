package myrest;


import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.QueryParam;
import javax.ws.rs.PathParam;

 
@Path("hello")
public class Hello{
	

	 @GET
	 @Produces(MediaType.TEXT_HTML)
	 public String sayHelloInHtml(@QueryParam("name") String name, @QueryParam("address") String address) {
	   return "<html> " + "<title>" + "hello" +  "</title>"
	 + "<body><h1> Hi man " + name + "living in the area of" + address + "</body></h1>" + "</html> ";
	 }

	 	
	    
	    @POST
	    @Path("/post")
	    //@Consumes(MediaType.APPLICATION_JSON)
	    public Response postStrJSON( String msg) {
	    	System.out.println(msg);
	        String output = "POST:Jersey say JSON Recieved is: " + msg;
	        return Response.status(200).entity(output).build();
	    }
}