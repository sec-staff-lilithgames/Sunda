package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzazf extends zzazr {
    public zzazf(zzayd zzaydVar, String str, String str2, zzauc zzaucVar, int i10, int i11) {
        super(zzaydVar, "8W5EiIZWvw8ca0gdEf2baMelwD0v1LgWFEv6AqIRDGIzRlZJKgzzVYcusXATxgKN", "ZXwHOojdfPkjtU4/T1kRX8Zucxdzz/LL+/XimOcPDrc=", zzaucVar, i10, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzazr
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzdr);
        bool.booleanValue();
        zzaxj zzaxjVar = new zzaxj((String) this.zze.invoke(null, this.zza.zzb(), bool));
        zzauc zzaucVar = this.zzd;
        synchronized (zzaucVar) {
            zzaucVar.zzc(zzaxjVar.zza);
            zzaucVar.zzP(zzaxjVar.zzb);
        }
    }
}
