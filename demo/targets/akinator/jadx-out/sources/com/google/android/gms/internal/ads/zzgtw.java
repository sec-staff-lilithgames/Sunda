package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgtw extends zzgtk {
    private zzgtv zza;

    public zzgtw(zzgpa zzgpaVar, boolean z10, Executor executor, Callable callable) {
        super(zzgpaVar, z10, false);
        this.zza = new zzgtu(this, callable, executor);
        zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgtk
    public final void zzA(int i10) {
        super.zzA(i10);
        if (i10 == 1) {
            this.zza = null;
        }
    }

    public final /* synthetic */ void zzD(zzgtv zzgtvVar) {
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgtb
    public final void zzi() {
        zzgtv zzgtvVar = this.zza;
        if (zzgtvVar != null) {
            zzgtvVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgtk
    public final void zzx() {
        zzgtv zzgtvVar = this.zza;
        if (zzgtvVar != null) {
            zzgtvVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgtk
    public final void zzw(int i10, Object obj) {
    }
}
