package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class KTypeWrapper implements KType {
    private final KType origin;

    public KTypeWrapper(KType origin) {
        e0.checkNotNullParameter(origin, "origin");
        this.origin = origin;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        KType kType = this.origin;
        KTypeWrapper kTypeWrapper = obj instanceof KTypeWrapper ? (KTypeWrapper) obj : null;
        if (!e0.areEqual(kType, kTypeWrapper != null ? kTypeWrapper.origin : null)) {
            return false;
        }
        KClassifier classifier = getClassifier();
        if (classifier instanceof KClass) {
            KType kType2 = obj instanceof KType ? (KType) obj : null;
            KClassifier classifier2 = kType2 != null ? kType2.getClassifier() : null;
            if (classifier2 != null && (classifier2 instanceof KClass)) {
                return e0.areEqual(jv.a.getJavaClass((KClass) classifier), jv.a.getJavaClass((KClass) classifier2));
            }
        }
        return false;
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public List<Annotation> getAnnotations() {
        return this.origin.getAnnotations();
    }

    @Override // kotlin.reflect.KType
    public List<KTypeProjection> getArguments() {
        return this.origin.getArguments();
    }

    @Override // kotlin.reflect.KType
    public KClassifier getClassifier() {
        return this.origin.getClassifier();
    }

    public int hashCode() {
        return this.origin.hashCode();
    }

    @Override // kotlin.reflect.KType
    public boolean isMarkedNullable() {
        return this.origin.isMarkedNullable();
    }

    public String toString() {
        return "KTypeWrapper: " + this.origin;
    }
}
