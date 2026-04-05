package oj;

import nj.e1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class s implements dj.e {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f79433a;

    public s(a0 a0Var) {
        this.f79433a = a0Var;
    }

    @Override // dj.e, ru.a
    public e1 get() {
        return (e1) dj.d.checkNotNullFromComponent(((y) this.f79433a).rateLimiterClient());
    }
}
