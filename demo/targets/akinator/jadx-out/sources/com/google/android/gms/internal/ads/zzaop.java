package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzaop {
    public final int zza;
    public final long zzb;

    private zzaop(int i10, long j10) {
        this.zza = i10;
        this.zzb = j10;
    }

    public static zzaop zza(zzadb zzadbVar, zzeg zzegVar) throws IOException {
        zzadbVar.zzi(zzegVar.zzi(), 0, 8);
        zzegVar.zzh(0);
        return new zzaop(zzegVar.zzB(), zzegVar.zzA());
    }
}
