package kotlinx.serialization.internal;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.e0;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KTypeProjection;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class Platform_commonKt {
    private static final SerialDescriptor[] EMPTY_DESCRIPTOR_ARRAY = new SerialDescriptor[0];

    public static final Set<String> cachedSerialNames(SerialDescriptor serialDescriptor) {
        e0.checkNotNullParameter(serialDescriptor, "<this>");
        if (serialDescriptor instanceof CachedNames) {
            return ((CachedNames) serialDescriptor).getSerialNames();
        }
        HashSet hashSet = new HashSet(serialDescriptor.getElementsCount());
        int elementsCount = serialDescriptor.getElementsCount();
        for (int i10 = 0; i10 < elementsCount; i10++) {
            hashSet.add(serialDescriptor.getElementName(i10));
        }
        return hashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> DeserializationStrategy<T> cast(DeserializationStrategy<?> deserializationStrategy) {
        e0.checkNotNullParameter(deserializationStrategy, "<this>");
        return deserializationStrategy;
    }

    public static final SerialDescriptor[] compactArray(List<? extends SerialDescriptor> list) {
        SerialDescriptor[] serialDescriptorArr;
        List<? extends SerialDescriptor> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        return (list == null || (serialDescriptorArr = (SerialDescriptor[]) list.toArray(new SerialDescriptor[0])) == null) ? EMPTY_DESCRIPTOR_ARRAY : serialDescriptorArr;
    }

    public static final <T, K> int elementsHashCodeBy(Iterable<? extends T> iterable, l selector) {
        e0.checkNotNullParameter(iterable, "<this>");
        e0.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            int i10 = iHashCode * 31;
            Object objInvoke = selector.invoke(it.next());
            iHashCode = i10 + (objInvoke != null ? objInvoke.hashCode() : 0);
        }
        return iHashCode;
    }

    public static final KClass<Object> kclass(KType kType) {
        e0.checkNotNullParameter(kType, "<this>");
        KClassifier classifier = kType.getClassifier();
        if (classifier instanceof KClass) {
            return (KClass) classifier;
        }
        if (!(classifier instanceof KTypeParameter)) {
            throw new IllegalArgumentException("Only KClass supported as classifier, got " + classifier);
        }
        throw new IllegalArgumentException("Captured type parameter " + classifier + " from generic non-reified function. Such functionality cannot be supported because " + classifier + " is erased, either specify serializer explicitly or make calling function inline with reified " + classifier + '.');
    }

    public static final String notRegisteredMessage(KClass<?> kClass) {
        e0.checkNotNullParameter(kClass, "<this>");
        String simpleName = kClass.getSimpleName();
        if (simpleName == null) {
            simpleName = "<local class name not available>";
        }
        return notRegisteredMessage(simpleName);
    }

    public static final Void serializerNotRegistered(KClass<?> kClass) {
        e0.checkNotNullParameter(kClass, "<this>");
        throw new SerializationException(notRegisteredMessage(kClass));
    }

    public static final KType typeOrThrow(KTypeProjection kTypeProjection) {
        e0.checkNotNullParameter(kTypeProjection, "<this>");
        KType type = kTypeProjection.getType();
        if (type != null) {
            return type;
        }
        throw new IllegalArgumentException(("Star projections in type arguments are not allowed, but had " + kTypeProjection.getType()).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> KSerializer<T> cast(KSerializer<?> kSerializer) {
        e0.checkNotNullParameter(kSerializer, "<this>");
        return kSerializer;
    }

    public static final String notRegisteredMessage(String className) {
        e0.checkNotNullParameter(className, "className");
        return "Serializer for class '" + className + "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> SerializationStrategy<T> cast(SerializationStrategy<?> serializationStrategy) {
        e0.checkNotNullParameter(serializationStrategy, "<this>");
        return serializationStrategy;
    }
}
