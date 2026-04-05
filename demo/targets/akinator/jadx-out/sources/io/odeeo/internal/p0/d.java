package io.odeeo.internal.p0;

import android.os.Handler;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface d {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface a {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: io.odeeo.internal.p0.d$a$a, reason: collision with other inner class name */
        public static final class C0634a {

            /* renamed from: a, reason: collision with root package name */
            public final CopyOnWriteArrayList<C0635a> f65601a = new CopyOnWriteArrayList<>();

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: io.odeeo.internal.p0.d$a$a$a, reason: collision with other inner class name */
            public static final class C0635a {

                /* renamed from: a, reason: collision with root package name */
                public final Handler f65602a;

                /* renamed from: b, reason: collision with root package name */
                public final a f65603b;

                /* renamed from: c, reason: collision with root package name */
                public boolean f65604c;

                public C0635a(Handler handler, a aVar) {
                    this.f65602a = handler;
                    this.f65603b = aVar;
                }

                public void release() {
                    this.f65604c = true;
                }
            }

            public void addListener(Handler handler, a aVar) {
                io.odeeo.internal.q0.a.checkNotNull(handler);
                io.odeeo.internal.q0.a.checkNotNull(aVar);
                removeListener(aVar);
                this.f65601a.add(new C0635a(handler, aVar));
            }

            public void bandwidthSample(int i10, long j10, long j11) {
                Iterator<C0635a> it = this.f65601a.iterator();
                while (it.hasNext()) {
                    C0635a next = it.next();
                    if (!next.f65604c) {
                        next.f65602a.post(new at.a(next, j10, j11, i10, 0));
                    }
                }
            }

            public void removeListener(a aVar) {
                Iterator<C0635a> it = this.f65601a.iterator();
                while (it.hasNext()) {
                    C0635a next = it.next();
                    if (next.f65603b == aVar) {
                        next.release();
                        this.f65601a.remove(next);
                    }
                }
            }
        }

        void onBandwidthSample(int i10, long j10, long j11);
    }

    void addEventListener(Handler handler, a aVar);

    long getBitrateEstimate();

    default long getTimeToFirstByteEstimateUs() {
        return C.TIME_UNSET;
    }

    b0 getTransferListener();

    void removeEventListener(a aVar);
}
