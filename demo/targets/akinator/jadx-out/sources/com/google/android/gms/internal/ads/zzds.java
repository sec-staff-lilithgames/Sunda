package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzds {
    private final zzdc zza;
    private final zzdm zzb;
    private final zzdo zzc;
    private final CopyOnWriteArraySet zzd;
    private final ArrayDeque zze;
    private final ArrayDeque zzf;
    private final Object zzg;
    private boolean zzh;
    private boolean zzi;

    public zzds(Looper looper, zzdc zzdcVar, zzdo zzdoVar) {
        this(new CopyOnWriteArraySet(), looper, zzdcVar, zzdoVar, true);
    }

    private final void zzh() {
        if (this.zzi) {
            zzgmd.zzh(Thread.currentThread() == this.zzb.zza().getThread());
        }
    }

    public final zzds zza(Looper looper, zzdo zzdoVar) {
        return new zzds(this.zzd, looper, this.zza, zzdoVar, this.zzi);
    }

    public final void zzb(Object obj) {
        synchronized (this.zzg) {
            try {
                if (this.zzh) {
                    return;
                }
                this.zzd.add(new zzdp(obj));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzc(Object obj) {
        zzh();
        CopyOnWriteArraySet copyOnWriteArraySet = this.zzd;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            zzdp zzdpVar = (zzdp) it.next();
            if (zzdpVar.zza.equals(obj)) {
                zzdpVar.zza(this.zzc);
                copyOnWriteArraySet.remove(zzdpVar);
            }
        }
    }

    public final void zzd(final int i10, final zzdn zzdnVar) {
        zzh();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.zzd);
        this.zzf.add(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdq
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    zzdn zzdnVar2 = zzdnVar;
                    ((zzdp) it.next()).zzb(i10, zzdnVar2);
                }
            }
        });
    }

    public final void zze() {
        zzh();
        ArrayDeque arrayDeque = this.zzf;
        if (arrayDeque.isEmpty()) {
            return;
        }
        zzdm zzdmVar = this.zzb;
        if (!zzdmVar.zzb(1)) {
            zzdmVar.zzg(zzdmVar.zzc(1));
        }
        ArrayDeque arrayDeque2 = this.zze;
        boolean zIsEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (zIsEmpty) {
            while (!arrayDeque2.isEmpty()) {
                ((Runnable) arrayDeque2.peekFirst()).run();
                arrayDeque2.removeFirst();
            }
        }
    }

    public final void zzf() {
        zzh();
        synchronized (this.zzg) {
            this.zzh = true;
        }
        CopyOnWriteArraySet copyOnWriteArraySet = this.zzd;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((zzdp) it.next()).zza(this.zzc);
        }
        copyOnWriteArraySet.clear();
    }

    public final /* synthetic */ boolean zzg(Message message) {
        Iterator it = this.zzd.iterator();
        while (it.hasNext()) {
            ((zzdp) it.next()).zzc(this.zzc);
            if (this.zzb.zzb(1)) {
                break;
            }
        }
        return true;
    }

    private zzds(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, zzdc zzdcVar, zzdo zzdoVar, boolean z10) {
        this.zza = zzdcVar;
        this.zzd = copyOnWriteArraySet;
        this.zzc = zzdoVar;
        this.zzg = new Object();
        this.zze = new ArrayDeque();
        this.zzf = new ArrayDeque();
        this.zzb = zzdcVar.zzd(looper, new Handler.Callback() { // from class: com.google.android.gms.internal.ads.zzdr
            @Override // android.os.Handler.Callback
            public final /* synthetic */ boolean handleMessage(Message message) {
                this.zza.zzg(message);
                return true;
            }
        });
        this.zzi = z10;
    }
}
