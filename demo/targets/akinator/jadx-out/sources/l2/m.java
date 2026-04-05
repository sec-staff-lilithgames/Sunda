package l2;

import java.util.List;
import p0.j2;
import p0.o5;
import p0.v5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m implements v5 {

    /* renamed from: b, reason: collision with root package name */
    public final List f72320b;

    /* renamed from: c, reason: collision with root package name */
    public final u1 f72321c;

    /* renamed from: e, reason: collision with root package name */
    public final o f72322e;

    /* renamed from: f, reason: collision with root package name */
    public final kv.l f72323f;

    /* renamed from: g, reason: collision with root package name */
    public final h1 f72324g;

    /* renamed from: h, reason: collision with root package name */
    public final j2 f72325h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f72326i;

    public m(List<? extends w> fontList, Object initialType, u1 typefaceRequest, o asyncTypefaceCache, kv.l onCompletion, h1 platformFontLoader) {
        kotlin.jvm.internal.e0.checkNotNullParameter(fontList, "fontList");
        kotlin.jvm.internal.e0.checkNotNullParameter(initialType, "initialType");
        kotlin.jvm.internal.e0.checkNotNullParameter(typefaceRequest, "typefaceRequest");
        kotlin.jvm.internal.e0.checkNotNullParameter(asyncTypefaceCache, "asyncTypefaceCache");
        kotlin.jvm.internal.e0.checkNotNullParameter(onCompletion, "onCompletion");
        kotlin.jvm.internal.e0.checkNotNullParameter(platformFontLoader, "platformFontLoader");
        this.f72320b = fontList;
        this.f72321c = typefaceRequest;
        this.f72322e = asyncTypefaceCache;
        this.f72323f = onCompletion;
        this.f72324g = platformFontLoader;
        this.f72325h = o5.mutableStateOf$default(initialType, null, 2, null);
        this.f72326i = true;
    }

    public final boolean getCacheable$ui_text_release() {
        return this.f72326i;
    }

    @Override // p0.v5
    public Object getValue() {
        return this.f72325h.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f6, code lost:
    
        if (kotlinx.coroutines.YieldKt.yield(r2) == r3) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b2 A[Catch: all -> 0x0040, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0040, blocks: (B:13:0x003a, B:35:0x00b2, B:38:0x00e2), top: B:54:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e2 A[Catch: all -> 0x0040, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0040, blocks: (B:13:0x003a, B:35:0x00b2, B:38:0x00e2), top: B:54:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00f6 -> B:41:0x00f9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0101 -> B:45:0x0103). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object load(zu.d<? super tu.x0> r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.m.load(zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadWithTimeoutOrNull$ui_text_release(l2.w r7, zu.d<java.lang.Object> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof l2.k
            if (r0 == 0) goto L13
            r0 = r8
            l2.k r0 = (l2.k) r0
            int r1 = r0.f72313l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f72313l = r1
            goto L18
        L13:
            l2.k r0 = new l2.k
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f72311j
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f72313l
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            l2.w r7 = r0.f72310i
            tu.a0.throwOnFailure(r8)     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> L2e
            return r8
        L2c:
            r8 = move-exception
            goto L4e
        L2e:
            r7 = move-exception
            goto L77
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            tu.a0.throwOnFailure(r8)
            l2.l r8 = new l2.l     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> L2e
            r8.<init>(r6, r7, r4)     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> L2e
            r0.f72310i = r7     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> L2e
            r0.f72313l = r3     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> L2e
            r2 = 15000(0x3a98, double:7.411E-320)
            java.lang.Object r7 = kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(r2, r8, r0)     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> L2e
            if (r7 != r1) goto L4d
            return r1
        L4d:
            return r7
        L4e:
            zu.m r1 = r0.getContext()
            kotlinx.coroutines.CoroutineExceptionHandler$Key r2 = kotlinx.coroutines.CoroutineExceptionHandler.Key
            zu.k r1 = r1.get(r2)
            kotlinx.coroutines.CoroutineExceptionHandler r1 = (kotlinx.coroutines.CoroutineExceptionHandler) r1
            if (r1 == 0) goto L81
            zu.m r0 = r0.getContext()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Unable to load font "
            r3.<init>(r5)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            r2.<init>(r7, r8)
            r1.handleException(r0, r2)
            goto L81
        L77:
            zu.m r8 = r0.getContext()
            boolean r8 = kotlinx.coroutines.JobKt.isActive(r8)
            if (r8 == 0) goto L82
        L81:
            return r4
        L82:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.m.loadWithTimeoutOrNull$ui_text_release(l2.w, zu.d):java.lang.Object");
    }

    public final void setCacheable$ui_text_release(boolean z10) {
        this.f72326i = z10;
    }
}
