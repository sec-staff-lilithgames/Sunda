package kotlin.jvm.internal;

import java.util.Collection;
import kotlin.reflect.KCallable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class o0 implements r {

    /* renamed from: b, reason: collision with root package name */
    public final Class f71855b;

    public o0(Class<?> jClass, String moduleName) {
        e0.checkNotNullParameter(jClass, "jClass");
        e0.checkNotNullParameter(moduleName, "moduleName");
        this.f71855b = jClass;
    }

    public boolean equals(Object obj) {
        return (obj instanceof o0) && e0.areEqual(getJClass(), ((o0) obj).getJClass());
    }

    @Override // kotlin.jvm.internal.r
    public Class<?> getJClass() {
        return this.f71855b;
    }

    @Override // kotlin.reflect.KDeclarationContainer
    public Collection<KCallable<?>> getMembers() {
        throw new jv.b();
    }

    public int hashCode() {
        return getJClass().hashCode();
    }

    public String toString() {
        return getJClass() + " (Kotlin reflection is not available)";
    }
}
