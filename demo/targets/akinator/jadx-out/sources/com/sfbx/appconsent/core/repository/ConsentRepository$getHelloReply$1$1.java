package com.sfbx.appconsent.core.repository;

import av.e;
import bv.f;
import bv.n;
import com.sfbx.appconsent.core.listener.AppConsentNoticeListener;
import com.sfbx.appconsent.core.model.Notice;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowCollector;
import kv.q;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "com.sfbx.appconsent.core.repository.ConsentRepository$getHelloReply$1$1", f = "ConsentRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class ConsentRepository$getHelloReply$1$1 extends n implements q {
    final /* synthetic */ List<AppConsentNoticeListener> $listeners;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConsentRepository$getHelloReply$1$1(List<? extends AppConsentNoticeListener> list, d<? super ConsentRepository$getHelloReply$1$1> dVar) {
        super(3, dVar);
        this.$listeners = list;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        e.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a0.throwOnFailure(obj);
        Iterator<T> it = this.$listeners.iterator();
        while (it.hasNext()) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new ConsentRepository$getHelloReply$1$1$1$1((AppConsentNoticeListener) it.next(), null), 3, null);
        }
        return x0.f87415a;
    }

    @Override // kv.q
    public final Object invoke(FlowCollector<? super Notice> flowCollector, Throwable th2, d<? super x0> dVar) {
        return new ConsentRepository$getHelloReply$1$1(this.$listeners, dVar).invokeSuspend(x0.f87415a);
    }
}
