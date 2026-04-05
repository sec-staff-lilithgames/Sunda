package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgcq extends zzgdh {
    public zzgcq(zzauc zzaucVar, zzgcd zzgcdVar, zzgjd zzgjdVar) {
        super("dFQH+5qiD2PRdi0XHMSOoNm+a3fekCOGUzmH+eYRmk9bJvOb468Cs8O4aRQ5LdYP", "cV7R50f2/HQumOgCDB4L1ZcSwVOfPPdtbjhx11w36hE=", zzaucVar, zzgcdVar, zzgjdVar.zza(114));
    }

    @Override // com.google.android.gms.internal.ads.zzgdh
    public final void zza(Method method, zzauc zzaucVar) throws IllegalAccessException, InvocationTargetException {
        synchronized (zzaucVar) {
            zzaucVar.zza("E");
            zzaucVar.zzB(0L);
            zzaucVar.zzV("D");
        }
        Object[] objArr = (Object[]) method.invoke("", null);
        objArr.getClass();
        synchronized (zzaucVar) {
            zzaucVar.zza((String) objArr[0]);
            zzaucVar.zzB(((Long) objArr[1]).longValue());
            zzaucVar.zzV((String) objArr[2]);
        }
    }
}
