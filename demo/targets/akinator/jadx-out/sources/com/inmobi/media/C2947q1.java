package com.inmobi.media;

import android.os.Message;
import com.inmobi.commons.core.configs.AdConfig;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.q1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2947q1 implements InterfaceC2930p1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HandlerC2963r1 f33277a;

    public C2947q1(HandlerC2963r1 handlerC2963r1) {
        this.f33277a = handlerC2963r1;
    }

    @Override // com.inmobi.media.InterfaceC2930p1
    public final void a(Z9 response, String locationOnDisk, C2826j asset) {
        kotlin.jvm.internal.e0.checkNotNullParameter(response, "response");
        kotlin.jvm.internal.e0.checkNotNullParameter(locationOnDisk, "locationOnDisk");
        kotlin.jvm.internal.e0.checkNotNullParameter(asset, "asset");
        C3031v1 c3031v1 = (C3031v1) this.f33277a.f33298a.get();
        AdConfig.AssetCacheConfig assetCacheConfig = c3031v1 != null ? C3031v1.f33470c : null;
        if (assetCacheConfig == null) {
            C3031v1 c3031v12 = C3031v1.f33468a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("v1", "access$getTAG$p(...)");
            return;
        }
        C3031v1 c3031v13 = C3031v1.f33468a;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue("v1", "access$getTAG$p(...)");
        AdConfig.AssetCacheConfig assetCacheConfig2 = assetCacheConfig;
        C2810i c2810iA = new C2810i().a(asset.f32940b, locationOnDisk, response, assetCacheConfig2.getMaxRetries(), assetCacheConfig2.getTimeToLive());
        int i10 = c2810iA.f32907a;
        String str = c2810iA.f32909c;
        if (str == null) {
            str = "";
        }
        C2826j c2826j = new C2826j(i10, str, c2810iA.f32910d, c2810iA.f32908b, c2810iA.f32911e, c2810iA.f32912f, c2810iA.f32913g, c2810iA.f32914h);
        AbstractC2807hd.a().a(c2826j);
        c2826j.f32948j = asset.f32948j;
        c2826j.f32949k = asset.f32949k;
        c3031v1.a(c2826j, (byte) -1);
        HandlerC2963r1 handlerC2963r1 = this.f33277a;
        handlerC2963r1.getClass();
        try {
            handlerC2963r1.sendEmptyMessage(3);
        } catch (Exception unused) {
            C3031v1 c3031v14 = C3031v1.f33468a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("v1", "access$getTAG$p(...)");
        }
    }

    @Override // com.inmobi.media.InterfaceC2930p1
    public final void a(C2826j asset) {
        kotlin.jvm.internal.e0.checkNotNullParameter(asset, "asset");
        C3031v1 c3031v1 = (C3031v1) this.f33277a.f33298a.get();
        if (c3031v1 != null) {
            C3031v1 c3031v12 = C3031v1.f33468a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("v1", "access$getTAG$p(...)");
            C3031v1.f33478k.remove(asset.f32940b);
            int i10 = asset.f32942d;
            if (i10 > 0) {
                asset.f32942d = i10 - 1;
                asset.f32943e = System.currentTimeMillis();
                AbstractC2807hd.a().a(asset);
                this.f33277a.a();
                return;
            }
            c3031v1.a(asset, asset.f32950l);
            HandlerC2963r1 handlerC2963r1 = this.f33277a;
            handlerC2963r1.getClass();
            try {
                Message messageObtain = Message.obtain();
                messageObtain.what = 4;
                messageObtain.obj = asset;
                handlerC2963r1.sendMessage(messageObtain);
                return;
            } catch (Exception unused) {
                C3031v1 c3031v13 = C3031v1.f33468a;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("v1", "access$getTAG$p(...)");
                return;
            }
        }
        C3031v1 c3031v14 = C3031v1.f33468a;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue("v1", "access$getTAG$p(...)");
    }
}
