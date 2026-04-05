package nc;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class s extends mc.z {

    /* renamed from: q, reason: collision with root package name */
    public final rc.m f75956q;

    /* renamed from: r, reason: collision with root package name */
    public final transient Method f75957r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f75958s;

    public s(rc.d0 d0Var, jc.o oVar, wc.g gVar, dd.b bVar, rc.m mVar) {
        super(d0Var, oVar, gVar, bVar);
        this.f75956q = mVar;
        this.f75957r = mVar.getAnnotated();
        this.f75958s = u.isSkipper(this.f74244k);
    }

    @Override // mc.z
    public void deserializeAndSet(ub.u uVar, jc.k kVar, Object obj) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        Object objDeserializeWithType;
        boolean zHasToken = uVar.hasToken(ub.z.VALUE_NULL);
        mc.v vVar = this.f74244k;
        boolean z10 = this.f75958s;
        if (!zHasToken) {
            jc.q qVar = this.f74242i;
            wc.g gVar = this.f74243j;
            if (gVar == null) {
                Object objDeserialize = qVar.deserialize(uVar, kVar);
                if (objDeserialize != null) {
                    objDeserializeWithType = objDeserialize;
                } else if (z10) {
                    return;
                } else {
                    objDeserializeWithType = vVar.getNullValue(kVar);
                }
            } else {
                objDeserializeWithType = qVar.deserializeWithType(uVar, kVar, gVar);
            }
        } else if (z10) {
            return;
        } else {
            objDeserializeWithType = vVar.getNullValue(kVar);
        }
        try {
            this.f75957r.invoke(obj, objDeserializeWithType);
        } catch (Exception e10) {
            a(uVar, e10, objDeserializeWithType);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003b A[RETURN] */
    @Override // mc.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object deserializeSetAndReturn(ub.u r5, jc.k r6, java.lang.Object r7) throws java.lang.IllegalAccessException, java.io.IOException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r4 = this;
            ub.z r0 = ub.z.VALUE_NULL
            boolean r0 = r5.hasToken(r0)
            mc.v r1 = r4.f74244k
            boolean r2 = r4.f75958s
            if (r0 == 0) goto L14
            if (r2 == 0) goto Lf
            goto L3a
        Lf:
            java.lang.Object r6 = r1.getNullValue(r6)
            goto L2e
        L14:
            jc.q r0 = r4.f74242i
            wc.g r3 = r4.f74243j
            if (r3 != 0) goto L2a
            java.lang.Object r0 = r0.deserialize(r5, r6)
            if (r0 != 0) goto L28
            if (r2 == 0) goto L23
            goto L3a
        L23:
            java.lang.Object r6 = r1.getNullValue(r6)
            goto L2e
        L28:
            r6 = r0
            goto L2e
        L2a:
            java.lang.Object r6 = r0.deserializeWithType(r5, r6, r3)
        L2e:
            java.lang.reflect.Method r0 = r4.f75957r     // Catch: java.lang.Exception -> L3c
            java.lang.Object[] r1 = new java.lang.Object[]{r6}     // Catch: java.lang.Exception -> L3c
            java.lang.Object r5 = r0.invoke(r7, r1)     // Catch: java.lang.Exception -> L3c
            if (r5 != 0) goto L3b
        L3a:
            return r7
        L3b:
            return r5
        L3c:
            r7 = move-exception
            r4.a(r5, r7, r6)
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: nc.s.deserializeSetAndReturn(ub.u, jc.k, java.lang.Object):java.lang.Object");
    }

    @Override // mc.z
    public void fixAccess(jc.j jVar) {
        this.f75956q.fixAccess(jVar.isEnabled(jc.y.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    @Override // mc.z, rc.h0, jc.g
    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        rc.m mVar = this.f75956q;
        if (mVar == null) {
            return null;
        }
        return (A) mVar.getAnnotation(cls);
    }

    @Override // mc.z, rc.h0, jc.g
    public rc.l getMember() {
        return this.f75956q;
    }

    @Override // mc.z
    public final void set(Object obj, Object obj2) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        if (obj2 == null && this.f75958s) {
            return;
        }
        try {
            this.f75957r.invoke(obj, obj2);
        } catch (Exception e10) {
            a(null, e10, obj2);
            throw null;
        }
    }

    @Override // mc.z
    public Object setAndReturn(Object obj, Object obj2) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        if (obj2 != null || !this.f75958s) {
            try {
                Object objInvoke = this.f75957r.invoke(obj, obj2);
                if (objInvoke != null) {
                    return objInvoke;
                }
            } catch (Exception e10) {
                a(null, e10, obj2);
                throw null;
            }
        }
        return obj;
    }

    @Override // mc.z
    public mc.z withName(jc.n0 n0Var) {
        return new s(this, n0Var);
    }

    @Override // mc.z
    public mc.z withNullProvider(mc.v vVar) {
        return new s(this, this.f74242i, vVar);
    }

    @Override // mc.z
    public mc.z withValueDeserializer(jc.q qVar) {
        jc.q qVar2 = this.f74242i;
        if (qVar2 == qVar) {
            return this;
        }
        mc.v vVar = this.f74244k;
        if (qVar2 == vVar) {
            vVar = qVar;
        }
        return new s(this, qVar, vVar);
    }

    public s(s sVar, jc.q qVar, mc.v vVar) {
        super(sVar, qVar, vVar);
        this.f75956q = sVar.f75956q;
        this.f75957r = sVar.f75957r;
        this.f75958s = u.isSkipper(vVar);
    }

    public s(s sVar, jc.n0 n0Var) {
        super(sVar, n0Var);
        this.f75956q = sVar.f75956q;
        this.f75957r = sVar.f75957r;
        this.f75958s = sVar.f75958s;
    }
}
