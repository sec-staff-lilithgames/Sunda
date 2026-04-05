package l7;

import androidx.lifecycle.a1;
import androidx.lifecycle.b1;
import androidx.lifecycle.k0;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v extends q {

    /* renamed from: b, reason: collision with root package name */
    public final a7.m f72658b;

    /* renamed from: c, reason: collision with root package name */
    public final i f72659c;

    /* renamed from: e, reason: collision with root package name */
    public final n7.e f72660e;

    /* renamed from: f, reason: collision with root package name */
    public final k0 f72661f;

    /* renamed from: g, reason: collision with root package name */
    public final Job f72662g;

    public v(a7.m mVar, i iVar, n7.e eVar, k0 k0Var, Job job) {
        super(null);
        this.f72658b = mVar;
        this.f72659c = iVar;
        this.f72660e = eVar;
        this.f72661f = k0Var;
        this.f72662g = job;
    }

    @Override // l7.q
    public void assertActive() {
        n7.e eVar = this.f72660e;
        if (eVar.getView().isAttachedToWindow()) {
            return;
        }
        q7.n.getRequestManager(eVar.getView()).setRequest(this);
        throw new CancellationException("'ViewTarget.view' must be attached to a window.");
    }

    @Override // l7.q
    public void dispose() {
        Job.DefaultImpls.cancel$default(this.f72662g, (CancellationException) null, 1, (Object) null);
        n7.e eVar = this.f72660e;
        boolean z10 = eVar instanceof a1;
        k0 k0Var = this.f72661f;
        if (z10) {
            k0Var.removeObserver((a1) eVar);
        }
        k0Var.removeObserver(this);
    }

    @Override // l7.q, androidx.lifecycle.r
    public /* bridge */ /* synthetic */ void onCreate(b1 b1Var) {
        super.onCreate(b1Var);
    }

    @Override // l7.q, androidx.lifecycle.r
    public void onDestroy(b1 b1Var) {
        q7.n.getRequestManager(this.f72660e.getView()).dispose();
    }

    @Override // l7.q, androidx.lifecycle.r
    public /* bridge */ /* synthetic */ void onPause(b1 b1Var) {
        super.onPause(b1Var);
    }

    @Override // l7.q, androidx.lifecycle.r
    public /* bridge */ /* synthetic */ void onResume(b1 b1Var) {
        super.onResume(b1Var);
    }

    @Override // l7.q, androidx.lifecycle.r
    public /* bridge */ /* synthetic */ void onStart(b1 b1Var) {
        super.onStart(b1Var);
    }

    @Override // l7.q, androidx.lifecycle.r
    public /* bridge */ /* synthetic */ void onStop(b1 b1Var) {
        super.onStop(b1Var);
    }

    public final void restart() {
        this.f72658b.enqueue(this.f72659c);
    }

    @Override // l7.q
    public void start() {
        k0 k0Var = this.f72661f;
        k0Var.addObserver(this);
        n7.e eVar = this.f72660e;
        if (eVar instanceof a1) {
            q7.i.removeAndAddObserver(k0Var, (a1) eVar);
        }
        q7.n.getRequestManager(eVar.getView()).setRequest(this);
    }
}
