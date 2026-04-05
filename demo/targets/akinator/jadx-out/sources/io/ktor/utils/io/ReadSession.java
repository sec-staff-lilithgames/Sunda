package io.ktor.utils.io;

import io.ktor.utils.io.core.internal.ChunkBuffer;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f
/* loaded from: classes10.dex */
public interface ReadSession {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        public static /* synthetic */ ChunkBuffer request$default(ReadSession readSession, int i10, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: request");
            }
            if ((i11 & 1) != 0) {
                i10 = 1;
            }
            return readSession.request(i10);
        }
    }

    int discard(int i10);

    int getAvailableForRead();

    ChunkBuffer request(int i10);
}
