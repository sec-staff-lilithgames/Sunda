package com.google.android.gms.internal.gtm;

import android.content.SharedPreferences;
import android.text.TextUtils;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzeu extends zzbr {
    private SharedPreferences zza;
    private long zzb;
    private long zzc;
    private final zzes zzd;

    public zzeu(zzbu zzbuVar) {
        super(zzbuVar);
        this.zzc = -1L;
        zzw();
        this.zzd = new zzes(this, "monitoring", ((Long) zzeh.zzD.zzb()).longValue(), null);
    }

    public final long zza() {
        com.google.android.gms.analytics.zzr.zzh();
        zzV();
        long j10 = this.zzb;
        if (j10 != 0) {
            return j10;
        }
        long j11 = this.zza.getLong("first_run", 0L);
        if (j11 != 0) {
            this.zzb = j11;
            return j11;
        }
        long jCurrentTimeMillis = zzC().currentTimeMillis();
        SharedPreferences.Editor editorEdit = this.zza.edit();
        editorEdit.putLong("first_run", jCurrentTimeMillis);
        if (!editorEdit.commit()) {
            zzQ("Failed to commit first run time");
        }
        this.zzb = jCurrentTimeMillis;
        return jCurrentTimeMillis;
    }

    public final long zzb() {
        com.google.android.gms.analytics.zzr.zzh();
        zzV();
        long j10 = this.zzc;
        if (j10 != -1) {
            return j10;
        }
        long j11 = this.zza.getLong("last_dispatch", 0L);
        this.zzc = j11;
        return j11;
    }

    @Override // com.google.android.gms.internal.gtm.zzbr
    public final void zzd() {
        this.zza = zzo().getSharedPreferences("com.google.android.gms.analytics.prefs", 0);
    }

    public final zzes zze() {
        return this.zzd;
    }

    public final zzfb zzf() {
        return new zzfb(zzC(), zza());
    }

    public final String zzg() {
        com.google.android.gms.analytics.zzr.zzh();
        zzV();
        String string = this.zza.getString("installation_campaign", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return string;
    }

    public final void zzh(String str) {
        com.google.android.gms.analytics.zzr.zzh();
        zzV();
        SharedPreferences.Editor editorEdit = this.zza.edit();
        if (TextUtils.isEmpty(str)) {
            editorEdit.remove("installation_campaign");
        } else {
            editorEdit.putString("installation_campaign", str);
        }
        if (editorEdit.commit()) {
            return;
        }
        zzQ("Failed to commit campaign data");
    }

    public final void zzi() {
        com.google.android.gms.analytics.zzr.zzh();
        zzV();
        long jCurrentTimeMillis = zzC().currentTimeMillis();
        SharedPreferences.Editor editorEdit = this.zza.edit();
        editorEdit.putLong("last_dispatch", jCurrentTimeMillis);
        editorEdit.apply();
        this.zzc = jCurrentTimeMillis;
    }
}
