package vw;

import java.lang.annotation.Annotation;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class f2 {

    /* renamed from: a, reason: collision with root package name */
    public final Annotation f89804a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f89805b;

    /* renamed from: c, reason: collision with root package name */
    public final yw.j f89806c;

    /* renamed from: d, reason: collision with root package name */
    public final i2 f89807d;

    public f2(i0 i0Var, i2 i2Var, yw.j jVar) {
        this.f89804a = i0Var.getAnnotation();
        this.f89805b = i0Var;
        this.f89806c = jVar;
        this.f89807d = i2Var;
    }

    public i0 getContact() {
        return this.f89805b;
    }

    public xw.f getDependent() throws Exception {
        return this.f89807d.getDependent();
    }

    public String getEntry() throws Exception {
        String strName;
        Class<?> type = getDependent().getType();
        if (type.isArray()) {
            type = type.getComponentType();
        }
        Class<?> superclass = type;
        while (true) {
            strName = null;
            if (superclass == null) {
                break;
            }
            String simpleName = superclass.getSimpleName();
            uw.o oVar = (uw.o) superclass.getAnnotation(uw.o.class);
            if (oVar != null) {
                strName = oVar.name();
                if (isEmpty(strName)) {
                    strName = b4.getName(simpleName);
                }
            }
            if (strName != null) {
                break;
            }
            superclass = superclass.getSuperclass();
        }
        return strName != null ? strName : b4.getName(type.getSimpleName());
    }

    public o1 getExpression() throws Exception {
        String path = getPath();
        yw.j jVar = this.f89806c;
        return path != null ? new n3(path, this.f89805b, jVar) : new l1(jVar);
    }

    public String getName() throws Exception {
        i2 i2Var = this.f89807d;
        String entry = i2Var.getEntry();
        if (i2Var.isInline()) {
            return entry;
        }
        String override = i2Var.getOverride();
        return !isEmpty(override) ? override : this.f89805b.getName();
    }

    public String getPath() throws Exception {
        uw.n nVar = (uw.n) this.f89805b.getAnnotation(uw.n.class);
        if (nVar == null) {
            return null;
        }
        return nVar.value();
    }

    public boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

    public String toString() {
        return String.format("%s on %s", this.f89804a, this.f89805b);
    }
}
