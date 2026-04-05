package ao;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import nh.p8;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class v0 implements i0, h0 {

    /* renamed from: b, reason: collision with root package name */
    public final i0[] f7838b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f7839c;

    /* renamed from: f, reason: collision with root package name */
    public final l f7841f;

    /* renamed from: i, reason: collision with root package name */
    public h0 f7844i;

    /* renamed from: j, reason: collision with root package name */
    public b2 f7845j;

    /* renamed from: l, reason: collision with root package name */
    public q1 f7847l;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f7842g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f7843h = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final IdentityHashMap f7840e = new IdentityHashMap();

    /* renamed from: k, reason: collision with root package name */
    public i0[] f7846k = new i0[0];

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements fo.l {

        /* renamed from: a, reason: collision with root package name */
        public final fo.l f7848a;

        /* renamed from: b, reason: collision with root package name */
        public final gn.v1 f7849b;

        public a(fo.l lVar, gn.v1 v1Var) {
            this.f7848a = lVar;
            this.f7849b = v1Var;
        }

        @Override // fo.l
        public void disable() {
            this.f7848a.disable();
        }

        @Override // fo.l
        public void enable() {
            this.f7848a.enable();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f7848a.equals(aVar.f7848a) && this.f7849b.equals(aVar.f7849b);
        }

        @Override // fo.l
        public int evaluateQueueSize(long j10, List<? extends co.p> list) {
            return this.f7848a.evaluateQueueSize(j10, list);
        }

        @Override // fo.l
        public boolean excludeTrack(int i10, long j10) {
            return this.f7848a.excludeTrack(i10, j10);
        }

        @Override // fo.l, fo.p
        public io.bidmachine.media3.common.b getFormat(int i10) {
            return this.f7849b.getFormat(this.f7848a.getIndexInTrackGroup(i10));
        }

        @Override // fo.l, fo.p
        public int getIndexInTrackGroup(int i10) {
            return this.f7848a.getIndexInTrackGroup(i10);
        }

        @Override // fo.l
        public long getLatestBitrateEstimate() {
            return this.f7848a.getLatestBitrateEstimate();
        }

        @Override // fo.l
        public io.bidmachine.media3.common.b getSelectedFormat() {
            return this.f7849b.getFormat(this.f7848a.getSelectedIndexInTrackGroup());
        }

        @Override // fo.l
        public int getSelectedIndex() {
            return this.f7848a.getSelectedIndex();
        }

        @Override // fo.l
        public int getSelectedIndexInTrackGroup() {
            return this.f7848a.getSelectedIndexInTrackGroup();
        }

        @Override // fo.l
        public Object getSelectionData() {
            return this.f7848a.getSelectionData();
        }

        @Override // fo.l
        public int getSelectionReason() {
            return this.f7848a.getSelectionReason();
        }

        @Override // fo.l, fo.p
        public gn.v1 getTrackGroup() {
            return this.f7849b;
        }

        @Override // fo.l, fo.p
        public int getType() {
            return this.f7848a.getType();
        }

        public int hashCode() {
            return this.f7848a.hashCode() + ((this.f7849b.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
        }

        @Override // fo.l, fo.p
        public int indexOf(io.bidmachine.media3.common.b bVar) {
            return this.f7848a.indexOf(this.f7849b.indexOf(bVar));
        }

        @Override // fo.l
        public boolean isTrackExcluded(int i10, long j10) {
            return this.f7848a.isTrackExcluded(i10, j10);
        }

        @Override // fo.l, fo.p
        public int length() {
            return this.f7848a.length();
        }

        @Override // fo.l
        public void onDiscontinuity() {
            this.f7848a.onDiscontinuity();
        }

        @Override // fo.l
        public void onPlayWhenReadyChanged(boolean z10) {
            this.f7848a.onPlayWhenReadyChanged(z10);
        }

        @Override // fo.l
        public void onPlaybackSpeed(float f10) {
            this.f7848a.onPlaybackSpeed(f10);
        }

        @Override // fo.l
        public void onRebuffer() {
            this.f7848a.onRebuffer();
        }

        @Override // fo.l
        public boolean shouldCancelChunkLoad(long j10, co.e eVar, List<? extends co.p> list) {
            return this.f7848a.shouldCancelChunkLoad(j10, eVar, list);
        }

        @Override // fo.l
        public void updateSelectedTrack(long j10, long j11, long j12, List<? extends co.p> list, co.r[] rVarArr) {
            this.f7848a.updateSelectedTrack(j10, j11, j12, list, rVarArr);
        }

        @Override // fo.l, fo.p
        public int indexOf(int i10) {
            return this.f7848a.indexOf(i10);
        }
    }

    public v0(l lVar, long[] jArr, i0... i0VarArr) {
        this.f7841f = lVar;
        this.f7838b = i0VarArr;
        this.f7847l = lVar.empty();
        this.f7839c = new boolean[i0VarArr.length];
        for (int i10 = 0; i10 < i0VarArr.length; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                this.f7839c[i10] = true;
                this.f7838b[i10] = new z1(i0VarArr[i10], j10);
            }
        }
    }

    @Override // ao.i0, ao.q1
    public boolean continueLoading(io.bidmachine.media3.exoplayer.w0 w0Var) {
        ArrayList arrayList = this.f7842g;
        if (arrayList.isEmpty()) {
            return this.f7847l.continueLoading(w0Var);
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((i0) arrayList.get(i10)).continueLoading(w0Var);
        }
        return false;
    }

    @Override // ao.i0
    public void discardBuffer(long j10, boolean z10) {
        for (i0 i0Var : this.f7846k) {
            i0Var.discardBuffer(j10, z10);
        }
    }

    @Override // ao.i0
    public long getAdjustedSeekPositionUs(long j10, io.bidmachine.media3.exoplayer.y1 y1Var) {
        i0[] i0VarArr = this.f7846k;
        return (i0VarArr.length > 0 ? i0VarArr[0] : this.f7838b[0]).getAdjustedSeekPositionUs(j10, y1Var);
    }

    @Override // ao.i0, ao.q1
    public long getBufferedPositionUs() {
        return this.f7847l.getBufferedPositionUs();
    }

    public i0 getChildPeriod(int i10) {
        boolean z10 = this.f7839c[i10];
        i0[] i0VarArr = this.f7838b;
        return z10 ? ((z1) i0VarArr[i10]).getWrappedMediaPeriod() : i0VarArr[i10];
    }

    @Override // ao.i0, ao.q1
    public long getNextLoadPositionUs() {
        return this.f7847l.getNextLoadPositionUs();
    }

    @Override // ao.i0
    public /* bridge */ /* synthetic */ List getStreamKeys(List list) {
        return super.getStreamKeys(list);
    }

    @Override // ao.i0
    public b2 getTrackGroups() {
        return (b2) io.bidmachine.media3.common.util.a.checkNotNull(this.f7845j);
    }

    @Override // ao.i0, ao.q1
    public boolean isLoading() {
        return this.f7847l.isLoading();
    }

    @Override // ao.i0
    public void maybeThrowPrepareError() throws IOException {
        for (i0 i0Var : this.f7838b) {
            i0Var.maybeThrowPrepareError();
        }
    }

    @Override // ao.h0
    public void onPrepared(i0 i0Var) {
        ArrayList arrayList = this.f7842g;
        arrayList.remove(i0Var);
        if (arrayList.isEmpty()) {
            i0[] i0VarArr = this.f7838b;
            int i10 = 0;
            for (i0 i0Var2 : i0VarArr) {
                i10 += i0Var2.getTrackGroups().f7552a;
            }
            gn.v1[] v1VarArr = new gn.v1[i10];
            int i11 = 0;
            for (int i12 = 0; i12 < i0VarArr.length; i12++) {
                b2 trackGroups = i0VarArr[i12].getTrackGroups();
                int i13 = trackGroups.f7552a;
                int i14 = 0;
                while (i14 < i13) {
                    gn.v1 v1Var = trackGroups.get(i14);
                    io.bidmachine.media3.common.b[] bVarArr = new io.bidmachine.media3.common.b[v1Var.f58205a];
                    for (int i15 = 0; i15 < v1Var.f58205a; i15++) {
                        io.bidmachine.media3.common.b format = v1Var.getFormat(i15);
                        gn.w wVarBuildUpon = format.buildUpon();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(i12);
                        sb2.append(":");
                        String str = format.f60651a;
                        if (str == null) {
                            str = "";
                        }
                        sb2.append(str);
                        bVarArr[i15] = wVarBuildUpon.setId(sb2.toString()).build();
                    }
                    gn.v1 v1Var2 = new gn.v1(i12 + ":" + v1Var.f58206b, bVarArr);
                    this.f7843h.put(v1Var2, v1Var);
                    v1VarArr[i11] = v1Var2;
                    i14++;
                    i11++;
                }
            }
            this.f7845j = new b2(v1VarArr);
            ((h0) io.bidmachine.media3.common.util.a.checkNotNull(this.f7844i)).onPrepared(this);
        }
    }

    @Override // ao.i0
    public void prepare(h0 h0Var, long j10) {
        this.f7844i = h0Var;
        ArrayList arrayList = this.f7842g;
        i0[] i0VarArr = this.f7838b;
        Collections.addAll(arrayList, i0VarArr);
        for (i0 i0Var : i0VarArr) {
            i0Var.prepare(this, j10);
        }
    }

    @Override // ao.i0
    public long readDiscontinuity() {
        long j10 = -9223372036854775807L;
        for (i0 i0Var : this.f7846k) {
            long discontinuity = i0Var.readDiscontinuity();
            if (discontinuity == C.TIME_UNSET) {
                if (j10 != C.TIME_UNSET && i0Var.seekToUs(j10) != j10) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j10 == C.TIME_UNSET) {
                for (i0 i0Var2 : this.f7846k) {
                    if (i0Var2 == i0Var) {
                        break;
                    }
                    if (i0Var2.seekToUs(discontinuity) != discontinuity) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j10 = discontinuity;
            } else if (discontinuity != j10) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j10;
    }

    @Override // ao.i0, ao.q1
    public void reevaluateBuffer(long j10) {
        this.f7847l.reevaluateBuffer(j10);
    }

    @Override // ao.i0
    public long seekToUs(long j10) {
        long jSeekToUs = this.f7846k[0].seekToUs(j10);
        int i10 = 1;
        while (true) {
            i0[] i0VarArr = this.f7846k;
            if (i10 >= i0VarArr.length) {
                return jSeekToUs;
            }
            if (i0VarArr[i10].seekToUs(jSeekToUs) != jSeekToUs) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i10++;
        }
    }

    @Override // ao.i0
    public long selectTracks(fo.l[] lVarArr, boolean[] zArr, o1[] o1VarArr, boolean[] zArr2, long j10) {
        IdentityHashMap identityHashMap;
        int[] iArr;
        int[] iArr2 = new int[lVarArr.length];
        int[] iArr3 = new int[lVarArr.length];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int length = lVarArr.length;
            identityHashMap = this.f7840e;
            if (i11 >= length) {
                break;
            }
            o1 o1Var = o1VarArr[i11];
            Integer num = o1Var == null ? null : (Integer) identityHashMap.get(o1Var);
            iArr2[i11] = num == null ? -1 : num.intValue();
            fo.l lVar = lVarArr[i11];
            if (lVar != null) {
                String str = lVar.getTrackGroup().f58206b;
                iArr3[i11] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr3[i11] = -1;
            }
            i11++;
        }
        identityHashMap.clear();
        int length2 = lVarArr.length;
        o1[] o1VarArr2 = new o1[length2];
        o1[] o1VarArr3 = new o1[lVarArr.length];
        fo.l[] lVarArr2 = new fo.l[lVarArr.length];
        i0[] i0VarArr = this.f7838b;
        ArrayList arrayList = new ArrayList(i0VarArr.length);
        long j11 = j10;
        int i12 = 0;
        while (i12 < i0VarArr.length) {
            int i13 = i10;
            while (i13 < lVarArr.length) {
                o1VarArr3[i13] = iArr2[i13] == i12 ? o1VarArr[i13] : null;
                if (iArr3[i13] == i12) {
                    fo.l lVar2 = (fo.l) io.bidmachine.media3.common.util.a.checkNotNull(lVarArr[i13]);
                    iArr = iArr2;
                    lVarArr2[i13] = new a(lVar2, (gn.v1) io.bidmachine.media3.common.util.a.checkNotNull((gn.v1) this.f7843h.get(lVar2.getTrackGroup())));
                } else {
                    iArr = iArr2;
                    lVarArr2[i13] = null;
                }
                i13++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr2;
            i0[] i0VarArr2 = i0VarArr;
            int i14 = i12;
            long jSelectTracks = i0VarArr2[i12].selectTracks(lVarArr2, zArr, o1VarArr3, zArr2, j11);
            if (i14 == 0) {
                j11 = jSelectTracks;
            } else if (jSelectTracks != j11) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i15 = 0; i15 < lVarArr.length; i15++) {
                if (iArr3[i15] == i14) {
                    o1 o1Var2 = (o1) io.bidmachine.media3.common.util.a.checkNotNull(o1VarArr3[i15]);
                    o1VarArr2[i15] = o1VarArr3[i15];
                    identityHashMap.put(o1Var2, Integer.valueOf(i14));
                    z10 = true;
                } else if (iArr4[i15] == i14) {
                    io.bidmachine.media3.common.util.a.checkState(o1VarArr3[i15] == null);
                }
            }
            if (z10) {
                arrayList.add(i0VarArr2[i14]);
            }
            i12 = i14 + 1;
            i0VarArr = i0VarArr2;
            iArr2 = iArr4;
            i10 = 0;
        }
        int i16 = i10;
        System.arraycopy(o1VarArr2, i16, o1VarArr, i16, length2);
        this.f7846k = (i0[]) arrayList.toArray(new i0[i16]);
        this.f7847l = this.f7841f.create(arrayList, p8.transform(arrayList, new c(1)));
        return j11;
    }

    @Override // ao.h0, ao.p1
    public void onContinueLoadingRequested(i0 i0Var) {
        ((h0) io.bidmachine.media3.common.util.a.checkNotNull(this.f7844i)).onContinueLoadingRequested(this);
    }
}
