/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.math.BigDecimal;

/**
 *
 * @author vasil
 */
public class OrderItem {

    int id;
    private Goods goods;
    private int quntity = 0;
    private BigDecimal price = new BigDecimal(0);

    public OrderItem() {
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public int getQuntity() {
        return quntity;
    }

    public void setQuntity(int quntity) {
        this.quntity = quntity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "OrderItem{" + "id=" + id + ", goods=" + goods + ", quntity=" + quntity + ", price=" + price + '}';
    }

}
