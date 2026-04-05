package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;
import nh.l6;
import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzaa {
    private static final l6 zza = l6.of("_syn", "_err", "_el");
    private String zzb;
    private final long zzc;
    private final Map zzd;

    public zzaa(String str, long j10, Map map) {
        this.zzb = str;
        this.zzc = j10;
        HashMap map2 = new HashMap();
        this.zzd = map2;
        if (map != null) {
            map2.putAll(map);
        }
    }

    public static Object zzh(String str, Object obj, Object obj2) {
        if (zza.contains(str) && (obj2 instanceof Double)) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        if (str.startsWith("_")) {
            if (!(obj instanceof String) && obj != null) {
                return obj;
            }
        } else if (!(obj instanceof Double)) {
            if (obj instanceof Long) {
                return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
            }
            if (obj instanceof String) {
                return obj2.toString();
            }
        }
        return obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaa)) {
            return false;
        }
        zzaa zzaaVar = (zzaa) obj;
        if (this.zzc == zzaaVar.zzc && this.zzb.equals(zzaaVar.zzb)) {
            return this.zzd.equals(zzaaVar.zzd);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzb.hashCode() * 31;
        long j10 = this.zzc;
        return this.zzd.hashCode() + ((iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31);
    }

    public final String toString() {
        String str = this.zzb;
        String string = this.zzd.toString();
        int length = String.valueOf(str).length();
        long j10 = this.zzc;
        StringBuilder sb2 = new StringBuilder(length + 25 + String.valueOf(j10).length() + 9 + string.length() + 1);
        i.h(sb2, "Event{name='", str, "', timestamp=");
        sb2.append(j10);
        sb2.append(", params=");
        sb2.append(string);
        sb2.append("}");
        return sb2.toString();
    }

    public final long zza() {
        return this.zzc;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final void zzc(String str) {
        this.zzb = str;
    }

    public final void zzd(String str, Object obj) {
        if (obj == null) {
            this.zzd.remove(str);
        } else {
            Map map = this.zzd;
            map.put(str, zzh(str, map.get(str), obj));
        }
    }

    public final Object zze(String str) {
        Map map = this.zzd;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        return null;
    }

    public final Map zzf() {
        return this.zzd;
    }

    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzaa clone() {
        return new zzaa(this.zzb, this.zzc, new HashMap(this.zzd));
    }
}
