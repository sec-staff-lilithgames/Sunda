package com.google.android.exoplayer2.ui;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;
import com.google.android.exoplayer2.util.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f {

    /* renamed from: g, reason: collision with root package name */
    public static final f f28186g = new f(-1, -16777216, 0, 0, -1, null);

    /* renamed from: a, reason: collision with root package name */
    public final int f28187a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28188b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28189c;

    /* renamed from: d, reason: collision with root package name */
    public final int f28190d;

    /* renamed from: e, reason: collision with root package name */
    public final int f28191e;

    /* renamed from: f, reason: collision with root package name */
    public final Typeface f28192f;

    public f(int i10, int i11, int i12, int i13, int i14, Typeface typeface) {
        this.f28187a = i10;
        this.f28188b = i11;
        this.f28189c = i12;
        this.f28190d = i13;
        this.f28191e = i14;
        this.f28192f = typeface;
    }

    public static f createFromCaptionStyle(CaptioningManager.CaptionStyle captionStyle) {
        if (n1.f28506a < 21) {
            return new f(captionStyle.foregroundColor, captionStyle.backgroundColor, 0, captionStyle.edgeType, captionStyle.edgeColor, captionStyle.getTypeface());
        }
        boolean zHasForegroundColor = captionStyle.hasForegroundColor();
        f fVar = f28186g;
        return new f(zHasForegroundColor ? captionStyle.foregroundColor : fVar.f28187a, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : fVar.f28188b, captionStyle.hasWindowColor() ? captionStyle.windowColor : fVar.f28189c, captionStyle.hasEdgeType() ? captionStyle.edgeType : fVar.f28190d, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : fVar.f28191e, captionStyle.getTypeface());
    }
}
