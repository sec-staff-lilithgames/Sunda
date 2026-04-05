package io.ktor.http;

import a.b;
import com.ironsource.C3191e4;
import io.ktor.util.CharsetKt;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.p;
import sv.e;
import sv.n0;
import tu.x0;
import uu.o0;
import uu.p0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class URLParserKt {
    private static final List<String> ROOT_PATH = o0.listOf("");

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.http.URLParserKt$parseQuery$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements p {
        final /* synthetic */ URLBuilder $this_parseQuery;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(URLBuilder uRLBuilder) {
            super(2);
            this.$this_parseQuery = uRLBuilder;
        }

        @Override // kv.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((String) obj, (List<String>) obj2);
            return x0.f87415a;
        }

        public final void invoke(String key, List<String> values) {
            e0.checkNotNullParameter(key, "key");
            e0.checkNotNullParameter(values, "values");
            this.$this_parseQuery.getEncodedParameters().appendAll(key, values);
        }
    }

    private static final int count(String str, int i10, int i11, char c10) {
        int i12 = 0;
        while (true) {
            int i13 = i10 + i12;
            if (i13 >= i11 || str.charAt(i13) != c10) {
                break;
            }
            i12++;
        }
        return i12;
    }

    private static final void fillHost(URLBuilder uRLBuilder, String str, int i10, int i11) {
        Integer numValueOf = Integer.valueOf(indexOfColonInHostPort(str, i10, i11));
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : i11;
        String strSubstring = str.substring(i10, iIntValue);
        e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        uRLBuilder.setHost(strSubstring);
        int i12 = iIntValue + 1;
        if (i12 >= i11) {
            uRLBuilder.setPort(0);
            return;
        }
        String strSubstring2 = str.substring(i12, i11);
        e0.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
        uRLBuilder.setPort(Integer.parseInt(strSubstring2));
    }

    private static final int findScheme(String str, int i10, int i11) {
        int i12;
        int i13;
        char cCharAt = str.charAt(i10);
        if (('a' > cCharAt || cCharAt >= '{') && ('A' > cCharAt || cCharAt >= '[')) {
            i12 = i10;
            i13 = i12;
        } else {
            i12 = i10;
            i13 = -1;
        }
        while (i12 < i11) {
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 == ':') {
                if (i13 == -1) {
                    return i12 - i10;
                }
                throw new IllegalArgumentException(b.e(i13, "Illegal character in scheme at position "));
            }
            if (cCharAt2 == '/' || cCharAt2 == '?' || cCharAt2 == '#') {
                break;
            }
            if (i13 == -1 && (('a' > cCharAt2 || cCharAt2 >= '{') && (('A' > cCharAt2 || cCharAt2 >= '[') && (('0' > cCharAt2 || cCharAt2 >= ':') && cCharAt2 != '.' && cCharAt2 != '+' && cCharAt2 != '-')))) {
                i13 = i12;
            }
            i12++;
        }
        return -1;
    }

    public static final List<String> getROOT_PATH() {
        return ROOT_PATH;
    }

    private static final int indexOfColonInHostPort(String str, int i10, int i11) {
        boolean z10 = false;
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '[') {
                z10 = true;
            } else if (cCharAt == ']') {
                z10 = false;
            } else if (cCharAt == ':' && !z10) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    private static final boolean isLetter(char c10) {
        char lowerCase = Character.toLowerCase(c10);
        return 'a' <= lowerCase && lowerCase < '{';
    }

    private static final void parseFile(URLBuilder uRLBuilder, String str, int i10, int i11, int i12) {
        if (i12 != 2) {
            if (i12 != 3) {
                throw new IllegalArgumentException(b.k("Invalid file url: ", str));
            }
            uRLBuilder.setHost("");
            StringBuilder sb2 = new StringBuilder("/");
            String strSubstring = str.substring(i10, i11);
            e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb2.append(strSubstring);
            URLBuilderKt.setEncodedPath(uRLBuilder, sb2.toString());
            return;
        }
        int iIndexOf$default = n0.indexOf$default((CharSequence) str, '/', i10, false, 4, (Object) null);
        if (iIndexOf$default == -1 || iIndexOf$default == i11) {
            String strSubstring2 = str.substring(i10, i11);
            e0.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
            uRLBuilder.setHost(strSubstring2);
        } else {
            String strSubstring3 = str.substring(i10, iIndexOf$default);
            e0.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
            uRLBuilder.setHost(strSubstring3);
            String strSubstring4 = str.substring(iIndexOf$default, i11);
            e0.checkNotNullExpressionValue(strSubstring4, "this as java.lang.String…ing(startIndex, endIndex)");
            URLBuilderKt.setEncodedPath(uRLBuilder, strSubstring4);
        }
    }

    private static final void parseFragment(URLBuilder uRLBuilder, String str, int i10, int i11) {
        if (i10 >= i11 || str.charAt(i10) != '#') {
            return;
        }
        String strSubstring = str.substring(i10 + 1, i11);
        e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        uRLBuilder.setEncodedFragment(strSubstring);
    }

    private static final void parseMailto(URLBuilder uRLBuilder, String str, int i10, int i11) {
        int iIndexOf$default = n0.indexOf$default((CharSequence) str, "@", i10, false, 4, (Object) null);
        if (iIndexOf$default == -1) {
            throw new IllegalArgumentException(b.l("Invalid mailto url: ", str, ", it should contain '@'."));
        }
        String strSubstring = str.substring(i10, iIndexOf$default);
        e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        uRLBuilder.setUser(CodecsKt.decodeURLPart$default(strSubstring, 0, 0, null, 7, null));
        String strSubstring2 = str.substring(iIndexOf$default + 1, i11);
        e0.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
        uRLBuilder.setHost(strSubstring2);
    }

    private static final int parseQuery(URLBuilder uRLBuilder, String str, int i10, int i11) {
        int i12 = i10 + 1;
        if (i12 == i11) {
            uRLBuilder.setTrailingQuery(true);
            return i11;
        }
        Integer numValueOf = Integer.valueOf(n0.indexOf$default((CharSequence) str, '#', i12, false, 4, (Object) null));
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            i11 = numValueOf.intValue();
        }
        String strSubstring = str.substring(i12, i11);
        e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        QueryKt.parseQueryString$default(strSubstring, 0, 0, false, 6, null).forEach(new AnonymousClass1(uRLBuilder));
        return i11;
    }

    public static final URLBuilder takeFrom(URLBuilder uRLBuilder, String urlString) {
        e0.checkNotNullParameter(uRLBuilder, "<this>");
        e0.checkNotNullParameter(urlString, "urlString");
        if (n0.isBlank(urlString)) {
            return uRLBuilder;
        }
        try {
            return takeFromUnsafe(uRLBuilder, urlString);
        } catch (Throwable th2) {
            throw new URLParserException(urlString, th2);
        }
    }

    public static final URLBuilder takeFromUnsafe(URLBuilder uRLBuilder, String urlString) {
        int i10;
        int iIntValue;
        e0.checkNotNullParameter(uRLBuilder, "<this>");
        e0.checkNotNullParameter(urlString, "urlString");
        int length = urlString.length();
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                i11 = -1;
                break;
            }
            if (!e.isWhitespace(urlString.charAt(i11))) {
                break;
            }
            i11++;
        }
        int length2 = urlString.length() - 1;
        if (length2 >= 0) {
            while (true) {
                int i12 = length2 - 1;
                if (!e.isWhitespace(urlString.charAt(length2))) {
                    i10 = length2;
                    break;
                }
                if (i12 < 0) {
                    break;
                }
                length2 = i12;
            }
            i10 = -1;
        } else {
            i10 = -1;
        }
        int i13 = i10 + 1;
        int iFindScheme = findScheme(urlString, i11, i13);
        if (iFindScheme > 0) {
            String strSubstring = urlString.substring(i11, i11 + iFindScheme);
            e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            uRLBuilder.setProtocol(URLProtocol.Companion.createOrDefault(strSubstring));
            i11 += iFindScheme + 1;
        }
        int iCount = count(urlString, i11, i13, '/');
        int query = i11 + iCount;
        if (e0.areEqual(uRLBuilder.getProtocol().getName(), C3191e4.h.f36473b)) {
            parseFile(uRLBuilder, urlString, query, i13, iCount);
            return uRLBuilder;
        }
        if (e0.areEqual(uRLBuilder.getProtocol().getName(), "mailto")) {
            if (iCount != 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            parseMailto(uRLBuilder, urlString, query, i13);
            return uRLBuilder;
        }
        if (iCount >= 2) {
            while (true) {
                Integer numValueOf = Integer.valueOf(n0.indexOfAny$default((CharSequence) urlString, CharsetKt.toCharArray("@/\\?#"), query, false, 4, (Object) null));
                if (numValueOf.intValue() <= 0) {
                    numValueOf = null;
                }
                iIntValue = numValueOf != null ? numValueOf.intValue() : i13;
                if (iIntValue >= i13 || urlString.charAt(iIntValue) != '@') {
                    break;
                }
                int iIndexOfColonInHostPort = indexOfColonInHostPort(urlString, query, iIntValue);
                if (iIndexOfColonInHostPort != -1) {
                    String strSubstring2 = urlString.substring(query, iIndexOfColonInHostPort);
                    e0.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    uRLBuilder.setEncodedUser(strSubstring2);
                    String strSubstring3 = urlString.substring(iIndexOfColonInHostPort + 1, iIntValue);
                    e0.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    uRLBuilder.setEncodedPassword(strSubstring3);
                } else {
                    String strSubstring4 = urlString.substring(query, iIntValue);
                    e0.checkNotNullExpressionValue(strSubstring4, "this as java.lang.String…ing(startIndex, endIndex)");
                    uRLBuilder.setEncodedUser(strSubstring4);
                }
                query = iIntValue + 1;
            }
            fillHost(uRLBuilder, urlString, query, iIntValue);
            query = iIntValue;
        }
        if (query >= i13) {
            uRLBuilder.setEncodedPathSegments(urlString.charAt(i10) == '/' ? ROOT_PATH : p0.emptyList());
            return uRLBuilder;
        }
        uRLBuilder.setEncodedPathSegments(iCount == 0 ? y0.dropLast(uRLBuilder.getEncodedPathSegments(), 1) : p0.emptyList());
        Integer numValueOf2 = Integer.valueOf(n0.indexOfAny$default((CharSequence) urlString, CharsetKt.toCharArray("?#"), query, false, 4, (Object) null));
        Integer num = numValueOf2.intValue() > 0 ? numValueOf2 : null;
        int iIntValue2 = num != null ? num.intValue() : i13;
        if (iIntValue2 > query) {
            String strSubstring5 = urlString.substring(query, iIntValue2);
            e0.checkNotNullExpressionValue(strSubstring5, "this as java.lang.String…ing(startIndex, endIndex)");
            uRLBuilder.setEncodedPathSegments(y0.plus((Collection) ((uRLBuilder.getEncodedPathSegments().size() == 1 && ((CharSequence) y0.first((List) uRLBuilder.getEncodedPathSegments())).length() == 0) ? p0.emptyList() : uRLBuilder.getEncodedPathSegments()), (Iterable) y0.plus((Collection) (iCount == 1 ? ROOT_PATH : p0.emptyList()), (Iterable) (e0.areEqual(strSubstring5, "/") ? ROOT_PATH : n0.split$default((CharSequence) strSubstring5, new char[]{'/'}, false, 0, 6, (Object) null)))));
            query = iIntValue2;
        }
        if (query < i13 && urlString.charAt(query) == '?') {
            query = parseQuery(uRLBuilder, urlString, query, i13);
        }
        parseFragment(uRLBuilder, urlString, query, i13);
        return uRLBuilder;
    }
}
