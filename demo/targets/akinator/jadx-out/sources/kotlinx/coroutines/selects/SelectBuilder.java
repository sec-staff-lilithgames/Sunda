package kotlinx.coroutines.selects;

import kv.l;
import kv.p;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface SelectBuilder<R> {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        public static <R, P, Q> void invoke(SelectBuilder<? super R> selectBuilder, SelectClause2<? super P, ? extends Q> selectClause2, p pVar) {
            selectBuilder.invoke(selectClause2, null, pVar);
        }

        @f
        public static <R> void onTimeout(SelectBuilder<? super R> selectBuilder, long j10, l lVar) {
            OnTimeoutKt.onTimeout(selectBuilder, j10, lVar);
        }
    }

    void invoke(SelectClause0 selectClause0, l lVar);

    <Q> void invoke(SelectClause1<? extends Q> selectClause1, p pVar);

    <P, Q> void invoke(SelectClause2<? super P, ? extends Q> selectClause2, P p10, p pVar);

    <P, Q> void invoke(SelectClause2<? super P, ? extends Q> selectClause2, p pVar);

    @f
    void onTimeout(long j10, l lVar);
}
