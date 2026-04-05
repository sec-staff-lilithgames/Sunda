package com.google.android.gms.analytics;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class zzk {
    protected final zzh zza;
    private final zzr zzb;
    private final List zzc;

    public zzk(zzr zzrVar, Clock clock) {
        Preconditions.checkNotNull(zzrVar);
        this.zzb = zzrVar;
        this.zzc = new ArrayList();
        zzh zzhVar = new zzh(this, clock);
        zzhVar.zzh();
        this.zza = zzhVar;
    }

    public void zze(zzh zzhVar) {
        throw null;
    }

    public final zzr zzm() {
        return this.zzb;
    }

    public final void zzn(zzh zzhVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            ((zzi) it.next()).zza();
        }
    }
}
