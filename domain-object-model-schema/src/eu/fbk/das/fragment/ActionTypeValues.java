//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.02 at 04:58:42 PM CET 
//


package eu.fbk.das.fragment;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for actionTypeValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="actionTypeValues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="input"/>
 *     &lt;enumeration value="output"/>
 *     &lt;enumeration value="abstract"/>
 *     &lt;enumeration value="concrete"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "actionTypeValues")
@XmlEnum
public enum ActionTypeValues {

    @XmlEnumValue("input")
    INPUT("input"),
    @XmlEnumValue("output")
    OUTPUT("output"),
    @XmlEnumValue("abstract")
    ABSTRACT("abstract"),
    @XmlEnumValue("concrete")
    CONCRETE("concrete");
    private final String value;

    ActionTypeValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActionTypeValues fromValue(String v) {
        for (ActionTypeValues c: ActionTypeValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
