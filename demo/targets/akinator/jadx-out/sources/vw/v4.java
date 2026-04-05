package vw;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class v4 implements ww.b {

    /* renamed from: a, reason: collision with root package name */
    public final b2 f90163a;

    /* renamed from: b, reason: collision with root package name */
    public final i4 f90164b;

    /* renamed from: c, reason: collision with root package name */
    public final u0 f90165c;

    /* renamed from: d, reason: collision with root package name */
    public final u0 f90166d;

    /* renamed from: e, reason: collision with root package name */
    public final j2 f90167e;

    /* renamed from: f, reason: collision with root package name */
    public final zw.j0 f90168f;

    /* renamed from: g, reason: collision with root package name */
    public final zw.a0 f90169g;

    /* renamed from: h, reason: collision with root package name */
    public final ww.b f90170h;

    /* renamed from: i, reason: collision with root package name */
    public final yw.j f90171i;

    public v4() {
        this(new ww.d());
    }

    public static Class getPrimitive(Class cls) {
        return cls == Double.TYPE ? Double.class : cls == Float.TYPE ? Float.class : cls == Integer.TYPE ? Integer.class : cls == Long.TYPE ? Long.class : cls == Boolean.TYPE ? Boolean.class : cls == Character.TYPE ? Character.class : cls == Short.TYPE ? Short.class : cls == Byte.TYPE ? Byte.class : cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean isAssignable(Class cls, Class cls2) {
        if (cls.isPrimitive()) {
            cls = getPrimitive(cls);
        }
        boolean zIsPrimitive = cls2.isPrimitive();
        Class primitive = cls2;
        if (zIsPrimitive) {
            primitive = getPrimitive(cls2);
        }
        return primitive.isAssignableFrom(cls);
    }

    public static boolean isFloat(Class cls) throws Exception {
        return cls == Double.class || cls == Float.class || cls == Float.TYPE || cls == Double.TYPE;
    }

    public t0 getDetail(Class cls) {
        return getDetail(cls, null);
    }

    public j0 getFields(Class cls) throws Exception {
        return getFields(cls, null);
    }

    public yw.j getFormat() {
        return this.f90171i;
    }

    public a2 getInstance(xw.g gVar) {
        return this.f90163a.getInstance(gVar);
    }

    public i2 getLabel(i0 i0Var, Annotation annotation) throws Exception {
        return this.f90167e.getLabel(i0Var, annotation);
    }

    public List<i2> getLabels(i0 i0Var, Annotation annotation) throws Exception {
        return this.f90167e.getList(i0Var, annotation);
    }

    public j0 getMethods(Class cls) throws Exception {
        return getMethods(cls, null);
    }

    public String getName(Class cls) throws Exception {
        String name = getScanner(cls).getName();
        if (name != null) {
            return name;
        }
        if (cls.isArray()) {
            cls = cls.getComponentType();
        }
        String simpleName = cls.getSimpleName();
        return cls.isPrimitive() ? simpleName : b4.getName(simpleName);
    }

    public h4 getScanner(Class cls) throws Exception {
        return this.f90164b.getInstance(cls);
    }

    public yw.t0 getStyle() {
        return this.f90171i.getStyle();
    }

    public zw.h0 getTransform(Class cls) throws Exception {
        return this.f90169g.match(cls);
    }

    public boolean isContainer(Class cls) {
        if (Collection.class.isAssignableFrom(cls) || Map.class.isAssignableFrom(cls)) {
            return true;
        }
        return cls.isArray();
    }

    public boolean isPrimitive(Class cls) throws Exception {
        if (cls == String.class || cls == Float.class || cls == Double.class || cls == Long.class || cls == Integer.class || cls == Boolean.class || cls.isEnum() || cls.isPrimitive()) {
            return true;
        }
        return this.f90168f.valid(cls);
    }

    public Object read(String str, Class cls) throws Exception {
        return this.f90168f.read(str, cls);
    }

    @Override // ww.b
    public String replace(String str) {
        return this.f90170h.replace(str);
    }

    public boolean valid(Class cls) throws Exception {
        return this.f90168f.valid(cls);
    }

    public String write(Object obj, Class cls) throws Exception {
        return this.f90168f.write(obj, cls);
    }

    public v4(ww.b bVar) {
        this(bVar, new m1());
    }

    public t0 getDetail(Class cls, uw.c cVar) {
        return cVar != null ? this.f90165c.getDetail(cls) : this.f90166d.getDetail(cls);
    }

    public j0 getFields(Class cls, uw.c cVar) throws Exception {
        return cVar != null ? this.f90165c.getFields(cls) : this.f90166d.getFields(cls);
    }

    public a2 getInstance(Class cls) {
        return this.f90163a.getInstance(cls);
    }

    public j0 getMethods(Class cls, uw.c cVar) throws Exception {
        return cVar != null ? this.f90165c.getMethods(cls) : this.f90166d.getMethods(cls);
    }

    public v4(ww.b bVar, zw.a0 a0Var) {
        this(bVar, a0Var, new yw.j());
    }

    public v4(ww.b bVar, zw.a0 a0Var, yw.j jVar) {
        this.f90165c = new u0(this, uw.c.f88806b);
        this.f90168f = new zw.j0(a0Var);
        this.f90164b = new i4(this);
        this.f90166d = new u0(this);
        this.f90167e = new j2(jVar);
        this.f90163a = new b2();
        this.f90169g = a0Var;
        this.f90170h = bVar;
        this.f90171i = jVar;
    }
}
