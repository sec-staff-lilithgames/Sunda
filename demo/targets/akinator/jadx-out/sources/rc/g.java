package rc;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g extends r {

    /* renamed from: f, reason: collision with root package name */
    public final Constructor f84187f;

    public g(g1 g1Var, Constructor<?> constructor, a0 a0Var, a0[] a0VarArr) {
        super(g1Var, a0Var, a0VarArr);
        Objects.requireNonNull(constructor);
        this.f84187f = constructor;
    }

    @Override // rc.r
    public final Object call() throws Exception {
        return this.f84187f.newInstance(null);
    }

    @Override // rc.r
    public final Object call1(Object obj) throws Exception {
        return this.f84187f.newInstance(obj);
    }

    @Override // rc.b
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (dd.i.hasClass(obj, g.class)) {
            return Objects.equals(this.f84187f, ((g) obj).f84187f);
        }
        return false;
    }

    @Override // rc.l
    public Class<?> getDeclaringClass() {
        return this.f84187f.getDeclaringClass();
    }

    @Override // rc.r
    @Deprecated
    public Type getGenericParameterType(int i10) {
        Type[] genericParameterTypes = this.f84187f.getGenericParameterTypes();
        if (i10 >= genericParameterTypes.length) {
            return null;
        }
        return genericParameterTypes[i10];
    }

    @Override // rc.l
    public Member getMember() {
        return this.f84187f;
    }

    @Override // rc.b
    public int getModifiers() {
        return this.f84187f.getModifiers();
    }

    @Override // rc.b
    public String getName() {
        return this.f84187f.getName();
    }

    @Override // rc.r
    public int getParameterCount() {
        return this.f84187f.getParameterCount();
    }

    @Override // rc.r
    public jc.o getParameterType(int i10) {
        Type[] genericParameterTypes = this.f84187f.getGenericParameterTypes();
        if (i10 >= genericParameterTypes.length) {
            return null;
        }
        return this.f84220b.resolveType(genericParameterTypes[i10]);
    }

    @Override // rc.r
    public Class<?> getRawParameterType(int i10) {
        Class<?>[] parameterTypes = this.f84187f.getParameterTypes();
        if (i10 >= parameterTypes.length) {
            return null;
        }
        return parameterTypes[i10];
    }

    @Override // rc.b
    public Class<?> getRawType() {
        return this.f84187f.getDeclaringClass();
    }

    @Override // rc.b
    public jc.o getType() {
        return this.f84220b.resolveType(getRawType());
    }

    @Override // rc.l
    public Object getValue(Object obj) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Cannot call getValue() on constructor of ".concat(getDeclaringClass().getName()));
    }

    @Override // rc.b
    public int hashCode() {
        return Objects.hashCode(this.f84187f);
    }

    @Override // rc.l
    public void setValue(Object obj, Object obj2) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Cannot call setValue() on constructor of ".concat(getDeclaringClass().getName()));
    }

    @Override // rc.b
    public String toString() {
        Constructor constructor = this.f84187f;
        int parameterCount = constructor.getParameterCount();
        return String.format("[constructor for %s (%d arg%s), annotations: %s", dd.i.nameOf((Class<?>) constructor.getDeclaringClass()), Integer.valueOf(parameterCount), parameterCount == 1 ? "" : ApsMetricsDataMap.APSMETRICS_FIELD_SDK, this.f84221c);
    }

    @Override // rc.r
    public final Object call(Object[] objArr) throws Exception {
        return this.f84187f.newInstance(objArr);
    }

    @Override // rc.b
    public Constructor<?> getAnnotated() {
        return this.f84187f;
    }

    @Override // rc.l
    public g withAnnotations(a0 a0Var) {
        return new g(this.f84220b, this.f84187f, a0Var, this.f84248e);
    }
}
