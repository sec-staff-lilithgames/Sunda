package br;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public enum n implements ir.i {
    Fade("fade"),
    Slide("slide");


    /* renamed from: c, reason: collision with root package name */
    public static final m f9923c = new m(null);

    /* renamed from: b, reason: collision with root package name */
    public final String f9927b;

    n(String str) {
        this.f9927b = str;
    }

    public static final n get(String str) {
        return f9923c.get(str);
    }

    @Override // ir.i
    public String getKey() {
        return this.f9927b;
    }
}
