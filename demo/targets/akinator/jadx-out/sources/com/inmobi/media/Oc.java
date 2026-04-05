package com.inmobi.media;

import com.amazon.device.ads.DtbConstants;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Oc {

    /* renamed from: a, reason: collision with root package name */
    public final String f32100a;

    /* renamed from: b, reason: collision with root package name */
    public final Lc f32101b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f32102c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f32103d;

    /* renamed from: e, reason: collision with root package name */
    public final String f32104e;

    /* renamed from: f, reason: collision with root package name */
    public final Mc f32105f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f32106g;

    /* renamed from: h, reason: collision with root package name */
    public final Nc f32107h;

    /* renamed from: i, reason: collision with root package name */
    public final int f32108i;

    /* renamed from: j, reason: collision with root package name */
    public final int f32109j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f32110k;

    /* renamed from: l, reason: collision with root package name */
    public W9 f32111l;

    /* renamed from: m, reason: collision with root package name */
    public int f32112m;

    public Oc(Kc kc2) {
        kotlin.jvm.internal.e0.checkNotNullExpressionValue("Oc", "getSimpleName(...)");
        this.f32100a = kc2.f31956a;
        this.f32101b = kc2.f31957b;
        this.f32102c = kc2.f31958c;
        this.f32103d = kc2.f31959d;
        String str = kc2.f31960e;
        this.f32104e = str == null ? "" : str;
        this.f32105f = Mc.f32035a;
        Boolean bool = kc2.f31961f;
        this.f32106g = bool != null ? bool.booleanValue() : true;
        this.f32107h = kc2.f31962g;
        Integer num = kc2.f31963h;
        int i10 = DtbConstants.NETWORK_READ_TIMEOUT;
        this.f32108i = num != null ? num.intValue() : 60000;
        Integer num2 = kc2.f31964i;
        this.f32109j = num2 != null ? num2.intValue() : i10;
        Boolean bool2 = kc2.f31965j;
        this.f32110k = bool2 != null ? bool2.booleanValue() : false;
    }

    public final String toString() {
        return "URL:" + T9.a(this.f32100a, this.f32103d) + " | TAG:null | METHOD:" + this.f32101b + " | PAYLOAD:" + this.f32104e + " | HEADERS:" + this.f32102c + " | RETRY_POLICY:" + this.f32107h;
    }
}
