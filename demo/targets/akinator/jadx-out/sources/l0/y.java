package l0;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class y extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f72204i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u1.k0 f72205j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ z0 f72206k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(u1.k0 k0Var, z0 z0Var, zu.d dVar) {
        super(2, dVar);
        this.f72205j = k0Var;
        this.f72206k = z0Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        y yVar = new y(this.f72205j, this.f72206k, dVar);
        yVar.f72204i = obj;
        return yVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f72204i;
        u1.k0 k0Var = this.f72205j;
        z0 z0Var = this.f72206k;
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new w(k0Var, z0Var, null), 3, null);
        return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new x(k0Var, z0Var, null), 3, null);
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super Job> dVar) {
        return ((y) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
