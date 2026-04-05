package o5;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j0 implements ServiceConnection {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f77596b;

    public j0(f0 f0Var) {
        this.f77596b = f0Var;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName name, IBinder service) {
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.e0.checkNotNullParameter(service, "service");
        v vVarAsInterface = u.asInterface(service);
        f0 f0Var = this.f77596b;
        f0Var.f77553g = vVarAsInterface;
        f0.access$registerCallback(f0Var);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName name) {
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        this.f77596b.f77553g = null;
    }
}
