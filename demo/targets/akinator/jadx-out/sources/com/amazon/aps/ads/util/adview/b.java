package com.amazon.aps.ads.util.adview;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.amazon.aps.ads.activity.ApsInterstitialActivity;
import com.google.android.material.search.SearchView;
import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import dh.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements View.OnTouchListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12505b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12506c;

    public /* synthetic */ b(Object obj, int i10) {
        this.f12505b = i10;
        this.f12506c = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10 = this.f12505b;
        Object obj = this.f12506c;
        switch (i10) {
            case 0:
                return ApsAdViewImpl.initWebView$lambda$3((ApsAdViewImpl) obj, view, motionEvent);
            case 1:
                return AndroidWebViewContainer._init_$lambda$1((AndroidWebViewContainer) obj, view, motionEvent);
            case 2:
                l lVar = (l) obj;
                if (motionEvent.getAction() == 1) {
                    long jUptimeMillis = SystemClock.uptimeMillis() - lVar.f52243o;
                    if (jUptimeMillis < 0 || jUptimeMillis > 300) {
                        lVar.f52241m = false;
                    }
                    lVar.o();
                    lVar.f52241m = true;
                    lVar.f52243o = SystemClock.uptimeMillis();
                }
                return false;
            case 3:
                return ApsInterstitialActivity.prepareCloseButtonRegion$lambda$12$lambda$11((ApsInterstitialActivity) obj, view, motionEvent);
            default:
                SearchView searchView = (SearchView) obj;
                int i11 = SearchView.G;
                if (searchView.b()) {
                    searchView.clearFocusAndHideKeyboard();
                }
                return false;
        }
    }
}
