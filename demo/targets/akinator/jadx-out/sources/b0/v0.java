package b0;

import p0.v5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v0 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v5 f8534e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v5 f8535f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v5 f8536g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(v5 v5Var, v5 v5Var2, v5 v5Var3) {
        super(1);
        this.f8534e = v5Var;
        this.f8535f = v5Var2;
        this.f8536g = v5Var3;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((j1.v0) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(j1.v0 graphicsLayer) {
        kotlin.jvm.internal.e0.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setAlpha(((Number) this.f8534e.getValue()).floatValue());
        v5 v5Var = this.f8535f;
        graphicsLayer.setScaleX(((Number) v5Var.getValue()).floatValue());
        graphicsLayer.setScaleY(((Number) v5Var.getValue()).floatValue());
        graphicsLayer.mo4666setTransformOrigin__ExYCQ(((j1.u2) this.f8536g.getValue()).m5017unboximpl());
    }
}
