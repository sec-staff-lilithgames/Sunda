package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzapx {
    private final AtomicInteger zza;
    private final Set zzb;
    private final PriorityBlockingQueue zzc;
    private final PriorityBlockingQueue zzd;
    private final zzape zze;
    private final zzapn zzf;
    private final zzapo[] zzg;
    private zzapg zzh;
    private final List zzi;
    private final List zzj;
    private final zzapl zzk;

    public zzapx(zzape zzapeVar, zzapn zzapnVar, int i10) {
        zzapl zzaplVar = new zzapl(new Handler(Looper.getMainLooper()));
        this.zza = new AtomicInteger();
        this.zzb = new HashSet();
        this.zzc = new PriorityBlockingQueue();
        this.zzd = new PriorityBlockingQueue();
        this.zzi = new ArrayList();
        this.zzj = new ArrayList();
        this.zze = zzapeVar;
        this.zzf = zzapnVar;
        this.zzg = new zzapo[4];
        this.zzk = zzaplVar;
    }

    public final void zza() {
        zzapg zzapgVar = this.zzh;
        if (zzapgVar != null) {
            zzapgVar.zza();
        }
        zzapo[] zzapoVarArr = this.zzg;
        for (int i10 = 0; i10 < 4; i10++) {
            zzapo zzapoVar = zzapoVarArr[i10];
            if (zzapoVar != null) {
                zzapoVar.zza();
            }
        }
        PriorityBlockingQueue priorityBlockingQueue = this.zzc;
        PriorityBlockingQueue priorityBlockingQueue2 = this.zzd;
        zzape zzapeVar = this.zze;
        zzapl zzaplVar = this.zzk;
        zzapg zzapgVar2 = new zzapg(priorityBlockingQueue, priorityBlockingQueue2, zzapeVar, zzaplVar);
        this.zzh = zzapgVar2;
        zzapgVar2.start();
        for (int i11 = 0; i11 < 4; i11++) {
            zzapo zzapoVar2 = new zzapo(priorityBlockingQueue2, this.zzf, zzapeVar, zzaplVar);
            zzapoVarArr[i11] = zzapoVar2;
            zzapoVar2.start();
        }
    }

    public final zzapu zzb(zzapu zzapuVar) {
        zzapuVar.zzf(this);
        Set set = this.zzb;
        synchronized (set) {
            set.add(zzapuVar);
        }
        zzapuVar.zzg(this.zza.incrementAndGet());
        zzapuVar.zzc("add-to-queue");
        zzd(zzapuVar, 0);
        this.zzc.add(zzapuVar);
        return zzapuVar;
    }

    public final void zzc(zzapu zzapuVar) {
        Set set = this.zzb;
        synchronized (set) {
            set.remove(zzapuVar);
        }
        List list = this.zzi;
        synchronized (list) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((zzapw) it.next()).zza();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        zzd(zzapuVar, 5);
    }

    public final void zzd(zzapu zzapuVar, int i10) {
        List list = this.zzj;
        synchronized (list) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((zzapv) it.next()).zza();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
