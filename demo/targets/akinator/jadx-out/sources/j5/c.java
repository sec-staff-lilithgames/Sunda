package j5;

import android.net.Uri;
import android.view.InputEvent;
import bv.n;
import j5.h;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c extends n implements p {

    /* renamed from: i, reason: collision with root package name */
    public int f69109i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h.a f69110j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Uri f69111k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InputEvent f69112l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(h.a aVar, Uri uri, InputEvent inputEvent, zu.d dVar) {
        super(2, dVar);
        this.f69110j = aVar;
        this.f69111k = uri;
        this.f69112l = inputEvent;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new c(this.f69110j, this.f69111k, this.f69112l, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f69109i;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            l5.c cVar = this.f69110j.f69126b;
            this.f69109i = 1;
            if (cVar.registerSource(this.f69111k, this.f69112l, this) == coroutine_suspended) {
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
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
        return ((c) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
