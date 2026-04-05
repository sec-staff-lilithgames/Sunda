package m3;

import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final l3.c f74006a;

    public j(l3.c cVar) {
        this.f74006a = cVar;
    }

    public void onResult(boolean z10, boolean z11) throws RemoteException {
        this.f74006a.onIsPermissionRevocationEnabledForAppResult(z10, z11);
    }
}
