package bf;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g implements j0, de.q {

    /* renamed from: b, reason: collision with root package name */
    public final Object f9231b;

    /* renamed from: c, reason: collision with root package name */
    public i0 f9232c;

    /* renamed from: e, reason: collision with root package name */
    public de.p f9233e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i f9234f;

    public g(i iVar, Object obj) {
        this.f9234f = iVar;
        this.f9232c = iVar.f9162c.withParameters(0, null);
        this.f9233e = iVar.f9163d.withParameters(0, null);
        this.f9231b = obj;
    }

    public final boolean a(int i10, d0 d0Var) {
        d0 d0VarE;
        Object obj = this.f9231b;
        i iVar = this.f9234f;
        if (d0Var != null) {
            d0VarE = iVar.e(obj, d0Var);
            if (d0VarE == null) {
                return false;
            }
        } else {
            d0VarE = null;
        }
        int iG = iVar.g(obj, i10);
        i0 i0Var = this.f9232c;
        if (i0Var.f9271a != iG || !com.google.android.exoplayer2.util.n1.areEqual(i0Var.f9272b, d0VarE)) {
            this.f9232c = iVar.f9162c.withParameters(iG, d0VarE);
        }
        de.p pVar = this.f9233e;
        if (pVar.f52159a == iG && com.google.android.exoplayer2.util.n1.areEqual(pVar.f52160b, d0VarE)) {
            return true;
        }
        this.f9233e = iVar.f9163d.withParameters(iG, d0VarE);
        return true;
    }

    public final y b(y yVar) {
        long j10 = yVar.f9491f;
        i iVar = this.f9234f;
        Object obj = this.f9231b;
        long jF = iVar.f(obj, j10);
        long j11 = yVar.f9492g;
        long jF2 = iVar.f(obj, j11);
        return (jF == yVar.f9491f && jF2 == j11) ? yVar : new y(yVar.f9486a, yVar.f9487b, yVar.f9488c, yVar.f9489d, yVar.f9490e, jF, jF2);
    }

    @Override // bf.j0
    public void onDownstreamFormatChanged(int i10, d0 d0Var, y yVar) {
        if (a(i10, d0Var)) {
            this.f9232c.downstreamFormatChanged(b(yVar));
        }
    }

    @Override // de.q
    public void onDrmKeysLoaded(int i10, d0 d0Var) {
        if (a(i10, d0Var)) {
            this.f9233e.drmKeysLoaded();
        }
    }

    @Override // de.q
    public void onDrmKeysRemoved(int i10, d0 d0Var) {
        if (a(i10, d0Var)) {
            this.f9233e.drmKeysRemoved();
        }
    }

    @Override // de.q
    public void onDrmKeysRestored(int i10, d0 d0Var) {
        if (a(i10, d0Var)) {
            this.f9233e.drmKeysRestored();
        }
    }

    @Override // de.q
    @Deprecated
    public /* bridge */ /* synthetic */ void onDrmSessionAcquired(int i10, d0 d0Var) {
        super.onDrmSessionAcquired(i10, d0Var);
    }

    @Override // de.q
    public void onDrmSessionManagerError(int i10, d0 d0Var, Exception exc) {
        if (a(i10, d0Var)) {
            this.f9233e.drmSessionManagerError(exc);
        }
    }

    @Override // de.q
    public void onDrmSessionReleased(int i10, d0 d0Var) {
        if (a(i10, d0Var)) {
            this.f9233e.drmSessionReleased();
        }
    }

    @Override // bf.j0
    public void onLoadCanceled(int i10, d0 d0Var, t tVar, y yVar) {
        if (a(i10, d0Var)) {
            this.f9232c.loadCanceled(tVar, b(yVar));
        }
    }

    @Override // bf.j0
    public void onLoadCompleted(int i10, d0 d0Var, t tVar, y yVar) {
        if (a(i10, d0Var)) {
            this.f9232c.loadCompleted(tVar, b(yVar));
        }
    }

    @Override // bf.j0
    public void onLoadError(int i10, d0 d0Var, t tVar, y yVar, IOException iOException, boolean z10) {
        if (a(i10, d0Var)) {
            this.f9232c.loadError(tVar, b(yVar), iOException, z10);
        }
    }

    @Override // bf.j0
    public void onLoadStarted(int i10, d0 d0Var, t tVar, y yVar) {
        if (a(i10, d0Var)) {
            this.f9232c.loadStarted(tVar, b(yVar));
        }
    }

    @Override // bf.j0
    public void onUpstreamDiscarded(int i10, d0 d0Var, y yVar) {
        if (a(i10, d0Var)) {
            this.f9232c.upstreamDiscarded(b(yVar));
        }
    }

    @Override // de.q
    public void onDrmSessionAcquired(int i10, d0 d0Var, int i11) {
        if (a(i10, d0Var)) {
            this.f9233e.drmSessionAcquired(i11);
        }
    }
}
