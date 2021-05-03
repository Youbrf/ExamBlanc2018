/**
 * 
 */
package Utility;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import index.Evenement;
import index.Meeting;
import index.Participant;

/**
 * @author YCH
 *
 */
public class Utilities {

	private static XStream xstream = new XStream(new DomDriver());
	/*
	 * Sérialisation
	 */
	public static void toXMLFile(Meeting meeting, String fileName) {
		//Configurer XStream
		xstream.alias("Meeting", Meeting.class);
		xstream.alias("Participant", Participant.class);
		xstream.aliasField("date", Evenement.class, "dateEvent");
		xstream.useAttributeFor(Meeting.class,"dateEvent");
		xstream.useAttributeFor(Meeting.class,"lieu");
		xstream.addImplicitCollection(Meeting.class, "participants");
		//Convertir en String XML et sauve dans le fichier texte
		try {
			xstream.toXML(meeting,new FileWriter(fileName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/*
	 * Déserialisation
	 */
	public static Meeting fromXml(String fileName) {
		//Configuration XStream
		xstream.alias("Meeting", Meeting.class);
		xstream.alias("Participant", Participant.class);
		xstream.aliasField("date", Evenement.class, "dateEvent");
		xstream.useAttributeFor(Meeting.class,"dateEvent");
		xstream.useAttributeFor(Meeting.class,"lieu");
		xstream.addImplicitCollection(Meeting.class, "participants");
		// Récuperer l'objet Rdisc 
		return (Meeting) xstream.fromXML(new File(fileName));
		
	}

}
