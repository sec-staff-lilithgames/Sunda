package z4;

import androidx.lifecycle.b1;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import kv.p;
import p0.d0;
import p0.v;
import p0.v5;
import p0.w;
import p0.z4;
import zu.m;
import zu.n;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class f {
    public static final <T> v5 collectAsStateWithLifecycle(StateFlow<? extends T> stateFlow, b1 b1Var, j0 j0Var, m mVar, w wVar, int i10, int i11) {
        if ((i11 & 1) != 0) {
            b1Var = (b1) wVar.consume(g.getLocalLifecycleOwner());
        }
        if ((i11 & 2) != 0) {
            j0Var = j0.f6617f;
        }
        j0 j0Var2 = j0Var;
        if ((i11 & 4) != 0) {
            mVar = n.f98854b;
        }
        m mVar2 = mVar;
        if (d0.isTraceInProgress()) {
            d0.traceEventStart(743249048, i10, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:62)");
        }
        T value = stateFlow.getValue();
        k0 lifecycle = b1Var.getLifecycle();
        int i12 = i10 << 3;
        v5 v5VarCollectAsStateWithLifecycle = collectAsStateWithLifecycle(stateFlow, value, lifecycle, j0Var2, mVar2, wVar, (i10 & 14) | (i12 & 7168) | (i12 & 57344), 0);
        if (d0.isTraceInProgress()) {
            d0.traceEventEnd();
        }
        return v5VarCollectAsStateWithLifecycle;
    }

    public static final <T> v5 collectAsStateWithLifecycle(StateFlow<? extends T> stateFlow, k0 k0Var, j0 j0Var, m mVar, w wVar, int i10, int i11) {
        if ((i11 & 2) != 0) {
            j0Var = j0.f6617f;
        }
        j0 j0Var2 = j0Var;
        if ((i11 & 4) != 0) {
            mVar = n.f98854b;
        }
        m mVar2 = mVar;
        if (d0.isTraceInProgress()) {
            d0.traceEventStart(-1858162195, i10, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:99)");
        }
        int i12 = i10 << 3;
        v5 v5VarCollectAsStateWithLifecycle = collectAsStateWithLifecycle(stateFlow, stateFlow.getValue(), k0Var, j0Var2, mVar2, wVar, (i10 & 14) | (i12 & 896) | (i12 & 7168) | (i12 & 57344), 0);
        if (d0.isTraceInProgress()) {
            d0.traceEventEnd();
        }
        return v5VarCollectAsStateWithLifecycle;
    }

    public static final <T> v5 collectAsStateWithLifecycle(Flow<? extends T> flow, T t10, b1 b1Var, j0 j0Var, m mVar, w wVar, int i10, int i11) {
        if ((i11 & 2) != 0) {
            b1Var = (b1) wVar.consume(g.getLocalLifecycleOwner());
        }
        if ((i11 & 4) != 0) {
            j0Var = j0.f6617f;
        }
        j0 j0Var2 = j0Var;
        if ((i11 & 8) != 0) {
            mVar = n.f98854b;
        }
        m mVar2 = mVar;
        if (d0.isTraceInProgress()) {
            d0.traceEventStart(-1485997211, i10, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:138)");
        }
        v5 v5VarCollectAsStateWithLifecycle = collectAsStateWithLifecycle(flow, t10, b1Var.getLifecycle(), j0Var2, mVar2, wVar, (i10 & 14) | (((i10 >> 3) & 8) << 3) | (i10 & 112) | (i10 & 7168) | (57344 & i10), 0);
        if (d0.isTraceInProgress()) {
            d0.traceEventEnd();
        }
        return v5VarCollectAsStateWithLifecycle;
    }

    public static final <T> v5 collectAsStateWithLifecycle(Flow<? extends T> flow, T t10, k0 k0Var, j0 j0Var, m mVar, w wVar, int i10, int i11) {
        if ((i11 & 4) != 0) {
            j0Var = j0.f6617f;
        }
        j0 j0Var2 = j0Var;
        if ((i11 & 8) != 0) {
            mVar = n.f98854b;
        }
        m mVar2 = mVar;
        if (d0.isTraceInProgress()) {
            d0.traceEventStart(1977777920, i10, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:174)");
        }
        Object[] objArr = {flow, k0Var, j0Var2, mVar2};
        boolean zChangedInstance = wVar.changedInstance(k0Var) | ((((i10 & 7168) ^ 3072) > 2048 && wVar.changed(j0Var2.ordinal())) || (i10 & 3072) == 2048) | wVar.changedInstance(mVar2) | wVar.changedInstance(flow);
        Object objRememberedValue = wVar.rememberedValue();
        if (zChangedInstance || objRememberedValue == v.f80515a.getEmpty()) {
            e eVar = new e(k0Var, j0Var2, mVar2, flow, null);
            wVar.updateRememberedValue(eVar);
            objRememberedValue = eVar;
        }
        v5 v5VarProduceState = z4.produceState((Object) t10, objArr, (p) objRememberedValue, wVar, (i10 >> 3) & 14);
        if (d0.isTraceInProgress()) {
            d0.traceEventEnd();
        }
        return v5VarProduceState;
    }
}
