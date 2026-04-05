package kotlinx.serialization.modules;

import kotlin.jvm.internal.e0;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class SerializerAlreadyRegisteredException extends IllegalArgumentException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SerializerAlreadyRegisteredException(String msg) {
        super(msg);
        e0.checkNotNullParameter(msg, "msg");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SerializerAlreadyRegisteredException(KClass<?> baseClass, KClass<?> concreteClass) {
        this("Serializer for " + concreteClass + " already registered in the scope of " + baseClass);
        e0.checkNotNullParameter(baseClass, "baseClass");
        e0.checkNotNullParameter(concreteClass, "concreteClass");
    }
}
