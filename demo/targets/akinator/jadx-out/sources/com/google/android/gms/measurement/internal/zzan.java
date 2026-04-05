package com.google.android.gms.measurement.internal;

import java.util.EnumMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzan {
    private final EnumMap zza;

    public zzan() {
        this.zza = new EnumMap(zzjk.class);
    }

    public static zzan zzd(String str) {
        EnumMap enumMap = new EnumMap(zzjk.class);
        if (str.length() >= zzjk.values().length) {
            int i10 = 0;
            if (str.charAt(0) == '1') {
                zzjk[] zzjkVarArrValues = zzjk.values();
                int length = zzjkVarArrValues.length;
                int i11 = 1;
                while (i10 < length) {
                    enumMap.put((EnumMap) zzjkVarArrValues[i10], (zzjk) zzam.zza(str.charAt(i11)));
                    i10++;
                    i11++;
                }
                return new zzan(enumMap);
            }
        }
        return new zzan();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("1");
        for (zzjk zzjkVar : zzjk.values()) {
            zzam zzamVar = (zzam) this.zza.get(zzjkVar);
            if (zzamVar == null) {
                zzamVar = zzam.UNSET;
            }
            sb2.append(zzamVar.zzb());
        }
        return sb2.toString();
    }

    public final zzam zza(zzjk zzjkVar) {
        zzam zzamVar = (zzam) this.zza.get(zzjkVar);
        return zzamVar == null ? zzam.UNSET : zzamVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzb(com.google.android.gms.measurement.internal.zzjk r3, int r4) {
        /*
            r2 = this;
            com.google.android.gms.measurement.internal.zzam r0 = com.google.android.gms.measurement.internal.zzam.UNSET
            r1 = -30
            if (r4 == r1) goto L1e
            r1 = -20
            if (r4 == r1) goto L1b
            r1 = -10
            if (r4 == r1) goto L18
            if (r4 == 0) goto L1b
            r1 = 30
            if (r4 == r1) goto L15
            goto L20
        L15:
            com.google.android.gms.measurement.internal.zzam r0 = com.google.android.gms.measurement.internal.zzam.INITIALIZATION
            goto L20
        L18:
            com.google.android.gms.measurement.internal.zzam r0 = com.google.android.gms.measurement.internal.zzam.MANIFEST
            goto L20
        L1b:
            com.google.android.gms.measurement.internal.zzam r0 = com.google.android.gms.measurement.internal.zzam.API
            goto L20
        L1e:
            com.google.android.gms.measurement.internal.zzam r0 = com.google.android.gms.measurement.internal.zzam.TCF
        L20:
            java.util.EnumMap r4 = r2.zza
            r4.put(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzan.zzb(com.google.android.gms.measurement.internal.zzjk, int):void");
    }

    public final void zzc(zzjk zzjkVar, zzam zzamVar) {
        this.zza.put((EnumMap) zzjkVar, (zzjk) zzamVar);
    }

    private zzan(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(zzjk.class);
        this.zza = enumMap2;
        enumMap2.putAll(enumMap);
    }
}
