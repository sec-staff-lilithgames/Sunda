package rp;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import gn.z0;
import io.bidmachine.media3.common.util.a1;
import ko.e1;
import nh.b5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class s implements j {

    /* renamed from: a, reason: collision with root package name */
    public final String f84888a;

    /* renamed from: f, reason: collision with root package name */
    public String f84893f;

    /* renamed from: g, reason: collision with root package name */
    public e1 f84894g;

    /* renamed from: j, reason: collision with root package name */
    public boolean f84897j;

    /* renamed from: l, reason: collision with root package name */
    public int f84899l;

    /* renamed from: m, reason: collision with root package name */
    public int f84900m;

    /* renamed from: o, reason: collision with root package name */
    public int f84902o;

    /* renamed from: p, reason: collision with root package name */
    public int f84903p;

    /* renamed from: t, reason: collision with root package name */
    public int f84907t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f84909v;

    /* renamed from: e, reason: collision with root package name */
    public int f84892e = 0;

    /* renamed from: b, reason: collision with root package name */
    public final io.bidmachine.media3.common.util.m0 f84889b = new io.bidmachine.media3.common.util.m0(new byte[15], 2);

    /* renamed from: c, reason: collision with root package name */
    public final io.bidmachine.media3.common.util.l0 f84890c = new io.bidmachine.media3.common.util.l0();

    /* renamed from: d, reason: collision with root package name */
    public final io.bidmachine.media3.common.util.m0 f84891d = new io.bidmachine.media3.common.util.m0();

    /* renamed from: q, reason: collision with root package name */
    public final t f84904q = new t();

    /* renamed from: r, reason: collision with root package name */
    public int f84905r = -2147483647;

    /* renamed from: s, reason: collision with root package name */
    public int f84906s = -1;

    /* renamed from: u, reason: collision with root package name */
    public long f84908u = -1;

    /* renamed from: k, reason: collision with root package name */
    public boolean f84898k = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f84901n = true;

    /* renamed from: h, reason: collision with root package name */
    public double f84895h = -9.223372036854776E18d;

    /* renamed from: i, reason: collision with root package name */
    public double f84896i = -9.223372036854776E18d;

    public s(String str) {
        this.f84888a = str;
    }

    public static void a(io.bidmachine.media3.common.util.m0 m0Var, io.bidmachine.media3.common.util.m0 m0Var2, boolean z10) {
        int position = m0Var.getPosition();
        int iMin = Math.min(m0Var.bytesLeft(), m0Var2.bytesLeft());
        m0Var.readBytes(m0Var2.getData(), m0Var2.getPosition(), iMin);
        m0Var2.skipBytes(iMin);
        if (z10) {
            m0Var.setPosition(position);
        }
    }

    @Override // rp.j
    public void consume(io.bidmachine.media3.common.util.m0 m0Var) throws z0 {
        int i10;
        io.bidmachine.media3.common.util.a.checkStateNotNull(this.f84894g);
        while (m0Var.bytesLeft() > 0) {
            int i11 = this.f84892e;
            if (i11 == 0) {
                int i12 = this.f84899l;
                if ((i12 & 2) != 0) {
                    if ((i12 & 4) == 0) {
                        while (m0Var.bytesLeft() > 0) {
                            int i13 = this.f84900m << 8;
                            this.f84900m = i13;
                            int unsignedByte = i13 | m0Var.readUnsignedByte();
                            this.f84900m = unsignedByte;
                            if (v.isSyncWord(unsignedByte)) {
                                m0Var.setPosition(m0Var.getPosition() - 3);
                                this.f84900m = 0;
                            }
                        }
                    }
                    this.f84892e = 1;
                    break;
                }
                m0Var.setPosition(m0Var.limit());
            } else {
                io.bidmachine.media3.common.util.m0 m0Var2 = this.f84891d;
                t tVar = this.f84904q;
                if (i11 == 1) {
                    io.bidmachine.media3.common.util.m0 m0Var3 = this.f84889b;
                    a(m0Var, m0Var3, false);
                    if (m0Var3.bytesLeft() == 0) {
                        int iLimit = m0Var3.limit();
                        byte[] data = m0Var3.getData();
                        io.bidmachine.media3.common.util.l0 l0Var = this.f84890c;
                        l0Var.reset(data, iLimit);
                        boolean mhasPacketHeader = v.parseMhasPacketHeader(l0Var, tVar);
                        if (mhasPacketHeader) {
                            this.f84902o = 0;
                            this.f84903p = tVar.f84912c + iLimit + this.f84903p;
                        }
                        if (mhasPacketHeader) {
                            m0Var3.setPosition(0);
                            this.f84894g.sampleData(m0Var3, m0Var3.limit());
                            m0Var3.reset(2);
                            m0Var2.reset(tVar.f84912c);
                            this.f84901n = true;
                            this.f84892e = 2;
                        } else if (m0Var3.limit() < 15) {
                            m0Var3.setLimit(m0Var3.limit() + 1);
                            this.f84901n = false;
                        }
                    } else {
                        this.f84901n = false;
                    }
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException();
                    }
                    int i14 = tVar.f84910a;
                    if (i14 == 1 || i14 == 17) {
                        a(m0Var, m0Var2, true);
                    }
                    int iMin = Math.min(m0Var.bytesLeft(), tVar.f84912c - this.f84902o);
                    this.f84894g.sampleData(m0Var, iMin);
                    int i15 = this.f84902o + iMin;
                    this.f84902o = i15;
                    if (i15 == tVar.f84912c) {
                        int i16 = tVar.f84910a;
                        if (i16 == 1) {
                            u mpegh3daConfig = v.parseMpegh3daConfig(new io.bidmachine.media3.common.util.l0(m0Var2.getData()));
                            this.f84905r = mpegh3daConfig.f84914b;
                            this.f84906s = mpegh3daConfig.f84915c;
                            long j10 = this.f84908u;
                            long j11 = tVar.f84911b;
                            if (j10 != j11) {
                                this.f84908u = j11;
                                int i17 = mpegh3daConfig.f84913a;
                                String strConcat = i17 != -1 ? "mhm1".concat(String.format(".%02X", Integer.valueOf(i17))) : "mhm1";
                                byte[] bArr = mpegh3daConfig.f84916d;
                                this.f84894g.format(new gn.w().setId(this.f84893f).setContainerMimeType(this.f84888a).setSampleMimeType("audio/mhm1").setSampleRate(this.f84905r).setCodecs(strConcat).setInitializationData((bArr == null || bArr.length <= 0) ? null : b5.of(a1.f60681c, bArr)).build());
                            }
                            this.f84909v = true;
                        } else if (i16 == 17) {
                            this.f84907t = v.parseAudioTruncationInfo(new io.bidmachine.media3.common.util.l0(m0Var2.getData()));
                        } else if (i16 == 2) {
                            if (this.f84909v) {
                                this.f84898k = false;
                                i10 = 1;
                            } else {
                                i10 = 0;
                            }
                            double d10 = ((this.f84906s - this.f84907t) * 1000000.0d) / this.f84905r;
                            long jRound = Math.round(this.f84895h);
                            if (this.f84897j) {
                                this.f84897j = false;
                                this.f84895h = this.f84896i;
                            } else {
                                this.f84895h += d10;
                            }
                            this.f84894g.sampleMetadata(jRound, i10, this.f84903p, 0, null);
                            this.f84909v = false;
                            this.f84907t = 0;
                            this.f84903p = 0;
                        }
                        this.f84892e = 1;
                    }
                }
            }
        }
    }

    @Override // rp.j
    public void createTracks(ko.c0 c0Var, m0 m0Var) {
        m0Var.generateNewId();
        this.f84893f = m0Var.getFormatId();
        this.f84894g = c0Var.track(m0Var.getTrackId(), 1);
    }

    @Override // rp.j
    public void packetStarted(long j10, int i10) {
        this.f84899l = i10;
        if (!this.f84898k && (this.f84903p != 0 || !this.f84901n)) {
            this.f84897j = true;
        }
        if (j10 != C.TIME_UNSET) {
            if (this.f84897j) {
                this.f84896i = j10;
            } else {
                this.f84895h = j10;
            }
        }
    }

    @Override // rp.j
    public void seek() {
        this.f84892e = 0;
        this.f84900m = 0;
        this.f84889b.reset(2);
        this.f84902o = 0;
        this.f84903p = 0;
        this.f84905r = -2147483647;
        this.f84906s = -1;
        this.f84907t = 0;
        this.f84908u = -1L;
        this.f84909v = false;
        this.f84897j = false;
        this.f84901n = true;
        this.f84898k = true;
        this.f84895h = -9.223372036854776E18d;
        this.f84896i = -9.223372036854776E18d;
    }

    @Override // rp.j
    public void packetFinished(boolean z10) {
    }
}
