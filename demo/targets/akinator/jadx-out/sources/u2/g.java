package u2;

import tu.x0;
import z1.s1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z1.b0 f87725e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f87726f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(o oVar, z1.b0 b0Var) {
        super(1);
        this.f87725e = b0Var;
        this.f87726f = oVar;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((l1.i) obj);
        return x0.f87415a;
    }

    public final void invoke(l1.i drawBehind) {
        kotlin.jvm.internal.e0.checkNotNullParameter(drawBehind, "$this$drawBehind");
        j1.e0 canvas = ((l1.b) drawBehind.getDrawContext()).getCanvas();
        s1 owner$ui_release = this.f87725e.getOwner$ui_release();
        a2.t tVar = owner$ui_release instanceof a2.t ? (a2.t) owner$ui_release : null;
        if (tVar != null) {
            tVar.drawAndroidView(this.f87726f, j1.d.getNativeCanvas(canvas));
        }
    }
}
