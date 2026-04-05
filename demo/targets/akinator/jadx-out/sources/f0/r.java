package f0;

import kotlin.jvm.internal.e0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final MutableSharedFlow f55271a = SharedFlowKt.MutableSharedFlow$default(0, 16, BufferOverflow.DROP_OLDEST, 1, null);

    @Override // f0.q
    public Object emit(n nVar, zu.d<? super x0> dVar) {
        Object objEmit = getInteractions().emit(nVar, dVar);
        return objEmit == av.e.getCOROUTINE_SUSPENDED() ? objEmit : x0.f87415a;
    }

    @Override // f0.q
    public boolean tryEmit(n interaction) {
        e0.checkNotNullParameter(interaction, "interaction");
        return getInteractions().tryEmit(interaction);
    }

    @Override // f0.q, f0.o
    public MutableSharedFlow<n> getInteractions() {
        return this.f55271a;
    }
}
