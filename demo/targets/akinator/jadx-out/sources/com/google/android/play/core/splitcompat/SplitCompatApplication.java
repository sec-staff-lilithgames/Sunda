package com.google.android.play.core.splitcompat;

import android.app.Application;
import android.content.Context;
import ih.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class SplitCompatApplication extends Application {
    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        a.install(this);
    }
}
