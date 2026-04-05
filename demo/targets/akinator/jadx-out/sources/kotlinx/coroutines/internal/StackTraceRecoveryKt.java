package kotlinx.coroutines.internal;

import a.c;
import bv.e;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.jvm.internal.e0;
import sv.k0;
import tu.a0;
import tu.v;
import tu.z;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class StackTraceRecoveryKt {
    private static final StackTraceElement ARTIFICIAL_FRAME = new a.a().coroutineBoundary();
    private static final String baseContinuationImplClass = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
    private static final String baseContinuationImplClassName;
    private static final String stackTraceRecoveryClass = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
    private static final String stackTraceRecoveryClassName;

    static {
        Object objM7131constructorimpl;
        Object objM7131constructorimpl2;
        try {
            int i10 = z.f87419c;
            objM7131constructorimpl = z.m7131constructorimpl(bv.a.class.getCanonicalName());
        } catch (Throwable th2) {
            int i11 = z.f87419c;
            objM7131constructorimpl = z.m7131constructorimpl(a0.createFailure(th2));
        }
        if (z.m7134exceptionOrNullimpl(objM7131constructorimpl) != null) {
            objM7131constructorimpl = baseContinuationImplClass;
        }
        baseContinuationImplClassName = (String) objM7131constructorimpl;
        try {
            objM7131constructorimpl2 = z.m7131constructorimpl(StackTraceRecoveryKt.class.getCanonicalName());
        } catch (Throwable th3) {
            int i12 = z.f87419c;
            objM7131constructorimpl2 = z.m7131constructorimpl(a0.createFailure(th3));
        }
        if (z.m7134exceptionOrNullimpl(objM7131constructorimpl2) != null) {
            objM7131constructorimpl2 = stackTraceRecoveryClass;
        }
        stackTraceRecoveryClassName = (String) objM7131constructorimpl2;
    }

    private static final <E extends Throwable> v causeAndStacktrace(E e10) {
        Throwable cause = e10.getCause();
        if (cause == null || !e0.areEqual(cause.getClass(), e10.getClass())) {
            return tu.e0.to(e10, new StackTraceElement[0]);
        }
        StackTraceElement[] stackTrace = e10.getStackTrace();
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (isArtificial(stackTraceElement)) {
                return tu.e0.to(cause, stackTrace);
            }
        }
        return tu.e0.to(e10, new StackTraceElement[0]);
    }

    private static final <E extends Throwable> E createFinalException(E e10, E e11, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(ARTIFICIAL_FRAME);
        StackTraceElement[] stackTrace = e10.getStackTrace();
        int iFirstFrameIndex = firstFrameIndex(stackTrace, baseContinuationImplClassName);
        int i10 = 0;
        if (iFirstFrameIndex == -1) {
            e11.setStackTrace((StackTraceElement[]) arrayDeque.toArray(new StackTraceElement[0]));
            return e11;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[arrayDeque.size() + iFirstFrameIndex];
        for (int i11 = 0; i11 < iFirstFrameIndex; i11++) {
            stackTraceElementArr[i11] = stackTrace[i11];
        }
        Iterator<T> it = arrayDeque.iterator();
        while (it.hasNext()) {
            stackTraceElementArr[i10 + iFirstFrameIndex] = (StackTraceElement) it.next();
            i10++;
        }
        e11.setStackTrace(stackTraceElementArr);
        return e11;
    }

    private static final ArrayDeque<StackTraceElement> createStackTrace(e eVar) {
        ArrayDeque<StackTraceElement> arrayDeque = new ArrayDeque<>();
        StackTraceElement stackTraceElement = eVar.getStackTraceElement();
        if (stackTraceElement != null) {
            arrayDeque.add(stackTraceElement);
        }
        while (true) {
            eVar = eVar.getCallerFrame();
            if (eVar == null) {
                return arrayDeque;
            }
            StackTraceElement stackTraceElement2 = eVar.getStackTraceElement();
            if (stackTraceElement2 != null) {
                arrayDeque.add(stackTraceElement2);
            }
        }
    }

    private static final boolean elementWiseEquals(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        return stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && e0.areEqual(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && e0.areEqual(stackTraceElement.getFileName(), stackTraceElement2.getFileName()) && e0.areEqual(stackTraceElement.getClassName(), stackTraceElement2.getClassName());
    }

    private static final int firstFrameIndex(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (e0.areEqual(str, stackTraceElementArr[i10].getClassName())) {
                return i10;
            }
        }
        return -1;
    }

    public static final void initCause(Throwable th2, Throwable th3) {
        th2.initCause(th3);
    }

    public static final boolean isArtificial(StackTraceElement stackTraceElement) {
        return k0.startsWith$default(stackTraceElement.getClassName(), c.getARTIFICIAL_FRAME_PACKAGE_NAME(), false, 2, null);
    }

    private static final void mergeRecoveredTraces(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            } else if (isArtificial(stackTraceElementArr[i10])) {
                break;
            } else {
                i10++;
            }
        }
        int i11 = i10 + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (i11 > length2) {
            return;
        }
        while (true) {
            if (elementWiseEquals(stackTraceElementArr[length2], arrayDeque.getLast())) {
                arrayDeque.removeLast();
            }
            arrayDeque.addFirst(stackTraceElementArr[length2]);
            if (length2 == i11) {
                return;
            } else {
                length2--;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E extends Throwable> E recoverFromStackFrame(E e10, e eVar) {
        v vVarCauseAndStacktrace = causeAndStacktrace(e10);
        Throwable th2 = (Throwable) vVarCauseAndStacktrace.component1();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) vVarCauseAndStacktrace.component2();
        Throwable thTryCopyException = ExceptionsConstructorKt.tryCopyException(th2);
        if (thTryCopyException != null) {
            ArrayDeque<StackTraceElement> arrayDequeCreateStackTrace = createStackTrace(eVar);
            if (!arrayDequeCreateStackTrace.isEmpty()) {
                if (th2 != e10) {
                    mergeRecoveredTraces(stackTraceElementArr, arrayDequeCreateStackTrace);
                }
                return (E) createFinalException(th2, thTryCopyException, arrayDequeCreateStackTrace);
            }
        }
        return e10;
    }

    public static final <E extends Throwable> E recoverStackTrace(E e10) {
        return e10;
    }

    private static final <E extends Throwable> E sanitizeStackTrace(E e10) {
        StackTraceElement[] stackTrace = e10.getStackTrace();
        int length = stackTrace.length;
        int length2 = stackTrace.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i10 = length2 - 1;
                if (e0.areEqual(stackTraceRecoveryClassName, stackTrace[length2].getClassName())) {
                    break;
                }
                if (i10 < 0) {
                    break;
                }
                length2 = i10;
            }
            length2 = -1;
        } else {
            length2 = -1;
        }
        int i11 = length2 + 1;
        int iFirstFrameIndex = firstFrameIndex(stackTrace, baseContinuationImplClassName);
        int i12 = 0;
        int i13 = (length - length2) - (iFirstFrameIndex == -1 ? 0 : length - iFirstFrameIndex);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i13];
        while (i12 < i13) {
            stackTraceElementArr[i12] = i12 == 0 ? ARTIFICIAL_FRAME : stackTrace[(i11 + i12) - 1];
            i12++;
        }
        e10.setStackTrace(stackTraceElementArr);
        return e10;
    }

    public static final <E extends Throwable> E unwrapImpl(E e10) {
        E e11 = (E) e10.getCause();
        if (e11 != null && e0.areEqual(e11.getClass(), e10.getClass())) {
            for (StackTraceElement stackTraceElement : e10.getStackTrace()) {
                if (isArtificial(stackTraceElement)) {
                    return e11;
                }
            }
        }
        return e10;
    }

    public static final <E extends Throwable> E recoverStackTrace(E e10, d<?> dVar) {
        return e10;
    }

    public static final <E extends Throwable> E unwrap(E e10) {
        return e10;
    }

    public static final Object recoverAndThrow(Throwable th2, d<?> dVar) throws Throwable {
        throw th2;
    }

    private static final Object recoverAndThrow$$forInline(Throwable th2, d<?> dVar) throws Throwable {
        throw th2;
    }
}
