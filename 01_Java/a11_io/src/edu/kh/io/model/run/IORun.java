package edu.kh.io.model.run;

import edu.kh.io.model.service.IOService;

public class IORun {
	
	public static void main(String[] args) {
		
		IOService service = new IOService();
		
		service.byteOutPut();
		
		service.charOutPut();
		
//		service.byteInput();
		service.charInput();
	}

}
