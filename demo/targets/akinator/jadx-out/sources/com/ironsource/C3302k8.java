package com.ironsource;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.ironsource.C3191e4;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.k8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3302k8 extends FrameLayout implements K8 {

    /* renamed from: b, reason: collision with root package name */
    private static final String f37087b = "IronSourceAdContainer";

    /* renamed from: a, reason: collision with root package name */
    private C3393p8 f37088a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.k8$a */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f37089a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f37090b;

        public a(String str, String str2) {
            this.f37089a = str;
            this.f37090b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3302k8 c3302k8 = C3302k8.this;
            c3302k8.removeView(c3302k8.f37088a.getPresentingView());
            C3302k8.this.f37088a.a(this.f37089a, this.f37090b);
            C3302k8.this.f37088a = null;
        }
    }

    public C3302k8(Context context) {
        super(context);
    }

    @Override // com.ironsource.K8
    public void c(JSONObject jSONObject, String str, String str2) throws JSONException {
        this.f37088a.c(jSONObject, str, str2);
    }

    @Override // com.ironsource.K8
    public WebView getPresentingView() {
        return this.f37088a.getPresentingView();
    }

    public C3267i8 getSize() {
        C3393p8 c3393p8 = this.f37088a;
        return c3393p8 != null ? c3393p8.c() : new C3267i8();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i10) {
        Logger.i(f37087b, "onVisibilityChanged: " + i10);
        C3393p8 c3393p8 = this.f37088a;
        if (c3393p8 == null) {
            return;
        }
        try {
            c3393p8.b().a(C3284j8.f37010k, i10, isShown());
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        Logger.i(f37087b, "onWindowVisibilityChanged: " + i10);
        C3393p8 c3393p8 = this.f37088a;
        if (c3393p8 == null) {
            return;
        }
        try {
            c3393p8.b().a(C3284j8.f37011l, i10, isShown());
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public C3302k8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void b() throws Exception {
        JSONObject jSONObject;
        try {
            jSONObject = this.f37088a.b().a().getJSONObject(C3284j8.f37015p).getJSONObject(C3284j8.f37018s);
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            jSONObject = new JSONObject();
        }
        jSONObject.put("adViewId", this.f37088a.a());
        this.f37088a.b().a(C3191e4.g.S, jSONObject);
    }

    public void a() throws Exception {
        C3393p8 c3393p8 = this.f37088a;
        if (c3393p8 == null || c3393p8.b() == null) {
            throw new Exception("mAdPresenter or mAdPresenter.getAdViewLogic() are null");
        }
        b();
    }

    public C3302k8(C3393p8 c3393p8, Context context) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(c3393p8.c().c(), c3393p8.c().a()));
        this.f37088a = c3393p8;
        addView(c3393p8.getPresentingView());
    }

    @Override // com.ironsource.K8
    public void a(JSONObject jSONObject, String str, String str2) {
        this.f37088a.a(jSONObject, str, str2);
    }

    @Override // com.ironsource.K8
    public synchronized void a(String str, String str2) {
        C3393p8 c3393p8 = this.f37088a;
        if (c3393p8 != null && c3393p8.b() != null && this.f37088a.getPresentingView() != null) {
            this.f37088a.b().e();
            V7.f35633a.d(new a(str, str2));
        }
    }

    @Override // com.ironsource.K8
    public void a(String str, String str2, String str3) {
        C3393p8 c3393p8 = this.f37088a;
        if (c3393p8 == null) {
            return;
        }
        c3393p8.a(str, str2, str3);
    }

    @Override // com.ironsource.K8
    public void b(JSONObject jSONObject, String str, String str2) {
        this.f37088a.b(jSONObject, str, str2);
    }
}
