package com.google.android.gms.internal.ads;

import com.ironsource.C3191e4;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgvh extends zzgtz implements RunnableFuture {
    private volatile zzgup zza;

    public zzgvh(zzgtp zzgtpVar) {
        this.zza = new zzgvf(this, zzgtpVar);
    }

    public static zzgvh zze(Runnable runnable, Object obj) {
        return new zzgvh(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzgup zzgupVar = this.zza;
        if (zzgupVar != null) {
            zzgupVar.run();
        }
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgtb
    public final void zzc() {
        zzgup zzgupVar;
        if (zzj() && (zzgupVar = this.zza) != null) {
            zzgupVar.zzh();
        }
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgtb
    public final String zzd() {
        zzgup zzgupVar = this.zza;
        if (zzgupVar == null) {
            return super.zzd();
        }
        String string = zzgupVar.toString();
        return a.b.o(new StringBuilder(string.length() + 7), "task=[", string, C3191e4.i.f36531e);
    }

    public zzgvh(Callable callable) {
        this.zza = new zzgvg(this, callable);
    }
}
