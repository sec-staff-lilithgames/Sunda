package ik;

import android.util.Log;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class g extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f59687i;

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        g gVar = new g(2, dVar);
        gVar.f59687i = obj;
        return gVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        Log.e("FirebaseSessions", "Error failed to fetch the remote configs: " + ((String) this.f59687i));
        return x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(String str, zu.d<? super x0> dVar) {
        return ((g) create(str, dVar)).invokeSuspend(x0.f87415a);
    }
}
