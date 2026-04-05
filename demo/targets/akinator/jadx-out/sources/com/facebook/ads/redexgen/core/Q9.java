package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network.dex */
public class Q9 implements Runnable {
    public static String[] A01 = {"awShR6rB9hHqIMmEUL0mwXA0Gw52kO", "0DSPYtvGuEhIQI6AF9KMD", "9DdmIjaq0QhBq1nPNAcV72ZM8h0mgj2M", "HfTiJ4VVSMi3nAZk7bTv9mblSiAuey3", "debYtkaMAwIZQZjx6lxSS", "4WrPcoFjyZ6X9UuQXP", "Cz1Bv0fV", "irRdqOAQiRC5NgL3TGbl1LssmB7DQYK"};
    public final /* synthetic */ C09846g A00;

    public Q9(C09846g c09846g) {
        this.A00 = c09846g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.A00.A0D) {
            C09846g c09846g = this.A00;
            String[] strArr = A01;
            if (strArr[7].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            A01[2] = "whIRPRaeSzbq6WxYyrgvwj4itopbsVJt";
            if (c09846g.isLayoutRequested()) {
                return;
            }
            if (!this.A00.A0F) {
                this.A00.requestLayout();
            } else if (this.A00.A0I) {
                this.A00.A0J = true;
            } else {
                this.A00.A1K();
            }
        }
    }
}
