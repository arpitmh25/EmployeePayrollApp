package com.bridgelabz.employeepayrollservice.dto;

import lombok.Data;

@Data
public class ResponseDTO {
    private String messsage;
    private Object data;

    public ResponseDTO(String messsage, Object data) {
        super();
        this.messsage = messsage;
        this.data = data;
    }

//    public String getMesssage() {
//        return messsage;
//    }
//
//    public void setMesssage(String messsage) {
//        this.messsage = messsage;
//    }
//
//    public Object getData() {
//        return data;
//    }
//
//    public void setData(Object data) {
//        this.data = data;
//    }
}
