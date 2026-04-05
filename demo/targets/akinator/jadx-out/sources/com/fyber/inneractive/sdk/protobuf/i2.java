package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.util.Arrays;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i2 implements t2 {

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f26397q = new int[0];

    /* renamed from: r, reason: collision with root package name */
    public static final Unsafe f26398r;

    /* renamed from: a, reason: collision with root package name */
    public final int[] f26399a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f26400b;

    /* renamed from: c, reason: collision with root package name */
    public final int f26401c;

    /* renamed from: d, reason: collision with root package name */
    public final int f26402d;

    /* renamed from: e, reason: collision with root package name */
    public final d2 f26403e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f26404f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f26405g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f26406h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f26407i;

    /* renamed from: j, reason: collision with root package name */
    public final int f26408j;

    /* renamed from: k, reason: collision with root package name */
    public final int f26409k;

    /* renamed from: l, reason: collision with root package name */
    public final k2 f26410l;

    /* renamed from: m, reason: collision with root package name */
    public final t1 f26411m;

    /* renamed from: n, reason: collision with root package name */
    public final o3 f26412n;

    /* renamed from: o, reason: collision with root package name */
    public final j0 f26413o;

    /* renamed from: p, reason: collision with root package name */
    public final z1 f26414p;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new s3());
        } catch (Throwable unused) {
            unsafe = null;
        }
        f26398r = unsafe;
    }

    public i2(int[] iArr, Object[] objArr, int i10, int i11, d2 d2Var, boolean z10, int[] iArr2, int i12, int i13, k2 k2Var, t1 t1Var, o3 o3Var, j0 j0Var, z1 z1Var) {
        this.f26399a = iArr;
        this.f26400b = objArr;
        this.f26401c = i10;
        this.f26402d = i11;
        this.f26405g = d2Var instanceof z0;
        this.f26406h = z10;
        this.f26404f = j0Var != null && (d2Var instanceof GeneratedMessageLite$ExtendableMessage);
        this.f26407i = iArr2;
        this.f26408j = i12;
        this.f26409k = i13;
        this.f26410l = k2Var;
        this.f26411m = t1Var;
        this.f26412n = o3Var;
        this.f26413o = j0Var;
        this.f26403e = d2Var;
        this.f26414p = z1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.fyber.inneractive.sdk.protobuf.i2 a(com.fyber.inneractive.sdk.protobuf.r2 r36, com.fyber.inneractive.sdk.protobuf.k2 r37, com.fyber.inneractive.sdk.protobuf.t1 r38, com.fyber.inneractive.sdk.protobuf.o3 r39, com.fyber.inneractive.sdk.protobuf.j0 r40, com.fyber.inneractive.sdk.protobuf.z1 r41) {
        /*
            Method dump skipped, instructions count: 1092
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.i2.a(com.fyber.inneractive.sdk.protobuf.r2, com.fyber.inneractive.sdk.protobuf.k2, com.fyber.inneractive.sdk.protobuf.t1, com.fyber.inneractive.sdk.protobuf.o3, com.fyber.inneractive.sdk.protobuf.j0, com.fyber.inneractive.sdk.protobuf.z1):com.fyber.inneractive.sdk.protobuf.i2");
    }

    public static long d(int i10) {
        return i10 & 1048575;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01cb  */
    @Override // com.fyber.inneractive.sdk.protobuf.t2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(java.lang.Object r11, java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.i2.b(java.lang.Object, java.lang.Object):boolean");
    }

    public final t2 c(int i10) {
        int i11 = (i10 / 3) * 2;
        Object[] objArr = this.f26400b;
        t2 t2Var = (t2) objArr[i11];
        if (t2Var != null) {
            return t2Var;
        }
        t2 t2VarA = p2.f26452c.a((Class) objArr[i11 + 1]);
        this.f26400b[i11] = t2VarA;
        return t2VarA;
    }

    public final void e(int i10, Object obj, Object obj2) {
        int[] iArr = this.f26399a;
        int i11 = iArr[i10 + 1];
        int i12 = iArr[i10];
        long j10 = i11 & 1048575;
        if (a(obj2, i12, i10)) {
            Object objE = a(obj, i12, i10) ? x3.e(obj, j10) : null;
            Object objE2 = x3.e(obj2, j10);
            if (objE != null && objE2 != null) {
                x3.a(j10, obj, l1.a(objE, objE2));
                b(obj, i12, i10);
            } else if (objE2 != null) {
                x3.a(j10, obj, objE2);
                b(obj, i12, i10);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0100 A[PHI: r2
      0x0100: PHI (r2v30 int) = (r2v10 int), (r2v31 int) binds: [B:82:0x0227, B:40:0x00fe] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.fyber.inneractive.sdk.protobuf.t2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.i2.d(java.lang.Object):int");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final void c(Object obj) {
        int i10;
        int i11 = this.f26408j;
        while (true) {
            i10 = this.f26409k;
            if (i11 >= i10) {
                break;
            }
            long j10 = this.f26399a[this.f26407i[i11] + 1] & 1048575;
            Object objE = x3.e(obj, j10);
            if (objE != null) {
                this.f26414p.getClass();
                ((y1) objE).f26547a = false;
                x3.a(j10, obj, objE);
            }
            i11++;
        }
        int length = this.f26407i.length;
        while (i10 < length) {
            this.f26411m.a(obj, this.f26407i[i10]);
            i10++;
        }
        this.f26412n.getClass();
        ((z0) obj).unknownFields.f26447e = false;
        if (this.f26404f) {
            this.f26413o.getClass();
            ((GeneratedMessageLite$ExtendableMessage) obj).extensions.e();
        }
    }

    public final void c(int i10, Object obj, Object obj2) {
        long j10 = this.f26399a[i10 + 1] & 1048575;
        Object objE = x3.e(obj, j10);
        if (objE != null) {
            this.f26414p.getClass();
            if (!((y1) objE).f26547a) {
                this.f26414p.getClass();
                y1 y1Var = y1.f26546b;
                y1 y1Var2 = y1Var.isEmpty() ? new y1() : new y1(y1Var);
                this.f26414p.getClass();
                z1.a(y1Var2, objE);
                x3.a(j10, obj, y1Var2);
                objE = y1Var2;
            }
        } else {
            this.f26414p.getClass();
            y1 y1Var3 = y1.f26546b;
            objE = y1Var3.isEmpty() ? new y1() : new y1(y1Var3);
            x3.a(j10, obj, objE);
        }
        this.f26414p.getClass();
        this.f26414p.getClass();
        obj2.getClass();
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0814 A[PHI: r10
      0x0814: PHI (r10v25 int) = (r10v3 int), (r10v26 int) binds: [B:496:0x0cf0, B:313:0x080d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0a4c A[PHI: r22
      0x0a4c: PHI (r22v30 int) = (r22v15 int), (r22v16 int), (r22v17 int), (r22v24 int), (r22v25 int), (r22v28 int), (r22v31 int) binds: [B:442:0x0bb6, B:438:0x0b9a, B:434:0x0b7e, B:408:0x0ab9, B:404:0x0a9f, B:397:0x0a68, B:392:0x0a4a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0b05 A[PHI: r22
      0x0b05: PHI (r22v48 int) = (r22v22 int), (r22v23 int), (r22v51 int) binds: [B:419:0x0b03, B:412:0x0ad3, B:343:0x08b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0185 A[PHI: r4
      0x0185: PHI (r4v102 int) = (r4v40 int), (r4v104 int) binds: [B:237:0x0633, B:61:0x017d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.fyber.inneractive.sdk.protobuf.t2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 3694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.i2.b(java.lang.Object):int");
    }

    public static Field a(Class cls, String str) {
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

    public final void d(int i10, Object obj, Object obj2) {
        long j10 = this.f26399a[i10 + 1] & 1048575;
        if (a(i10, obj2)) {
            Object objE = x3.e(obj, j10);
            Object objE2 = x3.e(obj2, j10);
            if (objE != null && objE2 != null) {
                x3.a(j10, obj, l1.a(objE, objE2));
                b(i10, obj);
            } else if (objE2 != null) {
                x3.a(j10, obj, objE2);
                b(i10, obj);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final Object a() {
        k2 k2Var = this.f26410l;
        d2 d2Var = this.f26403e;
        k2Var.getClass();
        return ((z0) d2Var).dynamicMethod(y0.NEW_MUTABLE_INSTANCE);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    @Override // com.fyber.inneractive.sdk.protobuf.t2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.Object r11, java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.i2.a(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:100:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x06aa  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x06d0  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x06e4  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x06fa  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0710  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0727  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x073e  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0751  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0768  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0777  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x078e  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x07a5  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x07bc  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x07d3  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x07ea  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0801  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0816  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x082b  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0845  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0858  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0868  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0878  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0888  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0898  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x08a8  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x08b8  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x08c8  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x08d8  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x08e8  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x08f8  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0908  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0918  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0928  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0938  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x094b  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x095b  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x096b  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x097b  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x098b  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x099b  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x09ab  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x09bf  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x09cf  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x09e0  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x09f1  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0a02  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0a13  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0a24  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0a35  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0a46  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0a57  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0a6b  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0a7b  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0a8b  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0a9d  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0aaf  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0ac1  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0ad3  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0ae7  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0aff  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0b0f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0b23  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0b34  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0b45  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0b56  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0b67  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0b78  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0b89  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02fa  */
    @Override // com.fyber.inneractive.sdk.protobuf.t2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.Object r20, com.fyber.inneractive.sdk.protobuf.c0 r21) {
        /*
            Method dump skipped, instructions count: 3302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.i2.a(java.lang.Object, com.fyber.inneractive.sdk.protobuf.c0):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0377  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.Object r12, com.fyber.inneractive.sdk.protobuf.c0 r13) {
        /*
            Method dump skipped, instructions count: 1636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.i2.b(java.lang.Object, com.fyber.inneractive.sdk.protobuf.c0):void");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final void a(Object obj, s2 s2Var, h0 h0Var) throws Throwable {
        h0Var.getClass();
        a(this.f26412n, this.f26413o, obj, s2Var, h0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:360:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0711 A[Catch: all -> 0x0722, TryCatch #3 {all -> 0x0722, blocks: (B:215:0x070c, B:217:0x0711, B:219:0x071a, B:223:0x0725), top: B:243:0x070c }] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0742  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x074a A[LOOP:3: B:234:0x0746->B:236:0x074a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x072b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.fyber.inneractive.sdk.protobuf.o3 r17, com.fyber.inneractive.sdk.protobuf.j0 r18, java.lang.Object r19, com.fyber.inneractive.sdk.protobuf.s2 r20, com.fyber.inneractive.sdk.protobuf.h0 r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2028
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.i2.a(com.fyber.inneractive.sdk.protobuf.o3, com.fyber.inneractive.sdk.protobuf.j0, java.lang.Object, com.fyber.inneractive.sdk.protobuf.s2, com.fyber.inneractive.sdk.protobuf.h0):void");
    }

    public final Object b(int i10) {
        return this.f26400b[(i10 / 3) * 2];
    }

    public final Object b(int i10, Object obj, Object obj2) {
        int i11 = this.f26399a[i10];
        if (x3.e(obj, r0[i10 + 1] & 1048575) == null) {
            return obj2;
        }
        a(i10);
        return obj2;
    }

    public final void b(int i10, Object obj) {
        int i11 = this.f26399a[i10 + 2];
        long j10 = 1048575 & i11;
        if (j10 == 1048575) {
            return;
        }
        x3.a(obj, j10, (1 << (i11 >>> 20)) | x3.c(obj, j10));
    }

    public final void b(Object obj, int i10, int i11) {
        x3.a(obj, this.f26399a[i11 + 2] & 1048575, i10);
    }

    public final int a(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, long j10, int i15, long j11, f fVar) throws n1 {
        int iA;
        int iA2;
        int iA3;
        int i16;
        int i17;
        int iC;
        Unsafe unsafe = f26398r;
        k1 k1VarB = (k1) unsafe.getObject(obj, j11);
        if (!((c) k1VarB).f26354a) {
            int size = k1VarB.size();
            k1VarB = k1VarB.b(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j11, k1VarB);
        }
        k1 k1Var = k1VarB;
        switch (i15) {
            case 18:
            case 35:
                if (i13 == 2) {
                    d0 d0Var = (d0) k1Var;
                    int iD = g.d(bArr, i10, fVar);
                    int i18 = fVar.f26377a + iD;
                    while (iD < i18) {
                        d0Var.a(Double.longBitsToDouble(g.b(iD, bArr)));
                        iD += 8;
                    }
                    if (iD == i18) {
                        return iD;
                    }
                    throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                if (i13 != 1) {
                    return i10;
                }
                d0 d0Var2 = (d0) k1Var;
                d0Var2.a(Double.longBitsToDouble(g.b(i10, bArr)));
                int i19 = i10 + 8;
                while (i19 < i11) {
                    int iA4 = i19 + 1;
                    byte b10 = bArr[i19];
                    if (b10 >= 0) {
                        fVar.f26377a = b10;
                    } else {
                        iA4 = g.a(b10, bArr, iA4, fVar);
                    }
                    if (i12 != fVar.f26377a) {
                        return i19;
                    }
                    d0Var2.a(Double.longBitsToDouble(g.b(iA4, bArr)));
                    i19 = iA4 + 8;
                }
                return i19;
            case 19:
            case 36:
                if (i13 == 2) {
                    q0 q0Var = (q0) k1Var;
                    int iD2 = g.d(bArr, i10, fVar);
                    int i20 = fVar.f26377a + iD2;
                    while (iD2 < i20) {
                        q0Var.a(Float.intBitsToFloat(g.a(iD2, bArr)));
                        iD2 += 4;
                    }
                    if (iD2 == i20) {
                        return iD2;
                    }
                    throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                if (i13 != 5) {
                    return i10;
                }
                q0 q0Var2 = (q0) k1Var;
                q0Var2.a(Float.intBitsToFloat(g.a(i10, bArr)));
                for (int i21 = i10 + 4; i21 < i11; i21 = iA + 4) {
                    iA = i21 + 1;
                    byte b11 = bArr[i21];
                    if (b11 >= 0) {
                        fVar.f26377a = b11;
                    } else {
                        iA = g.a(b11, bArr, iA, fVar);
                    }
                    if (i12 != fVar.f26377a) {
                        return i21;
                    }
                    q0Var2.a(Float.intBitsToFloat(g.a(iA, bArr)));
                }
                return i21;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i13 == 2) {
                    u1 u1Var = (u1) k1Var;
                    int iD3 = g.d(bArr, i10, fVar);
                    int i22 = fVar.f26377a + iD3;
                    while (iD3 < i22) {
                        iD3 = g.e(bArr, iD3, fVar);
                        u1Var.a(fVar.f26378b);
                    }
                    if (iD3 == i22) {
                        return iD3;
                    }
                    throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                if (i13 != 0) {
                    return i10;
                }
                u1 u1Var2 = (u1) k1Var;
                int iE = g.e(bArr, i10, fVar);
                u1Var2.a(fVar.f26378b);
                while (iE < i11) {
                    int iA5 = iE + 1;
                    byte b12 = bArr[iE];
                    if (b12 >= 0) {
                        fVar.f26377a = b12;
                    } else {
                        iA5 = g.a(b12, bArr, iA5, fVar);
                    }
                    if (i12 != fVar.f26377a) {
                        return iE;
                    }
                    iE = g.e(bArr, iA5, fVar);
                    u1Var2.a(fVar.f26378b);
                }
                return iE;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i13 == 2) {
                    return g.a(bArr, i10, k1Var, fVar);
                }
                return i13 == 0 ? g.c(i12, bArr, i10, i11, k1Var, fVar) : i10;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i13 == 2) {
                    u1 u1Var3 = (u1) k1Var;
                    int iD4 = g.d(bArr, i10, fVar);
                    int i23 = fVar.f26377a + iD4;
                    while (iD4 < i23) {
                        u1Var3.a(g.b(iD4, bArr));
                        iD4 += 8;
                    }
                    if (iD4 == i23) {
                        return iD4;
                    }
                    throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                if (i13 != 1) {
                    return i10;
                }
                u1 u1Var4 = (u1) k1Var;
                u1Var4.a(g.b(i10, bArr));
                for (int i24 = i10 + 8; i24 < i11; i24 = iA2 + 8) {
                    iA2 = i24 + 1;
                    byte b13 = bArr[i24];
                    if (b13 >= 0) {
                        fVar.f26377a = b13;
                    } else {
                        iA2 = g.a(b13, bArr, iA2, fVar);
                    }
                    if (i12 != fVar.f26377a) {
                        return i24;
                    }
                    u1Var4.a(g.b(iA2, bArr));
                }
                return i24;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i13 == 2) {
                    a1 a1Var = (a1) k1Var;
                    int iD5 = g.d(bArr, i10, fVar);
                    int i25 = fVar.f26377a + iD5;
                    while (iD5 < i25) {
                        a1Var.c(g.a(iD5, bArr));
                        iD5 += 4;
                    }
                    if (iD5 == i25) {
                        return iD5;
                    }
                    throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                if (i13 != 5) {
                    return i10;
                }
                a1 a1Var2 = (a1) k1Var;
                a1Var2.c(g.a(i10, bArr));
                for (int i26 = i10 + 4; i26 < i11; i26 = iA3 + 4) {
                    iA3 = i26 + 1;
                    byte b14 = bArr[i26];
                    if (b14 >= 0) {
                        fVar.f26377a = b14;
                    } else {
                        iA3 = g.a(b14, bArr, iA3, fVar);
                    }
                    if (i12 != fVar.f26377a) {
                        return i26;
                    }
                    a1Var2.c(g.a(iA3, bArr));
                }
                return i26;
            case 25:
            case 42:
                if (i13 == 2) {
                    j jVar = (j) k1Var;
                    int iD6 = g.d(bArr, i10, fVar);
                    int i27 = fVar.f26377a + iD6;
                    while (iD6 < i27) {
                        iD6 = g.e(bArr, iD6, fVar);
                        jVar.a(fVar.f26378b != 0);
                    }
                    if (iD6 == i27) {
                        return iD6;
                    }
                    throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                if (i13 != 0) {
                    return i10;
                }
                j jVar2 = (j) k1Var;
                int iE2 = g.e(bArr, i10, fVar);
                jVar2.a(fVar.f26378b != 0);
                while (iE2 < i11) {
                    int iA6 = iE2 + 1;
                    byte b15 = bArr[iE2];
                    if (b15 >= 0) {
                        fVar.f26377a = b15;
                    } else {
                        iA6 = g.a(b15, bArr, iA6, fVar);
                    }
                    if (i12 != fVar.f26377a) {
                        return iE2;
                    }
                    iE2 = g.e(bArr, iA6, fVar);
                    jVar2.a(fVar.f26378b != 0);
                }
                return iE2;
            case 26:
                i16 = i10;
                if (i13 == 2) {
                    if ((j10 & 536870912) == 0) {
                        return g.a(i12, bArr, i16, i11, k1Var, fVar);
                    }
                    return g.b(i12, bArr, i16, i11, k1Var, fVar);
                }
                return i16;
            case 27:
                i16 = i10;
                if (i13 == 2) {
                    t2 t2VarC = c(i14);
                    int iA7 = g.a(t2VarC, bArr, i16, i11, fVar);
                    k1Var.add(fVar.f26379c);
                    while (iA7 < i11) {
                        int iA8 = iA7 + 1;
                        byte b16 = bArr[iA7];
                        if (b16 >= 0) {
                            fVar.f26377a = b16;
                        } else {
                            iA8 = g.a(b16, bArr, iA8, fVar);
                        }
                        if (i12 != fVar.f26377a) {
                            return iA7;
                        }
                        iA7 = g.a(t2VarC, bArr, iA8, i11, fVar);
                        k1Var.add(fVar.f26379c);
                    }
                    return iA7;
                }
                return i16;
            case 28:
                i16 = i10;
                if (i13 == 2) {
                    int iD7 = g.d(bArr, i16, fVar);
                    int i28 = fVar.f26377a;
                    if (i28 >= 0) {
                        if (i28 > bArr.length - iD7) {
                            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                        }
                        if (i28 == 0) {
                            k1Var.add(s.f26471b);
                        } else {
                            int i29 = iD7 + i28;
                            s.a(iD7, i29, bArr.length);
                            k1Var.add(new q(s.f26472c.a(bArr, iD7, i28)));
                            iD7 = i29;
                        }
                        while (iD7 < i11) {
                            int iA9 = iD7 + 1;
                            byte b17 = bArr[iD7];
                            if (b17 >= 0) {
                                fVar.f26377a = b17;
                            } else {
                                iA9 = g.a(b17, bArr, iA9, fVar);
                            }
                            if (i12 != fVar.f26377a) {
                                return iD7;
                            }
                            iD7 = iA9 + 1;
                            byte b18 = bArr[iA9];
                            if (b18 >= 0) {
                                fVar.f26377a = b18;
                            } else {
                                iD7 = g.a(b18, bArr, iD7, fVar);
                            }
                            int i30 = fVar.f26377a;
                            if (i30 >= 0) {
                                if (i30 > bArr.length - iD7) {
                                    throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                }
                                if (i30 == 0) {
                                    k1Var.add(s.f26471b);
                                } else {
                                    int i31 = iD7 + i30;
                                    s.a(iD7, i31, bArr.length);
                                    k1Var.add(new q(s.f26472c.a(bArr, iD7, i30)));
                                    iD7 = i31;
                                }
                            } else {
                                throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                            }
                        }
                        return iD7;
                    }
                    throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                }
                return i16;
            case 30:
            case 44:
                i17 = i10;
                if (i13 != 2) {
                    if (i13 == 0) {
                        iC = g.c(i12, bArr, i17, i11, k1Var, fVar);
                    }
                    return i17;
                }
                iC = g.a(bArr, i17, k1Var, fVar);
                z0 z0Var = (z0) obj;
                n3 n3Var = z0Var.unknownFields;
                if (n3Var == n3.f26442f) {
                    n3Var = null;
                }
                a(i14);
                Class cls = u2.f26498a;
                if (n3Var != null) {
                    z0Var.unknownFields = n3Var;
                }
                return iC;
            case 33:
            case 47:
                i17 = i10;
                if (i13 == 2) {
                    a1 a1Var3 = (a1) k1Var;
                    int iD8 = g.d(bArr, i17, fVar);
                    int i32 = fVar.f26377a + iD8;
                    while (iD8 < i32) {
                        int i33 = iD8 + 1;
                        byte b19 = bArr[iD8];
                        if (b19 >= 0) {
                            fVar.f26377a = b19;
                            iD8 = i33;
                        } else {
                            iD8 = g.a(b19, bArr, i33, fVar);
                        }
                        a1Var3.c(w.b(fVar.f26377a));
                    }
                    if (iD8 == i32) {
                        return iD8;
                    }
                    throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                if (i13 == 0) {
                    a1 a1Var4 = (a1) k1Var;
                    int iD9 = g.d(bArr, i17, fVar);
                    a1Var4.c(w.b(fVar.f26377a));
                    while (iD9 < i11) {
                        int iA10 = iD9 + 1;
                        byte b20 = bArr[iD9];
                        if (b20 >= 0) {
                            fVar.f26377a = b20;
                        } else {
                            iA10 = g.a(b20, bArr, iA10, fVar);
                        }
                        if (i12 != fVar.f26377a) {
                            return iD9;
                        }
                        iD9 = iA10 + 1;
                        byte b21 = bArr[iA10];
                        if (b21 >= 0) {
                            fVar.f26377a = b21;
                        } else {
                            iD9 = g.a(b21, bArr, iD9, fVar);
                        }
                        a1Var4.c(w.b(fVar.f26377a));
                    }
                    return iD9;
                }
                return i17;
            case 34:
            case 48:
                i17 = i10;
                if (i13 == 2) {
                    u1 u1Var5 = (u1) k1Var;
                    int iD10 = g.d(bArr, i17, fVar);
                    int i34 = fVar.f26377a + iD10;
                    while (iD10 < i34) {
                        iD10 = g.e(bArr, iD10, fVar);
                        u1Var5.a(w.a(fVar.f26378b));
                    }
                    if (iD10 == i34) {
                        return iD10;
                    }
                    throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                if (i13 == 0) {
                    u1 u1Var6 = (u1) k1Var;
                    int iE3 = g.e(bArr, i17, fVar);
                    u1Var6.a(w.a(fVar.f26378b));
                    while (iE3 < i11) {
                        int iA11 = iE3 + 1;
                        byte b22 = bArr[iE3];
                        if (b22 >= 0) {
                            fVar.f26377a = b22;
                        } else {
                            iA11 = g.a(b22, bArr, iA11, fVar);
                        }
                        if (i12 != fVar.f26377a) {
                            return iE3;
                        }
                        iE3 = g.e(bArr, iA11, fVar);
                        u1Var6.a(w.a(fVar.f26378b));
                    }
                    return iE3;
                }
                return i17;
            case 49:
                if (i13 == 3) {
                    t2 t2VarC2 = c(i14);
                    int i35 = (i12 & (-8)) | 4;
                    int iA12 = g.a(t2VarC2, bArr, i10, i11, i35, fVar);
                    t2 t2Var = t2VarC2;
                    int i36 = i11;
                    f fVar2 = fVar;
                    k1Var.add(fVar2.f26379c);
                    while (iA12 < i36) {
                        int iD11 = g.d(bArr, iA12, fVar2);
                        if (i12 != fVar2.f26377a) {
                            return iA12;
                        }
                        t2 t2Var2 = t2Var;
                        int i37 = i36;
                        f fVar3 = fVar2;
                        iA12 = g.a(t2Var2, bArr, iD11, i37, i35, fVar3);
                        k1Var.add(fVar3.f26379c);
                        t2Var = t2Var2;
                        i36 = i37;
                        fVar2 = fVar3;
                    }
                    return iA12;
                }
            default:
                return i10;
        }
    }

    public final int a(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, f fVar) throws n1 {
        Object object;
        Unsafe unsafe = f26398r;
        long j11 = this.f26399a[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Double.valueOf(Double.longBitsToDouble(g.b(i10, bArr))));
                int i18 = i10 + 8;
                unsafe.putInt(obj, j11, i13);
                return i18;
            case 52:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Float.valueOf(Float.intBitsToFloat(g.a(i10, bArr))));
                int i19 = i10 + 4;
                unsafe.putInt(obj, j11, i13);
                return i19;
            case 53:
            case 54:
                if (i14 != 0) {
                    return i10;
                }
                int iE = g.e(bArr, i10, fVar);
                unsafe.putObject(obj, j10, Long.valueOf(fVar.f26378b));
                unsafe.putInt(obj, j11, i13);
                return iE;
            case 55:
            case 62:
                if (i14 != 0) {
                    return i10;
                }
                int iD = g.d(bArr, i10, fVar);
                unsafe.putObject(obj, j10, Integer.valueOf(fVar.f26377a));
                unsafe.putInt(obj, j11, i13);
                return iD;
            case 56:
            case TokenParametersOuterClass$TokenParameters.MOCKRESPONSEID_FIELD_NUMBER /* 65 */:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Long.valueOf(g.b(i10, bArr)));
                int i20 = i10 + 8;
                unsafe.putInt(obj, j11, i13);
                return i20;
            case 57:
            case 64:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Integer.valueOf(g.a(i10, bArr)));
                int i21 = i10 + 4;
                unsafe.putInt(obj, j11, i13);
                return i21;
            case 58:
                if (i14 != 0) {
                    return i10;
                }
                int iE2 = g.e(bArr, i10, fVar);
                unsafe.putObject(obj, j10, Boolean.valueOf(fVar.f26378b != 0));
                unsafe.putInt(obj, j11, i13);
                return iE2;
            case 59:
                if (i14 != 2) {
                    return i10;
                }
                int iD2 = g.d(bArr, i10, fVar);
                int i22 = fVar.f26377a;
                if (i22 == 0) {
                    unsafe.putObject(obj, j10, "");
                } else {
                    if ((i15 & 536870912) != 0) {
                        if (!d4.f26366a.b(bArr, iD2, iD2 + i22)) {
                            throw new n1("Protocol message had invalid UTF-8.");
                        }
                    }
                    unsafe.putObject(obj, j10, new String(bArr, iD2, i22, l1.f26429a));
                    iD2 += i22;
                }
                unsafe.putInt(obj, j11, i13);
                return iD2;
            case 60:
                if (i14 != 2) {
                    return i10;
                }
                int iA = g.a(c(i17), bArr, i10, i11, fVar);
                object = unsafe.getInt(obj, j11) == i13 ? unsafe.getObject(obj, j10) : null;
                if (object == null) {
                    unsafe.putObject(obj, j10, fVar.f26379c);
                } else {
                    unsafe.putObject(obj, j10, l1.a(object, fVar.f26379c));
                }
                unsafe.putInt(obj, j11, i13);
                return iA;
            case 61:
                if (i14 != 2) {
                    return i10;
                }
                int iA2 = g.a(bArr, i10, fVar);
                unsafe.putObject(obj, j10, fVar.f26379c);
                unsafe.putInt(obj, j11, i13);
                return iA2;
            case 63:
                if (i14 != 0) {
                    return i10;
                }
                int iD3 = g.d(bArr, i10, fVar);
                int i23 = fVar.f26377a;
                a(i17);
                unsafe.putObject(obj, j10, Integer.valueOf(i23));
                unsafe.putInt(obj, j11, i13);
                return iD3;
            case TokenParametersOuterClass$TokenParameters.LGPDCONSENT_FIELD_NUMBER /* 66 */:
                if (i14 != 0) {
                    return i10;
                }
                int iD4 = g.d(bArr, i10, fVar);
                unsafe.putObject(obj, j10, Integer.valueOf(w.b(fVar.f26377a)));
                unsafe.putInt(obj, j11, i13);
                return iD4;
            case TokenParametersOuterClass$TokenParameters.IGNITEVERSION_FIELD_NUMBER /* 67 */:
                if (i14 != 0) {
                    return i10;
                }
                int iE3 = g.e(bArr, i10, fVar);
                unsafe.putObject(obj, j10, Long.valueOf(w.a(fVar.f26378b)));
                unsafe.putInt(obj, j11, i13);
                return iE3;
            case TokenParametersOuterClass$TokenParameters.IGNITEPACKAGENAME_FIELD_NUMBER /* 68 */:
                if (i14 == 3) {
                    int iA3 = g.a(c(i17), bArr, i10, i11, (i12 & (-8)) | 4, fVar);
                    object = unsafe.getInt(obj, j11) == i13 ? unsafe.getObject(obj, j10) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j10, fVar.f26379c);
                    } else {
                        unsafe.putObject(obj, j10, l1.a(object, fVar.f26379c));
                    }
                    unsafe.putInt(obj, j11, i13);
                    return iA3;
                }
                break;
        }
        return i10;
    }

    public final void a(int i10) {
        if (this.f26400b[a.b.A(i10, 3, 2, 1)] != null) {
            throw new ClassCastException();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:175:0x0477, code lost:
    
        r0 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x0835, code lost:
    
        if (r0 == 1048575) goto L326;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x0837, code lost:
    
        r18.putInt(r9, r0, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x083d, code lost:
    
        r0 = r8.f26408j;
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x0843, code lost:
    
        if (r0 >= r8.f26409k) goto L367;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0845, code lost:
    
        r1 = (com.fyber.inneractive.sdk.protobuf.n3) r8.b(r8.f26407i[r0], r9, r1);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0852, code lost:
    
        if (r1 == null) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0854, code lost:
    
        r8.f26412n.getClass();
        ((com.fyber.inneractive.sdk.protobuf.z0) r9).unknownFields = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0860, code lost:
    
        if (r35 != 0) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0862, code lost:
    
        if (r4 != r3) goto L336;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x086a, code lost:
    
        throw new com.fyber.inneractive.sdk.protobuf.n1("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x086b, code lost:
    
        if (r4 > r3) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x086d, code lost:
    
        if (r13 != r35) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x086f, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x0875, code lost:
    
        throw new com.fyber.inneractive.sdk.protobuf.n1("Failed to parse the message.");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x07c8  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x07cc  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x07f8  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0808  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0055 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(java.lang.Object r31, byte[] r32, int r33, int r34, int r35, com.fyber.inneractive.sdk.protobuf.f r36) throws com.fyber.inneractive.sdk.protobuf.n1 {
        /*
            Method dump skipped, instructions count: 2278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.i2.a(java.lang.Object, byte[], int, int, int, com.fyber.inneractive.sdk.protobuf.f):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:37:0x009e. Please report as an issue. */
    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final void a(Object obj, byte[] bArr, int i10, int i11, f fVar) throws n1 {
        int iA;
        int i12;
        int i13;
        int i14;
        int i15;
        Unsafe unsafe;
        int i16;
        int i17;
        Unsafe unsafe2;
        Object obj2;
        int i18;
        int i19;
        int i20;
        int i21;
        int iE;
        int i22;
        int i23;
        int iC;
        int i24;
        i2 i2Var = this;
        Object obj3 = obj;
        byte[] bArr2 = bArr;
        int i25 = i11;
        f fVar2 = fVar;
        if (i2Var.f26406h) {
            Unsafe unsafe3 = f26398r;
            int i26 = -1;
            int i27 = 0;
            int iA2 = i10;
            int i28 = -1;
            int i29 = 0;
            int i30 = 0;
            int i31 = 1048575;
            while (iA2 < i25) {
                int iA3 = iA2 + 1;
                int i32 = bArr2[iA2];
                if (i32 < 0) {
                    iA3 = g.a(i32, bArr2, iA3, fVar2);
                    i32 = fVar2.f26377a;
                }
                int i33 = i32 >>> 3;
                int i34 = i32 & 7;
                if (i33 > i28) {
                    int i35 = i30 / 3;
                    if (i33 >= i2Var.f26401c && i33 <= i2Var.f26402d) {
                        iA = i2Var.a(i33, i35);
                        i30 = iA;
                    }
                    i30 = i26;
                } else {
                    if (i33 >= i2Var.f26401c && i33 <= i2Var.f26402d) {
                        iA = i2Var.a(i33, i27);
                        i30 = iA;
                    }
                    i30 = i26;
                }
                if (i30 == i26) {
                    unsafe2 = unsafe3;
                    obj2 = obj3;
                    i12 = i32;
                    i13 = i31;
                    i19 = iA3;
                    i14 = i33;
                    i30 = i27;
                    i17 = i29;
                } else {
                    int[] iArr = i2Var.f26399a;
                    int i36 = iArr[i30 + 1];
                    int i37 = (i36 & 267386880) >>> 20;
                    long j10 = i36 & 1048575;
                    if (i37 <= 17) {
                        int i38 = iArr[i30 + 2];
                        int i39 = 1 << (i38 >>> 20);
                        int i40 = i38 & 1048575;
                        int i41 = 1048575;
                        if (i40 != i31) {
                            if (i31 != 1048575) {
                                unsafe3.putInt(obj3, i31, i29);
                                i41 = 1048575;
                            }
                            if (i40 != i41) {
                                i29 = unsafe3.getInt(obj3, i40);
                            }
                            i20 = i40;
                        } else {
                            i20 = i31;
                        }
                        int i42 = i29;
                        switch (i37) {
                            case 0:
                                i21 = i11;
                                unsafe2 = unsafe3;
                                i12 = i32;
                                if (i34 == 1) {
                                    x3.f26537c.a(obj3, j10, Double.longBitsToDouble(g.b(iA3, bArr2)));
                                    iE = iA3 + 8;
                                    i29 = i42 | i39;
                                    obj2 = obj3;
                                    i24 = i21;
                                    i13 = i20;
                                    iA2 = iE;
                                    i14 = i33;
                                    break;
                                }
                                obj2 = obj3;
                                i13 = i20;
                                i19 = iA3;
                                i14 = i33;
                                i17 = i42;
                                break;
                            case 1:
                                i21 = i11;
                                unsafe2 = unsafe3;
                                i12 = i32;
                                if (i34 == 5) {
                                    x3.f26537c.a(obj3, j10, Float.intBitsToFloat(g.a(iA3, bArr2)));
                                    iE = iA3 + 4;
                                    i29 = i42 | i39;
                                    obj2 = obj3;
                                    i24 = i21;
                                    i13 = i20;
                                    iA2 = iE;
                                    i14 = i33;
                                    break;
                                }
                                obj2 = obj3;
                                i13 = i20;
                                i19 = iA3;
                                i14 = i33;
                                i17 = i42;
                                break;
                            case 2:
                            case 3:
                                i21 = i11;
                                i22 = i32;
                                if (i34 == 0) {
                                    iE = g.e(bArr2, iA3, fVar2);
                                    unsafe3.putLong(obj3, j10, fVar2.f26378b);
                                    unsafe2 = unsafe3;
                                    i29 = i42 | i39;
                                    obj2 = obj3;
                                    i24 = i21;
                                    i13 = i20;
                                    iA2 = iE;
                                    i14 = i33;
                                    break;
                                }
                                unsafe2 = unsafe3;
                                i12 = i22;
                                obj2 = obj3;
                                i13 = i20;
                                i19 = iA3;
                                i14 = i33;
                                i17 = i42;
                                break;
                            case 4:
                            case 11:
                                i21 = i11;
                                i22 = i32;
                                if (i34 == 0) {
                                    int iA4 = iA3 + 1;
                                    byte b10 = bArr2[iA3];
                                    if (b10 >= 0) {
                                        fVar2.f26377a = b10;
                                    } else {
                                        iA4 = g.a(b10, bArr2, iA4, fVar2);
                                    }
                                    iE = iA4;
                                    unsafe3.putInt(obj3, j10, fVar2.f26377a);
                                    unsafe2 = unsafe3;
                                    i29 = i42 | i39;
                                    obj2 = obj3;
                                    i24 = i21;
                                    i13 = i20;
                                    iA2 = iE;
                                    i14 = i33;
                                    break;
                                }
                                unsafe2 = unsafe3;
                                i12 = i22;
                                obj2 = obj3;
                                i13 = i20;
                                i19 = iA3;
                                i14 = i33;
                                i17 = i42;
                                break;
                            case 5:
                            case 14:
                                i21 = i11;
                                if (i34 == 1) {
                                    unsafe3.putLong(obj3, j10, g.b(iA3, bArr2));
                                    iE = iA3 + 8;
                                    unsafe2 = unsafe3;
                                    i29 = i42 | i39;
                                    obj2 = obj3;
                                    i24 = i21;
                                    i13 = i20;
                                    iA2 = iE;
                                    i14 = i33;
                                    break;
                                }
                                unsafe2 = unsafe3;
                                i12 = i32;
                                obj2 = obj3;
                                i13 = i20;
                                i19 = iA3;
                                i14 = i33;
                                i17 = i42;
                                break;
                            case 6:
                            case 13:
                                i21 = i11;
                                if (i34 == 5) {
                                    unsafe3.putInt(obj3, j10, g.a(iA3, bArr2));
                                    iE = iA3 + 4;
                                    unsafe2 = unsafe3;
                                    i29 = i42 | i39;
                                    obj2 = obj3;
                                    i24 = i21;
                                    i13 = i20;
                                    iA2 = iE;
                                    i14 = i33;
                                    break;
                                }
                                unsafe2 = unsafe3;
                                i12 = i32;
                                obj2 = obj3;
                                i13 = i20;
                                i19 = iA3;
                                i14 = i33;
                                i17 = i42;
                                break;
                            case 7:
                                i23 = i11;
                                if (i34 == 0) {
                                    iE = g.e(bArr2, iA3, fVar2);
                                    x3.f26537c.a(obj3, j10, fVar2.f26378b != 0);
                                    unsafe2 = unsafe3;
                                    i21 = i23;
                                    i29 = i42 | i39;
                                    obj2 = obj3;
                                    i24 = i21;
                                    i13 = i20;
                                    iA2 = iE;
                                    i14 = i33;
                                    break;
                                }
                                unsafe2 = unsafe3;
                                i12 = i32;
                                obj2 = obj3;
                                i13 = i20;
                                i19 = iA3;
                                i14 = i33;
                                i17 = i42;
                                break;
                            case 8:
                                i23 = i11;
                                if (i34 == 2) {
                                    if ((536870912 & i36) == 0) {
                                        iC = g.b(bArr2, iA3, fVar2);
                                    } else {
                                        iC = g.c(bArr2, iA3, fVar2);
                                    }
                                    iE = iC;
                                    unsafe3.putObject(obj3, j10, fVar2.f26379c);
                                    unsafe2 = unsafe3;
                                    i21 = i23;
                                    i29 = i42 | i39;
                                    obj2 = obj3;
                                    i24 = i21;
                                    i13 = i20;
                                    iA2 = iE;
                                    i14 = i33;
                                    break;
                                }
                                unsafe2 = unsafe3;
                                i12 = i32;
                                obj2 = obj3;
                                i13 = i20;
                                i19 = iA3;
                                i14 = i33;
                                i17 = i42;
                                break;
                            case 9:
                                if (i34 == 2) {
                                    i23 = i11;
                                    iE = g.a(i2Var.c(i30), bArr2, iA3, i23, fVar2);
                                    Object object = unsafe3.getObject(obj3, j10);
                                    if (object == null) {
                                        unsafe3.putObject(obj3, j10, fVar2.f26379c);
                                    } else {
                                        unsafe3.putObject(obj3, j10, l1.a(object, fVar2.f26379c));
                                    }
                                    unsafe2 = unsafe3;
                                    i21 = i23;
                                    i29 = i42 | i39;
                                    obj2 = obj3;
                                    i24 = i21;
                                    i13 = i20;
                                    iA2 = iE;
                                    i14 = i33;
                                    break;
                                }
                                unsafe2 = unsafe3;
                                i12 = i32;
                                obj2 = obj3;
                                i13 = i20;
                                i19 = iA3;
                                i14 = i33;
                                i17 = i42;
                                break;
                            case 10:
                                if (i34 == 2) {
                                    iE = g.a(bArr2, iA3, fVar2);
                                    unsafe3.putObject(obj3, j10, fVar2.f26379c);
                                    i21 = i11;
                                    unsafe2 = unsafe3;
                                    i29 = i42 | i39;
                                    obj2 = obj3;
                                    i24 = i21;
                                    i13 = i20;
                                    iA2 = iE;
                                    i14 = i33;
                                    break;
                                }
                                unsafe2 = unsafe3;
                                i12 = i32;
                                obj2 = obj3;
                                i13 = i20;
                                i19 = iA3;
                                i14 = i33;
                                i17 = i42;
                                break;
                            case 12:
                                if (i34 == 0) {
                                    int iA5 = iA3 + 1;
                                    byte b11 = bArr2[iA3];
                                    if (b11 >= 0) {
                                        fVar2.f26377a = b11;
                                    } else {
                                        iA5 = g.a(b11, bArr2, iA5, fVar2);
                                    }
                                    iE = iA5;
                                    unsafe3.putInt(obj3, j10, fVar2.f26377a);
                                    i21 = i11;
                                    unsafe2 = unsafe3;
                                    i29 = i42 | i39;
                                    obj2 = obj3;
                                    i24 = i21;
                                    i13 = i20;
                                    iA2 = iE;
                                    i14 = i33;
                                    break;
                                }
                                unsafe2 = unsafe3;
                                i12 = i32;
                                obj2 = obj3;
                                i13 = i20;
                                i19 = iA3;
                                i14 = i33;
                                i17 = i42;
                                break;
                            case 15:
                                if (i34 == 0) {
                                    int iA6 = iA3 + 1;
                                    byte b12 = bArr2[iA3];
                                    if (b12 >= 0) {
                                        fVar2.f26377a = b12;
                                    } else {
                                        iA6 = g.a(b12, bArr2, iA6, fVar2);
                                    }
                                    iE = iA6;
                                    unsafe3.putInt(obj3, j10, w.b(fVar2.f26377a));
                                    i21 = i11;
                                    unsafe2 = unsafe3;
                                    i29 = i42 | i39;
                                    obj2 = obj3;
                                    i24 = i21;
                                    i13 = i20;
                                    iA2 = iE;
                                    i14 = i33;
                                    break;
                                }
                                unsafe2 = unsafe3;
                                i12 = i32;
                                obj2 = obj3;
                                i13 = i20;
                                i19 = iA3;
                                i14 = i33;
                                i17 = i42;
                                break;
                            case 16:
                                if (i34 == 0) {
                                    iE = g.e(bArr2, iA3, fVar2);
                                    unsafe3.putLong(obj3, j10, w.a(fVar2.f26378b));
                                    i21 = i11;
                                    unsafe2 = unsafe3;
                                    i29 = i42 | i39;
                                    obj2 = obj3;
                                    i24 = i21;
                                    i13 = i20;
                                    iA2 = iE;
                                    i14 = i33;
                                    break;
                                }
                                unsafe2 = unsafe3;
                                i12 = i32;
                                obj2 = obj3;
                                i13 = i20;
                                i19 = iA3;
                                i14 = i33;
                                i17 = i42;
                                break;
                            default:
                                unsafe2 = unsafe3;
                                i12 = i32;
                                obj2 = obj3;
                                i13 = i20;
                                i19 = iA3;
                                i14 = i33;
                                i17 = i42;
                                break;
                        }
                        i2Var = this;
                        bArr2 = bArr;
                        fVar2 = fVar;
                        i25 = i24;
                        obj3 = obj2;
                        unsafe3 = unsafe2;
                        i28 = i14;
                        i31 = i13;
                        i26 = -1;
                        i27 = 0;
                    } else {
                        i25 = i11;
                        int i43 = i32;
                        int i44 = i31;
                        int i45 = i29;
                        Unsafe unsafe4 = unsafe3;
                        if (i37 != 27) {
                            i12 = i43;
                            if (i37 <= 49) {
                                int i46 = iA3;
                                i14 = i33;
                                Object obj4 = obj3;
                                byte[] bArr3 = bArr2;
                                int i47 = i30;
                                int iA7 = a(obj4, bArr3, i46, i11, i12, i34, i47, i36, i37, j10, fVar2);
                                i12 = i12;
                                i15 = i47;
                                unsafe2 = unsafe4;
                                if (iA7 != i46) {
                                    iA2 = iA7;
                                    i13 = i44;
                                    i17 = i45;
                                    obj2 = obj4;
                                    i2Var = this;
                                    bArr2 = bArr;
                                    i25 = i11;
                                    fVar2 = fVar;
                                    obj3 = obj2;
                                    i30 = i15;
                                    unsafe3 = unsafe2;
                                    i29 = i17;
                                } else {
                                    i18 = iA7;
                                    i13 = i44;
                                    i17 = i45;
                                    obj2 = obj4;
                                    i19 = i18;
                                    i30 = i15;
                                }
                            } else {
                                i13 = i44;
                                i14 = i33;
                                i15 = i30;
                                unsafe = unsafe4;
                                i16 = iA3;
                                if (i37 != 50) {
                                    Object obj5 = obj3;
                                    i17 = i45;
                                    unsafe2 = unsafe;
                                    int iA8 = a(obj5, bArr, i16, i11, i12, i14, i34, i36, i37, j10, i15, fVar);
                                    obj2 = obj5;
                                    i12 = i12;
                                    if (iA8 != i16) {
                                        iA2 = iA8;
                                        i2Var = this;
                                        bArr2 = bArr;
                                        i25 = i11;
                                        fVar2 = fVar;
                                        obj3 = obj2;
                                        i30 = i15;
                                        unsafe3 = unsafe2;
                                        i29 = i17;
                                    } else {
                                        i18 = iA8;
                                        i19 = i18;
                                        i30 = i15;
                                    }
                                } else if (i34 == 2) {
                                    Unsafe unsafe5 = f26398r;
                                    Object objB = b(i15);
                                    Object object2 = unsafe5.getObject(obj3, j10);
                                    this.f26414p.getClass();
                                    if (!((y1) object2).f26547a) {
                                        this.f26414p.getClass();
                                        y1 y1Var = y1.f26546b;
                                        y1 y1Var2 = y1Var.isEmpty() ? new y1() : new y1(y1Var);
                                        this.f26414p.getClass();
                                        z1.a(y1Var2, object2);
                                        unsafe5.putObject(obj3, j10, y1Var2);
                                    }
                                    this.f26414p.getClass();
                                    objB.getClass();
                                    throw new ClassCastException();
                                }
                            }
                            i28 = i14;
                            i31 = i13;
                            i26 = -1;
                            i27 = 0;
                        } else if (i34 == 2) {
                            k1 k1VarB = (k1) unsafe4.getObject(obj3, j10);
                            if (!((c) k1VarB).f26354a) {
                                int size = k1VarB.size();
                                k1VarB = k1VarB.b(size == 0 ? 10 : size * 2);
                                unsafe4.putObject(obj3, j10, k1VarB);
                            }
                            t2 t2VarC = i2Var.c(i30);
                            int iA9 = g.a(t2VarC, bArr2, iA3, i25, fVar2);
                            k1VarB.add(fVar2.f26379c);
                            while (iA9 < i25) {
                                int iA10 = iA9 + 1;
                                byte b13 = bArr2[iA9];
                                if (b13 >= 0) {
                                    fVar2.f26377a = b13;
                                } else {
                                    iA10 = g.a(b13, bArr2, iA10, fVar2);
                                }
                                int i48 = i43;
                                if (i48 != fVar2.f26377a) {
                                    unsafe3 = unsafe4;
                                    iA2 = iA9;
                                    i31 = i44;
                                    i28 = i33;
                                    i29 = i45;
                                    i26 = -1;
                                    i27 = 0;
                                } else {
                                    iA9 = g.a(t2VarC, bArr2, iA10, i25, fVar2);
                                    k1VarB.add(fVar2.f26379c);
                                    i43 = i48;
                                }
                            }
                            unsafe3 = unsafe4;
                            iA2 = iA9;
                            i31 = i44;
                            i28 = i33;
                            i29 = i45;
                            i26 = -1;
                            i27 = 0;
                        } else {
                            i12 = i43;
                            unsafe = unsafe4;
                            i13 = i44;
                            i16 = iA3;
                            i14 = i33;
                            i15 = i30;
                        }
                        obj2 = obj3;
                        i19 = i16;
                        unsafe2 = unsafe;
                        i30 = i15;
                        i17 = i45;
                    }
                }
                z0 z0Var = (z0) obj2;
                n3 n3Var = z0Var.unknownFields;
                if (n3Var == n3.f26442f) {
                    n3Var = new n3();
                    z0Var.unknownFields = n3Var;
                }
                i24 = i11;
                iA2 = g.a(i12, bArr, i19, i11, n3Var, fVar);
                i29 = i17;
                i2Var = this;
                bArr2 = bArr;
                fVar2 = fVar;
                i25 = i24;
                obj3 = obj2;
                unsafe3 = unsafe2;
                i28 = i14;
                i31 = i13;
                i26 = -1;
                i27 = 0;
            }
            Unsafe unsafe6 = unsafe3;
            Object obj6 = obj3;
            int i49 = i31;
            int i50 = i29;
            int i51 = i25;
            if (i49 != 1048575) {
                unsafe6.putInt(obj6, i49, i50);
            }
            if (iA2 != i51) {
                throw new n1("Failed to parse the message.");
            }
            return;
        }
        a(obj3, bArr, i10, i25, 0, fVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00a7  */
    @Override // com.fyber.inneractive.sdk.protobuf.t2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.i2.a(java.lang.Object):boolean");
    }

    public static void a(int i10, Object obj, c0 c0Var) {
        if (obj instanceof String) {
            c0Var.f26355a.a((String) obj, i10);
        } else {
            c0Var.f26355a.a(i10, (s) obj);
        }
    }

    public final void a(Object obj, int i10, s2 s2Var) {
        if ((536870912 & i10) != 0) {
            s2Var.b(this.f26411m.b(obj, i10 & 1048575));
        } else {
            s2Var.q(this.f26411m.b(obj, i10 & 1048575));
        }
    }

    public final void a(Object obj, int i10, s2 s2Var, t2 t2Var, h0 h0Var) {
        s2Var.b(this.f26411m.b(obj, i10 & 1048575), t2Var, h0Var);
    }

    public final void a(Object obj, long j10, s2 s2Var, t2 t2Var, h0 h0Var) {
        s2Var.a(this.f26411m.b(obj, j10), t2Var, h0Var);
    }

    public final boolean a(int i10, Object obj) {
        int[] iArr = this.f26399a;
        int i11 = iArr[i10 + 2];
        long j10 = i11 & 1048575;
        if (j10 != 1048575) {
            return ((1 << (i11 >>> 20)) & x3.c(obj, j10)) != 0;
        }
        int i12 = iArr[i10 + 1];
        long j11 = i12 & 1048575;
        switch ((i12 & 267386880) >>> 20) {
            case 0:
                return x3.f26537c.c(obj, j11) != 0.0d;
            case 1:
                return x3.f26537c.d(obj, j11) != 0.0f;
            case 2:
                return x3.d(obj, j11) != 0;
            case 3:
                return x3.d(obj, j11) != 0;
            case 4:
                return x3.c(obj, j11) != 0;
            case 5:
                return x3.d(obj, j11) != 0;
            case 6:
                return x3.c(obj, j11) != 0;
            case 7:
                return x3.f26537c.a(obj, j11);
            case 8:
                Object objE = x3.e(obj, j11);
                if (objE instanceof String) {
                    return !((String) objE).isEmpty();
                }
                if (objE instanceof s) {
                    return !s.f26471b.equals(objE);
                }
                throw new IllegalArgumentException();
            case 9:
                return x3.e(obj, j11) != null;
            case 10:
                return !s.f26471b.equals(x3.e(obj, j11));
            case 11:
                return x3.c(obj, j11) != 0;
            case 12:
                return x3.c(obj, j11) != 0;
            case 13:
                return x3.c(obj, j11) != 0;
            case 14:
                return x3.d(obj, j11) != 0;
            case 15:
                return x3.c(obj, j11) != 0;
            case 16:
                return x3.d(obj, j11) != 0;
            case 17:
                return x3.e(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean a(Object obj, int i10, int i11) {
        return x3.c(obj, (long) (this.f26399a[i11 + 2] & 1048575)) == i10;
    }

    public final boolean a(int i10, Object obj, Object obj2) {
        return a(i10, obj) == a(i10, obj2);
    }

    public final int a(int i10, int i11) {
        int length = (this.f26399a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.f26399a[i13];
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
}
