package es;

import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mh.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public b0 f55094a;

    /* renamed from: d, reason: collision with root package name */
    public Long f55097d;

    /* renamed from: e, reason: collision with root package name */
    public int f55098e;

    /* renamed from: b, reason: collision with root package name */
    public volatile androidx.localbroadcastmanager.content.b f55095b = new androidx.localbroadcastmanager.content.b(7);

    /* renamed from: c, reason: collision with root package name */
    public androidx.localbroadcastmanager.content.b f55096c = new androidx.localbroadcastmanager.content.b(7);

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f55099f = new HashSet();

    public r(b0 b0Var) {
        this.f55094a = b0Var;
    }

    public final void a(h0 h0Var) {
        if (d() && !h0Var.f55037c) {
            h0Var.a();
        } else if (!d() && h0Var.f55037c) {
            h0Var.f55037c = false;
            wr.g0 g0Var = h0Var.f55038d;
            if (g0Var != null) {
                h0Var.f55039e.onSubchannelState(g0Var);
                h0Var.f55040f.log(wr.l.f91018c, "Subchannel unejected: {0}", h0Var);
            }
        }
        h0Var.f55036b = this;
        this.f55099f.add(h0Var);
    }

    public final void b(long j10) {
        this.f55097d = Long.valueOf(j10);
        this.f55098e++;
        Iterator it = this.f55099f.iterator();
        while (it.hasNext()) {
            ((h0) it.next()).a();
        }
    }

    public final long c() {
        return ((AtomicLong) this.f55096c.f6757b).get() + ((AtomicLong) this.f55096c.f6756a).get();
    }

    public final boolean d() {
        return this.f55097d != null;
    }

    public final void e() {
        p1.checkState(this.f55097d != null, "not currently ejected");
        this.f55097d = null;
        Iterator it = this.f55099f.iterator();
        while (it.hasNext()) {
            h0 h0Var = (h0) it.next();
            h0Var.f55037c = false;
            wr.g0 g0Var = h0Var.f55038d;
            if (g0Var != null) {
                h0Var.f55039e.onSubchannelState(g0Var);
                h0Var.f55040f.log(wr.l.f91018c, "Subchannel unejected: {0}", h0Var);
            }
        }
    }

    public boolean maxEjectionTimeElapsed(long j10) {
        return j10 > Math.min(this.f55094a.f55018b.longValue() * ((long) this.f55098e), Math.max(this.f55094a.f55018b.longValue(), this.f55094a.f55019c.longValue())) + this.f55097d.longValue();
    }

    public String toString() {
        return "AddressTracker{subchannels=" + this.f55099f + AbstractJsonLexerKt.END_OBJ;
    }
}
