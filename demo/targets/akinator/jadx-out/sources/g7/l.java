package g7;

import android.content.Context;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l implements i {

    /* renamed from: a, reason: collision with root package name */
    public final l7.i f57435a;

    /* renamed from: b, reason: collision with root package name */
    public final List f57436b;

    /* renamed from: c, reason: collision with root package name */
    public final int f57437c;

    /* renamed from: d, reason: collision with root package name */
    public final l7.i f57438d;

    /* renamed from: e, reason: collision with root package name */
    public final m7.j f57439e;

    /* renamed from: f, reason: collision with root package name */
    public final a7.g f57440f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f57441g;

    public l(l7.i iVar, List<? extends j> list, int i10, l7.i iVar2, m7.j jVar, a7.g gVar, boolean z10) {
        this.f57435a = iVar;
        this.f57436b = list;
        this.f57437c = i10;
        this.f57438d = iVar2;
        this.f57439e = jVar;
        this.f57440f = gVar;
        this.f57441g = z10;
    }

    public static l b(l lVar, int i10, l7.i iVar, m7.j jVar, int i11) {
        if ((i11 & 1) != 0) {
            i10 = lVar.f57437c;
        }
        int i12 = i10;
        if ((i11 & 2) != 0) {
            iVar = lVar.getRequest();
        }
        l7.i iVar2 = iVar;
        if ((i11 & 4) != 0) {
            jVar = lVar.getSize();
        }
        return new l(lVar.f57435a, lVar.f57436b, i12, iVar2, jVar, lVar.f57440f, lVar.f57441g);
    }

    public final void a(l7.i iVar, j jVar) {
        Context context = iVar.getContext();
        l7.i iVar2 = this.f57435a;
        if (context != iVar2.getContext()) {
            throw new IllegalStateException(("Interceptor '" + jVar + "' cannot modify the request's context.").toString());
        }
        if (iVar.getData() == l7.l.f72621a) {
            throw new IllegalStateException(("Interceptor '" + jVar + "' cannot set the request's data to null.").toString());
        }
        if (iVar.getTarget() != iVar2.getTarget()) {
            throw new IllegalStateException(("Interceptor '" + jVar + "' cannot modify the request's target.").toString());
        }
        if (iVar.getLifecycle() != iVar2.getLifecycle()) {
            throw new IllegalStateException(("Interceptor '" + jVar + "' cannot modify the request's lifecycle.").toString());
        }
        if (iVar.getSizeResolver() == iVar2.getSizeResolver()) {
            return;
        }
        throw new IllegalStateException(("Interceptor '" + jVar + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
    }

    public final a7.g getEventListener() {
        return this.f57440f;
    }

    public final int getIndex() {
        return this.f57437c;
    }

    public final l7.i getInitialRequest() {
        return this.f57435a;
    }

    public final List<j> getInterceptors() {
        return this.f57436b;
    }

    @Override // g7.i
    public l7.i getRequest() {
        return this.f57438d;
    }

    @Override // g7.i
    public m7.j getSize() {
        return this.f57439e;
    }

    public final boolean isPlaceholderCached() {
        return this.f57441g;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // g7.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object proceed(l7.i r7, zu.d<? super l7.k> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof g7.k
            if (r0 == 0) goto L13
            r0 = r8
            g7.k r0 = (g7.k) r0
            int r1 = r0.f57434m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f57434m = r1
            goto L18
        L13:
            g7.k r0 = new g7.k
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f57432k
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f57434m
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            g7.j r7 = r0.f57431j
            g7.l r0 = r0.f57430i
            tu.a0.throwOnFailure(r8)
            goto L67
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            tu.a0.throwOnFailure(r8)
            java.util.List r8 = r6.f57436b
            int r2 = r6.f57437c
            if (r2 <= 0) goto L49
            int r4 = r2 + (-1)
            java.lang.Object r4 = r8.get(r4)
            g7.j r4 = (g7.j) r4
            r6.a(r7, r4)
        L49:
            java.lang.Object r8 = r8.get(r2)
            g7.j r8 = (g7.j) r8
            int r2 = r2 + r3
            r4 = 0
            r5 = 4
            g7.l r7 = b(r6, r2, r7, r4, r5)
            r0.f57430i = r6
            r0.f57431j = r8
            r0.f57434m = r3
            java.lang.Object r7 = r8.intercept(r7, r0)
            if (r7 != r1) goto L63
            return r1
        L63:
            r0 = r8
            r8 = r7
            r7 = r0
            r0 = r6
        L67:
            l7.k r8 = (l7.k) r8
            l7.i r1 = r8.getRequest()
            r0.a(r1, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: g7.l.proceed(l7.i, zu.d):java.lang.Object");
    }

    @Override // g7.i
    public l withSize(m7.j jVar) {
        return b(this, 0, null, jVar, 3);
    }
}
