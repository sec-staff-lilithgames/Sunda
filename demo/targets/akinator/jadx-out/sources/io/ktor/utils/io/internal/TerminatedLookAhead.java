package io.ktor.utils.io.internal;

import a.b;
import io.ktor.utils.io.LookAheadSuspendSession;
import java.nio.ByteBuffer;
import p0.o2;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class TerminatedLookAhead implements LookAheadSuspendSession {
    public static final TerminatedLookAhead INSTANCE = new TerminatedLookAhead();

    private TerminatedLookAhead() {
    }

    @Override // io.ktor.utils.io.LookAheadSuspendSession
    public Object awaitAtLeast(int i10, d<? super Boolean> dVar) {
        if (i10 < 0) {
            throw new IllegalArgumentException(b.e(i10, "atLeast parameter shouldn't be negative: ").toString());
        }
        if (i10 <= 4088) {
            return bv.b.boxBoolean(false);
        }
        throw new IllegalArgumentException(b.e(i10, "atLeast parameter shouldn't be larger than max buffer size of 4088: ").toString());
    }

    @Override // io.ktor.utils.io.LookAheadSession
    /* renamed from: consumed */
    public void mo4580consumed(int i10) {
        if (i10 > 0) {
            throw new IllegalStateException(o2.k(i10, "Unable to mark ", " bytes consumed for already terminated channel"));
        }
    }

    @Override // io.ktor.utils.io.LookAheadSession
    public ByteBuffer request(int i10, int i11) {
        return null;
    }
}
