package com.bytedance.sdk.component.qk.wqx;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx {

    /* renamed from: jd, reason: collision with root package name */
    private jd f18996jd;
    private jpo jpo;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface jd {
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum jpo {
        DEBUG,
        INFO,
        ERROR,
        OFF
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.sdk.component.qk.wqx.wqx$wqx, reason: collision with other inner class name */
    public static class C0091wqx {
        private static final wqx jpo = new wqx();
    }

    public static void jpo(jpo jpoVar) {
        synchronized (wqx.class) {
            C0091wqx.jpo.jpo = jpoVar;
        }
    }

    private wqx() {
        this.jpo = jpo.OFF;
        this.f18996jd = new com.bytedance.sdk.component.qk.wqx.jd();
    }
}
