package wr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class p {
    public abstract void cancel(String str, Throwable th2);

    public c getAttributes() {
        return c.f90841b;
    }

    public abstract void halfClose();

    public boolean isReady() {
        return true;
    }

    public abstract void request(int i10);

    public abstract void sendMessage(Object obj);

    public abstract void start(a aVar, e4 e4Var);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class a {
        public void onReady() {
        }

        public void onHeaders(e4 e4Var) {
        }

        public void onMessage(Object obj) {
        }

        public void onClose(m6 m6Var, e4 e4Var) {
        }
    }

    public void setMessageCompression(boolean z10) {
    }
}
