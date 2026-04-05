package gn;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class m {

    /* renamed from: d, reason: collision with root package name */
    public byte[] f58002d;

    /* renamed from: a, reason: collision with root package name */
    public int f57999a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f58000b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f58001c = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f58003e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f58004f = -1;

    public n build() {
        return new n(this.f57999a, this.f58000b, this.f58001c, this.f58003e, this.f58004f, this.f58002d);
    }

    public m setChromaBitdepth(int i10) {
        this.f58004f = i10;
        return this;
    }

    public m setColorRange(int i10) {
        this.f58000b = i10;
        return this;
    }

    public m setColorSpace(int i10) {
        this.f57999a = i10;
        return this;
    }

    public m setColorTransfer(int i10) {
        this.f58001c = i10;
        return this;
    }

    public m setHdrStaticInfo(byte[] bArr) {
        this.f58002d = bArr;
        return this;
    }

    public m setLumaBitdepth(int i10) {
        this.f58003e = i10;
        return this;
    }
}
