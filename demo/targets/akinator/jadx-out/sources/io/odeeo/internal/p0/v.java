package io.odeeo.internal.p0;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface v {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f65736a;

        /* renamed from: b, reason: collision with root package name */
        public final int f65737b;

        /* renamed from: c, reason: collision with root package name */
        public final int f65738c;

        /* renamed from: d, reason: collision with root package name */
        public final int f65739d;

        public a(int i10, int i11, int i12, int i13) {
            this.f65736a = i10;
            this.f65737b = i11;
            this.f65738c = i12;
            this.f65739d = i13;
        }

        public boolean isFallbackAvailable(int i10) {
            if (i10 == 1) {
                if (this.f65736a - this.f65737b <= 1) {
                    return false;
                }
            } else if (this.f65738c - this.f65739d <= 1) {
                return false;
            }
            return true;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f65740a;

        /* renamed from: b, reason: collision with root package name */
        public final long f65741b;

        public b(int i10, long j10) {
            io.odeeo.internal.q0.a.checkArgument(j10 >= 0);
            this.f65740a = i10;
            this.f65741b = j10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final io.odeeo.internal.a0.n f65742a;

        /* renamed from: b, reason: collision with root package name */
        public final io.odeeo.internal.a0.q f65743b;

        /* renamed from: c, reason: collision with root package name */
        public final IOException f65744c;

        /* renamed from: d, reason: collision with root package name */
        public final int f65745d;

        public c(io.odeeo.internal.a0.n nVar, io.odeeo.internal.a0.q qVar, IOException iOException, int i10) {
            this.f65742a = nVar;
            this.f65743b = qVar;
            this.f65744c = iOException;
            this.f65745d = i10;
        }
    }

    b getFallbackSelectionFor(a aVar, c cVar);

    int getMinimumLoadableRetryCount(int i10);

    long getRetryDelayMsFor(c cVar);

    default void onLoadTaskConcluded(long j10) {
    }
}
