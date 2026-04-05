package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.util.n1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a1 extends FrameLayout implements q0 {

    /* renamed from: b, reason: collision with root package name */
    public final e f28165b;

    /* renamed from: c, reason: collision with root package name */
    public final y0 f28166c;

    /* renamed from: e, reason: collision with root package name */
    public List f28167e;

    /* renamed from: f, reason: collision with root package name */
    public f f28168f;

    /* renamed from: g, reason: collision with root package name */
    public float f28169g;

    /* renamed from: h, reason: collision with root package name */
    public int f28170h;

    /* renamed from: i, reason: collision with root package name */
    public float f28171i;

    public a1(Context context) {
        this(context, null);
    }

    public final String a(float f10, int i10) {
        float fResolveTextSize = r0.resolveTextSize(i10, f10, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        return fResolveTextSize == -3.4028235E38f ? "unset" : n1.formatInvariant("%.2fpx", Float.valueOf(fResolveTextSize / getContext().getResources().getDisplayMetrics().density));
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.a1.b():void");
    }

    public void destroy() {
        this.f28166c.destroy();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!z10 || this.f28167e.isEmpty()) {
            return;
        }
        b();
    }

    @Override // com.google.android.exoplayer2.ui.q0
    public void update(List<ef.b> list, f fVar, float f10, int i10, float f11) {
        this.f28168f = fVar;
        this.f28169g = f10;
        this.f28170h = i10;
        this.f28171i = f11;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            ef.b bVar = list.get(i11);
            if (bVar.f54294f != null) {
                arrayList.add(bVar);
            } else {
                arrayList2.add(bVar);
            }
        }
        if (!this.f28167e.isEmpty() || !arrayList2.isEmpty()) {
            this.f28167e = arrayList2;
            b();
        }
        this.f28165b.update(arrayList, fVar, f10, i10, f11);
        invalidate();
    }

    public a1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28167e = Collections.EMPTY_LIST;
        this.f28168f = f.f28186g;
        this.f28169g = 0.0533f;
        this.f28170h = 0;
        this.f28171i = 0.08f;
        e eVar = new e(context, attributeSet);
        this.f28165b = eVar;
        y0 y0Var = new y0(context, attributeSet);
        this.f28166c = y0Var;
        y0Var.setBackgroundColor(0);
        addView(eVar);
        addView(y0Var);
    }
}
