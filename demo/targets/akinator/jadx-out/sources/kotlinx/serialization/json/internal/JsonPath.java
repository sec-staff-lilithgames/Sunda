package kotlinx.serialization.json.internal;

import com.ironsource.C3191e4;
import java.util.Arrays;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.StructureKind;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class JsonPath {
    private int currentDepth;
    private Object[] currentObjectPath = new Object[8];
    private int[] indicies;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Tombstone {
        public static final Tombstone INSTANCE = new Tombstone();

        private Tombstone() {
        }
    }

    public JsonPath() {
        int[] iArr = new int[8];
        for (int i10 = 0; i10 < 8; i10++) {
            iArr[i10] = -1;
        }
        this.indicies = iArr;
        this.currentDepth = -1;
    }

    private final String prettyString(Object obj) {
        String serialName;
        SerialDescriptor serialDescriptor = obj instanceof SerialDescriptor ? (SerialDescriptor) obj : null;
        return (serialDescriptor == null || (serialName = serialDescriptor.getSerialName()) == null) ? String.valueOf(obj) : serialName;
    }

    private final void resize() {
        int i10 = this.currentDepth * 2;
        Object[] objArrCopyOf = Arrays.copyOf(this.currentObjectPath, i10);
        e0.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        this.currentObjectPath = objArrCopyOf;
        int[] iArrCopyOf = Arrays.copyOf(this.indicies, i10);
        e0.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        this.indicies = iArrCopyOf;
    }

    public final String getPath() {
        StringBuilder sb2 = new StringBuilder("$");
        int i10 = this.currentDepth + 1;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = this.currentObjectPath[i11];
            if (obj instanceof SerialDescriptor) {
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                if (!e0.areEqual(serialDescriptor.getKind(), StructureKind.LIST.INSTANCE)) {
                    int i12 = this.indicies[i11];
                    if (i12 >= 0) {
                        sb2.append(".");
                        sb2.append(serialDescriptor.getElementName(i12));
                    }
                } else if (this.indicies[i11] != -1) {
                    sb2.append(C3191e4.i.f36529d);
                    sb2.append(this.indicies[i11]);
                    sb2.append(C3191e4.i.f36531e);
                }
            } else if (obj != Tombstone.INSTANCE) {
                sb2.append("['");
                sb2.append(obj);
                sb2.append("']");
            }
        }
        String string = sb2.toString();
        e0.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final void popDescriptor() {
        int i10 = this.currentDepth;
        int[] iArr = this.indicies;
        if (iArr[i10] == -2) {
            iArr[i10] = -1;
            this.currentDepth = i10 - 1;
        }
        int i11 = this.currentDepth;
        if (i11 != -1) {
            this.currentDepth = i11 - 1;
        }
    }

    public final void pushDescriptor(SerialDescriptor sd2) {
        e0.checkNotNullParameter(sd2, "sd");
        int i10 = this.currentDepth + 1;
        this.currentDepth = i10;
        if (i10 == this.currentObjectPath.length) {
            resize();
        }
        this.currentObjectPath[i10] = sd2;
    }

    public final void resetCurrentMapKey() {
        int[] iArr = this.indicies;
        int i10 = this.currentDepth;
        if (iArr[i10] == -2) {
            this.currentObjectPath[i10] = Tombstone.INSTANCE;
        }
    }

    public String toString() {
        return getPath();
    }

    public final void updateCurrentMapKey(Object obj) {
        int[] iArr = this.indicies;
        int i10 = this.currentDepth;
        if (iArr[i10] != -2) {
            int i11 = i10 + 1;
            this.currentDepth = i11;
            if (i11 == this.currentObjectPath.length) {
                resize();
            }
        }
        Object[] objArr = this.currentObjectPath;
        int i12 = this.currentDepth;
        objArr[i12] = obj;
        this.indicies[i12] = -2;
    }

    public final void updateDescriptorIndex(int i10) {
        this.indicies[this.currentDepth] = i10;
    }
}
