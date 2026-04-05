package io.ktor.http.auth;

import io.ktor.http.CookieUtilsKt;
import io.ktor.http.auth.HttpAuthHeader;
import io.ktor.http.parsing.ParseException;
import io.ktor.util.InternalAPI;
import io.ktor.util.date.GMTDateParser;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import kv.l;
import qv.v;
import sv.n0;
import sv.p0;
import sv.t;
import sv.x;
import uu.c2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class HttpAuthHeaderKt {
    private static final Set<Character> TOKEN_EXTRA = c2.setOf((Object[]) new Character[]{'!', '#', '$', '%', '&', '\'', Character.valueOf(GMTDateParser.ANY), '+', '-', '.', '^', '_', '`', '|', '~'});
    private static final Set<Character> TOKEN68_EXTRA = c2.setOf((Object[]) new Character[]{'-', '.', '_', '~', '+', '/'});
    private static final x token68Pattern = new x("[a-zA-Z0-9\\-._~+/]+=*");
    private static final x escapeRegex = new x("\\\\.");

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.http.auth.HttpAuthHeaderKt$unescaped$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements l {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // kv.l
        public final CharSequence invoke(t it) {
            e0.checkNotNullParameter(it, "it");
            return p0.takeLast(it.getValue(), 1);
        }
    }

    private static final boolean isToken(char c10) {
        if ('a' > c10 || c10 >= '{') {
            return ('A' <= c10 && c10 < '[') || CookieUtilsKt.isDigit(c10) || TOKEN_EXTRA.contains(Character.valueOf(c10));
        }
        return true;
    }

    private static final boolean isToken68(char c10) {
        if ('a' > c10 || c10 >= '{') {
            return ('A' <= c10 && c10 < '[') || CookieUtilsKt.isDigit(c10) || TOKEN68_EXTRA.contains(Character.valueOf(c10));
        }
        return true;
    }

    private static final int matchParameter(String str, int i10, Map<String, String> map) {
        int i11;
        int iSkipSpaces = skipSpaces(str, i10);
        int i12 = iSkipSpaces;
        while (i12 < str.length() && isToken(str.charAt(i12))) {
            i12++;
        }
        String strSubstring = n0.substring(str, v.until(iSkipSpaces, i12));
        int iSkipSpaces2 = skipSpaces(str, i12);
        if (iSkipSpaces2 == str.length() || str.charAt(iSkipSpaces2) != '=') {
            return i10;
        }
        int iSkipSpaces3 = skipSpaces(str, iSkipSpaces2 + 1);
        boolean z10 = false;
        if (str.charAt(iSkipSpaces3) == '\"') {
            iSkipSpaces3++;
            i11 = iSkipSpaces3;
            boolean z11 = false;
            while (i11 < str.length() && (str.charAt(i11) != '\"' || z11)) {
                z11 = !z11 && str.charAt(i11) == '\\';
                i11++;
            }
            if (i11 == str.length()) {
                throw new ParseException("Expected closing quote'\"' in parameter", null, 2, null);
            }
            z10 = true;
        } else {
            i11 = iSkipSpaces3;
            while (i11 < str.length() && str.charAt(i11) != ' ' && str.charAt(i11) != ',') {
                i11++;
            }
        }
        String strSubstring2 = n0.substring(str, v.until(iSkipSpaces3, i11));
        if (z10) {
            strSubstring2 = unescaped(strSubstring2);
        }
        map.put(strSubstring, strSubstring2);
        return z10 ? i11 + 1 : i11;
    }

    private static final int matchParameters(String str, int i10, Map<String, String> map) {
        while (i10 > 0 && i10 < str.length()) {
            int iMatchParameter = matchParameter(str, i10, map);
            if (iMatchParameter == i10) {
                break;
            }
            i10 = skipDelimiter(str, iMatchParameter, AbstractJsonLexerKt.COMMA);
        }
        return i10;
    }

    private static final int matchToken68(String str, int i10) {
        int iSkipSpaces = skipSpaces(str, i10);
        while (iSkipSpaces < str.length() && isToken68(str.charAt(iSkipSpaces))) {
            iSkipSpaces++;
        }
        while (iSkipSpaces < str.length() && str.charAt(iSkipSpaces) == '=') {
            iSkipSpaces++;
        }
        return skipSpaces(str, iSkipSpaces);
    }

    private static final Integer nextChallengeIndex(List<HttpAuthHeader> list, HttpAuthHeader httpAuthHeader, int i10, String str) {
        if (i10 != str.length() && str.charAt(i10) != ',') {
            return null;
        }
        list.add(httpAuthHeader);
        if (i10 == str.length()) {
            return -1;
        }
        if (str.charAt(i10) == ',') {
            return Integer.valueOf(i10 + 1);
        }
        throw new IllegalStateException("");
    }

    public static final HttpAuthHeader parseAuthorizationHeader(String headerValue) {
        e0.checkNotNullParameter(headerValue, "headerValue");
        int iSkipSpaces = skipSpaces(headerValue, 0);
        int i10 = iSkipSpaces;
        while (i10 < headerValue.length() && isToken(headerValue.charAt(i10))) {
            i10++;
        }
        String strSubstring = n0.substring(headerValue, v.until(iSkipSpaces, i10));
        int iSkipSpaces2 = skipSpaces(headerValue, i10);
        if (n0.isBlank(strSubstring)) {
            return null;
        }
        if (headerValue.length() == iSkipSpaces2) {
            return new HttpAuthHeader.Parameterized(strSubstring, uu.p0.emptyList(), (HeaderValueEncoding) null, 4, (u) null);
        }
        int iMatchToken68 = matchToken68(headerValue, iSkipSpaces2);
        String string = n0.trim(n0.substring(headerValue, v.until(iSkipSpaces2, iMatchToken68))).toString();
        if (string.length() > 0 && iMatchToken68 == headerValue.length()) {
            return new HttpAuthHeader.Single(strSubstring, string);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (matchParameters(headerValue, iSkipSpaces2, linkedHashMap) != -1) {
            throw new ParseException("Function parseAuthorizationHeader can parse only one header", null, 2, null);
        }
        return new HttpAuthHeader.Parameterized(strSubstring, linkedHashMap, (HeaderValueEncoding) null, 4, (u) null);
    }

    @InternalAPI
    public static final List<HttpAuthHeader> parseAuthorizationHeaders(String headerValue) {
        e0.checkNotNullParameter(headerValue, "headerValue");
        ArrayList arrayList = new ArrayList();
        int authorizationHeader = 0;
        while (authorizationHeader != -1) {
            authorizationHeader = parseAuthorizationHeader(headerValue, authorizationHeader, arrayList);
        }
        return arrayList;
    }

    private static final int skipDelimiter(String str, int i10, char c10) {
        int iSkipSpaces = skipSpaces(str, i10);
        if (iSkipSpaces == str.length()) {
            return -1;
        }
        if (str.charAt(iSkipSpaces) == c10) {
            return skipSpaces(str, iSkipSpaces + 1);
        }
        throw new ParseException("Expected delimiter " + c10 + " at position " + iSkipSpaces, null, 2, null);
    }

    private static final int skipSpaces(String str, int i10) {
        while (i10 < str.length() && str.charAt(i10) == ' ') {
            i10++;
        }
        return i10;
    }

    private static final String unescaped(String str) {
        return escapeRegex.replace(str, AnonymousClass1.INSTANCE);
    }

    private static final int parseAuthorizationHeader(String str, int i10, List<HttpAuthHeader> list) {
        Integer numNextChallengeIndex;
        int iSkipSpaces = skipSpaces(str, i10);
        int i11 = iSkipSpaces;
        while (i11 < str.length() && isToken(str.charAt(i11))) {
            i11++;
        }
        String strSubstring = n0.substring(str, v.until(iSkipSpaces, i11));
        if (!n0.isBlank(strSubstring)) {
            int iSkipSpaces2 = skipSpaces(str, i11);
            Integer numNextChallengeIndex2 = nextChallengeIndex(list, new HttpAuthHeader.Parameterized(strSubstring, uu.p0.emptyList(), (HeaderValueEncoding) null, 4, (u) null), iSkipSpaces2, str);
            if (numNextChallengeIndex2 != null) {
                return numNextChallengeIndex2.intValue();
            }
            int iMatchToken68 = matchToken68(str, iSkipSpaces2);
            String string = n0.trim(n0.substring(str, v.until(iSkipSpaces2, iMatchToken68))).toString();
            if (string.length() > 0 && (numNextChallengeIndex = nextChallengeIndex(list, new HttpAuthHeader.Single(strSubstring, string), iMatchToken68, str)) != null) {
                return numNextChallengeIndex.intValue();
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int iMatchParameters = matchParameters(str, iSkipSpaces2, linkedHashMap);
            list.add(new HttpAuthHeader.Parameterized(strSubstring, linkedHashMap, (HeaderValueEncoding) null, 4, (u) null));
            return iMatchParameters;
        }
        throw new ParseException("Invalid authScheme value: it should be token, can't be blank", null, 2, null);
    }
}
