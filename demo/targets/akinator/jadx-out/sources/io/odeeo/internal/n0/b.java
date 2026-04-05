package io.odeeo.internal.n0;

import android.os.SystemClock;
import io.odeeo.internal.a0.k0;
import io.odeeo.internal.b.t;
import io.odeeo.internal.q0.g0;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f64929a;

    /* renamed from: b, reason: collision with root package name */
    public final int f64930b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f64931c;

    /* renamed from: d, reason: collision with root package name */
    public final int f64932d;

    /* renamed from: e, reason: collision with root package name */
    public final t[] f64933e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f64934f;

    /* renamed from: g, reason: collision with root package name */
    public int f64935g;

    public b(k0 k0Var, int... iArr) {
        this(k0Var, iArr, 0);
    }

    public static /* synthetic */ int a(t tVar, t tVar2) {
        return tVar2.f62967h - tVar.f62967h;
    }

    @Override // io.odeeo.internal.n0.d
    public boolean blacklist(int i10, long j10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zIsBlacklisted = isBlacklisted(i10, jElapsedRealtime);
        int i11 = 0;
        while (i11 < this.f64930b && !zIsBlacklisted) {
            zIsBlacklisted = (i11 == i10 || isBlacklisted(i11, jElapsedRealtime)) ? false : true;
            i11++;
        }
        if (!zIsBlacklisted) {
            return false;
        }
        long[] jArr = this.f64934f;
        jArr[i10] = Math.max(jArr[i10], g0.addWithOverflowDefault(jElapsedRealtime, j10, Long.MAX_VALUE));
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f64929a == bVar.f64929a && Arrays.equals(this.f64931c, bVar.f64931c)) {
                return true;
            }
        }
        return false;
    }

    @Override // io.odeeo.internal.n0.d
    public int evaluateQueueSize(long j10, List<? extends io.odeeo.internal.c0.b> list) {
        return list.size();
    }

    @Override // io.odeeo.internal.n0.d, io.odeeo.internal.n0.g
    public final t getFormat(int i10) {
        return this.f64933e[i10];
    }

    @Override // io.odeeo.internal.n0.d, io.odeeo.internal.n0.g
    public final int getIndexInTrackGroup(int i10) {
        return this.f64931c[i10];
    }

    @Override // io.odeeo.internal.n0.d
    public final t getSelectedFormat() {
        return this.f64933e[getSelectedIndex()];
    }

    @Override // io.odeeo.internal.n0.d
    public abstract /* synthetic */ int getSelectedIndex();

    @Override // io.odeeo.internal.n0.d
    public final int getSelectedIndexInTrackGroup() {
        return this.f64931c[getSelectedIndex()];
    }

    @Override // io.odeeo.internal.n0.d
    public abstract /* synthetic */ Object getSelectionData();

    @Override // io.odeeo.internal.n0.d
    public abstract /* synthetic */ int getSelectionReason();

    @Override // io.odeeo.internal.n0.d, io.odeeo.internal.n0.g
    public final k0 getTrackGroup() {
        return this.f64929a;
    }

    @Override // io.odeeo.internal.n0.d, io.odeeo.internal.n0.g
    public final int getType() {
        return this.f64932d;
    }

    public int hashCode() {
        if (this.f64935g == 0) {
            this.f64935g = Arrays.hashCode(this.f64931c) + (System.identityHashCode(this.f64929a) * 31);
        }
        return this.f64935g;
    }

    @Override // io.odeeo.internal.n0.d, io.odeeo.internal.n0.g
    public final int indexOf(t tVar) {
        for (int i10 = 0; i10 < this.f64930b; i10++) {
            if (this.f64933e[i10] == tVar) {
                return i10;
            }
        }
        return -1;
    }

    @Override // io.odeeo.internal.n0.d
    public boolean isBlacklisted(int i10, long j10) {
        return this.f64934f[i10] > j10;
    }

    @Override // io.odeeo.internal.n0.d, io.odeeo.internal.n0.g
    public final int length() {
        return this.f64931c.length;
    }

    @Override // io.odeeo.internal.n0.d
    public /* bridge */ /* synthetic */ void onDiscontinuity() {
        super.onDiscontinuity();
    }

    @Override // io.odeeo.internal.n0.d
    public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(boolean z10) {
        super.onPlayWhenReadyChanged(z10);
    }

    @Override // io.odeeo.internal.n0.d
    public /* bridge */ /* synthetic */ void onRebuffer() {
        super.onRebuffer();
    }

    @Override // io.odeeo.internal.n0.d
    public /* bridge */ /* synthetic */ boolean shouldCancelChunkLoad(long j10, io.odeeo.internal.c0.a aVar, List list) {
        return super.shouldCancelChunkLoad(j10, aVar, list);
    }

    @Override // io.odeeo.internal.n0.d
    public abstract /* synthetic */ void updateSelectedTrack(long j10, long j11, long j12, List list, io.odeeo.internal.c0.c[] cVarArr);

    public b(k0 k0Var, int[] iArr, int i10) {
        int i11 = 0;
        io.odeeo.internal.q0.a.checkState(iArr.length > 0);
        this.f64932d = i10;
        this.f64929a = (k0) io.odeeo.internal.q0.a.checkNotNull(k0Var);
        int length = iArr.length;
        this.f64930b = length;
        this.f64933e = new t[length];
        for (int i12 = 0; i12 < iArr.length; i12++) {
            this.f64933e[i12] = k0Var.getFormat(iArr[i12]);
        }
        Arrays.sort(this.f64933e, new ni.a(22));
        this.f64931c = new int[this.f64930b];
        while (true) {
            int i13 = this.f64930b;
            if (i11 >= i13) {
                this.f64934f = new long[i13];
                return;
            } else {
                this.f64931c[i11] = k0Var.indexOf(this.f64933e[i11]);
                i11++;
            }
        }
    }

    @Override // io.odeeo.internal.n0.d, io.odeeo.internal.n0.g
    public final int indexOf(int i10) {
        for (int i11 = 0; i11 < this.f64930b; i11++) {
            if (this.f64931c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // io.odeeo.internal.n0.d
    public void disable() {
    }

    @Override // io.odeeo.internal.n0.d
    public void enable() {
    }

    @Override // io.odeeo.internal.n0.d
    public void onPlaybackSpeed(float f10) {
    }
}
