package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.ConditionVariable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbes implements SharedPreferences.OnSharedPreferenceChangeListener {
    private Context zzg;
    private final Object zzb = new Object();
    private final ConditionVariable zzc = new ConditionVariable();
    private volatile boolean zzd = false;
    volatile boolean zza = false;
    private SharedPreferences zze = null;
    private Bundle zzf = new Bundle();
    private JSONObject zzh = new JSONObject();
    private boolean zzi = false;
    private boolean zzj = false;

    private final void zzg(final SharedPreferences sharedPreferences) {
        if (sharedPreferences != null) {
            try {
                this.zzh = new JSONObject((String) zzbew.zza(new zzgmv() { // from class: com.google.android.gms.internal.ads.zzbep
                    @Override // com.google.android.gms.internal.ads.zzgmv
                    public final /* synthetic */ Object zza() {
                        return sharedPreferences.getString("flag_configuration", "{}");
                    }
                }));
            } catch (JSONException unused) {
            }
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            zzg(sharedPreferences);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00a9 A[Catch: all -> 0x0058, TRY_ENTER, TryCatch #0 {all -> 0x0058, blocks: (B:22:0x0046, B:25:0x0050, B:31:0x005d, B:34:0x0068, B:35:0x0070, B:37:0x0076, B:39:0x0086, B:41:0x009b, B:46:0x00a9, B:48:0x00ad, B:50:0x00bd, B:52:0x00d2, B:55:0x00db, B:65:0x011a, B:69:0x0123, B:71:0x0130, B:73:0x013e, B:74:0x0147, B:76:0x0155, B:78:0x0159, B:79:0x015c, B:58:0x00ec, B:60:0x00fa, B:62:0x0102, B:63:0x010d), top: B:89:0x0046, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00db A[Catch: all -> 0x0058, TRY_ENTER, TryCatch #0 {all -> 0x0058, blocks: (B:22:0x0046, B:25:0x0050, B:31:0x005d, B:34:0x0068, B:35:0x0070, B:37:0x0076, B:39:0x0086, B:41:0x009b, B:46:0x00a9, B:48:0x00ad, B:50:0x00bd, B:52:0x00d2, B:55:0x00db, B:65:0x011a, B:69:0x0123, B:71:0x0130, B:73:0x013e, B:74:0x0147, B:76:0x0155, B:78:0x0159, B:79:0x015c, B:58:0x00ec, B:60:0x00fa, B:62:0x0102, B:63:0x010d), top: B:89:0x0046, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011e A[Catch: all -> 0x000f, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x000f, blocks: (B:7:0x0009, B:9:0x000d, B:13:0x0012, B:15:0x0017, B:16:0x0019, B:18:0x002b, B:19:0x002f, B:20:0x0031, B:42:0x009f, B:43:0x00a3, B:44:0x00a6, B:53:0x00d6, B:67:0x011e, B:80:0x0163, B:81:0x016a, B:83:0x016c, B:84:0x0173, B:22:0x0046, B:25:0x0050, B:31:0x005d, B:34:0x0068, B:35:0x0070, B:37:0x0076, B:39:0x0086, B:41:0x009b, B:46:0x00a9, B:48:0x00ad, B:50:0x00bd, B:52:0x00d2, B:55:0x00db, B:65:0x011a, B:69:0x0123, B:71:0x0130, B:73:0x013e, B:74:0x0147, B:76:0x0155, B:78:0x0159, B:79:0x015c, B:58:0x00ec, B:60:0x00fa, B:62:0x0102, B:63:0x010d), top: B:94:0x0009, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0123 A[Catch: all -> 0x0058, TRY_ENTER, TryCatch #0 {all -> 0x0058, blocks: (B:22:0x0046, B:25:0x0050, B:31:0x005d, B:34:0x0068, B:35:0x0070, B:37:0x0076, B:39:0x0086, B:41:0x009b, B:46:0x00a9, B:48:0x00ad, B:50:0x00bd, B:52:0x00d2, B:55:0x00db, B:65:0x011a, B:69:0x0123, B:71:0x0130, B:73:0x013e, B:74:0x0147, B:76:0x0155, B:78:0x0159, B:79:0x015c, B:58:0x00ec, B:60:0x00fa, B:62:0x0102, B:63:0x010d), top: B:89:0x0046, outer: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(android.content.Context r11) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbes.zza(android.content.Context):void");
    }

    public final boolean zzb() {
        return this.zzi;
    }

    public final boolean zzc() {
        return this.zzj;
    }

    public final Object zzd(final zzbel zzbelVar) {
        if (!this.zzc.block(5000L)) {
            synchronized (this.zzb) {
                try {
                    if (!this.zza) {
                        throw new IllegalStateException("Flags.initialize() was not called!");
                    }
                } finally {
                }
            }
        }
        if (!this.zzd || this.zze == null || this.zzj) {
            synchronized (this.zzb) {
                if (this.zzd && this.zze != null && !this.zzj) {
                }
                return zzbelVar.zzf();
            }
        }
        if (zzbelVar.zzm() != 2) {
            return (zzbelVar.zzm() == 1 && this.zzh.has(zzbelVar.zze())) ? zzbelVar.zzc(this.zzh) : zzbew.zza(new zzgmv() { // from class: com.google.android.gms.internal.ads.zzber
                @Override // com.google.android.gms.internal.ads.zzgmv
                public final /* synthetic */ Object zza() {
                    return this.zza.zzf(zzbelVar);
                }
            });
        }
        Bundle bundle = this.zzf;
        return bundle == null ? zzbelVar.zzf() : zzbelVar.zza(bundle);
    }

    public final Object zze(zzbel zzbelVar) {
        return (this.zzd || this.zza) ? zzd(zzbelVar) : zzbelVar.zzf();
    }

    public final /* synthetic */ Object zzf(zzbel zzbelVar) {
        return zzbelVar.zzd(this.zze);
    }
}
