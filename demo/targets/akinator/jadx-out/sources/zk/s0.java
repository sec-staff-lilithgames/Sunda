package zk;

import android.content.DialogInterface;
import android.webkit.JsResult;
import com.inmobi.media.C2974rc;
import com.vungle.ads.internal.presenter.NativeAdPresenter;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class s0 implements DialogInterface.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f98182b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f98183c;

    public /* synthetic */ s0(Object obj, int i10) {
        this.f98182b = i10;
        this.f98183c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f98182b) {
            case 0:
                C2974rc.b((JsResult) this.f98183c, dialogInterface, i10);
                break;
            case 1:
                C2974rc.c((JsResult) this.f98183c, dialogInterface, i10);
                break;
            case 2:
                C2974rc.a((JsResult) this.f98183c, dialogInterface, i10);
                break;
            default:
                NativeAdPresenter.m3636showGdpr$lambda8((NativeAdPresenter) this.f98183c, dialogInterface, i10);
                break;
        }
    }
}
