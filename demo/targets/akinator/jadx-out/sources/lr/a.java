package lr;

import android.net.Uri;
import java.net.HttpURLConnection;
import java.util.Map;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class a {
    public static final String appendQueryParameters(String url, Map<String, String> queryParameters) {
        e0.checkNotNullParameter(url, "url");
        e0.checkNotNullParameter(queryParameters, "queryParameters");
        if (queryParameters.isEmpty()) {
            return url;
        }
        Uri.Builder builderBuildUpon = Uri.parse(url).buildUpon();
        for (Map.Entry<String, String> entry : queryParameters.entrySet()) {
            builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        String string = builderBuildUpon.build().toString();
        e0.checkNotNullExpressionValue(string, "parse(url).buildUpon().a…     }.build().toString()");
        return string;
    }

    public static final void disconnectSafely(HttpURLConnection httpURLConnection) {
        b.disconnectSafely(httpURLConnection);
    }

    public static final String findEndpoint(String urlString) {
        e0.checkNotNullParameter(urlString, "urlString");
        return findEndpoint$default(urlString, 0, 2, null);
    }

    public static /* synthetic */ String findEndpoint$default(String str, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 500;
        }
        return findEndpoint(str, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b6 A[Catch: all -> 0x0036, Exception -> 0x00c8, TRY_LEAVE, TryCatch #2 {Exception -> 0x00c8, blocks: (B:23:0x006c, B:28:0x0089, B:35:0x009e, B:38:0x00a4, B:39:0x00a7, B:41:0x00b6), top: B:62:0x006c, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bd A[Catch: all -> 0x0036, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0036, blocks: (B:4:0x0022, B:7:0x002b, B:11:0x0039, B:13:0x0041, B:16:0x0049, B:18:0x0053, B:21:0x0061, B:23:0x006c, B:28:0x0089, B:35:0x009e, B:38:0x00a4, B:39:0x00a7, B:41:0x00b6, B:44:0x00bd, B:50:0x00cf, B:47:0x00c8, B:53:0x00d6), top: B:61:0x0022, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String findEndpoint(java.lang.String r12, int r13) {
        /*
            java.lang.String r0 = "nextUrl"
            java.lang.String r1 = "urlString"
            kotlin.jvm.internal.e0.checkNotNullParameter(r12, r1)
            r1 = 0
            java.net.URL r2 = new java.net.URL     // Catch: java.lang.Throwable -> Le1
            r2.<init>(r12)     // Catch: java.lang.Throwable -> Le1
            java.net.URLConnection r3 = r2.openConnection()     // Catch: java.lang.Throwable -> Le1
            java.lang.String r4 = "null cannot be cast to non-null type java.net.HttpURLConnection"
            kotlin.jvm.internal.e0.checkNotNull(r3, r4)     // Catch: java.lang.Throwable -> Le1
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch: java.lang.Throwable -> Le1
            r4 = 0
            r3.setInstanceFollowRedirects(r4)     // Catch: java.lang.Throwable -> Le1
            r3.setConnectTimeout(r13)     // Catch: java.lang.Throwable -> Le1
            r3.setReadTimeout(r13)     // Catch: java.lang.Throwable -> Le1
            int r13 = r3.getResponseCode()     // Catch: java.lang.Throwable -> L36
            java.lang.String r5 = "url.toString()"
            switch(r13) {
                case 301: goto L39;
                case 302: goto L39;
                case 303: goto L39;
                case 304: goto L2b;
                case 305: goto L39;
                case 306: goto L2b;
                case 307: goto L39;
                case 308: goto L39;
                default: goto L2b;
            }
        L2b:
            java.lang.String r13 = r2.toString()     // Catch: java.lang.Throwable -> L36
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r13, r5)     // Catch: java.lang.Throwable -> L36
            lr.b.disconnectSafely(r3)
            return r13
        L36:
            r1 = r3
            goto Le1
        L39:
            java.lang.String r13 = "Location"
            java.lang.String r13 = r3.getHeaderField(r13)     // Catch: java.lang.Throwable -> L36
            if (r13 == 0) goto Ld6
            int r6 = r13.length()     // Catch: java.lang.Throwable -> L36
            if (r6 != 0) goto L49
            goto Ld6
        L49:
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r13, r0)     // Catch: java.lang.Throwable -> L36
            boolean r5 = ir.q.isHttpUrl(r13)     // Catch: java.lang.Throwable -> L36
            r6 = 2
            if (r5 == 0) goto L61
            lr.b.disconnectSafely(r3)     // Catch: java.lang.Throwable -> L36
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r13, r0)     // Catch: java.lang.Throwable -> L36
            java.lang.String r12 = findEndpoint$default(r13, r4, r6, r1)     // Catch: java.lang.Throwable -> L36
            lr.b.disconnectSafely(r3)
            return r12
        L61:
            java.net.URI r5 = new java.net.URI     // Catch: java.lang.Throwable -> L36
            r5.<init>(r13)     // Catch: java.lang.Throwable -> L36
            java.lang.String r5 = r5.getScheme()     // Catch: java.lang.Throwable -> L36
            if (r5 != 0) goto Lcf
            java.net.URL r5 = new java.net.URL     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> Lc8
            r5.<init>(r2, r13)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> Lc8
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> Lc8
            java.lang.String r5 = "URL(url, nextUrl).toString()"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r2, r5)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> Lc8
            int r5 = r2.length()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> Lc8
            r7 = 1
            int r5 = r5 - r7
            r8 = r4
            r9 = r8
        L82:
            if (r8 > r5) goto La7
            if (r9 != 0) goto L88
            r10 = r8
            goto L89
        L88:
            r10 = r5
        L89:
            char r10 = r2.charAt(r10)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> Lc8
            r11 = 32
            int r10 = kotlin.jvm.internal.e0.compare(r10, r11)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> Lc8
            if (r10 > 0) goto L97
            r10 = r7
            goto L98
        L97:
            r10 = r4
        L98:
            if (r9 != 0) goto La1
            if (r10 != 0) goto L9e
            r9 = r7
            goto L82
        L9e:
            int r8 = r8 + 1
            goto L82
        La1:
            if (r10 != 0) goto La4
            goto La7
        La4:
            int r5 = r5 + (-1)
            goto L82
        La7:
            int r5 = r5 + r7
            java.lang.CharSequence r5 = r2.subSequence(r8, r5)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> Lc8
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> Lc8
            int r5 = r5.length()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> Lc8
            if (r5 != 0) goto Lbd
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r13, r0)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> Lc8
            lr.b.disconnectSafely(r3)
            return r13
        Lbd:
            lr.b.disconnectSafely(r3)     // Catch: java.lang.Throwable -> L36
            java.lang.String r12 = findEndpoint$default(r2, r4, r6, r1)     // Catch: java.lang.Throwable -> L36
            lr.b.disconnectSafely(r3)
            return r12
        Lc8:
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r13, r0)     // Catch: java.lang.Throwable -> L36
            lr.b.disconnectSafely(r3)
            return r13
        Lcf:
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r13, r0)     // Catch: java.lang.Throwable -> L36
            lr.b.disconnectSafely(r3)
            return r13
        Ld6:
            java.lang.String r13 = r2.toString()     // Catch: java.lang.Throwable -> L36
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r13, r5)     // Catch: java.lang.Throwable -> L36
            lr.b.disconnectSafely(r3)
            return r13
        Le1:
            lr.b.disconnectSafely(r1)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: lr.a.findEndpoint(java.lang.String, int):java.lang.String");
    }
}
