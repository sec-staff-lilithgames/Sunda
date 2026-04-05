package on;

import android.media.metrics.LogSessionId;
import io.bidmachine.media3.common.util.a1;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f0 {

    /* renamed from: d, reason: collision with root package name */
    public static final f0 f79624d = new f0("");

    /* renamed from: a, reason: collision with root package name */
    public final String f79625a;

    /* renamed from: b, reason: collision with root package name */
    public final a f79626b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f79627c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public LogSessionId f79628a = LogSessionId.LOG_SESSION_ID_NONE;

        public void setLogSessionId(LogSessionId logSessionId) {
            io.bidmachine.media3.common.util.a.checkState(this.f79628a.equals(LogSessionId.LOG_SESSION_ID_NONE));
            this.f79628a = logSessionId;
        }
    }

    public f0(String str) {
        this.f79625a = str;
        this.f79626b = a1.f60679a >= 31 ? new a() : null;
        this.f79627c = new Object();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return Objects.equals(this.f79625a, f0Var.f79625a) && Objects.equals(this.f79626b, f0Var.f79626b) && Objects.equals(this.f79627c, f0Var.f79627c);
    }

    public synchronized LogSessionId getLogSessionId() {
        return ((a) io.bidmachine.media3.common.util.a.checkNotNull(this.f79626b)).f79628a;
    }

    public int hashCode() {
        return Objects.hash(this.f79625a, this.f79626b, this.f79627c);
    }

    public synchronized void setLogSessionId(LogSessionId logSessionId) {
        ((a) io.bidmachine.media3.common.util.a.checkNotNull(this.f79626b)).setLogSessionId(logSessionId);
    }
}
