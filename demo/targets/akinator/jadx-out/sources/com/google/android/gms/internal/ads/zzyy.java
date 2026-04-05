package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzyy {
    private final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public final void zza(Handler handler, zzyz zzyzVar) {
        zzb(zzyzVar);
        this.zza.add(new zzyx(handler, zzyzVar));
    }

    public final void zzb(zzyz zzyzVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.zza;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            zzyx zzyxVar = (zzyx) it.next();
            if (zzyxVar.zzc() == zzyzVar) {
                zzyxVar.zza();
                copyOnWriteArrayList.remove(zzyxVar);
            }
        }
    }

    public final void zzc(final int i10, final long j10, final long j11) {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            final zzyx zzyxVar = (zzyx) it.next();
            if (!zzyxVar.zzd()) {
                zzyxVar.zzb().post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzyw
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzyxVar.zzc().zzX(i10, j10, j11);
                    }
                });
            }
        }
    }
}
