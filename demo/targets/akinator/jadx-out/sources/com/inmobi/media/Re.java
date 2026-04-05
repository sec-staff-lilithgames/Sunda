package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class Re extends I1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Re(U0 obj, byte b10) {
        super(obj);
        kotlin.jvm.internal.e0.checkNotNullParameter(obj, "obj");
    }

    public static final void a(Re this$0, Object obj) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        this$0.a(obj);
    }

    public abstract void a(Object obj);

    public final void b(Object obj) {
        new Handler(Looper.getMainLooper()).post(new zk.n(9, this, obj));
    }
}
