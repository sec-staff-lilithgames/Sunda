package g7;

import a7.m;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.List;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import l7.o;
import l7.r;
import q7.n;
import q7.p;
import q7.v;
import uu.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a implements j {

    /* renamed from: a, reason: collision with root package name */
    public final m f57356a;

    /* renamed from: b, reason: collision with root package name */
    public final r f57357b;

    /* renamed from: c, reason: collision with root package name */
    public final j7.g f57358c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: g7.a$a, reason: collision with other inner class name */
    public static final class C0572a {
        public C0572a(u uVar) {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Drawable f57359a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f57360b;

        /* renamed from: c, reason: collision with root package name */
        public final c7.f f57361c;

        /* renamed from: d, reason: collision with root package name */
        public final String f57362d;

        public b(Drawable drawable, boolean z10, c7.f fVar, String str) {
            this.f57359a = drawable;
            this.f57360b = z10;
            this.f57361c = fVar;
            this.f57362d = str;
        }

        public static /* synthetic */ b copy$default(b bVar, Drawable drawable, boolean z10, c7.f fVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                drawable = bVar.f57359a;
            }
            if ((i10 & 2) != 0) {
                z10 = bVar.f57360b;
            }
            if ((i10 & 4) != 0) {
                fVar = bVar.f57361c;
            }
            if ((i10 & 8) != 0) {
                str = bVar.f57362d;
            }
            return bVar.copy(drawable, z10, fVar, str);
        }

        public final b copy(Drawable drawable, boolean z10, c7.f fVar, String str) {
            return new b(drawable, z10, fVar, str);
        }

        public final c7.f getDataSource() {
            return this.f57361c;
        }

        public final String getDiskCacheKey() {
            return this.f57362d;
        }

        public final Drawable getDrawable() {
            return this.f57359a;
        }

        public final boolean isSampled() {
            return this.f57360b;
        }
    }

    static {
        new C0572a(null);
    }

    public a(m mVar, r rVar, v vVar) {
        this.f57356a = mVar;
        this.f57357b = rVar;
        this.f57358c = new j7.g(mVar, rVar, null);
    }

    public static final Bitmap access$convertDrawableToBitmap(a aVar, Drawable drawable, o oVar, List list) {
        aVar.getClass();
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            if (k0.contains(n.getVALID_TRANSFORMATION_CONFIGS(), q7.a.getSafeConfig(bitmap))) {
                return bitmap;
            }
        }
        return p.f82549a.convertToBitmap(drawable, oVar.getConfig(), oVar.getSize(), oVar.getScale(), oVar.getAllowInexactSize());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x008d -> B:21:0x0094). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$decode(g7.a r6, f7.o r7, a7.b r8, l7.i r9, java.lang.Object r10, l7.o r11, a7.g r12, zu.d r13) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g7.a.access$decode(g7.a, f7.o, a7.b, l7.i, java.lang.Object, l7.o, a7.g, zu.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x01e8, code lost:
    
        if (r1 == r7) goto L74;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$execute(g7.a r32, l7.i r33, java.lang.Object r34, l7.o r35, a7.g r36, zu.d r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g7.a.access$execute(g7.a, l7.i, java.lang.Object, l7.o, a7.g, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0087 -> B:21:0x008b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(a7.b r8, l7.i r9, java.lang.Object r10, l7.o r11, a7.g r12, zu.d r13) throws java.io.IOException {
        /*
            r7 = this;
            boolean r0 = r13 instanceof g7.e
            if (r0 == 0) goto L13
            r0 = r13
            g7.e r0 = (g7.e) r0
            int r1 = r0.f57404s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f57404s = r1
            goto L18
        L13:
            g7.e r0 = new g7.e
            r0.<init>(r7, r13)
        L18:
            java.lang.Object r13 = r0.f57402q
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f57404s
            r3 = 1
            if (r2 == 0) goto L4b
            if (r2 != r3) goto L43
            int r8 = r0.f57401p
            f7.i r9 = r0.f57400o
            a7.c r10 = r0.f57399n
            l7.o r11 = r0.f57398m
            java.lang.Object r12 = r0.f57397l
            l7.i r2 = r0.f57396k
            a7.b r4 = r0.f57395j
            g7.a r5 = r0.f57394i
            tu.a0.throwOnFailure(r13)
            r6 = r0
            r0 = r8
            r8 = r4
            r4 = r6
            r6 = r2
            r2 = r9
            r9 = r6
            r6 = r12
            r12 = r10
            r10 = r6
            goto L8b
        L43:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L4b:
            tu.a0.throwOnFailure(r13)
            r13 = 0
            r5 = r7
        L50:
            a7.m r2 = r5.f57356a
            tu.v r13 = r8.newFetcher(r10, r11, r2, r13)
            if (r13 == 0) goto Lab
            java.lang.Object r2 = r13.getFirst()
            f7.i r2 = (f7.i) r2
            java.lang.Object r13 = r13.getSecond()
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            int r13 = r13 + r3
            a7.c r12 = (a7.c) r12
            r12.fetchStart(r9, r2, r11)
            r0.f57394i = r5
            r0.f57395j = r8
            r0.f57396k = r9
            r0.f57397l = r10
            r0.f57398m = r11
            r0.f57399n = r12
            r0.f57400o = r2
            r0.f57401p = r13
            r0.f57404s = r3
            java.lang.Object r4 = r2.fetch(r0)
            if (r4 != r1) goto L87
            return r1
        L87:
            r6 = r0
            r0 = r13
            r13 = r4
            r4 = r6
        L8b:
            f7.g r13 = (f7.g) r13
            r12.fetchEnd(r9, r2, r11, r13)     // Catch: java.lang.Throwable -> L96
            if (r13 == 0) goto L93
            return r13
        L93:
            r13 = r0
            r0 = r4
            goto L50
        L96:
            r8 = move-exception
            boolean r9 = r13 instanceof f7.o
            if (r9 == 0) goto L9e
            f7.o r13 = (f7.o) r13
            goto L9f
        L9e:
            r13 = 0
        L9f:
            if (r13 == 0) goto Laa
            c7.s r9 = r13.getSource()
            if (r9 == 0) goto Laa
            q7.n.closeQuietly(r9)
        Laa:
            throw r8
        Lab:
            java.lang.String r8 = "Unable to create a fetcher that supports: "
            java.lang.String r8 = j1.o2.j(r10, r8)
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r8 = r8.toString()
            r9.<init>(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: g7.a.a(a7.b, l7.i, java.lang.Object, l7.o, a7.g, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // g7.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object intercept(g7.i r15, zu.d<? super l7.k> r16) throws java.lang.Throwable {
        /*
            r14 = this;
            r0 = r16
            j7.g r2 = r14.f57358c
            boolean r3 = r0 instanceof g7.f
            if (r3 == 0) goto L18
            r3 = r0
            g7.f r3 = (g7.f) r3
            int r4 = r3.f57409m
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L18
            int r4 = r4 - r5
            r3.f57409m = r4
        L16:
            r9 = r3
            goto L1e
        L18:
            g7.f r3 = new g7.f
            r3.<init>(r14, r0)
            goto L16
        L1e:
            java.lang.Object r0 = r9.f57407k
            java.lang.Object r10 = av.e.getCOROUTINE_SUSPENDED()
            int r3 = r9.f57409m
            r11 = 1
            if (r3 == 0) goto L3f
            if (r3 != r11) goto L37
            g7.i r2 = r9.f57406j
            g7.a r3 = r9.f57405i
            tu.a0.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L33
            return r0
        L33:
            r0 = move-exception
            r7 = r2
            goto La2
        L37:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L3f:
            tu.a0.throwOnFailure(r0)
            l7.i r0 = r15.getRequest()     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r3 = r0.getData()     // Catch: java.lang.Throwable -> L7a
            m7.j r4 = r15.getSize()     // Catch: java.lang.Throwable -> L7a
            a7.g r5 = q7.n.getEventListener(r15)     // Catch: java.lang.Throwable -> L7a
            l7.r r6 = r14.f57357b     // Catch: java.lang.Throwable -> L7a
            l7.o r6 = r6.options(r0, r4)     // Catch: java.lang.Throwable -> L7a
            m7.i r8 = r6.getScale()     // Catch: java.lang.Throwable -> L7a
            a7.c r5 = (a7.c) r5     // Catch: java.lang.Throwable -> L7a
            r5.mapStart(r0, r3)     // Catch: java.lang.Throwable -> L7a
            a7.m r12 = r14.f57356a     // Catch: java.lang.Throwable -> L7a
            a7.b r12 = r12.getComponents()     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r3 = r12.map(r3, r6)     // Catch: java.lang.Throwable -> L7a
            r5.mapEnd(r0, r3)     // Catch: java.lang.Throwable -> L7a
            r12 = r6
            coil.memory.MemoryCache$Key r6 = r2.newCacheKey(r0, r3, r12, r5)     // Catch: java.lang.Throwable -> L7a
            if (r6 == 0) goto L7e
            j7.e r4 = r2.getCacheValue(r0, r6, r4, r8)     // Catch: java.lang.Throwable -> L7a
            goto L7f
        L7a:
            r0 = move-exception
            r3 = r14
            r7 = r15
            goto La2
        L7e:
            r4 = 0
        L7f:
            if (r4 == 0) goto L86
            l7.s r0 = r2.newResult(r15, r0, r6, r4)     // Catch: java.lang.Throwable -> L7a
            return r0
        L86:
            kotlinx.coroutines.CoroutineDispatcher r13 = r0.getFetcherDispatcher()     // Catch: java.lang.Throwable -> L7a
            r2 = r0
            g7.g r0 = new g7.g     // Catch: java.lang.Throwable -> L7a
            r8 = 0
            r1 = r14
            r7 = r15
            r4 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L7a
            r9.f57405i = r14     // Catch: java.lang.Throwable -> L7a
            r9.f57406j = r15     // Catch: java.lang.Throwable -> L7a
            r9.f57409m = r11     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r0 = kotlinx.coroutines.BuildersKt.withContext(r13, r0, r9)     // Catch: java.lang.Throwable -> L7a
            if (r0 != r10) goto La1
            return r10
        La1:
            return r0
        La2:
            boolean r2 = r0 instanceof java.util.concurrent.CancellationException
            if (r2 != 0) goto Lb1
            l7.r r2 = r3.f57357b
            l7.i r3 = r7.getRequest()
            l7.f r0 = r2.errorResult(r3, r0)
            return r0
        Lb1:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g7.a.intercept(g7.i, zu.d):java.lang.Object");
    }

    public final Object transform$coil_base_release(b bVar, l7.i iVar, o oVar, a7.g gVar, zu.d<? super b> dVar) {
        List<o7.a> transformations = iVar.getTransformations();
        return transformations.isEmpty() ? bVar : ((bVar.getDrawable() instanceof BitmapDrawable) || iVar.getAllowConversionToBitmap()) ? BuildersKt.withContext(iVar.getTransformationDispatcher(), new h(this, bVar, oVar, transformations, gVar, iVar, null), dVar) : bVar;
    }
}
