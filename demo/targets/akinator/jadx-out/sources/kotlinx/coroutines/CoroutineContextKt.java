package kotlinx.coroutines;

import bv.e;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.b1;
import kotlinx.coroutines.internal.ThreadContextKt;
import zu.d;
import zu.f;
import zu.k;
import zu.m;
import zu.n;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class CoroutineContextKt {
    private static final String DEBUG_THREAD_NAME_SEPARATOR = " @";

    private static final m foldCopies(m mVar, m mVar2, boolean z10) {
        boolean zHasCopyableElements = hasCopyableElements(mVar);
        boolean zHasCopyableElements2 = hasCopyableElements(mVar2);
        if (!zHasCopyableElements && !zHasCopyableElements2) {
            return mVar.plus(mVar2);
        }
        b1 b1Var = new b1();
        b1Var.f71816b = mVar2;
        b bVar = new b(b1Var, z10, 0);
        n nVar = n.f98854b;
        m mVar3 = (m) mVar.fold(nVar, bVar);
        if (zHasCopyableElements2) {
            b1Var.f71816b = ((m) b1Var.f71816b).fold(nVar, new a1.n(7));
        }
        return mVar3.plus((m) b1Var.f71816b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m foldCopies$lambda$1(b1 b1Var, boolean z10, m mVar, k kVar) {
        if (!(kVar instanceof CopyableThreadContextElement)) {
            return mVar.plus(kVar);
        }
        k kVar2 = ((m) b1Var.f71816b).get(kVar.getKey());
        if (kVar2 == null) {
            return mVar.plus(z10 ? ((CopyableThreadContextElement) kVar).copyForChild() : (CopyableThreadContextElement) kVar);
        }
        b1Var.f71816b = ((m) b1Var.f71816b).minusKey(kVar.getKey());
        return mVar.plus(((CopyableThreadContextElement) kVar).mergeForChild(kVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m foldCopies$lambda$2(m mVar, k kVar) {
        return kVar instanceof CopyableThreadContextElement ? mVar.plus(((CopyableThreadContextElement) kVar).copyForChild()) : mVar.plus(kVar);
    }

    public static final String getCoroutineName(m mVar) {
        return null;
    }

    private static final boolean hasCopyableElements(m mVar) {
        return ((Boolean) mVar.fold(Boolean.FALSE, new a1.n(6))).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasCopyableElements$lambda$0(boolean z10, k kVar) {
        return z10 || (kVar instanceof CopyableThreadContextElement);
    }

    public static final m newCoroutineContext(CoroutineScope coroutineScope, m mVar) {
        m mVarFoldCopies = foldCopies(coroutineScope.getCoroutineContext(), mVar, true);
        return (mVarFoldCopies == Dispatchers.getDefault() || mVarFoldCopies.get(f.f98853b) != null) ? mVarFoldCopies : mVarFoldCopies.plus(Dispatchers.getDefault());
    }

    public static final UndispatchedCoroutine<?> undispatchedCompletion(e eVar) {
        while (!(eVar instanceof DispatchedCoroutine) && (eVar = eVar.getCallerFrame()) != null) {
            if (eVar instanceof UndispatchedCoroutine) {
                return (UndispatchedCoroutine) eVar;
            }
        }
        return null;
    }

    public static final UndispatchedCoroutine<?> updateUndispatchedCompletion(d<?> dVar, m mVar, Object obj) {
        if (!(dVar instanceof e) || mVar.get(UndispatchedMarker.INSTANCE) == null) {
            return null;
        }
        UndispatchedCoroutine<?> undispatchedCoroutineUndispatchedCompletion = undispatchedCompletion((e) dVar);
        if (undispatchedCoroutineUndispatchedCompletion != null) {
            undispatchedCoroutineUndispatchedCompletion.saveThreadContext(mVar, obj);
        }
        return undispatchedCoroutineUndispatchedCompletion;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> T withContinuationContext(zu.d<?> r2, java.lang.Object r3, kv.a r4) {
        /*
            zu.m r0 = r2.getContext()
            java.lang.Object r3 = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(r0, r3)
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.internal.ThreadContextKt.NO_THREAD_ELEMENTS
            if (r3 == r1) goto L11
            kotlinx.coroutines.UndispatchedCoroutine r2 = updateUndispatchedCompletion(r2, r0, r3)
            goto L12
        L11:
            r2 = 0
        L12:
            r1 = 1
            java.lang.Object r4 = r4.invoke()     // Catch: java.lang.Throwable -> L29
            kotlin.jvm.internal.b0.finallyStart(r1)
            if (r2 == 0) goto L22
            boolean r2 = r2.clearThreadContext()
            if (r2 == 0) goto L25
        L22:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r0, r3)
        L25:
            kotlin.jvm.internal.b0.finallyEnd(r1)
            return r4
        L29:
            r4 = move-exception
            kotlin.jvm.internal.b0.finallyStart(r1)
            if (r2 == 0) goto L35
            boolean r2 = r2.clearThreadContext()
            if (r2 == 0) goto L38
        L35:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r0, r3)
        L38:
            kotlin.jvm.internal.b0.finallyEnd(r1)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.CoroutineContextKt.withContinuationContext(zu.d, java.lang.Object, kv.a):java.lang.Object");
    }

    public static final <T> T withCoroutineContext(m mVar, Object obj, kv.a aVar) {
        Object objUpdateThreadContext = ThreadContextKt.updateThreadContext(mVar, obj);
        try {
            return (T) aVar.invoke();
        } finally {
            b0.finallyStart(1);
            ThreadContextKt.restoreThreadContext(mVar, objUpdateThreadContext);
            b0.finallyEnd(1);
        }
    }

    public static final m newCoroutineContext(m mVar, m mVar2) {
        return !hasCopyableElements(mVar2) ? mVar.plus(mVar2) : foldCopies(mVar, mVar2, false);
    }
}
