package com.google.android.exoplayer2.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.google.android.material.carousel.CarouselLayoutManager;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class p implements View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28296b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28297c;

    public /* synthetic */ p(Object obj, int i10) {
        this.f28296b = i10;
        this.f28297c = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int height;
        int height2;
        int height3;
        int height4;
        switch (this.f28296b) {
            case 0:
                u uVar = (u) this.f28297c;
                int i18 = uVar.f28354n;
                PopupWindow popupWindow = uVar.f28352m;
                int i19 = i13 - i11;
                int i20 = i17 - i15;
                if ((i12 - i10 != i16 - i14 || i19 != i20) && popupWindow.isShowing()) {
                    uVar.k();
                    popupWindow.update(view, (uVar.getWidth() - popupWindow.getWidth()) - i18, (-popupWindow.getHeight()) - i18, -1, -1);
                    break;
                }
                break;
            case 1:
                l0 l0Var = (l0) this.f28297c;
                u uVar2 = l0Var.f28234a;
                int width = (uVar2.getWidth() - uVar2.getPaddingLeft()) - uVar2.getPaddingRight();
                int height5 = (uVar2.getHeight() - uVar2.getPaddingBottom()) - uVar2.getPaddingTop();
                ViewGroup viewGroup = l0Var.f28236c;
                int iB = l0.b(viewGroup) - (viewGroup != null ? viewGroup.getPaddingRight() + viewGroup.getPaddingLeft() : 0);
                if (viewGroup == null) {
                    height = 0;
                } else {
                    height = viewGroup.getHeight();
                    ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        height += marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                    }
                }
                int paddingBottom = height - (viewGroup != null ? viewGroup.getPaddingBottom() + viewGroup.getPaddingTop() : 0);
                int iMax = Math.max(iB, l0.b(l0Var.f28244k) + l0.b(l0Var.f28242i));
                ViewGroup viewGroup2 = l0Var.f28237d;
                if (viewGroup2 == null) {
                    height2 = 0;
                } else {
                    height2 = viewGroup2.getHeight();
                    ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        height2 += marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                    }
                }
                boolean z10 = width <= iMax || height5 <= (height2 * 2) + paddingBottom;
                if (l0Var.A != z10) {
                    l0Var.A = z10;
                    view.post(new a0(l0Var, 1));
                }
                boolean z11 = i12 - i10 != i16 - i14;
                if (!l0Var.A && z11) {
                    view.post(new a0(l0Var, 2));
                    break;
                }
                break;
            case 2:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.x.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.x) this.f28297c, view, i10, i11, i12, i13, i14, i15, i16, i17);
                break;
            case 3:
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) this.f28297c;
                if (i12 - i10 != i16 - i14 || i13 - i11 != i17 - i15) {
                    view.post(new com.unity3d.services.banners.view.a(carouselLayoutManager, 11));
                    break;
                }
                break;
            case 4:
                io.bidmachine.media3.ui.k kVar = (io.bidmachine.media3.ui.k) this.f28297c;
                int i21 = kVar.f61794n;
                PopupWindow popupWindow2 = kVar.f61792m;
                int i22 = i13 - i11;
                int i23 = i17 - i15;
                if ((i12 - i10 != i16 - i14 || i22 != i23) && popupWindow2.isShowing()) {
                    kVar.k();
                    popupWindow2.update(view, (kVar.getWidth() - popupWindow2.getWidth()) - i21, (-popupWindow2.getHeight()) - i21, -1, -1);
                    break;
                }
                break;
            default:
                io.bidmachine.media3.ui.a0 a0Var = (io.bidmachine.media3.ui.a0) this.f28297c;
                io.bidmachine.media3.ui.k kVar2 = a0Var.f61660a;
                int width2 = (kVar2.getWidth() - kVar2.getPaddingLeft()) - kVar2.getPaddingRight();
                int height6 = (kVar2.getHeight() - kVar2.getPaddingBottom()) - kVar2.getPaddingTop();
                ViewGroup viewGroup3 = a0Var.f61662c;
                int iB2 = io.bidmachine.media3.ui.a0.b(viewGroup3) - (viewGroup3 != null ? viewGroup3.getPaddingRight() + viewGroup3.getPaddingLeft() : 0);
                if (viewGroup3 == null) {
                    height3 = 0;
                } else {
                    height3 = viewGroup3.getHeight();
                    ViewGroup.LayoutParams layoutParams3 = viewGroup3.getLayoutParams();
                    if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                        height3 += marginLayoutParams3.topMargin + marginLayoutParams3.bottomMargin;
                    }
                }
                int paddingBottom2 = height3 - (viewGroup3 != null ? viewGroup3.getPaddingBottom() + viewGroup3.getPaddingTop() : 0);
                int iMax2 = Math.max(iB2, io.bidmachine.media3.ui.a0.b(a0Var.f61670k) + io.bidmachine.media3.ui.a0.b(a0Var.f61668i));
                ViewGroup viewGroup4 = a0Var.f61663d;
                if (viewGroup4 == null) {
                    height4 = 0;
                } else {
                    height4 = viewGroup4.getHeight();
                    ViewGroup.LayoutParams layoutParams4 = viewGroup4.getLayoutParams();
                    if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
                        height4 += marginLayoutParams4.topMargin + marginLayoutParams4.bottomMargin;
                    }
                }
                boolean z12 = width2 <= iMax2 || height6 <= (height4 * 2) + paddingBottom2;
                if (a0Var.A != z12) {
                    a0Var.A = z12;
                    view.post(new io.bidmachine.media3.ui.p(a0Var, 1));
                }
                boolean z13 = i12 - i10 != i16 - i14;
                if (!a0Var.A && z13) {
                    view.post(new io.bidmachine.media3.ui.p(a0Var, 2));
                    break;
                }
                break;
        }
    }
}
