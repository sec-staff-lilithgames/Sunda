package com.inmobi.media;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.r8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2970r8 extends C2903n8 implements Iterable, lv.a {
    public final ArrayList A;
    public int B;
    public final boolean C;
    public final boolean D;

    /* renamed from: x, reason: collision with root package name */
    public final int f33311x;

    /* renamed from: y, reason: collision with root package name */
    public long f33312y;

    /* renamed from: z, reason: collision with root package name */
    public final byte f33313z;

    public /* synthetic */ C2970r8(String str, String str2, C2920o8 c2920o8, String str3, JSONObject jSONObject, byte b10) {
        this(str, str2, c2920o8, new ArrayList(), str3, jSONObject, b10);
    }

    public final void a(C2903n8 child) {
        kotlin.jvm.internal.e0.checkNotNullParameter(child, "child");
        int i10 = this.B;
        if (i10 < this.f33311x) {
            this.B = i10 + 1;
            this.A.add(child);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C2954q8(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2970r8(String assetId, String assetName, C2920o8 assetStyle, List trackers, String interactionMode, JSONObject rawAssetJson, byte b10) {
        super(assetId, assetName, "CONTAINER", assetStyle, trackers);
        kotlin.jvm.internal.e0.checkNotNullParameter(assetId, "assetId");
        kotlin.jvm.internal.e0.checkNotNullParameter(assetName, "assetName");
        kotlin.jvm.internal.e0.checkNotNullParameter(assetStyle, "assetStyle");
        kotlin.jvm.internal.e0.checkNotNullParameter(trackers, "trackers");
        kotlin.jvm.internal.e0.checkNotNullParameter(interactionMode, "interactionMode");
        kotlin.jvm.internal.e0.checkNotNullParameter(rawAssetJson, "rawAssetJson");
        this.f33311x = 16;
        this.f33313z = b10;
        this.A = new ArrayList();
        kotlin.jvm.internal.e0.checkNotNullParameter(interactionMode, "<set-?>");
        this.f33142g = interactionMode;
        this.C = sv.k0.equals("root", assetName, true);
        this.D = sv.k0.equals("card_scrollable", assetName, true);
    }
}
