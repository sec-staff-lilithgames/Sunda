package bf;

import com.google.android.exoplayer2.k3;
import com.google.android.exoplayer2.l3;
import com.google.android.exoplayer2.m3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class q extends m3 {

    /* renamed from: g, reason: collision with root package name */
    public final m3 f9378g;

    public q(m3 m3Var) {
        this.f9378g = m3Var;
    }

    @Override // com.google.android.exoplayer2.m3
    public int getFirstWindowIndex(boolean z10) {
        return this.f9378g.getFirstWindowIndex(z10);
    }

    @Override // com.google.android.exoplayer2.m3
    public int getIndexOfPeriod(Object obj) {
        return this.f9378g.getIndexOfPeriod(obj);
    }

    @Override // com.google.android.exoplayer2.m3
    public int getLastWindowIndex(boolean z10) {
        return this.f9378g.getLastWindowIndex(z10);
    }

    @Override // com.google.android.exoplayer2.m3
    public int getNextWindowIndex(int i10, int i11, boolean z10) {
        return this.f9378g.getNextWindowIndex(i10, i11, z10);
    }

    @Override // com.google.android.exoplayer2.m3
    public k3 getPeriod(int i10, k3 k3Var, boolean z10) {
        return this.f9378g.getPeriod(i10, k3Var, z10);
    }

    @Override // com.google.android.exoplayer2.m3
    public int getPeriodCount() {
        return this.f9378g.getPeriodCount();
    }

    @Override // com.google.android.exoplayer2.m3
    public int getPreviousWindowIndex(int i10, int i11, boolean z10) {
        return this.f9378g.getPreviousWindowIndex(i10, i11, z10);
    }

    @Override // com.google.android.exoplayer2.m3
    public Object getUidOfPeriod(int i10) {
        return this.f9378g.getUidOfPeriod(i10);
    }

    @Override // com.google.android.exoplayer2.m3
    public l3 getWindow(int i10, l3 l3Var, long j10) {
        return this.f9378g.getWindow(i10, l3Var, j10);
    }

    @Override // com.google.android.exoplayer2.m3
    public int getWindowCount() {
        return this.f9378g.getWindowCount();
    }
}
