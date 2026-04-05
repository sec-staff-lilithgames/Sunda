package je;

import ee.b0;
import ee.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c extends b0 {

    /* renamed from: b, reason: collision with root package name */
    public final long f69521b;

    public c(q qVar, long j10) {
        super(qVar);
        com.google.android.exoplayer2.util.a.checkArgument(qVar.getPosition() >= j10);
        this.f69521b = j10;
    }

    @Override // ee.b0, ee.q
    public long getLength() {
        return super.getLength() - this.f69521b;
    }

    @Override // ee.b0, ee.q
    public long getPeekPosition() {
        return super.getPeekPosition() - this.f69521b;
    }

    @Override // ee.b0, ee.q
    public long getPosition() {
        return super.getPosition() - this.f69521b;
    }

    @Override // ee.b0, ee.q
    public <E extends Throwable> void setRetryPosition(long j10, E e10) throws Throwable {
        super.setRetryPosition(j10 + this.f69521b, e10);
    }
}
