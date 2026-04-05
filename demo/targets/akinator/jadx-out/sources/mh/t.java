package mh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class t extends y {

    /* renamed from: c, reason: collision with root package name */
    public static final t f74692c = new t("CharMatcher.javaIsoControl()");

    @Override // mh.g0
    public boolean matches(char c10) {
        if (c10 > 31) {
            return c10 >= 127 && c10 <= 159;
        }
        return true;
    }
}
