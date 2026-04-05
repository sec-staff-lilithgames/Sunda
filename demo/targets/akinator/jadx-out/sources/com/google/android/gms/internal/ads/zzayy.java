package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzayy extends zzazr {
    private final Map zzh;
    private final View zzi;
    private final Context zzj;

    public zzayy(zzayd zzaydVar, String str, String str2, zzauc zzaucVar, int i10, int i11, Map map, View view, Context context) {
        super(zzaydVar, "ykIQv59ak7YBU+e791IU15tGonhZPUUBXST76bDGm7zXSjUSNn9qtHdf61t20THy", "l48tDWlMY/G/BSkitRUvd80RiFbNrk8nR5qlkOsZWs8=", zzaucVar, i10, 85);
        this.zzh = map;
        this.zzi = view;
        this.zzj = context;
    }

    private final long zzb(int i10) {
        Map map = this.zzh;
        Integer numValueOf = Integer.valueOf(i10);
        if (map.containsKey(numValueOf)) {
            return ((Long) map.get(numValueOf)).longValue();
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzazr
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        long[] jArr = {zzb(1), zzb(2)};
        Context contextZzb = this.zzj;
        if (contextZzb == null) {
            contextZzb = this.zza.zzb();
        }
        long[] jArr2 = (long[]) this.zze.invoke(null, jArr, contextZzb, this.zzi);
        long j10 = jArr2[0];
        Map map = this.zzh;
        map.put(1, Long.valueOf(jArr2[1]));
        long j11 = jArr2[2];
        map.put(2, Long.valueOf(jArr2[3]));
        zzauc zzaucVar = this.zzd;
        synchronized (zzaucVar) {
            zzaucVar.zzY(j10);
            zzaucVar.zzZ(j11);
        }
    }
}
