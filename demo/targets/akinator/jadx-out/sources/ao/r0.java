package ao;

import android.os.Handler;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f7805a;

    /* renamed from: b, reason: collision with root package name */
    public final k0 f7806b;

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f7807c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f7808a;

        /* renamed from: b, reason: collision with root package name */
        public final s0 f7809b;

        public a(Handler handler, s0 s0Var) {
            this.f7808a = handler;
            this.f7809b = s0Var;
        }
    }

    public r0() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    public void addEventListener(Handler handler, s0 s0Var) {
        io.bidmachine.media3.common.util.a.checkNotNull(handler);
        io.bidmachine.media3.common.util.a.checkNotNull(s0Var);
        this.f7807c.add(new a(handler, s0Var));
    }

    public void dispatchEvent(io.bidmachine.media3.common.util.k kVar) {
        Iterator it = this.f7807c.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            io.bidmachine.media3.common.util.a1.postOrRun(aVar.f7808a, new af.n(5, kVar, aVar.f7809b));
        }
    }

    public void downstreamFormatChanged(int i10, io.bidmachine.media3.common.b bVar, int i11, Object obj, long j10) {
        downstreamFormatChanged(new g0(1, i10, bVar, i11, obj, io.bidmachine.media3.common.util.a1.usToMs(j10), C.TIME_UNSET));
    }

    public void loadCanceled(b0 b0Var, int i10) {
        loadCanceled(b0Var, i10, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET);
    }

    public void loadCompleted(b0 b0Var, int i10) {
        loadCompleted(b0Var, i10, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET);
    }

    public void loadError(b0 b0Var, int i10, IOException iOException, boolean z10) {
        loadError(b0Var, i10, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET, iOException, z10);
    }

    @Deprecated
    public void loadStarted(b0 b0Var, int i10) {
        loadStarted(b0Var, i10, 0);
    }

    public void removeEventListener(s0 s0Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f7807c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.f7809b == s0Var) {
                copyOnWriteArrayList.remove(aVar);
            }
        }
    }

    public void upstreamDiscarded(int i10, long j10, long j11) {
        upstreamDiscarded(new g0(1, i10, null, 3, null, io.bidmachine.media3.common.util.a1.usToMs(j10), io.bidmachine.media3.common.util.a1.usToMs(j11)));
    }

    public r0 withParameters(int i10, k0 k0Var) {
        return new r0(this.f7807c, i10, k0Var);
    }

    public r0(CopyOnWriteArrayList copyOnWriteArrayList, int i10, k0 k0Var) {
        this.f7807c = copyOnWriteArrayList;
        this.f7805a = i10;
        this.f7806b = k0Var;
    }

    public void loadCanceled(b0 b0Var, int i10, int i11, io.bidmachine.media3.common.b bVar, int i12, Object obj, long j10, long j11) {
        loadCanceled(b0Var, new g0(i10, i11, bVar, i12, obj, io.bidmachine.media3.common.util.a1.usToMs(j10), io.bidmachine.media3.common.util.a1.usToMs(j11)));
    }

    public void loadCompleted(b0 b0Var, int i10, int i11, io.bidmachine.media3.common.b bVar, int i12, Object obj, long j10, long j11) {
        loadCompleted(b0Var, new g0(i10, i11, bVar, i12, obj, io.bidmachine.media3.common.util.a1.usToMs(j10), io.bidmachine.media3.common.util.a1.usToMs(j11)));
    }

    public void loadError(b0 b0Var, int i10, int i11, io.bidmachine.media3.common.b bVar, int i12, Object obj, long j10, long j11, IOException iOException, boolean z10) {
        loadError(b0Var, new g0(i10, i11, bVar, i12, obj, io.bidmachine.media3.common.util.a1.usToMs(j10), io.bidmachine.media3.common.util.a1.usToMs(j11)), iOException, z10);
    }

    public void loadStarted(b0 b0Var, int i10, int i11) {
        loadStarted(b0Var, i10, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET, i11);
    }

    @Deprecated
    public r0 withParameters(int i10, k0 k0Var, long j10) {
        return new r0(this.f7807c, i10, k0Var);
    }

    @Deprecated
    public void loadStarted(b0 b0Var, int i10, int i11, io.bidmachine.media3.common.b bVar, int i12, Object obj, long j10, long j11) {
        loadStarted(b0Var, new g0(i10, i11, bVar, i12, obj, io.bidmachine.media3.common.util.a1.usToMs(j10), io.bidmachine.media3.common.util.a1.usToMs(j11)));
    }

    public void downstreamFormatChanged(g0 g0Var) {
        dispatchEvent(new n(1, this, g0Var));
    }

    public void upstreamDiscarded(g0 g0Var) {
        dispatchEvent(new q0(this, 0, (k0) io.bidmachine.media3.common.util.a.checkNotNull(this.f7806b), g0Var));
    }

    public void loadCanceled(b0 b0Var, g0 g0Var) {
        dispatchEvent(new p0(this, b0Var, g0Var, 1));
    }

    public void loadCompleted(b0 b0Var, g0 g0Var) {
        dispatchEvent(new p0(this, b0Var, g0Var, 0));
    }

    public void loadError(b0 b0Var, g0 g0Var, IOException iOException, boolean z10) {
        dispatchEvent(new n0(this, b0Var, g0Var, iOException, z10, 0));
    }

    public void loadStarted(b0 b0Var, int i10, int i11, io.bidmachine.media3.common.b bVar, int i12, Object obj, long j10, long j11, int i13) {
        loadStarted(b0Var, new g0(i10, i11, bVar, i12, obj, io.bidmachine.media3.common.util.a1.usToMs(j10), io.bidmachine.media3.common.util.a1.usToMs(j11)), i13);
    }

    @Deprecated
    public void loadStarted(b0 b0Var, g0 g0Var) {
        loadStarted(b0Var, g0Var, 0);
    }

    public void loadStarted(b0 b0Var, g0 g0Var, int i10) {
        dispatchEvent(new o0(this, b0Var, g0Var, i10, 0));
    }
}
