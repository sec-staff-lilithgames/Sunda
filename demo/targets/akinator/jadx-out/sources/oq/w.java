package oq;

import java.util.Iterator;
import java.util.Map;
import kotlinx.coroutines.CoroutineScope;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class w extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ x f79810i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, zu.d dVar) {
        super(2, dVar);
        this.f79810i = xVar;
    }

    @Override // kv.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
        return ((w) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new w(this.f79810i, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        x xVar = this.f79810i;
        Iterator it = xVar.f79813c.entrySet().iterator();
        while (it.hasNext()) {
            ((a) ((Map.Entry) it.next()).getValue()).a();
        }
        xVar.f79813c.clear();
        return x0.f87415a;
    }
}
