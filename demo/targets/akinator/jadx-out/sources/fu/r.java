package fu;

import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class r extends u {

    /* renamed from: e, reason: collision with root package name */
    public long f56086e;

    public r(ThreadFactory threadFactory) {
        super(threadFactory);
        this.f56086e = 0L;
    }

    public long getExpirationTime() {
        return this.f56086e;
    }

    public void setExpirationTime(long j10) {
        this.f56086e = j10;
    }
}
