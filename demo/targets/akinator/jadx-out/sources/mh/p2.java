package mh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class p2 extends b {

    /* renamed from: e, reason: collision with root package name */
    public final CharSequence f74669e;

    /* renamed from: f, reason: collision with root package name */
    public final g0 f74670f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f74671g;

    /* renamed from: h, reason: collision with root package name */
    public int f74672h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f74673i;

    public p2(r2 r2Var, CharSequence charSequence) {
        this.f74670f = r2Var.f74682a;
        this.f74671g = r2Var.f74683b;
        this.f74673i = r2Var.f74685d;
        this.f74669e = charSequence;
    }

    @Override // mh.b
    public final Object a() {
        int iSeparatorStart;
        CharSequence charSequence;
        g0 g0Var;
        int i10 = this.f74672h;
        while (true) {
            int i11 = this.f74672h;
            if (i11 == -1) {
                this.f74583b = 3;
                return null;
            }
            iSeparatorStart = separatorStart(i11);
            charSequence = this.f74669e;
            if (iSeparatorStart == -1) {
                iSeparatorStart = charSequence.length();
                this.f74672h = -1;
            } else {
                this.f74672h = separatorEnd(iSeparatorStart);
            }
            int i12 = this.f74672h;
            if (i12 == i10) {
                int i13 = i12 + 1;
                this.f74672h = i13;
                if (i13 > charSequence.length()) {
                    this.f74672h = -1;
                }
            } else {
                while (true) {
                    g0Var = this.f74670f;
                    if (i10 >= iSeparatorStart || !g0Var.matches(charSequence.charAt(i10))) {
                        break;
                    }
                    i10++;
                }
                while (iSeparatorStart > i10 && g0Var.matches(charSequence.charAt(iSeparatorStart - 1))) {
                    iSeparatorStart--;
                }
                if (!this.f74671g || i10 != iSeparatorStart) {
                    break;
                }
                i10 = this.f74672h;
            }
        }
        int i14 = this.f74673i;
        if (i14 == 1) {
            iSeparatorStart = charSequence.length();
            this.f74672h = -1;
            while (iSeparatorStart > i10 && g0Var.matches(charSequence.charAt(iSeparatorStart - 1))) {
                iSeparatorStart--;
            }
        } else {
            this.f74673i = i14 - 1;
        }
        return charSequence.subSequence(i10, iSeparatorStart).toString();
    }

    public abstract int separatorEnd(int i10);

    public abstract int separatorStart(int i10);
}
