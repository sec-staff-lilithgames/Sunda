package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import p0.o2;
import sv.j0;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@ExperimentalSerializationApi
/* loaded from: classes10.dex */
public abstract class ListLikeDescriptor implements SerialDescriptor {
    private final SerialDescriptor elementDescriptor;
    private final int elementsCount;

    public /* synthetic */ ListLikeDescriptor(SerialDescriptor serialDescriptor, u uVar) {
        this(serialDescriptor);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListLikeDescriptor)) {
            return false;
        }
        ListLikeDescriptor listLikeDescriptor = (ListLikeDescriptor) obj;
        return e0.areEqual(this.elementDescriptor, listLikeDescriptor.elementDescriptor) && e0.areEqual(getSerialName(), listLikeDescriptor.getSerialName());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List<Annotation> getAnnotations() {
        return SerialDescriptor.DefaultImpls.getAnnotations(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List<Annotation> getElementAnnotations(int i10) {
        if (i10 >= 0) {
            return p0.emptyList();
        }
        StringBuilder sbT = o2.t(i10, "Illegal index ", ", ");
        sbT.append(getSerialName());
        sbT.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbT.toString().toString());
    }

    public final SerialDescriptor getElementDescriptor() {
        return this.elementDescriptor;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementIndex(String name) {
        e0.checkNotNullParameter(name, "name");
        Integer intOrNull = j0.toIntOrNull(name);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        throw new IllegalArgumentException(j1.o2.l(name, " is not a valid list index"));
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String getElementName(int i10) {
        return String.valueOf(i10);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementsCount() {
        return this.elementsCount;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialKind getKind() {
        return StructureKind.LIST.INSTANCE;
    }

    public int hashCode() {
        return getSerialName().hashCode() + (this.elementDescriptor.hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isElementOptional(int i10) {
        if (i10 >= 0) {
            return false;
        }
        StringBuilder sbT = o2.t(i10, "Illegal index ", ", ");
        sbT.append(getSerialName());
        sbT.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbT.toString().toString());
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
        return getSerialName() + '(' + this.elementDescriptor + ')';
    }

    private ListLikeDescriptor(SerialDescriptor serialDescriptor) {
        this.elementDescriptor = serialDescriptor;
        this.elementsCount = 1;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor getElementDescriptor(int i10) {
        if (i10 >= 0) {
            return this.elementDescriptor;
        }
        StringBuilder sbT = o2.t(i10, "Illegal index ", ", ");
        sbT.append(getSerialName());
        sbT.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbT.toString().toString());
    }
}
