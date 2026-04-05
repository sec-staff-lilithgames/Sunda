package io.odeeo.internal.p;

import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import io.odeeo.internal.b.t;
import io.odeeo.internal.p.d0;
import io.odeeo.internal.q0.g0;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l implements j {

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f65382l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final f0 f65383a;

    /* renamed from: b, reason: collision with root package name */
    public final io.odeeo.internal.q0.x f65384b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f65385c;

    /* renamed from: d, reason: collision with root package name */
    public final a f65386d;

    /* renamed from: e, reason: collision with root package name */
    public final r f65387e;

    /* renamed from: f, reason: collision with root package name */
    public b f65388f;

    /* renamed from: g, reason: collision with root package name */
    public long f65389g;

    /* renamed from: h, reason: collision with root package name */
    public String f65390h;

    /* renamed from: i, reason: collision with root package name */
    public io.odeeo.internal.g.x f65391i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f65392j;

    /* renamed from: k, reason: collision with root package name */
    public long f65393k;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: f, reason: collision with root package name */
        public static final byte[] f65394f = {0, 0, 1};

        /* renamed from: a, reason: collision with root package name */
        public boolean f65395a;

        /* renamed from: b, reason: collision with root package name */
        public int f65396b;

        /* renamed from: c, reason: collision with root package name */
        public int f65397c;

        /* renamed from: d, reason: collision with root package name */
        public int f65398d;

        /* renamed from: e, reason: collision with root package name */
        public byte[] f65399e;

        public a(int i10) {
            this.f65399e = new byte[i10];
        }

        public void onData(byte[] bArr, int i10, int i11) {
            if (this.f65395a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f65399e;
                int length = bArr2.length;
                int i13 = this.f65397c + i12;
                if (length < i13) {
                    this.f65399e = Arrays.copyOf(bArr2, i13 * 2);
                }
                System.arraycopy(bArr, i10, this.f65399e, this.f65397c, i12);
                this.f65397c += i12;
            }
        }

        public boolean onStartCode(int i10, int i11) {
            int i12 = this.f65396b;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i10 == 179 || i10 == 181) {
                                this.f65397c -= i11;
                                this.f65395a = false;
                                return true;
                            }
                        } else if ((i10 & PsExtractor.VIDEO_STREAM_MASK) != 32) {
                            io.odeeo.internal.q0.p.w("H263Reader", "Unexpected start code value");
                            reset();
                        } else {
                            this.f65398d = this.f65397c;
                            this.f65396b = 4;
                        }
                    } else if (i10 > 31) {
                        io.odeeo.internal.q0.p.w("H263Reader", "Unexpected start code value");
                        reset();
                    } else {
                        this.f65396b = 3;
                    }
                } else if (i10 != 181) {
                    io.odeeo.internal.q0.p.w("H263Reader", "Unexpected start code value");
                    reset();
                } else {
                    this.f65396b = 2;
                }
            } else if (i10 == 176) {
                this.f65396b = 1;
                this.f65395a = true;
            }
            byte[] bArr = f65394f;
            onData(bArr, 0, bArr.length);
            return false;
        }

        public void reset() {
            this.f65395a = false;
            this.f65397c = 0;
            this.f65396b = 0;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final io.odeeo.internal.g.x f65400a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f65401b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f65402c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f65403d;

        /* renamed from: e, reason: collision with root package name */
        public int f65404e;

        /* renamed from: f, reason: collision with root package name */
        public int f65405f;

        /* renamed from: g, reason: collision with root package name */
        public long f65406g;

        /* renamed from: h, reason: collision with root package name */
        public long f65407h;

        public b(io.odeeo.internal.g.x xVar) {
            this.f65400a = xVar;
        }

        public void onData(byte[] bArr, int i10, int i11) {
            if (this.f65402c) {
                int i12 = this.f65405f;
                int i13 = (i10 + 1) - i12;
                if (i13 >= i11) {
                    this.f65405f = (i11 - i10) + i12;
                } else {
                    this.f65403d = ((bArr[i13] & 192) >> 6) == 0;
                    this.f65402c = false;
                }
            }
        }

        public void onDataEnd(long j10, int i10, boolean z10) {
            if (this.f65404e == 182 && z10 && this.f65401b) {
                long j11 = this.f65407h;
                if (j11 != C.TIME_UNSET) {
                    this.f65400a.sampleMetadata(j11, this.f65403d ? 1 : 0, (int) (j10 - this.f65406g), i10, null);
                }
            }
            if (this.f65404e != 179) {
                this.f65406g = j10;
            }
        }

        public void onStartCode(int i10, long j10) {
            this.f65404e = i10;
            this.f65403d = false;
            this.f65401b = i10 == 182 || i10 == 179;
            this.f65402c = i10 == 182;
            this.f65405f = 0;
            this.f65407h = j10;
        }

        public void reset() {
            this.f65401b = false;
            this.f65402c = false;
            this.f65403d = false;
            this.f65404e = -1;
        }
    }

    public l() {
        this(null);
    }

    public static io.odeeo.internal.b.t a(a aVar, int i10, String str) {
        byte[] bArrCopyOf = Arrays.copyOf(aVar.f65399e, aVar.f65397c);
        io.odeeo.internal.q0.w wVar = new io.odeeo.internal.q0.w(bArrCopyOf);
        wVar.skipBytes(i10);
        wVar.skipBytes(4);
        wVar.skipBit();
        wVar.skipBits(8);
        if (wVar.readBit()) {
            wVar.skipBits(4);
            wVar.skipBits(3);
        }
        int bits = wVar.readBits(4);
        float f10 = 1.0f;
        if (bits == 15) {
            int bits2 = wVar.readBits(8);
            int bits3 = wVar.readBits(8);
            if (bits3 == 0) {
                io.odeeo.internal.q0.p.w("H263Reader", "Invalid aspect ratio");
            } else {
                f10 = bits2 / bits3;
            }
        } else {
            float[] fArr = f65382l;
            if (bits < fArr.length) {
                f10 = fArr[bits];
            } else {
                io.odeeo.internal.q0.p.w("H263Reader", "Invalid aspect ratio");
            }
        }
        if (wVar.readBit()) {
            wVar.skipBits(2);
            wVar.skipBits(1);
            if (wVar.readBit()) {
                wVar.skipBits(15);
                wVar.skipBit();
                wVar.skipBits(15);
                wVar.skipBit();
                wVar.skipBits(15);
                wVar.skipBit();
                wVar.skipBits(3);
                wVar.skipBits(11);
                wVar.skipBit();
                wVar.skipBits(15);
                wVar.skipBit();
            }
        }
        if (wVar.readBits(2) != 0) {
            io.odeeo.internal.q0.p.w("H263Reader", "Unhandled video object layer shape");
        }
        wVar.skipBit();
        int bits4 = wVar.readBits(16);
        wVar.skipBit();
        if (wVar.readBit()) {
            if (bits4 == 0) {
                io.odeeo.internal.q0.p.w("H263Reader", "Invalid vop_increment_time_resolution");
            } else {
                int i11 = 0;
                for (int i12 = bits4 - 1; i12 > 0; i12 >>= 1) {
                    i11++;
                }
                wVar.skipBits(i11);
            }
        }
        wVar.skipBit();
        int bits5 = wVar.readBits(13);
        wVar.skipBit();
        int bits6 = wVar.readBits(13);
        wVar.skipBit();
        wVar.skipBit();
        return new t.b().setId(str).setSampleMimeType(MimeTypes.VIDEO_MP4V).setWidth(bits5).setHeight(bits6).setPixelWidthHeightRatio(f10).setInitializationData(Collections.singletonList(bArrCopyOf)).build();
    }

    @Override // io.odeeo.internal.p.j
    public void consume(io.odeeo.internal.q0.x xVar) {
        io.odeeo.internal.q0.a.checkStateNotNull(this.f65388f);
        io.odeeo.internal.q0.a.checkStateNotNull(this.f65391i);
        int position = xVar.getPosition();
        int iLimit = xVar.limit();
        byte[] data = xVar.getData();
        this.f65389g += xVar.bytesLeft();
        this.f65391i.sampleData(xVar, xVar.bytesLeft());
        while (true) {
            int iFindNalUnit = io.odeeo.internal.q0.u.findNalUnit(data, position, iLimit, this.f65385c);
            if (iFindNalUnit == iLimit) {
                break;
            }
            int i10 = iFindNalUnit + 3;
            int i11 = xVar.getData()[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int i12 = iFindNalUnit - position;
            int i13 = 0;
            if (!this.f65392j) {
                if (i12 > 0) {
                    this.f65386d.onData(data, position, iFindNalUnit);
                }
                if (this.f65386d.onStartCode(i11, i12 < 0 ? -i12 : 0)) {
                    io.odeeo.internal.g.x xVar2 = this.f65391i;
                    a aVar = this.f65386d;
                    xVar2.format(a(aVar, aVar.f65398d, (String) io.odeeo.internal.q0.a.checkNotNull(this.f65390h)));
                    this.f65392j = true;
                }
            }
            this.f65388f.onData(data, position, iFindNalUnit);
            r rVar = this.f65387e;
            if (rVar != null) {
                if (i12 > 0) {
                    rVar.appendToNalUnit(data, position, iFindNalUnit);
                } else {
                    i13 = -i12;
                }
                if (this.f65387e.endNalUnit(i13)) {
                    r rVar2 = this.f65387e;
                    ((io.odeeo.internal.q0.x) g0.castNonNull(this.f65384b)).reset(this.f65387e.f65526d, io.odeeo.internal.q0.u.unescapeStream(rVar2.f65526d, rVar2.f65527e));
                    ((f0) g0.castNonNull(this.f65383a)).consume(this.f65393k, this.f65384b);
                }
                if (i11 == 178 && xVar.getData()[iFindNalUnit + 2] == 1) {
                    this.f65387e.startNalUnit(i11);
                }
            }
            int i14 = iLimit - iFindNalUnit;
            this.f65388f.onDataEnd(this.f65389g - i14, i14, this.f65392j);
            this.f65388f.onStartCode(i11, this.f65393k);
            position = i10;
        }
        if (!this.f65392j) {
            this.f65386d.onData(data, position, iLimit);
        }
        this.f65388f.onData(data, position, iLimit);
        r rVar3 = this.f65387e;
        if (rVar3 != null) {
            rVar3.appendToNalUnit(data, position, iLimit);
        }
    }

    @Override // io.odeeo.internal.p.j
    public void createTracks(io.odeeo.internal.g.j jVar, d0.d dVar) {
        dVar.generateNewId();
        this.f65390h = dVar.getFormatId();
        io.odeeo.internal.g.x xVarTrack = jVar.track(dVar.getTrackId(), 2);
        this.f65391i = xVarTrack;
        this.f65388f = new b(xVarTrack);
        f0 f0Var = this.f65383a;
        if (f0Var != null) {
            f0Var.createTracks(jVar, dVar);
        }
    }

    @Override // io.odeeo.internal.p.j
    public void packetStarted(long j10, int i10) {
        if (j10 != C.TIME_UNSET) {
            this.f65393k = j10;
        }
    }

    @Override // io.odeeo.internal.p.j
    public void seek() {
        io.odeeo.internal.q0.u.clearPrefixFlags(this.f65385c);
        this.f65386d.reset();
        b bVar = this.f65388f;
        if (bVar != null) {
            bVar.reset();
        }
        r rVar = this.f65387e;
        if (rVar != null) {
            rVar.reset();
        }
        this.f65389g = 0L;
        this.f65393k = C.TIME_UNSET;
    }

    public l(f0 f0Var) {
        this.f65383a = f0Var;
        this.f65385c = new boolean[4];
        this.f65386d = new a(128);
        this.f65393k = C.TIME_UNSET;
        if (f0Var != null) {
            this.f65387e = new r(178, 128);
            this.f65384b = new io.odeeo.internal.q0.x();
        } else {
            this.f65387e = null;
            this.f65384b = null;
        }
    }

    @Override // io.odeeo.internal.p.j
    public void packetFinished() {
    }
}
