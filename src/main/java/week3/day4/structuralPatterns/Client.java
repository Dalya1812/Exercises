package week3.day4.structuralPatterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;
import static jdk.internal.net.http.HttpRequestImpl.USER_AGENT;

public class Client{

//
//    private static void get() throws IOException {
//        URL obj = new URL(GET_URL);
//        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
//        con.setRequestMethod("GET");
//        con.setRequestProperty("User-Agent", USER_AGENT);
//        int responseCode = con.getResponseCode();
//        System.out.println("GET Response Code :: " + responseCode);
//        if (responseCode == HttpURLConnection.HTTP_OK) { // success
//            BufferedReader in = new BufferedReader(new InputStreamReader(
//                    con.getInputStream()));
//            String inputLine;
//            StringBuffer response = new StringBuffer();
//            while ((inputLine = in.readLine()) != null) {
//                response.append(inputLine);
//            }
//            in.close();
//
//            // print result
//            System.out.println(response.toString());
//        } else {
//            System.out.println("GET request not worked");
//        }
//
//    }

//        private static void sendPOST(){
//            URL obj = new URL(POST_URL);
//            HttpURLConnection con = null;
//            try {
//                con = (HttpURLConnection) obj.openConnection();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//            try {
//                con.setRequestMethod("POST");
//            } catch (ProtocolException e) {
//                throw new RuntimeException(e);
//            }
//            con.setRequestProperty("User-Agent", USER_AGENT);
//
//            // For POST only - START
//            con.setDoOutput(true);
//            OutputStream os = null;
//            try {
//                os = con.getOutputStream();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//            os.write(POST_PARAMS.getBytes());
//            try {
//                os.flush();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//            try {
//                os.close();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//            // For POST only - END
//            int responseCode = 0;
//            try {
//                responseCode = con.getResponseCode();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println("POST Response Code :: " + responseCode);
//
//            if (responseCode == HttpURLConnection.HTTP_OK) { //success
//                BufferedReader in = null;
//                try {
//                    in = new BufferedReader(new InputStreamReader(
//                            con.getInputStream()));
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//                String inputLine;
//                StringBuffer response = new StringBuffer();
//
//                while (true) {
//                    try {
//                        if (!((inputLine = in.readLine()) != null)) break;
//                    } catch (IOException e) {
//                        throw new RuntimeException(e);
//                    }
//                    response.append(inputLine);
//                }
//                try {
//                    in.close();
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//
//                // print result
//                System.out.println(response.toString());
//            } else {
//                System.out.println("POST request not worked");
//            }
//        }



    public void put(Path path){
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(path.toUri()).GET().build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    public void patch(Path path){
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(path.toUri()).GET().build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }



    public void delete(Path path){
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(path.toUri()).GET().build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }




    }
