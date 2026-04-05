package com.moloco.sdk.internal.utils;

import av.e;
import bv.n;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.sync.Mutex;
import kv.l;
import kv.p;
import tu.a0;
import tu.x0;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class a {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.moloco.sdk.internal.utils.a$a, reason: collision with other inner class name */
    public static final class C0391a extends n implements p {

        /* renamed from: i, reason: collision with root package name */
        public Mutex f47216i;

        /* renamed from: j, reason: collision with root package name */
        public l f47217j;

        /* renamed from: k, reason: collision with root package name */
        public int f47218k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Mutex f47219l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ l f47220m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0391a(Mutex mutex, l lVar, zu.d<? super C0391a> dVar) {
            super(2, dVar);
            this.f47219l = mutex;
            this.f47220m = lVar;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super T> dVar) {
            return ((C0391a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new C0391a(this.f47219l, this.f47220m, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Mutex mutex;
            l lVar;
            Mutex mutex2;
            Throwable th2;
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.f47218k;
            try {
                if (i10 == 0) {
                    a0.throwOnFailure(obj);
                    mutex = this.f47219l;
                    this.f47216i = mutex;
                    lVar = this.f47220m;
                    this.f47217j = lVar;
                    this.f47218k = 1;
                    if (mutex.lock(null, this) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutex2 = this.f47216i;
                    try {
                        a0.throwOnFailure(obj);
                        mutex2.unlock(null);
                        return obj;
                    } catch (Throwable th3) {
                        th2 = th3;
                        mutex2.unlock(null);
                        throw th2;
                    }
                }
                lVar = this.f47217j;
                Mutex mutex3 = this.f47216i;
                a0.throwOnFailure(obj);
                mutex = mutex3;
                this.f47216i = mutex;
                this.f47217j = null;
                this.f47218k = 2;
                Object objInvoke = lVar.invoke(this);
                if (objInvoke != coroutine_suspended) {
                    mutex2 = mutex;
                    obj = objInvoke;
                    mutex2.unlock(null);
                    return obj;
                }
                return coroutine_suspended;
            } catch (Throwable th4) {
                mutex2 = mutex;
                th2 = th4;
                mutex2.unlock(null);
                throw th2;
            }
        }
    }

    public static /* synthetic */ void a(CoroutineScope coroutineScope, m context, CoroutineStart start, p block, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            context = zu.n.f98854b;
        }
        if ((i10 & 2) != 0) {
            start = CoroutineStart.DEFAULT;
        }
        e0.checkNotNullParameter(coroutineScope, "<this>");
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(start, "start");
        e0.checkNotNullParameter(block, "block");
        BuildersKt.launch(coroutineScope, context, start, block);
    }

    public static final void a(CoroutineScope coroutineScope, m context, CoroutineStart start, p block) {
        e0.checkNotNullParameter(coroutineScope, "<this>");
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(start, "start");
        e0.checkNotNullParameter(block, "block");
        BuildersKt.launch(coroutineScope, context, start, block);
    }

    public static final <T> Object a(Mutex mutex, l lVar, zu.d<? super T> dVar) {
        d dVar2 = new d(mutex);
        return dVar.getContext().get(dVar2) != null ? lVar.invoke(dVar) : BuildersKt.withContext(new c(dVar2), new C0391a(mutex, lVar, null), dVar);
    }
}
