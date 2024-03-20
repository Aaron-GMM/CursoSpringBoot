package com.curs.cursospring.entities.enums;

import com.curs.cursospring.entities.Order;

public enum OrderStatus {
    WAITING_PAYMENT(1),
    PAID(2),
    DELIVERED(3),
    CANCELED(4);
    private int code;

    private  OrderStatus(int code){
        this.code = code;

    }
    public  int getCode(){
        return code;
    }
    public  static OrderStatus valueOF(int code){
        for(OrderStatus value : OrderStatus.values()){
            if (value.getCode()==code){
                return value;
            }
        }
        throw  new IllegalArgumentException("Invalido OrderStatus code");
    }

}
