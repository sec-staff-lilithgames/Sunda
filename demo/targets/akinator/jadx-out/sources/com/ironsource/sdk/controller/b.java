package com.ironsource.sdk.controller;

import android.webkit.JavascriptInterface;
import com.ironsource.sdk.controller.v;
import com.ironsource.sdk.utils.Logger;
import java.lang.reflect.Method;
import java.security.AccessControlException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
class b {

    /* renamed from: b, reason: collision with root package name */
    private static final String f38459b = "b";

    /* renamed from: a, reason: collision with root package name */
    private final v.r f38460a;

    public b(v.r rVar) {
        this.f38460a = rVar;
    }

    public synchronized void a(String str, String str2) throws Exception {
        if (this.f38460a == null) {
            Logger.e(f38459b, "!!! nativeAPI == null !!!");
            return;
        }
        Method declaredMethod = v.r.class.getDeclaredMethod(str, String.class);
        if (declaredMethod.isAnnotationPresent(JavascriptInterface.class)) {
            declaredMethod.invoke(this.f38460a, str2);
        } else {
            throw new AccessControlException("Trying to access a private function: " + str);
        }
    }

    public void b(String str) {
        v.r rVar = this.f38460a;
        if (rVar != null) {
            rVar.d(str);
        }
    }

    public void a(String str) {
        v.r rVar = this.f38460a;
        if (rVar != null) {
            rVar.c(str);
        }
    }
}
