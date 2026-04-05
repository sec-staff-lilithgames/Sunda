package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfzl {
    private final zzifb zza;
    private final zzifb zzb;
    private final ExecutorService zzc;
    private final zzifb zzd;
    private n1 zze = null;

    public zzfzl(zzifb zzifbVar, zzifb zzifbVar2, ExecutorService executorService, zzifb zzifbVar3) {
        this.zza = zzifbVar;
        this.zzb = zzifbVar2;
        this.zzc = executorService;
        this.zzd = zzifbVar3;
    }

    public final synchronized n1 zza() {
        try {
            n1 n1Var = this.zze;
            if (n1Var != null) {
                return n1Var;
            }
            Set set = (Set) this.zzb.zzb();
            ArrayList arrayList = new ArrayList(set.size());
            Iterator it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(((zzfzj) it.next()).zza());
            }
            zzgjd zzgjdVar = (zzgjd) this.zzd.zzb();
            n1 n1VarZzk = zzgui.zzk(zzgui.zzm(arrayList), zzfzk.zza, this.zzc);
            zzgjdVar.zze(2, n1VarZzk);
            this.zze = n1VarZzk;
            Iterator it2 = ((Set) this.zza.zzb()).iterator();
            while (it2.hasNext()) {
                ((zzfzj) it2.next()).zza();
            }
            n1 n1Var2 = this.zze;
            if (n1Var2 != null) {
                return n1Var2;
            }
            throw null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized n1 zzb() {
        n1 n1Var;
        n1Var = this.zze;
        if (n1Var == null) {
            throw null;
        }
        return n1Var;
    }
}
