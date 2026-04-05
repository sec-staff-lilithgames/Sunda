package com.inmobi.media;

import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.u8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3021u8 extends W8 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3021u8(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, String borderStrokeStyle, String borderCornerStyle, String borderColor, String backgroundColor, int i18, String textColor, ArrayList textStyles, Z8 nativeAnimationTimer) {
        super(i10, i11, i12, i13, i14, i15, i16, i17, borderStrokeStyle, borderCornerStyle, borderColor, backgroundColor, 12, (byte) 0, "#ff000000", uu.p0.mutableListOf("none"), nativeAnimationTimer);
        kotlin.jvm.internal.e0.checkNotNullParameter(borderStrokeStyle, "borderStrokeStyle");
        kotlin.jvm.internal.e0.checkNotNullParameter(borderCornerStyle, "borderCornerStyle");
        kotlin.jvm.internal.e0.checkNotNullParameter(borderColor, "borderColor");
        kotlin.jvm.internal.e0.checkNotNullParameter(backgroundColor, "backgroundColor");
        kotlin.jvm.internal.e0.checkNotNullParameter(textColor, "textColor");
        kotlin.jvm.internal.e0.checkNotNullParameter(textStyles, "textStyles");
        kotlin.jvm.internal.e0.checkNotNullParameter(nativeAnimationTimer, "nativeAnimationTimer");
        this.f32446l = i18;
        String str = textColor.length() == 0 ? "#ff000000" : textColor;
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<set-?>");
        this.f32448n = str;
        int iMin = Math.min(textStyles.size(), 1);
        ArrayList arrayList = new ArrayList();
        kotlin.jvm.internal.e0.checkNotNullParameter(arrayList, "<set-?>");
        this.f32449o = arrayList;
        if (iMin < 0) {
            return;
        }
        int i19 = 0;
        while (true) {
            this.f32449o.add(textStyles.get(i19));
            if (i19 == iMin) {
                return;
            } else {
                i19++;
            }
        }
    }
}
