package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcsy implements zzbau {
    private final zzcgy zza;
    private final Executor zzb;
    private final AtomicReference zzc = new AtomicReference();

    public zzcsy(zzcgy zzcgyVar, Executor executor) {
        this.zza = zzcgyVar;
        this.zzb = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzbau
    public final synchronized void zzdo(zzbat zzbatVar) {
        final zzcgy zzcgyVar = this.zza;
        if (zzcgyVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zznE)).booleanValue()) {
                if (zzbatVar.zzj) {
                    AtomicReference atomicReference = this.zzc;
                    Boolean bool = Boolean.TRUE;
                    if (!bool.equals(atomicReference.getAndSet(bool))) {
                        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcsx
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                zzcgyVar.onResume();
                            }
                        });
                    }
                } else {
                    AtomicReference atomicReference2 = this.zzc;
                    Boolean bool2 = Boolean.FALSE;
                    if (!bool2.equals(atomicReference2.getAndSet(bool2))) {
                        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcsw
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                zzcgyVar.onPause();
                            }
                        });
                    }
                }
            }
        }
    }
}
