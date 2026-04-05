package br;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public enum i implements ir.i {
    Appear("appear"),
    Disappear("disappear");


    /* renamed from: c, reason: collision with root package name */
    public static final h f9870c = new h(null);

    /* renamed from: b, reason: collision with root package name */
    public final String f9874b;

    i(String str) {
        this.f9874b = str;
    }

    public static final i get(String str) {
        return f9870c.get(str);
    }

    @Override // ir.i
    public String getKey() {
        return this.f9874b;
    }
}
