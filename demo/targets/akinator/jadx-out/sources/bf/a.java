package bf;

import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.m3;
import com.google.android.exoplayer2.u1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class a implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f9160a = new ArrayList(1);

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f9161b = new HashSet(1);

    /* renamed from: c, reason: collision with root package name */
    public final i0 f9162c = new i0();

    /* renamed from: d, reason: collision with root package name */
    public final de.p f9163d = new de.p();

    /* renamed from: e, reason: collision with root package name */
    public Looper f9164e;

    /* renamed from: f, reason: collision with root package name */
    public m3 f9165f;

    /* renamed from: g, reason: collision with root package name */
    public zd.c0 f9166g;

    @Override // bf.f0
    public final void addDrmEventListener(Handler handler, de.q qVar) {
        com.google.android.exoplayer2.util.a.checkNotNull(handler);
        com.google.android.exoplayer2.util.a.checkNotNull(qVar);
        this.f9163d.addEventListener(handler, qVar);
    }

    @Override // bf.f0
    public final void addEventListener(Handler handler, j0 j0Var) {
        com.google.android.exoplayer2.util.a.checkNotNull(handler);
        com.google.android.exoplayer2.util.a.checkNotNull(j0Var);
        this.f9162c.addEventListener(handler, j0Var);
    }

    public abstract void c(qf.c1 c1Var);

    @Override // bf.f0
    public abstract /* synthetic */ a0 createPeriod(d0 d0Var, qf.c cVar, long j10);

    public final void d(m3 m3Var) {
        this.f9165f = m3Var;
        Iterator it = this.f9160a.iterator();
        while (it.hasNext()) {
            ((e0) it.next()).onSourceInfoRefreshed(this, m3Var);
        }
    }

    @Override // bf.f0
    public final void disable(e0 e0Var) {
        HashSet hashSet = this.f9161b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(e0Var);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        a();
    }

    @Override // bf.f0
    public final void enable(e0 e0Var) {
        com.google.android.exoplayer2.util.a.checkNotNull(this.f9164e);
        HashSet hashSet = this.f9161b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(e0Var);
        if (zIsEmpty) {
            b();
        }
    }

    @Override // bf.f0
    public /* bridge */ /* synthetic */ m3 getInitialTimeline() {
        return super.getInitialTimeline();
    }

    @Override // bf.f0
    public abstract /* synthetic */ u1 getMediaItem();

    @Override // bf.f0
    public /* bridge */ /* synthetic */ boolean isSingleWindow() {
        return super.isSingleWindow();
    }

    @Override // bf.f0
    public abstract /* synthetic */ void maybeThrowSourceInfoRefreshError() throws IOException;

    @Override // bf.f0
    public final void prepareSource(e0 e0Var, qf.c1 c1Var) {
        prepareSource(e0Var, c1Var, zd.c0.f97809b);
    }

    @Override // bf.f0
    public abstract /* synthetic */ void releasePeriod(a0 a0Var);

    @Override // bf.f0
    public final void releaseSource(e0 e0Var) {
        ArrayList arrayList = this.f9160a;
        arrayList.remove(e0Var);
        if (!arrayList.isEmpty()) {
            disable(e0Var);
            return;
        }
        this.f9164e = null;
        this.f9165f = null;
        this.f9166g = null;
        this.f9161b.clear();
        releaseSourceInternal();
    }

    public abstract void releaseSourceInternal();

    @Override // bf.f0
    public final void removeDrmEventListener(de.q qVar) {
        this.f9163d.removeEventListener(qVar);
    }

    @Override // bf.f0
    public final void removeEventListener(j0 j0Var) {
        this.f9162c.removeEventListener(j0Var);
    }

    @Override // bf.f0
    public final void prepareSource(e0 e0Var, qf.c1 c1Var, zd.c0 c0Var) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f9164e;
        com.google.android.exoplayer2.util.a.checkArgument(looper == null || looper == looperMyLooper);
        this.f9166g = c0Var;
        m3 m3Var = this.f9165f;
        this.f9160a.add(e0Var);
        if (this.f9164e == null) {
            this.f9164e = looperMyLooper;
            this.f9161b.add(e0Var);
            c(c1Var);
        } else if (m3Var != null) {
            enable(e0Var);
            e0Var.onSourceInfoRefreshed(this, m3Var);
        }
    }

    public void a() {
    }

    public void b() {
    }
}
