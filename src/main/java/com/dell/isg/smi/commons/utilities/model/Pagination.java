/**
 * Copyright � 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2016.03.04 at 01:18:28 PM CST
//

package com.dell.isg.smi.commons.utilities.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * The Class Pagination.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pagination", propOrder = { "offset", "limit", "total" })
public class Pagination {

    protected long offset;
    protected long limit;
    protected long total;


    /**
     * Gets the value of the offset property.
     *
     * @return the offset
     */
    public long getOffset() {
        return offset;
    }


    /**
     * Sets the value of the offset property.
     *
     * @param value the new offset
     */
    public void setOffset(long value) {
        this.offset = value;
    }


    /**
     * Gets the value of the limit property.
     *
     * @return the limit
     */
    public long getLimit() {
        return limit;
    }


    /**
     * Sets the value of the limit property.
     *
     * @param value the new limit
     */
    public void setLimit(long value) {
        this.limit = value;
    }


    /**
     * Gets the value of the total property.
     *
     * @return the total
     */
    public long getTotal() {
        return total;
    }


    /**
     * Sets the value of the total property.
     *
     * @param value the new total
     */
    public void setTotal(long value) {
        this.total = value;
    }

}
