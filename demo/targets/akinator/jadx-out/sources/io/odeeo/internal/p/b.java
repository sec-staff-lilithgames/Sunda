package io.odeeo.internal.p;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.b.t;
import io.odeeo.internal.d.b;
import io.odeeo.internal.p.d0;
import io.odeeo.internal.q0.g0;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b implements j {

    /* renamed from: a, reason: collision with root package name */
    public final io.odeeo.internal.q0.w f65227a;

    /* renamed from: b, reason: collision with root package name */
    public final io.odeeo.internal.q0.x f65228b;

    /* renamed from: c, reason: collision with root package name */
    public final String f65229c;

    /* renamed from: d, reason: collision with root package name */
    public String f65230d;

    /* renamed from: e, reason: collision with root package name */
    public io.odeeo.internal.g.x f65231e;

    /* renamed from: f, reason: collision with root package name */
    public int f65232f;

    /* renamed from: g, reason: collision with root package name */
    public int f65233g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f65234h;

    /* renamed from: i, reason: collision with root package name */
    public long f65235i;

    /* renamed from: j, reason: collision with root package name */
    public io.odeeo.internal.b.t f65236j;

    /* renamed from: k, reason: collision with root package name */
    public int f65237k;

    /* renamed from: l, reason: collision with root package name */
    public long f65238l;

    public b() {
        this(null);
    }

    public final boolean a(io.odeeo.internal.q0.x xVar, byte[] bArr, int i10) {
        int iMin = Math.min(xVar.bytesLeft(), i10 - this.f65233g);
        xVar.readBytes(bArr, this.f65233g, iMin);
        int i11 = this.f65233g + iMin;
        this.f65233g = i11;
        return i11 == i10;
    }

    @Override // io.odeeo.internal.p.j
    public void consume(io.odeeo.internal.q0.x xVar) {
        io.odeeo.internal.q0.a.checkStateNotNull(this.f65231e);
        while (xVar.bytesLeft() > 0) {
            int i10 = this.f65232f;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int iMin = Math.min(xVar.bytesLeft(), this.f65237k - this.f65233g);
                        this.f65231e.sampleData(xVar, iMin);
                        int i11 = this.f65233g + iMin;
                        this.f65233g = i11;
                        int i12 = this.f65237k;
                        if (i11 == i12) {
                            long j10 = this.f65238l;
                            if (j10 != C.TIME_UNSET) {
                                this.f65231e.sampleMetadata(j10, 1, i12, 0, null);
                                this.f65238l += this.f65235i;
                            }
                            this.f65232f = 0;
                        }
                    }
                } else if (a(xVar, this.f65228b.getData(), 128)) {
                    a();
                    this.f65228b.setPosition(0);
                    this.f65231e.sampleData(this.f65228b, 128);
                    this.f65232f = 2;
                }
            } else if (a(xVar)) {
                this.f65232f = 1;
                this.f65228b.getData()[0] = 11;
                this.f65228b.getData()[1] = 119;
                this.f65233g = 2;
            }
        }
    }

    @Override // io.odeeo.internal.p.j
    public void createTracks(io.odeeo.internal.g.j jVar, d0.d dVar) {
        dVar.generateNewId();
        this.f65230d = dVar.getFormatId();
        this.f65231e = jVar.track(dVar.getTrackId(), 1);
    }

    @Override // io.odeeo.internal.p.j
    public void packetStarted(long j10, int i10) {
        if (j10 != C.TIME_UNSET) {
            this.f65238l = j10;
        }
    }

    @Override // io.odeeo.internal.p.j
    public void seek() {
        this.f65232f = 0;
        this.f65233g = 0;
        this.f65234h = false;
        this.f65238l = C.TIME_UNSET;
    }

    public b(String str) {
        io.odeeo.internal.q0.w wVar = new io.odeeo.internal.q0.w(new byte[128]);
        this.f65227a = wVar;
        this.f65228b = new io.odeeo.internal.q0.x(wVar.f65964a);
        this.f65232f = 0;
        this.f65238l = C.TIME_UNSET;
        this.f65229c = str;
    }

    public final boolean a(io.odeeo.internal.q0.x xVar) {
        while (true) {
            if (xVar.bytesLeft() <= 0) {
                return false;
            }
            if (!this.f65234h) {
                this.f65234h = xVar.readUnsignedByte() == 11;
            } else {
                int unsignedByte = xVar.readUnsignedByte();
                if (unsignedByte == 119) {
                    this.f65234h = false;
                    return true;
                }
                this.f65234h = unsignedByte == 11;
            }
        }
    }

    @RequiresNonNull({"output"})
    public final void a() {
        this.f65227a.setPosition(0);
        b.C0599b ac3SyncframeInfo = io.odeeo.internal.d.b.parseAc3SyncframeInfo(this.f65227a);
        io.odeeo.internal.b.t tVar = this.f65236j;
        if (tVar == null || ac3SyncframeInfo.f63325d != tVar.f62984y || ac3SyncframeInfo.f63324c != tVar.f62985z || !g0.areEqual(ac3SyncframeInfo.f63322a, tVar.f62971l)) {
            io.odeeo.internal.b.t tVarBuild = new t.b().setId(this.f65230d).setSampleMimeType(ac3SyncframeInfo.f63322a).setChannelCount(ac3SyncframeInfo.f63325d).setSampleRate(ac3SyncframeInfo.f63324c).setLanguage(this.f65229c).build();
            this.f65236j = tVarBuild;
            this.f65231e.format(tVarBuild);
        }
        this.f65237k = ac3SyncframeInfo.f63326e;
        this.f65235i = (ac3SyncframeInfo.f63327f * 1000000) / this.f65236j.f62985z;
    }

    @Override // io.odeeo.internal.p.j
    public void packetFinished() {
    }
}
