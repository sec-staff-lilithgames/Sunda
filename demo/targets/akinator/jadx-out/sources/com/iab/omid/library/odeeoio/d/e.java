package com.iab.omid.library.odeeoio.d;

import android.text.TextUtils;
import com.iab.omid.library.odeeoio.Omid;
import com.iab.omid.library.odeeoio.adsession.CreativeType;
import com.iab.omid.library.odeeoio.adsession.ImpressionType;
import com.iab.omid.library.odeeoio.adsession.Owner;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class e {
    public static void a() {
        if (!Omid.isActive()) {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
    }

    public static void b(com.iab.omid.library.odeeoio.adsession.a aVar) {
        if (aVar.h()) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    public static void c(com.iab.omid.library.odeeoio.adsession.a aVar) {
        h(aVar);
        b(aVar);
    }

    public static void d(com.iab.omid.library.odeeoio.adsession.a aVar) {
        if (aVar.getAdSessionStatePublisher().c() != null) {
            throw new IllegalStateException("AdEvents already exists for AdSession");
        }
    }

    public static void e(com.iab.omid.library.odeeoio.adsession.a aVar) {
        if (aVar.getAdSessionStatePublisher().d() != null) {
            throw new IllegalStateException("MediaEvents already exists for AdSession");
        }
    }

    public static void f(com.iab.omid.library.odeeoio.adsession.a aVar) {
        if (!aVar.i()) {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
    }

    public static void g(com.iab.omid.library.odeeoio.adsession.a aVar) {
        if (!aVar.j()) {
            throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
        }
    }

    private static void h(com.iab.omid.library.odeeoio.adsession.a aVar) {
        if (!aVar.g()) {
            throw new IllegalStateException("AdSession is not started");
        }
    }

    public static void a(Owner owner, CreativeType creativeType, ImpressionType impressionType) {
        if (owner == Owner.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        if (creativeType == CreativeType.DEFINED_BY_JAVASCRIPT && owner == Owner.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (impressionType == ImpressionType.DEFINED_BY_JAVASCRIPT && owner == Owner.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
    }

    public static void a(com.iab.omid.library.odeeoio.adsession.a aVar) {
        if (aVar.g()) {
            throw new IllegalStateException("AdSession is started");
        }
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void a(String str, int i10, String str2) {
        if (str.length() > i10) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }
}
