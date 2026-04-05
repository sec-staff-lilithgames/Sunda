package kotlinx.serialization.internal;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorKt;
import kotlinx.serialization.descriptors.SerialKind;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class PluginGeneratedSerialDescriptorKt {
    public static final /* synthetic */ <SD extends SerialDescriptor> boolean equalsImpl(SD sd2, Object obj, l typeParamsAreEqual) {
        e0.checkNotNullParameter(sd2, "<this>");
        e0.checkNotNullParameter(typeParamsAreEqual, "typeParamsAreEqual");
        if (sd2 == obj) {
            return true;
        }
        e0.reifiedOperationMarker(3, "SD");
        if (!(obj instanceof SerialDescriptor)) {
            return false;
        }
        SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
        if (!e0.areEqual(sd2.getSerialName(), serialDescriptor.getSerialName()) || !((Boolean) typeParamsAreEqual.invoke(obj)).booleanValue() || sd2.getElementsCount() != serialDescriptor.getElementsCount()) {
            return false;
        }
        int elementsCount = sd2.getElementsCount();
        for (int i10 = 0; i10 < elementsCount; i10++) {
            if (!e0.areEqual(sd2.getElementDescriptor(i10).getSerialName(), serialDescriptor.getElementDescriptor(i10).getSerialName()) || !e0.areEqual(sd2.getElementDescriptor(i10).getKind(), serialDescriptor.getElementDescriptor(i10).getKind())) {
                return false;
            }
        }
        return true;
    }

    public static final int hashCodeImpl(SerialDescriptor serialDescriptor, SerialDescriptor[] typeParams) {
        e0.checkNotNullParameter(serialDescriptor, "<this>");
        e0.checkNotNullParameter(typeParams, "typeParams");
        int iHashCode = (serialDescriptor.getSerialName().hashCode() * 31) + Arrays.hashCode(typeParams);
        Iterable<SerialDescriptor> elementDescriptors = SerialDescriptorKt.getElementDescriptors(serialDescriptor);
        Iterator<SerialDescriptor> it = elementDescriptors.iterator();
        int iHashCode2 = 1;
        int i10 = 1;
        while (true) {
            int iHashCode3 = 0;
            if (!it.hasNext()) {
                break;
            }
            int i11 = i10 * 31;
            String serialName = it.next().getSerialName();
            if (serialName != null) {
                iHashCode3 = serialName.hashCode();
            }
            i10 = i11 + iHashCode3;
        }
        Iterator<SerialDescriptor> it2 = elementDescriptors.iterator();
        while (it2.hasNext()) {
            int i12 = iHashCode2 * 31;
            SerialKind kind = it2.next().getKind();
            iHashCode2 = i12 + (kind != null ? kind.hashCode() : 0);
        }
        return (((iHashCode * 31) + i10) * 31) + iHashCode2;
    }
}
