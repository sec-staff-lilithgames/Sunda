package com.google.android.gms.internal.play_billing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzhb {
    private static final zzhb zzb = new zzhb(true);
    final zzjf zza = new zzja();
    private boolean zzc;
    private boolean zzd;

    private zzhb() {
    }

    public static int zza(zzju zzjuVar, int i10, Object obj) {
        zzgr.zzz(i10 << 3);
        if (zzju.zzj == null) {
            byte[] bArr = zzhp.zzb;
            if (((zzim) obj) instanceof zzfw) {
                throw null;
            }
        }
        zzjv zzjvVar = zzjv.INT;
        throw null;
    }

    public static int zzb(zzha zzhaVar, Object obj) {
        zzju zzjuVarZzb = zzhaVar.zzb();
        int iZza = zzhaVar.zza();
        if (!zzhaVar.zze()) {
            return zza(zzjuVarZzb, iZza, obj);
        }
        List list = (List) obj;
        int size = list.size();
        if (!zzhaVar.zzd()) {
            int iZza2 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                iZza2 += zza(zzjuVarZzb, iZza, list.get(i10));
            }
            return iZza2;
        }
        if (list.isEmpty()) {
            return 0;
        }
        if (size <= 0) {
            return zzgr.zzz(0) + zzgr.zzz(iZza << 3);
        }
        list.get(0);
        zzju zzjuVar = zzju.zza;
        zzjv zzjvVar = zzjv.INT;
        throw null;
    }

    public static zzhb zzd() {
        return zzb;
    }

    private static boolean zzi(Map.Entry entry) {
        zzha zzhaVar = (zzha) entry.getKey();
        if (zzhaVar.zzc() != zzjv.MESSAGE) {
            return true;
        }
        if (!zzhaVar.zze()) {
            return zzj(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!zzj(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzj(Object obj) {
        if (obj instanceof zzin) {
            return ((zzin) obj).zzl();
        }
        if (obj instanceof zzhw) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzk(Map.Entry entry) {
        int i10;
        int iZzz;
        int iB;
        zzha zzhaVar = (zzha) entry.getKey();
        Object value = entry.getValue();
        if (zzhaVar.zzc() != zzjv.MESSAGE || zzhaVar.zze() || zzhaVar.zzd()) {
            return zzb(zzhaVar, value);
        }
        if (value instanceof zzhw) {
            int iZza = ((zzha) entry.getKey()).zza();
            int iZzz2 = zzgr.zzz(8);
            i10 = iZzz2 + iZzz2;
            iZzz = zzgr.zzz(iZza) + zzgr.zzz(16);
            int iZzz3 = zzgr.zzz(24);
            int iZza2 = ((zzhw) value).zza();
            iB = a.b(iZza2, iZza2, iZzz3);
        } else {
            int iZza3 = ((zzha) entry.getKey()).zza();
            int iZzz4 = zzgr.zzz(8);
            i10 = iZzz4 + iZzz4;
            iZzz = zzgr.zzz(iZza3) + zzgr.zzz(16);
            int iZzz5 = zzgr.zzz(24);
            int iZzk = ((zzim) value).zzk();
            iB = a.b(iZzk, iZzk, iZzz5);
        }
        return i10 + iZzz + iB;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void zzl(com.google.android.gms.internal.play_billing.zzha r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.play_billing.zzju r0 = r2.zzb()
            byte[] r1 = com.google.android.gms.internal.play_billing.zzhp.zzb
            r3.getClass()
            com.google.android.gms.internal.play_billing.zzju r1 = com.google.android.gms.internal.play_billing.zzju.zza
            com.google.android.gms.internal.play_billing.zzjv r1 = com.google.android.gms.internal.play_billing.zzjv.INT
            com.google.android.gms.internal.play_billing.zzjv r0 = r0.zza()
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
            boolean r0 = r3 instanceof com.google.android.gms.internal.play_billing.zzim
            if (r0 != 0) goto L21
            boolean r0 = r3 instanceof com.google.android.gms.internal.play_billing.zzhw
            if (r0 == 0) goto L48
        L21:
            return
        L22:
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 != 0) goto L2a
            boolean r0 = r3 instanceof com.google.android.gms.internal.play_billing.zzkn
            if (r0 == 0) goto L48
        L2a:
            return
        L2b:
            boolean r0 = r3 instanceof com.google.android.gms.internal.play_billing.zzgk
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
            com.google.android.gms.internal.play_billing.zzju r2 = r2.zzb()
            com.google.android.gms.internal.play_billing.zzjv r2 = r2.zza()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r2, r3}
            java.lang.String r3 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzhb.zzl(com.google.android.gms.internal.play_billing.zzha, java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzhb zzhbVar = new zzhb();
        int iZzc = this.zza.zzc();
        for (int i10 = 0; i10 < iZzc; i10++) {
            Map.Entry entryZzg = this.zza.zzg(i10);
            zzhbVar.zzg((zzha) ((zzjb) entryZzg).zza(), entryZzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzd()) {
            zzhbVar.zzg((zzha) entry.getKey(), entry.getValue());
        }
        zzhbVar.zzd = this.zzd;
        return zzhbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzhb) {
            return this.zza.equals(((zzhb) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzc() {
        int iZzc = this.zza.zzc();
        int iZzk = 0;
        for (int i10 = 0; i10 < iZzc; i10++) {
            iZzk += zzk(this.zza.zzg(i10));
        }
        Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            iZzk += zzk((Map.Entry) it.next());
        }
        return iZzk;
    }

    public final Iterator zze() {
        return this.zza.isEmpty() ? Collections.emptyIterator() : this.zzd ? new zzhu(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    public final void zzf() {
        if (this.zzc) {
            return;
        }
        int iZzc = this.zza.zzc();
        for (int i10 = 0; i10 < iZzc; i10++) {
            Object value = this.zza.zzg(i10).getValue();
            if (value instanceof zzhk) {
                ((zzhk) value).zzv();
            }
        }
        Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof zzhk) {
                ((zzhk) value2).zzv();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzg(zzha zzhaVar, Object obj) {
        if (!zzhaVar.zze()) {
            zzl(zzhaVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                Object obj2 = list.get(i10);
                zzl(zzhaVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof zzhw) {
            this.zzd = true;
        }
        this.zza.put(zzhaVar, obj);
    }

    public final boolean zzh() {
        int iZzc = this.zza.zzc();
        for (int i10 = 0; i10 < iZzc; i10++) {
            if (!zzi(this.zza.zzg(i10))) {
                return false;
            }
        }
        Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            if (!zzi((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private zzhb(boolean z10) {
        zzf();
        zzf();
    }
}
