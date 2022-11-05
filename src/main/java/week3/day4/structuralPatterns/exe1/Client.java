package week3.day4.structuralPatterns.exe1;


import java.net.URL;

public class Client {
    public static void main(String[] args) {
        String url ="https://reqres.in/";
    HttpFacade httpFacade = new HttpFacade();
   Response getResponse = httpFacade.get(url);
   Response postResponse= httpFacade.post(url,"dalya1812@gmail.com", "dalia");
  Response putResponse= httpFacade.put(url,"dalya1812@gmail.com", "dalia");
  Response patchResponse = httpFacade.patch(url,"dalya1812@gmail.com", "dalia");
  Response deleteResponse = httpFacade.delete(url);
   }
}

