package rc;

import com.ironsource.C3191e4;
import j1.o2;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class m extends r implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    public final transient Method f84223f;

    /* renamed from: g, reason: collision with root package name */
    public Class[] f84224g;

    public m(g1 g1Var, Method method, a0 a0Var, a0[] a0VarArr) {
        super(g1Var, a0Var, a0VarArr);
        if (method == null) {
            throw new IllegalArgumentException("Cannot construct AnnotatedMethod with null Method");
        }
        this.f84223f = method;
    }

    @Override // rc.r
    public final Object call() throws Exception {
        return this.f84223f.invoke(null, null);
    }

    @Override // rc.r
    public final Object call1(Object obj) throws Exception {
        return this.f84223f.invoke(null, obj);
    }

    public final Object callOn(Object obj) throws Exception {
        return this.f84223f.invoke(obj, null);
    }

    public final Object callOnWith(Object obj, Object... objArr) throws Exception {
        return this.f84223f.invoke(obj, objArr);
    }

    @Override // rc.b
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (dd.i.hasClass(obj, m.class)) {
            return Objects.equals(this.f84223f, ((m) obj).f84223f);
        }
        return false;
    }

    @Override // rc.l
    public Class<?> getDeclaringClass() {
        return this.f84223f.getDeclaringClass();
    }

    @Override // rc.l
    public String getFullName() {
        String fullName = super.getFullName();
        int parameterCount = getParameterCount();
        if (parameterCount == 0) {
            return o2.l(fullName, "()");
        }
        if (parameterCount != 1) {
            return String.format("%s(%d params)", super.getFullName(), Integer.valueOf(getParameterCount()));
        }
        StringBuilder sbT = a.b.t(fullName, "(");
        sbT.append(getRawParameterType(0).getName());
        sbT.append(")");
        return sbT.toString();
    }

    @Override // rc.r
    @Deprecated
    public Type getGenericParameterType(int i10) {
        Type[] genericParameterTypes = getGenericParameterTypes();
        if (i10 >= genericParameterTypes.length) {
            return null;
        }
        return genericParameterTypes[i10];
    }

    @Deprecated
    public Type[] getGenericParameterTypes() {
        return this.f84223f.getGenericParameterTypes();
    }

    @Override // rc.b
    public int getModifiers() {
        return this.f84223f.getModifiers();
    }

    @Override // rc.b
    public String getName() {
        return this.f84223f.getName();
    }

    @Override // rc.r
    public int getParameterCount() {
        return this.f84223f.getParameterTypes().length;
    }

    @Override // rc.r
    public jc.o getParameterType(int i10) {
        Type[] genericParameterTypes = this.f84223f.getGenericParameterTypes();
        if (i10 >= genericParameterTypes.length) {
            return null;
        }
        return this.f84220b.resolveType(genericParameterTypes[i10]);
    }

    @Override // rc.r
    public Class<?> getRawParameterType(int i10) {
        Class<?>[] rawParameterTypes = getRawParameterTypes();
        if (i10 >= rawParameterTypes.length) {
            return null;
        }
        return rawParameterTypes[i10];
    }

    public Class<?>[] getRawParameterTypes() {
        if (this.f84224g == null) {
            this.f84224g = this.f84223f.getParameterTypes();
        }
        return this.f84224g;
    }

    public Class<?> getRawReturnType() {
        return this.f84223f.getReturnType();
    }

    @Override // rc.b
    public Class<?> getRawType() {
        return this.f84223f.getReturnType();
    }

    @Override // rc.b
    public jc.o getType() {
        return this.f84220b.resolveType(this.f84223f.getGenericReturnType());
    }

    @Override // rc.l
    public Object getValue(Object obj) throws IllegalArgumentException {
        try {
            return this.f84223f.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new IllegalArgumentException("Failed to getValue() with method " + getFullName() + ": " + dd.i.exceptionMessage(e10), e10);
        }
    }

    @Deprecated
    public boolean hasReturnType() {
        return getRawReturnType() != Void.TYPE;
    }

    @Override // rc.b
    public int hashCode() {
        return this.f84223f.hashCode();
    }

    @Override // rc.l
    public void setValue(Object obj, Object obj2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            this.f84223f.invoke(obj, obj2);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new IllegalArgumentException("Failed to setValue() with method " + getFullName() + ": " + dd.i.exceptionMessage(e10), e10);
        }
    }

    @Override // rc.b
    public String toString() {
        return "[method " + getFullName() + C3191e4.i.f36531e;
    }

    @Override // rc.r
    public final Object call(Object[] objArr) throws Exception {
        return this.f84223f.invoke(null, objArr);
    }

    @Override // rc.b
    public Method getAnnotated() {
        return this.f84223f;
    }

    @Override // rc.l
    public Method getMember() {
        return this.f84223f;
    }

    @Override // rc.l
    public m withAnnotations(a0 a0Var) {
        return new m(this.f84220b, this.f84223f, a0Var, this.f84248e);
    }
}
