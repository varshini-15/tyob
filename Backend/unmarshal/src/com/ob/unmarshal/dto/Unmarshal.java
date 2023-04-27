package com.ob.unmarshal.dto;

import java.io.File;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Unmarshal {
	public static void main(String[] args) {

		try {
			//
			JAXBContext jaxbContext = JAXBContext.newInstance(UserDto.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			UserDto userdto = (UserDto) jaxbUnmarshaller.unmarshal(new File("userDto.xml"));
			// String content = file.collect(Collectors.joining("\n"));
			System.out.println(userdto);
		} catch (JAXBException e) {

			e.printStackTrace();
		}
	}
}
