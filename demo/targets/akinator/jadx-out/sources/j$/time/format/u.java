package j$.time.format;

import j$.time.ZoneId;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final j$.time.temporal.m f68588a;

    /* renamed from: b, reason: collision with root package name */
    public final DateTimeFormatter f68589b;

    /* renamed from: c, reason: collision with root package name */
    public int f68590c;

    public u(j$.time.temporal.m mVar, DateTimeFormatter dateTimeFormatter) {
        j$.time.chrono.m mVar2 = dateTimeFormatter.f68534d;
        if (mVar2 != null) {
            j$.time.chrono.m mVar3 = (j$.time.chrono.m) mVar.b(j$.time.temporal.q.f68657b);
            ZoneId zoneId = (ZoneId) mVar.b(j$.time.temporal.q.f68656a);
            j$.time.chrono.b bVarX = null;
            mVar2 = Objects.equals(mVar2, mVar3) ? null : mVar2;
            if (mVar2 != null) {
                j$.time.chrono.m mVar4 = mVar2 != null ? mVar2 : mVar3;
                if (mVar2 != null) {
                    if (mVar.e(j$.time.temporal.a.EPOCH_DAY)) {
                        bVarX = mVar4.x(mVar);
                    } else if (mVar2 != j$.time.chrono.t.f68512c || mVar3 != null) {
                        for (j$.time.temporal.a aVar : j$.time.temporal.a.values()) {
                            if (aVar.isDateBased() && mVar.e(aVar)) {
                                throw new j$.time.c("Unable to apply override chronology '" + mVar2 + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + mVar);
                            }
                        }
                    }
                }
                mVar = new t(bVarX, mVar, mVar4, zoneId);
            }
        }
        this.f68588a = mVar;
        this.f68589b = dateTimeFormatter;
    }

    public final Object b(a aVar) {
        j$.time.temporal.m mVar = this.f68588a;
        Object objB = mVar.b(aVar);
        if (objB != null || this.f68590c != 0) {
            return objB;
        }
        throw new j$.time.c("Unable to extract " + aVar + " from temporal " + mVar);
    }

    public final Long a(j$.time.temporal.p pVar) {
        int i10 = this.f68590c;
        j$.time.temporal.m mVar = this.f68588a;
        if (i10 <= 0 || mVar.e(pVar)) {
            return Long.valueOf(mVar.f(pVar));
        }
        return null;
    }

    public final String toString() {
        return this.f68588a.toString();
    }
}
