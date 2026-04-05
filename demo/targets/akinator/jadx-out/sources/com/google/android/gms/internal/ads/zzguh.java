package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzguh {
    private final boolean zza;
    private final zzgpe zzb;

    public /* synthetic */ zzguh(boolean z10, zzgpe zzgpeVar, byte[] bArr) {
        this.zza = z10;
        this.zzb = zzgpeVar;
    }

    public final n1 zza(Callable callable, Executor executor) {
        return new zzgtw(this.zzb, this.zza, executor, callable);
    }
}
