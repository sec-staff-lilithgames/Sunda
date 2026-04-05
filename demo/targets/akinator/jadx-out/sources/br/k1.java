package br;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public enum k1 implements ir.i {
    Portrait("portrait", 7),
    Landscape("landscape", 6);


    /* renamed from: e, reason: collision with root package name */
    public static final j1 f9886e = new j1(null);

    /* renamed from: b, reason: collision with root package name */
    public final String f9890b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9891c;

    k1(String str, int i10) {
        this.f9890b = str;
        this.f9891c = i10;
    }

    public static final k1 get(String str) {
        return f9886e.get(str);
    }

    public final int getActivityOrientation() {
        return this.f9891c;
    }

    @Override // ir.i
    public String getKey() {
        return this.f9890b;
    }
}
