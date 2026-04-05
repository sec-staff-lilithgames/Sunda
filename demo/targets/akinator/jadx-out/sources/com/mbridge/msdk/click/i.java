package com.mbridge.msdk.click;

import android.text.TextUtils;
import android.webkit.URLUtil;
import com.amazon.device.ads.DtbConstants;
import com.ironsource.C3271ic;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.MBridgeHostnameVerifier;
import com.mbridge.msdk.foundation.tools.l0;
import com.mbridge.msdk.foundation.tools.p0;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class i {

    /* renamed from: f, reason: collision with root package name */
    private static final String f39707f = "i";

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.setting.g f39708a;

    /* renamed from: b, reason: collision with root package name */
    private String f39709b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f39710c = true;

    /* renamed from: d, reason: collision with root package name */
    private final int f39711d = 3145728;

    /* renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.click.entity.a f39712e;

    public i() {
        com.mbridge.msdk.setting.g gVarF = com.google.android.gms.internal.play_billing.a.f(com.mbridge.msdk.setting.h.b());
        this.f39708a = gVarF;
        if (gVarF == null) {
            this.f39708a = com.mbridge.msdk.setting.h.b().a();
        }
    }

    public com.mbridge.msdk.click.entity.a a(String str, boolean z10, boolean z11, CampaignEx campaignEx) {
        int i10;
        HttpsURLConnection httpsURLConnection = null;
        if (!URLUtil.isNetworkUrl(str)) {
            return null;
        }
        String strReplace = str.replace(" ", "%20");
        this.f39712e = new com.mbridge.msdk.click.entity.a();
        try {
            HttpsURLConnection httpsURLConnection2 = (HttpsURLConnection) new URL(strReplace).openConnection();
            try {
                httpsURLConnection2.setHostnameVerifier(new MBridgeHostnameVerifier(strReplace));
                httpsURLConnection2.setRequestMethod(C3271ic.f36943a);
                if ((!z10 && !z11) || campaignEx == null) {
                    httpsURLConnection2.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, l0.i());
                }
                if (z10 && campaignEx != null && campaignEx.getcUA() == 1) {
                    httpsURLConnection2.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, l0.i());
                }
                if (z11 && campaignEx != null && campaignEx.getImpUA() == 1) {
                    httpsURLConnection2.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, l0.i());
                }
                httpsURLConnection2.setRequestProperty("Accept-Encoding", "gzip");
                if (this.f39708a.I0() && !TextUtils.isEmpty(this.f39709b)) {
                    httpsURLConnection2.setRequestProperty("referer", this.f39709b);
                }
                httpsURLConnection2.setConnectTimeout(DtbConstants.NETWORK_READ_TIMEOUT);
                httpsURLConnection2.setReadTimeout(DtbConstants.NETWORK_READ_TIMEOUT);
                httpsURLConnection2.setInstanceFollowRedirects(false);
                httpsURLConnection2.connect();
                this.f39712e.f39685a = httpsURLConnection2.getHeaderField("Location");
                this.f39712e.f39688d = httpsURLConnection2.getHeaderField("Referer");
                this.f39712e.f39690f = httpsURLConnection2.getResponseCode();
                this.f39712e.f39686b = httpsURLConnection2.getContentType();
                this.f39712e.f39689e = httpsURLConnection2.getContentLength();
                this.f39712e.f39687c = httpsURLConnection2.getContentEncoding();
                boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(this.f39712e.f39687c);
                com.mbridge.msdk.click.entity.a aVar = this.f39712e;
                if (aVar.f39690f == 200 && this.f39710c && (i10 = aVar.f39689e) > 0 && i10 < 3145728 && !TextUtils.isEmpty(strReplace)) {
                    try {
                        String strA = a(httpsURLConnection2.getInputStream(), zEqualsIgnoreCase);
                        if (!TextUtils.isEmpty(strA)) {
                            byte[] bytes = strA.getBytes();
                            if (bytes.length > 0 && bytes.length < 3145728) {
                                this.f39712e.f39691g = strA.trim();
                            }
                        }
                    } catch (Throwable th2) {
                        p0.b(f39707f, th2.getMessage());
                    }
                }
                this.f39709b = strReplace;
                httpsURLConnection2.disconnect();
                return this.f39712e;
            } catch (Throwable th3) {
                th = th3;
                httpsURLConnection = httpsURLConnection2;
                try {
                    this.f39712e.f39692h = th.getMessage();
                    return this.f39712e;
                } finally {
                    if (httpsURLConnection != null) {
                        httpsURLConnection.disconnect();
                    }
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0036 A[Catch: all -> 0x000f, TryCatch #5 {all -> 0x000f, blocks: (B:4:0x0008, B:9:0x0013, B:23:0x0032, B:25:0x0036, B:26:0x0043), top: B:45:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e A[Catch: Exception -> 0x002f, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x002f, blocks: (B:18:0x002b, B:28:0x004e), top: B:41:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String a(java.io.InputStream r4, boolean r5) throws java.lang.Throwable {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            if (r5 == 0) goto L13
            java.util.zip.GZIPInputStream r5 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L11
            r5.<init>(r4)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L11
            r4 = r5
            goto L13
        Lf:
            r4 = move-exception
            goto L60
        L11:
            r4 = move-exception
            goto L32
        L13:
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L11
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L11
            r2.<init>(r4)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L11
            r5.<init>(r2)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L11
        L1d:
            java.lang.String r4 = r5.readLine()     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L29
            if (r4 == 0) goto L2b
            r0.append(r4)     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L29
            goto L1d
        L27:
            r4 = move-exception
            goto L61
        L29:
            r4 = move-exception
            goto L31
        L2b:
            r5.close()     // Catch: java.lang.Exception -> L2f
            goto L5b
        L2f:
            r4 = move-exception
            goto L52
        L31:
            r1 = r5
        L32:
            com.mbridge.msdk.click.entity.a r5 = r3.f39712e     // Catch: java.lang.Throwable -> Lf
            if (r5 != 0) goto L43
            com.mbridge.msdk.click.entity.a r5 = new com.mbridge.msdk.click.entity.a     // Catch: java.lang.Throwable -> Lf
            r5.<init>()     // Catch: java.lang.Throwable -> Lf
            r3.f39712e = r5     // Catch: java.lang.Throwable -> Lf
            java.lang.String r2 = r4.getMessage()     // Catch: java.lang.Throwable -> Lf
            r5.f39692h = r2     // Catch: java.lang.Throwable -> Lf
        L43:
            java.lang.String r5 = com.mbridge.msdk.click.i.f39707f     // Catch: java.lang.Throwable -> Lf
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> Lf
            com.mbridge.msdk.foundation.tools.p0.b(r5, r4)     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto L5b
            r1.close()     // Catch: java.lang.Exception -> L2f
            goto L5b
        L52:
            java.lang.String r5 = com.mbridge.msdk.click.i.f39707f
            java.lang.String r4 = r4.getMessage()
            com.mbridge.msdk.foundation.tools.p0.b(r5, r4)
        L5b:
            java.lang.String r4 = r0.toString()
            return r4
        L60:
            r5 = r1
        L61:
            if (r5 == 0) goto L71
            r5.close()     // Catch: java.lang.Exception -> L67
            goto L71
        L67:
            r5 = move-exception
            java.lang.String r0 = com.mbridge.msdk.click.i.f39707f
            java.lang.String r5 = r5.getMessage()
            com.mbridge.msdk.foundation.tools.p0.b(r0, r5)
        L71:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.i.a(java.io.InputStream, boolean):java.lang.String");
    }
}
