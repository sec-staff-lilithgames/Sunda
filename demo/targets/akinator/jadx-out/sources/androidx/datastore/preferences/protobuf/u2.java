package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.f1;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u2 implements m3 {

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f6018q = new int[0];

    /* renamed from: r, reason: collision with root package name */
    public static final Unsafe f6019r = j4.l();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f6020a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f6021b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6022c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6023d;

    /* renamed from: e, reason: collision with root package name */
    public final r2 f6024e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f6025f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f6026g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f6027h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f6028i;

    /* renamed from: j, reason: collision with root package name */
    public final int f6029j;

    /* renamed from: k, reason: collision with root package name */
    public final int f6030k;

    /* renamed from: l, reason: collision with root package name */
    public final w2 f6031l;

    /* renamed from: m, reason: collision with root package name */
    public final b2 f6032m;

    /* renamed from: n, reason: collision with root package name */
    public final b4 f6033n;

    /* renamed from: o, reason: collision with root package name */
    public final t0 f6034o;

    /* renamed from: p, reason: collision with root package name */
    public final l2 f6035p;

    public u2(int[] iArr, Object[] objArr, int i10, int i11, r2 r2Var, boolean z10, int[] iArr2, int i12, int i13, w2 w2Var, b2 b2Var, b4 b4Var, t0 t0Var, l2 l2Var) {
        this.f6020a = iArr;
        this.f6021b = objArr;
        this.f6022c = i10;
        this.f6023d = i11;
        this.f6026g = r2Var instanceof f1;
        this.f6025f = t0Var != null && (r2Var instanceof f1.b);
        this.f6027h = z10;
        this.f6028i = iArr2;
        this.f6029j = i12;
        this.f6030k = i13;
        this.f6031l = w2Var;
        this.f6032m = b2Var;
        this.f6033n = b4Var;
        this.f6034o = t0Var;
        this.f6024e = r2Var;
        this.f6035p = l2Var;
    }

    public static Field A(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbO = e3.g.o("Field ", str, " for ");
            a.b.z(cls, sbO, " not found. Known fields are ");
            sbO.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbO.toString());
        }
    }

    public static int G(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    public static void J(int i10, Object obj, m0 m0Var) throws IOException {
        if (obj instanceof String) {
            m0Var.writeString(i10, (String) obj);
        } else {
            m0Var.writeBytes(i10, (x) obj);
        }
    }

    public static void b(Object obj) {
        if (!j(obj)) {
            throw new IllegalArgumentException(j1.o2.j(obj, "Mutating immutable message: "));
        }
    }

    public static int c(byte[] bArr, int i10, int i11, r4 r4Var, Class cls, f fVar) throws u1 {
        switch (r4Var.ordinal()) {
            case 0:
                fVar.f5870c = Double.valueOf(Double.longBitsToDouble(g.c(bArr, i10)));
                return i10 + 8;
            case 1:
                fVar.f5870c = Float.valueOf(Float.intBitsToFloat(g.b(bArr, i10)));
                return i10 + 4;
            case 2:
            case 3:
                int iT = g.t(bArr, i10, fVar);
                fVar.f5870c = Long.valueOf(fVar.f5869b);
                return iT;
            case 4:
            case 12:
            case 13:
                int iR = g.r(bArr, i10, fVar);
                fVar.f5870c = Integer.valueOf(fVar.f5868a);
                return iR;
            case 5:
            case 15:
                fVar.f5870c = Long.valueOf(g.c(bArr, i10));
                return i10 + 8;
            case 6:
            case 14:
                fVar.f5870c = Integer.valueOf(g.b(bArr, i10));
                return i10 + 4;
            case 7:
                int iT2 = g.t(bArr, i10, fVar);
                fVar.f5870c = Boolean.valueOf(fVar.f5869b != 0);
                return iT2;
            case 8:
                int iR2 = g.r(bArr, i10, fVar);
                int i12 = fVar.f5868a;
                if (i12 < 0) {
                    throw u1.f();
                }
                if (i12 == 0) {
                    fVar.f5870c = "";
                    return iR2;
                }
                fVar.f5870c = m4.f5958a.g(bArr, iR2, i12);
                return iR2 + i12;
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return g.e(d3.getInstance().schemaFor(cls), bArr, i10, i11, fVar);
            case 11:
                return g.a(bArr, i10, fVar);
            case 16:
                int iR3 = g.r(bArr, i10, fVar);
                fVar.f5870c = Integer.valueOf(c0.decodeZigZag32(fVar.f5868a));
                return iR3;
            case 17:
                int iT3 = g.t(bArr, i10, fVar);
                fVar.f5870c = Long.valueOf(c0.decodeZigZag64(fVar.f5869b));
                return iT3;
        }
    }

    public static boolean j(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof f1) {
            return ((f1) obj).j();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.datastore.preferences.protobuf.u2 q(androidx.datastore.preferences.protobuf.o2 r26, androidx.datastore.preferences.protobuf.w2 r27, androidx.datastore.preferences.protobuf.b2 r28, androidx.datastore.preferences.protobuf.b4 r29, androidx.datastore.preferences.protobuf.t0 r30, androidx.datastore.preferences.protobuf.l2 r31) {
        /*
            Method dump skipped, instructions count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.u2.q(androidx.datastore.preferences.protobuf.o2, androidx.datastore.preferences.protobuf.w2, androidx.datastore.preferences.protobuf.b2, androidx.datastore.preferences.protobuf.b4, androidx.datastore.preferences.protobuf.t0, androidx.datastore.preferences.protobuf.l2):androidx.datastore.preferences.protobuf.u2");
    }

    /* JADX WARN: Removed duplicated region for block: B:166:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x038f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.datastore.preferences.protobuf.u2 r(androidx.datastore.preferences.protobuf.f3 r34, androidx.datastore.preferences.protobuf.w2 r35, androidx.datastore.preferences.protobuf.b2 r36, androidx.datastore.preferences.protobuf.b4 r37, androidx.datastore.preferences.protobuf.t0 r38, androidx.datastore.preferences.protobuf.l2 r39) {
        /*
            Method dump skipped, instructions count: 1040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.u2.r(androidx.datastore.preferences.protobuf.f3, androidx.datastore.preferences.protobuf.w2, androidx.datastore.preferences.protobuf.b2, androidx.datastore.preferences.protobuf.b4, androidx.datastore.preferences.protobuf.t0, androidx.datastore.preferences.protobuf.l2):androidx.datastore.preferences.protobuf.u2");
    }

    public static long s(int i10) {
        return i10 & 1048575;
    }

    public static int t(Object obj, long j10) {
        return ((Integer) j4.f5924c.getObject(obj, j10)).intValue();
    }

    public static long u(Object obj, long j10) {
        return ((Long) j4.f5924c.getObject(obj, j10)).longValue();
    }

    public final void B(Object obj, int i10) {
        int i11 = this.f6020a[i10 + 2];
        long j10 = 1048575 & i11;
        if (j10 == 1048575) {
            return;
        }
        j4.q(obj, j10, (1 << (i11 >>> 20)) | j4.f5924c.getInt(obj, j10));
    }

    public final void C(Object obj, int i10, int i11) {
        j4.q(obj, this.f6020a[i11 + 2] & 1048575, i10);
    }

    public final int D(int i10, int i11) {
        int[] iArr = this.f6020a;
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

    public final void E(Object obj, int i10, Object obj2) {
        f6019r.putObject(obj, H(i10) & 1048575, obj2);
        B(obj, i10);
    }

    public final void F(Object obj, int i10, int i11, Object obj2) {
        f6019r.putObject(obj, H(i11) & 1048575, obj2);
        C(obj, i10, i11);
    }

    public final int H(int i10) {
        return this.f6020a[i10 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I(java.lang.Object r22, androidx.datastore.preferences.protobuf.m0 r23) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.u2.I(java.lang.Object, androidx.datastore.preferences.protobuf.m0):void");
    }

    public final boolean a(Object obj, Object obj2, int i10) {
        return h(obj, i10) == h(obj2, i10);
    }

    public final void d(int i10, Object obj, Object obj2) {
        int i11 = this.f6020a[i10];
        if (j4.f5924c.getObject(obj, H(i10) & 1048575) == null) {
            return;
        }
        e(i10);
    }

    public final void e(int i10) {
        if (this.f6021b[a.b.A(i10, 3, 2, 1)] != null) {
            throw new ClassCastException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    @Override // androidx.datastore.preferences.protobuf.m3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r12, java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 698
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.u2.equals(java.lang.Object, java.lang.Object):boolean");
    }

    public final Object f(int i10) {
        return this.f6021b[(i10 / 3) * 2];
    }

    public final m3 g(int i10) {
        int i11 = (i10 / 3) * 2;
        Object[] objArr = this.f6021b;
        m3 m3Var = (m3) objArr[i11];
        if (m3Var != null) {
            return m3Var;
        }
        m3 m3VarSchemaFor = d3.getInstance().schemaFor((Class) objArr[i11 + 1]);
        objArr[i11] = m3VarSchemaFor;
        return m3VarSchemaFor;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x06ae A[PHI: r0
      0x06ae: PHI (r0v2 androidx.datastore.preferences.protobuf.u2) = 
      (r0v1 androidx.datastore.preferences.protobuf.u2)
      (r0v1 androidx.datastore.preferences.protobuf.u2)
      (r0v1 androidx.datastore.preferences.protobuf.u2)
      (r0v29 androidx.datastore.preferences.protobuf.u2)
      (r0v1 androidx.datastore.preferences.protobuf.u2)
      (r0v1 androidx.datastore.preferences.protobuf.u2)
      (r0v1 androidx.datastore.preferences.protobuf.u2)
      (r0v1 androidx.datastore.preferences.protobuf.u2)
      (r0v1 androidx.datastore.preferences.protobuf.u2)
      (r0v1 androidx.datastore.preferences.protobuf.u2)
      (r0v1 androidx.datastore.preferences.protobuf.u2)
      (r0v1 androidx.datastore.preferences.protobuf.u2)
      (r0v1 androidx.datastore.preferences.protobuf.u2)
      (r0v1 androidx.datastore.preferences.protobuf.u2)
      (r0v1 androidx.datastore.preferences.protobuf.u2)
      (r0v1 androidx.datastore.preferences.protobuf.u2)
      (r0v1 androidx.datastore.preferences.protobuf.u2)
      (r0v1 androidx.datastore.preferences.protobuf.u2)
      (r0v1 androidx.datastore.preferences.protobuf.u2)
      (r0v1 androidx.datastore.preferences.protobuf.u2)
      (r0v1 androidx.datastore.preferences.protobuf.u2)
      (r0v1 androidx.datastore.preferences.protobuf.u2)
      (r0v1 androidx.datastore.preferences.protobuf.u2)
      (r0v1 androidx.datastore.preferences.protobuf.u2)
      (r0v1 androidx.datastore.preferences.protobuf.u2)
      (r0v1 androidx.datastore.preferences.protobuf.u2)
      (r0v1 androidx.datastore.preferences.protobuf.u2)
      (r0v1 androidx.datastore.preferences.protobuf.u2)
      (r0v1 androidx.datastore.preferences.protobuf.u2)
      (r0v1 androidx.datastore.preferences.protobuf.u2)
      (r0v1 androidx.datastore.preferences.protobuf.u2)
      (r0v1 androidx.datastore.preferences.protobuf.u2)
      (r0v1 androidx.datastore.preferences.protobuf.u2)
      (r0v1 androidx.datastore.preferences.protobuf.u2)
      (r0v1 androidx.datastore.preferences.protobuf.u2)
      (r0v1 androidx.datastore.preferences.protobuf.u2)
      (r0v1 androidx.datastore.preferences.protobuf.u2)
     binds: [B:21:0x0055, B:308:0x06a3, B:274:0x05f3, B:254:0x0597, B:247:0x0569, B:162:0x0374, B:157:0x0354, B:152:0x0334, B:147:0x0318, B:142:0x02fc, B:137:0x02e0, B:132:0x02c0, B:127:0x02a0, B:122:0x0282, B:117:0x0267, B:112:0x024c, B:107:0x022d, B:102:0x020e, B:96:0x01ee, B:85:0x0195, B:82:0x0188, B:79:0x0178, B:76:0x0168, B:73:0x0158, B:70:0x014c, B:67:0x0140, B:64:0x0133, B:57:0x0113, B:50:0x00e2, B:47:0x00d1, B:44:0x00c2, B:41:0x00b3, B:38:0x00a8, B:35:0x009d, B:32:0x008e, B:29:0x007f, B:24:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.datastore.preferences.protobuf.m3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getSerializedSize(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 1908
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.u2.getSerializedSize(java.lang.Object):int");
    }

    public final boolean h(Object obj, int i10) {
        int i11 = this.f6020a[i10 + 2];
        long j10 = i11 & 1048575;
        if (j10 == 1048575) {
            int iH = H(i10);
            long j11 = iH & 1048575;
            switch (G(iH)) {
                case 0:
                    if (Double.doubleToRawLongBits(j4.f5924c.getDouble(obj, j11)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(j4.f5924c.getFloat(obj, j11)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (j4.f5924c.getLong(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (j4.f5924c.getLong(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (j4.f5924c.getInt(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (j4.f5924c.getLong(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (j4.f5924c.getInt(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return j4.f5924c.getBoolean(obj, j11);
                case 8:
                    Object object = j4.f5924c.getObject(obj, j11);
                    if (object instanceof String) {
                        return !((String) object).isEmpty();
                    }
                    if (object instanceof x) {
                        return !x.f6099c.equals(object);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (j4.f5924c.getObject(obj, j11) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !x.f6099c.equals(j4.f5924c.getObject(obj, j11));
                case 11:
                    if (j4.f5924c.getInt(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (j4.f5924c.getInt(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (j4.f5924c.getInt(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (j4.f5924c.getLong(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (j4.f5924c.getInt(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (j4.f5924c.getLong(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (j4.f5924c.getObject(obj, j11) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            if ((j4.f5924c.getInt(obj, j10) & (1 << (i11 >>> 20))) == 0) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.m3
    public int hashCode(Object obj) {
        int i10;
        int iHashLong;
        int[] iArr = this.f6020a;
        int length = iArr.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int iH = H(i12);
            int i13 = iArr[i12];
            long j10 = 1048575 & iH;
            int iHashCode = 37;
            switch (G(iH)) {
                case 0:
                    i10 = i11 * 53;
                    iHashLong = t1.hashLong(Double.doubleToLongBits(j4.f5924c.getDouble(obj, j10)));
                    i11 = iHashLong + i10;
                    break;
                case 1:
                    i10 = i11 * 53;
                    iHashLong = Float.floatToIntBits(j4.f5924c.getFloat(obj, j10));
                    i11 = iHashLong + i10;
                    break;
                case 2:
                    i10 = i11 * 53;
                    iHashLong = t1.hashLong(j4.f5924c.getLong(obj, j10));
                    i11 = iHashLong + i10;
                    break;
                case 3:
                    i10 = i11 * 53;
                    iHashLong = t1.hashLong(j4.f5924c.getLong(obj, j10));
                    i11 = iHashLong + i10;
                    break;
                case 4:
                    i10 = i11 * 53;
                    iHashLong = j4.f5924c.getInt(obj, j10);
                    i11 = iHashLong + i10;
                    break;
                case 5:
                    i10 = i11 * 53;
                    iHashLong = t1.hashLong(j4.f5924c.getLong(obj, j10));
                    i11 = iHashLong + i10;
                    break;
                case 6:
                    i10 = i11 * 53;
                    iHashLong = j4.f5924c.getInt(obj, j10);
                    i11 = iHashLong + i10;
                    break;
                case 7:
                    i10 = i11 * 53;
                    iHashLong = t1.hashBoolean(j4.f5924c.getBoolean(obj, j10));
                    i11 = iHashLong + i10;
                    break;
                case 8:
                    i10 = i11 * 53;
                    iHashLong = ((String) j4.f5924c.getObject(obj, j10)).hashCode();
                    i11 = iHashLong + i10;
                    break;
                case 9:
                    Object object = j4.f5924c.getObject(obj, j10);
                    if (object != null) {
                        iHashCode = object.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i11 * 53;
                    iHashLong = j4.f5924c.getObject(obj, j10).hashCode();
                    i11 = iHashLong + i10;
                    break;
                case 11:
                    i10 = i11 * 53;
                    iHashLong = j4.f5924c.getInt(obj, j10);
                    i11 = iHashLong + i10;
                    break;
                case 12:
                    i10 = i11 * 53;
                    iHashLong = j4.f5924c.getInt(obj, j10);
                    i11 = iHashLong + i10;
                    break;
                case 13:
                    i10 = i11 * 53;
                    iHashLong = j4.f5924c.getInt(obj, j10);
                    i11 = iHashLong + i10;
                    break;
                case 14:
                    i10 = i11 * 53;
                    iHashLong = t1.hashLong(j4.f5924c.getLong(obj, j10));
                    i11 = iHashLong + i10;
                    break;
                case 15:
                    i10 = i11 * 53;
                    iHashLong = j4.f5924c.getInt(obj, j10);
                    i11 = iHashLong + i10;
                    break;
                case 16:
                    i10 = i11 * 53;
                    iHashLong = t1.hashLong(j4.f5924c.getLong(obj, j10));
                    i11 = iHashLong + i10;
                    break;
                case 17:
                    Object object2 = j4.f5924c.getObject(obj, j10);
                    if (object2 != null) {
                        iHashCode = object2.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
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
                    i10 = i11 * 53;
                    iHashLong = j4.f5924c.getObject(obj, j10).hashCode();
                    i11 = iHashLong + i10;
                    break;
                case 50:
                    i10 = i11 * 53;
                    iHashLong = j4.f5924c.getObject(obj, j10).hashCode();
                    i11 = iHashLong + i10;
                    break;
                case 51:
                    if (k(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iHashLong = t1.hashLong(Double.doubleToLongBits(((Double) j4.f5924c.getObject(obj, j10)).doubleValue()));
                        i11 = iHashLong + i10;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (k(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iHashLong = Float.floatToIntBits(((Float) j4.f5924c.getObject(obj, j10)).floatValue());
                        i11 = iHashLong + i10;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (k(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iHashLong = t1.hashLong(u(obj, j10));
                        i11 = iHashLong + i10;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (k(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iHashLong = t1.hashLong(u(obj, j10));
                        i11 = iHashLong + i10;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (k(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iHashLong = t(obj, j10);
                        i11 = iHashLong + i10;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (k(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iHashLong = t1.hashLong(u(obj, j10));
                        i11 = iHashLong + i10;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (k(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iHashLong = t(obj, j10);
                        i11 = iHashLong + i10;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (k(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iHashLong = t1.hashBoolean(((Boolean) j4.f5924c.getObject(obj, j10)).booleanValue());
                        i11 = iHashLong + i10;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (k(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iHashLong = ((String) j4.f5924c.getObject(obj, j10)).hashCode();
                        i11 = iHashLong + i10;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (k(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iHashLong = j4.f5924c.getObject(obj, j10).hashCode();
                        i11 = iHashLong + i10;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (k(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iHashLong = j4.f5924c.getObject(obj, j10).hashCode();
                        i11 = iHashLong + i10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (k(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iHashLong = t(obj, j10);
                        i11 = iHashLong + i10;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (k(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iHashLong = t(obj, j10);
                        i11 = iHashLong + i10;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (k(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iHashLong = t(obj, j10);
                        i11 = iHashLong + i10;
                        break;
                    } else {
                        break;
                    }
                case TokenParametersOuterClass$TokenParameters.MOCKRESPONSEID_FIELD_NUMBER /* 65 */:
                    if (k(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iHashLong = t1.hashLong(u(obj, j10));
                        i11 = iHashLong + i10;
                        break;
                    } else {
                        break;
                    }
                case TokenParametersOuterClass$TokenParameters.LGPDCONSENT_FIELD_NUMBER /* 66 */:
                    if (k(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iHashLong = t(obj, j10);
                        i11 = iHashLong + i10;
                        break;
                    } else {
                        break;
                    }
                case TokenParametersOuterClass$TokenParameters.IGNITEVERSION_FIELD_NUMBER /* 67 */:
                    if (k(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iHashLong = t1.hashLong(u(obj, j10));
                        i11 = iHashLong + i10;
                        break;
                    } else {
                        break;
                    }
                case TokenParametersOuterClass$TokenParameters.IGNITEPACKAGENAME_FIELD_NUMBER /* 68 */:
                    if (k(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iHashLong = j4.f5924c.getObject(obj, j10).hashCode();
                        i11 = iHashLong + i10;
                        break;
                    } else {
                        break;
                    }
            }
        }
        ((d4) this.f6033n).getClass();
        int iHashCode2 = ((f1) obj).unknownFields.hashCode() + (i11 * 53);
        if (!this.f6025f) {
            return iHashCode2;
        }
        ((u0) this.f6034o).getClass();
        return ((f1.b) obj).extensions.hashCode() + (iHashCode2 * 53);
    }

    public final boolean i(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? h(obj, i10) : (i12 & i13) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.m3
    public final boolean isInitialized(Object obj) {
        int i10;
        int i11;
        int i12;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        loop0: while (true) {
            if (i15 >= this.f6029j) {
                if (this.f6025f) {
                    ((u0) this.f6034o).getClass();
                    if (!((f1.b) obj).extensions.isInitialized()) {
                        break;
                    }
                }
                return true;
            }
            int i16 = this.f6028i[i15];
            int[] iArr = this.f6020a;
            int i17 = iArr[i16];
            int iH = H(i16);
            int i18 = iArr[i16 + 2];
            int i19 = i18 & 1048575;
            int i20 = 1 << (i18 >>> 20);
            if (i19 != i13) {
                if (i19 != 1048575) {
                    i14 = f6019r.getInt(obj, i19);
                }
                i11 = i16;
                i12 = i14;
                i10 = i19;
            } else {
                int i21 = i14;
                i10 = i13;
                i11 = i16;
                i12 = i21;
            }
            if ((268435456 & iH) != 0 && !i(obj, i11, i10, i12, i20)) {
                break;
            }
            int iG = G(iH);
            if (iG == 9 || iG == 17) {
                if (i(obj, i11, i10, i12, i20)) {
                    if (!g(i11).isInitialized(j4.f5924c.getObject(obj, iH & 1048575))) {
                        break;
                    }
                } else {
                    continue;
                }
                i15++;
                i13 = i10;
                i14 = i12;
            } else {
                if (iG != 27) {
                    if (iG == 60 || iG == 68) {
                        if (k(obj, i17, i11)) {
                            if (!g(i11).isInitialized(j4.f5924c.getObject(obj, iH & 1048575))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                        i15++;
                        i13 = i10;
                        i14 = i12;
                    } else if (iG != 49) {
                        if (iG != 50) {
                            continue;
                        } else {
                            Object object = j4.f5924c.getObject(obj, iH & 1048575);
                            m2 m2Var = (m2) this.f6035p;
                            Map<?, ?> mapForMapData = m2Var.forMapData(object);
                            if (!mapForMapData.isEmpty() && m2Var.forMapMetadata(f(i11)).f5904c.getJavaType() == s4.MESSAGE) {
                                m3 m3VarSchemaFor = null;
                                for (Object obj2 : mapForMapData.values()) {
                                    if (m3VarSchemaFor == null) {
                                        m3VarSchemaFor = d3.getInstance().schemaFor((Class) obj2.getClass());
                                    }
                                    if (!m3VarSchemaFor.isInitialized(obj2)) {
                                        break loop0;
                                    }
                                }
                            }
                        }
                        i15++;
                        i13 = i10;
                        i14 = i12;
                    }
                }
                List list = (List) j4.f5924c.getObject(obj, iH & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    m3 m3VarG = g(i11);
                    for (int i22 = 0; i22 < list.size(); i22++) {
                        if (!m3VarG.isInitialized(list.get(i22))) {
                            break loop0;
                        }
                    }
                }
                i15++;
                i13 = i10;
                i14 = i12;
            }
        }
        return false;
    }

    public final boolean k(Object obj, int i10, int i11) {
        return j4.f5924c.getInt(obj, (long) (this.f6020a[i11 + 2] & 1048575)) == i10;
    }

    public final void l(Object obj, int i10, Object obj2, s0 s0Var, d0 d0Var) throws IOException {
        long jH = H(i10) & 1048575;
        Object object = j4.f5924c.getObject(obj, jH);
        l2 l2Var = this.f6035p;
        if (object == null) {
            object = ((m2) l2Var).newMapField(obj2);
            j4.s(obj, jH, object);
        } else {
            m2 m2Var = (m2) l2Var;
            if (m2Var.isImmutable(object)) {
                Object objNewMapField = m2Var.newMapField(obj2);
                m2Var.mergeFrom(objNewMapField, object);
                j4.s(obj, jH, objNewMapField);
                object = objNewMapField;
            }
        }
        m2 m2Var2 = (m2) l2Var;
        d0Var.readMap(m2Var2.forMutableMapData(object), m2Var2.forMapMetadata(obj2), s0Var);
    }

    public final void m(Object obj, Object obj2, int i10) {
        if (h(obj2, i10)) {
            long jH = H(i10) & 1048575;
            Unsafe unsafe = f6019r;
            Object object = unsafe.getObject(obj2, jH);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f6020a[i10] + " is present but null: " + obj2);
            }
            m3 m3VarG = g(i10);
            if (!h(obj, i10)) {
                if (j(object)) {
                    Object objNewInstance = m3VarG.newInstance();
                    m3VarG.mergeFrom(objNewInstance, object);
                    unsafe.putObject(obj, jH, objNewInstance);
                } else {
                    unsafe.putObject(obj, jH, object);
                }
                B(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, jH);
            if (!j(object2)) {
                Object objNewInstance2 = m3VarG.newInstance();
                m3VarG.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(obj, jH, objNewInstance2);
                object2 = objNewInstance2;
            }
            m3VarG.mergeFrom(object2, object);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    @Override // androidx.datastore.preferences.protobuf.m3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void makeImmutable(java.lang.Object r9) {
        /*
            r8 = this;
            boolean r0 = j(r9)
            if (r0 != 0) goto L8
            goto La6
        L8:
            boolean r0 = r9 instanceof androidx.datastore.preferences.protobuf.f1
            r1 = 0
            if (r0 == 0) goto L1b
            r0 = r9
            androidx.datastore.preferences.protobuf.f1 r0 = (androidx.datastore.preferences.protobuf.f1) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.d(r2)
            r0.memoizedHashCode = r1
            r0.k()
        L1b:
            int[] r0 = r8.f6020a
            int r2 = r0.length
        L1e:
            if (r1 >= r2) goto L85
            int r3 = r8.H(r1)
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            long r4 = (long) r4
            int r3 = G(r3)
            r6 = 9
            if (r3 == r6) goto L6f
            r6 = 60
            if (r3 == r6) goto L59
            r6 = 68
            if (r3 == r6) goto L59
            switch(r3) {
                case 17: goto L6f;
                case 18: goto L51;
                case 19: goto L51;
                case 20: goto L51;
                case 21: goto L51;
                case 22: goto L51;
                case 23: goto L51;
                case 24: goto L51;
                case 25: goto L51;
                case 26: goto L51;
                case 27: goto L51;
                case 28: goto L51;
                case 29: goto L51;
                case 30: goto L51;
                case 31: goto L51;
                case 32: goto L51;
                case 33: goto L51;
                case 34: goto L51;
                case 35: goto L51;
                case 36: goto L51;
                case 37: goto L51;
                case 38: goto L51;
                case 39: goto L51;
                case 40: goto L51;
                case 41: goto L51;
                case 42: goto L51;
                case 43: goto L51;
                case 44: goto L51;
                case 45: goto L51;
                case 46: goto L51;
                case 47: goto L51;
                case 48: goto L51;
                case 49: goto L51;
                case 50: goto L3d;
                default: goto L3c;
            }
        L3c:
            goto L82
        L3d:
            sun.misc.Unsafe r3 = androidx.datastore.preferences.protobuf.u2.f6019r
            java.lang.Object r6 = r3.getObject(r9, r4)
            if (r6 == 0) goto L82
            androidx.datastore.preferences.protobuf.l2 r7 = r8.f6035p
            androidx.datastore.preferences.protobuf.m2 r7 = (androidx.datastore.preferences.protobuf.m2) r7
            java.lang.Object r6 = r7.toImmutable(r6)
            r3.putObject(r9, r4, r6)
            goto L82
        L51:
            androidx.datastore.preferences.protobuf.b2 r3 = r8.f6032m
            androidx.datastore.preferences.protobuf.c2 r3 = (androidx.datastore.preferences.protobuf.c2) r3
            r3.makeImmutableListAt(r9, r4)
            goto L82
        L59:
            r3 = r0[r1]
            boolean r3 = r8.k(r9, r3, r1)
            if (r3 == 0) goto L82
            androidx.datastore.preferences.protobuf.m3 r3 = r8.g(r1)
            sun.misc.Unsafe r6 = androidx.datastore.preferences.protobuf.u2.f6019r
            java.lang.Object r4 = r6.getObject(r9, r4)
            r3.makeImmutable(r4)
            goto L82
        L6f:
            boolean r3 = r8.h(r9, r1)
            if (r3 == 0) goto L82
            androidx.datastore.preferences.protobuf.m3 r3 = r8.g(r1)
            sun.misc.Unsafe r6 = androidx.datastore.preferences.protobuf.u2.f6019r
            java.lang.Object r4 = r6.getObject(r9, r4)
            r3.makeImmutable(r4)
        L82:
            int r1 = r1 + 3
            goto L1e
        L85:
            androidx.datastore.preferences.protobuf.b4 r0 = r8.f6033n
            androidx.datastore.preferences.protobuf.d4 r0 = (androidx.datastore.preferences.protobuf.d4) r0
            r0.getClass()
            r0 = r9
            androidx.datastore.preferences.protobuf.f1 r0 = (androidx.datastore.preferences.protobuf.f1) r0
            androidx.datastore.preferences.protobuf.c4 r0 = r0.unknownFields
            r0.makeImmutable()
            boolean r0 = r8.f6025f
            if (r0 == 0) goto La6
            androidx.datastore.preferences.protobuf.t0 r0 = r8.f6034o
            androidx.datastore.preferences.protobuf.u0 r0 = (androidx.datastore.preferences.protobuf.u0) r0
            r0.getClass()
            androidx.datastore.preferences.protobuf.f1$b r9 = (androidx.datastore.preferences.protobuf.f1.b) r9
            androidx.datastore.preferences.protobuf.a1 r9 = r9.extensions
            r9.makeImmutable()
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.u2.makeImmutable(java.lang.Object):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // androidx.datastore.preferences.protobuf.m3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mergeFrom(java.lang.Object r11, java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.u2.mergeFrom(java.lang.Object, java.lang.Object):void");
    }

    public final void n(Object obj, Object obj2, int i10) {
        int[] iArr = this.f6020a;
        int i11 = iArr[i10];
        if (k(obj2, i11, i10)) {
            long jH = H(i10) & 1048575;
            Unsafe unsafe = f6019r;
            Object object = unsafe.getObject(obj2, jH);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i10] + " is present but null: " + obj2);
            }
            m3 m3VarG = g(i10);
            if (!k(obj, i11, i10)) {
                if (j(object)) {
                    Object objNewInstance = m3VarG.newInstance();
                    m3VarG.mergeFrom(objNewInstance, object);
                    unsafe.putObject(obj, jH, objNewInstance);
                } else {
                    unsafe.putObject(obj, jH, object);
                }
                C(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, jH);
            if (!j(object2)) {
                Object objNewInstance2 = m3VarG.newInstance();
                m3VarG.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(obj, jH, objNewInstance2);
                object2 = objNewInstance2;
            }
            m3VarG.mergeFrom(object2, object);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m3
    public Object newInstance() {
        return ((x2) this.f6031l).newInstance(this.f6024e);
    }

    public final Object o(Object obj, int i10) {
        m3 m3VarG = g(i10);
        long jH = H(i10) & 1048575;
        if (!h(obj, i10)) {
            return m3VarG.newInstance();
        }
        Object object = f6019r.getObject(obj, jH);
        if (j(object)) {
            return object;
        }
        Object objNewInstance = m3VarG.newInstance();
        if (object != null) {
            m3VarG.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    public final Object p(Object obj, int i10, int i11) {
        m3 m3VarG = g(i11);
        if (!k(obj, i10, i11)) {
            return m3VarG.newInstance();
        }
        Object object = f6019r.getObject(obj, H(i11) & 1048575);
        if (j(object)) {
            return object;
        }
        Object objNewInstance = m3VarG.newInstance();
        if (object != null) {
            m3VarG.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    public final int v(Object obj, byte[] bArr, int i10, int i11, int i12, long j10, f fVar) throws u1 {
        int iC;
        Unsafe unsafe = f6019r;
        Object objF = f(i12);
        Object object = unsafe.getObject(obj, j10);
        m2 m2Var = (m2) this.f6035p;
        if (m2Var.isImmutable(object)) {
            Object objNewMapField = m2Var.newMapField(objF);
            m2Var.mergeFrom(objNewMapField, object);
            unsafe.putObject(obj, j10, objNewMapField);
            object = objNewMapField;
        }
        i2 i2VarForMapMetadata = m2Var.forMapMetadata(objF);
        Map<?, ?> mapForMutableMapData = m2Var.forMutableMapData(object);
        int iR = g.r(bArr, i10, fVar);
        int i13 = fVar.f5868a;
        if (i13 < 0 || i13 > i11 - iR) {
            throw u1.h();
        }
        int i14 = iR + i13;
        Object obj2 = i2VarForMapMetadata.f5903b;
        Object obj3 = i2VarForMapMetadata.f5905d;
        Object obj4 = obj2;
        Object obj5 = obj3;
        while (iR < i14) {
            int iQ = iR + 1;
            int i15 = bArr[iR];
            if (i15 < 0) {
                iQ = g.q(i15, bArr, iQ, fVar);
                i15 = fVar.f5868a;
            }
            int i16 = i15 >>> 3;
            int i17 = i15 & 7;
            if (i16 != 1) {
                if (i16 == 2 && i17 == i2VarForMapMetadata.f5904c.getWireType()) {
                    iC = c(bArr, iQ, i11, i2VarForMapMetadata.f5904c, obj3.getClass(), fVar);
                    obj5 = fVar.f5870c;
                    iR = iC;
                } else {
                    iR = g.w(i15, bArr, iQ, i11, fVar);
                }
            } else if (i17 == i2VarForMapMetadata.f5902a.getWireType()) {
                iC = c(bArr, iQ, i11, i2VarForMapMetadata.f5902a, null, fVar);
                obj4 = fVar.f5870c;
                iR = iC;
            } else {
                iR = g.w(i15, bArr, iQ, i11, fVar);
            }
        }
        if (iR != i14) {
            throw u1.g();
        }
        mapForMutableMapData.put(obj4, obj5);
        return i14;
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x0397, code lost:
    
        r0 = r30;
        r2 = r31;
        r1 = r32;
        r4 = r34;
        r5 = r36;
        r3 = r6;
        r7 = r10;
        r10 = r14;
        r9 = r17;
        r6 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x073d, code lost:
    
        if (r8 == 1048575) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x073f, code lost:
    
        r14.putInt(r11, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0743, code lost:
    
        r1 = r30.f6029j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0749, code lost:
    
        if (r1 >= r30.f6030k) goto L329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x074b, code lost:
    
        d(r30.f6028i[r1], r11, r33);
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0757, code lost:
    
        if (r10 != 0) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x0759, code lost:
    
        if (r3 != r4) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0760, code lost:
    
        throw androidx.datastore.preferences.protobuf.u1.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0761, code lost:
    
        if (r3 > r4) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0763, code lost:
    
        if (r13 != r10) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0765, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x076a, code lost:
    
        throw androidx.datastore.preferences.protobuf.u1.g();
     */
    /* JADX WARN: Removed duplicated region for block: B:235:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x06de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int w(java.lang.Object r31, byte[] r32, int r33, int r34, int r35, androidx.datastore.preferences.protobuf.f r36) {
        /*
            Method dump skipped, instructions count: 2020
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.u2.w(java.lang.Object, byte[], int, int, int, androidx.datastore.preferences.protobuf.f):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x05b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x029b  */
    @Override // androidx.datastore.preferences.protobuf.m3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void writeTo(java.lang.Object r13, androidx.datastore.preferences.protobuf.v4 r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.u2.writeTo(java.lang.Object, androidx.datastore.preferences.protobuf.v4):void");
    }

    public final int x(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, f fVar) throws IOException {
        int i18;
        Unsafe unsafe = f6019r;
        long j11 = this.f6020a[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Double.valueOf(Double.longBitsToDouble(g.c(bArr, i10))));
                int i19 = i10 + 8;
                unsafe.putInt(obj, j11, i13);
                return i19;
            case 52:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Float.valueOf(Float.intBitsToFloat(g.b(bArr, i10))));
                int i20 = i10 + 4;
                unsafe.putInt(obj, j11, i13);
                return i20;
            case 53:
            case 54:
                if (i14 != 0) {
                    return i10;
                }
                int iT = g.t(bArr, i10, fVar);
                unsafe.putObject(obj, j10, Long.valueOf(fVar.f5869b));
                unsafe.putInt(obj, j11, i13);
                return iT;
            case 55:
            case 62:
                if (i14 != 0) {
                    return i10;
                }
                int iR = g.r(bArr, i10, fVar);
                unsafe.putObject(obj, j10, Integer.valueOf(fVar.f5868a));
                unsafe.putInt(obj, j11, i13);
                return iR;
            case 56:
            case TokenParametersOuterClass$TokenParameters.MOCKRESPONSEID_FIELD_NUMBER /* 65 */:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Long.valueOf(g.c(bArr, i10)));
                int i21 = i10 + 8;
                unsafe.putInt(obj, j11, i13);
                return i21;
            case 57:
            case 64:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Integer.valueOf(g.b(bArr, i10)));
                int i22 = i10 + 4;
                unsafe.putInt(obj, j11, i13);
                return i22;
            case 58:
                if (i14 != 0) {
                    return i10;
                }
                int iT2 = g.t(bArr, i10, fVar);
                unsafe.putObject(obj, j10, Boolean.valueOf(fVar.f5869b != 0));
                unsafe.putInt(obj, j11, i13);
                return iT2;
            case 59:
                if (i14 != 2) {
                    return i10;
                }
                int iR2 = g.r(bArr, i10, fVar);
                int i23 = fVar.f5868a;
                if (i23 == 0) {
                    unsafe.putObject(obj, j10, "");
                } else {
                    if ((i15 & 536870912) != 0) {
                        if (!m4.f5958a.E(bArr, iR2, iR2 + i23)) {
                            throw u1.c();
                        }
                    }
                    unsafe.putObject(obj, j10, new String(bArr, iR2, i23, t1.f6006a));
                    iR2 += i23;
                }
                unsafe.putInt(obj, j11, i13);
                return iR2;
            case 60:
                i18 = i10;
                if (i14 == 2) {
                    Object objP = p(obj, i13, i17);
                    int iV = g.v(objP, g(i17), bArr, i18, i11, fVar);
                    F(obj, i13, i17, objP);
                    return iV;
                }
                break;
            case 61:
                i18 = i10;
                if (i14 == 2) {
                    int iA = g.a(bArr, i18, fVar);
                    unsafe.putObject(obj, j10, fVar.f5870c);
                    unsafe.putInt(obj, j11, i13);
                    return iA;
                }
                break;
            case 63:
                i18 = i10;
                if (i14 == 0) {
                    int iR3 = g.r(bArr, i18, fVar);
                    int i24 = fVar.f5868a;
                    e(i17);
                    unsafe.putObject(obj, j10, Integer.valueOf(i24));
                    unsafe.putInt(obj, j11, i13);
                    return iR3;
                }
                break;
            case TokenParametersOuterClass$TokenParameters.LGPDCONSENT_FIELD_NUMBER /* 66 */:
                i18 = i10;
                if (i14 == 0) {
                    int iR4 = g.r(bArr, i18, fVar);
                    unsafe.putObject(obj, j10, Integer.valueOf(c0.decodeZigZag32(fVar.f5868a)));
                    unsafe.putInt(obj, j11, i13);
                    return iR4;
                }
                break;
            case TokenParametersOuterClass$TokenParameters.IGNITEVERSION_FIELD_NUMBER /* 67 */:
                i18 = i10;
                if (i14 == 0) {
                    int iT3 = g.t(bArr, i18, fVar);
                    unsafe.putObject(obj, j10, Long.valueOf(c0.decodeZigZag64(fVar.f5869b)));
                    unsafe.putInt(obj, j11, i13);
                    return iT3;
                }
                break;
            case TokenParametersOuterClass$TokenParameters.IGNITEPACKAGENAME_FIELD_NUMBER /* 68 */:
                if (i14 == 3) {
                    Object objP2 = p(obj, i13, i17);
                    int iU = g.u(objP2, g(i17), bArr, i10, i11, (i12 & (-8)) | 4, fVar);
                    F(obj, i13, i17, objP2);
                    return iU;
                }
            default:
                return i10;
        }
        return i18;
    }

    public final int y(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, long j10, int i15, long j11, f fVar) throws u1 {
        int i16;
        int i17;
        int i18;
        int i19;
        int iS;
        Unsafe unsafe = f6019r;
        s1 s1VarMutableCopyWithCapacity = (d) ((s1) unsafe.getObject(obj, j11));
        if (!s1VarMutableCopyWithCapacity.isModifiable()) {
            int size = s1VarMutableCopyWithCapacity.size();
            s1VarMutableCopyWithCapacity = s1VarMutableCopyWithCapacity.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j11, s1VarMutableCopyWithCapacity);
        }
        s1 s1Var = s1VarMutableCopyWithCapacity;
        switch (i15) {
            case 18:
            case 35:
                int iR = i10;
                if (i13 == 2) {
                    return g.h(bArr, iR, s1Var, fVar);
                }
                if (i13 != 1) {
                    return iR;
                }
                n0 n0Var = (n0) s1Var;
                n0Var.addDouble(Double.longBitsToDouble(g.c(bArr, i10)));
                while (true) {
                    i16 = iR + 8;
                    if (i16 < i11) {
                        iR = g.r(bArr, i16, fVar);
                        if (i12 == fVar.f5868a) {
                            n0Var.addDouble(Double.longBitsToDouble(g.c(bArr, iR)));
                        }
                    }
                }
                return i16;
            case 19:
            case 36:
                int iR2 = i10;
                if (i13 == 2) {
                    return g.k(bArr, iR2, s1Var, fVar);
                }
                if (i13 != 5) {
                    return iR2;
                }
                c1 c1Var = (c1) s1Var;
                c1Var.addFloat(Float.intBitsToFloat(g.b(bArr, i10)));
                while (true) {
                    i17 = iR2 + 4;
                    if (i17 < i11) {
                        iR2 = g.r(bArr, i17, fVar);
                        if (i12 == fVar.f5868a) {
                            c1Var.addFloat(Float.intBitsToFloat(g.b(bArr, iR2)));
                        }
                    }
                }
                return i17;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i13 == 2) {
                    e2 e2Var = (e2) s1Var;
                    int iR3 = g.r(bArr, i10, fVar);
                    int i20 = fVar.f5868a + iR3;
                    while (iR3 < i20) {
                        iR3 = g.t(bArr, iR3, fVar);
                        e2Var.addLong(fVar.f5869b);
                    }
                    if (iR3 == i20) {
                        return iR3;
                    }
                    throw u1.h();
                }
                if (i13 != 0) {
                    return i10;
                }
                e2 e2Var2 = (e2) s1Var;
                int iT = g.t(bArr, i10, fVar);
                e2Var2.addLong(fVar.f5869b);
                while (iT < i11) {
                    int iR4 = g.r(bArr, iT, fVar);
                    if (i12 != fVar.f5868a) {
                        return iT;
                    }
                    iT = g.t(bArr, iR4, fVar);
                    e2Var2.addLong(fVar.f5869b);
                }
                return iT;
            case 22:
            case 29:
            case 39:
            case 43:
                i18 = i10;
                if (i13 == 2) {
                    return g.n(bArr, i18, s1Var, fVar);
                }
                if (i13 == 0) {
                    return g.s(i12, bArr, i18, i11, s1Var, fVar);
                }
                return i18;
            case 23:
            case 32:
            case 40:
            case 46:
                i18 = i10;
                if (i13 == 2) {
                    return g.j(bArr, i18, s1Var, fVar);
                }
                if (i13 == 1) {
                    e2 e2Var3 = (e2) s1Var;
                    e2Var3.addLong(g.c(bArr, i10));
                    int i21 = i18 + 8;
                    while (i21 < i11) {
                        int iR5 = g.r(bArr, i21, fVar);
                        if (i12 != fVar.f5868a) {
                            return i21;
                        }
                        e2Var3.addLong(g.c(bArr, iR5));
                        i21 = iR5 + 8;
                    }
                    return i21;
                }
                return i18;
            case 24:
            case 31:
            case 41:
            case 45:
                i18 = i10;
                if (i13 == 2) {
                    return g.i(bArr, i18, s1Var, fVar);
                }
                if (i13 == 5) {
                    j1 j1Var = (j1) s1Var;
                    j1Var.addInt(g.b(bArr, i10));
                    int i22 = i18 + 4;
                    while (i22 < i11) {
                        int iR6 = g.r(bArr, i22, fVar);
                        if (i12 != fVar.f5868a) {
                            return i22;
                        }
                        j1Var.addInt(g.b(bArr, iR6));
                        i22 = iR6 + 4;
                    }
                    return i22;
                }
                return i18;
            case 25:
            case 42:
                i18 = i10;
                if (i13 == 2) {
                    return g.g(bArr, i18, s1Var, fVar);
                }
                if (i13 == 0) {
                    h hVar = (h) s1Var;
                    int iT2 = g.t(bArr, i18, fVar);
                    hVar.addBoolean(fVar.f5869b != 0);
                    while (iT2 < i11) {
                        int iR7 = g.r(bArr, iT2, fVar);
                        if (i12 != fVar.f5868a) {
                            return iT2;
                        }
                        iT2 = g.t(bArr, iR7, fVar);
                        hVar.addBoolean(fVar.f5869b != 0);
                    }
                    return iT2;
                }
                return i18;
            case 26:
                i18 = i10;
                if (i13 == 2) {
                    if ((j10 & 536870912) == 0) {
                        int iR8 = g.r(bArr, i18, fVar);
                        int i23 = fVar.f5868a;
                        if (i23 < 0) {
                            throw u1.f();
                        }
                        if (i23 == 0) {
                            s1Var.add("");
                        } else {
                            s1Var.add(new String(bArr, iR8, i23, t1.f6006a));
                            iR8 += i23;
                        }
                        while (iR8 < i11) {
                            int iR9 = g.r(bArr, iR8, fVar);
                            if (i12 != fVar.f5868a) {
                                return iR8;
                            }
                            iR8 = g.r(bArr, iR9, fVar);
                            int i24 = fVar.f5868a;
                            if (i24 < 0) {
                                throw u1.f();
                            }
                            if (i24 == 0) {
                                s1Var.add("");
                            } else {
                                s1Var.add(new String(bArr, iR8, i24, t1.f6006a));
                                iR8 += i24;
                            }
                        }
                        return iR8;
                    }
                    int iR10 = g.r(bArr, i18, fVar);
                    int i25 = fVar.f5868a;
                    if (i25 < 0) {
                        throw u1.f();
                    }
                    if (i25 == 0) {
                        s1Var.add("");
                    } else {
                        int i26 = iR10 + i25;
                        if (!m4.f5958a.E(bArr, iR10, i26)) {
                            throw u1.c();
                        }
                        s1Var.add(new String(bArr, iR10, i25, t1.f6006a));
                        iR10 = i26;
                    }
                    while (iR10 < i11) {
                        int iR11 = g.r(bArr, iR10, fVar);
                        if (i12 != fVar.f5868a) {
                            return iR10;
                        }
                        iR10 = g.r(bArr, iR11, fVar);
                        int i27 = fVar.f5868a;
                        if (i27 < 0) {
                            throw u1.f();
                        }
                        if (i27 == 0) {
                            s1Var.add("");
                        } else {
                            int i28 = iR10 + i27;
                            if (!m4.f5958a.E(bArr, iR10, i28)) {
                                throw u1.c();
                            }
                            s1Var.add(new String(bArr, iR10, i27, t1.f6006a));
                            iR10 = i28;
                        }
                    }
                    return iR10;
                }
                return i18;
            case 27:
                return i13 == 2 ? g.f(g(i14), i12, bArr, i10, i11, s1Var, fVar) : i10;
            case 28:
                if (i13 != 2) {
                    return i10;
                }
                int iR12 = g.r(bArr, i10, fVar);
                int i29 = fVar.f5868a;
                if (i29 < 0) {
                    throw u1.f();
                }
                if (i29 > bArr.length - iR12) {
                    throw u1.h();
                }
                if (i29 == 0) {
                    s1Var.add(x.f6099c);
                } else {
                    s1Var.add(x.copyFrom(bArr, iR12, i29));
                    iR12 += i29;
                }
                while (iR12 < i11) {
                    int iR13 = g.r(bArr, iR12, fVar);
                    if (i12 != fVar.f5868a) {
                        return iR12;
                    }
                    iR12 = g.r(bArr, iR13, fVar);
                    int i30 = fVar.f5868a;
                    if (i30 < 0) {
                        throw u1.f();
                    }
                    if (i30 > bArr.length - iR12) {
                        throw u1.h();
                    }
                    if (i30 == 0) {
                        s1Var.add(x.f6099c);
                    } else {
                        s1Var.add(x.copyFrom(bArr, iR12, i30));
                        iR12 += i30;
                    }
                }
                return iR12;
            case 30:
            case 44:
                i19 = i10;
                if (i13 != 2) {
                    if (i13 == 0) {
                        iS = g.s(i12, bArr, i19, i11, s1Var, fVar);
                    }
                    return i19;
                }
                iS = g.n(bArr, i19, s1Var, fVar);
                e(i14);
                Class cls = o3.f5966a;
                return iS;
            case 33:
            case 47:
                i19 = i10;
                if (i13 == 2) {
                    return g.l(bArr, i19, s1Var, fVar);
                }
                if (i13 == 0) {
                    j1 j1Var2 = (j1) s1Var;
                    int iR14 = g.r(bArr, i19, fVar);
                    j1Var2.addInt(c0.decodeZigZag32(fVar.f5868a));
                    while (iR14 < i11) {
                        int iR15 = g.r(bArr, iR14, fVar);
                        if (i12 != fVar.f5868a) {
                            return iR14;
                        }
                        iR14 = g.r(bArr, iR15, fVar);
                        j1Var2.addInt(c0.decodeZigZag32(fVar.f5868a));
                    }
                    return iR14;
                }
                return i19;
            case 34:
            case 48:
                i19 = i10;
                if (i13 == 2) {
                    return g.m(bArr, i19, s1Var, fVar);
                }
                if (i13 == 0) {
                    e2 e2Var4 = (e2) s1Var;
                    int iT3 = g.t(bArr, i19, fVar);
                    e2Var4.addLong(c0.decodeZigZag64(fVar.f5869b));
                    while (iT3 < i11) {
                        int iR16 = g.r(bArr, iT3, fVar);
                        if (i12 != fVar.f5868a) {
                            return iT3;
                        }
                        iT3 = g.t(bArr, iR16, fVar);
                        e2Var4.addLong(c0.decodeZigZag64(fVar.f5869b));
                    }
                    return iT3;
                }
                return i19;
            case 49:
                if (i13 == 3) {
                    m3 m3VarG = g(i14);
                    int i31 = (i12 & (-8)) | 4;
                    int iD = g.d(m3VarG, bArr, i10, i11, i31, fVar);
                    m3 m3Var = m3VarG;
                    byte[] bArr2 = bArr;
                    s1Var.add(fVar.f5870c);
                    while (iD < i11) {
                        int iR17 = g.r(bArr2, iD, fVar);
                        if (i12 != fVar.f5868a) {
                            return iD;
                        }
                        byte[] bArr3 = bArr2;
                        m3 m3Var2 = m3Var;
                        iD = g.d(m3Var2, bArr3, iR17, i11, i31, fVar);
                        s1Var.add(fVar.f5870c);
                        m3Var = m3Var2;
                        bArr2 = bArr3;
                    }
                    return iD;
                }
            default:
                return i10;
        }
    }

    public final void z(int i10, d0 d0Var, Object obj) {
        if ((536870912 & i10) != 0) {
            j4.s(obj, i10 & 1048575, d0Var.readStringRequireUtf8());
        } else if (this.f6026g) {
            j4.s(obj, i10 & 1048575, d0Var.readString());
        } else {
            j4.s(obj, i10 & 1048575, d0Var.readBytes());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
    
        r9.c(r2, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:156:0x060b A[Catch: all -> 0x022e, TryCatch #11 {all -> 0x022e, blocks: (B:154:0x0606, B:156:0x060b, B:157:0x0610, B:79:0x021b, B:83:0x0234, B:84:0x0246, B:85:0x0258, B:86:0x026a, B:87:0x027c, B:88:0x0293, B:89:0x02a5, B:90:0x02b7, B:91:0x02c9, B:92:0x02db, B:93:0x02ed, B:94:0x02ff, B:95:0x0311, B:96:0x0323, B:97:0x0335, B:98:0x0347, B:99:0x0359, B:100:0x036b, B:101:0x037d, B:102:0x0395, B:103:0x03a7, B:104:0x03b9, B:105:0x03ce, B:107:0x03d6, B:108:0x03e4, B:109:0x03f2, B:110:0x0404, B:111:0x0416, B:112:0x0428, B:113:0x043a, B:114:0x044c, B:115:0x045e, B:116:0x0470, B:117:0x0482, B:120:0x049a, B:122:0x049f, B:125:0x04b0, B:126:0x04c4, B:127:0x04d8, B:128:0x04ec, B:129:0x0503, B:130:0x0517, B:131:0x052b, B:132:0x0541, B:133:0x054d, B:134:0x0563, B:135:0x0577, B:136:0x058b, B:137:0x059f, B:138:0x05b3, B:139:0x05c7, B:140:0x05dc, B:146:0x05f5), top: B:188:0x0606 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0631 A[LOOP:3: B:167:0x062f->B:168:0x0631, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0617 A[SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.m3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mergeFrom(java.lang.Object r20, androidx.datastore.preferences.protobuf.g3 r21, androidx.datastore.preferences.protobuf.s0 r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.u2.mergeFrom(java.lang.Object, androidx.datastore.preferences.protobuf.g3, androidx.datastore.preferences.protobuf.s0):void");
    }

    @Override // androidx.datastore.preferences.protobuf.m3
    public void mergeFrom(Object obj, byte[] bArr, int i10, int i11, f fVar) throws IOException {
        w(obj, bArr, i10, i11, 0, fVar);
    }
}
