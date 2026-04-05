package tn;

import ao.n1;
import io.bidmachine.media3.common.DrmInitData;
import io.bidmachine.media3.common.util.m0;
import java.io.IOException;
import java.util.Map;
import ko.d1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class s extends n1 {
    public final Map H;
    public DrmInitData I;

    public s(go.c cVar, sn.v vVar, sn.q qVar, Map map) {
        super(cVar, vVar, qVar);
        this.H = map;
    }

    @Override // ao.n1, ko.e1
    public /* bridge */ /* synthetic */ void durationUs(long j10) {
        super.durationUs(j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    @Override // ao.n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public io.bidmachine.media3.common.b getAdjustedUpstreamFormat(io.bidmachine.media3.common.b r10) {
        /*
            r9 = this;
            io.bidmachine.media3.common.DrmInitData r0 = r9.I
            if (r0 == 0) goto L5
            goto L7
        L5:
            io.bidmachine.media3.common.DrmInitData r0 = r10.f60669s
        L7:
            if (r0 == 0) goto L16
            java.util.Map r1 = r9.H
            java.lang.String r2 = r0.f60614e
            java.lang.Object r1 = r1.get(r2)
            io.bidmachine.media3.common.DrmInitData r1 = (io.bidmachine.media3.common.DrmInitData) r1
            if (r1 == 0) goto L16
            r0 = r1
        L16:
            gn.u0 r1 = r10.f60662l
            r2 = 0
            if (r1 != 0) goto L1d
        L1b:
            r1 = r2
            goto L62
        L1d:
            int r3 = r1.length()
            r4 = 0
            r5 = r4
        L23:
            r6 = -1
            if (r5 >= r3) goto L3e
            gn.t0 r7 = r1.get(r5)
            boolean r8 = r7 instanceof yo.m
            if (r8 == 0) goto L3b
            yo.m r7 = (yo.m) r7
            java.lang.String r8 = "com.apple.streaming.transportStreamTimestamp"
            java.lang.String r7 = r7.f94746b
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L3b
            goto L3f
        L3b:
            int r5 = r5 + 1
            goto L23
        L3e:
            r5 = r6
        L3f:
            if (r5 != r6) goto L42
            goto L62
        L42:
            r6 = 1
            if (r3 != r6) goto L46
            goto L1b
        L46:
            int r2 = r3 + (-1)
            gn.t0[] r2 = new gn.t0[r2]
        L4a:
            if (r4 >= r3) goto L5d
            if (r4 == r5) goto L5a
            if (r4 >= r5) goto L52
            r6 = r4
            goto L54
        L52:
            int r6 = r4 + (-1)
        L54:
            gn.t0 r7 = r1.get(r4)
            r2[r6] = r7
        L5a:
            int r4 = r4 + 1
            goto L4a
        L5d:
            gn.u0 r1 = new gn.u0
            r1.<init>(r2)
        L62:
            io.bidmachine.media3.common.DrmInitData r2 = r10.f60669s
            if (r0 != r2) goto L6a
            gn.u0 r2 = r10.f60662l
            if (r1 == r2) goto L7a
        L6a:
            gn.w r10 = r10.buildUpon()
            gn.w r10 = r10.setDrmInitData(r0)
            gn.w r10 = r10.setMetadata(r1)
            io.bidmachine.media3.common.b r10 = r10.build()
        L7a:
            io.bidmachine.media3.common.b r10 = super.getAdjustedUpstreamFormat(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: tn.s.getAdjustedUpstreamFormat(io.bidmachine.media3.common.b):io.bidmachine.media3.common.b");
    }

    @Override // ao.n1, ko.e1
    public /* bridge */ /* synthetic */ int sampleData(gn.o oVar, int i10, boolean z10) throws IOException {
        return super.sampleData(oVar, i10, z10);
    }

    @Override // ao.n1, ko.e1
    public void sampleMetadata(long j10, int i10, int i11, int i12, d1 d1Var) {
        super.sampleMetadata(j10, i10, i11, i12, d1Var);
    }

    public void setDrmInitData(DrmInitData drmInitData) {
        this.I = drmInitData;
        this.f7762z = true;
    }

    public void setSourceChunk(j jVar) {
        sourceId(jVar.f87218k);
    }

    @Override // ao.n1, ko.e1
    public /* bridge */ /* synthetic */ void sampleData(m0 m0Var, int i10) {
        super.sampleData(m0Var, i10);
    }
}
