package f9;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.g;
import com.ironsource.C3191e4;
import g9.m;
import g9.n;
import io.bidmachine.nativead.view.ev.QGjYBESwAiCc;
import j9.s;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import n8.q;
import n8.v;
import p8.d0;
import p8.e0;
import p8.q0;
import p8.v0;
import p8.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class k implements e, m, j {
    public static final boolean E = Log.isLoggable("GlideRequest", 2);
    public int A;
    public boolean B;
    public final RuntimeException C;
    public int D;

    /* renamed from: a, reason: collision with root package name */
    public int f55554a;

    /* renamed from: b, reason: collision with root package name */
    public final String f55555b;

    /* renamed from: c, reason: collision with root package name */
    public final k9.k f55556c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f55557d;

    /* renamed from: e, reason: collision with root package name */
    public final h f55558e;

    /* renamed from: f, reason: collision with root package name */
    public final f f55559f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f55560g;

    /* renamed from: h, reason: collision with root package name */
    public final com.bumptech.glide.h f55561h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f55562i;

    /* renamed from: j, reason: collision with root package name */
    public final Class f55563j;

    /* renamed from: k, reason: collision with root package name */
    public final a f55564k;

    /* renamed from: l, reason: collision with root package name */
    public final int f55565l;

    /* renamed from: m, reason: collision with root package name */
    public final int f55566m;

    /* renamed from: n, reason: collision with root package name */
    public final com.bumptech.glide.l f55567n;

    /* renamed from: o, reason: collision with root package name */
    public final n f55568o;

    /* renamed from: p, reason: collision with root package name */
    public final List f55569p;

    /* renamed from: q, reason: collision with root package name */
    public final h9.d f55570q;

    /* renamed from: r, reason: collision with root package name */
    public final Executor f55571r;

    /* renamed from: s, reason: collision with root package name */
    public v0 f55572s;

    /* renamed from: t, reason: collision with root package name */
    public d0 f55573t;

    /* renamed from: u, reason: collision with root package name */
    public long f55574u;

    /* renamed from: v, reason: collision with root package name */
    public volatile e0 f55575v;

    /* renamed from: w, reason: collision with root package name */
    public Drawable f55576w;

    /* renamed from: x, reason: collision with root package name */
    public Drawable f55577x;

    /* renamed from: y, reason: collision with root package name */
    public Drawable f55578y;

    /* renamed from: z, reason: collision with root package name */
    public int f55579z;

    public k(Context context, com.bumptech.glide.h hVar, Object obj, Object obj2, Class cls, a aVar, int i10, int i11, com.bumptech.glide.l lVar, n nVar, h hVar2, List list, f fVar, e0 e0Var, h9.d dVar, Executor executor) {
        this.f55555b = E ? String.valueOf(hashCode()) : null;
        this.f55556c = k9.k.newInstance();
        this.f55557d = obj;
        this.f55560g = context;
        this.f55561h = hVar;
        this.f55562i = obj2;
        this.f55563j = cls;
        this.f55564k = aVar;
        this.f55565l = i10;
        this.f55566m = i11;
        this.f55567n = lVar;
        this.f55568o = nVar;
        this.f55558e = hVar2;
        this.f55569p = list;
        this.f55559f = fVar;
        this.f55575v = e0Var;
        this.f55570q = dVar;
        this.f55571r = executor;
        this.D = 1;
        if (this.C == null && hVar.getExperiments().isEnabled(g.a.class)) {
            this.C = new RuntimeException("Glide request origin trace");
        }
    }

    public static <R> k obtain(Context context, com.bumptech.glide.h hVar, Object obj, Object obj2, Class<R> cls, a aVar, int i10, int i11, com.bumptech.glide.l lVar, n nVar, h hVar2, List<h> list, f fVar, e0 e0Var, h9.d dVar, Executor executor) {
        return new k(context, hVar, obj, obj2, cls, aVar, i10, i11, lVar, nVar, hVar2, list, fVar, e0Var, dVar, executor);
    }

    public final Drawable a() {
        if (this.f55578y == null) {
            a aVar = this.f55564k;
            Drawable fallbackDrawable = aVar.getFallbackDrawable();
            this.f55578y = fallbackDrawable;
            if (fallbackDrawable == null && aVar.getFallbackId() > 0) {
                this.f55578y = c(aVar.getFallbackId());
            }
        }
        return this.f55578y;
    }

    public final Drawable b() {
        if (this.f55577x == null) {
            a aVar = this.f55564k;
            Drawable placeholderDrawable = aVar.getPlaceholderDrawable();
            this.f55577x = placeholderDrawable;
            if (placeholderDrawable == null && aVar.getPlaceholderId() > 0) {
                this.f55577x = c(aVar.getPlaceholderId());
            }
        }
        return this.f55577x;
    }

    @Override // f9.e
    public void begin() {
        synchronized (this.f55557d) {
            try {
                if (this.B) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f55556c.throwIfRecycled();
                this.f55574u = j9.l.getLogTime();
                Object obj = this.f55562i;
                if (obj == null) {
                    if (s.isValidDimensions(this.f55565l, this.f55566m)) {
                        this.f55579z = this.f55565l;
                        this.A = this.f55566m;
                    }
                    e(new q0("Received null model"), a() == null ? 5 : 3);
                    return;
                }
                int i10 = this.D;
                if (i10 == 2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (i10 == 4) {
                    onResourceReady(this.f55572s, n8.a.f75827g, false);
                    return;
                }
                List<h> list = this.f55569p;
                if (list != null) {
                    for (h hVar : list) {
                        if (hVar instanceof c) {
                            ((c) hVar).onRequestStarted(obj);
                        }
                    }
                }
                this.f55554a = k9.i.beginSectionAsync("GlideRequest");
                this.D = 3;
                if (s.isValidDimensions(this.f55565l, this.f55566m)) {
                    onSizeReady(this.f55565l, this.f55566m);
                } else {
                    this.f55568o.getSize(this);
                }
                int i11 = this.D;
                if (i11 == 2 || i11 == 3) {
                    f fVar = this.f55559f;
                    if (fVar == null || fVar.canNotifyStatusChanged(this)) {
                        this.f55568o.onLoadStarted(b());
                    }
                }
                if (E) {
                    d("finished run method in " + j9.l.getElapsedMillis(this.f55574u));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Drawable c(int i10) {
        a aVar = this.f55564k;
        Resources.Theme theme = aVar.getTheme();
        Context context = this.f55560g;
        return z8.e.getDrawable(context, i10, theme != null ? aVar.getTheme() : context.getTheme());
    }

    @Override // f9.e
    public void clear() {
        synchronized (this.f55557d) {
            try {
                if (this.B) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f55556c.throwIfRecycled();
                if (this.D == 6) {
                    return;
                }
                if (this.B) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f55556c.throwIfRecycled();
                this.f55568o.removeCallback(this);
                d0 d0Var = this.f55573t;
                v0 v0Var = null;
                if (d0Var != null) {
                    d0Var.cancel();
                    this.f55573t = null;
                }
                v0 v0Var2 = this.f55572s;
                if (v0Var2 != null) {
                    this.f55572s = null;
                    v0Var = v0Var2;
                }
                f fVar = this.f55559f;
                if (fVar == null || fVar.canNotifyCleared(this)) {
                    this.f55568o.onLoadCleared(b());
                }
                k9.i.endSectionAsync("GlideRequest", this.f55554a);
                this.D = 6;
                if (v0Var != null) {
                    this.f55575v.release(v0Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(String str) {
        StringBuilder sbT = a.b.t(str, " this: ");
        sbT.append(this.f55555b);
        Log.v("GlideRequest", sbT.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(p8.q0 r9, int r10) {
        /*
            r8 = this;
            java.lang.String r0 = "Load failed for ["
            k9.k r1 = r8.f55556c
            r1.throwIfRecycled()
            java.lang.Object r1 = r8.f55557d
            monitor-enter(r1)
            java.lang.RuntimeException r2 = r8.C     // Catch: java.lang.Throwable -> L4c
            r9.setOrigin(r2)     // Catch: java.lang.Throwable -> L4c
            com.bumptech.glide.h r2 = r8.f55561h     // Catch: java.lang.Throwable -> L4c
            int r2 = r2.getLogLevel()     // Catch: java.lang.Throwable -> L4c
            if (r2 > r10) goto L4f
            java.lang.String r10 = "Glide"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4c
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r0 = r8.f55562i     // Catch: java.lang.Throwable -> L4c
            r3.append(r0)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r0 = "] with dimensions ["
            r3.append(r0)     // Catch: java.lang.Throwable -> L4c
            int r0 = r8.f55579z     // Catch: java.lang.Throwable -> L4c
            r3.append(r0)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r0 = "x"
            r3.append(r0)     // Catch: java.lang.Throwable -> L4c
            int r0 = r8.A     // Catch: java.lang.Throwable -> L4c
            r3.append(r0)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r0 = "]"
            r3.append(r0)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L4c
            android.util.Log.w(r10, r0, r9)     // Catch: java.lang.Throwable -> L4c
            r10 = 4
            if (r2 > r10) goto L4f
            java.lang.String r10 = "Glide"
            r9.logRootCauses(r10)     // Catch: java.lang.Throwable -> L4c
            goto L4f
        L4c:
            r9 = move-exception
            goto Lcb
        L4f:
            r10 = 0
            r8.f55573t = r10     // Catch: java.lang.Throwable -> L4c
            r10 = 5
            r8.D = r10     // Catch: java.lang.Throwable -> L4c
            f9.f r10 = r8.f55559f     // Catch: java.lang.Throwable -> L4c
            if (r10 == 0) goto L5c
            r10.onRequestFailed(r8)     // Catch: java.lang.Throwable -> L4c
        L5c:
            r10 = 1
            r8.B = r10     // Catch: java.lang.Throwable -> L4c
            r0 = 0
            java.util.List r2 = r8.f55569p     // Catch: java.lang.Throwable -> L91
            if (r2 == 0) goto L93
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L91
            r3 = r0
        L69:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L91
            if (r4 == 0) goto L94
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> L91
            f9.h r4 = (f9.h) r4     // Catch: java.lang.Throwable -> L91
            java.lang.Object r5 = r8.f55562i     // Catch: java.lang.Throwable -> L91
            g9.n r6 = r8.f55568o     // Catch: java.lang.Throwable -> L91
            f9.f r7 = r8.f55559f     // Catch: java.lang.Throwable -> L91
            if (r7 == 0) goto L8a
            f9.f r7 = r7.getRoot()     // Catch: java.lang.Throwable -> L91
            boolean r7 = r7.isAnyResourceSet()     // Catch: java.lang.Throwable -> L91
            if (r7 != 0) goto L88
            goto L8a
        L88:
            r7 = r0
            goto L8b
        L8a:
            r7 = r10
        L8b:
            boolean r4 = r4.onLoadFailed(r9, r5, r6, r7)     // Catch: java.lang.Throwable -> L91
            r3 = r3 | r4
            goto L69
        L91:
            r9 = move-exception
            goto Lc8
        L93:
            r3 = r0
        L94:
            f9.h r2 = r8.f55558e     // Catch: java.lang.Throwable -> L91
            if (r2 == 0) goto Lb5
            java.lang.Object r4 = r8.f55562i     // Catch: java.lang.Throwable -> L91
            g9.n r5 = r8.f55568o     // Catch: java.lang.Throwable -> L91
            f9.f r6 = r8.f55559f     // Catch: java.lang.Throwable -> L91
            if (r6 == 0) goto Lad
            f9.f r6 = r6.getRoot()     // Catch: java.lang.Throwable -> L91
            boolean r6 = r6.isAnyResourceSet()     // Catch: java.lang.Throwable -> L91
            if (r6 != 0) goto Lab
            goto Lad
        Lab:
            r6 = r0
            goto Lae
        Lad:
            r6 = r10
        Lae:
            boolean r9 = r2.onLoadFailed(r9, r4, r5, r6)     // Catch: java.lang.Throwable -> L91
            if (r9 == 0) goto Lb5
            goto Lb6
        Lb5:
            r10 = r0
        Lb6:
            r9 = r3 | r10
            if (r9 != 0) goto Lbd
            r8.g()     // Catch: java.lang.Throwable -> L91
        Lbd:
            r8.B = r0     // Catch: java.lang.Throwable -> L4c
            java.lang.String r9 = "GlideRequest"
            int r10 = r8.f55554a     // Catch: java.lang.Throwable -> L4c
            k9.i.endSectionAsync(r9, r10)     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4c
            return
        Lc8:
            r8.B = r0     // Catch: java.lang.Throwable -> L4c
            throw r9     // Catch: java.lang.Throwable -> L4c
        Lcb:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4c
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: f9.k.e(p8.q0, int):void");
    }

    public final void f(v0 v0Var, Object obj, n8.a aVar, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13 = true;
        f fVar = this.f55559f;
        boolean z14 = fVar == null || !fVar.getRoot().isAnyResourceSet();
        this.D = 4;
        this.f55572s = v0Var;
        if (this.f55561h.getLogLevel() <= 3) {
            Log.d("Glide", "Finished loading " + obj.getClass().getSimpleName() + " from " + aVar + " for " + this.f55562i + " with size [" + this.f55579z + "x" + this.A + "] in " + j9.l.getElapsedMillis(this.f55574u) + " ms");
        }
        if (fVar != null) {
            fVar.onRequestSuccess(this);
        }
        this.B = true;
        try {
            List<h> list = this.f55569p;
            if (list != null) {
                z11 = false;
                for (h hVar : list) {
                    Object obj2 = obj;
                    n8.a aVar2 = aVar;
                    boolean zOnResourceReady = hVar.onResourceReady(obj2, this.f55562i, this.f55568o, aVar2, z14) | z11;
                    if (hVar instanceof c) {
                        z12 = z10;
                        zOnResourceReady |= ((c) hVar).onResourceReady(obj2, this.f55562i, this.f55568o, aVar2, z14, z12);
                    } else {
                        z12 = z10;
                    }
                    z11 = zOnResourceReady;
                    obj = obj2;
                    aVar = aVar2;
                    z10 = z12;
                }
            } else {
                z11 = false;
            }
            Object obj3 = obj;
            n8.a aVar3 = aVar;
            h hVar2 = this.f55558e;
            if (hVar2 == null || !hVar2.onResourceReady(obj3, this.f55562i, this.f55568o, aVar3, z14)) {
                z13 = false;
            }
            if (!(z11 | z13)) {
                this.f55568o.onResourceReady(obj3, this.f55570q.build(aVar3, z14));
            }
            this.B = false;
            k9.i.endSectionAsync("GlideRequest", this.f55554a);
        } catch (Throwable th2) {
            this.B = false;
            throw th2;
        }
    }

    public final void g() {
        f fVar = this.f55559f;
        if (fVar == null || fVar.canNotifyStatusChanged(this)) {
            Drawable drawableA = this.f55562i == null ? a() : null;
            if (drawableA == null) {
                if (this.f55576w == null) {
                    a aVar = this.f55564k;
                    Drawable errorPlaceholder = aVar.getErrorPlaceholder();
                    this.f55576w = errorPlaceholder;
                    if (errorPlaceholder == null && aVar.getErrorId() > 0) {
                        this.f55576w = c(aVar.getErrorId());
                    }
                }
                drawableA = this.f55576w;
            }
            if (drawableA == null) {
                drawableA = b();
            }
            this.f55568o.onLoadFailed(drawableA);
        }
    }

    @Override // f9.j
    public Object getLock() {
        this.f55556c.throwIfRecycled();
        return this.f55557d;
    }

    @Override // f9.e
    public boolean isAnyResourceSet() {
        boolean z10;
        synchronized (this.f55557d) {
            z10 = this.D == 4;
        }
        return z10;
    }

    @Override // f9.e
    public boolean isCleared() {
        boolean z10;
        synchronized (this.f55557d) {
            z10 = this.D == 6;
        }
        return z10;
    }

    @Override // f9.e
    public boolean isComplete() {
        boolean z10;
        synchronized (this.f55557d) {
            z10 = this.D == 4;
        }
        return z10;
    }

    @Override // f9.e
    public boolean isEquivalentTo(e eVar) {
        int i10;
        int i11;
        Object obj;
        Class cls;
        a aVar;
        com.bumptech.glide.l lVar;
        int size;
        int i12;
        int i13;
        Object obj2;
        Class cls2;
        a aVar2;
        com.bumptech.glide.l lVar2;
        int size2;
        if (!(eVar instanceof k)) {
            return false;
        }
        synchronized (this.f55557d) {
            try {
                i10 = this.f55565l;
                i11 = this.f55566m;
                obj = this.f55562i;
                cls = this.f55563j;
                aVar = this.f55564k;
                lVar = this.f55567n;
                List list = this.f55569p;
                size = list != null ? list.size() : 0;
            } finally {
            }
        }
        k kVar = (k) eVar;
        synchronized (kVar.f55557d) {
            try {
                i12 = kVar.f55565l;
                i13 = kVar.f55566m;
                obj2 = kVar.f55562i;
                cls2 = kVar.f55563j;
                aVar2 = kVar.f55564k;
                lVar2 = kVar.f55567n;
                List list2 = kVar.f55569p;
                size2 = list2 != null ? list2.size() : 0;
            } finally {
            }
        }
        return i10 == i12 && i11 == i13 && s.bothModelsNullEquivalentOrEquals(obj, obj2) && cls.equals(cls2) && s.bothBaseRequestOptionsNullEquivalentOrEquals(aVar, aVar2) && lVar == lVar2 && size == size2;
    }

    @Override // f9.e
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f55557d) {
            int i10 = this.D;
            z10 = i10 == 2 || i10 == 3;
        }
        return z10;
    }

    @Override // f9.j
    public void onLoadFailed(q0 q0Var) {
        e(q0Var, 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // g9.m
    public void onSizeReady(int i10, int i11) throws Throwable {
        k kVar = this;
        int iRound = i10;
        kVar.f55556c.throwIfRecycled();
        Object obj = kVar.f55557d;
        synchronized (obj) {
            try {
                try {
                    boolean z10 = E;
                    if (z10) {
                        kVar.d("Got onSizeReady in " + j9.l.getElapsedMillis(kVar.f55574u));
                    }
                    if (kVar.D == 3) {
                        kVar.D = 2;
                        float sizeMultiplier = kVar.f55564k.getSizeMultiplier();
                        if (iRound != Integer.MIN_VALUE) {
                            iRound = Math.round(iRound * sizeMultiplier);
                        }
                        kVar.f55579z = iRound;
                        kVar.A = i11 == Integer.MIN_VALUE ? i11 : Math.round(sizeMultiplier * i11);
                        if (z10) {
                            kVar.d("finished setup for calling load in " + j9.l.getElapsedMillis(kVar.f55574u));
                        }
                        e0 e0Var = kVar.f55575v;
                        com.bumptech.glide.h hVar = kVar.f55561h;
                        Object obj2 = kVar.f55562i;
                        q signature = kVar.f55564k.getSignature();
                        try {
                            int i12 = kVar.f55579z;
                            int i13 = kVar.A;
                            Class<?> resourceClass = kVar.f55564k.getResourceClass();
                            Class cls = kVar.f55563j;
                            try {
                                com.bumptech.glide.l lVar = kVar.f55567n;
                                z diskCacheStrategy = kVar.f55564k.getDiskCacheStrategy();
                                Map<Class<?>, n8.z> transformations = kVar.f55564k.getTransformations();
                                boolean zIsTransformationRequired = kVar.f55564k.isTransformationRequired();
                                a aVar = kVar.f55564k;
                                try {
                                    boolean z11 = aVar.A;
                                    v options = aVar.getOptions();
                                    boolean zIsMemoryCacheable = kVar.f55564k.isMemoryCacheable();
                                    boolean useUnlimitedSourceGeneratorsPool = kVar.f55564k.getUseUnlimitedSourceGeneratorsPool();
                                    boolean useAnimationPool = kVar.f55564k.getUseAnimationPool();
                                    boolean onlyRetrieveFromCache = kVar.f55564k.getOnlyRetrieveFromCache();
                                    Executor executor = kVar.f55571r;
                                    kVar = obj;
                                    try {
                                        kVar.f55573t = e0Var.load(hVar, obj2, signature, i12, i13, resourceClass, cls, lVar, diskCacheStrategy, transformations, zIsTransformationRequired, z11, options, zIsMemoryCacheable, useUnlimitedSourceGeneratorsPool, useAnimationPool, onlyRetrieveFromCache, kVar, executor);
                                        if (kVar.D != 2) {
                                            kVar.f55573t = null;
                                        }
                                        if (z10) {
                                            kVar.d("finished onSizeReady in " + j9.l.getElapsedMillis(kVar.f55574u));
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    kVar = obj;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                kVar = obj;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            kVar = obj;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            } catch (Throwable th7) {
                th = th7;
                kVar = obj;
            }
        }
    }

    @Override // f9.e
    public void pause() {
        synchronized (this.f55557d) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String toString() {
        Object obj;
        Class cls;
        synchronized (this.f55557d) {
            obj = this.f55562i;
            cls = this.f55563j;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + C3191e4.i.f36531e;
    }

    @Override // f9.j
    public void onResourceReady(v0 v0Var, n8.a aVar, boolean z10) {
        this.f55556c.throwIfRecycled();
        v0 v0Var2 = null;
        try {
            synchronized (this.f55557d) {
                try {
                    this.f55573t = null;
                    if (v0Var == null) {
                        onLoadFailed(new q0("Expected to receive a Resource<R> with an object of " + this.f55563j + QGjYBESwAiCc.bblQpBUDXb));
                        return;
                    }
                    Object obj = v0Var.get();
                    try {
                        if (obj == null || !this.f55563j.isAssignableFrom(obj.getClass())) {
                            this.f55572s = null;
                            StringBuilder sb2 = new StringBuilder("Expected to receive an object of ");
                            sb2.append(this.f55563j);
                            sb2.append(" but instead got ");
                            sb2.append(obj != null ? obj.getClass() : "");
                            sb2.append("{");
                            sb2.append(obj);
                            sb2.append("} inside Resource{");
                            sb2.append(v0Var);
                            sb2.append("}.");
                            sb2.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                            onLoadFailed(new q0(sb2.toString()));
                        } else {
                            f fVar = this.f55559f;
                            if (fVar == null || fVar.canSetImage(this)) {
                                f(v0Var, obj, aVar, z10);
                                return;
                            } else {
                                this.f55572s = null;
                                this.D = 4;
                                k9.i.endSectionAsync("GlideRequest", this.f55554a);
                            }
                        }
                        this.f55575v.release(v0Var);
                    } catch (Throwable th2) {
                        v0Var2 = v0Var;
                        th = th2;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            if (v0Var2 != null) {
                this.f55575v.release(v0Var2);
            }
            throw th4;
        }
    }
}
