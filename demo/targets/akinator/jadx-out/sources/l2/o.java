package l2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final Object f72333a = n.m5447constructorimpl(null);

    /* renamed from: b, reason: collision with root package name */
    public final k2.b f72334b = new k2.b(16);

    /* renamed from: c, reason: collision with root package name */
    public final k2.c f72335c = new k2.c(0, 1, null);

    /* renamed from: d, reason: collision with root package name */
    public final o2.o f72336d = o2.n.createSynchronizedObject();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final w f72337a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f72338b;

        public a(w font, Object obj) {
            kotlin.jvm.internal.e0.checkNotNullParameter(font, "font");
            this.f72337a = font;
            this.f72338b = obj;
        }

        public static /* synthetic */ a copy$default(a aVar, w wVar, Object obj, int i10, Object obj2) {
            if ((i10 & 1) != 0) {
                wVar = aVar.f72337a;
            }
            if ((i10 & 2) != 0) {
                obj = aVar.f72338b;
            }
            return aVar.copy(wVar, obj);
        }

        public final w component1() {
            return this.f72337a;
        }

        public final Object component2() {
            return this.f72338b;
        }

        public final a copy(w font, Object obj) {
            kotlin.jvm.internal.e0.checkNotNullParameter(font, "font");
            return new a(font, obj);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.e0.areEqual(this.f72337a, aVar.f72337a) && kotlin.jvm.internal.e0.areEqual(this.f72338b, aVar.f72338b);
        }

        public final w getFont() {
            return this.f72337a;
        }

        public final Object getLoaderKey() {
            return this.f72338b;
        }

        public int hashCode() {
            int iHashCode = this.f72337a.hashCode() * 31;
            Object obj = this.f72338b;
            return iHashCode + (obj == null ? 0 : obj.hashCode());
        }

        public String toString() {
            return "Key(font=" + this.f72337a + ", loaderKey=" + this.f72338b + ')';
        }
    }

    public static /* synthetic */ void put$default(o oVar, w wVar, h1 h1Var, Object obj, boolean z10, int i10, Object obj2) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        oVar.put(wVar, h1Var, obj, z10);
    }

    /* renamed from: get-1ASDuI8, reason: not valid java name */
    public final n m5454get1ASDuI8(w font, h1 platformFontLoader) {
        n nVar;
        kotlin.jvm.internal.e0.checkNotNullParameter(font, "font");
        kotlin.jvm.internal.e0.checkNotNullParameter(platformFontLoader, "platformFontLoader");
        a aVar = new a(font, platformFontLoader.getCacheKey());
        synchronized (this.f72336d) {
            nVar = (n) this.f72334b.get(aVar);
            if (nVar == null) {
                nVar = (n) this.f72335c.get(aVar);
            }
        }
        return nVar;
    }

    public final void put(w font, h1 platformFontLoader, Object obj, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(font, "font");
        kotlin.jvm.internal.e0.checkNotNullParameter(platformFontLoader, "platformFontLoader");
        a aVar = new a(font, platformFontLoader.getCacheKey());
        synchronized (this.f72336d) {
            try {
                if (obj == null) {
                } else if (z10) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object runCached(l2.w r5, l2.h1 r6, boolean r7, kv.l r8, zu.d<java.lang.Object> r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof l2.p
            if (r0 == 0) goto L13
            r0 = r9
            l2.p r0 = (l2.p) r0
            int r1 = r0.f72347n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f72347n = r1
            goto L18
        L13:
            l2.p r0 = new l2.p
            r0.<init>(r4, r9)
        L18:
            java.lang.Object r9 = r0.f72345l
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f72347n
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            boolean r7 = r0.f72344k
            l2.o$a r5 = r0.f72343j
            l2.o r6 = r0.f72342i
            tu.a0.throwOnFailure(r9)
            goto L77
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            tu.a0.throwOnFailure(r9)
            l2.o$a r9 = new l2.o$a
            java.lang.Object r6 = r6.getCacheKey()
            r9.<init>(r5, r6)
            o2.o r5 = r4.f72336d
            monitor-enter(r5)
            k2.b r6 = r4.f72334b     // Catch: java.lang.Throwable -> L59
            java.lang.Object r6 = r6.get(r9)     // Catch: java.lang.Throwable -> L59
            l2.n r6 = (l2.n) r6     // Catch: java.lang.Throwable -> L59
            if (r6 != 0) goto L5b
            k2.c r6 = r4.f72335c     // Catch: java.lang.Throwable -> L59
            java.lang.Object r6 = r6.get(r9)     // Catch: java.lang.Throwable -> L59
            l2.n r6 = (l2.n) r6     // Catch: java.lang.Throwable -> L59
            goto L5b
        L59:
            r6 = move-exception
            goto Lab
        L5b:
            if (r6 == 0) goto L63
            java.lang.Object r6 = r6.m5453unboximpl()     // Catch: java.lang.Throwable -> L59
            monitor-exit(r5)
            return r6
        L63:
            monitor-exit(r5)
            r0.f72342i = r4
            r0.f72343j = r9
            r0.f72344k = r7
            r0.f72347n = r3
            java.lang.Object r5 = r8.invoke(r0)
            if (r5 != r1) goto L73
            return r1
        L73:
            r6 = r9
            r9 = r5
            r5 = r6
            r6 = r4
        L77:
            o2.o r8 = r6.f72336d
            monitor-enter(r8)
            if (r9 != 0) goto L8a
            k2.c r7 = r6.f72335c     // Catch: java.lang.Throwable -> L88
            java.lang.Object r6 = r6.f72333a     // Catch: java.lang.Throwable -> L88
            l2.n r6 = l2.n.m5446boximpl(r6)     // Catch: java.lang.Throwable -> L88
            r7.put(r5, r6)     // Catch: java.lang.Throwable -> L88
            goto La7
        L88:
            r5 = move-exception
            goto La9
        L8a:
            if (r7 == 0) goto L9a
            k2.c r6 = r6.f72335c     // Catch: java.lang.Throwable -> L88
            java.lang.Object r7 = l2.n.m5447constructorimpl(r9)     // Catch: java.lang.Throwable -> L88
            l2.n r7 = l2.n.m5446boximpl(r7)     // Catch: java.lang.Throwable -> L88
            r6.put(r5, r7)     // Catch: java.lang.Throwable -> L88
            goto La7
        L9a:
            k2.b r6 = r6.f72334b     // Catch: java.lang.Throwable -> L88
            java.lang.Object r7 = l2.n.m5447constructorimpl(r9)     // Catch: java.lang.Throwable -> L88
            l2.n r7 = l2.n.m5446boximpl(r7)     // Catch: java.lang.Throwable -> L88
            r6.put(r5, r7)     // Catch: java.lang.Throwable -> L88
        La7:
            monitor-exit(r8)
            return r9
        La9:
            monitor-exit(r8)
            throw r5
        Lab:
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.o.runCached(l2.w, l2.h1, boolean, kv.l, zu.d):java.lang.Object");
    }

    public final Object runCachedBlocking(w font, h1 platformFontLoader, kv.a block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(font, "font");
        kotlin.jvm.internal.e0.checkNotNullParameter(platformFontLoader, "platformFontLoader");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        synchronized (this.f72336d) {
            try {
                a aVar = new a(font, platformFontLoader.getCacheKey());
                n nVar = (n) this.f72334b.get(aVar);
                if (nVar == null) {
                    nVar = (n) this.f72335c.get(aVar);
                }
                if (nVar != null) {
                    Object objM5453unboximpl = nVar.m5453unboximpl();
                    kotlin.jvm.internal.b0.finallyStart(2);
                    kotlin.jvm.internal.b0.finallyEnd(2);
                    return objM5453unboximpl;
                }
                kotlin.jvm.internal.b0.finallyStart(1);
                kotlin.jvm.internal.b0.finallyEnd(1);
                Object objInvoke = block.invoke();
                put$default(this, font, platformFontLoader, objInvoke, false, 8, null);
                return objInvoke;
            } catch (Throwable th2) {
                kotlin.jvm.internal.b0.finallyStart(1);
                kotlin.jvm.internal.b0.finallyEnd(1);
                throw th2;
            }
        }
    }
}
