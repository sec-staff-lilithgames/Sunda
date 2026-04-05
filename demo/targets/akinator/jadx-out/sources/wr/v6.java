package wr;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class v6 extends t0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f91163a = Logger.getLogger(v6.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f91164b = new ThreadLocal();

    @Override // wr.t0
    public u0 current() {
        u0 u0Var = (u0) f91164b.get();
        return u0Var == null ? u0.f91142g : u0Var;
    }

    @Override // wr.t0
    public void detach(u0 u0Var, u0 u0Var2) {
        if (current() != u0Var) {
            f91163a.log(Level.SEVERE, "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        u0 u0Var3 = u0.f91142g;
        ThreadLocal threadLocal = f91164b;
        if (u0Var2 != u0Var3) {
            threadLocal.set(u0Var2);
        } else {
            threadLocal.set(null);
        }
    }

    @Override // wr.t0
    public u0 doAttach(u0 u0Var) {
        u0 u0VarCurrent = current();
        f91164b.set(u0Var);
        return u0VarCurrent;
    }
}
