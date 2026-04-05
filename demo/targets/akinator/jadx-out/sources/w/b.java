package w;

import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final c.c f90272a;

    public b(c.c cVar) {
        this.f90272a = cVar;
    }

    public void runExtraCallback(String str, Bundle bundle) throws RemoteException {
        this.f90272a.onExtraCallback(str, bundle);
    }
}
