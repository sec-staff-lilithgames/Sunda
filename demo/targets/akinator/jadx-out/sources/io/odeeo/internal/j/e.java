package io.odeeo.internal.j;

import io.odeeo.internal.b.g0;
import io.odeeo.internal.b.t;
import io.odeeo.internal.j.d;
import io.odeeo.internal.q0.u;
import io.odeeo.internal.q0.x;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e extends d {

    /* renamed from: b, reason: collision with root package name */
    public final x f64365b;

    /* renamed from: c, reason: collision with root package name */
    public final x f64366c;

    /* renamed from: d, reason: collision with root package name */
    public int f64367d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f64368e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f64369f;

    /* renamed from: g, reason: collision with root package name */
    public int f64370g;

    public e(io.odeeo.internal.g.x xVar) {
        super(xVar);
        this.f64365b = new x(u.f65926a);
        this.f64366c = new x(4);
    }

    @Override // io.odeeo.internal.j.d
    public boolean a(x xVar) throws d.a {
        int unsignedByte = xVar.readUnsignedByte();
        int i10 = (unsignedByte >> 4) & 15;
        int i11 = unsignedByte & 15;
        if (i11 != 7) {
            throw new d.a(a.b.e(i11, "Video format not supported: "));
        }
        this.f64370g = i10;
        return i10 != 5;
    }

    @Override // io.odeeo.internal.j.d
    public void seek() {
        this.f64369f = false;
    }

    @Override // io.odeeo.internal.j.d
    public boolean a(x xVar, long j10) throws g0 {
        int unsignedByte = xVar.readUnsignedByte();
        long int24 = (xVar.readInt24() * 1000) + j10;
        if (unsignedByte == 0 && !this.f64368e) {
            x xVar2 = new x(new byte[xVar.bytesLeft()]);
            xVar.readBytes(xVar2.getData(), 0, xVar.bytesLeft());
            io.odeeo.internal.r0.a aVar = io.odeeo.internal.r0.a.parse(xVar2);
            this.f64367d = aVar.f66125b;
            this.f64364a.format(new t.b().setSampleMimeType("video/avc").setCodecs(aVar.f66129f).setWidth(aVar.f66126c).setHeight(aVar.f66127d).setPixelWidthHeightRatio(aVar.f66128e).setInitializationData(aVar.f66124a).build());
            this.f64368e = true;
            return false;
        }
        if (unsignedByte != 1 || !this.f64368e) {
            return false;
        }
        int i10 = this.f64370g == 1 ? 1 : 0;
        if (!this.f64369f && i10 == 0) {
            return false;
        }
        byte[] data = this.f64366c.getData();
        data[0] = 0;
        data[1] = 0;
        data[2] = 0;
        int i11 = 4 - this.f64367d;
        int i12 = 0;
        while (xVar.bytesLeft() > 0) {
            xVar.readBytes(this.f64366c.getData(), i11, this.f64367d);
            this.f64366c.setPosition(0);
            int unsignedIntToInt = this.f64366c.readUnsignedIntToInt();
            this.f64365b.setPosition(0);
            this.f64364a.sampleData(this.f64365b, 4);
            this.f64364a.sampleData(xVar, unsignedIntToInt);
            i12 = i12 + 4 + unsignedIntToInt;
        }
        this.f64364a.sampleMetadata(int24, i10, i12, 0, null);
        this.f64369f = true;
        return true;
    }
}
