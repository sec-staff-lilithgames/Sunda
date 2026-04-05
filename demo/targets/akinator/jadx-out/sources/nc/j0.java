package nc;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class j0 extends mc.z {

    /* renamed from: q, reason: collision with root package name */
    public final rc.m f75931q;

    /* renamed from: r, reason: collision with root package name */
    public final Method f75932r;

    public j0(rc.d0 d0Var, jc.o oVar, wc.g gVar, dd.b bVar, rc.m mVar) {
        super(d0Var, oVar, gVar, bVar);
        this.f75931q = mVar;
        this.f75932r = mVar.getAnnotated();
    }

    @Override // mc.z
    public final void deserializeAndSet(ub.u uVar, jc.k kVar, Object obj) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        if (uVar.hasToken(ub.z.VALUE_NULL)) {
            return;
        }
        if (this.f74243j != null) {
            kVar.reportBadDefinition(getType(), "Problem deserializing 'setterless' property (\"" + getName() + "\"): no way to handle typed deser with setterless yet");
        }
        try {
            Object objInvoke = this.f75932r.invoke(obj, null);
            if (objInvoke == null) {
                kVar.reportBadDefinition(getType(), "Problem deserializing 'setterless' property '" + getName() + "': get method returned null");
            }
            this.f74242i.deserialize(uVar, kVar, objInvoke);
        } catch (Exception e10) {
            dd.i.throwIfIOE(e10);
            dd.i.throwIfRTE(e10);
            Throwable rootCause = dd.i.getRootCause(e10);
            throw jc.r.from(uVar, dd.i.exceptionMessage(rootCause), rootCause);
        }
    }

    @Override // mc.z
    public Object deserializeSetAndReturn(ub.u uVar, jc.k kVar, Object obj) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        deserializeAndSet(uVar, kVar, obj);
        return obj;
    }

    @Override // mc.z
    public void fixAccess(jc.j jVar) {
        this.f75931q.fixAccess(jVar.isEnabled(jc.y.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    @Override // mc.z, rc.h0, jc.g
    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        return (A) this.f75931q.getAnnotation(cls);
    }

    @Override // mc.z, rc.h0, jc.g
    public rc.l getMember() {
        return this.f75931q;
    }

    @Override // mc.z
    public final void set(Object obj, Object obj2) throws IOException {
        throw new UnsupportedOperationException("Should never call `set()` on setterless property ('" + getName() + "')");
    }

    @Override // mc.z
    public Object setAndReturn(Object obj, Object obj2) throws IOException {
        set(obj, obj2);
        return obj;
    }

    @Override // mc.z
    public mc.z withName(jc.n0 n0Var) {
        return new j0(this, n0Var);
    }

    @Override // mc.z
    public mc.z withNullProvider(mc.v vVar) {
        return new j0(this, this.f74242i, vVar);
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
        return new j0(this, qVar, vVar);
    }

    public j0(j0 j0Var, jc.q qVar, mc.v vVar) {
        super(j0Var, qVar, vVar);
        this.f75931q = j0Var.f75931q;
        this.f75932r = j0Var.f75932r;
    }

    public j0(j0 j0Var, jc.n0 n0Var) {
        super(j0Var, n0Var);
        this.f75931q = j0Var.f75931q;
        this.f75932r = j0Var.f75932r;
    }
}
