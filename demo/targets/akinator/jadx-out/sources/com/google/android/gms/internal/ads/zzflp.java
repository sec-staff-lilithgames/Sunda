package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.RemoteException;
import com.amazon.device.ads.DtbConstants;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzflp implements Runnable {
    public static Boolean zzb;
    private final Context zze;
    private final VersionInfoParcel zzf;
    private int zzi;
    private final zzdsv zzj;
    private final List zzk;
    private final zzcjk zzl;
    private final zzbxr zzn;
    public static final Object zza = new Object();
    private static final Object zzc = new Object();
    private static final Object zzd = new Object();
    private final zzflt zzg = zzflw.zzb();
    private String zzh = "";
    private boolean zzm = false;

    public zzflp(Context context, VersionInfoParcel versionInfoParcel, zzdsv zzdsvVar, zzeef zzeefVar, zzbxr zzbxrVar, zzcjk zzcjkVar) {
        this.zze = context;
        this.zzf = versionInfoParcel;
        this.zzj = zzdsvVar;
        this.zzn = zzbxrVar;
        this.zzl = zzcjkVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzjJ)).booleanValue()) {
            this.zzk = com.google.android.gms.ads.internal.util.zzs.zzk();
        } else {
            this.zzk = zzgpe.zzi();
        }
    }

    public static boolean zza() {
        boolean zBooleanValue;
        synchronized (zza) {
            try {
                if (zzb == null) {
                    if (((Boolean) zzbgn.zzb.zze()).booleanValue()) {
                        zzb = Boolean.valueOf(Math.random() < ((Double) zzbgn.zza.zze()).doubleValue());
                    } else {
                        zzb = Boolean.FALSE;
                    }
                }
                zBooleanValue = zzb.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zBooleanValue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArrZzaN;
        if (zza()) {
            Object obj = zzc;
            synchronized (obj) {
                try {
                    if (this.zzg.zza() == 0) {
                        return;
                    }
                    try {
                        synchronized (obj) {
                            zzflt zzfltVar = this.zzg;
                            bArrZzaN = ((zzflw) zzfltVar.zzbu()).zzaN();
                            zzfltVar.zzc();
                        }
                        new zzeee(this.zze, this.zzf.afmaVersion, this.zzn, Binder.getCallingUid(), null).zza(new zzeec((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzjD), DtbConstants.NETWORK_READ_TIMEOUT, new HashMap(), bArrZzaN, CommonGatewayClient.HEADER_PROTOBUF, false));
                    } catch (Exception e10) {
                        if ((e10 instanceof zzdzv) && ((zzdzv) e10).zza() == 3) {
                            return;
                        }
                        com.google.android.gms.ads.internal.zzt.zzh().zzh(e10, "CuiMonitor.sendCuiPing");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void zzb(final zzflf zzflfVar) {
        zzcbv.zza.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzflo
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzc(zzflfVar);
            }
        });
    }

    public final /* synthetic */ void zzc(zzflf zzflfVar) {
        synchronized (zzd) {
            try {
                if (!this.zzm) {
                    this.zzm = true;
                    if (zza()) {
                        try {
                            com.google.android.gms.ads.internal.zzt.zzc();
                            this.zzh = com.google.android.gms.ads.internal.util.zzs.zzt(this.zze);
                        } catch (RemoteException | RuntimeException e10) {
                            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "CuiMonitor.gettingAppIdFromManifest");
                        }
                        this.zzi = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zze);
                        int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzjE)).intValue();
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzmS)).booleanValue()) {
                            long j10 = iIntValue;
                            zzcbv.zzd.scheduleWithFixedDelay(this, j10, j10, TimeUnit.MILLISECONDS);
                        } else {
                            long j11 = iIntValue;
                            zzcbv.zzd.scheduleAtFixedRate(this, j11, j11, TimeUnit.MILLISECONDS);
                        }
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzjK)).booleanValue()) {
                            this.zzl.zza();
                        }
                    }
                }
            } finally {
            }
        }
        if (zza() && zzflfVar != null) {
            synchronized (zzc) {
                try {
                    zzflt zzfltVar = this.zzg;
                    if (zzfltVar.zza() >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzjF)).intValue()) {
                        return;
                    }
                    zzflq zzflqVarZza = zzfls.zza();
                    zzflqVarZza.zzv(zzflfVar.zzm());
                    zzflqVarZza.zza(zzflfVar.zzb());
                    zzflqVarZza.zzb(zzflfVar.zza());
                    zzflqVarZza.zzw(3);
                    zzflqVarZza.zzd(this.zzf.afmaVersion);
                    zzflqVarZza.zze(this.zzh);
                    zzflqVarZza.zzf(Build.VERSION.RELEASE);
                    zzflqVarZza.zzg(Build.VERSION.SDK_INT);
                    zzflqVarZza.zzx(zzflfVar.zzo());
                    zzflqVarZza.zzi(zzflfVar.zzc());
                    zzflqVarZza.zzj(this.zzi);
                    zzflqVarZza.zzy(zzflfVar.zzn());
                    zzflqVarZza.zzk(zzflfVar.zzd());
                    zzflqVarZza.zzl(zzflfVar.zze());
                    zzflqVarZza.zzm(zzflfVar.zzf());
                    zzflqVarZza.zzn(this.zzj.zzd(zzflfVar.zzf()));
                    zzflqVarZza.zzo(zzflfVar.zzg());
                    zzflqVarZza.zzs(zzflfVar.zzh());
                    zzflqVarZza.zzr(zzflfVar.zzk());
                    zzflqVarZza.zzp(zzflfVar.zzi());
                    zzflqVarZza.zzq(zzflfVar.zzj());
                    zzflqVarZza.zzc(zzflfVar.zzl());
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzjJ)).booleanValue()) {
                        zzflqVarZza.zzh(this.zzk);
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzjK)).booleanValue()) {
                        zzcjk zzcjkVar = this.zzl;
                        zziag zziagVarZzd = zzcjkVar.zzd();
                        String strZzc = zzcjkVar.zzc();
                        if (zziagVarZzd != null) {
                            zzflqVarZza.zzt(zziagVarZzd);
                        }
                        if (strZzc != null) {
                            zzflqVarZza.zzu(strZzc);
                        }
                    }
                    zzflu zzfluVarZza = zzflv.zza();
                    zzfluVarZza.zza(zzflqVarZza);
                    zzfltVar.zzb(zzfluVarZza);
                } finally {
                }
            }
        }
    }
}
