package pl.allegro.tests;

import pl.allegro.base.Base;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Tests extends Base {

    @Test
    public void test01AllCategories() throws IOException{
        System.out.println("----TEST01----");

        String url = "https://api.allegro.pl/sale/categories";
        URL object = new URL(url);
        try {
            HttpURLConnection con = (HttpURLConnection) object.openConnection();
            con.setDoOutput(true);
            con.setDoInput(true);
            con.setRequestMethod("GET");
            con.setRequestProperty("Accept", "application/vnd.allegro.public.v1+json");
            con.setRequestProperty("Authorization", "Bearer " + token);

            StringBuilder sb = new StringBuilder();
            int HttpResult = con.getResponseCode();
            if (HttpResult == HttpURLConnection.HTTP_OK) {
                System.out.println("Response code:" + con.getResponseCode());
                BufferedReader br = new BufferedReader(
                        new InputStreamReader(con.getInputStream(), "utf-8"));
                String line = null;
                while ((line = br.readLine()) != null) {
                    sb.append(line + "\n");
                }
                br.close();
                System.out.println("Response: " + sb);
            } else {
                System.out.println(con.getResponseMessage());
            }
        } catch (Exception e) {
            System.out.println("Check connection, please");
        }
    }

    @Test
    public void test02CategoriesByID() throws IOException {
        System.out.println("----TEST02----");

        String url = "https://api.allegro.pl/sale/categories/12";
        URL object = new URL(url);
        try {
            HttpURLConnection con = (HttpURLConnection) object.openConnection();
            con.setDoOutput(true);
            con.setDoInput(true);
            con.setRequestMethod("GET");
            con.setRequestProperty("Accept", "application/vnd.allegro.public.v1+json");
            con.setRequestProperty("Authorization", "Bearer " + token);

            StringBuilder sb = new StringBuilder();
            int HttpResult = con.getResponseCode();
            if (HttpResult == HttpURLConnection.HTTP_OK) {
                System.out.println("Response code:" + con.getResponseCode());
                BufferedReader br = new BufferedReader(
                        new InputStreamReader(con.getInputStream(), "utf-8"));
                String line = null;
                while ((line = br.readLine()) != null) {
                    sb.append(line + "\n");
                }
                br.close();
                System.out.println("Response: " + sb);
            } else {
                System.out.println(con.getResponseMessage());
            }
        } catch (Exception e) {
            System.out.println("Check connection, please");
        }
    }

    @Test
    public void test03CategoriesByIDParameters() throws IOException {
        System.out.println("----TEST03----");

        String url = "https://api.allegro.pl/sale/categories/12/parameters";
        URL object = new URL(url);
        try {
            HttpURLConnection con = (HttpURLConnection) object.openConnection();
            con.setDoOutput(true);
            con.setDoInput(true);
            con.setRequestMethod("GET");
            con.setRequestProperty("Accept", "application/vnd.allegro.public.v1+json");
            con.setRequestProperty("Authorization", "Bearer " + token);

            StringBuilder sb = new StringBuilder();
            int HttpResult = con.getResponseCode();
            if (HttpResult == HttpURLConnection.HTTP_OK) {
                System.out.println("Response code:" + con.getResponseCode());
                BufferedReader br = new BufferedReader(
                        new InputStreamReader(con.getInputStream(), "utf-8"));
                String line = null;
                while ((line = br.readLine()) != null) {
                    sb.append(line + "\n");
                }
                br.close();
                System.out.println("Response: " + sb);
            } else {
                System.out.println(con.getResponseMessage());
            }
        } catch (Exception e) {
            System.out.println("Check connection, please");
        }
    }
}