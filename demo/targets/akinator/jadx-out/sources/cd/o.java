package cd;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import jc.u0;
import jc.v;
import ub.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class o extends jc.o implements v {

    /* renamed from: k, reason: collision with root package name */
    public static final r f12160k = r.emptyBindings();

    /* renamed from: l, reason: collision with root package name */
    public static final jc.o[] f12161l = new jc.o[0];

    /* renamed from: h, reason: collision with root package name */
    public final jc.o f12162h;

    /* renamed from: i, reason: collision with root package name */
    public final jc.o[] f12163i;

    /* renamed from: j, reason: collision with root package name */
    public final r f12164j;

    public o(Class cls, r rVar, jc.o oVar, jc.o[] oVarArr, int i10, Object obj, Object obj2, boolean z10) {
        super(cls, i10, obj, obj2, z10);
        this.f12164j = rVar == null ? f12160k : rVar;
        this.f12162h = oVar;
        this.f12163i = oVarArr;
    }

    public static void a(Class cls, StringBuilder sb2, boolean z10) {
        if (!cls.isPrimitive()) {
            sb2.append('L');
            String name = cls.getName();
            int length = name.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = name.charAt(i10);
                if (cCharAt == '.') {
                    cCharAt = '/';
                }
                sb2.append(cCharAt);
            }
            if (z10) {
                sb2.append(';');
                return;
            }
            return;
        }
        if (cls == Boolean.TYPE) {
            sb2.append('Z');
            return;
        }
        if (cls == Byte.TYPE) {
            sb2.append('B');
            return;
        }
        if (cls == Short.TYPE) {
            sb2.append('S');
            return;
        }
        if (cls == Character.TYPE) {
            sb2.append('C');
            return;
        }
        if (cls == Integer.TYPE) {
            sb2.append('I');
            return;
        }
        if (cls == Long.TYPE) {
            sb2.append('J');
            return;
        }
        if (cls == Float.TYPE) {
            sb2.append('F');
        } else if (cls == Double.TYPE) {
            sb2.append('D');
        } else {
            if (cls != Void.TYPE) {
                throw new IllegalStateException("Unrecognized primitive type: ".concat(cls.getName()));
            }
            sb2.append('V');
        }
    }

    public final boolean b(int i10) {
        return this.f69386b.getTypeParameters().length == i10;
    }

    public String c() {
        return this.f69386b.getName();
    }

    @Override // jc.o, hc.a
    public int containedTypeCount() {
        return this.f12164j.size();
    }

    @Override // jc.o, hc.a
    @Deprecated
    public String containedTypeName(int i10) {
        return this.f12164j.getBoundName(i10);
    }

    @Override // jc.o
    public final jc.o findSuperType(Class<?> cls) {
        jc.o oVarFindSuperType;
        jc.o[] oVarArr;
        if (cls == this.f69386b) {
            return this;
        }
        if (cls.isInterface() && (oVarArr = this.f12163i) != null) {
            for (jc.o oVar : oVarArr) {
                jc.o oVarFindSuperType2 = oVar.findSuperType(cls);
                if (oVarFindSuperType2 != null) {
                    return oVarFindSuperType2;
                }
            }
        }
        jc.o oVar2 = this.f12162h;
        if (oVar2 == null || (oVarFindSuperType = oVar2.findSuperType(cls)) == null) {
            return null;
        }
        return oVarFindSuperType;
    }

    @Override // jc.o
    public jc.o[] findTypeParameters(Class<?> cls) {
        jc.o oVarFindSuperType = findSuperType(cls);
        return oVarFindSuperType == null ? f12161l : oVarFindSuperType.getBindings().f12180c;
    }

    @Override // jc.o
    public r getBindings() {
        return this.f12164j;
    }

    @Override // jc.o
    public abstract StringBuilder getErasedSignature(StringBuilder sb2);

    @Override // jc.o
    public abstract StringBuilder getGenericSignature(StringBuilder sb2);

    @Override // jc.o
    public List<jc.o> getInterfaces() {
        jc.o[] oVarArr = this.f12163i;
        if (oVarArr == null) {
            return Collections.EMPTY_LIST;
        }
        int length = oVarArr.length;
        return length != 0 ? length != 1 ? Arrays.asList(oVarArr) : Collections.singletonList(oVarArr[0]) : Collections.EMPTY_LIST;
    }

    @Override // jc.o
    public jc.o getSuperClass() {
        return this.f12162h;
    }

    @Override // jc.v
    public void serialize(ub.o oVar, u0 u0Var) throws IOException {
        oVar.writeString(toCanonical());
    }

    @Override // jc.v
    public void serializeWithType(ub.o oVar, u0 u0Var, wc.j jVar) throws IOException {
        hc.c cVar = new hc.c(this, z.VALUE_STRING);
        jVar.writeTypePrefix(oVar, cVar);
        serialize(oVar, u0Var);
        jVar.writeTypeSuffix(oVar, cVar);
    }

    @Override // hc.a
    public String toCanonical() {
        return c();
    }

    @Override // jc.o, hc.a
    public jc.o containedType(int i10) {
        return this.f12164j.getBoundType(i10);
    }

    public o(o oVar) {
        super(oVar);
        this.f12162h = oVar.f12162h;
        this.f12163i = oVar.f12163i;
        this.f12164j = oVar.f12164j;
    }
}
