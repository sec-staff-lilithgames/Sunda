package o9;

import android.widget.ImageView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class t0 implements da.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ aa.e f78550a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ImageView f78551b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f78552c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v0 f78553d;

    public t0(v0 v0Var, aa.e eVar, ImageView imageView, String str) {
        this.f78553d = v0Var;
        this.f78550a = eVar;
        this.f78551b = imageView;
        this.f78552c = str;
    }

    @Override // da.g
    public void onCloseConfirme() {
        this.f78553d.f78621o.showRewardedVideo(this.f78550a, this.f78551b, this.f78552c);
    }

    @Override // da.g
    public void onCloseConfirme(String str) {
        onCloseConfirme();
    }

    @Override // da.g
    public void onClosedRefuse() {
    }
}
