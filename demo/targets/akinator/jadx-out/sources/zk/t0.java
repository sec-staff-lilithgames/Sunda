package zk;

import android.content.DialogInterface;
import android.webkit.GeolocationPermissions;
import android.webkit.SslErrorHandler;
import com.inmobi.media.C2974rc;
import com.sfbx.appconsentv3.ui.ui.privacy.PrivacyPolicyActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class t0 implements DialogInterface.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f98185b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f98186c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f98187e;

    public /* synthetic */ t0(int i10, Object obj, Object obj2) {
        this.f98185b = i10;
        this.f98186c = obj;
        this.f98187e = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f98185b) {
            case 0:
                C2974rc.a((GeolocationPermissions.Callback) this.f98186c, (String) this.f98187e, dialogInterface, i10);
                break;
            case 1:
                C2974rc.b((GeolocationPermissions.Callback) this.f98186c, (String) this.f98187e, dialogInterface, i10);
                break;
            default:
                PrivacyPolicyActivity.Companion.buildAlertDialogOnScreen$lambda$1((kotlin.jvm.internal.w0) this.f98186c, (SslErrorHandler) this.f98187e, dialogInterface, i10);
                break;
        }
    }
}
