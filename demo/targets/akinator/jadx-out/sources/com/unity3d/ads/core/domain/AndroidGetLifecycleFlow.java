package com.unity3d.ads.core.domain;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import av.e;
import bv.f;
import bv.n;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kv.p;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AndroidGetLifecycleFlow {
    private final Context applicationContext;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2", f = "AndroidGetLifecycleFlow.kt", i = {}, l = {64}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2, reason: invalid class name */
    public static final class AnonymousClass2 extends n implements p {
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends f0 implements kv.a {
            final /* synthetic */ AndroidGetLifecycleFlow$invoke$2$listener$1 $listener;
            final /* synthetic */ AndroidGetLifecycleFlow this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AndroidGetLifecycleFlow androidGetLifecycleFlow, AndroidGetLifecycleFlow$invoke$2$listener$1 androidGetLifecycleFlow$invoke$2$listener$1) {
                super(0);
                this.this$0 = androidGetLifecycleFlow;
                this.$listener = androidGetLifecycleFlow$invoke$2$listener$1;
            }

            @Override // kv.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m3497invoke();
                return x0.f87415a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m3497invoke() {
                ((Application) this.this$0.applicationContext).unregisterActivityLifecycleCallbacks(this.$listener);
            }
        }

        public AnonymousClass2(d<? super AnonymousClass2> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            AnonymousClass2 anonymousClass2 = AndroidGetLifecycleFlow.this.new AnonymousClass2(dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [android.app.Application$ActivityLifecycleCallbacks, com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2$listener$1] */
        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                final ProducerScope producerScope = (ProducerScope) this.L$0;
                ?? r12 = new Application.ActivityLifecycleCallbacks() { // from class: com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2$listener$1
                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityCreated(Activity activity, Bundle bundle) {
                        e0.checkNotNullParameter(activity, "activity");
                        ProducerScope<LifecycleEvent> producerScope2 = producerScope;
                        BuildersKt__Builders_commonKt.launch$default(producerScope2, null, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityCreated$1(producerScope2, activity, bundle, null), 3, null);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityDestroyed(Activity activity) {
                        e0.checkNotNullParameter(activity, "activity");
                        ProducerScope<LifecycleEvent> producerScope2 = producerScope;
                        BuildersKt__Builders_commonKt.launch$default(producerScope2, null, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityDestroyed$1(producerScope2, activity, null), 3, null);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityPaused(Activity activity) {
                        e0.checkNotNullParameter(activity, "activity");
                        ProducerScope<LifecycleEvent> producerScope2 = producerScope;
                        BuildersKt__Builders_commonKt.launch$default(producerScope2, null, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityPaused$1(producerScope2, activity, null), 3, null);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityResumed(Activity activity) {
                        e0.checkNotNullParameter(activity, "activity");
                        ProducerScope<LifecycleEvent> producerScope2 = producerScope;
                        BuildersKt__Builders_commonKt.launch$default(producerScope2, null, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityResumed$1(producerScope2, activity, null), 3, null);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                        e0.checkNotNullParameter(activity, "activity");
                        e0.checkNotNullParameter(bundle, "bundle");
                        ProducerScope<LifecycleEvent> producerScope2 = producerScope;
                        BuildersKt__Builders_commonKt.launch$default(producerScope2, null, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivitySaveInstanceState$1(producerScope2, activity, bundle, null), 3, null);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityStarted(Activity activity) {
                        e0.checkNotNullParameter(activity, "activity");
                        ProducerScope<LifecycleEvent> producerScope2 = producerScope;
                        BuildersKt__Builders_commonKt.launch$default(producerScope2, null, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityStarted$1(producerScope2, activity, null), 3, null);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityStopped(Activity activity) {
                        e0.checkNotNullParameter(activity, "activity");
                        ProducerScope<LifecycleEvent> producerScope2 = producerScope;
                        BuildersKt__Builders_commonKt.launch$default(producerScope2, null, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityStopped$1(producerScope2, activity, null), 3, null);
                    }
                };
                ((Application) AndroidGetLifecycleFlow.this.applicationContext).registerActivityLifecycleCallbacks(r12);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(AndroidGetLifecycleFlow.this, r12);
                this.label = 1;
                if (ProduceKt.awaitClose(producerScope, anonymousClass1, this) == coroutine_suspended) {
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
        public final Object invoke(ProducerScope<? super LifecycleEvent> producerScope, d<? super x0> dVar) {
            return ((AnonymousClass2) create(producerScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    public AndroidGetLifecycleFlow(Context applicationContext) {
        e0.checkNotNullParameter(applicationContext, "applicationContext");
        this.applicationContext = applicationContext;
    }

    public final Flow<LifecycleEvent> invoke() {
        if (this.applicationContext instanceof Application) {
            return FlowKt.channelFlow(new AnonymousClass2(null));
        }
        throw new IllegalArgumentException("Application context is required");
    }
}
