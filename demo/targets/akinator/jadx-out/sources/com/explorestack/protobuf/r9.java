package com.explorestack.protobuf;

import com.explorestack.protobuf.ByteString;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class r9 implements ua {

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f22542r = new int[0];

    /* renamed from: s, reason: collision with root package name */
    public static final Unsafe f22543s = sc.l();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f22544a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f22545b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22546c;

    /* renamed from: d, reason: collision with root package name */
    public final int f22547d;

    /* renamed from: e, reason: collision with root package name */
    public final MessageLite f22548e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f22549f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f22550g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f22551h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f22552i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f22553j;

    /* renamed from: k, reason: collision with root package name */
    public final int f22554k;

    /* renamed from: l, reason: collision with root package name */
    public final int f22555l;

    /* renamed from: m, reason: collision with root package name */
    public final u9 f22556m;

    /* renamed from: n, reason: collision with root package name */
    public final j8 f22557n;

    /* renamed from: o, reason: collision with root package name */
    public final bc f22558o;

    /* renamed from: p, reason: collision with root package name */
    public final n5 f22559p;

    /* renamed from: q, reason: collision with root package name */
    public final d9 f22560q;

    public r9(int[] iArr, Object[] objArr, int i10, int i11, MessageLite messageLite, boolean z10, int[] iArr2, int i12, int i13, u9 u9Var, j8 j8Var, bc bcVar, n5 n5Var, d9 d9Var) {
        this.f22544a = iArr;
        this.f22545b = objArr;
        this.f22546c = i10;
        this.f22547d = i11;
        this.f22550g = messageLite instanceof h6;
        this.f22551h = z10;
        this.f22549f = n5Var != null && n5Var.d(messageLite);
        this.f22552i = true;
        this.f22553j = iArr2;
        this.f22554k = i12;
        this.f22555l = i13;
        this.f22556m = u9Var;
        this.f22557n = j8Var;
        this.f22558o = bcVar;
        this.f22559p = n5Var;
        this.f22548e = messageLite;
        this.f22560q = d9Var;
    }

    public static int A(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    public static void E(int i10, Object obj, i0 i0Var) throws IOException {
        if (obj instanceof String) {
            i0Var.writeString(i10, (String) obj);
        } else {
            i0Var.writeBytes(i10, (ByteString) obj);
        }
    }

    public static List j(long j10, Object obj) {
        return (List) sc.f22643c.getObject(obj, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.explorestack.protobuf.r9 n(com.explorestack.protobuf.mb r27, com.explorestack.protobuf.u9 r28, com.explorestack.protobuf.j8 r29, com.explorestack.protobuf.bc r30, com.explorestack.protobuf.n5 r31, com.explorestack.protobuf.d9 r32) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.r9.n(com.explorestack.protobuf.mb, com.explorestack.protobuf.u9, com.explorestack.protobuf.j8, com.explorestack.protobuf.bc, com.explorestack.protobuf.n5, com.explorestack.protobuf.d9):com.explorestack.protobuf.r9");
    }

    public static long o(int i10) {
        return i10 & 1048575;
    }

    public static int p(Object obj, long j10) {
        return ((Integer) sc.f22643c.getObject(obj, j10)).intValue();
    }

    public static long q(Object obj, long j10) {
        return ((Long) sc.f22643c.getObject(obj, j10)).longValue();
    }

    public final int B(int i10) {
        return this.f22544a[i10 + 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(java.lang.Object r21, com.explorestack.protobuf.i0 r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.r9.C(java.lang.Object, com.explorestack.protobuf.i0):void");
    }

    public final void D(i0 i0Var, int i10, Object obj, int i11) throws IOException {
        if (obj != null) {
            Object objD = d(i11);
            d9 d9Var = this.f22560q;
            i0Var.writeMap(i10, d9Var.forMapMetadata(objD), d9Var.forMapData(obj));
        }
    }

    public final boolean a(Object obj, Object obj2, int i10) {
        return h(obj, i10) == h(obj2, i10);
    }

    public final Object b(Object obj, int i10, Object obj2, bc bcVar) {
        q7 q7VarC;
        int i11 = this.f22544a[i10];
        Object object = sc.f22643c.getObject(obj, B(i10) & 1048575);
        if (object == null || (q7VarC = c(i10)) == null) {
            return obj2;
        }
        d9 d9Var = this.f22560q;
        Map<?, ?> mapForMutableMapData = d9Var.forMutableMapData(object);
        t8 t8VarForMapMetadata = d9Var.forMapMetadata(d(i10));
        Iterator<Map.Entry<?, ?>> it = mapForMutableMapData.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<?, ?> next = it.next();
            if (!q7VarC.isInRange(((Integer) next.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = bcVar.m();
                }
                ByteString.CodedBuilder codedBuilderNewCodedBuilder = ByteString.newCodedBuilder(u8.a(t8VarForMapMetadata, next.getKey(), next.getValue()));
                try {
                    u8.d(codedBuilderNewCodedBuilder.getCodedOutput(), t8VarForMapMetadata, next.getKey(), next.getValue());
                    bcVar.d(obj2, i11, codedBuilderNewCodedBuilder.build());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return obj2;
    }

    public final q7 c(int i10) {
        return (q7) this.f22545b[a.b.A(i10, 3, 2, 1)];
    }

    public final Object d(int i10) {
        return this.f22545b[(i10 / 3) * 2];
    }

    public final ua e(int i10) {
        int i11 = (i10 / 3) * 2;
        Object[] objArr = this.f22545b;
        ua uaVar = (ua) objArr[i11];
        if (uaVar != null) {
            return uaVar;
        }
        ua uaVarSchemaFor = ia.getInstance().schemaFor((Class) objArr[i11 + 1]);
        objArr[i11] = uaVarSchemaFor;
        return uaVarSchemaFor;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    @Override // com.explorestack.protobuf.ua
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r12, java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.r9.equals(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:84:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 1484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.r9.f(java.lang.Object):int");
    }

    public final int g(Object obj) {
        int iComputeDoubleSize;
        int iComputeBytesSize;
        int iA;
        Unsafe unsafe = f22543s;
        int i10 = 0;
        int iComputeBoolSize = 0;
        while (true) {
            int[] iArr = this.f22544a;
            if (i10 >= iArr.length) {
                bc bcVar = this.f22558o;
                return bcVar.h(bcVar.g(obj)) + iComputeBoolSize;
            }
            int iB = B(i10);
            int iA2 = A(iB);
            int i11 = iArr[i10];
            long j10 = iB & 1048575;
            int i12 = (iA2 < c6.Q.id() || iA2 > c6.f21990d0.id()) ? 0 : iArr[i10 + 2] & 1048575;
            boolean z10 = this.f22552i;
            switch (iA2) {
                case 0:
                    if (h(obj, i10)) {
                        iComputeDoubleSize = h0.computeDoubleSize(i11, 0.0d);
                        iComputeBoolSize += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (h(obj, i10)) {
                        iComputeDoubleSize = h0.computeFloatSize(i11, 0.0f);
                        iComputeBoolSize += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (h(obj, i10)) {
                        iComputeDoubleSize = h0.computeInt64Size(i11, sc.f22643c.getLong(obj, j10));
                        iComputeBoolSize += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (h(obj, i10)) {
                        iComputeDoubleSize = h0.computeUInt64Size(i11, sc.f22643c.getLong(obj, j10));
                        iComputeBoolSize += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (h(obj, i10)) {
                        iComputeDoubleSize = h0.computeInt32Size(i11, sc.f22643c.getInt(obj, j10));
                        iComputeBoolSize += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (h(obj, i10)) {
                        iComputeDoubleSize = h0.computeFixed64Size(i11, 0L);
                        iComputeBoolSize += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (h(obj, i10)) {
                        iComputeDoubleSize = h0.computeFixed32Size(i11, 0);
                        iComputeBoolSize += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (h(obj, i10)) {
                        iComputeDoubleSize = h0.computeBoolSize(i11, true);
                        iComputeBoolSize += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (h(obj, i10)) {
                        Object object = sc.f22643c.getObject(obj, j10);
                        iComputeBytesSize = object instanceof ByteString ? h0.computeBytesSize(i11, (ByteString) object) : h0.computeStringSize(i11, (String) object);
                        iComputeBoolSize = iComputeBytesSize + iComputeBoolSize;
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (h(obj, i10)) {
                        iComputeDoubleSize = wa.l(i11, sc.f22643c.getObject(obj, j10), e(i10));
                        iComputeBoolSize += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (h(obj, i10)) {
                        iComputeDoubleSize = h0.computeBytesSize(i11, (ByteString) sc.f22643c.getObject(obj, j10));
                        iComputeBoolSize += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (h(obj, i10)) {
                        iComputeDoubleSize = h0.computeUInt32Size(i11, sc.f22643c.getInt(obj, j10));
                        iComputeBoolSize += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (h(obj, i10)) {
                        iComputeDoubleSize = h0.computeEnumSize(i11, sc.f22643c.getInt(obj, j10));
                        iComputeBoolSize += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (h(obj, i10)) {
                        iComputeDoubleSize = h0.computeSFixed32Size(i11, 0);
                        iComputeBoolSize += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (h(obj, i10)) {
                        iComputeDoubleSize = h0.computeSFixed64Size(i11, 0L);
                        iComputeBoolSize += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (h(obj, i10)) {
                        iComputeDoubleSize = h0.computeSInt32Size(i11, sc.f22643c.getInt(obj, j10));
                        iComputeBoolSize += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (h(obj, i10)) {
                        iComputeDoubleSize = h0.computeSInt64Size(i11, sc.f22643c.getLong(obj, j10));
                        iComputeBoolSize += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (h(obj, i10)) {
                        iComputeDoubleSize = h0.a(i11, (MessageLite) sc.f22643c.getObject(obj, j10), e(i10));
                        iComputeBoolSize += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    iComputeDoubleSize = wa.f(i11, j(j10, obj));
                    iComputeBoolSize += iComputeDoubleSize;
                    break;
                case 19:
                    iComputeDoubleSize = wa.d(i11, j(j10, obj));
                    iComputeBoolSize += iComputeDoubleSize;
                    break;
                case 20:
                    iComputeDoubleSize = wa.j(i11, j(j10, obj));
                    iComputeBoolSize += iComputeDoubleSize;
                    break;
                case 21:
                    iComputeDoubleSize = wa.u(i11, j(j10, obj));
                    iComputeBoolSize += iComputeDoubleSize;
                    break;
                case 22:
                    iComputeDoubleSize = wa.h(i11, j(j10, obj));
                    iComputeBoolSize += iComputeDoubleSize;
                    break;
                case 23:
                    iComputeDoubleSize = wa.f(i11, j(j10, obj));
                    iComputeBoolSize += iComputeDoubleSize;
                    break;
                case 24:
                    iComputeDoubleSize = wa.d(i11, j(j10, obj));
                    iComputeBoolSize += iComputeDoubleSize;
                    break;
                case 25:
                    List listJ = j(j10, obj);
                    Class cls = wa.f22814a;
                    int size = listJ.size();
                    iComputeBoolSize += size == 0 ? 0 : h0.computeBoolSize(i11, true) * size;
                    break;
                case 26:
                    iComputeDoubleSize = wa.r(i11, j(j10, obj));
                    iComputeBoolSize += iComputeDoubleSize;
                    break;
                case 27:
                    iComputeDoubleSize = wa.m(i11, j(j10, obj), e(i10));
                    iComputeBoolSize += iComputeDoubleSize;
                    break;
                case 28:
                    iComputeDoubleSize = wa.a(i11, j(j10, obj));
                    iComputeBoolSize += iComputeDoubleSize;
                    break;
                case 29:
                    iComputeDoubleSize = wa.s(i11, j(j10, obj));
                    iComputeBoolSize += iComputeDoubleSize;
                    break;
                case 30:
                    iComputeDoubleSize = wa.b(i11, j(j10, obj));
                    iComputeBoolSize += iComputeDoubleSize;
                    break;
                case 31:
                    iComputeDoubleSize = wa.d(i11, j(j10, obj));
                    iComputeBoolSize += iComputeDoubleSize;
                    break;
                case 32:
                    iComputeDoubleSize = wa.f(i11, j(j10, obj));
                    iComputeBoolSize += iComputeDoubleSize;
                    break;
                case 33:
                    iComputeDoubleSize = wa.n(i11, j(j10, obj));
                    iComputeBoolSize += iComputeDoubleSize;
                    break;
                case 34:
                    iComputeDoubleSize = wa.p(i11, j(j10, obj));
                    iComputeBoolSize += iComputeDoubleSize;
                    break;
                case 35:
                    int iG = wa.g((List) unsafe.getObject(obj, j10));
                    if (iG <= 0) {
                        break;
                    } else {
                        if (z10) {
                            unsafe.putInt(obj, i12, iG);
                        }
                        iComputeBoolSize = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.c(iG, h0.computeTagSize(i11), iG, iComputeBoolSize);
                        break;
                    }
                case 36:
                    int iE = wa.e((List) unsafe.getObject(obj, j10));
                    if (iE <= 0) {
                        break;
                    } else {
                        if (z10) {
                            unsafe.putInt(obj, i12, iE);
                        }
                        iComputeBoolSize = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.c(iE, h0.computeTagSize(i11), iE, iComputeBoolSize);
                        break;
                    }
                case 37:
                    int iK = wa.k((List) unsafe.getObject(obj, j10));
                    if (iK <= 0) {
                        break;
                    } else {
                        if (z10) {
                            unsafe.putInt(obj, i12, iK);
                        }
                        iComputeBoolSize = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.c(iK, h0.computeTagSize(i11), iK, iComputeBoolSize);
                        break;
                    }
                case 38:
                    int iV = wa.v((List) unsafe.getObject(obj, j10));
                    if (iV <= 0) {
                        break;
                    } else {
                        if (z10) {
                            unsafe.putInt(obj, i12, iV);
                        }
                        iComputeBoolSize = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.c(iV, h0.computeTagSize(i11), iV, iComputeBoolSize);
                        break;
                    }
                case 39:
                    int i13 = wa.i((List) unsafe.getObject(obj, j10));
                    if (i13 <= 0) {
                        break;
                    } else {
                        if (z10) {
                            unsafe.putInt(obj, i12, i13);
                        }
                        iComputeBoolSize = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.c(i13, h0.computeTagSize(i11), i13, iComputeBoolSize);
                        break;
                    }
                case 40:
                    int iG2 = wa.g((List) unsafe.getObject(obj, j10));
                    if (iG2 <= 0) {
                        break;
                    } else {
                        if (z10) {
                            unsafe.putInt(obj, i12, iG2);
                        }
                        iComputeBoolSize = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.c(iG2, h0.computeTagSize(i11), iG2, iComputeBoolSize);
                        break;
                    }
                case 41:
                    int iE2 = wa.e((List) unsafe.getObject(obj, j10));
                    if (iE2 <= 0) {
                        break;
                    } else {
                        if (z10) {
                            unsafe.putInt(obj, i12, iE2);
                        }
                        iComputeBoolSize = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.c(iE2, h0.computeTagSize(i11), iE2, iComputeBoolSize);
                        break;
                    }
                case 42:
                    List list = (List) unsafe.getObject(obj, j10);
                    Class cls2 = wa.f22814a;
                    int size2 = list.size();
                    if (size2 <= 0) {
                        break;
                    } else {
                        if (z10) {
                            unsafe.putInt(obj, i12, size2);
                        }
                        iComputeBoolSize = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.c(size2, h0.computeTagSize(i11), size2, iComputeBoolSize);
                        break;
                    }
                case 43:
                    int iT = wa.t((List) unsafe.getObject(obj, j10));
                    if (iT <= 0) {
                        break;
                    } else {
                        if (z10) {
                            unsafe.putInt(obj, i12, iT);
                        }
                        iComputeBoolSize = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.c(iT, h0.computeTagSize(i11), iT, iComputeBoolSize);
                        break;
                    }
                case 44:
                    int iC = wa.c((List) unsafe.getObject(obj, j10));
                    if (iC <= 0) {
                        break;
                    } else {
                        if (z10) {
                            unsafe.putInt(obj, i12, iC);
                        }
                        iComputeBoolSize = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.c(iC, h0.computeTagSize(i11), iC, iComputeBoolSize);
                        break;
                    }
                case 45:
                    int iE3 = wa.e((List) unsafe.getObject(obj, j10));
                    if (iE3 <= 0) {
                        break;
                    } else {
                        if (z10) {
                            unsafe.putInt(obj, i12, iE3);
                        }
                        iComputeBoolSize = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.c(iE3, h0.computeTagSize(i11), iE3, iComputeBoolSize);
                        break;
                    }
                case 46:
                    int iG3 = wa.g((List) unsafe.getObject(obj, j10));
                    if (iG3 <= 0) {
                        break;
                    } else {
                        if (z10) {
                            unsafe.putInt(obj, i12, iG3);
                        }
                        iComputeBoolSize = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.c(iG3, h0.computeTagSize(i11), iG3, iComputeBoolSize);
                        break;
                    }
                case 47:
                    int iO = wa.o((List) unsafe.getObject(obj, j10));
                    if (iO <= 0) {
                        break;
                    } else {
                        if (z10) {
                            unsafe.putInt(obj, i12, iO);
                        }
                        iComputeBoolSize = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.c(iO, h0.computeTagSize(i11), iO, iComputeBoolSize);
                        break;
                    }
                case 48:
                    int iQ = wa.q((List) unsafe.getObject(obj, j10));
                    if (iQ <= 0) {
                        break;
                    } else {
                        if (z10) {
                            unsafe.putInt(obj, i12, iQ);
                        }
                        iComputeBoolSize = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.c(iQ, h0.computeTagSize(i11), iQ, iComputeBoolSize);
                        break;
                    }
                case 49:
                    List listJ2 = j(j10, obj);
                    ua uaVarE = e(i10);
                    Class cls3 = wa.f22814a;
                    int size3 = listJ2.size();
                    if (size3 == 0) {
                        iA = 0;
                    } else {
                        iA = 0;
                        for (int i14 = 0; i14 < size3; i14++) {
                            iA += h0.a(i11, (MessageLite) listJ2.get(i14), uaVarE);
                        }
                    }
                    iComputeBoolSize += iA;
                    break;
                case 50:
                    iComputeDoubleSize = this.f22560q.getSerializedSize(i11, sc.f22643c.getObject(obj, j10), d(i10));
                    iComputeBoolSize += iComputeDoubleSize;
                    break;
                case 51:
                    if (i(obj, i11, i10)) {
                        iComputeDoubleSize = h0.computeDoubleSize(i11, 0.0d);
                        iComputeBoolSize += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (i(obj, i11, i10)) {
                        iComputeDoubleSize = h0.computeFloatSize(i11, 0.0f);
                        iComputeBoolSize += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (i(obj, i11, i10)) {
                        iComputeDoubleSize = h0.computeInt64Size(i11, q(obj, j10));
                        iComputeBoolSize += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (i(obj, i11, i10)) {
                        iComputeDoubleSize = h0.computeUInt64Size(i11, q(obj, j10));
                        iComputeBoolSize += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (i(obj, i11, i10)) {
                        iComputeDoubleSize = h0.computeInt32Size(i11, p(obj, j10));
                        iComputeBoolSize += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (i(obj, i11, i10)) {
                        iComputeDoubleSize = h0.computeFixed64Size(i11, 0L);
                        iComputeBoolSize += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (i(obj, i11, i10)) {
                        iComputeDoubleSize = h0.computeFixed32Size(i11, 0);
                        iComputeBoolSize += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (i(obj, i11, i10)) {
                        iComputeDoubleSize = h0.computeBoolSize(i11, true);
                        iComputeBoolSize += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (i(obj, i11, i10)) {
                        Object object2 = sc.f22643c.getObject(obj, j10);
                        iComputeBytesSize = object2 instanceof ByteString ? h0.computeBytesSize(i11, (ByteString) object2) : h0.computeStringSize(i11, (String) object2);
                        iComputeBoolSize = iComputeBytesSize + iComputeBoolSize;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (i(obj, i11, i10)) {
                        iComputeDoubleSize = wa.l(i11, sc.f22643c.getObject(obj, j10), e(i10));
                        iComputeBoolSize += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (i(obj, i11, i10)) {
                        iComputeDoubleSize = h0.computeBytesSize(i11, (ByteString) sc.f22643c.getObject(obj, j10));
                        iComputeBoolSize += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (i(obj, i11, i10)) {
                        iComputeDoubleSize = h0.computeUInt32Size(i11, p(obj, j10));
                        iComputeBoolSize += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (i(obj, i11, i10)) {
                        iComputeDoubleSize = h0.computeEnumSize(i11, p(obj, j10));
                        iComputeBoolSize += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (i(obj, i11, i10)) {
                        iComputeDoubleSize = h0.computeSFixed32Size(i11, 0);
                        iComputeBoolSize += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case TokenParametersOuterClass$TokenParameters.MOCKRESPONSEID_FIELD_NUMBER /* 65 */:
                    if (i(obj, i11, i10)) {
                        iComputeDoubleSize = h0.computeSFixed64Size(i11, 0L);
                        iComputeBoolSize += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case TokenParametersOuterClass$TokenParameters.LGPDCONSENT_FIELD_NUMBER /* 66 */:
                    if (i(obj, i11, i10)) {
                        iComputeDoubleSize = h0.computeSInt32Size(i11, p(obj, j10));
                        iComputeBoolSize += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case TokenParametersOuterClass$TokenParameters.IGNITEVERSION_FIELD_NUMBER /* 67 */:
                    if (i(obj, i11, i10)) {
                        iComputeDoubleSize = h0.computeSInt64Size(i11, q(obj, j10));
                        iComputeBoolSize += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case TokenParametersOuterClass$TokenParameters.IGNITEPACKAGENAME_FIELD_NUMBER /* 68 */:
                    if (i(obj, i11, i10)) {
                        iComputeDoubleSize = h0.a(i11, (MessageLite) sc.f22643c.getObject(obj, j10), e(i10));
                        iComputeBoolSize += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
            }
            i10 += 3;
        }
    }

    @Override // com.explorestack.protobuf.ua
    public int getSerializedSize(Object obj) {
        return this.f22551h ? g(obj) : f(obj);
    }

    public final boolean h(Object obj, int i10) {
        int i11 = this.f22544a[i10 + 2];
        long j10 = i11 & 1048575;
        if (j10 == 1048575) {
            int iB = B(i10);
            long j11 = iB & 1048575;
            switch (A(iB)) {
                case 0:
                    if (sc.f22643c.getDouble(obj, j11) == 0.0d) {
                        return false;
                    }
                    break;
                case 1:
                    if (sc.f22643c.getFloat(obj, j11) == 0.0f) {
                        return false;
                    }
                    break;
                case 2:
                    if (sc.f22643c.getLong(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (sc.f22643c.getLong(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (sc.f22643c.getInt(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (sc.f22643c.getLong(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (sc.f22643c.getInt(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return sc.f22643c.getBoolean(obj, j11);
                case 8:
                    Object object = sc.f22643c.getObject(obj, j11);
                    if (object instanceof String) {
                        return !((String) object).isEmpty();
                    }
                    if (object instanceof ByteString) {
                        return !ByteString.EMPTY.equals(object);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (sc.f22643c.getObject(obj, j11) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !ByteString.EMPTY.equals(sc.f22643c.getObject(obj, j11));
                case 11:
                    if (sc.f22643c.getInt(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (sc.f22643c.getInt(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (sc.f22643c.getInt(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (sc.f22643c.getLong(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (sc.f22643c.getInt(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (sc.f22643c.getLong(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (sc.f22643c.getObject(obj, j11) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            if ((sc.f22643c.getInt(obj, j10) & (1 << (i11 >>> 20))) == 0) {
                return false;
            }
        }
        return true;
    }

    @Override // com.explorestack.protobuf.ua
    public int hashCode(Object obj) {
        int i10;
        int iHashLong;
        int[] iArr = this.f22544a;
        int length = iArr.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int iB = B(i12);
            int i13 = iArr[i12];
            long j10 = 1048575 & iB;
            int iHashCode = 37;
            switch (A(iB)) {
                case 0:
                    i10 = i11 * 53;
                    iHashLong = x7.hashLong(Double.doubleToLongBits(sc.f22643c.getDouble(obj, j10)));
                    i11 = iHashLong + i10;
                    break;
                case 1:
                    i10 = i11 * 53;
                    iHashLong = Float.floatToIntBits(sc.f22643c.getFloat(obj, j10));
                    i11 = iHashLong + i10;
                    break;
                case 2:
                    i10 = i11 * 53;
                    iHashLong = x7.hashLong(sc.f22643c.getLong(obj, j10));
                    i11 = iHashLong + i10;
                    break;
                case 3:
                    i10 = i11 * 53;
                    iHashLong = x7.hashLong(sc.f22643c.getLong(obj, j10));
                    i11 = iHashLong + i10;
                    break;
                case 4:
                    i10 = i11 * 53;
                    iHashLong = sc.f22643c.getInt(obj, j10);
                    i11 = iHashLong + i10;
                    break;
                case 5:
                    i10 = i11 * 53;
                    iHashLong = x7.hashLong(sc.f22643c.getLong(obj, j10));
                    i11 = iHashLong + i10;
                    break;
                case 6:
                    i10 = i11 * 53;
                    iHashLong = sc.f22643c.getInt(obj, j10);
                    i11 = iHashLong + i10;
                    break;
                case 7:
                    i10 = i11 * 53;
                    iHashLong = x7.hashBoolean(sc.f22643c.getBoolean(obj, j10));
                    i11 = iHashLong + i10;
                    break;
                case 8:
                    i10 = i11 * 53;
                    iHashLong = ((String) sc.f22643c.getObject(obj, j10)).hashCode();
                    i11 = iHashLong + i10;
                    break;
                case 9:
                    Object object = sc.f22643c.getObject(obj, j10);
                    if (object != null) {
                        iHashCode = object.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i11 * 53;
                    iHashLong = sc.f22643c.getObject(obj, j10).hashCode();
                    i11 = iHashLong + i10;
                    break;
                case 11:
                    i10 = i11 * 53;
                    iHashLong = sc.f22643c.getInt(obj, j10);
                    i11 = iHashLong + i10;
                    break;
                case 12:
                    i10 = i11 * 53;
                    iHashLong = sc.f22643c.getInt(obj, j10);
                    i11 = iHashLong + i10;
                    break;
                case 13:
                    i10 = i11 * 53;
                    iHashLong = sc.f22643c.getInt(obj, j10);
                    i11 = iHashLong + i10;
                    break;
                case 14:
                    i10 = i11 * 53;
                    iHashLong = x7.hashLong(sc.f22643c.getLong(obj, j10));
                    i11 = iHashLong + i10;
                    break;
                case 15:
                    i10 = i11 * 53;
                    iHashLong = sc.f22643c.getInt(obj, j10);
                    i11 = iHashLong + i10;
                    break;
                case 16:
                    i10 = i11 * 53;
                    iHashLong = x7.hashLong(sc.f22643c.getLong(obj, j10));
                    i11 = iHashLong + i10;
                    break;
                case 17:
                    Object object2 = sc.f22643c.getObject(obj, j10);
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
                    iHashLong = sc.f22643c.getObject(obj, j10).hashCode();
                    i11 = iHashLong + i10;
                    break;
                case 50:
                    i10 = i11 * 53;
                    iHashLong = sc.f22643c.getObject(obj, j10).hashCode();
                    i11 = iHashLong + i10;
                    break;
                case 51:
                    if (i(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iHashLong = x7.hashLong(Double.doubleToLongBits(((Double) sc.f22643c.getObject(obj, j10)).doubleValue()));
                        i11 = iHashLong + i10;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (i(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iHashLong = Float.floatToIntBits(((Float) sc.f22643c.getObject(obj, j10)).floatValue());
                        i11 = iHashLong + i10;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (i(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iHashLong = x7.hashLong(q(obj, j10));
                        i11 = iHashLong + i10;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (i(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iHashLong = x7.hashLong(q(obj, j10));
                        i11 = iHashLong + i10;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (i(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iHashLong = p(obj, j10);
                        i11 = iHashLong + i10;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (i(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iHashLong = x7.hashLong(q(obj, j10));
                        i11 = iHashLong + i10;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (i(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iHashLong = p(obj, j10);
                        i11 = iHashLong + i10;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (i(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iHashLong = x7.hashBoolean(((Boolean) sc.f22643c.getObject(obj, j10)).booleanValue());
                        i11 = iHashLong + i10;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (i(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iHashLong = ((String) sc.f22643c.getObject(obj, j10)).hashCode();
                        i11 = iHashLong + i10;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (i(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iHashLong = sc.f22643c.getObject(obj, j10).hashCode();
                        i11 = iHashLong + i10;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (i(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iHashLong = sc.f22643c.getObject(obj, j10).hashCode();
                        i11 = iHashLong + i10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (i(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iHashLong = p(obj, j10);
                        i11 = iHashLong + i10;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (i(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iHashLong = p(obj, j10);
                        i11 = iHashLong + i10;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (i(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iHashLong = p(obj, j10);
                        i11 = iHashLong + i10;
                        break;
                    } else {
                        break;
                    }
                case TokenParametersOuterClass$TokenParameters.MOCKRESPONSEID_FIELD_NUMBER /* 65 */:
                    if (i(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iHashLong = x7.hashLong(q(obj, j10));
                        i11 = iHashLong + i10;
                        break;
                    } else {
                        break;
                    }
                case TokenParametersOuterClass$TokenParameters.LGPDCONSENT_FIELD_NUMBER /* 66 */:
                    if (i(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iHashLong = p(obj, j10);
                        i11 = iHashLong + i10;
                        break;
                    } else {
                        break;
                    }
                case TokenParametersOuterClass$TokenParameters.IGNITEVERSION_FIELD_NUMBER /* 67 */:
                    if (i(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iHashLong = x7.hashLong(q(obj, j10));
                        i11 = iHashLong + i10;
                        break;
                    } else {
                        break;
                    }
                case TokenParametersOuterClass$TokenParameters.IGNITEPACKAGENAME_FIELD_NUMBER /* 68 */:
                    if (i(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iHashLong = sc.f22643c.getObject(obj, j10).hashCode();
                        i11 = iHashLong + i10;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = this.f22558o.g(obj).hashCode() + (i11 * 53);
        if (!this.f22549f) {
            return iHashCode2;
        }
        return this.f22559p.getExtensions(obj).hashCode() + (iHashCode2 * 53);
    }

    public final boolean i(Object obj, int i10, int i11) {
        return sc.f22643c.getInt(obj, (long) (this.f22544a[i11 + 2] & 1048575)) == i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    @Override // com.explorestack.protobuf.ua
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isInitialized(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.r9.isInitialized(java.lang.Object):boolean");
    }

    public final void k(Object obj, int i10, Object obj2, m5 m5Var, la laVar) throws IOException {
        long jB = B(i10) & 1048575;
        Object object = sc.f22643c.getObject(obj, jB);
        d9 d9Var = this.f22560q;
        if (object == null) {
            object = d9Var.newMapField(obj2);
            sc.s(obj, jB, object);
        } else if (d9Var.isImmutable(object)) {
            Object objNewMapField = d9Var.newMapField(obj2);
            d9Var.mergeFrom(objNewMapField, object);
            sc.s(obj, jB, objNewMapField);
            object = objNewMapField;
        }
        laVar.readMap(d9Var.forMutableMapData(object), d9Var.forMapMetadata(obj2), m5Var);
    }

    public final void l(Object obj, Object obj2, int i10) {
        long jB = B(i10) & 1048575;
        if (h(obj2, i10)) {
            rc rcVar = sc.f22643c;
            Object object = rcVar.getObject(obj, jB);
            Object object2 = rcVar.getObject(obj2, jB);
            if (object != null && object2 != null) {
                sc.s(obj, jB, x7.b(object, object2));
                x(obj, i10);
            } else if (object2 != null) {
                sc.s(obj, jB, object2);
                x(obj, i10);
            }
        }
    }

    public final void m(Object obj, Object obj2, int i10) {
        int iB = B(i10);
        int i11 = this.f22544a[i10];
        long j10 = iB & 1048575;
        if (i(obj2, i11, i10)) {
            Object object = i(obj, i11, i10) ? sc.f22643c.getObject(obj, j10) : null;
            Object object2 = sc.f22643c.getObject(obj2, j10);
            if (object != null && object2 != null) {
                sc.s(obj, j10, x7.b(object, object2));
                y(obj, i11, i10);
            } else if (object2 != null) {
                sc.s(obj, j10, object2);
                y(obj, i11, i10);
            }
        }
    }

    @Override // com.explorestack.protobuf.ua
    public void makeImmutable(Object obj) {
        int[] iArr;
        int i10;
        int i11 = this.f22554k;
        while (true) {
            iArr = this.f22553j;
            i10 = this.f22555l;
            if (i11 >= i10) {
                break;
            }
            long jB = B(iArr[i11]) & 1048575;
            Object object = sc.f22643c.getObject(obj, jB);
            if (object != null) {
                sc.s(obj, jB, this.f22560q.toImmutable(object));
            }
            i11++;
        }
        int length = iArr.length;
        while (i10 < length) {
            this.f22557n.a(obj, iArr[i10]);
            i10++;
        }
        this.f22558o.j(obj);
        if (this.f22549f) {
            this.f22559p.e(obj);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    @Override // com.explorestack.protobuf.ua
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mergeFrom(java.lang.Object r11, java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.r9.mergeFrom(java.lang.Object, java.lang.Object):void");
    }

    @Override // com.explorestack.protobuf.ua
    public Object newInstance() {
        return this.f22556m.newInstance(this.f22548e);
    }

    public final void r(Object obj, byte[] bArr, int i10, int i11, long j10) {
        Unsafe unsafe = f22543s;
        Object objD = d(i11);
        Object object = unsafe.getObject(obj, j10);
        d9 d9Var = this.f22560q;
        if (d9Var.isImmutable(object)) {
            Object objNewMapField = d9Var.newMapField(objD);
            d9Var.mergeFrom(objNewMapField, object);
            unsafe.putObject(obj, j10, objNewMapField);
            object = objNewMapField;
        }
        d9Var.forMapMetadata(objD);
        d9Var.forMutableMapData(object);
        j.f(i10, bArr);
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int s(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16) {
        Unsafe unsafe = f22543s;
        long j11 = this.f22544a[i16 + 2] & 1048575;
        switch (i15) {
            case 51:
                if (i14 == 1) {
                    unsafe.putObject(obj, j10, Double.valueOf(Double.longBitsToDouble(j.b(bArr, i10))));
                    int i17 = i10 + 8;
                    unsafe.putInt(obj, j11, i13);
                    return i17;
                }
                return i10;
            case 52:
                if (i14 == 5) {
                    unsafe.putObject(obj, j10, Float.valueOf(Float.intBitsToFloat(j.a(bArr, i10))));
                    int i18 = i10 + 4;
                    unsafe.putInt(obj, j11, i13);
                    return i18;
                }
                return i10;
            case 53:
            case 54:
                if (i14 == 0) {
                    j.h(i10, bArr);
                    throw null;
                }
                return i10;
            case 55:
            case 62:
                if (i14 == 0) {
                    j.f(i10, bArr);
                    throw null;
                }
                return i10;
            case 56:
            case TokenParametersOuterClass$TokenParameters.MOCKRESPONSEID_FIELD_NUMBER /* 65 */:
                if (i14 == 1) {
                    unsafe.putObject(obj, j10, Long.valueOf(j.b(bArr, i10)));
                    int i19 = i10 + 8;
                    unsafe.putInt(obj, j11, i13);
                    return i19;
                }
                return i10;
            case 57:
            case 64:
                if (i14 == 5) {
                    unsafe.putObject(obj, j10, Integer.valueOf(j.a(bArr, i10)));
                    int i20 = i10 + 4;
                    unsafe.putInt(obj, j11, i13);
                    return i20;
                }
                return i10;
            case 58:
                if (i14 == 0) {
                    j.h(i10, bArr);
                    throw null;
                }
                return i10;
            case 59:
                if (i14 == 2) {
                    j.f(i10, bArr);
                    throw null;
                }
                return i10;
            case 60:
                if (i14 == 2) {
                    j.d(e(i16), bArr, i10, i11);
                    throw null;
                }
                return i10;
            case 61:
                if (i14 == 2) {
                    j.f(i10, bArr);
                    throw null;
                }
                return i10;
            case 63:
                if (i14 == 0) {
                    j.f(i10, bArr);
                    throw null;
                }
                return i10;
            case TokenParametersOuterClass$TokenParameters.LGPDCONSENT_FIELD_NUMBER /* 66 */:
                if (i14 == 0) {
                    j.f(i10, bArr);
                    throw null;
                }
                return i10;
            case TokenParametersOuterClass$TokenParameters.IGNITEVERSION_FIELD_NUMBER /* 67 */:
                if (i14 == 0) {
                    j.h(i10, bArr);
                    throw null;
                }
                return i10;
            case TokenParametersOuterClass$TokenParameters.IGNITEPACKAGENAME_FIELD_NUMBER /* 68 */:
                if (i14 == 3) {
                    j.c(e(i16), bArr, i10, i11, (i12 & (-8)) | 4);
                    throw null;
                }
                return i10;
            default:
                return i10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x0271, code lost:
    
        if (r8 == 1048575) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0273, code lost:
    
        r13.putInt(r1, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0277, code lost:
    
        r2 = r0.f22554k;
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x027b, code lost:
    
        r6 = r0.f22555l;
        r7 = r0.f22558o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x027f, code lost:
    
        if (r2 >= r6) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0281, code lost:
    
        r5 = (com.explorestack.protobuf.hc) r0.b(r1, r0.f22553j[r2], r5, r7);
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x028e, code lost:
    
        if (r5 == null) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0290, code lost:
    
        r7.n(r1, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0293, code lost:
    
        if (r3 != 0) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0295, code lost:
    
        if (r11 != r4) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x029c, code lost:
    
        throw com.explorestack.protobuf.InvalidProtocolBufferException.parseFailure();
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x029d, code lost:
    
        if (r11 > r4) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x029f, code lost:
    
        if (r10 != r3) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02a1, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02a6, code lost:
    
        throw com.explorestack.protobuf.InvalidProtocolBufferException.parseFailure();
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(byte[] r27, int r28, int r29, int r30, java.lang.Object r31) throws com.explorestack.protobuf.InvalidProtocolBufferException {
        /*
            Method dump skipped, instructions count: 720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.r9.t(byte[], int, int, int, java.lang.Object):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void u(byte[] bArr, int i10, int i11, Object obj) throws InvalidProtocolBufferException {
        int i12;
        int iZ;
        int i13;
        Unsafe unsafe;
        int i14;
        int i15;
        int i16;
        byte b10;
        int i17;
        int i18;
        r9 r9Var = this;
        byte[] bArr2 = bArr;
        int i19 = i11;
        Object obj2 = obj;
        Unsafe unsafe2 = f22543s;
        int iE = i10;
        int i20 = 1048575;
        int i21 = 0;
        int i22 = -1;
        int i23 = 0;
        while (iE < i19) {
            int i24 = iE;
            int i25 = i24 + 1;
            byte b11 = bArr2[i24];
            if (b11 < 0) {
                j.g(i25, bArr2);
                throw null;
            }
            int i26 = b11 >>> 3;
            int i27 = b11 & 7;
            int i28 = r9Var.f22547d;
            int i29 = r9Var.f22546c;
            if (i26 > i22) {
                iZ = (i26 < i29 || i26 > i28) ? -1 : r9Var.z(i26, i23 / 3);
                i12 = 0;
            } else if (i26 < i29 || i26 > i28) {
                i12 = 0;
                iZ = -1;
            } else {
                i12 = 0;
                iZ = r9Var.z(i26, 0);
            }
            int i30 = iZ;
            if (i30 == -1) {
                i13 = i26;
                i23 = i12;
                unsafe = unsafe2;
                b10 = b11;
            } else {
                int[] iArr = r9Var.f22544a;
                int i31 = iArr[i30 + 1];
                int iA = A(i31);
                i13 = i26;
                long j10 = i31 & 1048575;
                if (iA <= 17) {
                    int i32 = iArr[i30 + 2];
                    int i33 = 1 << (i32 >>> 20);
                    int i34 = i32 & 1048575;
                    if (i34 != i20) {
                        int i35 = 1048575;
                        i17 = i27;
                        if (i20 != 1048575) {
                            unsafe2.putInt(obj2, i20, i21);
                            i35 = 1048575;
                        }
                        if (i34 != i35) {
                            i21 = unsafe2.getInt(obj2, i34);
                        }
                        i18 = i34;
                    } else {
                        i17 = i27;
                        i18 = i20;
                    }
                    int i36 = i21;
                    switch (iA) {
                        case 0:
                            unsafe = unsafe2;
                            if (i17 == 1) {
                                sc.f22643c.putDouble(obj2, j10, Double.longBitsToDouble(j.b(bArr2, i25)));
                                iE = i24 + 9;
                                i21 = i36 | i33;
                                i20 = i18;
                                unsafe2 = unsafe;
                                i23 = i30;
                                i22 = i13;
                            }
                            i20 = i18;
                            i21 = i36;
                            i23 = i30;
                            b10 = b11;
                            break;
                        case 1:
                            unsafe = unsafe2;
                            if (i17 == 5) {
                                sc.f22643c.putFloat(obj2, j10, Float.intBitsToFloat(j.a(bArr2, i25)));
                                iE = i24 + 5;
                                i21 = i36 | i33;
                                i20 = i18;
                                unsafe2 = unsafe;
                                i23 = i30;
                                i22 = i13;
                            }
                            i20 = i18;
                            i21 = i36;
                            i23 = i30;
                            b10 = b11;
                            break;
                        case 2:
                        case 3:
                            unsafe = unsafe2;
                            if (i17 == 0) {
                                j.h(i25, bArr2);
                                throw null;
                            }
                            i20 = i18;
                            i21 = i36;
                            i23 = i30;
                            b10 = b11;
                            break;
                        case 4:
                        case 11:
                            unsafe = unsafe2;
                            if (i17 == 0) {
                                j.f(i25, bArr2);
                                throw null;
                            }
                            i20 = i18;
                            i21 = i36;
                            i23 = i30;
                            b10 = b11;
                            break;
                        case 5:
                        case 14:
                            if (i17 == 1) {
                                unsafe2.putLong(obj2, j10, j.b(bArr2, i25));
                                iE = i24 + 9;
                                i21 = i36 | i33;
                                i20 = i18;
                                i23 = i30;
                                i22 = i13;
                            }
                            unsafe = unsafe2;
                            i20 = i18;
                            i21 = i36;
                            i23 = i30;
                            b10 = b11;
                            break;
                        case 6:
                        case 13:
                            if (i17 == 5) {
                                unsafe2.putInt(obj2, j10, j.a(bArr2, i25));
                                iE = i24 + 5;
                                i21 = i36 | i33;
                                i20 = i18;
                                i23 = i30;
                                i22 = i13;
                            }
                            unsafe = unsafe2;
                            i20 = i18;
                            i21 = i36;
                            i23 = i30;
                            b10 = b11;
                            break;
                        case 7:
                            if (i17 == 0) {
                                j.h(i25, bArr2);
                                throw null;
                            }
                            unsafe = unsafe2;
                            i20 = i18;
                            i21 = i36;
                            i23 = i30;
                            b10 = b11;
                            break;
                        case 8:
                            if (i17 == 2) {
                                if ((536870912 & i31) == 0) {
                                    j.f(i25, bArr2);
                                    throw null;
                                }
                                j.f(i25, bArr2);
                                throw null;
                            }
                            unsafe = unsafe2;
                            i20 = i18;
                            i21 = i36;
                            i23 = i30;
                            b10 = b11;
                            break;
                        case 9:
                            if (i17 == 2) {
                                j.d(r9Var.e(i30), bArr2, i25, i19);
                                throw null;
                            }
                            unsafe = unsafe2;
                            i20 = i18;
                            i21 = i36;
                            i23 = i30;
                            b10 = b11;
                            break;
                        case 10:
                            if (i17 == 2) {
                                j.f(i25, bArr2);
                                throw null;
                            }
                            unsafe = unsafe2;
                            i20 = i18;
                            i21 = i36;
                            i23 = i30;
                            b10 = b11;
                            break;
                        case 12:
                            if (i17 == 0) {
                                j.f(i25, bArr2);
                                throw null;
                            }
                            unsafe = unsafe2;
                            i20 = i18;
                            i21 = i36;
                            i23 = i30;
                            b10 = b11;
                            break;
                        case 15:
                            if (i17 == 0) {
                                j.f(i25, bArr2);
                                throw null;
                            }
                            unsafe = unsafe2;
                            i20 = i18;
                            i21 = i36;
                            i23 = i30;
                            b10 = b11;
                            break;
                        case 16:
                            if (i17 == 0) {
                                j.h(i25, bArr2);
                                throw null;
                            }
                            unsafe = unsafe2;
                            i20 = i18;
                            i21 = i36;
                            i23 = i30;
                            b10 = b11;
                            break;
                        default:
                            unsafe = unsafe2;
                            i20 = i18;
                            i21 = i36;
                            i23 = i30;
                            b10 = b11;
                            break;
                    }
                } else {
                    unsafe = unsafe2;
                    if (iA != 27) {
                        if (iA <= 49) {
                            i16 = i21;
                            i14 = i20;
                            int iV = v(obj, bArr2, i25, i19, b11, i27, i30, i31, iA, j10);
                            i15 = i30;
                            if (iV != i25) {
                                r9Var = this;
                                bArr2 = bArr;
                                i19 = i11;
                                obj2 = obj;
                                iE = iV;
                            } else {
                                bArr2 = bArr;
                                i19 = i11;
                                obj2 = obj;
                                i25 = iV;
                                i23 = i15;
                                i20 = i14;
                                i21 = i16;
                                b10 = b11;
                            }
                        } else {
                            i14 = i20;
                            i15 = i30;
                            i16 = i21;
                            if (iA != 50) {
                                bArr2 = bArr;
                                i19 = i11;
                                obj2 = obj;
                                b10 = b11;
                                int iS = s(obj2, bArr2, i25, i19, b10, i13, i27, iA, j10, i15);
                                if (iS != i25) {
                                    r9Var = this;
                                    iE = iS;
                                } else {
                                    i25 = iS;
                                    i23 = i15;
                                    i20 = i14;
                                    i21 = i16;
                                }
                            } else if (i27 == 2) {
                                r(obj, bArr, i25, i15, j10);
                                throw null;
                            }
                        }
                        i23 = i15;
                        unsafe2 = unsafe;
                        i20 = i14;
                        i21 = i16;
                        i22 = i13;
                    } else {
                        if (i27 == 2) {
                            w7 w7Var = (w7) unsafe.getObject(obj2, j10);
                            if (!w7Var.isModifiable()) {
                                int size = w7Var.size();
                                unsafe.putObject(obj2, j10, w7Var.mutableCopyWithCapacity(size == 0 ? 10 : 2 * size));
                            }
                            j.d(r9Var.e(i30), bArr2, i25, i19);
                            throw null;
                        }
                        i14 = i20;
                        i15 = i30;
                        i16 = i21;
                    }
                    bArr2 = bArr;
                    i19 = i11;
                    obj2 = obj;
                    i23 = i15;
                    i20 = i14;
                    i21 = i16;
                    b10 = b11;
                }
            }
            h6 h6Var = (h6) obj2;
            hc hcVarA = h6Var.f22197b;
            if (hcVarA == hc.getDefaultInstance()) {
                hcVarA = hc.a();
                h6Var.f22197b = hcVarA;
            }
            iE = j.e(b10, bArr2, i25, i19, hcVarA);
            r9Var = this;
            unsafe2 = unsafe;
            i22 = i13;
        }
        int i37 = iE;
        Unsafe unsafe3 = unsafe2;
        int i38 = i20;
        int i39 = i21;
        if (i38 != 1048575) {
            unsafe3.putInt(obj2, i38, i39);
        }
        if (i37 != i19) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int v(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, long j10, int i15, long j11) {
        Unsafe unsafe = f22543s;
        w7 w7VarMutableCopyWithCapacity = (w7) unsafe.getObject(obj, j11);
        if (!w7VarMutableCopyWithCapacity.isModifiable()) {
            int size = w7VarMutableCopyWithCapacity.size();
            w7VarMutableCopyWithCapacity = w7VarMutableCopyWithCapacity.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j11, w7VarMutableCopyWithCapacity);
        }
        switch (i15) {
            case 18:
            case 35:
                if (i13 == 2) {
                    j.f(i10, bArr);
                    throw null;
                }
                if (i13 == 1) {
                    ((y4) w7VarMutableCopyWithCapacity).addDouble(Double.longBitsToDouble(j.b(bArr, i10)));
                    int i16 = i10 + 8;
                    if (i16 >= i11) {
                        return i16;
                    }
                    j.f(i16, bArr);
                    throw null;
                }
                return i10;
            case 19:
            case 36:
                if (i13 == 2) {
                    j.f(i10, bArr);
                    throw null;
                }
                if (i13 == 5) {
                    ((d6) w7VarMutableCopyWithCapacity).addFloat(Float.intBitsToFloat(j.a(bArr, i10)));
                    int i17 = i10 + 4;
                    if (i17 >= i11) {
                        return i17;
                    }
                    j.f(i17, bArr);
                    throw null;
                }
                return i10;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i13 == 2) {
                    j.f(i10, bArr);
                    throw null;
                }
                if (i13 == 0) {
                    j.h(i10, bArr);
                    throw null;
                }
                return i10;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i13 == 2) {
                    j.f(i10, bArr);
                    throw null;
                }
                if (i13 == 0) {
                    j.f(i10, bArr);
                    throw null;
                }
                return i10;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i13 == 2) {
                    j.f(i10, bArr);
                    throw null;
                }
                if (i13 == 1) {
                    ((l8) w7VarMutableCopyWithCapacity).addLong(j.b(bArr, i10));
                    int i18 = i10 + 8;
                    if (i18 >= i11) {
                        return i18;
                    }
                    j.f(i18, bArr);
                    throw null;
                }
                return i10;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i13 == 2) {
                    j.f(i10, bArr);
                    throw null;
                }
                if (i13 == 5) {
                    ((l7) w7VarMutableCopyWithCapacity).addInt(j.a(bArr, i10));
                    int i19 = i10 + 4;
                    if (i19 >= i11) {
                        return i19;
                    }
                    j.f(i19, bArr);
                    throw null;
                }
                return i10;
            case 25:
            case 42:
                if (i13 == 2) {
                    j.f(i10, bArr);
                    throw null;
                }
                if (i13 == 0) {
                    j.h(i10, bArr);
                    throw null;
                }
                return i10;
            case 26:
                if (i13 == 2) {
                    if ((j10 & 536870912) == 0) {
                        j.f(i10, bArr);
                        throw null;
                    }
                    j.f(i10, bArr);
                    throw null;
                }
                return i10;
            case 27:
                if (i13 == 2) {
                    j.d(e(i14), bArr, i10, i11);
                    throw null;
                }
                return i10;
            case 28:
                if (i13 == 2) {
                    j.f(i10, bArr);
                    throw null;
                }
                return i10;
            case 30:
            case 44:
                if (i13 == 2) {
                    j.f(i10, bArr);
                    throw null;
                }
                if (i13 == 0) {
                    j.f(i10, bArr);
                    throw null;
                }
                return i10;
            case 33:
            case 47:
                if (i13 == 2) {
                    j.f(i10, bArr);
                    throw null;
                }
                if (i13 == 0) {
                    j.f(i10, bArr);
                    throw null;
                }
                return i10;
            case 34:
            case 48:
                if (i13 == 2) {
                    j.f(i10, bArr);
                    throw null;
                }
                if (i13 == 0) {
                    j.h(i10, bArr);
                    throw null;
                }
                return i10;
            case 49:
                if (i13 == 3) {
                    j.c(e(i14), bArr, i10, i11, (i12 & (-8)) | 4);
                    throw null;
                }
                return i10;
            default:
                return i10;
        }
    }

    public final void w(Object obj, int i10, la laVar) {
        if ((536870912 & i10) != 0) {
            sc.s(obj, i10 & 1048575, laVar.readStringRequireUtf8());
        } else if (this.f22550g) {
            sc.s(obj, i10 & 1048575, laVar.readString());
        } else {
            sc.s(obj, i10 & 1048575, laVar.readBytes());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:187:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    @Override // com.explorestack.protobuf.ua
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void writeTo(java.lang.Object r18, com.explorestack.protobuf.kd r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.r9.writeTo(java.lang.Object, com.explorestack.protobuf.kd):void");
    }

    public final void x(Object obj, int i10) {
        int i11 = this.f22544a[i10 + 2];
        long j10 = 1048575 & i11;
        if (j10 == 1048575) {
            return;
        }
        sc.q(obj, j10, (1 << (i11 >>> 20)) | sc.f22643c.getInt(obj, j10));
    }

    public final void y(Object obj, int i10, int i11) {
        sc.q(obj, this.f22544a[i11 + 2] & 1048575, i10);
    }

    public final int z(int i10, int i11) {
        int[] iArr = this.f22544a;
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

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        r9.n(r2, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x06a1, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0084, code lost:
    
        if (r12 >= r11) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0086, code lost:
    
        r8 = r1.b(r2, r10[r12], r8, r9);
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008f, code lost:
    
        if (r8 == null) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:191:0x066d A[Catch: all -> 0x049c, TRY_LEAVE, TryCatch #11 {all -> 0x049c, blocks: (B:189:0x0667, B:191:0x066d, B:199:0x0687, B:200:0x068c, B:143:0x047c, B:148:0x04a2, B:150:0x04b8, B:151:0x04cc, B:152:0x04e0, B:153:0x04f4, B:154:0x0508, B:156:0x0517, B:159:0x051e, B:160:0x0524, B:161:0x0530, B:162:0x0545, B:163:0x055a, B:165:0x0565, B:166:0x0584, B:167:0x0598, B:168:0x05a5, B:169:0x05bc, B:170:0x05d1, B:171:0x05e6, B:172:0x05fb, B:173:0x0610, B:174:0x0625, B:175:0x063c, B:181:0x0656), top: B:231:0x0667 }] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x06ab A[LOOP:4: B:210:0x06a9->B:211:0x06ab, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x06b6  */
    @Override // com.explorestack.protobuf.ua
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mergeFrom(java.lang.Object r19, com.explorestack.protobuf.la r20, com.explorestack.protobuf.m5 r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1864
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.r9.mergeFrom(java.lang.Object, com.explorestack.protobuf.la, com.explorestack.protobuf.m5):void");
    }

    @Override // com.explorestack.protobuf.ua
    public void mergeFrom(Object obj, byte[] bArr, int i10, int i11, i iVar) throws IOException {
        if (this.f22551h) {
            u(bArr, i10, i11, obj);
        } else {
            t(bArr, i10, i11, 0, obj);
        }
    }
}
