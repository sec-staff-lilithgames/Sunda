package cd;

import com.ironsource.C3191e4;
import java.lang.reflect.TypeVariable;
import java.util.Collection;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class d extends o {

    /* renamed from: m, reason: collision with root package name */
    public final jc.o f12137m;

    public d(Class cls, r rVar, jc.o oVar, jc.o[] oVarArr, jc.o oVar2, Object obj, Object obj2, boolean z10) {
        super(cls, rVar, oVar, oVarArr, oVar2.hashCode(), obj, obj2, z10);
        this.f12137m = oVar2;
    }

    public static d construct(Class<?> cls, r rVar, jc.o oVar, jc.o[] oVarArr, jc.o oVar2) {
        return new d(cls, rVar, oVar, oVarArr, oVar2, null, null, false);
    }

    public static d upgradeFrom(jc.o oVar, jc.o oVar2) {
        if (oVar instanceof o) {
            return new d((o) oVar, oVar2);
        }
        throw new IllegalArgumentException("Cannot upgrade from an instance of " + oVar.getClass());
    }

    @Override // cd.o
    public final String c() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f69386b.getName());
        jc.o oVar = this.f12137m;
        if (oVar != null && b(1)) {
            sb2.append('<');
            sb2.append(oVar.toCanonical());
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
        d dVar = (d) obj;
        return this.f69386b == dVar.f69386b && this.f12137m.equals(dVar.f12137m);
    }

    @Override // jc.o
    public Object getContentTypeHandler() {
        return this.f12137m.getTypeHandler();
    }

    @Override // jc.o
    public Object getContentValueHandler() {
        return this.f12137m.getValueHandler();
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
        this.f12137m.getGenericSignature(sb2);
        sb2.append(">;");
        return sb2;
    }

    @Override // jc.o
    public boolean hasHandlers() {
        return super.hasHandlers() || this.f12137m.hasHandlers();
    }

    @Override // jc.o, hc.a
    public boolean isCollectionLikeType() {
        return true;
    }

    @Override // jc.o, hc.a
    public boolean isContainerType() {
        return true;
    }

    @Deprecated
    public boolean isTrueCollectionType() {
        return Collection.class.isAssignableFrom(this.f69386b);
    }

    @Override // jc.o
    public jc.o refine(Class<?> cls, r rVar, jc.o oVar, jc.o[] oVarArr) {
        return new d(cls, rVar, oVar, oVarArr, this.f12137m, this.f69388e, this.f69389f, this.f69390g);
    }

    @Override // jc.o
    public String toString() {
        StringBuilder sb2 = new StringBuilder("[collection-like type; class ");
        a.b.z(this.f69386b, sb2, ", contains ");
        sb2.append(this.f12137m);
        sb2.append(C3191e4.i.f36531e);
        return sb2.toString();
    }

    @Override // jc.o
    public jc.o withContentType(jc.o oVar) {
        if (this.f12137m == oVar) {
            return this;
        }
        return new d(this.f69386b, this.f12164j, this.f12162h, this.f12163i, oVar, this.f69388e, this.f69389f, this.f69390g);
    }

    @Override // jc.o
    public jc.o withHandlersFrom(jc.o oVar) {
        jc.o oVar2;
        jc.o oVarWithHandlersFrom;
        jc.o oVarWithHandlersFrom2 = super.withHandlersFrom(oVar);
        jc.o contentType = oVar.getContentType();
        return (contentType == null || (oVarWithHandlersFrom = (oVar2 = this.f12137m).withHandlersFrom(contentType)) == oVar2) ? oVarWithHandlersFrom2 : oVarWithHandlersFrom2.withContentType(oVarWithHandlersFrom);
    }

    @Deprecated
    public static d construct(Class<?> cls, jc.o oVar) {
        TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
        return new d(cls, (typeParameters == null || typeParameters.length != 1) ? r.emptyBindings() : r.create(cls, oVar), cls.getSuperclass() == null ? null : s.unknownType(), null, oVar, null, null, false);
    }

    @Override // jc.o, hc.a
    public jc.o getContentType() {
        return this.f12137m;
    }

    @Override // jc.o
    public d withContentTypeHandler(Object obj) {
        return new d(this.f69386b, this.f12164j, this.f12162h, this.f12163i, this.f12137m.withTypeHandler(obj), this.f69388e, this.f69389f, this.f69390g);
    }

    @Override // jc.o
    public d withContentValueHandler(Object obj) {
        return new d(this.f69386b, this.f12164j, this.f12162h, this.f12163i, this.f12137m.withValueHandler(obj), this.f69388e, this.f69389f, this.f69390g);
    }

    @Override // jc.o
    public d withStaticTyping() {
        if (this.f69390g) {
            return this;
        }
        return new d(this.f69386b, this.f12164j, this.f12162h, this.f12163i, this.f12137m.withStaticTyping(), this.f69388e, this.f69389f, true);
    }

    @Override // jc.o
    public d withTypeHandler(Object obj) {
        return new d(this.f69386b, this.f12164j, this.f12162h, this.f12163i, this.f12137m, this.f69388e, obj, this.f69390g);
    }

    @Override // jc.o
    public d withValueHandler(Object obj) {
        return new d(this.f69386b, this.f12164j, this.f12162h, this.f12163i, this.f12137m, obj, this.f69389f, this.f69390g);
    }

    public d(o oVar, jc.o oVar2) {
        super(oVar);
        this.f12137m = oVar2;
    }
}
