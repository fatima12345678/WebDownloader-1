package sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class HTTPConnection {

    public static String Connection(String urlDownload) throws IOException {

        String PageHtml = null;
        String line;


        URL url = new URL(urlDownload);
        BufferedReader reader =  new BufferedReader(new InputStreamReader(url.openStream()));

        while ((line = reader.readLine()) != null) {
            PageHtml+=line;
        }


        reader.close();
        return PageHtml ;
    }
}




    /*public static String Connection(String urlDownload, String PlaceSave) throws IOException {

        String PageHtml = null;
        String line;


        URL url = new URL(urlDownload);
        BufferedReader reader =  new BufferedReader(new InputStreamReader(url.openStream()));
        BufferedWriter writer = new BufferedWriter(new FileWriter(PlaceSave));


        while ((line = reader.readLine()) != null) {
            writer.write(line);
            writer.newLine();
            PageHtml+=line;
        }


        reader.close();
        writer.close();



        return PageHtml ;
    }*/