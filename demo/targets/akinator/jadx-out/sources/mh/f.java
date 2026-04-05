package mh;

import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f extends y {

    /* renamed from: c, reason: collision with root package name */
    public static final f f74611c = new f("CharMatcher.any()");

    @Override // mh.g0
    public g0 and(g0 g0Var) {
        return (g0) p1.checkNotNull(g0Var);
    }

    @Override // mh.g0
    public String collapseFrom(CharSequence charSequence, char c10) {
        return charSequence.length() == 0 ? "" : String.valueOf(c10);
    }

    @Override // mh.g0
    public int countIn(CharSequence charSequence) {
        return charSequence.length();
    }

    @Override // mh.g0
    public int indexIn(CharSequence charSequence) {
        return charSequence.length() == 0 ? -1 : 0;
    }

    @Override // mh.g0
    public int lastIndexIn(CharSequence charSequence) {
        return charSequence.length() - 1;
    }

    @Override // mh.g0
    public boolean matches(char c10) {
        return true;
    }

    @Override // mh.g0
    public boolean matchesAllOf(CharSequence charSequence) {
        p1.checkNotNull(charSequence);
        return true;
    }

    @Override // mh.g0
    public boolean matchesNoneOf(CharSequence charSequence) {
        return charSequence.length() == 0;
    }

    @Override // mh.l, mh.g0
    public g0 negate() {
        return g0.none();
    }

    @Override // mh.g0
    public g0 or(g0 g0Var) {
        p1.checkNotNull(g0Var);
        return this;
    }

    @Override // mh.g0
    public String removeFrom(CharSequence charSequence) {
        p1.checkNotNull(charSequence);
        return "";
    }

    @Override // mh.g0
    public String replaceFrom(CharSequence charSequence, char c10) {
        char[] cArr = new char[charSequence.length()];
        Arrays.fill(cArr, c10);
        return new String(cArr);
    }

    @Override // mh.g0
    public String trimFrom(CharSequence charSequence) {
        p1.checkNotNull(charSequence);
        return "";
    }

    @Override // mh.g0
    public int indexIn(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        p1.checkPositionIndex(i10, length);
        if (i10 == length) {
            return -1;
        }
        return i10;
    }

    @Override // mh.g0
    public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
        StringBuilder sb2 = new StringBuilder(charSequence2.length() * charSequence.length());
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            sb2.append(charSequence2);
        }
        return sb2.toString();
    }
}
