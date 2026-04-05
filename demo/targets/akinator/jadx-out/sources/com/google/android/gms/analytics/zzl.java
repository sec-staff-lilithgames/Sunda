package com.google.android.gms.analytics;

import android.net.Uri;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzl implements Runnable {
    final /* synthetic */ zzh zza;
    final /* synthetic */ zzr zzb;

    public zzl(zzr zzrVar, zzh zzhVar) {
        this.zza = zzhVar;
        this.zzb = zzrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzh zzhVar = this.zza;
        zzhVar.zzd().zze(zzhVar);
        Iterator it = this.zzb.zzc.iterator();
        while (it.hasNext()) {
            ((zzs) it.next()).zza();
        }
        zzh zzhVar2 = this.zza;
        Preconditions.checkNotMainThread("deliver should be called from worker thread");
        Preconditions.checkArgument(zzhVar2.zzm(), "Measurement must be submitted");
        List<zzt> listZzf = zzhVar2.zzf();
        if (listZzf.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet();
        for (zzt zztVar : listZzf) {
            Uri uriZzb = zztVar.zzb();
            if (!hashSet.contains(uriZzb)) {
                hashSet.add(uriZzb);
                zztVar.zze(zzhVar2);
            }
        }
    }
}
