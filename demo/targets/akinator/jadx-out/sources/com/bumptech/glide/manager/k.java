package com.bumptech.glide.manager;

import android.app.Activity;
import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class k implements l {

    /* renamed from: a, reason: collision with root package name */
    public final Set f16639a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f16640b;

    @Override // com.bumptech.glide.manager.l
    public void registerSelf(Activity activity) {
        if (!this.f16640b && this.f16639a.add(activity)) {
            View decorView = activity.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new j(this, decorView));
        }
    }
}
