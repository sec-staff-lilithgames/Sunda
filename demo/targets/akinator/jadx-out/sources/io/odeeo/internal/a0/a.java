package io.odeeo.internal.a0;

import android.os.Handler;
import android.os.Looper;
import io.odeeo.internal.a0.t;
import io.odeeo.internal.a0.u;
import io.odeeo.internal.b.y0;
import io.odeeo.internal.f.g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class a implements t {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<t.b> f62204a = new ArrayList<>(1);

    /* renamed from: b, reason: collision with root package name */
    public final HashSet<t.b> f62205b = new HashSet<>(1);

    /* renamed from: c, reason: collision with root package name */
    public final u.a f62206c = new u.a();

    /* renamed from: d, reason: collision with root package name */
    public final g.a f62207d = new g.a();

    /* renamed from: e, reason: collision with root package name */
    public Looper f62208e;

    /* renamed from: f, reason: collision with root package name */
    public y0 f62209f;

    public void a() {
    }

    @Override // io.odeeo.internal.a0.t
    public final void addDrmEventListener(Handler handler, io.odeeo.internal.f.g gVar) {
        io.odeeo.internal.q0.a.checkNotNull(handler);
        io.odeeo.internal.q0.a.checkNotNull(gVar);
        this.f62207d.addEventListener(handler, gVar);
    }

    @Override // io.odeeo.internal.a0.t
    public final void addEventListener(Handler handler, u uVar) {
        io.odeeo.internal.q0.a.checkNotNull(handler);
        io.odeeo.internal.q0.a.checkNotNull(uVar);
        this.f62206c.addEventListener(handler, uVar);
    }

    public void b() {
    }

    public final boolean c() {
        return !this.f62205b.isEmpty();
    }

    @Override // io.odeeo.internal.a0.t
    public abstract /* synthetic */ r createPeriod(t.a aVar, io.odeeo.internal.p0.b bVar, long j10);

    @Override // io.odeeo.internal.a0.t
    public final void disable(t.b bVar) {
        boolean zIsEmpty = this.f62205b.isEmpty();
        this.f62205b.remove(bVar);
        if (zIsEmpty || !this.f62205b.isEmpty()) {
            return;
        }
        a();
    }

    @Override // io.odeeo.internal.a0.t
    public final void enable(t.b bVar) {
        io.odeeo.internal.q0.a.checkNotNull(this.f62208e);
        boolean zIsEmpty = this.f62205b.isEmpty();
        this.f62205b.add(bVar);
        if (zIsEmpty) {
            b();
        }
    }

    @Override // io.odeeo.internal.a0.t
    public /* bridge */ /* synthetic */ y0 getInitialTimeline() {
        return super.getInitialTimeline();
    }

    @Override // io.odeeo.internal.a0.t
    public abstract /* synthetic */ io.odeeo.internal.b.z getMediaItem();

    @Override // io.odeeo.internal.a0.t
    public /* bridge */ /* synthetic */ boolean isSingleWindow() {
        return super.isSingleWindow();
    }

    @Override // io.odeeo.internal.a0.t
    public abstract /* synthetic */ void maybeThrowSourceInfoRefreshError() throws IOException;

    @Override // io.odeeo.internal.a0.t
    public final void prepareSource(t.b bVar, io.odeeo.internal.p0.b0 b0Var) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f62208e;
        io.odeeo.internal.q0.a.checkArgument(looper == null || looper == looperMyLooper);
        y0 y0Var = this.f62209f;
        this.f62204a.add(bVar);
        if (this.f62208e == null) {
            this.f62208e = looperMyLooper;
            this.f62205b.add(bVar);
            prepareSourceInternal(b0Var);
        } else if (y0Var != null) {
            enable(bVar);
            bVar.onSourceInfoRefreshed(this, y0Var);
        }
    }

    public abstract void prepareSourceInternal(io.odeeo.internal.p0.b0 b0Var);

    @Override // io.odeeo.internal.a0.t
    public abstract /* synthetic */ void releasePeriod(r rVar);

    @Override // io.odeeo.internal.a0.t
    public final void releaseSource(t.b bVar) {
        this.f62204a.remove(bVar);
        if (!this.f62204a.isEmpty()) {
            disable(bVar);
            return;
        }
        this.f62208e = null;
        this.f62209f = null;
        this.f62205b.clear();
        releaseSourceInternal();
    }

    public abstract void releaseSourceInternal();

    @Override // io.odeeo.internal.a0.t
    public final void removeDrmEventListener(io.odeeo.internal.f.g gVar) {
        this.f62207d.removeEventListener(gVar);
    }

    @Override // io.odeeo.internal.a0.t
    public final void removeEventListener(u uVar) {
        this.f62206c.removeEventListener(uVar);
    }

    public final void a(y0 y0Var) {
        this.f62209f = y0Var;
        Iterator<t.b> it = this.f62204a.iterator();
        while (it.hasNext()) {
            it.next().onSourceInfoRefreshed(this, y0Var);
        }
    }

    public final u.a b(t.a aVar) {
        return this.f62206c.withParameters(0, aVar, 0L);
    }

    public final u.a a(int i10, t.a aVar, long j10) {
        return this.f62206c.withParameters(i10, aVar, j10);
    }

    public final g.a a(t.a aVar) {
        return this.f62207d.withParameters(0, aVar);
    }

    public final g.a a(int i10, t.a aVar) {
        return this.f62207d.withParameters(i10, aVar);
    }
}
