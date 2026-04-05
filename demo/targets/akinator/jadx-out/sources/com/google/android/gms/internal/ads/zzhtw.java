package com.google.android.gms.internal.ads;

import com.ironsource.C3191e4;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzhtw implements Map.Entry {
    zzhtw zza;
    zzhtw zzb;
    zzhtw zzc;
    zzhtw zzd;
    zzhtw zze;
    final Object zzf;
    final boolean zzg;
    Object zzh;
    int zzi;

    public zzhtw(boolean z10) {
        this.zzf = null;
        this.zzg = z10;
        this.zze = this;
        this.zzd = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.zzf;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.zzh;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.zzf;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.zzh;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.zzf;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.zzh;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.zzg) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.zzh;
        this.zzh = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzf);
        String strValueOf2 = String.valueOf(this.zzh);
        return a.b.o(new StringBuilder(strValueOf.length() + 1 + strValueOf2.length()), strValueOf, C3191e4.i.f36525b, strValueOf2);
    }

    public zzhtw(boolean z10, zzhtw zzhtwVar, Object obj, zzhtw zzhtwVar2, zzhtw zzhtwVar3) {
        this.zza = zzhtwVar;
        this.zzf = obj;
        this.zzg = z10;
        this.zzi = 1;
        this.zzd = zzhtwVar2;
        this.zze = zzhtwVar3;
        zzhtwVar3.zzd = this;
        zzhtwVar2.zze = this;
    }
}
