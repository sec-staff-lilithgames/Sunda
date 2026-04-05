package o5;

import java.util.Set;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes.dex */
public abstract class f1 {
    @tu.f
    public static final Flow<Set<String>> invalidationTrackerFlow(y0 y0Var, String[] strArr, boolean z10) {
        return o1.invalidationTrackerFlow(y0Var, strArr, z10);
    }

    public static final <R> Object useReaderConnection(y0 y0Var, kv.p pVar, zu.d<? super R> dVar) {
        return j1.useReaderConnection(y0Var, pVar, dVar);
    }

    public static final <R> Object useWriterConnection(y0 y0Var, kv.p pVar, zu.d<? super R> dVar) {
        return j1.useWriterConnection(y0Var, pVar, dVar);
    }

    public static final void validateAutoMigrations(y0 y0Var, l lVar) {
        j1.validateAutoMigrations(y0Var, lVar);
    }

    public static final void validateMigrationsNotRequired(Set<Integer> set, Set<Integer> set2) {
        j1.validateMigrationsNotRequired(set, set2);
    }

    public static final void validateTypeConverters(y0 y0Var, l lVar) {
        j1.validateTypeConverters(y0Var, lVar);
    }

    public static final <R> Object withTransaction(y0 y0Var, kv.l lVar, zu.d<? super R> dVar) {
        return o1.withTransaction(y0Var, lVar, dVar);
    }

    public static final <R> Object withTransactionContext(y0 y0Var, kv.l lVar, zu.d<? super R> dVar) {
        return o1.withTransactionContext(y0Var, lVar, dVar);
    }
}
