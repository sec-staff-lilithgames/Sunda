package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzays extends zzazr {
    public zzays(zzayd zzaydVar, String str, String str2, zzauc zzaucVar, int i10, int i11) {
        super(zzaydVar, "0k0HoJtCvAtrnTz0UbiSqrs0BGKzSTMoo+ZxCfyJrLcMn8tbsvf/NG2/ui2bKbWP", "z6GzXqyR8kvBYJKVLhMc9mqmsbq6ZkNeWqgTkONnpqg=", zzaucVar, i10, 5);
    }

    @Override // com.google.android.gms.internal.ads.zzazr
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        zzauc zzaucVar = this.zzd;
        zzaucVar.zzd(-1L);
        zzaucVar.zze(-1L);
        int[] iArr = (int[]) this.zze.invoke(null, this.zza.zzb());
        synchronized (zzaucVar) {
            try {
                zzaucVar.zzd(iArr[0]);
                zzaucVar.zze(iArr[1]);
                int i10 = iArr[2];
                if (i10 != Integer.MIN_VALUE) {
                    zzaucVar.zzO(i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
