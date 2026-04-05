package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzhwd {
    private static final zzhwd zzd = new zzhwd(true);
    final zzhyy zza = new zzhyu();
    boolean zzb;
    boolean zzc;

    private zzhwd() {
    }

    public static zzhwd zza() {
        return zzd;
    }

    public static void zzf(zzhvt zzhvtVar, zzhzp zzhzpVar, int i10, Object obj) throws IOException {
        if (zzhzpVar == zzhzp.zzj) {
            zzhvtVar.zzJ(i10, 3);
            ((zzhxz) obj).zzdc(zzhvtVar);
            zzhvtVar.zzJ(i10, 4);
            return;
        }
        zzhvtVar.zzJ(i10, zzhzpVar.zzb());
        zzhzq zzhzqVar = zzhzq.INT;
        switch (zzhzpVar.ordinal()) {
            case 0:
                zzhvtVar.zzv(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                zzhvtVar.zzt(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                zzhvtVar.zzu(((Long) obj).longValue());
                break;
            case 3:
                zzhvtVar.zzu(((Long) obj).longValue());
                break;
            case 4:
                zzhvtVar.zzr(((Integer) obj).intValue());
                break;
            case 5:
                zzhvtVar.zzv(((Long) obj).longValue());
                break;
            case 6:
                zzhvtVar.zzt(((Integer) obj).intValue());
                break;
            case 7:
                zzhvtVar.zzq(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof zzhvi)) {
                    zzhvtVar.zzx((String) obj);
                    break;
                } else {
                    zzhvtVar.zzl((zzhvi) obj);
                    break;
                }
            case 9:
                ((zzhxz) obj).zzdc(zzhvtVar);
                break;
            case 10:
                zzhvtVar.zzp((zzhxz) obj);
                break;
            case 11:
                if (!(obj instanceof zzhvi)) {
                    byte[] bArr = (byte[]) obj;
                    zzhvtVar.zzm(bArr, 0, bArr.length);
                    break;
                } else {
                    zzhvtVar.zzl((zzhvi) obj);
                    break;
                }
            case 12:
                zzhvtVar.zzs(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof zzhws)) {
                    zzhvtVar.zzr(((Integer) obj).intValue());
                    break;
                } else {
                    zzhvtVar.zzr(((zzhws) obj).zza());
                    break;
                }
            case 14:
                zzhvtVar.zzt(((Integer) obj).intValue());
                break;
            case 15:
                zzhvtVar.zzv(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                zzhvtVar.zzs((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                zzhvtVar.zzu((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    public static int zzh(zzhzp zzhzpVar, int i10, Object obj) {
        int iZzA = zzhvt.zzA(i10 << 3);
        if (zzhzpVar == zzhzp.zzj) {
            iZzA += iZzA;
        }
        return iZzA + zzi(zzhzpVar, obj);
    }

    public static int zzi(zzhzp zzhzpVar, Object obj) {
        int iZzc;
        int iZzA;
        zzhzp zzhzpVar2 = zzhzp.zza;
        zzhzq zzhzqVar = zzhzq.INT;
        switch (zzhzpVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                int i10 = zzhvt.zzf;
                return 8;
            case 1:
                ((Float) obj).getClass();
                int i11 = zzhvt.zzf;
                return 4;
            case 2:
                return zzhvt.zzB(((Long) obj).longValue());
            case 3:
                return zzhvt.zzB(((Long) obj).longValue());
            case 4:
                return zzhvt.zzB(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                int i12 = zzhvt.zzf;
                return 8;
            case 6:
                ((Integer) obj).getClass();
                int i13 = zzhvt.zzf;
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                int i14 = zzhvt.zzf;
                return 1;
            case 8:
                if (!(obj instanceof zzhvi)) {
                    return zzhvt.zzC((String) obj);
                }
                int i15 = zzhvt.zzf;
                iZzc = ((zzhvi) obj).zzc();
                iZzA = zzhvt.zzA(iZzc);
                break;
            case 9:
                return ((zzhxz) obj).zzbr();
            case 10:
                if (!(obj instanceof zzhxi)) {
                    return zzhvt.zzD((zzhxz) obj);
                }
                iZzc = ((zzhxi) obj).zzb();
                iZzA = zzhvt.zzA(iZzc);
                break;
            case 11:
                if (!(obj instanceof zzhvi)) {
                    int i16 = zzhvt.zzf;
                    iZzc = ((byte[]) obj).length;
                    iZzA = zzhvt.zzA(iZzc);
                    break;
                } else {
                    int i17 = zzhvt.zzf;
                    iZzc = ((zzhvi) obj).zzc();
                    iZzA = zzhvt.zzA(iZzc);
                    break;
                }
            case 12:
                return zzhvt.zzA(((Integer) obj).intValue());
            case 13:
                return obj instanceof zzhws ? zzhvt.zzB(((zzhws) obj).zza()) : zzhvt.zzB(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                int i18 = zzhvt.zzf;
                return 4;
            case 15:
                ((Long) obj).getClass();
                int i19 = zzhvt.zzf;
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return zzhvt.zzA((iIntValue >> 31) ^ (iIntValue + iIntValue));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return zzhvt.zzB((jLongValue >> 63) ^ (jLongValue + jLongValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return iZzA + iZzc;
    }

    public static int zzj(zzhwc zzhwcVar, Object obj) {
        zzhzp zzhzpVarZzb = zzhwcVar.zzb();
        int iZza = zzhwcVar.zza();
        if (!zzhwcVar.zzd()) {
            return zzh(zzhzpVarZzb, iZza, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i10 = 0;
        if (!zzhwcVar.zze()) {
            int iZzh = 0;
            while (i10 < size) {
                iZzh += zzh(zzhzpVarZzb, iZza, list.get(i10));
                i10++;
            }
            return iZzh;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iZzi = 0;
        while (i10 < size) {
            iZzi += zzi(zzhzpVarZzb, list.get(i10));
            i10++;
        }
        return zzhvt.zzA(iZzi) + zzhvt.zzA(iZza << 3) + iZzi;
    }

    private static boolean zzk(Map.Entry entry) {
        zzhwc zzhwcVar = (zzhwc) entry.getKey();
        if (zzhwcVar.zzc() != zzhzq.zzi) {
            return true;
        }
        if (!zzhwcVar.zzd()) {
            return zzl(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!zzl(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzl(Object obj) {
        if (obj instanceof zzhya) {
            return ((zzhya) obj).zzbi();
        }
        if (obj instanceof zzhxi) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzm(Map.Entry entry) {
        int i10;
        int iZzA;
        int iZzD;
        zzhwc zzhwcVar = (zzhwc) entry.getKey();
        Object value = entry.getValue();
        if (zzhwcVar.zzc() != zzhzq.zzi || zzhwcVar.zzd() || zzhwcVar.zze()) {
            return zzj(zzhwcVar, value);
        }
        if (value instanceof zzhxi) {
            int iZza = ((zzhwc) entry.getKey()).zza();
            int iZzA2 = zzhvt.zzA(8);
            i10 = iZzA2 + iZzA2;
            iZzA = zzhvt.zzA(iZza) + zzhvt.zzA(16);
            int iZzA3 = zzhvt.zzA(24);
            int iZzb = ((zzhxi) value).zzb();
            iZzD = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.b(iZzb, iZzb, iZzA3);
        } else {
            int iZza2 = ((zzhwc) entry.getKey()).zza();
            int iZzA4 = zzhvt.zzA(8);
            i10 = iZzA4 + iZzA4;
            iZzA = zzhvt.zzA(iZza2) + zzhvt.zzA(16);
            iZzD = zzhvt.zzD((zzhxz) value) + zzhvt.zzA(24);
        }
        return i10 + iZzA + iZzD;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void zzn(com.google.android.gms.internal.ads.zzhwc r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.ads.zzhzp r0 = r2.zzb()
            byte[] r1 = com.google.android.gms.internal.ads.zzhxb.zzb
            r3.getClass()
            com.google.android.gms.internal.ads.zzhzp r1 = com.google.android.gms.internal.ads.zzhzp.zza
            com.google.android.gms.internal.ads.zzhzq r1 = com.google.android.gms.internal.ads.zzhzq.INT
            com.google.android.gms.internal.ads.zzhzq r0 = r0.zza()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L43;
                case 1: goto L40;
                case 2: goto L3d;
                case 3: goto L3a;
                case 4: goto L37;
                case 5: goto L34;
                case 6: goto L2b;
                case 7: goto L22;
                case 8: goto L19;
                default: goto L18;
            }
        L18:
            goto L48
        L19:
            boolean r0 = r3 instanceof com.google.android.gms.internal.ads.zzhxz
            if (r0 != 0) goto L21
            boolean r0 = r3 instanceof com.google.android.gms.internal.ads.zzhxi
            if (r0 == 0) goto L48
        L21:
            return
        L22:
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 != 0) goto L2a
            boolean r0 = r3 instanceof com.google.android.gms.internal.ads.zzhws
            if (r0 == 0) goto L48
        L2a:
            return
        L2b:
            boolean r0 = r3 instanceof com.google.android.gms.internal.ads.zzhvi
            if (r0 != 0) goto L33
            boolean r0 = r3 instanceof byte[]
            if (r0 == 0) goto L48
        L33:
            return
        L34:
            boolean r0 = r3 instanceof java.lang.String
            goto L45
        L37:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L45
        L3a:
            boolean r0 = r3 instanceof java.lang.Double
            goto L45
        L3d:
            boolean r0 = r3 instanceof java.lang.Float
            goto L45
        L40:
            boolean r0 = r3 instanceof java.lang.Long
            goto L45
        L43:
            boolean r0 = r3 instanceof java.lang.Integer
        L45:
            if (r0 == 0) goto L48
            return
        L48:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r2.zza()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.android.gms.internal.ads.zzhzp r2 = r2.zzb()
            com.google.android.gms.internal.ads.zzhzq r2 = r2.zza()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r2, r3}
            java.lang.String r3 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhwd.zzn(com.google.android.gms.internal.ads.zzhwc, java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzhwd zzhwdVar = new zzhwd();
        zzhyy zzhyyVar = this.zza;
        int iZzc = zzhyyVar.zzc();
        for (int i10 = 0; i10 < iZzc; i10++) {
            Map.Entry entryZzd = zzhyyVar.zzd(i10);
            zzhwdVar.zzd((zzhwc) ((zzhyv) entryZzd).zza(), entryZzd.getValue());
        }
        for (Map.Entry entry : zzhyyVar.zze()) {
            zzhwdVar.zzd((zzhwc) entry.getKey(), entry.getValue());
        }
        zzhwdVar.zzc = this.zzc;
        return zzhwdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzhwd) {
            return this.zza.equals(((zzhwd) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zzb() {
        if (this.zzb) {
            return;
        }
        zzhyy zzhyyVar = this.zza;
        int iZzc = zzhyyVar.zzc();
        for (int i10 = 0; i10 < iZzc; i10++) {
            Object value = zzhyyVar.zzd(i10).getValue();
            if (value instanceof zzhwo) {
                ((zzhwo) value).zzbm();
            }
        }
        Iterator it = zzhyyVar.zze().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof zzhwo) {
                ((zzhwo) value2).zzbm();
            }
        }
        zzhyyVar.zza();
        this.zzb = true;
    }

    public final Iterator zzc() {
        zzhyy zzhyyVar = this.zza;
        return zzhyyVar.isEmpty() ? Collections.emptyIterator() : this.zzc ? new zzhxh(zzhyyVar.entrySet().iterator()) : zzhyyVar.entrySet().iterator();
    }

    public final void zzd(zzhwc zzhwcVar, Object obj) {
        if (!zzhwcVar.zzd()) {
            zzn(zzhwcVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                Object obj2 = list.get(i10);
                zzn(zzhwcVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof zzhxi) {
            this.zzc = true;
        }
        this.zza.put(zzhwcVar, obj);
    }

    public final boolean zze() {
        zzhyy zzhyyVar = this.zza;
        int iZzc = zzhyyVar.zzc();
        for (int i10 = 0; i10 < iZzc; i10++) {
            if (!zzk(zzhyyVar.zzd(i10))) {
                return false;
            }
        }
        Iterator it = zzhyyVar.zze().iterator();
        while (it.hasNext()) {
            if (!zzk((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int zzg() {
        zzhyy zzhyyVar = this.zza;
        int iZzc = zzhyyVar.zzc();
        int iZzm = 0;
        for (int i10 = 0; i10 < iZzc; i10++) {
            iZzm += zzm(zzhyyVar.zzd(i10));
        }
        Iterator it = zzhyyVar.zze().iterator();
        while (it.hasNext()) {
            iZzm += zzm((Map.Entry) it.next());
        }
        return iZzm;
    }

    private zzhwd(boolean z10) {
        zzb();
        zzb();
    }
}
