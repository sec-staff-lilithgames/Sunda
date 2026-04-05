package com.mbridge.msdk.tracker.network;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class l {

    /* renamed from: b, reason: collision with root package name */
    private static volatile l f43968b;

    /* renamed from: a, reason: collision with root package name */
    private u f43969a;

    private l() {
    }

    public static l a() {
        if (f43968b == null) {
            synchronized (l.class) {
                try {
                    if (f43968b == null) {
                        f43968b = new l();
                    }
                } finally {
                }
            }
        }
        return f43968b;
    }

    public u b() {
        if (this.f43969a == null) {
            u uVarA = com.mbridge.msdk.tracker.network.toolbox.o.a(new com.mbridge.msdk.tracker.network.toolbox.b(new com.mbridge.msdk.tracker.network.toolbox.m()), null, 10, new com.mbridge.msdk.tracker.network.toolbox.l());
            this.f43969a = uVarA;
            uVarA.b();
        }
        return this.f43969a;
    }
}
