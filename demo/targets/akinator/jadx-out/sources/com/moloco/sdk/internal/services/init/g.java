package com.moloco.sdk.internal.services.init;

import android.content.SharedPreferences;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ g f47098a = new g();

    public final h a(SharedPreferences sharedPreferences) {
        e0.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        return new i(sharedPreferences, com.moloco.sdk.internal.scheduling.c.a().getIo());
    }
}
