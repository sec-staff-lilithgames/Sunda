package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbbu;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbgl;
import com.google.android.gms.internal.ads.zzbgm;
import com.google.android.gms.internal.ads.zzcbe;
import com.google.android.gms.internal.ads.zzcbv;
import com.ironsource.Y1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;
import rw.hIT.uQjDr;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzj implements zzg {
    private boolean zzb;
    private n1 zzd;
    private SharedPreferences zzf;
    private SharedPreferences.Editor zzg;
    private String zzi;
    private String zzj;
    private final Object zza = new Object();
    private final List zzc = new ArrayList();
    private zzbbu zze = null;
    private boolean zzh = true;
    private boolean zzk = true;
    private String zzl = Y1.f35726f;
    private int zzm = -1;
    private zzcbe zzn = new zzcbe("", 0);
    private long zzo = 0;
    private long zzp = 0;
    private int zzq = -1;
    private int zzr = 0;
    private Set zzs = Collections.EMPTY_SET;
    private JSONObject zzt = new JSONObject();
    private boolean zzu = true;
    private boolean zzv = true;
    private String zzw = null;
    private String zzx = "";
    private boolean zzy = false;
    private String zzz = "";
    private String zzA = "{}";
    private int zzB = -1;
    private int zzC = -1;
    private long zzD = 0;

    private final void zzR() throws ExecutionException, InterruptedException, TimeoutException {
        n1 n1Var = this.zzd;
        if (n1Var == null || n1Var.isDone()) {
            return;
        }
        try {
            this.zzd.get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            int i10 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Interrupted while waiting for preferences loaded.", e10);
        } catch (CancellationException e11) {
            e = e11;
            int i11 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (ExecutionException e12) {
            e = e12;
            int i112 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (TimeoutException e13) {
            e = e13;
            int i1122 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Fail to initialize AdSharedPreferenceManager.", e);
        }
    }

    private final void zzS() {
        zzcbv.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzh
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzP();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzA(String str) throws ExecutionException, InterruptedException, TimeoutException {
        zzR();
        synchronized (this.zza) {
            try {
                this.zzl = str;
                if (this.zzg != null) {
                    if (str.equals(Y1.f35726f)) {
                        this.zzg.remove("IABTCF_TCString");
                    } else {
                        this.zzg.putString("IABTCF_TCString", str);
                    }
                    this.zzg.apply();
                }
                zzS();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzB() throws ExecutionException, InterruptedException, TimeoutException {
        zzR();
        return this.zzl;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzC(int i10) throws ExecutionException, InterruptedException, TimeoutException {
        zzR();
        synchronized (this.zza) {
            try {
                this.zzm = i10;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    if (i10 == -1) {
                        editor.remove("gad_has_consent_for_cookies");
                    } else {
                        editor.putInt("gad_has_consent_for_cookies", i10);
                    }
                    this.zzg.apply();
                }
                zzS();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zzD() throws ExecutionException, InterruptedException, TimeoutException {
        zzR();
        return this.zzm;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzE(int i10) throws ExecutionException, InterruptedException, TimeoutException {
        zzR();
        synchronized (this.zza) {
            try {
                if (this.zzC == i10) {
                    return;
                }
                this.zzC = i10;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putInt("sd_app_measure_npa", i10);
                    this.zzg.apply();
                }
                zzS();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zzF() throws ExecutionException, InterruptedException, TimeoutException {
        long j10;
        zzR();
        synchronized (this.zza) {
            j10 = this.zzD;
        }
        return j10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzG(long j10) throws ExecutionException, InterruptedException, TimeoutException {
        zzR();
        synchronized (this.zza) {
            try {
                if (this.zzD == j10) {
                    return;
                }
                this.zzD = j10;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putLong("sd_app_measure_npa_ts", j10);
                    this.zzg.apply();
                }
                zzS();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzH() throws ExecutionException, InterruptedException, TimeoutException {
        String str;
        zzR();
        synchronized (this.zza) {
            str = this.zzx;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzI(String str) throws ExecutionException, InterruptedException, TimeoutException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzjT)).booleanValue()) {
            zzR();
            synchronized (this.zza) {
                try {
                    if (this.zzx.equals(str)) {
                        return;
                    }
                    this.zzx = str;
                    SharedPreferences.Editor editor = this.zzg;
                    if (editor != null) {
                        editor.putString("inspector_info", str);
                        this.zzg.apply();
                    }
                    zzS();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzJ() throws ExecutionException, InterruptedException, TimeoutException {
        boolean z10;
        zzR();
        synchronized (this.zza) {
            z10 = this.zzy;
        }
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzK(boolean z10) throws ExecutionException, InterruptedException, TimeoutException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzki)).booleanValue()) {
            zzR();
            synchronized (this.zza) {
                try {
                    if (this.zzy == z10) {
                        return;
                    }
                    this.zzy = z10;
                    SharedPreferences.Editor editor = this.zzg;
                    if (editor != null) {
                        editor.putBoolean("linked_device", z10);
                        this.zzg.apply();
                    }
                    zzS();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzL() throws ExecutionException, InterruptedException, TimeoutException {
        String str;
        zzR();
        synchronized (this.zza) {
            str = this.zzz;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzM(String str) throws ExecutionException, InterruptedException, TimeoutException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzki)).booleanValue()) {
            zzR();
            synchronized (this.zza) {
                try {
                    if (this.zzz.equals(str)) {
                        return;
                    }
                    this.zzz = str;
                    SharedPreferences.Editor editor = this.zzg;
                    if (editor != null) {
                        editor.putString("linked_ad_unit", str);
                        this.zzg.apply();
                    }
                    zzS();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzN() throws ExecutionException, InterruptedException, TimeoutException {
        String str;
        zzR();
        synchronized (this.zza) {
            str = this.zzA;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzO(String str) throws ExecutionException, InterruptedException, TimeoutException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzkw)).booleanValue()) {
            zzR();
            synchronized (this.zza) {
                try {
                    if (this.zzA.equals(str)) {
                        return;
                    }
                    this.zzA = str;
                    SharedPreferences.Editor editor = this.zzg;
                    if (editor != null) {
                        editor.putString("inspector_ui_storage", str);
                        this.zzg.apply();
                    }
                    zzS();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final zzbbu zzP() {
        if (!this.zzb) {
            return null;
        }
        if ((zzc() && zze()) || !((Boolean) zzbgl.zzb.zze()).booleanValue()) {
            return null;
        }
        synchronized (this.zza) {
            try {
                if (Looper.getMainLooper() == null) {
                    return null;
                }
                if (this.zze == null) {
                    this.zze = new zzbbu();
                }
                this.zze.zza();
                int i10 = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("start fetching content...");
                return this.zze;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zza(final Context context) {
        synchronized (this.zza) {
            try {
                if (this.zzf != null) {
                    return;
                }
                final String str = "admob";
                this.zzd = zzcbv.zza.submit(new Runnable(context, str) { // from class: com.google.android.gms.ads.internal.util.zzi
                    private final /* synthetic */ Context zzb;
                    private final /* synthetic */ String zzc = "admob";

                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzQ(this.zzb, this.zzc);
                    }
                });
                this.zzb = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzb(boolean z10) throws ExecutionException, InterruptedException, TimeoutException {
        zzR();
        synchronized (this.zza) {
            try {
                if (this.zzu == z10) {
                    return;
                }
                this.zzu = z10;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putBoolean("content_url_opted_out", z10);
                    this.zzg.apply();
                }
                zzS();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzc() throws ExecutionException, InterruptedException, TimeoutException {
        boolean z10;
        zzR();
        synchronized (this.zza) {
            z10 = this.zzu;
        }
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzd(boolean z10) throws ExecutionException, InterruptedException, TimeoutException {
        zzR();
        synchronized (this.zza) {
            try {
                if (this.zzv == z10) {
                    return;
                }
                this.zzv = z10;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putBoolean("content_vertical_opted_out", z10);
                    this.zzg.apply();
                }
                zzS();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zze() throws ExecutionException, InterruptedException, TimeoutException {
        boolean z10;
        zzR();
        synchronized (this.zza) {
            z10 = this.zzv;
        }
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzf(int i10) throws ExecutionException, InterruptedException, TimeoutException {
        zzR();
        synchronized (this.zza) {
            try {
                if (this.zzr == i10) {
                    return;
                }
                this.zzr = i10;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putInt("version_code", i10);
                    this.zzg.apply();
                }
                zzS();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zzg() throws ExecutionException, InterruptedException, TimeoutException {
        int i10;
        zzR();
        synchronized (this.zza) {
            i10 = this.zzr;
        }
        return i10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzh(String str) throws ExecutionException, InterruptedException, TimeoutException {
        zzR();
        synchronized (this.zza) {
            try {
                long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
                if (str != null && !str.equals(this.zzn.zzd())) {
                    this.zzn = new zzcbe(str, jCurrentTimeMillis);
                    SharedPreferences.Editor editor = this.zzg;
                    if (editor != null) {
                        editor.putString("app_settings_json", str);
                        this.zzg.putLong("app_settings_last_update_ms", jCurrentTimeMillis);
                        this.zzg.apply();
                    }
                    zzS();
                    Iterator it = this.zzc.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    return;
                }
                this.zzn.zza(jCurrentTimeMillis);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final zzcbe zzi() throws ExecutionException, InterruptedException, TimeoutException {
        zzcbe zzcbeVar;
        zzR();
        synchronized (this.zza) {
            try {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzmH)).booleanValue() && this.zzn.zzj()) {
                    Iterator it = this.zzc.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                }
                zzcbeVar = this.zzn;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzcbeVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final zzcbe zzj() {
        zzcbe zzcbeVar;
        synchronized (this.zza) {
            zzcbeVar = this.zzn;
        }
        return zzcbeVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzk(Runnable runnable) {
        this.zzc.add(runnable);
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzl(long j10) throws ExecutionException, InterruptedException, TimeoutException {
        zzR();
        synchronized (this.zza) {
            try {
                if (this.zzo == j10) {
                    return;
                }
                this.zzo = j10;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putLong("app_last_background_time_ms", j10);
                    this.zzg.apply();
                }
                zzS();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zzm() throws ExecutionException, InterruptedException, TimeoutException {
        long j10;
        zzR();
        synchronized (this.zza) {
            j10 = this.zzo;
        }
        return j10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzn(int i10) throws ExecutionException, InterruptedException, TimeoutException {
        zzR();
        synchronized (this.zza) {
            try {
                if (this.zzq == i10) {
                    return;
                }
                this.zzq = i10;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putInt("request_in_session_count", i10);
                    this.zzg.apply();
                }
                zzS();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zzo() throws ExecutionException, InterruptedException, TimeoutException {
        int i10;
        zzR();
        synchronized (this.zza) {
            i10 = this.zzq;
        }
        return i10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzp(long j10) throws ExecutionException, InterruptedException, TimeoutException {
        zzR();
        synchronized (this.zza) {
            try {
                if (this.zzp == j10) {
                    return;
                }
                this.zzp = j10;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putLong("first_ad_req_time_ms", j10);
                    this.zzg.apply();
                }
                zzS();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zzq() throws ExecutionException, InterruptedException, TimeoutException {
        long j10;
        zzR();
        synchronized (this.zza) {
            j10 = this.zzp;
        }
        return j10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        r3 = new org.json.JSONObject();
        r3.put("template_id", r9);
        r3.put("uses_media_view", r10);
        r3.put("timestamp_ms", com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        r1.put(r2, r3);
        r7.zzt.put(r8, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006e, code lost:
    
        r10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not update native advanced settings", r8);
     */
    @Override // com.google.android.gms.ads.internal.util.zzg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzr(java.lang.String r8, java.lang.String r9, boolean r10) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        /*
            r7 = this;
            r7.zzR()
            java.lang.Object r0 = r7.zza
            monitor-enter(r0)
            org.json.JSONObject r1 = r7.zzt     // Catch: java.lang.Throwable -> L14
            org.json.JSONArray r1 = r1.optJSONArray(r8)     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L17
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L14
            r1.<init>()     // Catch: java.lang.Throwable -> L14
            goto L17
        L14:
            r8 = move-exception
            goto L8e
        L17:
            int r2 = r1.length()     // Catch: java.lang.Throwable -> L14
            r3 = 0
            r4 = r3
        L1d:
            int r5 = r1.length()     // Catch: java.lang.Throwable -> L14
            if (r4 >= r5) goto L48
            org.json.JSONObject r5 = r1.optJSONObject(r4)     // Catch: java.lang.Throwable -> L14
            if (r5 != 0) goto L2b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L2b:
            java.lang.String r6 = "template_id"
            java.lang.String r6 = r5.optString(r6)     // Catch: java.lang.Throwable -> L14
            boolean r6 = r9.equals(r6)     // Catch: java.lang.Throwable -> L14
            if (r6 == 0) goto L45
            if (r10 == 0) goto L43
            java.lang.String r2 = "uses_media_view"
            boolean r2 = r5.optBoolean(r2, r3)     // Catch: java.lang.Throwable -> L14
            if (r2 == 0) goto L43
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L43:
            r2 = r4
            goto L48
        L45:
            int r4 = r4 + 1
            goto L1d
        L48:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6d
            r3.<init>()     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6d
            java.lang.String r4 = "template_id"
            r3.put(r4, r9)     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6d
            java.lang.String r9 = "uses_media_view"
            r3.put(r9, r10)     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6d
            java.lang.String r9 = "timestamp_ms"
            com.google.android.gms.common.util.Clock r10 = com.google.android.gms.ads.internal.zzt.zzk()     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6d
            long r4 = r10.currentTimeMillis()     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6d
            r3.put(r9, r4)     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6d
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6d
            org.json.JSONObject r9 = r7.zzt     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6d
            r9.put(r8, r1)     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6d
            goto L75
        L6d:
            r8 = move-exception
            java.lang.String r9 = "Could not update native advanced settings"
            int r10 = com.google.android.gms.ads.internal.util.zze.zza     // Catch: java.lang.Throwable -> L14
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r9, r8)     // Catch: java.lang.Throwable -> L14
        L75:
            android.content.SharedPreferences$Editor r8 = r7.zzg     // Catch: java.lang.Throwable -> L14
            if (r8 == 0) goto L89
            java.lang.String r9 = "native_advanced_settings"
            org.json.JSONObject r10 = r7.zzt     // Catch: java.lang.Throwable -> L14
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L14
            r8.putString(r9, r10)     // Catch: java.lang.Throwable -> L14
            android.content.SharedPreferences$Editor r8 = r7.zzg     // Catch: java.lang.Throwable -> L14
            r8.apply()     // Catch: java.lang.Throwable -> L14
        L89:
            r7.zzS()     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L8e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzj.zzr(java.lang.String, java.lang.String, boolean):void");
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final JSONObject zzs() throws ExecutionException, InterruptedException, TimeoutException {
        JSONObject jSONObject;
        zzR();
        synchronized (this.zza) {
            jSONObject = this.zzt;
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzt() throws ExecutionException, InterruptedException, TimeoutException {
        zzR();
        synchronized (this.zza) {
            try {
                this.zzt = new JSONObject();
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.remove("native_advanced_settings");
                    this.zzg.apply();
                }
                zzS();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzu() throws ExecutionException, InterruptedException, TimeoutException {
        String str;
        zzR();
        synchronized (this.zza) {
            str = this.zzw;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzv(String str) throws ExecutionException, InterruptedException, TimeoutException {
        zzR();
        synchronized (this.zza) {
            try {
                if (TextUtils.equals(this.zzw, str)) {
                    return;
                }
                this.zzw = str;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putString("display_cutout", str);
                    this.zzg.apply();
                }
                zzS();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzw(boolean z10) throws ExecutionException, InterruptedException, TimeoutException {
        zzR();
        synchronized (this.zza) {
            try {
                if (z10 == this.zzk) {
                    return;
                }
                this.zzk = z10;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putBoolean("gad_idless", z10);
                    this.zzg.apply();
                }
                zzS();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzx() throws ExecutionException, InterruptedException, TimeoutException {
        boolean z10;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzaO)).booleanValue()) {
            return false;
        }
        zzR();
        synchronized (this.zza) {
            z10 = this.zzk;
        }
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzy(boolean z10) throws ExecutionException, InterruptedException, TimeoutException {
        zzR();
        synchronized (this.zza) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis() + ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzlx)).longValue();
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putBoolean("is_topics_ad_personalization_allowed", z10);
                    this.zzg.putLong("topics_consent_expiry_time_ms", jCurrentTimeMillis);
                    this.zzg.apply();
                }
                zzS();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzz() throws ExecutionException, InterruptedException, TimeoutException {
        zzR();
        synchronized (this.zza) {
            try {
                SharedPreferences sharedPreferences = this.zzf;
                boolean z10 = false;
                if (sharedPreferences == null) {
                    return false;
                }
                if (sharedPreferences.getLong("topics_consent_expiry_time_ms", 0L) < System.currentTimeMillis()) {
                    return false;
                }
                if (this.zzf.getBoolean("is_topics_ad_personalization_allowed", false) && !this.zzk) {
                    z10 = true;
                }
                return z10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final /* synthetic */ void zzQ(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        try {
            synchronized (this.zza) {
                try {
                    this.zzf = sharedPreferences;
                    this.zzg = editorEdit;
                    NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
                    this.zzh = this.zzf.getBoolean("use_https", this.zzh);
                    this.zzu = this.zzf.getBoolean("content_url_opted_out", this.zzu);
                    this.zzi = this.zzf.getString("content_url_hashes", this.zzi);
                    this.zzk = this.zzf.getBoolean("gad_idless", this.zzk);
                    this.zzv = this.zzf.getBoolean("content_vertical_opted_out", this.zzv);
                    this.zzj = this.zzf.getString("content_vertical_hashes", this.zzj);
                    this.zzr = this.zzf.getInt("version_code", this.zzr);
                    if (((Boolean) zzbgm.zzg.zze()).booleanValue() && com.google.android.gms.ads.internal.client.zzbd.zzc().zzc()) {
                        this.zzn = new zzcbe("", 0L);
                    } else {
                        this.zzn = new zzcbe(this.zzf.getString("app_settings_json", this.zzn.zzd()), this.zzf.getLong("app_settings_last_update_ms", this.zzn.zzb()));
                    }
                    this.zzo = this.zzf.getLong("app_last_background_time_ms", this.zzo);
                    this.zzq = this.zzf.getInt("request_in_session_count", this.zzq);
                    this.zzp = this.zzf.getLong("first_ad_req_time_ms", this.zzp);
                    this.zzs = this.zzf.getStringSet("never_pool_slots", this.zzs);
                    this.zzw = this.zzf.getString("display_cutout", this.zzw);
                    this.zzB = this.zzf.getInt("app_measurement_npa", this.zzB);
                    this.zzC = this.zzf.getInt("sd_app_measure_npa", this.zzC);
                    this.zzD = this.zzf.getLong("sd_app_measure_npa_ts", this.zzD);
                    this.zzx = this.zzf.getString("inspector_info", this.zzx);
                    this.zzy = this.zzf.getBoolean("linked_device", this.zzy);
                    this.zzz = this.zzf.getString("linked_ad_unit", this.zzz);
                    this.zzA = this.zzf.getString("inspector_ui_storage", this.zzA);
                    this.zzl = this.zzf.getString(uQjDr.MtEHEFKyEhrZhaH, this.zzl);
                    this.zzm = this.zzf.getInt("gad_has_consent_for_cookies", this.zzm);
                    try {
                        this.zzt = new JSONObject(this.zzf.getString("native_advanced_settings", "{}"));
                    } catch (JSONException e10) {
                        int i10 = zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not convert native advanced settings to json object", e10);
                    }
                    zzS();
                } finally {
                }
            }
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(th2, "AdSharedPreferenceManagerImpl.initializeOnBackgroundThread");
            zze.zzb("AdSharedPreferenceManagerImpl.initializeOnBackgroundThread, errorMessage = ", th2);
        }
    }
}
