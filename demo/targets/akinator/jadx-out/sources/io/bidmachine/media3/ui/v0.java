package io.bidmachine.media3.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import io.bidmachine.media3.common.util.a1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class v0 extends FrameLayout implements m0 {

    /* renamed from: b, reason: collision with root package name */
    public final c f61881b;

    /* renamed from: c, reason: collision with root package name */
    public final t0 f61882c;

    /* renamed from: e, reason: collision with root package name */
    public List f61883e;

    /* renamed from: f, reason: collision with root package name */
    public d f61884f;

    /* renamed from: g, reason: collision with root package name */
    public float f61885g;

    /* renamed from: h, reason: collision with root package name */
    public int f61886h;

    /* renamed from: i, reason: collision with root package name */
    public float f61887i;

    public v0(Context context) {
        this(context, null);
    }

    public final String a(float f10, int i10) {
        float fResolveTextSize = n0.resolveTextSize(i10, f10, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        return fResolveTextSize == -3.4028235E38f ? "unset" : a1.formatInvariant("%.2fpx", Float.valueOf(fResolveTextSize / getContext().getResources().getDisplayMetrics().density));
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0210  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 803
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.ui.v0.b():void");
    }

    public void destroy() {
        this.f61882c.destroy();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!z10 || this.f61883e.isEmpty()) {
            return;
        }
        b();
    }

    @Override // io.bidmachine.media3.ui.m0
    public void update(List<in.b> list, d dVar, float f10, int i10, float f11) {
        this.f61884f = dVar;
        this.f61885g = f10;
        this.f61886h = i10;
        this.f61887i = f11;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            in.b bVar = list.get(i11);
            if (bVar.f59781d != null) {
                arrayList.add(bVar);
            } else {
                arrayList2.add(bVar);
            }
        }
        if (!this.f61883e.isEmpty() || !arrayList2.isEmpty()) {
            this.f61883e = arrayList2;
            b();
        }
        this.f61881b.update(arrayList, dVar, f10, i10, f11);
        invalidate();
    }

    public v0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f61883e = Collections.EMPTY_LIST;
        this.f61884f = d.f61721g;
        this.f61885g = 0.0533f;
        this.f61886h = 0;
        this.f61887i = 0.08f;
        c cVar = new c(context, attributeSet);
        this.f61881b = cVar;
        t0 t0Var = new t0(context, attributeSet);
        this.f61882c = t0Var;
        t0Var.setBackgroundColor(0);
        addView(cVar);
        addView(t0Var);
    }
}
