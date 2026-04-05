package sh;

import java.util.Set;
import java.util.logging.Level;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class c0 extends j {

    /* renamed from: l, reason: collision with root package name */
    public static final jh.i f85784l;

    /* renamed from: m, reason: collision with root package name */
    public static final m1 f85785m = new m1(c0.class);

    /* renamed from: j, reason: collision with root package name */
    public volatile Set f85786j;

    /* renamed from: k, reason: collision with root package name */
    public volatile int f85787k;

    static {
        Throwable th2;
        jh.i b0Var;
        try {
            b0Var = new a0();
            th2 = null;
        } catch (Throwable th3) {
            th2 = th3;
            b0Var = new b0();
        }
        f85784l = b0Var;
        if (th2 != null) {
            f85785m.a().log(Level.SEVERE, "SafeAtomicHelper is broken!", th2);
        }
    }
}
