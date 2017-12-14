package com.cheng.HttpClient;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Download {

	public static void main(String[] args) {

		try {
			URL url = new URL("http://pimg1.126.net/movie/product/movie/151212200931411251_260_346_webp.jpg");

			HttpURLConnection connection = (HttpURLConnection) url.openConnection();

			/*
			 * connection.setDoOutput(true); connection.setDoInput(true);
			 */
			/* connection.setRequestProperty("content-type", "text/xml;charset=utf-8"); */

			connection.setRequestMethod("GET");
			connection.setConnectTimeout(5000);
			connection.setReadTimeout(5000);

		
			if (connection.getResponseCode() == 200) {

				InputStream inputStream = connection.getInputStream();
				File file = new File("D:/login.png");
				FileOutputStream out = new FileOutputStream(file);

				byte[] bytes = new byte[1024];
				int length;
				while ((length = inputStream.read(bytes)) != -1) {
					out.write(bytes, 0, length);
				}

			}

		} catch (MalformedURLException e) {

			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
