package com.inmobi.media;

import android.graphics.RectF;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public final RectF f31694a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f31695b;

    /* renamed from: c, reason: collision with root package name */
    public final int f31696c;

    /* renamed from: d, reason: collision with root package name */
    public final int f31697d;

    public C(RectF visibleRect, ArrayList obstructions, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(visibleRect, "visibleRect");
        kotlin.jvm.internal.e0.checkNotNullParameter(obstructions, "obstructions");
        this.f31694a = visibleRect;
        this.f31695b = obstructions;
        this.f31696c = i10;
        this.f31697d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f31694a, c10.f31694a) && kotlin.jvm.internal.e0.areEqual(this.f31695b, c10.f31695b) && this.f31696c == c10.f31696c && this.f31697d == c10.f31697d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f31697d) + e3.g.d(this.f31696c, (this.f31695b.hashCode() + (this.f31694a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExposureInputData(visibleRect=");
        sb2.append(this.f31694a);
        sb2.append(", obstructions=");
        sb2.append(this.f31695b);
        sb2.append(", screenWidth=");
        sb2.append(this.f31696c);
        sb2.append(", screenHeight=");
        return e3.g.m(sb2, this.f31697d, ')');
    }
}
