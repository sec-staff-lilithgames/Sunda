package pf;

import bf.m1;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l extends b {

    /* renamed from: h, reason: collision with root package name */
    public final int f81122h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f81123i;

    public l(m1 m1Var, int i10) {
        this(m1Var, i10, 0);
    }

    @Override // pf.b, pf.k
    public /* bridge */ /* synthetic */ long getLatestBitrateEstimate() {
        return super.getLatestBitrateEstimate();
    }

    @Override // pf.b, pf.k
    public int getSelectedIndex() {
        return 0;
    }

    @Override // pf.b, pf.k
    public Object getSelectionData() {
        return this.f81123i;
    }

    @Override // pf.b, pf.k
    public int getSelectionReason() {
        return this.f81122h;
    }

    @Override // pf.b, pf.k
    public /* bridge */ /* synthetic */ void onDiscontinuity() {
        super.onDiscontinuity();
    }

    @Override // pf.b, pf.k
    public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(boolean z10) {
        super.onPlayWhenReadyChanged(z10);
    }

    @Override // pf.b, pf.k
    public /* bridge */ /* synthetic */ void onRebuffer() {
        super.onRebuffer();
    }

    @Override // pf.b, pf.k
    public /* bridge */ /* synthetic */ boolean shouldCancelChunkLoad(long j10, df.a aVar, List list) {
        return super.shouldCancelChunkLoad(j10, aVar, list);
    }

    public l(m1 m1Var, int i10, int i11) {
        this(m1Var, i10, i11, 0, null);
    }

    public l(m1 m1Var, int i10, int i11, int i12, Object obj) {
        super(m1Var, new int[]{i10}, i11);
        this.f81122h = i12;
        this.f81123i = obj;
    }

    @Override // pf.b, pf.k
    public void updateSelectedTrack(long j10, long j11, long j12, List<? extends df.b> list, df.c[] cVarArr) {
    }
}
