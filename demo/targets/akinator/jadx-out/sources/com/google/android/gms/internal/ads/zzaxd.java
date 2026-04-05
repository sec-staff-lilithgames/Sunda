package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzaxd {
    private final n1 zza;

    public zzaxd(final Context context, Executor executor) {
        this.zza = zzgui.zzd(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzaxc
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                Context context2 = context;
                try {
                    return zzfrz.zza(context2, context2.getPackageName(), Integer.toString(context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode));
                } catch (Throwable unused) {
                    return null;
                }
            }
        }, executor);
    }

    public final n1 zza() {
        return this.zza;
    }
}
