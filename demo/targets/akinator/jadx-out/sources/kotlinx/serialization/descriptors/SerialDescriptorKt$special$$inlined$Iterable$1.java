package kotlinx.serialization.descriptors;

import java.util.Iterator;
import lv.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class SerialDescriptorKt$special$$inlined$Iterable$1 implements Iterable<SerialDescriptor>, a {
    final /* synthetic */ SerialDescriptor $this_elementDescriptors$inlined;

    public SerialDescriptorKt$special$$inlined$Iterable$1(SerialDescriptor serialDescriptor) {
        this.$this_elementDescriptors$inlined = serialDescriptor;
    }

    @Override // java.lang.Iterable
    public Iterator<SerialDescriptor> iterator() {
        return new SerialDescriptorKt$elementDescriptors$1$1(this.$this_elementDescriptors$inlined);
    }
}
