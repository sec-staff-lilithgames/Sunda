package kotlinx.serialization.internal;

import java.util.ArrayList;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class PluginExceptionsKt {
    @InternalSerializationApi
    public static final void throwArrayMissingFieldException(int[] seenArray, int[] goldenMaskArray, SerialDescriptor descriptor) {
        e0.checkNotNullParameter(seenArray, "seenArray");
        e0.checkNotNullParameter(goldenMaskArray, "goldenMaskArray");
        e0.checkNotNullParameter(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int length = goldenMaskArray.length;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = goldenMaskArray[i10] & (~seenArray[i10]);
            if (i11 != 0) {
                for (int i12 = 0; i12 < 32; i12++) {
                    if ((i11 & 1) != 0) {
                        arrayList.add(descriptor.getElementName((i10 * 32) + i12));
                    }
                    i11 >>>= 1;
                }
            }
        }
        throw new MissingFieldException(arrayList, descriptor.getSerialName());
    }

    @InternalSerializationApi
    public static final void throwMissingFieldException(int i10, int i11, SerialDescriptor descriptor) {
        e0.checkNotNullParameter(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i12 = (~i10) & i11;
        for (int i13 = 0; i13 < 32; i13++) {
            if ((i12 & 1) != 0) {
                arrayList.add(descriptor.getElementName(i13));
            }
            i12 >>>= 1;
        }
        throw new MissingFieldException(arrayList, descriptor.getSerialName());
    }
}
