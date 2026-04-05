package p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class g3 extends l0 {
    public g3(kv.a aVar) {
        super(aVar, null);
    }

    public abstract h3 defaultProvidedValue$runtime(Object obj);

    public final h3 provides(Object obj) {
        return defaultProvidedValue$runtime(obj);
    }

    public final h3 providesComputed(kv.l lVar) {
        return new h3(this, null, false, null, null, lVar, false);
    }

    public final h3 providesDefault(Object obj) {
        return defaultProvidedValue$runtime(obj).ifNotAlreadyProvided$runtime();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0034 A[PHI: r5
      0x0034: PHI (r5v2 p0.j1) = (r5v12 p0.j1), (r5v13 p0.j1) binds: [B:17:0x0044, B:12:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p0.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p0.b6 updatedStateOf$runtime(p0.h3 r4, p0.b6 r5) {
        /*
            r3 = this;
            boolean r0 = r5 instanceof p0.j1
            r1 = 0
            if (r0 == 0) goto L1a
            boolean r0 = r4.isDynamic$runtime()
            if (r0 == 0) goto L47
            r1 = r5
            p0.j1 r1 = (p0.j1) r1
            p0.j2 r5 = r1.getState()
            java.lang.Object r0 = r4.getEffectiveValue$runtime()
            r5.setValue(r0)
            goto L47
        L1a:
            boolean r0 = r5 instanceof p0.x5
            if (r0 == 0) goto L36
            boolean r0 = r4.isStatic$runtime()
            if (r0 == 0) goto L47
            java.lang.Object r0 = r4.getEffectiveValue$runtime()
            p0.x5 r5 = (p0.x5) r5
            java.lang.Object r2 = r5.getValue()
            boolean r0 = kotlin.jvm.internal.e0.areEqual(r0, r2)
            if (r0 == 0) goto L47
        L34:
            r1 = r5
            goto L47
        L36:
            boolean r0 = r5 instanceof p0.x0
            if (r0 == 0) goto L47
            kv.l r0 = r4.getCompute$runtime()
            p0.x0 r5 = (p0.x0) r5
            kv.l r2 = r5.getCompute()
            if (r0 != r2) goto L47
            goto L34
        L47:
            if (r1 != 0) goto L97
            boolean r5 = r4.isDynamic$runtime()
            if (r5 == 0) goto L6d
            p0.j1 r5 = new p0.j1
            p0.j2 r0 = r4.getState$runtime()
            if (r0 != 0) goto L69
            java.lang.Object r0 = r4.getValue()
            p0.y4 r4 = r4.getMutationPolicy$runtime()
            if (r4 != 0) goto L65
            p0.y4 r4 = p0.z4.structuralEqualityPolicy()
        L65:
            p0.j2 r0 = p0.z4.mutableStateOf(r0, r4)
        L69:
            r5.<init>(r0)
            return r5
        L6d:
            kv.l r5 = r4.getCompute$runtime()
            if (r5 == 0) goto L7d
            p0.x0 r5 = new p0.x0
            kv.l r4 = r4.getCompute$runtime()
            r5.<init>(r4)
            return r5
        L7d:
            p0.j2 r5 = r4.getState$runtime()
            if (r5 == 0) goto L8d
            p0.j1 r5 = new p0.j1
            p0.j2 r4 = r4.getState$runtime()
            r5.<init>(r4)
            return r5
        L8d:
            p0.x5 r5 = new p0.x5
            java.lang.Object r4 = r4.getEffectiveValue$runtime()
            r5.<init>(r4)
            return r5
        L97:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.g3.updatedStateOf$runtime(p0.h3, p0.b6):p0.b6");
    }
}
