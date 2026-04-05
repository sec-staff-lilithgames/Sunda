package mh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b0 extends y {

    /* renamed from: c, reason: collision with root package name */
    public static final b0 f74585c = new b0("CharMatcher.none()");

    @Override // mh.g0
    public g0 and(g0 g0Var) {
        p1.checkNotNull(g0Var);
        return this;
    }

    @Override // mh.g0
    public String collapseFrom(CharSequence charSequence, char c10) {
        return charSequence.toString();
    }

    @Override // mh.g0
    public int countIn(CharSequence charSequence) {
        p1.checkNotNull(charSequence);
        return 0;
    }

    @Override // mh.g0
    public int indexIn(CharSequence charSequence) {
        p1.checkNotNull(charSequence);
        return -1;
    }

    @Override // mh.g0
    public int lastIndexIn(CharSequence charSequence) {
        p1.checkNotNull(charSequence);
        return -1;
    }

    @Override // mh.g0
    public boolean matches(char c10) {
        return false;
    }

    @Override // mh.g0
    public boolean matchesAllOf(CharSequence charSequence) {
        return charSequence.length() == 0;
    }

    @Override // mh.g0
    public boolean matchesNoneOf(CharSequence charSequence) {
        p1.checkNotNull(charSequence);
        return true;
    }

    @Override // mh.l, mh.g0
    public g0 negate() {
        return g0.any();
    }

    @Override // mh.g0
    public g0 or(g0 g0Var) {
        return (g0) p1.checkNotNull(g0Var);
    }

    @Override // mh.g0
    public String removeFrom(CharSequence charSequence) {
        return charSequence.toString();
    }

    @Override // mh.g0
    public String replaceFrom(CharSequence charSequence, char c10) {
        return charSequence.toString();
    }

    @Override // mh.g0
    public String trimFrom(CharSequence charSequence) {
        return charSequence.toString();
    }

    @Override // mh.g0
    public String trimLeadingFrom(CharSequence charSequence) {
        return charSequence.toString();
    }

    @Override // mh.g0
    public String trimTrailingFrom(CharSequence charSequence) {
        return charSequence.toString();
    }

    @Override // mh.g0
    public int indexIn(CharSequence charSequence, int i10) {
        p1.checkPositionIndex(i10, charSequence.length());
        return -1;
    }

    @Override // mh.g0
    public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
        p1.checkNotNull(charSequence2);
        return charSequence.toString();
    }
}
