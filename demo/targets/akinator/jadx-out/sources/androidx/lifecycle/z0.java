package androidx.lifecycle;

import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class z0 {
    public static final q0 getCoroutineScope(k0 k0Var) {
        s0 s0Var;
        kotlin.jvm.internal.e0.checkNotNullParameter(k0Var, "<this>");
        do {
            s0 s0Var2 = (s0) k0Var.getInternalScopeRef().get();
            if (s0Var2 != null) {
                return s0Var2;
            }
            s0Var = new s0(k0Var, SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain().getImmediate()));
        } while (!k0Var.getInternalScopeRef().compareAndSet(null, s0Var));
        s0Var.register();
        return s0Var;
    }

    public static final Flow<i0> getEventFlow(k0 k0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(k0Var, "<this>");
        return FlowKt.flowOn(FlowKt.callbackFlow(new y0(k0Var, null)), Dispatchers.getMain().getImmediate());
    }
}
