package ao;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class x extends a {

    /* renamed from: h, reason: collision with root package name */
    public final long f7890h;

    /* renamed from: i, reason: collision with root package name */
    public gn.p0 f7891i;

    public x(gn.p0 p0Var, long j10) {
        this.f7891i = p0Var;
        this.f7890h = j10;
    }

    @Override // ao.a, ao.m0
    public boolean canUpdateMediaItem(gn.p0 p0Var) {
        gn.j0 j0Var = p0Var.f58053b;
        gn.j0 j0Var2 = (gn.j0) io.bidmachine.media3.common.util.a.checkNotNull(getMediaItem().f58053b);
        if (j0Var == null || !j0Var.f57963a.equals(j0Var2.f57963a) || !Objects.equals(j0Var.f57964b, j0Var2.f57964b)) {
            return false;
        }
        long j10 = j0Var.f57971i;
        return j10 == C.TIME_UNSET || io.bidmachine.media3.common.util.a1.msToUs(j10) == this.f7890h;
    }

    @Override // ao.a, ao.m0
    public i0 createPeriod(k0 k0Var, go.c cVar, long j10) {
        gn.p0 mediaItem = getMediaItem();
        io.bidmachine.media3.common.util.a.checkNotNull(mediaItem.f58053b);
        gn.j0 j0Var = mediaItem.f58053b;
        io.bidmachine.media3.common.util.a.checkNotNull(j0Var.f57964b, "Externally loaded mediaItems require a MIME type.");
        return new v(j0Var.f57963a, j0Var.f57964b, null);
    }

    @Override // ao.a
    public final void e(ln.g0 g0Var) {
        f(new t1(this.f7890h, true, false, false, (Object) null, getMediaItem()));
    }

    @Override // ao.a, ao.m0
    public /* bridge */ /* synthetic */ gn.u1 getInitialTimeline() {
        return super.getInitialTimeline();
    }

    @Override // ao.a, ao.m0
    public synchronized gn.p0 getMediaItem() {
        return this.f7891i;
    }

    @Override // ao.a, ao.m0
    public /* bridge */ /* synthetic */ boolean isSingleWindow() {
        return super.isSingleWindow();
    }

    @Override // ao.a, ao.m0
    public void releasePeriod(i0 i0Var) {
        ((v) i0Var).releasePeriod();
    }

    @Override // ao.a, ao.m0
    public synchronized void updateMediaItem(gn.p0 p0Var) {
        this.f7891i = p0Var;
    }

    @Override // ao.a, ao.m0
    public void maybeThrowSourceInfoRefreshError() {
    }

    @Override // ao.a
    public final void releaseSourceInternal() {
    }
}
