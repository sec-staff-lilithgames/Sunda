package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzcfp extends zzft implements zzgu {
    private static final Pattern zza = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference zzb = new AtomicReference();
    private final SSLSocketFactory zzc;
    private final int zzd;
    private final int zze;
    private final String zzf;
    private final zzgt zzg;
    private zzgf zzh;
    private HttpURLConnection zzi;
    private InputStream zzj;
    private boolean zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private int zzq;
    private final Set zzr;

    public zzcfp(String str, zzgz zzgzVar, int i10, int i11, int i12) {
        super(true);
        this.zzc = new zzcfo(this);
        this.zzr = new HashSet();
        zzcv.zza(str);
        this.zzf = str;
        this.zzg = new zzgt();
        this.zzd = i10;
        this.zze = i11;
        this.zzq = i12;
        if (zzgzVar != null) {
            zze(zzgzVar);
        }
    }

    private final void zzn() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unexpected error while disconnecting", e10);
            }
            this.zzi = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        try {
            if (this.zzo != this.zzm) {
                AtomicReference atomicReference = zzb;
                byte[] bArr2 = (byte[]) atomicReference.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j10 = this.zzo;
                    long j11 = this.zzm;
                    if (j10 == j11) {
                        atomicReference.set(bArr2);
                        break;
                    }
                    int i12 = this.zzj.read(bArr2, 0, (int) Math.min(j11 - j10, bArr2.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (i12 == -1) {
                        throw new EOFException();
                    }
                    this.zzo += i12;
                    zzh(i12);
                }
            }
            if (i11 == 0) {
                return 0;
            }
            long j12 = this.zzn;
            if (j12 != -1) {
                long j13 = j12 - this.zzp;
                if (j13 == 0) {
                    return -1;
                }
                i11 = (int) Math.min(i11, j13);
            }
            int i13 = this.zzj.read(bArr, i10, i11);
            if (i13 == -1) {
                if (this.zzn == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.zzp += i13;
            zzh(i13);
            return i13;
        } catch (IOException e10) {
            throw new zzgq(e10, this.zzh, 2000, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x02ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00df A[Catch: IOException -> 0x0044, TryCatch #3 {IOException -> 0x0044, blocks: (B:3:0x000e, B:4:0x0025, B:6:0x002d, B:8:0x003b, B:11:0x0047, B:12:0x005f, B:14:0x0065, B:21:0x0092, B:23:0x00b2, B:24:0x00d1, B:25:0x00d6, B:27:0x00df, B:28:0x00e6, B:41:0x010f, B:94:0x0270, B:96:0x027d, B:98:0x028e, B:101:0x0297, B:102:0x02a4, B:104:0x02ae, B:105:0x02b5, B:106:0x02b6, B:107:0x02d3), top: B:116:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x027d A[Catch: IOException -> 0x0044, TryCatch #3 {IOException -> 0x0044, blocks: (B:3:0x000e, B:4:0x0025, B:6:0x002d, B:8:0x003b, B:11:0x0047, B:12:0x005f, B:14:0x0065, B:21:0x0092, B:23:0x00b2, B:24:0x00d1, B:25:0x00d6, B:27:0x00df, B:28:0x00e6, B:41:0x010f, B:94:0x0270, B:96:0x027d, B:98:0x028e, B:101:0x0297, B:102:0x02a4, B:104:0x02ae, B:105:0x02b5, B:106:0x02b6, B:107:0x02d3), top: B:116:0x000e }] */
    @Override // com.google.android.gms.internal.ads.zzgb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zzb(com.google.android.gms.internal.ads.zzgf r25) throws java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcfp.zzb(com.google.android.gms.internal.ads.zzgf):long");
    }

    @Override // com.google.android.gms.internal.ads.zzgb
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzgb
    public final void zzd() throws zzgq {
        try {
            InputStream inputStream = this.zzj;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    throw new zzgq(e10, this.zzh, 2000, 3);
                }
            }
        } finally {
            this.zzj = null;
            zzn();
            if (this.zzk) {
                this.zzk = false;
                zzi();
            }
            this.zzr.clear();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgb, com.google.android.gms.internal.ads.zzgu
    public final Map zzj() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    public final void zzk(int i10) throws SocketException {
        this.zzq = i10;
        for (Socket socket : this.zzr) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.zzq);
                } catch (SocketException e10) {
                    int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to update receive buffer size.", e10);
                }
            }
        }
    }

    public final /* synthetic */ void zzl(Socket socket) {
        this.zzr.add(socket);
    }

    public final /* synthetic */ int zzm() {
        return this.zzq;
    }
}
