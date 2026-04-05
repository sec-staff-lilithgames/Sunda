package io.odeeo.internal.a0;

import android.os.Handler;
import io.odeeo.internal.b.y0;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface t {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends s {
        public a(Object obj) {
            super(obj);
        }

        public a(Object obj, long j10) {
            super(obj, j10);
        }

        @Override // io.odeeo.internal.a0.s
        public a copyWithPeriodUid(Object obj) {
            return new a(super.copyWithPeriodUid(obj));
        }

        @Override // io.odeeo.internal.a0.s
        public a copyWithWindowSequenceNumber(long j10) {
            return new a(super.copyWithWindowSequenceNumber(j10));
        }

        public a(Object obj, long j10, int i10) {
            super(obj, j10, i10);
        }

        public a(Object obj, int i10, int i11, long j10) {
            super(obj, i10, i11, j10);
        }

        public a(s sVar) {
            super(sVar);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface b {
        void onSourceInfoRefreshed(t tVar, y0 y0Var);
    }

    void addDrmEventListener(Handler handler, io.odeeo.internal.f.g gVar);

    void addEventListener(Handler handler, u uVar);

    r createPeriod(a aVar, io.odeeo.internal.p0.b bVar, long j10);

    void disable(b bVar);

    void enable(b bVar);

    default y0 getInitialTimeline() {
        return null;
    }

    io.odeeo.internal.b.z getMediaItem();

    default boolean isSingleWindow() {
        return true;
    }

    void maybeThrowSourceInfoRefreshError() throws IOException;

    void prepareSource(b bVar, io.odeeo.internal.p0.b0 b0Var);

    void releasePeriod(r rVar);

    void releaseSource(b bVar);

    void removeDrmEventListener(io.odeeo.internal.f.g gVar);

    void removeEventListener(u uVar);
}
