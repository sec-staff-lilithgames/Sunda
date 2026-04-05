package kotlinx.serialization.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.reflect.KClass;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.SerialDescriptorForNullable;
import kotlinx.serialization.modules.SerialModuleImpl;
import kotlinx.serialization.modules.SerializersModule;
import uu.p0;
import uu.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ContextAwareKt {
    public static final KClass<?> getCapturedKClass(SerialDescriptor serialDescriptor) {
        e0.checkNotNullParameter(serialDescriptor, "<this>");
        if (serialDescriptor instanceof ContextDescriptor) {
            return ((ContextDescriptor) serialDescriptor).kClass;
        }
        if (serialDescriptor instanceof SerialDescriptorForNullable) {
            return getCapturedKClass(((SerialDescriptorForNullable) serialDescriptor).getOriginal$kotlinx_serialization_core());
        }
        return null;
    }

    @ExperimentalSerializationApi
    public static final SerialDescriptor getContextualDescriptor(SerializersModule serializersModule, SerialDescriptor descriptor) {
        KSerializer contextual$default;
        e0.checkNotNullParameter(serializersModule, "<this>");
        e0.checkNotNullParameter(descriptor, "descriptor");
        KClass<?> capturedKClass = getCapturedKClass(descriptor);
        if (capturedKClass == null || (contextual$default = SerializersModule.getContextual$default(serializersModule, capturedKClass, null, 2, null)) == null) {
            return null;
        }
        return contextual$default.getDescriptor();
    }

    @ExperimentalSerializationApi
    public static final List<SerialDescriptor> getPolymorphicDescriptors(SerializersModule serializersModule, SerialDescriptor descriptor) {
        e0.checkNotNullParameter(serializersModule, "<this>");
        e0.checkNotNullParameter(descriptor, "descriptor");
        KClass<?> capturedKClass = getCapturedKClass(descriptor);
        if (capturedKClass == null) {
            return p0.emptyList();
        }
        Map<KClass<?>, KSerializer<?>> map = ((SerialModuleImpl) serializersModule).polyBase2Serializers.get(capturedKClass);
        List listValues = map != null ? map.values() : null;
        if (listValues == null) {
            listValues = p0.emptyList();
        }
        Collection<KSerializer<?>> collection = listValues;
        ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((KSerializer) it.next()).getDescriptor());
        }
        return arrayList;
    }

    public static final SerialDescriptor withContext(SerialDescriptor serialDescriptor, KClass<?> context) {
        e0.checkNotNullParameter(serialDescriptor, "<this>");
        e0.checkNotNullParameter(context, "context");
        return new ContextDescriptor(serialDescriptor, context);
    }

    @ExperimentalSerializationApi
    public static /* synthetic */ void getCapturedKClass$annotations(SerialDescriptor serialDescriptor) {
    }
}
