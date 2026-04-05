package v3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f88943e = new byte[1792];

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f88944a;

    /* renamed from: b, reason: collision with root package name */
    public final int f88945b;

    /* renamed from: c, reason: collision with root package name */
    public int f88946c;

    /* renamed from: d, reason: collision with root package name */
    public char f88947d;

    static {
        for (int i10 = 0; i10 < 1792; i10++) {
            f88943e[i10] = Character.getDirectionality(i10);
        }
    }

    public b(CharSequence charSequence) {
        this.f88944a = charSequence;
        this.f88945b = charSequence.length();
    }

    public final byte a() {
        int i10 = this.f88946c - 1;
        CharSequence charSequence = this.f88944a;
        char cCharAt = charSequence.charAt(i10);
        this.f88947d = cCharAt;
        if (Character.isLowSurrogate(cCharAt)) {
            int iCodePointBefore = Character.codePointBefore(charSequence, this.f88946c);
            this.f88946c -= Character.charCount(iCodePointBefore);
            return Character.getDirectionality(iCodePointBefore);
        }
        this.f88946c--;
        char c10 = this.f88947d;
        return c10 < 1792 ? f88943e[c10] : Character.getDirectionality(c10);
    }
}
