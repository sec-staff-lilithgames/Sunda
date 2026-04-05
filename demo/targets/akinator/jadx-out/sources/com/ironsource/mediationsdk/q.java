package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import com.ironsource.C3471u2;
import com.ironsource.Fa;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class q extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private ISBannerSize f37640a;

    /* renamed from: b, reason: collision with root package name */
    private String f37641b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f37642c;

    /* renamed from: d, reason: collision with root package name */
    private a f37643d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface a {
        void onWindowFocusChanged(boolean z10);
    }

    public q(Activity activity, ISBannerSize iSBannerSize) {
        super(activity);
        this.f37642c = false;
        this.f37640a = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
    }

    public void a() {
        this.f37642c = true;
        this.f37640a = null;
        this.f37641b = null;
        this.f37643d = null;
        C3471u2.a().a((Fa) null);
    }

    public boolean b() {
        return this.f37642c;
    }

    public q c() {
        q qVar = new q(getContext(), this.f37640a);
        qVar.f37641b = this.f37641b;
        return qVar;
    }

    public ISBannerSize getSize() {
        return this.f37640a;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        a aVar = this.f37643d;
        if (aVar != null) {
            aVar.onWindowFocusChanged(z10);
        }
    }

    public void setBannerSize(ISBannerSize iSBannerSize) {
        this.f37640a = iSBannerSize;
    }

    public q(Context context, ISBannerSize iSBannerSize) {
        super(context);
        this.f37642c = false;
        this.f37640a = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
    }

    public q(Context context) {
        super(context);
        this.f37642c = false;
    }
}
