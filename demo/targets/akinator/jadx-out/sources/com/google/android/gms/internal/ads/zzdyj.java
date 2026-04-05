package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdyj {
    private final zzdxt zza;
    private final zzdsv zzb;
    private final Object zzc = new Object();
    private final List zzd = new ArrayList();
    private boolean zze;

    public zzdyj(zzdxt zzdxtVar, zzdsv zzdsvVar) {
        this.zza = zzdxtVar;
        this.zzb = zzdsvVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final void zzc(List list) {
        zzdsu zzdsuVarZzc;
        zzdsu zzdsuVarZzc2;
        zzbtx zzbtxVar;
        synchronized (this.zzc) {
            try {
                if (this.zze) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    zzbnw zzbnwVar = (zzbnw) it.next();
                    String string = (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzkp)).booleanValue() || (zzdsuVarZzc2 = this.zzb.zzc(zzbnwVar.zza)) == null || (zzbtxVar = zzdsuVarZzc2.zzc) == null) ? "" : zzbtxVar.toString();
                    String str = string;
                    boolean z10 = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzkq)).booleanValue() && (zzdsuVarZzc = this.zzb.zzc(zzbnwVar.zza)) != null && zzdsuVarZzc.zzd;
                    List list2 = this.zzd;
                    String str2 = zzbnwVar.zza;
                    list2.add(new zzdyi(str2, str, this.zzb.zzd(str2), zzbnwVar.zzb ? 1 : 0, zzbnwVar.zzd, zzbnwVar.zzc, z10));
                }
                this.zze = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zza() {
        this.zza.zzb(new zzdyh(this));
    }

    public final JSONArray zzb() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.zzc) {
            try {
                if (!this.zze) {
                    zzdxt zzdxtVar = this.zza;
                    if (!zzdxtVar.zze()) {
                        zza();
                        return jSONArray;
                    }
                    zzc(zzdxtVar.zzd());
                }
                Iterator it = this.zzd.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((zzdyi) it.next()).zza());
                }
                return jSONArray;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
