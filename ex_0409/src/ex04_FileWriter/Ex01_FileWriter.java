package ex04_FileWriter;

import java.io.FileWriter;

public class Ex01_FileWriter {
	public static void main(String[] args) {
		FileWriter fw = null;
		
		try {
			//파일정해주고 파일 없으면 생성도 해준다.
			fw = new FileWriter("D:\\full_stack_lhj\\3.JAVA\\fileWriter예제.txt");
			
			String str = "hi";
			
			//파일에 내용 작성
			fw.write("첫번째 줄 작성합니다.\n");
			fw.write("두번째 줄 작성합니다.");
			
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}




