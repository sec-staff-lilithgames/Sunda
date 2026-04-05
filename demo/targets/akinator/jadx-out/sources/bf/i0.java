package bf;

import android.os.Handler;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f9271a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f9272b;

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f9273c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f9274a;

        /* renamed from: b, reason: collision with root package name */
        public final j0 f9275b;

        public a(Handler handler, j0 j0Var) {
            this.f9274a = handler;
            this.f9275b = j0Var;
        }
    }

    public i0() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    public void addEventListener(Handler handler, j0 j0Var) {
        com.google.android.exoplayer2.util.a.checkNotNull(handler);
        com.google.android.exoplayer2.util.a.checkNotNull(j0Var);
        this.f9273c.add(new a(handler, j0Var));
    }

    public void downstreamFormatChanged(int i10, com.google.android.exoplayer2.z0 z0Var, int i11, Object obj, long j10) {
        downstreamFormatChanged(new y(1, i10, z0Var, i11, obj, com.google.android.exoplayer2.util.n1.usToMs(j10), C.TIME_UNSET));
    }

    public void loadCanceled(t tVar, int i10) {
        loadCanceled(tVar, i10, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET);
    }

    public void loadCompleted(t tVar, int i10) {
        loadCompleted(tVar, i10, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET);
    }

    public void loadError(t tVar, int i10, IOException iOException, boolean z10) {
        loadError(tVar, i10, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET, iOException, z10);
    }

    public void loadStarted(t tVar, int i10) {
        loadStarted(tVar, i10, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET);
    }

    public void removeEventListener(j0 j0Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f9273c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.f9275b == j0Var) {
                copyOnWriteArrayList.remove(aVar);
            }
        }
    }

    public void upstreamDiscarded(int i10, long j10, long j11) {
        upstreamDiscarded(new y(1, i10, null, 3, null, com.google.android.exoplayer2.util.n1.usToMs(j10), com.google.android.exoplayer2.util.n1.usToMs(j11)));
    }

    public i0 withParameters(int i10, d0 d0Var) {
        return new i0(this.f9273c, i10, d0Var);
    }

    public i0(CopyOnWriteArrayList copyOnWriteArrayList, int i10, d0 d0Var) {
        this.f9273c = copyOnWriteArrayList;
        this.f9271a = i10;
        this.f9272b = d0Var;
    }

    public void loadCanceled(t tVar, int i10, int i11, com.google.android.exoplayer2.z0 z0Var, int i12, Object obj, long j10, long j11) {
        loadCanceled(tVar, new y(i10, i11, z0Var, i12, obj, com.google.android.exoplayer2.util.n1.usToMs(j10), com.google.android.exoplayer2.util.n1.usToMs(j11)));
    }

    public void loadCompleted(t tVar, int i10, int i11, com.google.android.exoplayer2.z0 z0Var, int i12, Object obj, long j10, long j11) {
        loadCompleted(tVar, new y(i10, i11, z0Var, i12, obj, com.google.android.exoplayer2.util.n1.usToMs(j10), com.google.android.exoplayer2.util.n1.usToMs(j11)));
    }

    public void loadError(t tVar, int i10, int i11, com.google.android.exoplayer2.z0 z0Var, int i12, Object obj, long j10, long j11, IOException iOException, boolean z10) {
        loadError(tVar, new y(i10, i11, z0Var, i12, obj, com.google.android.exoplayer2.util.n1.usToMs(j10), com.google.android.exoplayer2.util.n1.usToMs(j11)), iOException, z10);
    }

    public void loadStarted(t tVar, int i10, int i11, com.google.android.exoplayer2.z0 z0Var, int i12, Object obj, long j10, long j11) {
        loadStarted(tVar, new y(i10, i11, z0Var, i12, obj, com.google.android.exoplayer2.util.n1.usToMs(j10), com.google.android.exoplayer2.util.n1.usToMs(j11)));
    }

    @Deprecated
    public i0 withParameters(int i10, d0 d0Var, long j10) {
        return new i0(this.f9273c, i10, d0Var);
    }

    public void downstreamFormatChanged(y yVar) {
        Iterator it = this.f9273c.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            com.google.android.exoplayer2.util.n1.postOrRun(aVar.f9274a, new androidx.browser.customtabs.g(this, 2, aVar.f9275b, yVar));
        }
    }

    public void upstreamDiscarded(y yVar) {
        d0 d0Var = (d0) com.google.android.exoplayer2.util.a.checkNotNull(this.f9272b);
        Iterator it = this.f9273c.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            com.google.android.exoplayer2.util.n1.postOrRun(aVar.f9274a, new al.a(1, this, aVar.f9275b, d0Var, yVar));
        }
    }

    public void loadCanceled(t tVar, y yVar) {
        Iterator it = this.f9273c.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            com.google.android.exoplayer2.util.n1.postOrRun(aVar.f9274a, new g0(this, aVar.f9275b, tVar, yVar, 1));
        }
    }

    public void loadCompleted(t tVar, y yVar) {
        Iterator it = this.f9273c.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            com.google.android.exoplayer2.util.n1.postOrRun(aVar.f9274a, new g0(this, aVar.f9275b, tVar, yVar, 0));
        }
    }

    public void loadError(t tVar, y yVar, IOException iOException, boolean z10) {
        Iterator it = this.f9273c.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            com.google.android.exoplayer2.util.n1.postOrRun(aVar.f9274a, new h0(this, aVar.f9275b, tVar, yVar, iOException, z10, 0));
        }
    }

    public void loadStarted(t tVar, y yVar) {
        Iterator it = this.f9273c.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            com.google.android.exoplayer2.util.n1.postOrRun(aVar.f9274a, new g0(this, aVar.f9275b, tVar, yVar, 2));
        }
    }
}
