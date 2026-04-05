package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzemy implements zzehk {
    private final zzbfp zza;
    private final zzgus zzb;
    private final zzfks zzc;
    private final zzenh zzd;

    public zzemy(zzfks zzfksVar, zzgus zzgusVar, zzbfp zzbfpVar, zzenh zzenhVar) {
        this.zzc = zzfksVar;
        this.zzb = zzgusVar;
        this.zza = zzbfpVar;
        this.zzd = zzenhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehk
    public final boolean zza(zzfgf zzfgfVar, zzffu zzffuVar) {
        zzffz zzffzVar;
        return (this.zza == null || (zzffzVar = zzffuVar.zzs) == null || zzffzVar.zza == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzehk
    public final n1 zzb(zzfgf zzfgfVar, zzffu zzffuVar) {
        zzcca zzccaVar = new zzcca();
        zzend zzendVar = new zzend();
        zzendVar.zzd(new zzemw(this, zzccaVar, zzfgfVar, zzffuVar, zzendVar));
        zzffz zzffzVar = zzffuVar.zzs;
        final zzbfk zzbfkVar = new zzbfk(zzendVar, zzffzVar.zzb, zzffzVar.zza);
        zzfkm zzfkmVar = zzfkm.CUSTOM_RENDER_SYN;
        zzfks zzfksVar = this.zzc;
        Objects.requireNonNull(zzfksVar);
        return zzfkd.zzd(new zzfjy() { // from class: com.google.android.gms.internal.ads.zzemx
            @Override // com.google.android.gms.internal.ads.zzfjy
            public final /* synthetic */ void zza() throws RemoteException {
                this.zza.zzc(zzbfkVar);
            }
        }, this.zzb, zzfkmVar, zzfksVar).zzj(zzfkm.CUSTOM_RENDER_ACK).zze(zzccaVar).zzi();
    }

    public final /* synthetic */ void zzc(zzbfk zzbfkVar) throws RemoteException {
        this.zza.zze(zzbfkVar);
    }

    public final /* synthetic */ zzenh zzd() {
        return this.zzd;
    }
}
