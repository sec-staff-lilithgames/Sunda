package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzayq extends zzazr {
    private static final zzazs zzh = new zzazs();
    private final Context zzi;

    public zzayq(zzayd zzaydVar, String str, String str2, zzauc zzaucVar, int i10, int i11, Context context) {
        super(zzaydVar, "yCCrg1bENISzqqs7fgrfIgqRoB89Hc58RpoZe38mDWknXggRGBdzPAEdsprm/nAh", "ygsxUks9qSJOiPMXEo9qlLCVVsFNNRfyc6WjXaB0M8U=", zzaucVar, i10, 29);
        this.zzi = context;
    }

    @Override // com.google.android.gms.internal.ads.zzazr
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zzd.zzp("E");
        Context context = this.zzi;
        AtomicReference atomicReferenceZza = zzh.zza(context.getPackageName());
        if (atomicReferenceZza.get() == null) {
            synchronized (atomicReferenceZza) {
                try {
                    if (atomicReferenceZza.get() == null) {
                        atomicReferenceZza.set((String) this.zze.invoke(null, context));
                    }
                } finally {
                }
            }
        }
        String str = (String) atomicReferenceZza.get();
        zzauc zzaucVar = this.zzd;
        synchronized (zzaucVar) {
            zzaucVar.zzp(zzavt.zza(str.getBytes(), true));
        }
    }
}
