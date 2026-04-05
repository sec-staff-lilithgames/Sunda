package mh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class m extends g0 {

    /* renamed from: b, reason: collision with root package name */
    public final q1 f74652b;

    public m(q1 q1Var) {
        this.f74652b = (q1) p1.checkNotNull(q1Var);
    }

    @Override // mh.g0, mh.q1
    @Deprecated
    public /* bridge */ /* synthetic */ boolean apply(Object obj) {
        return super.apply((Character) obj);
    }

    @Override // mh.g0
    public boolean matches(char c10) {
        return this.f74652b.apply(Character.valueOf(c10));
    }

    @Override // mh.g0
    public String toString() {
        return "CharMatcher.forPredicate(" + this.f74652b + ")";
    }
}
