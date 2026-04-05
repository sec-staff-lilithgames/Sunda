package kotlinx.coroutines.internal;

import kotlin.jvm.internal.e0;
import kotlinx.coroutines.ThreadContextElement;
import kv.p;
import zu.k;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ThreadContextKt {
    public static final Symbol NO_THREAD_ELEMENTS = new Symbol("NO_THREAD_ELEMENTS");
    private static final p countAll;
    private static final p findOne;
    private static final p updateState;

    static {
        final int i10 = 1;
        countAll = new p() { // from class: kotlinx.coroutines.internal.b
            @Override // kv.p
            public final Object invoke(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        return ThreadContextKt.updateState$lambda$2((ThreadState) obj, (k) obj2);
                    case 1:
                        return ThreadContextKt.countAll$lambda$0(obj, (k) obj2);
                    default:
                        return ThreadContextKt.findOne$lambda$1((ThreadContextElement) obj, (k) obj2);
                }
            }
        };
        final int i11 = 2;
        findOne = new p() { // from class: kotlinx.coroutines.internal.b
            @Override // kv.p
            public final Object invoke(Object obj, Object obj2) {
                switch (i11) {
                    case 0:
                        return ThreadContextKt.updateState$lambda$2((ThreadState) obj, (k) obj2);
                    case 1:
                        return ThreadContextKt.countAll$lambda$0(obj, (k) obj2);
                    default:
                        return ThreadContextKt.findOne$lambda$1((ThreadContextElement) obj, (k) obj2);
                }
            }
        };
        final int i12 = 0;
        updateState = new p() { // from class: kotlinx.coroutines.internal.b
            @Override // kv.p
            public final Object invoke(Object obj, Object obj2) {
                switch (i12) {
                    case 0:
                        return ThreadContextKt.updateState$lambda$2((ThreadState) obj, (k) obj2);
                    case 1:
                        return ThreadContextKt.countAll$lambda$0(obj, (k) obj2);
                    default:
                        return ThreadContextKt.findOne$lambda$1((ThreadContextElement) obj, (k) obj2);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object countAll$lambda$0(Object obj, k kVar) {
        if (!(kVar instanceof ThreadContextElement)) {
            return obj;
        }
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int iIntValue = num != null ? num.intValue() : 1;
        return iIntValue == 0 ? kVar : Integer.valueOf(iIntValue + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ThreadContextElement<?> findOne$lambda$1(ThreadContextElement<?> threadContextElement, k kVar) {
        if (threadContextElement != null) {
            return threadContextElement;
        }
        if (kVar instanceof ThreadContextElement) {
            return (ThreadContextElement) kVar;
        }
        return null;
    }

    public static final void restoreThreadContext(m mVar, Object obj) {
        if (obj == NO_THREAD_ELEMENTS) {
            return;
        }
        if (obj instanceof ThreadState) {
            ((ThreadState) obj).restore(mVar);
            return;
        }
        Object objFold = mVar.fold(null, findOne);
        e0.checkNotNull(objFold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((ThreadContextElement) objFold).restoreThreadContext(mVar, obj);
    }

    public static final Object threadContextElements(m mVar) {
        Object objFold = mVar.fold(0, countAll);
        e0.checkNotNull(objFold);
        return objFold;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ThreadState updateState$lambda$2(ThreadState threadState, k kVar) {
        if (kVar instanceof ThreadContextElement) {
            ThreadContextElement<?> threadContextElement = (ThreadContextElement) kVar;
            threadState.append(threadContextElement, threadContextElement.updateThreadContext(threadState.context));
        }
        return threadState;
    }

    public static final Object updateThreadContext(m mVar, Object obj) {
        if (obj == null) {
            obj = threadContextElements(mVar);
        }
        if (obj == 0) {
            return NO_THREAD_ELEMENTS;
        }
        if (obj instanceof Integer) {
            return mVar.fold(new ThreadState(mVar, ((Number) obj).intValue()), updateState);
        }
        e0.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((ThreadContextElement) obj).updateThreadContext(mVar);
    }
}
