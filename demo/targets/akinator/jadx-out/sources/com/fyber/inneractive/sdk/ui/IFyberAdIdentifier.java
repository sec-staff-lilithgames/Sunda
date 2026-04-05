package com.fyber.inneractive.sdk.ui;

import android.view.ViewGroup;
import com.fyber.inneractive.sdk.config.global.r;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class IFyberAdIdentifier {

    /* renamed from: a, reason: collision with root package name */
    public ClickListener f26723a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26724b;

    /* renamed from: c, reason: collision with root package name */
    public final int f26725c;

    /* renamed from: d, reason: collision with root package name */
    public final int f26726d;

    /* renamed from: e, reason: collision with root package name */
    public final int f26727e;

    /* renamed from: f, reason: collision with root package name */
    public final int f26728f;

    /* renamed from: g, reason: collision with root package name */
    public final String f26729g;

    /* renamed from: h, reason: collision with root package name */
    public final String f26730h;

    /* renamed from: i, reason: collision with root package name */
    public final String f26731i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f26732j;

    /* renamed from: k, reason: collision with root package name */
    public Corner f26733k = Corner.BOTTOM_LEFT;

    /* renamed from: l, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.global.features.a f26734l;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface ClickListener {
        void a();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum Corner {
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT
    }

    public IFyberAdIdentifier(r rVar) {
        this.f26724b = 0;
        this.f26725c = 0;
        this.f26726d = 0;
        this.f26727e = 0;
        this.f26728f = 0;
        this.f26729g = null;
        this.f26730h = "";
        this.f26731i = "";
        this.f26732j = false;
        this.f26734l = com.fyber.inneractive.sdk.config.global.features.b.f23288e;
        if (rVar != null) {
            com.fyber.inneractive.sdk.config.global.features.b bVar = (com.fyber.inneractive.sdk.config.global.features.b) rVar.a(com.fyber.inneractive.sdk.config.global.features.b.class);
            Integer numA = bVar.a("ad_identifier_text_size_w");
            this.f26724b = numA != null ? numA.intValue() : 110;
            Integer numA2 = bVar.a("ad_identifier_text_size_h");
            this.f26725c = numA2 != null ? numA2.intValue() : 18;
            Integer numA3 = bVar.a("ad_identifier_image_size_w");
            this.f26726d = numA3 != null ? numA3.intValue() : 18;
            Integer numA4 = bVar.a("ad_identifier_image_size_h");
            this.f26727e = numA4 != null ? numA4.intValue() : 18;
            Integer numA5 = bVar.a("ad_identifier_text_size");
            this.f26728f = numA5 != null ? numA5.intValue() : 8;
            this.f26729g = bVar.a("ad_identifier_tint_color", "#75DCDCDC");
            this.f26734l = bVar.c();
            this.f26730h = bVar.a("ad_identifier_text", "Tap for more information");
            this.f26731i = bVar.a("ad_identifier_icon_url", null);
            this.f26732j = true;
        }
    }

    public abstract void a(ViewGroup viewGroup);
}
