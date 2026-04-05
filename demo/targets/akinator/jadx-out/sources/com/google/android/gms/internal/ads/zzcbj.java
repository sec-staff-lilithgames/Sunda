package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcbj {
    private final Object zza = new Object();
    private final com.google.android.gms.ads.internal.util.zzj zzb;
    private final zzcbn zzc;
    private boolean zzd;
    private Context zze;
    private VersionInfoParcel zzf;
    private String zzg;
    private zzbez zzh;
    private zzdvi zzi;
    private Boolean zzj;
    private final AtomicInteger zzk;
    private final AtomicInteger zzl;
    private final zzcbi zzm;
    private final Object zzn;
    private n1 zzo;
    private final AtomicBoolean zzp;

    public zzcbj() {
        com.google.android.gms.ads.internal.util.zzj zzjVar = new com.google.android.gms.ads.internal.util.zzj();
        this.zzb = zzjVar;
        this.zzc = new zzcbn(com.google.android.gms.ads.internal.client.zzbb.zzc(), zzjVar);
        this.zzd = false;
        this.zzh = null;
        this.zzi = null;
        this.zzj = null;
        this.zzk = new AtomicInteger(0);
        this.zzl = new AtomicInteger(0);
        this.zzm = new zzcbi(null);
        this.zzn = new Object();
        this.zzp = new AtomicBoolean();
    }

    public final /* synthetic */ zzbez zzA() {
        return this.zzh;
    }

    public final /* synthetic */ AtomicBoolean zzB() {
        return this.zzp;
    }

    public final zzbez zza() {
        zzbez zzbezVar;
        synchronized (this.zza) {
            zzbezVar = this.zzh;
        }
        return zzbezVar;
    }

    public final void zzb(Boolean bool) {
        synchronized (this.zza) {
            this.zzj = bool;
        }
    }

    public final Boolean zzc() {
        Boolean bool;
        synchronized (this.zza) {
            bool = this.zzj;
        }
        return bool;
    }

    public final void zzd() {
        this.zzm.zza();
    }

    public final void zze(Context context, VersionInfoParcel versionInfoParcel, zzdvi zzdviVar) {
        zzbez zzbezVar;
        synchronized (this.zza) {
            try {
                if (!this.zzd) {
                    this.zze = context.getApplicationContext();
                    this.zzf = versionInfoParcel;
                    com.google.android.gms.ads.internal.zzt.zzg().zzb(this.zzc);
                    this.zzb.zza(this.zze);
                    zzbwf.zzb(this.zze, this.zzf);
                    this.zzi = zzdviVar;
                    com.google.android.gms.ads.internal.zzt.zzm();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzco)).booleanValue()) {
                        zzbezVar = new zzbez();
                    } else {
                        com.google.android.gms.ads.internal.util.zze.zza("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                        zzbezVar = null;
                    }
                    this.zzh = zzbezVar;
                    if (zzbezVar != null) {
                        zzcby.zza(new zzcbf(this).zzb(), "AppState.registerCsiReporter");
                    }
                    Context context2 = this.zze;
                    if (PlatformVersion.isAtLeastO()) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzjm)).booleanValue()) {
                            try {
                                ((ConnectivityManager) context2.getSystemService("connectivity")).registerDefaultNetworkCallback(new zzcbg(this));
                            } catch (RuntimeException e10) {
                                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                                com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to register network callback", e10);
                                this.zzp.set(true);
                            }
                        }
                    }
                    this.zzd = true;
                    zzq();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzoI)).booleanValue()) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzc().zze(context, versionInfoParcel.afmaVersion);
    }

    public final Resources zzf() {
        if (this.zzf.isClientJar) {
            return this.zze.getResources();
        }
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzlT)).booleanValue()) {
                return com.google.android.gms.ads.internal.util.client.zzs.zzb(this.zze).getResources();
            }
            com.google.android.gms.ads.internal.util.client.zzs.zzb(this.zze).getResources();
            return null;
        } catch (com.google.android.gms.ads.internal.util.client.zzr e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot load resource from dynamite apk or local jar", e10);
            return null;
        }
    }

    public final void zzg(Throwable th2, String str) {
        zzbwf.zzb(this.zze, this.zzf).zzh(th2, str);
    }

    public final void zzh(Throwable th2, String str) {
        zzbwf.zzb(this.zze, this.zzf).zzi(th2, str, ((Double) zzbhd.zzf.zze()).floatValue());
    }

    public final void zzi(Throwable th2, String str) {
        zzbwf.zzd(this.zze, this.zzf).zzh(th2, str);
    }

    public final void zzj() {
        this.zzk.incrementAndGet();
    }

    public final void zzk() {
        this.zzk.decrementAndGet();
    }

    public final int zzl() {
        return this.zzk.get();
    }

    public final void zzm() {
        this.zzl.incrementAndGet();
    }

    public final int zzn() {
        return this.zzl.get();
    }

    public final com.google.android.gms.ads.internal.util.zzg zzo() {
        com.google.android.gms.ads.internal.util.zzj zzjVar;
        synchronized (this.zza) {
            zzjVar = this.zzb;
        }
        return zzjVar;
    }

    public final Context zzp() {
        return this.zze;
    }

    public final n1 zzq() {
        if (this.zze != null) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzds)).booleanValue()) {
                synchronized (this.zzn) {
                    try {
                        n1 n1Var = this.zzo;
                        if (n1Var != null) {
                            return n1Var;
                        }
                        n1 n1VarSubmit = zzcbv.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzcbh
                            @Override // java.util.concurrent.Callable
                            public final /* synthetic */ Object call() {
                                return this.zza.zzw();
                            }
                        });
                        this.zzo = n1VarSubmit;
                        return n1VarSubmit;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
        return zzgui.zza(new ArrayList());
    }

    public final zzcbn zzr() {
        return this.zzc;
    }

    public final boolean zzs(Context context) {
        if (PlatformVersion.isAtLeastO()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzjm)).booleanValue()) {
                return this.zzp.get();
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final void zzt(String str) {
        this.zzg = str;
    }

    public final String zzu() {
        return this.zzg;
    }

    public final zzdvi zzv() {
        return this.zzi;
    }

    public final /* synthetic */ ArrayList zzw() {
        Context contextZza = zzbxt.zza(this.zze);
        ArrayList arrayList = new ArrayList();
        try {
            PackageInfo packageInfo = Wrappers.packageManager(contextZza).getPackageInfo(contextZza.getApplicationInfo().packageName, 4096);
            if (packageInfo.requestedPermissions != null && packageInfo.requestedPermissionsFlags != null) {
                int i10 = 0;
                while (true) {
                    String[] strArr = packageInfo.requestedPermissions;
                    if (i10 >= strArr.length) {
                        break;
                    }
                    if ((packageInfo.requestedPermissionsFlags[i10] & 2) != 0) {
                        arrayList.add(strArr[i10]);
                    }
                    i10++;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    public final /* synthetic */ Object zzx() {
        return this.zza;
    }

    public final /* synthetic */ Context zzy() {
        return this.zze;
    }

    public final /* synthetic */ VersionInfoParcel zzz() {
        return this.zzf;
    }
}
