package io.ktor.http;

import a.b;
import androidx.core.app.NotificationCompat;
import com.ironsource.C3191e4;
import com.ironsource.G5;
import io.ktor.util.Base64Kt;
import io.ktor.util.TextKt;
import io.ktor.util.date.GMTDate;
import j1.o2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import kv.l;
import sv.e;
import sv.k0;
import sv.n0;
import sv.o;
import sv.t;
import sv.x;
import tu.v;
import uu.c2;
import uu.o1;
import uu.p0;
import uu.p1;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class CookieKt {
    private static final Set<String> loweredPartNames = c2.setOf((Object[]) new String[]{io.ktor.client.utils.CacheControl.MAX_AGE, "expires", C3191e4.i.D, "path", "secure", "httponly", "$x-enc"});
    private static final x clientCookieHeaderPattern = new x("(^|;)\\s*([^;=\\{\\}\\s]+)\\s*(=\\s*(\"[^\"]*\"|[^;]*))?");
    private static final Set<Character> cookieCharsShouldBeEscaped = c2.setOf((Object[]) new Character[]{';', Character.valueOf(AbstractJsonLexerKt.COMMA), Character.valueOf(AbstractJsonLexerKt.STRING)});

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CookieEncoding.values().length];
            try {
                iArr[CookieEncoding.RAW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CookieEncoding.DQUOTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CookieEncoding.BASE64_ENCODING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CookieEncoding.URI_ENCODING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.http.CookieKt$parseClientCookiesHeader$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements l {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // kv.l
        public final v invoke(t it) {
            String value;
            String value2;
            e0.checkNotNullParameter(it, "it");
            o oVar = ((sv.v) it.getGroups()).get(2);
            String str = "";
            if (oVar == null || (value = oVar.getValue()) == null) {
                value = "";
            }
            o oVar2 = ((sv.v) it.getGroups()).get(4);
            if (oVar2 != null && (value2 = oVar2.getValue()) != null) {
                str = value2;
            }
            return tu.e0.to(value, str);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.http.CookieKt$parseClientCookiesHeader$2, reason: invalid class name */
    public static final class AnonymousClass2 extends f0 implements l {
        final /* synthetic */ boolean $skipEscaped;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(boolean z10) {
            super(1);
            this.$skipEscaped = z10;
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x001a  */
        @Override // kv.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Boolean invoke(tu.v r5) {
            /*
                r4 = this;
                java.lang.String r0 = "it"
                kotlin.jvm.internal.e0.checkNotNullParameter(r5, r0)
                boolean r0 = r4.$skipEscaped
                if (r0 == 0) goto L1a
                java.lang.Object r5 = r5.getFirst()
                java.lang.String r5 = (java.lang.String) r5
                r0 = 2
                r1 = 0
                java.lang.String r2 = "$"
                r3 = 0
                boolean r5 = sv.k0.startsWith$default(r5, r2, r3, r0, r1)
                if (r5 != 0) goto L1b
            L1a:
                r3 = 1
            L1b:
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.CookieKt.AnonymousClass2.invoke(tu.v):java.lang.Boolean");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.http.CookieKt$parseClientCookiesHeader$3, reason: invalid class name */
    public static final class AnonymousClass3 extends f0 implements l {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(1);
        }

        @Override // kv.l
        public final v invoke(v cookie) {
            e0.checkNotNullParameter(cookie, "cookie");
            return (k0.startsWith$default((String) cookie.getSecond(), "\"", false, 2, null) && k0.endsWith$default((String) cookie.getSecond(), "\"", false, 2, null)) ? v.copy$default(cookie, null, n0.removeSurrounding((String) cookie.getSecond(), (CharSequence) "\""), 1, null) : cookie;
        }
    }

    private static final String assertCookieName(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            if (shouldEscapeInCookies(str.charAt(i10))) {
                throw new IllegalArgumentException(b.k("Cookie name is not valid: ", str));
            }
        }
        return str;
    }

    private static final String cookiePart(String str, Object obj, CookieEncoding cookieEncoding) {
        if (obj == null) {
            return "";
        }
        StringBuilder sbS = b.s(str, G5.T);
        sbS.append(encodeCookieValue(obj.toString(), cookieEncoding));
        return sbS.toString();
    }

    private static final String cookiePartExt(String str, String str2) {
        if (str2 == null) {
            return str;
        }
        CookieEncoding cookieEncoding = CookieEncoding.RAW;
        StringBuilder sbS = b.s(str, G5.T);
        sbS.append(encodeCookieValue(str2.toString(), cookieEncoding));
        return sbS.toString();
    }

    private static final String cookiePartFlag(String str, boolean z10) {
        return z10 ? str : "";
    }

    private static final String cookiePartUnencoded(String str, Object obj) {
        if (obj == null) {
            return "";
        }
        return str + G5.T + obj;
    }

    public static final String decodeCookieValue(String encodedValue, CookieEncoding encoding) {
        e0.checkNotNullParameter(encodedValue, "encodedValue");
        e0.checkNotNullParameter(encoding, "encoding");
        int i10 = WhenMappings.$EnumSwitchMapping$0[encoding.ordinal()];
        if (i10 == 1 || i10 == 2) {
            return (k0.startsWith$default(n0.trimStart(encodedValue).toString(), "\"", false, 2, null) && k0.endsWith$default(n0.trimEnd(encodedValue).toString(), "\"", false, 2, null)) ? n0.removeSurrounding(n0.trim(encodedValue).toString(), (CharSequence) "\"") : encodedValue;
        }
        if (i10 == 3) {
            return Base64Kt.decodeBase64String(encodedValue);
        }
        if (i10 == 4) {
            return CodecsKt.decodeURLQueryComponent$default(encodedValue, 0, 0, true, null, 11, null);
        }
        throw new tu.t();
    }

    public static final String encodeCookieValue(String value, CookieEncoding encoding) {
        e0.checkNotNullParameter(value, "value");
        e0.checkNotNullParameter(encoding, "encoding");
        int i10 = WhenMappings.$EnumSwitchMapping$0[encoding.ordinal()];
        int i11 = 0;
        if (i10 == 1) {
            while (i11 < value.length()) {
                if (shouldEscapeInCookies(value.charAt(i11))) {
                    throw new IllegalArgumentException("The cookie value contains characters that cannot be encoded in RAW format.  Consider URL_ENCODING mode");
                }
                i11++;
            }
            return value;
        }
        if (i10 != 2) {
            if (i10 == 3) {
                return Base64Kt.encodeBase64(value);
            }
            if (i10 == 4) {
                return CodecsKt.encodeURLParameter(value, true);
            }
            throw new tu.t();
        }
        if (n0.contains$default((CharSequence) value, AbstractJsonLexerKt.STRING, false, 2, (Object) null)) {
            throw new IllegalArgumentException("The cookie value contains characters that cannot be encoded in DQUOTES format. Consider URL_ENCODING mode");
        }
        while (i11 < value.length()) {
            if (shouldEscapeInCookies(value.charAt(i11))) {
                return o2.f(AbstractJsonLexerKt.STRING, "\"", value);
            }
            i11++;
        }
        return value;
    }

    public static final Map<String, String> parseClientCookiesHeader(String cookiesHeader, boolean z10) {
        e0.checkNotNullParameter(cookiesHeader, "cookiesHeader");
        return p1.toMap(rv.f0.map(rv.f0.filter(rv.f0.map(x.findAll$default(clientCookieHeaderPattern, cookiesHeader, 0, 2, null), AnonymousClass1.INSTANCE), new AnonymousClass2(z10)), AnonymousClass3.INSTANCE));
    }

    public static /* synthetic */ Map parseClientCookiesHeader$default(String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return parseClientCookiesHeader(str, z10);
    }

    public static final Cookie parseServerSetCookieHeader(String cookiesHeader) {
        CookieEncoding cookieEncodingValueOf;
        e0.checkNotNullParameter(cookiesHeader, "cookiesHeader");
        Map<String, String> clientCookiesHeader = parseClientCookiesHeader(cookiesHeader, false);
        Iterator<T> it = clientCookiesHeader.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!k0.startsWith$default((String) entry.getKey(), "$", false, 2, null)) {
                String str = clientCookiesHeader.get("$x-enc");
                if (str == null || (cookieEncodingValueOf = CookieEncoding.valueOf(str)) == null) {
                    cookieEncodingValueOf = CookieEncoding.RAW;
                }
                CookieEncoding cookieEncoding = cookieEncodingValueOf;
                LinkedHashMap linkedHashMap = new LinkedHashMap(o1.mapCapacity(clientCookiesHeader.size()));
                Iterator<T> it2 = clientCookiesHeader.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it2.next();
                    linkedHashMap.put(TextKt.toLowerCasePreservingASCIIRules((String) entry2.getKey()), entry2.getValue());
                }
                String str2 = (String) entry.getKey();
                String strDecodeCookieValue = decodeCookieValue((String) entry.getValue(), cookieEncoding);
                String str3 = (String) linkedHashMap.get(io.ktor.client.utils.CacheControl.MAX_AGE);
                int intClamping = str3 != null ? toIntClamping(str3) : 0;
                String str4 = (String) linkedHashMap.get("expires");
                GMTDate gMTDateFromCookieToGmtDate = str4 != null ? DateUtilsKt.fromCookieToGmtDate(str4) : null;
                String str5 = (String) linkedHashMap.get(C3191e4.i.D);
                String str6 = (String) linkedHashMap.get("path");
                boolean zContainsKey = linkedHashMap.containsKey("secure");
                boolean zContainsKey2 = linkedHashMap.containsKey("httponly");
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry<String, String> entry3 : clientCookiesHeader.entrySet()) {
                    String key = entry3.getKey();
                    if (!loweredPartNames.contains(TextKt.toLowerCasePreservingASCIIRules(key)) && !e0.areEqual(key, entry.getKey())) {
                        linkedHashMap2.put(entry3.getKey(), entry3.getValue());
                    }
                }
                return new Cookie(str2, strDecodeCookieValue, cookieEncoding, intClamping, gMTDateFromCookieToGmtDate, str5, str6, zContainsKey, zContainsKey2, linkedHashMap2);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static final String renderCookieHeader(Cookie cookie) {
        e0.checkNotNullParameter(cookie, "cookie");
        return cookie.getName() + G5.T + encodeCookieValue(cookie.getValue(), cookie.getEncoding());
    }

    public static final String renderSetCookieHeader(Cookie cookie) {
        e0.checkNotNullParameter(cookie, "cookie");
        return renderSetCookieHeader$default(cookie.getName(), cookie.getValue(), cookie.getEncoding(), cookie.getMaxAgeInt(), cookie.getExpires(), cookie.getDomain(), cookie.getPath(), cookie.getSecure(), cookie.getHttpOnly(), cookie.getExtensions(), false, 1024, null);
    }

    public static /* synthetic */ String renderSetCookieHeader$default(String str, String str2, CookieEncoding cookieEncoding, int i10, GMTDate gMTDate, String str3, String str4, boolean z10, boolean z11, Map map, boolean z12, int i11, Object obj) {
        return renderSetCookieHeader(str, str2, (i11 & 4) != 0 ? CookieEncoding.URI_ENCODING : cookieEncoding, (i11 & 8) != 0 ? 0 : i10, (i11 & 16) != 0 ? null : gMTDate, (i11 & 32) != 0 ? null : str3, (i11 & 64) == 0 ? str4 : null, (i11 & 128) != 0 ? false : z10, (i11 & NotificationCompat.FLAG_LOCAL_ONLY) == 0 ? z11 : false, (i11 & 512) != 0 ? p1.emptyMap() : map, (i11 & 1024) != 0 ? true : z12);
    }

    private static final boolean shouldEscapeInCookies(char c10) {
        return e.isWhitespace(c10) || e0.compare((int) c10, 32) < 0 || cookieCharsShouldBeEscaped.contains(Character.valueOf(c10));
    }

    private static final int toIntClamping(String str) {
        return (int) qv.v.coerceIn(Long.parseLong(str), 0L, 2147483647L);
    }

    public static final String renderSetCookieHeader(String name, String value, CookieEncoding encoding, int i10, GMTDate gMTDate, String str, String str2, boolean z10, boolean z11, Map<String, String> extensions, boolean z12) {
        String str3;
        String str4;
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(value, "value");
        e0.checkNotNullParameter(encoding, "encoding");
        e0.checkNotNullParameter(extensions, "extensions");
        StringBuilder sbS = b.s(assertCookieName(name), G5.T);
        sbS.append(encodeCookieValue(value.toString(), encoding));
        String string = sbS.toString();
        Integer numValueOf = i10 > 0 ? Integer.valueOf(i10) : null;
        String str5 = "";
        String str6 = numValueOf != null ? "Max-Age=" + numValueOf : "";
        String httpDate = gMTDate != null ? DateUtilsKt.toHttpDate(gMTDate) : null;
        String str7 = httpDate == null ? "" : "Expires=" + ((Object) httpDate);
        CookieEncoding cookieEncoding = CookieEncoding.RAW;
        String str8 = str == null ? "" : "Domain=" + encodeCookieValue(str.toString(), cookieEncoding);
        String str9 = str2 == null ? "" : "Path=" + encodeCookieValue(str2.toString(), cookieEncoding);
        if (!z10) {
            str3 = "";
        } else {
            str3 = "Secure";
        }
        if (!z11) {
            str4 = "";
        } else {
            str4 = "HttpOnly";
        }
        List listListOf = p0.listOf((Object[]) new String[]{string, str6, str7, str8, str9, str3, str4});
        ArrayList arrayList = new ArrayList(extensions.size());
        for (Map.Entry<String, String> entry : extensions.entrySet()) {
            String strAssertCookieName = assertCookieName(entry.getKey());
            String value2 = entry.getValue();
            if (value2 != null) {
                CookieEncoding cookieEncoding2 = CookieEncoding.RAW;
                StringBuilder sbS2 = b.s(strAssertCookieName, G5.T);
                sbS2.append(encodeCookieValue(value2.toString(), cookieEncoding2));
                strAssertCookieName = sbS2.toString();
            }
            arrayList.add(strAssertCookieName);
        }
        List listPlus = y0.plus((Collection) listListOf, (Iterable) arrayList);
        if (z12) {
            String strName = encoding.name();
            str5 = strName == null ? "$x-enc" : "$x-enc=" + encodeCookieValue(strName.toString(), CookieEncoding.RAW);
        }
        List listPlus2 = y0.plus((Collection<? extends String>) listPlus, str5);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listPlus2) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        return y0.joinToString$default(arrayList2, "; ", null, null, 0, null, null, 62, null);
    }
}
