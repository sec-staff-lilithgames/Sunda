package nc;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c0 extends g0 {

    /* renamed from: c, reason: collision with root package name */
    public final mc.x f75876c;

    /* renamed from: d, reason: collision with root package name */
    public final String f75877d;

    public c0(g0 g0Var, Object obj, mc.x xVar, String str) {
        super(g0Var, obj);
        this.f75876c = xVar;
        this.f75877d = str;
    }

    @Override // nc.g0
    public void assign(Object obj) throws IOException {
        this.f75876c.set(obj, this.f75877d, this.f75901b);
    }
}
