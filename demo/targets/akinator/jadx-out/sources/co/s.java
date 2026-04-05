package co;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import ko.e1;
import ln.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class s extends a {

    /* renamed from: o, reason: collision with root package name */
    public final int f12472o;

    /* renamed from: p, reason: collision with root package name */
    public final io.bidmachine.media3.common.b f12473p;

    /* renamed from: q, reason: collision with root package name */
    public long f12474q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f12475r;

    public s(ln.i iVar, ln.m mVar, io.bidmachine.media3.common.b bVar, int i10, Object obj, long j10, long j11, long j12, int i11, io.bidmachine.media3.common.b bVar2) {
        super(iVar, mVar, bVar, i10, obj, j10, j11, C.TIME_UNSET, C.TIME_UNSET, j12);
        this.f12472o = i11;
        this.f12473p = bVar2;
    }

    @Override // co.p
    public boolean isLoadCompleted() {
        return this.f12475r;
    }

    @Override // co.a, co.p, co.e, go.x
    public void load() throws IOException {
        e0 e0Var = this.f12425i;
        c cVar = (c) io.bidmachine.media3.common.util.a.checkStateNotNull(this.f12390m);
        cVar.setSampleOffsetUs(0L);
        e1 e1VarTrack = cVar.track(0, this.f12472o);
        e1VarTrack.format(this.f12473p);
        try {
            long jOpen = e0Var.open(this.f12418b.subrange(this.f12474q));
            if (jOpen != -1) {
                jOpen += this.f12474q;
            }
            ko.s sVar = new ko.s(this.f12425i, this.f12474q, jOpen);
            for (int iSampleData = 0; iSampleData != -1; iSampleData = e1VarTrack.sampleData((gn.o) sVar, Integer.MAX_VALUE, true)) {
                this.f12474q += iSampleData;
            }
            e1VarTrack.sampleMetadata(this.f12423g, 1, (int) this.f12474q, 0, null);
            ln.l.closeQuietly(e0Var);
            this.f12475r = true;
        } catch (Throwable th2) {
            ln.l.closeQuietly(e0Var);
            throw th2;
        }
    }

    @Override // co.a, co.p, co.e, go.x
    public void cancelLoad() {
    }
}
