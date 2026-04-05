package com.google.android.gms.internal.ads;

import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzqg extends Exception {
    public final int zza;
    public final boolean zzb;
    public final zzv zzc;

    public zzqg(int i10, zzv zzvVar, boolean z10) {
        super(o2.l(i10, "AudioTrack write failed: ", new StringBuilder(String.valueOf(i10).length() + 25)));
        this.zzb = z10;
        this.zza = i10;
        this.zzc = zzvVar;
    }
}
