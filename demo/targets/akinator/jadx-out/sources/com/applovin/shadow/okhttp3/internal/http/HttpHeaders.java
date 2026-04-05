package com.applovin.shadow.okhttp3.internal.http;

import com.applovin.shadow.okhttp3.Challenge;
import com.applovin.shadow.okhttp3.Cookie;
import com.applovin.shadow.okhttp3.CookieJar;
import com.applovin.shadow.okhttp3.Headers;
import com.applovin.shadow.okhttp3.HttpUrl;
import com.applovin.shadow.okhttp3.Response;
import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okhttp3.internal.platform.Platform;
import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.ByteString;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.e0;
import sv.k0;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class HttpHeaders {
    private static final ByteString QUOTED_STRING_DELIMITERS;
    private static final ByteString TOKEN_DELIMITERS;

    static {
        ByteString.Companion companion = ByteString.Companion;
        QUOTED_STRING_DELIMITERS = companion.encodeUtf8("\"\\");
        TOKEN_DELIMITERS = companion.encodeUtf8("\t ,=");
    }

    @f
    public static final boolean hasBody(Response response) {
        e0.checkNotNullParameter(response, "response");
        return promisesBody(response);
    }

    public static final List<Challenge> parseChallenges(Headers headers, String headerName) {
        e0.checkNotNullParameter(headers, "<this>");
        e0.checkNotNullParameter(headerName, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (k0.equals(headerName, headers.name(i10), true)) {
                try {
                    readChallengeHeader(new Buffer().writeUtf8(headers.value(i10)), arrayList);
                } catch (EOFException e10) {
                    Platform.Companion.get().log("Unable to parse challenge", 5, e10);
                }
            }
        }
        return arrayList;
    }

    public static final boolean promisesBody(Response response) {
        e0.checkNotNullParameter(response, "<this>");
        if (e0.areEqual(response.request().method(), "HEAD")) {
            return false;
        }
        int iCode = response.code();
        return (((iCode >= 100 && iCode < 200) || iCode == 204 || iCode == 304) && Util.headersContentLength(response) == -1 && !k0.equals("chunked", Response.header$default(response, "Transfer-Encoding", null, 2, null), true)) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b9, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b9, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void readChallengeHeader(com.applovin.shadow.okio.Buffer r7, java.util.List<com.applovin.shadow.okhttp3.Challenge> r8) throws java.io.EOFException {
        /*
            r0 = 0
        L1:
            r1 = r0
        L2:
            if (r1 != 0) goto Lf
            skipCommasAndWhitespace(r7)
            java.lang.String r1 = readToken(r7)
            if (r1 != 0) goto Lf
            goto Lb6
        Lf:
            boolean r2 = skipCommasAndWhitespace(r7)
            java.lang.String r3 = readToken(r7)
            if (r3 != 0) goto L2e
            boolean r7 = r7.exhausted()
            if (r7 != 0) goto L21
            goto Lb6
        L21:
            com.applovin.shadow.okhttp3.Challenge r7 = new com.applovin.shadow.okhttp3.Challenge
            java.util.Map r0 = uu.p1.emptyMap()
            r7.<init>(r1, r0)
            r8.add(r7)
            return
        L2e:
            r4 = 61
            int r5 = com.applovin.shadow.okhttp3.internal.Util.skipAll(r7, r4)
            boolean r6 = skipCommasAndWhitespace(r7)
            if (r2 != 0) goto L65
            if (r6 != 0) goto L42
            boolean r2 = r7.exhausted()
            if (r2 == 0) goto L65
        L42:
            com.applovin.shadow.okhttp3.Challenge r2 = new com.applovin.shadow.okhttp3.Challenge
            java.lang.StringBuilder r3 = p0.o2.u(r3)
            java.lang.String r4 = "="
            java.lang.String r4 = sv.k0.repeat(r4, r5)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            java.lang.String r4 = "singletonMap<String, Str…ek + \"=\".repeat(eqCount))"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r3, r4)
            r2.<init>(r1, r3)
            r8.add(r2)
            goto L1
        L65:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            int r6 = com.applovin.shadow.okhttp3.internal.Util.skipAll(r7, r4)
            int r6 = r6 + r5
        L6f:
            if (r3 != 0) goto L80
            java.lang.String r3 = readToken(r7)
            boolean r5 = skipCommasAndWhitespace(r7)
            if (r5 != 0) goto Lb9
            int r5 = com.applovin.shadow.okhttp3.internal.Util.skipAll(r7, r4)
            r6 = r5
        L80:
            if (r6 == 0) goto Lb9
            r5 = 1
            if (r6 <= r5) goto L86
            goto Lb6
        L86:
            boolean r5 = skipCommasAndWhitespace(r7)
            if (r5 == 0) goto L8d
            goto Lb6
        L8d:
            r5 = 34
            boolean r5 = startsWith(r7, r5)
            if (r5 == 0) goto L9a
            java.lang.String r5 = readQuotedString(r7)
            goto L9e
        L9a:
            java.lang.String r5 = readToken(r7)
        L9e:
            if (r5 != 0) goto La1
            goto Lb6
        La1:
            java.lang.Object r3 = r2.put(r3, r5)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto Laa
            goto Lb6
        Laa:
            boolean r3 = skipCommasAndWhitespace(r7)
            if (r3 != 0) goto Lb7
            boolean r3 = r7.exhausted()
            if (r3 != 0) goto Lb7
        Lb6:
            return
        Lb7:
            r3 = r0
            goto L6f
        Lb9:
            com.applovin.shadow.okhttp3.Challenge r4 = new com.applovin.shadow.okhttp3.Challenge
            r4.<init>(r1, r2)
            r8.add(r4)
            r1 = r3
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okhttp3.internal.http.HttpHeaders.readChallengeHeader(com.applovin.shadow.okio.Buffer, java.util.List):void");
    }

    private static final String readQuotedString(Buffer buffer) throws EOFException {
        if (buffer.readByte() != 34) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Buffer buffer2 = new Buffer();
        while (true) {
            long jIndexOfElement = buffer.indexOfElement(QUOTED_STRING_DELIMITERS);
            if (jIndexOfElement == -1) {
                return null;
            }
            if (buffer.getByte(jIndexOfElement) == 34) {
                buffer2.write(buffer, jIndexOfElement);
                buffer.readByte();
                return buffer2.readUtf8();
            }
            if (buffer.size() == jIndexOfElement + 1) {
                return null;
            }
            buffer2.write(buffer, jIndexOfElement);
            buffer.readByte();
            buffer2.write(buffer, 1L);
        }
    }

    private static final String readToken(Buffer buffer) {
        long jIndexOfElement = buffer.indexOfElement(TOKEN_DELIMITERS);
        if (jIndexOfElement == -1) {
            jIndexOfElement = buffer.size();
        }
        if (jIndexOfElement != 0) {
            return buffer.readUtf8(jIndexOfElement);
        }
        return null;
    }

    public static final void receiveHeaders(CookieJar cookieJar, HttpUrl url, Headers headers) {
        e0.checkNotNullParameter(cookieJar, "<this>");
        e0.checkNotNullParameter(url, "url");
        e0.checkNotNullParameter(headers, "headers");
        if (cookieJar == CookieJar.NO_COOKIES) {
            return;
        }
        List<Cookie> all = Cookie.Companion.parseAll(url, headers);
        if (all.isEmpty()) {
            return;
        }
        cookieJar.saveFromResponse(url, all);
    }

    private static final boolean skipCommasAndWhitespace(Buffer buffer) throws EOFException {
        boolean z10 = false;
        while (!buffer.exhausted()) {
            byte b10 = buffer.getByte(0L);
            if (b10 == 44) {
                buffer.readByte();
                z10 = true;
            } else {
                if (b10 != 32 && b10 != 9) {
                    break;
                }
                buffer.readByte();
            }
        }
        return z10;
    }

    private static final boolean startsWith(Buffer buffer, byte b10) {
        return !buffer.exhausted() && buffer.getByte(0L) == b10;
    }
}
