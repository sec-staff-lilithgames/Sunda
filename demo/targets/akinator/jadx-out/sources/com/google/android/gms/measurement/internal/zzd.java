package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.play_billing.a;
import java.util.Iterator;
import java.util.Map;
import z.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzd extends zzf {
    private final Map zza;
    private final Map zzb;
    private long zzc;

    public zzd(zzic zzicVar) {
        super(zzicVar);
        this.zzb = new f();
        this.zza = new f();
    }

    private final void zzh(long j10, zzlu zzluVar) {
        if (zzluVar == null) {
            this.zzu.zzaV().zzk().zza("Not logging ad exposure. No active activity");
            return;
        }
        if (j10 < 1000) {
            this.zzu.zzaV().zzk().zzb("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j10);
        zzpp.zzav(zzluVar, bundle, true);
        this.zzu.zzj().zzF("am", "_xa", bundle);
    }

    private final void zzi(String str, long j10, zzlu zzluVar) {
        if (zzluVar == null) {
            this.zzu.zzaV().zzk().zza("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j10 < 1000) {
            this.zzu.zzaV().zzk().zzb("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j10);
        zzpp.zzav(zzluVar, bundle, true);
        this.zzu.zzj().zzF("am", "_xu", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzj, reason: merged with bridge method [inline-methods] */
    public final void zzf(long j10) {
        Map map = this.zza;
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            map.put((String) it.next(), Long.valueOf(j10));
        }
        if (map.isEmpty()) {
            return;
        }
        this.zzc = j10;
    }

    public final void zza(String str, long j10) throws IllegalStateException {
        if (str == null || str.length() == 0) {
            a.r(this.zzu, "Ad unit id must be a non-empty string");
        } else {
            this.zzu.zzaW().zzj(new zza(this, str, j10));
        }
    }

    public final void zzb(String str, long j10) throws IllegalStateException {
        if (str == null || str.length() == 0) {
            a.r(this.zzu, "Ad unit id must be a non-empty string");
        } else {
            this.zzu.zzaW().zzj(new zzb(this, str, j10));
        }
    }

    public final void zzc(long j10) {
        zzlu zzluVarZzh = this.zzu.zzs().zzh(false);
        Map map = this.zza;
        for (String str : map.keySet()) {
            zzi(str, j10 - ((Long) map.get(str)).longValue(), zzluVarZzh);
        }
        if (!map.isEmpty()) {
            zzh(j10 - this.zzc, zzluVarZzh);
        }
        zzf(j10);
    }

    public final /* synthetic */ void zzd(String str, long j10) {
        zzg();
        Preconditions.checkNotEmpty(str);
        Map map = this.zzb;
        if (map.isEmpty()) {
            this.zzc = j10;
        }
        Integer num = (Integer) map.get(str);
        if (num != null) {
            map.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (map.size() >= 100) {
            a.C(this.zzu, "Too many ads visible");
        } else {
            map.put(str, 1);
            this.zza.put(str, Long.valueOf(j10));
        }
    }

    public final /* synthetic */ void zze(String str, long j10) {
        zzg();
        Preconditions.checkNotEmpty(str);
        Map map = this.zzb;
        Integer num = (Integer) map.get(str);
        if (num == null) {
            this.zzu.zzaV().zzb().zzb("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        zzlu zzluVarZzh = this.zzu.zzs().zzh(false);
        int iIntValue = num.intValue() - 1;
        if (iIntValue != 0) {
            map.put(str, Integer.valueOf(iIntValue));
            return;
        }
        map.remove(str);
        Map map2 = this.zza;
        Long l9 = (Long) map2.get(str);
        if (l9 == null) {
            a.r(this.zzu, "First ad unit exposure time was never set");
        } else {
            long jLongValue = j10 - l9.longValue();
            map2.remove(str);
            zzi(str, jLongValue, zzluVarZzh);
        }
        if (map.isEmpty()) {
            long j11 = this.zzc;
            if (j11 == 0) {
                a.r(this.zzu, "First ad exposure time was never set");
            } else {
                zzh(j10 - j11, zzluVarZzh);
                this.zzc = 0L;
            }
        }
    }
}
