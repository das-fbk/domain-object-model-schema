//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.02 at 04:58:42 PM CET 
//


package eu.fbk.das.process;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Event handler for corresponding scope.
 * 
 * 				Guards:
 * 				-
 * 				onDPchanges: monitor for internal domain property chances.
 * 				Corresponding action must be only triggerEvent
 * 				- onExternalEvent:
 * 				monitor for external issues and exogenous events.
 * 				Corresponding
 * 				actions could be both triggerEvent and dpChange
 * 
 * 				Actions:
 * 				-
 * 				triggerEvent: trigger analizer. For example a command that analyzer
 * 				could handle
 * 				- dpChange: change a domain property (identified by dp
 * 				Name)
 * 				triggering an eventName on it
 * 			
 * 
 * <p>Java class for eventHandlerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eventHandlerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://das.fbk.eu/Process}eventGuards"/>
 *         &lt;group ref="{http://das.fbk.eu/Process}eventActions"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eventHandlerType", propOrder = {
    "onDPchange",
    "onExternalEvent",
    "triggerEvent",
    "dpChange"
})
public class EventHandlerType {

    protected OnDPchangeType onDPchange;
    protected OnExternalEventType onExternalEvent;
    protected TriggerEventType triggerEvent;
    protected DpChangeType dpChange;

    /**
     * Gets the value of the onDPchange property.
     * 
     * @return
     *     possible object is
     *     {@link OnDPchangeType }
     *     
     */
    public OnDPchangeType getOnDPchange() {
        return onDPchange;
    }

    /**
     * Sets the value of the onDPchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnDPchangeType }
     *     
     */
    public void setOnDPchange(OnDPchangeType value) {
        this.onDPchange = value;
    }

    /**
     * Gets the value of the onExternalEvent property.
     * 
     * @return
     *     possible object is
     *     {@link OnExternalEventType }
     *     
     */
    public OnExternalEventType getOnExternalEvent() {
        return onExternalEvent;
    }

    /**
     * Sets the value of the onExternalEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnExternalEventType }
     *     
     */
    public void setOnExternalEvent(OnExternalEventType value) {
        this.onExternalEvent = value;
    }

    /**
     * Gets the value of the triggerEvent property.
     * 
     * @return
     *     possible object is
     *     {@link TriggerEventType }
     *     
     */
    public TriggerEventType getTriggerEvent() {
        return triggerEvent;
    }

    /**
     * Sets the value of the triggerEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerEventType }
     *     
     */
    public void setTriggerEvent(TriggerEventType value) {
        this.triggerEvent = value;
    }

    /**
     * Gets the value of the dpChange property.
     * 
     * @return
     *     possible object is
     *     {@link DpChangeType }
     *     
     */
    public DpChangeType getDpChange() {
        return dpChange;
    }

    /**
     * Sets the value of the dpChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link DpChangeType }
     *     
     */
    public void setDpChange(DpChangeType value) {
        this.dpChange = value;
    }

}
