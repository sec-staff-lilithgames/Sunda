package kotlinx.serialization.internal;

import b3.h;
import j1.o2;
import kotlin.jvm.internal.e0;
import kotlin.reflect.KClass;
import kotlinx.serialization.SerializationException;
import tu.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class AbstractPolymorphicSerializerKt {
    public static final Void throwSubtypeNotRegistered(String str, KClass<?> baseClass) {
        String string;
        e0.checkNotNullParameter(baseClass, "baseClass");
        String str2 = "in the polymorphic scope of '" + baseClass.getSimpleName() + '\'';
        if (str == null) {
            string = o2.f('.', "Class discriminator was missing and no default serializers were registered ", str2);
        } else {
            StringBuilder sbB = h.b("Serializer for subclass '", str, "' is not found ", str2, ".\nCheck if class with serial name '");
            com.google.android.gms.internal.play_billing.a.B(sbB, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            sbB.append(baseClass.getSimpleName());
            sbB.append("' has to be sealed and '@Serializable'.");
            string = sbB.toString();
        }
        throw new SerializationException(string);
    }

    public static final Void throwSubtypeNotRegistered(KClass<?> subClass, KClass<?> baseClass) {
        e0.checkNotNullParameter(subClass, "subClass");
        e0.checkNotNullParameter(baseClass, "baseClass");
        String simpleName = subClass.getSimpleName();
        if (simpleName == null) {
            simpleName = String.valueOf(subClass);
        }
        throwSubtypeNotRegistered(simpleName, baseClass);
        throw new k();
    }
}
