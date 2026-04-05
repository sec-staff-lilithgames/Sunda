package com.ironsource;

import android.os.Handler;
import com.ironsource.W6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class X6 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements W6.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Handler f35705a;

        public a(Handler handler) {
            this.f35705a = handler;
        }

        @Override // com.ironsource.W6.a
        public void a(Runnable runnable, long j10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(runnable, "runnable");
            this.f35705a.postDelayed(runnable, j10);
        }
    }

    public static final W6.a a(Handler handler) {
        kotlin.jvm.internal.e0.checkNotNullParameter(handler, "<this>");
        return new a(handler);
    }
}
