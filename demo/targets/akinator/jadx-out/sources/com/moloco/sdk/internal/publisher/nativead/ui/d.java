package com.moloco.sdk.internal.publisher.nativead.ui;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.moloco.sdk.service_locator.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.p;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.jvm.internal.u;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class d extends RelativeLayout {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(u uVar) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public /* synthetic */ d(Context context, Uri uri, e0 e0Var, kv.a aVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e0 e0Var2, p pVar, int i10, u uVar) {
        this(context, uri, e0Var, aVar, (i10 & 16) != 0 ? a.h.f47463a.f() : e0Var2, (i10 & 32) != 0 ? r.a() : pVar);
    }

    public static final void a(kv.a aVar, View view) {
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public static final x0 a(p pVar, a.c button) {
        kotlin.jvm.internal.e0.checkNotNullParameter(button, "button");
        pVar.a(button);
        return x0.f87415a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, Uri imageUri, e0 watermark, kv.a aVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e0 externalLinkHandler, p buttonTracker) {
        super(context);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(imageUri, "imageUri");
        kotlin.jvm.internal.e0.checkNotNullParameter(watermark, "watermark");
        kotlin.jvm.internal.e0.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.e0.checkNotNullParameter(buttonTracker, "buttonTracker");
        ImageView imageView = new ImageView(context);
        imageView.setImageURI(imageUri);
        imageView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        imageView.setOnClickListener(new c(0, aVar));
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g gVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g(externalLinkHandler, context, null, 0, 12, null);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(12);
        layoutParams.addRule(20);
        gVar.setPadding(16, 0, 0, 16);
        gVar.setOnButtonRenderedListener(new aw.f(buttonTracker, 4));
        gVar.setLayoutParams(layoutParams);
        watermark.a(imageView);
        addView(imageView);
        addView(gVar);
    }
}
