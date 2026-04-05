package o0;

import d0.t2;
import kotlinx.coroutines.CoroutineScope;
import p0.v5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class v implements t2 {

    /* renamed from: b, reason: collision with root package name */
    public final d0 f77384b;

    public v(boolean z10, v5 rippleAlpha) {
        kotlin.jvm.internal.e0.checkNotNullParameter(rippleAlpha, "rippleAlpha");
        this.f77384b = new d0(z10, rippleAlpha);
    }

    public abstract void addRipple(f0.t tVar, CoroutineScope coroutineScope);

    @Override // d0.t2
    public abstract /* synthetic */ void drawIndication(l1.e eVar);

    /* renamed from: drawStateLayer-H2RKhps, reason: not valid java name */
    public final void m5762drawStateLayerH2RKhps(l1.i drawStateLayer, float f10, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(drawStateLayer, "$this$drawStateLayer");
        this.f77384b.m5753drawStateLayerH2RKhps(drawStateLayer, f10, j10);
    }

    public abstract void removeRipple(f0.t tVar);

    public final void updateStateLayer$material_ripple_release(f0.n interaction, CoroutineScope scope) {
        kotlin.jvm.internal.e0.checkNotNullParameter(interaction, "interaction");
        kotlin.jvm.internal.e0.checkNotNullParameter(scope, "scope");
        this.f77384b.handleInteraction(interaction, scope);
    }
}
