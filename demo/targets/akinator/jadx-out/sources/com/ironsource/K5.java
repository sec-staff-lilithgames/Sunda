package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
class K5 {

    /* renamed from: a, reason: collision with root package name */
    static final String f34747a = "ironbeast";

    /* renamed from: b, reason: collision with root package name */
    static final String f34748b = "outcome";

    /* renamed from: c, reason: collision with root package name */
    static final int f34749c = 4;

    /* renamed from: d, reason: collision with root package name */
    static final int f34750d = 3;

    /* renamed from: e, reason: collision with root package name */
    static final int f34751e = 2;

    /* renamed from: f, reason: collision with root package name */
    static final int f34752f = 0;

    public static AbstractC3186e a(String str, int i10) {
        if (f34747a.equals(str)) {
            return new C3269ia(i10);
        }
        if (f34748b.equals(str)) {
            return new Wc(i10);
        }
        if (i10 == 2) {
            return new C3269ia(i10);
        }
        if (i10 == 3) {
            return new Wc(i10);
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.NATIVE, "EventsFormatterFactory failed to instantiate a formatter (type: " + str + ", adUnit: " + i10 + ")", 2);
        return null;
    }
}
