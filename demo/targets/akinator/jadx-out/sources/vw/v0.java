package vw;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.LinkedList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class v0 implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedList f90143a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedList f90144b;

    /* renamed from: c, reason: collision with root package name */
    public final Annotation[] f90145c;

    /* renamed from: d, reason: collision with root package name */
    public final uw.c f90146d;

    /* renamed from: e, reason: collision with root package name */
    public final uw.c f90147e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f90148f;

    /* renamed from: g, reason: collision with root package name */
    public final String f90149g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f90150h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f90151i;

    public v0(Class cls) {
        this(cls, null);
    }

    @Override // vw.t0
    public uw.c getAccess() {
        uw.c cVar = this.f90146d;
        return cVar != null ? cVar : this.f90147e;
    }

    @Override // vw.t0
    public Annotation[] getAnnotations() {
        return this.f90145c;
    }

    @Override // vw.t0
    public Constructor[] getConstructors() {
        return this.f90148f.getDeclaredConstructors();
    }

    @Override // vw.t0
    public List<u1> getFields() {
        return this.f90144b;
    }

    @Override // vw.t0
    public List<p2> getMethods() {
        return this.f90143a;
    }

    @Override // vw.t0
    public String getName() {
        return this.f90149g;
    }

    @Override // vw.t0
    public uw.k getNamespace() {
        return null;
    }

    @Override // vw.t0
    public uw.l getNamespaceList() {
        return null;
    }

    @Override // vw.t0
    public uw.m getOrder() {
        return null;
    }

    @Override // vw.t0
    public uw.c getOverride() {
        return this.f90146d;
    }

    @Override // vw.t0
    public uw.o getRoot() {
        return null;
    }

    @Override // vw.t0
    public Class getSuper() {
        Class superclass = this.f90148f.getSuperclass();
        if (superclass == Object.class) {
            return null;
        }
        return superclass;
    }

    @Override // vw.t0
    public Class getType() {
        return this.f90148f;
    }

    @Override // vw.t0
    public boolean isInstantiable() {
        if (Modifier.isStatic(this.f90148f.getModifiers())) {
            return true;
        }
        return !r0.isMemberClass();
    }

    @Override // vw.t0
    public boolean isPrimitive() {
        return this.f90148f.isPrimitive();
    }

    @Override // vw.t0
    public boolean isRequired() {
        return this.f90150h;
    }

    @Override // vw.t0
    public boolean isStrict() {
        return this.f90151i;
    }

    public String toString() {
        return this.f90148f.toString();
    }

    public v0(Class cls, uw.c cVar) throws SecurityException {
        this.f90143a = new LinkedList();
        this.f90144b = new LinkedList();
        this.f90145c = cls.getDeclaredAnnotations();
        this.f90146d = cVar;
        this.f90151i = true;
        this.f90148f = cls;
        for (Method method : cls.getDeclaredMethods()) {
            this.f90143a.add(new p2(method));
        }
        for (Field field : cls.getDeclaredFields()) {
            this.f90144b.add(new u1(field));
        }
        for (Annotation annotation : this.f90145c) {
            if (annotation instanceof uw.o) {
                uw.o oVar = (uw.o) annotation;
                String simpleName = this.f90148f.getSimpleName();
                String strName = oVar.name();
                strName = strName.length() == 0 ? b4.getName(simpleName) : strName;
                this.f90151i = oVar.strict();
                this.f90149g = strName;
            }
            if (annotation instanceof uw.b) {
                uw.b bVar = (uw.b) annotation;
                this.f90150h = bVar.required();
                this.f90147e = bVar.value();
            }
        }
    }
}
