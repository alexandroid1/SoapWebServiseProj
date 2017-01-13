package ua.alexandroid1.alex;

/**
 * Created by Oleksandr on 13.01.2017.
 */
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for country complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * <complexType name="country">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="population" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="capital" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="currency" type="{http://spring.io/guides/gs-producing-web-service}currency"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "country", propOrder = {
        "name",
        "population",
        "capital",
        "currency"
})
public class Country {

    @XmlElement(required = true)
    protected String name;
    protected int population;
    @XmlElement(required = true)
    protected String capital;
    @XmlElement(required = true)
    protected Currency currency;

    /**
     * Gets the value of the name property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the population property.
     *
     */
    public int getPopulation() {
        return population;
    }

    /**
     * Sets the value of the population property.
     *
     */
    public void setPopulation(int value) {
        this.population = value;
    }

    /**
     * Gets the value of the capital property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCapital() {
        return capital;
    }

    /**
     * Sets the value of the capital property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCapital(String value) {
        this.capital = value;
    }

    /**
     * Gets the value of the currency property.
     *
     * @return
     *     possible object is
     *     {@link Currency }
     *
     */
    public Currency getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     *
     * @param value
     *     allowed object is
     *     {@link Currency }
     *
     */
    public void setCurrency(Currency value) {
        this.currency = value;
    }

}
