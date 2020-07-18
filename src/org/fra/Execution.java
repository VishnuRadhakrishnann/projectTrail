package org.fra;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Execution {
	public static void main(String[] args) throws JAXBException {
		
		JAXBContext jax = JAXBContext.newInstance(employee.class);
		
		Unmarshaller cun = jax.createUnmarshaller();
		
		File f=new File("C:\\Users\\vishn\\eclipse-workspace\\FramesPratice\\data.xml");
		
		Object o = cun.unmarshal(f);
		employee e=(employee)o;
		System.out.println(e.getEmpname());
		System.out.println(e.getEmpId());
		System.out.println(e.getMobno());
	}

}
