package com.unity3d.ads.adplayer;

import av.e;
import bv.f;
import bv.n;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kv.l;
import kv.p;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class Invocation {
    private final CompletableDeferred<x0> _isHandled;
    private final CompletableDeferred<Object> completableDeferred;
    private final String location;
    private final Object[] parameters;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.adplayer.Invocation$handle$2", f = "Invocation.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.adplayer.Invocation$handle$2, reason: invalid class name */
    public static final class AnonymousClass2 extends n implements l {
        int label;

        public AnonymousClass2(d<? super AnonymousClass2> dVar) {
            super(1, dVar);
        }

        @Override // bv.a
        public final d<x0> create(d<?> dVar) {
            return new AnonymousClass2(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            return x0.f87415a;
        }

        @Override // kv.l
        public final Object invoke(d<? super x0> dVar) {
            return ((AnonymousClass2) create(dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.adplayer.Invocation$handle$3", f = "Invocation.kt", i = {}, l = {23}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.adplayer.Invocation$handle$3, reason: invalid class name */
    public static final class AnonymousClass3 extends n implements p {
        final /* synthetic */ l $handler;
        int label;
        final /* synthetic */ Invocation this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(l lVar, Invocation invocation, d<? super AnonymousClass3> dVar) {
            super(2, dVar);
            this.$handler = lVar;
            this.this$0 = invocation;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return new AnonymousClass3(this.$handler, this.this$0, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    a0.throwOnFailure(obj);
                    l lVar = this.$handler;
                    this.label = 1;
                    obj = lVar.invoke(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a0.throwOnFailure(obj);
                }
                this.this$0.completableDeferred.complete(obj);
            } catch (Throwable th2) {
                this.this$0.completableDeferred.completeExceptionally(th2);
            }
            return x0.f87415a;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((AnonymousClass3) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    public Invocation(String location, Object[] parameters) {
        e0.checkNotNullParameter(location, "location");
        e0.checkNotNullParameter(parameters, "parameters");
        this.location = location;
        this.parameters = parameters;
        this._isHandled = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        this.completableDeferred = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
    }

    public static /* synthetic */ Object handle$default(Invocation invocation, l lVar, d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = new AnonymousClass2(null);
        }
        return invocation.handle(lVar, dVar);
    }

    public final String getLocation() {
        return this.location;
    }

    public final Object[] getParameters() {
        return this.parameters;
    }

    public final Object getResult(d<Object> dVar) {
        return this.completableDeferred.await(dVar);
    }

    public final Object handle(l lVar, d<? super x0> dVar) {
        CompletableDeferred<x0> completableDeferred = this._isHandled;
        x0 x0Var = x0.f87415a;
        completableDeferred.complete(x0Var);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(dVar.getContext()), null, null, new AnonymousClass3(lVar, this, null), 3, null);
        return x0Var;
    }

    public final Deferred<x0> isHandled() {
        return this._isHandled;
    }
}
