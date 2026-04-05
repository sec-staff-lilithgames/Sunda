package io.odeeo.internal.p;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import io.odeeo.internal.b.t;
import io.odeeo.internal.p.d0;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i implements j {

    /* renamed from: a, reason: collision with root package name */
    public final List<d0.a> f65354a;

    /* renamed from: b, reason: collision with root package name */
    public final io.odeeo.internal.g.x[] f65355b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f65356c;

    /* renamed from: d, reason: collision with root package name */
    public int f65357d;

    /* renamed from: e, reason: collision with root package name */
    public int f65358e;

    /* renamed from: f, reason: collision with root package name */
    public long f65359f = C.TIME_UNSET;

    public i(List<d0.a> list) {
        this.f65354a = list;
        this.f65355b = new io.odeeo.internal.g.x[list.size()];
    }

    public final boolean a(io.odeeo.internal.q0.x xVar, int i10) {
        if (xVar.bytesLeft() == 0) {
            return false;
        }
        if (xVar.readUnsignedByte() != i10) {
            this.f65356c = false;
        }
        this.f65357d--;
        return this.f65356c;
    }

    @Override // io.odeeo.internal.p.j
    public void consume(io.odeeo.internal.q0.x xVar) {
        if (this.f65356c) {
            if (this.f65357d != 2 || a(xVar, 32)) {
                if (this.f65357d != 1 || a(xVar, 0)) {
                    int position = xVar.getPosition();
                    int iBytesLeft = xVar.bytesLeft();
                    for (io.odeeo.internal.g.x xVar2 : this.f65355b) {
                        xVar.setPosition(position);
                        xVar2.sampleData(xVar, iBytesLeft);
                    }
                    this.f65358e += iBytesLeft;
                }
            }
        }
    }

    @Override // io.odeeo.internal.p.j
    public void createTracks(io.odeeo.internal.g.j jVar, d0.d dVar) {
        for (int i10 = 0; i10 < this.f65355b.length; i10++) {
            d0.a aVar = this.f65354a.get(i10);
            dVar.generateNewId();
            io.odeeo.internal.g.x xVarTrack = jVar.track(dVar.getTrackId(), 3);
            xVarTrack.format(new t.b().setId(dVar.getFormatId()).setSampleMimeType(MimeTypes.APPLICATION_DVBSUBS).setInitializationData(Collections.singletonList(aVar.f65294c)).setLanguage(aVar.f65292a).build());
            this.f65355b[i10] = xVarTrack;
        }
    }

    @Override // io.odeeo.internal.p.j
    public void packetFinished() {
        if (this.f65356c) {
            if (this.f65359f != C.TIME_UNSET) {
                for (io.odeeo.internal.g.x xVar : this.f65355b) {
                    xVar.sampleMetadata(this.f65359f, 1, this.f65358e, 0, null);
                }
            }
            this.f65356c = false;
        }
    }

    @Override // io.odeeo.internal.p.j
    public void packetStarted(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f65356c = true;
        if (j10 != C.TIME_UNSET) {
            this.f65359f = j10;
        }
        this.f65358e = 0;
        this.f65357d = 2;
    }

    @Override // io.odeeo.internal.p.j
    public void seek() {
        this.f65356c = false;
        this.f65359f = C.TIME_UNSET;
    }
}
