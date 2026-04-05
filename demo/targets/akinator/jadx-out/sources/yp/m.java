package yp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import io.bidmachine.LabelData;
import io.bidmachine.PositionData;
import io.bidmachine.PrivacySheetData;
import ir.s;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import o9.j0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class m extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f94786b = 0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(Context context) {
        this(context, null, 0, 6, null);
        e0.checkNotNullParameter(context, "context");
    }

    public final ImageView a(LabelData labelData, int i10, int i11) {
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImageBitmap(labelData.getImage());
        Context context = imageView.getContext();
        e0.checkNotNullExpressionValue(context, "context");
        int iDpToPx = s.dpToPx(context, labelData.getWidthDp());
        Context context2 = imageView.getContext();
        e0.checkNotNullExpressionValue(context2, "context");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iDpToPx, s.dpToPx(context2, labelData.getHeightDp()));
        layoutParams.setMargins(i10, 0, i11, 0);
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }

    public final void bindNativeData(vp.o nativeData) {
        int childCount;
        e0.checkNotNullParameter(nativeData, "nativeData");
        removeAllViews();
        Context context = getContext();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LabelData adLabelData = nativeData.getAdLabelData();
        int i10 = 0;
        if (adLabelData != null) {
            PositionData positionData = adLabelData.getPositionData();
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.addView(a(adLabelData, 0, 0));
            linkedHashMap.put(positionData, linearLayout);
        }
        PrivacySheetData privacySheetData = nativeData.getPrivacySheetData();
        if (privacySheetData != null) {
            LabelData labelData = privacySheetData.getLabelData();
            PositionData positionData2 = labelData.getPositionData();
            LinearLayout linearLayout2 = (LinearLayout) linkedHashMap.get(positionData2);
            if (linearLayout2 == null) {
                linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(0);
            }
            linkedHashMap.put(positionData2, linearLayout2);
            e0.checkNotNullExpressionValue(context, "context");
            int iDpToPx = s.dpToPx(context, 5.0f);
            int childCount2 = linearLayout2.getChildCount();
            if (positionData2 == PositionData.TopLeft || positionData2 == PositionData.BottomLeft) {
                childCount = 0;
                if (childCount2 <= 0) {
                    iDpToPx = 0;
                }
            } else {
                childCount = linearLayout2.getChildCount();
                if (childCount2 > 0) {
                    iDpToPx = 0;
                    i10 = iDpToPx;
                } else {
                    iDpToPx = 0;
                }
            }
            ImageView imageViewA = a(labelData, i10, iDpToPx);
            linearLayout2.addView(imageViewA, childCount);
            imageViewA.setOnClickListener(new j0(privacySheetData, 15));
        }
        e0.checkNotNullExpressionValue(context, "context");
        int iDpToPx2 = s.dpToPx(context, 8.0f);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PositionData positionData3 = (PositionData) entry.getKey();
            View view = (LinearLayout) entry.getValue();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(iDpToPx2, iDpToPx2, iDpToPx2, iDpToPx2);
            int i11 = l.$EnumSwitchMapping$0[positionData3.ordinal()];
            if (i11 == 1) {
                layoutParams.gravity = 51;
            } else if (i11 == 2) {
                layoutParams.gravity = 53;
            } else if (i11 == 3) {
                layoutParams.gravity = 83;
            } else if (i11 == 4) {
                layoutParams.gravity = 85;
            }
            addView(view, layoutParams);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        e0.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ m(Context context, AttributeSet attributeSet, int i10, int i11, u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        e0.checkNotNullParameter(context, "context");
    }
}
