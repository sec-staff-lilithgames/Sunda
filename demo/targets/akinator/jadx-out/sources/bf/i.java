package bf;

import android.os.Handler;
import com.google.android.exoplayer2.m3;
import com.google.android.exoplayer2.u1;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class i extends a {

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f9268h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public Handler f9269i;

    /* renamed from: j, reason: collision with root package name */
    public qf.c1 f9270j;

    @Override // bf.a
    public final void a() {
        for (h hVar : this.f9268h.values()) {
            hVar.f9255a.disable(hVar.f9256b);
        }
    }

    @Override // bf.a
    public final void b() {
        for (h hVar : this.f9268h.values()) {
            hVar.f9255a.enable(hVar.f9256b);
        }
    }

    @Override // bf.a, bf.f0
    public abstract /* synthetic */ a0 createPeriod(d0 d0Var, qf.c cVar, long j10);

    public abstract d0 e(Object obj, d0 d0Var);

    @Override // bf.a, bf.f0
    public /* bridge */ /* synthetic */ m3 getInitialTimeline() {
        return super.getInitialTimeline();
    }

    @Override // bf.a, bf.f0
    public abstract /* synthetic */ u1 getMediaItem();

    public abstract void h(Object obj, f0 f0Var, m3 m3Var);

    public final void i(final Object obj, f0 f0Var) {
        HashMap map = this.f9268h;
        com.google.android.exoplayer2.util.a.checkArgument(!map.containsKey(obj));
        e0 e0Var = new e0() { // from class: bf.f
            @Override // bf.e0
            public final void onSourceInfoRefreshed(f0 f0Var2, m3 m3Var) {
                this.f9229a.h(obj, f0Var2, m3Var);
            }
        };
        g gVar = new g(this, obj);
        map.put(obj, new h(f0Var, e0Var, gVar));
        f0Var.addEventListener((Handler) com.google.android.exoplayer2.util.a.checkNotNull(this.f9269i), gVar);
        f0Var.addDrmEventListener((Handler) com.google.android.exoplayer2.util.a.checkNotNull(this.f9269i), gVar);
        f0Var.prepareSource(e0Var, this.f9270j, (zd.c0) com.google.android.exoplayer2.util.a.checkStateNotNull(this.f9166g));
        if (this.f9161b.isEmpty()) {
            f0Var.disable(e0Var);
        }
    }

    @Override // bf.a, bf.f0
    public /* bridge */ /* synthetic */ boolean isSingleWindow() {
        return super.isSingleWindow();
    }

    @Override // bf.a, bf.f0
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        Iterator it = this.f9268h.values().iterator();
        while (it.hasNext()) {
            ((h) it.next()).f9255a.maybeThrowSourceInfoRefreshError();
        }
    }

    @Override // bf.a, bf.f0
    public abstract /* synthetic */ void releasePeriod(a0 a0Var);

    @Override // bf.a
    public void releaseSourceInternal() {
        HashMap map = this.f9268h;
        for (h hVar : map.values()) {
            f0 f0Var = hVar.f9255a;
            g gVar = hVar.f9257c;
            f0 f0Var2 = hVar.f9255a;
            f0Var.releaseSource(hVar.f9256b);
            f0Var2.removeEventListener(gVar);
            f0Var2.removeDrmEventListener(gVar);
        }
        map.clear();
    }

    public long f(Object obj, long j10) {
        return j10;
    }

    public int g(Object obj, int i10) {
        return i10;
    }
}
