package j$.time.zone;

import com.ironsource.C3191e4;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.chrono.t;
import j$.time.k;
import j$.time.m;
import j$.time.temporal.n;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes3.dex */
public final class f implements Serializable {

    /* renamed from: i, reason: collision with root package name */
    public static final long[] f68716i = new long[0];

    /* renamed from: j, reason: collision with root package name */
    public static final e[] f68717j = new e[0];

    /* renamed from: k, reason: collision with root package name */
    public static final LocalDateTime[] f68718k = new LocalDateTime[0];

    /* renamed from: l, reason: collision with root package name */
    public static final b[] f68719l = new b[0];
    private static final long serialVersionUID = 3044319355680032515L;

    /* renamed from: a, reason: collision with root package name */
    public final long[] f68720a;

    /* renamed from: b, reason: collision with root package name */
    public final ZoneOffset[] f68721b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f68722c;

    /* renamed from: d, reason: collision with root package name */
    public final LocalDateTime[] f68723d;

    /* renamed from: e, reason: collision with root package name */
    public final ZoneOffset[] f68724e;

    /* renamed from: f, reason: collision with root package name */
    public final e[] f68725f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeZone f68726g;

    /* renamed from: h, reason: collision with root package name */
    public final transient ConcurrentMap f68727h = new ConcurrentHashMap();

    public static Object a(LocalDateTime localDateTime, b bVar) {
        LocalDateTime localDateTime2 = bVar.f68702b;
        if (bVar.r()) {
            if (localDateTime.D(localDateTime2)) {
                return bVar.f68703c;
            }
            if (!localDateTime.D(bVar.f68702b.K(bVar.f68704d.f68463b - bVar.f68703c.f68463b))) {
                return bVar.f68704d;
            }
        } else {
            if (!localDateTime.D(localDateTime2)) {
                return bVar.f68704d;
            }
            if (localDateTime.D(bVar.f68702b.K(bVar.f68704d.f68463b - bVar.f68703c.f68463b))) {
                return bVar.f68703c;
            }
        }
        return bVar;
    }

    public f(long[] jArr, ZoneOffset[] zoneOffsetArr, long[] jArr2, ZoneOffset[] zoneOffsetArr2, e[] eVarArr) {
        this.f68720a = jArr;
        this.f68721b = zoneOffsetArr;
        this.f68722c = jArr2;
        this.f68724e = zoneOffsetArr2;
        this.f68725f = eVarArr;
        if (jArr2.length == 0) {
            this.f68723d = f68718k;
        } else {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (i10 < jArr2.length) {
                int i11 = i10 + 1;
                b bVar = new b(jArr2[i10], zoneOffsetArr2[i10], zoneOffsetArr2[i11]);
                if (bVar.r()) {
                    arrayList.add(bVar.f68702b);
                    arrayList.add(bVar.f68702b.K(bVar.f68704d.f68463b - bVar.f68703c.f68463b));
                } else {
                    arrayList.add(bVar.f68702b.K(bVar.f68704d.f68463b - bVar.f68703c.f68463b));
                    arrayList.add(bVar.f68702b);
                }
                i10 = i11;
            }
            this.f68723d = (LocalDateTime[]) arrayList.toArray(new LocalDateTime[arrayList.size()]);
        }
        this.f68726g = null;
    }

    public f(ZoneOffset zoneOffset) {
        ZoneOffset[] zoneOffsetArr = {zoneOffset};
        this.f68721b = zoneOffsetArr;
        long[] jArr = f68716i;
        this.f68720a = jArr;
        this.f68722c = jArr;
        this.f68723d = f68718k;
        this.f68724e = zoneOffsetArr;
        this.f68725f = f68717j;
        this.f68726g = null;
    }

    public f(TimeZone timeZone) {
        ZoneOffset[] zoneOffsetArr = {h(timeZone.getRawOffset())};
        this.f68721b = zoneOffsetArr;
        long[] jArr = f68716i;
        this.f68720a = jArr;
        this.f68722c = jArr;
        this.f68723d = f68718k;
        this.f68724e = zoneOffsetArr;
        this.f68725f = f68717j;
        this.f68726g = timeZone;
    }

    public static ZoneOffset h(int i10) {
        return ZoneOffset.L(i10 / 1000);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a(this.f68726g != null ? (byte) 100 : (byte) 1, this);
    }

    public static int c(long j10, ZoneOffset zoneOffset) {
        return j$.time.h.N(Math.floorDiv(j10 + zoneOffset.f68463b, 86400)).f68601a;
    }

    public final ZoneOffset d(Instant instant) {
        TimeZone timeZone = this.f68726g;
        if (timeZone != null) {
            return h(timeZone.getOffset(instant.toEpochMilli()));
        }
        if (this.f68722c.length == 0) {
            return this.f68721b[0];
        }
        long epochSecond = instant.getEpochSecond();
        if (this.f68725f.length > 0) {
            if (epochSecond > this.f68722c[r7.length - 1]) {
                b[] bVarArrB = b(c(epochSecond, this.f68724e[r7.length - 1]));
                b bVar = null;
                for (int i10 = 0; i10 < bVarArrB.length; i10++) {
                    bVar = bVarArrB[i10];
                    if (epochSecond < bVar.f68701a) {
                        return bVar.f68703c;
                    }
                }
                return bVar.f68704d;
            }
        }
        int iBinarySearch = Arrays.binarySearch(this.f68722c, epochSecond);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        }
        return this.f68724e[iBinarySearch + 1];
    }

    public final List f(LocalDateTime localDateTime) {
        Object objE = e(localDateTime);
        if (!(objE instanceof b)) {
            return Collections.singletonList((ZoneOffset) objE);
        }
        b bVar = (b) objE;
        if (bVar.r()) {
            return Collections.EMPTY_LIST;
        }
        Object[] objArr = {bVar.f68703c, bVar.f68704d};
        ArrayList arrayList = new ArrayList(2);
        for (int i10 = 0; i10 < 2; i10++) {
            Object obj = objArr[i10];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        if (r8.r(r0) > 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
    
        if (r8.f68454b.P() <= r0.f68454b.P()) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(j$.time.LocalDateTime r8) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.zone.f.e(j$.time.LocalDateTime):java.lang.Object");
    }

    public final b[] b(int i10) {
        j$.time.h hVarT;
        b[] bVarArr = f68719l;
        Integer numValueOf = Integer.valueOf(i10);
        b[] bVarArr2 = (b[]) ((ConcurrentHashMap) this.f68727h).get(numValueOf);
        if (bVarArr2 != null) {
            return bVarArr2;
        }
        long j10 = 1;
        final int i11 = 0;
        final int i12 = 1;
        if (this.f68726g != null) {
            if (i10 < 1800) {
                return bVarArr;
            }
            LocalDateTime localDateTime = LocalDateTime.f68451c;
            j$.time.h hVarM = j$.time.h.M(i10 - 1, 12, 31);
            j$.time.temporal.a.HOUR_OF_DAY.I(0);
            long jP = new LocalDateTime(hVarM, k.f68610h[0]).p(this.f68721b[0]);
            long j11 = 1000;
            int offset = this.f68726g.getOffset(jP * 1000);
            long j12 = 31968000 + jP;
            while (jP < j12) {
                long j13 = jP + 7776000;
                long j14 = j11;
                if (offset != this.f68726g.getOffset(j13 * j14)) {
                    while (j13 - jP > j10) {
                        long jFloorDiv = Math.floorDiv(j13 + jP, 2L);
                        if (this.f68726g.getOffset(jFloorDiv * j14) == offset) {
                            jP = jFloorDiv;
                        } else {
                            j13 = jFloorDiv;
                        }
                        j10 = 1;
                    }
                    if (this.f68726g.getOffset(jP * j14) == offset) {
                        jP = j13;
                    }
                    ZoneOffset zoneOffsetH = h(offset);
                    int offset2 = this.f68726g.getOffset(jP * j14);
                    ZoneOffset zoneOffsetH2 = h(offset2);
                    if (c(jP, zoneOffsetH2) == i10) {
                        bVarArr = (b[]) Arrays.copyOf(bVarArr, bVarArr.length + 1);
                        bVarArr[bVarArr.length - 1] = new b(jP, zoneOffsetH, zoneOffsetH2);
                    }
                    offset = offset2;
                } else {
                    jP = j13;
                }
                j11 = j14;
                j10 = 1;
            }
            if (1916 <= i10 && i10 < 2100) {
                ((ConcurrentHashMap) this.f68727h).putIfAbsent(numValueOf, bVarArr);
            }
            return bVarArr;
        }
        e[] eVarArr = this.f68725f;
        b[] bVarArr3 = new b[eVarArr.length];
        int i13 = 0;
        while (i13 < eVarArr.length) {
            e eVar = eVarArr[i13];
            byte b10 = eVar.f68708b;
            if (b10 < 0) {
                m mVar = eVar.f68707a;
                long j15 = i10;
                int iT = mVar.t(t.f68512c.H(j15)) + 1 + eVar.f68708b;
                j$.time.h hVar = j$.time.h.f68599d;
                j$.time.temporal.a.YEAR.I(j15);
                j$.time.temporal.a.DAY_OF_MONTH.I(iT);
                hVarT = j$.time.h.t(i10, mVar.getValue(), iT);
                j$.time.e eVar2 = eVar.f68709c;
                if (eVar2 != null) {
                    final int value = eVar2.getValue();
                    hVarT = hVarT.h(new n() { // from class: j$.time.temporal.o
                        @Override // j$.time.temporal.n
                        public final l c(l lVar) {
                            switch (i12) {
                                case 0:
                                    int iD = lVar.d(a.DAY_OF_WEEK);
                                    int i14 = value;
                                    if (iD == i14) {
                                        return lVar;
                                    }
                                    return lVar.j(iD - i14 >= 0 ? 7 - r0 : -r0, ChronoUnit.DAYS);
                                default:
                                    int iD2 = lVar.d(a.DAY_OF_WEEK);
                                    int i15 = value;
                                    if (iD2 == i15) {
                                        return lVar;
                                    }
                                    return lVar.a(i15 - iD2 >= 0 ? 7 - r1 : -r1, ChronoUnit.DAYS);
                            }
                        }
                    });
                }
            } else {
                m mVar2 = eVar.f68707a;
                j$.time.h hVar2 = j$.time.h.f68599d;
                j$.time.temporal.a.YEAR.I(i10);
                j$.time.temporal.a.DAY_OF_MONTH.I(b10);
                hVarT = j$.time.h.t(i10, mVar2.getValue(), b10);
                j$.time.e eVar3 = eVar.f68709c;
                if (eVar3 != null) {
                    final int value2 = eVar3.getValue();
                    hVarT = hVarT.h(new n() { // from class: j$.time.temporal.o
                        @Override // j$.time.temporal.n
                        public final l c(l lVar) {
                            switch (i11) {
                                case 0:
                                    int iD = lVar.d(a.DAY_OF_WEEK);
                                    int i14 = value2;
                                    if (iD == i14) {
                                        return lVar;
                                    }
                                    return lVar.j(iD - i14 >= 0 ? 7 - r0 : -r0, ChronoUnit.DAYS);
                                default:
                                    int iD2 = lVar.d(a.DAY_OF_WEEK);
                                    int i15 = value2;
                                    if (iD2 == i15) {
                                        return lVar;
                                    }
                                    return lVar.a(i15 - iD2 >= 0 ? 7 - r1 : -r1, ChronoUnit.DAYS);
                            }
                        }
                    });
                }
            }
            if (eVar.f68711e) {
                hVarT = hVarT.P(1L);
            }
            LocalDateTime localDateTimeG = LocalDateTime.G(hVarT, eVar.f68710d);
            d dVar = eVar.f68712f;
            ZoneOffset zoneOffset = eVar.f68713g;
            ZoneOffset zoneOffset2 = eVar.f68714h;
            int i14 = c.f68705a[dVar.ordinal()];
            if (i14 == 1) {
                localDateTimeG = localDateTimeG.K(zoneOffset2.f68463b - ZoneOffset.UTC.f68463b);
            } else if (i14 == 2) {
                localDateTimeG = localDateTimeG.K(zoneOffset2.f68463b - zoneOffset.f68463b);
            }
            bVarArr3[i13] = new b(localDateTimeG, eVar.f68714h, eVar.f68715i);
            i13++;
            i11 = 0;
        }
        if (i10 < 2100) {
            ((ConcurrentHashMap) this.f68727h).putIfAbsent(numValueOf, bVarArr3);
        }
        return bVarArr3;
    }

    public final boolean g(Instant instant) {
        ZoneOffset zoneOffsetH;
        TimeZone timeZone = this.f68726g;
        if (timeZone != null) {
            zoneOffsetH = h(timeZone.getRawOffset());
        } else if (this.f68722c.length == 0) {
            zoneOffsetH = this.f68721b[0];
        } else {
            int iBinarySearch = Arrays.binarySearch(this.f68720a, instant.getEpochSecond());
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 2;
            }
            zoneOffsetH = this.f68721b[iBinarySearch + 1];
        }
        return !zoneOffsetH.equals(d(instant));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (Objects.equals(this.f68726g, fVar.f68726g) && Arrays.equals(this.f68720a, fVar.f68720a) && Arrays.equals(this.f68721b, fVar.f68721b) && Arrays.equals(this.f68722c, fVar.f68722c) && Arrays.equals(this.f68724e, fVar.f68724e) && Arrays.equals(this.f68725f, fVar.f68725f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Objects.hashCode(this.f68726g) ^ Arrays.hashCode(this.f68720a)) ^ Arrays.hashCode(this.f68721b)) ^ Arrays.hashCode(this.f68722c)) ^ Arrays.hashCode(this.f68724e)) ^ Arrays.hashCode(this.f68725f);
    }

    public final String toString() {
        TimeZone timeZone = this.f68726g;
        if (timeZone != null) {
            return "ZoneRules[timeZone=" + timeZone.getID() + C3191e4.i.f36531e;
        }
        return "ZoneRules[currentStandardOffset=" + this.f68721b[r0.length - 1] + C3191e4.i.f36531e;
    }
}
