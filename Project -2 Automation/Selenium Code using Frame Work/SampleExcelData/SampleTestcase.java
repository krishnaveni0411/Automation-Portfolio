package testCase;

import java.io.IOException;
import java.util.ArrayList;

import dataDriven.dataDriven;

public class TestCaseSample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		dataDriven d = new dataDriven();
		ArrayList<String> data = d.getData("purchase");
		for(int i=0; i<data.size(); i++) {
		System.out.println(data.get(i));
		}
}

}
