package week3.day4.structuralPatterns.exe1;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.*;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class HttpFacade {
    static CloseableHttpClient httpClient = HttpClients.createDefault();
    int status;
    String body;
    public  Response get(String url) {
        System.out.print("Get request:");
        HttpGet request = new HttpGet(url);
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            CloseableHttpResponse response = httpClient.execute(request);{
                status = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                body = EntityUtils.toString(entity);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println( "Status " + status);
        return new Response(status,body);
    }

    public  Response post(String url, String param1, String param2) {
        System.out.print("Post request:");
        HttpPost httpPost = new HttpPost(url);
        Response result = null;
        List<NameValuePair> urlParameters = new ArrayList<>();
        urlParameters.add(new BasicNameValuePair("email", param1));
        urlParameters.add(new BasicNameValuePair("password", param2));
        try {
            httpPost.setEntity(new UrlEncodedFormEntity(urlParameters));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        return responseFromHttp(httpPost);
    }


    public  Response put(String url,String param1, String param2) {
        System.out.print("Put request:");
        HttpPut put = new HttpPut(url);
        Response result = null;
        List<NameValuePair> urlParameters = new ArrayList<>();
        urlParameters.add(new BasicNameValuePair("email", param1));
        urlParameters.add(new BasicNameValuePair("password", param2));
        try {
            put.setEntity(new UrlEncodedFormEntity(urlParameters));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        return responseFromHttp(put);
    }

    public  Response patch(String url,String param1, String param2) {
        System.out.print("Patch request:");
        HttpPatch patch = new HttpPatch(url);
        Response result = null;
        List<NameValuePair> urlParameters = new ArrayList<>();
        urlParameters.add(new BasicNameValuePair("email", param1));
        urlParameters.add(new BasicNameValuePair("password", param2));
        try {
            patch.setEntity(new UrlEncodedFormEntity(urlParameters));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        return responseFromHttp(patch);
    }

    public  Response delete(String url) {
        System.out.print("Delete request:");
        HttpDelete delete = new HttpDelete(url);
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            CloseableHttpResponse response = httpClient.execute(delete);{
                status = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                body = EntityUtils.toString(entity);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println( "Status " + status);
        return new Response(status,body);
    }



    private Response responseFromHttp(HttpRequestBase request){
        int statusCode=0;
        String body=null;
        CloseableHttpClient httpClient = HttpClients.createDefault();
        try(CloseableHttpResponse response = httpClient.execute(request)) {
            statusCode = response.getStatusLine().getStatusCode();
            HttpEntity entity = response.getEntity();
            body = EntityUtils.toString(entity);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Status " + status);
        return new Response(statusCode, body);
    }

}

