package oe;

import com.google.android.exoplayer2.util.v0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a implements ee.p {

    /* renamed from: a, reason: collision with root package name */
    public final b f78970a = new b();

    /* renamed from: b, reason: collision with root package name */
    public final v0 f78971b = new v0(2786);

    /* renamed from: c, reason: collision with root package name */
    public boolean f78972c;

    @Override // ee.p
    public void init(ee.s sVar) {
        this.f78970a.createTracks(sVar, new i0(0, 1));
        sVar.endTracks();
        sVar.seekMap(new ee.h0(C.TIME_UNSET));
    }

    @Override // ee.p
    public int read(ee.q qVar, ee.f0 f0Var) throws IOException {
        v0 v0Var = this.f78971b;
        int i10 = qVar.read(v0Var.getData(), 0, 2786);
        if (i10 == -1) {
            return -1;
        }
        v0Var.setPosition(0);
        v0Var.setLimit(i10);
        boolean z10 = this.f78972c;
        b bVar = this.f78970a;
        if (!z10) {
            bVar.packetStarted(0L, 4);
            this.f78972c = true;
        }
        bVar.consume(v0Var);
        return 0;
    }

    @Override // ee.p
    public void seek(long j10, long j11) {
        this.f78972c = false;
        this.f78970a.seek();
    }

    @Override // ee.p
    public boolean sniff(ee.q qVar) throws IOException {
        v0 v0Var = new v0(10);
        int i10 = 0;
        while (true) {
            qVar.peekFully(v0Var.getData(), 0, 10);
            v0Var.setPosition(0);
            if (v0Var.readUnsignedInt24() != 4801587) {
                break;
            }
            v0Var.skipBytes(3);
            int synchSafeInt = v0Var.readSynchSafeInt();
            i10 += synchSafeInt + 10;
            qVar.advancePeekPosition(synchSafeInt);
        }
        qVar.resetPeekPosition();
        qVar.advancePeekPosition(i10);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            qVar.peekFully(v0Var.getData(), 0, 6);
            v0Var.setPosition(0);
            if (v0Var.readUnsignedShort() != 2935) {
                qVar.resetPeekPosition();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                qVar.advancePeekPosition(i12);
                i11 = 0;
            } else {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int ac3SyncframeSize = com.google.android.exoplayer2.audio.d.parseAc3SyncframeSize(v0Var.getData());
                if (ac3SyncframeSize == -1) {
                    return false;
                }
                qVar.advancePeekPosition(ac3SyncframeSize - 6);
            }
        }
    }

    @Override // ee.p
    public void release() {
    }
}
