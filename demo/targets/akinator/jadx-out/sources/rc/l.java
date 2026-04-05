package rc;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Member;
import java.util.Collections;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class l extends b implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final transient g1 f84220b;

    /* renamed from: c, reason: collision with root package name */
    public final transient a0 f84221c;

    public l(g1 g1Var, a0 a0Var) {
        this.f84220b = g1Var;
        this.f84221c = a0Var;
    }

    @Override // rc.b
    @Deprecated
    public Iterable<Annotation> annotations() {
        a0 a0Var = this.f84221c;
        return a0Var == null ? Collections.EMPTY_LIST : a0Var.annotations();
    }

    public final void fixAccess(boolean z10) {
        Member member = getMember();
        if (member != null) {
            dd.i.checkAndFixAccess(member, z10);
        }
    }

    public a0 getAllAnnotations() {
        return this.f84221c;
    }

    @Override // rc.b
    public final <A extends Annotation> A getAnnotation(Class<A> cls) {
        a0 a0Var = this.f84221c;
        if (a0Var == null) {
            return null;
        }
        return (A) a0Var.get(cls);
    }

    public abstract Class<?> getDeclaringClass();

    public String getFullName() {
        return getDeclaringClass().getName() + "#" + getName();
    }

    public abstract Member getMember();

    @Deprecated
    public g1 getTypeContext() {
        return this.f84220b;
    }

    public abstract Object getValue(Object obj) throws UnsupportedOperationException, IllegalArgumentException;

    @Override // rc.b
    public final boolean hasAnnotation(Class<?> cls) {
        a0 a0Var = this.f84221c;
        if (a0Var == null) {
            return false;
        }
        return a0Var.has(cls);
    }

    @Override // rc.b
    public boolean hasOneOf(Class<? extends Annotation>[] clsArr) {
        a0 a0Var = this.f84221c;
        if (a0Var == null) {
            return false;
        }
        return a0Var.hasOneOf(clsArr);
    }

    public abstract void setValue(Object obj, Object obj2) throws UnsupportedOperationException, IllegalArgumentException;

    public abstract b withAnnotations(a0 a0Var);
}
