package kotlinx.serialization.descriptors;

import e3.g;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.ExperimentalSerializationApi;
import tu.f;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ClassSerialDescriptorBuilder {
    private List<? extends Annotation> annotations;
    private final List<List<Annotation>> elementAnnotations;
    private final List<SerialDescriptor> elementDescriptors;
    private final List<String> elementNames;
    private final List<Boolean> elementOptionality;
    private boolean isNullable;
    private final String serialName;
    private final Set<String> uniqueNames;

    public ClassSerialDescriptorBuilder(String serialName) {
        e0.checkNotNullParameter(serialName, "serialName");
        this.serialName = serialName;
        this.annotations = p0.emptyList();
        this.elementNames = new ArrayList();
        this.uniqueNames = new HashSet();
        this.elementDescriptors = new ArrayList();
        this.elementAnnotations = new ArrayList();
        this.elementOptionality = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void element$default(ClassSerialDescriptorBuilder classSerialDescriptorBuilder, String str, SerialDescriptor serialDescriptor, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            list = p0.emptyList();
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        classSerialDescriptorBuilder.element(str, serialDescriptor, list, z10);
    }

    public final void element(String elementName, SerialDescriptor descriptor, List<? extends Annotation> annotations, boolean z10) {
        e0.checkNotNullParameter(elementName, "elementName");
        e0.checkNotNullParameter(descriptor, "descriptor");
        e0.checkNotNullParameter(annotations, "annotations");
        if (!this.uniqueNames.add(elementName)) {
            StringBuilder sbO = g.o("Element with name '", elementName, "' is already registered in ");
            sbO.append(this.serialName);
            throw new IllegalArgumentException(sbO.toString().toString());
        }
        this.elementNames.add(elementName);
        this.elementDescriptors.add(descriptor);
        this.elementAnnotations.add(annotations);
        this.elementOptionality.add(Boolean.valueOf(z10));
    }

    public final List<Annotation> getAnnotations() {
        return this.annotations;
    }

    public final List<List<Annotation>> getElementAnnotations$kotlinx_serialization_core() {
        return this.elementAnnotations;
    }

    public final List<SerialDescriptor> getElementDescriptors$kotlinx_serialization_core() {
        return this.elementDescriptors;
    }

    public final List<String> getElementNames$kotlinx_serialization_core() {
        return this.elementNames;
    }

    public final List<Boolean> getElementOptionality$kotlinx_serialization_core() {
        return this.elementOptionality;
    }

    public final String getSerialName() {
        return this.serialName;
    }

    public final boolean isNullable() {
        return this.isNullable;
    }

    public final void setAnnotations(List<? extends Annotation> list) {
        e0.checkNotNullParameter(list, "<set-?>");
        this.annotations = list;
    }

    public final void setNullable(boolean z10) {
        this.isNullable = z10;
    }

    @ExperimentalSerializationApi
    public static /* synthetic */ void getAnnotations$annotations() {
    }

    @ExperimentalSerializationApi
    @f
    public static /* synthetic */ void isNullable$annotations() {
    }
}
