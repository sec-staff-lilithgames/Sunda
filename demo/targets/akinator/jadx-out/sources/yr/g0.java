package yr;

import com.amazon.aps.shared.util.APSSharedUtil;
import cv.BLca.YsiBvdpw;
import java.util.EnumMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mh.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final Logger f94902a;

    /* renamed from: b, reason: collision with root package name */
    public final Level f94903b;

    public static String k(pw.g gVar) {
        if (gVar.size() <= 64) {
            return gVar.snapshot().hex();
        }
        return gVar.snapshot((int) Math.min(gVar.size(), 64L)).hex() + APSSharedUtil.TRUNCATE_SEPARATOR;
    }

    public final boolean a() {
        return this.f94902a.isLoggable(this.f94903b);
    }

    public final void b(e0 e0Var, int i10, pw.g gVar, int i11, boolean z10) {
        if (a()) {
            this.f94902a.log(this.f94903b, e0Var + " DATA: streamId=" + i10 + " endStream=" + z10 + " length=" + i11 + " bytes=" + k(gVar));
        }
    }

    public final void c(e0 e0Var, int i10, as.a aVar, pw.l lVar) {
        if (a()) {
            this.f94902a.log(this.f94903b, e0Var + " GO_AWAY: lastStreamId=" + i10 + " errorCode=" + aVar + " length=" + lVar.size() + " bytes=" + k(new pw.g().write(lVar)));
        }
    }

    public final void d(e0 e0Var, int i10, List list, boolean z10) {
        if (a()) {
            this.f94902a.log(this.f94903b, e0Var + " HEADERS: streamId=" + i10 + " headers=" + list + " endStream=" + z10);
        }
    }

    public final void e(e0 e0Var, long j10) {
        if (a()) {
            this.f94902a.log(this.f94903b, e0Var + " PING: ack=false bytes=" + j10);
        }
    }

    public final void f(e0 e0Var, long j10) {
        if (a()) {
            this.f94902a.log(this.f94903b, e0Var + " PING: ack=true bytes=" + j10);
        }
    }

    public final void g(e0 e0Var, int i10, int i11, List list) {
        if (a()) {
            this.f94902a.log(this.f94903b, e0Var + " PUSH_PROMISE: streamId=" + i10 + " promisedStreamId=" + i11 + " headers=" + list);
        }
    }

    public final void h(e0 e0Var, int i10, as.a aVar) {
        if (a()) {
            this.f94902a.log(this.f94903b, e0Var + " RST_STREAM: streamId=" + i10 + " errorCode=" + aVar);
        }
    }

    public final void i(e0 e0Var, as.p pVar) {
        if (a()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(e0Var);
            sb2.append(" SETTINGS: ack=false settings=");
            EnumMap enumMap = new EnumMap(f0.class);
            for (f0 f0Var : f0.values()) {
                if (pVar.isSet(f0Var.getBit())) {
                    enumMap.put((EnumMap) f0Var, (f0) Integer.valueOf(pVar.get(f0Var.getBit())));
                }
            }
            sb2.append(enumMap.toString());
            this.f94902a.log(this.f94903b, sb2.toString());
        }
    }

    public final void j(e0 e0Var, int i10, long j10) {
        if (a()) {
            this.f94902a.log(this.f94903b, e0Var + " WINDOW_UPDATE: streamId=" + i10 + " windowSizeIncrement=" + j10);
        }
    }

    public void logPriority(e0 e0Var, int i10, int i11, int i12, boolean z10) {
        if (a()) {
            this.f94902a.log(this.f94903b, e0Var + " PRIORITY: streamId=" + i10 + " streamDependency=" + i11 + " weight=" + i12 + " exclusive=" + z10);
        }
    }

    public g0(Class cls) {
        Level level = Level.FINE;
        Logger logger = Logger.getLogger(cls.getName());
        this.f94903b = (Level) p1.checkNotNull(level, YsiBvdpw.ZFkfyLYmgwT);
        this.f94902a = (Logger) p1.checkNotNull(logger, "logger");
    }
}
