package com.microserviceproject.question_service.model;

public class Response {
   private Integer id;
   private String response;
    public Response(Integer id, String response) {
        this.id = id;
        this.response = response;
    }
    public Response() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

}
