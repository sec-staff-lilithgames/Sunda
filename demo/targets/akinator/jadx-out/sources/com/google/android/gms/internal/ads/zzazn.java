package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzazn extends zzazr {
    public zzazn(zzayd zzaydVar, String str, String str2, zzauc zzaucVar, int i10, int i11) {
        super(zzaydVar, "f5uC0Q5BJBhs1YfPGy7Wx7MnBjWVUX5JNaW+Lz6dfUOfz0sIXH0KubqvIhiUByWt", "klWlopX/vpRWeyQx7GUjF52wT93EUJwbeMp05ev02yc=", zzaucVar, i10, 48);
    }

    @Override // com.google.android.gms.internal.ads.zzazr
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        zzauc zzaucVar = this.zzd;
        zzaucVar.zzae(3);
        boolean zBooleanValue = ((Boolean) this.zze.invoke(null, this.zza.zzb())).booleanValue();
        synchronized (zzaucVar) {
            try {
                if (zBooleanValue) {
                    zzaucVar.zzae(2);
                } else {
                    zzaucVar.zzae(1);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
