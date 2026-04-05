package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzcbv;
import com.google.android.gms.internal.ads.zzdvc;
import com.google.android.gms.internal.ads.zzdvn;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import rw.hIT.uQjDr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzv {
    private final zzdvn zzh;
    private Map zzi;
    private final ArrayDeque zzf = new ArrayDeque();
    private final ArrayDeque zzg = new ArrayDeque();
    private final int zza = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzhu)).intValue();
    private final long zzb = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzhv)).longValue();
    private final boolean zzc = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzhz)).booleanValue();
    private final boolean zzd = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzhy)).booleanValue();
    private final Map zze = Collections.synchronizedMap(new zzs(this));

    public zzv(zzdvn zzdvnVar) {
        this.zzh = zzdvnVar;
    }

    private final synchronized void zzi() {
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        try {
            Iterator it = this.zze.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (jCurrentTimeMillis - ((zzt) entry.getValue()).zza.longValue() <= this.zzb) {
                    break;
                }
                this.zzg.add(new Pair((String) entry.getKey(), ((zzt) entry.getValue()).zzb));
                it.remove();
            }
        } catch (ConcurrentModificationException e10) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "QueryJsonMap.removeExpiredEntries");
        }
    }

    private final synchronized void zzj(final zzdvc zzdvcVar) {
        if (this.zzc) {
            ArrayDeque arrayDeque = this.zzg;
            final ArrayDeque arrayDequeClone = arrayDeque.clone();
            arrayDeque.clear();
            ArrayDeque arrayDeque2 = this.zzf;
            final ArrayDeque arrayDequeClone2 = arrayDeque2.clone();
            arrayDeque2.clear();
            zzcbv.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzu
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() throws JSONException {
                    this.zza.zzf(zzdvcVar, arrayDequeClone, arrayDequeClone2);
                }
            });
        }
    }

    private static final void zzl(Map map, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }

    public final synchronized void zza(String str, String str2, zzdvc zzdvcVar) {
        this.zze.put(str, new zzt(Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()), str2, new HashSet()));
        zzi();
        zzj(zzdvcVar);
    }

    public final synchronized String zzb(String str, zzdvc zzdvcVar) {
        zzt zztVar = (zzt) this.zze.get(str);
        zzdvcVar.zzc().put("request_id", str);
        if (zztVar == null) {
            zzdvcVar.zzc().put("mhit", "false");
            return null;
        }
        zzdvcVar.zzc().put("mhit", "true");
        return zztVar.zzb;
    }

    public final synchronized void zzc(String str) {
        this.zze.remove(str);
    }

    public final synchronized boolean zzd(String str, String str2) {
        zzt zztVar = (zzt) this.zze.get(str);
        if (zztVar != null) {
            if (zztVar.zzc.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public final synchronized boolean zze(String str, String str2, int i10) {
        zzt zztVar = (zzt) this.zze.get(str);
        if (zztVar == null) {
            return false;
        }
        Set set = zztVar.zzc;
        set.add(str2);
        return set.size() < i10;
    }

    public final /* synthetic */ void zzf(zzdvc zzdvcVar, ArrayDeque arrayDeque, ArrayDeque arrayDeque2) throws JSONException {
        zzk(zzdvcVar, arrayDeque, "to");
        zzk(zzdvcVar, arrayDeque2, "of");
    }

    public final /* synthetic */ int zzg() {
        return this.zza;
    }

    public final /* synthetic */ ArrayDeque zzh() {
        return this.zzf;
    }

    private final void zzk(zzdvc zzdvcVar, ArrayDeque arrayDeque, String str) throws JSONException {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(zzdvcVar.zzc());
            this.zzi = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.zzi.put("e_r", str);
            this.zzi.put("e_id", (String) pair2.first);
            if (this.zzd) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(zzaa.zzb(jSONObject.getJSONObject("extras").getString(uQjDr.Yzl)), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                zzl(this.zzi, "e_type", (String) pair.first);
                zzl(this.zzi, "e_agent", (String) pair.second);
            }
            this.zzh.zzb(this.zzi);
        }
    }
}
