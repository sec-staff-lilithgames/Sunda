package e0;

import kotlinx.coroutines.CoroutineScopeKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public final kv.l f53081a;

    /* renamed from: b, reason: collision with root package name */
    public final g f53082b;

    /* renamed from: c, reason: collision with root package name */
    public final d0.m3 f53083c;

    public h(kv.l onDelta) {
        kotlin.jvm.internal.e0.checkNotNullParameter(onDelta, "onDelta");
        this.f53081a = onDelta;
        this.f53082b = new g(this);
        this.f53083c = new d0.m3();
    }

    @Override // e0.c2
    public void dispatchRawDelta(float f10) {
        this.f53081a.invoke(Float.valueOf(f10));
    }

    @Override // e0.c2
    public Object drag(d0.l3 l3Var, kv.p pVar, zu.d<? super tu.x0> dVar) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new f(this, l3Var, pVar, null), dVar);
        return objCoroutineScope == av.e.getCOROUTINE_SUSPENDED() ? objCoroutineScope : tu.x0.f87415a;
    }

    public final kv.l getOnDelta() {
        return this.f53081a;
    }
}
