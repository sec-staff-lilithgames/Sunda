package com.apm.insight.i;

import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import com.apm.insight.runtime.o;
import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile UUID f13056a = null;

    /* renamed from: b, reason: collision with root package name */
    private static String f13057b = "";

    private a(Context context) {
        String string;
        if (f13056a == null) {
            synchronized (a.class) {
                if (f13056a == null) {
                    String strC = o.a().c();
                    if (strC != null) {
                        f13056a = UUID.fromString(strC);
                    } else {
                        try {
                            string = Settings.Secure.getString(context.getContentResolver(), "android_id");
                        } catch (Throwable unused) {
                            string = null;
                        }
                        try {
                            if (string != null) {
                                f13056a = UUID.nameUUIDFromBytes(string.getBytes("utf8"));
                            } else {
                                f13056a = UUID.randomUUID();
                            }
                        } catch (Throwable unused2) {
                        }
                        try {
                            o.a().b(f13056a.toString());
                        } catch (Throwable unused3) {
                        }
                    }
                }
            }
        }
    }

    public static synchronized String a(Context context) {
        try {
            if (TextUtils.isEmpty(f13057b)) {
                new a(context);
                UUID uuid = f13056a;
                if (uuid != null) {
                    f13057b = uuid.toString();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f13057b;
    }
}
