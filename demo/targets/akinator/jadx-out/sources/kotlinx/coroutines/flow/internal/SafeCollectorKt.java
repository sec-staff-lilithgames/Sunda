package kotlinx.coroutines.flow.internal;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.h1;
import kv.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class SafeCollectorKt {
    private static final q emitFun;

    static {
        SafeCollectorKt$emitFun$1 safeCollectorKt$emitFun$1 = SafeCollectorKt$emitFun$1.INSTANCE;
        e0.checkNotNull(safeCollectorKt$emitFun$1, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        emitFun = (q) h1.beforeCheckcastToFunctionOfArity(safeCollectorKt$emitFun$1, 3);
    }

    private static /* synthetic */ void getEmitFun$annotations() {
    }
}
