package io.ktor.http;

import io.ktor.http.Parameters;
import kotlin.jvm.internal.e0;
import sv.e;
import sv.n0;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class QueryKt {
    private static final void appendParam(ParametersBuilder parametersBuilder, String str, int i10, int i11, int i12, boolean z10) {
        String strSubstring;
        String strSubstring2;
        String strSubstring3;
        if (i11 == -1) {
            int iTrimStart = trimStart(i10, i12, str);
            int iTrimEnd = trimEnd(iTrimStart, i12, str);
            if (iTrimEnd > iTrimStart) {
                if (z10) {
                    strSubstring3 = CodecsKt.decodeURLQueryComponent$default(str, iTrimStart, iTrimEnd, false, null, 12, null);
                } else {
                    strSubstring3 = str.substring(iTrimStart, iTrimEnd);
                    e0.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                parametersBuilder.appendAll(strSubstring3, p0.emptyList());
                return;
            }
            return;
        }
        int iTrimStart2 = trimStart(i10, i11, str);
        int iTrimEnd2 = trimEnd(iTrimStart2, i11, str);
        if (iTrimEnd2 > iTrimStart2) {
            if (z10) {
                strSubstring = CodecsKt.decodeURLQueryComponent$default(str, iTrimStart2, iTrimEnd2, false, null, 12, null);
            } else {
                strSubstring = str.substring(iTrimStart2, iTrimEnd2);
                e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            int iTrimStart3 = trimStart(i11 + 1, i12, str);
            int iTrimEnd3 = trimEnd(iTrimStart3, i12, str);
            if (z10) {
                strSubstring2 = CodecsKt.decodeURLQueryComponent$default(str, iTrimStart3, iTrimEnd3, true, null, 8, null);
            } else {
                strSubstring2 = str.substring(iTrimStart3, iTrimEnd3);
                e0.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            parametersBuilder.append(strSubstring, strSubstring2);
        }
    }

    private static final void parse(ParametersBuilder parametersBuilder, String str, int i10, int i11, boolean z10) {
        int i12;
        int i13;
        int lastIndex = n0.getLastIndex(str);
        int i14 = 0;
        if (i10 <= lastIndex) {
            int i15 = -1;
            int i16 = i10;
            int i17 = i16;
            while (i14 != i11) {
                char cCharAt = str.charAt(i17);
                if (cCharAt == '&') {
                    appendParam(parametersBuilder, str, i16, i15, i17, z10);
                    i14++;
                    i15 = -1;
                    i16 = i17 + 1;
                } else if (cCharAt == '=' && i15 == -1) {
                    i15 = i17;
                }
                if (i17 != lastIndex) {
                    i17++;
                } else {
                    i13 = i16;
                    i12 = i15;
                }
            }
            return;
        }
        i12 = -1;
        i13 = i10;
        if (i14 == i11) {
            return;
        }
        appendParam(parametersBuilder, str, i13, i12, str.length(), z10);
    }

    public static final Parameters parseQueryString(String query, int i10, int i11, boolean z10) {
        e0.checkNotNullParameter(query, "query");
        if (i10 > n0.getLastIndex(query)) {
            return Parameters.Companion.getEmpty();
        }
        Parameters.Companion companion = Parameters.Companion;
        ParametersBuilder parametersBuilderParametersBuilder$default = ParametersKt.ParametersBuilder$default(0, 1, null);
        parse(parametersBuilderParametersBuilder$default, query, i10, i11, z10);
        return parametersBuilderParametersBuilder$default.build();
    }

    public static /* synthetic */ Parameters parseQueryString$default(String str, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 1000;
        }
        if ((i12 & 8) != 0) {
            z10 = true;
        }
        return parseQueryString(str, i10, i11, z10);
    }

    private static final int trimEnd(int i10, int i11, CharSequence charSequence) {
        while (i11 > i10 && e.isWhitespace(charSequence.charAt(i11 - 1))) {
            i11--;
        }
        return i11;
    }

    private static final int trimStart(int i10, int i11, CharSequence charSequence) {
        while (i10 < i11 && e.isWhitespace(charSequence.charAt(i10))) {
            i10++;
        }
        return i10;
    }
}
