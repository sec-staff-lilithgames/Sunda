package yr;

import xr.hf;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b1 implements hf {

    /* renamed from: a, reason: collision with root package name */
    public final pw.g f94840a;

    /* renamed from: b, reason: collision with root package name */
    public int f94841b;

    /* renamed from: c, reason: collision with root package name */
    public int f94842c;

    public b1(pw.g gVar, int i10) {
        this.f94840a = gVar;
        this.f94841b = i10;
    }

    @Override // xr.hf
    public int readableBytes() {
        return this.f94842c;
    }

    @Override // xr.hf
    public int writableBytes() {
        return this.f94841b;
    }

    @Override // xr.hf
    public void write(byte[] bArr, int i10, int i11) {
        this.f94840a.write(bArr, i10, i11);
        this.f94841b -= i11;
        this.f94842c += i11;
    }

    @Override // xr.hf
    public void write(byte b10) {
        this.f94840a.writeByte((int) b10);
        this.f94841b--;
        this.f94842c++;
    }

    @Override // xr.hf
    public void release() {
    }
}
