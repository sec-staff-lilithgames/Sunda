package gn;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public int f57879a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f57880b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f57881c = 1;

    /* renamed from: d, reason: collision with root package name */
    public int f57882d = 1;

    /* renamed from: e, reason: collision with root package name */
    public int f57883e = 0;

    public h build() {
        return new h(this.f57879a, this.f57880b, this.f57881c, this.f57882d, this.f57883e);
    }

    public g setAllowedCapturePolicy(int i10) {
        this.f57882d = i10;
        return this;
    }

    public g setContentType(int i10) {
        this.f57879a = i10;
        return this;
    }

    public g setFlags(int i10) {
        this.f57880b = i10;
        return this;
    }

    public g setSpatializationBehavior(int i10) {
        this.f57883e = i10;
        return this;
    }

    public g setUsage(int i10) {
        this.f57881c = i10;
        return this;
    }
}
