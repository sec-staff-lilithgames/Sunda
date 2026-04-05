package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdsy {
    private final zzfhj zza;
    private final zzdsv zzb;

    public zzdsy(zzfhj zzfhjVar, zzdsv zzdsvVar) {
        this.zza = zzfhjVar;
        this.zzb = zzdsvVar;
    }

    public final zzfhl zza(String str, JSONObject jSONObject) throws zzfgu {
        zzbrm zzbrmVarZzb;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zzbrmVarZzb = new zzbsk(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                zzbrmVarZzb = new zzbsk(new zzbub());
            } else {
                zzbrj zzbrjVarZzd = zzd();
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        zzbrmVarZzb = zzbrjVarZzd.zzc(string) ? zzbrjVarZzd.zzb("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") : zzbrjVarZzd.zzd(string) ? zzbrjVarZzd.zzb(string) : zzbrjVarZzd.zzb("com.google.ads.mediation.customevent.CustomEventAdapter");
                    } catch (JSONException e10) {
                        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Invalid custom event.", e10);
                    }
                } else {
                    zzbrmVarZzb = zzbrjVarZzd.zzb(str);
                }
            }
            zzfhl zzfhlVar = new zzfhl(zzbrmVarZzb);
            this.zzb.zza(str, zzfhlVar);
            return zzfhlVar;
        } catch (Throwable th2) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzkq)).booleanValue()) {
                this.zzb.zza(str, null);
            }
            throw new zzfgu(th2);
        }
    }

    public final zzbti zzb(String str) throws RemoteException {
        zzbti zzbtiVarZze = zzd().zze(str);
        this.zzb.zzb(str, zzbtiVarZze);
        return zzbtiVarZze;
    }

    public final boolean zzc() {
        return this.zza.zzd() != null;
    }

    public final zzbrj zzd() throws RemoteException {
        zzbrj zzbrjVarZzd = this.zza.zzd();
        if (zzbrjVarZzd != null) {
            return zzbrjVarZzd;
        }
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Unexpected call to adapter creator.");
        throw new RemoteException();
    }
}
