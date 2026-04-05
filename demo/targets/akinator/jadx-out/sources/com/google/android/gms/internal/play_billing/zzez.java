package com.google.android.gms.internal.play_billing;

import a.b;
import com.google.android.gms.internal.play_billing.zzdy;
import com.ironsource.C3191e4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzez extends zzdy.zzi implements Runnable {
    private final Runnable zzc;

    public zzez(Runnable runnable) {
        runnable.getClass();
        this.zzc = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzc.run();
        } catch (Throwable th2) {
            zzo(th2);
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzdy
    public final String zzg() {
        return b.l("task=[", this.zzc.toString(), C3191e4.i.f36531e);
    }
}
