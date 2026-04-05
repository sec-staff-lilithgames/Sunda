package eg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.digidust.elokence.akinator.freemium.R;
import kotlin.jvm.internal.d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class m extends h {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f54394d = {1};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f54395e = {1, 0};

    /* renamed from: c, reason: collision with root package name */
    public int f54396c = 0;

    @Override // eg.h
    public k onFirstChildMeasuredWithMargins(b bVar, View view) {
        float f10;
        int[] iArr;
        float f11;
        float f12;
        int containerHeight = bVar.getContainerHeight();
        if (bVar.isHorizontal()) {
            containerHeight = bVar.getContainerWidth();
        }
        RecyclerView.g gVar = (RecyclerView.g) view.getLayoutParams();
        float f13 = ((ViewGroup.MarginLayoutParams) gVar).topMargin + ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (bVar.isHorizontal()) {
            f13 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin + ((ViewGroup.MarginLayoutParams) gVar).rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float smallItemSizeMin = getSmallItemSizeMin() + f13;
        float fMax = Math.max(getSmallItemSizeMax() + f13, smallItemSizeMin);
        float f14 = containerHeight;
        float fMin = Math.min(measuredHeight + f13, f14);
        float fClamp = r3.a.clamp((measuredHeight / 3.0f) + f13, smallItemSizeMin + f13, fMax + f13);
        float f15 = (fMin + fClamp) / 2.0f;
        float f16 = smallItemSizeMin * 2.0f;
        int i10 = 1;
        int[] iArr2 = f14 <= f16 ? new int[]{0} : f54394d;
        int carouselAlignment = bVar.getCarouselAlignment();
        int[] iArr3 = f54395e;
        if (carouselAlignment == 1) {
            int length = iArr2.length;
            int[] iArr4 = new int[length];
            f10 = 2.0f;
            for (int i11 = 0; i11 < length; i11++) {
                iArr4[i11] = iArr2[i11] * 2;
            }
            int[] iArr5 = new int[2];
            for (int i12 = 0; i12 < 2; i12++) {
                iArr5[i12] = iArr3[i12] * 2;
            }
            iArr = iArr5;
            iArr2 = iArr4;
        } else {
            f10 = 2.0f;
            iArr = iArr3;
        }
        int i13 = Integer.MIN_VALUE;
        for (int i14 : iArr) {
            if (i14 > i13) {
                i13 = i14;
            }
        }
        float f17 = f14 - (i13 * f15);
        int length2 = iArr2.length;
        int i15 = Integer.MIN_VALUE;
        int i16 = 0;
        while (i16 < length2) {
            int i17 = i10;
            int i18 = iArr2[i16];
            if (i18 > i15) {
                i15 = i18;
            }
            i16++;
            i10 = i17;
        }
        int i19 = i10;
        int iMax = (int) Math.max(1.0d, Math.floor((f17 - (i15 * fMax)) / fMin));
        int iCeil = (int) Math.ceil(f14 / fMin);
        int i20 = (iCeil - iMax) + 1;
        int[] iArr6 = new int[i20];
        for (int i21 = 0; i21 < i20; i21++) {
            iArr6[i21] = iCeil - i21;
        }
        a aVarFindLowestCostArrangement = a.findLowestCostArrangement(f14, fClamp, smallItemSizeMin, fMax, iArr2, f15, iArr, fMin, iArr6);
        int i22 = aVarFindLowestCostArrangement.f54350c;
        int i23 = aVarFindLowestCostArrangement.f54354g;
        this.f54396c = i22 + aVarFindLowestCostArrangement.f54351d + i23;
        int itemCount = bVar.getItemCount();
        int i24 = aVarFindLowestCostArrangement.f54350c;
        int i25 = aVarFindLowestCostArrangement.f54351d;
        int i26 = ((i24 + i25) + i23) - itemCount;
        boolean z10 = i26 > 0 && (i24 > 0 || i25 > i19);
        while (i26 > 0) {
            int i27 = aVarFindLowestCostArrangement.f54350c;
            if (i27 > 0) {
                aVarFindLowestCostArrangement.f54350c = i27 - 1;
            } else {
                int i28 = aVarFindLowestCostArrangement.f54351d;
                if (i28 > 1) {
                    aVarFindLowestCostArrangement.f54351d = i28 - 1;
                }
            }
            i26--;
        }
        int i29 = aVarFindLowestCostArrangement.f54351d;
        if (i29 == 0 && aVarFindLowestCostArrangement.f54350c == 0 && f14 > f16) {
            aVarFindLowestCostArrangement.f54350c = 1;
            z10 = true;
        }
        if (z10) {
            aVarFindLowestCostArrangement = a.findLowestCostArrangement(f14, fClamp, smallItemSizeMin, fMax, new int[]{aVarFindLowestCostArrangement.f54350c}, f15, new int[]{i29}, fMin, new int[]{i23});
        }
        Context context = view.getContext();
        if (bVar.getCarouselAlignment() != 1) {
            float fMin2 = Math.min(context.getResources().getDimension(R.dimen.m3_carousel_gone_size) + f13, aVarFindLowestCostArrangement.f54353f);
            float f18 = fMin2 / f10;
            float f19 = 0.0f - f18;
            float f20 = aVarFindLowestCostArrangement.f54353f;
            int i30 = aVarFindLowestCostArrangement.f54354g;
            float fB = d0.b(0.0f, i30, f20);
            float fI = d0.I(0.0f, d0.a(fB, i30, aVarFindLowestCostArrangement.f54353f), aVarFindLowestCostArrangement.f54353f, i30);
            float fB2 = d0.b(fI, aVarFindLowestCostArrangement.f54351d, aVarFindLowestCostArrangement.f54352e);
            float fB3 = d0.b(d0.I(fI, fB2, aVarFindLowestCostArrangement.f54352e, aVarFindLowestCostArrangement.f54351d), aVarFindLowestCostArrangement.f54350c, aVarFindLowestCostArrangement.f54349b);
            float f21 = f14 + f18;
            float childMaskPercentage = h.getChildMaskPercentage(fMin2, aVarFindLowestCostArrangement.f54353f, f13);
            float childMaskPercentage2 = h.getChildMaskPercentage(aVarFindLowestCostArrangement.f54349b, aVarFindLowestCostArrangement.f54353f, f13);
            float childMaskPercentage3 = h.getChildMaskPercentage(aVarFindLowestCostArrangement.f54352e, aVarFindLowestCostArrangement.f54353f, f13);
            i iVarAddKeylineRange = new i(aVarFindLowestCostArrangement.f54353f, containerHeight).addAnchorKeyline(f19, childMaskPercentage, fMin2).addKeylineRange(fB, 0.0f, aVarFindLowestCostArrangement.f54353f, aVarFindLowestCostArrangement.f54354g, true);
            if (aVarFindLowestCostArrangement.f54351d > 0) {
                iVarAddKeylineRange.addKeyline(fB2, childMaskPercentage3, aVarFindLowestCostArrangement.f54352e);
            }
            int i31 = aVarFindLowestCostArrangement.f54350c;
            if (i31 > 0) {
                iVarAddKeylineRange.addKeylineRange(fB3, childMaskPercentage2, aVarFindLowestCostArrangement.f54349b, i31);
            }
            iVarAddKeylineRange.addAnchorKeyline(f21, childMaskPercentage, fMin2);
            return iVarAddKeylineRange.build();
        }
        float fMin3 = Math.min(context.getResources().getDimension(R.dimen.m3_carousel_gone_size) + f13, aVarFindLowestCostArrangement.f54353f);
        float f22 = fMin3 / f10;
        float f23 = 0.0f - f22;
        float fB4 = d0.b(0.0f, aVarFindLowestCostArrangement.f54350c, aVarFindLowestCostArrangement.f54349b);
        float fI2 = d0.I(0.0f, d0.a(fB4, (int) Math.floor(aVarFindLowestCostArrangement.f54350c / f10), aVarFindLowestCostArrangement.f54349b), aVarFindLowestCostArrangement.f54349b, aVarFindLowestCostArrangement.f54350c);
        float fB5 = d0.b(fI2, aVarFindLowestCostArrangement.f54351d, aVarFindLowestCostArrangement.f54352e);
        float fI3 = d0.I(fI2, d0.a(fB5, (int) Math.floor(aVarFindLowestCostArrangement.f54351d / f10), aVarFindLowestCostArrangement.f54352e), aVarFindLowestCostArrangement.f54352e, aVarFindLowestCostArrangement.f54351d);
        float f24 = aVarFindLowestCostArrangement.f54353f;
        int i32 = aVarFindLowestCostArrangement.f54354g;
        float fB6 = d0.b(fI3, i32, f24);
        float fI4 = d0.I(fI3, d0.a(fB6, i32, aVarFindLowestCostArrangement.f54353f), aVarFindLowestCostArrangement.f54353f, i32);
        float fB7 = d0.b(fI4, aVarFindLowestCostArrangement.f54351d, aVarFindLowestCostArrangement.f54352e);
        float fB8 = d0.b(d0.I(fI4, d0.a(fB7, (int) Math.ceil(aVarFindLowestCostArrangement.f54351d / f10), aVarFindLowestCostArrangement.f54352e), aVarFindLowestCostArrangement.f54352e, aVarFindLowestCostArrangement.f54351d), aVarFindLowestCostArrangement.f54350c, aVarFindLowestCostArrangement.f54349b);
        float f25 = f14 + f22;
        float childMaskPercentage4 = h.getChildMaskPercentage(fMin3, aVarFindLowestCostArrangement.f54353f, f13);
        float childMaskPercentage5 = h.getChildMaskPercentage(aVarFindLowestCostArrangement.f54349b, aVarFindLowestCostArrangement.f54353f, f13);
        float childMaskPercentage6 = h.getChildMaskPercentage(aVarFindLowestCostArrangement.f54352e, aVarFindLowestCostArrangement.f54353f, f13);
        i iVarAddAnchorKeyline = new i(aVarFindLowestCostArrangement.f54353f, containerHeight).addAnchorKeyline(f23, childMaskPercentage4, fMin3);
        if (aVarFindLowestCostArrangement.f54350c > 0) {
            f11 = f25;
            f12 = childMaskPercentage4;
            iVarAddAnchorKeyline.addKeylineRange(fB4, childMaskPercentage5, aVarFindLowestCostArrangement.f54349b, (int) Math.floor(r6 / f10));
        } else {
            f11 = f25;
            f12 = childMaskPercentage4;
        }
        if (aVarFindLowestCostArrangement.f54351d > 0) {
            iVarAddAnchorKeyline.addKeylineRange(fB5, childMaskPercentage6, aVarFindLowestCostArrangement.f54352e, (int) Math.floor(r4 / f10));
        }
        iVarAddAnchorKeyline.addKeylineRange(fB6, 0.0f, aVarFindLowestCostArrangement.f54353f, aVarFindLowestCostArrangement.f54354g, true);
        if (aVarFindLowestCostArrangement.f54351d > 0) {
            iVarAddAnchorKeyline.addKeylineRange(fB7, childMaskPercentage6, aVarFindLowestCostArrangement.f54352e, (int) Math.ceil(r4 / f10));
        }
        if (aVarFindLowestCostArrangement.f54350c > 0) {
            iVarAddAnchorKeyline.addKeylineRange(fB8, childMaskPercentage5, aVarFindLowestCostArrangement.f54349b, (int) Math.ceil(r2 / f10));
        }
        iVarAddAnchorKeyline.addAnchorKeyline(f11, f12, fMin3);
        return iVarAddAnchorKeyline.build();
    }

    @Override // eg.h
    public boolean shouldRefreshKeylineState(b bVar, int i10) {
        if (i10 >= this.f54396c || bVar.getItemCount() < this.f54396c) {
            return i10 >= this.f54396c && bVar.getItemCount() < this.f54396c;
        }
        return true;
    }
}
