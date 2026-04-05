package oe;

import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.util.u0;
import com.google.android.exoplayer2.util.v0;
import com.google.android.exoplayer2.y0;
import com.google.android.exoplayer2.z0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b implements j {

    /* renamed from: a, reason: collision with root package name */
    public final u0 f78979a;

    /* renamed from: b, reason: collision with root package name */
    public final v0 f78980b;

    /* renamed from: c, reason: collision with root package name */
    public final String f78981c;

    /* renamed from: d, reason: collision with root package name */
    public String f78982d;

    /* renamed from: e, reason: collision with root package name */
    public ee.l0 f78983e;

    /* renamed from: f, reason: collision with root package name */
    public int f78984f;

    /* renamed from: g, reason: collision with root package name */
    public int f78985g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f78986h;

    /* renamed from: i, reason: collision with root package name */
    public long f78987i;

    /* renamed from: j, reason: collision with root package name */
    public z0 f78988j;

    /* renamed from: k, reason: collision with root package name */
    public int f78989k;

    /* renamed from: l, reason: collision with root package name */
    public long f78990l;

    public b() {
        this(null);
    }

    @Override // oe.j
    public void consume(v0 v0Var) {
        com.google.android.exoplayer2.util.a.checkStateNotNull(this.f78983e);
        while (v0Var.bytesLeft() > 0) {
            int i10 = this.f78984f;
            v0 v0Var2 = this.f78980b;
            if (i10 == 0) {
                while (true) {
                    if (v0Var.bytesLeft() <= 0) {
                        break;
                    }
                    if (this.f78986h) {
                        int unsignedByte = v0Var.readUnsignedByte();
                        if (unsignedByte == 119) {
                            this.f78986h = false;
                            this.f78984f = 1;
                            v0Var2.getData()[0] = 11;
                            v0Var2.getData()[1] = 119;
                            this.f78985g = 2;
                            break;
                        }
                        this.f78986h = unsignedByte == 11;
                    } else {
                        this.f78986h = v0Var.readUnsignedByte() == 11;
                    }
                }
            } else if (i10 == 1) {
                byte[] data = v0Var2.getData();
                int iMin = Math.min(v0Var.bytesLeft(), 128 - this.f78985g);
                v0Var.readBytes(data, this.f78985g, iMin);
                int i11 = this.f78985g + iMin;
                this.f78985g = i11;
                if (i11 == 128) {
                    u0 u0Var = this.f78979a;
                    u0Var.setPosition(0);
                    com.google.android.exoplayer2.audio.c ac3SyncframeInfo = com.google.android.exoplayer2.audio.d.parseAc3SyncframeInfo(u0Var);
                    z0 z0Var = this.f78988j;
                    if (z0Var == null || ac3SyncframeInfo.f27056c != z0Var.A || ac3SyncframeInfo.f27055b != z0Var.B || !n1.areEqual(ac3SyncframeInfo.f27054a, z0Var.f28802n)) {
                        y0 id2 = new y0().setId(this.f78982d);
                        String str = ac3SyncframeInfo.f27054a;
                        int i12 = ac3SyncframeInfo.f27059f;
                        y0 peakBitrate = id2.setSampleMimeType(str).setChannelCount(ac3SyncframeInfo.f27056c).setSampleRate(ac3SyncframeInfo.f27055b).setLanguage(this.f78981c).setPeakBitrate(i12);
                        if (MimeTypes.AUDIO_AC3.equals(ac3SyncframeInfo.f27054a)) {
                            peakBitrate.setAverageBitrate(i12);
                        }
                        z0 z0VarBuild = peakBitrate.build();
                        this.f78988j = z0VarBuild;
                        this.f78983e.format(z0VarBuild);
                    }
                    this.f78989k = ac3SyncframeInfo.f27057d;
                    this.f78987i = (ac3SyncframeInfo.f27058e * 1000000) / this.f78988j.B;
                    v0Var2.setPosition(0);
                    this.f78983e.sampleData(v0Var2, 128);
                    this.f78984f = 2;
                }
            } else if (i10 == 2) {
                int iMin2 = Math.min(v0Var.bytesLeft(), this.f78989k - this.f78985g);
                this.f78983e.sampleData(v0Var, iMin2);
                int i13 = this.f78985g + iMin2;
                this.f78985g = i13;
                int i14 = this.f78989k;
                if (i13 == i14) {
                    long j10 = this.f78990l;
                    if (j10 != C.TIME_UNSET) {
                        this.f78983e.sampleMetadata(j10, 1, i14, 0, null);
                        this.f78990l += this.f78987i;
                    }
                    this.f78984f = 0;
                }
            }
        }
    }

    @Override // oe.j
    public void createTracks(ee.s sVar, i0 i0Var) {
        i0Var.generateNewId();
        this.f78982d = i0Var.getFormatId();
        this.f78983e = sVar.track(i0Var.getTrackId(), 1);
    }

    @Override // oe.j
    public void packetStarted(long j10, int i10) {
        if (j10 != C.TIME_UNSET) {
            this.f78990l = j10;
        }
    }

    @Override // oe.j
    public void seek() {
        this.f78984f = 0;
        this.f78985g = 0;
        this.f78986h = false;
        this.f78990l = C.TIME_UNSET;
    }

    public b(String str) {
        u0 u0Var = new u0(new byte[128]);
        this.f78979a = u0Var;
        this.f78980b = new v0(u0Var.f28575a);
        this.f78984f = 0;
        this.f78990l = C.TIME_UNSET;
        this.f78981c = str;
    }

    @Override // oe.j
    public void packetFinished() {
    }
}
