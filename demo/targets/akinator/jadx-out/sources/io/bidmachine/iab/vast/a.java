package io.bidmachine.iab.vast;

import com.amazon.device.ads.MraidExpandCommand;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.ads.internal.Constants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f60390b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f60391c;

    /* renamed from: e, reason: collision with root package name */
    public static final a f60392e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f60393f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f60394g;

    /* renamed from: h, reason: collision with root package name */
    public static final a f60395h;

    /* renamed from: i, reason: collision with root package name */
    public static final a f60396i;

    /* renamed from: j, reason: collision with root package name */
    public static final a f60397j;

    /* renamed from: k, reason: collision with root package name */
    public static final a f60398k;

    /* renamed from: l, reason: collision with root package name */
    public static final a f60399l;

    /* renamed from: m, reason: collision with root package name */
    public static final a f60400m;

    /* renamed from: n, reason: collision with root package name */
    public static final a f60401n;

    /* renamed from: o, reason: collision with root package name */
    public static final a f60402o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ a[] f60403p;

    static {
        a aVar = new a("creativeView", 0);
        f60390b = aVar;
        a aVar2 = new a("start", 1);
        f60391c = aVar2;
        a aVar3 = new a("firstQuartile", 2);
        f60392e = aVar3;
        a aVar4 = new a(CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT, 3);
        f60393f = aVar4;
        a aVar5 = new a("thirdQuartile", 4);
        f60394g = aVar5;
        a aVar6 = new a(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE, 5);
        f60395h = aVar6;
        a aVar7 = new a(CampaignEx.JSON_NATIVE_VIDEO_MUTE, 6);
        f60396i = aVar7;
        a aVar8 = new a(CampaignEx.JSON_NATIVE_VIDEO_UNMUTE, 7);
        f60397j = aVar8;
        a aVar9 = new a("skip", 8);
        f60398k = aVar9;
        a aVar10 = new a(CampaignEx.JSON_NATIVE_VIDEO_PAUSE, 9);
        f60399l = aVar10;
        a aVar11 = new a("rewind", 10);
        a aVar12 = new a(CampaignEx.JSON_NATIVE_VIDEO_RESUME, 11);
        f60400m = aVar12;
        a aVar13 = new a(Constants.TEMPLATE_TYPE_FULLSCREEN, 12);
        f60401n = aVar13;
        a aVar14 = new a(MraidExpandCommand.NAME, 13);
        a aVar15 = new a("collapse", 14);
        a aVar16 = new a("acceptInvitation", 15);
        a aVar17 = new a("close", 16);
        f60402o = aVar17;
        f60403p = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f60403p.clone();
    }
}
