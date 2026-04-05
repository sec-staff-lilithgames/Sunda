package tv;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class t {
    public static final long a(long j10) {
        return j10 < 0 ? f.f87433c.m7176getNEG_INFINITEUwyO8pc$kotlin_stdlib() : f.f87433c.m7175getINFINITEUwyO8pc();
    }

    public static final long b(long j10, long j11, i iVar) {
        long j12 = j10 - j11;
        if (((j12 ^ j10) & (~(j12 ^ j11))) >= 0) {
            return h.toDuration(j12, iVar);
        }
        i iVar2 = i.f87441f;
        if (iVar.compareTo(iVar2) >= 0) {
            return f.m7223unaryMinusUwyO8pc(a(j12));
        }
        long jConvertDurationUnit = k.convertDurationUnit(1L, iVar2, iVar);
        long j13 = (j10 / jConvertDurationUnit) - (j11 / jConvertDurationUnit);
        long j14 = (j10 % jConvertDurationUnit) - (j11 % jConvertDurationUnit);
        e eVar = f.f87433c;
        return f.m7208plusLRDsOJo(h.toDuration(j13, iVar2), h.toDuration(j14, iVar));
    }

    public static final boolean isSaturated(long j10) {
        return ((j10 - 1) | 1) == Long.MAX_VALUE;
    }

    /* renamed from: saturatingAdd-NuflL3o, reason: not valid java name */
    public static final long m7229saturatingAddNuflL3o(long j10, i unit, long j11) {
        e0.checkNotNullParameter(unit, "unit");
        long jM7218toLongimpl = f.m7218toLongimpl(j11, unit);
        if (((j10 - 1) | 1) == Long.MAX_VALUE) {
            if (!f.m7204isInfiniteimpl(j11) || (j10 ^ jM7218toLongimpl) >= 0) {
                return j10;
            }
            throw new IllegalArgumentException("Summing infinities of different signs");
        }
        if (((jM7218toLongimpl - 1) | 1) != Long.MAX_VALUE) {
            long j12 = j10 + jM7218toLongimpl;
            return ((jM7218toLongimpl ^ j12) & (j10 ^ j12)) < 0 ? j10 < 0 ? Long.MIN_VALUE : Long.MAX_VALUE : j12;
        }
        long jM7187divUwyO8pc = f.m7187divUwyO8pc(j11, 2);
        long jM7218toLongimpl2 = f.m7218toLongimpl(jM7187divUwyO8pc, unit);
        return (1 | (jM7218toLongimpl2 - 1)) == Long.MAX_VALUE ? jM7218toLongimpl2 : m7229saturatingAddNuflL3o(m7229saturatingAddNuflL3o(j10, unit, jM7187divUwyO8pc), unit, f.m7207minusLRDsOJo(j11, jM7187divUwyO8pc));
    }

    public static final long saturatingDiff(long j10, long j11, i unit) {
        e0.checkNotNullParameter(unit, "unit");
        return (1 | (j11 - 1)) == Long.MAX_VALUE ? f.m7223unaryMinusUwyO8pc(a(j11)) : b(j10, j11, unit);
    }

    public static final long saturatingOriginsDiff(long j10, long j11, i unit) {
        e0.checkNotNullParameter(unit, "unit");
        return ((j11 - 1) | 1) == Long.MAX_VALUE ? j10 == j11 ? f.f87433c.m7177getZEROUwyO8pc() : f.m7223unaryMinusUwyO8pc(a(j11)) : (1 | (j10 - 1)) == Long.MAX_VALUE ? a(j10) : b(j10, j11, unit);
    }
}
