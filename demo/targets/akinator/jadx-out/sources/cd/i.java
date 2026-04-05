package cd;

import java.lang.reflect.TypeVariable;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class i extends o {

    /* renamed from: m, reason: collision with root package name */
    public final jc.o f12153m;

    /* renamed from: n, reason: collision with root package name */
    public final jc.o f12154n;

    public i(Class cls, r rVar, jc.o oVar, jc.o[] oVarArr, jc.o oVar2, jc.o oVar3, Object obj, Object obj2, boolean z10) {
        super(cls, rVar, oVar, oVarArr, oVar3.hashCode() + (oVar2.hashCode() * 31), obj, obj2, z10);
        this.f12153m = oVar2;
        this.f12154n = oVar3;
    }

    @Deprecated
    public static i construct(Class<?> cls, jc.o oVar, jc.o oVar2) {
        TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
        return new i(cls, (typeParameters == null || typeParameters.length != 2) ? r.emptyBindings() : r.create(cls, oVar, oVar2), cls.getSuperclass() == null ? null : s.unknownType(), null, oVar, oVar2, null, null, false);
    }

    public static i upgradeFrom(jc.o oVar, jc.o oVar2, jc.o oVar3) {
        if (oVar instanceof o) {
            return new i((o) oVar, oVar2, oVar3);
        }
        throw new IllegalArgumentException("Cannot upgrade from an instance of " + oVar.getClass());
    }

    @Override // cd.o
    public final String c() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f69386b.getName());
        jc.o oVar = this.f12153m;
        if (oVar != null && b(2)) {
            sb2.append('<');
            sb2.append(oVar.toCanonical());
            sb2.append(AbstractJsonLexerKt.COMMA);
            sb2.append(this.f12154n.toCanonical());
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
        i iVar = (i) obj;
        return this.f69386b == iVar.f69386b && this.f12153m.equals(iVar.f12153m) && this.f12154n.equals(iVar.f12154n);
    }

    @Override // jc.o
    public Object getContentTypeHandler() {
        return this.f12154n.getTypeHandler();
    }

    @Override // jc.o
    public Object getContentValueHandler() {
        return this.f12154n.getValueHandler();
    }

    @Override // cd.o, jc.o
    public StringBuilder getErasedSignature(StringBuilder sb2) {
        o.a(this.f69386b, sb2, true);
        return sb2;
    }

    @Override // cd.o, jc.o
    public StringBuilder getGenericSignature(StringBuilder sb2) {
        o.a(this.f69386b, sb2, false);
        sb2.append('<');
        this.f12153m.getGenericSignature(sb2);
        this.f12154n.getGenericSignature(sb2);
        sb2.append(">;");
        return sb2;
    }

    @Override // jc.o
    public boolean hasHandlers() {
        return super.hasHandlers() || this.f12154n.hasHandlers() || this.f12153m.hasHandlers();
    }

    @Override // jc.o, hc.a
    public boolean isContainerType() {
        return true;
    }

    @Override // jc.o, hc.a
    public boolean isMapLikeType() {
        return true;
    }

    @Deprecated
    public boolean isTrueMapType() {
        return Map.class.isAssignableFrom(this.f69386b);
    }

    @Override // jc.o
    public jc.o refine(Class<?> cls, r rVar, jc.o oVar, jc.o[] oVarArr) {
        return new i(cls, rVar, oVar, oVarArr, this.f12153m, this.f12154n, this.f69388e, this.f69389f, this.f69390g);
    }

    @Override // jc.o
    public String toString() {
        return String.format("[map-like type; class %s, %s -> %s]", this.f69386b.getName(), this.f12153m, this.f12154n);
    }

    @Override // jc.o
    public jc.o withContentType(jc.o oVar) {
        if (this.f12154n == oVar) {
            return this;
        }
        return new i(this.f69386b, this.f12164j, this.f12162h, this.f12163i, this.f12153m, oVar, this.f69388e, this.f69389f, this.f69390g);
    }

    @Override // jc.o
    public jc.o withHandlersFrom(jc.o oVar) {
        jc.o oVar2;
        jc.o oVarWithHandlersFrom;
        jc.o oVar3;
        jc.o oVarWithHandlersFrom2;
        jc.o oVarWithHandlersFrom3 = super.withHandlersFrom(oVar);
        jc.o keyType = oVar.getKeyType();
        if ((oVarWithHandlersFrom3 instanceof i) && keyType != null && (oVarWithHandlersFrom2 = (oVar3 = this.f12153m).withHandlersFrom(keyType)) != oVar3) {
            oVarWithHandlersFrom3 = ((i) oVarWithHandlersFrom3).withKeyType(oVarWithHandlersFrom2);
        }
        jc.o contentType = oVar.getContentType();
        return (contentType == null || (oVarWithHandlersFrom = (oVar2 = this.f12154n).withHandlersFrom(contentType)) == oVar2) ? oVarWithHandlersFrom3 : oVarWithHandlersFrom3.withContentType(oVarWithHandlersFrom);
    }

    public i withKeyType(jc.o oVar) {
        if (oVar == this.f12153m) {
            return this;
        }
        return new i(this.f69386b, this.f12164j, this.f12162h, this.f12163i, oVar, this.f12154n, this.f69388e, this.f69389f, this.f69390g);
    }

    public i withKeyTypeHandler(Object obj) {
        return new i(this.f69386b, this.f12164j, this.f12162h, this.f12163i, this.f12153m.withTypeHandler(obj), this.f12154n, this.f69388e, this.f69389f, this.f69390g);
    }

    public i withKeyValueHandler(Object obj) {
        return new i(this.f69386b, this.f12164j, this.f12162h, this.f12163i, this.f12153m.withValueHandler(obj), this.f12154n, this.f69388e, this.f69389f, this.f69390g);
    }

    @Override // jc.o, hc.a
    public jc.o getContentType() {
        return this.f12154n;
    }

    @Override // jc.o, hc.a
    public jc.o getKeyType() {
        return this.f12153m;
    }

    @Override // jc.o
    public i withContentTypeHandler(Object obj) {
        return new i(this.f69386b, this.f12164j, this.f12162h, this.f12163i, this.f12153m, this.f12154n.withTypeHandler(obj), this.f69388e, this.f69389f, this.f69390g);
    }

    @Override // jc.o
    public i withContentValueHandler(Object obj) {
        return new i(this.f69386b, this.f12164j, this.f12162h, this.f12163i, this.f12153m, this.f12154n.withValueHandler(obj), this.f69388e, this.f69389f, this.f69390g);
    }

    @Override // jc.o
    public i withStaticTyping() {
        if (this.f69390g) {
            return this;
        }
        return new i(this.f69386b, this.f12164j, this.f12162h, this.f12163i, this.f12153m, this.f12154n.withStaticTyping(), this.f69388e, this.f69389f, true);
    }

    @Override // jc.o
    public i withTypeHandler(Object obj) {
        return new i(this.f69386b, this.f12164j, this.f12162h, this.f12163i, this.f12153m, this.f12154n, this.f69388e, obj, this.f69390g);
    }

    @Override // jc.o
    public i withValueHandler(Object obj) {
        return new i(this.f69386b, this.f12164j, this.f12162h, this.f12163i, this.f12153m, this.f12154n, obj, this.f69389f, this.f69390g);
    }

    public i(o oVar, jc.o oVar2, jc.o oVar3) {
        super(oVar);
        this.f12153m = oVar2;
        this.f12154n = oVar3;
    }
}
