package d0;

import com.unity3d.ads.beta.xyn.RnJusJ;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class u extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j1.l1 f51623e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j1.b0 f51624f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(j1.l1 l1Var, j1.b0 b0Var) {
        super(1);
        this.f51623e = l1Var;
        this.f51624f = b0Var;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((l1.e) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(l1.e eVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(eVar, RnJusJ.zdHrkRbYPOd);
        eVar.drawContent();
        l1.i.m5406drawPathGBMwjPU$default(eVar, this.f51623e, this.f51624f, 0.0f, null, null, 0, 60, null);
    }
}
