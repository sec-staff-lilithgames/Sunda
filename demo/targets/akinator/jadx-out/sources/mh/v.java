package mh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class v extends g0 {

    /* renamed from: b, reason: collision with root package name */
    public static final v f74701b = new v();

    @Override // mh.g0, mh.q1
    @Deprecated
    public /* bridge */ /* synthetic */ boolean apply(Object obj) {
        return super.apply((Character) obj);
    }

    @Override // mh.g0
    public boolean matches(char c10) {
        return Character.isLetterOrDigit(c10);
    }

    @Override // mh.g0
    public String toString() {
        return "CharMatcher.javaLetterOrDigit()";
    }
}
