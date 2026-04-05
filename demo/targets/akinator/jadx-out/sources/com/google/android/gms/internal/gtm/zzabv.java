package com.google.android.gms.internal.gtm;

import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzabv {
    private static final zzabv zzb = new zzabv(true);
    final zzaef zza = new zzaea();
    private boolean zzc;
    private boolean zzd;

    private zzabv() {
    }

    public static int zza(zzaex zzaexVar, int i10, Object obj) {
        int iZzd;
        int iZzC;
        int iZzC2 = zzzi.zzC(i10 << 3);
        if (zzaexVar == zzaex.zzj) {
            byte[] bArr = zzaco.zzb;
            if (((zzadl) obj) instanceof zzyi) {
                throw null;
            }
            iZzC2 += iZzC2;
        }
        zzaey zzaeyVar = zzaey.INT;
        int iZzD = 4;
        switch (zzaexVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                iZzD = 8;
                return iZzC2 + iZzD;
            case 1:
                ((Float) obj).getClass();
                return iZzC2 + iZzD;
            case 2:
                iZzD = zzzi.zzD(((Long) obj).longValue());
                return iZzC2 + iZzD;
            case 3:
                iZzD = zzzi.zzD(((Long) obj).longValue());
                return iZzC2 + iZzD;
            case 4:
                iZzD = zzzi.zzD(((Integer) obj).intValue());
                return iZzC2 + iZzD;
            case 5:
                ((Long) obj).getClass();
                iZzD = 8;
                return iZzC2 + iZzD;
            case 6:
                ((Integer) obj).getClass();
                return iZzC2 + iZzD;
            case 7:
                ((Boolean) obj).getClass();
                iZzD = 1;
                return iZzC2 + iZzD;
            case 8:
                if (!(obj instanceof zzyx)) {
                    iZzD = zzzi.zzB((String) obj);
                    return iZzC2 + iZzD;
                }
                iZzd = ((zzyx) obj).zzd();
                iZzC = zzzi.zzC(iZzd);
                iZzD = iZzC + iZzd;
                return iZzC2 + iZzD;
            case 9:
                iZzD = ((zzadl) obj).zzY();
                return iZzC2 + iZzD;
            case 10:
                if (!(obj instanceof zzacv)) {
                    iZzD = zzzi.zzz((zzadl) obj);
                    return iZzC2 + iZzD;
                }
                iZzd = ((zzacv) obj).zza();
                iZzC = zzzi.zzC(iZzd);
                iZzD = iZzC + iZzd;
                return iZzC2 + iZzD;
            case 11:
                if (obj instanceof zzyx) {
                    iZzd = ((zzyx) obj).zzd();
                    iZzC = zzzi.zzC(iZzd);
                } else {
                    iZzd = ((byte[]) obj).length;
                    iZzC = zzzi.zzC(iZzd);
                }
                iZzD = iZzC + iZzd;
                return iZzC2 + iZzD;
            case 12:
                iZzD = zzzi.zzC(((Integer) obj).intValue());
                return iZzC2 + iZzD;
            case 13:
                iZzD = obj instanceof zzach ? zzzi.zzD(((zzach) obj).zza()) : zzzi.zzD(((Integer) obj).intValue());
                return iZzC2 + iZzD;
            case 14:
                ((Integer) obj).getClass();
                return iZzC2 + iZzD;
            case 15:
                ((Long) obj).getClass();
                iZzD = 8;
                return iZzC2 + iZzD;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                iZzD = zzzi.zzC((iIntValue >> 31) ^ (iIntValue + iIntValue));
                return iZzC2 + iZzD;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                iZzD = zzzi.zzD((jLongValue >> 63) ^ (jLongValue + jLongValue));
                return iZzC2 + iZzD;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int zzb(zzabu zzabuVar, Object obj) {
        zzaex zzaexVarZzd = zzabuVar.zzd();
        int iZza = zzabuVar.zza();
        if (!zzabuVar.zzg()) {
            return zza(zzaexVarZzd, iZza, obj);
        }
        List list = (List) obj;
        int size = list.size();
        zzabuVar.zzf();
        int iZza2 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iZza2 += zza(zzaexVarZzd, iZza, list.get(i10));
        }
        return iZza2;
    }

    public static zzabv zze() {
        return zzb;
    }

    private static Object zzn(Object obj) {
        if (obj instanceof zzadq) {
            return ((zzadq) obj).zzc();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private final void zzo(Map.Entry entry) {
        zzabu zzabuVar = (zzabu) entry.getKey();
        Object value = entry.getValue();
        boolean z10 = value instanceof zzacv;
        if (zzabuVar.zzg()) {
            if (z10) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
            Object objZzf = zzf(zzabuVar);
            List list = (List) value;
            int size = list.size();
            if (objZzf == null) {
                objZzf = new ArrayList(size);
            }
            List list2 = (List) objZzf;
            for (int i10 = 0; i10 < size; i10++) {
                list2.add(zzn(list.get(i10)));
            }
            this.zza.put(zzabuVar, objZzf);
            return;
        }
        if (zzabuVar.zze() != zzaey.MESSAGE) {
            if (z10) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.zza.put(zzabuVar, zzn(value));
            return;
        }
        Object objZzf2 = zzf(zzabuVar);
        if (objZzf2 != null) {
            if (z10) {
                throw null;
            }
            this.zza.put(zzabuVar, objZzf2 instanceof zzadq ? zzabuVar.zzc((zzadq) objZzf2, (zzadq) value) : zzabuVar.zzb(((zzadl) objZzf2).zzaw(), (zzadl) value).zzD());
        } else {
            this.zza.put(zzabuVar, zzn(value));
            if (z10) {
                this.zzd = true;
            }
        }
    }

    private static boolean zzp(Map.Entry entry) {
        zzabu zzabuVar = (zzabu) entry.getKey();
        if (zzabuVar.zze() != zzaey.MESSAGE) {
            return true;
        }
        if (!zzabuVar.zzg()) {
            return zzq(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!zzq(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzq(Object obj) {
        if (obj instanceof zzadm) {
            return ((zzadm) obj).zzaz();
        }
        if (obj instanceof zzacv) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzr(Map.Entry entry) {
        int i10;
        int iZzC;
        int iZzz;
        zzabu zzabuVar = (zzabu) entry.getKey();
        Object value = entry.getValue();
        if (zzabuVar.zze() != zzaey.MESSAGE || zzabuVar.zzg()) {
            return zzb(zzabuVar, value);
        }
        zzabuVar.zzf();
        if (value instanceof zzacv) {
            int iZza = ((zzabu) entry.getKey()).zza();
            int iZzC2 = zzzi.zzC(8);
            i10 = iZzC2 + iZzC2;
            iZzC = zzzi.zzC(iZza) + zzzi.zzC(16);
            int iZzC3 = zzzi.zzC(24);
            int iZza2 = ((zzacv) value).zza();
            iZzz = a.B(iZza2, iZza2, iZzC3);
        } else {
            int iZza3 = ((zzabu) entry.getKey()).zza();
            int iZzC4 = zzzi.zzC(8);
            i10 = iZzC4 + iZzC4;
            iZzC = zzzi.zzC(iZza3) + zzzi.zzC(16);
            iZzz = zzzi.zzz((zzadl) value) + zzzi.zzC(24);
        }
        return i10 + iZzC + iZzz;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void zzs(com.google.android.gms.internal.gtm.zzabu r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.gtm.zzaex r0 = r2.zzd()
            byte[] r1 = com.google.android.gms.internal.gtm.zzaco.zzb
            r3.getClass()
            com.google.android.gms.internal.gtm.zzaex r1 = com.google.android.gms.internal.gtm.zzaex.zza
            com.google.android.gms.internal.gtm.zzaey r1 = com.google.android.gms.internal.gtm.zzaey.INT
            com.google.android.gms.internal.gtm.zzaey r0 = r0.zza()
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
            boolean r0 = r3 instanceof com.google.android.gms.internal.gtm.zzadl
            if (r0 != 0) goto L21
            boolean r0 = r3 instanceof com.google.android.gms.internal.gtm.zzacv
            if (r0 == 0) goto L48
        L21:
            return
        L22:
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 != 0) goto L2a
            boolean r0 = r3 instanceof com.google.android.gms.internal.gtm.zzach
            if (r0 == 0) goto L48
        L2a:
            return
        L2b:
            boolean r0 = r3 instanceof com.google.android.gms.internal.gtm.zzyx
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
            com.google.android.gms.internal.gtm.zzaex r2 = r2.zzd()
            com.google.android.gms.internal.gtm.zzaey r2 = r2.zza()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r2, r3}
            java.lang.String r3 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzabv.zzs(com.google.android.gms.internal.gtm.zzabu, java.lang.Object):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzabv) {
            return this.zza.equals(((zzabv) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzc() {
        int iZzc = this.zza.zzc();
        int iZzr = 0;
        for (int i10 = 0; i10 < iZzc; i10++) {
            iZzr += zzr(this.zza.zzg(i10));
        }
        Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            iZzr += zzr((Map.Entry) it.next());
        }
        return iZzr;
    }

    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzabv clone() {
        zzabv zzabvVar = new zzabv();
        int iZzc = this.zza.zzc();
        for (int i10 = 0; i10 < iZzc; i10++) {
            Map.Entry entryZzg = this.zza.zzg(i10);
            zzabvVar.zzk((zzabu) ((zzaeb) entryZzg).zza(), entryZzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzd()) {
            zzabvVar.zzk((zzabu) entry.getKey(), entry.getValue());
        }
        zzabvVar.zzd = this.zzd;
        return zzabvVar;
    }

    public final Object zzf(zzabu zzabuVar) {
        Object obj = this.zza.get(zzabuVar);
        if (obj instanceof zzacv) {
            throw null;
        }
        return obj;
    }

    public final Iterator zzg() {
        return this.zza.isEmpty() ? Collections.emptyIterator() : this.zzd ? new zzact(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    public final void zzh(zzabu zzabuVar, Object obj) {
        List arrayList;
        if (!((zzacd) zzabuVar).zzd) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        zzs(zzabuVar, obj);
        Object objZzf = zzf(zzabuVar);
        if (objZzf == null) {
            arrayList = new ArrayList();
            this.zza.put(zzabuVar, arrayList);
        } else {
            arrayList = (List) objZzf;
        }
        arrayList.add(obj);
    }

    public final void zzi() {
        if (this.zzc) {
            return;
        }
        int iZzc = this.zza.zzc();
        for (int i10 = 0; i10 < iZzc; i10++) {
            Object value = this.zza.zzg(i10).getValue();
            if (value instanceof zzacf) {
                ((zzacf) value).zzam();
            }
        }
        Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof zzacf) {
                ((zzacf) value2).zzam();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzj(zzabv zzabvVar) {
        int iZzc = zzabvVar.zza.zzc();
        for (int i10 = 0; i10 < iZzc; i10++) {
            zzo(zzabvVar.zza.zzg(i10));
        }
        Iterator it = zzabvVar.zza.zzd().iterator();
        while (it.hasNext()) {
            zzo((Map.Entry) it.next());
        }
    }

    public final void zzk(zzabu zzabuVar, Object obj) {
        if (!zzabuVar.zzg()) {
            zzs(zzabuVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                Object obj2 = list.get(i10);
                zzs(zzabuVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof zzacv) {
            this.zzd = true;
        }
        this.zza.put(zzabuVar, obj);
    }

    public final boolean zzl() {
        return this.zzc;
    }

    public final boolean zzm() {
        int iZzc = this.zza.zzc();
        for (int i10 = 0; i10 < iZzc; i10++) {
            if (!zzp(this.zza.zzg(i10))) {
                return false;
            }
        }
        Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            if (!zzp((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private zzabv(boolean z10) {
        zzi();
        zzi();
    }
}
