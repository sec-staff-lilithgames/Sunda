package bk;

import java.util.HashSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static volatile d f9706b;

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f9707a = new HashSet();

    public static d getInstance() {
        d dVar;
        d dVar2 = f9706b;
        if (dVar2 != null) {
            return dVar2;
        }
        synchronized (d.class) {
            try {
                dVar = f9706b;
                if (dVar == null) {
                    dVar = new d();
                    f9706b = dVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVar;
    }

    public void registerVersion(String str, String str2) {
        synchronized (this.f9707a) {
            this.f9707a.add(new a(str, str2));
        }
    }
}
