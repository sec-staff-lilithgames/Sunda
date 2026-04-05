package ef;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.a1;
import com.google.android.exoplayer2.b3;
import com.google.android.exoplayer2.p0;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.l0;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.z0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import nh.b5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class s extends com.google.android.exoplayer2.f implements Handler.Callback {
    public p A;
    public q B;
    public q C;
    public int D;
    public long E;
    public long F;
    public long G;

    /* renamed from: q, reason: collision with root package name */
    public final Handler f54338q;

    /* renamed from: r, reason: collision with root package name */
    public final r f54339r;

    /* renamed from: s, reason: collision with root package name */
    public final n f54340s;

    /* renamed from: t, reason: collision with root package name */
    public final a1 f54341t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f54342u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f54343v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f54344w;

    /* renamed from: x, reason: collision with root package name */
    public int f54345x;

    /* renamed from: y, reason: collision with root package name */
    public z0 f54346y;

    /* renamed from: z, reason: collision with root package name */
    public k f54347z;

    public s(r rVar, Looper looper) {
        this(rVar, looper, n.f54323a);
    }

    @Override // com.google.android.exoplayer2.f
    public final void b() {
        this.f54346y = null;
        this.E = C.TIME_UNSET;
        k();
        this.F = C.TIME_UNSET;
        this.G = C.TIME_UNSET;
        n();
        ((k) com.google.android.exoplayer2.util.a.checkNotNull(this.f54347z)).release();
        this.f54347z = null;
        this.f54345x = 0;
    }

    @Override // com.google.android.exoplayer2.f
    public final void d(long j10, boolean z10) {
        this.G = j10;
        k();
        this.f54342u = false;
        this.f54343v = false;
        this.E = C.TIME_UNSET;
        if (this.f54345x == 0) {
            n();
            ((k) com.google.android.exoplayer2.util.a.checkNotNull(this.f54347z)).flush();
            return;
        }
        n();
        ((k) com.google.android.exoplayer2.util.a.checkNotNull(this.f54347z)).release();
        this.f54347z = null;
        this.f54345x = 0;
        this.f54344w = true;
        this.f54347z = ((m) this.f54340s).createDecoder((z0) com.google.android.exoplayer2.util.a.checkNotNull(this.f54346y));
    }

    @Override // com.google.android.exoplayer2.f, com.google.android.exoplayer2.z2, com.google.android.exoplayer2.b3
    public String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        e eVar = (e) message.obj;
        b5 b5Var = eVar.f54311b;
        p0 p0Var = (p0) this.f54339r;
        p0Var.onCues(b5Var);
        p0Var.onCues(eVar);
        return true;
    }

    @Override // com.google.android.exoplayer2.f
    public final void i(z0[] z0VarArr, long j10, long j11) {
        this.F = j11;
        z0 z0Var = z0VarArr[0];
        this.f54346y = z0Var;
        if (this.f54347z != null) {
            this.f54345x = 1;
            return;
        }
        this.f54344w = true;
        this.f54347z = ((m) this.f54340s).createDecoder((z0) com.google.android.exoplayer2.util.a.checkNotNull(z0Var));
    }

    @Override // com.google.android.exoplayer2.f, com.google.android.exoplayer2.z2
    public boolean isEnded() {
        return this.f54343v;
    }

    @Override // com.google.android.exoplayer2.f, com.google.android.exoplayer2.z2
    public boolean isReady() {
        return true;
    }

    public final void k() {
        e eVar = new e(b5.of(), m(this.G));
        Handler handler = this.f54338q;
        if (handler != null) {
            handler.obtainMessage(0, eVar).sendToTarget();
            return;
        }
        p0 p0Var = (p0) this.f54339r;
        p0Var.onCues(eVar.f54311b);
        p0Var.onCues(eVar);
    }

    public final long l() {
        if (this.D == -1) {
            return Long.MAX_VALUE;
        }
        com.google.android.exoplayer2.util.a.checkNotNull(this.B);
        if (this.D >= this.B.getEventTimeCount()) {
            return Long.MAX_VALUE;
        }
        return this.B.getEventTime(this.D);
    }

    public final long m(long j10) {
        com.google.android.exoplayer2.util.a.checkState(j10 != C.TIME_UNSET);
        com.google.android.exoplayer2.util.a.checkState(this.F != C.TIME_UNSET);
        return j10 - this.F;
    }

    public final void n() {
        this.A = null;
        this.D = -1;
        q qVar = this.B;
        if (qVar != null) {
            qVar.release();
            this.B = null;
        }
        q qVar2 = this.C;
        if (qVar2 != null) {
            qVar2.release();
            this.C = null;
        }
    }

    @Override // com.google.android.exoplayer2.f, com.google.android.exoplayer2.z2
    public void render(long j10, long j11) throws ce.g {
        boolean z10;
        long eventTime;
        a1 a1Var = this.f54341t;
        this.G = j10;
        if (isCurrentStreamFinal()) {
            long j12 = this.E;
            if (j12 != C.TIME_UNSET && j10 >= j12) {
                n();
                this.f54343v = true;
            }
        }
        if (this.f54343v) {
            return;
        }
        q qVar = this.C;
        n nVar = this.f54340s;
        if (qVar == null) {
            ((k) com.google.android.exoplayer2.util.a.checkNotNull(this.f54347z)).setPositionUs(j10);
            try {
                this.C = (q) ((k) com.google.android.exoplayer2.util.a.checkNotNull(this.f54347z)).dequeueOutputBuffer();
            } catch (l e10) {
                f0.e("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f54346y, e10);
                k();
                n();
                ((k) com.google.android.exoplayer2.util.a.checkNotNull(this.f54347z)).release();
                this.f54347z = null;
                this.f54345x = 0;
                this.f54344w = true;
                this.f54347z = ((m) nVar).createDecoder((z0) com.google.android.exoplayer2.util.a.checkNotNull(this.f54346y));
                return;
            }
        }
        if (getState() != 2) {
            return;
        }
        if (this.B != null) {
            long jL = l();
            z10 = false;
            while (jL <= j10) {
                this.D++;
                jL = l();
                z10 = true;
            }
        } else {
            z10 = false;
        }
        q qVar2 = this.C;
        if (qVar2 != null) {
            if (qVar2.isEndOfStream()) {
                if (!z10 && l() == Long.MAX_VALUE) {
                    if (this.f54345x == 2) {
                        n();
                        ((k) com.google.android.exoplayer2.util.a.checkNotNull(this.f54347z)).release();
                        this.f54347z = null;
                        this.f54345x = 0;
                        this.f54344w = true;
                        this.f54347z = ((m) nVar).createDecoder((z0) com.google.android.exoplayer2.util.a.checkNotNull(this.f54346y));
                    } else {
                        n();
                        this.f54343v = true;
                    }
                }
            } else if (qVar2.f12243c <= j10) {
                q qVar3 = this.B;
                if (qVar3 != null) {
                    qVar3.release();
                }
                this.D = qVar2.getNextEventTimeIndex(j10);
                this.B = qVar2;
                this.C = null;
                z10 = true;
            }
        }
        if (z10) {
            com.google.android.exoplayer2.util.a.checkNotNull(this.B);
            int nextEventTimeIndex = this.B.getNextEventTimeIndex(j10);
            if (nextEventTimeIndex == 0 || this.B.getEventTimeCount() == 0) {
                eventTime = this.B.f12243c;
            } else if (nextEventTimeIndex == -1) {
                q qVar4 = this.B;
                eventTime = qVar4.getEventTime(qVar4.getEventTimeCount() - 1);
            } else {
                eventTime = this.B.getEventTime(nextEventTimeIndex - 1);
            }
            e eVar = new e(this.B.getCues(j10), m(eventTime));
            Handler handler = this.f54338q;
            if (handler != null) {
                handler.obtainMessage(0, eVar).sendToTarget();
            } else {
                p0 p0Var = (p0) this.f54339r;
                p0Var.onCues(eVar.f54311b);
                p0Var.onCues(eVar);
            }
        }
        if (this.f54345x == 2) {
            return;
        }
        while (!this.f54342u) {
            try {
                p pVar = this.A;
                if (pVar == null) {
                    pVar = (p) ((k) com.google.android.exoplayer2.util.a.checkNotNull(this.f54347z)).dequeueInputBuffer();
                    if (pVar == null) {
                        return;
                    } else {
                        this.A = pVar;
                    }
                }
                if (this.f54345x == 1) {
                    pVar.setFlags(4);
                    ((k) com.google.android.exoplayer2.util.a.checkNotNull(this.f54347z)).queueInputBuffer(pVar);
                    this.A = null;
                    this.f54345x = 2;
                    return;
                }
                int iJ = j(a1Var, pVar, 0);
                if (iJ == -4) {
                    if (pVar.isEndOfStream()) {
                        this.f54342u = true;
                        this.f54344w = false;
                    } else {
                        z0 z0Var = a1Var.f27030b;
                        if (z0Var == null) {
                            return;
                        }
                        pVar.f54335k = z0Var.f28806r;
                        pVar.flip();
                        this.f54344w &= !pVar.isKeyFrame();
                    }
                    if (!this.f54344w) {
                        ((k) com.google.android.exoplayer2.util.a.checkNotNull(this.f54347z)).queueInputBuffer(pVar);
                        this.A = null;
                    }
                } else if (iJ == -3) {
                    return;
                }
            } catch (l e11) {
                f0.e("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f54346y, e11);
                k();
                n();
                ((k) com.google.android.exoplayer2.util.a.checkNotNull(this.f54347z)).release();
                this.f54347z = null;
                this.f54345x = 0;
                this.f54344w = true;
                this.f54347z = ((m) nVar).createDecoder((z0) com.google.android.exoplayer2.util.a.checkNotNull(this.f54346y));
                return;
            }
        }
    }

    public void setFinalStreamEndPositionUs(long j10) {
        com.google.android.exoplayer2.util.a.checkState(isCurrentStreamFinal());
        this.E = j10;
    }

    @Override // com.google.android.exoplayer2.f, com.google.android.exoplayer2.z2
    public /* bridge */ /* synthetic */ void setPlaybackSpeed(float f10, float f11) throws com.google.android.exoplayer2.r {
        super.setPlaybackSpeed(f10, f11);
    }

    @Override // com.google.android.exoplayer2.f, com.google.android.exoplayer2.b3
    public int supportsFormat(z0 z0Var) {
        if (((m) this.f54340s).supportsFormat(z0Var)) {
            return b3.create(z0Var.I == 0 ? 4 : 2);
        }
        return l0.isText(z0Var.f28802n) ? b3.create(1) : b3.create(0);
    }

    public s(r rVar, Looper looper, n nVar) {
        super(3);
        this.f54339r = (r) com.google.android.exoplayer2.util.a.checkNotNull(rVar);
        this.f54338q = looper == null ? null : n1.createHandler(looper, this);
        this.f54340s = nVar;
        this.f54341t = new a1();
        this.E = C.TIME_UNSET;
        this.F = C.TIME_UNSET;
        this.G = C.TIME_UNSET;
    }
}
