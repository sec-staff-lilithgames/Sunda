package com.google.android.gms.internal.ads;

import com.mbridge.msdk.video.dynview.error.GlX.PcrIk;
import e3.g;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhej extends zzgwj {
    private final zzhfx zza;

    public zzhej(zzhfx zzhfxVar) {
        this.zza = zzhfxVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhej)) {
            return false;
        }
        zzhfx zzhfxVar = ((zzhej) obj).zza;
        zzhfx zzhfxVar2 = this.zza;
        return zzhfxVar2.zzc().zzc().equals(zzhfxVar.zzc().zzc()) && zzhfxVar2.zzc().zza().equals(zzhfxVar.zzc().zza()) && zzhfxVar2.zzc().zzb().equals(zzhfxVar.zzc().zzb());
    }

    public final int hashCode() {
        zzhfx zzhfxVar = this.zza;
        return Objects.hash(zzhfxVar.zzc(), zzhfxVar.zzf());
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public final boolean zza() {
        return this.zza.zzc().zzc() != zzhlt.RAW;
    }

    public final zzhfx zzb() {
        return this.zza;
    }

    public final String toString() {
        zzhfx zzhfxVar = this.zza;
        String strZza = zzhfxVar.zzc().zza();
        int iOrdinal = zzhfxVar.zzc().zzc().ordinal();
        return g.l("(typeUrl=", strZza, ", outputPrefixType=", iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? PcrIk.zgPUC : "CRUNCHY" : "RAW" : "LEGACY" : "TINK", ")");
    }
}
