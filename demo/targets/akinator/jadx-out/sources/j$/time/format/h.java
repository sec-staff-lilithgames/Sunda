package j$.time.format;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;

/* loaded from: classes3.dex */
public final class h implements f {
    @Override // j$.time.format.f
    public final boolean r(u uVar, StringBuilder sb2) {
        Long lA = uVar.a(j$.time.temporal.a.INSTANT_SECONDS);
        j$.time.temporal.m mVar = uVar.f68588a;
        j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_SECOND;
        Long lValueOf = mVar.e(aVar) ? Long.valueOf(mVar.f(aVar)) : null;
        int i10 = 0;
        if (lA == null) {
            return false;
        }
        long jLongValue = lA.longValue();
        int iA = aVar.f68639b.a(lValueOf != null ? lValueOf.longValue() : 0L, aVar);
        if (jLongValue >= -62167219200L) {
            long j10 = jLongValue - 253402300800L;
            long jFloorDiv = Math.floorDiv(j10, 315569520000L) + 1;
            LocalDateTime localDateTimeI = LocalDateTime.I(Math.floorMod(j10, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
            if (jFloorDiv > 0) {
                sb2.append('+');
                sb2.append(jFloorDiv);
            }
            sb2.append(localDateTimeI);
            if (localDateTimeI.f68454b.f68613c == 0) {
                sb2.append(":00");
            }
        } else {
            long j11 = jLongValue + 62167219200L;
            long j12 = j11 / 315569520000L;
            long j13 = j11 % 315569520000L;
            LocalDateTime localDateTimeI2 = LocalDateTime.I(j13 - 62167219200L, 0, ZoneOffset.UTC);
            int length = sb2.length();
            sb2.append(localDateTimeI2);
            if (localDateTimeI2.f68454b.f68613c == 0) {
                sb2.append(":00");
            }
            if (j12 < 0) {
                if (localDateTimeI2.f68453a.f68601a == -10000) {
                    sb2.replace(length, length + 2, Long.toString(j12 - 1));
                } else if (j13 == 0) {
                    sb2.insert(length, j12);
                } else {
                    sb2.insert(length + 1, Math.abs(j12));
                }
            }
        }
        if (iA > 0) {
            sb2.append('.');
            int i11 = 100000000;
            while (true) {
                if (iA <= 0 && i10 % 3 == 0 && i10 >= -2) {
                    break;
                }
                int i12 = iA / i11;
                sb2.append((char) (i12 + 48));
                iA -= i12 * i11;
                i11 /= 10;
                i10++;
            }
        }
        sb2.append('Z');
        return true;
    }

    public final String toString() {
        return "Instant()";
    }
}
