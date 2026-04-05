package com.inmobi.media;

import androidx.core.app.NotificationCompat;
import com.inmobi.commons.core.configs.AdConfig;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.u1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3014u1 implements InterfaceC2930p1 {
    @Override // com.inmobi.media.InterfaceC2930p1
    public final void a(Z9 response, String locationOnDisk, C2826j asset) {
        kotlin.jvm.internal.e0.checkNotNullParameter(response, "response");
        kotlin.jvm.internal.e0.checkNotNullParameter(locationOnDisk, "locationOnDisk");
        kotlin.jvm.internal.e0.checkNotNullParameter(asset, "asset");
        C3031v1 c3031v1 = C3031v1.f33468a;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue("v1", "access$getTAG$p(...)");
        AdConfig.AssetCacheConfig assetCacheConfig = C3031v1.f33470c;
        if (assetCacheConfig != null) {
            C2810i c2810iA = new C2810i().a(asset.f32940b, locationOnDisk, response, assetCacheConfig.getMaxRetries(), assetCacheConfig.getTimeToLive());
            int i10 = c2810iA.f32907a;
            String str = c2810iA.f32909c;
            if (str == null) {
                str = "";
            }
            C2826j c2826j = new C2826j(i10, str, c2810iA.f32910d, c2810iA.f32908b, c2810iA.f32911e, c2810iA.f32912f, c2810iA.f32913g, c2810iA.f32914h);
            AbstractC2807hd.a().a(c2826j);
            c2826j.f32948j = asset.f32948j;
            c2826j.f32949k = asset.f32949k;
            C3031v1.f33468a.a(c2826j, (byte) -1);
        }
        try {
            C3031v1 c3031v12 = C3031v1.f33468a;
            if (C3031v1.f33477j.get()) {
                return;
            }
            c3031v12.c();
        } catch (Exception e10) {
            C3031v1 c3031v13 = C3031v1.f33468a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("v1", "access$getTAG$p(...)");
            Y5 y52 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
        }
    }

    @Override // com.inmobi.media.InterfaceC2930p1
    public final void a(C2826j asset) {
        kotlin.jvm.internal.e0.checkNotNullParameter(asset, "asset");
        C3031v1 c3031v1 = C3031v1.f33468a;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue("v1", "access$getTAG$p(...)");
        String str = asset.f32940b;
        C3031v1 c3031v12 = C3031v1.f33468a;
        C3031v1.f33478k.remove(str);
        if (asset.f32942d <= 0) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("v1", "access$getTAG$p(...)");
            c3031v12.a(asset, asset.f32950l);
            C2913o1 c2913o1A = AbstractC2807hd.a();
            c2913o1A.getClass();
            kotlin.jvm.internal.e0.checkNotNullParameter(asset, "asset");
            c2913o1A.a("id = ?", new String[]{String.valueOf(asset.f32939a)});
        } else {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("v1", "access$getTAG$p(...)");
            asset.f32943e = System.currentTimeMillis();
            AbstractC2807hd.a().a(asset);
            if (C2736da.a(false) != null) {
                c3031v12.a(asset, asset.f32950l);
            }
        }
        try {
            if (C3031v1.f33477j.get()) {
                return;
            }
            c3031v12.c();
        } catch (Exception e10) {
            C3031v1 c3031v13 = C3031v1.f33468a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("v1", "access$getTAG$p(...)");
            Y5 y52 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
        }
    }
}
