package io.odeeo.internal.p;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.g.v;
import io.odeeo.internal.p.d0;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c implements io.odeeo.internal.g.h {

    /* renamed from: d, reason: collision with root package name */
    public static final io.odeeo.internal.g.l f65248d = new bt.a(11);

    /* renamed from: a, reason: collision with root package name */
    public final d f65249a = new d();

    /* renamed from: b, reason: collision with root package name */
    public final io.odeeo.internal.q0.x f65250b = new io.odeeo.internal.q0.x(16384);

    /* renamed from: c, reason: collision with root package name */
    public boolean f65251c;

    public static /* synthetic */ io.odeeo.internal.g.h[] a() {
        return new io.odeeo.internal.g.h[]{new c()};
    }

    @Override // io.odeeo.internal.g.h
    public void init(io.odeeo.internal.g.j jVar) {
        this.f65249a.createTracks(jVar, new d0.d(0, 1));
        jVar.endTracks();
        jVar.seekMap(new v.b(C.TIME_UNSET));
    }

    @Override // io.odeeo.internal.g.h
    public int read(io.odeeo.internal.g.i iVar, io.odeeo.internal.g.u uVar) throws IOException {
        int i10 = iVar.read(this.f65250b.getData(), 0, 16384);
        if (i10 == -1) {
            return -1;
        }
        this.f65250b.setPosition(0);
        this.f65250b.setLimit(i10);
        if (!this.f65251c) {
            this.f65249a.packetStarted(0L, 4);
            this.f65251c = true;
        }
        this.f65249a.consume(this.f65250b);
        return 0;
    }

    @Override // io.odeeo.internal.g.h
    public void seek(long j10, long j11) {
        this.f65251c = false;
        this.f65249a.seek();
    }

    @Override // io.odeeo.internal.g.h
    public boolean sniff(io.odeeo.internal.g.i iVar) throws IOException {
        io.odeeo.internal.q0.x xVar = new io.odeeo.internal.q0.x(10);
        int i10 = 0;
        while (true) {
            iVar.peekFully(xVar.getData(), 0, 10);
            xVar.setPosition(0);
            if (xVar.readUnsignedInt24() != 4801587) {
                break;
            }
            xVar.skipBytes(3);
            int synchSafeInt = xVar.readSynchSafeInt();
            i10 += synchSafeInt + 10;
            iVar.advancePeekPosition(synchSafeInt);
        }
        iVar.resetPeekPosition();
        iVar.advancePeekPosition(i10);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            iVar.peekFully(xVar.getData(), 0, 7);
            xVar.setPosition(0);
            int unsignedShort = xVar.readUnsignedShort();
            if (unsignedShort == 44096 || unsignedShort == 44097) {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int ac4SyncframeSize = io.odeeo.internal.d.c.parseAc4SyncframeSize(xVar.getData(), unsignedShort);
                if (ac4SyncframeSize == -1) {
                    return false;
                }
                iVar.advancePeekPosition(ac4SyncframeSize - 7);
            } else {
                iVar.resetPeekPosition();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                iVar.advancePeekPosition(i12);
                i11 = 0;
            }
        }
    }

    @Override // io.odeeo.internal.g.h
    public void release() {
    }
}
