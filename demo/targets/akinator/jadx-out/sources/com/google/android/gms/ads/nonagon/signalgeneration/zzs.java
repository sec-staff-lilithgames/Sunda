package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzs extends LinkedHashMap {
    final /* synthetic */ zzv zza;

    public zzs(zzv zzvVar) {
        Objects.requireNonNull(zzvVar);
        this.zza = zzvVar;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        zzv zzvVar = this.zza;
        synchronized (zzvVar) {
            try {
                if (size() <= zzvVar.zzg()) {
                    return false;
                }
                zzvVar.zzh().add(new Pair((String) entry.getKey(), ((zzt) entry.getValue()).zzb));
                return size() > zzvVar.zzg();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
