package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgcs extends zzgdh {
    private final Context zza;

    public zzgcs(zzauc zzaucVar, zzgcd zzgcdVar, Context context, zzgjd zzgjdVar) {
        super("BhNDAdNbKVCXLou3UwS6SQycA6O/T9ZMbr2NWffNFtsRs3WScUuYHsaYRJ0jHvCA", "oaC5CLMjwUmi/i48MFPdrATPzdM8HcSPBi81Io4IqyU=", zzaucVar, zzgcdVar, zzgjdVar.zza(115));
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzgdh
    public final void zza(Method method, zzauc zzaucVar) throws IllegalAccessException, InvocationTargetException {
        Object[] objArr = (Object[]) method.invoke("", this.zza);
        objArr.getClass();
        synchronized (zzaucVar) {
            try {
                zzaucVar.zzO(((Integer) objArr[0]).intValue());
                int i10 = 1;
                zzaucVar.zzd(((Integer) objArr[1]).intValue());
                zzaucVar.zze(((Integer) objArr[2]).intValue());
                zzaucVar.zzab(((Integer) objArr[3]).intValue());
                Boolean bool = (Boolean) objArr[4];
                if (bool == null) {
                    zzaucVar.zzaf(3);
                } else {
                    zzaucVar.zzaf(true != bool.booleanValue() ? 1 : 2);
                }
                Boolean bool2 = (Boolean) objArr[5];
                if (bool2 == null) {
                    zzaucVar.zzae(3);
                } else {
                    if (true == bool2.booleanValue()) {
                        i10 = 2;
                    }
                    zzaucVar.zzae(i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
