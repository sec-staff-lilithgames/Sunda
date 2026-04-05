package cd;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g extends n {

    /* renamed from: m, reason: collision with root package name */
    public final jc.o f12138m;

    public g(Class cls, r rVar, jc.o oVar, jc.o[] oVarArr, jc.o oVar2, Object obj, Object obj2, boolean z10) {
        super(cls, rVar, oVar, oVarArr, Objects.hashCode(oVar2), obj, obj2, z10);
        this.f12138m = oVar2;
    }

    public static g construct(Class<?> cls, r rVar, jc.o oVar, jc.o[] oVarArr, jc.o oVar2) {
        return new g(cls, rVar, oVar, oVarArr, oVar2, null, null, false);
    }

    public static g upgradeFrom(jc.o oVar, jc.o oVar2) {
        Objects.requireNonNull(oVar2);
        if (oVar instanceof o) {
            return new g((o) oVar, oVar2);
        }
        throw new IllegalArgumentException("Cannot upgrade from an instance of " + oVar.getClass());
    }

    @Override // cd.n, cd.o
    public final String c() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f69386b.getName());
        jc.o oVar = this.f12138m;
        if (oVar != null && b(1)) {
            sb2.append('<');
            sb2.append(oVar.toCanonical());
            sb2.append('>');
        }
        return sb2.toString();
    }

    @Override // cd.n, cd.o, jc.o
    public StringBuilder getErasedSignature(StringBuilder sb2) {
        o.a(this.f69386b, sb2, true);
        return sb2;
    }

    @Override // cd.n, cd.o, jc.o
    public StringBuilder getGenericSignature(StringBuilder sb2) {
        o.a(this.f69386b, sb2, false);
        sb2.append('<');
        StringBuilder genericSignature = this.f12138m.getGenericSignature(sb2);
        genericSignature.append(">;");
        return genericSignature;
    }

    @Override // cd.n, jc.o
    public boolean hasContentType() {
        return true;
    }

    @Override // jc.o
    public boolean isIterationType() {
        return true;
    }

    @Override // cd.n, jc.o
    public jc.o refine(Class<?> cls, r rVar, jc.o oVar, jc.o[] oVarArr) {
        return new g(cls, this.f12164j, oVar, oVarArr, this.f12138m, this.f69388e, this.f69389f, this.f69390g);
    }

    @Override // cd.n, jc.o
    public jc.o withContentType(jc.o oVar) {
        if (this.f12138m == oVar) {
            return this;
        }
        return new g(this.f69386b, this.f12164j, this.f12162h, this.f12163i, oVar, this.f69388e, this.f69389f, this.f69390g);
    }

    @Override // jc.o, hc.a
    public jc.o getContentType() {
        return this.f12138m;
    }

    @Override // cd.n, jc.o
    public g withContentTypeHandler(Object obj) {
        jc.o oVar = this.f12138m;
        if (obj == oVar.getTypeHandler()) {
            return this;
        }
        return new g(this.f69386b, this.f12164j, this.f12162h, this.f12163i, oVar.withTypeHandler(obj), this.f69388e, this.f69389f, this.f69390g);
    }

    @Override // cd.n, jc.o
    public g withContentValueHandler(Object obj) {
        jc.o oVar = this.f12138m;
        if (obj == oVar.getValueHandler()) {
            return this;
        }
        return new g(this.f69386b, this.f12164j, this.f12162h, this.f12163i, oVar.withValueHandler(obj), this.f69388e, this.f69389f, this.f69390g);
    }

    @Override // cd.n, jc.o
    public g withStaticTyping() {
        if (this.f69390g) {
            return this;
        }
        return new g(this.f69386b, this.f12164j, this.f12162h, this.f12163i, this.f12138m.withStaticTyping(), this.f69388e, this.f69389f, true);
    }

    @Override // cd.n, jc.o
    public g withTypeHandler(Object obj) {
        if (obj == this.f69389f) {
            return this;
        }
        return new g(this.f69386b, this.f12164j, this.f12162h, this.f12163i, this.f12138m, this.f69388e, obj, this.f69390g);
    }

    @Override // cd.n, jc.o
    public g withValueHandler(Object obj) {
        if (obj == this.f69388e) {
            return this;
        }
        return new g(this.f69386b, this.f12164j, this.f12162h, this.f12163i, this.f12138m, obj, this.f69389f, this.f69390g);
    }

    public g(o oVar, jc.o oVar2) {
        super(oVar);
        this.f12138m = oVar2;
    }
}
