package week3.day4.structuralPatterns.exe1;


import java.net.URL;

public class Client {
    public static void main(String[] args) {
        String url ="https://reqres.in/api/users?page=2";
        String putUrl = "https://reqres.in/api/users/2";
        String postUrl= "https://reqres.in/api/users";

    HttpFacade httpFacade = new HttpFacade();
   Response getResponse = httpFacade.get(url);
        Response putResponse= httpFacade.put(putUrl, "morpheus", "zion resident");
        Response postResponse= httpFacade.post(postUrl,"morpheus", "leader");
        Response patchResponse = httpFacade.patch(putUrl,"morpheus", "zion resident");
         Response deleteResponse = httpFacade.delete(putUrl);
   }
}

