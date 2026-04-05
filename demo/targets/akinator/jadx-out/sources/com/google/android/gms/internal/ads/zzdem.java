package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class zzdem {
    protected final Map zza = new HashMap();

    public zzdem(Set set) {
        zzr(set);
    }

    public final synchronized void zzp(zzdgn zzdgnVar) {
        zzq(zzdgnVar.zza, zzdgnVar.zzb);
    }

    public final synchronized void zzq(Object obj, Executor executor) {
        this.zza.put(obj, executor);
    }

    public final synchronized void zzr(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzp((zzdgn) it.next());
        }
    }

    public final synchronized void zzs(final zzdel zzdelVar) {
        for (Map.Entry entry : this.zza.entrySet()) {
            final Object key = entry.getKey();
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdek
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    try {
                        zzdelVar.zza(key);
                    } catch (Throwable th2) {
                        com.google.android.gms.ads.internal.zzt.zzh().zzh(th2, "EventEmitter.notify");
                        com.google.android.gms.ads.internal.util.zze.zzb("Event emitter exception.", th2);
                    }
                }
            });
        }
    }
}
