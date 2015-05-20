/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PlayerClient;

import com.sun.jersey.api.client.*;

import java.util.ArrayList;
import java.util.List;
import clientEntity.Todolist;
/**
 * Jersey REST client generated for REST resource:TodolistFacadeREST
 * [com.entityclient.todolist]<br>
 *  USAGE:
 * <pre>
 *        ReadClient client = new ReadClient();
 *        Object response = client.XXX(...);
 *        // do whatever with response
 *        client.close();
 * </pre>
 */
public class ReadClient {
    private WebResource webResource;
    private Client client;
    private static final String BASE_URI = "http://localhost:8080/webServiss/resources";

    public ReadClient() {
        com.sun.jersey.api.client.config.ClientConfig config = new com.sun.jersey.api.client.config.DefaultClientConfig();
        client = Client.create(config);
        webResource = client.resource(BASE_URI).path("com.entityclient.todolist");
    }

    public void remove(String id) throws UniformInterfaceException {
        webResource.path(java.text.MessageFormat.format("{0}", new Object[]{id})).delete();
    }

    public String countREST() throws UniformInterfaceException {
        WebResource resource = webResource;
        resource = resource.path("count");
        return resource.accept(javax.ws.rs.core.MediaType.TEXT_PLAIN).get(String.class);
    }

    public <T> T findAll_XML(Class<T> responseType) throws UniformInterfaceException {
        WebResource resource = webResource;
        return resource.accept(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public <T> T findAll_JSON(Class<T> responseType) throws UniformInterfaceException {
        WebResource resource = webResource;
        return resource.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(responseType);
    }

    public void edit_XML(Object requestEntity) throws UniformInterfaceException {
        webResource.type(javax.ws.rs.core.MediaType.APPLICATION_XML).put(requestEntity);
    }

    public void edit_JSON(Object requestEntity) throws UniformInterfaceException {
        webResource.type(javax.ws.rs.core.MediaType.APPLICATION_JSON).put(requestEntity);
    }

    public void create_XML(Object requestEntity) throws UniformInterfaceException {
        webResource.type(javax.ws.rs.core.MediaType.APPLICATION_XML).post(requestEntity);
    }

    public void create_JSON(Object requestEntity) throws UniformInterfaceException {
        webResource.type(javax.ws.rs.core.MediaType.APPLICATION_JSON).post(requestEntity);
    }

    public <T> T findRange_XML(Class<T> responseType, String from, String to) throws UniformInterfaceException {
        WebResource resource = webResource;
        resource = resource.path(java.text.MessageFormat.format("{0}/{1}", new Object[]{from, to}));
        return resource.accept(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public <T> T findRange_JSON(Class<T> responseType, String from, String to) throws UniformInterfaceException {
        WebResource resource = webResource;
        resource = resource.path(java.text.MessageFormat.format("{0}/{1}", new Object[]{from, to}));
        return resource.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(responseType);
    }

    public <T> T find_XML(Class<T> responseType, String id) throws UniformInterfaceException {
        WebResource resource = webResource;
        resource = resource.path(java.text.MessageFormat.format("{0}", new Object[]{id}));
        return resource.accept(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public <T> T find_JSON(Class<T> responseType, String id) throws UniformInterfaceException {
        WebResource resource = webResource;
        resource = resource.path(java.text.MessageFormat.format("{0}", new Object[]{id}));
        return resource.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(responseType);
    }

    public void close() {
        client.destroy();
    }
    
    
    public static void main(String[] args) throws UniformInterfaceException
    {
        ReadClient client1 = new ReadClient();
        ClientResponse respon = client1.findAll_XML(ClientResponse.class);
        
        GenericType<List<Todolist>> genericType = new GenericType<List<Todolist>>() {};
        
        List<Todolist> data = new ArrayList<Todolist>();
        data = (respon.getEntity(genericType));
        
        System.out.println("Baca data dari database");
        for (Todolist tdl : data)
        {
            System.out.println("========================");
            System.out.println("ID = "+tdl.getId());
            System.out.println("Tanggal = "+tdl.getTanggal());
            System.out.println("Waktu = "+tdl.getWaktu());
            System.out.println("Kerjaan = "+tdl.getKerjaan());
            System.out.println("Tempat = "+tdl.getTempat());
            System.out.println("Status = "+tdl.getStatus());
        }
    }
}
