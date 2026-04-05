package k5;

import av.e;
import bv.n;
import k5.b;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import m5.i;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a extends n implements p {

    /* renamed from: i, reason: collision with root package name */
    public int f70585i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b.a f70586j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ m5.b f70587k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b.a aVar, m5.b bVar, d dVar) {
        super(2, dVar);
        this.f70586j = aVar;
        this.f70587k = bVar;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        return new a(this.f70586j, this.f70587k, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
        int i10 = this.f70585i;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            return obj;
        }
        a0.throwOnFailure(obj);
        i iVar = this.f70586j.f70589b;
        this.f70585i = 1;
        Object topics = iVar.getTopics(this.f70587k, this);
        return topics == coroutine_suspended ? coroutine_suspended : topics;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super m5.d> dVar) {
        return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
