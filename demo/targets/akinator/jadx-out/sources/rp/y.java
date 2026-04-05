package rp;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import gn.z0;
import io.bidmachine.media3.common.util.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class y implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public final j f84925a;

    /* renamed from: b, reason: collision with root package name */
    public final io.bidmachine.media3.common.util.l0 f84926b = new io.bidmachine.media3.common.util.l0(new byte[10]);

    /* renamed from: c, reason: collision with root package name */
    public int f84927c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f84928d;

    /* renamed from: e, reason: collision with root package name */
    public u0 f84929e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f84930f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f84931g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f84932h;

    /* renamed from: i, reason: collision with root package name */
    public int f84933i;

    /* renamed from: j, reason: collision with root package name */
    public int f84934j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f84935k;

    /* renamed from: l, reason: collision with root package name */
    public long f84936l;

    public y(j jVar) {
        this.f84925a = jVar;
    }

    public final boolean a(io.bidmachine.media3.common.util.m0 m0Var, byte[] bArr, int i10) {
        int iMin = Math.min(m0Var.bytesLeft(), i10 - this.f84928d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            m0Var.skipBytes(iMin);
        } else {
            m0Var.readBytes(bArr, this.f84928d, iMin);
        }
        int i11 = this.f84928d + iMin;
        this.f84928d = i11;
        return i11 == i10;
    }

    public final boolean b() {
        io.bidmachine.media3.common.util.l0 l0Var = this.f84926b;
        l0Var.setPosition(0);
        int bits = l0Var.readBits(24);
        if (bits != 1) {
            e3.g.t(bits, "Unexpected start code prefix: ", "PesReader");
            this.f84934j = -1;
            return false;
        }
        l0Var.skipBits(8);
        int bits2 = l0Var.readBits(16);
        l0Var.skipBits(5);
        this.f84935k = l0Var.readBit();
        l0Var.skipBits(2);
        this.f84930f = l0Var.readBit();
        this.f84931g = l0Var.readBit();
        l0Var.skipBits(6);
        int bits3 = l0Var.readBits(8);
        this.f84933i = bits3;
        if (bits2 == 0) {
            this.f84934j = -1;
        } else {
            int i10 = (bits2 - 3) - bits3;
            this.f84934j = i10;
            if (i10 < 0) {
                io.bidmachine.media3.common.util.b0.w("PesReader", "Found negative packet payload size: " + this.f84934j);
                this.f84934j = -1;
            }
        }
        return true;
    }

    public boolean canConsumeSynthesizedEmptyPusi(boolean z10) {
        return this.f84927c == 3 && this.f84934j == -1 && !(z10 && (this.f84925a instanceof k)) && (!z10 || b());
    }

    @Override // rp.n0
    public void consume(io.bidmachine.media3.common.util.m0 m0Var, int i10) throws z0 {
        io.bidmachine.media3.common.util.a.checkStateNotNull(this.f84929e);
        int i11 = i10 & 1;
        int i12 = -1;
        int i13 = 2;
        j jVar = this.f84925a;
        if (i11 != 0) {
            int i14 = this.f84927c;
            if (i14 != 0 && i14 != 1) {
                if (i14 == 2) {
                    io.bidmachine.media3.common.util.b0.w("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i14 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f84934j != -1) {
                        io.bidmachine.media3.common.util.b0.w("PesReader", "Unexpected start indicator: expected " + this.f84934j + " more bytes");
                    }
                    jVar.packetFinished(m0Var.limit() == 0);
                }
            }
            this.f84927c = 1;
            this.f84928d = 0;
        }
        int i15 = i10;
        while (m0Var.bytesLeft() > 0) {
            int i16 = this.f84927c;
            if (i16 != 0) {
                io.bidmachine.media3.common.util.l0 l0Var = this.f84926b;
                if (i16 != 1) {
                    if (i16 == i13) {
                        if (a(m0Var, l0Var.f60741a, Math.min(10, this.f84933i)) && a(m0Var, null, this.f84933i)) {
                            l0Var.setPosition(0);
                            this.f84936l = C.TIME_UNSET;
                            if (this.f84930f) {
                                l0Var.skipBits(4);
                                l0Var.skipBits(1);
                                l0Var.skipBits(1);
                                long bits = (l0Var.readBits(15) << 15) | (l0Var.readBits(3) << 30) | l0Var.readBits(15);
                                l0Var.skipBits(1);
                                if (!this.f84932h && this.f84931g) {
                                    l0Var.skipBits(4);
                                    l0Var.skipBits(1);
                                    l0Var.skipBits(1);
                                    l0Var.skipBits(1);
                                    this.f84929e.adjustTsTimestamp((l0Var.readBits(3) << 30) | (l0Var.readBits(15) << 15) | l0Var.readBits(15));
                                    this.f84932h = true;
                                }
                                this.f84936l = this.f84929e.adjustTsTimestamp(bits);
                            }
                            i15 |= this.f84935k ? 4 : 0;
                            jVar.packetStarted(this.f84936l, i15);
                            this.f84927c = 3;
                            this.f84928d = 0;
                        }
                    } else {
                        if (i16 != 3) {
                            throw new IllegalStateException();
                        }
                        int iBytesLeft = m0Var.bytesLeft();
                        int i17 = this.f84934j;
                        int i18 = i17 == i12 ? 0 : iBytesLeft - i17;
                        if (i18 > 0) {
                            iBytesLeft -= i18;
                            m0Var.setLimit(m0Var.getPosition() + iBytesLeft);
                        }
                        jVar.consume(m0Var);
                        int i19 = this.f84934j;
                        if (i19 != i12) {
                            int i20 = i19 - iBytesLeft;
                            this.f84934j = i20;
                            if (i20 == 0) {
                                jVar.packetFinished(false);
                                this.f84927c = 1;
                                this.f84928d = 0;
                            }
                        }
                    }
                } else if (a(m0Var, l0Var.f60741a, 9)) {
                    this.f84927c = b() ? 2 : 0;
                    this.f84928d = 0;
                }
            } else {
                m0Var.skipBytes(m0Var.bytesLeft());
            }
            i12 = -1;
            i13 = 2;
        }
    }

    @Override // rp.n0
    public void init(u0 u0Var, ko.c0 c0Var, m0 m0Var) {
        this.f84929e = u0Var;
        this.f84925a.createTracks(c0Var, m0Var);
    }

    @Override // rp.n0
    public void seek() {
        this.f84927c = 0;
        this.f84928d = 0;
        this.f84932h = false;
        this.f84925a.seek();
    }
}
