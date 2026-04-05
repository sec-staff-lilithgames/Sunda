package xi;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class j implements ui.i {

    /* renamed from: a, reason: collision with root package name */
    public boolean f92021a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f92022b = false;

    /* renamed from: c, reason: collision with root package name */
    public ui.e f92023c;

    /* renamed from: d, reason: collision with root package name */
    public final g f92024d;

    public j(g gVar) {
        this.f92024d = gVar;
    }

    public final void a() {
        if (this.f92021a) {
            throw new ui.c("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f92021a = true;
    }

    @Override // ui.i
    public ui.i add(String str) throws IOException {
        a();
        this.f92024d.a(this.f92023c, str, this.f92022b);
        return this;
    }

    @Override // ui.i
    public ui.i add(float f10) throws IOException {
        a();
        this.f92024d.c(this.f92023c, f10, this.f92022b);
        return this;
    }

    @Override // ui.i
    public ui.i add(double d10) throws IOException {
        a();
        this.f92024d.b(this.f92023c, d10, this.f92022b);
        return this;
    }

    @Override // ui.i
    public ui.i add(int i10) throws IOException {
        a();
        this.f92024d.d(this.f92023c, i10, this.f92022b);
        return this;
    }

    @Override // ui.i
    public ui.i add(long j10) throws IOException {
        a();
        this.f92024d.e(this.f92023c, j10, this.f92022b);
        return this;
    }

    @Override // ui.i
    public ui.i add(boolean z10) throws IOException {
        a();
        this.f92024d.d(this.f92023c, z10 ? 1 : 0, this.f92022b);
        return this;
    }

    @Override // ui.i
    public ui.i add(byte[] bArr) throws IOException {
        a();
        this.f92024d.a(this.f92023c, bArr, this.f92022b);
        return this;
    }
}
