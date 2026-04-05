package io.ktor.util;

import kotlin.jvm.internal.e0;
import qv.p;
import qv.v;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class RangesKt {
    public static final boolean contains(p pVar, p other) {
        e0.checkNotNullParameter(pVar, "<this>");
        e0.checkNotNullParameter(other, "other");
        return other.getStart().longValue() >= pVar.getStart().longValue() && other.getEndInclusive().longValue() <= pVar.getEndInclusive().longValue();
    }

    public static final long getLength(p pVar) {
        e0.checkNotNullParameter(pVar, "<this>");
        return v.coerceAtLeast((pVar.getEndInclusive().longValue() - pVar.getStart().longValue()) + 1, 0L);
    }

    @f
    public static /* synthetic */ void getLength$annotations(p pVar) {
    }
}
