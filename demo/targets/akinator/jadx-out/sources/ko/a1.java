package ko;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.List;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a1 implements z {

    /* renamed from: a, reason: collision with root package name */
    public final int f71601a;

    /* renamed from: b, reason: collision with root package name */
    public final int f71602b;

    /* renamed from: c, reason: collision with root package name */
    public final String f71603c;

    /* renamed from: d, reason: collision with root package name */
    public int f71604d;

    /* renamed from: e, reason: collision with root package name */
    public int f71605e;

    /* renamed from: f, reason: collision with root package name */
    public c0 f71606f;

    /* renamed from: g, reason: collision with root package name */
    public e1 f71607g;

    public a1(int i10, int i11, String str) {
        this.f71601a = i10;
        this.f71602b = i11;
        this.f71603c = str;
    }

    @Override // ko.z
    public /* bridge */ /* synthetic */ List getSniffFailureDetails() {
        return super.getSniffFailureDetails();
    }

    @Override // ko.z
    @SideEffectFree
    public /* bridge */ /* synthetic */ z getUnderlyingImplementation() {
        return super.getUnderlyingImplementation();
    }

    @Override // ko.z
    public void init(c0 c0Var) {
        this.f71606f = c0Var;
        e1 e1VarTrack = c0Var.track(1024, 4);
        this.f71607g = e1VarTrack;
        gn.w wVar = new gn.w();
        String str = this.f71603c;
        e1VarTrack.format(wVar.setContainerMimeType(str).setSampleMimeType(str).build());
        this.f71606f.endTracks();
        this.f71606f.seekMap(new b1(C.TIME_UNSET));
        this.f71605e = 1;
    }

    @Override // ko.z
    public int read(a0 a0Var, v0 v0Var) throws IOException {
        int i10 = this.f71605e;
        if (i10 != 1) {
            if (i10 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        int iSampleData = ((e1) io.bidmachine.media3.common.util.a.checkNotNull(this.f71607g)).sampleData((gn.o) a0Var, 1024, true);
        if (iSampleData != -1) {
            this.f71604d += iSampleData;
            return 0;
        }
        this.f71605e = 2;
        this.f71607g.sampleMetadata(0L, 1, this.f71604d, 0, null);
        this.f71604d = 0;
        return 0;
    }

    @Override // ko.z
    public void seek(long j10, long j11) {
        if (j10 == 0 || this.f71605e == 1) {
            this.f71605e = 1;
            this.f71604d = 0;
        }
    }

    @Override // ko.z
    public boolean sniff(a0 a0Var) throws IOException {
        int i10 = this.f71602b;
        int i11 = this.f71601a;
        io.bidmachine.media3.common.util.a.checkState((i11 == -1 || i10 == -1) ? false : true);
        io.bidmachine.media3.common.util.m0 m0Var = new io.bidmachine.media3.common.util.m0(i10);
        a0Var.peekFully(m0Var.getData(), 0, i10);
        return m0Var.readUnsignedShort() == i11;
    }

    @Override // ko.z
    public void release() {
    }
}
