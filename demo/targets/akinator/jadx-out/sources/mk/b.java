package mk;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Map f74747a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f74748b;

    /* renamed from: c, reason: collision with root package name */
    public final List f74749c;

    public b(Map<Type, Object> map, boolean z10, List<com.google.gson.b0> list) {
        this.f74747a = map;
        this.f74748b = z10;
        this.f74749c = list;
    }

    public static String a(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + e0.createUrl("r8-abstract-class");
    }

    public <T> u get(pk.a<T> aVar) {
        return get(aVar, true);
    }

    public String toString() {
        return this.f74747a.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> mk.u get(pk.a<T> r8, boolean r9) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mk.b.get(pk.a, boolean):mk.u");
    }
}
