package j$.time.chrono;

import j$.time.temporal.ChronoUnit;

/* loaded from: classes3.dex */
public interface n extends j$.time.temporal.m, j$.time.temporal.n {
    int getValue();

    @Override // j$.time.temporal.m
    default boolean e(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar == j$.time.temporal.a.ERA : pVar != null && pVar.r(this);
    }

    @Override // j$.time.temporal.m
    default int d(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.ERA) {
            return getValue();
        }
        return super.d(pVar);
    }

    @Override // j$.time.temporal.m
    default long f(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.ERA) {
            return getValue();
        }
        if (pVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.s(j$.time.d.a("Unsupported field: ", pVar));
        }
        return pVar.D(this);
    }

    @Override // j$.time.temporal.m
    default Object b(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.q.f68658c) {
            return ChronoUnit.ERAS;
        }
        return super.b(aVar);
    }

    @Override // j$.time.temporal.n
    default j$.time.temporal.l c(j$.time.temporal.l lVar) {
        return lVar.g(getValue(), j$.time.temporal.a.ERA);
    }
}
