package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzajk implements zzaed {
    final /* synthetic */ zzajl zza;

    public /* synthetic */ zzajk(zzajl zzajlVar, byte[] bArr) {
        Objects.requireNonNull(zzajlVar);
        this.zza = zzajlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaed
    public final long zza() {
        zzajl zzajlVar = this.zza;
        return zzajlVar.zzf().zzh(zzajlVar.zzg());
    }

    @Override // com.google.android.gms.internal.ads.zzaed
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaed
    public final zzaeb zzc(long j10) {
        zzajl zzajlVar = this.zza;
        long jZzd = zzajlVar.zzd() + BigInteger.valueOf(zzajlVar.zzf().zzi(j10)).multiply(BigInteger.valueOf(zzajlVar.zze() - zzajlVar.zzd())).divide(BigInteger.valueOf(zzajlVar.zzg())).longValue();
        String str = zzep.zza;
        zzaee zzaeeVar = new zzaee(j10, Math.max(zzajlVar.zzd(), Math.min(jZzd - 30000, zzajlVar.zze() - 1)));
        return new zzaeb(zzaeeVar, zzaeeVar);
    }
}
