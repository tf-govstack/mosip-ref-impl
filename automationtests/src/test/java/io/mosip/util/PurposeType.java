//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.12.06 at 02:49:01 PM IST 
//


package io.mosip.util;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PurposeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PurposeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Verify"/&gt;
 *     &lt;enumeration value="Identify"/&gt;
 *     &lt;enumeration value="Enroll"/&gt;
 *     &lt;enumeration value="EnrollVerify"/&gt;
 *     &lt;enumeration value="EnrollIdentify"/&gt;
 *     &lt;enumeration value="Audit"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PurposeType")
@XmlEnum
public enum PurposeType {

    @XmlEnumValue("Verify")
    VERIFY("Verify"),
    @XmlEnumValue("Identify")
    IDENTIFY("Identify"),
    @XmlEnumValue("Enroll")
    ENROLL("Enroll"),
    @XmlEnumValue("EnrollVerify")
    ENROLL_VERIFY("EnrollVerify"),
    @XmlEnumValue("EnrollIdentify")
    ENROLL_IDENTIFY("EnrollIdentify"),
    @XmlEnumValue("Audit")
    AUDIT("Audit");
    private final String value;

    PurposeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PurposeType fromValue(String v) {
        for (PurposeType c: PurposeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
