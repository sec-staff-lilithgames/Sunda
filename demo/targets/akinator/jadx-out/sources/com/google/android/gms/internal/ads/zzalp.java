package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzalp implements zzaki {
    private final zzeg zza = new zzeg();
    private final zzeg zzb = new zzeg();
    private final zzalo zzc;
    private Inflater zzd;

    public zzalp(List list) {
        zzalo zzaloVar = new zzalo();
        this.zzc = zzaloVar;
        zzaloVar.zza(new String((byte[]) list.get(0), StandardCharsets.UTF_8));
    }

    @Override // com.google.android.gms.internal.ads.zzaki
    public final void zza(byte[] bArr, int i10, int i11, zzakh zzakhVar, zzdg zzdgVar) {
        zzeg zzegVar = this.zza;
        zzegVar.zzb(bArr, i11 + i10);
        zzegVar.zzh(i10);
        if (this.zzd == null) {
            this.zzd = new Inflater();
        }
        zzeg zzegVar2 = this.zzb;
        if (zzep.zzM(zzegVar, zzegVar2, this.zzd)) {
            zzegVar.zzb(zzegVar2.zzi(), zzegVar2.zze());
        }
        zzalo zzaloVar = this.zzc;
        zzaloVar.zzd();
        int iZzd = zzegVar.zzd();
        zzcm zzcmVarZzc = null;
        if (iZzd >= 2 && zzegVar.zzt() == iZzd) {
            zzaloVar.zzb(zzegVar);
            zzcmVarZzc = zzaloVar.zzc(zzegVar);
        }
        zzdgVar.zza(new zzaka(zzcmVarZzc != null ? zzgpe.zzj(zzcmVarZzc) : zzgpe.zzi(), C.TIME_UNSET, 5000000L));
    }
}
