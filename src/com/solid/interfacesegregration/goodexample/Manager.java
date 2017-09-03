package com.solid.interfacesegregration.goodexample;

public class Manager {

    private Workable worker;

    public void setWorker(Workable worker) {
        this.worker = worker;
    }

    public void goWorkRightNow(){
        this.worker.work();;
    }
}
