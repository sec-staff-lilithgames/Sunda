package com.google.android.gms.internal.ads;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfhm {
    private final Deque zza = new LinkedBlockingDeque();
    private final Callable zzb;
    private final zzgus zzc;

    public zzfhm(Callable callable, zzgus zzgusVar) {
        this.zzb = callable;
        this.zzc = zzgusVar;
    }

    public final synchronized void zza(int i10) {
        Deque deque = this.zza;
        int size = i10 - deque.size();
        for (int i11 = 0; i11 < size; i11++) {
            deque.add(this.zzc.submit(this.zzb));
        }
    }

    public final synchronized n1 zzb() {
        zza(1);
        return (n1) this.zza.poll();
    }

    public final synchronized void zzc(n1 n1Var) {
        this.zza.addFirst(n1Var);
    }
}
