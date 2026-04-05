package io.odeeo.internal.v1;

import androidx.lifecycle.l1;
import androidx.lifecycle.r1;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "io.odeeo.sdk.util.CoroutineExtensionsKt$launch$1", f = "CoroutineExtensions.kt", i = {}, l = {15}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends bv.n implements kv.p {

        /* renamed from: a, reason: collision with root package name */
        public int f67270a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f67271b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ kv.p f67272c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kv.p pVar, zu.d<? super a> dVar) {
            super(2, dVar);
            this.f67272c = pVar;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            a aVar = new a(this.f67272c, dVar);
            aVar.f67271b = obj;
            return aVar;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f67270a;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f67271b;
                kv.p pVar = this.f67272c;
                this.f67270a = 1;
                if (pVar.invoke(coroutineScope, this) == coroutine_suspended) {
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
            return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    public static final <X> l1 distinctUntilChanged(l1 l1Var) {
        e0.checkNotNullParameter(l1Var, "<this>");
        return distinctUntilChangedInternal(l1Var);
    }

    public static final <X> l1 distinctUntilChangedInternal(l1 source) {
        e0.checkNotNullParameter(source, "source");
        r1 r1Var = new r1();
        r1Var.addSource(source, new f(r1Var));
        return r1Var;
    }

    public static final Job launch(kv.p block) {
        e0.checkNotNullParameter(block, "block");
        return BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new a(block, null), 3, null);
    }
}
