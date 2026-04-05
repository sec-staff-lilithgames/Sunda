package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfxf {
    public static n1 zza(Task task, CancellationTokenSource cancellationTokenSource) {
        final zzfxd zzfxdVar = new zzfxd(task, null);
        task.addOnCompleteListener(zzguz.zza(), new OnCompleteListener() { // from class: com.google.android.gms.internal.ads.zzfxe
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final /* synthetic */ void onComplete(Task task2) {
                zzfxd zzfxdVar2 = zzfxdVar;
                if (task2.isCanceled()) {
                    zzfxdVar2.cancel(false);
                    return;
                }
                if (task2.isSuccessful()) {
                    zzfxdVar2.zza(task2.getResult());
                    return;
                }
                Exception exception = task2.getException();
                if (exception == null) {
                    throw new IllegalStateException();
                }
                zzfxdVar2.zzb(exception);
            }
        });
        return zzfxdVar;
    }
}
