package md;

import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e0 implements jd.l {

    /* renamed from: a, reason: collision with root package name */
    public final Set f74264a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f74265b;

    /* renamed from: c, reason: collision with root package name */
    public final h0 f74266c;

    public e0(Set set, d0 d0Var, h0 h0Var) {
        this.f74264a = set;
        this.f74265b = d0Var;
        this.f74266c = h0Var;
    }

    @Override // jd.l
    public <T> jd.k getTransport(String str, Class<T> cls, jd.j jVar) {
        return getTransport(str, cls, jd.e.of("proto"), jVar);
    }

    @Override // jd.l
    public <T> jd.k getTransport(String str, Class<T> cls, jd.e eVar, jd.j jVar) {
        Set set = this.f74264a;
        if (set.contains(eVar)) {
            return new f0(this.f74265b, str, eVar, jVar, this.f74266c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", eVar, set));
    }
}
