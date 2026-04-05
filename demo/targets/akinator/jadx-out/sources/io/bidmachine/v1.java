package io.bidmachine;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class v1 {

    /* renamed from: a, reason: collision with root package name */
    public static volatile tr.a f62033a;

    public static tr.c get() {
        tr.a aVar;
        tr.a aVar2 = f62033a;
        if (aVar2 != null) {
            return aVar2;
        }
        synchronized (v1.class) {
            try {
                aVar = f62033a;
                if (aVar == null) {
                    aVar = new tr.a();
                    f62033a = aVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }
}
