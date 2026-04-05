package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class zzacb extends zzaca implements zzadm {
    public zzacb(zzacc zzaccVar) {
        super(zzaccVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzaca
    public final void zzH() {
        super.zzH();
        if (((zzacc) this.zza).zza != zzabv.zze()) {
            zzacc zzaccVar = (zzacc) this.zza;
            zzaccVar.zza = zzaccVar.zza.clone();
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzaca, com.google.android.gms.internal.gtm.zzadk
    /* renamed from: zzJ, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final zzacc zzE() {
        if (!((zzacc) this.zza).zzar()) {
            return (zzacc) this.zza;
        }
        ((zzacc) this.zza).zza.zzi();
        return (zzacc) super.zzE();
    }
}
