package kotlinx.coroutines.selects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.selects.SelectImplementation;
import kv.l;
import kv.p;
import zu.d;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class UnbiasedSelectImplementation<R> extends SelectImplementation<R> {
    private final List<SelectImplementation<R>.ClauseData> clausesToRegister;

    public UnbiasedSelectImplementation(m mVar) {
        super(mVar);
        this.clausesToRegister = new ArrayList();
    }

    public static /* synthetic */ <R> Object doSelect$suspendImpl(UnbiasedSelectImplementation<R> unbiasedSelectImplementation, d<? super R> dVar) {
        unbiasedSelectImplementation.shuffleAndRegisterClauses();
        return super.doSelect(dVar);
    }

    private final void shuffleAndRegisterClauses() {
        try {
            Collections.shuffle(this.clausesToRegister);
            Iterator<T> it = this.clausesToRegister.iterator();
            while (it.hasNext()) {
                SelectImplementation.register$default(this, (SelectImplementation.ClauseData) it.next(), false, 1, null);
            }
        } finally {
            this.clausesToRegister.clear();
        }
    }

    @Override // kotlinx.coroutines.selects.SelectImplementation
    public Object doSelect(d<? super R> dVar) {
        return doSelect$suspendImpl((UnbiasedSelectImplementation) this, (d) dVar);
    }

    @Override // kotlinx.coroutines.selects.SelectImplementation, kotlinx.coroutines.selects.SelectBuilder
    public void invoke(SelectClause0 selectClause0, l lVar) {
        this.clausesToRegister.add(new SelectImplementation.ClauseData(selectClause0.getClauseObject(), selectClause0.getRegFunc(), selectClause0.getProcessResFunc(), SelectKt.getPARAM_CLAUSE_0(), lVar, selectClause0.getOnCancellationConstructor()));
    }

    @Override // kotlinx.coroutines.selects.SelectImplementation, kotlinx.coroutines.selects.SelectBuilder
    public <Q> void invoke(SelectClause1<? extends Q> selectClause1, p pVar) {
        this.clausesToRegister.add(new SelectImplementation.ClauseData(selectClause1.getClauseObject(), selectClause1.getRegFunc(), selectClause1.getProcessResFunc(), null, pVar, selectClause1.getOnCancellationConstructor()));
    }

    @Override // kotlinx.coroutines.selects.SelectImplementation, kotlinx.coroutines.selects.SelectBuilder
    public <P, Q> void invoke(SelectClause2<? super P, ? extends Q> selectClause2, P p10, p pVar) {
        this.clausesToRegister.add(new SelectImplementation.ClauseData(selectClause2.getClauseObject(), selectClause2.getRegFunc(), selectClause2.getProcessResFunc(), p10, pVar, selectClause2.getOnCancellationConstructor()));
    }
}
