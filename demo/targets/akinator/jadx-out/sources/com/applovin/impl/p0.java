package com.applovin.impl;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class p0 {

    /* renamed from: a, reason: collision with root package name */
    private static final a f15013a = new a("Age Restricted User", x4.f16189q);

    /* renamed from: b, reason: collision with root package name */
    private static final a f15014b = new a("Has User Consent", x4.f16188p);

    /* renamed from: c, reason: collision with root package name */
    private static final a f15015c = new a("\"Do Not Sell\"", x4.f16190r);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f15016a;

        /* renamed from: b, reason: collision with root package name */
        private final x4 f15017b;

        public a(String str, x4 x4Var) {
            this.f15016a = str;
            this.f15017b = x4Var;
        }

        public Boolean b(Context context) {
            if (context != null) {
                return (Boolean) y4.a(this.f15017b, (Object) null, context);
            }
            com.applovin.impl.sdk.o.h("AppLovinSdk", "Failed to get value for key: " + this.f15017b);
            return null;
        }

        public String a() {
            return this.f15016a;
        }

        public String a(Context context) {
            Boolean boolB = b(context);
            return boolB != null ? boolB.toString() : "No value set";
        }
    }

    public static a a() {
        return f15015c;
    }

    public static a b() {
        return f15014b;
    }

    public static a c() {
        return f15013a;
    }

    public static boolean a(boolean z10, Context context) {
        return a(x4.f16190r, Boolean.valueOf(z10), context);
    }

    public static boolean b(boolean z10, Context context) {
        return a(x4.f16188p, Boolean.valueOf(z10), context);
    }

    public static String a(Context context) {
        return a(f15014b, context) + a(f15015c, context);
    }

    private static boolean a(x4 x4Var, Boolean bool, Context context) {
        if (context == null) {
            com.applovin.impl.sdk.o.h("AppLovinSdk", "Failed to update compliance value for key: " + x4Var);
            return false;
        }
        try {
            Boolean bool2 = (Boolean) y4.a(x4Var, (Object) null, context);
            y4.b(x4Var, bool, context);
            return bool2 == null || bool2 != bool;
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.c("ComplianceManager", "Unable to update compliance", th2);
            com.applovin.impl.sdk.k kVar = com.applovin.impl.sdk.k.D0;
            if (kVar != null) {
                kVar.E().a("ComplianceManager", "updateCompliance", th2);
            }
            return false;
        }
    }

    private static String a(a aVar, Context context) {
        return "\n" + aVar.f15016a + " - " + aVar.a(context);
    }
}
