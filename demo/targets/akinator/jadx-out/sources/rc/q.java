package rc;

import com.ironsource.C3191e4;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Type;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class q extends l {

    /* renamed from: e, reason: collision with root package name */
    public final r f84245e;

    /* renamed from: f, reason: collision with root package name */
    public final jc.o f84246f;

    /* renamed from: g, reason: collision with root package name */
    public final int f84247g;

    public q(r rVar, jc.o oVar, g1 g1Var, a0 a0Var, int i10) {
        super(g1Var, a0Var);
        this.f84245e = rVar;
        this.f84246f = oVar;
        this.f84247g = i10;
    }

    @Override // rc.b
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!dd.i.hasClass(obj, q.class)) {
            return false;
        }
        q qVar = (q) obj;
        return qVar.f84245e.equals(this.f84245e) && qVar.f84247g == this.f84247g;
    }

    @Override // rc.b
    public AnnotatedElement getAnnotated() {
        return null;
    }

    @Override // rc.l
    public Class<?> getDeclaringClass() {
        return this.f84245e.getDeclaringClass();
    }

    public int getIndex() {
        return this.f84247g;
    }

    @Override // rc.l
    public Member getMember() {
        return this.f84245e.getMember();
    }

    @Override // rc.b
    public int getModifiers() {
        return this.f84245e.getModifiers();
    }

    @Override // rc.b
    public String getName() {
        return "";
    }

    public r getOwner() {
        return this.f84245e;
    }

    public Type getParameterType() {
        return this.f84246f;
    }

    @Override // rc.b
    public Class<?> getRawType() {
        return this.f84246f.getRawClass();
    }

    @Override // rc.b
    public jc.o getType() {
        return this.f84246f;
    }

    @Override // rc.l
    public Object getValue(Object obj) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Cannot call getValue() on constructor parameter of ".concat(getDeclaringClass().getName()));
    }

    @Override // rc.b
    public int hashCode() {
        return this.f84245e.hashCode() + this.f84247g;
    }

    @Override // rc.l
    public void setValue(Object obj, Object obj2) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Cannot call setValue() on constructor parameter of ".concat(getDeclaringClass().getName()));
    }

    @Override // rc.b
    public String toString() {
        return "[parameter #" + getIndex() + ", annotations: " + this.f84221c + C3191e4.i.f36531e;
    }

    @Override // rc.l
    public q withAnnotations(a0 a0Var) {
        if (a0Var == this.f84221c) {
            return this;
        }
        r rVar = this.f84245e;
        a0[] a0VarArr = rVar.f84248e;
        int i10 = this.f84247g;
        a0VarArr[i10] = a0Var;
        return rVar.getParameter(i10);
    }
}
