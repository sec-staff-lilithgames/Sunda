package kotlin.reflect;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class KClassesImplKt {
    public static final String getQualifiedOrSimpleName(KClass<?> kClass) {
        e0.checkNotNullParameter(kClass, "<this>");
        return kClass.getQualifiedName();
    }
}
