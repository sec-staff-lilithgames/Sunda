package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.common.util.Clock;
import java.io.IOException;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcfn extends zzcfe implements zzcdh {
    public static final /* synthetic */ int zzd = 0;
    private zzcdi zze;
    private String zzf;
    private boolean zzg;
    private boolean zzh;
    private zzcew zzi;
    private long zzj;
    private long zzk;

    public zzcfn(zzcdr zzcdrVar, zzcdq zzcdqVar) {
        super(zzcdrVar);
        zzcgg zzcggVar = new zzcgg(zzcdrVar.getContext(), zzcdqVar, (zzcdr) this.zzc.get(), null);
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("ExoPlayerAdapter initialized.");
        this.zze = zzcggVar;
        zzcggVar.zzs(this);
    }

    public static final String zzc(String str) {
        return "cache:".concat(String.valueOf(com.google.android.gms.ads.internal.util.client.zzf.zzf(str)));
    }

    private final void zzd(long j10) {
        com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfl
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzb();
            }
        }, j10);
    }

    private static String zzx(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb2 = new StringBuilder(str.length() + 1 + length + 1 + String.valueOf(message).length());
        com.google.android.gms.internal.play_billing.a.B(sb2, str, "/", canonicalName, ":");
        sb2.append(message);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzcfe, com.google.android.gms.common.api.Releasable
    public final void release() {
        zzcdi zzcdiVar = this.zze;
        if (zzcdiVar != null) {
            zzcdiVar.zzs(null);
            this.zze.zzt();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdh
    public final void zzD() {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Precache onRenderedFirstFrame");
    }

    public final zzcdi zza() {
        synchronized (this) {
            this.zzh = true;
            notify();
        }
        this.zze.zzs(null);
        zzcdi zzcdiVar = this.zze;
        this.zze = null;
        return zzcdiVar;
    }

    public final /* synthetic */ void zzb() {
        long jLongValue;
        long jIntValue;
        boolean zBooleanValue;
        long j10;
        long j11;
        long j12;
        String strZzc = zzc(this.zzf);
        try {
            jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzS)).longValue() * 1000;
            jIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzv)).intValue();
            zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzch)).booleanValue();
        } catch (Exception e10) {
            String str = this.zzf;
            String message = e10.getMessage();
            String strR = o2.r(new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length()), "Failed to preload url ", str, " Exception: ", message);
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(strR);
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e10, "VideoStreamExoPlayerCache.preload");
            release();
            zzq(this.zzf, strZzc, "error", zzx("error", e10));
        }
        synchronized (this) {
            if (com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zzj > jLongValue) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(jLongValue).length() + 27);
                sb2.append("Timeout reached. Limit: ");
                sb2.append(jLongValue);
                sb2.append(" ms");
                throw new IOException(sb2.toString());
            }
            if (this.zzg) {
                throw new IOException("Abort requested before buffering finished. ");
            }
            if (!this.zzh) {
                if (!this.zze.zzB()) {
                    throw new IOException("ExoPlayer was released during preloading.");
                }
                long jZzH = this.zze.zzH();
                if (jZzH > 0) {
                    long jZzN = this.zze.zzN();
                    if (jZzN != this.zzk) {
                        boolean z10 = jZzN > 0;
                        j11 = jZzH;
                        j12 = jZzN;
                        j10 = jIntValue;
                        zzm(this.zzf, strZzc, j12, j11, z10, zBooleanValue ? this.zze.zzI() : -1L, zBooleanValue ? this.zze.zzJ() : -1L, zBooleanValue ? this.zze.zzK() : -1L, zzcdi.zzP(), zzcdi.zzQ());
                        this.zzk = j12;
                    } else {
                        j10 = jIntValue;
                        j11 = jZzH;
                        j12 = jZzN;
                    }
                    if (j12 >= j11) {
                        zzp(this.zzf, strZzc, j11);
                    } else if (this.zze.zzO() >= j10 && j12 > 0) {
                    }
                }
                zzd(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzT)).longValue());
                return;
            }
            com.google.android.gms.ads.internal.zzt.zzB().zzd(this.zzi);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final boolean zze(String str) {
        return zzf(str, new String[]{str});
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final boolean zzf(String str, String[] strArr) {
        Clock clock;
        String str2;
        String str3;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        boolean z10;
        this.zzf = str;
        String strZzc = zzc(str);
        String str4 = " ms";
        String str5 = "Timeout reached. Limit: ";
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i10 = 0; i10 < strArr.length; i10++) {
                uriArr[i10] = Uri.parse(strArr[i10]);
            }
            this.zze.zzq(uriArr, this.zzb);
            zzcdr zzcdrVar = (zzcdr) this.zzc.get();
            if (zzcdrVar != null) {
                zzcdrVar.zzt(strZzc, this);
            }
            Clock clockZzk = com.google.android.gms.ads.internal.zzt.zzk();
            long jCurrentTimeMillis = clockZzk.currentTimeMillis();
            long jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzT)).longValue();
            long jLongValue2 = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzS)).longValue() * 1000;
            long jIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzv)).intValue();
            boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzch)).booleanValue();
            long j17 = -1;
            while (true) {
                synchronized (this) {
                    if (clockZzk.currentTimeMillis() - jCurrentTimeMillis > jLongValue2) {
                        long j18 = jLongValue2;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(j18).length() + 27);
                        sb2.append(str5);
                        sb2.append(j18);
                        sb2.append(str4);
                        throw new IOException(sb2.toString());
                    }
                    if (this.zzg) {
                        throw new IOException("Abort requested before buffering finished. ");
                    }
                    if (!this.zzh) {
                        if (!this.zze.zzB()) {
                            throw new IOException("ExoPlayer was released during preloading.");
                        }
                        long jZzH = this.zze.zzH();
                        if (jZzH > 0) {
                            clock = clockZzk;
                            long jZzN = this.zze.zzN();
                            if (jZzN != j17) {
                                if (jZzN > 0) {
                                    j16 = jLongValue2;
                                    z10 = true;
                                } else {
                                    j16 = jLongValue2;
                                    z10 = false;
                                }
                                long j19 = jLongValue;
                                j14 = jZzH;
                                str3 = str5;
                                j13 = j19;
                                str2 = str4;
                                j15 = jZzN;
                                j11 = jIntValue;
                                j10 = j16;
                                zzm(str, strZzc, j15, j14, z10, zBooleanValue ? this.zze.zzI() : -1L, zBooleanValue ? this.zze.zzJ() : -1L, zBooleanValue ? this.zze.zzK() : -1L, zzcdi.zzP(), zzcdi.zzQ());
                                j17 = j15;
                            } else {
                                str3 = str5;
                                j13 = jLongValue;
                                j11 = jIntValue;
                                j14 = jZzH;
                                str2 = str4;
                                j10 = jLongValue2;
                                j15 = jZzN;
                            }
                            if (j15 >= j14) {
                                zzp(str, strZzc, j14);
                            } else if (this.zze.zzO() < j11 || j15 <= 0) {
                                j12 = j13;
                            }
                        } else {
                            clock = clockZzk;
                            str2 = str4;
                            str3 = str5;
                            j10 = jLongValue2;
                            j11 = jIntValue;
                            j12 = jLongValue;
                        }
                        try {
                            wait(j12);
                        } catch (InterruptedException unused) {
                            throw new IOException("Wait interrupted.");
                        }
                    }
                }
                jLongValue = j12;
                str4 = str2;
                jLongValue2 = j10;
                jIntValue = j11;
                str5 = str3;
                clockZzk = clock;
            }
            return true;
        } catch (Exception e10) {
            String message = e10.getMessage();
            String strR = o2.r(new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length()), "Failed to preload url ", str, " Exception: ", message);
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(strR);
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e10, "VideoStreamExoPlayerCache.preload");
            release();
            zzq(str, strZzc, "error", zzx("error", e10));
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final boolean zzg(String str, String[] strArr, zzcew zzcewVar) {
        this.zzf = str;
        this.zzi = zzcewVar;
        String strZzc = zzc(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i10 = 0; i10 < strArr.length; i10++) {
                uriArr[i10] = Uri.parse(strArr[i10]);
            }
            this.zze.zzq(uriArr, this.zzb);
            zzcdr zzcdrVar = (zzcdr) this.zzc.get();
            if (zzcdrVar != null) {
                zzcdrVar.zzt(strZzc, this);
            }
            this.zzj = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            this.zzk = -1L;
            zzd(0L);
            return true;
        } catch (Exception e10) {
            String message = e10.getMessage();
            String strR = o2.r(new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length()), "Failed to preload url ", str, " Exception: ", message);
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(strR);
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e10, "VideoStreamExoPlayerCache.preload");
            release();
            zzq(str, strZzc, "error", zzx("error", e10));
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzh(int i10) {
        this.zze.zzG(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzi(int i10) {
        this.zze.zzF(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzj(int i10) {
        this.zze.zzy(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzk(int i10) {
        this.zze.zzz(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzl() {
        synchronized (this) {
            this.zzg = true;
            notify();
            release();
        }
        String str = this.zzf;
        if (str != null) {
            zzq(this.zzf, zzc(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdh
    public final void zzr(final boolean z10, final long j10) {
        final zzcdr zzcdrVar = (zzcdr) this.zzc.get();
        if (zzcdrVar != null) {
            zzcbv.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfm
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcdrVar.zzu(z10, j10);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdh
    public final void zzu(String str, Exception exc) {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Precache error", exc);
        com.google.android.gms.ads.internal.zzt.zzh().zzh(exc, "VideoStreamExoPlayerCache.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcdh
    public final void zzv(String str, Exception exc) {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Precache exception", exc);
        com.google.android.gms.ads.internal.zzt.zzh().zzh(exc, "VideoStreamExoPlayerCache.onException");
    }

    @Override // com.google.android.gms.internal.ads.zzcdh
    public final void zzs(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzcdh
    public final void zzt(int i10, int i11) {
    }
}
