package d0;

import j1.g1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g1.a f51565e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j1.b0 f51566f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(g1.a aVar, j1.b0 b0Var) {
        super(1);
        this.f51565e = aVar;
        this.f51566f = b0Var;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((l1.e) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(l1.e onDrawWithContent) {
        kotlin.jvm.internal.e0.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
        onDrawWithContent.drawContent();
        l1.i.m5406drawPathGBMwjPU$default(onDrawWithContent, this.f51565e.getPath(), this.f51566f, 0.0f, null, null, 0, 60, null);
    }
}
