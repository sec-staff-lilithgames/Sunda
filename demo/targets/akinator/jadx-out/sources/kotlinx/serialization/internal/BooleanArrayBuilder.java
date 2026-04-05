package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.jvm.internal.e0;
import qv.v;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class BooleanArrayBuilder extends PrimitiveArrayBuilder<boolean[]> {
    private boolean[] buffer;
    private int position;

    public BooleanArrayBuilder(boolean[] bufferWithData) {
        e0.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.buffer = bufferWithData;
        this.position = bufferWithData.length;
        ensureCapacity$kotlinx_serialization_core(10);
    }

    public final void append$kotlinx_serialization_core(boolean z10) {
        PrimitiveArrayBuilder.ensureCapacity$kotlinx_serialization_core$default(this, 0, 1, null);
        boolean[] zArr = this.buffer;
        int position$kotlinx_serialization_core = getPosition$kotlinx_serialization_core();
        this.position = position$kotlinx_serialization_core + 1;
        zArr[position$kotlinx_serialization_core] = z10;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public void ensureCapacity$kotlinx_serialization_core(int i10) {
        boolean[] zArr = this.buffer;
        if (zArr.length < i10) {
            boolean[] zArrCopyOf = Arrays.copyOf(zArr, v.coerceAtLeast(i10, zArr.length * 2));
            e0.checkNotNullExpressionValue(zArrCopyOf, "copyOf(...)");
            this.buffer = zArrCopyOf;
        }
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public int getPosition$kotlinx_serialization_core() {
        return this.position;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public boolean[] build$kotlinx_serialization_core() {
        boolean[] zArrCopyOf = Arrays.copyOf(this.buffer, getPosition$kotlinx_serialization_core());
        e0.checkNotNullExpressionValue(zArrCopyOf, "copyOf(...)");
        return zArrCopyOf;
    }
}
