package cd;

import com.ironsource.C3191e4;
import java.lang.reflect.TypeVariable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e extends d {
    public static e construct(Class<?> cls, r rVar, jc.o oVar, jc.o[] oVarArr, jc.o oVar2) {
        return new e(cls, rVar, oVar, oVarArr, oVar2, null, null, false);
    }

    @Override // cd.d, jc.o
    public jc.o refine(Class<?> cls, r rVar, jc.o oVar, jc.o[] oVarArr) {
        return new e(cls, rVar, oVar, oVarArr, this.f12137m, this.f69388e, this.f69389f, this.f69390g);
    }

    @Override // cd.d, jc.o
    public String toString() {
        StringBuilder sb2 = new StringBuilder("[collection type; class ");
        a.b.z(this.f69386b, sb2, ", contains ");
        sb2.append(this.f12137m);
        sb2.append(C3191e4.i.f36531e);
        return sb2.toString();
    }

    @Override // cd.d, jc.o
    public jc.o withContentType(jc.o oVar) {
        if (this.f12137m == oVar) {
            return this;
        }
        return new e(this.f69386b, this.f12164j, this.f12162h, this.f12163i, oVar, this.f69388e, this.f69389f, this.f69390g);
    }

    @Deprecated
    public static e construct(Class<?> cls, jc.o oVar) {
        r rVarEmptyBindings;
        TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
        if (typeParameters != null && typeParameters.length == 1) {
            rVarEmptyBindings = r.create(cls, oVar);
        } else {
            rVarEmptyBindings = r.emptyBindings();
        }
        return new e(cls, rVarEmptyBindings, cls.getSuperclass() == null ? null : s.unknownType(), null, oVar, null, null, false);
    }

    @Override // cd.d, jc.o
    public e withContentTypeHandler(Object obj) {
        return new e(this.f69386b, this.f12164j, this.f12162h, this.f12163i, this.f12137m.withTypeHandler(obj), this.f69388e, this.f69389f, this.f69390g);
    }

    @Override // cd.d, jc.o
    public e withContentValueHandler(Object obj) {
        return new e(this.f69386b, this.f12164j, this.f12162h, this.f12163i, this.f12137m.withValueHandler(obj), this.f69388e, this.f69389f, this.f69390g);
    }

    @Override // cd.d, jc.o
    public e withStaticTyping() {
        if (this.f69390g) {
            return this;
        }
        return new e(this.f69386b, this.f12164j, this.f12162h, this.f12163i, this.f12137m.withStaticTyping(), this.f69388e, this.f69389f, true);
    }

    @Override // cd.d, jc.o
    public e withTypeHandler(Object obj) {
        return new e(this.f69386b, this.f12164j, this.f12162h, this.f12163i, this.f12137m, this.f69388e, obj, this.f69390g);
    }

    @Override // cd.d, jc.o
    public e withValueHandler(Object obj) {
        return new e(this.f69386b, this.f12164j, this.f12162h, this.f12163i, this.f12137m, obj, this.f69389f, this.f69390g);
    }
}
