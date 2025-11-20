package com.microdetection.resource;
//@RunAsClient
public class HelloWorldResourceTest {

//
//    @Deployment(testable = false)
//    public static WebArchive createDeployment() {
//        return ShrinkWrap.create(WebArchive.class)
//                .addClass(HelloWorldResource.class)
//                .addClass(JettraConfiguration.class)
//                .addAsResource(new File("src/main/resources/META-INF/microprofile-config.properties"))
//                .addAsWebInfResource(new File("src/main/webapp/WEB-INF/beans.xml"));
//    }
//    
//    @ArquillianResource
//    private URL deploymentUrl;
//    
//    @Test
//    public void testHelloEndpoint() {
//        String baseUrl = deploymentUrl.toString();
//        
//        Client client = ClientBuilder.newClient();
//        Response response = client.target(baseUrl + "api/hello")
//                .queryParam("name", "John")
//                .request(MediaType.TEXT_PLAIN)
//                .get();
//
//
//        assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
//        String responseBody = response.readEntity(String.class);
//        assertEquals("John", responseBody);
//
//        client.close();
//    }
}
