package io.odeeo.internal.p;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.g.v;
import io.odeeo.internal.p.d0;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a implements io.odeeo.internal.g.h {

    /* renamed from: d, reason: collision with root package name */
    public static final io.odeeo.internal.g.l f65219d = new bt.a(10);

    /* renamed from: a, reason: collision with root package name */
    public final b f65220a = new b();

    /* renamed from: b, reason: collision with root package name */
    public final io.odeeo.internal.q0.x f65221b = new io.odeeo.internal.q0.x(2786);

    /* renamed from: c, reason: collision with root package name */
    public boolean f65222c;

    public static /* synthetic */ io.odeeo.internal.g.h[] a() {
        return new io.odeeo.internal.g.h[]{new a()};
    }

    @Override // io.odeeo.internal.g.h
    public void init(io.odeeo.internal.g.j jVar) {
        this.f65220a.createTracks(jVar, new d0.d(0, 1));
        jVar.endTracks();
        jVar.seekMap(new v.b(C.TIME_UNSET));
    }

    @Override // io.odeeo.internal.g.h
    public int read(io.odeeo.internal.g.i iVar, io.odeeo.internal.g.u uVar) throws IOException {
        int i10 = iVar.read(this.f65221b.getData(), 0, 2786);
        if (i10 == -1) {
            return -1;
        }
        this.f65221b.setPosition(0);
        this.f65221b.setLimit(i10);
        if (!this.f65222c) {
            this.f65220a.packetStarted(0L, 4);
            this.f65222c = true;
        }
        this.f65220a.consume(this.f65221b);
        return 0;
    }

    @Override // io.odeeo.internal.g.h
    public void seek(long j10, long j11) {
        this.f65222c = false;
        this.f65220a.seek();
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
            iVar.peekFully(xVar.getData(), 0, 6);
            xVar.setPosition(0);
            if (xVar.readUnsignedShort() != 2935) {
                iVar.resetPeekPosition();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                iVar.advancePeekPosition(i12);
                i11 = 0;
            } else {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int ac3SyncframeSize = io.odeeo.internal.d.b.parseAc3SyncframeSize(xVar.getData());
                if (ac3SyncframeSize == -1) {
                    return false;
                }
                iVar.advancePeekPosition(ac3SyncframeSize - 6);
            }
        }
    }

    @Override // io.odeeo.internal.g.h
    public void release() {
    }
}
