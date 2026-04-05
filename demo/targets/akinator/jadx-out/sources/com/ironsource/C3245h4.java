package com.ironsource;

import android.app.Activity;
import android.content.MutableContextWrapper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.h4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3245h4 {

    /* renamed from: a, reason: collision with root package name */
    MutableContextWrapper f36832a;

    public synchronized void a(Activity activity) {
        try {
            if (this.f36832a == null) {
                this.f36832a = new MutableContextWrapper(activity);
            }
            this.f36832a.setBaseContext(activity);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void b() {
        this.f36832a = null;
    }

    public Activity a() {
        return (Activity) this.f36832a.getBaseContext();
    }
}
