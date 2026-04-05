package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.ExperimentalSerializationApi;
import qv.v;
import tu.i0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@ExperimentalSerializationApi
/* loaded from: classes10.dex */
public final class UByteArrayBuilder extends PrimitiveArrayBuilder<i0> {
    private byte[] buffer;
    private int position;

    public /* synthetic */ UByteArrayBuilder(byte[] bArr, u uVar) {
        this(bArr);
    }

    /* renamed from: append-7apg3OU$kotlinx_serialization_core, reason: not valid java name */
    public final void m5215append7apg3OU$kotlinx_serialization_core(byte b10) {
        PrimitiveArrayBuilder.ensureCapacity$kotlinx_serialization_core$default(this, 0, 1, null);
        byte[] bArr = this.buffer;
        int position$kotlinx_serialization_core = getPosition$kotlinx_serialization_core();
        this.position = position$kotlinx_serialization_core + 1;
        i0.m7050setVurrAj0(bArr, position$kotlinx_serialization_core, b10);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public /* bridge */ /* synthetic */ i0 build$kotlinx_serialization_core() {
        return i0.m7038boximpl(m5216buildTcUX1vc$kotlinx_serialization_core());
    }

    /* renamed from: build-TcUX1vc$kotlinx_serialization_core, reason: not valid java name */
    public byte[] m5216buildTcUX1vc$kotlinx_serialization_core() {
        byte[] bArrCopyOf = Arrays.copyOf(this.buffer, getPosition$kotlinx_serialization_core());
        e0.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return i0.m7040constructorimpl(bArrCopyOf);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public void ensureCapacity$kotlinx_serialization_core(int i10) {
        if (i0.m7046getSizeimpl(this.buffer) < i10) {
            byte[] bArr = this.buffer;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, v.coerceAtLeast(i10, i0.m7046getSizeimpl(bArr) * 2));
            e0.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
            this.buffer = i0.m7040constructorimpl(bArrCopyOf);
        }
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public int getPosition$kotlinx_serialization_core() {
        return this.position;
    }

    private UByteArrayBuilder(byte[] bufferWithData) {
        e0.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.buffer = bufferWithData;
        this.position = i0.m7046getSizeimpl(bufferWithData);
        ensureCapacity$kotlinx_serialization_core(10);
    }
}
