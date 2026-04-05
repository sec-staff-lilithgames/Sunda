package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.cN, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1878cN implements Runnable {
    public static String[] A01 = {"fzjyGYuq3piyXiDZRjFkW67NOQ", "BBiqyoJQ78KnhCEDEb2JbAozax", "1KByreOTKkBHOeAHWLPqFTrN6QP2TzEC", "MP4Zvm8LfRa", "DgL9liz0G6FW", "NXDVupkXAhI36dZ8X7NCFVcgk2Bhw4pc", "8y8TgWmK0Yc5iAE5REQxk164k6eqV1M2", "0ZHlEJC1wd2fv29SneAo5e4vf7D"};
    public final /* synthetic */ C4K A00;

    public RunnableC1878cN(C4K c4k) {
        this.A00 = c4k;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            if (this.A00.A0B) {
                this.A00.A0M();
            }
        } catch (Throwable th2) {
            if (A01[7].length() == 26) {
                throw new RuntimeException();
            }
            A01[7] = "zshW7x6N5qX8w7YdYsjxjIdxV";
            AbstractC1616Vl.A00(th2, this);
        }
    }
}
