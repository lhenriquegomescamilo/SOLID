package com.solid.interfacesegregration.badexample;

public class Manager {
    Worker worker = null;

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public void workerRightNow(){
        this.worker.work();
    }
}
