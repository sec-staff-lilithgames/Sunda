package io.bidmachine.media3.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c extends View implements m0 {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f61688b;

    /* renamed from: c, reason: collision with root package name */
    public List f61689c;

    /* renamed from: e, reason: collision with root package name */
    public int f61690e;

    /* renamed from: f, reason: collision with root package name */
    public float f61691f;

    /* renamed from: g, reason: collision with root package name */
    public d f61692g;

    /* renamed from: h, reason: collision with root package name */
    public float f61693h;

    public c(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        boolean z10;
        List list = this.f61689c;
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
        float fResolveTextSize = n0.resolveTextSize(this.f61690e, this.f61691f, height, i10);
        if (fResolveTextSize <= 0.0f) {
            return;
        }
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            in.b bVarBuild = (in.b) list.get(i11);
            if (bVarBuild.f59793p != Integer.MIN_VALUE) {
                in.a aVarBuildUpon = bVarBuild.buildUpon();
                float f10 = bVarBuild.f59782e;
                in.a textAlignment = aVarBuildUpon.setPosition(-3.4028235E38f).setPositionAnchor(Integer.MIN_VALUE).setTextAlignment(null);
                if (bVarBuild.f59783f == 0) {
                    textAlignment.setLine(1.0f - f10, 0);
                } else {
                    textAlignment.setLine((-f10) - 1.0f, 1);
                }
                int i12 = bVarBuild.f59784g;
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
            ((l0) this.f61688b.get(i11)).draw(bVarBuild, this.f61692g, fResolveTextSize, n0.resolveTextSize(bVarBuild.f59791n, bVarBuild.f59792o, height, i10), this.f61693h, canvas, paddingLeft, paddingTop, width, paddingBottom);
        }
    }

    @Override // io.bidmachine.media3.ui.m0
    public void update(List<in.b> list, d dVar, float f10, int i10, float f11) {
        this.f61689c = list;
        this.f61692g = dVar;
        this.f61691f = f10;
        this.f61690e = i10;
        this.f61693h = f11;
        while (true) {
            ArrayList arrayList = this.f61688b;
            if (arrayList.size() >= list.size()) {
                invalidate();
                return;
            }
            arrayList.add(new l0(getContext()));
        }
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f61688b = new ArrayList();
        this.f61689c = Collections.EMPTY_LIST;
        this.f61690e = 0;
        this.f61691f = 0.0533f;
        this.f61692g = d.f61721g;
        this.f61693h = 0.08f;
    }
}
