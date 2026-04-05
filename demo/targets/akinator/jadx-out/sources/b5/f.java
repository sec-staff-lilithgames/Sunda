package b5;

import androidx.lifecycle.g3;
import kotlin.jvm.internal.e0;
import kotlin.reflect.KClass;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final KClass f8752a;

    /* renamed from: b, reason: collision with root package name */
    public final l f8753b;

    public f(KClass<g3> clazz, l initializer) {
        e0.checkNotNullParameter(clazz, "clazz");
        e0.checkNotNullParameter(initializer, "initializer");
        this.f8752a = clazz;
        this.f8753b = initializer;
    }

    public final KClass<g3> getClazz$lifecycle_viewmodel_release() {
        return this.f8752a;
    }

    public final l getInitializer$lifecycle_viewmodel_release() {
        return this.f8753b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(Class<g3> clazz, l initializer) {
        this((KClass<g3>) jv.a.getKotlinClass(clazz), initializer);
        e0.checkNotNullParameter(clazz, "clazz");
        e0.checkNotNullParameter(initializer, "initializer");
    }
}
