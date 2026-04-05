package cd;

import b0.e2;
import java.util.Collection;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class n extends o {
    public n(Class cls) {
        this(cls, r.emptyBindings(), null, null);
    }

    @Deprecated
    public static n construct(Class<?> cls) {
        if (Map.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException(e2.k(cls, new StringBuilder("Cannot construct SimpleType for a Map (class: "), ")"));
        }
        if (Collection.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException(e2.k(cls, new StringBuilder("Cannot construct SimpleType for a Collection (class: "), ")"));
        }
        if (cls.isArray()) {
            throw new IllegalArgumentException(e2.k(cls, new StringBuilder("Cannot construct SimpleType for an array (class: "), ")"));
        }
        r rVarEmptyBindings = r.emptyBindings();
        return new n(cls, rVarEmptyBindings, d(cls.getSuperclass(), rVarEmptyBindings), null, null, null, false);
    }

    public static n constructUnsafe(Class<?> cls) {
        return new n(cls, null, null, null, null, null, false);
    }

    public static jc.o d(Class cls, r rVar) {
        if (cls == null) {
            return null;
        }
        return cls == Object.class ? s.unknownType() : new n(cls, rVar, d(cls.getSuperclass(), rVar), null, null, null, false);
    }

    @Override // cd.o
    public String c() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f69386b.getName());
        int size = this.f12164j.size();
        if (size > 0 && b(size)) {
            sb2.append('<');
            for (int i10 = 0; i10 < size; i10++) {
                jc.o oVarContainedType = containedType(i10);
                if (i10 > 0) {
                    sb2.append(AbstractJsonLexerKt.COMMA);
                }
                sb2.append(oVarContainedType.toCanonical());
            }
            sb2.append('>');
        }
        return sb2.toString();
    }

    @Override // jc.o
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        n nVar = (n) obj;
        if (nVar.f69386b != this.f69386b) {
            return false;
        }
        return this.f12164j.equals(nVar.f12164j);
    }

    @Override // cd.o, jc.o
    public StringBuilder getErasedSignature(StringBuilder sb2) {
        o.a(this.f69386b, sb2, true);
        return sb2;
    }

    @Override // cd.o, jc.o
    public StringBuilder getGenericSignature(StringBuilder sb2) {
        o.a(this.f69386b, sb2, false);
        int size = this.f12164j.size();
        if (size > 0) {
            sb2.append('<');
            for (int i10 = 0; i10 < size; i10++) {
                sb2 = containedType(i10).getGenericSignature(sb2);
            }
            sb2.append('>');
        }
        sb2.append(';');
        return sb2;
    }

    @Override // jc.o
    public boolean hasContentType() {
        return false;
    }

    @Override // jc.o, hc.a
    public boolean isContainerType() {
        return false;
    }

    @Override // jc.o
    public jc.o refine(Class<?> cls, r rVar, jc.o oVar, jc.o[] oVarArr) {
        return null;
    }

    @Override // jc.o
    public String toString() {
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("[simple type, class ");
        sb2.append(c());
        sb2.append(AbstractJsonLexerKt.END_LIST);
        return sb2.toString();
    }

    @Override // jc.o
    public jc.o withContentType(jc.o oVar) {
        throw new IllegalArgumentException("Simple types have no content types; cannot call withContentType()");
    }

    @Override // jc.o
    public jc.o withContentTypeHandler(Object obj) {
        throw new IllegalArgumentException("Simple types have no content types; cannot call withContenTypeHandler()");
    }

    public n(Class cls, r rVar, jc.o oVar, jc.o[] oVarArr) {
        this(cls, rVar, oVar, oVarArr, null, null, false);
    }

    @Override // jc.o
    public n withContentValueHandler(Object obj) {
        throw new IllegalArgumentException("Simple types have no content types; cannot call withContenValueHandler()");
    }

    @Override // jc.o
    public n withStaticTyping() {
        if (this.f69390g) {
            return this;
        }
        return new n(this.f69386b, this.f12164j, this.f12162h, this.f12163i, this.f69388e, this.f69389f, true);
    }

    @Override // jc.o
    public n withTypeHandler(Object obj) {
        if (this.f69389f == obj) {
            return this;
        }
        return new n(this.f69386b, this.f12164j, this.f12162h, this.f12163i, this.f69388e, obj, this.f69390g);
    }

    @Override // jc.o
    public n withValueHandler(Object obj) {
        if (obj == this.f69388e) {
            return this;
        }
        return new n(this.f69386b, this.f12164j, this.f12162h, this.f12163i, obj, this.f69389f, this.f69390g);
    }

    public n(Class cls, r rVar, jc.o oVar, jc.o[] oVarArr, Object obj, Object obj2, boolean z10) {
        super(cls, rVar, oVar, oVarArr, (rVar == null ? r.emptyBindings() : rVar).hashCode(), obj, obj2, z10);
    }
}
