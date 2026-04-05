package m3;

import android.os.RemoteException;
import androidx.core.content.UnusedAppRestrictionsBackportService;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k extends l3.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UnusedAppRestrictionsBackportService f74007b;

    public k(UnusedAppRestrictionsBackportService unusedAppRestrictionsBackportService) {
        this.f74007b = unusedAppRestrictionsBackportService;
    }

    @Override // l3.e, l3.f
    public void isPermissionRevocationEnabledForApp(l3.c cVar) throws RemoteException {
        if (cVar == null) {
            return;
        }
        new j(cVar);
        this.f74007b.a();
    }
}
