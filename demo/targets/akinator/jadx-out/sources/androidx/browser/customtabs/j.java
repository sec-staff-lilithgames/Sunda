package androidx.browser.customtabs;

import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j extends b.b {

    /* renamed from: b, reason: collision with root package name */
    public final Executor f5236b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Executor f5237c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u.a f5238e;

    public j(u.a aVar, Executor executor) {
        this.f5237c = executor;
        this.f5238e = aVar;
        this.f5236b = executor == null ? new i(new Handler(Looper.getMainLooper()), 0) : executor;
    }

    @Override // b.b, b.d
    public void onExtraCallback(String str, Bundle bundle) throws RemoteException {
        u.a aVar = this.f5238e;
        if (aVar == null) {
            return;
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            this.f5236b.execute(new g(aVar, 0, str, bundle));
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // b.b, b.d
    public Bundle onExtraCallbackWithResult(String str, Bundle bundle) throws RemoteException {
        u.a aVar = this.f5238e;
        if (aVar == null) {
            return Bundle.EMPTY;
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            return ((u.c) aVar).onExtraCallbackWithResult(str, bundle);
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // b.b, b.d
    public void onNavigationEvent(int i10, Bundle bundle) throws RemoteException {
        u.a aVar = this.f5238e;
        if (aVar == null) {
            return;
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            this.f5236b.execute(new h(aVar, i10, bundle, 0));
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // b.b, b.d
    public void onWarmupCompleted(Bundle bundle) throws RemoteException {
        u.a aVar = this.f5238e;
        if (aVar == null) {
            return;
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            this.f5236b.execute(new af.n(3, aVar, bundle));
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }
}
