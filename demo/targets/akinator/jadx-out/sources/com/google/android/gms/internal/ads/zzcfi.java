package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcfi extends zzcfe {
    public zzcfi(zzcdr zzcdrVar) {
        super(zzcdrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final boolean zze(String str) {
        String strZzf = com.google.android.gms.ads.internal.util.client.zzf.zzf(str);
        zzcdr zzcdrVar = (zzcdr) this.zzc.get();
        if (zzcdrVar != null && strZzf != null) {
            zzcdrVar.zzt(strZzf, this);
        }
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("VideoStreamNoopCache is doing nothing.");
        zzq(str, strZzf, "noop", "Noop cache is a noop.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzl() {
    }
}
