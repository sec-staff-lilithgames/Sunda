package com.inmobi.media;

import com.amazon.device.ads.DtbConstants;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class J4 {
    public static final Z9 a(Sc sc2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sc2, "<this>");
        Z9 z92 = new Z9();
        byte[] value = sc2.f32274c;
        if (value != null) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            if (value.length == 0) {
                z92.f32600b = new byte[0];
            } else {
                byte[] bArr = new byte[value.length];
                z92.f32600b = bArr;
                System.arraycopy(value, 0, bArr, 0, value.length);
            }
        }
        z92.f32604f = sc2.f32273b;
        z92.f32603e = sc2.f32276e;
        z92.f32602d = sc2.f32272a;
        Integer num = sc2.f32275d;
        z92.f32601c = Integer.valueOf(num != null ? num.intValue() : 0);
        return z92;
    }

    public static final boolean a(String str) {
        if (str == null || sv.n0.trim(str).toString().length() == 0) {
            return true;
        }
        return (sv.k0.startsWith$default(str, DtbConstants.HTTP, false, 2, null) || sv.k0.startsWith$default(str, DtbConstants.HTTPS, false, 2, null)) ? false : true;
    }

    public static final void a(Thread thread, String name) {
        kotlin.jvm.internal.e0.checkNotNullParameter(thread, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        try {
            thread.start();
        } catch (InternalError e10) {
            e10.toString();
        }
    }
}
