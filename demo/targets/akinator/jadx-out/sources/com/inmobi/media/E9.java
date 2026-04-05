package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class E9 extends B9 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ N9 f31750e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E9(N9 n9) {
        super(n9);
        this.f31750e = n9;
    }

    @Override // com.inmobi.media.B9
    public final View a(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        return new Q4(context.getApplicationContext());
    }

    @Override // com.inmobi.media.B9
    public final void a(View view, C2903n8 asset, AdConfig adConfig) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.e0.checkNotNullParameter(asset, "asset");
        kotlin.jvm.internal.e0.checkNotNullParameter(adConfig, "adConfig");
        super.a(view, asset, adConfig);
        if (view instanceof Q4) {
            Q4 q42 = (Q4) view;
            this.f31750e.getClass();
            HashMap map = N9.f32067c;
            q42.setLayoutParams(new ViewGroup.LayoutParams(C3073x9.a(asset.f33139d.f33181a.x), C3073x9.a(asset.f33139d.f33181a.y)));
            q42.setContentMode(asset.f33139d.f33187g);
            kotlin.jvm.internal.e0.checkNotNull(asset, "null cannot be cast to non-null type com.inmobi.ads.modelsv2.NativeGifAsset");
            q42.setGifImpl((O4) ((C8) asset).f31710y.getValue());
            C3073x9.a(q42, asset.f33139d);
        }
    }

    @Override // com.inmobi.media.B9
    public final void a(View view) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        if (view instanceof Q4) {
            ((Q4) view).setGifImpl(null);
            super.a(view);
        }
    }
}
