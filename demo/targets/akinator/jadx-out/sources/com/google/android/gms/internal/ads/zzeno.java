package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.ironsource.Q6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rw.hIT.uQjDr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzeno {
    private final Map zza = new HashMap();
    private final Map zzb = new HashMap();
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();
    private final Map zze = new HashMap();
    private final Executor zzf;
    private JSONObject zzg;

    public zzeno(Executor executor) {
        this.zzf = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzi, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final synchronized void zzh() {
        this.zzb.clear();
        this.zza.clear();
        this.zze.clear();
        this.zzd.clear();
        zzl();
        zzj();
        zzk();
    }

    private final synchronized void zzj() {
        JSONObject jSONObjectZzg;
        if (!((Boolean) zzbha.zze.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzcc)).booleanValue() && (jSONObjectZzg = com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzg()) != null) {
                try {
                    JSONArray jSONArray = jSONObjectZzg.getJSONArray("signal_adapters");
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i10);
                        Bundle bundleZzp = zzp(jSONObject.optJSONObject("data"));
                        String strOptString = jSONObject.optString("adapter_class_name");
                        boolean zOptBoolean = jSONObject.optBoolean("render", false);
                        boolean zOptBoolean2 = jSONObject.optBoolean("collect_signals", false);
                        if (!TextUtils.isEmpty(strOptString)) {
                            this.zzb.put(strOptString, new zzens(strOptString, zOptBoolean2, zOptBoolean, true, bundleZzp));
                        }
                    }
                } catch (JSONException e10) {
                    com.google.android.gms.ads.internal.util.zze.zzb("Malformed config loading JSON.", e10);
                }
            }
        }
    }

    private final synchronized void zzk() {
        JSONObject jSONObjectZzg;
        try {
            if (!((Boolean) zzbha.zzb.zze()).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzcd)).booleanValue() && (jSONObjectZzg = com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzg()) != null) {
                    JSONArray jSONArray = jSONObjectZzg.getJSONArray("adapter_settings");
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i10);
                        String strOptString = jSONObject.optString("adapter_class_name");
                        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("permission_set");
                        if (!TextUtils.isEmpty(strOptString) && jSONArrayOptJSONArray != null) {
                            for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i11);
                                boolean zOptBoolean = jSONObject2.optBoolean("enable_rendering", false);
                                boolean zOptBoolean2 = jSONObject2.optBoolean("collect_secure_signals", false);
                                boolean zOptBoolean3 = jSONObject2.optBoolean("collect_secure_signals_on_full_app", false);
                                String strOptString2 = jSONObject2.optString(Q6.H);
                                zzens zzensVar = new zzens(strOptString, zOptBoolean2, zOptBoolean, zOptBoolean3, new Bundle());
                                if (strOptString2.equals("ADMOB")) {
                                    this.zzd.put(strOptString, zzensVar);
                                } else if (strOptString2.equals("AD_MANAGER")) {
                                    this.zze.put(strOptString, zzensVar);
                                }
                            }
                        }
                    }
                }
            }
        } catch (JSONException e10) {
            com.google.android.gms.ads.internal.util.zze.zzb("Malformed config loading JSON.", e10);
        } finally {
        }
    }

    private final synchronized void zzl() {
        JSONArray jSONArrayOptJSONArray;
        try {
            JSONObject jSONObjectZzg = com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzg();
            if (jSONObjectZzg != null) {
                try {
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectZzg.optJSONArray("ad_unit_id_settings");
                    this.zzg = jSONObjectZzg.optJSONObject("ad_unit_patterns");
                    if (jSONArrayOptJSONArray2 != null) {
                        for (int i10 = 0; i10 < jSONArrayOptJSONArray2.length(); i10++) {
                            JSONObject jSONObject = jSONArrayOptJSONArray2.getJSONObject(i10);
                            String lowerCase = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzlU)).booleanValue() ? jSONObject.optString("ad_unit_id", "").toLowerCase(Locale.ROOT) : jSONObject.optString(uQjDr.CDb, "");
                            String strOptString = jSONObject.optString("format", "");
                            ArrayList arrayList = new ArrayList();
                            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("mediation_config");
                            if (jSONObjectOptJSONObject != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("ad_networks")) != null) {
                                for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                                    arrayList.addAll(zzm(jSONArrayOptJSONArray.getJSONObject(i11), strOptString));
                                }
                            }
                            zzn(strOptString, lowerCase, arrayList);
                        }
                    }
                } catch (JSONException e10) {
                    com.google.android.gms.ads.internal.util.zze.zzb("Malformed config loading JSON.", e10);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final synchronized List zzm(JSONObject jSONObject, String str) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            if (jSONObject != null) {
                Bundle bundleZzp = zzp(jSONObject.optJSONObject("data"));
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rtb_adapters");
                if (jSONArrayOptJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                        String strOptString = jSONArrayOptJSONArray.optString(i10, "");
                        if (!TextUtils.isEmpty(strOptString)) {
                            arrayList2.add(strOptString);
                        }
                    }
                    int size = arrayList2.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        String str2 = (String) arrayList2.get(i11);
                        zze(str2);
                        if (((zzenq) this.zza.get(str2)) != null) {
                            arrayList.add(new zzenq(str2, str, bundleZzp));
                        }
                    }
                }
            }
        } finally {
        }
        return arrayList;
    }

    private final synchronized void zzn(String str, String str2, List list) {
        try {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return;
            }
            Map map = this.zzc;
            Map map2 = (Map) map.get(str);
            if (map2 == null) {
                map2 = new HashMap();
            }
            map.put(str, map2);
            List arrayList = (List) map2.get(str2);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.addAll(list);
            map2.put(str2, arrayList);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final synchronized zzgph zzo(String str) {
        HashMap map;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzd())) {
                boolean zMatches = Pattern.matches((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzdJ), str);
                boolean zMatches2 = Pattern.matches((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzdK), str);
                if (zMatches) {
                    map = new HashMap(this.zze);
                } else if (zMatches2) {
                    map = new HashMap(this.zzd);
                }
                return zzgph.zzc(map);
            }
            return zzgph.zza();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static final Bundle zzp(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                bundle.putString(next, jSONObject.optString(next, ""));
            }
        }
        return bundle;
    }

    public final void zza() {
        com.google.android.gms.ads.internal.zzt.zzh().zzo().zzk(new Runnable() { // from class: com.google.android.gms.internal.ads.zzenn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzf();
            }
        });
        this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzenl
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzg();
            }
        });
    }

    public final synchronized Map zzb() {
        if (TextUtils.isEmpty(com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzd())) {
            return zzgph.zza();
        }
        return zzgph.zzc(this.zzb);
    }

    public final synchronized Map zzc(String str, String str2) {
        Map map;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzd()) && (map = (Map) this.zzc.get(str)) != null) {
                List<zzenq> list = (List) map.get(str2);
                if (list == null) {
                    String strZza = zzdtf.zza(this.zzg, str2, str);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzlU)).booleanValue()) {
                        strZza = strZza.toLowerCase(Locale.ROOT);
                    }
                    list = (List) map.get(strZza);
                }
                if (list != null) {
                    HashMap map2 = new HashMap();
                    for (zzenq zzenqVar : list) {
                        String str3 = zzenqVar.zza;
                        if (!map2.containsKey(str3)) {
                            map2.put(str3, new ArrayList());
                        }
                        ((List) map2.get(str3)).add(zzenqVar.zzb);
                    }
                    return zzgph.zzc(map2);
                }
            }
            return zzgph.zza();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized Map zzd(String str, String str2) {
        HashMap map;
        try {
            Map mapZzc = zzc(str, str2);
            zzgph zzgphVarZzo = zzo(str2);
            map = new HashMap();
            for (Map.Entry entry : mapZzc.entrySet()) {
                String str3 = (String) entry.getKey();
                if (zzgphVarZzo.containsKey(str3)) {
                    zzens zzensVar = (zzens) zzgphVarZzo.get(str3);
                    List list = (List) entry.getValue();
                    map.put(str3, new zzens(str3, zzensVar.zzb, zzensVar.zzc, zzensVar.zzd, (list == null || list.isEmpty()) ? new Bundle() : (Bundle) list.get(0)));
                }
            }
            zzgrs it = zzgphVarZzo.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it.next();
                String str4 = (String) entry2.getKey();
                if (!map.containsKey(str4) && ((zzens) entry2.getValue()).zzd) {
                    map.put(str4, (zzens) entry2.getValue());
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return map;
    }

    public final synchronized void zze(String str) {
        if (!TextUtils.isEmpty(str)) {
            Map map = this.zza;
            if (!map.containsKey(str)) {
                map.put(str, new zzenq(str, "", new Bundle()));
            }
        }
    }

    public final /* synthetic */ void zzf() {
        this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzenm
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzh();
            }
        });
    }
}
