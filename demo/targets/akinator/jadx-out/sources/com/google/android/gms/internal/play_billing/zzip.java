package com.google.android.gms.internal.play_billing;

import b3.h;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzip<T> implements zzix<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzjq.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzim zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzjj zzl;
    private final zzgx zzm;

    private zzip(int[] iArr, Object[] objArr, int i10, int i11, zzim zzimVar, boolean z10, int[] iArr2, int i12, int i13, zzir zzirVar, zzhz zzhzVar, zzjj zzjjVar, zzgx zzgxVar, zzih zzihVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        boolean z11 = false;
        if (zzgxVar != null && (zzimVar instanceof zzhh)) {
            z11 = true;
        }
        this.zzh = z11;
        this.zzi = iArr2;
        this.zzj = i12;
        this.zzk = i13;
        this.zzl = zzjjVar;
        this.zzm = zzgxVar;
        this.zzg = zzimVar;
    }

    private static void zzA(Object obj) {
        if (!zzL(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzB(Object obj, Object obj2, int i10) {
        if (zzI(obj2, i10)) {
            int iZzs = zzs(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = iZzs;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
            }
            zzix zzixVarZzv = zzv(i10);
            if (!zzI(obj, i10)) {
                if (zzL(object)) {
                    Object objZze = zzixVarZzv.zze();
                    zzixVarZzv.zzg(objZze, object);
                    unsafe.putObject(obj, j10, objZze);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzD(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzL(object2)) {
                Object objZze2 = zzixVarZzv.zze();
                zzixVarZzv.zzg(objZze2, object2);
                unsafe.putObject(obj, j10, objZze2);
                object2 = objZze2;
            }
            zzixVarZzv.zzg(object2, object);
        }
    }

    private final void zzC(Object obj, Object obj2, int i10) {
        int i11 = this.zzc[i10];
        if (zzM(obj2, i11, i10)) {
            int iZzs = zzs(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = iZzs;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
            }
            zzix zzixVarZzv = zzv(i10);
            if (!zzM(obj, i11, i10)) {
                if (zzL(object)) {
                    Object objZze = zzixVarZzv.zze();
                    zzixVarZzv.zzg(objZze, object);
                    unsafe.putObject(obj, j10, objZze);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzE(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzL(object2)) {
                Object objZze2 = zzixVarZzv.zze();
                zzixVarZzv.zzg(objZze2, object2);
                unsafe.putObject(obj, j10, objZze2);
                object2 = objZze2;
            }
            zzixVarZzv.zzg(object2, object);
        }
    }

    private final void zzD(Object obj, int i10) {
        int iZzp = zzp(i10);
        long j10 = 1048575 & iZzp;
        if (j10 == 1048575) {
            return;
        }
        zzjq.zzq(obj, j10, (1 << (iZzp >>> 20)) | zzjq.zzc(obj, j10));
    }

    private final void zzE(Object obj, int i10, int i11) {
        zzjq.zzq(obj, zzp(i11) & 1048575, i10);
    }

    private final void zzF(Object obj, int i10, Object obj2) {
        zzb.putObject(obj, zzs(i10) & 1048575, obj2);
        zzD(obj, i10);
    }

    private final void zzG(Object obj, int i10, int i11, Object obj2) {
        zzb.putObject(obj, zzs(i11) & 1048575, obj2);
        zzE(obj, i10, i11);
    }

    private final boolean zzH(Object obj, Object obj2, int i10) {
        return zzI(obj, i10) == zzI(obj2, i10);
    }

    private final boolean zzI(Object obj, int i10) {
        int iZzp = zzp(i10);
        long j10 = iZzp & 1048575;
        if (j10 != 1048575) {
            return (zzjq.zzc(obj, j10) & (1 << (iZzp >>> 20))) != 0;
        }
        int iZzs = zzs(i10);
        long j11 = iZzs & 1048575;
        switch (zzr(iZzs)) {
            case 0:
                return Double.doubleToRawLongBits(zzjq.zza(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzjq.zzb(obj, j11)) != 0;
            case 2:
                return zzjq.zzd(obj, j11) != 0;
            case 3:
                return zzjq.zzd(obj, j11) != 0;
            case 4:
                return zzjq.zzc(obj, j11) != 0;
            case 5:
                return zzjq.zzd(obj, j11) != 0;
            case 6:
                return zzjq.zzc(obj, j11) != 0;
            case 7:
                return zzjq.zzw(obj, j11);
            case 8:
                Object objZzf = zzjq.zzf(obj, j11);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzgk) {
                    return !zzgk.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzjq.zzf(obj, j11) != null;
            case 10:
                return !zzgk.zzb.equals(zzjq.zzf(obj, j11));
            case 11:
                return zzjq.zzc(obj, j11) != 0;
            case 12:
                return zzjq.zzc(obj, j11) != 0;
            case 13:
                return zzjq.zzc(obj, j11) != 0;
            case 14:
                return zzjq.zzd(obj, j11) != 0;
            case 15:
                return zzjq.zzc(obj, j11) != 0;
            case 16:
                return zzjq.zzd(obj, j11) != 0;
            case 17:
                return zzjq.zzf(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzJ(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? zzI(obj, i10) : (i12 & i13) != 0;
    }

    private static boolean zzK(Object obj, int i10, zzix zzixVar) {
        return zzixVar.zzk(zzjq.zzf(obj, i10 & 1048575));
    }

    private static boolean zzL(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzhk) {
            return ((zzhk) obj).zzA();
        }
        return true;
    }

    private final boolean zzM(Object obj, int i10, int i11) {
        return zzjq.zzc(obj, (long) (zzp(i11) & 1048575)) == i10;
    }

    private static boolean zzN(Object obj, long j10) {
        return ((Boolean) zzjq.zzf(obj, j10)).booleanValue();
    }

    private static final void zzO(int i10, Object obj, zzjw zzjwVar) throws IOException {
        if (obj instanceof String) {
            zzjwVar.zzG(i10, (String) obj);
        } else {
            zzjwVar.zzd(i10, (zzgk) obj);
        }
    }

    public static zzjk zzd(Object obj) {
        zzhk zzhkVar = (zzhk) obj;
        zzjk zzjkVar = zzhkVar.zzc;
        if (zzjkVar != zzjk.zzc()) {
            return zzjkVar;
        }
        zzjk zzjkVarZzf = zzjk.zzf();
        zzhkVar.zzc = zzjkVarZzf;
        return zzjkVarZzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:187:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.play_billing.zzip zzl(java.lang.Class r34, com.google.android.gms.internal.play_billing.zzij r35, com.google.android.gms.internal.play_billing.zzir r36, com.google.android.gms.internal.play_billing.zzhz r37, com.google.android.gms.internal.play_billing.zzjj r38, com.google.android.gms.internal.play_billing.zzgx r39, com.google.android.gms.internal.play_billing.zzih r40) {
        /*
            Method dump skipped, instructions count: 1098
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzip.zzl(java.lang.Class, com.google.android.gms.internal.play_billing.zzij, com.google.android.gms.internal.play_billing.zzir, com.google.android.gms.internal.play_billing.zzhz, com.google.android.gms.internal.play_billing.zzjj, com.google.android.gms.internal.play_billing.zzgx, com.google.android.gms.internal.play_billing.zzih):com.google.android.gms.internal.play_billing.zzip");
    }

    private static double zzm(Object obj, long j10) {
        return ((Double) zzjq.zzf(obj, j10)).doubleValue();
    }

    private static float zzn(Object obj, long j10) {
        return ((Float) zzjq.zzf(obj, j10)).floatValue();
    }

    private static int zzo(Object obj, long j10) {
        return ((Integer) zzjq.zzf(obj, j10)).intValue();
    }

    private final int zzp(int i10) {
        return this.zzc[i10 + 2];
    }

    private final int zzq(int i10, int i11) {
        int length = (this.zzc.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.zzc[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private static int zzr(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int zzs(int i10) {
        return this.zzc[i10 + 1];
    }

    private static long zzt(Object obj, long j10) {
        return ((Long) zzjq.zzf(obj, j10)).longValue();
    }

    private final zzhm zzu(int i10) {
        int i11 = i10 / 3;
        return (zzhm) this.zzd[i11 + i11 + 1];
    }

    private final zzix zzv(int i10) {
        Object[] objArr = this.zzd;
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzix zzixVar = (zzix) objArr[i12];
        if (zzixVar != null) {
            return zzixVar;
        }
        zzix zzixVarZzb = zziu.zza().zzb((Class) objArr[i12 + 1]);
        this.zzd[i12] = zzixVarZzb;
        return zzixVarZzb;
    }

    private final Object zzw(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    private final Object zzx(Object obj, int i10) {
        zzix zzixVarZzv = zzv(i10);
        int iZzs = zzs(i10) & 1048575;
        if (!zzI(obj, i10)) {
            return zzixVarZzv.zze();
        }
        Object object = zzb.getObject(obj, iZzs);
        if (zzL(object)) {
            return object;
        }
        Object objZze = zzixVarZzv.zze();
        if (object != null) {
            zzixVarZzv.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzy(Object obj, int i10, int i11) {
        zzix zzixVarZzv = zzv(i11);
        if (!zzM(obj, i10, i11)) {
            return zzixVarZzv.zze();
        }
        Object object = zzb.getObject(obj, zzs(i11) & 1048575);
        if (zzL(object)) {
            return object;
        }
        Object objZze = zzixVarZzv.zze();
        if (object != null) {
            zzixVarZzv.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field zzz(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sbB = h.b("Field ", str, " for ", name, " not found. Known fields are ");
            sbB.append(string);
            throw new RuntimeException(sbB.toString());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.play_billing.zzix
    public final int zza(Object obj) {
        int i10;
        int iZzz;
        int iZzA;
        int iZzz2;
        int iZzd;
        int iZzz3;
        int iZzh;
        int size;
        int iZzl;
        int iZzz4;
        int iZzz5;
        int iZzd2;
        boolean z10;
        int iZzb;
        int iZzy;
        int iZzz6;
        int iZzz7;
        int size2;
        int iZzk;
        int iZzz8;
        int size3;
        int iZzi;
        int iZzz9;
        int i11;
        int iZze;
        int iZzz10;
        int iZzz11;
        int iZzz12;
        int iZzA2;
        zzip<T> zzipVar = this;
        Object obj2 = obj;
        Unsafe unsafe = zzb;
        int i12 = 1048575;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        int iB = 0;
        while (i14 < zzipVar.zzc.length) {
            int iZzs = zzipVar.zzs(i14);
            int iZzr = zzr(iZzs);
            int[] iArr = zzipVar.zzc;
            int i16 = iArr[i14];
            int i17 = iArr[i14 + 2];
            int i18 = i17 & i12;
            if (iZzr <= 17) {
                if (i18 != i13) {
                    i15 = i18 == i12 ? 0 : unsafe.getInt(obj2, i18);
                    i13 = i18;
                }
                i10 = 1 << (i17 >>> 20);
            } else {
                i10 = 0;
            }
            int i19 = iZzs & i12;
            if (iZzr >= zzhc.zzJ.zza()) {
                zzhc.zzW.zza();
            }
            long j10 = i19;
            switch (iZzr) {
                case 0:
                    if (zzipVar.zzJ(obj2, i14, i13, i15, i10)) {
                        iB = a.b(i16 << 3, 8, iB);
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 1:
                    if (zzipVar.zzJ(obj2, i14, i13, i15, i10)) {
                        iB = a.b(i16 << 3, 4, iB);
                    }
                    zzipVar = this;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 2:
                    if (zzipVar.zzJ(obj2, i14, i13, i15, i10)) {
                        long j11 = unsafe.getLong(obj2, j10);
                        iZzz = zzgr.zzz(i16 << 3);
                        iZzA = zzgr.zzA(j11);
                        iB += iZzA + iZzz;
                    }
                    zzipVar = this;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 3:
                    if (zzipVar.zzJ(obj2, i14, i13, i15, i10)) {
                        long j12 = unsafe.getLong(obj2, j10);
                        iZzz = zzgr.zzz(i16 << 3);
                        iZzA = zzgr.zzA(j12);
                        iB += iZzA + iZzz;
                    }
                    zzipVar = this;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 4:
                    if (zzipVar.zzJ(obj2, i14, i13, i15, i10)) {
                        long j13 = unsafe.getInt(obj2, j10);
                        iZzz = zzgr.zzz(i16 << 3);
                        iZzA = zzgr.zzA(j13);
                        iB += iZzA + iZzz;
                    }
                    zzipVar = this;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 5:
                    if (zzipVar.zzJ(obj2, i14, i13, i15, i10)) {
                        iB = a.b(i16 << 3, 8, iB);
                    }
                    zzipVar = this;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 6:
                    if (zzipVar.zzJ(obj2, i14, i13, i15, i10)) {
                        iB = a.b(i16 << 3, 4, iB);
                    }
                    zzipVar = this;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 7:
                    if (zzipVar.zzJ(obj2, i14, i13, i15, i10)) {
                        iB = a.b(i16 << 3, 1, iB);
                    }
                    zzipVar = this;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 8:
                    if (zzipVar.zzJ(obj2, i14, i13, i15, i10)) {
                        int i20 = i16 << 3;
                        Object object = unsafe.getObject(obj2, j10);
                        if (object instanceof zzgk) {
                            iZzz2 = zzgr.zzz(i20);
                            iZzd = ((zzgk) object).zzd();
                            iZzz3 = zzgr.zzz(iZzd);
                            iB += iZzz3 + iZzd + iZzz2;
                        } else {
                            iZzz = zzgr.zzz(i20);
                            iZzA = zzgr.zzy((String) object);
                            iB += iZzA + iZzz;
                        }
                    }
                    zzipVar = this;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 9:
                    if (zzipVar.zzJ(obj2, i14, i13, i15, i10)) {
                        iZzh = zziz.zzh(i16, unsafe.getObject(obj2, j10), zzipVar.zzv(i14));
                        iB += iZzh;
                        i14 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    } else {
                        i14 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    }
                case 10:
                    if (zzipVar.zzJ(obj2, i14, i13, i15, i10)) {
                        zzgk zzgkVar = (zzgk) unsafe.getObject(obj2, j10);
                        iZzz2 = zzgr.zzz(i16 << 3);
                        iZzd = zzgkVar.zzd();
                        iZzz3 = zzgr.zzz(iZzd);
                        iB += iZzz3 + iZzd + iZzz2;
                    }
                    zzipVar = this;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 11:
                    if (zzipVar.zzJ(obj2, i14, i13, i15, i10)) {
                        iB = a.b(unsafe.getInt(obj2, j10), zzgr.zzz(i16 << 3), iB);
                    }
                    zzipVar = this;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 12:
                    if (zzipVar.zzJ(obj2, i14, i13, i15, i10)) {
                        long j14 = unsafe.getInt(obj2, j10);
                        iZzz = zzgr.zzz(i16 << 3);
                        iZzA = zzgr.zzA(j14);
                        iB += iZzA + iZzz;
                    }
                    zzipVar = this;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 13:
                    if (zzipVar.zzJ(obj2, i14, i13, i15, i10)) {
                        iB = a.b(i16 << 3, 4, iB);
                    }
                    zzipVar = this;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 14:
                    if (zzipVar.zzJ(obj2, i14, i13, i15, i10)) {
                        iB = a.b(i16 << 3, 8, iB);
                    }
                    zzipVar = this;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 15:
                    if (zzipVar.zzJ(obj2, i14, i13, i15, i10)) {
                        int i21 = unsafe.getInt(obj2, j10);
                        iB = a.b((i21 >> 31) ^ (i21 + i21), zzgr.zzz(i16 << 3), iB);
                    }
                    zzipVar = this;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 16:
                    if (zzipVar.zzJ(obj2, i14, i13, i15, i10)) {
                        long j15 = unsafe.getLong(obj2, j10);
                        iZzz = zzgr.zzz(i16 << 3);
                        iZzA = zzgr.zzA((j15 >> 63) ^ (j15 + j15));
                        iB += iZzA + iZzz;
                    }
                    zzipVar = this;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 17:
                    if (zzipVar.zzJ(obj2, i14, i13, i15, i10)) {
                        iB += zzgr.zzw(i16, (zzim) unsafe.getObject(obj2, j10), zzipVar.zzv(i14));
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 18:
                    iZzh = zziz.zzd(i16, (List) unsafe.getObject(obj2, j10), false);
                    iB += iZzh;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 19:
                    iZzh = zziz.zzb(i16, (List) unsafe.getObject(obj2, j10), false);
                    iB += iZzh;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 20:
                    List list = (List) unsafe.getObject(obj2, j10);
                    int i22 = zziz.zza;
                    iZzz5 = list.size() == 0 ? 0 : (zzgr.zzz(i16 << 3) * list.size()) + zziz.zzg(list);
                    iB += iZzz5;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 21:
                    List list2 = (List) unsafe.getObject(obj2, j10);
                    int i23 = zziz.zza;
                    size = list2.size();
                    if (size != 0) {
                        iZzl = zziz.zzl(list2);
                        iZzz4 = zzgr.zzz(i16 << 3);
                        iZzz5 = (iZzz4 * size) + iZzl;
                        iB += iZzz5;
                        i14 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    }
                    iB += iZzz5;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 22:
                    List list3 = (List) unsafe.getObject(obj2, j10);
                    int i24 = zziz.zza;
                    size = list3.size();
                    if (size != 0) {
                        iZzl = zziz.zzf(list3);
                        iZzz4 = zzgr.zzz(i16 << 3);
                        iZzz5 = (iZzz4 * size) + iZzl;
                        iB += iZzz5;
                        i14 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    }
                    iB += iZzz5;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 23:
                    iZzd2 = zziz.zzd(i16, (List) unsafe.getObject(obj2, j10), false);
                    iB += iZzd2;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 24:
                    z10 = false;
                    iZzb = zziz.zzb(i16, (List) unsafe.getObject(obj2, j10), false);
                    iB += iZzb;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 25:
                    List list4 = (List) unsafe.getObject(obj2, j10);
                    int i25 = zziz.zza;
                    int size4 = list4.size();
                    iZzd2 = size4 == 0 ? 0 : size4 * (zzgr.zzz(i16 << 3) + 1);
                    iB += iZzd2;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 26:
                    List list5 = (List) unsafe.getObject(obj2, j10);
                    int i26 = zziz.zza;
                    int size5 = list5.size();
                    if (size5 == 0) {
                        iZzy = 0;
                    } else {
                        int iZzz13 = zzgr.zzz(i16 << 3) * size5;
                        if (list5 instanceof zzhy) {
                            zzhy zzhyVar = (zzhy) list5;
                            iZzy = iZzz13;
                            for (int i27 = 0; i27 < size5; i27++) {
                                Object objZzc = zzhyVar.zzc();
                                if (objZzc instanceof zzgk) {
                                    int iZzd3 = ((zzgk) objZzc).zzd();
                                    iZzy = a.b(iZzd3, iZzd3, iZzy);
                                } else {
                                    iZzy = zzgr.zzy((String) objZzc) + iZzy;
                                }
                            }
                        } else {
                            iZzy = iZzz13;
                            for (int i28 = 0; i28 < size5; i28++) {
                                Object obj3 = list5.get(i28);
                                if (obj3 instanceof zzgk) {
                                    int iZzd4 = ((zzgk) obj3).zzd();
                                    iZzy = a.b(iZzd4, iZzd4, iZzy);
                                } else {
                                    iZzy = zzgr.zzy((String) obj3) + iZzy;
                                }
                            }
                        }
                    }
                    iB += iZzy;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 27:
                    List list6 = (List) unsafe.getObject(obj2, j10);
                    zzix zzixVarZzv = zzipVar.zzv(i14);
                    int i29 = zziz.zza;
                    int size6 = list6.size();
                    if (size6 == 0) {
                        iZzz6 = 0;
                    } else {
                        iZzz6 = zzgr.zzz(i16 << 3) * size6;
                        for (int i30 = 0; i30 < size6; i30++) {
                            Object obj4 = list6.get(i30);
                            if (obj4 instanceof zzhx) {
                                int iZza = ((zzhx) obj4).zza();
                                iZzz6 = a.b(iZza, iZza, iZzz6);
                            } else {
                                iZzz6 = zzgr.zzx((zzim) obj4, zzixVarZzv) + iZzz6;
                            }
                        }
                    }
                    iB += iZzz6;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 28:
                    List list7 = (List) unsafe.getObject(obj2, j10);
                    int i31 = zziz.zza;
                    int size7 = list7.size();
                    if (size7 == 0) {
                        iZzz7 = 0;
                    } else {
                        iZzz7 = zzgr.zzz(i16 << 3) * size7;
                        for (int i32 = 0; i32 < list7.size(); i32++) {
                            int iZzd5 = ((zzgk) list7.get(i32)).zzd();
                            iZzz7 = a.b(iZzd5, iZzd5, iZzz7);
                        }
                    }
                    iB += iZzz7;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 29:
                    List list8 = (List) unsafe.getObject(obj2, j10);
                    int i33 = zziz.zza;
                    size2 = list8.size();
                    if (size2 != 0) {
                        iZzk = zziz.zzk(list8);
                        iZzz8 = zzgr.zzz(i16 << 3);
                        iZzd2 = iZzk + (iZzz8 * size2);
                        iB += iZzd2;
                        i14 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    }
                    iB += iZzd2;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 30:
                    List list9 = (List) unsafe.getObject(obj2, j10);
                    int i34 = zziz.zza;
                    size2 = list9.size();
                    if (size2 != 0) {
                        iZzk = zziz.zza(list9);
                        iZzz8 = zzgr.zzz(i16 << 3);
                        iZzd2 = iZzk + (iZzz8 * size2);
                        iB += iZzd2;
                        i14 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    }
                    iB += iZzd2;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 31:
                    iZzd2 = zziz.zzb(i16, (List) unsafe.getObject(obj2, j10), false);
                    iB += iZzd2;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 32:
                    z10 = false;
                    iZzb = zziz.zzd(i16, (List) unsafe.getObject(obj2, j10), false);
                    iB += iZzb;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 33:
                    List list10 = (List) unsafe.getObject(obj2, j10);
                    int i35 = zziz.zza;
                    size3 = list10.size();
                    if (size3 != 0) {
                        iZzi = zziz.zzi(list10);
                        iZzz9 = zzgr.zzz(i16 << 3);
                        i11 = (iZzz9 * size3) + iZzi;
                        iB += i11;
                        i14 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    }
                    i11 = 0;
                    iB += i11;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 34:
                    List list11 = (List) unsafe.getObject(obj2, j10);
                    int i36 = zziz.zza;
                    size3 = list11.size();
                    if (size3 != 0) {
                        iZzi = zziz.zzj(list11);
                        iZzz9 = zzgr.zzz(i16 << 3);
                        i11 = (iZzz9 * size3) + iZzi;
                        iB += i11;
                        i14 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    }
                    i11 = 0;
                    iB += i11;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 35:
                    iZze = zziz.zze((List) unsafe.getObject(obj2, j10));
                    if (iZze > 0) {
                        iZzz10 = zzgr.zzz(i16 << 3);
                        iZzz11 = zzgr.zzz(iZze);
                        iB += iZzz11 + iZzz10 + iZze;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 36:
                    iZze = zziz.zzc((List) unsafe.getObject(obj2, j10));
                    if (iZze > 0) {
                        iZzz10 = zzgr.zzz(i16 << 3);
                        iZzz11 = zzgr.zzz(iZze);
                        iB += iZzz11 + iZzz10 + iZze;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 37:
                    iZze = zziz.zzg((List) unsafe.getObject(obj2, j10));
                    if (iZze > 0) {
                        iZzz10 = zzgr.zzz(i16 << 3);
                        iZzz11 = zzgr.zzz(iZze);
                        iB += iZzz11 + iZzz10 + iZze;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 38:
                    iZze = zziz.zzl((List) unsafe.getObject(obj2, j10));
                    if (iZze > 0) {
                        iZzz10 = zzgr.zzz(i16 << 3);
                        iZzz11 = zzgr.zzz(iZze);
                        iB += iZzz11 + iZzz10 + iZze;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 39:
                    iZze = zziz.zzf((List) unsafe.getObject(obj2, j10));
                    if (iZze > 0) {
                        iZzz10 = zzgr.zzz(i16 << 3);
                        iZzz11 = zzgr.zzz(iZze);
                        iB += iZzz11 + iZzz10 + iZze;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 40:
                    iZze = zziz.zze((List) unsafe.getObject(obj2, j10));
                    if (iZze > 0) {
                        iZzz10 = zzgr.zzz(i16 << 3);
                        iZzz11 = zzgr.zzz(iZze);
                        iB += iZzz11 + iZzz10 + iZze;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 41:
                    iZze = zziz.zzc((List) unsafe.getObject(obj2, j10));
                    if (iZze > 0) {
                        iZzz10 = zzgr.zzz(i16 << 3);
                        iZzz11 = zzgr.zzz(iZze);
                        iB += iZzz11 + iZzz10 + iZze;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 42:
                    List list12 = (List) unsafe.getObject(obj2, j10);
                    int i37 = zziz.zza;
                    iZze = list12.size();
                    if (iZze > 0) {
                        iZzz10 = zzgr.zzz(i16 << 3);
                        iZzz11 = zzgr.zzz(iZze);
                        iB += iZzz11 + iZzz10 + iZze;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 43:
                    iZze = zziz.zzk((List) unsafe.getObject(obj2, j10));
                    if (iZze > 0) {
                        iZzz10 = zzgr.zzz(i16 << 3);
                        iZzz11 = zzgr.zzz(iZze);
                        iB += iZzz11 + iZzz10 + iZze;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 44:
                    iZze = zziz.zza((List) unsafe.getObject(obj2, j10));
                    if (iZze > 0) {
                        iZzz10 = zzgr.zzz(i16 << 3);
                        iZzz11 = zzgr.zzz(iZze);
                        iB += iZzz11 + iZzz10 + iZze;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 45:
                    iZze = zziz.zzc((List) unsafe.getObject(obj2, j10));
                    if (iZze > 0) {
                        iZzz10 = zzgr.zzz(i16 << 3);
                        iZzz11 = zzgr.zzz(iZze);
                        iB += iZzz11 + iZzz10 + iZze;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 46:
                    iZze = zziz.zze((List) unsafe.getObject(obj2, j10));
                    if (iZze > 0) {
                        iZzz10 = zzgr.zzz(i16 << 3);
                        iZzz11 = zzgr.zzz(iZze);
                        iB += iZzz11 + iZzz10 + iZze;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 47:
                    iZze = zziz.zzi((List) unsafe.getObject(obj2, j10));
                    if (iZze > 0) {
                        iZzz10 = zzgr.zzz(i16 << 3);
                        iZzz11 = zzgr.zzz(iZze);
                        iB += iZzz11 + iZzz10 + iZze;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 48:
                    iZze = zziz.zzj((List) unsafe.getObject(obj2, j10));
                    if (iZze > 0) {
                        iZzz10 = zzgr.zzz(i16 << 3);
                        iZzz11 = zzgr.zzz(iZze);
                        iB += iZzz11 + iZzz10 + iZze;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 49:
                    List list13 = (List) unsafe.getObject(obj2, j10);
                    zzix zzixVarZzv2 = zzipVar.zzv(i14);
                    int i38 = zziz.zza;
                    int size8 = list13.size();
                    if (size8 == 0) {
                        i11 = 0;
                    } else {
                        int iZzw = 0;
                        for (int i39 = 0; i39 < size8; i39++) {
                            iZzw += zzgr.zzw(i16, (zzim) list13.get(i39), zzixVarZzv2);
                        }
                        i11 = iZzw;
                    }
                    iB += i11;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 50:
                    zzig zzigVar = (zzig) unsafe.getObject(obj2, j10);
                    if (!zzigVar.isEmpty()) {
                        Iterator it = zzigVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 51:
                    if (zzipVar.zzM(obj2, i16, i14)) {
                        iB = a.b(i16 << 3, 8, iB);
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 52:
                    if (zzipVar.zzM(obj2, i16, i14)) {
                        iB = a.b(i16 << 3, 4, iB);
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 53:
                    if (zzipVar.zzM(obj2, i16, i14)) {
                        long jZzt = zzt(obj2, j10);
                        iZzz12 = zzgr.zzz(i16 << 3);
                        iZzA2 = zzgr.zzA(jZzt);
                        iB += iZzA2 + iZzz12;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 54:
                    if (zzipVar.zzM(obj2, i16, i14)) {
                        long jZzt2 = zzt(obj2, j10);
                        iZzz12 = zzgr.zzz(i16 << 3);
                        iZzA2 = zzgr.zzA(jZzt2);
                        iB += iZzA2 + iZzz12;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 55:
                    if (zzipVar.zzM(obj2, i16, i14)) {
                        long jZzo = zzo(obj2, j10);
                        iZzz12 = zzgr.zzz(i16 << 3);
                        iZzA2 = zzgr.zzA(jZzo);
                        iB += iZzA2 + iZzz12;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 56:
                    if (zzipVar.zzM(obj2, i16, i14)) {
                        iB = a.b(i16 << 3, 8, iB);
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 57:
                    if (zzipVar.zzM(obj2, i16, i14)) {
                        iB = a.b(i16 << 3, 4, iB);
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 58:
                    if (zzipVar.zzM(obj2, i16, i14)) {
                        iB = a.b(i16 << 3, 1, iB);
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 59:
                    if (zzipVar.zzM(obj2, i16, i14)) {
                        int i40 = i16 << 3;
                        Object object2 = unsafe.getObject(obj2, j10);
                        if (object2 instanceof zzgk) {
                            iZze = zzgr.zzz(i40);
                            iZzz10 = ((zzgk) object2).zzd();
                            iZzz11 = zzgr.zzz(iZzz10);
                            iB += iZzz11 + iZzz10 + iZze;
                        } else {
                            iZzz12 = zzgr.zzz(i40);
                            iZzA2 = zzgr.zzy((String) object2);
                            iB += iZzA2 + iZzz12;
                        }
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 60:
                    if (zzipVar.zzM(obj2, i16, i14)) {
                        iZzd2 = zziz.zzh(i16, unsafe.getObject(obj2, j10), zzipVar.zzv(i14));
                        iB += iZzd2;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 61:
                    if (zzipVar.zzM(obj2, i16, i14)) {
                        zzgk zzgkVar2 = (zzgk) unsafe.getObject(obj2, j10);
                        iZze = zzgr.zzz(i16 << 3);
                        iZzz10 = zzgkVar2.zzd();
                        iZzz11 = zzgr.zzz(iZzz10);
                        iB += iZzz11 + iZzz10 + iZze;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 62:
                    if (zzipVar.zzM(obj2, i16, i14)) {
                        iB = a.b(zzo(obj2, j10), zzgr.zzz(i16 << 3), iB);
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 63:
                    if (zzipVar.zzM(obj2, i16, i14)) {
                        long jZzo2 = zzo(obj2, j10);
                        iZzz12 = zzgr.zzz(i16 << 3);
                        iZzA2 = zzgr.zzA(jZzo2);
                        iB += iZzA2 + iZzz12;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 64:
                    if (zzipVar.zzM(obj2, i16, i14)) {
                        iB = a.b(i16 << 3, 4, iB);
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case TokenParametersOuterClass$TokenParameters.MOCKRESPONSEID_FIELD_NUMBER /* 65 */:
                    if (zzipVar.zzM(obj2, i16, i14)) {
                        iB = a.b(i16 << 3, 8, iB);
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case TokenParametersOuterClass$TokenParameters.LGPDCONSENT_FIELD_NUMBER /* 66 */:
                    if (zzipVar.zzM(obj2, i16, i14)) {
                        int iZzo = zzo(obj2, j10);
                        iB = a.b((iZzo >> 31) ^ (iZzo + iZzo), zzgr.zzz(i16 << 3), iB);
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case TokenParametersOuterClass$TokenParameters.IGNITEVERSION_FIELD_NUMBER /* 67 */:
                    if (zzipVar.zzM(obj2, i16, i14)) {
                        long jZzt3 = zzt(obj2, j10);
                        iZzz12 = zzgr.zzz(i16 << 3);
                        iZzA2 = zzgr.zzA((jZzt3 >> 63) ^ (jZzt3 + jZzt3));
                        iB += iZzA2 + iZzz12;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case TokenParametersOuterClass$TokenParameters.IGNITEPACKAGENAME_FIELD_NUMBER /* 68 */:
                    if (zzipVar.zzM(obj2, i16, i14)) {
                        iB += zzgr.zzw(i16, (zzim) unsafe.getObject(obj2, j10), zzipVar.zzv(i14));
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                default:
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
            }
        }
        int iZzb2 = 0;
        int iZza2 = ((zzhk) obj).zzc.zza() + iB;
        if (!zzipVar.zzh) {
            return iZza2;
        }
        zzhb zzhbVar = ((zzhh) obj).zzb;
        int iZzc = zzhbVar.zza.zzc();
        for (int i41 = 0; i41 < iZzc; i41++) {
            Map.Entry entryZzg = zzhbVar.zza.zzg(i41);
            iZzb2 += zzhb.zzb((zzha) ((zzjb) entryZzg).zza(), entryZzg.getValue());
        }
        for (Map.Entry entry2 : zzhbVar.zza.zzd()) {
            iZzb2 += zzhb.zzb((zzha) entry2.getKey(), entry2.getValue());
        }
        return iZza2 + iZzb2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzix
    public final int zzb(Object obj) {
        int i10;
        long jDoubleToLongBits;
        int i11;
        int iFloatToIntBits;
        int iZzc;
        int i12;
        int i13 = 0;
        for (int i14 = 0; i14 < this.zzc.length; i14 += 3) {
            int iZzs = zzs(i14);
            int[] iArr = this.zzc;
            int i15 = 1048575 & iZzs;
            int iZzr = zzr(iZzs);
            int i16 = iArr[i14];
            long j10 = i15;
            int iHashCode = 37;
            switch (iZzr) {
                case 0:
                    i10 = i13 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzjq.zza(obj, j10));
                    byte[] bArr = zzhp.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iZzc;
                    break;
                case 1:
                    i11 = i13 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzjq.zzb(obj, j10));
                    i13 = iFloatToIntBits + i11;
                    break;
                case 2:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zzjq.zzd(obj, j10);
                    byte[] bArr2 = zzhp.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iZzc;
                    break;
                case 3:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zzjq.zzd(obj, j10);
                    byte[] bArr3 = zzhp.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iZzc;
                    break;
                case 4:
                    i10 = i13 * 53;
                    iZzc = zzjq.zzc(obj, j10);
                    i13 = i10 + iZzc;
                    break;
                case 5:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zzjq.zzd(obj, j10);
                    byte[] bArr4 = zzhp.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iZzc;
                    break;
                case 6:
                    i10 = i13 * 53;
                    iZzc = zzjq.zzc(obj, j10);
                    i13 = i10 + iZzc;
                    break;
                case 7:
                    i11 = i13 * 53;
                    iFloatToIntBits = zzhp.zza(zzjq.zzw(obj, j10));
                    i13 = iFloatToIntBits + i11;
                    break;
                case 8:
                    i11 = i13 * 53;
                    iFloatToIntBits = ((String) zzjq.zzf(obj, j10)).hashCode();
                    i13 = iFloatToIntBits + i11;
                    break;
                case 9:
                    i12 = i13 * 53;
                    Object objZzf = zzjq.zzf(obj, j10);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i13 = i12 + iHashCode;
                    break;
                case 10:
                    i11 = i13 * 53;
                    iFloatToIntBits = zzjq.zzf(obj, j10).hashCode();
                    i13 = iFloatToIntBits + i11;
                    break;
                case 11:
                    i10 = i13 * 53;
                    iZzc = zzjq.zzc(obj, j10);
                    i13 = i10 + iZzc;
                    break;
                case 12:
                    i10 = i13 * 53;
                    iZzc = zzjq.zzc(obj, j10);
                    i13 = i10 + iZzc;
                    break;
                case 13:
                    i10 = i13 * 53;
                    iZzc = zzjq.zzc(obj, j10);
                    i13 = i10 + iZzc;
                    break;
                case 14:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zzjq.zzd(obj, j10);
                    byte[] bArr5 = zzhp.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iZzc;
                    break;
                case 15:
                    i10 = i13 * 53;
                    iZzc = zzjq.zzc(obj, j10);
                    i13 = i10 + iZzc;
                    break;
                case 16:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zzjq.zzd(obj, j10);
                    byte[] bArr6 = zzhp.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iZzc;
                    break;
                case 17:
                    i12 = i13 * 53;
                    Object objZzf2 = zzjq.zzf(obj, j10);
                    if (objZzf2 != null) {
                        iHashCode = objZzf2.hashCode();
                    }
                    i13 = i12 + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i11 = i13 * 53;
                    iFloatToIntBits = zzjq.zzf(obj, j10).hashCode();
                    i13 = iFloatToIntBits + i11;
                    break;
                case 50:
                    i11 = i13 * 53;
                    iFloatToIntBits = zzjq.zzf(obj, j10).hashCode();
                    i13 = iFloatToIntBits + i11;
                    break;
                case 51:
                    if (zzM(obj, i16, i14)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzm(obj, j10));
                        byte[] bArr7 = zzhp.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzM(obj, i16, i14)) {
                        i11 = i13 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzn(obj, j10));
                        i13 = iFloatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzM(obj, i16, i14)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzt(obj, j10);
                        byte[] bArr8 = zzhp.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzM(obj, i16, i14)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzt(obj, j10);
                        byte[] bArr9 = zzhp.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzM(obj, i16, i14)) {
                        i10 = i13 * 53;
                        iZzc = zzo(obj, j10);
                        i13 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzM(obj, i16, i14)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzt(obj, j10);
                        byte[] bArr10 = zzhp.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzM(obj, i16, i14)) {
                        i10 = i13 * 53;
                        iZzc = zzo(obj, j10);
                        i13 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzM(obj, i16, i14)) {
                        i11 = i13 * 53;
                        iFloatToIntBits = zzhp.zza(zzN(obj, j10));
                        i13 = iFloatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzM(obj, i16, i14)) {
                        i11 = i13 * 53;
                        iFloatToIntBits = ((String) zzjq.zzf(obj, j10)).hashCode();
                        i13 = iFloatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzM(obj, i16, i14)) {
                        i11 = i13 * 53;
                        iFloatToIntBits = zzjq.zzf(obj, j10).hashCode();
                        i13 = iFloatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzM(obj, i16, i14)) {
                        i11 = i13 * 53;
                        iFloatToIntBits = zzjq.zzf(obj, j10).hashCode();
                        i13 = iFloatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzM(obj, i16, i14)) {
                        i10 = i13 * 53;
                        iZzc = zzo(obj, j10);
                        i13 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzM(obj, i16, i14)) {
                        i10 = i13 * 53;
                        iZzc = zzo(obj, j10);
                        i13 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzM(obj, i16, i14)) {
                        i10 = i13 * 53;
                        iZzc = zzo(obj, j10);
                        i13 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case TokenParametersOuterClass$TokenParameters.MOCKRESPONSEID_FIELD_NUMBER /* 65 */:
                    if (zzM(obj, i16, i14)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzt(obj, j10);
                        byte[] bArr11 = zzhp.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case TokenParametersOuterClass$TokenParameters.LGPDCONSENT_FIELD_NUMBER /* 66 */:
                    if (zzM(obj, i16, i14)) {
                        i10 = i13 * 53;
                        iZzc = zzo(obj, j10);
                        i13 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case TokenParametersOuterClass$TokenParameters.IGNITEVERSION_FIELD_NUMBER /* 67 */:
                    if (zzM(obj, i16, i14)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzt(obj, j10);
                        byte[] bArr12 = zzhp.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case TokenParametersOuterClass$TokenParameters.IGNITEPACKAGENAME_FIELD_NUMBER /* 68 */:
                    if (zzM(obj, i16, i14)) {
                        i11 = i13 * 53;
                        iFloatToIntBits = zzjq.zzf(obj, j10).hashCode();
                        i13 = iFloatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = ((zzhk) obj).zzc.hashCode() + (i13 * 53);
        return this.zzh ? (iHashCode2 * 53) + ((zzhh) obj).zzb.zza.hashCode() : iHashCode2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:591:0x0eb0, code lost:
    
        if (r9 == 1048575) goto L593;
     */
    /* JADX WARN: Code restructure failed: missing block: B:592:0x0eb2, code lost:
    
        r20.putInt(r2, r9, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:593:0x0eb8, code lost:
    
        r1 = r12.zzj;
     */
    /* JADX WARN: Code restructure failed: missing block: B:595:0x0ebc, code lost:
    
        if (r1 >= r12.zzk) goto L712;
     */
    /* JADX WARN: Code restructure failed: missing block: B:596:0x0ebe, code lost:
    
        r3 = r12.zzi;
        r6 = r12.zzc;
        r3 = r3[r1];
        r6 = r6[r3];
        r6 = com.google.android.gms.internal.play_billing.zzjq.zzf(r2, r12.zzs(r3) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:597:0x0ed4, code lost:
    
        if (r6 != null) goto L599;
     */
    /* JADX WARN: Code restructure failed: missing block: B:600:0x0edb, code lost:
    
        if (r12.zzu(r3) != null) goto L713;
     */
    /* JADX WARN: Code restructure failed: missing block: B:601:0x0edd, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:602:0x0ee0, code lost:
    
        r6 = (com.google.android.gms.internal.play_billing.zzig) r6;
        r0 = (com.google.android.gms.internal.play_billing.zzif) r12.zzw(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:603:0x0ee8, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:605:0x0eeb, code lost:
    
        if (r0 != 0) goto L610;
     */
    /* JADX WARN: Code restructure failed: missing block: B:606:0x0eed, code lost:
    
        if (r5 != r4) goto L608;
     */
    /* JADX WARN: Code restructure failed: missing block: B:609:0x0ef5, code lost:
    
        throw new com.google.android.gms.internal.play_billing.zzhr("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:610:0x0ef6, code lost:
    
        if (r5 > r4) goto L613;
     */
    /* JADX WARN: Code restructure failed: missing block: B:611:0x0ef8, code lost:
    
        if (r15 != r0) goto L613;
     */
    /* JADX WARN: Code restructure failed: missing block: B:612:0x0efa, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:614:0x0f00, code lost:
    
        throw new com.google.android.gms.internal.play_billing.zzhr("Failed to parse the message.");
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x0e5e  */
    /* JADX WARN: Removed duplicated region for block: B:588:0x0e83  */
    /* JADX WARN: Removed duplicated region for block: B:656:0x0ba8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:659:0x0e2e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:663:0x0052 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:690:0x0bbc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:702:0x0e43 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0273  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzc(java.lang.Object r34, byte[] r35, int r36, int r37, int r38, com.google.android.gms.internal.play_billing.zzfz r39) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3986
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzip.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.play_billing.zzfz):int");
    }

    @Override // com.google.android.gms.internal.play_billing.zzix
    public final Object zze() {
        return ((zzhk) this.zzg).zzp();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    @Override // com.google.android.gms.internal.play_billing.zzix
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzf(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = zzL(r8)
            if (r0 != 0) goto L8
            goto L95
        L8:
            boolean r0 = r8 instanceof com.google.android.gms.internal.play_billing.zzhk
            r1 = 0
            if (r0 == 0) goto L1b
            r0 = r8
            com.google.android.gms.internal.play_billing.zzhk r0 = (com.google.android.gms.internal.play_billing.zzhk) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.zzy(r2)
            r0.zza = r1
            r0.zzw()
        L1b:
            int[] r0 = r7.zzc
        L1d:
            int r2 = r0.length
            if (r1 >= r2) goto L87
            int r2 = r7.zzs(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            int r2 = zzr(r2)
            long r3 = (long) r3
            r5 = 9
            if (r2 == r5) goto L71
            r5 = 60
            if (r2 == r5) goto L59
            r5 = 68
            if (r2 == r5) goto L59
            switch(r2) {
                case 17: goto L71;
                case 18: goto L4f;
                case 19: goto L4f;
                case 20: goto L4f;
                case 21: goto L4f;
                case 22: goto L4f;
                case 23: goto L4f;
                case 24: goto L4f;
                case 25: goto L4f;
                case 26: goto L4f;
                case 27: goto L4f;
                case 28: goto L4f;
                case 29: goto L4f;
                case 30: goto L4f;
                case 31: goto L4f;
                case 32: goto L4f;
                case 33: goto L4f;
                case 34: goto L4f;
                case 35: goto L4f;
                case 36: goto L4f;
                case 37: goto L4f;
                case 38: goto L4f;
                case 39: goto L4f;
                case 40: goto L4f;
                case 41: goto L4f;
                case 42: goto L4f;
                case 43: goto L4f;
                case 44: goto L4f;
                case 45: goto L4f;
                case 46: goto L4f;
                case 47: goto L4f;
                case 48: goto L4f;
                case 49: goto L4f;
                case 50: goto L3d;
                default: goto L3c;
            }
        L3c:
            goto L84
        L3d:
            sun.misc.Unsafe r2 = com.google.android.gms.internal.play_billing.zzip.zzb
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L84
            r6 = r5
            com.google.android.gms.internal.play_billing.zzig r6 = (com.google.android.gms.internal.play_billing.zzig) r6
            r6.zzc()
            r2.putObject(r8, r3, r5)
            goto L84
        L4f:
            java.lang.Object r2 = com.google.android.gms.internal.play_billing.zzjq.zzf(r8, r3)
            com.google.android.gms.internal.play_billing.zzho r2 = (com.google.android.gms.internal.play_billing.zzho) r2
            r2.zzb()
            goto L84
        L59:
            int[] r2 = r7.zzc
            r2 = r2[r1]
            boolean r2 = r7.zzM(r8, r2, r1)
            if (r2 == 0) goto L84
            com.google.android.gms.internal.play_billing.zzix r2 = r7.zzv(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.play_billing.zzip.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzf(r3)
            goto L84
        L71:
            boolean r2 = r7.zzI(r8, r1)
            if (r2 == 0) goto L84
            com.google.android.gms.internal.play_billing.zzix r2 = r7.zzv(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.play_billing.zzip.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzf(r3)
        L84:
            int r1 = r1 + 3
            goto L1d
        L87:
            com.google.android.gms.internal.play_billing.zzjj r0 = r7.zzl
            r0.zza(r8)
            boolean r0 = r7.zzh
            if (r0 == 0) goto L95
            com.google.android.gms.internal.play_billing.zzgx r0 = r7.zzm
            r0.zza(r8)
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzip.zzf(java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.play_billing.zzix
    public final void zzg(Object obj, Object obj2) {
        zzA(obj);
        obj2.getClass();
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int iZzs = zzs(i10);
            int i11 = 1048575 & iZzs;
            int[] iArr = this.zzc;
            int iZzr = zzr(iZzs);
            int i12 = iArr[i10];
            long j10 = i11;
            switch (iZzr) {
                case 0:
                    if (zzI(obj2, i10)) {
                        zzjq.zzo(obj, j10, zzjq.zza(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzI(obj2, i10)) {
                        zzjq.zzp(obj, j10, zzjq.zzb(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzI(obj2, i10)) {
                        zzjq.zzr(obj, j10, zzjq.zzd(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzI(obj2, i10)) {
                        zzjq.zzr(obj, j10, zzjq.zzd(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzI(obj2, i10)) {
                        zzjq.zzq(obj, j10, zzjq.zzc(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzI(obj2, i10)) {
                        zzjq.zzr(obj, j10, zzjq.zzd(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzI(obj2, i10)) {
                        zzjq.zzq(obj, j10, zzjq.zzc(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzI(obj2, i10)) {
                        zzjq.zzm(obj, j10, zzjq.zzw(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzI(obj2, i10)) {
                        zzjq.zzs(obj, j10, zzjq.zzf(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzB(obj, obj2, i10);
                    break;
                case 10:
                    if (zzI(obj2, i10)) {
                        zzjq.zzs(obj, j10, zzjq.zzf(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzI(obj2, i10)) {
                        zzjq.zzq(obj, j10, zzjq.zzc(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzI(obj2, i10)) {
                        zzjq.zzq(obj, j10, zzjq.zzc(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzI(obj2, i10)) {
                        zzjq.zzq(obj, j10, zzjq.zzc(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzI(obj2, i10)) {
                        zzjq.zzr(obj, j10, zzjq.zzd(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzI(obj2, i10)) {
                        zzjq.zzq(obj, j10, zzjq.zzc(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzI(obj2, i10)) {
                        zzjq.zzr(obj, j10, zzjq.zzd(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzB(obj, obj2, i10);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zzho zzhoVarZzd = (zzho) zzjq.zzf(obj, j10);
                    zzho zzhoVar = (zzho) zzjq.zzf(obj2, j10);
                    int size = zzhoVarZzd.size();
                    int size2 = zzhoVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzhoVarZzd.zzc()) {
                            zzhoVarZzd = zzhoVarZzd.zzd(size2 + size);
                        }
                        zzhoVarZzd.addAll(zzhoVar);
                    }
                    if (size > 0) {
                        zzhoVar = zzhoVarZzd;
                    }
                    zzjq.zzs(obj, j10, zzhoVar);
                    break;
                case 50:
                    int i13 = zziz.zza;
                    zzjq.zzs(obj, j10, zzih.zza(zzjq.zzf(obj, j10), zzjq.zzf(obj2, j10)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzM(obj2, i12, i10)) {
                        zzjq.zzs(obj, j10, zzjq.zzf(obj2, j10));
                        zzE(obj, i12, i10);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzC(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case TokenParametersOuterClass$TokenParameters.MOCKRESPONSEID_FIELD_NUMBER /* 65 */:
                case TokenParametersOuterClass$TokenParameters.LGPDCONSENT_FIELD_NUMBER /* 66 */:
                case TokenParametersOuterClass$TokenParameters.IGNITEVERSION_FIELD_NUMBER /* 67 */:
                    if (zzM(obj2, i12, i10)) {
                        zzjq.zzs(obj, j10, zzjq.zzf(obj2, j10));
                        zzE(obj, i12, i10);
                        break;
                    } else {
                        break;
                    }
                case TokenParametersOuterClass$TokenParameters.IGNITEPACKAGENAME_FIELD_NUMBER /* 68 */:
                    zzC(obj, obj2, i10);
                    break;
            }
        }
        zziz.zzp(this.zzl, obj, obj2);
        if (this.zzh) {
            zziz.zzo(this.zzm, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzix
    public final void zzh(Object obj, byte[] bArr, int i10, int i11, zzfz zzfzVar) throws IOException {
        zzc(obj, bArr, i10, i11, 0, zzfzVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    @Override // com.google.android.gms.internal.play_billing.zzix
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzi(java.lang.Object r19, com.google.android.gms.internal.play_billing.zzjw r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzip.zzi(java.lang.Object, com.google.android.gms.internal.play_billing.zzjw):void");
    }

    @Override // com.google.android.gms.internal.play_billing.zzix
    public final boolean zzj(Object obj, Object obj2) {
        boolean zZzE;
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int iZzs = zzs(i10);
            long j10 = iZzs & 1048575;
            switch (zzr(iZzs)) {
                case 0:
                    if (!zzH(obj, obj2, i10) || Double.doubleToLongBits(zzjq.zza(obj, j10)) != Double.doubleToLongBits(zzjq.zza(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 1:
                    if (!zzH(obj, obj2, i10) || Float.floatToIntBits(zzjq.zzb(obj, j10)) != Float.floatToIntBits(zzjq.zzb(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 2:
                    if (!zzH(obj, obj2, i10) || zzjq.zzd(obj, j10) != zzjq.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 3:
                    if (!zzH(obj, obj2, i10) || zzjq.zzd(obj, j10) != zzjq.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 4:
                    if (!zzH(obj, obj2, i10) || zzjq.zzc(obj, j10) != zzjq.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 5:
                    if (!zzH(obj, obj2, i10) || zzjq.zzd(obj, j10) != zzjq.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 6:
                    if (!zzH(obj, obj2, i10) || zzjq.zzc(obj, j10) != zzjq.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 7:
                    if (!zzH(obj, obj2, i10) || zzjq.zzw(obj, j10) != zzjq.zzw(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 8:
                    if (!zzH(obj, obj2, i10) || !zziz.zzE(zzjq.zzf(obj, j10), zzjq.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 9:
                    if (!zzH(obj, obj2, i10) || !zziz.zzE(zzjq.zzf(obj, j10), zzjq.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 10:
                    if (!zzH(obj, obj2, i10) || !zziz.zzE(zzjq.zzf(obj, j10), zzjq.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 11:
                    if (!zzH(obj, obj2, i10) || zzjq.zzc(obj, j10) != zzjq.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 12:
                    if (!zzH(obj, obj2, i10) || zzjq.zzc(obj, j10) != zzjq.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 13:
                    if (!zzH(obj, obj2, i10) || zzjq.zzc(obj, j10) != zzjq.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 14:
                    if (!zzH(obj, obj2, i10) || zzjq.zzd(obj, j10) != zzjq.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 15:
                    if (!zzH(obj, obj2, i10) || zzjq.zzc(obj, j10) != zzjq.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 16:
                    if (!zzH(obj, obj2, i10) || zzjq.zzd(obj, j10) != zzjq.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 17:
                    if (!zzH(obj, obj2, i10) || !zziz.zzE(zzjq.zzf(obj, j10), zzjq.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zZzE = zziz.zzE(zzjq.zzf(obj, j10), zzjq.zzf(obj2, j10));
                    break;
                case 50:
                    zZzE = zziz.zzE(zzjq.zzf(obj, j10), zzjq.zzf(obj2, j10));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case TokenParametersOuterClass$TokenParameters.MOCKRESPONSEID_FIELD_NUMBER /* 65 */:
                case TokenParametersOuterClass$TokenParameters.LGPDCONSENT_FIELD_NUMBER /* 66 */:
                case TokenParametersOuterClass$TokenParameters.IGNITEVERSION_FIELD_NUMBER /* 67 */:
                case TokenParametersOuterClass$TokenParameters.IGNITEPACKAGENAME_FIELD_NUMBER /* 68 */:
                    long jZzp = zzp(i10) & 1048575;
                    if (zzjq.zzc(obj, jZzp) != zzjq.zzc(obj2, jZzp) || !zziz.zzE(zzjq.zzf(obj, j10), zzjq.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                default:
            }
            if (!zZzE) {
                return false;
            }
        }
        if (!((zzhk) obj).zzc.equals(((zzhk) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzhh) obj).zzb.equals(((zzhh) obj2).zzb);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008d  */
    @Override // com.google.android.gms.internal.play_billing.zzix
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzk(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzip.zzk(java.lang.Object):boolean");
    }
}
