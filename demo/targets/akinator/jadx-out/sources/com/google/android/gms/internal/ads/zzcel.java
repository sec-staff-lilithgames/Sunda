package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcel implements zzgb {
    private final Context zza;
    private final zzgb zzb;
    private final String zzc;
    private final int zzd;
    private final boolean zze;
    private InputStream zzf;
    private boolean zzg;
    private Uri zzh;
    private volatile zzbdf zzi;
    private boolean zzj = false;
    private boolean zzk = false;
    private zzgf zzl;

    public zzcel(Context context, zzgb zzgbVar, String str, int i10, zzgz zzgzVar, zzcek zzcekVar) {
        this.zza = context;
        this.zzb = zzgbVar;
        this.zzc = str;
        this.zzd = i10;
        new AtomicLong(-1L);
        this.zze = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzch)).booleanValue();
    }

    private final boolean zzf() {
        if (!this.zze) {
            return false;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzeV)).booleanValue() || this.zzj) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzeW)).booleanValue() && !this.zzk;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        if (!this.zzg) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        }
        InputStream inputStream = this.zzf;
        return inputStream != null ? inputStream.read(bArr, i10, i11) : this.zzb.zza(bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgb
    public final long zzb(zzgf zzgfVar) throws IOException {
        Long l9;
        if (this.zzg) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        this.zzg = true;
        Uri uri = zzgfVar.zza;
        this.zzh = uri;
        this.zzl = zzgfVar;
        this.zzi = zzbdf.zza(uri);
        zzbdc zzbdcVarZzc = null;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzeS)).booleanValue()) {
            if (this.zzi != null) {
                this.zzi.zzh = zzgfVar.zze;
                this.zzi.zzi = zzgmu.zza(this.zzc);
                this.zzi.zzj = this.zzd;
                zzbdcVarZzc = com.google.android.gms.ads.internal.zzt.zzj().zzc(this.zzi);
            }
            if (zzbdcVarZzc != null && zzbdcVarZzc.zza()) {
                this.zzj = zzbdcVarZzc.zzg();
                this.zzk = zzbdcVarZzc.zze();
                if (!zzf()) {
                    this.zzf = zzbdcVarZzc.zzb();
                    return -1L;
                }
            }
        } else if (this.zzi != null) {
            this.zzi.zzh = zzgfVar.zze;
            this.zzi.zzi = zzgmu.zza(this.zzc);
            this.zzi.zzj = this.zzd;
            if (this.zzi.zzg) {
                l9 = (Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzeU);
            } else {
                l9 = (Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzeT);
            }
            long jLongValue = l9.longValue();
            com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
            com.google.android.gms.ads.internal.zzt.zzz();
            Future futureZza = zzbdq.zza(this.zza, this.zzi);
            try {
                try {
                    zzbdr zzbdrVar = (zzbdr) futureZza.get(jLongValue, TimeUnit.MILLISECONDS);
                    zzbdrVar.zzc();
                    this.zzj = zzbdrVar.zzd();
                    this.zzk = zzbdrVar.zzf();
                    zzbdrVar.zze();
                    if (!zzf()) {
                        this.zzf = zzbdrVar.zzb();
                    }
                } catch (InterruptedException unused) {
                    futureZza.cancel(false);
                    Thread.currentThread().interrupt();
                } catch (ExecutionException | TimeoutException unused2) {
                    futureZza.cancel(false);
                }
            } catch (Throwable unused3) {
            }
            com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
            throw null;
        }
        if (this.zzi != null) {
            zzge zzgeVarZzb = zzgfVar.zzb();
            zzgeVarZzb.zza(Uri.parse(this.zzi.zza));
            this.zzl = zzgeVarZzb.zze();
        }
        return this.zzb.zzb(this.zzl);
    }

    @Override // com.google.android.gms.internal.ads.zzgb
    public final Uri zzc() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzgb
    public final void zzd() throws IOException {
        if (!this.zzg) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.zzg = false;
        this.zzh = null;
        InputStream inputStream = this.zzf;
        if (inputStream == null) {
            this.zzb.zzd();
        } else {
            IOUtils.closeQuietly(inputStream);
            this.zzf = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgb
    public final void zze(zzgz zzgzVar) {
    }
}
