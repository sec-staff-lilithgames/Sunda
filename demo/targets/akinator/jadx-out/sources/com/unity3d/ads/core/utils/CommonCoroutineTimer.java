package com.unity3d.ads.core.utils;

import av.e;
import bv.f;
import bv.n;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kv.a;
import kv.p;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class CommonCoroutineTimer implements CoroutineTimer {
    private final CoroutineDispatcher dispatcher;
    private final CompletableJob job;
    private final CoroutineScope scope;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.utils.CommonCoroutineTimer$start$1", f = "CommonCoroutineTimer.kt", i = {0, 1}, l = {21, 24}, m = "invokeSuspend", n = {"$this$launch", "$this$launch"}, s = {"L$0", "L$0"})
    /* renamed from: com.unity3d.ads.core.utils.CommonCoroutineTimer$start$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements p {
        final /* synthetic */ a $action;
        final /* synthetic */ long $delayStartMillis;
        final /* synthetic */ long $repeatMillis;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j10, a aVar, long j11, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$delayStartMillis = j10;
            this.$action = aVar;
            this.$repeatMillis = j11;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$delayStartMillis, this.$action, this.$repeatMillis, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                long j10 = this.$delayStartMillis;
                this.L$0 = coroutineScope;
                this.label = 1;
                if (DelayKt.delay(j10, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.L$0;
            a0.throwOnFailure(obj);
            while (CoroutineScopeKt.isActive(coroutineScope)) {
                this.$action.invoke();
                long j11 = this.$repeatMillis;
                this.L$0 = coroutineScope;
                this.label = 2;
                if (DelayKt.delay(j11, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return x0.f87415a;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((AnonymousClass1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    public CommonCoroutineTimer(CoroutineDispatcher dispatcher) {
        e0.checkNotNullParameter(dispatcher, "dispatcher");
        this.dispatcher = dispatcher;
        CompletableJob completableJobSupervisorJob$default = SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null);
        this.job = completableJobSupervisorJob$default;
        this.scope = CoroutineScopeKt.CoroutineScope(dispatcher.plus(completableJobSupervisorJob$default));
    }

    @Override // com.unity3d.ads.core.utils.CoroutineTimer
    public Job start(long j10, long j11, a action) {
        e0.checkNotNullParameter(action, "action");
        return BuildersKt__Builders_commonKt.launch$default(this.scope, this.dispatcher, null, new AnonymousClass1(j10, action, j11, null), 2, null);
    }
}
