package rp;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.List;
import ko.v0;
import ko.x0;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c implements ko.z {

    /* renamed from: a, reason: collision with root package name */
    public final d f84551a = new d("audio/ac4");

    /* renamed from: b, reason: collision with root package name */
    public final io.bidmachine.media3.common.util.m0 f84552b = new io.bidmachine.media3.common.util.m0(16384);

    /* renamed from: c, reason: collision with root package name */
    public boolean f84553c;

    @Override // ko.z
    public /* bridge */ /* synthetic */ List getSniffFailureDetails() {
        return super.getSniffFailureDetails();
    }

    @Override // ko.z
    @SideEffectFree
    public /* bridge */ /* synthetic */ ko.z getUnderlyingImplementation() {
        return super.getUnderlyingImplementation();
    }

    @Override // ko.z
    public void init(ko.c0 c0Var) {
        this.f84551a.createTracks(c0Var, new m0(0, 1));
        c0Var.endTracks();
        c0Var.seekMap(new x0(C.TIME_UNSET));
    }

    @Override // ko.z
    public int read(ko.a0 a0Var, v0 v0Var) throws IOException {
        io.bidmachine.media3.common.util.m0 m0Var = this.f84552b;
        int i10 = a0Var.read(m0Var.getData(), 0, 16384);
        if (i10 == -1) {
            return -1;
        }
        m0Var.setPosition(0);
        m0Var.setLimit(i10);
        boolean z10 = this.f84553c;
        d dVar = this.f84551a;
        if (!z10) {
            dVar.packetStarted(0L, 4);
            this.f84553c = true;
        }
        dVar.consume(m0Var);
        return 0;
    }

    @Override // ko.z
    public void seek(long j10, long j11) {
        this.f84553c = false;
        this.f84551a.seek();
    }

    @Override // ko.z
    public boolean sniff(ko.a0 a0Var) throws IOException {
        io.bidmachine.media3.common.util.m0 m0Var = new io.bidmachine.media3.common.util.m0(10);
        int i10 = 0;
        while (true) {
            a0Var.peekFully(m0Var.getData(), 0, 10);
            m0Var.setPosition(0);
            if (m0Var.readUnsignedInt24() != 4801587) {
                break;
            }
            m0Var.skipBytes(3);
            int synchSafeInt = m0Var.readSynchSafeInt();
            i10 += synchSafeInt + 10;
            a0Var.advancePeekPosition(synchSafeInt);
        }
        a0Var.resetPeekPosition();
        a0Var.advancePeekPosition(i10);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            a0Var.peekFully(m0Var.getData(), 0, 7);
            m0Var.setPosition(0);
            int unsignedShort = m0Var.readUnsignedShort();
            if (unsignedShort == 44096 || unsignedShort == 44097) {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int ac4SyncframeSize = ko.g.parseAc4SyncframeSize(m0Var.getData(), unsignedShort);
                if (ac4SyncframeSize == -1) {
                    return false;
                }
                a0Var.advancePeekPosition(ac4SyncframeSize - 7);
            } else {
                a0Var.resetPeekPosition();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                a0Var.advancePeekPosition(i12);
                i11 = 0;
            }
        }
    }

    @Override // ko.z
    public void release() {
    }
}
