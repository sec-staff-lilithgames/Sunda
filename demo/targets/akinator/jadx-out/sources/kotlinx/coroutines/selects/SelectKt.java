package kotlinx.coroutines.selects;

import kotlin.jvm.internal.b0;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.internal.Symbol;
import kv.l;
import kv.q;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class SelectKt {
    private static final int TRY_SELECT_ALREADY_SELECTED = 3;
    private static final int TRY_SELECT_CANCELLED = 2;
    private static final int TRY_SELECT_REREGISTER = 1;
    private static final int TRY_SELECT_SUCCESSFUL = 0;
    private static final q DUMMY_PROCESS_RESULT_FUNCTION = new q() { // from class: kotlinx.coroutines.selects.SelectKt$DUMMY_PROCESS_RESULT_FUNCTION$1
        @Override // kv.q
        public final Void invoke(Object obj, Object obj2, Object obj3) {
            return null;
        }
    };
    private static final Symbol STATE_REG = new Symbol("STATE_REG");
    private static final Symbol STATE_COMPLETED = new Symbol("STATE_COMPLETED");
    private static final Symbol STATE_CANCELLED = new Symbol("STATE_CANCELLED");
    private static final Symbol NO_RESULT = new Symbol("NO_RESULT");
    private static final Symbol PARAM_CLAUSE_0 = new Symbol("PARAM_CLAUSE_0");

    /* JADX INFO: Access modifiers changed from: private */
    public static final TrySelectDetailedResult TrySelectDetailedResult(int i10) {
        if (i10 == 0) {
            return TrySelectDetailedResult.SUCCESSFUL;
        }
        if (i10 == 1) {
            return TrySelectDetailedResult.REREGISTER;
        }
        if (i10 == 2) {
            return TrySelectDetailedResult.CANCELLED;
        }
        if (i10 == 3) {
            return TrySelectDetailedResult.ALREADY_SELECTED;
        }
        throw new IllegalStateException(("Unexpected internal result: " + i10).toString());
    }

    public static final Symbol getPARAM_CLAUSE_0() {
        return PARAM_CLAUSE_0;
    }

    public static final <R> Object select(l lVar, d<? super R> dVar) {
        SelectImplementation selectImplementation = new SelectImplementation(dVar.getContext());
        lVar.invoke(selectImplementation);
        return selectImplementation.doSelect(dVar);
    }

    private static final <R> Object select$$forInline(l lVar, d<? super R> dVar) {
        b0.mark(3);
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean tryResume(CancellableContinuation<? super x0> cancellableContinuation, q qVar) {
        Object objTryResume = cancellableContinuation.tryResume(x0.f87415a, null, qVar);
        if (objTryResume == null) {
            return false;
        }
        cancellableContinuation.completeResume(objTryResume);
        return true;
    }

    public static /* synthetic */ void OnCancellationConstructor$annotations() {
    }

    public static /* synthetic */ void ProcessResultFunction$annotations() {
    }

    public static /* synthetic */ void RegistrationFunction$annotations() {
    }
}
