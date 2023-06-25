package com.crio.qcontest.exception;

public class InvalidContestException extends RuntimeException{

    public InvalidContestException(){
        super();
    }

    public InvalidContestException(String msg){
        super(msg);
    }

}

