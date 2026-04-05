package vw;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public final c3 f89952a;

    /* renamed from: b, reason: collision with root package name */
    public final h0 f89953b;

    /* renamed from: c, reason: collision with root package name */
    public final w1 f89954c;

    /* renamed from: d, reason: collision with root package name */
    public final w1 f89955d;

    /* renamed from: e, reason: collision with root package name */
    public final w1 f89956e;

    /* renamed from: f, reason: collision with root package name */
    public final w1 f89957f;

    /* renamed from: g, reason: collision with root package name */
    public final w1 f89958g;

    /* renamed from: h, reason: collision with root package name */
    public final w1 f89959h;

    /* renamed from: i, reason: collision with root package name */
    public final v4 f89960i;

    public l(t0 t0Var, v4 v4Var) throws Exception {
        this.f89953b = new h0(t0Var, v4Var);
        c3 c3Var = new c3();
        this.f89952a = c3Var;
        this.f89960i = v4Var;
        uw.c override = t0Var.getOverride();
        Class type = t0Var.getType();
        while (type != null) {
            t0 detail = this.f89960i.getDetail(type, override);
            uw.l namespaceList = detail.getNamespaceList();
            uw.k namespace = detail.getNamespace();
            if (namespace != null) {
                c3Var.add(namespace);
            }
            if (namespaceList != null) {
                for (uw.k kVar : namespaceList.value()) {
                    c3Var.add(kVar);
                }
            }
            for (p2 p2Var : detail.getMethods()) {
                Annotation[] annotations = p2Var.getAnnotations();
                Method method = p2Var.getMethod();
                for (Annotation annotation : annotations) {
                    if ((annotation instanceof r) && this.f89954c == null) {
                        this.f89954c = a(method);
                    }
                    if ((annotation instanceof j5) && this.f89955d == null) {
                        this.f89955d = a(method);
                    }
                    if ((annotation instanceof o3) && this.f89956e == null) {
                        this.f89956e = a(method);
                    }
                    if ((annotation instanceof t) && this.f89957f == null) {
                        this.f89957f = a(method);
                    }
                    if ((annotation instanceof d4) && this.f89958g == null) {
                        this.f89958g = a(method);
                    }
                    if ((annotation instanceof e4) && this.f89959h == null) {
                        this.f89959h = a(method);
                    }
                }
            }
            detail.getRoot();
            detail.getOrder();
            type = detail.getSuper();
        }
        uw.k namespace2 = t0Var.getNamespace();
        if (namespace2 != null) {
            c3Var.set(namespace2);
        }
    }

    public static w1 a(Method method) throws SecurityException {
        Class<?>[] parameterTypes = method.getParameterTypes();
        boolean zEquals = parameterTypes.length == 1 ? Map.class.equals(parameterTypes[0]) : false;
        if (!method.isAccessible()) {
            method.setAccessible(true);
        }
        return new w1(method, zEquals);
    }

    public w1 getCommit() {
        return this.f89954c;
    }

    public w1 getComplete() {
        return this.f89957f;
    }

    public q0 getDecorator() {
        return this.f89952a;
    }

    public uw.m getOrder() {
        return null;
    }

    public l3 getParameters() {
        return this.f89953b.getParameters();
    }

    public w1 getPersist() {
        return this.f89956e;
    }

    public w1 getReplace() {
        return this.f89958g;
    }

    public w1 getResolve() {
        return this.f89959h;
    }

    public uw.o getRoot() {
        return null;
    }

    public o4 getSignature() {
        return this.f89953b.getSignature();
    }

    public List<o4> getSignatures() {
        return this.f89953b.getSignatures();
    }

    public w1 getValidate() {
        return this.f89955d;
    }
}
