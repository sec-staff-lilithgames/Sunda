package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzaqh implements zzapt {
    private final Map zza = new HashMap();
    private final zzapg zzb;
    private final BlockingQueue zzc;
    private final zzapl zzd;

    public zzaqh(zzapg zzapgVar, BlockingQueue blockingQueue, zzapl zzaplVar) {
        this.zzd = zzaplVar;
        this.zzb = zzapgVar;
        this.zzc = blockingQueue;
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zza(zzapu zzapuVar, zzaqa zzaqaVar) {
        List list;
        zzapd zzapdVar = zzaqaVar.zzb;
        if (zzapdVar == null || zzapdVar.zza(System.currentTimeMillis())) {
            zzb(zzapuVar);
            return;
        }
        String strZzi = zzapuVar.zzi();
        synchronized (this) {
            list = (List) this.zza.remove(strZzi);
        }
        if (list != null) {
            if (zzaqg.zzb) {
                zzaqg.zza("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), strZzi);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.zzd.zza((zzapu) it.next(), zzaqaVar, null);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final synchronized void zzb(zzapu zzapuVar) {
        try {
            Map map = this.zza;
            String strZzi = zzapuVar.zzi();
            List list = (List) map.remove(strZzi);
            if (list == null || list.isEmpty()) {
                return;
            }
            if (zzaqg.zzb) {
                zzaqg.zza("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), strZzi);
            }
            zzapu zzapuVar2 = (zzapu) list.remove(0);
            map.put(strZzi, list);
            zzapuVar2.zzu(this);
            try {
                this.zzc.put(zzapuVar2);
            } catch (InterruptedException e10) {
                zzaqg.zzc("Couldn't add request to queue. %s", e10.toString());
                Thread.currentThread().interrupt();
                this.zzb.zza();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean zzc(zzapu zzapuVar) {
        try {
            Map map = this.zza;
            String strZzi = zzapuVar.zzi();
            if (!map.containsKey(strZzi)) {
                map.put(strZzi, null);
                zzapuVar.zzu(this);
                if (zzaqg.zzb) {
                    zzaqg.zzb("new request, sending to network %s", strZzi);
                }
                return false;
            }
            List arrayList = (List) map.get(strZzi);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            zzapuVar.zzc("waiting-for-response");
            arrayList.add(zzapuVar);
            map.put(strZzi, arrayList);
            if (zzaqg.zzb) {
                zzaqg.zzb("Request for cacheKey=%s is in flight, putting on hold.", strZzi);
            }
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
