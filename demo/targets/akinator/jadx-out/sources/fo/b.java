package fo;

import android.os.SystemClock;
import gn.v1;
import io.bidmachine.media3.common.util.a1;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class b implements l {

    /* renamed from: a, reason: collision with root package name */
    public final v1 f55810a;

    /* renamed from: b, reason: collision with root package name */
    public final int f55811b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f55812c;

    /* renamed from: d, reason: collision with root package name */
    public final int f55813d;

    /* renamed from: e, reason: collision with root package name */
    public final io.bidmachine.media3.common.b[] f55814e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f55815f;

    /* renamed from: g, reason: collision with root package name */
    public int f55816g;

    public b(v1 v1Var, int... iArr) {
        this(v1Var, iArr, 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f55810a.equals(bVar.f55810a) && Arrays.equals(this.f55812c, bVar.f55812c)) {
                return true;
            }
        }
        return false;
    }

    @Override // fo.l
    public int evaluateQueueSize(long j10, List<? extends co.p> list) {
        return list.size();
    }

    @Override // fo.l
    public boolean excludeTrack(int i10, long j10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zIsTrackExcluded = isTrackExcluded(i10, jElapsedRealtime);
        int i11 = 0;
        while (i11 < this.f55811b && !zIsTrackExcluded) {
            zIsTrackExcluded = (i11 == i10 || isTrackExcluded(i11, jElapsedRealtime)) ? false : true;
            i11++;
        }
        if (!zIsTrackExcluded) {
            return false;
        }
        long[] jArr = this.f55815f;
        jArr[i10] = Math.max(jArr[i10], a1.addWithOverflowDefault(jElapsedRealtime, j10, Long.MAX_VALUE));
        return true;
    }

    @Override // fo.l, fo.p
    public final io.bidmachine.media3.common.b getFormat(int i10) {
        return this.f55814e[i10];
    }

    @Override // fo.l, fo.p
    public final int getIndexInTrackGroup(int i10) {
        return this.f55812c[i10];
    }

    @Override // fo.l
    public /* bridge */ /* synthetic */ long getLatestBitrateEstimate() {
        return super.getLatestBitrateEstimate();
    }

    @Override // fo.l
    public final io.bidmachine.media3.common.b getSelectedFormat() {
        return this.f55814e[getSelectedIndex()];
    }

    @Override // fo.l
    public abstract /* synthetic */ int getSelectedIndex();

    @Override // fo.l
    public final int getSelectedIndexInTrackGroup() {
        return this.f55812c[getSelectedIndex()];
    }

    @Override // fo.l
    public abstract /* synthetic */ Object getSelectionData();

    @Override // fo.l
    public abstract /* synthetic */ int getSelectionReason();

    @Override // fo.l, fo.p
    public final v1 getTrackGroup() {
        return this.f55810a;
    }

    @Override // fo.l, fo.p
    public final int getType() {
        return this.f55813d;
    }

    public int hashCode() {
        if (this.f55816g == 0) {
            this.f55816g = Arrays.hashCode(this.f55812c) + (System.identityHashCode(this.f55810a) * 31);
        }
        return this.f55816g;
    }

    @Override // fo.l, fo.p
    public final int indexOf(io.bidmachine.media3.common.b bVar) {
        for (int i10 = 0; i10 < this.f55811b; i10++) {
            if (this.f55814e[i10] == bVar) {
                return i10;
            }
        }
        return -1;
    }

    @Override // fo.l
    public boolean isTrackExcluded(int i10, long j10) {
        return this.f55815f[i10] > j10;
    }

    @Override // fo.l, fo.p
    public final int length() {
        return this.f55812c.length;
    }

    @Override // fo.l
    public /* bridge */ /* synthetic */ void onDiscontinuity() {
        super.onDiscontinuity();
    }

    @Override // fo.l
    public /* bridge */ /* synthetic */ void onRebuffer() {
        super.onRebuffer();
    }

    @Override // fo.l
    public /* bridge */ /* synthetic */ boolean shouldCancelChunkLoad(long j10, co.e eVar, List list) {
        return super.shouldCancelChunkLoad(j10, eVar, list);
    }

    @Override // fo.l
    public abstract /* synthetic */ void updateSelectedTrack(long j10, long j11, long j12, List list, co.r[] rVarArr);

    public b(v1 v1Var, int[] iArr, int i10) {
        int i11 = 0;
        io.bidmachine.media3.common.util.a.checkState(iArr.length > 0);
        this.f55813d = i10;
        this.f55810a = (v1) io.bidmachine.media3.common.util.a.checkNotNull(v1Var);
        int length = iArr.length;
        this.f55811b = length;
        this.f55814e = new io.bidmachine.media3.common.b[length];
        for (int i12 = 0; i12 < iArr.length; i12++) {
            this.f55814e[i12] = v1Var.getFormat(iArr[i12]);
        }
        Arrays.sort(this.f55814e, new af.i(12));
        this.f55812c = new int[this.f55811b];
        while (true) {
            int i13 = this.f55811b;
            if (i11 >= i13) {
                this.f55815f = new long[i13];
                return;
            } else {
                this.f55812c[i11] = v1Var.indexOf(this.f55814e[i11]);
                i11++;
            }
        }
    }

    @Override // fo.l, fo.p
    public final int indexOf(int i10) {
        for (int i11 = 0; i11 < this.f55811b; i11++) {
            if (this.f55812c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // fo.l
    public void disable() {
    }

    @Override // fo.l
    public void enable() {
    }

    @Override // fo.l
    public void onPlayWhenReadyChanged(boolean z10) {
    }

    @Override // fo.l
    public void onPlaybackSpeed(float f10) {
    }
}
