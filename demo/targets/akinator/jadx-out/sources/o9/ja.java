package o9;

import com.digidust.elokence.akinator.activities.WebviewCGV;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ja implements da.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebviewCGV f78280a;

    public ja(WebviewCGV webviewCGV) {
        this.f78280a = webviewCGV;
    }

    @Override // da.g
    public void onCloseConfirme() {
    }

    @Override // da.g
    public void onClosedRefuse() {
        this.f78280a.onBackPressed();
    }

    @Override // da.g
    public void onCloseConfirme(String str) {
    }
}
