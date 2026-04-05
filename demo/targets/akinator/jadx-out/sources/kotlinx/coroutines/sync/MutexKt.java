package kotlinx.coroutines.sync;

import bv.d;
import bv.f;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.b0;
import kotlinx.coroutines.internal.Symbol;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class MutexKt {
    private static final int HOLDS_LOCK_ANOTHER_OWNER = 2;
    private static final int HOLDS_LOCK_UNLOCKED = 0;
    private static final int HOLDS_LOCK_YES = 1;
    private static final Symbol NO_OWNER = new Symbol("NO_OWNER");
    private static final Symbol ON_LOCK_ALREADY_LOCKED_BY_OWNER = new Symbol("ALREADY_LOCKED_BY_OWNER");
    private static final int TRY_LOCK_ALREADY_LOCKED_BY_OWNER = 2;
    private static final int TRY_LOCK_FAILED = 1;
    private static final int TRY_LOCK_SUCCESS = 0;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "kotlinx.coroutines.sync.MutexKt", f = "Mutex.kt", i = {0, 0, 0}, l = {Sdk.SDKError.Reason.TPAT_ERROR_VALUE}, m = "withLock", n = {"$this$withLock", "owner", "action"}, s = {"L$0", "L$1", "L$2"})
    /* renamed from: kotlinx.coroutines.sync.MutexKt$withLock$1, reason: invalid class name */
    public static final class AnonymousClass1<T> extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MutexKt.withLock(null, null, null, this);
        }
    }

    public static final Mutex Mutex(boolean z10) {
        return new MutexImpl(z10);
    }

    public static /* synthetic */ Mutex Mutex$default(boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return Mutex(z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object withLock(kotlinx.coroutines.sync.Mutex r4, java.lang.Object r5, kv.a r6, zu.d<? super T> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.sync.MutexKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.sync.MutexKt$withLock$1 r0 = (kotlinx.coroutines.sync.MutexKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.sync.MutexKt$withLock$1 r0 = new kotlinx.coroutines.sync.MutexKt$withLock$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r4 = r0.L$2
            r6 = r4
            kv.a r6 = (kv.a) r6
            java.lang.Object r5 = r0.L$1
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.sync.Mutex r4 = (kotlinx.coroutines.sync.Mutex) r4
            tu.a0.throwOnFailure(r7)
            goto L4e
        L34:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3c:
            tu.a0.throwOnFailure(r7)
            r0.L$0 = r4
            r0.L$1 = r5
            r0.L$2 = r6
            r0.label = r3
            java.lang.Object r7 = r4.lock(r5, r0)
            if (r7 != r1) goto L4e
            return r1
        L4e:
            java.lang.Object r6 = r6.invoke()     // Catch: java.lang.Throwable -> L5c
            kotlin.jvm.internal.b0.finallyStart(r3)
            r4.unlock(r5)
            kotlin.jvm.internal.b0.finallyEnd(r3)
            return r6
        L5c:
            r6 = move-exception
            kotlin.jvm.internal.b0.finallyStart(r3)
            r4.unlock(r5)
            kotlin.jvm.internal.b0.finallyEnd(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.MutexKt.withLock(kotlinx.coroutines.sync.Mutex, java.lang.Object, kv.a, zu.d):java.lang.Object");
    }

    private static final <T> Object withLock$$forInline(Mutex mutex, Object obj, kv.a aVar, zu.d<? super T> dVar) {
        b0.mark(0);
        mutex.lock(obj, dVar);
        b0.mark(1);
        try {
            return aVar.invoke();
        } finally {
            b0.finallyStart(1);
            mutex.unlock(obj);
            b0.finallyEnd(1);
        }
    }

    public static /* synthetic */ Object withLock$default(Mutex mutex, Object obj, kv.a aVar, zu.d dVar, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = null;
        }
        b0.mark(0);
        mutex.lock(obj, dVar);
        b0.mark(1);
        try {
            return aVar.invoke();
        } finally {
            b0.finallyStart(1);
            mutex.unlock(obj);
            b0.finallyEnd(1);
        }
    }
}
