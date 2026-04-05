package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Fe {

    /* renamed from: a, reason: collision with root package name */
    public final U0 f31800a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f31801b;

    public Fe(U0 timeOutInformer) {
        kotlin.jvm.internal.e0.checkNotNullParameter(timeOutInformer, "timeOutInformer");
        this.f31800a = timeOutInformer;
        this.f31801b = new HashMap();
    }

    public final void a(byte b10) {
        new Handler(Looper.getMainLooper()).post(new zk.k(this, b10, 1));
    }

    public static final void a(Fe this$0, byte b10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        this$0.f31800a.a(b10);
    }
}
