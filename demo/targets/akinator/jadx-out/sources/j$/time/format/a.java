package j$.time.format;

import j$.time.ZoneId;
import j$.time.ZoneOffset;

/* loaded from: classes3.dex */
public final /* synthetic */ class a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f68535a;

    public final Object a(j$.time.temporal.m mVar) {
        switch (this.f68535a) {
            case 0:
                ZoneId zoneId = (ZoneId) mVar.b(j$.time.temporal.q.f68656a);
                if (zoneId == null || (zoneId instanceof ZoneOffset)) {
                    return null;
                }
                return zoneId;
            case 1:
                return (ZoneId) mVar.b(j$.time.temporal.q.f68656a);
            case 2:
                return (j$.time.chrono.m) mVar.b(j$.time.temporal.q.f68657b);
            case 3:
                return (j$.time.temporal.r) mVar.b(j$.time.temporal.q.f68658c);
            case 4:
                j$.time.temporal.a aVar = j$.time.temporal.a.OFFSET_SECONDS;
                if (mVar.e(aVar)) {
                    return ZoneOffset.L(mVar.d(aVar));
                }
                return null;
            case 5:
                ZoneId zoneId2 = (ZoneId) mVar.b(j$.time.temporal.q.f68656a);
                return zoneId2 != null ? zoneId2 : (ZoneId) mVar.b(j$.time.temporal.q.f68659d);
            case 6:
                j$.time.temporal.a aVar2 = j$.time.temporal.a.EPOCH_DAY;
                if (mVar.e(aVar2)) {
                    return j$.time.h.N(mVar.f(aVar2));
                }
                return null;
            default:
                j$.time.temporal.a aVar3 = j$.time.temporal.a.NANO_OF_DAY;
                if (mVar.e(aVar3)) {
                    return j$.time.k.I(mVar.f(aVar3));
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f68535a) {
            case 1:
                return "ZoneId";
            case 2:
                return "Chronology";
            case 3:
                return "Precision";
            case 4:
                return "ZoneOffset";
            case 5:
                return "Zone";
            case 6:
                return "LocalDate";
            case 7:
                return "LocalTime";
            default:
                return super.toString();
        }
    }
}
