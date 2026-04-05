package b0;

import p0.v5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w0 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v5 f8539e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(v5 v5Var) {
        super(1);
        this.f8539e = v5Var;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((j1.v0) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(j1.v0 graphicsLayer) {
        kotlin.jvm.internal.e0.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setAlpha(((Number) this.f8539e.getValue()).floatValue());
    }
}
