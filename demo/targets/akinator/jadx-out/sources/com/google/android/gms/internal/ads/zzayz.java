package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzayz extends zzazr {
    private static volatile Long zzh;
    private static final Object zzi = new Object();

    public zzayz(zzayd zzaydVar, String str, String str2, zzauc zzaucVar, int i10, int i11) {
        super(zzaydVar, "b8WdxwEW5LYMXGC6g6q07uNIFUV3fs77AEo1YVb/4q/M8KyV69so1cxJ+MsKyWwh", "kazSW9iygMpHEkKh5zVqXBXYRU+noi3Tzu4hpFfxZG4=", zzaucVar, i10, 22);
    }

    @Override // com.google.android.gms.internal.ads.zzazr
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (zzh == null) {
            synchronized (zzi) {
                try {
                    if (zzh == null) {
                        zzh = (Long) this.zze.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        zzauc zzaucVar = this.zzd;
        synchronized (zzaucVar) {
            zzaucVar.zzm(zzh.longValue());
        }
    }
}
