package com.inmobi.media;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewpager.widget.ViewPager;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.md, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2891md extends U8 implements androidx.viewpager.widget.i {

    /* renamed from: b, reason: collision with root package name */
    public final String f33097b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewPager f33098c;

    /* renamed from: d, reason: collision with root package name */
    public final Point f33099d;

    /* renamed from: e, reason: collision with root package name */
    public final Point f33100e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f33101f;

    /* renamed from: g, reason: collision with root package name */
    public N8 f33102g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2891md(Context context) {
        super(context, (byte) 0);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        this.f33097b = "md";
        this.f33099d = new Point();
        this.f33100e = new Point();
        setClipChildren(false);
        setLayerType(1, null);
        ViewPager viewPager = new ViewPager(getContext());
        this.f33098c = viewPager;
        viewPager.addOnPageChangeListener(this);
        addView(viewPager);
    }

    @Override // com.inmobi.media.U8
    public final void a(C2970r8 scrollableContainerAsset, V8 dataSource, int i10, int i11, N8 n82) throws Resources.NotFoundException {
        FrameLayout.LayoutParams layoutParams;
        kotlin.jvm.internal.e0.checkNotNullParameter(scrollableContainerAsset, "scrollableContainerAsset");
        kotlin.jvm.internal.e0.checkNotNullParameter(dataSource, "dataSource");
        C2903n8 c2903n8 = scrollableContainerAsset.B > 0 ? (C2903n8) scrollableContainerAsset.A.get(0) : null;
        if (c2903n8 != null) {
            HashMap map = N9.f32067c;
            ViewGroup.LayoutParams layoutParamsA = C3073x9.a(c2903n8, this);
            kotlin.jvm.internal.e0.checkNotNull(layoutParamsA, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            layoutParams = (FrameLayout.LayoutParams) layoutParamsA;
            layoutParams.setMarginStart(20);
            layoutParams.setMarginEnd(20);
            layoutParams.gravity = i11;
        } else {
            layoutParams = null;
        }
        ViewPager viewPager = this.f33098c;
        if (viewPager != null) {
            viewPager.setLayoutParams(layoutParams);
            viewPager.setAdapter(dataSource instanceof A8 ? (A8) dataSource : null);
            viewPager.setOffscreenPageLimit(2);
            viewPager.setPageMargin(16);
            viewPager.setCurrentItem(i10);
        }
        this.f33102g = n82;
    }

    @Override // androidx.viewpager.widget.i
    public final void onPageScrollStateChanged(int i10) {
        this.f33101f = i10 != 0;
    }

    @Override // androidx.viewpager.widget.i
    public final void onPageScrolled(int i10, float f10, int i11) {
        if (this.f33101f) {
            invalidate();
        }
    }

    @Override // androidx.viewpager.widget.i
    public final void onPageSelected(int i10) {
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(this.f33097b, "TAG");
        ViewPager viewPager = this.f33098c;
        ViewGroup.LayoutParams layoutParams = viewPager != null ? viewPager.getLayoutParams() : null;
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        N8 n82 = this.f33102g;
        if (n82 != null) {
            if (layoutParams2 != null) {
                n82.f32061k = i10;
                C2970r8 asset = n82.f32053c.b(i10);
                if (asset != null) {
                    G8 g8 = n82.f32054d;
                    kotlin.jvm.internal.e0.checkNotNullParameter(asset, "asset");
                    H8 h82 = g8.f31825a;
                    if (!h82.f31842a) {
                        C2734d8 c2734d8 = h82.f31843b;
                        c2734d8.getClass();
                        kotlin.jvm.internal.e0.checkNotNullParameter(asset, "asset");
                        if (!c2734d8.f32753n.contains(Integer.valueOf(i10)) && !c2734d8.f32759t) {
                            c2734d8.m();
                            if (!c2734d8.f32759t) {
                                c2734d8.f32753n.add(Integer.valueOf(i10));
                                asset.f33312y = System.currentTimeMillis();
                                if (c2734d8.f32757r) {
                                    HashMap mapA = c2734d8.a(asset);
                                    F5 f52 = c2734d8.f32749j;
                                    if (f52 != null) {
                                        String TAG = c2734d8.f32752m;
                                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                                        ((G5) f52).a(TAG, "Page-view impression record request");
                                    }
                                    asset.a("page_view", mapA, (V7) null, c2734d8.f32749j);
                                } else {
                                    c2734d8.f32754o.add(asset);
                                }
                            }
                        }
                    }
                }
                int i11 = n82.f32061k;
                layoutParams2.gravity = i11 == 0 ? 8388611 : i11 == n82.f32053c.d() - 1 ? 8388613 : 1;
            }
            ViewPager viewPager2 = this.f33098c;
            if (viewPager2 != null) {
                viewPager2.requestLayout();
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        Point point = this.f33099d;
        point.x = i10 / 2;
        point.y = i11 / 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C2891md.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
