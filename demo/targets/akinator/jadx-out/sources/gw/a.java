package gw;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f58515a;

    /* renamed from: b, reason: collision with root package name */
    public long f58516b;

    /* renamed from: c, reason: collision with root package name */
    public long f58517c;

    public a(int i10) {
        this.f58515a = i10;
    }

    public static /* synthetic */ void update$default(a aVar, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = 0;
        }
        if ((i10 & 2) != 0) {
            j11 = 0;
        }
        aVar.update(j10, j11);
    }

    public final long getAcknowledged() {
        return this.f58517c;
    }

    public final int getStreamId() {
        return this.f58515a;
    }

    public final long getTotal() {
        return this.f58516b;
    }

    public final synchronized long getUnacknowledged() {
        return this.f58516b - this.f58517c;
    }

    public String toString() {
        return "WindowCounter(streamId=" + this.f58515a + ", total=" + this.f58516b + ", acknowledged=" + this.f58517c + ", unacknowledged=" + getUnacknowledged() + ')';
    }

    public final synchronized void update(long j10, long j11) {
        try {
            if (j10 < 0) {
                throw new IllegalStateException("Check failed.");
            }
            if (j11 < 0) {
                throw new IllegalStateException("Check failed.");
            }
            long j12 = this.f58516b + j10;
            this.f58516b = j12;
            long j13 = this.f58517c + j11;
            this.f58517c = j13;
            if (j13 > j12) {
                throw new IllegalStateException("Check failed.");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
