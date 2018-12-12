//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.02 at 04:58:42 PM CET 
//


package eu.fbk.das.process;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eu.fbk.das.process package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.fbk.das.process
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link eu.fbk.das.process.DomainProperty }
     * 
     */
    public eu.fbk.das.process.DomainProperty createDomainProperty() {
        return new eu.fbk.das.process.DomainProperty();
    }

    /**
     * Create an instance of {@link OnDPchangeType }
     * 
     */
    public OnDPchangeType createOnDPchangeType() {
        return new OnDPchangeType();
    }

    /**
     * Create an instance of {@link WhileType }
     * 
     */
    public WhileType createWhileType() {
        return new WhileType();
    }

    /**
     * Create an instance of {@link PickType }
     * 
     */
    public PickType createPickType() {
        return new PickType();
    }

    /**
     * Create an instance of {@link SwitchType }
     * 
     */
    public SwitchType createSwitchType() {
        return new SwitchType();
    }

    /**
     * Create an instance of {@link SwitchType.Default }
     * 
     */
    public SwitchType.Default createSwitchTypeDefault() {
        return new SwitchType.Default();
    }

    /**
     * Create an instance of {@link SwitchType.If }
     * 
     */
    public SwitchType.If createSwitchTypeIf() {
        return new SwitchType.If();
    }

    /**
     * Create an instance of {@link Process }
     * 
     */
    public Process createProcess() {
        return new Process();
    }

    /**
     * Create an instance of {@link AbstractType }
     * 
     */
    public AbstractType createAbstractType() {
        return new AbstractType();
    }

    /**
     * Create an instance of {@link ConcreteType }
     * 
     */
    public ConcreteType createConcreteType() {
        return new ConcreteType();
    }

    /**
     * Create an instance of {@link ReceiveType }
     * 
     */
    public ReceiveType createReceiveType() {
        return new ReceiveType();
    }

    /**
     * Create an instance of {@link InvokeType }
     * 
     */
    public InvokeType createInvokeType() {
        return new InvokeType();
    }

    /**
     * Create an instance of {@link ScopeType }
     * 
     */
    public ScopeType createScopeType() {
        return new ScopeType();
    }

    /**
     * Create an instance of {@link eu.fbk.das.process.DomainProperty.State }
     * 
     */
    public eu.fbk.das.process.DomainProperty.State createDomainPropertyState() {
        return new eu.fbk.das.process.DomainProperty.State();
    }

    /**
     * Create an instance of {@link DomainPropertyEventType }
     * 
     */
    public DomainPropertyEventType createDomainPropertyEventType() {
        return new DomainPropertyEventType();
    }

    /**
     * Create an instance of {@link eu.fbk.das.process.DomainProperty.Transition }
     * 
     */
    public eu.fbk.das.process.DomainProperty.Transition createDomainPropertyTransition() {
        return new eu.fbk.das.process.DomainProperty.Transition();
    }

    /**
     * Create an instance of {@link EventHandlerType }
     * 
     */
    public EventHandlerType createEventHandlerType() {
        return new EventHandlerType();
    }

    /**
     * Create an instance of {@link OnExternalEventType }
     * 
     */
    public OnExternalEventType createOnExternalEventType() {
        return new OnExternalEventType();
    }

    /**
     * Create an instance of {@link DpChangeType }
     * 
     */
    public DpChangeType createDpChangeType() {
        return new DpChangeType();
    }

    /**
     * Create an instance of {@link TriggerEventType }
     * 
     */
    public TriggerEventType createTriggerEventType() {
        return new TriggerEventType();
    }

    /**
     * Create an instance of {@link DomainPropertyStateType }
     * 
     */
    public DomainPropertyStateType createDomainPropertyStateType() {
        return new DomainPropertyStateType();
    }

    /**
     * Create an instance of {@link OnDPchangeType.DomainProperty }
     * 
     */
    public OnDPchangeType.DomainProperty createOnDPchangeTypeDomainProperty() {
        return new OnDPchangeType.DomainProperty();
    }

    /**
     * Create an instance of {@link WhileType.VarCondition }
     * 
     */
    public WhileType.VarCondition createWhileTypeVarCondition() {
        return new WhileType.VarCondition();
    }

    /**
     * Create an instance of {@link PickType.OnMessage }
     * 
     */
    public PickType.OnMessage createPickTypeOnMessage() {
        return new PickType.OnMessage();
    }

    /**
     * Create an instance of {@link SwitchType.Default.Branch }
     * 
     */
    public SwitchType.Default.Branch createSwitchTypeDefaultBranch() {
        return new SwitchType.Default.Branch();
    }

    /**
     * Create an instance of {@link SwitchType.If.VarCondition }
     * 
     */
    public SwitchType.If.VarCondition createSwitchTypeIfVarCondition() {
        return new SwitchType.If.VarCondition();
    }

    /**
     * Create an instance of {@link SwitchType.If.Branch }
     * 
     */
    public SwitchType.If.Branch createSwitchTypeIfBranch() {
        return new SwitchType.If.Branch();
    }

}
