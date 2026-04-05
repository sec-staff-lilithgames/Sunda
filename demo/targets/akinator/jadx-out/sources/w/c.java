package w;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import androidx.browser.trusted.TrustedWebActivityService;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c extends c.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TrustedWebActivityService f90273b;

    public c(TrustedWebActivityService trustedWebActivityService) {
        this.f90273b = trustedWebActivityService;
    }

    public final void a() {
        TrustedWebActivityService trustedWebActivityService = this.f90273b;
        int i10 = trustedWebActivityService.f5305c;
        if (i10 != -1) {
            if (i10 != Binder.getCallingUid()) {
                throw new SecurityException("Caller is not verified as Trusted Web Activity provider.");
            }
        } else {
            trustedWebActivityService.getPackageManager().getPackagesForUid(Binder.getCallingUid());
            trustedWebActivityService.getTokenStore();
            throw null;
        }
    }

    @Override // c.e, c.g
    public Bundle areNotificationsEnabled(Bundle bundle) {
        a();
        return new h(this.f90273b.onAreNotificationsEnabled(f.fromBundle(bundle).f90277a)).toBundle();
    }

    @Override // c.e, c.g
    public void cancelNotification(Bundle bundle) {
        a();
        e eVarFromBundle = e.fromBundle(bundle);
        this.f90273b.onCancelNotification(eVarFromBundle.f90275a, eVarFromBundle.f90276b);
    }

    @Override // c.e, c.g
    public Bundle extraCommand(String str, Bundle bundle, IBinder iBinder) {
        a();
        c.c cVarAsInterface = iBinder == null ? null : c.b.asInterface(iBinder);
        return this.f90273b.onExtraCommand(str, bundle, cVarAsInterface != null ? new b(cVarAsInterface) : null);
    }

    @Override // c.e, c.g
    public Bundle getActiveNotifications() {
        a();
        return new d(this.f90273b.onGetActiveNotifications()).toBundle();
    }

    @Override // c.e, c.g
    public Bundle getSmallIconBitmap() {
        a();
        return this.f90273b.onGetSmallIconBitmap();
    }

    @Override // c.e, c.g
    public int getSmallIconId() {
        a();
        return this.f90273b.onGetSmallIconId();
    }

    @Override // c.e, c.g
    public Bundle notifyNotificationWithChannel(Bundle bundle) {
        a();
        g gVarFromBundle = g.fromBundle(bundle);
        return new h(this.f90273b.onNotifyNotificationWithChannel(gVarFromBundle.f90278a, gVarFromBundle.f90279b, gVarFromBundle.f90280c, gVarFromBundle.f90281d)).toBundle();
    }
}
