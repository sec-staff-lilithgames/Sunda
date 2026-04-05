package oe;

import com.google.android.exoplayer2.audio.j1;
import com.google.android.exoplayer2.util.v0;
import com.google.android.exoplayer2.y0;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class r implements j {

    /* renamed from: a, reason: collision with root package name */
    public final v0 f79265a;

    /* renamed from: b, reason: collision with root package name */
    public final j1 f79266b;

    /* renamed from: c, reason: collision with root package name */
    public final String f79267c;

    /* renamed from: d, reason: collision with root package name */
    public ee.l0 f79268d;

    /* renamed from: e, reason: collision with root package name */
    public String f79269e;

    /* renamed from: f, reason: collision with root package name */
    public int f79270f;

    /* renamed from: g, reason: collision with root package name */
    public int f79271g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f79272h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f79273i;

    /* renamed from: j, reason: collision with root package name */
    public long f79274j;

    /* renamed from: k, reason: collision with root package name */
    public int f79275k;

    /* renamed from: l, reason: collision with root package name */
    public long f79276l;

    public r() {
        this(null);
    }

    @Override // oe.j
    public void consume(v0 v0Var) {
        com.google.android.exoplayer2.util.a.checkStateNotNull(this.f79268d);
        while (v0Var.bytesLeft() > 0) {
            int i10 = this.f79270f;
            v0 v0Var2 = this.f79265a;
            if (i10 == 0) {
                byte[] data = v0Var.getData();
                int position = v0Var.getPosition();
                int iLimit = v0Var.limit();
                while (true) {
                    if (position >= iLimit) {
                        v0Var.setPosition(iLimit);
                        break;
                    }
                    byte b10 = data[position];
                    boolean z10 = (b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) == 255;
                    boolean z11 = this.f79273i && (b10 & 224) == 224;
                    this.f79273i = z10;
                    if (z11) {
                        v0Var.setPosition(position + 1);
                        this.f79273i = false;
                        v0Var2.getData()[1] = data[position];
                        this.f79271g = 2;
                        this.f79270f = 1;
                        break;
                    }
                    position++;
                }
            } else if (i10 == 1) {
                int iMin = Math.min(v0Var.bytesLeft(), 4 - this.f79271g);
                v0Var.readBytes(v0Var2.getData(), this.f79271g, iMin);
                int i11 = this.f79271g + iMin;
                this.f79271g = i11;
                if (i11 >= 4) {
                    v0Var2.setPosition(0);
                    int i12 = v0Var2.readInt();
                    j1 j1Var = this.f79266b;
                    if (j1Var.setForHeaderData(i12)) {
                        this.f79275k = j1Var.f27147c;
                        if (!this.f79272h) {
                            this.f79274j = (j1Var.f27151g * 1000000) / j1Var.f27148d;
                            this.f79268d.format(new y0().setId(this.f79269e).setSampleMimeType(j1Var.f27146b).setMaxInputSize(4096).setChannelCount(j1Var.f27149e).setSampleRate(j1Var.f27148d).setLanguage(this.f79267c).build());
                            this.f79272h = true;
                        }
                        v0Var2.setPosition(0);
                        this.f79268d.sampleData(v0Var2, 4);
                        this.f79270f = 2;
                    } else {
                        this.f79271g = 0;
                        this.f79270f = 1;
                    }
                }
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                int iMin2 = Math.min(v0Var.bytesLeft(), this.f79275k - this.f79271g);
                this.f79268d.sampleData(v0Var, iMin2);
                int i13 = this.f79271g + iMin2;
                this.f79271g = i13;
                int i14 = this.f79275k;
                if (i13 >= i14) {
                    long j10 = this.f79276l;
                    if (j10 != C.TIME_UNSET) {
                        this.f79268d.sampleMetadata(j10, 1, i14, 0, null);
                        this.f79276l += this.f79274j;
                    }
                    this.f79271g = 0;
                    this.f79270f = 0;
                }
            }
        }
    }

    @Override // oe.j
    public void createTracks(ee.s sVar, i0 i0Var) {
        i0Var.generateNewId();
        this.f79269e = i0Var.getFormatId();
        this.f79268d = sVar.track(i0Var.getTrackId(), 1);
    }

    @Override // oe.j
    public void packetStarted(long j10, int i10) {
        if (j10 != C.TIME_UNSET) {
            this.f79276l = j10;
        }
    }

    @Override // oe.j
    public void seek() {
        this.f79270f = 0;
        this.f79271g = 0;
        this.f79273i = false;
        this.f79276l = C.TIME_UNSET;
    }

    public r(String str) {
        this.f79270f = 0;
        v0 v0Var = new v0(4);
        this.f79265a = v0Var;
        v0Var.getData()[0] = -1;
        this.f79266b = new j1();
        this.f79276l = C.TIME_UNSET;
        this.f79267c = str;
    }

    @Override // oe.j
    public void packetFinished() {
    }
}
