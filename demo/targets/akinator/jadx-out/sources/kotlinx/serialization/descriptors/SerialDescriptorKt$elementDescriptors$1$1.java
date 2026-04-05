package kotlinx.serialization.descriptors;

import java.util.Iterator;
import lv.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class SerialDescriptorKt$elementDescriptors$1$1 implements Iterator<SerialDescriptor>, a {
    final /* synthetic */ SerialDescriptor $this_elementDescriptors;
    private int elementsLeft;

    public SerialDescriptorKt$elementDescriptors$1$1(SerialDescriptor serialDescriptor) {
        this.$this_elementDescriptors = serialDescriptor;
        this.elementsLeft = serialDescriptor.getElementsCount();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.elementsLeft > 0;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public SerialDescriptor next() {
        SerialDescriptor serialDescriptor = this.$this_elementDescriptors;
        int elementsCount = serialDescriptor.getElementsCount();
        int i10 = this.elementsLeft;
        this.elementsLeft = i10 - 1;
        return serialDescriptor.getElementDescriptor(elementsCount - i10);
    }
}
