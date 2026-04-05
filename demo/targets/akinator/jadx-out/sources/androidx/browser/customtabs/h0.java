package androidx.browser.customtabs;

import android.os.Binder;
import android.os.Bundle;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h0 extends b.n {

    /* renamed from: b, reason: collision with root package name */
    public final Executor f5231b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Executor f5232c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o0 f5233e;

    public h0(Executor executor, o0 o0Var) {
        this.f5232c = executor;
        this.f5233e = o0Var;
        this.f5231b = executor;
    }

    @Override // b.n, b.o
    public void onGreatestScrollPercentageIncreased(int i10, Bundle bundle) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            this.f5231b.execute(new f0(this.f5233e, i10, bundle, 1));
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // b.n, b.o
    public void onSessionEnded(boolean z10, Bundle bundle) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            this.f5231b.execute(new e0(this.f5233e, z10, bundle, 3));
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // b.n, b.o
    public void onVerticalScrollEvent(boolean z10, Bundle bundle) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            this.f5231b.execute(new e0(this.f5233e, z10, bundle, 2));
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }
}
