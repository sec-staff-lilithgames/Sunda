package xr;

import com.amazon.device.ads.DTBMetricReport;
import java.text.MessageFormat;
import java.util.logging.Level;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class w0 extends wr.m {

    /* renamed from: a, reason: collision with root package name */
    public final y0 f93211a;

    /* renamed from: b, reason: collision with root package name */
    public final cf f93212b;

    public w0(y0 y0Var, cf cfVar) {
        this.f93211a = (y0) mh.p1.checkNotNull(y0Var, "tracer");
        this.f93212b = (cf) mh.p1.checkNotNull(cfVar, DTBMetricReport.TIME);
    }

    public static Level b(wr.l lVar) {
        int iOrdinal = lVar.ordinal();
        return iOrdinal != 1 ? (iOrdinal == 2 || iOrdinal == 3) ? Level.FINE : Level.FINEST : Level.FINER;
    }

    public final boolean a(wr.l lVar) {
        boolean z10;
        if (lVar != wr.l.f91017b) {
            y0 y0Var = this.f93211a;
            synchronized (y0Var.f93247a) {
                z10 = y0Var.f93249c != null;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    @Override // wr.m
    public void log(wr.l lVar, String str) {
        y0 y0Var = this.f93211a;
        wr.n2 n2Var = y0Var.f93248b;
        Level levelB = b(lVar);
        if (y0.f93246f.isLoggable(levelB)) {
            y0.a(n2Var, levelB, str);
        }
        if (!a(lVar) || lVar == wr.l.f91017b) {
            return;
        }
        wr.a2 description = new wr.a2().setDescription(str);
        int iOrdinal = lVar.ordinal();
        wr.c2 c2VarBuild = description.setSeverity(iOrdinal != 2 ? iOrdinal != 3 ? wr.b2.f90824b : wr.b2.f90826e : wr.b2.f90825c).setTimestampNanos(((bf) this.f93212b).currentTimeNanos()).build();
        synchronized (y0Var.f93247a) {
            try {
                x0 x0Var = y0Var.f93249c;
                if (x0Var != null) {
                    x0Var.add((x0) c2VarBuild);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // wr.m
    public void log(wr.l lVar, String str, Object... objArr) {
        log(lVar, (a(lVar) || y0.f93246f.isLoggable(b(lVar))) ? MessageFormat.format(str, objArr) : null);
    }
}
