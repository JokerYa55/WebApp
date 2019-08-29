/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import ejb.OrderInterface;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author vasil
 */
@Entity
public class Order implements OrderInterface, Serializable {
    @Id
    private Long id;
    private String name;
    private String address;
    @OneToMany(
        cascade = CascadeType.ALL,
        orphanRemoval = true
    )
    private final List<OrderItem> orderItemList = new LinkedList<>();

    public Order() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void addOrderItem(OrderItem orderItem) {
        orderItemList.add(orderItem);
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", name=" + name + ", address=" + address + ", orderItemList=" + orderItemList + '}';
    }

}
