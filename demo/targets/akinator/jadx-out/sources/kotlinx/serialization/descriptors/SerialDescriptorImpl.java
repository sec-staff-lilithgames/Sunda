package kotlinx.serialization.descriptors;

import a1.e;
import aw.f;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.CachedNames;
import kotlinx.serialization.internal.Platform_commonKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptorKt;
import qv.v;
import tu.o;
import tu.q;
import uu.g1;
import uu.k0;
import uu.p1;
import uu.q0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class SerialDescriptorImpl implements SerialDescriptor, CachedNames {
    private final o _hashCode$delegate;
    private final List<Annotation> annotations;
    private final List<Annotation>[] elementAnnotations;
    private final SerialDescriptor[] elementDescriptors;
    private final String[] elementNames;
    private final boolean[] elementOptionality;
    private final int elementsCount;
    private final SerialKind kind;
    private final Map<String, Integer> name2Index;
    private final String serialName;
    private final Set<String> serialNames;
    private final SerialDescriptor[] typeParametersDescriptors;

    public SerialDescriptorImpl(String serialName, SerialKind kind, int i10, List<? extends SerialDescriptor> typeParameters, ClassSerialDescriptorBuilder builder) {
        e0.checkNotNullParameter(serialName, "serialName");
        e0.checkNotNullParameter(kind, "kind");
        e0.checkNotNullParameter(typeParameters, "typeParameters");
        e0.checkNotNullParameter(builder, "builder");
        this.serialName = serialName;
        this.kind = kind;
        this.elementsCount = i10;
        this.annotations = builder.getAnnotations();
        this.serialNames = y0.toHashSet(builder.getElementNames$kotlinx_serialization_core());
        String[] strArr = (String[]) builder.getElementNames$kotlinx_serialization_core().toArray(new String[0]);
        this.elementNames = strArr;
        this.elementDescriptors = Platform_commonKt.compactArray(builder.getElementDescriptors$kotlinx_serialization_core());
        this.elementAnnotations = (List[]) builder.getElementAnnotations$kotlinx_serialization_core().toArray(new List[0]);
        this.elementOptionality = y0.toBooleanArray(builder.getElementOptionality$kotlinx_serialization_core());
        Iterable<g1> iterableWithIndex = k0.withIndex(strArr);
        ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(iterableWithIndex, 10));
        for (g1 g1Var : iterableWithIndex) {
            arrayList.add(tu.e0.to(g1Var.getValue(), Integer.valueOf(g1Var.getIndex())));
        }
        this.name2Index = p1.toMap(arrayList);
        this.typeParametersDescriptors = Platform_commonKt.compactArray(typeParameters);
        this._hashCode$delegate = q.lazy(new e(this, 25));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int _hashCode_delegate$lambda$1(SerialDescriptorImpl serialDescriptorImpl) {
        return PluginGeneratedSerialDescriptorKt.hashCodeImpl(serialDescriptorImpl, serialDescriptorImpl.typeParametersDescriptors);
    }

    private final int get_hashCode() {
        return ((Number) this._hashCode$delegate.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence toString$lambda$3(SerialDescriptorImpl serialDescriptorImpl, int i10) {
        return serialDescriptorImpl.getElementName(i10) + ": " + serialDescriptorImpl.getElementDescriptor(i10).getSerialName();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SerialDescriptorImpl)) {
            return false;
        }
        SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
        if (!e0.areEqual(getSerialName(), serialDescriptor.getSerialName()) || !Arrays.equals(this.typeParametersDescriptors, ((SerialDescriptorImpl) obj).typeParametersDescriptors) || getElementsCount() != serialDescriptor.getElementsCount()) {
            return false;
        }
        int elementsCount = getElementsCount();
        for (int i10 = 0; i10 < elementsCount; i10++) {
            if (!e0.areEqual(getElementDescriptor(i10).getSerialName(), serialDescriptor.getElementDescriptor(i10).getSerialName()) || !e0.areEqual(getElementDescriptor(i10).getKind(), serialDescriptor.getElementDescriptor(i10).getKind())) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List<Annotation> getAnnotations() {
        return this.annotations;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List<Annotation> getElementAnnotations(int i10) {
        return this.elementAnnotations[i10];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor getElementDescriptor(int i10) {
        return this.elementDescriptors[i10];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementIndex(String name) {
        e0.checkNotNullParameter(name, "name");
        Integer num = this.name2Index.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String getElementName(int i10) {
        return this.elementNames[i10];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementsCount() {
        return this.elementsCount;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialKind getKind() {
        return this.kind;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String getSerialName() {
        return this.serialName;
    }

    @Override // kotlinx.serialization.internal.CachedNames
    public Set<String> getSerialNames() {
        return this.serialNames;
    }

    public int hashCode() {
        return get_hashCode();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isElementOptional(int i10) {
        return this.elementOptionality[i10];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return SerialDescriptor.DefaultImpls.isInline(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isNullable() {
        return SerialDescriptor.DefaultImpls.isNullable(this);
    }

    public String toString() {
        return y0.joinToString$default(v.until(0, getElementsCount()), ", ", getSerialName() + '(', ")", 0, null, new f(this, 19), 24, null);
    }
}
