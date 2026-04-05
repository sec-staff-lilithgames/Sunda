package kotlinx.coroutines.flow;

import kotlinx.coroutines.channels.BufferOverflow;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class SharingConfig<T> {
    public final m context;
    public final int extraBufferCapacity;
    public final BufferOverflow onBufferOverflow;
    public final Flow<T> upstream;

    /* JADX WARN: Multi-variable type inference failed */
    public SharingConfig(Flow<? extends T> flow, int i10, BufferOverflow bufferOverflow, m mVar) {
        this.upstream = flow;
        this.extraBufferCapacity = i10;
        this.onBufferOverflow = bufferOverflow;
        this.context = mVar;
    }
}
