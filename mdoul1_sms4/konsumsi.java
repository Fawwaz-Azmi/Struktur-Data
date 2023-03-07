package mdoul1_sms4;

import java.util.ArrayList;
import java.util.Arrays;

public class konsumsi<M, I> {
    private M m;
    private I i;

    public M getM() {
        return m;
    }

    public I getI() {
        return i;
    }

    public void setkonsumsi(M makan, I minuman) {
        this.m = makan;
        this.i = minuman;
    }
}
