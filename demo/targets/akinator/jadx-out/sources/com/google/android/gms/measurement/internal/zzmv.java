package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzmv implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzr zzd;
    final /* synthetic */ zznl zze;

    public zzmv(zznl zznlVar, AtomicReference atomicReference, String str, String str2, String str3, zzr zzrVar) {
        this.zza = atomicReference;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = zzrVar;
        Objects.requireNonNull(zznlVar);
        this.zze = zznlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        zznl zznlVar;
        zzgb zzgbVarZzZ;
        AtomicReference atomicReference2 = this.zza;
        synchronized (atomicReference2) {
            try {
                try {
                    zznlVar = this.zze;
                    zzgbVarZzZ = zznlVar.zzZ();
                } catch (RemoteException e10) {
                    this.zze.zzu.zzaV().zzb().zzd("(legacy) Failed to get conditional properties; remote exception", null, this.zzb, e10);
                    this.zza.set(Collections.EMPTY_LIST);
                    atomicReference = this.zza;
                }
                if (zzgbVarZzZ == null) {
                    zznlVar.zzu.zzaV().zzb().zzd("(legacy) Failed to get conditional properties; not connected to service", null, this.zzb, this.zzc);
                    atomicReference2.set(Collections.EMPTY_LIST);
                    atomicReference2.notify();
                    return;
                }
                if (TextUtils.isEmpty(null)) {
                    zzr zzrVar = this.zzd;
                    Preconditions.checkNotNull(zzrVar);
                    atomicReference2.set(zzgbVarZzZ.zzr(this.zzb, this.zzc, zzrVar));
                } else {
                    atomicReference2.set(zzgbVarZzZ.zzs(null, this.zzb, this.zzc));
                }
                zznlVar.zzV();
                atomicReference = this.zza;
                atomicReference.notify();
            } catch (Throwable th2) {
                this.zza.notify();
                throw th2;
            }
        }
    }
}
