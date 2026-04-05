package com.google.android.gms.internal.ads;

import com.inmobi.commons.core.configs.AdConfig;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzajn extends zzajw {
    private zzadn zza;
    private zzajm zzb;

    private static boolean zzd(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.google.android.gms.internal.ads.zzajw
    public final void zza(boolean z10) {
        super.zza(z10);
        if (z10) {
            this.zza = null;
            this.zzb = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajw
    public final long zzb(zzeg zzegVar) {
        if (!zzd(zzegVar.zzi())) {
            return -1L;
        }
        int i10 = (zzegVar.zzi()[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 4;
        if (i10 == 6) {
            zzegVar.zzk(4);
            zzegVar.zzO();
        } else if (i10 == 7) {
            i10 = 7;
            zzegVar.zzk(4);
            zzegVar.zzO();
        }
        int iZzc = zzadi.zzc(zzegVar, i10);
        zzegVar.zzh(0);
        return iZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzajw
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean zzc(zzeg zzegVar, long j10, zzaju zzajuVar) {
        byte[] bArrZzi = zzegVar.zzi();
        zzadn zzadnVar = this.zza;
        if (zzadnVar == null) {
            zzadn zzadnVar2 = new zzadn(bArrZzi, 17);
            this.zza = zzadnVar2;
            zzt zztVarZza = zzadnVar2.zzc(Arrays.copyOfRange(bArrZzi, 9, zzegVar.zze()), null).zza();
            zztVarZza.zzl("audio/ogg");
            zzajuVar.zza = zztVarZza.zzM();
            return true;
        }
        if ((bArrZzi[0] & AbstractJsonLexerKt.TC_INVALID) == 3) {
            zzadm zzadmVarZzc = zzadk.zzc(zzegVar);
            zzadn zzadnVarZze = zzadnVar.zze(zzadmVarZzc);
            this.zza = zzadnVarZze;
            this.zzb = new zzajm(zzadnVarZze, zzadmVarZzc);
            return true;
        }
        if (!zzd(bArrZzi)) {
            return true;
        }
        zzajm zzajmVar = this.zzb;
        if (zzajmVar != null) {
            zzajmVar.zzd(j10);
            zzajuVar.zzb = this.zzb;
        }
        zzajuVar.zza.getClass();
        return false;
    }
}
