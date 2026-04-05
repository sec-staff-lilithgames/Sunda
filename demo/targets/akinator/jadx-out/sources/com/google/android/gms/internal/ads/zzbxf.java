package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.Iterator;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbxf extends zzbxd {
    private final Object zza = new Object();
    private final Context zzb;
    private SharedPreferences zzc;
    private final zzbqf zzd;
    private final VersionInfoParcel zze;

    public zzbxf(Context context, zzbqf zzbqfVar, VersionInfoParcel versionInfoParcel) {
        this.zzb = context.getApplicationContext();
        this.zze = versionInfoParcel;
        this.zzd = zzbqfVar;
    }

    public static JSONObject zzb(Context context, VersionInfoParcel versionInfoParcel) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            if (((Boolean) zzbgu.zzd.zze()).booleanValue()) {
                jSONObject.put("package_name", context.getPackageName());
            }
            jSONObject.put("js", versionInfoParcel.afmaVersion);
            jSONObject.put("mf", zzbgu.zze.zze());
            jSONObject.put("cl", "811902923");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", 12451000);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.getRemoteVersion(context, ModuleDescriptor.MODULE_ID));
            jSONObject.put("container_version", 12451000);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzbxd
    public final n1 zza() {
        synchronized (this.zza) {
            try {
                if (this.zzc == null) {
                    this.zzc = this.zzb.getSharedPreferences("google_ads_flags_meta", 0);
                }
            } finally {
            }
        }
        SharedPreferences sharedPreferences = this.zzc;
        if (com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - (sharedPreferences != null ? sharedPreferences.getLong("js_last_update", 0L) : 0L) < ((Long) zzbgu.zzf.zze()).longValue()) {
            return zzgui.zza(null);
        }
        return zzgui.zzk(this.zzd.zzb(zzb(this.zzb, this.zze)), new zzglu() { // from class: com.google.android.gms.internal.ads.zzbxe
            @Override // com.google.android.gms.internal.ads.zzglu
            public final /* synthetic */ Object apply(Object obj) throws JSONException {
                this.zza.zzc((JSONObject) obj);
                return null;
            }
        }, zzcbv.zzg);
    }

    public final /* synthetic */ Void zzc(JSONObject jSONObject) throws JSONException {
        zzbel zzbelVar = zzbeu.zza;
        com.google.android.gms.ads.internal.client.zzbd.zza();
        Context context = this.zzb;
        SharedPreferences sharedPreferencesZzb = zzben.zzb(context);
        if (sharedPreferencesZzb == null) {
            return null;
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesZzb.edit();
        Objects.requireNonNull(com.google.android.gms.ads.internal.client.zzbd.zzb());
        int i10 = zzbgk.zza;
        com.google.android.gms.ads.internal.client.zzbd.zzb().zzd(editorEdit, 1, jSONObject);
        com.google.android.gms.ads.internal.client.zzbd.zza();
        editorEdit.commit();
        if (((Boolean) zzbgu.zzc.zze()).booleanValue() && !TextUtils.equals(context.getPackageName(), "com.google.android.gms")) {
            com.google.android.gms.ads.internal.client.zzbd.zza();
            SharedPreferences sharedPreferencesZza = zzben.zza(context);
            if (sharedPreferencesZza != null) {
                SharedPreferences.Editor editorEdit2 = sharedPreferencesZza.edit();
                com.google.android.gms.ads.internal.client.zzbd.zzb();
                JSONObject jSONObject2 = new JSONObject();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (next.startsWith("adapter:")) {
                        try {
                            jSONObject2.put(next, jSONObject.get(next));
                        } catch (JSONException unused) {
                        }
                    }
                }
                editorEdit2.putString("flag_configuration", jSONObject2.toString());
                editorEdit2.commit();
            }
        }
        SharedPreferences sharedPreferences = this.zzc;
        if (sharedPreferences == null) {
            return null;
        }
        sharedPreferences.edit().putLong("js_last_update", com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()).apply();
        return null;
    }
}
