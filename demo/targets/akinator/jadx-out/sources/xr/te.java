package xr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import wr.b6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class te {

    /* renamed from: c, reason: collision with root package name */
    public static final te f93066c = new te(new wr.p6[0]);

    /* renamed from: a, reason: collision with root package name */
    public final wr.p6[] f93067a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f93068b = new AtomicBoolean(false);

    public te(wr.p6[] p6VarArr) {
        this.f93067a = p6VarArr;
    }

    public static te newClientContext(wr.u[] uVarArr, wr.c cVar, wr.e4 e4Var) {
        te teVar = new te(uVarArr);
        for (wr.u uVar : uVarArr) {
            uVar.streamCreated(cVar, e4Var);
        }
        return teVar;
    }

    public static te newServerContext(List<? extends b6.a> list, String str, wr.e4 e4Var) {
        if (list.isEmpty()) {
            return f93066c;
        }
        int size = list.size();
        wr.p6[] p6VarArr = new wr.p6[size];
        for (int i10 = 0; i10 < size; i10++) {
            p6VarArr[i10] = list.get(i10).newServerStreamTracer(str, e4Var);
        }
        return new te(p6VarArr);
    }

    public void clientInboundHeaders() {
        for (wr.p6 p6Var : this.f93067a) {
            ((wr.u) p6Var).inboundHeaders();
        }
    }

    public void clientInboundTrailers(wr.e4 e4Var) {
        for (wr.p6 p6Var : this.f93067a) {
            ((wr.u) p6Var).inboundTrailers(e4Var);
        }
    }

    public void clientOutboundHeaders() {
        for (wr.p6 p6Var : this.f93067a) {
            ((wr.u) p6Var).outboundHeaders();
        }
    }

    public List<wr.p6> getTracersForTest() {
        return new ArrayList(Arrays.asList(this.f93067a));
    }

    public void inboundMessage(int i10) {
        for (wr.p6 p6Var : this.f93067a) {
            p6Var.inboundMessage(i10);
        }
    }

    public void inboundMessageRead(int i10, long j10, long j11) {
        for (wr.p6 p6Var : this.f93067a) {
            p6Var.inboundMessageRead(i10, j10, j11);
        }
    }

    public void inboundUncompressedSize(long j10) {
        for (wr.p6 p6Var : this.f93067a) {
            p6Var.inboundUncompressedSize(j10);
        }
    }

    public void inboundWireSize(long j10) {
        for (wr.p6 p6Var : this.f93067a) {
            p6Var.inboundWireSize(j10);
        }
    }

    public void outboundMessage(int i10) {
        for (wr.p6 p6Var : this.f93067a) {
            p6Var.outboundMessage(i10);
        }
    }

    public void outboundMessageSent(int i10, long j10, long j11) {
        for (wr.p6 p6Var : this.f93067a) {
            p6Var.outboundMessageSent(i10, j10, j11);
        }
    }

    public void outboundUncompressedSize(long j10) {
        for (wr.p6 p6Var : this.f93067a) {
            p6Var.outboundUncompressedSize(j10);
        }
    }

    public void outboundWireSize(long j10) {
        for (wr.p6 p6Var : this.f93067a) {
            p6Var.outboundWireSize(j10);
        }
    }

    public void serverCallStarted(b6.b bVar) {
        for (wr.p6 p6Var : this.f93067a) {
            ((wr.b6) p6Var).serverCallStarted(bVar);
        }
    }

    public <ReqT, RespT> wr.u0 serverFilterContext(wr.u0 u0Var) {
        wr.u0 u0VarFilterContext = (wr.u0) mh.p1.checkNotNull(u0Var, "context");
        for (wr.p6 p6Var : this.f93067a) {
            u0VarFilterContext = ((wr.b6) p6Var).filterContext(u0VarFilterContext);
            mh.p1.checkNotNull(u0VarFilterContext, "%s returns null context", p6Var);
        }
        return u0VarFilterContext;
    }

    public void streamClosed(wr.m6 m6Var) {
        if (this.f93068b.compareAndSet(false, true)) {
            for (wr.p6 p6Var : this.f93067a) {
                p6Var.streamClosed(m6Var);
            }
        }
    }
}
