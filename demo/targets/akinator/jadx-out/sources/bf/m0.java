package bf;

import com.google.android.exoplayer2.e3;
import com.google.android.exoplayer2.offline.StreamKey;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class m0 implements a0, z {

    /* renamed from: b, reason: collision with root package name */
    public final a0[] f9313b;

    /* renamed from: e, reason: collision with root package name */
    public final k f9315e;

    /* renamed from: h, reason: collision with root package name */
    public z f9318h;

    /* renamed from: i, reason: collision with root package name */
    public n1 f9319i;

    /* renamed from: k, reason: collision with root package name */
    public d1 f9321k;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f9316f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f9317g = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final IdentityHashMap f9314c = new IdentityHashMap();

    /* renamed from: j, reason: collision with root package name */
    public a0[] f9320j = new a0[0];

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements pf.k {

        /* renamed from: a, reason: collision with root package name */
        public final pf.k f9322a;

        /* renamed from: b, reason: collision with root package name */
        public final m1 f9323b;

        public a(pf.k kVar, m1 m1Var) {
            this.f9322a = kVar;
            this.f9323b = m1Var;
        }

        @Override // pf.k
        public void disable() {
            this.f9322a.disable();
        }

        @Override // pf.k
        public void enable() {
            this.f9322a.enable();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f9322a.equals(aVar.f9322a) && this.f9323b.equals(aVar.f9323b);
        }

        @Override // pf.k
        public int evaluateQueueSize(long j10, List<? extends df.b> list) {
            return this.f9322a.evaluateQueueSize(j10, list);
        }

        @Override // pf.k
        public boolean excludeTrack(int i10, long j10) {
            return this.f9322a.excludeTrack(i10, j10);
        }

        @Override // pf.k, pf.o
        public com.google.android.exoplayer2.z0 getFormat(int i10) {
            return this.f9322a.getFormat(i10);
        }

        @Override // pf.k, pf.o
        public int getIndexInTrackGroup(int i10) {
            return this.f9322a.getIndexInTrackGroup(i10);
        }

        @Override // pf.k
        public long getLatestBitrateEstimate() {
            return this.f9322a.getLatestBitrateEstimate();
        }

        @Override // pf.k
        public com.google.android.exoplayer2.z0 getSelectedFormat() {
            return this.f9322a.getSelectedFormat();
        }

        @Override // pf.k
        public int getSelectedIndex() {
            return this.f9322a.getSelectedIndex();
        }

        @Override // pf.k
        public int getSelectedIndexInTrackGroup() {
            return this.f9322a.getSelectedIndexInTrackGroup();
        }

        @Override // pf.k
        public Object getSelectionData() {
            return this.f9322a.getSelectionData();
        }

        @Override // pf.k
        public int getSelectionReason() {
            return this.f9322a.getSelectionReason();
        }

        @Override // pf.k, pf.o
        public m1 getTrackGroup() {
            return this.f9323b;
        }

        @Override // pf.k, pf.o
        public int getType() {
            return this.f9322a.getType();
        }

        public int hashCode() {
            return this.f9322a.hashCode() + ((this.f9323b.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
        }

        @Override // pf.k, pf.o
        public int indexOf(com.google.android.exoplayer2.z0 z0Var) {
            return this.f9322a.indexOf(z0Var);
        }

        @Override // pf.k
        public boolean isTrackExcluded(int i10, long j10) {
            return this.f9322a.isTrackExcluded(i10, j10);
        }

        @Override // pf.k, pf.o
        public int length() {
            return this.f9322a.length();
        }

        @Override // pf.k
        public void onDiscontinuity() {
            this.f9322a.onDiscontinuity();
        }

        @Override // pf.k
        public void onPlayWhenReadyChanged(boolean z10) {
            this.f9322a.onPlayWhenReadyChanged(z10);
        }

        @Override // pf.k
        public void onPlaybackSpeed(float f10) {
            this.f9322a.onPlaybackSpeed(f10);
        }

        @Override // pf.k
        public void onRebuffer() {
            this.f9322a.onRebuffer();
        }

        @Override // pf.k
        public boolean shouldCancelChunkLoad(long j10, df.a aVar, List<? extends df.b> list) {
            return this.f9322a.shouldCancelChunkLoad(j10, aVar, list);
        }

        @Override // pf.k
        public void updateSelectedTrack(long j10, long j11, long j12, List<? extends df.b> list, df.c[] cVarArr) {
            this.f9322a.updateSelectedTrack(j10, j11, j12, list, cVarArr);
        }

        @Override // pf.k, pf.o
        public int indexOf(int i10) {
            return this.f9322a.indexOf(i10);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements a0, z {

        /* renamed from: b, reason: collision with root package name */
        public final a0 f9324b;

        /* renamed from: c, reason: collision with root package name */
        public final long f9325c;

        /* renamed from: e, reason: collision with root package name */
        public z f9326e;

        public b(a0 a0Var, long j10) {
            this.f9324b = a0Var;
            this.f9325c = j10;
        }

        @Override // bf.a0, bf.d1
        public boolean continueLoading(long j10) {
            return this.f9324b.continueLoading(j10 - this.f9325c);
        }

        @Override // bf.a0
        public void discardBuffer(long j10, boolean z10) {
            this.f9324b.discardBuffer(j10 - this.f9325c, z10);
        }

        @Override // bf.a0
        public long getAdjustedSeekPositionUs(long j10, e3 e3Var) {
            long j11 = this.f9325c;
            return this.f9324b.getAdjustedSeekPositionUs(j10 - j11, e3Var) + j11;
        }

        @Override // bf.a0, bf.d1
        public long getBufferedPositionUs() {
            long bufferedPositionUs = this.f9324b.getBufferedPositionUs();
            if (bufferedPositionUs == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return bufferedPositionUs + this.f9325c;
        }

        @Override // bf.a0, bf.d1
        public long getNextLoadPositionUs() {
            long nextLoadPositionUs = this.f9324b.getNextLoadPositionUs();
            if (nextLoadPositionUs == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return nextLoadPositionUs + this.f9325c;
        }

        @Override // bf.a0
        public List<StreamKey> getStreamKeys(List<pf.k> list) {
            return this.f9324b.getStreamKeys(list);
        }

        @Override // bf.a0
        public n1 getTrackGroups() {
            return this.f9324b.getTrackGroups();
        }

        @Override // bf.a0, bf.d1
        public boolean isLoading() {
            return this.f9324b.isLoading();
        }

        @Override // bf.a0
        public void maybeThrowPrepareError() throws IOException {
            this.f9324b.maybeThrowPrepareError();
        }

        @Override // bf.z
        public void onPrepared(a0 a0Var) {
            ((z) com.google.android.exoplayer2.util.a.checkNotNull(this.f9326e)).onPrepared(this);
        }

        @Override // bf.a0
        public void prepare(z zVar, long j10) {
            this.f9326e = zVar;
            this.f9324b.prepare(this, j10 - this.f9325c);
        }

        @Override // bf.a0
        public long readDiscontinuity() {
            long discontinuity = this.f9324b.readDiscontinuity();
            return discontinuity == C.TIME_UNSET ? C.TIME_UNSET : discontinuity + this.f9325c;
        }

        @Override // bf.a0, bf.d1
        public void reevaluateBuffer(long j10) {
            this.f9324b.reevaluateBuffer(j10 - this.f9325c);
        }

        @Override // bf.a0
        public long seekToUs(long j10) {
            long j11 = this.f9325c;
            return this.f9324b.seekToUs(j10 - j11) + j11;
        }

        @Override // bf.a0
        public long selectTracks(pf.k[] kVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j10) {
            b1[] b1VarArr2 = new b1[b1VarArr.length];
            int i10 = 0;
            while (true) {
                b1 childStream = null;
                if (i10 >= b1VarArr.length) {
                    break;
                }
                c cVar = (c) b1VarArr[i10];
                if (cVar != null) {
                    childStream = cVar.getChildStream();
                }
                b1VarArr2[i10] = childStream;
                i10++;
            }
            a0 a0Var = this.f9324b;
            long j11 = this.f9325c;
            long jSelectTracks = a0Var.selectTracks(kVarArr, zArr, b1VarArr2, zArr2, j10 - j11);
            for (int i11 = 0; i11 < b1VarArr.length; i11++) {
                b1 b1Var = b1VarArr2[i11];
                if (b1Var == null) {
                    b1VarArr[i11] = null;
                } else {
                    b1 b1Var2 = b1VarArr[i11];
                    if (b1Var2 == null || ((c) b1Var2).getChildStream() != b1Var) {
                        b1VarArr[i11] = new c(b1Var, j11);
                    }
                }
            }
            return jSelectTracks + j11;
        }

        @Override // bf.z, bf.c1
        public void onContinueLoadingRequested(a0 a0Var) {
            ((z) com.google.android.exoplayer2.util.a.checkNotNull(this.f9326e)).onContinueLoadingRequested(this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c implements b1 {

        /* renamed from: a, reason: collision with root package name */
        public final b1 f9327a;

        /* renamed from: b, reason: collision with root package name */
        public final long f9328b;

        public c(b1 b1Var, long j10) {
            this.f9327a = b1Var;
            this.f9328b = j10;
        }

        public b1 getChildStream() {
            return this.f9327a;
        }

        @Override // bf.b1
        public boolean isReady() {
            return this.f9327a.isReady();
        }

        @Override // bf.b1
        public void maybeThrowError() throws IOException {
            this.f9327a.maybeThrowError();
        }

        @Override // bf.b1
        public int readData(com.google.android.exoplayer2.a1 a1Var, ce.h hVar, int i10) {
            int data = this.f9327a.readData(a1Var, hVar, i10);
            if (data == -4) {
                hVar.f12239g = Math.max(0L, hVar.f12239g + this.f9328b);
            }
            return data;
        }

        @Override // bf.b1
        public int skipData(long j10) {
            return this.f9327a.skipData(j10 - this.f9328b);
        }
    }

    public m0(k kVar, long[] jArr, a0... a0VarArr) {
        this.f9315e = kVar;
        this.f9313b = a0VarArr;
        this.f9321k = kVar.createCompositeSequenceableLoader(new d1[0]);
        for (int i10 = 0; i10 < a0VarArr.length; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                this.f9313b[i10] = new b(a0VarArr[i10], j10);
            }
        }
    }

    @Override // bf.a0, bf.d1
    public boolean continueLoading(long j10) {
        ArrayList arrayList = this.f9316f;
        if (arrayList.isEmpty()) {
            return this.f9321k.continueLoading(j10);
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((a0) arrayList.get(i10)).continueLoading(j10);
        }
        return false;
    }

    @Override // bf.a0
    public void discardBuffer(long j10, boolean z10) {
        for (a0 a0Var : this.f9320j) {
            a0Var.discardBuffer(j10, z10);
        }
    }

    @Override // bf.a0
    public long getAdjustedSeekPositionUs(long j10, e3 e3Var) {
        a0[] a0VarArr = this.f9320j;
        return (a0VarArr.length > 0 ? a0VarArr[0] : this.f9313b[0]).getAdjustedSeekPositionUs(j10, e3Var);
    }

    @Override // bf.a0, bf.d1
    public long getBufferedPositionUs() {
        return this.f9321k.getBufferedPositionUs();
    }

    public a0 getChildPeriod(int i10) {
        a0 a0Var = this.f9313b[i10];
        return a0Var instanceof b ? ((b) a0Var).f9324b : a0Var;
    }

    @Override // bf.a0, bf.d1
    public long getNextLoadPositionUs() {
        return this.f9321k.getNextLoadPositionUs();
    }

    @Override // bf.a0
    public /* bridge */ /* synthetic */ List getStreamKeys(List list) {
        return super.getStreamKeys(list);
    }

    @Override // bf.a0
    public n1 getTrackGroups() {
        return (n1) com.google.android.exoplayer2.util.a.checkNotNull(this.f9319i);
    }

    @Override // bf.a0, bf.d1
    public boolean isLoading() {
        return this.f9321k.isLoading();
    }

    @Override // bf.a0
    public void maybeThrowPrepareError() throws IOException {
        for (a0 a0Var : this.f9313b) {
            a0Var.maybeThrowPrepareError();
        }
    }

    @Override // bf.z
    public void onPrepared(a0 a0Var) {
        ArrayList arrayList = this.f9316f;
        arrayList.remove(a0Var);
        if (arrayList.isEmpty()) {
            a0[] a0VarArr = this.f9313b;
            int i10 = 0;
            for (a0 a0Var2 : a0VarArr) {
                i10 += a0Var2.getTrackGroups().f9356b;
            }
            m1[] m1VarArr = new m1[i10];
            int i11 = 0;
            for (int i12 = 0; i12 < a0VarArr.length; i12++) {
                n1 trackGroups = a0VarArr[i12].getTrackGroups();
                int i13 = trackGroups.f9356b;
                int i14 = 0;
                while (i14 < i13) {
                    m1 m1Var = trackGroups.get(i14);
                    m1 m1VarCopyWithId = m1Var.copyWithId(i12 + ":" + m1Var.f9333c);
                    this.f9317g.put(m1VarCopyWithId, m1Var);
                    m1VarArr[i11] = m1VarCopyWithId;
                    i14++;
                    i11++;
                }
            }
            this.f9319i = new n1(m1VarArr);
            ((z) com.google.android.exoplayer2.util.a.checkNotNull(this.f9318h)).onPrepared(this);
        }
    }

    @Override // bf.a0
    public void prepare(z zVar, long j10) {
        this.f9318h = zVar;
        ArrayList arrayList = this.f9316f;
        a0[] a0VarArr = this.f9313b;
        Collections.addAll(arrayList, a0VarArr);
        for (a0 a0Var : a0VarArr) {
            a0Var.prepare(this, j10);
        }
    }

    @Override // bf.a0
    public long readDiscontinuity() {
        long j10 = -9223372036854775807L;
        for (a0 a0Var : this.f9320j) {
            long discontinuity = a0Var.readDiscontinuity();
            if (discontinuity == C.TIME_UNSET) {
                if (j10 != C.TIME_UNSET && a0Var.seekToUs(j10) != j10) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j10 == C.TIME_UNSET) {
                for (a0 a0Var2 : this.f9320j) {
                    if (a0Var2 == a0Var) {
                        break;
                    }
                    if (a0Var2.seekToUs(discontinuity) != discontinuity) {
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

    @Override // bf.a0, bf.d1
    public void reevaluateBuffer(long j10) {
        this.f9321k.reevaluateBuffer(j10);
    }

    @Override // bf.a0
    public long seekToUs(long j10) {
        long jSeekToUs = this.f9320j[0].seekToUs(j10);
        int i10 = 1;
        while (true) {
            a0[] a0VarArr = this.f9320j;
            if (i10 >= a0VarArr.length) {
                return jSeekToUs;
            }
            if (a0VarArr[i10].seekToUs(jSeekToUs) != jSeekToUs) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i10++;
        }
    }

    @Override // bf.a0
    public long selectTracks(pf.k[] kVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j10) {
        IdentityHashMap identityHashMap;
        int[] iArr;
        int[] iArr2 = new int[kVarArr.length];
        int[] iArr3 = new int[kVarArr.length];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int length = kVarArr.length;
            identityHashMap = this.f9314c;
            if (i11 >= length) {
                break;
            }
            b1 b1Var = b1VarArr[i11];
            Integer num = b1Var == null ? null : (Integer) identityHashMap.get(b1Var);
            iArr2[i11] = num == null ? -1 : num.intValue();
            pf.k kVar = kVarArr[i11];
            if (kVar != null) {
                String str = kVar.getTrackGroup().f9333c;
                iArr3[i11] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr3[i11] = -1;
            }
            i11++;
        }
        identityHashMap.clear();
        int length2 = kVarArr.length;
        b1[] b1VarArr2 = new b1[length2];
        b1[] b1VarArr3 = new b1[kVarArr.length];
        pf.k[] kVarArr2 = new pf.k[kVarArr.length];
        a0[] a0VarArr = this.f9313b;
        ArrayList arrayList = new ArrayList(a0VarArr.length);
        long j11 = j10;
        int i12 = 0;
        while (i12 < a0VarArr.length) {
            int i13 = i10;
            while (i13 < kVarArr.length) {
                b1VarArr3[i13] = iArr2[i13] == i12 ? b1VarArr[i13] : null;
                if (iArr3[i13] == i12) {
                    pf.k kVar2 = (pf.k) com.google.android.exoplayer2.util.a.checkNotNull(kVarArr[i13]);
                    iArr = iArr2;
                    kVarArr2[i13] = new a(kVar2, (m1) com.google.android.exoplayer2.util.a.checkNotNull((m1) this.f9317g.get(kVar2.getTrackGroup())));
                } else {
                    iArr = iArr2;
                    kVarArr2[i13] = null;
                }
                i13++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr2;
            a0[] a0VarArr2 = a0VarArr;
            int i14 = i12;
            long jSelectTracks = a0VarArr2[i12].selectTracks(kVarArr2, zArr, b1VarArr3, zArr2, j11);
            if (i14 == 0) {
                j11 = jSelectTracks;
            } else if (jSelectTracks != j11) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i15 = 0; i15 < kVarArr.length; i15++) {
                if (iArr3[i15] == i14) {
                    b1 b1Var2 = (b1) com.google.android.exoplayer2.util.a.checkNotNull(b1VarArr3[i15]);
                    b1VarArr2[i15] = b1VarArr3[i15];
                    identityHashMap.put(b1Var2, Integer.valueOf(i14));
                    z10 = true;
                } else if (iArr4[i15] == i14) {
                    com.google.android.exoplayer2.util.a.checkState(b1VarArr3[i15] == null);
                }
            }
            if (z10) {
                arrayList.add(a0VarArr2[i14]);
            }
            i12 = i14 + 1;
            a0VarArr = a0VarArr2;
            iArr2 = iArr4;
            i10 = 0;
        }
        int i16 = i10;
        System.arraycopy(b1VarArr2, i16, b1VarArr, i16, length2);
        a0[] a0VarArr3 = (a0[]) arrayList.toArray(new a0[i16]);
        this.f9320j = a0VarArr3;
        this.f9321k = this.f9315e.createCompositeSequenceableLoader(a0VarArr3);
        return j11;
    }

    @Override // bf.z, bf.c1
    public void onContinueLoadingRequested(a0 a0Var) {
        ((z) com.google.android.exoplayer2.util.a.checkNotNull(this.f9318h)).onContinueLoadingRequested(this);
    }
}
