package mc;

import java.io.IOException;
import java.lang.annotation.Annotation;
import jc.n0;
import rc.t0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class y extends z {

    /* renamed from: q, reason: collision with root package name */
    public final z f74236q;

    public y(z zVar) {
        super(zVar);
        this.f74236q = zVar;
    }

    @Override // mc.z
    public void assignIndex(int i10) {
        this.f74236q.assignIndex(i10);
    }

    @Override // mc.z
    public final Class b() {
        return this.f74236q.b();
    }

    public abstract z c(z zVar);

    @Override // mc.z
    public void deserializeAndSet(ub.u uVar, jc.k kVar, Object obj) throws IOException {
        this.f74236q.deserializeAndSet(uVar, kVar, obj);
    }

    @Override // mc.z
    public Object deserializeSetAndReturn(ub.u uVar, jc.k kVar, Object obj) throws IOException {
        return this.f74236q.deserializeSetAndReturn(uVar, kVar, obj);
    }

    @Override // mc.z
    public void fixAccess(jc.j jVar) {
        this.f74236q.fixAccess(jVar);
    }

    @Override // mc.z, rc.h0, jc.g
    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        return (A) this.f74236q.getAnnotation(cls);
    }

    @Override // mc.z
    public int getCreatorIndex() {
        return this.f74236q.getCreatorIndex();
    }

    public z getDelegate() {
        return this.f74236q;
    }

    @Override // mc.z
    public Object getInjectableValueId() {
        return this.f74236q.getInjectableValueId();
    }

    @Override // mc.z
    public String getManagedReferenceName() {
        return this.f74236q.getManagedReferenceName();
    }

    @Override // mc.z, rc.h0, jc.g
    public rc.l getMember() {
        return this.f74236q.getMember();
    }

    @Override // mc.z
    public t0 getObjectIdInfo() {
        return this.f74236q.getObjectIdInfo();
    }

    @Override // mc.z
    public int getPropertyIndex() {
        return this.f74236q.getPropertyIndex();
    }

    @Override // mc.z
    public jc.q getValueDeserializer() {
        return this.f74236q.getValueDeserializer();
    }

    @Override // mc.z
    public wc.g getValueTypeDeserializer() {
        return this.f74236q.getValueTypeDeserializer();
    }

    @Override // mc.z
    public boolean hasValueDeserializer() {
        return this.f74236q.hasValueDeserializer();
    }

    @Override // mc.z
    public boolean hasValueTypeDeserializer() {
        return this.f74236q.hasValueTypeDeserializer();
    }

    @Override // mc.z
    public boolean hasViews() {
        return this.f74236q.hasViews();
    }

    @Override // mc.z
    public boolean isInjectionOnly() {
        return this.f74236q.isInjectionOnly();
    }

    @Override // mc.z
    public void set(Object obj, Object obj2) throws IOException {
        this.f74236q.set(obj, obj2);
    }

    @Override // mc.z
    public Object setAndReturn(Object obj, Object obj2) throws IOException {
        return this.f74236q.setAndReturn(obj, obj2);
    }

    @Override // mc.z
    public boolean visibleInView(Class<?> cls) {
        return this.f74236q.visibleInView(cls);
    }

    @Override // mc.z
    public z withName(n0 n0Var) {
        z zVar = this.f74236q;
        z zVarWithName = zVar.withName(n0Var);
        return zVarWithName == zVar ? this : c(zVarWithName);
    }

    @Override // mc.z
    public z withNullProvider(v vVar) {
        z zVar = this.f74236q;
        z zVarWithNullProvider = zVar.withNullProvider(vVar);
        return zVarWithNullProvider == zVar ? this : c(zVarWithNullProvider);
    }

    @Override // mc.z
    public z withValueDeserializer(jc.q qVar) {
        z zVar = this.f74236q;
        z zVarWithValueDeserializer = zVar.withValueDeserializer(qVar);
        return zVarWithValueDeserializer == zVar ? this : c(zVarWithValueDeserializer);
    }
}
