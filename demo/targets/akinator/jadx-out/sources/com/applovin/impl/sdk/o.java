package com.applovin.impl.sdk;

import android.text.TextUtils;
import android.util.Log;
import com.applovin.impl.s2;
import com.applovin.impl.v4;
import com.ironsource.C3191e4;
import hr.kNq.ikJMrW;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class o {

    /* renamed from: b, reason: collision with root package name */
    private static boolean f15663b;

    /* renamed from: a, reason: collision with root package name */
    private final k f15664a;

    public o(k kVar) {
        this.f15664a = kVar;
        a("SDK Session Begin");
    }

    public static void a(boolean z10) {
        f15663b = z10;
    }

    public static void c(String str, String str2, Throwable th2) {
        if (!f15663b || a()) {
            Log.e("AppLovinSdk", a.b.m(C3191e4.i.f36529d, str, "] ", str2), th2);
        }
    }

    public static void e(String str, String str2) {
        g(str, str2);
    }

    public static void g(String str, String str2) {
        if (!f15663b || a()) {
            Log.d("AppLovinSdk", C3191e4.i.f36529d + str + "] " + str2);
        }
    }

    public static void h(String str, String str2) {
        c(str, str2, null);
    }

    public static void i(String str, String str2) {
        if (!f15663b || a()) {
            Log.i("AppLovinSdk", C3191e4.i.f36529d + str + "] " + str2);
        }
    }

    public static void j(String str, String str2) {
        if (!f15663b || a()) {
            Log.w("AppLovinSdk", C3191e4.i.f36529d + str + "] " + str2);
        }
    }

    public static void l(String str, String str2) {
        k kVar = k.D0;
        if (kVar == null) {
            return;
        }
        kVar.O();
        if (a()) {
            k.D0.O().k(str, str2);
        }
    }

    public void b(String str, String str2) {
        a(str, str2, null);
    }

    public void d(String str, String str2) {
        Log.i("AppLovinSdk", C3191e4.i.f36529d + str + "] " + str2);
    }

    public void f(String str, String str2) {
        int iIntValue;
        if (a(this.f15664a) && !TextUtils.isEmpty(str2) && (iIntValue = ((Integer) this.f15664a.a(v4.f16015r)).intValue()) > 0) {
            int length = str2.length();
            int i10 = ((length + iIntValue) - 1) / iIntValue;
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = i11 * iIntValue;
                a(str, str2.substring(i12, Math.min(length, i12 + iIntValue)));
            }
        }
    }

    public void k(String str, String str2) {
        d(str, str2, null);
    }

    private void a(String str) {
        s2 s2Var = new s2();
        s2Var.a().a(str).a();
        g("AppLovinSdk", s2Var.toString());
    }

    public static void b(String str, String str2, Throwable th2) {
        k kVar = k.D0;
        if (kVar == null) {
            return;
        }
        kVar.O();
        if (a()) {
            k.D0.O().a(str, str2, th2);
        }
    }

    public void d(String str, String str2, Throwable th2) {
        Log.w("AppLovinSdk", a.b.m(ikJMrW.ZGy, str, "] ", str2), th2);
    }

    public void a(String str, Throwable th2) {
        for (Throwable th3 : th2.getSuppressed()) {
            b(str, th3.toString());
        }
    }

    public void a(String str, String str2) {
        Log.d("AppLovinSdk", C3191e4.i.f36529d + str + "] " + str2);
    }

    public void a(String str, String str2, Throwable th2) {
        Log.e("AppLovinSdk", a.b.m(C3191e4.i.f36529d, str, "] ", str2), th2);
    }

    public static void c(String str, String str2) {
        b(str, str2, null);
    }

    public static boolean a() {
        return a(k.D0);
    }

    public static boolean a(k kVar) {
        return kVar != null && kVar.p0().c();
    }
}
