package zd;

import android.media.metrics.LogSessionId;
import com.google.android.exoplayer2.util.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c0 {

    /* renamed from: b, reason: collision with root package name */
    public static final c0 f97809b;

    /* renamed from: a, reason: collision with root package name */
    public final a f97810a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f97811b = new a(LogSessionId.LOG_SESSION_ID_NONE);

        /* renamed from: a, reason: collision with root package name */
        public final LogSessionId f97812a;

        public a(LogSessionId logSessionId) {
            this.f97812a = logSessionId;
        }
    }

    static {
        f97809b = n1.f28506a < 31 ? new c0() : new c0(a.f97811b);
    }

    public c0() {
        this((a) null);
        com.google.android.exoplayer2.util.a.checkState(n1.f28506a < 31);
    }

    public LogSessionId getLogSessionId() {
        return ((a) com.google.android.exoplayer2.util.a.checkNotNull(this.f97810a)).f97812a;
    }

    public c0(LogSessionId logSessionId) {
        this(new a(logSessionId));
    }

    public c0(a aVar) {
        this.f97810a = aVar;
    }
}
