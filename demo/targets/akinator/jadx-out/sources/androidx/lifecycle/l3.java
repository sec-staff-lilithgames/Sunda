package androidx.lifecycle;

import kotlin.reflect.KClass;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface l3 {
    static l3 from(b5.f... fVarArr) {
        return k3.f6640a.from(fVarArr);
    }

    default <T extends g3> T create(Class<T> modelClass) {
        kotlin.jvm.internal.e0.checkNotNullParameter(modelClass, "modelClass");
        return (T) c5.h.f11812a.unsupportedCreateViewModel$lifecycle_viewmodel_release();
    }

    default <T extends g3> T create(Class<T> modelClass, b5.a extras) {
        kotlin.jvm.internal.e0.checkNotNullParameter(modelClass, "modelClass");
        kotlin.jvm.internal.e0.checkNotNullParameter(extras, "extras");
        return (T) create(modelClass);
    }

    default <T extends g3> T create(KClass<T> modelClass, b5.a extras) {
        kotlin.jvm.internal.e0.checkNotNullParameter(modelClass, "modelClass");
        kotlin.jvm.internal.e0.checkNotNullParameter(extras, "extras");
        return (T) create(jv.a.getJavaClass((KClass) modelClass), extras);
    }
}
