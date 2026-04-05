package androidx.lifecycle;

import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class k0 {

    /* renamed from: a, reason: collision with root package name */
    public c f6635a = new c(null);

    public abstract void addObserver(a1 a1Var);

    public abstract j0 getCurrentState();

    public StateFlow<j0> getCurrentStateFlow() {
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(getCurrentState());
        addObserver(new e0(MutableStateFlow, 0));
        return FlowKt.asStateFlow(MutableStateFlow);
    }

    public final c getInternalScopeRef() {
        return this.f6635a;
    }

    public abstract void removeObserver(a1 a1Var);

    public final void setInternalScopeRef(c cVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(cVar, "<set-?>");
        this.f6635a = cVar;
    }
}
