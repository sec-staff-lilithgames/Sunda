package wr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class k5 {
    public abstract void close(m6 m6Var, e4 e4Var);

    public c getAttributes() {
        return c.f90841b;
    }

    public String getAuthority() {
        return null;
    }

    public abstract k4 getMethodDescriptor();

    public h5 getSecurityLevel() {
        return h5.f90958b;
    }

    public abstract boolean isCancelled();

    public boolean isReady() {
        return true;
    }

    public abstract void request(int i10);

    public abstract void sendHeaders(e4 e4Var);

    public abstract void sendMessage(Object obj);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class a {
        public void onCancel() {
        }

        public void onComplete() {
        }

        public void onHalfClose() {
        }

        public void onReady() {
        }

        public void onMessage(Object obj) {
        }
    }

    public void setCompression(String str) {
    }

    public void setMessageCompression(boolean z10) {
    }
}
