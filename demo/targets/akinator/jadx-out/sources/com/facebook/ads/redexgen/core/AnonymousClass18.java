package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.shadow.okhttp3.internal.http.StatusLine;
import com.applovin.shadow.okio.Utf8;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.inmobi.commons.core.configs.AdConfig;
import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.protobuf.EventTypeExtended;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.Proxy;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.facebook.ads.redexgen.X.18, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass18 extends AbstractC10549l implements InterfaceC10479e {
    public static byte[] A0G;
    public static String[] A0H = {"oHtrkf711", "OALAWpvM4V43TAH4yIQoOhxEEr6GacAE", "Hh5EFVgHa3Asp8lHlYejA", "RFLx7idHDwwo1808RkkCK", "SJ5smVJpw", "R3kqAJTnVJNs7pGyArjUElZegIjSHDR8", "bae9e6aq2V8bVVKZmWDXAczRXcgESOJG", "FE1YY4rUq5RhzOvKgv0QhVD"};

    @MetaExoPlayerCustomization
    public static final Pattern A0I;

    @MetaExoPlayerCustomization("Meta Specific, added in D30556310")
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public AnonymousClass56 A04;
    public InterfaceC2280jB<String> A05;
    public InputStream A06;
    public HttpURLConnection A07;
    public boolean A08;
    public final int A09;
    public final int A0A;
    public final C5C A0B;
    public final C5C A0C;
    public final String A0D;
    public final boolean A0E;
    public final boolean A0F;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0G, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 16);
        }
        return new String(bArrCopyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 17
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @MetaExoPlayerCustomization("Meta Specific, added in D4001689 for 'Handling loopback Address'")
    private HttpURLConnection A05(URL url, int i10, byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map<String, String> map) throws IOException {
        HttpURLConnection httpURLConnectionA06 = InetAddress.getByName(url.getHost()).isLoopbackAddress() ? A06(url, Proxy.NO_PROXY) : A04(url);
        httpURLConnectionA06.setConnectTimeout(this.A09);
        httpURLConnectionA06.setReadTimeout(this.A0A);
        HashMap map2 = new HashMap();
        if (this.A0B != null) {
            map2.putAll(this.A0B.A00());
        }
        map2.putAll(this.A0C.A00());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnectionA06.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String strA03 = C5D.A03(j10, j11);
        if (strA03 != null) {
            httpURLConnectionA06.setRequestProperty(A02(172, 5, 115), strA03);
        }
        if (this.A0D != null) {
            httpURLConnectionA06.setRequestProperty(A02(Sdk.SDKError.Reason.AD_CLOSED_TEMPLATE_ERROR_VALUE, 10, 51), this.A0D);
        }
        httpURLConnectionA06.setRequestProperty(A02(5, 15, 86), z10 ? A02(490, 4, 104) : A02(503, 8, 3));
        httpURLConnectionA06.setInstanceFollowRedirects(z11);
        httpURLConnectionA06.setDoOutput(bArr != null);
        httpURLConnectionA06.setRequestMethod(AnonymousClass56.A01(i10));
        if (bArr != null) {
            httpURLConnectionA06.setFixedLengthStreamingMode(bArr.length);
            httpURLConnectionA06.connect();
            OutputStream outputStream = httpURLConnectionA06.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnectionA06.connect();
        }
        return httpURLConnectionA06;
    }

    public static void A09() {
        A0G = new byte[]{-93, -9, -14, -93, 126, -89, -55, -55, -53, -42, -38, -109, -85, -44, -55, -43, -54, -49, -44, -51, -90, -46, -47, -41, -56, -47, -41, -112, -88, -47, -58, -46, -57, -52, -47, -54, -65, -21, -22, -16, -31, -22, -16, -87, -56, -31, -22, -29, -16, -28, -113, -69, -70, -64, -79, -70, -64, 121, -98, -83, -70, -77, -79, 126, -97, -96, -101, -81, -90, -82, -126, -82, -82, -86, 126, -101, -82, -101, -115, -87, -81, -84, -99, -97, -67, -30, -20, -38, -27, -27, -24, -16, -34, -35, -103, -36, -21, -24, -20, -20, -90, -23, -21, -24, -19, -24, -36, -24, -27, -103, -21, -34, -35, -30, -21, -34, -36, -19, -103, -95, 121, -98, -109, -97, -98, -93, -103, -93, -92, -107, -98, -92, 80, -104, -107, -111, -108, -107, -94, -93, 80, -117, -122, -87, -99, -101, -82, -93, -87, -88, -53, -14, -23, -23, -99, -23, -20, -32, -34, -15, -26, -20, -21, -99, -17, -30, -31, -26, -17, -30, -32, -15, -43, -28, -15, -22, -24, -56, -29, -29, -108, -31, -43, -30, -19, -108, -26, -39, -40, -35, -26, -39, -41, -24, -25, -82, -108, -97, -72, -81, -62, -70, -81, -83, -66, -81, -82, 106, -115, -71, -72, -66, -81, -72, -66, 119, -106, -81, -72, -79, -66, -78, 106, -91, 122, -109, -118, -99, -107, -118, -120, -103, -118, -119, 69, 104, -108, -109, -103, -118, -109, -103, 82, 119, -122, -109, -116, -118, 69, -128, 113, -118, -127, -108, -116, -127, AbstractJsonLexerKt.TC_INVALID, -112, -127, -128, 60, -127, -114, -114, -117, -114, 60, -109, -124, -123, -120, -127, 60, -128, -123, -113, AbstractJsonLexerKt.TC_INVALID, -117, -118, -118, -127, AbstractJsonLexerKt.TC_INVALID, -112, -123, -118, -125, -100, -75, -70, -68, -73, -73, -74, -71, -69, -84, -85, 103, -73, -71, -74, -69, -74, -86, -74, -77, 103, -71, -84, -85, -80, -71, -84, -86, -69, -127, 103, -104, -74, -88, -75, 112, -124, -86, -88, -79, -73, -47, 111, 50, 109, 116, 120, -113, -118, 123, -119, 54, 62, 114, 122, 65, Utf8.REPLACEMENT_BYTE, 67, 62, 114, 122, 65, Utf8.REPLACEMENT_BYTE, 69, 62, 114, 122, 65, Utf8.REPLACEMENT_BYTE, 58, -126, -114, -116, 77, -128, -115, -125, -111, -114, -120, -125, 77, -114, -118, -121, -109, -109, -113, 77, -120, -115, -109, -124, -111, -115, -128, -117, 77, -121, -109, -109, -113, 77, 103, -109, -109, -113, 115, -111, -128, -115, -110, -113, -114, -111, -109, 67, 98, -121, -108, -115, -118, -124, -125, 104, -115, -113, -108, -109, 114, -109, -111, -124, -128, -116, -73, -61, -63, -126, -75, -62, -72, -58, -61, -67, -72, -126, -61, -65, -68, -56, -56, -60, -126, -67, -62, -56, -71, -58, -62, -75, -64, -126, -68, -56, -56, -60, -126, -100, -56, -56, -60, -88, -58, -75, -62, -57, -60, -61, -58, -56, 120, -102, -67, -52, -71, -72, -96, -71, -62, -69, -56, -68, -99, -62, -60, -55, -56, -89, -56, -58, -71, -75, -63, -33, -14, -31, -24, -29, -17, -17, -21, -57, -45, -45, -49, -46, 124, 119, 120, -127, -121, 124, -121, -116, 2, -5, -14, 5, -3, -14, -16, 1, -14, -15, -46, -5, -15, -36, -13, -42, -5, -3, 2, 1};
    }

    static {
        A09();
        A0I = Pattern.compile(A02(331, 25, 6));
    }

    @Deprecated
    public AnonymousClass18() {
        this(null, 8000, 8000);
    }

    @Deprecated
    public AnonymousClass18(String str, int i10, int i11) {
        this(str, i10, i11, false, null);
    }

    @Deprecated
    public AnonymousClass18(String str, int i10, int i11, boolean z10, C5C c5c) {
        this(str, i10, i11, z10, c5c, null, false);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.jB != com.google.common.base.Predicate<java.lang.String> */
    public AnonymousClass18(String str, int i10, int i11, boolean z10, C5C c5c, InterfaceC2280jB<String> interfaceC2280jB, boolean z11) {
        super(true);
        this.A00 = -1;
        this.A0D = str;
        this.A09 = i10;
        this.A0A = i11;
        this.A0E = z10;
        this.A0B = c5c;
        this.A05 = interfaceC2280jB;
        this.A0C = new C5C();
        this.A0F = z11;
    }

    private int A00(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        if (this.A03 != -1) {
            long bytesRemaining = this.A03 - this.A02;
            if (bytesRemaining == 0) {
                return -1;
            }
            i11 = (int) Math.min(i11, bytesRemaining);
        }
        int i12 = ((InputStream) AbstractC09264a.A0f(this.A06)).read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        this.A02 += i12;
        A0F(i12);
        return i12;
    }

    @MetaExoPlayerCustomization
    public static long A01(HttpURLConnection httpURLConnection) throws NumberFormatException {
        long jMax = -1;
        String headerField = httpURLConnection.getHeaderField(A02(36, 14, 108));
        boolean zIsEmpty = TextUtils.isEmpty(headerField);
        String strA02 = A02(327, 1, 100);
        String strA022 = A02(63, 21, 42);
        if (!zIsEmpty) {
            try {
                jMax = Long.parseLong(headerField);
            } catch (NumberFormatException unused) {
                AnonymousClass44.A05(strA022, A02(197, 27, 58) + headerField + strA02);
            }
        }
        String headerField2 = httpURLConnection.getHeaderField(A02(50, 13, 60));
        if (!TextUtils.isEmpty(headerField2)) {
            Matcher matcher = A0I.matcher(headerField2);
            if (matcher.find()) {
                try {
                    long j10 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                    if (jMax < 0) {
                        return j10;
                    }
                    if (jMax != j10) {
                        AnonymousClass44.A07(strA022, A02(AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL, 22, 32) + headerField + A02(328, 3, 2) + headerField2 + strA02);
                        jMax = Math.max(jMax, j10);
                        return jMax;
                    }
                    return jMax;
                } catch (NumberFormatException unused2) {
                    AnonymousClass44.A05(strA022, A02(224, 26, 21) + headerField2 + strA02);
                    return jMax;
                }
            }
            return jMax;
        }
        return jMax;
    }

    private HttpURLConnection A03(AnonymousClass56 anonymousClass56) throws IOException {
        HttpURLConnection httpURLConnectionA05;
        URL url = new URL(anonymousClass56.A06.toString());
        int i10 = anonymousClass56.A01;
        byte[] bArr = anonymousClass56.A0A;
        long j10 = anonymousClass56.A04;
        long j11 = anonymousClass56.A03;
        boolean zA06 = anonymousClass56.A06(1);
        if (!this.A0E && !this.A0F) {
            Map<String, String> map = anonymousClass56.A09;
            String[] strArr = A0H;
            if (strArr[2].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            A0H[1] = "MDuHDm4cbdnEm3n4Ii2p7N8pDyl3ksX4";
            return A05(url, i10, bArr, j10, j11, zA06, true, map);
        }
        int responseCode = 0;
        while (true) {
            int i11 = responseCode + 1;
            if (responseCode > 20) {
                throw new C2540nc(new NoRouteToHostException(A02(177, 20, 100) + i11), anonymousClass56, 2001, 1);
            }
            URL url2 = url;
            httpURLConnectionA05 = A05(url, i10, bArr, j10, j11, zA06, false, anonymousClass56.A09);
            int responseCode2 = httpURLConnectionA05.getResponseCode();
            String headerField = httpURLConnectionA05.getHeaderField(A02(142, 8, 42));
            if ((i10 == 1 || i10 == 3) && (responseCode2 == 300 || responseCode2 == 301 || responseCode2 == 302 || responseCode2 == 303 || responseCode2 == 307 || responseCode2 == 308)) {
                httpURLConnectionA05.disconnect();
                url = A07(url2, headerField, anonymousClass56);
            } else {
                if (i10 != 2 || (responseCode2 != 300 && responseCode2 != 301 && responseCode2 != 302 && responseCode2 != 303)) {
                    break;
                }
                httpURLConnectionA05.disconnect();
                if (!(this.A0F && responseCode2 == 302)) {
                    i10 = 1;
                    bArr = null;
                }
                url = A07(url2, headerField, anonymousClass56);
            }
            responseCode = i11;
        }
        return httpURLConnectionA05;
    }

    private final HttpURLConnection A04(URL url) throws IOException {
        return (HttpURLConnection) url.openConnection();
    }

    @MetaExoPlayerCustomization
    private final HttpURLConnection A06(URL url, Proxy proxy) throws IOException {
        return (HttpURLConnection) url.openConnection(proxy);
    }

    private URL A07(URL url, String str, AnonymousClass56 anonymousClass56) throws C2540nc {
        if (str == null) {
            throw new C2540nc(A02(150, 22, 109), anonymousClass56, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!A02(498, 5, 79).equals(protocol) && !A02(494, 4, 107).equals(protocol)) {
                throw new C2540nc(A02(286, 31, 55) + protocol, anonymousClass56, 2001, 1);
            }
            if (!this.A0E && !protocol.equals(url.getProtocol())) {
                throw new C2540nc(A02(84, 36, 105) + url.getProtocol() + A02(0, 4, 115) + protocol + A02(4, 1, 69), anonymousClass56, 2001, 1);
            }
            return url2;
        } catch (MalformedURLException e10) {
            throw new C2540nc(e10, anonymousClass56, 2001, 1);
        }
    }

    private void A08() {
        if (this.A07 != null) {
            try {
                this.A07.disconnect();
            } catch (Exception e10) {
                AnonymousClass44.A08(A02(63, 21, 42), A02(250, 36, 12), e10);
            }
            this.A07 = null;
        }
    }

    private void A0A(long j10, AnonymousClass56 anonymousClass56) throws IOException {
        if (j10 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j10 > 0) {
            int i10 = ((InputStream) AbstractC09264a.A0f(this.A06)).read(bArr, 0, (int) Math.min(j10, bArr.length));
            if (!Thread.currentThread().isInterrupted()) {
                if (i10 != -1) {
                    j10 -= i10;
                    A0F(i10);
                } else {
                    throw new C2540nc(anonymousClass56, 2008, 1);
                }
            } else {
                throw new C2540nc(new InterruptedIOException(), anonymousClass56, 2000, 1);
            }
        }
    }

    public static void A0B(HttpURLConnection httpURLConnection, long j10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (httpURLConnection != null) {
            int i10 = AbstractC09264a.A02;
            if (A0H[5].charAt(19) == 'a') {
                throw new RuntimeException();
            }
            A0H[7] = "Vr7TSbIm52LxE4LVc9eYFTM";
            if (i10 < 19 || AbstractC09264a.A02 > 20) {
                return;
            }
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j10 == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j10 <= 2048) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if (A02(356, 65, 15).equals(name) || A02(StatusLine.HTTP_MISDIRECTED_REQUEST, 69, 68).equals(name)) {
                    Method declaredMethod = ((Class) C3M.A01(inputStream.getClass().getSuperclass())).getDeclaredMethod(A02(EventTypeExtended.EVENT_TYPE_EXTENDED_AD_EXPIRED_VALUE, 20, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE), new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, new Object[0]);
                }
            } catch (Exception unused) {
            }
        }
    }

    public static boolean A0C(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField(A02(20, 16, 83));
        String contentEncoding = A02(490, 4, 104);
        return contentEncoding.equalsIgnoreCase(headerField);
    }

    public final void A0I(String str, String str2) {
        C3M.A01(str);
        C3M.A01(str2);
        this.A0C.A01(str, str2);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC10549l, com.facebook.ads.redexgen.core.InterfaceC2549nl
    public final Map<String, List<String>> A8l() {
        if (this.A07 == null) {
            return AbstractC2485mj.A04();
        }
        return new C10519i(this.A07.getHeaderFields());
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2549nl
    public final Uri A9H() {
        if (this.A07 == null) {
            return null;
        }
        return Uri.parse(this.A07.getURL().toString());
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2549nl
    @MetaExoPlayerCustomization("customizations: (1) loop commented 'Append headers from data spec' (D6487388,D6506073) (2) ischunkedTransfer (D15078204)")
    public final long AFy(final AnonymousClass56 anonymousClass56) throws IOException, NumberFormatException {
        final byte[] bArrA1F;
        final C09514z c09514z;
        this.A04 = anonymousClass56;
        long j10 = 0;
        this.A02 = 0L;
        this.A03 = 0L;
        A0G(anonymousClass56);
        if (anonymousClass56.A07 != null) {
            for (Map.Entry<String, String> entry : anonymousClass56.A07.A0Q.entrySet()) {
                A0I(entry.getKey(), entry.getValue());
            }
        }
        try {
            this.A07 = A03(anonymousClass56);
            HttpURLConnection httpURLConnection = this.A07;
            this.A01 = httpURLConnection.getResponseCode();
            final String responseMessage = httpURLConnection.getResponseMessage();
            int i10 = this.A01;
            String strA02 = A02(50, 13, 60);
            if (i10 < 200 || this.A01 > 299) {
                final Map<String, List<String>> headers = httpURLConnection.getHeaderFields();
                if (this.A01 == 416) {
                    if (anonymousClass56.A04 == C5D.A00(httpURLConnection.getHeaderField(strA02))) {
                        this.A08 = true;
                        A0H(anonymousClass56);
                        if (anonymousClass56.A03 != -1) {
                            return anonymousClass56.A03;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = httpURLConnection.getErrorStream();
                try {
                    bArrA1F = errorStream != null ? AbstractC09264a.A1F(errorStream) : AbstractC09264a.A07;
                } catch (IOException unused) {
                    bArrA1F = AbstractC09264a.A07;
                }
                A08();
                if (this.A01 == 416) {
                    c09514z = new C09514z(2008);
                } else {
                    c09514z = null;
                }
                final int i11 = this.A01;
                throw new C2540nc(i11, responseMessage, c09514z, headers, anonymousClass56, bArrA1F) { // from class: com.facebook.ads.redexgen.X.9f
                    public static byte[] A04;
                    public final int A00;
                    public final String A01;
                    public final Map<String, List<String>> A02;
                    public final byte[] A03;

                    static {
                        A02();
                    }

                    public static String A01(int i12, int i13, int i14) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i12, i12 + i13);
                        for (int i15 = 0; i15 < bArrCopyOfRange.length; i15++) {
                            bArrCopyOfRange[i15] = (byte) ((bArrCopyOfRange[i15] ^ i14) ^ 101);
                        }
                        return new String(bArrCopyOfRange);
                    }

                    public static void A02() {
                        A04 = new byte[]{16, 39, 49, 50, 45, 44, 49, 39, 98, 33, 45, 38, 39, 120, 98};
                    }

                    {
                        super(A01(0, 15, 39) + i11, c09514z, anonymousClass56, 2004, 1);
                        this.A00 = i11;
                        this.A01 = responseMessage;
                        this.A02 = headers;
                        this.A03 = bArrA1F;
                    }
                };
            }
            final String contentType = httpURLConnection.getContentType();
            if (this.A05 == null || this.A05.A44(contentType)) {
                if (this.A01 == 200 && anonymousClass56.A04 != 0) {
                    j10 = anonymousClass56.A04;
                }
                boolean zA0C = A0C(httpURLConnection);
                if (zA0C) {
                    this.A03 = anonymousClass56.A03;
                } else {
                    int i12 = (A01(httpURLConnection) > (-1L) ? 1 : (A01(httpURLConnection) == (-1L) ? 0 : -1));
                    if (anonymousClass56.A03 != -1) {
                        this.A03 = anonymousClass56.A03;
                    } else {
                        long jA01 = C5D.A01(httpURLConnection.getHeaderField(A02(36, 14, 108)), httpURLConnection.getHeaderField(strA02));
                        this.A03 = jA01 != -1 ? jA01 - j10 : -1L;
                    }
                }
                try {
                    this.A06 = httpURLConnection.getInputStream();
                    if (zA0C) {
                        this.A06 = new GZIPInputStream(this.A06);
                    }
                    this.A08 = true;
                    A0H(anonymousClass56);
                    try {
                        A0A(j10, anonymousClass56);
                        return this.A03;
                    } catch (IOException e10) {
                        A08();
                        if (!(e10 instanceof C2540nc)) {
                            throw new C2540nc(e10, anonymousClass56, 2000, 1);
                        }
                        throw ((C2540nc) e10);
                    }
                } catch (IOException e11) {
                    A08();
                    throw new C2540nc(e11, anonymousClass56, 2000, 1);
                }
            }
            A08();
            IOException e12 = new C2540nc(contentType, anonymousClass56) { // from class: com.facebook.ads.redexgen.X.9g
                public static byte[] A01;
                public final String A00;

                static {
                    A02();
                }

                public static String A01(int i13, int i14, int i15) {
                    byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i13, i13 + i14);
                    for (int i16 = 0; i16 < bArrCopyOfRange.length; i16++) {
                        bArrCopyOfRange[i16] = (byte) ((bArrCopyOfRange[i16] - i15) - 87);
                    }
                    return new String(bArrCopyOfRange);
                }

                public static void A02() {
                    A01 = new byte[]{-11, 26, 34, 13, 24, 21, 16, -52, 15, 27, 26, 32, 17, 26, 32, -52, 32, 37, 28, 17, -26, -52};
                }

                {
                    super(A01(0, 22, 85) + contentType, anonymousClass56, 2003, 1);
                    this.A00 = contentType;
                }
            };
            throw e12;
        } catch (IOException e13) {
            A08();
            throw C2540nc.A04(e13, anonymousClass56, 1);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2549nl
    public final void close() throws C2540nc {
        try {
            InputStream inputStream = this.A06;
            if (inputStream != null) {
                A0B(this.A07, this.A03 != -1 ? this.A03 - this.A02 : -1L);
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    throw new C2540nc(e10, (AnonymousClass56) AbstractC09264a.A0f(this.A04), 2000, 3);
                }
            }
        } finally {
            this.A06 = null;
            A08();
            if (this.A08) {
                this.A08 = false;
                A0E();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass20
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        try {
            return A00(bArr, i10, i11);
        } catch (IOException e10) {
            throw C2540nc.A04(e10, (AnonymousClass56) AbstractC09264a.A0f(this.A04), 2);
        }
    }
}
