package n5;

import androidx.profileinstaller.ProfileInstallReceiver;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ProfileInstallReceiver f75654a;

    public c(ProfileInstallReceiver profileInstallReceiver) {
        this.f75654a = profileInstallReceiver;
    }

    @Override // n5.f
    public void onDiagnosticReceived(int i10, Object obj) {
        g.f75656b.onDiagnosticReceived(i10, obj);
    }

    @Override // n5.f
    public void onResultReceived(int i10, Object obj) {
        g.f75656b.onResultReceived(i10, obj);
        this.f75654a.setResultCode(i10);
    }
}
