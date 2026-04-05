package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgm extends zzft implements zzgu {
    private final boolean zza;
    private final int zzb;
    private final int zzc;
    private final String zzd;
    private final zzgt zze;
    private final zzgt zzf;
    private zzgf zzg;
    private HttpURLConnection zzh;
    private InputStream zzi;
    private boolean zzj;
    private int zzk;
    private long zzl;
    private long zzm;

    public /* synthetic */ zzgm(String str, int i10, int i11, boolean z10, boolean z11, zzgt zzgtVar, zzgme zzgmeVar, boolean z12, byte[] bArr) {
        super(true);
        this.zzd = str;
        this.zzb = i10;
        this.zzc = i11;
        this.zza = z10;
        this.zze = zzgtVar;
        this.zzf = new zzgt();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.net.HttpURLConnection zzk(java.net.URL r3, int r4, byte[] r5, long r6, long r8, boolean r10, boolean r11, java.util.Map r12) throws java.io.IOException {
        /*
            r2 = this;
            java.net.URLConnection r3 = r3.openConnection()
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3
            int r4 = r2.zzb
            r3.setConnectTimeout(r4)
            int r4 = r2.zzc
            r3.setReadTimeout(r4)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            com.google.android.gms.internal.ads.zzgt r5 = r2.zze
            java.util.Map r5 = r5.zza()
            r4.putAll(r5)
            com.google.android.gms.internal.ads.zzgt r5 = r2.zzf
            java.util.Map r5 = r5.zza()
            r4.putAll(r5)
            r4.putAll(r12)
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L32:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L4e
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r12 = r5.getKey()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r5 = r5.getValue()
            java.lang.String r5 = (java.lang.String) r5
            r3.setRequestProperty(r12, r5)
            goto L32
        L4e:
            r4 = 0
            int r12 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            r0 = -1
            if (r12 != 0) goto L5d
            int r6 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r6 != 0) goto L5c
            r4 = 0
            goto L72
        L5c:
            r6 = r4
        L5d:
            java.lang.String r4 = "bytes="
            java.lang.String r5 = "-"
            java.lang.StringBuilder r4 = b0.e2.r(r6, r4, r5)
            int r5 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r5 == 0) goto L6e
            long r6 = r6 + r8
            long r6 = r6 + r0
            r4.append(r6)
        L6e:
            java.lang.String r4 = r4.toString()
        L72:
            if (r4 == 0) goto L79
            java.lang.String r5 = "Range"
            r3.setRequestProperty(r5, r4)
        L79:
            java.lang.String r4 = r2.zzd
            if (r4 == 0) goto L82
            java.lang.String r5 = "User-Agent"
            r3.setRequestProperty(r5, r4)
        L82:
            r4 = 1
            if (r4 == r10) goto L88
            java.lang.String r4 = "identity"
            goto L8a
        L88:
            java.lang.String r4 = "gzip"
        L8a:
            java.lang.String r5 = "Accept-Encoding"
            r3.setRequestProperty(r5, r4)
            r3.setInstanceFollowRedirects(r11)
            r4 = 0
            r3.setDoOutput(r4)
            int r4 = com.google.android.gms.internal.ads.zzgf.zzh
            java.lang.String r4 = "GET"
            r3.setRequestMethod(r4)
            r3.connect()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgm.zzk(java.net.URL, int, byte[], long, long, boolean, boolean, java.util.Map):java.net.HttpURLConnection");
    }

    private final URL zzl(URL url, String str, zzgf zzgfVar) throws zzgq {
        if (str == null) {
            throw new zzgq("Null location redirect", zzgfVar, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!HttpRequest.DEFAULT_SCHEME.equals(protocol) && !"http".equals(protocol)) {
                throw new zzgq("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), zzgfVar, 2001, 1);
            }
            if (this.zza || protocol.equals(url.getProtocol())) {
                return url2;
            }
            String protocol2 = url.getProtocol();
            StringBuilder sb2 = new StringBuilder(o2.C(String.valueOf(protocol2).length() + 40, 1, protocol));
            sb2.append("Disallowed cross-protocol redirect (");
            sb2.append(protocol2);
            sb2.append(" to ");
            sb2.append(protocol);
            sb2.append(")");
            throw new zzgq(sb2.toString(), zzgfVar, 2001, 1);
        } catch (MalformedURLException e10) {
            throw new zzgq(e10, zzgfVar, 2001, 1);
        }
    }

    private final void zzm() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                zzdt.zzf("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        try {
            long j10 = this.zzl;
            if (j10 != -1) {
                long j11 = j10 - this.zzm;
                if (j11 == 0) {
                    return -1;
                }
                i11 = (int) Math.min(i11, j11);
            }
            InputStream inputStream = this.zzi;
            String str = zzep.zza;
            int i12 = inputStream.read(bArr, i10, i11);
            if (i12 == -1) {
                return -1;
            }
            this.zzm += i12;
            zzh(i12);
            return i12;
        } catch (IOException e10) {
            zzgf zzgfVar = this.zzg;
            String str2 = zzep.zza;
            throw zzgq.zza(e10, zzgfVar, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b0  */
    @Override // com.google.android.gms.internal.ads.zzgb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zzb(com.google.android.gms.internal.ads.zzgf r23) throws java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgm.zzb(com.google.android.gms.internal.ads.zzgf):long");
    }

    @Override // com.google.android.gms.internal.ads.zzgb
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        zzgf zzgfVar = this.zzg;
        if (zzgfVar != null) {
            return zzgfVar.zza;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzgb
    public final void zzd() throws zzgq {
        try {
            InputStream inputStream = this.zzi;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    zzgf zzgfVar = this.zzg;
                    String str = zzep.zza;
                    throw new zzgq(e10, zzgfVar, 2000, 3);
                }
            }
        } finally {
            this.zzi = null;
            zzm();
            if (this.zzj) {
                this.zzj = false;
                zzi();
            }
            this.zzh = null;
            this.zzg = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgb, com.google.android.gms.internal.ads.zzgu
    public final Map zzj() {
        HttpURLConnection httpURLConnection = this.zzh;
        return httpURLConnection == null ? zzgph.zza() : new zzgl(httpURLConnection.getHeaderFields());
    }
}
