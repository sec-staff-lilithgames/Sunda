package mj;

import android.view.View;
import hj.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f74738a;

    /* renamed from: b, reason: collision with root package name */
    public int f74739b;

    /* renamed from: c, reason: collision with root package name */
    public int f74740c;

    public d(int i10, int i11) {
        this.f74738a = new ArrayList();
        this.f74739b = i10;
        this.f74740c = i11;
    }

    public void add(View view, boolean z10) {
        e eVar = new e(view, z10);
        eVar.setMaxDimens(this.f74739b, this.f74740c);
        this.f74738a.add(eVar);
    }

    public void allocateSpace(int i10) {
        float f10;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f74738a.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (eVar.isFlex()) {
                arrayList.add(eVar);
            }
        }
        Collections.sort(arrayList, new c());
        Iterator it2 = arrayList.iterator();
        int desiredHeight = 0;
        while (it2.hasNext()) {
            desiredHeight += ((e) it2.next()).getDesiredHeight();
        }
        if (arrayList.size() >= 6) {
            throw new IllegalStateException("VerticalViewGroupMeasure only supports up to 5 children");
        }
        float f11 = 1.0f - ((r1 - 1) * 0.2f);
        t.logdPair("VVGM (minFrac, maxFrac)", 0.2f, f11);
        Iterator it3 = arrayList.iterator();
        float f12 = 0.0f;
        while (it3.hasNext()) {
            e eVar2 = (e) it3.next();
            float desiredHeight2 = eVar2.getDesiredHeight() / desiredHeight;
            if (desiredHeight2 > f11) {
                f12 += desiredHeight2 - f11;
                f10 = f11;
            } else {
                f10 = desiredHeight2;
            }
            if (desiredHeight2 < 0.2f) {
                float fMin = Math.min(0.2f - desiredHeight2, f12);
                f12 -= fMin;
                f10 = desiredHeight2 + fMin;
            }
            t.logdPair("\t(desired, granted)", desiredHeight2, f10);
            eVar2.setMaxDimens(this.f74739b, (int) (f10 * i10));
        }
    }

    public int getTotalFixedHeight() {
        Iterator it = this.f74738a.iterator();
        int desiredHeight = 0;
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (!eVar.isFlex()) {
                desiredHeight = eVar.getDesiredHeight() + desiredHeight;
            }
        }
        return desiredHeight;
    }

    public int getTotalHeight() {
        Iterator it = this.f74738a.iterator();
        int desiredHeight = 0;
        while (it.hasNext()) {
            desiredHeight += ((e) it.next()).getDesiredHeight();
        }
        return desiredHeight;
    }

    public List<e> getViews() {
        return this.f74738a;
    }

    public void reset(int i10, int i11) {
        this.f74739b = i10;
        this.f74740c = i11;
        this.f74738a = new ArrayList();
    }

    public d() {
        this.f74738a = new ArrayList();
        this.f74739b = 0;
        this.f74740c = 0;
    }
}
