package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzazk extends zzazr {
    public zzazk(zzayd zzaydVar, String str, String str2, zzauc zzaucVar, int i10, int i11) {
        super(zzaydVar, "cOth2BAAthu6X8KDmzC58653OwqftcurhEiV9l+3uxMh7KBnOgbdhGM0zSnSPufi", "2EDSTVCwfkpT+1duJ+umEyNIZ3jEP0NWyK78oeLPLhI=", zzaucVar, i10, 51);
    }

    @Override // com.google.android.gms.internal.ads.zzazr
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        zzauc zzaucVar = this.zzd;
        synchronized (zzaucVar) {
            zzaxy zzaxyVar = new zzaxy((String) this.zze.invoke(null, null));
            zzaucVar.zzF(zzaxyVar.zza.longValue());
            zzaucVar.zzG(zzaxyVar.zzb.longValue());
        }
    }
}
