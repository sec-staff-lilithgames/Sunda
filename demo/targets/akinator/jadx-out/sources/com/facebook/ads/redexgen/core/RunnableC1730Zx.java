package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Zx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1730Zx implements Runnable {
    public static String[] A01 = {"wQeUkUFktfM2l", "7XaAWiHxEbalq5gcAes6NrqtmXxPT4Y3", "2fv7kArIDvQtbqE5fFFu3pq8qRlQU6Cv", "0xhN0xjEaMXvjGar1KVcE", "ki2D6rKULGHthGJNrJcFjvO3aJEOf9d", "JHuN8xfhz8lLzrwSWaENIG05O1ASDFA", "9Zp5ZsxK45djlTC7gbsQv9P1cFfLGY7l", "GKuX8TC50ZMrYys0rib1"};
    public final /* synthetic */ KL A00;

    public RunnableC1730Zx(KL kl2) {
        this.A00 = kl2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A01 = this.A00.A0S.A04();
            this.A00.A03 = KL.A0G(this.A00.A0S.A04());
            this.A00.A0k();
        } catch (Throwable th2) {
            if (A01[7].length() == 26) {
                throw new RuntimeException();
            }
            A01[2] = "KsmznMcBbJjrBrEeTGYdkeMkvFpYNuvy";
            AbstractC1616Vl.A00(th2, this);
        }
    }
}
