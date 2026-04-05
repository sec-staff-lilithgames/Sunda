package xr;

import java.text.MessageFormat;
import java.util.logging.Level;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h6 extends wr.m {

    /* renamed from: a, reason: collision with root package name */
    public wr.n2 f92585a;

    @Override // wr.m
    public void log(wr.l lVar, String str) {
        wr.n2 n2Var = this.f92585a;
        Level levelB = w0.b(lVar);
        if (y0.f93246f.isLoggable(levelB)) {
            y0.a(n2Var, levelB, str);
        }
    }

    @Override // wr.m
    public void log(wr.l lVar, String str, Object... objArr) {
        wr.n2 n2Var = this.f92585a;
        Level levelB = w0.b(lVar);
        if (y0.f93246f.isLoggable(levelB)) {
            y0.a(n2Var, levelB, MessageFormat.format(str, objArr));
        }
    }
}
