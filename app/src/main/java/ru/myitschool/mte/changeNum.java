package ru.myitschool.mte;

import android.widget.TextView;

import org.w3c.dom.Text;

public class changeNum extends Thread{
    private static final int THREAD_DELAY = 1_000;
    final private TextView nums;
    private boolean runnable = true;
    final String[] arr = {"1", "2", "3"};
    private int cnt = 0;
    public changeNum(TextView nums){
        this.nums = nums;
    }

    @Override
    public void run() {
        super.run();
        while(runnable){
            nums.setText(arr[cnt++ % 3]);
            try {
                Thread.sleep(THREAD_DELAY);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void disable(){
        runnable = false;
    }
}
