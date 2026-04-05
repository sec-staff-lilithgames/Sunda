package l7;

import androidx.lifecycle.b1;
import androidx.lifecycle.k0;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a extends q {

    /* renamed from: b, reason: collision with root package name */
    public final k0 f72513b;

    /* renamed from: c, reason: collision with root package name */
    public final Job f72514c;

    public a(k0 k0Var, Job job) {
        super(null);
        this.f72513b = k0Var;
        this.f72514c = job;
    }

    @Override // l7.q
    public void complete() {
        this.f72513b.removeObserver(this);
    }

    @Override // l7.q
    public void dispose() {
        Job.DefaultImpls.cancel$default(this.f72514c, (CancellationException) null, 1, (Object) null);
    }

    @Override // l7.q, androidx.lifecycle.r
    public /* bridge */ /* synthetic */ void onCreate(b1 b1Var) {
        super.onCreate(b1Var);
    }

    @Override // l7.q, androidx.lifecycle.r
    public void onDestroy(b1 b1Var) {
        dispose();
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

    @Override // l7.q
    public void start() {
        this.f72513b.addObserver(this);
    }
}
