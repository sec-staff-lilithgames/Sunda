package rc;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public g1 f84231a;

    /* renamed from: b, reason: collision with root package name */
    public Method f84232b;

    /* renamed from: c, reason: collision with root package name */
    public y f84233c;

    public n(g1 g1Var, Method method, y yVar) {
        this.f84231a = g1Var;
        this.f84232b = method;
        this.f84233c = yVar;
    }

    public m build() {
        Method method = this.f84232b;
        if (method == null) {
            return null;
        }
        return new m(this.f84231a, method, this.f84233c.asAnnotationMap(), null);
    }
}
