package org.springframework.samples.flight.impl;

import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;

import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.springframework.samples.flight.FlightType;
import org.springframework.samples.flight.FlightsDocument;

public class FlightsDocumentImpl extends XmlComplexContentImpl implements FlightsDocument {

	private static final long serialVersionUID = 1L;

	private static final QName FLIGHTS$0 = 
		new QName("http://samples.springframework.org/flight", "flights");

	public FlightsDocumentImpl(SchemaType paramSchemaType) {
		super(paramSchemaType);
	}

	public FlightsDocument.Flights getFlights() {
		synchronized (monitor()) {
			check_orphaned();
			FlightsDocument.Flights localFlights = null;
			localFlights = (FlightsDocument.Flights) get_store().find_element_user(FLIGHTS$0, 0);
			if (localFlights == null) {
				return null;
			}
			return localFlights;
		}
	}

	public void setFlights(FlightsDocument.Flights paramFlights) {
		generatedSetterHelperImpl(paramFlights, FLIGHTS$0, 0, (short) 1);
	}

	public FlightsDocument.Flights addNewFlights() {
		synchronized (monitor()) {
			check_orphaned();
			FlightsDocument.Flights localFlights = null;
			localFlights = (FlightsDocument.Flights) get_store().add_element_user(
					FLIGHTS$0);
			return localFlights;
		}
	}

	public static class FlightsImpl extends XmlComplexContentImpl implements FlightsDocument.Flights {

		public FlightsImpl(SchemaType schemaType) {
			super(schemaType);
		}

		private static final long serialVersionUID = 1L;

		private static final QName FLIGHT$0 = 
			new QName("http://samples.springframework.org/flight", "flight");

		public FlightType[] getFlightArray() {
			synchronized (monitor()) {
				check_orphaned();
				List<FlightType> localArrayList = new ArrayList<FlightType>(16);
				get_store().find_all_element_users(FLIGHT$0, localArrayList);
				FlightType[] arrayOfFlightType = new FlightType[localArrayList.size()];
				localArrayList.toArray(arrayOfFlightType);
				return arrayOfFlightType;
			}
		}

		public FlightType getFlightArray(int paramInt) {
			synchronized (monitor()) {
				check_orphaned();
				FlightType localFlightType = null;
				localFlightType = (FlightType) get_store().find_element_user(FLIGHT$0, paramInt);
				if (localFlightType == null) {
					throw new IndexOutOfBoundsException();
				}
				return localFlightType;
			}
		}

		public int sizeOfFlightArray() {
			synchronized (monitor()) {
				check_orphaned();
				return get_store().count_elements(FLIGHT$0);
			}
		}

		public void setFlightArray(FlightType[] paramArrayOfFlightType) {
			check_orphaned();
			arraySetterHelper(paramArrayOfFlightType, FLIGHT$0);
		}

		public void setFlightArray(int paramInt, FlightType paramFlightType) {
			generatedSetterHelperImpl(paramFlightType, FLIGHT$0, paramInt, (short) 2);
		}

		public FlightType insertNewFlight(int paramInt) {
			synchronized (monitor()) {
				check_orphaned();
				FlightType localFlightType = null;
				localFlightType = (FlightType) get_store().insert_element_user(FLIGHT$0,
						paramInt);
				return localFlightType;
			}
		}

		public FlightType addNewFlight() {
			synchronized (monitor()) {
				check_orphaned();
				FlightType localFlightType = null;
				localFlightType = (FlightType) get_store().add_element_user(FLIGHT$0);
				return localFlightType;
			}
		}

		public void removeFlight(int paramInt) {
			synchronized (monitor()) {
				check_orphaned();
				get_store().remove_element(FLIGHT$0, paramInt);
			}
		}
	}

}