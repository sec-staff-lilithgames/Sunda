package rc;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class j0 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f84210a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f84211b;

    public j0(boolean z10, boolean z11) {
        this.f84210a = z10;
        this.f84211b = z11;
    }

    public static i0 forFirstNameRule(boolean z10, boolean z11) {
        if (z10 && z11) {
            return null;
        }
        return new j0(z10, z11);
    }

    @Override // rc.i0
    public boolean accept(char c10, String str, int i10) {
        return Character.isLetter(c10) ? this.f84210a || !Character.isLowerCase(c10) : this.f84211b;
    }
}
