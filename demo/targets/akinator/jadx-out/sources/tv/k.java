package tv;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class k {
    public static final double convertDurationUnit(double d10, i sourceUnit, i targetUnit) {
        e0.checkNotNullParameter(sourceUnit, "sourceUnit");
        e0.checkNotNullParameter(targetUnit, "targetUnit");
        long jConvert = targetUnit.getTimeUnit$kotlin_stdlib().convert(1L, sourceUnit.getTimeUnit$kotlin_stdlib());
        return jConvert > 0 ? d10 * jConvert : d10 / sourceUnit.getTimeUnit$kotlin_stdlib().convert(1L, targetUnit.getTimeUnit$kotlin_stdlib());
    }

    public static final long convertDurationUnitOverflow(long j10, i sourceUnit, i targetUnit) {
        e0.checkNotNullParameter(sourceUnit, "sourceUnit");
        e0.checkNotNullParameter(targetUnit, "targetUnit");
        return targetUnit.getTimeUnit$kotlin_stdlib().convert(j10, sourceUnit.getTimeUnit$kotlin_stdlib());
    }

    public static final i toDurationUnit(TimeUnit timeUnit) {
        e0.checkNotNullParameter(timeUnit, "<this>");
        switch (j.$EnumSwitchMapping$0[timeUnit.ordinal()]) {
            case 1:
                return i.f87439c;
            case 2:
                return i.f87440e;
            case 3:
                return i.f87441f;
            case 4:
                return i.f87442g;
            case 5:
                return i.f87443h;
            case 6:
                return i.f87444i;
            case 7:
                return i.f87445j;
            default:
                throw new tu.t();
        }
    }

    public static TimeUnit toTimeUnit(i iVar) {
        e0.checkNotNullParameter(iVar, "<this>");
        return iVar.getTimeUnit$kotlin_stdlib();
    }

    public static final long convertDurationUnit(long j10, i sourceUnit, i targetUnit) {
        e0.checkNotNullParameter(sourceUnit, "sourceUnit");
        e0.checkNotNullParameter(targetUnit, "targetUnit");
        return targetUnit.getTimeUnit$kotlin_stdlib().convert(j10, sourceUnit.getTimeUnit$kotlin_stdlib());
    }
}
