package nc;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f75900a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f75901b;

    public g0(g0 g0Var, Object obj) {
        this.f75900a = g0Var;
        this.f75901b = obj;
    }

    public abstract void assign(Object obj) throws IOException;

    public void setValue(Object obj) throws IOException {
        throw new UnsupportedOperationException("Should not be called by this type ".concat(getClass().getName()));
    }
}
