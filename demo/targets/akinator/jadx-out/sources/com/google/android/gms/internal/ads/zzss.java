package com.google.android.gms.internal.ads;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzss {
    public final zzsy zza;
    public final MediaFormat zzb;
    public final zzv zzc;
    public final Surface zzd;
    public final MediaCrypto zze = null;
    public final zzsr zzf;

    private zzss(zzsy zzsyVar, MediaFormat mediaFormat, zzv zzvVar, Surface surface, MediaCrypto mediaCrypto, zzsr zzsrVar) {
        this.zza = zzsyVar;
        this.zzb = mediaFormat;
        this.zzc = zzvVar;
        this.zzd = surface;
        this.zzf = zzsrVar;
    }

    public static zzss zza(zzsy zzsyVar, MediaFormat mediaFormat, zzv zzvVar, MediaCrypto mediaCrypto, zzsr zzsrVar) {
        return new zzss(zzsyVar, mediaFormat, zzvVar, null, null, zzsrVar);
    }

    public static zzss zzb(zzsy zzsyVar, MediaFormat mediaFormat, zzv zzvVar, Surface surface, MediaCrypto mediaCrypto) {
        return new zzss(zzsyVar, mediaFormat, zzvVar, surface, null, null);
    }
}
