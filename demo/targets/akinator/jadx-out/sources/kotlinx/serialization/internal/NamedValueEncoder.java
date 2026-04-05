package kotlinx.serialization.internal;

import kotlin.jvm.internal.e0;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@InternalSerializationApi
/* loaded from: classes10.dex */
public abstract class NamedValueEncoder extends TaggedEncoder<String> {
    public String composeName(String parentName, String childName) {
        e0.checkNotNullParameter(parentName, "parentName");
        e0.checkNotNullParameter(childName, "childName");
        if (parentName.length() == 0) {
            return childName;
        }
        return parentName + '.' + childName;
    }

    public String elementName(SerialDescriptor descriptor, int i10) {
        e0.checkNotNullParameter(descriptor, "descriptor");
        return descriptor.getElementName(i10);
    }

    public final String nested(String nestedName) {
        e0.checkNotNullParameter(nestedName, "nestedName");
        String currentTagOrNull = getCurrentTagOrNull();
        if (currentTagOrNull == null) {
            currentTagOrNull = "";
        }
        return composeName(currentTagOrNull, nestedName);
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public final String getTag(SerialDescriptor serialDescriptor, int i10) {
        e0.checkNotNullParameter(serialDescriptor, "<this>");
        return nested(elementName(serialDescriptor, i10));
    }
}
