package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhe {
    final /* synthetic */ zzhh zza;
    private final String zzb;
    private final long zzc;
    private boolean zzd;
    private long zze;

    public zzhe(zzhh zzhhVar, String str, long j10) {
        Objects.requireNonNull(zzhhVar);
        this.zza = zzhhVar;
        Preconditions.checkNotEmpty(str);
        this.zzb = str;
        this.zzc = j10;
    }

    public final long zza() {
        if (!this.zzd) {
            this.zzd = true;
            zzhh zzhhVar = this.zza;
            this.zze = zzhhVar.zzd().getLong(this.zzb, this.zzc);
        }
        return this.zze;
    }

    public final void zzb(long j10) {
        SharedPreferences.Editor editorEdit = this.zza.zzd().edit();
        editorEdit.putLong(this.zzb, j10);
        editorEdit.apply();
        this.zze = j10;
    }
}
