package cd;

import com.ironsource.C3191e4;
import java.lang.reflect.TypeVariable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class j extends i {
    public static j construct(Class<?> cls, r rVar, jc.o oVar, jc.o[] oVarArr, jc.o oVar2, jc.o oVar3) {
        return new j(cls, rVar, oVar, oVarArr, oVar2, oVar3, null, null, false);
    }

    @Override // cd.i, jc.o
    public jc.o refine(Class<?> cls, r rVar, jc.o oVar, jc.o[] oVarArr) {
        return new j(cls, rVar, oVar, oVarArr, this.f12153m, this.f12154n, this.f69388e, this.f69389f, this.f69390g);
    }

    @Override // cd.i, jc.o
    public String toString() {
        StringBuilder sb2 = new StringBuilder("[map type; class ");
        a.b.z(this.f69386b, sb2, ", ");
        sb2.append(this.f12153m);
        sb2.append(" -> ");
        sb2.append(this.f12154n);
        sb2.append(C3191e4.i.f36531e);
        return sb2.toString();
    }

    @Override // cd.i, jc.o
    public jc.o withContentType(jc.o oVar) {
        if (this.f12154n == oVar) {
            return this;
        }
        return new j(this.f69386b, this.f12164j, this.f12162h, this.f12163i, this.f12153m, oVar, this.f69388e, this.f69389f, this.f69390g);
    }

    @Override // cd.i
    public j withKeyType(jc.o oVar) {
        if (oVar == this.f12153m) {
            return this;
        }
        return new j(this.f69386b, this.f12164j, this.f12162h, this.f12163i, oVar, this.f12154n, this.f69388e, this.f69389f, this.f69390g);
    }

    @Override // cd.i
    public j withKeyTypeHandler(Object obj) {
        return new j(this.f69386b, this.f12164j, this.f12162h, this.f12163i, this.f12153m.withTypeHandler(obj), this.f12154n, this.f69388e, this.f69389f, this.f69390g);
    }

    @Override // cd.i
    public j withKeyValueHandler(Object obj) {
        return new j(this.f69386b, this.f12164j, this.f12162h, this.f12163i, this.f12153m.withValueHandler(obj), this.f12154n, this.f69388e, this.f69389f, this.f69390g);
    }

    @Deprecated
    public static j construct(Class<?> cls, jc.o oVar, jc.o oVar2) {
        r rVarEmptyBindings;
        TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
        if (typeParameters != null && typeParameters.length == 2) {
            rVarEmptyBindings = r.create(cls, oVar, oVar2);
        } else {
            rVarEmptyBindings = r.emptyBindings();
        }
        return new j(cls, rVarEmptyBindings, cls.getSuperclass() == null ? null : s.unknownType(), null, oVar, oVar2, null, null, false);
    }

    @Override // cd.i, jc.o
    public j withContentTypeHandler(Object obj) {
        return new j(this.f69386b, this.f12164j, this.f12162h, this.f12163i, this.f12153m, this.f12154n.withTypeHandler(obj), this.f69388e, this.f69389f, this.f69390g);
    }

    @Override // cd.i, jc.o
    public j withContentValueHandler(Object obj) {
        return new j(this.f69386b, this.f12164j, this.f12162h, this.f12163i, this.f12153m, this.f12154n.withValueHandler(obj), this.f69388e, this.f69389f, this.f69390g);
    }

    @Override // cd.i, jc.o
    public j withStaticTyping() {
        if (this.f69390g) {
            return this;
        }
        return new j(this.f69386b, this.f12164j, this.f12162h, this.f12163i, this.f12153m.withStaticTyping(), this.f12154n.withStaticTyping(), this.f69388e, this.f69389f, true);
    }

    @Override // cd.i, jc.o
    public j withTypeHandler(Object obj) {
        return new j(this.f69386b, this.f12164j, this.f12162h, this.f12163i, this.f12153m, this.f12154n, this.f69388e, obj, this.f69390g);
    }

    @Override // cd.i, jc.o
    public j withValueHandler(Object obj) {
        return new j(this.f69386b, this.f12164j, this.f12162h, this.f12163i, this.f12153m, this.f12154n, obj, this.f69389f, this.f69390g);
    }
}
