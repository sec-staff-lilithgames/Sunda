package l7;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n implements e {

    /* renamed from: a, reason: collision with root package name */
    public final Deferred f72622a;

    public n(Deferred<? extends k> deferred) {
        this.f72622a = deferred;
    }

    @Override // l7.e
    public void dispose() {
        if (isDisposed()) {
            return;
        }
        Job.DefaultImpls.cancel$default((Job) getJob(), (CancellationException) null, 1, (Object) null);
    }

    @Override // l7.e
    public Deferred<k> getJob() {
        return this.f72622a;
    }

    @Override // l7.e
    public boolean isDisposed() {
        return !getJob().isActive();
    }
}
