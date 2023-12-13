package week1.day1;

import mobile.mobile;

public class Mobile {
	
		public static void main(String[] args) {
			
			//ClassName objectName=new ClassName();
			
			mobile obj=new mobile();
			
			//objectName.MethodName(related)
			obj.sendMessage();
			obj.shareDocument();
			obj.makeCall();
			obj.videoCall();
			obj.audioCall();
			obj.numberSave();
			obj.takePhoto();
			obj.takeVideo();
			obj.photoEdit();
			obj.playingGame();
			
			System.out.println();
			
		}
		
		public void sendMessage() {
			
			System.out.println("Send a message");
		}
		
		public void shareDocument() {
			
		  System.out.println("Share a document ");
		}
		
		public void makeCall()  {
			
			System.out.println("Make a call");
		}
		
		public void audioCall()  {
			System.out.println("Audiocall");
		
		}
		
		public void videoCall() {
			System.out.println("Videocall");
		}
		
		public void numberSave() {
			System.out.println("Number is save");
		}
		
		public void takePhoto() {
			System.out.println("Take a photo");
		}
		
		public void takeVideo() {
			System.out.println("Take a video");
		}
		
		public void photoEdit() {
			System.out.println("Photo is edit");
		}
		
		public void videoEdit() {
			System.out.println("Video is edit");
		}
		
		public void playingGame() {
			System.out.println("Playing a game ");
		}
		
		
		   
	   
	 

}
