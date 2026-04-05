package com.ironsource;

import android.app.Activity;
import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3293k implements tg {

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<Activity> f37047a;

    public C3293k(Activity activity) {
        this.f37047a = new WeakReference<>(activity);
    }

    @Override // com.ironsource.tg
    public void a() {
        Activity activity = this.f37047a.get();
        if (activity == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 30) {
            activity.getWindow().setFlags(1024, 1024);
            return;
        }
        WindowInsetsController windowInsetsController = activity.getWindow().getDecorView().getWindowInsetsController();
        if (windowInsetsController != null) {
            windowInsetsController.hide(WindowInsets.Type.statusBars());
        }
    }
}
