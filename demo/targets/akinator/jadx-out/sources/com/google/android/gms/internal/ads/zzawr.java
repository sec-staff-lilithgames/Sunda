package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzawr implements Runnable {
    final /* synthetic */ zzaws zza;

    public zzawr(zzaws zzawsVar) {
        Objects.requireNonNull(zzawsVar);
        this.zza = zzawsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzaws zzawsVar = this.zza;
        synchronized (zzawsVar.zzp()) {
            if (zzawsVar.zzq()) {
                return;
            }
            zzawsVar.zzr(true);
            try {
                zzawsVar.zzn();
            } catch (Exception e10) {
                this.zza.zzo().zzc(2023, -1L, e10);
            }
            zzaws zzawsVar2 = this.zza;
            synchronized (zzawsVar2.zzp()) {
                zzawsVar2.zzr(false);
            }
        }
    }
}
