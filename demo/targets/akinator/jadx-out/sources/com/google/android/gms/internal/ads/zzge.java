package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzge {
    private Uri zza;
    private Map zzb;
    private long zzc;
    private final long zzd;
    private int zze;

    public /* synthetic */ zzge(zzgf zzgfVar, byte[] bArr) {
        this.zza = zzgfVar.zza;
        this.zzb = zzgfVar.zzd;
        this.zzc = zzgfVar.zze;
        this.zzd = zzgfVar.zzf;
        this.zze = zzgfVar.zzg;
    }

    public final zzge zza(Uri uri) {
        this.zza = uri;
        return this;
    }

    public final zzge zzb(Map map) {
        this.zzb = map;
        return this;
    }

    public final zzge zzc(long j10) {
        this.zzc = j10;
        return this;
    }

    public final zzge zzd(int i10) {
        this.zze = 6;
        return this;
    }

    public final zzgf zze() {
        zzgmd.zzk(this.zza, "The uri must be set.");
        return new zzgf(this.zza, 0L, 1, null, this.zzb, this.zzc, this.zzd, null, this.zze, null, null);
    }

    public zzge() {
        this.zzb = Collections.EMPTY_MAP;
        this.zzd = -1L;
    }
}
