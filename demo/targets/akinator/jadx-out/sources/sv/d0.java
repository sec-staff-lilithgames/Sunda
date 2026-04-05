package sv;

import com.amazon.aps.shared.util.APSSharedUtil;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class d0 extends c0 {
    public static final String prependIndent(String str, String indent) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(indent, "indent");
        return rv.f0.joinToString$default(rv.f0.map(n0.lineSequence(str), new ba.d(indent, 9)), "\n", null, null, 0, null, null, 62, null);
    }

    public static /* synthetic */ String prependIndent$default(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "    ";
        }
        return prependIndent(str, str2);
    }

    public static final String replaceIndent(String str, String newIndent) {
        int length;
        String str2;
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(newIndent, "newIndent");
        List<String> listLines = n0.lines(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLines) {
            if (!n0.isBlank((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(uu.q0.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            length = 0;
            if (!it.hasNext()) {
                break;
            }
            String str3 = (String) it.next();
            int length2 = str3.length();
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (!e.isWhitespace(str3.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str3.length();
            }
            arrayList2.add(Integer.valueOf(length));
        }
        Integer num = (Integer) y0.minOrNull((Iterable) arrayList2);
        int iIntValue = num != null ? num.intValue() : 0;
        int size = (listLines.size() * newIndent.length()) + str.length();
        kv.l j0Var = newIndent.length() == 0 ? new f.j0(22) : new ba.d(newIndent, 10);
        int lastIndex = uu.p0.getLastIndex(listLines);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listLines) {
            int i10 = length + 1;
            if (length < 0) {
                uu.p0.throwIndexOverflow();
            }
            String str4 = (String) obj2;
            if ((length == 0 || length == lastIndex) && n0.isBlank(str4)) {
                str4 = null;
            } else {
                String strDrop = p0.drop(str4, iIntValue);
                if (strDrop != null && (str2 = (String) j0Var.invoke(strDrop)) != null) {
                    str4 = str2;
                }
            }
            if (str4 != null) {
                arrayList3.add(str4);
            }
            length = i10;
        }
        return ((StringBuilder) y0.joinTo(arrayList3, new StringBuilder(size), (Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE & 2) != 0 ? ", " : "\n", (Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE & 4) != 0 ? "" : null, (Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE & 8) == 0 ? null : "", (Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE & 16) != 0 ? -1 : 0, (Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE & 32) != 0 ? APSSharedUtil.TRUNCATE_SEPARATOR : null, (Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE & 64) != 0 ? null : null)).toString();
    }

    public static /* synthetic */ String replaceIndent$default(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "";
        }
        return replaceIndent(str, str2);
    }

    public static final String replaceIndentByMargin(String str, String newIndent, String marginPrefix) {
        String str2;
        String str3;
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(newIndent, "newIndent");
        kotlin.jvm.internal.e0.checkNotNullParameter(marginPrefix, "marginPrefix");
        if (n0.isBlank(marginPrefix)) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List<String> listLines = n0.lines(str);
        int size = (listLines.size() * newIndent.length()) + str.length();
        kv.l j0Var = newIndent.length() == 0 ? new f.j0(22) : new ba.d(newIndent, 10);
        int lastIndex = uu.p0.getLastIndex(listLines);
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (Object obj : listLines) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                uu.p0.throwIndexOverflow();
            }
            String str4 = (String) obj;
            String strSubstring = null;
            if ((i10 == 0 || i10 == lastIndex) && n0.isBlank(str4)) {
                str2 = marginPrefix;
                str4 = null;
            } else {
                int length = str4.length();
                int i12 = 0;
                while (true) {
                    if (i12 >= length) {
                        i12 = -1;
                        break;
                    }
                    if (!e.isWhitespace(str4.charAt(i12))) {
                        break;
                    }
                    i12++;
                }
                if (i12 == -1) {
                    str2 = marginPrefix;
                } else {
                    int i13 = i12;
                    str2 = marginPrefix;
                    if (k0.startsWith$default(str4, str2, i13, false, 4, null)) {
                        int length2 = str2.length() + i13;
                        kotlin.jvm.internal.e0.checkNotNull(str4, "null cannot be cast to non-null type java.lang.String");
                        strSubstring = str4.substring(length2);
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    }
                }
                if (strSubstring != null && (str3 = (String) j0Var.invoke(strSubstring)) != null) {
                    str4 = str3;
                }
            }
            if (str4 != null) {
                arrayList.add(str4);
            }
            i10 = i11;
            marginPrefix = str2;
        }
        return ((StringBuilder) y0.joinTo(arrayList, new StringBuilder(size), (Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE & 2) != 0 ? ", " : "\n", (Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE & 4) != 0 ? "" : null, (Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE & 8) == 0 ? null : "", (Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE & 16) != 0 ? -1 : 0, (Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE & 32) != 0 ? APSSharedUtil.TRUNCATE_SEPARATOR : null, (Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE & 64) != 0 ? null : null)).toString();
    }

    public static /* synthetic */ String replaceIndentByMargin$default(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "";
        }
        if ((i10 & 2) != 0) {
            str3 = "|";
        }
        return replaceIndentByMargin(str, str2, str3);
    }

    public static String trimIndent(String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        return replaceIndent(str, "");
    }

    public static final String trimMargin(String str, String marginPrefix) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(marginPrefix, "marginPrefix");
        return replaceIndentByMargin(str, "", marginPrefix);
    }

    public static /* synthetic */ String trimMargin$default(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "|";
        }
        return trimMargin(str, str2);
    }
}
