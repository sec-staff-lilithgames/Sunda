package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import p0.o2;
import sv.j0;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class MapLikeDescriptor implements SerialDescriptor {
    private final int elementsCount;
    private final SerialDescriptor keyDescriptor;
    private final String serialName;
    private final SerialDescriptor valueDescriptor;

    public /* synthetic */ MapLikeDescriptor(String str, SerialDescriptor serialDescriptor, SerialDescriptor serialDescriptor2, u uVar) {
        this(str, serialDescriptor, serialDescriptor2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapLikeDescriptor)) {
            return false;
        }
        MapLikeDescriptor mapLikeDescriptor = (MapLikeDescriptor) obj;
        return e0.areEqual(getSerialName(), mapLikeDescriptor.getSerialName()) && e0.areEqual(this.keyDescriptor, mapLikeDescriptor.keyDescriptor) && e0.areEqual(this.valueDescriptor, mapLikeDescriptor.valueDescriptor);
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

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor getElementDescriptor(int i10) {
        if (i10 < 0) {
            StringBuilder sbT = o2.t(i10, "Illegal index ", ", ");
            sbT.append(getSerialName());
            sbT.append(" expects only non-negative indices");
            throw new IllegalArgumentException(sbT.toString().toString());
        }
        int i11 = i10 % 2;
        if (i11 == 0) {
            return this.keyDescriptor;
        }
        if (i11 == 1) {
            return this.valueDescriptor;
        }
        throw new IllegalStateException("Unreached");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementIndex(String name) {
        e0.checkNotNullParameter(name, "name");
        Integer intOrNull = j0.toIntOrNull(name);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        throw new IllegalArgumentException(j1.o2.l(name, " is not a valid map index"));
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String getElementName(int i10) {
        return String.valueOf(i10);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementsCount() {
        return this.elementsCount;
    }

    public final SerialDescriptor getKeyDescriptor() {
        return this.keyDescriptor;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialKind getKind() {
        return StructureKind.MAP.INSTANCE;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String getSerialName() {
        return this.serialName;
    }

    public final SerialDescriptor getValueDescriptor() {
        return this.valueDescriptor;
    }

    public int hashCode() {
        return this.valueDescriptor.hashCode() + ((this.keyDescriptor.hashCode() + (getSerialName().hashCode() * 31)) * 31);
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
        return getSerialName() + '(' + this.keyDescriptor + ", " + this.valueDescriptor + ')';
    }

    private MapLikeDescriptor(String str, SerialDescriptor serialDescriptor, SerialDescriptor serialDescriptor2) {
        this.serialName = str;
        this.keyDescriptor = serialDescriptor;
        this.valueDescriptor = serialDescriptor2;
        this.elementsCount = 2;
    }
}
