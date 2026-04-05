package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgtb;
import com.ironsource.C3191e4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgux extends zzgtb.zzf implements Runnable {
    private final Runnable zza;

    public zzgux(Runnable runnable) {
        runnable.getClass();
        this.zza = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zza.run();
        } catch (Throwable th2) {
            zzb(th2);
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgtb
    public final String zzd() {
        String string = this.zza.toString();
        return a.b.o(new StringBuilder(string.length() + 7), "task=[", string, C3191e4.i.f36531e);
    }
}
