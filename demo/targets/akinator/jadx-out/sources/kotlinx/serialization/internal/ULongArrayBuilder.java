package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.ExperimentalSerializationApi;
import qv.v;
import tu.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@ExperimentalSerializationApi
/* loaded from: classes10.dex */
public final class ULongArrayBuilder extends PrimitiveArrayBuilder<q0> {
    private long[] buffer;
    private int position;

    public /* synthetic */ ULongArrayBuilder(long[] jArr, u uVar) {
        this(jArr);
    }

    /* renamed from: append-VKZWuLQ$kotlinx_serialization_core, reason: not valid java name */
    public final void m5231appendVKZWuLQ$kotlinx_serialization_core(long j10) {
        PrimitiveArrayBuilder.ensureCapacity$kotlinx_serialization_core$default(this, 0, 1, null);
        long[] jArr = this.buffer;
        int position$kotlinx_serialization_core = getPosition$kotlinx_serialization_core();
        this.position = position$kotlinx_serialization_core + 1;
        q0.m7100setk8EXiF4(jArr, position$kotlinx_serialization_core, j10);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public /* bridge */ /* synthetic */ q0 build$kotlinx_serialization_core() {
        return q0.m7088boximpl(m5232buildY2RjT0g$kotlinx_serialization_core());
    }

    /* renamed from: build-Y2RjT0g$kotlinx_serialization_core, reason: not valid java name */
    public long[] m5232buildY2RjT0g$kotlinx_serialization_core() {
        long[] jArrCopyOf = Arrays.copyOf(this.buffer, getPosition$kotlinx_serialization_core());
        e0.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        return q0.m7090constructorimpl(jArrCopyOf);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public void ensureCapacity$kotlinx_serialization_core(int i10) {
        if (q0.m7096getSizeimpl(this.buffer) < i10) {
            long[] jArr = this.buffer;
            long[] jArrCopyOf = Arrays.copyOf(jArr, v.coerceAtLeast(i10, q0.m7096getSizeimpl(jArr) * 2));
            e0.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
            this.buffer = q0.m7090constructorimpl(jArrCopyOf);
        }
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public int getPosition$kotlinx_serialization_core() {
        return this.position;
    }

    private ULongArrayBuilder(long[] bufferWithData) {
        e0.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.buffer = bufferWithData;
        this.position = q0.m7096getSizeimpl(bufferWithData);
        ensureCapacity$kotlinx_serialization_core(10);
    }
}
