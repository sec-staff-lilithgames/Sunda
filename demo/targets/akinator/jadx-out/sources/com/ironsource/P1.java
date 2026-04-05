package com.ironsource;

import android.os.Looper;
import android.util.Log;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class P1 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f35167a = new a(null);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public final void a() {
            if (kotlin.jvm.internal.e0.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                Log.e("AssertThread", "ALERT UI THREAD: " + Thread.currentThread().getStackTrace()[4].getMethodName());
            }
        }

        private a() {
        }
    }

    public static final void a() {
        f35167a.a();
    }
}
