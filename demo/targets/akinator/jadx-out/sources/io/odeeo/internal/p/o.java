package io.odeeo.internal.p;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import io.odeeo.internal.b.t;
import io.odeeo.internal.p.d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class o implements j {

    /* renamed from: b, reason: collision with root package name */
    public io.odeeo.internal.g.x f65485b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f65486c;

    /* renamed from: e, reason: collision with root package name */
    public int f65488e;

    /* renamed from: f, reason: collision with root package name */
    public int f65489f;

    /* renamed from: a, reason: collision with root package name */
    public final io.odeeo.internal.q0.x f65484a = new io.odeeo.internal.q0.x(10);

    /* renamed from: d, reason: collision with root package name */
    public long f65487d = C.TIME_UNSET;

    @Override // io.odeeo.internal.p.j
    public void consume(io.odeeo.internal.q0.x xVar) {
        io.odeeo.internal.q0.a.checkStateNotNull(this.f65485b);
        if (this.f65486c) {
            int iBytesLeft = xVar.bytesLeft();
            int i10 = this.f65489f;
            if (i10 < 10) {
                int iMin = Math.min(iBytesLeft, 10 - i10);
                System.arraycopy(xVar.getData(), xVar.getPosition(), this.f65484a.getData(), this.f65489f, iMin);
                if (this.f65489f + iMin == 10) {
                    this.f65484a.setPosition(0);
                    if (73 != this.f65484a.readUnsignedByte() || 68 != this.f65484a.readUnsignedByte() || 51 != this.f65484a.readUnsignedByte()) {
                        io.odeeo.internal.q0.p.w("Id3Reader", "Discarding invalid ID3 tag");
                        this.f65486c = false;
                        return;
                    } else {
                        this.f65484a.skipBytes(3);
                        this.f65488e = this.f65484a.readSynchSafeInt() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iBytesLeft, this.f65488e - this.f65489f);
            this.f65485b.sampleData(xVar, iMin2);
            this.f65489f += iMin2;
        }
    }

    @Override // io.odeeo.internal.p.j
    public void createTracks(io.odeeo.internal.g.j jVar, d0.d dVar) {
        dVar.generateNewId();
        io.odeeo.internal.g.x xVarTrack = jVar.track(dVar.getTrackId(), 5);
        this.f65485b = xVarTrack;
        xVarTrack.format(new t.b().setId(dVar.getFormatId()).setSampleMimeType(MimeTypes.APPLICATION_ID3).build());
    }

    @Override // io.odeeo.internal.p.j
    public void packetFinished() {
        int i10;
        io.odeeo.internal.q0.a.checkStateNotNull(this.f65485b);
        if (this.f65486c && (i10 = this.f65488e) != 0 && this.f65489f == i10) {
            long j10 = this.f65487d;
            if (j10 != C.TIME_UNSET) {
                this.f65485b.sampleMetadata(j10, 1, i10, 0, null);
            }
            this.f65486c = false;
        }
    }

    @Override // io.odeeo.internal.p.j
    public void packetStarted(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f65486c = true;
        if (j10 != C.TIME_UNSET) {
            this.f65487d = j10;
        }
        this.f65488e = 0;
        this.f65489f = 0;
    }

    @Override // io.odeeo.internal.p.j
    public void seek() {
        this.f65486c = false;
        this.f65487d = C.TIME_UNSET;
    }
}
