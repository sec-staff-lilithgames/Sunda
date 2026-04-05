package com.applovin.impl;

import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class b2 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f13586a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f13587b;

    public b2(Map map, com.applovin.impl.sdk.k kVar) {
        this.f13586a = map == null ? Collections.EMPTY_MAP : map;
        this.f13587b = kVar;
    }

    public Drawable a() {
        Object obj = this.f13586a.get("google_watermark");
        if (!a(obj)) {
            this.f13587b.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f13587b.O().b("GoogleWatermarkGenerator", "Unable to render invalid watermark: " + obj);
            }
            return null;
        }
        try {
            byte[] bArrDecode = Base64.decode((String) obj, 0);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(com.applovin.impl.sdk.k.o().getResources(), BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            bitmapDrawable.setTileModeXY(tileMode, tileMode);
            return bitmapDrawable;
        } catch (Throwable th2) {
            this.f13587b.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f13587b.O().a("GoogleWatermarkGenerator", "Failed to render watermark", th2);
            }
            return null;
        }
    }

    public String b() {
        return "google watermark";
    }

    public boolean c() {
        return a(this.f13586a.get("google_watermark"));
    }

    private boolean a(Object obj) {
        return (obj instanceof String) && StringUtils.isValidString((String) obj);
    }
}
