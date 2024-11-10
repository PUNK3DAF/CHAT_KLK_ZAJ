/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transfer;

import java.io.Serializable;

/**
 *
 * @author vldmrk
 */
public class KlijentskiZahtev implements Serializable {

    private Object param;
    private int operacija;

    public KlijentskiZahtev() {
    }

    public KlijentskiZahtev(Object param, int operacija) {
        this.param = param;
        this.operacija = operacija;
    }

    public Object getParam() {
        return param;
    }

    public void setParam(Object param) {
        this.param = param;
    }

    public int getOperacija() {
        return operacija;
    }

    public void setOperacija(int operacija) {
        this.operacija = operacija;
    }

}
