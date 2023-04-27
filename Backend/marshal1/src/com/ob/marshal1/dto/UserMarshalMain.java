package com.ob.marshal1.dto;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UserMarshalMain {
	public static void main(String[] args) {
		UserDto userDto = new UserDto();
		userDto.setUserId(1001);
		userDto.setUserName("Varshini");
		userDto.setUserNo("7897989");
		userDto.setUserPassword("1234");
		try {
			JAXBContext context = JAXBContext.newInstance(UserDto.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(userDto, System.out);

			marshaller.marshal(userDto, new File("userDto.xml"));

		} catch (JAXBException e) {

			e.printStackTrace();
		}

	}

}
