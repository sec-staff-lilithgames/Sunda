package so;

import ko.a0;
import ko.l0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d extends l0 {

    /* renamed from: b, reason: collision with root package name */
    public final long f86061b;

    public d(a0 a0Var, long j10) {
        super(a0Var);
        io.bidmachine.media3.common.util.a.checkArgument(a0Var.getPosition() >= j10);
        this.f86061b = j10;
    }

    @Override // ko.l0, ko.a0
    public long getLength() {
        return super.getLength() - this.f86061b;
    }

    @Override // ko.l0, ko.a0
    public long getPeekPosition() {
        return super.getPeekPosition() - this.f86061b;
    }

    @Override // ko.l0, ko.a0
    public long getPosition() {
        return super.getPosition() - this.f86061b;
    }

    @Override // ko.l0, ko.a0
    public <E extends Throwable> void setRetryPosition(long j10, E e10) throws Throwable {
        super.setRetryPosition(j10 + this.f86061b, e10);
    }
}
