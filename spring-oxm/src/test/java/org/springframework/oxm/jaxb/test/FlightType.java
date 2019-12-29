
package org.springframework.oxm.jaxb.test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flightType", propOrder = { "number" })
public class FlightType {

	protected long number;

	public long getNumber() {
		return number;
	}

	public void setNumber(long value) {
		number = value;
	}

}