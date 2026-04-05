package kotlinx.serialization.descriptors;

import java.util.Iterator;
import lv.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class SerialDescriptorKt$special$$inlined$Iterable$2 implements Iterable<String>, a {
    final /* synthetic */ SerialDescriptor $this_elementNames$inlined;

    public SerialDescriptorKt$special$$inlined$Iterable$2(SerialDescriptor serialDescriptor) {
        this.$this_elementNames$inlined = serialDescriptor;
    }

    @Override // java.lang.Iterable
    public Iterator<String> iterator() {
        return new SerialDescriptorKt$elementNames$1$1(this.$this_elementNames$inlined);
    }
}
