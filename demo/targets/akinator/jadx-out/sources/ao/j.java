package ao;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class j extends a {

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f7700h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public Handler f7701i;

    /* renamed from: j, reason: collision with root package name */
    public ln.g0 f7702j;

    @Override // ao.a
    public final void b() {
        for (i iVar : this.f7700h.values()) {
            iVar.f7684a.disable(iVar.f7685b);
        }
    }

    @Override // ao.a
    public final void c() {
        for (i iVar : this.f7700h.values()) {
            iVar.f7684a.enable(iVar.f7685b);
        }
    }

    @Override // ao.a, ao.m0
    public /* bridge */ /* synthetic */ boolean canUpdateMediaItem(gn.p0 p0Var) {
        return super.canUpdateMediaItem(p0Var);
    }

    @Override // ao.a, ao.m0
    public abstract /* synthetic */ i0 createPeriod(k0 k0Var, go.c cVar, long j10);

    public abstract k0 g(Object obj, k0 k0Var);

    @Override // ao.a, ao.m0
    public /* bridge */ /* synthetic */ gn.u1 getInitialTimeline() {
        return super.getInitialTimeline();
    }

    @Override // ao.a, ao.m0
    public abstract /* synthetic */ gn.p0 getMediaItem();

    @Override // ao.a, ao.m0
    public /* bridge */ /* synthetic */ boolean isSingleWindow() {
        return super.isSingleWindow();
    }

    public abstract void j(Object obj, m0 m0Var, gn.u1 u1Var);

    public final void k(final Object obj, m0 m0Var) {
        HashMap map = this.f7700h;
        io.bidmachine.media3.common.util.a.checkArgument(!map.containsKey(obj));
        l0 l0Var = new l0() { // from class: ao.g
            @Override // ao.l0
            public final void onSourceInfoRefreshed(m0 m0Var2, gn.u1 u1Var) {
                this.f7663a.j(obj, m0Var2, u1Var);
            }
        };
        h hVar = new h(this, obj);
        map.put(obj, new i(m0Var, l0Var, hVar));
        m0Var.addEventListener((Handler) io.bidmachine.media3.common.util.a.checkNotNull(this.f7701i), hVar);
        m0Var.addDrmEventListener((Handler) io.bidmachine.media3.common.util.a.checkNotNull(this.f7701i), hVar);
        m0Var.prepareSource(l0Var, this.f7702j, d());
        if (this.f7532b.isEmpty()) {
            m0Var.disable(l0Var);
        }
    }

    @Override // ao.a, ao.m0
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        Iterator it = this.f7700h.values().iterator();
        while (it.hasNext()) {
            ((i) it.next()).f7684a.maybeThrowSourceInfoRefreshError();
        }
    }

    @Override // ao.a, ao.m0
    public abstract /* synthetic */ void releasePeriod(i0 i0Var);

    @Override // ao.a
    public void releaseSourceInternal() {
        HashMap map = this.f7700h;
        for (i iVar : map.values()) {
            m0 m0Var = iVar.f7684a;
            h hVar = iVar.f7686c;
            m0 m0Var2 = iVar.f7684a;
            m0Var.releaseSource(iVar.f7685b);
            m0Var2.removeEventListener(hVar);
            m0Var2.removeDrmEventListener(hVar);
        }
        map.clear();
    }

    @Override // ao.a, ao.m0
    public /* bridge */ /* synthetic */ void updateMediaItem(gn.p0 p0Var) {
        super.updateMediaItem(p0Var);
    }

    public long h(Object obj, long j10) {
        return j10;
    }

    public int i(Object obj, int i10) {
        return i10;
    }
}
