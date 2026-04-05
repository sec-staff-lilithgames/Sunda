package co;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import gn.x0;
import io.bidmachine.media3.common.util.m0;
import java.io.IOException;
import ko.e1;
import ln.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class m extends a {

    /* renamed from: o, reason: collision with root package name */
    public final int f12457o;

    /* renamed from: p, reason: collision with root package name */
    public final long f12458p;

    /* renamed from: q, reason: collision with root package name */
    public final h f12459q;

    /* renamed from: r, reason: collision with root package name */
    public long f12460r;

    /* renamed from: s, reason: collision with root package name */
    public volatile boolean f12461s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f12462t;

    public m(ln.i iVar, ln.m mVar, io.bidmachine.media3.common.b bVar, int i10, Object obj, long j10, long j11, long j12, long j13, long j14, int i11, long j15, h hVar) {
        super(iVar, mVar, bVar, i10, obj, j10, j11, j12, j13, j14);
        this.f12457o = i11;
        this.f12458p = j15;
        this.f12459q = hVar;
    }

    public final void a(c cVar) {
        io.bidmachine.media3.common.b bVar = this.f12420d;
        if (x0.isImage(bVar.f60664n)) {
            int i10 = bVar.L;
            if ((i10 <= 1 && bVar.M <= 1) || i10 == -1 || bVar.M == -1) {
                return;
            }
            e1 e1VarTrack = cVar.track(0, 4);
            int i11 = bVar.L * bVar.M;
            long j10 = (this.f12424h - this.f12423g) / i11;
            for (int i12 = 1; i12 < i11; i12++) {
                e1VarTrack.sampleData(new m0(), 0);
                e1VarTrack.sampleMetadata(i12 * j10, 0, 0, 0, null);
            }
        }
    }

    @Override // co.a, co.p, co.e, go.x
    public final void cancelLoad() {
        this.f12461s = true;
    }

    @Override // co.p
    public long getNextChunkIndex() {
        return this.f12470j + this.f12457o;
    }

    public final long getNextLoadPosition() {
        return this.f12460r;
    }

    public final boolean isLoadCanceled() {
        return this.f12461s;
    }

    @Override // co.p
    public boolean isLoadCompleted() {
        return this.f12462t;
    }

    @Override // co.a, co.p, co.e, go.x
    public final void load() throws IOException {
        c cVar = (c) io.bidmachine.media3.common.util.a.checkStateNotNull(this.f12390m);
        if (this.f12460r == 0) {
            cVar.setSampleOffsetUs(this.f12458p);
            h hVar = this.f12459q;
            long j10 = this.f12388k;
            long j11 = C.TIME_UNSET;
            long j12 = j10 == C.TIME_UNSET ? -9223372036854775807L : j10 - this.f12458p;
            long j13 = this.f12389l;
            if (j13 != C.TIME_UNSET) {
                j11 = j13 - this.f12458p;
            }
            hVar.init(cVar, j12, j11);
        }
        try {
            ln.m mVarSubrange = this.f12418b.subrange(this.f12460r);
            e0 e0Var = this.f12425i;
            ko.s sVar = new ko.s(e0Var, mVarSubrange.f73472f, e0Var.open(mVarSubrange));
            do {
                try {
                    if (this.f12461s) {
                        break;
                    }
                } finally {
                    this.f12460r = sVar.getPosition() - this.f12418b.f73472f;
                }
            } while (this.f12459q.read(sVar));
            a(cVar);
            this.f12460r = sVar.getPosition() - this.f12418b.f73472f;
            ln.l.closeQuietly(this.f12425i);
            this.f12462t = !this.f12461s;
        } catch (Throwable th2) {
            ln.l.closeQuietly(this.f12425i);
            throw th2;
        }
    }
}
