package br;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public enum w0 implements ir.i {
    /* JADX INFO: Fake field, exist only in values array */
    Linear("linear"),
    Radial("radial");


    /* renamed from: c, reason: collision with root package name */
    public static final u0 f10007c = new u0(null);

    /* renamed from: b, reason: collision with root package name */
    public final String f10010b;

    w0(String str) {
        this.f10010b = str;
    }

    public static final w0 get(String str) {
        return f10007c.get(str);
    }

    @Override // ir.i
    public String getKey() {
        return this.f10010b;
    }

    public final int toDrawableGradientType() {
        int i10 = v0.$EnumSwitchMapping$0[ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        throw new tu.t();
    }
}
