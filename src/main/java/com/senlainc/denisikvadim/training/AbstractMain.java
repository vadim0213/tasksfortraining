package com.senlainc.denisikvadim.training;

/**
 * Created by earthofmarble on Nov, 2019
 */

public abstract class AbstractMain implements IGenericMain {

    protected static void run(IGenericMain task) {
        while (true) {
            task.startTask();
        }
    }

}
