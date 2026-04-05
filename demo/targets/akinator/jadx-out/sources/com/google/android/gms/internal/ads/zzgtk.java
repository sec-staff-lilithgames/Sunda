package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
abstract class zzgtk extends zzgto {
    private static final zzguq zza = new zzguq(zzgtk.class);
    private zzgpa zzb;
    private final boolean zzc;
    private final boolean zzd;

    public zzgtk(zzgpa zzgpaVar, boolean z10, boolean z11) {
        super(zzgpaVar.size());
        this.zzb = zzgpaVar;
        this.zzc = z10;
        this.zzd = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzD, reason: merged with bridge method [inline-methods] */
    public final void zzy(int i10, n1 n1Var) {
        try {
            if (n1Var.isCancelled()) {
                this.zzb = null;
                cancel(false);
            } else {
                zzG(i10, n1Var);
            }
            zzz(null);
        } catch (Throwable th2) {
            zzz(null);
            throw th2;
        }
    }

    private final void zzE(Throwable th2) {
        th2.getClass();
        if (this.zzc && !zzb(th2) && zzI(zzB(), th2)) {
            zzF(th2);
        } else if (th2 instanceof Error) {
            zzF(th2);
        }
    }

    private static void zzF(Throwable th2) {
        zza.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th2 instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th2);
    }

    private final void zzG(int i10, Future future) {
        try {
            zzw(i10, zzgvj.zza(future));
        } catch (ExecutionException e10) {
            zzE(e10.getCause());
        } catch (Throwable th2) {
            zzE(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzH, reason: merged with bridge method [inline-methods] */
    public final void zzz(zzgpa zzgpaVar) {
        int iZzC = zzC();
        int i10 = 0;
        zzgmd.zzi(iZzC >= 0, "Less than 0 remaining futures");
        if (iZzC == 0) {
            if (zzgpaVar != null) {
                zzgrs it = zzgpaVar.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        zzG(i10, future);
                    }
                    i10++;
                }
            }
            this.seenExceptionsField = null;
            zzx();
            zzA(2);
        }
    }

    private static boolean zzI(Set set, Throwable th2) {
        while (th2 != null) {
            if (!set.add(th2)) {
                return false;
            }
            th2 = th2.getCause();
        }
        return true;
    }

    public void zzA(int i10) {
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgtb
    public final void zzc() {
        zzgpa zzgpaVar = this.zzb;
        zzA(1);
        if ((zzgpaVar != null) && isCancelled()) {
            boolean zZzj = zzj();
            zzgrs it = zzgpaVar.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zZzj);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgtb
    public final String zzd() {
        zzgpa zzgpaVar = this.zzb;
        return zzgpaVar != null ? "futures=".concat(zzgpaVar.toString()) : super.zzd();
    }

    public final void zze() {
        Objects.requireNonNull(this.zzb);
        if (this.zzb.isEmpty()) {
            zzx();
            return;
        }
        if (this.zzc) {
            zzgrs it = this.zzb.iterator();
            final int i10 = 0;
            while (it.hasNext()) {
                final n1 n1Var = (n1) it.next();
                int i11 = i10 + 1;
                if (n1Var.isDone()) {
                    zzy(i10, n1Var);
                } else {
                    n1Var.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgtj
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzy(i10, n1Var);
                        }
                    }, zzgtx.INSTANCE);
                }
                i10 = i11;
            }
            return;
        }
        zzgpa zzgpaVar = this.zzb;
        final zzgpa zzgpaVar2 = true != this.zzd ? null : zzgpaVar;
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzgti
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzz(zzgpaVar2);
            }
        };
        zzgrs it2 = zzgpaVar.iterator();
        while (it2.hasNext()) {
            n1 n1Var2 = (n1) it2.next();
            if (n1Var2.isDone()) {
                zzz(zzgpaVar2);
            } else {
                n1Var2.addListener(runnable, zzgtx.INSTANCE);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgto
    public final void zzf(Set set) {
        set.getClass();
        if (isCancelled()) {
            return;
        }
        Throwable thZzl = zzl();
        Objects.requireNonNull(thZzl);
        zzI(set, thZzl);
    }

    public abstract void zzw(int i10, Object obj);

    public abstract void zzx();
}
