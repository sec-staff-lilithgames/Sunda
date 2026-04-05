package l7;

import android.view.View;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x implements View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final View f72664b;

    /* renamed from: c, reason: collision with root package name */
    public u f72665c;

    /* renamed from: e, reason: collision with root package name */
    public Job f72666e;

    /* renamed from: f, reason: collision with root package name */
    public v f72667f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f72668g;

    public x(View view) {
        this.f72664b = view;
    }

    public final synchronized void dispose() {
        try {
            Job job = this.f72666e;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            this.f72666e = BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getMain().getImmediate(), null, new w(this, null), 2, null);
            this.f72665c = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized u getDisposable(Deferred<? extends k> deferred) {
        u uVar = this.f72665c;
        if (uVar != null && q7.n.isMainThread() && this.f72668g) {
            this.f72668g = false;
            uVar.setJob(deferred);
            return uVar;
        }
        Job job = this.f72666e;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f72666e = null;
        u uVar2 = new u(this.f72664b, deferred);
        this.f72665c = uVar2;
        return uVar2;
    }

    public final synchronized k getResult() {
        u uVar;
        Deferred<k> job;
        uVar = this.f72665c;
        return (uVar == null || (job = uVar.getJob()) == null) ? null : (k) q7.n.getCompletedOrNull(job);
    }

    public final synchronized boolean isDisposed(u uVar) {
        return uVar != this.f72665c;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        v vVar = this.f72667f;
        if (vVar == null) {
            return;
        }
        this.f72668g = true;
        vVar.restart();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        v vVar = this.f72667f;
        if (vVar != null) {
            vVar.dispose();
        }
    }

    public final void setRequest(v vVar) {
        v vVar2 = this.f72667f;
        if (vVar2 != null) {
            vVar2.dispose();
        }
        this.f72667f = vVar;
    }
}
