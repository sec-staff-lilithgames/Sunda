package br;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public enum b2 implements ir.i {
    ValidCreative("valid_creative"),
    BrokenCreative("broken_creative"),
    AnyCreative("any_creative"),
    Never("never");


    /* renamed from: c, reason: collision with root package name */
    public static final a2 f9760c = new a2(null);

    /* renamed from: b, reason: collision with root package name */
    public final String f9766b;

    b2(String str) {
        this.f9766b = str;
    }

    public static final b2 get(String str) {
        return f9760c.get(str);
    }

    @Override // ir.i
    public String getKey() {
        return this.f9766b;
    }
}
