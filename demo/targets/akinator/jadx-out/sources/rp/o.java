package rp;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.bidmachine.media3.common.util.a1;
import java.util.Collections;
import ko.e1;
import mh.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class o implements j {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f84813a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84814b;

    /* renamed from: c, reason: collision with root package name */
    public String f84815c;

    /* renamed from: d, reason: collision with root package name */
    public e1 f84816d;

    /* renamed from: e, reason: collision with root package name */
    public a f84817e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f84818f;

    /* renamed from: m, reason: collision with root package name */
    public long f84825m;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f84819g = new boolean[3];

    /* renamed from: h, reason: collision with root package name */
    public final w f84820h = new w(32, 128);

    /* renamed from: i, reason: collision with root package name */
    public final w f84821i = new w(33, 128);

    /* renamed from: j, reason: collision with root package name */
    public final w f84822j = new w(34, 128);

    /* renamed from: k, reason: collision with root package name */
    public final w f84823k = new w(39, 128);

    /* renamed from: l, reason: collision with root package name */
    public final w f84824l = new w(40, 128);

    /* renamed from: n, reason: collision with root package name */
    public long f84826n = C.TIME_UNSET;

    /* renamed from: o, reason: collision with root package name */
    public final io.bidmachine.media3.common.util.m0 f84827o = new io.bidmachine.media3.common.util.m0();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final e1 f84828a;

        /* renamed from: b, reason: collision with root package name */
        public long f84829b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f84830c;

        /* renamed from: d, reason: collision with root package name */
        public int f84831d;

        /* renamed from: e, reason: collision with root package name */
        public long f84832e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f84833f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f84834g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f84835h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f84836i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f84837j;

        /* renamed from: k, reason: collision with root package name */
        public long f84838k;

        /* renamed from: l, reason: collision with root package name */
        public long f84839l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f84840m;

        public a(e1 e1Var) {
            this.f84828a = e1Var;
        }

        public final void a(int i10) {
            long j10 = this.f84839l;
            if (j10 != C.TIME_UNSET) {
                long j11 = this.f84829b;
                long j12 = this.f84838k;
                if (j11 == j12) {
                    return;
                }
                int i11 = (int) (j11 - j12);
                this.f84828a.sampleMetadata(j10, this.f84840m ? 1 : 0, i11, i10, null);
            }
        }

        public void endNalUnit(long j10, int i10, boolean z10) {
            if (this.f84837j && this.f84834g) {
                this.f84840m = this.f84830c;
                this.f84837j = false;
            } else if (this.f84835h || this.f84834g) {
                if (z10 && this.f84836i) {
                    a(i10 + ((int) (j10 - this.f84829b)));
                }
                this.f84838k = this.f84829b;
                this.f84839l = this.f84832e;
                this.f84840m = this.f84830c;
                this.f84836i = true;
            }
        }

        public void readNalUnitData(byte[] bArr, int i10, int i11) {
            if (this.f84833f) {
                int i12 = this.f84831d;
                int i13 = (i10 + 2) - i12;
                if (i13 >= i11) {
                    this.f84831d = (i11 - i10) + i12;
                } else {
                    this.f84834g = (bArr[i13] & 128) != 0;
                    this.f84833f = false;
                }
            }
        }

        public void reset() {
            this.f84833f = false;
            this.f84834g = false;
            this.f84835h = false;
            this.f84836i = false;
            this.f84837j = false;
        }

        public void startNalUnit(long j10, int i10, int i11, long j11, boolean z10) {
            this.f84834g = false;
            this.f84835h = false;
            this.f84832e = j11;
            this.f84831d = 0;
            this.f84829b = j10;
            if (i11 >= 32 && i11 != 40) {
                if (this.f84836i && !this.f84837j) {
                    if (z10) {
                        a(i10);
                    }
                    this.f84836i = false;
                }
                if ((32 <= i11 && i11 <= 35) || i11 == 39) {
                    this.f84835h = !this.f84837j;
                    this.f84837j = true;
                }
            }
            boolean z11 = i11 >= 16 && i11 <= 21;
            this.f84830c = z11;
            this.f84833f = z11 || i11 <= 9;
        }
    }

    public o(f0 f0Var, String str) {
        this.f84813a = f0Var;
        this.f84814b = str;
    }

    public final void a(int i10, int i11, long j10, long j11) {
        this.f84817e.endNalUnit(j10, i10, this.f84818f);
        boolean z10 = this.f84818f;
        f0 f0Var = this.f84813a;
        if (!z10) {
            w wVar = this.f84820h;
            wVar.endNalUnit(i11);
            w wVar2 = this.f84821i;
            wVar2.endNalUnit(i11);
            w wVar3 = this.f84822j;
            wVar3.endNalUnit(i11);
            if (wVar.isCompleted() && wVar2.isCompleted() && wVar3.isCompleted()) {
                String str = this.f84815c;
                int i12 = wVar.f84921e;
                byte[] bArr = new byte[wVar2.f84921e + i12 + wVar3.f84921e];
                System.arraycopy(wVar.f84920d, 0, bArr, 0, i12);
                System.arraycopy(wVar2.f84920d, 0, bArr, wVar.f84921e, wVar2.f84921e);
                System.arraycopy(wVar3.f84920d, 0, bArr, wVar.f84921e + wVar2.f84921e, wVar3.f84921e);
                jn.o h265SpsNalUnit = jn.u.parseH265SpsNalUnit(wVar2.f84920d, 3, wVar2.f84921e, null);
                jn.j jVar = h265SpsNalUnit.f69758b;
                io.bidmachine.media3.common.b bVarBuild = new gn.w().setId(str).setContainerMimeType(this.f84814b).setSampleMimeType("video/hevc").setCodecs(jVar != null ? io.bidmachine.media3.common.util.h.buildHevcCodecString(jVar.f69741a, jVar.f69742b, jVar.f69743c, jVar.f69744d, jVar.f69745e, jVar.f69746f) : null).setWidth(h265SpsNalUnit.f69761e).setHeight(h265SpsNalUnit.f69762f).setColorInfo(new gn.m().setColorSpace(h265SpsNalUnit.f69765i).setColorRange(h265SpsNalUnit.f69766j).setColorTransfer(h265SpsNalUnit.f69767k).setLumaBitdepth(h265SpsNalUnit.f69759c + 8).setChromaBitdepth(h265SpsNalUnit.f69760d + 8).build()).setPixelWidthHeightRatio(h265SpsNalUnit.f69763g).setMaxNumReorderSamples(h265SpsNalUnit.f69764h).setMaxSubLayers(h265SpsNalUnit.f69757a + 1).setInitializationData(Collections.singletonList(bArr)).build();
                this.f84816d.format(bVarBuild);
                p1.checkState(bVarBuild.f60667q != -1);
                f0Var.setReorderingQueueSize(bVarBuild.f60667q);
                this.f84818f = true;
            }
        }
        w wVar4 = this.f84823k;
        boolean zEndNalUnit = wVar4.endNalUnit(i11);
        io.bidmachine.media3.common.util.m0 m0Var = this.f84827o;
        if (zEndNalUnit) {
            m0Var.reset(wVar4.f84920d, jn.u.unescapeStream(wVar4.f84920d, wVar4.f84921e));
            m0Var.skipBytes(5);
            f0Var.consume(j11, m0Var);
        }
        w wVar5 = this.f84824l;
        if (wVar5.endNalUnit(i11)) {
            m0Var.reset(wVar5.f84920d, jn.u.unescapeStream(wVar5.f84920d, wVar5.f84921e));
            m0Var.skipBytes(5);
            f0Var.consume(j11, m0Var);
        }
    }

    public final void b(int i10, int i11, byte[] bArr) {
        this.f84817e.readNalUnitData(bArr, i10, i11);
        if (!this.f84818f) {
            this.f84820h.appendToNalUnit(bArr, i10, i11);
            this.f84821i.appendToNalUnit(bArr, i10, i11);
            this.f84822j.appendToNalUnit(bArr, i10, i11);
        }
        this.f84823k.appendToNalUnit(bArr, i10, i11);
        this.f84824l.appendToNalUnit(bArr, i10, i11);
    }

    public final void c(long j10, int i10, int i11, long j11) {
        this.f84817e.startNalUnit(j10, i10, i11, j11, this.f84818f);
        if (!this.f84818f) {
            this.f84820h.startNalUnit(i11);
            this.f84821i.startNalUnit(i11);
            this.f84822j.startNalUnit(i11);
        }
        this.f84823k.startNalUnit(i11);
        this.f84824l.startNalUnit(i11);
    }

    @Override // rp.j
    public void consume(io.bidmachine.media3.common.util.m0 m0Var) {
        int i10;
        io.bidmachine.media3.common.util.a.checkStateNotNull(this.f84816d);
        a1.castNonNull(this.f84817e);
        while (m0Var.bytesLeft() > 0) {
            int position = m0Var.getPosition();
            int iLimit = m0Var.limit();
            byte[] data = m0Var.getData();
            this.f84825m += m0Var.bytesLeft();
            this.f84816d.sampleData(m0Var, m0Var.bytesLeft());
            while (position < iLimit) {
                int iFindNalUnit = jn.u.findNalUnit(data, position, iLimit, this.f84819g);
                if (iFindNalUnit == iLimit) {
                    b(position, iLimit, data);
                    return;
                }
                int h265NalUnitType = jn.u.getH265NalUnitType(data, iFindNalUnit);
                if (iFindNalUnit <= 0 || data[iFindNalUnit - 1] != 0) {
                    i10 = 3;
                } else {
                    iFindNalUnit--;
                    i10 = 4;
                }
                int i11 = iFindNalUnit;
                int i12 = i10;
                int i13 = i11 - position;
                if (i13 > 0) {
                    b(position, i11, data);
                }
                int i14 = iLimit - i11;
                long j10 = this.f84825m - i14;
                a(i14, i13 < 0 ? -i13 : 0, j10, this.f84826n);
                c(j10, i14, h265NalUnitType, this.f84826n);
                position = i11 + i12;
            }
        }
    }

    @Override // rp.j
    public void createTracks(ko.c0 c0Var, m0 m0Var) {
        m0Var.generateNewId();
        this.f84815c = m0Var.getFormatId();
        e1 e1VarTrack = c0Var.track(m0Var.getTrackId(), 2);
        this.f84816d = e1VarTrack;
        this.f84817e = new a(e1VarTrack);
        this.f84813a.createTracks(c0Var, m0Var);
    }

    @Override // rp.j
    public void packetFinished(boolean z10) {
        io.bidmachine.media3.common.util.a.checkStateNotNull(this.f84816d);
        a1.castNonNull(this.f84817e);
        if (z10) {
            this.f84813a.flush();
            a(0, 0, this.f84825m, this.f84826n);
            c(this.f84825m, 0, 48, this.f84826n);
        }
    }

    @Override // rp.j
    public void packetStarted(long j10, int i10) {
        this.f84826n = j10;
    }

    @Override // rp.j
    public void seek() {
        this.f84825m = 0L;
        this.f84826n = C.TIME_UNSET;
        jn.u.clearPrefixFlags(this.f84819g);
        this.f84820h.reset();
        this.f84821i.reset();
        this.f84822j.reset();
        this.f84823k.reset();
        this.f84824l.reset();
        this.f84813a.clear();
        a aVar = this.f84817e;
        if (aVar != null) {
            aVar.reset();
        }
    }
}
