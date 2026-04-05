package com.google.android.gms.analytics;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzh {
    private final zzk zza;
    private final Clock zzb;
    private boolean zzc;
    private long zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private boolean zzi;
    private final Map zzj;
    private final List zzk;

    public zzh(zzh zzhVar) {
        this.zza = zzhVar.zza;
        this.zzb = zzhVar.zzb;
        this.zzd = zzhVar.zzd;
        this.zze = zzhVar.zze;
        this.zzf = zzhVar.zzf;
        this.zzg = zzhVar.zzg;
        this.zzh = zzhVar.zzh;
        this.zzk = new ArrayList(zzhVar.zzk);
        this.zzj = new HashMap(zzhVar.zzj.size());
        for (Map.Entry entry : zzhVar.zzj.entrySet()) {
            zzj zzjVarZzn = zzn((Class) entry.getKey());
            ((zzj) entry.getValue()).zzc(zzjVarZzn);
            this.zzj.put((Class) entry.getKey(), zzjVarZzn);
        }
    }

    private static zzj zzn(Class cls) {
        try {
            return (zzj) cls.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception e10) {
            if (e10 instanceof InstantiationException) {
                throw new IllegalArgumentException("dataType doesn't have default constructor", e10);
            }
            if (e10 instanceof IllegalAccessException) {
                throw new IllegalArgumentException("dataType default constructor is not accessible", e10);
            }
            if (e10 instanceof ReflectiveOperationException) {
                throw new IllegalArgumentException("Linkage exception", e10);
            }
            throw new RuntimeException(e10);
        }
    }

    public final long zza() {
        return this.zzd;
    }

    public final zzj zzb(Class cls) {
        zzj zzjVar = (zzj) this.zzj.get(cls);
        if (zzjVar != null) {
            return zzjVar;
        }
        zzj zzjVarZzn = zzn(cls);
        this.zzj.put(cls, zzjVarZzn);
        return zzjVarZzn;
    }

    public final zzj zzc(Class cls) {
        return (zzj) this.zzj.get(cls);
    }

    public final zzk zzd() {
        return this.zza;
    }

    public final Collection zze() {
        return this.zzj.values();
    }

    public final List zzf() {
        return this.zzk;
    }

    public final void zzg(zzj zzjVar) {
        Preconditions.checkNotNull(zzjVar);
        Class<?> cls = zzjVar.getClass();
        if (cls.getSuperclass() != zzj.class) {
            throw new IllegalArgumentException();
        }
        zzjVar.zzc(zzb(cls));
    }

    public final void zzh() {
        this.zzi = true;
    }

    public final void zzi() {
        this.zzf = this.zzb.elapsedRealtime();
        long j10 = this.zze;
        if (j10 != 0) {
            this.zzd = j10;
        } else {
            this.zzd = this.zzb.currentTimeMillis();
        }
        this.zzc = true;
    }

    public final void zzj(long j10) {
        this.zze = j10;
    }

    public final void zzk() {
        this.zza.zzm().zzk(this);
    }

    public final boolean zzl() {
        return this.zzi;
    }

    public final boolean zzm() {
        return this.zzc;
    }

    public zzh(zzk zzkVar, Clock clock) {
        Preconditions.checkNotNull(zzkVar);
        Preconditions.checkNotNull(clock);
        this.zza = zzkVar;
        this.zzb = clock;
        this.zzg = 1800000L;
        this.zzh = 3024000000L;
        this.zzj = new HashMap();
        this.zzk = new ArrayList();
    }
}
