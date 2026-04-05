package rc;

import com.ironsource.C3191e4;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i extends l implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public final transient Field f84199e;

    public i(g1 g1Var, Field field, a0 a0Var) {
        super(g1Var, a0Var);
        Objects.requireNonNull(field);
        this.f84199e = field;
    }

    @Override // rc.b
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (dd.i.hasClass(obj, i.class)) {
            return Objects.equals(this.f84199e, ((i) obj).f84199e);
        }
        return false;
    }

    public int getAnnotationCount() {
        return this.f84221c.size();
    }

    @Override // rc.l
    public Class<?> getDeclaringClass() {
        return this.f84199e.getDeclaringClass();
    }

    @Override // rc.l
    public Member getMember() {
        return this.f84199e;
    }

    @Override // rc.b
    public int getModifiers() {
        return this.f84199e.getModifiers();
    }

    @Override // rc.b
    public String getName() {
        return this.f84199e.getName();
    }

    @Override // rc.b
    public Class<?> getRawType() {
        return this.f84199e.getType();
    }

    @Override // rc.b
    public jc.o getType() {
        return this.f84220b.resolveType(this.f84199e.getGenericType());
    }

    @Override // rc.l
    public Object getValue(Object obj) throws IllegalArgumentException {
        try {
            return this.f84199e.get(obj);
        } catch (IllegalAccessException e10) {
            throw new IllegalArgumentException("Failed to getValue() for field " + getFullName() + ": " + e10.getMessage(), e10);
        }
    }

    @Override // rc.b
    public int hashCode() {
        return Objects.hashCode(this.f84199e);
    }

    public boolean isTransient() {
        return Modifier.isTransient(getModifiers());
    }

    @Override // rc.l
    public void setValue(Object obj, Object obj2) throws IllegalAccessException, IllegalArgumentException {
        try {
            this.f84199e.set(obj, obj2);
        } catch (IllegalAccessException e10) {
            throw new IllegalArgumentException("Failed to setValue() for field " + getFullName() + ": " + e10.getMessage(), e10);
        }
    }

    @Override // rc.b
    public String toString() {
        return "[field " + getFullName() + C3191e4.i.f36531e;
    }

    @Override // rc.b
    public Field getAnnotated() {
        return this.f84199e;
    }

    @Override // rc.l
    public i withAnnotations(a0 a0Var) {
        return new i(this.f84220b, this.f84199e, a0Var);
    }
}
