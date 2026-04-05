package fo;

import gn.v1;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class m extends b {

    /* renamed from: h, reason: collision with root package name */
    public final int f55911h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f55912i;

    public m(v1 v1Var, int i10) {
        this(v1Var, i10, 0);
    }

    @Override // fo.b, fo.l
    public /* bridge */ /* synthetic */ long getLatestBitrateEstimate() {
        return super.getLatestBitrateEstimate();
    }

    @Override // fo.b, fo.l
    public int getSelectedIndex() {
        return 0;
    }

    @Override // fo.b, fo.l
    public Object getSelectionData() {
        return this.f55912i;
    }

    @Override // fo.b, fo.l
    public int getSelectionReason() {
        return this.f55911h;
    }

    @Override // fo.b, fo.l
    public /* bridge */ /* synthetic */ void onDiscontinuity() {
        super.onDiscontinuity();
    }

    @Override // fo.b, fo.l
    public /* bridge */ /* synthetic */ void onRebuffer() {
        super.onRebuffer();
    }

    @Override // fo.b, fo.l
    public /* bridge */ /* synthetic */ boolean shouldCancelChunkLoad(long j10, co.e eVar, List list) {
        return super.shouldCancelChunkLoad(j10, eVar, list);
    }

    public m(v1 v1Var, int i10, int i11) {
        this(v1Var, i10, i11, 0, null);
    }

    public m(v1 v1Var, int i10, int i11, int i12, Object obj) {
        super(v1Var, new int[]{i10}, i11);
        this.f55911h = i12;
        this.f55912i = obj;
    }

    @Override // fo.b, fo.l
    public void updateSelectedTrack(long j10, long j11, long j12, List<? extends co.p> list, co.r[] rVarArr) {
    }
}
