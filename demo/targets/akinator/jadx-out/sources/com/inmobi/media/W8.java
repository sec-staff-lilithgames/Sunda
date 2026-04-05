package com.inmobi.media;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class W8 extends C2920o8 {

    /* renamed from: l, reason: collision with root package name */
    public int f32446l;

    /* renamed from: m, reason: collision with root package name */
    public final byte f32447m;

    /* renamed from: n, reason: collision with root package name */
    public String f32448n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f32449o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W8(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, String borderStrokeStyle, String borderCornerStyle, String borderColor, String backgroundColor, int i18, byte b10, String textColor, List textStyles, Z8 z82) {
        super(i10, i11, i12, i13, i14, i15, i16, i17, "fill", borderStrokeStyle, borderCornerStyle, borderColor, backgroundColor, z82);
        kotlin.jvm.internal.e0.checkNotNullParameter(borderStrokeStyle, "borderStrokeStyle");
        kotlin.jvm.internal.e0.checkNotNullParameter(borderCornerStyle, "borderCornerStyle");
        kotlin.jvm.internal.e0.checkNotNullParameter(borderColor, "borderColor");
        kotlin.jvm.internal.e0.checkNotNullParameter(backgroundColor, "backgroundColor");
        kotlin.jvm.internal.e0.checkNotNullParameter(textColor, "textColor");
        kotlin.jvm.internal.e0.checkNotNullParameter(textStyles, "textStyles");
        this.f32446l = i18;
        this.f32447m = b10;
        this.f32448n = textColor.length() == 0 ? "#ff000000" : textColor;
        int iMin = Math.min(textStyles.size(), 4);
        this.f32449o = new ArrayList();
        for (int i19 = 0; i19 < iMin; i19++) {
            this.f32449o.add(textStyles.get(i19));
        }
    }

    @Override // com.inmobi.media.C2920o8
    public final String a() {
        String str = this.f33190j;
        Locale locale = Locale.US;
        return b0.e2.p(locale, "US", str, locale, "this as java.lang.String).toLowerCase(locale)");
    }
}
