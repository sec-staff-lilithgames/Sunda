package com.inmobi.media;

import android.graphics.Point;
import be.nVUQ.UupKET;
import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.o8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C2920o8 {

    /* renamed from: a, reason: collision with root package name */
    public final Point f33181a;

    /* renamed from: b, reason: collision with root package name */
    public final Point f33182b;

    /* renamed from: c, reason: collision with root package name */
    public final Point f33183c;

    /* renamed from: d, reason: collision with root package name */
    public final Point f33184d;

    /* renamed from: e, reason: collision with root package name */
    public final String f33185e;

    /* renamed from: f, reason: collision with root package name */
    public final String f33186f;

    /* renamed from: g, reason: collision with root package name */
    public final String f33187g;

    /* renamed from: h, reason: collision with root package name */
    public final float f33188h;

    /* renamed from: i, reason: collision with root package name */
    public final String f33189i;

    /* renamed from: j, reason: collision with root package name */
    public final String f33190j;

    /* renamed from: k, reason: collision with root package name */
    public final Z8 f33191k;

    public C2920o8() {
        this.f33181a = new Point(0, 0);
        this.f33183c = new Point(0, 0);
        this.f33182b = new Point(0, 0);
        this.f33184d = new Point(0, 0);
        this.f33185e = "none";
        this.f33186f = "straight";
        this.f33188h = 10.0f;
        this.f33189i = "#ff000000";
        this.f33190j = "#00000000";
        this.f33187g = UupKET.OJR;
        this.f33191k = null;
    }

    public String a() {
        String str = this.f33190j;
        Locale locale = Locale.US;
        return b0.e2.p(locale, "US", str, locale, "this as java.lang.String).toLowerCase(locale)");
    }

    public C2920o8(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, String contentMode, String borderStrokeStyle, String borderCornerStyle, String borderColor, String backgroundColor, Z8 z82) {
        kotlin.jvm.internal.e0.checkNotNullParameter(contentMode, "contentMode");
        kotlin.jvm.internal.e0.checkNotNullParameter(borderStrokeStyle, "borderStrokeStyle");
        kotlin.jvm.internal.e0.checkNotNullParameter(borderCornerStyle, "borderCornerStyle");
        kotlin.jvm.internal.e0.checkNotNullParameter(borderColor, "borderColor");
        kotlin.jvm.internal.e0.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.f33181a = new Point(i12, i13);
        this.f33182b = new Point(i16, i17);
        this.f33183c = new Point(i10, i11);
        this.f33184d = new Point(i14, i15);
        this.f33185e = borderStrokeStyle;
        this.f33186f = borderCornerStyle;
        this.f33188h = 10.0f;
        this.f33187g = contentMode;
        this.f33189i = borderColor.length() == 0 ? "#ff000000" : borderColor;
        this.f33190j = backgroundColor.length() == 0 ? "#00000000" : backgroundColor;
        this.f33191k = z82;
    }
}
