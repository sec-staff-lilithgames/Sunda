package com.ironsource;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.l, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3311l implements tg {

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<Activity> f37115a;

    public C3311l(Activity activity) {
        this.f37115a = new WeakReference<>(activity);
    }

    @Override // com.ironsource.tg
    public void a() {
        Activity activity = this.f37115a.get();
        if (activity != null) {
            activity.requestWindowFeature(1);
        }
    }
}
