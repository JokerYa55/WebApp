/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import beans.OrderItem;

/**
 *
 * @author vasil
 */
public interface OrderInterface {
    public void addOrderItem(OrderItem orderItem);
}
