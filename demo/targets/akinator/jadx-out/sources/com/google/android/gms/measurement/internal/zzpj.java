package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzpj {
    private final long zza;
    private final com.google.android.gms.internal.measurement.zzib zzb;
    private final String zzc;
    private final Map zzd;
    private final zzls zze;
    private final long zzf;
    private final long zzg;
    private final long zzh;
    private final int zzi;

    public /* synthetic */ zzpj(long j10, com.google.android.gms.internal.measurement.zzib zzibVar, String str, Map map, zzls zzlsVar, long j11, long j12, long j13, int i10, byte[] bArr) {
        this.zza = j10;
        this.zzb = zzibVar;
        this.zzc = str;
        this.zzd = map;
        this.zze = zzlsVar;
        this.zzf = j11;
        this.zzg = j12;
        this.zzh = j13;
        this.zzi = i10;
    }

    public final zzot zza() {
        return new zzot(this.zzc, this.zzd, this.zze, null);
    }

    public final zzom zzb() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.zzd.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        long j10 = this.zza;
        com.google.android.gms.internal.measurement.zzib zzibVar = this.zzb;
        String str = this.zzc;
        zzls zzlsVar = this.zze;
        return new zzom(j10, zzibVar.zzcc(), str, bundle, zzlsVar.zza(), this.zzg, "");
    }

    public final long zzc() {
        return this.zza;
    }

    public final com.google.android.gms.internal.measurement.zzib zzd() {
        return this.zzb;
    }

    public final String zze() {
        return this.zzc;
    }

    public final zzls zzf() {
        return this.zze;
    }

    public final long zzg() {
        return this.zzf;
    }

    public final long zzh() {
        return this.zzh;
    }

    public final int zzi() {
        return this.zzi;
    }
}
