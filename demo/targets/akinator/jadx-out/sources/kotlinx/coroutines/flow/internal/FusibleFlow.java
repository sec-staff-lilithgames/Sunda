package kotlinx.coroutines.flow.internal;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import zu.m;
import zu.n;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface FusibleFlow<T> extends Flow<T> {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        public static /* synthetic */ Flow fuse$default(FusibleFlow fusibleFlow, m mVar, int i10, BufferOverflow bufferOverflow, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
            }
            if ((i11 & 1) != 0) {
                mVar = n.f98854b;
            }
            if ((i11 & 2) != 0) {
                i10 = -3;
            }
            if ((i11 & 4) != 0) {
                bufferOverflow = BufferOverflow.SUSPEND;
            }
            return fusibleFlow.fuse(mVar, i10, bufferOverflow);
        }
    }

    Flow<T> fuse(m mVar, int i10, BufferOverflow bufferOverflow);
}
