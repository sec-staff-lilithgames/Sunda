package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.ironsource.C3191e4;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzjl {
    public static final zzjl zza = new zzjl(null, null, 100);
    private final EnumMap zzb;
    private final int zzc;

    public zzjl(Boolean bool, Boolean bool2, int i10) {
        EnumMap enumMap = new EnumMap(zzjk.class);
        this.zzb = enumMap;
        enumMap.put((EnumMap) zzjk.AD_STORAGE, (zzjk) zzh(null));
        enumMap.put((EnumMap) zzjk.ANALYTICS_STORAGE, (zzjk) zzh(null));
        this.zzc = i10;
    }

    public static zzjl zza(zzji zzjiVar, zzji zzjiVar2, int i10) {
        EnumMap enumMap = new EnumMap(zzjk.class);
        enumMap.put((EnumMap) zzjk.AD_STORAGE, (zzjk) zzjiVar);
        enumMap.put((EnumMap) zzjk.ANALYTICS_STORAGE, (zzjk) zzjiVar2);
        return new zzjl(enumMap, -10);
    }

    public static String zzd(int i10) {
        return i10 != -30 ? i10 != -20 ? i10 != -10 ? i10 != 0 ? i10 != 30 ? i10 != 90 ? i10 != 100 ? NativeAdContent.ViewTag.OTHER : "UNKNOWN" : "REMOTE_CONFIG" : "1P_INIT" : "1P_API" : "MANIFEST" : "API" : "TCF";
    }

    public static zzjl zze(Bundle bundle, int i10) {
        if (bundle == null) {
            return new zzjl(null, null, i10);
        }
        EnumMap enumMap = new EnumMap(zzjk.class);
        for (zzjk zzjkVar : zzjj.STORAGE.zzb()) {
            enumMap.put((EnumMap) zzjkVar, (zzjk) zzg(bundle.getString(zzjkVar.zze)));
        }
        return new zzjl(enumMap, i10);
    }

    public static zzjl zzf(String str, int i10) {
        EnumMap enumMap = new EnumMap(zzjk.class);
        zzjk[] zzjkVarArrZza = zzjj.STORAGE.zza();
        for (int i11 = 0; i11 < zzjkVarArrZza.length; i11++) {
            String str2 = str == null ? "" : str;
            zzjk zzjkVar = zzjkVarArrZza[i11];
            int i12 = i11 + 2;
            if (i12 < str2.length()) {
                enumMap.put((EnumMap) zzjkVar, (zzjk) zzj(str2.charAt(i12)));
            } else {
                enumMap.put((EnumMap) zzjkVar, (zzjk) zzji.UNINITIALIZED);
            }
        }
        return new zzjl(enumMap, i10);
    }

    public static zzji zzg(String str) {
        return str == null ? zzji.UNINITIALIZED : str.equals("granted") ? zzji.GRANTED : str.equals("denied") ? zzji.DENIED : zzji.UNINITIALIZED;
    }

    public static zzji zzh(Boolean bool) {
        return bool == null ? zzji.UNINITIALIZED : bool.booleanValue() ? zzji.GRANTED : zzji.DENIED;
    }

    public static String zzi(zzji zzjiVar) {
        int iOrdinal = zzjiVar.ordinal();
        if (iOrdinal == 2) {
            return "denied";
        }
        if (iOrdinal != 3) {
            return null;
        }
        return "granted";
    }

    public static zzji zzj(char c10) {
        return c10 != '+' ? c10 != '0' ? c10 != '1' ? zzji.UNINITIALIZED : zzji.GRANTED : zzji.DENIED : zzji.POLICY;
    }

    public static char zzm(zzji zzjiVar) {
        if (zzjiVar == null) {
            return '-';
        }
        int iOrdinal = zzjiVar.ordinal();
        if (iOrdinal == 1) {
            return '+';
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? '-' : '1';
        }
        return '0';
    }

    public static boolean zzu(int i10, int i11) {
        int i12 = -30;
        if (i10 == -20) {
            if (i11 == -30) {
                return true;
            }
            i10 = -20;
        }
        if (i10 != -30) {
            i12 = i10;
        } else if (i11 == -20) {
            return true;
        }
        return i12 == i11 || i10 < i11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzjl)) {
            return false;
        }
        zzjl zzjlVar = (zzjl) obj;
        for (zzjk zzjkVar : zzjj.STORAGE.zzb()) {
            if (this.zzb.get(zzjkVar) != zzjlVar.zzb.get(zzjkVar)) {
                return false;
            }
        }
        return this.zzc == zzjlVar.zzc;
    }

    public final int hashCode() {
        Iterator it = this.zzb.values().iterator();
        int iHashCode = this.zzc * 17;
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + ((zzji) it.next()).hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(zzd(this.zzc));
        for (zzjk zzjkVar : zzjj.STORAGE.zzb()) {
            sb2.append(",");
            sb2.append(zzjkVar.zze);
            sb2.append(C3191e4.i.f36525b);
            zzji zzjiVar = (zzji) this.zzb.get(zzjkVar);
            if (zzjiVar == null) {
                zzjiVar = zzji.UNINITIALIZED;
            }
            sb2.append(zzjiVar);
        }
        return sb2.toString();
    }

    public final int zzb() {
        return this.zzc;
    }

    public final boolean zzc() {
        Iterator it = this.zzb.values().iterator();
        while (it.hasNext()) {
            if (((zzji) it.next()) != zzji.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String zzk() {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "G1"
            r0.<init>(r1)
            com.google.android.gms.measurement.internal.zzjj r1 = com.google.android.gms.measurement.internal.zzjj.STORAGE
            com.google.android.gms.measurement.internal.zzjk[] r1 = r1.zza()
            int r2 = r1.length
            r3 = 0
        Lf:
            if (r3 >= r2) goto L3a
            r4 = r1[r3]
            java.util.EnumMap r5 = r7.zzb
            java.lang.Object r4 = r5.get(r4)
            com.google.android.gms.measurement.internal.zzji r4 = (com.google.android.gms.measurement.internal.zzji) r4
            r5 = 45
            if (r4 == 0) goto L34
            int r4 = r4.ordinal()
            if (r4 == 0) goto L34
            r6 = 1
            if (r4 == r6) goto L32
            r6 = 2
            if (r4 == r6) goto L2f
            r6 = 3
            if (r4 == r6) goto L32
            goto L34
        L2f:
            r5 = 48
            goto L34
        L32:
            r5 = 49
        L34:
            r0.append(r5)
            int r3 = r3 + 1
            goto Lf
        L3a:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzjl.zzk():java.lang.String");
    }

    public final String zzl() {
        StringBuilder sb2 = new StringBuilder("G1");
        for (zzjk zzjkVar : zzjj.STORAGE.zza()) {
            sb2.append(zzm((zzji) this.zzb.get(zzjkVar)));
        }
        return sb2.toString();
    }

    public final Bundle zzn() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.zzb.entrySet()) {
            String strZzi = zzi((zzji) entry.getValue());
            if (strZzi != null) {
                bundle.putString(((zzjk) entry.getKey()).zze, strZzi);
            }
        }
        return bundle;
    }

    public final boolean zzo(zzjk zzjkVar) {
        return ((zzji) this.zzb.get(zzjkVar)) != zzji.DENIED;
    }

    public final zzji zzp() {
        zzji zzjiVar = (zzji) this.zzb.get(zzjk.AD_STORAGE);
        return zzjiVar == null ? zzji.UNINITIALIZED : zzjiVar;
    }

    public final zzji zzq() {
        zzji zzjiVar = (zzji) this.zzb.get(zzjk.ANALYTICS_STORAGE);
        return zzjiVar == null ? zzji.UNINITIALIZED : zzjiVar;
    }

    public final boolean zzr(zzjl zzjlVar) {
        EnumMap enumMap = this.zzb;
        for (zzjk zzjkVar : (zzjk[]) enumMap.keySet().toArray(new zzjk[0])) {
            zzji zzjiVar = (zzji) enumMap.get(zzjkVar);
            zzji zzjiVar2 = (zzji) zzjlVar.zzb.get(zzjkVar);
            zzji zzjiVar3 = zzji.DENIED;
            if (zzjiVar == zzjiVar3 && zzjiVar2 != zzjiVar3) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzjl zzs(com.google.android.gms.measurement.internal.zzjl r9) {
        /*
            r8 = this;
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<com.google.android.gms.measurement.internal.zzjk> r1 = com.google.android.gms.measurement.internal.zzjk.class
            r0.<init>(r1)
            com.google.android.gms.measurement.internal.zzjj r1 = com.google.android.gms.measurement.internal.zzjj.STORAGE
            com.google.android.gms.measurement.internal.zzjk[] r1 = r1.zzb()
            int r2 = r1.length
            r3 = 0
        Lf:
            if (r3 >= r2) goto L4a
            r4 = r1[r3]
            java.util.EnumMap r5 = r8.zzb
            java.lang.Object r5 = r5.get(r4)
            com.google.android.gms.measurement.internal.zzji r5 = (com.google.android.gms.measurement.internal.zzji) r5
            java.util.EnumMap r6 = r9.zzb
            java.lang.Object r6 = r6.get(r4)
            com.google.android.gms.measurement.internal.zzji r6 = (com.google.android.gms.measurement.internal.zzji) r6
            if (r5 != 0) goto L26
            goto L33
        L26:
            if (r6 == 0) goto L42
            com.google.android.gms.measurement.internal.zzji r7 = com.google.android.gms.measurement.internal.zzji.UNINITIALIZED
            if (r5 != r7) goto L2d
            goto L33
        L2d:
            if (r6 == r7) goto L42
            com.google.android.gms.measurement.internal.zzji r7 = com.google.android.gms.measurement.internal.zzji.POLICY
            if (r5 != r7) goto L35
        L33:
            r5 = r6
            goto L42
        L35:
            if (r6 == r7) goto L42
            com.google.android.gms.measurement.internal.zzji r7 = com.google.android.gms.measurement.internal.zzji.DENIED
            if (r5 == r7) goto L41
            if (r6 != r7) goto L3e
            goto L41
        L3e:
            com.google.android.gms.measurement.internal.zzji r5 = com.google.android.gms.measurement.internal.zzji.GRANTED
            goto L42
        L41:
            r5 = r7
        L42:
            if (r5 == 0) goto L47
            r0.put(r4, r5)
        L47:
            int r3 = r3 + 1
            goto Lf
        L4a:
            com.google.android.gms.measurement.internal.zzjl r9 = new com.google.android.gms.measurement.internal.zzjl
            r1 = 100
            r9.<init>(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzjl.zzs(com.google.android.gms.measurement.internal.zzjl):com.google.android.gms.measurement.internal.zzjl");
    }

    public final zzjl zzt(zzjl zzjlVar) {
        EnumMap enumMap = new EnumMap(zzjk.class);
        for (zzjk zzjkVar : zzjj.STORAGE.zzb()) {
            zzji zzjiVar = (zzji) this.zzb.get(zzjkVar);
            if (zzjiVar == zzji.UNINITIALIZED) {
                zzjiVar = (zzji) zzjlVar.zzb.get(zzjkVar);
            }
            if (zzjiVar != null) {
                enumMap.put((EnumMap) zzjkVar, (zzjk) zzjiVar);
            }
        }
        return new zzjl(enumMap, this.zzc);
    }

    private zzjl(EnumMap enumMap, int i10) {
        EnumMap enumMap2 = new EnumMap(zzjk.class);
        this.zzb = enumMap2;
        enumMap2.putAll(enumMap);
        this.zzc = i10;
    }
}
