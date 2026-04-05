package com.moloco.sdk.acm.services;

import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f45654a = new b();

    public final boolean a(String key) {
        e0.checkNotNullParameter(key, "key");
        return Boolean.parseBoolean(b(key));
    }

    public final String b(String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            Object objInvoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            e0.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) objInvoke;
            try {
                if (TextUtils.isEmpty(str2)) {
                    return null;
                }
                return str2;
            } catch (Exception unused) {
                return str2;
            }
        } catch (Exception unused2) {
            return null;
        }
    }
}
