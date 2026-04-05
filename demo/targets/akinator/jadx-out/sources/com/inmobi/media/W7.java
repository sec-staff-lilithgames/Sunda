package com.inmobi.media;

import android.content.Context;
import android.content.Intent;
import android.util.SparseArray;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class W7 extends I1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2734d8 f32444d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2734d8 f32445e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W7(C2734d8 c2734d8, C2734d8 c2734d82) {
        super(c2734d8);
        this.f32444d = c2734d8;
        this.f32445e = c2734d82;
    }

    @Override // com.inmobi.media.I1
    public final void a() {
        JSONObject jSONObjectE;
        C2734d8 c2734d8 = this.f32444d;
        if (c2734d8.C == null) {
            F5 f52 = c2734d8.f32749j;
            if (f52 != null) {
                String TAG = c2734d8.f32752m;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                ((G5) f52).c(TAG, "prepareFullscreenContainer");
            }
            C3106z8 c3106z8 = c2734d8.f32741b;
            JSONArray jSONArray = c3106z8.f33705f;
            if (jSONArray != null && !D2.a(jSONArray) && (jSONObjectE = c3106z8.e()) != null) {
                byte b10 = c2734d8.f32740a;
                C3106z8 dataModel = new C3106z8(b10, jSONObjectE, c3106z8, b10 == 0, c2734d8.f32758s, c2734d8.f32749j);
                dataModel.f33716q = c3106z8.f33716q;
                Context context = (Context) c2734d8.f32763x.get();
                if (dataModel.f() && context != null) {
                    String adImpressionId = c2734d8.getImpressionId();
                    Set set = c2734d8.f32743d;
                    AdConfig adConfig = c2734d8.f32758s;
                    long j10 = c2734d8.f32744e;
                    boolean z10 = c2734d8.f32745f;
                    String creativeId = c2734d8.getCreativeId();
                    Y6 y62 = c2734d8.f32748i;
                    F5 f53 = c2734d8.f32749j;
                    kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
                    kotlin.jvm.internal.e0.checkNotNullParameter(dataModel, "dataModel");
                    kotlin.jvm.internal.e0.checkNotNullParameter(adImpressionId, "adImpressionId");
                    kotlin.jvm.internal.e0.checkNotNullParameter(adConfig, "adConfig");
                    kotlin.jvm.internal.e0.checkNotNullParameter(creativeId, "creativeId");
                    C2734d8 c2853k9 = dataModel.c().contains("VIDEO") ? new C2853k9(context, (byte) 0, dataModel, adImpressionId, set, adConfig, j10, z10, creativeId, null, y62, f53) : new C2734d8(context, (byte) 0, dataModel, adImpressionId, set, adConfig, j10, z10, creativeId, null, y62, f53);
                    c2734d8.C = c2853k9;
                    c2853k9.f32761v = c2734d8;
                    R0 r02 = c2734d8.f32762w;
                    if (r02 != null) {
                        c2853k9.f32762w = r02;
                    }
                }
            }
        }
        C2734d8 container = this.f32444d.C;
        if (container != null) {
            SparseArray sparseArray = InMobiAdActivity.f31591k;
            kotlin.jvm.internal.e0.checkNotNullParameter(container, "container");
            int iHashCode = container.hashCode();
            InMobiAdActivity.f31591k.put(iHashCode, container);
            Intent intent = new Intent((Context) this.f32444d.f32763x.get(), (Class<?>) InMobiAdActivity.class);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX", iHashCode);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 102);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_IS_FULL_SCREEN", true);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_TYPE", 201);
            Context context2 = (Context) this.f32444d.f32763x.get();
            C2734d8 c2734d82 = this.f32444d;
            if (c2734d82.D) {
                c2734d82.G = intent;
            } else if (context2 != null) {
                C2925od.f33208a.a(context2, intent);
            }
        }
    }

    @Override // com.inmobi.media.I1
    public final void c() {
        super.c();
        R0 r02 = this.f32445e.f32762w;
        if (r02 != null) {
            r02.c();
        }
    }
}
