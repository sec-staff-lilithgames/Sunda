package pf;

import android.os.SystemClock;
import bf.m1;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.z0;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class b implements k {

    /* renamed from: a, reason: collision with root package name */
    public final m1 f81022a;

    /* renamed from: b, reason: collision with root package name */
    public final int f81023b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f81024c;

    /* renamed from: d, reason: collision with root package name */
    public final int f81025d;

    /* renamed from: e, reason: collision with root package name */
    public final z0[] f81026e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f81027f;

    /* renamed from: g, reason: collision with root package name */
    public int f81028g;

    public b(m1 m1Var, int... iArr) {
        this(m1Var, iArr, 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f81022a == bVar.f81022a && Arrays.equals(this.f81024c, bVar.f81024c)) {
                return true;
            }
        }
        return false;
    }

    @Override // pf.k
    public int evaluateQueueSize(long j10, List<? extends df.b> list) {
        return list.size();
    }

    @Override // pf.k
    public boolean excludeTrack(int i10, long j10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zIsTrackExcluded = isTrackExcluded(i10, jElapsedRealtime);
        int i11 = 0;
        while (i11 < this.f81023b && !zIsTrackExcluded) {
            zIsTrackExcluded = (i11 == i10 || isTrackExcluded(i11, jElapsedRealtime)) ? false : true;
            i11++;
        }
        if (!zIsTrackExcluded) {
            return false;
        }
        long[] jArr = this.f81027f;
        jArr[i10] = Math.max(jArr[i10], n1.addWithOverflowDefault(jElapsedRealtime, j10, Long.MAX_VALUE));
        return true;
    }

    @Override // pf.k, pf.o
    public final z0 getFormat(int i10) {
        return this.f81026e[i10];
    }

    @Override // pf.k, pf.o
    public final int getIndexInTrackGroup(int i10) {
        return this.f81024c[i10];
    }

    @Override // pf.k
    public /* bridge */ /* synthetic */ long getLatestBitrateEstimate() {
        return super.getLatestBitrateEstimate();
    }

    @Override // pf.k
    public final z0 getSelectedFormat() {
        return this.f81026e[getSelectedIndex()];
    }

    @Override // pf.k
    public abstract /* synthetic */ int getSelectedIndex();

    @Override // pf.k
    public final int getSelectedIndexInTrackGroup() {
        return this.f81024c[getSelectedIndex()];
    }

    @Override // pf.k
    public abstract /* synthetic */ Object getSelectionData();

    @Override // pf.k
    public abstract /* synthetic */ int getSelectionReason();

    @Override // pf.k, pf.o
    public final m1 getTrackGroup() {
        return this.f81022a;
    }

    @Override // pf.k, pf.o
    public final int getType() {
        return this.f81025d;
    }

    public int hashCode() {
        if (this.f81028g == 0) {
            this.f81028g = Arrays.hashCode(this.f81024c) + (System.identityHashCode(this.f81022a) * 31);
        }
        return this.f81028g;
    }

    @Override // pf.k, pf.o
    public final int indexOf(z0 z0Var) {
        for (int i10 = 0; i10 < this.f81023b; i10++) {
            if (this.f81026e[i10] == z0Var) {
                return i10;
            }
        }
        return -1;
    }

    @Override // pf.k
    public boolean isTrackExcluded(int i10, long j10) {
        return this.f81027f[i10] > j10;
    }

    @Override // pf.k, pf.o
    public final int length() {
        return this.f81024c.length;
    }

    @Override // pf.k
    public /* bridge */ /* synthetic */ void onDiscontinuity() {
        super.onDiscontinuity();
    }

    @Override // pf.k
    public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(boolean z10) {
        super.onPlayWhenReadyChanged(z10);
    }

    @Override // pf.k
    public /* bridge */ /* synthetic */ void onRebuffer() {
        super.onRebuffer();
    }

    @Override // pf.k
    public /* bridge */ /* synthetic */ boolean shouldCancelChunkLoad(long j10, df.a aVar, List list) {
        return super.shouldCancelChunkLoad(j10, aVar, list);
    }

    @Override // pf.k
    public abstract /* synthetic */ void updateSelectedTrack(long j10, long j11, long j12, List list, df.c[] cVarArr);

    public b(m1 m1Var, int[] iArr, int i10) {
        int i11 = 0;
        com.google.android.exoplayer2.util.a.checkState(iArr.length > 0);
        this.f81025d = i10;
        this.f81022a = (m1) com.google.android.exoplayer2.util.a.checkNotNull(m1Var);
        int length = iArr.length;
        this.f81023b = length;
        this.f81026e = new z0[length];
        for (int i12 = 0; i12 < iArr.length; i12++) {
            this.f81026e[i12] = m1Var.getFormat(iArr[i12]);
        }
        Arrays.sort(this.f81026e, new ni.a(6));
        this.f81024c = new int[this.f81023b];
        while (true) {
            int i13 = this.f81023b;
            if (i11 >= i13) {
                this.f81027f = new long[i13];
                return;
            } else {
                this.f81024c[i11] = m1Var.indexOf(this.f81026e[i11]);
                i11++;
            }
        }
    }

    @Override // pf.k, pf.o
    public final int indexOf(int i10) {
        for (int i11 = 0; i11 < this.f81023b; i11++) {
            if (this.f81024c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // pf.k
    public void disable() {
    }

    @Override // pf.k
    public void enable() {
    }

    @Override // pf.k
    public void onPlaybackSpeed(float f10) {
    }
}
