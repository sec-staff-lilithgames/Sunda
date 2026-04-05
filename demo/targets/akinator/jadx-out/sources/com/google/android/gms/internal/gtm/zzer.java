package com.google.android.gms.internal.gtm;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import b3.h;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.play_billing.a;
import com.ironsource.G5;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import e3.g;
import j1.o2;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzer extends zzbr {
    private static final byte[] zza = "\n".getBytes();
    private final String zzb;
    private final zzfb zzc;

    public zzer(zzbu zzbuVar) {
        super(zzbuVar);
        String str = zzbs.zza;
        String str2 = Build.VERSION.RELEASE;
        String strZzd = zzff.zzd(Locale.getDefault());
        String str3 = Build.MODEL;
        String str4 = Build.ID;
        StringBuilder sbB = h.b("GoogleAnalytics/", str, " (Linux; U; Android ", str2, "; ");
        a.B(sbB, strZzd, "; ", str3, " Build/");
        this.zzb = o2.o(sbB, str4, ")");
        this.zzc = new zzfb(zzbuVar.zzr());
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0082 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int zzg(java.net.URL r5, byte[] r6, int r7) throws java.lang.Throwable {
        /*
            r4 = this;
            java.lang.String r7 = "Error closing http post connection output stream"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)
            int r0 = r6.length
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = "POST bytes, url"
            r4.zzG(r2, r1, r5)
            boolean r1 = com.google.android.gms.internal.gtm.zzbq.zzU()
            if (r1 == 0) goto L22
            java.lang.String r1 = new java.lang.String
            r1.<init>(r6)
            java.lang.String r2 = "Post payload\n"
            r4.zzO(r2, r1)
        L22:
            r1 = 0
            java.net.HttpURLConnection r5 = r4.zzb(r5)     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L61
            r2 = 1
            r5.setDoOutput(r2)     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4e
            r5.setFixedLengthStreamingMode(r0)     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4e
            r5.connect()     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4e
            java.io.OutputStream r1 = r5.getOutputStream()     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4e
            r1.write(r6)     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4e
            r4.zzk(r5)     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4e
            int r6 = r5.getResponseCode()     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4e
            r0 = 200(0xc8, float:2.8E-43)
            if (r6 != r0) goto L50
            com.google.android.gms.internal.gtm.zzbp r6 = r4.zzs()     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4e
            r6.zzi()     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4e
            r6 = r0
            goto L50
        L4c:
            r6 = move-exception
            goto L80
        L4e:
            r6 = move-exception
            goto L5a
        L50:
            java.lang.String r0 = "POST status"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4e
            r4.zzF(r0, r2)     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4e
            goto L6c
        L5a:
            r3 = r1
            r1 = r5
            r5 = r3
            goto L63
        L5e:
            r6 = move-exception
            r5 = r1
            goto L80
        L61:
            r6 = move-exception
            r5 = r1
        L63:
            java.lang.String r0 = "Network POST connection error"
            r4.zzR(r0, r6)     // Catch: java.lang.Throwable -> L7c
            r6 = 0
            r3 = r1
            r1 = r5
            r5 = r3
        L6c:
            if (r1 == 0) goto L76
            r1.close()     // Catch: java.io.IOException -> L72
            goto L76
        L72:
            r0 = move-exception
            r4.zzJ(r7, r0)
        L76:
            if (r5 == 0) goto L7b
            r5.disconnect()
        L7b:
            return r6
        L7c:
            r6 = move-exception
            r3 = r1
            r1 = r5
            r5 = r3
        L80:
            if (r1 == 0) goto L8a
            r1.close()     // Catch: java.io.IOException -> L86
            goto L8a
        L86:
            r0 = move-exception
            r4.zzJ(r7, r0)
        L8a:
            if (r5 == 0) goto L8f
            r5.disconnect()
        L8f:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzer.zzg(java.net.URL, byte[], int):int");
    }

    private final URL zzh() {
        zzw();
        String strZzi = zzcs.zzi();
        zzw();
        try {
            return new URL(strZzi.concat((String) zzeh.zzn.zzb()));
        } catch (MalformedURLException e10) {
            zzJ("Error trying to parse the hardcoded host url", e10);
            return null;
        }
    }

    private final URL zzi(zzek zzekVar) {
        String strConcat;
        if (zzekVar.zzh()) {
            zzw();
            String strZzi = zzcs.zzi();
            zzw();
            strConcat = strZzi.concat(zzcs.zzj());
        } else {
            zzw();
            String strZzk = zzcs.zzk();
            zzw();
            strConcat = strZzk.concat(zzcs.zzj());
        }
        try {
            return new URL(strConcat);
        } catch (MalformedURLException e10) {
            zzJ("Error trying to parse the hardcoded host url", e10);
            return null;
        }
    }

    private final URL zzj(zzek zzekVar, String str) {
        String strK;
        if (zzekVar.zzh()) {
            zzw();
            String strZzi = zzcs.zzi();
            zzw();
            strK = g.k(strZzi, zzcs.zzj(), "?", str);
        } else {
            zzw();
            String strZzk = zzcs.zzk();
            zzw();
            strK = g.k(strZzk, zzcs.zzj(), "?", str);
        }
        try {
            return new URL(strK);
        } catch (MalformedURLException e10) {
            zzJ("Error trying to parse the hardcoded host url", e10);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0014, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0015, code lost:
    
        zzJ("Error closing http connection input stream", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0018, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzk(java.net.HttpURLConnection r4) throws java.lang.Throwable {
        /*
            r3 = this;
            java.lang.String r0 = "Error closing http connection input stream"
            java.io.InputStream r4 = r4.getInputStream()     // Catch: java.lang.Throwable -> L1b
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L19
        La:
            int r2 = r4.read(r1)     // Catch: java.lang.Throwable -> L19
            if (r2 > 0) goto La
            r4.close()     // Catch: java.io.IOException -> L14
            return
        L14:
            r4 = move-exception
            r3.zzJ(r0, r4)
            return
        L19:
            r1 = move-exception
            goto L1d
        L1b:
            r1 = move-exception
            r4 = 0
        L1d:
            if (r4 == 0) goto L27
            r4.close()     // Catch: java.io.IOException -> L23
            goto L27
        L23:
            r4 = move-exception
            r3.zzJ(r0, r4)
        L27:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzer.zzk(java.net.HttpURLConnection):void");
    }

    private static final void zzl(StringBuilder sb2, String str, String str2) throws UnsupportedEncodingException {
        if (sb2.length() != 0) {
            sb2.append('&');
        }
        sb2.append(URLEncoder.encode(str, C.UTF8_NAME));
        sb2.append(G5.T);
        sb2.append(URLEncoder.encode(str2, C.UTF8_NAME));
    }

    public final String zza(zzek zzekVar, boolean z10) {
        Preconditions.checkNotNull(zzekVar);
        StringBuilder sb2 = new StringBuilder();
        try {
            for (Map.Entry entry : zzekVar.zzg().entrySet()) {
                String str = (String) entry.getKey();
                if (!DownloadCommon.DOWNLOAD_REPORT_HOST.equals(str) && !DownloadCommon.DOWNLOAD_REPORT_QUERY_TIMEOUT.equals(str) && !"AppUID".equals(str) && !"z".equals(str) && !"_gmsv".equals(str)) {
                    zzl(sb2, str, (String) entry.getValue());
                }
            }
            zzl(sb2, DownloadCommon.DOWNLOAD_REPORT_HOST, String.valueOf(zzekVar.zzd()));
            zzl(sb2, DownloadCommon.DOWNLOAD_REPORT_QUERY_TIMEOUT, String.valueOf(zzC().currentTimeMillis() - zzekVar.zzd()));
            zzw();
            if (z10) {
                long jZzc = zzekVar.zzc();
                zzl(sb2, "z", jZzc != 0 ? String.valueOf(jZzc) : String.valueOf(zzekVar.zzb()));
            }
            return sb2.toString();
        } catch (UnsupportedEncodingException e10) {
            zzJ("Failed to encode name or value", e10);
            return null;
        }
    }

    public final HttpURLConnection zzb(URL url) throws IOException {
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
            throw new IOException("Failed to obtain http connection");
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        httpURLConnection.setDefaultUseCaches(false);
        zzw();
        httpURLConnection.setConnectTimeout(((Integer) zzeh.zzw.zzb()).intValue());
        zzw();
        httpURLConnection.setReadTimeout(((Integer) zzeh.zzx.zzb()).intValue());
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, this.zzb);
        httpURLConnection.setDoInput(true);
        return httpURLConnection;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01d3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0322 A[EDGE_INSN: B:190:0x0322->B:162:0x0322 BREAK  A[LOOP:1: B:110:0x022a->B:193:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:193:? A[LOOP:1: B:110:0x022a->B:193:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:194:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List zzc(java.util.List r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 803
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzer.zzc(java.util.List):java.util.List");
    }

    @Override // com.google.android.gms.internal.gtm.zzbr
    public final void zzd() {
        zzO("Network initialized. User agent", this.zzb);
    }

    public final boolean zze() {
        NetworkInfo activeNetworkInfo;
        com.google.android.gms.analytics.zzr.zzh();
        zzV();
        try {
            activeNetworkInfo = ((ConnectivityManager) zzo().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException unused) {
            activeNetworkInfo = null;
        }
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        zzN("No network connectivity");
        return false;
    }
}
