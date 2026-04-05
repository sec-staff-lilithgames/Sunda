package io.odeeo.internal.p;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.b.g0;
import io.odeeo.internal.p.d0;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class t implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final j f65531a;

    /* renamed from: b, reason: collision with root package name */
    public final io.odeeo.internal.q0.w f65532b = new io.odeeo.internal.q0.w(new byte[10]);

    /* renamed from: c, reason: collision with root package name */
    public int f65533c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f65534d;

    /* renamed from: e, reason: collision with root package name */
    public io.odeeo.internal.q0.e0 f65535e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f65536f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f65537g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f65538h;

    /* renamed from: i, reason: collision with root package name */
    public int f65539i;

    /* renamed from: j, reason: collision with root package name */
    public int f65540j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f65541k;

    /* renamed from: l, reason: collision with root package name */
    public long f65542l;

    public t(j jVar) {
        this.f65531a = jVar;
    }

    public final void a(int i10) {
        this.f65533c = i10;
        this.f65534d = 0;
    }

    @RequiresNonNull({"timestampAdjuster"})
    public final void b() {
        this.f65532b.setPosition(0);
        this.f65542l = C.TIME_UNSET;
        if (this.f65536f) {
            this.f65532b.skipBits(4);
            this.f65532b.skipBits(1);
            this.f65532b.skipBits(1);
            long bits = (this.f65532b.readBits(3) << 30) | (this.f65532b.readBits(15) << 15) | this.f65532b.readBits(15);
            this.f65532b.skipBits(1);
            if (!this.f65538h && this.f65537g) {
                this.f65532b.skipBits(4);
                this.f65532b.skipBits(1);
                this.f65532b.skipBits(1);
                this.f65532b.skipBits(1);
                this.f65535e.adjustTsTimestamp((this.f65532b.readBits(3) << 30) | (this.f65532b.readBits(15) << 15) | this.f65532b.readBits(15));
                this.f65538h = true;
            }
            this.f65542l = this.f65535e.adjustTsTimestamp(bits);
        }
    }

    @Override // io.odeeo.internal.p.d0
    public final void consume(io.odeeo.internal.q0.x xVar, int i10) throws g0 {
        io.odeeo.internal.q0.a.checkStateNotNull(this.f65535e);
        if ((i10 & 1) != 0) {
            int i11 = this.f65533c;
            if (i11 != 0 && i11 != 1) {
                if (i11 == 2) {
                    io.odeeo.internal.q0.p.w("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f65540j != -1) {
                        io.odeeo.internal.q0.p.w("PesReader", "Unexpected start indicator: expected " + this.f65540j + " more bytes");
                    }
                    this.f65531a.packetFinished();
                }
            }
            a(1);
        }
        while (xVar.bytesLeft() > 0) {
            int i12 = this.f65533c;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        if (a(xVar, this.f65532b.f65964a, Math.min(10, this.f65539i)) && a(xVar, null, this.f65539i)) {
                            b();
                            i10 |= this.f65541k ? 4 : 0;
                            this.f65531a.packetStarted(this.f65542l, i10);
                            a(3);
                        }
                    } else {
                        if (i12 != 3) {
                            throw new IllegalStateException();
                        }
                        int iBytesLeft = xVar.bytesLeft();
                        int i13 = this.f65540j;
                        int i14 = i13 != -1 ? iBytesLeft - i13 : 0;
                        if (i14 > 0) {
                            iBytesLeft -= i14;
                            xVar.setLimit(xVar.getPosition() + iBytesLeft);
                        }
                        this.f65531a.consume(xVar);
                        int i15 = this.f65540j;
                        if (i15 != -1) {
                            int i16 = i15 - iBytesLeft;
                            this.f65540j = i16;
                            if (i16 == 0) {
                                this.f65531a.packetFinished();
                                a(1);
                            }
                        }
                    }
                } else if (a(xVar, this.f65532b.f65964a, 9)) {
                    a(a() ? 2 : 0);
                }
            } else {
                xVar.skipBytes(xVar.bytesLeft());
            }
        }
    }

    @Override // io.odeeo.internal.p.d0
    public void init(io.odeeo.internal.q0.e0 e0Var, io.odeeo.internal.g.j jVar, d0.d dVar) {
        this.f65535e = e0Var;
        this.f65531a.createTracks(jVar, dVar);
    }

    @Override // io.odeeo.internal.p.d0
    public final void seek() {
        this.f65533c = 0;
        this.f65534d = 0;
        this.f65538h = false;
        this.f65531a.seek();
    }

    public final boolean a(io.odeeo.internal.q0.x xVar, byte[] bArr, int i10) {
        int iMin = Math.min(xVar.bytesLeft(), i10 - this.f65534d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            xVar.skipBytes(iMin);
        } else {
            xVar.readBytes(bArr, this.f65534d, iMin);
        }
        int i11 = this.f65534d + iMin;
        this.f65534d = i11;
        return i11 == i10;
    }

    public final boolean a() {
        this.f65532b.setPosition(0);
        int bits = this.f65532b.readBits(24);
        if (bits != 1) {
            e3.g.z(bits, "Unexpected start code prefix: ", "PesReader");
            this.f65540j = -1;
            return false;
        }
        this.f65532b.skipBits(8);
        int bits2 = this.f65532b.readBits(16);
        this.f65532b.skipBits(5);
        this.f65541k = this.f65532b.readBit();
        this.f65532b.skipBits(2);
        this.f65536f = this.f65532b.readBit();
        this.f65537g = this.f65532b.readBit();
        this.f65532b.skipBits(6);
        int bits3 = this.f65532b.readBits(8);
        this.f65539i = bits3;
        if (bits2 == 0) {
            this.f65540j = -1;
        } else {
            int i10 = (bits2 - 3) - bits3;
            this.f65540j = i10;
            if (i10 < 0) {
                io.odeeo.internal.q0.p.w("PesReader", "Found negative packet payload size: " + this.f65540j);
                this.f65540j = -1;
            }
        }
        return true;
    }
}
