package cd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class m extends f {

    /* renamed from: m, reason: collision with root package name */
    public jc.o f12159m;

    public m(Class<?> cls, r rVar) {
        super(cls, rVar, null, null, 0, null, null, false);
    }

    @Override // cd.o, jc.o
    public r getBindings() {
        jc.o oVar = this.f12159m;
        return oVar != null ? oVar.getBindings() : super.getBindings();
    }

    @Override // cd.o, jc.o
    public StringBuilder getErasedSignature(StringBuilder sb2) {
        jc.o oVar = this.f12159m;
        return oVar != null ? oVar.getErasedSignature(sb2) : sb2;
    }

    @Override // cd.o, jc.o
    public StringBuilder getGenericSignature(StringBuilder sb2) {
        jc.o oVar = this.f12159m;
        if (oVar != null) {
            return oVar.getErasedSignature(sb2);
        }
        sb2.append("?");
        return sb2;
    }

    public jc.o getSelfReferencedType() {
        return this.f12159m;
    }

    @Override // cd.o, jc.o
    public jc.o getSuperClass() {
        jc.o oVar = this.f12159m;
        return oVar != null ? oVar.getSuperClass() : super.getSuperClass();
    }

    @Override // jc.o, hc.a
    public boolean isContainerType() {
        return false;
    }

    @Override // jc.o
    public jc.o refine(Class<?> cls, r rVar, jc.o oVar, jc.o[] oVarArr) {
        return null;
    }

    public void setReference(jc.o oVar) {
        if (this.f12159m == null) {
            this.f12159m = oVar;
            return;
        }
        throw new IllegalStateException("Trying to re-set self reference; old value = " + this.f12159m + ", new = " + oVar);
    }

    @Override // jc.o
    public String toString() {
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("[recursive type; ");
        jc.o oVar = this.f12159m;
        if (oVar == null) {
            sb2.append("UNRESOLVED");
        } else {
            sb2.append(oVar.getRawClass().getName());
        }
        return sb2.toString();
    }

    @Override // jc.o
    public jc.o withStaticTyping() {
        return this;
    }

    @Override // jc.o
    public jc.o withContentType(jc.o oVar) {
        return this;
    }

    @Override // jc.o
    public jc.o withContentTypeHandler(Object obj) {
        return this;
    }

    @Override // jc.o
    public jc.o withContentValueHandler(Object obj) {
        return this;
    }

    @Override // jc.o
    public jc.o withTypeHandler(Object obj) {
        return this;
    }

    @Override // jc.o
    public jc.o withValueHandler(Object obj) {
        return this;
    }
}
