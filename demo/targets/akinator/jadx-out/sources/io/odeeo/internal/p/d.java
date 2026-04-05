package io.odeeo.internal.p;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.b.t;
import io.odeeo.internal.d.c;
import io.odeeo.internal.p.d0;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d implements j {

    /* renamed from: a, reason: collision with root package name */
    public final io.odeeo.internal.q0.w f65279a;

    /* renamed from: b, reason: collision with root package name */
    public final io.odeeo.internal.q0.x f65280b;

    /* renamed from: c, reason: collision with root package name */
    public final String f65281c;

    /* renamed from: d, reason: collision with root package name */
    public String f65282d;

    /* renamed from: e, reason: collision with root package name */
    public io.odeeo.internal.g.x f65283e;

    /* renamed from: f, reason: collision with root package name */
    public int f65284f;

    /* renamed from: g, reason: collision with root package name */
    public int f65285g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f65286h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f65287i;

    /* renamed from: j, reason: collision with root package name */
    public long f65288j;

    /* renamed from: k, reason: collision with root package name */
    public io.odeeo.internal.b.t f65289k;

    /* renamed from: l, reason: collision with root package name */
    public int f65290l;

    /* renamed from: m, reason: collision with root package name */
    public long f65291m;

    public d() {
        this(null);
    }

    public final boolean a(io.odeeo.internal.q0.x xVar, byte[] bArr, int i10) {
        int iMin = Math.min(xVar.bytesLeft(), i10 - this.f65285g);
        xVar.readBytes(bArr, this.f65285g, iMin);
        int i11 = this.f65285g + iMin;
        this.f65285g = i11;
        return i11 == i10;
    }

    @Override // io.odeeo.internal.p.j
    public void consume(io.odeeo.internal.q0.x xVar) {
        io.odeeo.internal.q0.a.checkStateNotNull(this.f65283e);
        while (xVar.bytesLeft() > 0) {
            int i10 = this.f65284f;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int iMin = Math.min(xVar.bytesLeft(), this.f65290l - this.f65285g);
                        this.f65283e.sampleData(xVar, iMin);
                        int i11 = this.f65285g + iMin;
                        this.f65285g = i11;
                        int i12 = this.f65290l;
                        if (i11 == i12) {
                            long j10 = this.f65291m;
                            if (j10 != C.TIME_UNSET) {
                                this.f65283e.sampleMetadata(j10, 1, i12, 0, null);
                                this.f65291m += this.f65288j;
                            }
                            this.f65284f = 0;
                        }
                    }
                } else if (a(xVar, this.f65280b.getData(), 16)) {
                    a();
                    this.f65280b.setPosition(0);
                    this.f65283e.sampleData(this.f65280b, 16);
                    this.f65284f = 2;
                }
            } else if (a(xVar)) {
                this.f65284f = 1;
                this.f65280b.getData()[0] = -84;
                this.f65280b.getData()[1] = (byte) (this.f65287i ? 65 : 64);
                this.f65285g = 2;
            }
        }
    }

    @Override // io.odeeo.internal.p.j
    public void createTracks(io.odeeo.internal.g.j jVar, d0.d dVar) {
        dVar.generateNewId();
        this.f65282d = dVar.getFormatId();
        this.f65283e = jVar.track(dVar.getTrackId(), 1);
    }

    @Override // io.odeeo.internal.p.j
    public void packetStarted(long j10, int i10) {
        if (j10 != C.TIME_UNSET) {
            this.f65291m = j10;
        }
    }

    @Override // io.odeeo.internal.p.j
    public void seek() {
        this.f65284f = 0;
        this.f65285g = 0;
        this.f65286h = false;
        this.f65287i = false;
        this.f65291m = C.TIME_UNSET;
    }

    public d(String str) {
        io.odeeo.internal.q0.w wVar = new io.odeeo.internal.q0.w(new byte[16]);
        this.f65279a = wVar;
        this.f65280b = new io.odeeo.internal.q0.x(wVar.f65964a);
        this.f65284f = 0;
        this.f65285g = 0;
        this.f65286h = false;
        this.f65287i = false;
        this.f65291m = C.TIME_UNSET;
        this.f65281c = str;
    }

    public final boolean a(io.odeeo.internal.q0.x xVar) {
        int unsignedByte;
        while (true) {
            if (xVar.bytesLeft() <= 0) {
                return false;
            }
            if (!this.f65286h) {
                this.f65286h = xVar.readUnsignedByte() == 172;
            } else {
                unsignedByte = xVar.readUnsignedByte();
                this.f65286h = unsignedByte == 172;
                if (unsignedByte == 64 || unsignedByte == 65) {
                    break;
                }
            }
        }
        this.f65287i = unsignedByte == 65;
        return true;
    }

    @RequiresNonNull({"output"})
    public final void a() {
        this.f65279a.setPosition(0);
        c.b ac4SyncframeInfo = io.odeeo.internal.d.c.parseAc4SyncframeInfo(this.f65279a);
        io.odeeo.internal.b.t tVar = this.f65289k;
        if (tVar == null || ac4SyncframeInfo.f63331c != tVar.f62984y || ac4SyncframeInfo.f63330b != tVar.f62985z || !"audio/ac4".equals(tVar.f62971l)) {
            io.odeeo.internal.b.t tVarBuild = new t.b().setId(this.f65282d).setSampleMimeType("audio/ac4").setChannelCount(ac4SyncframeInfo.f63331c).setSampleRate(ac4SyncframeInfo.f63330b).setLanguage(this.f65281c).build();
            this.f65289k = tVarBuild;
            this.f65283e.format(tVarBuild);
        }
        this.f65290l = ac4SyncframeInfo.f63332d;
        this.f65288j = (ac4SyncframeInfo.f63333e * 1000000) / this.f65289k.f62985z;
    }

    @Override // io.odeeo.internal.p.j
    public void packetFinished() {
    }
}
