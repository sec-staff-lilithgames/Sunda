package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e extends View implements q0 {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f28178b;

    /* renamed from: c, reason: collision with root package name */
    public List f28179c;

    /* renamed from: e, reason: collision with root package name */
    public int f28180e;

    /* renamed from: f, reason: collision with root package name */
    public float f28181f;

    /* renamed from: g, reason: collision with root package name */
    public f f28182g;

    /* renamed from: h, reason: collision with root package name */
    public float f28183h;

    public e(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        boolean z10;
        List list = this.f28179c;
        if (list.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i10 = paddingBottom - paddingTop;
        float fResolveTextSize = r0.resolveTextSize(this.f28180e, this.f28181f, height, i10);
        if (fResolveTextSize <= 0.0f) {
            return;
        }
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            ef.b bVarBuild = (ef.b) list.get(i11);
            if (bVarBuild.f54306r != Integer.MIN_VALUE) {
                ef.a aVarBuildUpon = bVarBuild.buildUpon();
                float f10 = bVarBuild.f54295g;
                ef.a textAlignment = aVarBuildUpon.setPosition(-3.4028235E38f).setPositionAnchor(Integer.MIN_VALUE).setTextAlignment(null);
                if (bVarBuild.f54296h == 0) {
                    textAlignment.setLine(1.0f - f10, 0);
                } else {
                    textAlignment.setLine((-f10) - 1.0f, 1);
                }
                int i12 = bVarBuild.f54297i;
                if (i12 == 0) {
                    z10 = false;
                    textAlignment.setLineAnchor(2);
                } else if (i12 != 2) {
                    z10 = false;
                } else {
                    z10 = false;
                    textAlignment.setLineAnchor(0);
                }
                bVarBuild = textAlignment.build();
            } else {
                z10 = false;
            }
            ((p0) this.f28178b.get(i11)).draw(bVarBuild, this.f28182g, fResolveTextSize, r0.resolveTextSize(bVarBuild.f54304p, bVarBuild.f54305q, height, i10), this.f28183h, canvas, paddingLeft, paddingTop, width, paddingBottom);
        }
    }

    @Override // com.google.android.exoplayer2.ui.q0
    public void update(List<ef.b> list, f fVar, float f10, int i10, float f11) {
        this.f28179c = list;
        this.f28182g = fVar;
        this.f28181f = f10;
        this.f28180e = i10;
        this.f28183h = f11;
        while (true) {
            ArrayList arrayList = this.f28178b;
            if (arrayList.size() >= list.size()) {
                invalidate();
                return;
            }
            arrayList.add(new p0(getContext()));
        }
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28178b = new ArrayList();
        this.f28179c = Collections.EMPTY_LIST;
        this.f28180e = 0;
        this.f28181f = 0.0533f;
        this.f28182g = f.f28186g;
        this.f28183h = 0.08f;
    }
}
