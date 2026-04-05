package io.odeeo.internal.s;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.b.q0;
import io.odeeo.internal.b.t;
import io.odeeo.internal.b.u;
import io.odeeo.internal.q0.g0;
import io.odeeo.internal.s.a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f extends io.odeeo.internal.b.e implements Handler.Callback {

    /* renamed from: n, reason: collision with root package name */
    public final c f66250n;

    /* renamed from: o, reason: collision with root package name */
    public final e f66251o;

    /* renamed from: p, reason: collision with root package name */
    public final Handler f66252p;

    /* renamed from: q, reason: collision with root package name */
    public final d f66253q;

    /* renamed from: r, reason: collision with root package name */
    public b f66254r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f66255s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f66256t;

    /* renamed from: u, reason: collision with root package name */
    public long f66257u;

    /* renamed from: v, reason: collision with root package name */
    public long f66258v;

    /* renamed from: w, reason: collision with root package name */
    public a f66259w;

    public f(e eVar, Looper looper) {
        this(eVar, looper, c.f66248a);
    }

    @Override // io.odeeo.internal.b.e
    public void a(t[] tVarArr, long j10, long j11) {
        this.f66254r = this.f66250n.createDecoder(tVarArr[0]);
    }

    public final boolean b(long j10) {
        boolean z10;
        a aVar = this.f66259w;
        if (aVar == null || this.f66258v > j10) {
            z10 = false;
        } else {
            a(aVar);
            this.f66259w = null;
            this.f66258v = C.TIME_UNSET;
            z10 = true;
        }
        if (this.f66255s && this.f66259w == null) {
            this.f66256t = true;
        }
        return z10;
    }

    @Override // io.odeeo.internal.b.e
    public void f() {
        this.f66259w = null;
        this.f66258v = C.TIME_UNSET;
        this.f66254r = null;
    }

    @Override // io.odeeo.internal.b.e, io.odeeo.internal.b.p0, io.odeeo.internal.b.q0
    public String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        b((a) message.obj);
        return true;
    }

    @Override // io.odeeo.internal.b.e, io.odeeo.internal.b.p0
    public boolean isEnded() {
        return this.f66256t;
    }

    @Override // io.odeeo.internal.b.e, io.odeeo.internal.b.p0
    public boolean isReady() {
        return true;
    }

    public final void j() {
        if (this.f66255s || this.f66259w != null) {
            return;
        }
        this.f66253q.clear();
        u uVarB = b();
        int iA = a(uVarB, this.f66253q, 0);
        if (iA != -4) {
            if (iA == -5) {
                this.f66257u = ((t) io.odeeo.internal.q0.a.checkNotNull(uVarB.f63020b)).f62975p;
                return;
            }
            return;
        }
        if (this.f66253q.isEndOfStream()) {
            this.f66255s = true;
            return;
        }
        d dVar = this.f66253q;
        dVar.f66249i = this.f66257u;
        dVar.flip();
        a aVarDecode = ((b) g0.castNonNull(this.f66254r)).decode(this.f66253q);
        if (aVarDecode != null) {
            ArrayList arrayList = new ArrayList(aVarDecode.length());
            a(aVarDecode, arrayList);
            if (arrayList.isEmpty()) {
                return;
            }
            this.f66259w = new a(arrayList);
            this.f66258v = this.f66253q.f63707e;
        }
    }

    @Override // io.odeeo.internal.b.e, io.odeeo.internal.b.p0
    public void render(long j10, long j11) {
        boolean zB = true;
        while (zB) {
            j();
            zB = b(j10);
        }
    }

    @Override // io.odeeo.internal.b.e, io.odeeo.internal.b.q0
    public int supportsFormat(t tVar) {
        if (this.f66250n.supportsFormat(tVar)) {
            return q0.create(tVar.E == 0 ? 4 : 2);
        }
        return q0.create(0);
    }

    public f(e eVar, Looper looper, c cVar) {
        super(5);
        this.f66251o = (e) io.odeeo.internal.q0.a.checkNotNull(eVar);
        this.f66252p = looper == null ? null : g0.createHandler(looper, this);
        this.f66250n = (c) io.odeeo.internal.q0.a.checkNotNull(cVar);
        this.f66253q = new d();
        this.f66258v = C.TIME_UNSET;
    }

    @Override // io.odeeo.internal.b.e
    public void a(long j10, boolean z10) {
        this.f66259w = null;
        this.f66258v = C.TIME_UNSET;
        this.f66255s = false;
        this.f66256t = false;
    }

    public final void a(a aVar, List<a.b> list) {
        for (int i10 = 0; i10 < aVar.length(); i10++) {
            t wrappedMetadataFormat = aVar.get(i10).getWrappedMetadataFormat();
            if (wrappedMetadataFormat != null && this.f66250n.supportsFormat(wrappedMetadataFormat)) {
                b bVarCreateDecoder = this.f66250n.createDecoder(wrappedMetadataFormat);
                byte[] bArr = (byte[]) io.odeeo.internal.q0.a.checkNotNull(aVar.get(i10).getWrappedMetadataBytes());
                this.f66253q.clear();
                this.f66253q.ensureSpaceForWrite(bArr.length);
                ((ByteBuffer) g0.castNonNull(this.f66253q.f63705c)).put(bArr);
                this.f66253q.flip();
                a aVarDecode = bVarCreateDecoder.decode(this.f66253q);
                if (aVarDecode != null) {
                    a(aVarDecode, list);
                }
            } else {
                list.add(aVar.get(i10));
            }
        }
    }

    public final void b(a aVar) {
        this.f66251o.onMetadata(aVar);
    }

    public final void a(a aVar) {
        Handler handler = this.f66252p;
        if (handler != null) {
            handler.obtainMessage(0, aVar).sendToTarget();
        } else {
            b(aVar);
        }
    }
}
