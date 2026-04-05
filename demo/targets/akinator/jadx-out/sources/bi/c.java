package bi;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f9544a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f9545b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f9546c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9547d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9548e;

    /* renamed from: f, reason: collision with root package name */
    public final i f9549f;

    /* renamed from: g, reason: collision with root package name */
    public final Set f9550g;

    public c(String str, Set set, Set set2, int i10, int i11, i iVar, Set set3) {
        this.f9544a = str;
        this.f9545b = Collections.unmodifiableSet(set);
        this.f9546c = Collections.unmodifiableSet(set2);
        this.f9547d = i10;
        this.f9548e = i11;
        this.f9549f = iVar;
        this.f9550g = Collections.unmodifiableSet(set3);
    }

    public static <T> b builder(Class<T> cls) {
        return new b(cls, new Class[0]);
    }

    public static <T> c intoSet(T t10, Class<T> cls) {
        return intoSetBuilder(cls).factory(new a(t10, 0)).build();
    }

    public static <T> b intoSetBuilder(Class<T> cls) {
        b bVarBuilder = builder(cls);
        bVarBuilder.f9539e = 1;
        return bVarBuilder;
    }

    @Deprecated
    public static <T> c of(Class<T> cls, T t10) {
        return builder(cls).factory(new a(t10, 0)).build();
    }

    public Set<q> getDependencies() {
        return this.f9546c;
    }

    public i getFactory() {
        return this.f9549f;
    }

    public String getName() {
        return this.f9544a;
    }

    public Set<b0> getProvidedInterfaces() {
        return this.f9545b;
    }

    public Set<Class<?>> getPublishedEvents() {
        return this.f9550g;
    }

    public boolean isAlwaysEager() {
        return this.f9547d == 1;
    }

    public boolean isEagerInDefaultApp() {
        return this.f9547d == 2;
    }

    public boolean isLazy() {
        return this.f9547d == 0;
    }

    public boolean isValue() {
        return this.f9548e == 0;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f9545b.toArray()) + ">{" + this.f9547d + ", type=" + this.f9548e + ", deps=" + Arrays.toString(this.f9546c.toArray()) + "}";
    }

    public c withFactory(i iVar) {
        return new c(this.f9544a, this.f9545b, this.f9546c, this.f9547d, this.f9548e, iVar, this.f9550g);
    }

    @SafeVarargs
    public static <T> b builder(Class<T> cls, Class<? super T>... clsArr) {
        return new b(cls, clsArr);
    }

    public static <T> c intoSet(T t10, b0 b0Var) {
        return intoSetBuilder(b0Var).factory(new a(t10, 0)).build();
    }

    @SafeVarargs
    public static <T> c of(T t10, Class<T> cls, Class<? super T>... clsArr) {
        return builder(cls, clsArr).factory(new a(t10, 0)).build();
    }

    public static <T> b builder(b0 b0Var) {
        return new b(b0Var, new b0[0]);
    }

    public static <T> b intoSetBuilder(b0 b0Var) {
        b bVarBuilder = builder(b0Var);
        bVarBuilder.f9539e = 1;
        return bVarBuilder;
    }

    @SafeVarargs
    public static <T> c of(T t10, b0 b0Var, b0... b0VarArr) {
        return builder(b0Var, b0VarArr).factory(new a(t10, 0)).build();
    }

    @SafeVarargs
    public static <T> b builder(b0 b0Var, b0... b0VarArr) {
        return new b(b0Var, b0VarArr);
    }
}
