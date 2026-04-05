package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcms extends com.google.android.gms.ads.internal.client.zzda {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final zzdsy zzc;
    private final zzehm zzd;
    private final zzeno zze;
    private final zzdxt zzf;
    private final zzcaf zzg;
    private final zzdtd zzh;
    private final zzdyo zzi;
    private final zzbho zzj;
    private final zzflp zzk;
    private final zzfhj zzl;
    private final zzcvz zzm;
    private final zzdvi zzn;
    private boolean zzo = false;
    private final Long zzp = Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime());

    public zzcms(Context context, VersionInfoParcel versionInfoParcel, zzdsy zzdsyVar, zzehm zzehmVar, zzeno zzenoVar, zzdxt zzdxtVar, zzcaf zzcafVar, zzdtd zzdtdVar, zzdyo zzdyoVar, zzbho zzbhoVar, zzflp zzflpVar, zzfhj zzfhjVar, zzcvz zzcvzVar, zzdvi zzdviVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = zzdsyVar;
        this.zzd = zzehmVar;
        this.zze = zzenoVar;
        this.zzf = zzdxtVar;
        this.zzg = zzcafVar;
        this.zzh = zzdtdVar;
        this.zzi = zzdyoVar;
        this.zzj = zzbhoVar;
        this.zzk = zzflpVar;
        this.zzl = zzfhjVar;
        this.zzm = zzcvzVar;
        this.zzn = zzdviVar;
    }

    public final void zzb() {
        if (com.google.android.gms.ads.internal.zzt.zzh().zzo().zzJ()) {
            String strZzL = com.google.android.gms.ads.internal.zzt.zzh().zzo().zzL();
            if (com.google.android.gms.ads.internal.zzt.zzo().zze(this.zza, strZzL, this.zzb.afmaVersion)) {
                return;
            }
            com.google.android.gms.ads.internal.zzt.zzh().zzo().zzK(false);
            com.google.android.gms.ads.internal.zzt.zzh().zzo().zzM("");
        }
    }

    public final /* synthetic */ void zzc() {
        zzfhs.zza(this.zza, true);
    }

    public final /* synthetic */ void zzd() {
        com.google.android.gms.ads.internal.zzt.zzn().zza(this.zza, this.zzn);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final synchronized void zze() {
        if (this.zzo) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Mobile ads is initialized already.");
            return;
        }
        Context context = this.zza;
        zzbeu.zza(context);
        com.google.android.gms.ads.internal.zzt.zzh().zze(context, this.zzb, this.zzn);
        this.zzm.zzc();
        com.google.android.gms.ads.internal.zzt.zzj().zza(context);
        this.zzo = true;
        this.zzf.zzc();
        this.zze.zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzeD)).booleanValue()) {
            this.zzh.zza();
        }
        this.zzi.zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzki)).booleanValue()) {
            zzcbv.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmr
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzb();
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzlW)).booleanValue()) {
            zzcbv.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmo
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzw();
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzdx)).booleanValue()) {
            zzcbv.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmm
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzc();
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzfi)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzfj)).booleanValue()) {
                zzcbv.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmn
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzd();
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final synchronized void zzf(float f10) {
        com.google.android.gms.ads.internal.zzt.zzi().zza(f10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final synchronized void zzg(String str) {
        Context context = this.zza;
        zzbeu.zza(context);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzeB)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzl().zza(context, this.zzb, str, null, this.zzk, null, null, this.zzi.zzs());
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final synchronized void zzh(boolean z10) {
        com.google.android.gms.ads.internal.zzt.zzi().zzc(z10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzi(IObjectWrapper iObjectWrapper, String str) {
        if (iObjectWrapper == null) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        if (context == null) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Context is null. Failed to open debug menu.");
        } else {
            com.google.android.gms.ads.internal.util.zzat zzatVar = new com.google.android.gms.ads.internal.util.zzat(context);
            zzatVar.zzc(str);
            zzatVar.zzd(this.zzb.afmaVersion);
            zzatVar.zzb();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzj(String str, IObjectWrapper iObjectWrapper) throws JSONException {
        String strZzt;
        Runnable runnable;
        Context context = this.zza;
        zzbeu.zza(context);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzeI)).booleanValue()) {
            try {
                com.google.android.gms.ads.internal.zzt.zzc();
                strZzt = com.google.android.gms.ads.internal.util.zzs.zzt(context);
            } catch (RemoteException | RuntimeException e10) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "NonagonMobileAdsSettingManager_AppId");
            }
        } else {
            strZzt = "";
        }
        boolean z10 = true;
        String str2 = true == TextUtils.isEmpty(strZzt) ? str : strZzt;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzeB)).booleanValue();
        zzbel zzbelVar = zzbeu.zzbj;
        boolean zBooleanValue2 = zBooleanValue | ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbelVar)).booleanValue();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbelVar)).booleanValue()) {
            final Runnable runnable2 = (Runnable) ObjectWrapper.unwrap(iObjectWrapper);
            runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmp
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzgus zzgusVar = zzcbv.zzf;
                    final zzcms zzcmsVar = this.zza;
                    final Runnable runnable3 = runnable2;
                    zzgusVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmq
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzcmsVar.zzx(runnable3);
                        }
                    });
                }
            };
        } else {
            runnable = null;
            z10 = zBooleanValue2;
        }
        Runnable runnable3 = runnable;
        if (z10) {
            com.google.android.gms.ads.internal.zzt.zzl().zza(this.zza, this.zzb, str2, runnable3, this.zzk, this.zzn, this.zzp, this.zzi.zzs());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final synchronized float zzk() {
        return com.google.android.gms.ads.internal.zzt.zzi().zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final synchronized boolean zzl() {
        return com.google.android.gms.ads.internal.zzt.zzi().zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final String zzm() {
        return this.zzb.afmaVersion;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzn(String str) {
        this.zze.zze(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzo(zzbrj zzbrjVar) throws RemoteException {
        this.zzl.zzc(zzbrjVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzp(zzbod zzbodVar) throws RemoteException {
        this.zzf.zzb(zzbodVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final List zzq() throws RemoteException {
        return this.zzf.zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzr(com.google.android.gms.ads.internal.client.zzfv zzfvVar) throws RemoteException {
        this.zzg.zzb(this.zza, zzfvVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzs() {
        this.zzf.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzt(com.google.android.gms.ads.internal.client.zzdn zzdnVar) throws RemoteException {
        this.zzi.zzo(zzdnVar, zzdyn.API);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzu(boolean z10) throws IOException, RemoteException {
        try {
            Context context = this.zza;
            zzfwu.zza(context).zzb(z10);
            if (z10) {
                return;
            }
            try {
                if (context.getSharedPreferences("query_info_shared_prefs", 0).edit().clear().commit()) {
                } else {
                    throw new IOException("Failed to remove query_info_shared_prefs");
                }
            } catch (IOException e10) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "clearStorageOnGpidPubDisable_scar");
            }
        } catch (IOException e11) {
            throw new RemoteException(e11.getMessage());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzv(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzku)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzt(str);
        }
    }

    public final /* synthetic */ void zzw() {
        this.zzj.zza(new zzbwj());
    }

    public final /* synthetic */ void zzx(Runnable runnable) {
        Preconditions.checkMainThread("Adapters must be initialized on the main thread.");
        Map mapZzf = com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzf();
        if (mapZzf.isEmpty()) {
            return;
        }
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th2) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not initialize rewarded ads.", th2);
                return;
            }
        }
        if (this.zzc.zzc()) {
            HashMap map = new HashMap();
            Iterator it = mapZzf.values().iterator();
            while (it.hasNext()) {
                for (zzbrc zzbrcVar : ((zzbrd) it.next()).zza) {
                    String str = zzbrcVar.zzb;
                    for (String str2 : zzbrcVar.zza) {
                        if (!map.containsKey(str2)) {
                            map.put(str2, new ArrayList());
                        }
                        if (str != null) {
                            ((List) map.get(str2)).add(str);
                        }
                    }
                }
            }
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : map.entrySet()) {
                String str3 = (String) entry.getKey();
                try {
                    zzehn zzehnVarZza = this.zzd.zza(str3, jSONObject);
                    if (zzehnVarZza != null) {
                        zzfhl zzfhlVar = (zzfhl) zzehnVarZza.zzb;
                        if (!zzfhlVar.zzn() && zzfhlVar.zzq()) {
                            zzfhlVar.zzr(this.zza, (zzeja) zzehnVarZza.zzc, (List) entry.getValue());
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 45);
                            sb2.append("Initialized rewarded video mediation adapter ");
                            sb2.append(str3);
                            String string = sb2.toString();
                            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzd(string);
                        }
                    }
                } catch (zzfgu e10) {
                    String strO = a.b.o(new StringBuilder(String.valueOf(str3).length() + 56), "Failed to initialize rewarded video mediation adapter \"", str3, "\"");
                    int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzj(strO, e10);
                }
            }
        }
    }
}
