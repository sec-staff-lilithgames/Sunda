package oe;

import com.google.android.exoplayer2.h2;
import com.google.android.exoplayer2.util.h1;
import com.google.android.exoplayer2.util.u0;
import com.google.android.exoplayer2.util.v0;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class u implements j0 {

    /* renamed from: a, reason: collision with root package name */
    public final j f79285a;

    /* renamed from: b, reason: collision with root package name */
    public final u0 f79286b = new u0(new byte[10]);

    /* renamed from: c, reason: collision with root package name */
    public int f79287c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f79288d;

    /* renamed from: e, reason: collision with root package name */
    public h1 f79289e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f79290f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f79291g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f79292h;

    /* renamed from: i, reason: collision with root package name */
    public int f79293i;

    /* renamed from: j, reason: collision with root package name */
    public int f79294j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f79295k;

    /* renamed from: l, reason: collision with root package name */
    public long f79296l;

    public u(j jVar) {
        this.f79285a = jVar;
    }

    public final boolean a(v0 v0Var, byte[] bArr, int i10) {
        int iMin = Math.min(v0Var.bytesLeft(), i10 - this.f79288d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            v0Var.skipBytes(iMin);
        } else {
            v0Var.readBytes(bArr, this.f79288d, iMin);
        }
        int i11 = this.f79288d + iMin;
        this.f79288d = i11;
        return i11 == i10;
    }

    @Override // oe.j0
    public final void consume(v0 v0Var, int i10) throws h2 {
        int i11;
        int i12;
        int i13;
        com.google.android.exoplayer2.util.a.checkStateNotNull(this.f79289e);
        int i14 = i10 & 1;
        j jVar = this.f79285a;
        int i15 = 2;
        int i16 = 0;
        if (i14 != 0) {
            int i17 = this.f79287c;
            if (i17 != 0 && i17 != 1) {
                if (i17 == 2) {
                    com.google.android.exoplayer2.util.f0.w("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i17 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f79294j != -1) {
                        com.google.android.exoplayer2.util.f0.w("PesReader", "Unexpected start indicator: expected " + this.f79294j + " more bytes");
                    }
                    jVar.packetFinished();
                }
            }
            this.f79287c = 1;
            this.f79288d = 0;
        }
        int i18 = i10;
        while (v0Var.bytesLeft() > 0) {
            int i19 = this.f79287c;
            if (i19 != 0) {
                u0 u0Var = this.f79286b;
                if (i19 != 1) {
                    if (i19 == i15) {
                        if (a(v0Var, u0Var.f28575a, Math.min(10, this.f79293i)) && a(v0Var, null, this.f79293i)) {
                            u0Var.setPosition(i16);
                            this.f79296l = C.TIME_UNSET;
                            if (this.f79290f) {
                                u0Var.skipBits(4);
                                u0Var.skipBits(1);
                                u0Var.skipBits(1);
                                long bits = (u0Var.readBits(15) << 15) | (u0Var.readBits(3) << 30) | u0Var.readBits(15);
                                u0Var.skipBits(1);
                                if (!this.f79292h && this.f79291g) {
                                    u0Var.skipBits(4);
                                    u0Var.skipBits(1);
                                    u0Var.skipBits(1);
                                    u0Var.skipBits(1);
                                    this.f79289e.adjustTsTimestamp((u0Var.readBits(3) << 30) | (u0Var.readBits(15) << 15) | u0Var.readBits(15));
                                    this.f79292h = true;
                                }
                                this.f79296l = this.f79289e.adjustTsTimestamp(bits);
                            }
                            i18 |= this.f79295k ? 4 : 0;
                            jVar.packetStarted(this.f79296l, i18);
                            this.f79287c = 3;
                            this.f79288d = 0;
                            i16 = 0;
                            i15 = 2;
                        }
                    } else {
                        if (i19 != 3) {
                            throw new IllegalStateException();
                        }
                        int iBytesLeft = v0Var.bytesLeft();
                        int i20 = this.f79294j;
                        int i21 = i20 == -1 ? i16 : iBytesLeft - i20;
                        if (i21 > 0) {
                            iBytesLeft -= i21;
                            v0Var.setLimit(v0Var.getPosition() + iBytesLeft);
                        }
                        jVar.consume(v0Var);
                        int i22 = this.f79294j;
                        if (i22 != -1) {
                            int i23 = i22 - iBytesLeft;
                            this.f79294j = i23;
                            if (i23 == 0) {
                                jVar.packetFinished();
                                this.f79287c = 1;
                                this.f79288d = i16;
                            }
                        }
                    }
                    i11 = i15;
                    i12 = i16;
                } else {
                    i12 = i16;
                    if (a(v0Var, u0Var.f28575a, 9)) {
                        u0Var.setPosition(i12);
                        int bits2 = u0Var.readBits(24);
                        if (bits2 != 1) {
                            com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.p(bits2, "Unexpected start code prefix: ", "PesReader");
                            this.f79294j = -1;
                            i13 = 0;
                            i11 = 2;
                        } else {
                            u0Var.skipBits(8);
                            int bits3 = u0Var.readBits(16);
                            u0Var.skipBits(5);
                            this.f79295k = u0Var.readBit();
                            i11 = 2;
                            u0Var.skipBits(2);
                            this.f79290f = u0Var.readBit();
                            this.f79291g = u0Var.readBit();
                            u0Var.skipBits(6);
                            int bits4 = u0Var.readBits(8);
                            this.f79293i = bits4;
                            if (bits3 == 0) {
                                this.f79294j = -1;
                            } else {
                                int i24 = (bits3 - 3) - bits4;
                                this.f79294j = i24;
                                if (i24 < 0) {
                                    com.google.android.exoplayer2.util.f0.w("PesReader", "Found negative packet payload size: " + this.f79294j);
                                    this.f79294j = -1;
                                }
                            }
                            i13 = 2;
                        }
                        this.f79287c = i13;
                        i12 = 0;
                        this.f79288d = 0;
                    } else {
                        i11 = 2;
                    }
                }
            } else {
                i11 = i15;
                i12 = i16;
                v0Var.skipBytes(v0Var.bytesLeft());
            }
            i16 = i12;
            i15 = i11;
        }
    }

    @Override // oe.j0
    public void init(h1 h1Var, ee.s sVar, i0 i0Var) {
        this.f79289e = h1Var;
        this.f79285a.createTracks(sVar, i0Var);
    }

    @Override // oe.j0
    public final void seek() {
        this.f79287c = 0;
        this.f79288d = 0;
        this.f79292h = false;
        this.f79285a.seek();
    }
}
