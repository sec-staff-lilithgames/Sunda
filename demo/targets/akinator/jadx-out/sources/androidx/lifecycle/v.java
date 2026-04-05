package androidx.lifecycle;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ x f6718i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(x xVar, zu.d dVar) {
        super(2, dVar);
        this.f6718i = xVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new v(this.f6718i, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        x.access$removeSource(this.f6718i);
        return tu.x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((v) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
