package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.unity3d.ads.beta.xyn.RnJusJ;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhf {
    final String zza;
    final /* synthetic */ zzhh zzb;
    private final String zzc;
    private final String zzd;
    private final long zze;

    private final void zzc() {
        zzhh zzhhVar = this.zzb;
        zzhhVar.zzg();
        long jCurrentTimeMillis = zzhhVar.zzu.zzaZ().currentTimeMillis();
        SharedPreferences.Editor editorEdit = zzhhVar.zzd().edit();
        editorEdit.remove(this.zzc);
        editorEdit.remove(this.zzd);
        editorEdit.putLong(this.zza, jCurrentTimeMillis);
        editorEdit.apply();
    }

    private final long zzd() {
        return this.zzb.zzd().getLong(this.zza, 0L);
    }

    public final void zza(String str, long j10) {
        zzhh zzhhVar = this.zzb;
        zzhhVar.zzg();
        if (zzd() == 0) {
            zzc();
        }
        if (str == null) {
            str = "";
        }
        SharedPreferences sharedPreferencesZzd = zzhhVar.zzd();
        String str2 = this.zzc;
        long j11 = sharedPreferencesZzd.getLong(str2, 0L);
        if (j11 <= 0) {
            SharedPreferences.Editor editorEdit = zzhhVar.zzd().edit();
            editorEdit.putString(this.zzd, str);
            editorEdit.putLong(str2, 1L);
            editorEdit.apply();
            return;
        }
        long jNextLong = zzhhVar.zzu.zzk().zzf().nextLong() & Long.MAX_VALUE;
        long j12 = j11 + 1;
        long j13 = Long.MAX_VALUE / j12;
        SharedPreferences.Editor editorEdit2 = zzhhVar.zzd().edit();
        if (jNextLong < j13) {
            editorEdit2.putString(this.zzd, str);
        }
        editorEdit2.putLong(str2, j12);
        editorEdit2.apply();
    }

    public final Pair zzb() {
        long jAbs;
        zzhh zzhhVar = this.zzb;
        zzhhVar.zzg();
        zzhhVar.zzg();
        long jZzd = zzd();
        if (jZzd == 0) {
            zzc();
            jAbs = 0;
        } else {
            jAbs = Math.abs(jZzd - zzhhVar.zzu.zzaZ().currentTimeMillis());
        }
        long j10 = this.zze;
        if (jAbs < j10) {
            return null;
        }
        if (jAbs > j10 + j10) {
            zzc();
            return null;
        }
        String string = zzhhVar.zzd().getString(this.zzd, null);
        long j11 = zzhhVar.zzd().getLong(this.zzc, 0L);
        zzc();
        return (string == null || j11 <= 0) ? zzhh.zza : new Pair(string, Long.valueOf(j11));
    }

    public /* synthetic */ zzhf(zzhh zzhhVar, String str, long j10, byte[] bArr) {
        boolean z10;
        Objects.requireNonNull(zzhhVar);
        this.zzb = zzhhVar;
        Preconditions.checkNotEmpty("health_monitor");
        if (j10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.checkArgument(z10);
        this.zza = RnJusJ.FvElCSiCjwojCM;
        this.zzc = "health_monitor:count";
        this.zzd = "health_monitor:value";
        this.zze = j10;
    }
}
