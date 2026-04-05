package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.ExperimentalSerializationApi;
import qv.v;
import tu.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@ExperimentalSerializationApi
/* loaded from: classes10.dex */
public final class UIntArrayBuilder extends PrimitiveArrayBuilder<m0> {
    private int[] buffer;
    private int position;

    public /* synthetic */ UIntArrayBuilder(int[] iArr, u uVar) {
        this(iArr);
    }

    /* renamed from: append-WZ4Q5Ns$kotlinx_serialization_core, reason: not valid java name */
    public final void m5223appendWZ4Q5Ns$kotlinx_serialization_core(int i10) {
        PrimitiveArrayBuilder.ensureCapacity$kotlinx_serialization_core$default(this, 0, 1, null);
        int[] iArr = this.buffer;
        int position$kotlinx_serialization_core = getPosition$kotlinx_serialization_core();
        this.position = position$kotlinx_serialization_core + 1;
        m0.m7075setVXSXFK8(iArr, position$kotlinx_serialization_core, i10);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public /* bridge */ /* synthetic */ m0 build$kotlinx_serialization_core() {
        return m0.m7063boximpl(m5224buildhP7Qyg$kotlinx_serialization_core());
    }

    /* renamed from: build--hP7Qyg$kotlinx_serialization_core, reason: not valid java name */
    public int[] m5224buildhP7Qyg$kotlinx_serialization_core() {
        int[] iArrCopyOf = Arrays.copyOf(this.buffer, getPosition$kotlinx_serialization_core());
        e0.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        return m0.m7065constructorimpl(iArrCopyOf);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public void ensureCapacity$kotlinx_serialization_core(int i10) {
        if (m0.m7071getSizeimpl(this.buffer) < i10) {
            int[] iArr = this.buffer;
            int[] iArrCopyOf = Arrays.copyOf(iArr, v.coerceAtLeast(i10, m0.m7071getSizeimpl(iArr) * 2));
            e0.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.buffer = m0.m7065constructorimpl(iArrCopyOf);
        }
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public int getPosition$kotlinx_serialization_core() {
        return this.position;
    }

    private UIntArrayBuilder(int[] bufferWithData) {
        e0.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.buffer = bufferWithData;
        this.position = m0.m7071getSizeimpl(bufferWithData);
        ensureCapacity$kotlinx_serialization_core(10);
    }
}
