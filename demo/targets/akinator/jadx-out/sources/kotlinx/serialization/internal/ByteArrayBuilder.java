package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.jvm.internal.e0;
import qv.v;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ByteArrayBuilder extends PrimitiveArrayBuilder<byte[]> {
    private byte[] buffer;
    private int position;

    public ByteArrayBuilder(byte[] bufferWithData) {
        e0.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.buffer = bufferWithData;
        this.position = bufferWithData.length;
        ensureCapacity$kotlinx_serialization_core(10);
    }

    public final void append$kotlinx_serialization_core(byte b10) {
        PrimitiveArrayBuilder.ensureCapacity$kotlinx_serialization_core$default(this, 0, 1, null);
        byte[] bArr = this.buffer;
        int position$kotlinx_serialization_core = getPosition$kotlinx_serialization_core();
        this.position = position$kotlinx_serialization_core + 1;
        bArr[position$kotlinx_serialization_core] = b10;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public void ensureCapacity$kotlinx_serialization_core(int i10) {
        byte[] bArr = this.buffer;
        if (bArr.length < i10) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, v.coerceAtLeast(i10, bArr.length * 2));
            e0.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
            this.buffer = bArrCopyOf;
        }
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public int getPosition$kotlinx_serialization_core() {
        return this.position;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public byte[] build$kotlinx_serialization_core() {
        byte[] bArrCopyOf = Arrays.copyOf(this.buffer, getPosition$kotlinx_serialization_core());
        e0.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }
}
