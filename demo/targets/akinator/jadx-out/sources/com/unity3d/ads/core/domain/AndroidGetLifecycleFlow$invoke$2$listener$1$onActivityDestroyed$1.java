package com.unity3d.ads.core.domain;

import android.app.Activity;
import av.e;
import bv.f;
import bv.n;
import com.unity3d.ads.core.domain.LifecycleEvent;
import java.lang.ref.WeakReference;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
import kv.p;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityDestroyed$1", f = "AndroidGetLifecycleFlow.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityDestroyed$1 extends n implements p {
    final /* synthetic */ ProducerScope<LifecycleEvent> $$this$channelFlow;
    final /* synthetic */ Activity $activity;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityDestroyed$1(ProducerScope<? super LifecycleEvent> producerScope, Activity activity, d<? super AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityDestroyed$1> dVar) {
        super(2, dVar);
        this.$$this$channelFlow = producerScope;
        this.$activity = activity;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        return new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityDestroyed$1(this.$$this$channelFlow, this.$activity, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            ProducerScope<LifecycleEvent> producerScope = this.$$this$channelFlow;
            LifecycleEvent.Destroyed destroyed = new LifecycleEvent.Destroyed(new WeakReference(this.$activity));
            this.label = 1;
            if (producerScope.send(destroyed, this) == coroutine_suspended) {
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
    public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
        return ((AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityDestroyed$1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
