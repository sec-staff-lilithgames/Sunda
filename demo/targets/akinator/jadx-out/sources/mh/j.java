package mh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class j extends g0 {

    /* renamed from: b, reason: collision with root package name */
    public static final j f74639b = new j();

    @Override // mh.g0, mh.q1
    @Deprecated
    public /* bridge */ /* synthetic */ boolean apply(Object obj) {
        return super.apply((Character) obj);
    }

    @Override // mh.g0
    public boolean matches(char c10) {
        if (c10 != ' ' && c10 != 133 && c10 != 5760) {
            if (c10 != 8199) {
                if (c10 != 8287 && c10 != 12288 && c10 != 8232 && c10 != 8233) {
                    switch (c10) {
                        case '\t':
                        case '\n':
                        case 11:
                        case '\f':
                        case '\r':
                            break;
                        default:
                            if (c10 >= 8192 && c10 <= 8202) {
                                return true;
                            }
                            break;
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // mh.g0
    public String toString() {
        return "CharMatcher.breakingWhitespace()";
    }
}
