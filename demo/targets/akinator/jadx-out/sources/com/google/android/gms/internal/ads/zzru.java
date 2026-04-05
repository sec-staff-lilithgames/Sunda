package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzru {
    public final int zza;
    public final zzuu zzb;
    private final CopyOnWriteArrayList zzc;

    private zzru(CopyOnWriteArrayList copyOnWriteArrayList, int i10, zzuu zzuuVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zzuuVar;
    }

    public final zzru zza(int i10, zzuu zzuuVar) {
        return new zzru(this.zzc, 0, zzuuVar);
    }

    public final void zzb(Handler handler, zzrv zzrvVar) {
        this.zzc.add(new zzrt(handler, zzrvVar));
    }

    public final void zzc(zzrv zzrvVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.zzc;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            zzrt zzrtVar = (zzrt) it.next();
            if (zzrtVar.zza == zzrvVar) {
                copyOnWriteArrayList.remove(zzrtVar);
            }
        }
    }

    public zzru() {
        this(new CopyOnWriteArrayList(), 0, null);
    }
}
