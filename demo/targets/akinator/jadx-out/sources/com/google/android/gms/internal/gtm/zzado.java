package com.google.android.gms.internal.gtm;

import b3.h;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a;
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
final class zzado<T> implements zzadx<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzaet.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzadl zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzaem zzm;
    private final zzabr zzn;

    private zzado(int[] iArr, Object[] objArr, int i10, int i11, zzadl zzadlVar, boolean z10, int[] iArr2, int i12, int i13, zzadr zzadrVar, zzacy zzacyVar, zzaem zzaemVar, zzabr zzabrVar, zzadg zzadgVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzi = zzadlVar instanceof zzacf;
        boolean z11 = false;
        if (zzabrVar != null && (zzadlVar instanceof zzacc)) {
            z11 = true;
        }
        this.zzh = z11;
        this.zzj = iArr2;
        this.zzk = i12;
        this.zzl = i13;
        this.zzm = zzaemVar;
        this.zzn = zzabrVar;
        this.zzg = zzadlVar;
    }

    private final Object zzA(Object obj, int i10) {
        zzadx zzadxVarZzx = zzx(i10);
        int iZzu = zzu(i10) & 1048575;
        if (!zzN(obj, i10)) {
            return zzadxVarZzx.zze();
        }
        Object object = zzb.getObject(obj, iZzu);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzadxVarZzx.zze();
        if (object != null) {
            zzadxVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzB(Object obj, int i10, int i11) {
        zzadx zzadxVarZzx = zzx(i11);
        if (!zzR(obj, i10, i11)) {
            return zzadxVarZzx.zze();
        }
        Object object = zzb.getObject(obj, zzu(i11) & 1048575);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzadxVarZzx.zze();
        if (object != null) {
            zzadxVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field zzC(Class cls, String str) {
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

    private static void zzD(Object obj) {
        if (!zzQ(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzE(Object obj, Object obj2, int i10) {
        if (zzN(obj2, i10)) {
            int iZzu = zzu(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = iZzu;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
            }
            zzadx zzadxVarZzx = zzx(i10);
            if (!zzN(obj, i10)) {
                if (zzQ(object)) {
                    Object objZze = zzadxVarZzx.zze();
                    zzadxVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j10, objZze);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzH(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzQ(object2)) {
                Object objZze2 = zzadxVarZzx.zze();
                zzadxVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j10, objZze2);
                object2 = objZze2;
            }
            zzadxVarZzx.zzg(object2, object);
        }
    }

    private final void zzF(Object obj, Object obj2, int i10) {
        int i11 = this.zzc[i10];
        if (zzR(obj2, i11, i10)) {
            int iZzu = zzu(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = iZzu;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
            }
            zzadx zzadxVarZzx = zzx(i10);
            if (!zzR(obj, i11, i10)) {
                if (zzQ(object)) {
                    Object objZze = zzadxVarZzx.zze();
                    zzadxVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j10, objZze);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzI(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzQ(object2)) {
                Object objZze2 = zzadxVarZzx.zze();
                zzadxVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j10, objZze2);
                object2 = objZze2;
            }
            zzadxVarZzx.zzg(object2, object);
        }
    }

    private final void zzG(Object obj, int i10, zzadw zzadwVar) throws IOException {
        long j10 = i10 & 1048575;
        if (zzM(i10)) {
            zzaet.zzs(obj, j10, zzadwVar.zzu());
        } else if (this.zzi) {
            zzaet.zzs(obj, j10, zzadwVar.zzt());
        } else {
            zzaet.zzs(obj, j10, zzadwVar.zzp());
        }
    }

    private final void zzH(Object obj, int i10) {
        int iZzr = zzr(i10);
        long j10 = 1048575 & iZzr;
        if (j10 == 1048575) {
            return;
        }
        zzaet.zzq(obj, j10, (1 << (iZzr >>> 20)) | zzaet.zzc(obj, j10));
    }

    private final void zzI(Object obj, int i10, int i11) {
        zzaet.zzq(obj, zzr(i11) & 1048575, i10);
    }

    private final void zzJ(Object obj, int i10, Object obj2) {
        zzb.putObject(obj, zzu(i10) & 1048575, obj2);
        zzH(obj, i10);
    }

    private final void zzK(Object obj, int i10, int i11, Object obj2) {
        zzb.putObject(obj, zzu(i11) & 1048575, obj2);
        zzI(obj, i10, i11);
    }

    private final boolean zzL(Object obj, Object obj2, int i10) {
        return zzN(obj, i10) == zzN(obj2, i10);
    }

    private static boolean zzM(int i10) {
        return (i10 & 536870912) != 0;
    }

    private final boolean zzN(Object obj, int i10) {
        int iZzr = zzr(i10);
        long j10 = iZzr & 1048575;
        if (j10 != 1048575) {
            return (zzaet.zzc(obj, j10) & (1 << (iZzr >>> 20))) != 0;
        }
        int iZzu = zzu(i10);
        long j11 = iZzu & 1048575;
        switch (zzt(iZzu)) {
            case 0:
                return Double.doubleToRawLongBits(zzaet.zza(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzaet.zzb(obj, j11)) != 0;
            case 2:
                return zzaet.zzd(obj, j11) != 0;
            case 3:
                return zzaet.zzd(obj, j11) != 0;
            case 4:
                return zzaet.zzc(obj, j11) != 0;
            case 5:
                return zzaet.zzd(obj, j11) != 0;
            case 6:
                return zzaet.zzc(obj, j11) != 0;
            case 7:
                return zzaet.zzw(obj, j11);
            case 8:
                Object objZzf = zzaet.zzf(obj, j11);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzyx) {
                    return !zzyx.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzaet.zzf(obj, j11) != null;
            case 10:
                return !zzyx.zzb.equals(zzaet.zzf(obj, j11));
            case 11:
                return zzaet.zzc(obj, j11) != 0;
            case 12:
                return zzaet.zzc(obj, j11) != 0;
            case 13:
                return zzaet.zzc(obj, j11) != 0;
            case 14:
                return zzaet.zzd(obj, j11) != 0;
            case 15:
                return zzaet.zzc(obj, j11) != 0;
            case 16:
                return zzaet.zzd(obj, j11) != 0;
            case 17:
                return zzaet.zzf(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzO(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? zzN(obj, i10) : (i12 & i13) != 0;
    }

    private static boolean zzP(Object obj, int i10, zzadx zzadxVar) {
        return zzadxVar.zzl(zzaet.zzf(obj, i10 & 1048575));
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzacf) {
            return ((zzacf) obj).zzar();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i10, int i11) {
        return zzaet.zzc(obj, (long) (zzr(i11) & 1048575)) == i10;
    }

    private static boolean zzS(Object obj, long j10) {
        return ((Boolean) zzaet.zzf(obj, j10)).booleanValue();
    }

    private static final void zzT(int i10, Object obj, zzaez zzaezVar) throws IOException {
        if (obj instanceof String) {
            zzaezVar.zzG(i10, (String) obj);
        } else {
            zzaezVar.zzd(i10, (zzyx) obj);
        }
    }

    public static zzaen zzd(Object obj) {
        zzacf zzacfVar = (zzacf) obj;
        zzaen zzaenVar = zzacfVar.zzc;
        if (zzaenVar != zzaen.zzc()) {
            return zzaenVar;
        }
        zzaen zzaenVarZzf = zzaen.zzf();
        zzacfVar.zzc = zzaenVarZzf;
        return zzaenVarZzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:187:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.gtm.zzado zzm(java.lang.Class r34, com.google.android.gms.internal.gtm.zzadi r35, com.google.android.gms.internal.gtm.zzadr r36, com.google.android.gms.internal.gtm.zzacy r37, com.google.android.gms.internal.gtm.zzaem r38, com.google.android.gms.internal.gtm.zzabr r39, com.google.android.gms.internal.gtm.zzadg r40) {
        /*
            Method dump skipped, instructions count: 1098
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzado.zzm(java.lang.Class, com.google.android.gms.internal.gtm.zzadi, com.google.android.gms.internal.gtm.zzadr, com.google.android.gms.internal.gtm.zzacy, com.google.android.gms.internal.gtm.zzaem, com.google.android.gms.internal.gtm.zzabr, com.google.android.gms.internal.gtm.zzadg):com.google.android.gms.internal.gtm.zzado");
    }

    private static double zzn(Object obj, long j10) {
        return ((Double) zzaet.zzf(obj, j10)).doubleValue();
    }

    private static float zzo(Object obj, long j10) {
        return ((Float) zzaet.zzf(obj, j10)).floatValue();
    }

    private static int zzp(Object obj, long j10) {
        return ((Integer) zzaet.zzf(obj, j10)).intValue();
    }

    private final int zzq(int i10) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zzs(i10, 0);
    }

    private final int zzr(int i10) {
        return this.zzc[i10 + 2];
    }

    private final int zzs(int i10, int i11) {
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

    private static int zzt(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int zzu(int i10) {
        return this.zzc[i10 + 1];
    }

    private static long zzv(Object obj, long j10) {
        return ((Long) zzaet.zzf(obj, j10)).longValue();
    }

    private final zzacj zzw(int i10) {
        int i11 = i10 / 3;
        return (zzacj) this.zzd[i11 + i11 + 1];
    }

    private final zzadx zzx(int i10) {
        Object[] objArr = this.zzd;
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzadx zzadxVar = (zzadx) objArr[i12];
        if (zzadxVar != null) {
            return zzadxVar;
        }
        zzadx zzadxVarZzb = zzadt.zza().zzb((Class) objArr[i12 + 1]);
        this.zzd[i12] = zzadxVarZzb;
        return zzadxVarZzb;
    }

    private final Object zzy(Object obj, int i10, Object obj2, zzaem zzaemVar, Object obj3) {
        int i11 = this.zzc[i10];
        Object objZzf = zzaet.zzf(obj, zzu(i10) & 1048575);
        if (objZzf == null || zzw(i10) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzz(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.gtm.zzadx
    public final int zza(Object obj) {
        int i10;
        int iZzC;
        int iZzD;
        int iZzC2;
        int iZzd;
        int iZzC3;
        int iZzh;
        int size;
        int iZzl;
        int iZzC4;
        int iZzC5;
        int iZzd2;
        boolean z10;
        int iZzb;
        int iZzB;
        int iZzC6;
        int iZzC7;
        int size2;
        int iZzk;
        int iZzC8;
        int size3;
        int iZzi;
        int iZzC9;
        int i11;
        int iZze;
        int iZzC10;
        int iZzC11;
        int iZzC12;
        int iZzD2;
        zzado<T> zzadoVar = this;
        Object obj2 = obj;
        Unsafe unsafe = zzb;
        int i12 = 1048575;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        int iB = 0;
        while (i14 < zzadoVar.zzc.length) {
            int iZzu = zzadoVar.zzu(i14);
            int iZzt = zzt(iZzu);
            int[] iArr = zzadoVar.zzc;
            int i16 = iArr[i14];
            int i17 = iArr[i14 + 2];
            int i18 = i17 & i12;
            if (iZzt <= 17) {
                if (i18 != i13) {
                    i15 = i18 == i12 ? 0 : unsafe.getInt(obj2, i18);
                    i13 = i18;
                }
                i10 = 1 << (i17 >>> 20);
            } else {
                i10 = 0;
            }
            int i19 = iZzu & i12;
            if (iZzt >= zzabw.zzJ.zza()) {
                zzabw.zzW.zza();
            }
            long j10 = i19;
            switch (iZzt) {
                case 0:
                    if (zzadoVar.zzO(obj2, i14, i13, i15, i10)) {
                        iB = a.B(i16 << 3, 8, iB);
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 1:
                    if (zzadoVar.zzO(obj2, i14, i13, i15, i10)) {
                        iB = a.B(i16 << 3, 4, iB);
                    }
                    zzadoVar = this;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 2:
                    if (zzadoVar.zzO(obj2, i14, i13, i15, i10)) {
                        long j11 = unsafe.getLong(obj2, j10);
                        iZzC = zzzi.zzC(i16 << 3);
                        iZzD = zzzi.zzD(j11);
                        iB += iZzD + iZzC;
                    }
                    zzadoVar = this;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 3:
                    if (zzadoVar.zzO(obj2, i14, i13, i15, i10)) {
                        long j12 = unsafe.getLong(obj2, j10);
                        iZzC = zzzi.zzC(i16 << 3);
                        iZzD = zzzi.zzD(j12);
                        iB += iZzD + iZzC;
                    }
                    zzadoVar = this;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 4:
                    if (zzadoVar.zzO(obj2, i14, i13, i15, i10)) {
                        long j13 = unsafe.getInt(obj2, j10);
                        iZzC = zzzi.zzC(i16 << 3);
                        iZzD = zzzi.zzD(j13);
                        iB += iZzD + iZzC;
                    }
                    zzadoVar = this;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 5:
                    if (zzadoVar.zzO(obj2, i14, i13, i15, i10)) {
                        iB = a.B(i16 << 3, 8, iB);
                    }
                    zzadoVar = this;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 6:
                    if (zzadoVar.zzO(obj2, i14, i13, i15, i10)) {
                        iB = a.B(i16 << 3, 4, iB);
                    }
                    zzadoVar = this;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 7:
                    if (zzadoVar.zzO(obj2, i14, i13, i15, i10)) {
                        iB = a.B(i16 << 3, 1, iB);
                    }
                    zzadoVar = this;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 8:
                    if (zzadoVar.zzO(obj2, i14, i13, i15, i10)) {
                        int i20 = i16 << 3;
                        Object object = unsafe.getObject(obj2, j10);
                        if (object instanceof zzyx) {
                            iZzC2 = zzzi.zzC(i20);
                            iZzd = ((zzyx) object).zzd();
                            iZzC3 = zzzi.zzC(iZzd);
                            iB += iZzC3 + iZzd + iZzC2;
                        } else {
                            iZzC = zzzi.zzC(i20);
                            iZzD = zzzi.zzB((String) object);
                            iB += iZzD + iZzC;
                        }
                    }
                    zzadoVar = this;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 9:
                    if (zzadoVar.zzO(obj2, i14, i13, i15, i10)) {
                        iZzh = zzadz.zzh(i16, unsafe.getObject(obj2, j10), zzadoVar.zzx(i14));
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
                    if (zzadoVar.zzO(obj2, i14, i13, i15, i10)) {
                        zzyx zzyxVar = (zzyx) unsafe.getObject(obj2, j10);
                        iZzC2 = zzzi.zzC(i16 << 3);
                        iZzd = zzyxVar.zzd();
                        iZzC3 = zzzi.zzC(iZzd);
                        iB += iZzC3 + iZzd + iZzC2;
                    }
                    zzadoVar = this;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 11:
                    if (zzadoVar.zzO(obj2, i14, i13, i15, i10)) {
                        iB = a.B(unsafe.getInt(obj2, j10), zzzi.zzC(i16 << 3), iB);
                    }
                    zzadoVar = this;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 12:
                    if (zzadoVar.zzO(obj2, i14, i13, i15, i10)) {
                        long j14 = unsafe.getInt(obj2, j10);
                        iZzC = zzzi.zzC(i16 << 3);
                        iZzD = zzzi.zzD(j14);
                        iB += iZzD + iZzC;
                    }
                    zzadoVar = this;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 13:
                    if (zzadoVar.zzO(obj2, i14, i13, i15, i10)) {
                        iB = a.B(i16 << 3, 4, iB);
                    }
                    zzadoVar = this;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 14:
                    if (zzadoVar.zzO(obj2, i14, i13, i15, i10)) {
                        iB = a.B(i16 << 3, 8, iB);
                    }
                    zzadoVar = this;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 15:
                    if (zzadoVar.zzO(obj2, i14, i13, i15, i10)) {
                        int i21 = unsafe.getInt(obj2, j10);
                        iB = a.B((i21 >> 31) ^ (i21 + i21), zzzi.zzC(i16 << 3), iB);
                    }
                    zzadoVar = this;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 16:
                    if (zzadoVar.zzO(obj2, i14, i13, i15, i10)) {
                        long j15 = unsafe.getLong(obj2, j10);
                        iZzC = zzzi.zzC(i16 << 3);
                        iZzD = zzzi.zzD((j15 >> 63) ^ (j15 + j15));
                        iB += iZzD + iZzC;
                    }
                    zzadoVar = this;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 17:
                    if (zzadoVar.zzO(obj2, i14, i13, i15, i10)) {
                        iB += zzzi.zzy(i16, (zzadl) unsafe.getObject(obj2, j10), zzadoVar.zzx(i14));
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 18:
                    iZzh = zzadz.zzd(i16, (List) unsafe.getObject(obj2, j10), false);
                    iB += iZzh;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 19:
                    iZzh = zzadz.zzb(i16, (List) unsafe.getObject(obj2, j10), false);
                    iB += iZzh;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 20:
                    List list = (List) unsafe.getObject(obj2, j10);
                    int i22 = zzadz.zza;
                    iZzC5 = list.size() == 0 ? 0 : (zzzi.zzC(i16 << 3) * list.size()) + zzadz.zzg(list);
                    iB += iZzC5;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 21:
                    List list2 = (List) unsafe.getObject(obj2, j10);
                    int i23 = zzadz.zza;
                    size = list2.size();
                    if (size != 0) {
                        iZzl = zzadz.zzl(list2);
                        iZzC4 = zzzi.zzC(i16 << 3);
                        iZzC5 = (iZzC4 * size) + iZzl;
                        iB += iZzC5;
                        i14 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    }
                    iB += iZzC5;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 22:
                    List list3 = (List) unsafe.getObject(obj2, j10);
                    int i24 = zzadz.zza;
                    size = list3.size();
                    if (size != 0) {
                        iZzl = zzadz.zzf(list3);
                        iZzC4 = zzzi.zzC(i16 << 3);
                        iZzC5 = (iZzC4 * size) + iZzl;
                        iB += iZzC5;
                        i14 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    }
                    iB += iZzC5;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 23:
                    iZzd2 = zzadz.zzd(i16, (List) unsafe.getObject(obj2, j10), false);
                    iB += iZzd2;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 24:
                    z10 = false;
                    iZzb = zzadz.zzb(i16, (List) unsafe.getObject(obj2, j10), false);
                    iB += iZzb;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 25:
                    List list4 = (List) unsafe.getObject(obj2, j10);
                    int i25 = zzadz.zza;
                    int size4 = list4.size();
                    iZzd2 = size4 == 0 ? 0 : size4 * (zzzi.zzC(i16 << 3) + 1);
                    iB += iZzd2;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 26:
                    List list5 = (List) unsafe.getObject(obj2, j10);
                    int i26 = zzadz.zza;
                    int size5 = list5.size();
                    if (size5 == 0) {
                        iZzB = 0;
                    } else {
                        int iZzC13 = zzzi.zzC(i16 << 3) * size5;
                        if (list5 instanceof zzacx) {
                            zzacx zzacxVar = (zzacx) list5;
                            iZzB = iZzC13;
                            for (int i27 = 0; i27 < size5; i27++) {
                                Object objZzb = zzacxVar.zzb();
                                if (objZzb instanceof zzyx) {
                                    int iZzd3 = ((zzyx) objZzb).zzd();
                                    iZzB = a.B(iZzd3, iZzd3, iZzB);
                                } else {
                                    iZzB = zzzi.zzB((String) objZzb) + iZzB;
                                }
                            }
                        } else {
                            iZzB = iZzC13;
                            for (int i28 = 0; i28 < size5; i28++) {
                                Object obj3 = list5.get(i28);
                                if (obj3 instanceof zzyx) {
                                    int iZzd4 = ((zzyx) obj3).zzd();
                                    iZzB = a.B(iZzd4, iZzd4, iZzB);
                                } else {
                                    iZzB = zzzi.zzB((String) obj3) + iZzB;
                                }
                            }
                        }
                    }
                    iB += iZzB;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 27:
                    List list6 = (List) unsafe.getObject(obj2, j10);
                    zzadx zzadxVarZzx = zzadoVar.zzx(i14);
                    int i29 = zzadz.zza;
                    int size6 = list6.size();
                    if (size6 == 0) {
                        iZzC6 = 0;
                    } else {
                        iZzC6 = zzzi.zzC(i16 << 3) * size6;
                        for (int i30 = 0; i30 < size6; i30++) {
                            Object obj4 = list6.get(i30);
                            if (obj4 instanceof zzacw) {
                                int iZza = ((zzacw) obj4).zza();
                                iZzC6 = a.B(iZza, iZza, iZzC6);
                            } else {
                                iZzC6 = zzzi.zzA((zzadl) obj4, zzadxVarZzx) + iZzC6;
                            }
                        }
                    }
                    iB += iZzC6;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 28:
                    List list7 = (List) unsafe.getObject(obj2, j10);
                    int i31 = zzadz.zza;
                    int size7 = list7.size();
                    if (size7 == 0) {
                        iZzC7 = 0;
                    } else {
                        iZzC7 = zzzi.zzC(i16 << 3) * size7;
                        for (int i32 = 0; i32 < list7.size(); i32++) {
                            int iZzd5 = ((zzyx) list7.get(i32)).zzd();
                            iZzC7 = a.B(iZzd5, iZzd5, iZzC7);
                        }
                    }
                    iB += iZzC7;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 29:
                    List list8 = (List) unsafe.getObject(obj2, j10);
                    int i33 = zzadz.zza;
                    size2 = list8.size();
                    if (size2 != 0) {
                        iZzk = zzadz.zzk(list8);
                        iZzC8 = zzzi.zzC(i16 << 3);
                        iZzd2 = iZzk + (iZzC8 * size2);
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
                    int i34 = zzadz.zza;
                    size2 = list9.size();
                    if (size2 != 0) {
                        iZzk = zzadz.zza(list9);
                        iZzC8 = zzzi.zzC(i16 << 3);
                        iZzd2 = iZzk + (iZzC8 * size2);
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
                    iZzd2 = zzadz.zzb(i16, (List) unsafe.getObject(obj2, j10), false);
                    iB += iZzd2;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 32:
                    z10 = false;
                    iZzb = zzadz.zzd(i16, (List) unsafe.getObject(obj2, j10), false);
                    iB += iZzb;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 33:
                    List list10 = (List) unsafe.getObject(obj2, j10);
                    int i35 = zzadz.zza;
                    size3 = list10.size();
                    if (size3 != 0) {
                        iZzi = zzadz.zzi(list10);
                        iZzC9 = zzzi.zzC(i16 << 3);
                        i11 = (iZzC9 * size3) + iZzi;
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
                    int i36 = zzadz.zza;
                    size3 = list11.size();
                    if (size3 != 0) {
                        iZzi = zzadz.zzj(list11);
                        iZzC9 = zzzi.zzC(i16 << 3);
                        i11 = (iZzC9 * size3) + iZzi;
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
                    iZze = zzadz.zze((List) unsafe.getObject(obj2, j10));
                    if (iZze > 0) {
                        iZzC10 = zzzi.zzC(i16 << 3);
                        iZzC11 = zzzi.zzC(iZze);
                        iB += iZzC11 + iZzC10 + iZze;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 36:
                    iZze = zzadz.zzc((List) unsafe.getObject(obj2, j10));
                    if (iZze > 0) {
                        iZzC10 = zzzi.zzC(i16 << 3);
                        iZzC11 = zzzi.zzC(iZze);
                        iB += iZzC11 + iZzC10 + iZze;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 37:
                    iZze = zzadz.zzg((List) unsafe.getObject(obj2, j10));
                    if (iZze > 0) {
                        iZzC10 = zzzi.zzC(i16 << 3);
                        iZzC11 = zzzi.zzC(iZze);
                        iB += iZzC11 + iZzC10 + iZze;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 38:
                    iZze = zzadz.zzl((List) unsafe.getObject(obj2, j10));
                    if (iZze > 0) {
                        iZzC10 = zzzi.zzC(i16 << 3);
                        iZzC11 = zzzi.zzC(iZze);
                        iB += iZzC11 + iZzC10 + iZze;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 39:
                    iZze = zzadz.zzf((List) unsafe.getObject(obj2, j10));
                    if (iZze > 0) {
                        iZzC10 = zzzi.zzC(i16 << 3);
                        iZzC11 = zzzi.zzC(iZze);
                        iB += iZzC11 + iZzC10 + iZze;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 40:
                    iZze = zzadz.zze((List) unsafe.getObject(obj2, j10));
                    if (iZze > 0) {
                        iZzC10 = zzzi.zzC(i16 << 3);
                        iZzC11 = zzzi.zzC(iZze);
                        iB += iZzC11 + iZzC10 + iZze;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 41:
                    iZze = zzadz.zzc((List) unsafe.getObject(obj2, j10));
                    if (iZze > 0) {
                        iZzC10 = zzzi.zzC(i16 << 3);
                        iZzC11 = zzzi.zzC(iZze);
                        iB += iZzC11 + iZzC10 + iZze;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 42:
                    List list12 = (List) unsafe.getObject(obj2, j10);
                    int i37 = zzadz.zza;
                    iZze = list12.size();
                    if (iZze > 0) {
                        iZzC10 = zzzi.zzC(i16 << 3);
                        iZzC11 = zzzi.zzC(iZze);
                        iB += iZzC11 + iZzC10 + iZze;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 43:
                    iZze = zzadz.zzk((List) unsafe.getObject(obj2, j10));
                    if (iZze > 0) {
                        iZzC10 = zzzi.zzC(i16 << 3);
                        iZzC11 = zzzi.zzC(iZze);
                        iB += iZzC11 + iZzC10 + iZze;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 44:
                    iZze = zzadz.zza((List) unsafe.getObject(obj2, j10));
                    if (iZze > 0) {
                        iZzC10 = zzzi.zzC(i16 << 3);
                        iZzC11 = zzzi.zzC(iZze);
                        iB += iZzC11 + iZzC10 + iZze;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 45:
                    iZze = zzadz.zzc((List) unsafe.getObject(obj2, j10));
                    if (iZze > 0) {
                        iZzC10 = zzzi.zzC(i16 << 3);
                        iZzC11 = zzzi.zzC(iZze);
                        iB += iZzC11 + iZzC10 + iZze;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 46:
                    iZze = zzadz.zze((List) unsafe.getObject(obj2, j10));
                    if (iZze > 0) {
                        iZzC10 = zzzi.zzC(i16 << 3);
                        iZzC11 = zzzi.zzC(iZze);
                        iB += iZzC11 + iZzC10 + iZze;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 47:
                    iZze = zzadz.zzi((List) unsafe.getObject(obj2, j10));
                    if (iZze > 0) {
                        iZzC10 = zzzi.zzC(i16 << 3);
                        iZzC11 = zzzi.zzC(iZze);
                        iB += iZzC11 + iZzC10 + iZze;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 48:
                    iZze = zzadz.zzj((List) unsafe.getObject(obj2, j10));
                    if (iZze > 0) {
                        iZzC10 = zzzi.zzC(i16 << 3);
                        iZzC11 = zzzi.zzC(iZze);
                        iB += iZzC11 + iZzC10 + iZze;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 49:
                    List list13 = (List) unsafe.getObject(obj2, j10);
                    zzadx zzadxVarZzx2 = zzadoVar.zzx(i14);
                    int i38 = zzadz.zza;
                    int size8 = list13.size();
                    if (size8 == 0) {
                        i11 = 0;
                    } else {
                        int iZzy = 0;
                        for (int i39 = 0; i39 < size8; i39++) {
                            iZzy += zzzi.zzy(i16, (zzadl) list13.get(i39), zzadxVarZzx2);
                        }
                        i11 = iZzy;
                    }
                    iB += i11;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 50:
                    zzadf zzadfVar = (zzadf) unsafe.getObject(obj2, j10);
                    if (!zzadfVar.isEmpty()) {
                        Iterator it = zzadfVar.entrySet().iterator();
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
                    if (zzadoVar.zzR(obj2, i16, i14)) {
                        iB = a.B(i16 << 3, 8, iB);
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 52:
                    if (zzadoVar.zzR(obj2, i16, i14)) {
                        iB = a.B(i16 << 3, 4, iB);
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 53:
                    if (zzadoVar.zzR(obj2, i16, i14)) {
                        long jZzv = zzv(obj2, j10);
                        iZzC12 = zzzi.zzC(i16 << 3);
                        iZzD2 = zzzi.zzD(jZzv);
                        iB += iZzD2 + iZzC12;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 54:
                    if (zzadoVar.zzR(obj2, i16, i14)) {
                        long jZzv2 = zzv(obj2, j10);
                        iZzC12 = zzzi.zzC(i16 << 3);
                        iZzD2 = zzzi.zzD(jZzv2);
                        iB += iZzD2 + iZzC12;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 55:
                    if (zzadoVar.zzR(obj2, i16, i14)) {
                        long jZzp = zzp(obj2, j10);
                        iZzC12 = zzzi.zzC(i16 << 3);
                        iZzD2 = zzzi.zzD(jZzp);
                        iB += iZzD2 + iZzC12;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 56:
                    if (zzadoVar.zzR(obj2, i16, i14)) {
                        iB = a.B(i16 << 3, 8, iB);
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 57:
                    if (zzadoVar.zzR(obj2, i16, i14)) {
                        iB = a.B(i16 << 3, 4, iB);
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 58:
                    if (zzadoVar.zzR(obj2, i16, i14)) {
                        iB = a.B(i16 << 3, 1, iB);
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 59:
                    if (zzadoVar.zzR(obj2, i16, i14)) {
                        int i40 = i16 << 3;
                        Object object2 = unsafe.getObject(obj2, j10);
                        if (object2 instanceof zzyx) {
                            iZze = zzzi.zzC(i40);
                            iZzC10 = ((zzyx) object2).zzd();
                            iZzC11 = zzzi.zzC(iZzC10);
                            iB += iZzC11 + iZzC10 + iZze;
                        } else {
                            iZzC12 = zzzi.zzC(i40);
                            iZzD2 = zzzi.zzB((String) object2);
                            iB += iZzD2 + iZzC12;
                        }
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 60:
                    if (zzadoVar.zzR(obj2, i16, i14)) {
                        iZzd2 = zzadz.zzh(i16, unsafe.getObject(obj2, j10), zzadoVar.zzx(i14));
                        iB += iZzd2;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 61:
                    if (zzadoVar.zzR(obj2, i16, i14)) {
                        zzyx zzyxVar2 = (zzyx) unsafe.getObject(obj2, j10);
                        iZze = zzzi.zzC(i16 << 3);
                        iZzC10 = zzyxVar2.zzd();
                        iZzC11 = zzzi.zzC(iZzC10);
                        iB += iZzC11 + iZzC10 + iZze;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 62:
                    if (zzadoVar.zzR(obj2, i16, i14)) {
                        iB = a.B(zzp(obj2, j10), zzzi.zzC(i16 << 3), iB);
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 63:
                    if (zzadoVar.zzR(obj2, i16, i14)) {
                        long jZzp2 = zzp(obj2, j10);
                        iZzC12 = zzzi.zzC(i16 << 3);
                        iZzD2 = zzzi.zzD(jZzp2);
                        iB += iZzD2 + iZzC12;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 64:
                    if (zzadoVar.zzR(obj2, i16, i14)) {
                        iB = a.B(i16 << 3, 4, iB);
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case TokenParametersOuterClass$TokenParameters.MOCKRESPONSEID_FIELD_NUMBER /* 65 */:
                    if (zzadoVar.zzR(obj2, i16, i14)) {
                        iB = a.B(i16 << 3, 8, iB);
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case TokenParametersOuterClass$TokenParameters.LGPDCONSENT_FIELD_NUMBER /* 66 */:
                    if (zzadoVar.zzR(obj2, i16, i14)) {
                        int iZzp = zzp(obj2, j10);
                        iB = a.B((iZzp >> 31) ^ (iZzp + iZzp), zzzi.zzC(i16 << 3), iB);
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case TokenParametersOuterClass$TokenParameters.IGNITEVERSION_FIELD_NUMBER /* 67 */:
                    if (zzadoVar.zzR(obj2, i16, i14)) {
                        long jZzv3 = zzv(obj2, j10);
                        iZzC12 = zzzi.zzC(i16 << 3);
                        iZzD2 = zzzi.zzD((jZzv3 >> 63) ^ (jZzv3 + jZzv3));
                        iB += iZzD2 + iZzC12;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case TokenParametersOuterClass$TokenParameters.IGNITEPACKAGENAME_FIELD_NUMBER /* 68 */:
                    if (zzadoVar.zzR(obj2, i16, i14)) {
                        iB += zzzi.zzy(i16, (zzadl) unsafe.getObject(obj2, j10), zzadoVar.zzx(i14));
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
        int iZza2 = ((zzacf) obj).zzc.zza() + iB;
        if (!zzadoVar.zzh) {
            return iZza2;
        }
        zzabv zzabvVar = ((zzacc) obj).zza;
        int iZzc = zzabvVar.zza.zzc();
        for (int i41 = 0; i41 < iZzc; i41++) {
            Map.Entry entryZzg = zzabvVar.zza.zzg(i41);
            iZzb2 += zzabv.zzb((zzabu) ((zzaeb) entryZzg).zza(), entryZzg.getValue());
        }
        for (Map.Entry entry2 : zzabvVar.zza.zzd()) {
            iZzb2 += zzabv.zzb((zzabu) entry2.getKey(), entry2.getValue());
        }
        return iZza2 + iZzb2;
    }

    @Override // com.google.android.gms.internal.gtm.zzadx
    public final int zzb(Object obj) {
        int i10;
        long jDoubleToLongBits;
        int i11;
        int iFloatToIntBits;
        int iZzc;
        int i12;
        int i13 = 0;
        for (int i14 = 0; i14 < this.zzc.length; i14 += 3) {
            int iZzu = zzu(i14);
            int[] iArr = this.zzc;
            int i15 = 1048575 & iZzu;
            int iZzt = zzt(iZzu);
            int i16 = iArr[i14];
            long j10 = i15;
            int iHashCode = 37;
            switch (iZzt) {
                case 0:
                    i10 = i13 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzaet.zza(obj, j10));
                    byte[] bArr = zzaco.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iZzc;
                    break;
                case 1:
                    i11 = i13 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzaet.zzb(obj, j10));
                    i13 = iFloatToIntBits + i11;
                    break;
                case 2:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zzaet.zzd(obj, j10);
                    byte[] bArr2 = zzaco.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iZzc;
                    break;
                case 3:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zzaet.zzd(obj, j10);
                    byte[] bArr3 = zzaco.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iZzc;
                    break;
                case 4:
                    i10 = i13 * 53;
                    iZzc = zzaet.zzc(obj, j10);
                    i13 = i10 + iZzc;
                    break;
                case 5:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zzaet.zzd(obj, j10);
                    byte[] bArr4 = zzaco.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iZzc;
                    break;
                case 6:
                    i10 = i13 * 53;
                    iZzc = zzaet.zzc(obj, j10);
                    i13 = i10 + iZzc;
                    break;
                case 7:
                    i11 = i13 * 53;
                    iFloatToIntBits = zzaco.zza(zzaet.zzw(obj, j10));
                    i13 = iFloatToIntBits + i11;
                    break;
                case 8:
                    i11 = i13 * 53;
                    iFloatToIntBits = ((String) zzaet.zzf(obj, j10)).hashCode();
                    i13 = iFloatToIntBits + i11;
                    break;
                case 9:
                    i12 = i13 * 53;
                    Object objZzf = zzaet.zzf(obj, j10);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i13 = i12 + iHashCode;
                    break;
                case 10:
                    i11 = i13 * 53;
                    iFloatToIntBits = zzaet.zzf(obj, j10).hashCode();
                    i13 = iFloatToIntBits + i11;
                    break;
                case 11:
                    i10 = i13 * 53;
                    iZzc = zzaet.zzc(obj, j10);
                    i13 = i10 + iZzc;
                    break;
                case 12:
                    i10 = i13 * 53;
                    iZzc = zzaet.zzc(obj, j10);
                    i13 = i10 + iZzc;
                    break;
                case 13:
                    i10 = i13 * 53;
                    iZzc = zzaet.zzc(obj, j10);
                    i13 = i10 + iZzc;
                    break;
                case 14:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zzaet.zzd(obj, j10);
                    byte[] bArr5 = zzaco.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iZzc;
                    break;
                case 15:
                    i10 = i13 * 53;
                    iZzc = zzaet.zzc(obj, j10);
                    i13 = i10 + iZzc;
                    break;
                case 16:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zzaet.zzd(obj, j10);
                    byte[] bArr6 = zzaco.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iZzc;
                    break;
                case 17:
                    i12 = i13 * 53;
                    Object objZzf2 = zzaet.zzf(obj, j10);
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
                    iFloatToIntBits = zzaet.zzf(obj, j10).hashCode();
                    i13 = iFloatToIntBits + i11;
                    break;
                case 50:
                    i11 = i13 * 53;
                    iFloatToIntBits = zzaet.zzf(obj, j10).hashCode();
                    i13 = iFloatToIntBits + i11;
                    break;
                case 51:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzn(obj, j10));
                        byte[] bArr7 = zzaco.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i16, i14)) {
                        i11 = i13 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzo(obj, j10));
                        i13 = iFloatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzv(obj, j10);
                        byte[] bArr8 = zzaco.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzv(obj, j10);
                        byte[] bArr9 = zzaco.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        iZzc = zzp(obj, j10);
                        i13 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzv(obj, j10);
                        byte[] bArr10 = zzaco.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        iZzc = zzp(obj, j10);
                        i13 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i16, i14)) {
                        i11 = i13 * 53;
                        iFloatToIntBits = zzaco.zza(zzS(obj, j10));
                        i13 = iFloatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i16, i14)) {
                        i11 = i13 * 53;
                        iFloatToIntBits = ((String) zzaet.zzf(obj, j10)).hashCode();
                        i13 = iFloatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzR(obj, i16, i14)) {
                        i11 = i13 * 53;
                        iFloatToIntBits = zzaet.zzf(obj, j10).hashCode();
                        i13 = iFloatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i16, i14)) {
                        i11 = i13 * 53;
                        iFloatToIntBits = zzaet.zzf(obj, j10).hashCode();
                        i13 = iFloatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        iZzc = zzp(obj, j10);
                        i13 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        iZzc = zzp(obj, j10);
                        i13 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        iZzc = zzp(obj, j10);
                        i13 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case TokenParametersOuterClass$TokenParameters.MOCKRESPONSEID_FIELD_NUMBER /* 65 */:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzv(obj, j10);
                        byte[] bArr11 = zzaco.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case TokenParametersOuterClass$TokenParameters.LGPDCONSENT_FIELD_NUMBER /* 66 */:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        iZzc = zzp(obj, j10);
                        i13 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case TokenParametersOuterClass$TokenParameters.IGNITEVERSION_FIELD_NUMBER /* 67 */:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzv(obj, j10);
                        byte[] bArr12 = zzaco.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case TokenParametersOuterClass$TokenParameters.IGNITEPACKAGENAME_FIELD_NUMBER /* 68 */:
                    if (zzR(obj, i16, i14)) {
                        i11 = i13 * 53;
                        iFloatToIntBits = zzaet.zzf(obj, j10).hashCode();
                        i13 = iFloatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = ((zzacf) obj).zzc.hashCode() + (i13 * 53);
        return this.zzh ? (iHashCode2 * 53) + ((zzacc) obj).zza.zza.hashCode() : iHashCode2;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final int zzc(java.lang.Object r30, byte[] r31, int r32, int r33, int r34, com.google.android.gms.internal.gtm.zzyl r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 4106
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzado.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.gtm.zzyl):int");
    }

    @Override // com.google.android.gms.internal.gtm.zzadx
    public final Object zze() {
        return ((zzacf) this.zzg).zzae();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    @Override // com.google.android.gms.internal.gtm.zzadx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzf(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = zzQ(r8)
            if (r0 != 0) goto L8
            goto L95
        L8:
            boolean r0 = r8 instanceof com.google.android.gms.internal.gtm.zzacf
            r1 = 0
            if (r0 == 0) goto L1b
            r0 = r8
            com.google.android.gms.internal.gtm.zzacf r0 = (com.google.android.gms.internal.gtm.zzacf) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.zzap(r2)
            r0.zzb = r1
            r0.zzan()
        L1b:
            int[] r0 = r7.zzc
        L1d:
            int r2 = r0.length
            if (r1 >= r2) goto L87
            int r2 = r7.zzu(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            int r2 = zzt(r2)
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
            sun.misc.Unsafe r2 = com.google.android.gms.internal.gtm.zzado.zzb
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L84
            r6 = r5
            com.google.android.gms.internal.gtm.zzadf r6 = (com.google.android.gms.internal.gtm.zzadf) r6
            r6.zzc()
            r2.putObject(r8, r3, r5)
            goto L84
        L4f:
            java.lang.Object r2 = com.google.android.gms.internal.gtm.zzaet.zzf(r8, r3)
            com.google.android.gms.internal.gtm.zzacn r2 = (com.google.android.gms.internal.gtm.zzacn) r2
            r2.zzb()
            goto L84
        L59:
            int[] r2 = r7.zzc
            r2 = r2[r1]
            boolean r2 = r7.zzR(r8, r2, r1)
            if (r2 == 0) goto L84
            com.google.android.gms.internal.gtm.zzadx r2 = r7.zzx(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.gtm.zzado.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzf(r3)
            goto L84
        L71:
            boolean r2 = r7.zzN(r8, r1)
            if (r2 == 0) goto L84
            com.google.android.gms.internal.gtm.zzadx r2 = r7.zzx(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.gtm.zzado.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzf(r3)
        L84:
            int r1 = r1 + 3
            goto L1d
        L87:
            com.google.android.gms.internal.gtm.zzaem r0 = r7.zzm
            r0.zzi(r8)
            boolean r0 = r7.zzh
            if (r0 == 0) goto L95
            com.google.android.gms.internal.gtm.zzabr r0 = r7.zzn
            r0.zza(r8)
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzado.zzf(java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.gtm.zzadx
    public final void zzg(Object obj, Object obj2) {
        zzD(obj);
        obj2.getClass();
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int iZzu = zzu(i10);
            int i11 = 1048575 & iZzu;
            int[] iArr = this.zzc;
            int iZzt = zzt(iZzu);
            int i12 = iArr[i10];
            long j10 = i11;
            switch (iZzt) {
                case 0:
                    if (zzN(obj2, i10)) {
                        zzaet.zzo(obj, j10, zzaet.zza(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzN(obj2, i10)) {
                        zzaet.zzp(obj, j10, zzaet.zzb(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzN(obj2, i10)) {
                        zzaet.zzr(obj, j10, zzaet.zzd(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzN(obj2, i10)) {
                        zzaet.zzr(obj, j10, zzaet.zzd(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzN(obj2, i10)) {
                        zzaet.zzq(obj, j10, zzaet.zzc(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzN(obj2, i10)) {
                        zzaet.zzr(obj, j10, zzaet.zzd(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzN(obj2, i10)) {
                        zzaet.zzq(obj, j10, zzaet.zzc(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzN(obj2, i10)) {
                        zzaet.zzm(obj, j10, zzaet.zzw(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzN(obj2, i10)) {
                        zzaet.zzs(obj, j10, zzaet.zzf(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzE(obj, obj2, i10);
                    break;
                case 10:
                    if (zzN(obj2, i10)) {
                        zzaet.zzs(obj, j10, zzaet.zzf(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzN(obj2, i10)) {
                        zzaet.zzq(obj, j10, zzaet.zzc(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzN(obj2, i10)) {
                        zzaet.zzq(obj, j10, zzaet.zzc(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzN(obj2, i10)) {
                        zzaet.zzq(obj, j10, zzaet.zzc(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzN(obj2, i10)) {
                        zzaet.zzr(obj, j10, zzaet.zzd(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzN(obj2, i10)) {
                        zzaet.zzq(obj, j10, zzaet.zzc(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzN(obj2, i10)) {
                        zzaet.zzr(obj, j10, zzaet.zzd(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzE(obj, obj2, i10);
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
                    zzacn zzacnVarZzd = (zzacn) zzaet.zzf(obj, j10);
                    zzacn zzacnVar = (zzacn) zzaet.zzf(obj2, j10);
                    int size = zzacnVarZzd.size();
                    int size2 = zzacnVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzacnVarZzd.zzc()) {
                            zzacnVarZzd = zzacnVarZzd.zzd(size2 + size);
                        }
                        zzacnVarZzd.addAll(zzacnVar);
                    }
                    if (size > 0) {
                        zzacnVar = zzacnVarZzd;
                    }
                    zzaet.zzs(obj, j10, zzacnVar);
                    break;
                case 50:
                    int i13 = zzadz.zza;
                    zzaet.zzs(obj, j10, zzadg.zzb(zzaet.zzf(obj, j10), zzaet.zzf(obj2, j10)));
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
                    if (zzR(obj2, i12, i10)) {
                        zzaet.zzs(obj, j10, zzaet.zzf(obj2, j10));
                        zzI(obj, i12, i10);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzF(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case TokenParametersOuterClass$TokenParameters.MOCKRESPONSEID_FIELD_NUMBER /* 65 */:
                case TokenParametersOuterClass$TokenParameters.LGPDCONSENT_FIELD_NUMBER /* 66 */:
                case TokenParametersOuterClass$TokenParameters.IGNITEVERSION_FIELD_NUMBER /* 67 */:
                    if (zzR(obj2, i12, i10)) {
                        zzaet.zzs(obj, j10, zzaet.zzf(obj2, j10));
                        zzI(obj, i12, i10);
                        break;
                    } else {
                        break;
                    }
                case TokenParametersOuterClass$TokenParameters.IGNITEPACKAGENAME_FIELD_NUMBER /* 68 */:
                    zzF(obj, obj2, i10);
                    break;
            }
        }
        zzadz.zzq(this.zzm, obj, obj2);
        if (this.zzh) {
            zzadz.zzp(this.zzn, obj, obj2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x01f9, code lost:
    
        r2 = r3;
        r5 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:254:0x077c  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x078d A[LOOP:3: B:260:0x0789->B:262:0x078d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x079c  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x075a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0768 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:377:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:378:? A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.gtm.zzadx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzh(java.lang.Object r13, com.google.android.gms.internal.gtm.zzadw r14, com.google.android.gms.internal.gtm.zzabq r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2134
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzado.zzh(java.lang.Object, com.google.android.gms.internal.gtm.zzadw, com.google.android.gms.internal.gtm.zzabq):void");
    }

    @Override // com.google.android.gms.internal.gtm.zzadx
    public final void zzi(Object obj, byte[] bArr, int i10, int i11, zzyl zzylVar) throws IOException {
        zzc(obj, bArr, i10, i11, 0, zzylVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    @Override // com.google.android.gms.internal.gtm.zzadx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzj(java.lang.Object r21, com.google.android.gms.internal.gtm.zzaez r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzado.zzj(java.lang.Object, com.google.android.gms.internal.gtm.zzaez):void");
    }

    @Override // com.google.android.gms.internal.gtm.zzadx
    public final boolean zzk(Object obj, Object obj2) {
        boolean zZzJ;
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int iZzu = zzu(i10);
            long j10 = iZzu & 1048575;
            switch (zzt(iZzu)) {
                case 0:
                    if (!zzL(obj, obj2, i10) || Double.doubleToLongBits(zzaet.zza(obj, j10)) != Double.doubleToLongBits(zzaet.zza(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 1:
                    if (!zzL(obj, obj2, i10) || Float.floatToIntBits(zzaet.zzb(obj, j10)) != Float.floatToIntBits(zzaet.zzb(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 2:
                    if (!zzL(obj, obj2, i10) || zzaet.zzd(obj, j10) != zzaet.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 3:
                    if (!zzL(obj, obj2, i10) || zzaet.zzd(obj, j10) != zzaet.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 4:
                    if (!zzL(obj, obj2, i10) || zzaet.zzc(obj, j10) != zzaet.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 5:
                    if (!zzL(obj, obj2, i10) || zzaet.zzd(obj, j10) != zzaet.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 6:
                    if (!zzL(obj, obj2, i10) || zzaet.zzc(obj, j10) != zzaet.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 7:
                    if (!zzL(obj, obj2, i10) || zzaet.zzw(obj, j10) != zzaet.zzw(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 8:
                    if (!zzL(obj, obj2, i10) || !zzadz.zzJ(zzaet.zzf(obj, j10), zzaet.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 9:
                    if (!zzL(obj, obj2, i10) || !zzadz.zzJ(zzaet.zzf(obj, j10), zzaet.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 10:
                    if (!zzL(obj, obj2, i10) || !zzadz.zzJ(zzaet.zzf(obj, j10), zzaet.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 11:
                    if (!zzL(obj, obj2, i10) || zzaet.zzc(obj, j10) != zzaet.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 12:
                    if (!zzL(obj, obj2, i10) || zzaet.zzc(obj, j10) != zzaet.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 13:
                    if (!zzL(obj, obj2, i10) || zzaet.zzc(obj, j10) != zzaet.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 14:
                    if (!zzL(obj, obj2, i10) || zzaet.zzd(obj, j10) != zzaet.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 15:
                    if (!zzL(obj, obj2, i10) || zzaet.zzc(obj, j10) != zzaet.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 16:
                    if (!zzL(obj, obj2, i10) || zzaet.zzd(obj, j10) != zzaet.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 17:
                    if (!zzL(obj, obj2, i10) || !zzadz.zzJ(zzaet.zzf(obj, j10), zzaet.zzf(obj2, j10))) {
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
                    zZzJ = zzadz.zzJ(zzaet.zzf(obj, j10), zzaet.zzf(obj2, j10));
                    break;
                case 50:
                    zZzJ = zzadz.zzJ(zzaet.zzf(obj, j10), zzaet.zzf(obj2, j10));
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
                    long jZzr = zzr(i10) & 1048575;
                    if (zzaet.zzc(obj, jZzr) != zzaet.zzc(obj2, jZzr) || !zzadz.zzJ(zzaet.zzf(obj, j10), zzaet.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                default:
            }
            if (!zZzJ) {
                return false;
            }
        }
        if (!((zzacf) obj).zzc.equals(((zzacf) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzacc) obj).zza.equals(((zzacc) obj2).zza);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008d  */
    @Override // com.google.android.gms.internal.gtm.zzadx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzl(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzado.zzl(java.lang.Object):boolean");
    }
}
