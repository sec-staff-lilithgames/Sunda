package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgtb;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
abstract class zzgto extends zzgtb.zzf {
    private static final zzgtl zzbg;
    private static final zzguq zzbh = new zzguq(zzgto.class);
    volatile int remainingField;
    volatile Set<Throwable> seenExceptionsField = null;

    static {
        Throwable th2;
        zzgtl zzgtnVar;
        byte[] bArr = null;
        try {
            zzgtnVar = new zzgtm(bArr);
            th2 = null;
        } catch (Throwable th3) {
            th2 = th3;
            zzgtnVar = new zzgtn(bArr);
        }
        zzbg = zzgtnVar;
        if (th2 != null) {
            zzbh.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
    }

    public zzgto(int i10) {
        this.remainingField = i10;
    }

    public final Set zzB() {
        Set<Throwable> set = this.seenExceptionsField;
        if (set != null) {
            return set;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        zzf(setNewSetFromMap);
        zzbg.zza(this, null, setNewSetFromMap);
        Set<Throwable> set2 = this.seenExceptionsField;
        Objects.requireNonNull(set2);
        return set2;
    }

    public final int zzC() {
        return zzbg.zzb(this);
    }

    public abstract void zzf(Set set);
}
