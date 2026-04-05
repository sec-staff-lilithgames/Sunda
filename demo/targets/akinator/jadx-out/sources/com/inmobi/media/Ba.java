package com.inmobi.media;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Ba {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f31671e = 0;

    /* renamed from: a, reason: collision with root package name */
    public boolean f31672a = true;

    /* renamed from: b, reason: collision with root package name */
    public String f31673b = "none";

    /* renamed from: c, reason: collision with root package name */
    public String f31674c = TtmlNode.RIGHT;

    /* renamed from: d, reason: collision with root package name */
    public String f31675d;

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OrientationProperties(allowOrientationChange=");
        sb2.append(this.f31672a);
        sb2.append(", forceOrientation='");
        sb2.append(this.f31673b);
        sb2.append("', direction='");
        sb2.append(this.f31674c);
        sb2.append("', creativeSuppliedProperties=");
        return AbstractC2962r0.a(sb2, this.f31675d, ')');
    }
}
