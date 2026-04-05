package j$.time.chrono;

import j$.time.LocalDateTime;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public interface m extends Comparable {
    boolean H(long j10);

    boolean equals(Object obj);

    int hashCode();

    String k();

    String o();

    b q(int i10);

    String toString();

    n u(int i10);

    b x(j$.time.temporal.m mVar);

    static m l(j$.time.temporal.m mVar) {
        Objects.requireNonNull(mVar, "temporal");
        m mVar2 = (m) mVar.b(j$.time.temporal.q.f68657b);
        t tVar = t.f68512c;
        if (mVar2 != null) {
            return mVar2;
        }
        Objects.requireNonNull(tVar, "defaultObj");
        return tVar;
    }

    static m of(String str) {
        ConcurrentHashMap concurrentHashMap = a.f68467a;
        Objects.requireNonNull(str, "id");
        while (true) {
            ConcurrentHashMap concurrentHashMap2 = a.f68467a;
            m mVar = (m) concurrentHashMap2.get(str);
            if (mVar == null) {
                mVar = (m) a.f68468b.get(str);
            }
            if (mVar != null) {
                return mVar;
            }
            if (concurrentHashMap2.get("ISO") != null) {
                Iterator it = ServiceLoader.load(m.class).iterator();
                while (it.hasNext()) {
                    m mVar2 = (m) it.next();
                    if (str.equals(mVar2.k()) || str.equals(mVar2.o())) {
                        return mVar2;
                    }
                }
                throw new j$.time.c("Unknown chronology: ".concat(str));
            }
            p pVar = p.f68496l;
            pVar.getClass();
            a.r(pVar, "Hijrah-umalqura");
            w wVar = w.f68515c;
            wVar.getClass();
            a.r(wVar, "Japanese");
            b0 b0Var = b0.f68470c;
            b0Var.getClass();
            a.r(b0Var, "Minguo");
            h0 h0Var = h0.f68486c;
            h0Var.getClass();
            a.r(h0Var, "ThaiBuddhist");
            try {
                for (a aVar : Arrays.asList(new a[0])) {
                    if (!aVar.k().equals("ISO")) {
                        a.r(aVar, aVar.k());
                    }
                }
                t tVar = t.f68512c;
                tVar.getClass();
                a.r(tVar, "ISO");
            } catch (Throwable th2) {
                throw new ServiceConfigurationError(th2.getMessage(), th2);
            }
        }
    }

    default e y(LocalDateTime localDateTime) {
        try {
            return x(localDateTime).A(j$.time.k.D(localDateTime));
        } catch (j$.time.c e10) {
            throw new j$.time.c("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + LocalDateTime.class, e10);
        }
    }
}
