package io.odeeo.internal.p;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.p.d0;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h implements j {

    /* renamed from: b, reason: collision with root package name */
    public final String f65344b;

    /* renamed from: c, reason: collision with root package name */
    public String f65345c;

    /* renamed from: d, reason: collision with root package name */
    public io.odeeo.internal.g.x f65346d;

    /* renamed from: f, reason: collision with root package name */
    public int f65348f;

    /* renamed from: g, reason: collision with root package name */
    public int f65349g;

    /* renamed from: h, reason: collision with root package name */
    public long f65350h;

    /* renamed from: i, reason: collision with root package name */
    public io.odeeo.internal.b.t f65351i;

    /* renamed from: j, reason: collision with root package name */
    public int f65352j;

    /* renamed from: a, reason: collision with root package name */
    public final io.odeeo.internal.q0.x f65343a = new io.odeeo.internal.q0.x(new byte[18]);

    /* renamed from: e, reason: collision with root package name */
    public int f65347e = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f65353k = C.TIME_UNSET;

    public h(String str) {
        this.f65344b = str;
    }

    public final boolean a(io.odeeo.internal.q0.x xVar, byte[] bArr, int i10) {
        int iMin = Math.min(xVar.bytesLeft(), i10 - this.f65348f);
        xVar.readBytes(bArr, this.f65348f, iMin);
        int i11 = this.f65348f + iMin;
        this.f65348f = i11;
        return i11 == i10;
    }

    @Override // io.odeeo.internal.p.j
    public void consume(io.odeeo.internal.q0.x xVar) {
        io.odeeo.internal.q0.a.checkStateNotNull(this.f65346d);
        while (xVar.bytesLeft() > 0) {
            int i10 = this.f65347e;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException();
                    }
                    int iMin = Math.min(xVar.bytesLeft(), this.f65352j - this.f65348f);
                    this.f65346d.sampleData(xVar, iMin);
                    int i11 = this.f65348f + iMin;
                    this.f65348f = i11;
                    int i12 = this.f65352j;
                    if (i11 == i12) {
                        long j10 = this.f65353k;
                        if (j10 != C.TIME_UNSET) {
                            this.f65346d.sampleMetadata(j10, 1, i12, 0, null);
                            this.f65353k += this.f65350h;
                        }
                        this.f65347e = 0;
                    }
                } else if (a(xVar, this.f65343a.getData(), 18)) {
                    a();
                    this.f65343a.setPosition(0);
                    this.f65346d.sampleData(this.f65343a, 18);
                    this.f65347e = 2;
                }
            } else if (a(xVar)) {
                this.f65347e = 1;
            }
        }
    }

    @Override // io.odeeo.internal.p.j
    public void createTracks(io.odeeo.internal.g.j jVar, d0.d dVar) {
        dVar.generateNewId();
        this.f65345c = dVar.getFormatId();
        this.f65346d = jVar.track(dVar.getTrackId(), 1);
    }

    @Override // io.odeeo.internal.p.j
    public void packetStarted(long j10, int i10) {
        if (j10 != C.TIME_UNSET) {
            this.f65353k = j10;
        }
    }

    @Override // io.odeeo.internal.p.j
    public void seek() {
        this.f65347e = 0;
        this.f65348f = 0;
        this.f65349g = 0;
        this.f65353k = C.TIME_UNSET;
    }

    public final boolean a(io.odeeo.internal.q0.x xVar) {
        while (xVar.bytesLeft() > 0) {
            int i10 = this.f65349g << 8;
            this.f65349g = i10;
            int unsignedByte = i10 | xVar.readUnsignedByte();
            this.f65349g = unsignedByte;
            if (io.odeeo.internal.d.o.isSyncWord(unsignedByte)) {
                byte[] data = this.f65343a.getData();
                int i11 = this.f65349g;
                data[0] = (byte) ((i11 >> 24) & 255);
                data[1] = (byte) ((i11 >> 16) & 255);
                data[2] = (byte) ((i11 >> 8) & 255);
                data[3] = (byte) (i11 & 255);
                this.f65348f = 4;
                this.f65349g = 0;
                return true;
            }
        }
        return false;
    }

    @RequiresNonNull({"output"})
    public final void a() {
        byte[] data = this.f65343a.getData();
        if (this.f65351i == null) {
            io.odeeo.internal.b.t dtsFormat = io.odeeo.internal.d.o.parseDtsFormat(data, this.f65345c, this.f65344b, null);
            this.f65351i = dtsFormat;
            this.f65346d.format(dtsFormat);
        }
        this.f65352j = io.odeeo.internal.d.o.getDtsFrameSize(data);
        this.f65350h = (int) ((io.odeeo.internal.d.o.parseDtsAudioSampleCount(data) * 1000000) / this.f65351i.f62985z);
    }

    @Override // io.odeeo.internal.p.j
    public void packetFinished() {
    }
}
