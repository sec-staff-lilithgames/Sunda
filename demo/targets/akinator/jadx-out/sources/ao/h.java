package ao;

import java.io.IOException;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h implements s0, sn.r {

    /* renamed from: b, reason: collision with root package name */
    public final Object f7680b;

    /* renamed from: c, reason: collision with root package name */
    public r0 f7681c;

    /* renamed from: e, reason: collision with root package name */
    public sn.q f7682e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j f7683f;

    public h(j jVar, Object obj) {
        this.f7683f = jVar;
        this.f7681c = jVar.a(null);
        this.f7682e = jVar.f7534d.withParameters(0, null);
        this.f7680b = obj;
    }

    public final boolean a(int i10, k0 k0Var) {
        k0 k0VarG;
        Object obj = this.f7680b;
        j jVar = this.f7683f;
        if (k0Var != null) {
            k0VarG = jVar.g(obj, k0Var);
            if (k0VarG == null) {
                return false;
            }
        } else {
            k0VarG = null;
        }
        int i11 = jVar.i(obj, i10);
        r0 r0Var = this.f7681c;
        if (r0Var.f7805a != i11 || !Objects.equals(r0Var.f7806b, k0VarG)) {
            this.f7681c = jVar.f7533c.withParameters(i11, k0VarG);
        }
        sn.q qVar = this.f7682e;
        if (qVar.f86034a == i11 && Objects.equals(qVar.f86035b, k0VarG)) {
            return true;
        }
        this.f7682e = jVar.f7534d.withParameters(i11, k0VarG);
        return true;
    }

    public final g0 b(g0 g0Var, k0 k0Var) {
        long j10 = g0Var.f7670f;
        j jVar = this.f7683f;
        Object obj = this.f7680b;
        long jH = jVar.h(obj, j10);
        long j11 = g0Var.f7671g;
        long jH2 = jVar.h(obj, j11);
        return (jH == g0Var.f7670f && jH2 == j11) ? g0Var : new g0(g0Var.f7665a, g0Var.f7666b, g0Var.f7667c, g0Var.f7668d, g0Var.f7669e, jH, jH2);
    }

    @Override // ao.s0
    public void onDownstreamFormatChanged(int i10, k0 k0Var, g0 g0Var) {
        if (a(i10, k0Var)) {
            this.f7681c.downstreamFormatChanged(b(g0Var, k0Var));
        }
    }

    @Override // sn.r
    public void onDrmKeysLoaded(int i10, k0 k0Var) {
        if (a(i10, k0Var)) {
            this.f7682e.drmKeysLoaded();
        }
    }

    @Override // sn.r
    public void onDrmKeysRemoved(int i10, k0 k0Var) {
        if (a(i10, k0Var)) {
            this.f7682e.drmKeysRemoved();
        }
    }

    @Override // sn.r
    public void onDrmKeysRestored(int i10, k0 k0Var) {
        if (a(i10, k0Var)) {
            this.f7682e.drmKeysRestored();
        }
    }

    @Override // sn.r
    public void onDrmSessionAcquired(int i10, k0 k0Var, int i11) {
        if (a(i10, k0Var)) {
            this.f7682e.drmSessionAcquired(i11);
        }
    }

    @Override // sn.r
    public void onDrmSessionManagerError(int i10, k0 k0Var, Exception exc) {
        if (a(i10, k0Var)) {
            this.f7682e.drmSessionManagerError(exc);
        }
    }

    @Override // sn.r
    public void onDrmSessionReleased(int i10, k0 k0Var) {
        if (a(i10, k0Var)) {
            this.f7682e.drmSessionReleased();
        }
    }

    @Override // ao.s0
    public void onLoadCanceled(int i10, k0 k0Var, b0 b0Var, g0 g0Var) {
        if (a(i10, k0Var)) {
            this.f7681c.loadCanceled(b0Var, b(g0Var, k0Var));
        }
    }

    @Override // ao.s0
    public void onLoadCompleted(int i10, k0 k0Var, b0 b0Var, g0 g0Var) {
        if (a(i10, k0Var)) {
            this.f7681c.loadCompleted(b0Var, b(g0Var, k0Var));
        }
    }

    @Override // ao.s0
    public void onLoadError(int i10, k0 k0Var, b0 b0Var, g0 g0Var, IOException iOException, boolean z10) {
        if (a(i10, k0Var)) {
            this.f7681c.loadError(b0Var, b(g0Var, k0Var), iOException, z10);
        }
    }

    @Override // ao.s0
    public void onLoadStarted(int i10, k0 k0Var, b0 b0Var, g0 g0Var, int i11) {
        if (a(i10, k0Var)) {
            this.f7681c.loadStarted(b0Var, b(g0Var, k0Var), i11);
        }
    }

    @Override // ao.s0
    public void onUpstreamDiscarded(int i10, k0 k0Var, g0 g0Var) {
        if (a(i10, k0Var)) {
            this.f7681c.upstreamDiscarded(b(g0Var, k0Var));
        }
    }
}
