package ao;

import java.util.concurrent.Executor;
import mh.v2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class w1 {

    /* renamed from: a, reason: collision with root package name */
    public final ln.h f7884a;

    /* renamed from: b, reason: collision with root package name */
    public go.t f7885b = new go.p();

    /* renamed from: c, reason: collision with root package name */
    public boolean f7886c = true;

    /* renamed from: d, reason: collision with root package name */
    public Object f7887d;

    /* renamed from: e, reason: collision with root package name */
    public String f7888e;

    /* renamed from: f, reason: collision with root package name */
    public f1 f7889f;

    public w1(ln.h hVar) {
        this.f7884a = (ln.h) io.bidmachine.media3.common.util.a.checkNotNull(hVar);
    }

    public x1 createMediaSource(gn.o0 o0Var, long j10) {
        return new x1(this.f7888e, o0Var, this.f7884a, j10, this.f7885b, this.f7886c, this.f7887d, this.f7889f);
    }

    public <T extends Executor> w1 setDownloadExecutor(v2 v2Var, io.bidmachine.media3.common.util.k kVar) {
        this.f7889f = new f1(v2Var, kVar, 1);
        return this;
    }

    public w1 setLoadErrorHandlingPolicy(go.t tVar) {
        if (tVar == null) {
            tVar = new go.p();
        }
        this.f7885b = tVar;
        return this;
    }

    public w1 setTag(Object obj) {
        this.f7887d = obj;
        return this;
    }

    @Deprecated
    public w1 setTrackId(String str) {
        this.f7888e = str;
        return this;
    }

    public w1 setTreatLoadErrorsAsEndOfStream(boolean z10) {
        this.f7886c = z10;
        return this;
    }
}
