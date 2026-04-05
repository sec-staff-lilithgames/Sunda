package kotlinx.serialization.descriptors;

import kotlin.jvm.internal.e0;
import kotlinx.serialization.ExperimentalSerializationApi;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class SerialDescriptorKt {
    public static final Iterable<SerialDescriptor> getElementDescriptors(SerialDescriptor serialDescriptor) {
        e0.checkNotNullParameter(serialDescriptor, "<this>");
        return new SerialDescriptorKt$special$$inlined$Iterable$1(serialDescriptor);
    }

    public static final Iterable<String> getElementNames(SerialDescriptor serialDescriptor) {
        e0.checkNotNullParameter(serialDescriptor, "<this>");
        return new SerialDescriptorKt$special$$inlined$Iterable$2(serialDescriptor);
    }

    @ExperimentalSerializationApi
    public static /* synthetic */ void getElementDescriptors$annotations(SerialDescriptor serialDescriptor) {
    }

    @ExperimentalSerializationApi
    public static /* synthetic */ void getElementNames$annotations(SerialDescriptor serialDescriptor) {
    }
}
