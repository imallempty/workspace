package edu.kh.network.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public void start() {
		
		int port = 8500;
		String ip = "127.0.0.1";
		
		// 서버와 연결된 소켓
		Socket clientSocket = null;
		
		// 스트림 성능 개선
		InputStream is = null;
		OutputStream os = null;
		
		// 스트림 성능 개선
		BufferedReader br = null;
		PrintWriter pw = null;
	
		try {
			// Server Socket을 찾아가 연결해달라고 부탁
			clientSocket = new Socket(ip, port);
			
			if(clientSocket != null) {
				is = clientSocket.getInputStream();
				os = clientSocket.getOutputStream();
				
				br = new BufferedReader(new InputStreamReader(is));
				pw = new PrintWriter(os);

				String severMassage = br.readLine();
				System.out.println(severMassage);
				
				System.out.println(severMassage);
				
				Scanner sc = new Scanner(System.in);
				System.out.print("서버로 전달할 메세지 : ");
				String message = sc.nextLine();
				
				pw.println(message);
				pw.flush();
				

			
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		
		} finally {
		// 메모리 누수 관리
			try {
				if(br != null) br.close();
				if(pw != null) pw.close();
				if(clientSocket != null ) clientSocket.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}
	
}
