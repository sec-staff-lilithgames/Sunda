package com.google.android.gms.internal.ads;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import j1.o2;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzhyc<T> implements zzhyr<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzhzj.zzt();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzhxz zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzhzc zzm;
    private final zzhvz zzn;

    private zzhyc(int[] iArr, Object[] objArr, int i10, int i11, zzhxz zzhxzVar, boolean z10, int[] iArr2, int i12, int i13, zzhyf zzhyfVar, zzhxl zzhxlVar, zzhzc zzhzcVar, zzhvz zzhvzVar, zzhxu zzhxuVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzi = zzhxzVar instanceof zzhwo;
        boolean z11 = false;
        if (zzhvzVar != null && (zzhxzVar instanceof zzhwk)) {
            z11 = true;
        }
        this.zzh = z11;
        this.zzj = iArr2;
        this.zzk = i12;
        this.zzl = i13;
        this.zzm = zzhzcVar;
        this.zzn = zzhvzVar;
        this.zzg = zzhxzVar;
    }

    private final int zzA(int i10) {
        return this.zzc[i10 + 1];
    }

    private final int zzB(int i10) {
        return this.zzc[i10 + 2];
    }

    private static int zzC(int i10) {
        return (i10 >>> 20) & 255;
    }

    private static boolean zzD(int i10) {
        return (i10 & 536870912) != 0;
    }

    private static boolean zzE(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzhwo) {
            return ((zzhwo) obj).zzaX();
        }
        return true;
    }

    private static void zzF(Object obj) {
        if (!zzE(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private static double zzG(Object obj, long j10) {
        return ((Double) zzhzj.zzn(obj, j10)).doubleValue();
    }

    private static float zzH(Object obj, long j10) {
        return ((Float) zzhzj.zzn(obj, j10)).floatValue();
    }

    private static int zzI(Object obj, long j10) {
        return ((Integer) zzhzj.zzn(obj, j10)).intValue();
    }

    private static long zzJ(Object obj, long j10) {
        return ((Long) zzhzj.zzn(obj, j10)).longValue();
    }

    private static boolean zzK(Object obj, long j10) {
        return ((Boolean) zzhzj.zzn(obj, j10)).booleanValue();
    }

    private final boolean zzL(Object obj, Object obj2, int i10) {
        return zzN(obj, i10) == zzN(obj2, i10);
    }

    private final boolean zzM(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? zzN(obj, i10) : (i12 & i13) != 0;
    }

    private final boolean zzN(Object obj, int i10) {
        int iZzB = zzB(i10);
        long j10 = iZzB & 1048575;
        if (j10 != 1048575) {
            return (zzhzj.zzd(obj, j10) & (1 << (iZzB >>> 20))) != 0;
        }
        int iZzA = zzA(i10);
        long j11 = iZzA & 1048575;
        switch (zzC(iZzA)) {
            case 0:
                return Double.doubleToRawLongBits(zzhzj.zzl(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzhzj.zzj(obj, j11)) != 0;
            case 2:
                return zzhzj.zzf(obj, j11) != 0;
            case 3:
                return zzhzj.zzf(obj, j11) != 0;
            case 4:
                return zzhzj.zzd(obj, j11) != 0;
            case 5:
                return zzhzj.zzf(obj, j11) != 0;
            case 6:
                return zzhzj.zzd(obj, j11) != 0;
            case 7:
                return zzhzj.zzh(obj, j11);
            case 8:
                Object objZzn = zzhzj.zzn(obj, j11);
                if (objZzn instanceof String) {
                    return !((String) objZzn).isEmpty();
                }
                if (objZzn instanceof zzhvi) {
                    return !zzhvi.zzb.equals(objZzn);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzhzj.zzn(obj, j11) != null;
            case 10:
                return !zzhvi.zzb.equals(zzhzj.zzn(obj, j11));
            case 11:
                return zzhzj.zzd(obj, j11) != 0;
            case 12:
                return zzhzj.zzd(obj, j11) != 0;
            case 13:
                return zzhzj.zzd(obj, j11) != 0;
            case 14:
                return zzhzj.zzf(obj, j11) != 0;
            case 15:
                return zzhzj.zzd(obj, j11) != 0;
            case 16:
                return zzhzj.zzf(obj, j11) != 0;
            case 17:
                return zzhzj.zzn(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final void zzO(Object obj, int i10) {
        int iZzB = zzB(i10);
        long j10 = 1048575 & iZzB;
        if (j10 == 1048575) {
            return;
        }
        zzhzj.zze(obj, j10, (1 << (iZzB >>> 20)) | zzhzj.zzd(obj, j10));
    }

    private final boolean zzP(Object obj, int i10, int i11) {
        return zzhzj.zzd(obj, (long) (zzB(i11) & 1048575)) == i10;
    }

    private final void zzQ(Object obj, int i10, int i11) {
        zzhzj.zze(obj, zzB(i11) & 1048575, i10);
    }

    private final int zzR(int i10) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zzS(i10, 0);
    }

    private final int zzS(int i10, int i11) {
        int[] iArr = this.zzc;
        int length = (iArr.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = iArr[i13];
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

    private static final int zzT(byte[] bArr, int i10, int i11, zzhzp zzhzpVar, Class cls, zzhuw zzhuwVar) throws IOException {
        zzhzp zzhzpVar2 = zzhzp.zza;
        switch (zzhzpVar.ordinal()) {
            case 0:
                int i12 = i10 + 8;
                zzhuwVar.zzc = Double.valueOf(Double.longBitsToDouble(zzhux.zze(bArr, i10)));
                return i12;
            case 1:
                int i13 = i10 + 4;
                zzhuwVar.zzc = Float.valueOf(Float.intBitsToFloat(zzhux.zzd(bArr, i10)));
                return i13;
            case 2:
            case 3:
                int iZzc = zzhux.zzc(bArr, i10, zzhuwVar);
                zzhuwVar.zzc = Long.valueOf(zzhuwVar.zzb);
                return iZzc;
            case 4:
            case 12:
            case 13:
                int iZza = zzhux.zza(bArr, i10, zzhuwVar);
                zzhuwVar.zzc = Integer.valueOf(zzhuwVar.zza);
                return iZza;
            case 5:
            case 15:
                int i14 = i10 + 8;
                zzhuwVar.zzc = Long.valueOf(zzhux.zze(bArr, i10));
                return i14;
            case 6:
            case 14:
                int i15 = i10 + 4;
                zzhuwVar.zzc = Integer.valueOf(zzhux.zzd(bArr, i10));
                return i15;
            case 7:
                int iZzc2 = zzhux.zzc(bArr, i10, zzhuwVar);
                zzhuwVar.zzc = Boolean.valueOf(zzhuwVar.zzb != 0);
                return iZzc2;
            case 8:
                return zzhux.zzf(bArr, i10, zzhuwVar);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return zzhux.zzh(zzhyj.zza().zzb(cls), bArr, i10, i11, zzhuwVar);
            case 11:
                return zzhux.zzg(bArr, i10, zzhuwVar);
            case 16:
                int iZza2 = zzhux.zza(bArr, i10, zzhuwVar);
                zzhuwVar.zzc = Integer.valueOf(zzhvn.zzK(zzhuwVar.zza));
                return iZza2;
            case 17:
                int iZzc3 = zzhux.zzc(bArr, i10, zzhuwVar);
                zzhuwVar.zzc = Long.valueOf(zzhvn.zzL(zzhuwVar.zzb));
                return iZzc3;
        }
    }

    private static final void zzU(int i10, Object obj, zzhzr zzhzrVar) throws IOException {
        if (obj instanceof String) {
            zzhzrVar.zzm(i10, (String) obj);
        } else {
            zzhzrVar.zzn(i10, (zzhvi) obj);
        }
    }

    public static zzhzd zzh(Object obj) {
        zzhwo zzhwoVar = (zzhwo) obj;
        zzhzd zzhzdVar = zzhwoVar.zzt;
        if (zzhzdVar != zzhzd.zza()) {
            return zzhzdVar;
        }
        zzhzd zzhzdVarZzb = zzhzd.zzb();
        zzhwoVar.zzt = zzhzdVarZzb;
        return zzhzdVarZzb;
    }

    /* JADX WARN: Removed duplicated region for block: B:187:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzhyc zzm(java.lang.Class r34, com.google.android.gms.internal.ads.zzhxw r35, com.google.android.gms.internal.ads.zzhyf r36, com.google.android.gms.internal.ads.zzhxl r37, com.google.android.gms.internal.ads.zzhzc r38, com.google.android.gms.internal.ads.zzhvz r39, com.google.android.gms.internal.ads.zzhxu r40) {
        /*
            Method dump skipped, instructions count: 1098
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhyc.zzm(java.lang.Class, com.google.android.gms.internal.ads.zzhxw, com.google.android.gms.internal.ads.zzhyf, com.google.android.gms.internal.ads.zzhxl, com.google.android.gms.internal.ads.zzhzc, com.google.android.gms.internal.ads.zzhvz, com.google.android.gms.internal.ads.zzhxu):com.google.android.gms.internal.ads.zzhyc");
    }

    private static Field zzn(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e10) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(string).length());
            com.google.android.gms.internal.play_billing.a.B(sb2, "Field ", str, " for ", name);
            throw new RuntimeException(o2.o(sb2, " not found. Known fields are ", string), e10);
        }
    }

    private final void zzo(Object obj, Object obj2, int i10) {
        if (zzN(obj2, i10)) {
            int iZzA = zzA(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = iZzA;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                int i11 = this.zzc[i10];
                String string = obj2.toString();
                StringBuilder sb2 = new StringBuilder(com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.a(i11, 38) + string.length());
                sb2.append("Source subfield ");
                sb2.append(i11);
                sb2.append(" is present but null: ");
                sb2.append(string);
                throw new IllegalStateException(sb2.toString());
            }
            zzhyr zzhyrVarZzq = zzq(i10);
            if (!zzN(obj, i10)) {
                if (zzE(object)) {
                    Object objZza = zzhyrVarZzq.zza();
                    zzhyrVarZzq.zzd(objZza, object);
                    unsafe.putObject(obj, j10, objZza);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzO(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzE(object2)) {
                Object objZza2 = zzhyrVarZzq.zza();
                zzhyrVarZzq.zzd(objZza2, object2);
                unsafe.putObject(obj, j10, objZza2);
                object2 = objZza2;
            }
            zzhyrVarZzq.zzd(object2, object);
        }
    }

    private final void zzp(Object obj, Object obj2, int i10) {
        int[] iArr = this.zzc;
        int i11 = iArr[i10];
        if (zzP(obj2, i11, i10)) {
            int iZzA = zzA(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = iZzA;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                int i12 = iArr[i10];
                String string = obj2.toString();
                StringBuilder sb2 = new StringBuilder(com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.a(i12, 38) + string.length());
                sb2.append("Source subfield ");
                sb2.append(i12);
                sb2.append(" is present but null: ");
                sb2.append(string);
                throw new IllegalStateException(sb2.toString());
            }
            zzhyr zzhyrVarZzq = zzq(i10);
            if (!zzP(obj, i11, i10)) {
                if (zzE(object)) {
                    Object objZza = zzhyrVarZzq.zza();
                    zzhyrVarZzq.zzd(objZza, object);
                    unsafe.putObject(obj, j10, objZza);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzQ(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzE(object2)) {
                Object objZza2 = zzhyrVarZzq.zza();
                zzhyrVarZzq.zzd(objZza2, object2);
                unsafe.putObject(obj, j10, objZza2);
                object2 = objZza2;
            }
            zzhyrVarZzq.zzd(object2, object);
        }
    }

    private final zzhyr zzq(int i10) {
        Object[] objArr = this.zzd;
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzhyr zzhyrVar = (zzhyr) objArr[i12];
        if (zzhyrVar != null) {
            return zzhyrVar;
        }
        zzhyr zzhyrVarZzb = zzhyj.zza().zzb((Class) objArr[i12 + 1]);
        objArr[i12] = zzhyrVarZzb;
        return zzhyrVarZzb;
    }

    private final Object zzr(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    private final zzhwu zzs(int i10) {
        int i11 = i10 / 3;
        return (zzhwu) this.zzd[i11 + i11 + 1];
    }

    private final Object zzt(Object obj, int i10) {
        zzhyr zzhyrVarZzq = zzq(i10);
        int iZzA = zzA(i10) & 1048575;
        if (!zzN(obj, i10)) {
            return zzhyrVarZzq.zza();
        }
        Object object = zzb.getObject(obj, iZzA);
        if (zzE(object)) {
            return object;
        }
        Object objZza = zzhyrVarZzq.zza();
        if (object != null) {
            zzhyrVarZzq.zzd(objZza, object);
        }
        return objZza;
    }

    private final void zzu(Object obj, int i10, Object obj2) {
        zzb.putObject(obj, zzA(i10) & 1048575, obj2);
        zzO(obj, i10);
    }

    private final Object zzv(Object obj, int i10, int i11) {
        zzhyr zzhyrVarZzq = zzq(i11);
        if (!zzP(obj, i10, i11)) {
            return zzhyrVarZzq.zza();
        }
        Object object = zzb.getObject(obj, zzA(i11) & 1048575);
        if (zzE(object)) {
            return object;
        }
        Object objZza = zzhyrVarZzq.zza();
        if (object != null) {
            zzhyrVarZzq.zzd(objZza, object);
        }
        return objZza;
    }

    private final void zzw(Object obj, int i10, int i11, Object obj2) {
        zzb.putObject(obj, zzA(i11) & 1048575, obj2);
        zzQ(obj, i10, i11);
    }

    private final Object zzx(Object obj, int i10, Object obj2, zzhzc zzhzcVar, Object obj3) {
        zzhwu zzhwuVarZzs;
        int i11 = this.zzc[i10];
        Object objZzn = zzhzj.zzn(obj, zzA(i10) & 1048575);
        if (objZzn == null || (zzhwuVarZzs = zzs(i10)) == null) {
            return obj2;
        }
        zzhxr zzhxrVarZze = ((zzhxs) zzr(i10)).zze();
        Iterator it = ((zzhxt) objZzn).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!zzhwuVarZzs.zza(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = zzhzcVar.zzh(obj3);
                }
                int iZzc = zzhxs.zzc(zzhxrVarZze, entry.getKey(), entry.getValue());
                zzhvi zzhviVar = zzhvi.zzb;
                byte[] bArr = new byte[iZzc];
                int i12 = zzhvt.zzf;
                zzhvq zzhvqVar = new zzhvq(bArr, 0, iZzc);
                try {
                    zzhxs.zzb(zzhvqVar, zzhxrVarZze, entry.getKey(), entry.getValue());
                    zzhzcVar.zzd(obj2, i11, zzhve.zza(zzhvqVar, bArr));
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return obj2;
    }

    private static boolean zzy(Object obj, int i10, zzhyr zzhyrVar) {
        return zzhyrVar.zzl(zzhzj.zzn(obj, i10 & 1048575));
    }

    private final void zzz(Object obj, int i10, zzhym zzhymVar) throws IOException {
        long j10 = i10 & 1048575;
        if (zzD(i10)) {
            zzhzj.zzo(obj, j10, zzhymVar.zzn());
        } else if (this.zzi) {
            zzhzj.zzo(obj, j10, zzhymVar.zzm());
        } else {
            zzhzj.zzo(obj, j10, zzhymVar.zzq());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhyr
    public final Object zza() {
        return ((zzhwo) this.zzg).zzbg();
    }

    @Override // com.google.android.gms.internal.ads.zzhyr
    public final boolean zzb(Object obj, Object obj2) {
        boolean zZzG;
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int iZzA = zzA(i10);
            long j10 = iZzA & 1048575;
            switch (zzC(iZzA)) {
                case 0:
                    if (!zzL(obj, obj2, i10) || Double.doubleToLongBits(zzhzj.zzl(obj, j10)) != Double.doubleToLongBits(zzhzj.zzl(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 1:
                    if (!zzL(obj, obj2, i10) || Float.floatToIntBits(zzhzj.zzj(obj, j10)) != Float.floatToIntBits(zzhzj.zzj(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 2:
                    if (!zzL(obj, obj2, i10) || zzhzj.zzf(obj, j10) != zzhzj.zzf(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 3:
                    if (!zzL(obj, obj2, i10) || zzhzj.zzf(obj, j10) != zzhzj.zzf(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 4:
                    if (!zzL(obj, obj2, i10) || zzhzj.zzd(obj, j10) != zzhzj.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 5:
                    if (!zzL(obj, obj2, i10) || zzhzj.zzf(obj, j10) != zzhzj.zzf(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 6:
                    if (!zzL(obj, obj2, i10) || zzhzj.zzd(obj, j10) != zzhzj.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 7:
                    if (!zzL(obj, obj2, i10) || zzhzj.zzh(obj, j10) != zzhzj.zzh(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 8:
                    if (!zzL(obj, obj2, i10) || !zzhyt.zzG(zzhzj.zzn(obj, j10), zzhzj.zzn(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 9:
                    if (!zzL(obj, obj2, i10) || !zzhyt.zzG(zzhzj.zzn(obj, j10), zzhzj.zzn(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 10:
                    if (!zzL(obj, obj2, i10) || !zzhyt.zzG(zzhzj.zzn(obj, j10), zzhzj.zzn(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 11:
                    if (!zzL(obj, obj2, i10) || zzhzj.zzd(obj, j10) != zzhzj.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 12:
                    if (!zzL(obj, obj2, i10) || zzhzj.zzd(obj, j10) != zzhzj.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 13:
                    if (!zzL(obj, obj2, i10) || zzhzj.zzd(obj, j10) != zzhzj.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 14:
                    if (!zzL(obj, obj2, i10) || zzhzj.zzf(obj, j10) != zzhzj.zzf(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 15:
                    if (!zzL(obj, obj2, i10) || zzhzj.zzd(obj, j10) != zzhzj.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 16:
                    if (!zzL(obj, obj2, i10) || zzhzj.zzf(obj, j10) != zzhzj.zzf(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 17:
                    if (!zzL(obj, obj2, i10) || !zzhyt.zzG(zzhzj.zzn(obj, j10), zzhzj.zzn(obj2, j10))) {
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
                    zZzG = zzhyt.zzG(zzhzj.zzn(obj, j10), zzhzj.zzn(obj2, j10));
                    break;
                case 50:
                    zZzG = zzhyt.zzG(zzhzj.zzn(obj, j10), zzhzj.zzn(obj2, j10));
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
                    long jZzB = zzB(i10) & 1048575;
                    if (zzhzj.zzd(obj, jZzB) != zzhzj.zzd(obj2, jZzB) || !zzhyt.zzG(zzhzj.zzn(obj, j10), zzhzj.zzn(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                default:
            }
            if (!zZzG) {
                return false;
            }
        }
        if (!((zzhwo) obj).zzt.equals(((zzhwo) obj2).zzt)) {
            return false;
        }
        if (this.zzh) {
            return ((zzhwk) obj).zza.equals(((zzhwk) obj2).zza);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzhyr
    public final int zzc(Object obj) {
        int i10;
        long jDoubleToLongBits;
        int i11;
        int iFloatToIntBits;
        int iZzd;
        int i12;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i13 >= iArr.length) {
                int iHashCode = ((zzhwo) obj).zzt.hashCode() + (i14 * 53);
                return this.zzh ? (iHashCode * 53) + ((zzhwk) obj).zza.zza.hashCode() : iHashCode;
            }
            int iZzA = zzA(i13);
            int i15 = 1048575 & iZzA;
            int iZzC = zzC(iZzA);
            int i16 = iArr[i13];
            long j10 = i15;
            int iHashCode2 = 37;
            switch (iZzC) {
                case 0:
                    i10 = i14 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzhzj.zzl(obj, j10));
                    byte[] bArr = zzhxb.zzb;
                    iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i14 = i10 + iZzd;
                    break;
                case 1:
                    i11 = i14 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzhzj.zzj(obj, j10));
                    i14 = iFloatToIntBits + i11;
                    break;
                case 2:
                    i10 = i14 * 53;
                    jDoubleToLongBits = zzhzj.zzf(obj, j10);
                    byte[] bArr2 = zzhxb.zzb;
                    iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i14 = i10 + iZzd;
                    break;
                case 3:
                    i10 = i14 * 53;
                    jDoubleToLongBits = zzhzj.zzf(obj, j10);
                    byte[] bArr3 = zzhxb.zzb;
                    iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i14 = i10 + iZzd;
                    break;
                case 4:
                    i10 = i14 * 53;
                    iZzd = zzhzj.zzd(obj, j10);
                    i14 = i10 + iZzd;
                    break;
                case 5:
                    i10 = i14 * 53;
                    jDoubleToLongBits = zzhzj.zzf(obj, j10);
                    byte[] bArr4 = zzhxb.zzb;
                    iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i14 = i10 + iZzd;
                    break;
                case 6:
                    i10 = i14 * 53;
                    iZzd = zzhzj.zzd(obj, j10);
                    i14 = i10 + iZzd;
                    break;
                case 7:
                    i11 = i14 * 53;
                    iFloatToIntBits = zzhxb.zzb(zzhzj.zzh(obj, j10));
                    i14 = iFloatToIntBits + i11;
                    break;
                case 8:
                    i11 = i14 * 53;
                    iFloatToIntBits = ((String) zzhzj.zzn(obj, j10)).hashCode();
                    i14 = iFloatToIntBits + i11;
                    break;
                case 9:
                    i12 = i14 * 53;
                    Object objZzn = zzhzj.zzn(obj, j10);
                    if (objZzn != null) {
                        iHashCode2 = objZzn.hashCode();
                    }
                    i14 = i12 + iHashCode2;
                    break;
                case 10:
                    i11 = i14 * 53;
                    iFloatToIntBits = zzhzj.zzn(obj, j10).hashCode();
                    i14 = iFloatToIntBits + i11;
                    break;
                case 11:
                    i10 = i14 * 53;
                    iZzd = zzhzj.zzd(obj, j10);
                    i14 = i10 + iZzd;
                    break;
                case 12:
                    i10 = i14 * 53;
                    iZzd = zzhzj.zzd(obj, j10);
                    i14 = i10 + iZzd;
                    break;
                case 13:
                    i10 = i14 * 53;
                    iZzd = zzhzj.zzd(obj, j10);
                    i14 = i10 + iZzd;
                    break;
                case 14:
                    i10 = i14 * 53;
                    jDoubleToLongBits = zzhzj.zzf(obj, j10);
                    byte[] bArr5 = zzhxb.zzb;
                    iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i14 = i10 + iZzd;
                    break;
                case 15:
                    i10 = i14 * 53;
                    iZzd = zzhzj.zzd(obj, j10);
                    i14 = i10 + iZzd;
                    break;
                case 16:
                    i10 = i14 * 53;
                    jDoubleToLongBits = zzhzj.zzf(obj, j10);
                    byte[] bArr6 = zzhxb.zzb;
                    iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i14 = i10 + iZzd;
                    break;
                case 17:
                    i12 = i14 * 53;
                    Object objZzn2 = zzhzj.zzn(obj, j10);
                    if (objZzn2 != null) {
                        iHashCode2 = objZzn2.hashCode();
                    }
                    i14 = i12 + iHashCode2;
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
                    i11 = i14 * 53;
                    iFloatToIntBits = zzhzj.zzn(obj, j10).hashCode();
                    i14 = iFloatToIntBits + i11;
                    break;
                case 50:
                    i11 = i14 * 53;
                    iFloatToIntBits = zzhzj.zzn(obj, j10).hashCode();
                    i14 = iFloatToIntBits + i11;
                    break;
                case 51:
                    if (!zzP(obj, i16, i13)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzG(obj, j10));
                        byte[] bArr7 = zzhxb.zzb;
                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i14 = i10 + iZzd;
                        break;
                    }
                case 52:
                    if (!zzP(obj, i16, i13)) {
                        break;
                    } else {
                        i11 = i14 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzH(obj, j10));
                        i14 = iFloatToIntBits + i11;
                        break;
                    }
                case 53:
                    if (!zzP(obj, i16, i13)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        jDoubleToLongBits = zzJ(obj, j10);
                        byte[] bArr8 = zzhxb.zzb;
                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i14 = i10 + iZzd;
                        break;
                    }
                case 54:
                    if (!zzP(obj, i16, i13)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        jDoubleToLongBits = zzJ(obj, j10);
                        byte[] bArr9 = zzhxb.zzb;
                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i14 = i10 + iZzd;
                        break;
                    }
                case 55:
                    if (!zzP(obj, i16, i13)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        iZzd = zzI(obj, j10);
                        i14 = i10 + iZzd;
                        break;
                    }
                case 56:
                    if (!zzP(obj, i16, i13)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        jDoubleToLongBits = zzJ(obj, j10);
                        byte[] bArr10 = zzhxb.zzb;
                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i14 = i10 + iZzd;
                        break;
                    }
                case 57:
                    if (!zzP(obj, i16, i13)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        iZzd = zzI(obj, j10);
                        i14 = i10 + iZzd;
                        break;
                    }
                case 58:
                    if (!zzP(obj, i16, i13)) {
                        break;
                    } else {
                        i11 = i14 * 53;
                        iFloatToIntBits = zzhxb.zzb(zzK(obj, j10));
                        i14 = iFloatToIntBits + i11;
                        break;
                    }
                case 59:
                    if (!zzP(obj, i16, i13)) {
                        break;
                    } else {
                        i11 = i14 * 53;
                        iFloatToIntBits = ((String) zzhzj.zzn(obj, j10)).hashCode();
                        i14 = iFloatToIntBits + i11;
                        break;
                    }
                case 60:
                    if (!zzP(obj, i16, i13)) {
                        break;
                    } else {
                        i11 = i14 * 53;
                        iFloatToIntBits = zzhzj.zzn(obj, j10).hashCode();
                        i14 = iFloatToIntBits + i11;
                        break;
                    }
                case 61:
                    if (!zzP(obj, i16, i13)) {
                        break;
                    } else {
                        i11 = i14 * 53;
                        iFloatToIntBits = zzhzj.zzn(obj, j10).hashCode();
                        i14 = iFloatToIntBits + i11;
                        break;
                    }
                case 62:
                    if (!zzP(obj, i16, i13)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        iZzd = zzI(obj, j10);
                        i14 = i10 + iZzd;
                        break;
                    }
                case 63:
                    if (!zzP(obj, i16, i13)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        iZzd = zzI(obj, j10);
                        i14 = i10 + iZzd;
                        break;
                    }
                case 64:
                    if (!zzP(obj, i16, i13)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        iZzd = zzI(obj, j10);
                        i14 = i10 + iZzd;
                        break;
                    }
                case TokenParametersOuterClass$TokenParameters.MOCKRESPONSEID_FIELD_NUMBER /* 65 */:
                    if (!zzP(obj, i16, i13)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        jDoubleToLongBits = zzJ(obj, j10);
                        byte[] bArr11 = zzhxb.zzb;
                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i14 = i10 + iZzd;
                        break;
                    }
                case TokenParametersOuterClass$TokenParameters.LGPDCONSENT_FIELD_NUMBER /* 66 */:
                    if (!zzP(obj, i16, i13)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        iZzd = zzI(obj, j10);
                        i14 = i10 + iZzd;
                        break;
                    }
                case TokenParametersOuterClass$TokenParameters.IGNITEVERSION_FIELD_NUMBER /* 67 */:
                    if (!zzP(obj, i16, i13)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        jDoubleToLongBits = zzJ(obj, j10);
                        byte[] bArr12 = zzhxb.zzb;
                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i14 = i10 + iZzd;
                        break;
                    }
                case TokenParametersOuterClass$TokenParameters.IGNITEPACKAGENAME_FIELD_NUMBER /* 68 */:
                    if (!zzP(obj, i16, i13)) {
                        break;
                    } else {
                        i11 = i14 * 53;
                        iFloatToIntBits = zzhzj.zzn(obj, j10).hashCode();
                        i14 = iFloatToIntBits + i11;
                        break;
                    }
            }
            i13 += 3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhyr
    public final void zzd(Object obj, Object obj2) {
        zzF(obj);
        obj2.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i10 >= iArr.length) {
                zzhyt.zzI(this.zzm, obj, obj2);
                if (this.zzh) {
                    zzhyt.zzH(this.zzn, obj, obj2);
                    return;
                }
                return;
            }
            int iZzA = zzA(i10);
            int i11 = 1048575 & iZzA;
            int iZzC = zzC(iZzA);
            int i12 = iArr[i10];
            long j10 = i11;
            switch (iZzC) {
                case 0:
                    if (!zzN(obj2, i10)) {
                        break;
                    } else {
                        zzhzj.zzm(obj, j10, zzhzj.zzl(obj2, j10));
                        zzO(obj, i10);
                        break;
                    }
                case 1:
                    if (!zzN(obj2, i10)) {
                        break;
                    } else {
                        zzhzj.zzk(obj, j10, zzhzj.zzj(obj2, j10));
                        zzO(obj, i10);
                        break;
                    }
                case 2:
                    if (!zzN(obj2, i10)) {
                        break;
                    } else {
                        zzhzj.zzg(obj, j10, zzhzj.zzf(obj2, j10));
                        zzO(obj, i10);
                        break;
                    }
                case 3:
                    if (!zzN(obj2, i10)) {
                        break;
                    } else {
                        zzhzj.zzg(obj, j10, zzhzj.zzf(obj2, j10));
                        zzO(obj, i10);
                        break;
                    }
                case 4:
                    if (!zzN(obj2, i10)) {
                        break;
                    } else {
                        zzhzj.zze(obj, j10, zzhzj.zzd(obj2, j10));
                        zzO(obj, i10);
                        break;
                    }
                case 5:
                    if (!zzN(obj2, i10)) {
                        break;
                    } else {
                        zzhzj.zzg(obj, j10, zzhzj.zzf(obj2, j10));
                        zzO(obj, i10);
                        break;
                    }
                case 6:
                    if (!zzN(obj2, i10)) {
                        break;
                    } else {
                        zzhzj.zze(obj, j10, zzhzj.zzd(obj2, j10));
                        zzO(obj, i10);
                        break;
                    }
                case 7:
                    if (!zzN(obj2, i10)) {
                        break;
                    } else {
                        zzhzj.zzi(obj, j10, zzhzj.zzh(obj2, j10));
                        zzO(obj, i10);
                        break;
                    }
                case 8:
                    if (!zzN(obj2, i10)) {
                        break;
                    } else {
                        zzhzj.zzo(obj, j10, zzhzj.zzn(obj2, j10));
                        zzO(obj, i10);
                        break;
                    }
                case 9:
                    zzo(obj, obj2, i10);
                    break;
                case 10:
                    if (!zzN(obj2, i10)) {
                        break;
                    } else {
                        zzhzj.zzo(obj, j10, zzhzj.zzn(obj2, j10));
                        zzO(obj, i10);
                        break;
                    }
                case 11:
                    if (!zzN(obj2, i10)) {
                        break;
                    } else {
                        zzhzj.zze(obj, j10, zzhzj.zzd(obj2, j10));
                        zzO(obj, i10);
                        break;
                    }
                case 12:
                    if (!zzN(obj2, i10)) {
                        break;
                    } else {
                        zzhzj.zze(obj, j10, zzhzj.zzd(obj2, j10));
                        zzO(obj, i10);
                        break;
                    }
                case 13:
                    if (!zzN(obj2, i10)) {
                        break;
                    } else {
                        zzhzj.zze(obj, j10, zzhzj.zzd(obj2, j10));
                        zzO(obj, i10);
                        break;
                    }
                case 14:
                    if (!zzN(obj2, i10)) {
                        break;
                    } else {
                        zzhzj.zzg(obj, j10, zzhzj.zzf(obj2, j10));
                        zzO(obj, i10);
                        break;
                    }
                case 15:
                    if (!zzN(obj2, i10)) {
                        break;
                    } else {
                        zzhzj.zze(obj, j10, zzhzj.zzd(obj2, j10));
                        zzO(obj, i10);
                        break;
                    }
                case 16:
                    if (!zzN(obj2, i10)) {
                        break;
                    } else {
                        zzhzj.zzg(obj, j10, zzhzj.zzf(obj2, j10));
                        zzO(obj, i10);
                        break;
                    }
                case 17:
                    zzo(obj, obj2, i10);
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
                    zzhxa zzhxaVarZzh = (zzhxa) zzhzj.zzn(obj, j10);
                    zzhxa zzhxaVar = (zzhxa) zzhzj.zzn(obj2, j10);
                    int size = zzhxaVarZzh.size();
                    int size2 = zzhxaVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzhxaVarZzh.zza()) {
                            zzhxaVarZzh = zzhxaVarZzh.zzh(size2 + size);
                        }
                        zzhxaVarZzh.addAll(zzhxaVar);
                    }
                    if (size > 0) {
                        zzhxaVar = zzhxaVarZzh;
                    }
                    zzhzj.zzo(obj, j10, zzhxaVar);
                    break;
                case 50:
                    int i13 = zzhyt.zza;
                    zzhzj.zzo(obj, j10, zzhxu.zzb(zzhzj.zzn(obj, j10), zzhzj.zzn(obj2, j10)));
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
                    if (!zzP(obj2, i12, i10)) {
                        break;
                    } else {
                        zzhzj.zzo(obj, j10, zzhzj.zzn(obj2, j10));
                        zzQ(obj, i12, i10);
                        break;
                    }
                case 60:
                    zzp(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case TokenParametersOuterClass$TokenParameters.MOCKRESPONSEID_FIELD_NUMBER /* 65 */:
                case TokenParametersOuterClass$TokenParameters.LGPDCONSENT_FIELD_NUMBER /* 66 */:
                case TokenParametersOuterClass$TokenParameters.IGNITEVERSION_FIELD_NUMBER /* 67 */:
                    if (!zzP(obj2, i12, i10)) {
                        break;
                    } else {
                        zzhzj.zzo(obj, j10, zzhzj.zzn(obj2, j10));
                        zzQ(obj, i12, i10);
                        break;
                    }
                case TokenParametersOuterClass$TokenParameters.IGNITEPACKAGENAME_FIELD_NUMBER /* 68 */:
                    zzp(obj, obj2, i10);
                    break;
            }
            i10 += 3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:195:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e4  */
    @Override // com.google.android.gms.internal.ads.zzhyr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zze(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 2030
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhyc.zze(java.lang.Object):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    @Override // com.google.android.gms.internal.ads.zzhyr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzf(java.lang.Object r21, com.google.android.gms.internal.ads.zzhzr r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhyc.zzf(java.lang.Object, com.google.android.gms.internal.ads.zzhzr):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
    
        r2 = r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:178:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x05a5 A[LOOP:2: B:189:0x05a1->B:191:0x05a5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0562 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0572 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:303:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:304:? A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzhyr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzg(java.lang.Object r12, com.google.android.gms.internal.ads.zzhym r13, com.google.android.gms.internal.ads.zzhvy r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhyc.zzg(java.lang.Object, com.google.android.gms.internal.ads.zzhym, com.google.android.gms.internal.ads.zzhvy):void");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final int zzi(java.lang.Object r32, byte[] r33, int r34, int r35, int r36, com.google.android.gms.internal.ads.zzhuw r37) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhyc.zzi(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.zzhuw):int");
    }

    @Override // com.google.android.gms.internal.ads.zzhyr
    public final void zzj(Object obj, byte[] bArr, int i10, int i11, zzhuw zzhuwVar) throws IOException {
        zzi(obj, bArr, i10, i11, 0, zzhuwVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    @Override // com.google.android.gms.internal.ads.zzhyr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzk(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = zzE(r8)
            if (r0 != 0) goto L8
            goto L91
        L8:
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.zzhwo
            if (r0 == 0) goto L18
            r0 = r8
            com.google.android.gms.internal.ads.zzhwo r0 = (com.google.android.gms.internal.ads.zzhwo) r0
            r0.zzbq()
            r0.zzbb()
            r0.zzaY()
        L18:
            int[] r0 = r7.zzc
            r1 = 0
        L1b:
            int r2 = r0.length
            if (r1 >= r2) goto L83
            int r2 = r7.zzA(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            int r2 = zzC(r2)
            long r3 = (long) r3
            r5 = 9
            if (r2 == r5) goto L6d
            r5 = 60
            if (r2 == r5) goto L57
            r5 = 68
            if (r2 == r5) goto L57
            switch(r2) {
                case 17: goto L6d;
                case 18: goto L4d;
                case 19: goto L4d;
                case 20: goto L4d;
                case 21: goto L4d;
                case 22: goto L4d;
                case 23: goto L4d;
                case 24: goto L4d;
                case 25: goto L4d;
                case 26: goto L4d;
                case 27: goto L4d;
                case 28: goto L4d;
                case 29: goto L4d;
                case 30: goto L4d;
                case 31: goto L4d;
                case 32: goto L4d;
                case 33: goto L4d;
                case 34: goto L4d;
                case 35: goto L4d;
                case 36: goto L4d;
                case 37: goto L4d;
                case 38: goto L4d;
                case 39: goto L4d;
                case 40: goto L4d;
                case 41: goto L4d;
                case 42: goto L4d;
                case 43: goto L4d;
                case 44: goto L4d;
                case 45: goto L4d;
                case 46: goto L4d;
                case 47: goto L4d;
                case 48: goto L4d;
                case 49: goto L4d;
                case 50: goto L3b;
                default: goto L3a;
            }
        L3a:
            goto L80
        L3b:
            sun.misc.Unsafe r2 = com.google.android.gms.internal.ads.zzhyc.zzb
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L80
            r6 = r5
            com.google.android.gms.internal.ads.zzhxt r6 = (com.google.android.gms.internal.ads.zzhxt) r6
            r6.zzd()
            r2.putObject(r8, r3, r5)
            goto L80
        L4d:
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzhzj.zzn(r8, r3)
            com.google.android.gms.internal.ads.zzhxa r2 = (com.google.android.gms.internal.ads.zzhxa) r2
            r2.zzb()
            goto L80
        L57:
            r2 = r0[r1]
            boolean r2 = r7.zzP(r8, r2, r1)
            if (r2 == 0) goto L80
            com.google.android.gms.internal.ads.zzhyr r2 = r7.zzq(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.ads.zzhyc.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzk(r3)
            goto L80
        L6d:
            boolean r2 = r7.zzN(r8, r1)
            if (r2 == 0) goto L80
            com.google.android.gms.internal.ads.zzhyr r2 = r7.zzq(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.ads.zzhyc.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzk(r3)
        L80:
            int r1 = r1 + 3
            goto L1b
        L83:
            com.google.android.gms.internal.ads.zzhzc r0 = r7.zzm
            r0.zzj(r8)
            boolean r0 = r7.zzh
            if (r0 == 0) goto L91
            com.google.android.gms.internal.ads.zzhvz r0 = r7.zzn
            r0.zza(r8)
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhyc.zzk(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00c1  */
    @Override // com.google.android.gms.internal.ads.zzhyr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzl(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhyc.zzl(java.lang.Object):boolean");
    }
}
