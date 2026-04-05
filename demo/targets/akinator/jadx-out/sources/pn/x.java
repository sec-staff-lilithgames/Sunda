package pn;

import android.os.Handler;
import ao.n1;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import gn.u0;
import gn.z0;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.common.util.m0;
import io.bidmachine.media3.exoplayer.r0;
import java.io.IOException;
import java.util.Map;
import ko.d1;
import ko.e1;
import pn.v;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class x implements e1 {

    /* renamed from: a, reason: collision with root package name */
    public final n1 f81589a;

    /* renamed from: b, reason: collision with root package name */
    public final r0 f81590b = new r0();

    /* renamed from: c, reason: collision with root package name */
    public final to.b f81591c = new to.b();

    /* renamed from: d, reason: collision with root package name */
    public long f81592d = C.TIME_UNSET;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v f81593e;

    public x(v vVar, go.c cVar) {
        this.f81593e = vVar;
        this.f81589a = n1.createWithoutDrm(cVar);
    }

    @Override // ko.e1
    public /* bridge */ /* synthetic */ void durationUs(long j10) {
        super.durationUs(j10);
    }

    @Override // ko.e1
    public void format(io.bidmachine.media3.common.b bVar) {
        this.f81589a.format(bVar);
    }

    public boolean maybeRefreshManifestBeforeLoadingNextChunk(long j10) {
        boolean z10;
        v vVar = this.f81593e;
        w wVar = vVar.f81579c;
        qn.c cVar = vVar.f81583h;
        if (!cVar.f83308d) {
            return false;
        }
        if (vVar.f81585j) {
            return true;
        }
        Map.Entry entryCeilingEntry = vVar.f81582g.ceilingEntry(Long.valueOf(cVar.f83312h));
        if (entryCeilingEntry == null || ((Long) entryCeilingEntry.getValue()).longValue() >= j10) {
            z10 = false;
        } else {
            ((j) wVar).onDashManifestPublishTimeExpired(((Long) entryCeilingEntry.getKey()).longValue());
            z10 = true;
        }
        if (z10 && vVar.f81584i) {
            vVar.f81585j = true;
            vVar.f81584i = false;
            ((j) wVar).onDashManifestRefreshRequested();
        }
        return z10;
    }

    public void onChunkLoadCompleted(co.e eVar) {
        long j10 = this.f81592d;
        if (j10 == C.TIME_UNSET || eVar.f12424h > j10) {
            this.f81592d = eVar.f12424h;
        }
        this.f81593e.f81584i = true;
    }

    public boolean onChunkLoadError(co.e eVar) {
        long j10 = this.f81592d;
        boolean z10 = j10 != C.TIME_UNSET && j10 < eVar.f12423g;
        v vVar = this.f81593e;
        if (vVar.f81583h.f83308d) {
            if (!vVar.f81585j) {
                if (z10) {
                    if (vVar.f81584i) {
                        vVar.f81585j = true;
                        vVar.f81584i = false;
                        ((j) vVar.f81579c).onDashManifestRefreshRequested();
                        return true;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public void release() {
        this.f81589a.release();
    }

    @Override // ko.e1
    public /* bridge */ /* synthetic */ int sampleData(gn.o oVar, int i10, boolean z10) throws IOException {
        return super.sampleData(oVar, i10, z10);
    }

    @Override // ko.e1
    public void sampleMetadata(long j10, int i10, int i11, int i12, d1 d1Var) {
        long xsDateTime;
        this.f81589a.sampleMetadata(j10, i10, i11, i12, d1Var);
        while (true) {
            n1 n1Var = this.f81589a;
            if (!n1Var.isReady(false)) {
                n1Var.discardToRead();
                return;
            }
            to.b bVar = this.f81591c;
            bVar.clear();
            if (n1Var.read(this.f81590b, bVar, 0, false) == -4) {
                bVar.flip();
            } else {
                bVar = null;
            }
            if (bVar != null) {
                long j11 = bVar.f77082h;
                v vVar = this.f81593e;
                u0 u0VarDecode = vVar.f81580e.decode(bVar);
                if (u0VarDecode != null) {
                    vo.a aVar = (vo.a) u0VarDecode.get(0);
                    String str = aVar.f89501a;
                    String str2 = aVar.f89502b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            xsDateTime = a1.parseXsDateTime(a1.fromUtf8Bytes(aVar.f89505e));
                        } catch (z0 unused) {
                            xsDateTime = -9223372036854775807L;
                        }
                        if (xsDateTime != C.TIME_UNSET) {
                            v.a aVar2 = new v.a(j11, xsDateTime);
                            Handler handler = vVar.f81581f;
                            handler.sendMessage(handler.obtainMessage(1, aVar2));
                        }
                    }
                }
            }
        }
    }

    @Override // ko.e1
    public /* bridge */ /* synthetic */ void sampleData(m0 m0Var, int i10) {
        super.sampleData(m0Var, i10);
    }

    @Override // ko.e1
    public int sampleData(gn.o oVar, int i10, boolean z10, int i11) throws IOException {
        return this.f81589a.sampleData(oVar, i10, z10);
    }

    @Override // ko.e1
    public void sampleData(m0 m0Var, int i10, int i11) {
        this.f81589a.sampleData(m0Var, i10);
    }
}
