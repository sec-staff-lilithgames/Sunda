package ao;

import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class a implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f7531a = new ArrayList(1);

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f7532b = new HashSet(1);

    /* renamed from: c, reason: collision with root package name */
    public final r0 f7533c = new r0();

    /* renamed from: d, reason: collision with root package name */
    public final sn.q f7534d = new sn.q();

    /* renamed from: e, reason: collision with root package name */
    public Looper f7535e;

    /* renamed from: f, reason: collision with root package name */
    public gn.u1 f7536f;

    /* renamed from: g, reason: collision with root package name */
    public on.f0 f7537g;

    public final r0 a(k0 k0Var) {
        return this.f7533c.withParameters(0, k0Var);
    }

    @Override // ao.m0
    public final void addDrmEventListener(Handler handler, sn.r rVar) {
        io.bidmachine.media3.common.util.a.checkNotNull(handler);
        io.bidmachine.media3.common.util.a.checkNotNull(rVar);
        this.f7534d.addEventListener(handler, rVar);
    }

    @Override // ao.m0
    public final void addEventListener(Handler handler, s0 s0Var) {
        io.bidmachine.media3.common.util.a.checkNotNull(handler);
        io.bidmachine.media3.common.util.a.checkNotNull(s0Var);
        this.f7533c.addEventListener(handler, s0Var);
    }

    @Override // ao.m0
    public /* bridge */ /* synthetic */ boolean canUpdateMediaItem(gn.p0 p0Var) {
        return super.canUpdateMediaItem(p0Var);
    }

    @Override // ao.m0
    public abstract /* synthetic */ i0 createPeriod(k0 k0Var, go.c cVar, long j10);

    public final on.f0 d() {
        return (on.f0) io.bidmachine.media3.common.util.a.checkStateNotNull(this.f7537g);
    }

    @Override // ao.m0
    public final void disable(l0 l0Var) {
        HashSet hashSet = this.f7532b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(l0Var);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        b();
    }

    public abstract void e(ln.g0 g0Var);

    @Override // ao.m0
    public final void enable(l0 l0Var) {
        io.bidmachine.media3.common.util.a.checkNotNull(this.f7535e);
        HashSet hashSet = this.f7532b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(l0Var);
        if (zIsEmpty) {
            c();
        }
    }

    public final void f(gn.u1 u1Var) {
        this.f7536f = u1Var;
        Iterator it = this.f7531a.iterator();
        while (it.hasNext()) {
            ((l0) it.next()).onSourceInfoRefreshed(this, u1Var);
        }
    }

    @Override // ao.m0
    public /* bridge */ /* synthetic */ gn.u1 getInitialTimeline() {
        return super.getInitialTimeline();
    }

    @Override // ao.m0
    public abstract /* synthetic */ gn.p0 getMediaItem();

    @Override // ao.m0
    public /* bridge */ /* synthetic */ boolean isSingleWindow() {
        return super.isSingleWindow();
    }

    @Override // ao.m0
    public abstract /* synthetic */ void maybeThrowSourceInfoRefreshError() throws IOException;

    @Override // ao.m0
    public final void prepareSource(l0 l0Var, ln.g0 g0Var) {
        prepareSource(l0Var, g0Var, on.f0.f79624d);
    }

    @Override // ao.m0
    public abstract /* synthetic */ void releasePeriod(i0 i0Var);

    @Override // ao.m0
    public final void releaseSource(l0 l0Var) {
        ArrayList arrayList = this.f7531a;
        arrayList.remove(l0Var);
        if (!arrayList.isEmpty()) {
            disable(l0Var);
            return;
        }
        this.f7535e = null;
        this.f7536f = null;
        this.f7537g = null;
        this.f7532b.clear();
        releaseSourceInternal();
    }

    public abstract void releaseSourceInternal();

    @Override // ao.m0
    public final void removeDrmEventListener(sn.r rVar) {
        this.f7534d.removeEventListener(rVar);
    }

    @Override // ao.m0
    public final void removeEventListener(s0 s0Var) {
        this.f7533c.removeEventListener(s0Var);
    }

    @Override // ao.m0
    public /* bridge */ /* synthetic */ void updateMediaItem(gn.p0 p0Var) {
        super.updateMediaItem(p0Var);
    }

    @Override // ao.m0
    public final void prepareSource(l0 l0Var, ln.g0 g0Var, on.f0 f0Var) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f7535e;
        io.bidmachine.media3.common.util.a.checkArgument(looper == null || looper == looperMyLooper);
        this.f7537g = f0Var;
        gn.u1 u1Var = this.f7536f;
        this.f7531a.add(l0Var);
        if (this.f7535e == null) {
            this.f7535e = looperMyLooper;
            this.f7532b.add(l0Var);
            e(g0Var);
        } else if (u1Var != null) {
            enable(l0Var);
            l0Var.onSourceInfoRefreshed(this, u1Var);
        }
    }

    public void b() {
    }

    public void c() {
    }
}
