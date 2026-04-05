package io.bidmachine;

import android.graphics.Point;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class y extends om.b {
    @Override // om.b, om.g
    public Point getSize(ContextProvider contextProvider, hr.g gVar) {
        mm.g bannerSize = ((mm.d) gVar).getAdRequestParameters().getBannerSize();
        return new Point(bannerSize.f74818b, bannerSize.f74819c);
    }
}
