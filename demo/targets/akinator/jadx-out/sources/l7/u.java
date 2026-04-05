package l7;

import android.view.View;
import kotlinx.coroutines.Deferred;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u implements e {

    /* renamed from: a, reason: collision with root package name */
    public final View f72656a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Deferred f72657b;

    public u(View view, Deferred<? extends k> deferred) {
        this.f72656a = view;
        this.f72657b = deferred;
    }

    @Override // l7.e
    public void dispose() {
        if (isDisposed()) {
            return;
        }
        q7.n.getRequestManager(this.f72656a).dispose();
    }

    @Override // l7.e
    public Deferred<k> getJob() {
        return this.f72657b;
    }

    @Override // l7.e
    public boolean isDisposed() {
        return q7.n.getRequestManager(this.f72656a).isDisposed(this);
    }

    public void setJob(Deferred<? extends k> deferred) {
        this.f72657b = deferred;
    }
}
