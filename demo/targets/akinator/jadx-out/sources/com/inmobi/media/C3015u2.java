package com.inmobi.media;

import com.inmobi.commons.core.configs.AdConfig;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.u2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3015u2 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3032v2 f33417a;

    /* renamed from: b, reason: collision with root package name */
    public final F5 f33418b;

    public C3015u2(InterfaceC3032v2 mEventHandler, F5 f52) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mEventHandler, "mEventHandler");
        this.f33417a = mEventHandler;
        this.f33418b = f52;
    }

    public final void a(C2897n2 click) {
        HashMap map;
        kotlin.jvm.internal.e0.checkNotNullParameter(click, "click");
        try {
            F5 f52 = this.f33418b;
            if (f52 != null) {
                String strF = C3100z2.f();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(strF, "access$getTAG$p(...)");
                ((G5) f52).c(strF, "ping - " + click.f33110a);
            }
            X9 mRequest = new X9(click.f33111b, this.f33418b);
            HashMap mapA = C3100z2.a(C3100z2.f33672a, click);
            if (!mapA.isEmpty()) {
                mRequest.f32500i.putAll(mapA);
            }
            mRequest.f32515x = false;
            mRequest.f32511t = false;
            mRequest.f32512u = false;
            Map map2 = click.f33112c;
            if (map2 != null && (map = mRequest.f32501j) != null) {
                map.putAll(map2);
            }
            mRequest.f32509r = click.f33113d;
            AdConfig.ImaiConfig imaiConfig = C3100z2.f33678g;
            if (imaiConfig != null) {
                mRequest.f32507p = imaiConfig.getPingTimeout() * 1000;
                mRequest.f32508q = imaiConfig.getPingTimeout() * 1000;
            }
            kotlin.jvm.internal.e0.checkNotNullParameter(mRequest, "mRequest");
            Z9 z9B = mRequest.b();
            if (!z9B.b()) {
                this.f33417a.a(click);
                return;
            }
            S9 s92 = z9B.f32602d;
            EnumC3017u4 enumC3017u4 = s92 != null ? s92.f32266a : EnumC3017u4.f33422e;
            if (EnumC3017u4.f33428k == enumC3017u4) {
                this.f33417a.a(click);
                return;
            }
            if (!click.f33113d && (EnumC3017u4.f33439v == enumC3017u4 || EnumC3017u4.f33441x == enumC3017u4)) {
                this.f33417a.a(click);
                return;
            }
            if (C2736da.f32781a && (enumC3017u4 == EnumC3017u4.f33434q || enumC3017u4 == EnumC3017u4.f33433p || enumC3017u4 == EnumC3017u4.f33432o || enumC3017u4 == EnumC3017u4.f33431n || enumC3017u4 == EnumC3017u4.f33435r)) {
                return;
            }
            this.f33417a.a(click, enumC3017u4);
        } catch (Exception unused) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(C3100z2.f(), "access$getTAG$p(...)");
            InterfaceC3032v2 interfaceC3032v2 = this.f33417a;
            EnumC3017u4 errorCode = EnumC3017u4.f33422e;
            kotlin.jvm.internal.e0.checkNotNullParameter(errorCode, "errorCode");
            interfaceC3032v2.a(click, errorCode);
        }
    }
}
