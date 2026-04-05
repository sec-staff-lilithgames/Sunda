package io.odeeo.internal.d0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.ZQ.duhsDlGWdBkekB;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.b.q0;
import io.odeeo.internal.b.t;
import io.odeeo.internal.b.u;
import io.odeeo.internal.q0.g0;
import io.odeeo.internal.q0.p;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class n extends io.odeeo.internal.b.e implements Handler.Callback {
    public int A;
    public long B;

    /* renamed from: n, reason: collision with root package name */
    public final Handler f63605n;

    /* renamed from: o, reason: collision with root package name */
    public final m f63606o;

    /* renamed from: p, reason: collision with root package name */
    public final i f63607p;

    /* renamed from: q, reason: collision with root package name */
    public final u f63608q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f63609r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f63610s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f63611t;

    /* renamed from: u, reason: collision with root package name */
    public int f63612u;

    /* renamed from: v, reason: collision with root package name */
    public t f63613v;

    /* renamed from: w, reason: collision with root package name */
    public g f63614w;

    /* renamed from: x, reason: collision with root package name */
    public k f63615x;

    /* renamed from: y, reason: collision with root package name */
    public l f63616y;

    /* renamed from: z, reason: collision with root package name */
    public l f63617z;

    public n(m mVar, Looper looper) {
        this(mVar, looper, i.f63590a);
    }

    @Override // io.odeeo.internal.b.e
    public void a(t[] tVarArr, long j10, long j11) {
        this.f63613v = tVarArr[0];
        if (this.f63614w != null) {
            this.f63612u = 1;
        } else {
            l();
        }
    }

    public final void b(List<a> list) {
        Handler handler = this.f63605n;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            a(list);
        }
    }

    @Override // io.odeeo.internal.b.e
    public void f() {
        this.f63613v = null;
        this.B = C.TIME_UNSET;
        j();
        n();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        a((List<a>) message.obj);
        return true;
    }

    @Override // io.odeeo.internal.b.e, io.odeeo.internal.b.p0
    public boolean isEnded() {
        return this.f63610s;
    }

    @Override // io.odeeo.internal.b.e, io.odeeo.internal.b.p0
    public boolean isReady() {
        return true;
    }

    public final void j() {
        b(Collections.EMPTY_LIST);
    }

    public final long k() {
        if (this.A == -1) {
            return Long.MAX_VALUE;
        }
        io.odeeo.internal.q0.a.checkNotNull(this.f63616y);
        if (this.A >= this.f63616y.getEventTimeCount()) {
            return Long.MAX_VALUE;
        }
        return this.f63616y.getEventTime(this.A);
    }

    public final void l() {
        this.f63611t = true;
        this.f63614w = this.f63607p.createDecoder((t) io.odeeo.internal.q0.a.checkNotNull(this.f63613v));
    }

    public final void m() {
        this.f63615x = null;
        this.A = -1;
        l lVar = this.f63616y;
        if (lVar != null) {
            lVar.release();
            this.f63616y = null;
        }
        l lVar2 = this.f63617z;
        if (lVar2 != null) {
            lVar2.release();
            this.f63617z = null;
        }
    }

    public final void n() {
        m();
        ((g) io.odeeo.internal.q0.a.checkNotNull(this.f63614w)).release();
        this.f63614w = null;
        this.f63612u = 0;
    }

    public final void o() {
        n();
        l();
    }

    @Override // io.odeeo.internal.b.e, io.odeeo.internal.b.p0
    public void render(long j10, long j11) throws io.odeeo.internal.e.f {
        boolean z10;
        if (isCurrentStreamFinal()) {
            long j12 = this.B;
            if (j12 != C.TIME_UNSET && j10 >= j12) {
                m();
                this.f63610s = true;
            }
        }
        if (this.f63610s) {
            return;
        }
        if (this.f63617z == null) {
            ((g) io.odeeo.internal.q0.a.checkNotNull(this.f63614w)).setPositionUs(j10);
            try {
                this.f63617z = (l) ((g) io.odeeo.internal.q0.a.checkNotNull(this.f63614w)).dequeueOutputBuffer();
            } catch (h e10) {
                a(e10);
                return;
            }
        }
        if (getState() != 2) {
            return;
        }
        if (this.f63616y != null) {
            long jK = k();
            z10 = false;
            while (jK <= j10) {
                this.A++;
                jK = k();
                z10 = true;
            }
        } else {
            z10 = false;
        }
        l lVar = this.f63617z;
        if (lVar != null) {
            if (lVar.isEndOfStream()) {
                if (!z10 && k() == Long.MAX_VALUE) {
                    if (this.f63612u == 2) {
                        o();
                    } else {
                        m();
                        this.f63610s = true;
                    }
                }
            } else if (lVar.f63713b <= j10) {
                l lVar2 = this.f63616y;
                if (lVar2 != null) {
                    lVar2.release();
                }
                this.A = lVar.getNextEventTimeIndex(j10);
                this.f63616y = lVar;
                this.f63617z = null;
                z10 = true;
            }
        }
        if (z10) {
            io.odeeo.internal.q0.a.checkNotNull(this.f63616y);
            b(this.f63616y.getCues(j10));
        }
        if (this.f63612u == 2) {
            return;
        }
        while (!this.f63609r) {
            try {
                k kVar = this.f63615x;
                if (kVar == null) {
                    kVar = (k) ((g) io.odeeo.internal.q0.a.checkNotNull(this.f63614w)).dequeueInputBuffer();
                    if (kVar == null) {
                        return;
                    } else {
                        this.f63615x = kVar;
                    }
                }
                if (this.f63612u == 1) {
                    kVar.setFlags(4);
                    ((g) io.odeeo.internal.q0.a.checkNotNull(this.f63614w)).queueInputBuffer(kVar);
                    this.f63615x = null;
                    this.f63612u = 2;
                    return;
                }
                int iA = a(this.f63608q, kVar, 0);
                if (iA == -4) {
                    if (kVar.isEndOfStream()) {
                        this.f63609r = true;
                        this.f63611t = false;
                    } else {
                        t tVar = this.f63608q.f63020b;
                        if (tVar == null) {
                            return;
                        }
                        kVar.f63602i = tVar.f62975p;
                        kVar.flip();
                        this.f63611t &= !kVar.isKeyFrame();
                    }
                    if (!this.f63611t) {
                        ((g) io.odeeo.internal.q0.a.checkNotNull(this.f63614w)).queueInputBuffer(kVar);
                        this.f63615x = null;
                    }
                } else if (iA == -3) {
                    return;
                }
            } catch (h e11) {
                a(e11);
                return;
            }
        }
    }

    public void setFinalStreamEndPositionUs(long j10) {
        io.odeeo.internal.q0.a.checkState(isCurrentStreamFinal());
        this.B = j10;
    }

    @Override // io.odeeo.internal.b.e, io.odeeo.internal.b.q0
    public int supportsFormat(t tVar) {
        if (this.f63607p.supportsFormat(tVar)) {
            return q0.create(tVar.E == 0 ? 4 : 2);
        }
        return io.odeeo.internal.q0.t.isText(tVar.f62971l) ? q0.create(1) : q0.create(0);
    }

    public n(m mVar, Looper looper, i iVar) {
        super(3);
        this.f63606o = (m) io.odeeo.internal.q0.a.checkNotNull(mVar);
        this.f63605n = looper == null ? null : g0.createHandler(looper, this);
        this.f63607p = iVar;
        this.f63608q = new u();
        this.B = C.TIME_UNSET;
    }

    @Override // io.odeeo.internal.b.e, io.odeeo.internal.b.p0, io.odeeo.internal.b.q0
    public String getName() {
        return duhsDlGWdBkekB.nzLMznXNIoi;
    }

    @Override // io.odeeo.internal.b.e
    public void a(long j10, boolean z10) {
        j();
        this.f63609r = false;
        this.f63610s = false;
        this.B = C.TIME_UNSET;
        if (this.f63612u != 0) {
            o();
        } else {
            m();
            ((g) io.odeeo.internal.q0.a.checkNotNull(this.f63614w)).flush();
        }
    }

    public final void a(List<a> list) {
        this.f63606o.onCues(list);
    }

    public final void a(h hVar) {
        p.e("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f63613v, hVar);
        j();
        o();
    }
}
