package vw;

import com.bytedance.sdk.openadsdk.component.zz.Qnp.PtLatqAYjEFT;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class r4 {

    /* renamed from: a, reason: collision with root package name */
    public final p4 f90075a;

    /* renamed from: b, reason: collision with root package name */
    public final k3 f90076b;

    /* renamed from: c, reason: collision with root package name */
    public final l3 f90077c;

    /* renamed from: d, reason: collision with root package name */
    public final Constructor f90078d;

    /* renamed from: e, reason: collision with root package name */
    public final Class f90079e;

    public r4(Constructor constructor, l3 l3Var, v4 v4Var) throws Exception {
        this.f90075a = new p4(constructor);
        this.f90076b = new k3(v4Var);
        this.f90079e = constructor.getDeclaringClass();
        this.f90078d = constructor;
        this.f90077c = l3Var;
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        int i10 = 0;
        while (i10 < parameterTypes.length) {
            Class<?> cls = parameterTypes[i10];
            Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
            int i11 = 0;
            while (true) {
                Annotation[] annotationArr = parameterAnnotations[i10];
                if (i11 < annotationArr.length) {
                    Annotation annotation = annotationArr[i11];
                    List listA = ((annotation instanceof uw.a) || (annotation instanceof uw.d) || (annotation instanceof uw.f) || (annotation instanceof uw.e) || (annotation instanceof uw.h)) ? a(i10, annotation) : ((annotation instanceof uw.g) || (annotation instanceof uw.i) || (annotation instanceof uw.j)) ? c(i10, annotation) : annotation instanceof uw.q ? a(i10, annotation) : Collections.EMPTY_LIST;
                    Iterator it = listA.iterator();
                    while (it.hasNext()) {
                        this.f90075a.insert((i3) it.next(), i10);
                    }
                    i11++;
                }
            }
            i10++;
        }
    }

    public final List a(int i10, Annotation annotation) throws Exception {
        i3 k3Var = this.f90076b.getInstance(this.f90078d, annotation, i10);
        if (k3Var != null) {
            b(k3Var);
        }
        return Collections.singletonList(k3Var);
    }

    public final void b(i3 i3Var) throws g0 {
        String path = i3Var.getPath();
        Object key = i3Var.getKey();
        l3 l3Var = this.f90077c;
        if (l3Var.containsKey(key)) {
            d(key, i3Var);
        }
        if (l3Var.containsKey(path)) {
            d(path, i3Var);
        }
        l3Var.put(path, i3Var);
        l3Var.put(key, i3Var);
    }

    public final void d(Object obj, i3 i3Var) throws g0 {
        i3 i3Var2 = (i3) this.f90077c.get(obj);
        if (i3Var.isText() != i3Var2.isText()) {
            Annotation annotation = i3Var.getAnnotation();
            Annotation annotation2 = i3Var2.getAnnotation();
            String path = i3Var.getPath();
            boolean zEquals = annotation.equals(annotation2);
            Class cls = this.f90079e;
            if (!zEquals) {
                throw new g0("Annotations do not match for '%s' in %s", path, cls);
            }
            if (i3Var2.getType() != i3Var.getType()) {
                throw new g0("Parameter types do not match for '%s' in %s", path, cls);
            }
        }
    }

    public List<o4> getSignatures() throws Exception {
        return this.f90075a.build();
    }

    public boolean isValid() {
        return this.f90075a.isValid();
    }

    public final List c(int i10, Annotation annotation) throws Exception {
        Constructor constructor = this.f90078d;
        o4 o4Var = new o4(constructor);
        Method[] declaredMethods = annotation.annotationType().getDeclaredMethods();
        int length = declaredMethods.length;
        Class cls = this.f90079e;
        if (length != 1) {
            throw new i5("Annotation '%s' is not a valid union for %s", annotation, cls);
        }
        for (Annotation annotation2 : (Annotation[]) declaredMethods[0].invoke(annotation, null)) {
            i3 k3Var = this.f90076b.getInstance(constructor, annotation, annotation2, i10);
            String path = k3Var.getPath();
            if (o4Var.contains(path)) {
                throw new i5(PtLatqAYjEFT.QqebHATdWH, path, annotation, cls);
            }
            o4Var.set(path, k3Var);
            b(k3Var);
        }
        return o4Var.getAll();
    }
}
