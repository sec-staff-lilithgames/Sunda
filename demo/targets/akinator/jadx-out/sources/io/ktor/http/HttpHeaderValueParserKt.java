package io.ktor.http;

import io.ktor.http.ContentType;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.e0;
import kv.a;
import sv.n0;
import tu.o;
import tu.q;
import tu.s;
import tu.v;
import uu.p0;
import uu.q0;
import uu.y0;
import xu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class HttpHeaderValueParserKt {
    private static final boolean nextIsSemicolonOrEnd(String str, int i10) {
        int i11 = i10 + 1;
        while (i11 < str.length() && str.charAt(i11) == ' ') {
            i11++;
        }
        return i11 == str.length() || str.charAt(i11) == ';';
    }

    public static final List<HeaderValue> parseAndSortContentTypeHeader(String str) {
        List<HeaderValue> headerValue = parseHeaderValue(str);
        final Comparator comparator = new Comparator() { // from class: io.ktor.http.HttpHeaderValueParserKt$parseAndSortContentTypeHeader$$inlined$compareByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return d.compareValues(Double.valueOf(((HeaderValue) t11).getQuality()), Double.valueOf(((HeaderValue) t10).getQuality()));
            }
        };
        final Comparator comparator2 = new Comparator() { // from class: io.ktor.http.HttpHeaderValueParserKt$parseAndSortContentTypeHeader$$inlined$thenBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) throws BadContentTypeFormatException {
                int iCompare = comparator.compare(t10, t11);
                if (iCompare != 0) {
                    return iCompare;
                }
                ContentType.Companion companion = ContentType.Companion;
                ContentType contentType = companion.parse(((HeaderValue) t10).getValue());
                int i10 = e0.areEqual(contentType.getContentType(), "*") ? 2 : 0;
                if (e0.areEqual(contentType.getContentSubtype(), "*")) {
                    i10++;
                }
                Integer numValueOf = Integer.valueOf(i10);
                ContentType contentType2 = companion.parse(((HeaderValue) t11).getValue());
                int i11 = e0.areEqual(contentType2.getContentType(), "*") ? 2 : 0;
                if (e0.areEqual(contentType2.getContentSubtype(), "*")) {
                    i11++;
                }
                return d.compareValues(numValueOf, Integer.valueOf(i11));
            }
        };
        return y0.sortedWith(headerValue, new Comparator() { // from class: io.ktor.http.HttpHeaderValueParserKt$parseAndSortContentTypeHeader$$inlined$thenByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                int iCompare = comparator2.compare(t10, t11);
                return iCompare != 0 ? iCompare : d.compareValues(Integer.valueOf(((HeaderValue) t11).getParams().size()), Integer.valueOf(((HeaderValue) t10).getParams().size()));
            }
        });
    }

    public static final List<HeaderValue> parseAndSortHeader(String str) {
        return y0.sortedWith(parseHeaderValue(str), new Comparator() { // from class: io.ktor.http.HttpHeaderValueParserKt$parseAndSortHeader$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return d.compareValues(Double.valueOf(((HeaderValue) t11).getQuality()), Double.valueOf(((HeaderValue) t10).getQuality()));
            }
        });
    }

    public static final List<HeaderValue> parseHeaderValue(String str) {
        return parseHeaderValue(str, false);
    }

    private static final int parseHeaderValueItem(String str, int i10, o oVar, boolean z10) {
        o oVarLazy = q.lazy(s.f87405e, (a) HttpHeaderValueParserKt$parseHeaderValueItem$parameters$1.INSTANCE);
        Integer numValueOf = z10 ? Integer.valueOf(i10) : null;
        int headerValueParameter = i10;
        while (headerValueParameter <= n0.getLastIndex(str)) {
            char cCharAt = str.charAt(headerValueParameter);
            if (cCharAt == ',') {
                ((ArrayList) oVar.getValue()).add(new HeaderValue(subtrim(str, i10, numValueOf != null ? numValueOf.intValue() : headerValueParameter), valueOrEmpty(oVarLazy)));
                return headerValueParameter + 1;
            }
            if (cCharAt == ';') {
                if (numValueOf == null) {
                    numValueOf = Integer.valueOf(headerValueParameter);
                }
                headerValueParameter = parseHeaderValueParameter(str, headerValueParameter + 1, oVarLazy);
            } else {
                headerValueParameter = z10 ? parseHeaderValueParameter(str, headerValueParameter, oVarLazy) : headerValueParameter + 1;
            }
        }
        ((ArrayList) oVar.getValue()).add(new HeaderValue(subtrim(str, i10, numValueOf != null ? numValueOf.intValue() : headerValueParameter), valueOrEmpty(oVarLazy)));
        return headerValueParameter;
    }

    private static final int parseHeaderValueParameter(String str, int i10, o oVar) {
        int i11 = i10;
        while (i11 <= n0.getLastIndex(str)) {
            char cCharAt = str.charAt(i11);
            if (cCharAt == '=') {
                v headerValueParameterValue = parseHeaderValueParameterValue(str, i11 + 1);
                int iIntValue = ((Number) headerValueParameterValue.component1()).intValue();
                parseHeaderValueParameter$addParam(oVar, str, i10, i11, (String) headerValueParameterValue.component2());
                return iIntValue;
            }
            if (cCharAt == ';' || cCharAt == ',') {
                parseHeaderValueParameter$addParam(oVar, str, i10, i11, "");
                return i11;
            }
            i11++;
        }
        parseHeaderValueParameter$addParam(oVar, str, i10, i11, "");
        return i11;
    }

    private static final void parseHeaderValueParameter$addParam(o oVar, String str, int i10, int i11, String str2) {
        String strSubtrim = subtrim(str, i10, i11);
        if (strSubtrim.length() == 0) {
            return;
        }
        ((ArrayList) oVar.getValue()).add(new HeaderValueParam(strSubtrim, str2));
    }

    private static final v parseHeaderValueParameterValue(String str, int i10) {
        if (str.length() == i10) {
            return tu.e0.to(Integer.valueOf(i10), "");
        }
        if (str.charAt(i10) == '\"') {
            return parseHeaderValueParameterValueQuoted(str, i10 + 1);
        }
        int i11 = i10;
        while (i11 <= n0.getLastIndex(str)) {
            char cCharAt = str.charAt(i11);
            if (cCharAt == ';' || cCharAt == ',') {
                return tu.e0.to(Integer.valueOf(i11), subtrim(str, i10, i11));
            }
            i11++;
        }
        return tu.e0.to(Integer.valueOf(i11), subtrim(str, i10, i11));
    }

    private static final v parseHeaderValueParameterValueQuoted(String str, int i10) {
        StringBuilder sb2 = new StringBuilder();
        while (i10 <= n0.getLastIndex(str)) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '\"' && nextIsSemicolonOrEnd(str, i10)) {
                Integer numValueOf = Integer.valueOf(i10 + 1);
                String string = sb2.toString();
                e0.checkNotNullExpressionValue(string, "builder.toString()");
                return tu.e0.to(numValueOf, string);
            }
            if (cCharAt != '\\' || i10 >= n0.getLastIndex(str) - 2) {
                sb2.append(cCharAt);
                i10++;
            } else {
                sb2.append(str.charAt(i10 + 1));
                i10 += 2;
            }
        }
        Integer numValueOf2 = Integer.valueOf(i10);
        String string2 = sb2.toString();
        e0.checkNotNullExpressionValue(string2, "builder.toString()");
        return tu.e0.to(numValueOf2, "\"" + string2);
    }

    private static final String subtrim(String str, int i10, int i11) {
        String strSubstring = str.substring(i10, i11);
        e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return n0.trim(strSubstring).toString();
    }

    public static final List<HeaderValueParam> toHeaderParamsList(Iterable<v> iterable) {
        e0.checkNotNullParameter(iterable, "<this>");
        ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(iterable, 10));
        for (v vVar : iterable) {
            arrayList.add(new HeaderValueParam((String) vVar.getFirst(), (String) vVar.getSecond()));
        }
        return arrayList;
    }

    private static final <T> List<T> valueOrEmpty(o oVar) {
        return oVar.isInitialized() ? (List) oVar.getValue() : p0.emptyList();
    }

    public static final List<HeaderValue> parseHeaderValue(String str, boolean z10) {
        if (str == null) {
            return p0.emptyList();
        }
        o oVarLazy = q.lazy(s.f87405e, (a) HttpHeaderValueParserKt$parseHeaderValue$items$1.INSTANCE);
        int headerValueItem = 0;
        while (headerValueItem <= n0.getLastIndex(str)) {
            headerValueItem = parseHeaderValueItem(str, headerValueItem, oVarLazy, z10);
        }
        return valueOrEmpty(oVarLazy);
    }
}
