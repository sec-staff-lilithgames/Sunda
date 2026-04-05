package nh;

import com.inmobi.commons.core.configs.AdConfig;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class lf extends m5 {

    /* renamed from: k, reason: collision with root package name */
    public static final lf f76453k = new lf(null, new Object[0], 0);

    /* renamed from: h, reason: collision with root package name */
    public final transient Object f76454h;

    /* renamed from: i, reason: collision with root package name */
    public final transient Object[] f76455i;

    /* renamed from: j, reason: collision with root package name */
    public final transient int f76456j;

    public lf(Object obj, Object[] objArr, int i10) {
        this.f76454h = obj;
        this.f76455i = objArr;
        this.f76456j = i10;
    }

    public static lf h(int i10, Object[] objArr, g5 g5Var) {
        if (i10 == 0) {
            return f76453k;
        }
        if (i10 == 1) {
            Objects.requireNonNull(objArr[0]);
            Objects.requireNonNull(objArr[1]);
            return new lf(null, objArr, 1);
        }
        mh.p1.checkPositionIndex(i10, objArr.length >> 1);
        Object objI = i(objArr, i10, l6.f(i10), 0);
        if (objI instanceof Object[]) {
            Object[] objArr2 = (Object[]) objI;
            f5 f5Var = (f5) objArr2[2];
            if (g5Var == null) {
                throw f5Var.a();
            }
            g5Var.f76288e = f5Var;
            Object obj = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, iIntValue * 2);
            objI = obj;
            i10 = iIntValue;
        }
        return new lf(objI, objArr, i10);
    }

    public static Object i(Object[] objArr, int i10, int i11, int i12) {
        f5 f5Var = null;
        if (i10 == 1) {
            Objects.requireNonNull(objArr[i12]);
            Objects.requireNonNull(objArr[i12 ^ 1]);
            return null;
        }
        int i13 = i11 - 1;
        int i14 = 0;
        if (i11 <= 128) {
            byte[] bArr = new byte[i11];
            Arrays.fill(bArr, (byte) -1);
            int i15 = 0;
            while (i14 < i10) {
                int i16 = (i14 * 2) + i12;
                int i17 = (i15 * 2) + i12;
                Object obj = objArr[i16];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i16 ^ 1];
                Objects.requireNonNull(obj2);
                int iF = kotlin.jvm.internal.d0.F(obj.hashCode());
                while (true) {
                    int i18 = iF & i13;
                    int i19 = bArr[i18] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                    if (i19 == 255) {
                        bArr[i18] = (byte) i17;
                        if (i15 < i14) {
                            objArr[i17] = obj;
                            objArr[i17 ^ 1] = obj2;
                        }
                        i15++;
                    } else {
                        if (obj.equals(objArr[i19])) {
                            int i20 = i19 ^ 1;
                            Object obj3 = objArr[i20];
                            Objects.requireNonNull(obj3);
                            f5Var = new f5(obj, obj2, obj3);
                            objArr[i20] = obj2;
                            break;
                        }
                        iF = i18 + 1;
                    }
                }
                i14++;
            }
            return i15 == i10 ? bArr : new Object[]{bArr, Integer.valueOf(i15), f5Var};
        }
        if (i11 <= 32768) {
            short[] sArr = new short[i11];
            Arrays.fill(sArr, (short) -1);
            int i21 = 0;
            while (i14 < i10) {
                int i22 = (i14 * 2) + i12;
                int i23 = (i21 * 2) + i12;
                Object obj4 = objArr[i22];
                Objects.requireNonNull(obj4);
                Object obj5 = objArr[i22 ^ 1];
                Objects.requireNonNull(obj5);
                int iF2 = kotlin.jvm.internal.d0.F(obj4.hashCode());
                while (true) {
                    int i24 = iF2 & i13;
                    int i25 = sArr[i24] & 65535;
                    if (i25 == 65535) {
                        sArr[i24] = (short) i23;
                        if (i21 < i14) {
                            objArr[i23] = obj4;
                            objArr[i23 ^ 1] = obj5;
                        }
                        i21++;
                    } else {
                        if (obj4.equals(objArr[i25])) {
                            int i26 = i25 ^ 1;
                            Object obj6 = objArr[i26];
                            Objects.requireNonNull(obj6);
                            f5Var = new f5(obj4, obj5, obj6);
                            objArr[i26] = obj5;
                            break;
                        }
                        iF2 = i24 + 1;
                    }
                }
                i14++;
            }
            return i21 == i10 ? sArr : new Object[]{sArr, Integer.valueOf(i21), f5Var};
        }
        int[] iArr = new int[i11];
        Arrays.fill(iArr, -1);
        int i27 = 0;
        while (i14 < i10) {
            int i28 = (i14 * 2) + i12;
            int i29 = (i27 * 2) + i12;
            Object obj7 = objArr[i28];
            Objects.requireNonNull(obj7);
            Object obj8 = objArr[i28 ^ 1];
            Objects.requireNonNull(obj8);
            int iF3 = kotlin.jvm.internal.d0.F(obj7.hashCode());
            while (true) {
                int i30 = iF3 & i13;
                int i31 = iArr[i30];
                if (i31 == -1) {
                    iArr[i30] = i29;
                    if (i27 < i14) {
                        objArr[i29] = obj7;
                        objArr[i29 ^ 1] = obj8;
                    }
                    i27++;
                } else {
                    if (obj7.equals(objArr[i31])) {
                        int i32 = i31 ^ 1;
                        Object obj9 = objArr[i32];
                        Objects.requireNonNull(obj9);
                        f5Var = new f5(obj7, obj8, obj9);
                        objArr[i32] = obj8;
                        break;
                    }
                    iF3 = i30 + 1;
                }
            }
            i14++;
        }
        return i27 == i10 ? iArr : new Object[]{iArr, Integer.valueOf(i27), f5Var};
    }

    public static Object j(Object[] objArr, int i10, int i11, Object obj, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i10 == 1) {
            Object obj3 = objArr[i11];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i11 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int iF = kotlin.jvm.internal.d0.F(obj2.hashCode());
            while (true) {
                int i12 = iF & length;
                int i13 = bArr[i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                if (i13 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i13])) {
                    return objArr[i13 ^ 1];
                }
                iF = i12 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int iF2 = kotlin.jvm.internal.d0.F(obj2.hashCode());
            while (true) {
                int i14 = iF2 & length2;
                int i15 = sArr[i14] & 65535;
                if (i15 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i15])) {
                    return objArr[i15 ^ 1];
                }
                iF2 = i14 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int iF3 = kotlin.jvm.internal.d0.F(obj2.hashCode());
            while (true) {
                int i16 = iF3 & length3;
                int i17 = iArr[i16];
                if (i17 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i17])) {
                    return objArr[i17 ^ 1];
                }
                iF3 = i16 + 1;
            }
        }
    }

    @Override // nh.m5
    public final l6 a() {
        return new hf(this, this.f76455i, 0, this.f76456j);
    }

    @Override // nh.m5
    public final l6 b() {
        return new jf(this, new kf(this.f76455i, 0, this.f76456j));
    }

    @Override // nh.m5
    public final u4 c() {
        return new kf(this.f76455i, 1, this.f76456j);
    }

    @Override // nh.m5
    public final boolean f() {
        return false;
    }

    @Override // nh.m5, java.util.Map
    public Object get(Object obj) {
        Object objJ = j(this.f76455i, this.f76456j, 0, this.f76454h, obj);
        if (objJ == null) {
            return null;
        }
        return objJ;
    }

    @Override // java.util.Map
    public int size() {
        return this.f76456j;
    }
}
