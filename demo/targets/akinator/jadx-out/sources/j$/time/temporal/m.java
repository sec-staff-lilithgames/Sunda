package j$.time.temporal;

import java.util.Objects;

/* loaded from: classes3.dex */
public interface m {
    boolean e(p pVar);

    long f(p pVar);

    default t i(p pVar) {
        if (!(pVar instanceof a)) {
            Objects.requireNonNull(pVar, "field");
            return pVar.t(this);
        }
        if (e(pVar)) {
            return ((a) pVar).f68639b;
        }
        throw new s(j$.time.d.a("Unsupported field: ", pVar));
    }

    default int d(p pVar) {
        t tVarI = i(pVar);
        if (tVarI.f68663a < -2147483648L || tVarI.f68666d > 2147483647L) {
            throw new s("Invalid field " + pVar + " for get() method, use getLong() instead");
        }
        long jF = f(pVar);
        if (tVarI.d(jF)) {
            return (int) jF;
        }
        throw new j$.time.c("Invalid value for " + pVar + " (valid values " + tVarI + "): " + jF);
    }

    default Object b(j$.time.format.a aVar) {
        if (aVar == q.f68656a || aVar == q.f68657b || aVar == q.f68658c) {
            return null;
        }
        return aVar.a(this);
    }
}
