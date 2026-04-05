package vw;

import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class w1 {

    /* renamed from: a, reason: collision with root package name */
    public final Method f90186a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f90187b;

    public w1(Method method) {
        this(method, false);
    }

    public Object call(l0 l0Var, Object obj) throws Exception {
        if (obj == null) {
            return null;
        }
        Map map = l0Var.getSession().getMap();
        boolean z10 = this.f90187b;
        Method method = this.f90186a;
        return z10 ? method.invoke(obj, map) : method.invoke(obj, null);
    }

    public w1(Method method, boolean z10) {
        this.f90187b = z10;
        this.f90186a = method;
    }
}
