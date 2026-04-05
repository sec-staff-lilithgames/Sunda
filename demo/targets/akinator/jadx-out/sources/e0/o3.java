package e0;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p0.v5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o3 extends bv.n implements kv.q {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ float f53220i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p0.j2 f53221j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ v5 f53222k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(v5 v5Var, p0.j2 j2Var, zu.d dVar) {
        super(3, dVar);
        this.f53221j = j2Var;
        this.f53222k = v5Var;
    }

    @Override // kv.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((CoroutineScope) obj, ((Number) obj2).floatValue(), (zu.d<? super tu.x0>) obj3);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        BuildersKt__Builders_commonKt.launch$default(((t1.e) this.f53221j.getValue()).getCoroutineScope(), null, null, new n3(this.f53222k, this.f53220i, null), 3, null);
        return tu.x0.f87415a;
    }

    public final Object invoke(CoroutineScope coroutineScope, float f10, zu.d<? super tu.x0> dVar) {
        o3 o3Var = new o3(this.f53222k, this.f53221j, dVar);
        o3Var.f53220i = f10;
        return o3Var.invokeSuspend(tu.x0.f87415a);
    }
}
