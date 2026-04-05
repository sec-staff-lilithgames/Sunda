package cd;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l extends n {

    /* renamed from: m, reason: collision with root package name */
    public final jc.o f12157m;

    /* renamed from: n, reason: collision with root package name */
    public final jc.o f12158n;

    public l(Class cls, r rVar, jc.o oVar, jc.o[] oVarArr, jc.o oVar2, jc.o oVar3, Object obj, Object obj2, boolean z10) {
        super(cls, rVar, oVar, oVarArr, Objects.hashCode(oVar2), obj, obj2, z10);
        this.f12157m = oVar2;
        this.f12158n = oVar3 == null ? this : oVar3;
    }

    public static l construct(Class<?> cls, r rVar, jc.o oVar, jc.o[] oVarArr, jc.o oVar2) {
        return new l(cls, rVar, oVar, oVarArr, oVar2, null, null, null, false);
    }

    public static l upgradeFrom(jc.o oVar, jc.o oVar2) {
        if (oVar2 == null) {
            throw new IllegalArgumentException("Missing referencedType");
        }
        if (oVar instanceof o) {
            return new l((o) oVar, oVar2);
        }
        throw new IllegalArgumentException("Cannot upgrade from an instance of " + oVar.getClass());
    }

    @Override // cd.n, cd.o
    public final String c() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f69386b.getName());
        jc.o oVar = this.f12157m;
        if (oVar != null && b(1)) {
            sb2.append('<');
            sb2.append(oVar.toCanonical());
            sb2.append('>');
        }
        return sb2.toString();
    }

    @Override // cd.n, jc.o
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != l.class) {
            return false;
        }
        l lVar = (l) obj;
        if (lVar.f69386b != this.f69386b) {
            return false;
        }
        return this.f12157m.equals(lVar.f12157m);
    }

    @Deprecated
    public jc.o getAnchorType() {
        return this.f12158n;
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
        StringBuilder genericSignature = this.f12157m.getGenericSignature(sb2);
        genericSignature.append(">;");
        return genericSignature;
    }

    @Override // cd.n, jc.o
    public boolean hasContentType() {
        return true;
    }

    @Deprecated
    public boolean isAnchorType() {
        return this.f12158n == this;
    }

    @Override // hc.a
    public boolean isReferenceType() {
        return true;
    }

    @Override // cd.n, jc.o
    public jc.o refine(Class<?> cls, r rVar, jc.o oVar, jc.o[] oVarArr) {
        return new l(cls, this.f12164j, oVar, oVarArr, this.f12157m, this.f12158n, this.f69388e, this.f69389f, this.f69390g);
    }

    @Override // cd.n, jc.o
    public String toString() {
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("[reference type, class ");
        sb2.append(c());
        sb2.append('<');
        sb2.append(this.f12157m);
        sb2.append(">]");
        return sb2.toString();
    }

    @Override // cd.n, jc.o
    public jc.o withContentType(jc.o oVar) {
        if (this.f12157m == oVar) {
            return this;
        }
        return new l(this.f69386b, this.f12164j, this.f12162h, this.f12163i, oVar, this.f12158n, this.f69388e, this.f69389f, this.f69390g);
    }

    @Deprecated
    public static l construct(Class<?> cls, jc.o oVar) {
        return new l(cls, r.emptyBindings(), null, null, null, oVar, null, null, false);
    }

    @Override // jc.o, hc.a
    public jc.o getContentType() {
        return this.f12157m;
    }

    @Override // jc.o, hc.a
    public jc.o getReferencedType() {
        return this.f12157m;
    }

    @Override // cd.n, jc.o
    public l withContentTypeHandler(Object obj) {
        jc.o oVar = this.f12157m;
        if (obj == oVar.getTypeHandler()) {
            return this;
        }
        return new l(this.f69386b, this.f12164j, this.f12162h, this.f12163i, oVar.withTypeHandler(obj), this.f12158n, this.f69388e, this.f69389f, this.f69390g);
    }

    @Override // cd.n, jc.o
    public l withContentValueHandler(Object obj) {
        jc.o oVar = this.f12157m;
        if (obj == oVar.getValueHandler()) {
            return this;
        }
        return new l(this.f69386b, this.f12164j, this.f12162h, this.f12163i, oVar.withValueHandler(obj), this.f12158n, this.f69388e, this.f69389f, this.f69390g);
    }

    @Override // cd.n, jc.o
    public l withStaticTyping() {
        if (this.f69390g) {
            return this;
        }
        return new l(this.f69386b, this.f12164j, this.f12162h, this.f12163i, this.f12157m.withStaticTyping(), this.f12158n, this.f69388e, this.f69389f, true);
    }

    @Override // cd.n, jc.o
    public l withTypeHandler(Object obj) {
        if (obj == this.f69389f) {
            return this;
        }
        return new l(this.f69386b, this.f12164j, this.f12162h, this.f12163i, this.f12157m, this.f12158n, this.f69388e, obj, this.f69390g);
    }

    @Override // cd.n, jc.o
    public l withValueHandler(Object obj) {
        if (obj == this.f69388e) {
            return this;
        }
        return new l(this.f69386b, this.f12164j, this.f12162h, this.f12163i, this.f12157m, this.f12158n, obj, this.f69389f, this.f69390g);
    }

    public l(o oVar, jc.o oVar2) {
        super(oVar);
        this.f12157m = oVar2;
        this.f12158n = this;
    }
}
