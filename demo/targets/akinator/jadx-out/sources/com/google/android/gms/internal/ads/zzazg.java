package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzazg extends zzazr {
    public zzazg(zzayd zzaydVar, String str, String str2, zzauc zzaucVar, int i10, int i11) {
        super(zzaydVar, "ExKA4wjDRRYdztAsabUEoV5NOADo4vSkAwQNa4IGw0yLC0NQlDOhDdBTfDT5YHOb", "1Gz3ZRhjJNvXJ0g284S9b/dpVAajMMfg8CE3pBcFNFA=", zzaucVar, i10, 73);
    }

    @Override // com.google.android.gms.internal.ads.zzazr
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        try {
            boolean zBooleanValue = ((Boolean) this.zze.invoke(null, this.zza.zzb())).booleanValue();
            zzauc zzaucVar = this.zzd;
            int i10 = 1;
            if (true == zBooleanValue) {
                i10 = 2;
            }
            zzaucVar.zzah(i10);
        } catch (InvocationTargetException unused) {
            this.zzd.zzah(3);
        }
    }
}
