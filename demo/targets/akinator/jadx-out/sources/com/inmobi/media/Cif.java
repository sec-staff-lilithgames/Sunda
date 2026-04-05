package com.inmobi.media;

import android.graphics.Point;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.if, reason: invalid class name */
/* loaded from: classes7.dex */
public abstract class Cif {
    public static final C2859kf a(C2887m9 videoAsset, C2903n8 asset) {
        double d10;
        double d11;
        double d12;
        kotlin.jvm.internal.e0.checkNotNullParameter(videoAsset, "videoAsset");
        kotlin.jvm.internal.e0.checkNotNullParameter(asset, "asset");
        InterfaceC3028uf interfaceC3028ufD = videoAsset.d();
        Point point = asset.f33139d.f33181a;
        C2859kf c2859kf = null;
        ArrayList arrayList = interfaceC3028ufD != null ? ((C3011tf) interfaceC3028ufD).f33413i : null;
        float f10 = AbstractC2679a4.d().f32676c;
        double d13 = point.y / f10;
        double d14 = point.x / f10;
        double d15 = d14 / d13;
        double d16 = d14 * d13;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            double d17 = -1.0d;
            double d18 = 0.0d;
            while (it.hasNext()) {
                C2859kf c2859kf2 = (C2859kf) it.next();
                int i10 = c2859kf2.f33026b;
                Iterator it2 = it;
                double d19 = c2859kf2.f33025a;
                double d20 = i10;
                if (d15 > d19 / d20) {
                    d11 = (d13 / d20) * d19;
                    d10 = d13;
                } else {
                    d10 = (d14 / d19) * d20;
                    d11 = d14;
                }
                if (d20 >= d10 * 0.33d && d19 >= 0.33d * d11) {
                    double d21 = d11 * d10;
                    if (d21 > 0.5d * d16) {
                        if (d21 > d17) {
                            d18 = d20 / d10;
                            it = it2;
                            c2859kf = c2859kf2;
                            d17 = d21;
                        } else if (d21 == d17) {
                            float f11 = AbstractC2679a4.d().f32676c;
                            double d22 = d20 / d10;
                            if (d22 > d18) {
                                d12 = d22;
                                if (d18 >= f11) {
                                }
                                it = it2;
                                c2859kf = c2859kf2;
                                d18 = d12;
                            } else {
                                d12 = d22;
                            }
                            double d23 = f11;
                            if (d18 > d23 && d12 < d18 && d12 > d23) {
                                it = it2;
                                c2859kf = c2859kf2;
                                d18 = d12;
                            }
                        }
                    }
                }
                it = it2;
            }
        }
        return c2859kf;
    }
}
