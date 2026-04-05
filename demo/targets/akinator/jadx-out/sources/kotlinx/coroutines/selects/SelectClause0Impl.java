package kotlinx.coroutines.selects;

import kotlin.jvm.internal.u;
import kv.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class SelectClause0Impl implements SelectClause0 {
    private final Object clauseObject;
    private final q onCancellationConstructor;
    private final q processResFunc;
    private final q regFunc;

    public SelectClause0Impl(Object obj, q qVar, q qVar2) {
        this.clauseObject = obj;
        this.regFunc = qVar;
        this.onCancellationConstructor = qVar2;
        this.processResFunc = SelectKt.DUMMY_PROCESS_RESULT_FUNCTION;
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    public Object getClauseObject() {
        return this.clauseObject;
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    public q getOnCancellationConstructor() {
        return this.onCancellationConstructor;
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    public q getProcessResFunc() {
        return this.processResFunc;
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    public q getRegFunc() {
        return this.regFunc;
    }

    public /* synthetic */ SelectClause0Impl(Object obj, q qVar, q qVar2, int i10, u uVar) {
        this(obj, qVar, (i10 & 4) != 0 ? null : qVar2);
    }
}
