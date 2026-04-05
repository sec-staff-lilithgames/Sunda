package io.ktor.http;

import io.ktor.util.date.GMTDateParser;
import kotlin.jvm.internal.e0;
import qv.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ContentRangeKt {
    public static final String contentRangeHeaderValue(p pVar, Long l9, RangeUnits unit) {
        e0.checkNotNullParameter(unit, "unit");
        return contentRangeHeaderValue(pVar, l9, unit.getUnitToken());
    }

    public static /* synthetic */ String contentRangeHeaderValue$default(p pVar, Long l9, RangeUnits rangeUnits, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            l9 = null;
        }
        if ((i10 & 4) != 0) {
            rangeUnits = RangeUnits.Bytes;
        }
        return contentRangeHeaderValue(pVar, l9, rangeUnits);
    }

    public static final String contentRangeHeaderValue(p pVar, Long l9, String unit) {
        e0.checkNotNullParameter(unit, "unit");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(unit);
        sb2.append(" ");
        if (pVar != null) {
            sb2.append(pVar.getStart().longValue());
            sb2.append('-');
            sb2.append(pVar.getEndInclusive().longValue());
        } else {
            sb2.append(GMTDateParser.ANY);
        }
        sb2.append('/');
        Object obj = l9;
        if (l9 == null) {
            obj = "*";
        }
        sb2.append(obj);
        String string = sb2.toString();
        e0.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static /* synthetic */ String contentRangeHeaderValue$default(p pVar, Long l9, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            l9 = null;
        }
        if ((i10 & 4) != 0) {
            str = RangeUnits.Bytes.getUnitToken();
        }
        return contentRangeHeaderValue(pVar, l9, str);
    }
}
