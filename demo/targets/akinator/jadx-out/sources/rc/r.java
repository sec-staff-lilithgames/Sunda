package rc;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class r extends l {

    /* renamed from: e, reason: collision with root package name */
    public final a0[] f84248e;

    public r(g1 g1Var, a0 a0Var, a0[] a0VarArr) {
        super(g1Var, a0Var);
        this.f84248e = a0VarArr;
    }

    public final void addOrOverrideParam(int i10, Annotation annotation) {
        a0[] a0VarArr = this.f84248e;
        a0 a0Var = a0VarArr[i10];
        if (a0Var == null) {
            a0Var = new a0();
            a0VarArr[i10] = a0Var;
        }
        a0Var.add(annotation);
    }

    public abstract Object call() throws Exception;

    public abstract Object call(Object[] objArr) throws Exception;

    public abstract Object call1(Object obj) throws Exception;

    public final int getAnnotationCount() {
        return this.f84221c.size();
    }

    @Deprecated
    public abstract Type getGenericParameterType(int i10);

    public final q getParameter(int i10) {
        return new q(this, getParameterType(i10), this.f84220b, getParameterAnnotations(i10), i10);
    }

    public final a0 getParameterAnnotations(int i10) {
        a0[] a0VarArr = this.f84248e;
        if (a0VarArr == null || i10 < 0 || i10 >= a0VarArr.length) {
            return null;
        }
        return a0VarArr[i10];
    }

    public abstract int getParameterCount();

    public abstract jc.o getParameterType(int i10);

    public abstract Class<?> getRawParameterType(int i10);
}
