package task33.task3309;

import task33.task3308.Shop;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

/**
 * Created by ukr-sustavov on 26.07.2017.
 */
public class Solution {
    public static String toXmlWithComment(Object obj, String tagName, String comment) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(obj.getClass());
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
        marshaller.setProperty(tagName, comment);
        StringWriter writer = new StringWriter();
        marshaller.marshal(obj, writer);


        return writer.toString();
    }

    public static void main(String[] args) throws JAXBException {
        Shop shop = new Shop();
        System.out.println(toXmlWithComment(shop, "shop", "sdcsdc"));
    }
}
