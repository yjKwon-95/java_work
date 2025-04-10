package ex03_FileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Exam1 {
	public static void main(String[] args) {
		//file.txt를 만들고
		//문장을 입력하고 저장을 한다.
		//FileInputStream으로 읽어온 뒤, 회문인지 아닌지 검증하세요
		
		//1. file.txt의 내용을 읽어온다.
		String path = "D:\\full_stack_lhj\\3.JAVA\\file.txt";
		
		File f = new File(path);
		
		FileInputStream fis = null;
		byte [] read = new byte[(int)f.length()];
		try {
			fis = new FileInputStream(f);
			
			fis.read(read);
			
			String ori = new String(read);
			System.out.println(ori);
			
			StringBuilder sb = new StringBuilder(ori);
			StringBuilder rev = sb.reverse();//문자열 뒤집기
			
			if(sb.equals(rev)) {
				System.out.println(ori+"는 회문입니다.");
			} else {
				System.out.println(ori+"는 회문이 아닙니다.");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if(fis != null) {
					fis.close();//IOException이 발생할 수 있다.
				}
			} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
		
		
		
		
		
		
		
		}	
	}

