package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzehp {
    private final String zzc;
    private zzffx zzd = null;
    private zzffu zze = null;
    private com.google.android.gms.ads.internal.client.zzv zzf = null;
    private final Map zzb = a.b.u();
    private final List zza = Collections.synchronizedList(new ArrayList());

    public zzehp(String str) {
        this.zzc = str;
    }

    private final synchronized void zzj(zzffu zzffuVar, int i10) {
        Map map = this.zzb;
        String strZzl = zzl(zzffuVar);
        if (map.containsKey(strZzl)) {
            return;
        }
        Bundle bundle = new Bundle();
        JSONObject jSONObject = zzffuVar.zzv;
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                bundle.putString(next, jSONObject.getString(next));
            } catch (JSONException unused) {
            }
        }
        com.google.android.gms.ads.internal.client.zzv zzvVar = new com.google.android.gms.ads.internal.client.zzv(zzffuVar.zzE, 0L, null, bundle, zzffuVar.zzF, zzffuVar.zzG, zzffuVar.zzH, zzffuVar.zzI);
        try {
            this.zza.add(i10, zzvVar);
        } catch (IndexOutOfBoundsException e10) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation");
        }
        this.zzb.put(strZzl, zzvVar);
    }

    private final void zzk(zzffu zzffuVar, long j10, com.google.android.gms.ads.internal.client.zze zzeVar, boolean z10) {
        Map map = this.zzb;
        String strZzl = zzl(zzffuVar);
        if (map.containsKey(strZzl)) {
            if (this.zze == null) {
                this.zze = zzffuVar;
            }
            com.google.android.gms.ads.internal.client.zzv zzvVar = (com.google.android.gms.ads.internal.client.zzv) map.get(strZzl);
            zzvVar.zzb = j10;
            zzvVar.zzc = zzeVar;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzhn)).booleanValue() && z10) {
                this.zzf = zzvVar;
            }
        }
    }

    private static String zzl(zzffu zzffuVar) {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzee)).booleanValue() ? zzffuVar.zzap : zzffuVar.zzw;
    }

    public final void zza(zzffx zzffxVar) {
        this.zzd = zzffxVar;
    }

    public final void zzb(zzffu zzffuVar) {
        zzj(zzffuVar, this.zza.size());
    }

    public final synchronized void zzc(String str, List list) {
        Map map = this.zzb;
        if (map.containsKey(str)) {
            com.google.android.gms.ads.internal.client.zzv zzvVar = (com.google.android.gms.ads.internal.client.zzv) map.get(str);
            List list2 = this.zza;
            int iIndexOf = list2.indexOf(zzvVar);
            try {
                list2.remove(iIndexOf);
            } catch (IndexOutOfBoundsException e10) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry");
            }
            this.zzb.remove(str);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzj((zzffu) it.next(), iIndexOf);
                iIndexOf++;
            }
        }
    }

    public final void zzd(zzffu zzffuVar, long j10, com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzk(zzffuVar, j10, null, true);
    }

    public final void zze(zzffu zzffuVar, long j10, com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzk(zzffuVar, j10, zzeVar, false);
    }

    public final zzcyh zzf() {
        return new zzcyh(this.zze, "", this, this.zzd, this.zzc);
    }

    public final com.google.android.gms.ads.internal.client.zzv zzg() {
        return this.zzf;
    }

    public final List zzh() {
        return this.zza;
    }

    public final void zzi(zzffu zzffuVar) {
        Map map = this.zzb;
        Object obj = map.get(zzl(zzffuVar));
        List list = this.zza;
        int iIndexOf = list.indexOf(obj);
        if (iIndexOf < 0 || iIndexOf >= map.size()) {
            iIndexOf = list.indexOf(this.zzf);
        }
        if (iIndexOf < 0 || iIndexOf >= map.size()) {
            return;
        }
        this.zzf = (com.google.android.gms.ads.internal.client.zzv) list.get(iIndexOf);
        while (true) {
            iIndexOf++;
            if (iIndexOf >= list.size()) {
                return;
            }
            com.google.android.gms.ads.internal.client.zzv zzvVar = (com.google.android.gms.ads.internal.client.zzv) list.get(iIndexOf);
            zzvVar.zzb = 0L;
            zzvVar.zzc = null;
        }
    }
}
