package br;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public enum x implements ir.i {
    /* JADX INFO: Fake field, exist only in values array */
    ColorHistogram("color_histogram"),
    /* JADX INFO: Fake field, exist only in values array */
    BrightnessVariance("brightness_variance"),
    /* JADX INFO: Fake field, exist only in values array */
    EdgeDetection("edge_detection");


    /* renamed from: c, reason: collision with root package name */
    public static final w f10011c = new w(null);

    /* renamed from: b, reason: collision with root package name */
    public final String f10013b;

    x(String str) {
        this.f10013b = str;
    }

    public static final x get(String str) {
        return f10011c.get(str);
    }

    @Override // ir.i
    public String getKey() {
        return this.f10013b;
    }
}
