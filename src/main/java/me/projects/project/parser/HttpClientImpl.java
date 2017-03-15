/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.projects.project.parser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author hrachya.y
 */
public class HttpClientImpl implements HttpClient{

    @Override
    public String getContent(String url) throws MalformedURLException, IOException {
        URL urlObj;
        urlObj = new URL(url);

        HttpURLConnection con;
        con = (HttpURLConnection) urlObj.openConnection();

        //add request header
        con.setRequestProperty("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/51.0.2704.103 Safari/537.36");
        BufferedReader in;
            in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
        }
        in.close();
        
        return response.toString();
    }
}
