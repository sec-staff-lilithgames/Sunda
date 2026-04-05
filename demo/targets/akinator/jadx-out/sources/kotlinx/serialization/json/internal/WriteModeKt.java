package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.e0;
import kotlinx.serialization.descriptors.ContextAwareKt;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.modules.SerializersModule;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class WriteModeKt {
    public static final SerialDescriptor carrierDescriptor(SerialDescriptor serialDescriptor, SerializersModule module) {
        SerialDescriptor serialDescriptorCarrierDescriptor;
        e0.checkNotNullParameter(serialDescriptor, "<this>");
        e0.checkNotNullParameter(module, "module");
        if (!e0.areEqual(serialDescriptor.getKind(), SerialKind.CONTEXTUAL.INSTANCE)) {
            return serialDescriptor.isInline() ? carrierDescriptor(serialDescriptor.getElementDescriptor(0), module) : serialDescriptor;
        }
        SerialDescriptor contextualDescriptor = ContextAwareKt.getContextualDescriptor(module, serialDescriptor);
        return (contextualDescriptor == null || (serialDescriptorCarrierDescriptor = carrierDescriptor(contextualDescriptor, module)) == null) ? serialDescriptor : serialDescriptorCarrierDescriptor;
    }

    public static final <T, R1 extends T, R2 extends T> T selectMapMode(Json json, SerialDescriptor mapDescriptor, kv.a ifMap, kv.a ifList) {
        e0.checkNotNullParameter(json, "<this>");
        e0.checkNotNullParameter(mapDescriptor, "mapDescriptor");
        e0.checkNotNullParameter(ifMap, "ifMap");
        e0.checkNotNullParameter(ifList, "ifList");
        SerialDescriptor serialDescriptorCarrierDescriptor = carrierDescriptor(mapDescriptor.getElementDescriptor(0), json.getSerializersModule());
        SerialKind kind = serialDescriptorCarrierDescriptor.getKind();
        if ((kind instanceof PrimitiveKind) || e0.areEqual(kind, SerialKind.ENUM.INSTANCE)) {
            return (T) ifMap.invoke();
        }
        if (json.getConfiguration().getAllowStructuredMapKeys()) {
            return (T) ifList.invoke();
        }
        throw JsonExceptionsKt.InvalidKeyKindException(serialDescriptorCarrierDescriptor);
    }

    public static final WriteMode switchMode(Json json, SerialDescriptor desc) {
        e0.checkNotNullParameter(json, "<this>");
        e0.checkNotNullParameter(desc, "desc");
        SerialKind kind = desc.getKind();
        if (kind instanceof PolymorphicKind) {
            return WriteMode.POLY_OBJ;
        }
        if (e0.areEqual(kind, StructureKind.LIST.INSTANCE)) {
            return WriteMode.LIST;
        }
        if (!e0.areEqual(kind, StructureKind.MAP.INSTANCE)) {
            return WriteMode.OBJ;
        }
        SerialDescriptor serialDescriptorCarrierDescriptor = carrierDescriptor(desc.getElementDescriptor(0), json.getSerializersModule());
        SerialKind kind2 = serialDescriptorCarrierDescriptor.getKind();
        if ((kind2 instanceof PrimitiveKind) || e0.areEqual(kind2, SerialKind.ENUM.INSTANCE)) {
            return WriteMode.MAP;
        }
        if (json.getConfiguration().getAllowStructuredMapKeys()) {
            return WriteMode.LIST;
        }
        throw JsonExceptionsKt.InvalidKeyKindException(serialDescriptorCarrierDescriptor);
    }
}
