package io.ktor.utils.io;

import tu.f;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f
/* loaded from: classes10.dex */
public interface SuspendableReadSession extends ReadSession {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        public static /* synthetic */ Object await$default(SuspendableReadSession suspendableReadSession, int i10, d dVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: await");
            }
            if ((i11 & 1) != 0) {
                i10 = 1;
            }
            return suspendableReadSession.await(i10, dVar);
        }
    }

    Object await(int i10, d<? super Boolean> dVar);
}
