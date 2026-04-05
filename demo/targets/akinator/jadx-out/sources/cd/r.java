package cd;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import java.io.Serializable;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class r implements Serializable {

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f12176g;

    /* renamed from: h, reason: collision with root package name */
    public static final jc.o[] f12177h;

    /* renamed from: i, reason: collision with root package name */
    public static final r f12178i;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f12179b;

    /* renamed from: c, reason: collision with root package name */
    public final jc.o[] f12180c;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f12181e;

    /* renamed from: f, reason: collision with root package name */
    public final int f12182f;

    static {
        String[] strArr = new String[0];
        f12176g = strArr;
        jc.o[] oVarArr = new jc.o[0];
        f12177h = oVarArr;
        f12178i = new r(strArr, oVarArr, null);
    }

    public r(String[] strArr, jc.o[] oVarArr, String[] strArr2) {
        strArr = strArr == null ? f12176g : strArr;
        this.f12179b = strArr;
        oVarArr = oVarArr == null ? f12177h : oVarArr;
        this.f12180c = oVarArr;
        if (strArr.length == oVarArr.length) {
            this.f12181e = strArr2;
            this.f12182f = Arrays.hashCode(oVarArr);
        } else {
            StringBuilder sb2 = new StringBuilder("Mismatching names (");
            sb2.append(strArr.length);
            sb2.append("), types (");
            throw new IllegalArgumentException(a.b.f(oVarArr.length, ")", sb2));
        }
    }

    public static r create(Class<?> cls, List<jc.o> list) {
        jc.o[] oVarArr = f12177h;
        if (list != null && !list.isEmpty()) {
            oVarArr = (jc.o[]) list.toArray(oVarArr);
        }
        return create(cls, oVarArr);
    }

    public static r createIfNeeded(Class<?> cls, jc.o oVar) {
        TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
        int length = typeParameters == null ? 0 : typeParameters.length;
        if (length == 0) {
            return f12178i;
        }
        if (length == 1) {
            return new r(new String[]{typeParameters[0].getName()}, new jc.o[]{oVar}, null);
        }
        throw new IllegalArgumentException("Cannot create TypeBindings for class " + cls.getName() + " with 1 type parameter: class expects " + length);
    }

    public static r emptyBindings() {
        return f12178i;
    }

    public Object asKey(Class<?> cls) {
        jc.o[] oVarArr = this.f12180c;
        for (jc.o oVar : oVarArr) {
            if (oVar instanceof f) {
                return null;
            }
        }
        return new p(cls, oVarArr, this.f12182f);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!dd.i.hasClass(obj, r.class)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f12182f == rVar.f12182f && Arrays.equals(this.f12180c, rVar.f12180c);
    }

    public jc.o findBoundType(String str) {
        jc.o selfReferencedType;
        String[] strArr = this.f12179b;
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(strArr[i10])) {
                jc.o oVar = this.f12180c[i10];
                return (!(oVar instanceof m) || (selfReferencedType = ((m) oVar).getSelfReferencedType()) == null) ? oVar : selfReferencedType;
            }
        }
        return null;
    }

    public String getBoundName(int i10) {
        if (i10 < 0) {
            return null;
        }
        String[] strArr = this.f12179b;
        if (i10 >= strArr.length) {
            return null;
        }
        return strArr[i10];
    }

    public jc.o getBoundType(int i10) {
        if (i10 < 0) {
            return null;
        }
        jc.o[] oVarArr = this.f12180c;
        if (i10 >= oVarArr.length) {
            return null;
        }
        jc.o oVar = oVarArr[i10];
        return oVar == null ? s.unknownType() : oVar;
    }

    public jc.o getBoundTypeOrNull(int i10) {
        if (i10 < 0) {
            return null;
        }
        jc.o[] oVarArr = this.f12180c;
        if (i10 >= oVarArr.length) {
            return null;
        }
        return oVarArr[i10];
    }

    public List<jc.o> getTypeParameters() {
        jc.o[] oVarArr = this.f12180c;
        if (oVarArr.length == 0) {
            return Collections.EMPTY_LIST;
        }
        List<jc.o> listAsList = Arrays.asList(oVarArr);
        if (!listAsList.contains(null)) {
            return listAsList;
        }
        ArrayList arrayList = new ArrayList(listAsList);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (arrayList.get(i10) == null) {
                arrayList.set(i10, s.unknownType());
            }
        }
        return arrayList;
    }

    public boolean hasUnbound(String str) {
        String[] strArr = this.f12181e;
        if (strArr == null) {
            return false;
        }
        int length = strArr.length;
        do {
            length--;
            if (length < 0) {
                return false;
            }
        } while (!str.equals(strArr[length]));
        return true;
    }

    public int hashCode() {
        return this.f12182f;
    }

    public boolean isEmpty() {
        return this.f12180c.length == 0;
    }

    public int size() {
        return this.f12180c.length;
    }

    public String toString() {
        jc.o[] oVarArr = this.f12180c;
        if (oVarArr.length == 0) {
            return "<>";
        }
        StringBuilder sb2 = new StringBuilder("<");
        int length = oVarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 > 0) {
                sb2.append(AbstractJsonLexerKt.COMMA);
            }
            jc.o oVar = oVarArr[i10];
            if (oVar == null) {
                sb2.append("?");
            } else {
                sb2.append(oVar.getGenericSignature());
            }
        }
        sb2.append('>');
        return sb2.toString();
    }

    public r withUnboundVariable(String str) {
        String[] strArr = this.f12181e;
        int length = strArr == null ? 0 : strArr.length;
        String[] strArr2 = length == 0 ? new String[1] : (String[]) Arrays.copyOf(strArr, length + 1);
        strArr2[length] = str;
        return new r(this.f12179b, this.f12180c, strArr2);
    }

    public r withoutVariable(String str) {
        String[] strArr = this.f12179b;
        int iIndexOf = Arrays.asList(strArr).indexOf(str);
        if (iIndexOf == -1) {
            return this;
        }
        jc.o[] oVarArr = (jc.o[]) this.f12180c.clone();
        oVarArr[iIndexOf] = null;
        return new r(strArr, oVarArr, this.f12181e);
    }

    public static r create(Class<?> cls, jc.o[] oVarArr) {
        String[] strArr;
        if (oVarArr == null) {
            oVarArr = f12177h;
        } else {
            int length = oVarArr.length;
            if (length == 1) {
                return create(cls, oVarArr[0]);
            }
            if (length == 2) {
                return create(cls, oVarArr[0], oVarArr[1]);
            }
        }
        TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
        if (typeParameters != null && typeParameters.length != 0) {
            int length2 = typeParameters.length;
            strArr = new String[length2];
            for (int i10 = 0; i10 < length2; i10++) {
                strArr[i10] = typeParameters[i10].getName();
            }
        } else {
            strArr = f12176g;
        }
        if (strArr.length != oVarArr.length) {
            StringBuilder sb2 = new StringBuilder("Cannot create TypeBindings for class ");
            a.b.z(cls, sb2, " with ");
            sb2.append(oVarArr.length);
            sb2.append(" type parameter");
            sb2.append(oVarArr.length == 1 ? "" : ApsMetricsDataMap.APSMETRICS_FIELD_SDK);
            sb2.append(": class expects ");
            sb2.append(strArr.length);
            throw new IllegalArgumentException(sb2.toString());
        }
        return new r(strArr, oVarArr, null);
    }

    public static r createIfNeeded(Class<?> cls, jc.o[] oVarArr) {
        TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
        if (typeParameters != null && typeParameters.length != 0) {
            if (oVarArr == null) {
                oVarArr = f12177h;
            }
            int length = typeParameters.length;
            String[] strArr = new String[length];
            for (int i10 = 0; i10 < length; i10++) {
                strArr[i10] = typeParameters[i10].getName();
            }
            if (length != oVarArr.length) {
                StringBuilder sb2 = new StringBuilder("Cannot create TypeBindings for class ");
                a.b.z(cls, sb2, " with ");
                sb2.append(oVarArr.length);
                sb2.append(" type parameter");
                sb2.append(oVarArr.length == 1 ? "" : ApsMetricsDataMap.APSMETRICS_FIELD_SDK);
                sb2.append(": class expects ");
                sb2.append(length);
                throw new IllegalArgumentException(sb2.toString());
            }
            return new r(strArr, oVarArr, null);
        }
        return f12178i;
    }

    public static r create(Class<?> cls, jc.o oVar) {
        TypeVariable<?>[] typeVariableArrParamsFor1 = q.paramsFor1(cls);
        int length = typeVariableArrParamsFor1 == null ? 0 : typeVariableArrParamsFor1.length;
        if (length == 1) {
            return new r(new String[]{typeVariableArrParamsFor1[0].getName()}, new jc.o[]{oVar}, null);
        }
        throw new IllegalArgumentException("Cannot create TypeBindings for class " + cls.getName() + " with 1 type parameter: class expects " + length);
    }

    public static r create(Class<?> cls, jc.o oVar, jc.o oVar2) {
        TypeVariable<?>[] typeVariableArrParamsFor2 = q.paramsFor2(cls);
        int length = typeVariableArrParamsFor2 == null ? 0 : typeVariableArrParamsFor2.length;
        if (length == 2) {
            return new r(new String[]{typeVariableArrParamsFor2[0].getName(), typeVariableArrParamsFor2[1].getName()}, new jc.o[]{oVar, oVar2}, null);
        }
        throw new IllegalArgumentException("Cannot create TypeBindings for class " + cls.getName() + " with 2 type parameters: class expects " + length);
    }

    public static r create(List<String> list, List<jc.o> list2) {
        if (list != null && !list.isEmpty() && list2 != null && !list2.isEmpty()) {
            return new r((String[]) list.toArray(f12176g), (jc.o[]) list2.toArray(f12177h), null);
        }
        return f12178i;
    }
}
