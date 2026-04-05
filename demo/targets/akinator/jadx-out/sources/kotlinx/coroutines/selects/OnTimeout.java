package kotlinx.coroutines.selects;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.h1;
import kotlinx.coroutines.DelayKt;
import kv.q;
import tu.x0;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class OnTimeout {
    private final long timeMillis;

    public OnTimeout(long j10) {
        this.timeMillis = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void register(final SelectInstance<?> selectInstance, Object obj) {
        if (this.timeMillis <= 0) {
            selectInstance.selectInRegistrationPhase(x0.f87415a);
            return;
        }
        Runnable runnable = new Runnable() { // from class: kotlinx.coroutines.selects.a
            @Override // java.lang.Runnable
            public final void run() {
                OnTimeout.register$lambda$0(selectInstance, this);
            }
        };
        e0.checkNotNull(selectInstance, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        SelectImplementation selectImplementation = (SelectImplementation) selectInstance;
        m context = selectImplementation.getContext();
        selectImplementation.disposeOnCompletion(DelayKt.getDelay(context).invokeOnTimeout(this.timeMillis, runnable, context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void register$lambda$0(SelectInstance selectInstance, OnTimeout onTimeout) {
        selectInstance.trySelect(onTimeout, x0.f87415a);
    }

    public final SelectClause0 getSelectClause() {
        OnTimeout$selectClause$1 onTimeout$selectClause$1 = OnTimeout$selectClause$1.INSTANCE;
        e0.checkNotNull(onTimeout$selectClause$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        return new SelectClause0Impl(this, (q) h1.beforeCheckcastToFunctionOfArity(onTimeout$selectClause$1, 3), null, 4, null);
    }

    public static /* synthetic */ void getSelectClause$annotations() {
    }
}
