package com.google.android.gms.internal.play_billing;

import a.b;
import com.ironsource.C3191e4;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzfh extends zzee implements RunnableFuture {
    private volatile zzes zzc;

    public zzfh(Callable callable) {
        this.zzc = new zzfg(this, callable);
    }

    public static zzfh zzr(Runnable runnable, Object obj) {
        return new zzfh(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzes zzesVar = this.zzc;
        if (zzesVar != null) {
            zzesVar.run();
        }
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdy
    public final String zzg() {
        zzes zzesVar = this.zzc;
        return zzesVar != null ? b.l("task=[", zzesVar.toString(), C3191e4.i.f36531e) : super.zzg();
    }

    @Override // com.google.android.gms.internal.play_billing.zzdy
    public final void zzm() {
        zzes zzesVar;
        if (zzq() && (zzesVar = this.zzc) != null) {
            zzesVar.zze();
        }
        this.zzc = null;
    }
}
