package com.fyber.inneractive.sdk.flow.storepromo.model;

import com.fyber.inneractive.sdk.util.h;
import j1.o2;
import java.text.DecimalFormat;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f23875a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23876b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23877c;

    public d(String str, String str2, String str3) {
        String strL;
        this.f23877c = "";
        this.f23875a = str;
        this.f23876b = str2;
        h hVar = new h(str3);
        if (hVar.f26779a == null) {
            strL = "N/A";
        } else {
            double dLongValue = r11.longValue() / 1024.0d;
            double d10 = dLongValue / 1024.0d;
            double d11 = d10 / 1024.0d;
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            strL = d10 > 850.0d ? o2.l(decimalFormat.format(d11), " GB") : dLongValue > 850.0d ? o2.l(decimalFormat.format(d10), " MB") : hVar.f26779a.longValue() > 850 ? o2.l(decimalFormat.format(dLongValue), " kB") : o2.l(decimalFormat.format(hVar.f26779a), " bytes");
        }
        this.f23877c = strL;
    }
}
