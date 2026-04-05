package o5;

import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n2 implements FlowCollector {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.b1 f77672b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f77673c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f77674e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String[] f77675f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int[] f77676g;

    public n2(kotlin.jvm.internal.b1 b1Var, boolean z10, FlowCollector flowCollector, String[] strArr, int[] iArr) {
        this.f77672b = b1Var;
        this.f77673c = z10;
        this.f77674e = flowCollector;
        this.f77675f = strArr;
        this.f77676g = iArr;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public /* bridge */ /* synthetic */ Object emit(Object obj, zu.d dVar) {
        return emit((int[]) obj, (zu.d<? super tu.x0>) dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        if (r6.emit(r15, r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009c, code lost:
    
        if (r6.emit(r15, r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009e, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(int[] r14, zu.d<? super tu.x0> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof o5.m2
            if (r0 == 0) goto L13
            r0 = r15
            o5.m2 r0 = (o5.m2) r0
            int r1 = r0.f77664m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f77664m = r1
            goto L18
        L13:
            o5.m2 r0 = new o5.m2
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.f77662k
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f77664m
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L31
            if (r2 != r3) goto L29
            goto L31
        L29:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L31:
            int[] r14 = r0.f77661j
            o5.n2 r0 = r0.f77660i
            tu.a0.throwOnFailure(r15)
            goto La0
        L39:
            tu.a0.throwOnFailure(r15)
            kotlin.jvm.internal.b1 r15 = r13.f77672b
            java.lang.Object r2 = r15.f71816b
            java.lang.String[] r5 = r13.f77675f
            kotlinx.coroutines.flow.FlowCollector r6 = r13.f77674e
            if (r2 != 0) goto L5b
            boolean r15 = r13.f77673c
            if (r15 == 0) goto L9f
            java.util.Set r15 = uu.k0.toSet(r5)
            r0.f77660i = r13
            r0.f77661j = r14
            r0.f77664m = r4
            java.lang.Object r15 = r6.emit(r15, r0)
            if (r15 != r1) goto L9f
            goto L9e
        L5b:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r4 = r5.length
            r7 = 0
            r8 = r7
        L63:
            if (r7 >= r4) goto L88
            r9 = r5[r7]
            int r10 = r8 + 1
            java.lang.Object r11 = r15.f71816b
            if (r11 == 0) goto L80
            int[] r11 = (int[]) r11
            int[] r12 = r13.f77676g
            r8 = r12[r8]
            r11 = r11[r8]
            r8 = r14[r8]
            if (r11 == r8) goto L7c
            r2.add(r9)
        L7c:
            int r7 = r7 + 1
            r8 = r10
            goto L63
        L80:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "Required value was null."
            r14.<init>(r15)
            throw r14
        L88:
            boolean r15 = r2.isEmpty()
            if (r15 != 0) goto L9f
            java.util.Set r15 = uu.y0.toSet(r2)
            r0.f77660i = r13
            r0.f77661j = r14
            r0.f77664m = r3
            java.lang.Object r15 = r6.emit(r15, r0)
            if (r15 != r1) goto L9f
        L9e:
            return r1
        L9f:
            r0 = r13
        La0:
            kotlin.jvm.internal.b1 r15 = r0.f77672b
            r15.f71816b = r14
            tu.x0 r14 = tu.x0.f87415a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.n2.emit(int[], zu.d):java.lang.Object");
    }
}
