package com.senlainc.denisikvadim.training;


public abstract class AbstractMain implements IGenericMain {

    protected static void run(IGenericMain task) {
        while (true) {
            task.startTask();
        }
    }

}
