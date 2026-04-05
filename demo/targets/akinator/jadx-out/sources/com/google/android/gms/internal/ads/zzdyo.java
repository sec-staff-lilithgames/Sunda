package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.RemoteException;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.ironsource.C3352n2;
import com.ironsource.Q6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdyo implements zzdzq, zzdxz {
    private final zzdyz zza;
    private final zzdzr zzb;
    private final zzdya zzc;
    private final zzdyj zzd;
    private final zzdxy zze;
    private final zzdzl zzf;
    private final zzdyv zzg;
    private final zzdyv zzh;
    private final String zzi;
    private final Context zzj;
    private final String zzk;
    private JSONObject zzp;
    private boolean zzs;
    private int zzt;
    private boolean zzu;
    private final Map zzl = new HashMap();
    private final Map zzm = new HashMap();
    private final Map zzn = new HashMap();
    private String zzo = "{}";
    private long zzq = Long.MAX_VALUE;
    private zzdyk zzr = zzdyk.NONE;
    private zzdyn zzv = zzdyn.UNKNOWN;
    private long zzw = 0;
    private String zzx = "";

    public zzdyo(zzdyz zzdyzVar, zzdzr zzdzrVar, zzdya zzdyaVar, Context context, VersionInfoParcel versionInfoParcel, zzdyj zzdyjVar, zzdzl zzdzlVar, zzdyv zzdyvVar, zzdyv zzdyvVar2, String str) {
        this.zza = zzdyzVar;
        this.zzb = zzdzrVar;
        this.zzc = zzdyaVar;
        this.zze = new zzdxy(context);
        this.zzi = versionInfoParcel.afmaVersion;
        this.zzk = str;
        this.zzd = zzdyjVar;
        this.zzf = zzdzlVar;
        this.zzg = zzdyvVar;
        this.zzh = zzdyvVar2;
        this.zzj = context;
        com.google.android.gms.ads.internal.zzt.zzo().zza(this);
    }

    private final synchronized void zzA(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            zzt(jSONObject.optBoolean("isTestMode", false), false);
            zzu((zzdyk) Enum.valueOf(zzdyk.class, jSONObject.optString("gesture", "NONE")), false);
            this.zzo = jSONObject.optString("networkExtras", "{}");
            this.zzq = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
        } catch (JSONException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:3:0x0001, B:6:0x0006, B:8:0x000a, B:10:0x001c, B:15:0x0029, B:20:0x0038, B:16:0x002d, B:18:0x0033), top: B:27:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized void zzt(boolean r2, boolean r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.zzs     // Catch: java.lang.Throwable -> L27
            if (r0 != r2) goto L6
            goto L3d
        L6:
            r1.zzs = r2     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L2d
            com.google.android.gms.internal.ads.zzbel r2 = com.google.android.gms.internal.ads.zzbeu.zzki     // Catch: java.lang.Throwable -> L27
            com.google.android.gms.internal.ads.zzbes r0 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Throwable -> L27
            java.lang.Object r2 = r0.zzd(r2)     // Catch: java.lang.Throwable -> L27
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L27
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L29
            com.google.android.gms.ads.internal.util.zzax r2 = com.google.android.gms.ads.internal.zzt.zzo()     // Catch: java.lang.Throwable -> L27
            boolean r2 = r2.zzk()     // Catch: java.lang.Throwable -> L27
            if (r2 != 0) goto L2d
            goto L29
        L27:
            r2 = move-exception
            goto L3f
        L29:
            r1.zzx()     // Catch: java.lang.Throwable -> L27
            goto L36
        L2d:
            boolean r2 = r1.zzs()     // Catch: java.lang.Throwable -> L27
            if (r2 != 0) goto L36
            r1.zzy()     // Catch: java.lang.Throwable -> L27
        L36:
            if (r3 == 0) goto L3d
            r1.zzz()     // Catch: java.lang.Throwable -> L27
            monitor-exit(r1)
            return
        L3d:
            monitor-exit(r1)
            return
        L3f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L27
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdyo.zzt(boolean, boolean):void");
    }

    private final synchronized void zzu(zzdyk zzdykVar, boolean z10) {
        try {
            if (this.zzr != zzdykVar) {
                if (zzs()) {
                    zzy();
                }
                this.zzr = zzdykVar;
                if (zzs()) {
                    zzx();
                }
                if (z10) {
                    zzz();
                }
            }
        } finally {
        }
    }

    private final synchronized JSONObject zzv() throws JSONException {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            for (Map.Entry entry : this.zzl.entrySet()) {
                JSONArray jSONArray = new JSONArray();
                for (zzdyc zzdycVar : (List) entry.getValue()) {
                    if (zzdycVar.zzc()) {
                        jSONArray.put(zzdycVar.zzg());
                    }
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put((String) entry.getKey(), jSONArray);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return jSONObject;
    }

    private final void zzw() throws JSONException {
        this.zzu = true;
        this.zzd.zza();
        this.zza.zzl(this);
        this.zzb.zza(this);
        this.zzc.zza(this);
        this.zzf.zzb(this);
        zzbel zzbelVar = zzbeu.zzkx;
        if (!TextUtils.isEmpty((CharSequence) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbelVar))) {
            this.zzg.zza(PreferenceManager.getDefaultSharedPreferences(this.zzj), Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbelVar)).split(",")));
        }
        zzbel zzbelVar2 = zzbeu.zzky;
        if (!TextUtils.isEmpty((CharSequence) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbelVar2))) {
            this.zzh.zza(this.zzj.getSharedPreferences("admob", 0), Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbelVar2)).split(",")));
        }
        zzA(com.google.android.gms.ads.internal.zzt.zzh().zzo().zzH());
        this.zzx = com.google.android.gms.ads.internal.zzt.zzh().zzo().zzN();
    }

    private final synchronized void zzx() {
        int iOrdinal = this.zzr.ordinal();
        if (iOrdinal == 1) {
            this.zzb.zzb();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.zzc.zzb();
        }
    }

    private final synchronized void zzy() {
        int iOrdinal = this.zzr.ordinal();
        if (iOrdinal == 1) {
            this.zzb.zzc();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.zzc.zzc();
        }
    }

    private final void zzz() {
        com.google.android.gms.ads.internal.zzt.zzh().zzo().zzI(zzh());
    }

    public final void zza() throws JSONException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzjT)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzki)).booleanValue() && com.google.android.gms.ads.internal.zzt.zzh().zzo().zzJ()) {
                zzw();
                return;
            }
            String strZzH = com.google.android.gms.ads.internal.zzt.zzh().zzo().zzH();
            if (TextUtils.isEmpty(strZzH)) {
                return;
            }
            try {
                if (new JSONObject(strZzH).optBoolean("isTestMode", false)) {
                    zzw();
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzb(boolean r2) throws org.json.JSONException {
        /*
            r1 = this;
            boolean r0 = r1.zzu
            if (r0 != 0) goto La
            if (r2 == 0) goto L15
            r1.zzw()
            goto Lc
        La:
            if (r2 == 0) goto L15
        Lc:
            boolean r2 = r1.zzs
            if (r2 == 0) goto L11
            goto L15
        L11:
            r1.zzx()
            return
        L15:
            boolean r2 = r1.zzs()
            if (r2 != 0) goto L1e
            r1.zzy()
        L1e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdyo.zzb(boolean):void");
    }

    public final void zzc(boolean z10) throws JSONException {
        if (!this.zzu && z10) {
            zzw();
        }
        zzt(z10, true);
    }

    public final synchronized boolean zzd() {
        return this.zzs;
    }

    public final void zze(zzdyk zzdykVar) {
        zzu(zzdykVar, true);
    }

    public final zzdyk zzf() {
        return this.zzr;
    }

    public final synchronized String zzg() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzjT)).booleanValue() && zzs()) {
            if (this.zzq < com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() / 1000) {
                this.zzo = "{}";
                this.zzq = Long.MAX_VALUE;
                return "";
            }
            if (!this.zzo.equals("{}")) {
                return this.zzo;
            }
        }
        return "";
    }

    public final synchronized String zzh() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("isTestMode", this.zzs);
            jSONObject.put("gesture", this.zzr);
            if (this.zzq > com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() / 1000) {
                jSONObject.put("networkExtras", this.zzo);
                jSONObject.put("networkExtrasExpirationSecs", this.zzq);
            }
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final synchronized void zzi(String str, long j10) {
        this.zzo = str;
        this.zzq = j10;
        zzz();
    }

    public final synchronized void zzj(String str) {
        this.zzx = str;
        com.google.android.gms.ads.internal.zzt.zzh().zzo().zzO(this.zzx);
    }

    public final synchronized void zzk(String str, zzdyc zzdycVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzjT)).booleanValue() && zzs()) {
            if (this.zzt >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzjV)).intValue()) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            Map map = this.zzl;
            if (!map.containsKey(str)) {
                map.put(str, new ArrayList());
            }
            this.zzt++;
            ((List) map.get(str)).add(zzdycVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzkr)).booleanValue()) {
                String strZzd = zzdycVar.zzd();
                this.zzm.put(strZzd, zzdycVar);
                Map map2 = this.zzn;
                if (map2.containsKey(strZzd)) {
                    List list = (List) map2.get(strZzd);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((zzcca) it.next()).zzc(zzdycVar);
                    }
                    list.clear();
                }
            }
        }
    }

    public final synchronized void zzl(long j10) {
        this.zzw += j10;
    }

    public final boolean zzm() {
        return this.zzw < ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzko)).longValue();
    }

    public final synchronized n1 zzn(String str) {
        zzcca zzccaVar;
        try {
            zzccaVar = new zzcca();
            Map map = this.zzm;
            if (map.containsKey(str)) {
                zzccaVar.zzc((zzdyc) map.get(str));
            } else {
                Map map2 = this.zzn;
                if (!map2.containsKey(str)) {
                    map2.put(str, new ArrayList());
                }
                ((List) map2.get(str)).add(zzccaVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return zzccaVar;
    }

    public final synchronized void zzo(com.google.android.gms.ads.internal.client.zzdn zzdnVar, zzdyn zzdynVar) {
        if (!zzs()) {
            try {
                zzdnVar.zze(zzfhp.zzd(18, null, null));
                return;
            } catch (RemoteException unused) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzjT)).booleanValue()) {
            this.zzv = zzdynVar;
            this.zza.zzm(zzdnVar, new zzbms(this), new zzbml(this.zzf), new zzbly(this));
            return;
        } else {
            try {
                zzdnVar.zze(zzfhp.zzd(1, null, null));
                return;
            } catch (RemoteException unused2) {
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Ad inspector had an internal error.");
                return;
            }
        }
    }

    public final synchronized void zzp(JSONObject jSONObject) {
        this.zzp = jSONObject;
    }

    public final boolean zzq() {
        return this.zzp != null;
    }

    public final synchronized JSONObject zzr() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put(Q6.H, "ANDROID");
                String str = this.zzk;
                if (!TextUtils.isEmpty(str)) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 12);
                    sb2.append("afma-sdk-a-v");
                    sb2.append(str);
                    jSONObject.put("sdkVersion", sb2.toString());
                }
                jSONObject.put("internalSdkVersion", this.zzi);
                jSONObject.put("osVersion", Build.VERSION.RELEASE);
                jSONObject.put("adapters", this.zzd.zzb());
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzku)).booleanValue()) {
                    String strZzu = com.google.android.gms.ads.internal.zzt.zzh().zzu();
                    if (!TextUtils.isEmpty(strZzu)) {
                        jSONObject.put(Q6.L, strZzu);
                    }
                }
                if (this.zzq < com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() / 1000) {
                    this.zzo = "{}";
                }
                jSONObject.put("networkExtras", this.zzo);
                jSONObject.put("adSlots", zzv());
                jSONObject.put("appInfo", this.zze.zza());
                String strZzd = com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzd();
                if (!TextUtils.isEmpty(strZzd)) {
                    jSONObject.put("cld", new JSONObject(strZzd));
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzkj)).booleanValue() && (jSONObject2 = this.zzp) != null) {
                    String string = jSONObject2.toString();
                    StringBuilder sb3 = new StringBuilder(string.length() + 13);
                    sb3.append("Server data: ");
                    sb3.append(string);
                    String string2 = sb3.toString();
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzd(string2);
                    jSONObject.put(C3352n2.f37925s, this.zzp);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzki)).booleanValue()) {
                    jSONObject.put("openAction", this.zzv);
                    jSONObject.put("gesture", this.zzr);
                }
                jSONObject.put("isGamRegisteredTestDevice", com.google.android.gms.ads.internal.zzt.zzo().zzk());
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.client.zzbb.zza();
                jSONObject.put("isSimulator", com.google.android.gms.ads.internal.util.client.zzf.zzw());
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzkw)).booleanValue()) {
                    jSONObject.put("uiStorage", new JSONObject(this.zzx));
                }
                if (!TextUtils.isEmpty((CharSequence) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzky))) {
                    jSONObject.put("gmaDisk", this.zzh.zzb());
                }
                if (!TextUtils.isEmpty((CharSequence) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzkx))) {
                    jSONObject.put("userDisk", this.zzg.zzb());
                }
            } catch (JSONException e10) {
                com.google.android.gms.ads.internal.zzt.zzh().zzh(e10, "Inspector.toJson");
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Ad inspector encountered an error", e10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return jSONObject;
    }

    public final synchronized boolean zzs() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzki)).booleanValue()) {
            return this.zzs || com.google.android.gms.ads.internal.zzt.zzo().zzk();
        }
        return this.zzs;
    }
}
