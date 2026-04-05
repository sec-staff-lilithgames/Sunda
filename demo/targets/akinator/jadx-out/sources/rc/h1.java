package rc;

import com.ironsource.C3191e4;
import j1.o2;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Member;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class h1 extends l implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public final Class f84196e;

    /* renamed from: f, reason: collision with root package name */
    public final jc.o f84197f;

    /* renamed from: g, reason: collision with root package name */
    public final String f84198g;

    public h1(g1 g1Var, Class<?> cls, String str, jc.o oVar) {
        super(g1Var, null);
        this.f84196e = cls;
        this.f84197f = oVar;
        this.f84198g = str;
    }

    @Override // rc.b
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!dd.i.hasClass(obj, getClass())) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return h1Var.f84196e == this.f84196e && h1Var.f84198g.equals(this.f84198g);
    }

    public int getAnnotationCount() {
        return 0;
    }

    @Override // rc.l
    public Class<?> getDeclaringClass() {
        return this.f84196e;
    }

    @Override // rc.l
    public Member getMember() {
        return null;
    }

    @Override // rc.b
    public int getModifiers() {
        return 0;
    }

    @Override // rc.b
    public String getName() {
        return this.f84198g;
    }

    @Override // rc.b
    public Class<?> getRawType() {
        return this.f84197f.getRawClass();
    }

    @Override // rc.b
    public jc.o getType() {
        return this.f84197f;
    }

    @Override // rc.l
    public Object getValue(Object obj) throws IllegalArgumentException {
        throw new IllegalArgumentException(o2.o(new StringBuilder("Cannot get virtual property '"), this.f84198g, "'"));
    }

    @Override // rc.b
    public int hashCode() {
        return this.f84198g.hashCode();
    }

    @Override // rc.l
    public void setValue(Object obj, Object obj2) throws IllegalArgumentException {
        throw new IllegalArgumentException(o2.o(new StringBuilder("Cannot set virtual property '"), this.f84198g, "'"));
    }

    @Override // rc.b
    public String toString() {
        return "[virtual " + getFullName() + C3191e4.i.f36531e;
    }

    @Override // rc.b
    public Field getAnnotated() {
        return null;
    }

    @Override // rc.l
    public b withAnnotations(a0 a0Var) {
        return this;
    }
}
