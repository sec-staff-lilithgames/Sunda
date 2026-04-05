package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import com.inmobi.ads.R;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.m2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2880m2 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final String f33069a;

    /* renamed from: b, reason: collision with root package name */
    public final C2846k2 f33070b;

    /* renamed from: c, reason: collision with root package name */
    public final X6 f33071c;

    /* renamed from: d, reason: collision with root package name */
    public final String f33072d;

    /* renamed from: e, reason: collision with root package name */
    public final C3067x3 f33073e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f33074f;

    /* renamed from: g, reason: collision with root package name */
    public final C3084y3 f33075g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f33076h;

    /* renamed from: i, reason: collision with root package name */
    public final WeakReference f33077i;

    /* renamed from: j, reason: collision with root package name */
    public final WeakReference f33078j;

    public C2880m2(String urlToLoad, C2846k2 c2846k2, Context context, InterfaceC2779g2 interfaceC2779g2, Sb redirectionValidator, X6 x62, String api) {
        kotlin.jvm.internal.e0.checkNotNullParameter(urlToLoad, "urlToLoad");
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(redirectionValidator, "redirectionValidator");
        kotlin.jvm.internal.e0.checkNotNullParameter(api, "api");
        this.f33069a = urlToLoad;
        this.f33070b = c2846k2;
        this.f33071c = x62;
        this.f33072d = api;
        C3067x3 c3067x3 = new C3067x3();
        this.f33073e = c3067x3;
        this.f33075g = new C3084y3(interfaceC2779g2, x62);
        this.f33077i = new WeakReference(interfaceC2779g2);
        this.f33078j = new WeakReference(redirectionValidator);
        kotlin.jvm.internal.e0.checkNotNullParameter(this, "connectionCallback");
        c3067x3.f33560c = this;
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f33074f = applicationContext;
        C2925od.a(context, this);
    }

    public final void a() {
        String strA;
        C3067x3 c3067x3 = this.f33073e;
        Context context = this.f33074f;
        if (c3067x3.f33558a != null || context == null || (strA = AbstractC3101z3.a(context)) == null) {
            return;
        }
        C3033v3 c3033v3 = new C3033v3(c3067x3);
        c3067x3.f33559b = c3033v3;
        androidx.browser.customtabs.v.bindCustomTabsService(context, strA, c3033v3);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        C3067x3 c3067x3 = this.f33073e;
        Context context = this.f33074f;
        c3067x3.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        C3033v3 c3033v3 = c3067x3.f33559b;
        if (c3033v3 != null) {
            context.unbindService(c3033v3);
            c3067x3.f33558a = null;
        }
        c3067x3.f33559b = null;
        activity.getApplication().unregisterActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.e0.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
    }

    public final void a(Uri uri) {
        androidx.browser.customtabs.y yVar;
        androidx.browser.customtabs.k0 k0VarNewSession;
        C2846k2 c2846k2 = this.f33070b;
        if (c2846k2 != null) {
            try {
                yVar = a(c2846k2);
            } catch (Error unused) {
                C3067x3 c3067x3 = this.f33073e;
                androidx.browser.customtabs.k0 k0Var = c3067x3.f33561d;
                if (k0Var == null) {
                    androidx.browser.customtabs.v vVar = c3067x3.f33558a;
                    k0VarNewSession = vVar != null ? vVar.newSession(new C3050w3(c3067x3)) : null;
                    c3067x3.f33561d = k0VarNewSession;
                    k0Var = k0VarNewSession;
                }
                yVar = new androidx.browser.customtabs.y(k0Var);
                yVar.setUrlBarHidingEnabled(true);
            }
        } else {
            C3067x3 c3067x32 = this.f33073e;
            androidx.browser.customtabs.k0 k0Var2 = c3067x32.f33561d;
            if (k0Var2 == null) {
                androidx.browser.customtabs.v vVar2 = c3067x32.f33558a;
                k0VarNewSession = vVar2 != null ? vVar2.newSession(new C3050w3(c3067x32)) : null;
                c3067x32.f33561d = k0VarNewSession;
                k0Var2 = k0VarNewSession;
            }
            yVar = new androidx.browser.customtabs.y(k0Var2);
            yVar.setUrlBarHidingEnabled(true);
        }
        Context context = this.f33074f;
        androidx.browser.customtabs.z zVarBuild = yVar.build();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(zVarBuild, "build(...)");
        AbstractC3016u3.a(context, zVarBuild, uri, (InterfaceC2779g2) this.f33077i.get(), this.f33071c, (Sb) this.f33078j.get(), this.f33072d);
    }

    public final androidx.browser.customtabs.y a(C2846k2 c2846k2) {
        Bitmap bitmap;
        C3067x3 c3067x3 = this.f33073e;
        androidx.browser.customtabs.k0 k0VarNewSession = c3067x3.f33561d;
        if (k0VarNewSession == null) {
            androidx.browser.customtabs.v vVar = c3067x3.f33558a;
            k0VarNewSession = vVar != null ? vVar.newSession(new C3050w3(c3067x3)) : null;
            c3067x3.f33561d = k0VarNewSession;
        }
        androidx.browser.customtabs.y closeButtonPosition = new androidx.browser.customtabs.y(k0VarNewSession).setCloseButtonPosition(2);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(closeButtonPosition, "setCloseButtonPosition(...)");
        try {
            closeButtonPosition.setShareState(2);
            closeButtonPosition.setShowTitle(false);
            closeButtonPosition.setDownloadButtonEnabled(false);
            closeButtonPosition.setBookmarksButtonEnabled(false);
        } catch (Error unused) {
        }
        if (c2846k2.f32995b) {
            Context context = this.f33074f;
            int i10 = R.drawable.im_close_transparent;
            kotlin.jvm.internal.e0.checkNotNullParameter(context, "<this>");
            Drawable drawable = m3.a.getDrawable(context, i10);
            if (drawable instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(bitmap, "getBitmap(...)");
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable != null ? drawable.getIntrinsicWidth() : 24, drawable != null ? drawable.getIntrinsicHeight() : 24, Bitmap.Config.ARGB_8888);
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(bitmapCreateBitmap, "Bitmap.createBitmap(width, height, config)");
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                if (drawable != null) {
                    drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                }
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                bitmap = bitmapCreateBitmap;
            }
            closeButtonPosition.setCloseButtonIcon(bitmap);
        }
        C2696b4 c2696b4H = AbstractC2679a4.h();
        EnumC3108za enumC3108zaA = Aa.a(AbstractC2679a4.g());
        if (enumC3108zaA != EnumC3108za.f33721b && enumC3108zaA != EnumC3108za.f33723d) {
            closeButtonPosition.setInitialActivityHeightPx((int) (((int) (c2696b4H.f32675b * c2846k2.f32994a)) * c2696b4H.f32676c), 2);
        } else {
            int i11 = (int) (c2696b4H.f32674a * c2846k2.f32994a);
            closeButtonPosition.setInitialActivityWidthPx((int) (i11 * c2696b4H.f32676c));
            closeButtonPosition.setActivitySideSheetBreakpointDp(i11);
        }
        closeButtonPosition.setUrlBarHidingEnabled(true);
        return closeButtonPosition;
    }
}
