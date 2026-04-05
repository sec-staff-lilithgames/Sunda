package com.inmobi.media;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class D9 extends B9 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ N9 f31736e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D9(N9 n9) {
        super(n9);
        this.f31736e = n9;
    }

    @Override // com.inmobi.media.B9
    public final View a(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        return new Button(context.getApplicationContext());
    }

    @Override // com.inmobi.media.B9
    public final void a(View view, C2903n8 asset, AdConfig adConfig) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.e0.checkNotNullParameter(asset, "asset");
        kotlin.jvm.internal.e0.checkNotNullParameter(adConfig, "adConfig");
        super.a(view, asset, adConfig);
        if (view instanceof Button) {
            N9.a(this.f31736e, (Button) view, asset);
        }
    }

    @Override // com.inmobi.media.B9
    public final void a(View view) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        if (view instanceof Button) {
            HashMap map = N9.f32067c;
            TextView textView = (TextView) view;
            textView.setTypeface(Typeface.DEFAULT, 0);
            textView.setPaintFlags(textView.getPaintFlags() & (-17));
            textView.setPaintFlags(textView.getPaintFlags() & (-9));
            super.a(view);
        }
    }
}
