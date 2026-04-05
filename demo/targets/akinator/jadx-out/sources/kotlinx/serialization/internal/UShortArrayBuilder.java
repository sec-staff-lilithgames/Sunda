package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.ExperimentalSerializationApi;
import qv.v;
import tu.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@ExperimentalSerializationApi
/* loaded from: classes10.dex */
public final class UShortArrayBuilder extends PrimitiveArrayBuilder<v0> {
    private short[] buffer;
    private int position;

    public /* synthetic */ UShortArrayBuilder(short[] sArr, u uVar) {
        this(sArr);
    }

    /* renamed from: append-xj2QHRw$kotlinx_serialization_core, reason: not valid java name */
    public final void m5239appendxj2QHRw$kotlinx_serialization_core(short s10) {
        PrimitiveArrayBuilder.ensureCapacity$kotlinx_serialization_core$default(this, 0, 1, null);
        short[] sArr = this.buffer;
        int position$kotlinx_serialization_core = getPosition$kotlinx_serialization_core();
        this.position = position$kotlinx_serialization_core + 1;
        v0.m7125set01HTLdE(sArr, position$kotlinx_serialization_core, s10);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public /* bridge */ /* synthetic */ v0 build$kotlinx_serialization_core() {
        return v0.m7113boximpl(m5240buildamswpOA$kotlinx_serialization_core());
    }

    /* renamed from: build-amswpOA$kotlinx_serialization_core, reason: not valid java name */
    public short[] m5240buildamswpOA$kotlinx_serialization_core() {
        short[] sArrCopyOf = Arrays.copyOf(this.buffer, getPosition$kotlinx_serialization_core());
        e0.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        return v0.m7115constructorimpl(sArrCopyOf);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public void ensureCapacity$kotlinx_serialization_core(int i10) {
        if (v0.m7121getSizeimpl(this.buffer) < i10) {
            short[] sArr = this.buffer;
            short[] sArrCopyOf = Arrays.copyOf(sArr, v.coerceAtLeast(i10, v0.m7121getSizeimpl(sArr) * 2));
            e0.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
            this.buffer = v0.m7115constructorimpl(sArrCopyOf);
        }
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public int getPosition$kotlinx_serialization_core() {
        return this.position;
    }

    private UShortArrayBuilder(short[] bufferWithData) {
        e0.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.buffer = bufferWithData;
        this.position = v0.m7121getSizeimpl(bufferWithData);
        ensureCapacity$kotlinx_serialization_core(10);
    }
}
