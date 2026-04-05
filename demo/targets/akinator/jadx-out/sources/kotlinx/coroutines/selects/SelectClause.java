package kotlinx.coroutines.selects;

import kv.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface SelectClause {
    Object getClauseObject();

    q getOnCancellationConstructor();

    q getProcessResFunc();

    q getRegFunc();
}
