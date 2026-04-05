package io.ktor.util.debug;

import av.e;
import bv.f;
import bv.n;
import io.ktor.util.debug.plugins.PluginName;
import io.ktor.util.debug.plugins.PluginsTrace;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kv.l;
import kv.p;
import tu.a0;
import tu.x0;
import zu.d;
import zu.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ContextUtilsKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.util.debug.ContextUtilsKt$addToContextInDebugMode$2", f = "ContextUtils.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.ktor.util.debug.ContextUtilsKt$addToContextInDebugMode$2, reason: invalid class name */
    public static final class AnonymousClass2 extends n implements p {
        final /* synthetic */ l $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(l lVar, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$block = lVar;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return new AnonymousClass2(this.$block, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                return obj;
            }
            a0.throwOnFailure(obj);
            l lVar = this.$block;
            this.label = 1;
            Object objInvoke = lVar.invoke(this);
            return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super T> dVar) {
            return ((AnonymousClass2) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.util.debug.ContextUtilsKt$initContextInDebugMode$2", f = "ContextUtils.kt", i = {}, l = {20}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.ktor.util.debug.ContextUtilsKt$initContextInDebugMode$2, reason: invalid class name and case insensitive filesystem */
    public static final class C39992 extends n implements p {
        final /* synthetic */ l $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39992(l lVar, d<? super C39992> dVar) {
            super(2, dVar);
            this.$block = lVar;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return new C39992(this.$block, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                return obj;
            }
            a0.throwOnFailure(obj);
            l lVar = this.$block;
            this.label = 1;
            Object objInvoke = lVar.invoke(this);
            return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super T> dVar) {
            return ((C39992) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    public static final <T> Object addToContextInDebugMode(String str, l lVar, d<? super T> dVar) {
        return !IntellijIdeaDebugDetector.INSTANCE.isDebuggerConnected() ? lVar.invoke(dVar) : BuildersKt.withContext(dVar.getContext().plus(new PluginName(str)), new AnonymousClass2(lVar, null), dVar);
    }

    public static final <T> Object initContextInDebugMode(l lVar, d<? super T> dVar) {
        return !IntellijIdeaDebugDetector.INSTANCE.isDebuggerConnected() ? lVar.invoke(dVar) : BuildersKt.withContext(dVar.getContext().plus(new PluginsTrace(null, 1, null)), new C39992(lVar, null), dVar);
    }

    public static final <Element extends k> Object useContextElementInDebugMode(zu.l lVar, l lVar2, d<? super x0> dVar) {
        k kVar;
        boolean zIsDebuggerConnected = IntellijIdeaDebugDetector.INSTANCE.isDebuggerConnected();
        x0 x0Var = x0.f87415a;
        if (zIsDebuggerConnected && (kVar = dVar.getContext().get(lVar)) != null) {
            lVar2.invoke(kVar);
        }
        return x0Var;
    }
}
