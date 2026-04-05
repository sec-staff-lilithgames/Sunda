package com.google.android.gms.internal.gtm;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzes {
    final /* synthetic */ zzeu zza;
    private final String zzb;
    private final long zzc;

    public /* synthetic */ zzes(zzeu zzeuVar, String str, long j10, zzet zzetVar) {
        this.zza = zzeuVar;
        Preconditions.checkNotEmpty("monitoring");
        Preconditions.checkArgument(j10 > 0);
        this.zzb = "monitoring";
        this.zzc = j10;
    }

    private final long zzd() {
        return this.zza.zza.getLong(zzf(), 0L);
    }

    private final String zze() {
        return this.zzb.concat(":count");
    }

    private final String zzf() {
        return this.zzb.concat(":start");
    }

    private final void zzg() {
        long jCurrentTimeMillis = this.zza.zzC().currentTimeMillis();
        SharedPreferences.Editor editorEdit = this.zza.zza.edit();
        editorEdit.remove(zze());
        editorEdit.remove(zzb());
        editorEdit.putLong(zzf(), jCurrentTimeMillis);
        editorEdit.commit();
    }

    public final Pair zza() {
        long jZzd = zzd();
        long jAbs = jZzd == 0 ? 0L : Math.abs(jZzd - this.zza.zzC().currentTimeMillis());
        long j10 = this.zzc;
        if (jAbs >= j10) {
            if (jAbs > j10 + j10) {
                zzg();
                return null;
            }
            String string = this.zza.zza.getString(zzb(), null);
            long j11 = this.zza.zza.getLong(zze(), 0L);
            zzg();
            if (string != null && j11 > 0) {
                return new Pair(string, Long.valueOf(j11));
            }
        }
        return null;
    }

    public final String zzb() {
        return this.zzb.concat(":value");
    }

    public final void zzc(String str) {
        if (zzd() == 0) {
            zzg();
        }
        if (str == null) {
            str = "";
        }
        synchronized (this) {
            try {
                long j10 = this.zza.zza.getLong(zze(), 0L);
                if (j10 <= 0) {
                    SharedPreferences.Editor editorEdit = this.zza.zza.edit();
                    editorEdit.putString(zzb(), str);
                    editorEdit.putLong(zze(), 1L);
                    editorEdit.apply();
                    return;
                }
                long leastSignificantBits = UUID.randomUUID().getLeastSignificantBits() & Long.MAX_VALUE;
                long j11 = j10 + 1;
                long j12 = Long.MAX_VALUE / j11;
                SharedPreferences.Editor editorEdit2 = this.zza.zza.edit();
                if (leastSignificantBits < j12) {
                    editorEdit2.putString(zzb(), str);
                }
                editorEdit2.putLong(zze(), j11);
                editorEdit2.apply();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
