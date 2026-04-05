package io.bidmachine.media3.ui;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d {

    /* renamed from: g, reason: collision with root package name */
    public static final d f61721g = new d(-1, -16777216, 0, 0, -1, null);

    /* renamed from: a, reason: collision with root package name */
    public final int f61722a;

    /* renamed from: b, reason: collision with root package name */
    public final int f61723b;

    /* renamed from: c, reason: collision with root package name */
    public final int f61724c;

    /* renamed from: d, reason: collision with root package name */
    public final int f61725d;

    /* renamed from: e, reason: collision with root package name */
    public final int f61726e;

    /* renamed from: f, reason: collision with root package name */
    public final Typeface f61727f;

    public d(int i10, int i11, int i12, int i13, int i14, Typeface typeface) {
        this.f61722a = i10;
        this.f61723b = i11;
        this.f61724c = i12;
        this.f61725d = i13;
        this.f61726e = i14;
        this.f61727f = typeface;
    }

    public static d createFromCaptionStyle(CaptioningManager.CaptionStyle captionStyle) {
        boolean zHasForegroundColor = captionStyle.hasForegroundColor();
        d dVar = f61721g;
        return new d(zHasForegroundColor ? captionStyle.foregroundColor : dVar.f61722a, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : dVar.f61723b, captionStyle.hasWindowColor() ? captionStyle.windowColor : dVar.f61724c, captionStyle.hasEdgeType() ? captionStyle.edgeType : dVar.f61725d, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : dVar.f61726e, captionStyle.getTypeface());
    }
}
