package week3.day4.structuralPatterns.exe1;

import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class Response {
    int status;
    String body;


    public Response(int status, String body) {
        this.status = status;
        this.body = body;

    }

}
