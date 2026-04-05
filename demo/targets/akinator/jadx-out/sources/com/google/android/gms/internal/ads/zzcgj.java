package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.C3191e4;
import com.ironsource.C3271ic;
import com.mbridge.msdk.foundation.download.Command;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzcgj extends zzft implements zzgu {
    private static final Pattern zza = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private final int zzb;
    private final int zzc;
    private final String zzd;
    private final zzgt zze;
    private zzgf zzf;
    private HttpURLConnection zzg;
    private final Queue zzh;
    private InputStream zzi;
    private boolean zzj;
    private int zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private final long zzq;
    private final long zzr;

    public zzcgj(String str, zzgz zzgzVar, int i10, int i11, long j10, long j11) {
        super(true);
        zzcv.zza(str);
        this.zzd = str;
        this.zze = new zzgt();
        this.zzb = i10;
        this.zzc = i11;
        this.zzh = new ArrayDeque();
        this.zzq = j10;
        this.zzr = j11;
        if (zzgzVar != null) {
            zze(zzgzVar);
        }
    }

    private final void zzl() {
        while (true) {
            Queue queue = this.zzh;
            if (queue.isEmpty()) {
                this.zzg = null;
                return;
            }
            try {
                ((HttpURLConnection) queue.remove()).disconnect();
            } catch (Exception e10) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unexpected error while disconnecting", e10);
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
            long j11 = this.zzm;
            if (j10 - j11 == 0) {
                return -1;
            }
            long j12 = this.zzn + j11;
            long j13 = i11;
            long j14 = j12 + j13 + this.zzr;
            long j15 = this.zzp;
            long j16 = j15 + 1;
            if (j14 > j16) {
                long j17 = this.zzo;
                if (j15 < j17) {
                    long jMin = Math.min(j17, Math.max(((this.zzq + j16) - r4) - 1, (j16 + j13) - 1));
                    zzk(j16, jMin, 2);
                    this.zzp = jMin;
                    j15 = jMin;
                }
            }
            int i12 = this.zzi.read(bArr, i10, (int) Math.min(j13, ((j15 + 1) - this.zzn) - this.zzm));
            if (i12 == -1) {
                throw new EOFException();
            }
            this.zzm += i12;
            zzh(i12);
            return i12;
        } catch (IOException e10) {
            throw new zzgq(e10, this.zzf, 2000, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgb
    public final long zzb(zzgf zzgfVar) throws IOException, NumberFormatException {
        this.zzf = zzgfVar;
        this.zzm = 0L;
        long j10 = zzgfVar.zze;
        long j11 = zzgfVar.zzf;
        long jMin = j11 == -1 ? this.zzq : Math.min(this.zzq, j11);
        this.zzn = j10;
        HttpURLConnection httpURLConnectionZzk = zzk(j10, (jMin + j10) - 1, 1);
        this.zzg = httpURLConnectionZzk;
        String headerField = httpURLConnectionZzk.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = zza.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long j12 = Long.parseLong(matcher.group(2));
                    long j13 = Long.parseLong(matcher.group(3));
                    long j14 = zzgfVar.zzf;
                    if (j14 != -1) {
                        this.zzl = j14;
                        this.zzo = Math.max(j12, (this.zzn + j14) - 1);
                    } else {
                        this.zzl = j13 - this.zzn;
                        this.zzo = j13 - 1;
                    }
                    this.zzp = j12;
                    this.zzj = true;
                    zzg(zzgfVar);
                    return this.zzl;
                } catch (NumberFormatException unused) {
                    String strO = a.b.o(new StringBuilder(String.valueOf(headerField).length() + 27), "Unexpected Content-Range [", headerField, C3191e4.i.f36531e);
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf(strO);
                }
            }
        }
        throw new zzcgh(headerField, zzgfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgb
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzg;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzgb
    public final void zzd() throws zzgq {
        try {
            InputStream inputStream = this.zzi;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    throw new zzgq(e10, this.zzf, 2000, 3);
                }
            }
        } finally {
            this.zzi = null;
            zzl();
            if (this.zzj) {
                this.zzj = false;
                zzi();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgb, com.google.android.gms.internal.ads.zzgu
    public final Map zzj() {
        HttpURLConnection httpURLConnection = this.zzg;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    public final HttpURLConnection zzk(long j10, long j11, int i10) throws IOException {
        int i11;
        IOException iOException;
        String string = this.zzf.zza.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(string).openConnection();
            httpURLConnection.setConnectTimeout(this.zzb);
            httpURLConnection.setReadTimeout(this.zzc);
            for (Map.Entry entry : this.zze.zza().entrySet()) {
                try {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                } catch (IOException e10) {
                    iOException = e10;
                    i11 = i10;
                    String strValueOf = String.valueOf(string);
                    throw new zzgq("Unable to connect to ".concat(strValueOf), iOException, this.zzf, 2000, i11);
                }
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 7 + String.valueOf(j11).length());
            sb2.append("bytes=");
            sb2.append(j10);
            sb2.append("-");
            sb2.append(j11);
            httpURLConnection.setRequestProperty(Command.HTTP_HEADER_RANGE, sb2.toString());
            httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, this.zzd);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestMethod(C3271ic.f36943a);
            httpURLConnection.connect();
            this.zzh.add(httpURLConnection);
            String string2 = this.zzf.zza.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                this.zzk = responseCode;
                if (responseCode < 200 || responseCode > 299) {
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    zzl();
                    throw new zzcgi(this.zzk, headerFields, this.zzf, i10);
                }
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (this.zzi != null) {
                        inputStream = new SequenceInputStream(this.zzi, inputStream);
                    }
                    this.zzi = inputStream;
                    return httpURLConnection;
                } catch (IOException e11) {
                    zzl();
                    throw new zzgq(e11, this.zzf, 2000, i10);
                }
            } catch (IOException e12) {
                zzl();
                String strValueOf2 = String.valueOf(string2);
                throw new zzgq("Unable to connect to ".concat(strValueOf2), e12, this.zzf, 2000, i10);
            }
        } catch (IOException e13) {
            i11 = i10;
            iOException = e13;
        }
    }
}
