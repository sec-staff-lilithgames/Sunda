package com.inmobi.media;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class D implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J f31720a;

    public D(J j10) {
        this.f31720a = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float fHeight;
        G4 g42;
        C cA = J.a(this.f31720a);
        J j10 = this.f31720a;
        j10.getClass();
        ArrayList arrayList = null;
        if (cA == null) {
            g42 = new G4(0.0f, null, null);
        } else {
            RectF rectF = cA.f31694a;
            if (rectF.isEmpty()) {
                g42 = new G4(0.0f, null, null);
            } else {
                float measuredHeight = j10.f31883a.getMeasuredHeight() * j10.f31883a.getMeasuredWidth();
                if (measuredHeight <= 0.0f) {
                    g42 = new G4(0.0f, null, null);
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    j10.f31883a.getLocationInWindow(new int[2]);
                    tu.v vVar = new tu.v(Float.valueOf(r7[0]), Float.valueOf(r7[1]));
                    float fFloatValue = ((Number) vVar.component1()).floatValue();
                    float fFloatValue2 = ((Number) vVar.component2()).floatValue();
                    Iterator it = cA.f31695b.iterator();
                    while (it.hasNext()) {
                        RectF rectF2 = (RectF) it.next();
                        arrayList2.add(new RectF(rectF2.left - fFloatValue, rectF2.top - fFloatValue2, rectF2.right - fFloatValue, rectF2.bottom - fFloatValue2));
                    }
                    ArrayList arrayList3 = cA.f31695b;
                    if (arrayList3.isEmpty()) {
                        fHeight = 0.0f;
                    } else {
                        Iterator it2 = arrayList3.iterator();
                        fHeight = 0.0f;
                        while (it2.hasNext()) {
                            RectF rectF3 = (RectF) it2.next();
                            fHeight += rectF3.height() * rectF3.width();
                        }
                    }
                    float fMin = Math.min(fHeight, measuredHeight);
                    RectF rectF4 = new RectF(rectF);
                    float fWidth = rectF4.width();
                    float fHeight2 = rectF4.height();
                    float fA = D2.a(Math.min((Math.max(0.0f, ((fWidth <= 0.0f || fHeight2 <= 0.0f) ? 0.0f : Math.max(0.0f, fWidth * fHeight2)) - fMin) / measuredHeight) * 100.0f, 100.0f));
                    H4 h42 = new H4(Math.max(0.0f, D2.a(rectF.left / AbstractC2679a4.b())), Math.max(0.0f, D2.a(rectF.top / AbstractC2679a4.b())), Math.max(0, D2.b(rectF.width() / AbstractC2679a4.b())), Math.max(0, D2.b(rectF.height() / AbstractC2679a4.b())));
                    if (!arrayList2.isEmpty()) {
                        ArrayList arrayList4 = new ArrayList(uu.q0.collectionSizeOrDefault(arrayList2, 10));
                        Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            RectF rectF5 = (RectF) it3.next();
                            arrayList4.add(new H4(Math.max(0.0f, D2.a(rectF5.left / AbstractC2679a4.b())), Math.max(0.0f, D2.a(rectF5.top / AbstractC2679a4.b())), Math.max(0, D2.b(rectF5.width() / AbstractC2679a4.b())), Math.max(0, D2.b(D2.b(rectF5.height()) / AbstractC2679a4.b()))));
                        }
                        arrayList = new ArrayList(uu.y0.sortedWith(arrayList4, new E()));
                    }
                    g42 = new G4(fA, h42, arrayList);
                }
            }
        }
        J.a(this.f31720a, g42);
    }
}
