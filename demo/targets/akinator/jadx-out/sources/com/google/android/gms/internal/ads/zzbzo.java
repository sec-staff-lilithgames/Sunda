package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbzo implements zzbzt {
    public static final /* synthetic */ int zzb = 0;
    private static final List zzc = Collections.synchronizedList(new ArrayList());
    boolean zza;
    private final zziaw zzd;
    private final LinkedHashMap zze;
    private final Context zzh;
    private final zzbzq zzi;
    private final List zzf = new ArrayList();
    private final List zzg = new ArrayList();
    private final Object zzj = new Object();
    private HashSet zzk = new HashSet();
    private boolean zzl = false;
    private boolean zzm = false;

    public zzbzo(Context context, VersionInfoParcel versionInfoParcel, zzbzq zzbzqVar, String str, zzbzp zzbzpVar) {
        Preconditions.checkNotNull(zzbzqVar, "SafeBrowsing config is not present.");
        this.zzh = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zze = new LinkedHashMap();
        this.zzi = zzbzqVar;
        Iterator it = zzbzqVar.zze.iterator();
        while (it.hasNext()) {
            this.zzk.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.zzk.remove("cookie".toLowerCase(Locale.ENGLISH));
        zziaw zziawVarZzg = zzida.zzg();
        zziawVarZzg.zzn(9);
        if (str != null) {
            zziawVarZzg.zzb(str);
            zziawVarZzg.zzc(str);
        }
        zziax zziaxVarZzc = zziay.zzc();
        String str2 = this.zzi.zza;
        if (str2 != null) {
            zziaxVarZzc.zza(str2);
        }
        zziawVarZzg.zzd((zziay) zziaxVarZzc.zzbu());
        zzicm zzicmVarZzc = zzicn.zzc();
        zzicmVarZzc.zzc(Wrappers.packageManager(this.zzh).isCallerInstantApp());
        String str3 = versionInfoParcel.afmaVersion;
        if (str3 != null) {
            zzicmVarZzc.zza(str3);
        }
        long apkVersion = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzh);
        if (apkVersion > 0) {
            zzicmVarZzc.zzb(apkVersion);
        }
        zziawVarZzg.zzk((zzicn) zzicmVarZzc.zzbu());
        this.zzd = zziawVarZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    public final zzbzq zza() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    public final void zzb(String str) {
        synchronized (this.zzj) {
            try {
                if (str == null) {
                    this.zzd.zzi();
                } else {
                    this.zzd.zzh(str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    public final boolean zzc() {
        return this.zzi.zzc && !this.zzl;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzbzt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd(android.view.View r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzbzq r0 = r7.zzi
            boolean r0 = r0.zzc
            if (r0 != 0) goto L8
            goto L88
        L8:
            boolean r0 = r7.zzl
            if (r0 != 0) goto L88
            com.google.android.gms.ads.internal.zzt.zzc()
            r0 = 1
            r1 = 0
            if (r8 != 0) goto L15
            goto L76
        L15:
            boolean r2 = r8.isDrawingCacheEnabled()     // Catch: java.lang.RuntimeException -> L27
            r8.setDrawingCacheEnabled(r0)     // Catch: java.lang.RuntimeException -> L27
            android.graphics.Bitmap r3 = r8.getDrawingCache()     // Catch: java.lang.RuntimeException -> L27
            if (r3 == 0) goto L29
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3)     // Catch: java.lang.RuntimeException -> L27
            goto L2a
        L27:
            r2 = move-exception
            goto L30
        L29:
            r3 = r1
        L2a:
            r8.setDrawingCacheEnabled(r2)     // Catch: java.lang.RuntimeException -> L2e
            goto L38
        L2e:
            r2 = move-exception
            goto L31
        L30:
            r3 = r1
        L31:
            int r4 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r4 = "Fail to capture the web view"
            com.google.android.gms.ads.internal.util.client.zzo.zzg(r4, r2)
        L38:
            if (r3 != 0) goto L75
            int r2 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L63
            int r3 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L63
            if (r2 == 0) goto L65
            if (r3 != 0) goto L47
            goto L65
        L47:
            int r4 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L63
            int r5 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L63
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.RuntimeException -> L63
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r6)     // Catch: java.lang.RuntimeException -> L63
            android.graphics.Canvas r5 = new android.graphics.Canvas     // Catch: java.lang.RuntimeException -> L63
            r5.<init>(r4)     // Catch: java.lang.RuntimeException -> L63
            r6 = 0
            r8.layout(r6, r6, r2, r3)     // Catch: java.lang.RuntimeException -> L63
            r8.draw(r5)     // Catch: java.lang.RuntimeException -> L63
            r1 = r4
            goto L76
        L63:
            r8 = move-exception
            goto L6d
        L65:
            java.lang.String r8 = "Width or height of view is zero"
            int r2 = com.google.android.gms.ads.internal.util.zze.zza     // Catch: java.lang.RuntimeException -> L63
            com.google.android.gms.ads.internal.util.client.zzo.zzi(r8)     // Catch: java.lang.RuntimeException -> L63
            goto L76
        L6d:
            int r2 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r2 = "Fail to capture the webview"
            com.google.android.gms.ads.internal.util.client.zzo.zzg(r2, r8)
            goto L76
        L75:
            r1 = r3
        L76:
            if (r1 != 0) goto L7e
            java.lang.String r8 = "Failed to capture the webview bitmap."
            com.google.android.gms.internal.ads.zzbzs.zza(r8)
            return
        L7e:
            r7.zzl = r0
            com.google.android.gms.internal.ads.zzbzn r8 = new com.google.android.gms.internal.ads.zzbzn
            r8.<init>()
            com.google.android.gms.ads.internal.util.zzs.zzh(r8)
        L88:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbzo.zzd(android.view.View):void");
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    public final void zze(String str, Map map, int i10) {
        synchronized (this.zzj) {
            if (i10 == 3) {
                try {
                    this.zzm = true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            LinkedHashMap linkedHashMap = this.zze;
            if (linkedHashMap.containsKey(str)) {
                if (i10 == 3) {
                    ((zzick) linkedHashMap.get(str)).zze(4);
                }
                return;
            }
            zzick zzickVarZze = zzicl.zze();
            int iZza = zzicj.zza(i10);
            if (iZza != 0) {
                zzickVarZze.zze(iZza);
            }
            zzickVarZze.zza(linkedHashMap.size());
            zzickVarZze.zzb(str);
            zzibj zzibjVarZzc = zzibm.zzc();
            if (!this.zzk.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.zzk.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        zzibh zzibhVarZzc = zzibi.zzc();
                        zzibhVarZzc.zza(zzhvi.zzs(str2));
                        zzibhVarZzc.zzb(zzhvi.zzs(str3));
                        zzibjVarZzc.zza((zzibi) zzibhVarZzc.zzbu());
                    }
                }
            }
            zzickVarZze.zzc((zzibm) zzibjVarZzc.zzbu());
            linkedHashMap.put(str, zzickVarZze);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    public final void zzf() {
        synchronized (this.zzj) {
            this.zze.keySet();
            n1 n1VarZza = zzgui.zza(Collections.EMPTY_MAP);
            zzgtq zzgtqVar = new zzgtq() { // from class: com.google.android.gms.internal.ads.zzbzk
                @Override // com.google.android.gms.internal.ads.zzgtq
                public final /* synthetic */ n1 zza(Object obj) {
                    return this.zza.zzh((Map) obj);
                }
            };
            zzgus zzgusVar = zzcbv.zzg;
            n1 n1VarZzj = zzgui.zzj(n1VarZza, zzgtqVar, zzgusVar);
            n1 n1VarZzi = zzgui.zzi(n1VarZzj, 10L, TimeUnit.SECONDS, zzcbv.zzd);
            zzgui.zzr(n1VarZzj, new zzbzj(this, n1VarZzi), zzgusVar);
            zzc.add(n1VarZzi);
        }
    }

    public final /* synthetic */ void zzg(Bitmap bitmap) {
        zzhvh zzhvhVarZzx = zzhvi.zzx();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, zzhvhVarZzx);
        synchronized (this.zzj) {
            zziaw zziawVar = this.zzd;
            zzice zziceVarZzc = zzicg.zzc();
            zziceVarZzc.zzb(zzhvhVarZzx.zza());
            zziceVarZzc.zza("image/png");
            zziceVarZzc.zzc(2);
            zziawVar.zzj((zzicg) zziceVarZzc.zzbu());
        }
    }

    public final /* synthetic */ n1 zzh(Map map) {
        int length;
        zzick zzickVar;
        n1 n1VarZzk;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray jSONArrayOptJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (jSONArrayOptJSONArray != null) {
                        Object obj = this.zzj;
                        synchronized (obj) {
                            try {
                                length = jSONArrayOptJSONArray.length();
                                synchronized (obj) {
                                    zzickVar = (zzick) this.zze.get(str);
                                }
                            } finally {
                            }
                        }
                        if (zzickVar == null) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 50);
                            sb2.append("Cannot find the corresponding resource object for ");
                            sb2.append(str);
                            zzbzs.zza(sb2.toString());
                        } else {
                            for (int i10 = 0; i10 < length; i10++) {
                                zzickVar.zzd(jSONArrayOptJSONArray.getJSONObject(i10).getString("threat_type"));
                            }
                            this.zza = (length > 0) | this.zza;
                        }
                    }
                }
            } catch (JSONException e10) {
                if (((Boolean) zzbhc.zza.zze()).booleanValue()) {
                    int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zze("Failed to get SafeBrowsing metadata", e10);
                }
                return zzgui.zzc(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.zza) {
            synchronized (this.zzj) {
                this.zzd.zzn(10);
            }
        }
        boolean z10 = this.zza;
        if (!(z10 && this.zzi.zzg) && (!(this.zzm && this.zzi.zzf) && (z10 || !this.zzi.zzd))) {
            return zzgui.zza(null);
        }
        synchronized (this.zzj) {
            try {
                Iterator it = this.zze.values().iterator();
                while (it.hasNext()) {
                    this.zzd.zzf((zzicl) ((zzick) it.next()).zzbu());
                }
                zziaw zziawVar = this.zzd;
                zziawVar.zzl(this.zzf);
                zziawVar.zzm(this.zzg);
                if (zzbzs.zzb()) {
                    String strZza = zziawVar.zza();
                    String strZzg = zziawVar.zzg();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(strZza).length() + 38 + String.valueOf(strZzg).length() + 15);
                    sb3.append("Sending SB report\n  url: ");
                    sb3.append(strZza);
                    sb3.append("\n  clickUrl: ");
                    sb3.append(strZzg);
                    sb3.append("\n  resources: \n");
                    StringBuilder sb4 = new StringBuilder(sb3.toString());
                    for (zzicl zziclVar : zziawVar.zze()) {
                        sb4.append("    [");
                        sb4.append(zziclVar.zzd());
                        sb4.append("] ");
                        sb4.append(zziclVar.zzc());
                    }
                    zzbzs.zza(sb4.toString());
                }
                n1 n1VarZzb = new com.google.android.gms.ads.internal.util.zzbl(this.zzh).zzb(1, this.zzi.zzb, null, ((zzida) zziawVar.zzbu()).zzaN());
                if (zzbzs.zzb()) {
                    n1VarZzb.addListener(zzbzm.zza, zzcbv.zza);
                }
                n1VarZzk = zzgui.zzk(n1VarZzb, zzbzl.zza, zzcbv.zzg);
            } finally {
            }
        }
        return n1VarZzk;
    }
}
