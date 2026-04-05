package io.ktor.http.content;

import av.e;
import bv.f;
import bv.n;
import io.ktor.utils.io.jvm.javaio.PollersKt;
import java.lang.reflect.Method;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kv.a;
import kv.l;
import kv.p;
import tu.a0;
import tu.o;
import tu.q;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class BlockingBridgeKt {
    private static final o isParkingAllowedFunction$delegate = q.lazy(AnonymousClass2.INSTANCE);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.http.content.BlockingBridgeKt$isParkingAllowedFunction$2, reason: invalid class name */
    public static final class AnonymousClass2 extends f0 implements a {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        @Override // kv.a
        public final Method invoke() {
            try {
                int i10 = PollersKt.f62181a;
                return PollersKt.class.getMethod("isParkingAllowed", null);
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.http.content.BlockingBridgeKt$withBlockingAndRedispatch$2", f = "BlockingBridge.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.ktor.http.content.BlockingBridgeKt$withBlockingAndRedispatch$2, reason: invalid class name and case insensitive filesystem */
    public static final class C39852 extends n implements p {
        final /* synthetic */ l $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39852(l lVar, d<? super C39852> dVar) {
            super(2, dVar);
            this.$block = lVar;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return new C39852(this.$block, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                l lVar = this.$block;
                this.label = 1;
                if (lVar.invoke(this) == coroutine_suspended) {
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
            return ((C39852) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    private static final Method isParkingAllowedFunction() {
        return (Method) isParkingAllowedFunction$delegate.getValue();
    }

    private static final boolean safeToRunInPlace() {
        boolean zAreEqual;
        Method methodIsParkingAllowedFunction = isParkingAllowedFunction();
        if (methodIsParkingAllowedFunction == null) {
            return false;
        }
        try {
            zAreEqual = e0.areEqual(methodIsParkingAllowedFunction.invoke(null, null), Boolean.TRUE);
        } catch (Throwable unused) {
            zAreEqual = false;
        }
        return zAreEqual;
    }

    public static final Object withBlocking(l lVar, d<? super x0> dVar) {
        boolean zSafeToRunInPlace = safeToRunInPlace();
        x0 x0Var = x0.f87415a;
        if (zSafeToRunInPlace) {
            Object objInvoke = lVar.invoke(dVar);
            return objInvoke == e.getCOROUTINE_SUSPENDED() ? objInvoke : x0Var;
        }
        Object objWithBlockingAndRedispatch = withBlockingAndRedispatch(lVar, dVar);
        return objWithBlockingAndRedispatch == e.getCOROUTINE_SUSPENDED() ? objWithBlockingAndRedispatch : x0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object withBlockingAndRedispatch(l lVar, d<? super x0> dVar) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new C39852(lVar, null), dVar);
        return objWithContext == e.getCOROUTINE_SUSPENDED() ? objWithContext : x0.f87415a;
    }
}
