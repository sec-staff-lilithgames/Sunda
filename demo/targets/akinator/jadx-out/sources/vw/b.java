package vw;

import com.ironsource.G5;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class b implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final s f89686a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f89687b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f89688c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f89689d;

    public b(Class cls) {
        this(cls, true);
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        String name = method.getName();
        if (name.equals("toString")) {
            return toString();
        }
        if (!name.equals("equals")) {
            return name.equals("annotationType") ? this.f89687b : name.equals("required") ? Boolean.valueOf(this.f89689d) : name.equals("attribute") ? Boolean.valueOf(this.f89688c) : method.getDefaultValue();
        }
        Annotation annotation = (Annotation) obj;
        Annotation annotation2 = (Annotation) objArr[0];
        if (annotation.annotationType() == annotation2.annotationType()) {
            return Boolean.valueOf(this.f89686a.equals(annotation, annotation2));
        }
        throw new p3("Annotation %s is not the same as %s", annotation, annotation2);
    }

    public String toString() throws SecurityException {
        StringBuilder sb2 = new StringBuilder();
        Class cls = this.f89687b;
        if (cls != null) {
            String name = cls.getName();
            sb2.append('@');
            sb2.append(name);
            sb2.append('(');
            Method[] declaredMethods = cls.getDeclaredMethods();
            for (int i10 = 0; i10 < declaredMethods.length; i10++) {
                String name2 = declaredMethods[i10].getName();
                Method method = declaredMethods[i10];
                String name3 = method.getName();
                Object objValueOf = name3.equals("required") ? Boolean.valueOf(this.f89689d) : name3.equals("attribute") ? Boolean.valueOf(this.f89688c) : method.getDefaultValue();
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(name2);
                sb2.append(G5.T);
                sb2.append(objValueOf);
            }
            sb2.append(')');
        }
        return sb2.toString();
    }

    public b(Class cls, boolean z10) {
        this(cls, z10, false);
    }

    public b(Class cls, boolean z10, boolean z11) {
        this.f89686a = new s();
        this.f89688c = z11;
        this.f89689d = z10;
        this.f89687b = cls;
    }
}
