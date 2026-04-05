package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class l0 {

    /* renamed from: c, reason: collision with root package name */
    public static WeakReference f29830c;

    /* renamed from: a, reason: collision with root package name */
    public h0 f29831a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f29832b;

    public l0(SharedPreferences sharedPreferences, Executor executor) {
        this.f29832b = executor;
    }

    public static synchronized l0 getInstance(Context context, Executor executor) {
        l0 l0Var;
        try {
            WeakReference weakReference = f29830c;
            l0Var = weakReference != null ? (l0) weakReference.get() : null;
            if (l0Var == null) {
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
                l0Var = new l0(sharedPreferences, executor);
                synchronized (l0Var) {
                    l0Var.f29831a = h0.a(sharedPreferences, executor);
                }
                f29830c = new WeakReference(l0Var);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return l0Var;
    }

    public final synchronized k0 a() {
        k0 k0Var;
        String strPeek = this.f29831a.peek();
        Pattern pattern = k0.f29825d;
        k0Var = null;
        if (!TextUtils.isEmpty(strPeek)) {
            String[] strArrSplit = strPeek.split("!", -1);
            if (strArrSplit.length == 2) {
                k0Var = new k0(strArrSplit[0], strArrSplit[1]);
            }
        }
        return k0Var;
    }
}
