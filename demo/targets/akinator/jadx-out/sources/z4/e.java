package z4;

import androidx.lifecycle.j0;
import androidx.lifecycle.j2;
import androidx.lifecycle.k0;
import bv.n;
import kotlinx.coroutines.flow.Flow;
import kv.p;
import p0.d3;
import tu.a0;
import tu.x0;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e extends n implements p {

    /* renamed from: i, reason: collision with root package name */
    public int f97525i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f97526j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ k0 f97527k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j0 f97528l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m f97529m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Flow f97530n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(k0 k0Var, j0 j0Var, m mVar, Flow flow, zu.d dVar) {
        super(2, dVar);
        this.f97527k = k0Var;
        this.f97528l = j0Var;
        this.f97529m = mVar;
        this.f97530n = flow;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        e eVar = new e(this.f97527k, this.f97528l, this.f97529m, this.f97530n, dVar);
        eVar.f97526j = obj;
        return eVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f97525i;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            d3 d3Var = (d3) this.f97526j;
            d dVar = new d(this.f97529m, this.f97530n, d3Var, null);
            this.f97525i = 1;
            if (j2.repeatOnLifecycle(this.f97527k, this.f97528l, dVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
        }
        return x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(d3 d3Var, zu.d<? super x0> dVar) {
        return ((e) create(d3Var, dVar)).invokeSuspend(x0.f87415a);
    }
}
