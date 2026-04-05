package com.mbridge.msdk.dycreator.baseview.extview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.RelativeLayout;
import com.google.android.gms.internal.play_billing.a;
import com.mbridge.msdk.dycreator.baseview.GradientOrientationUtils;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView;
import com.mbridge.msdk.dycreator.engine.b;
import com.mbridge.msdk.dycreator.engine.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.h0;
import com.mbridge.msdk.foundation.tools.p0;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class MBExtAcquireRewardPopView extends MBAcquireRewardPopView implements InterBase {

    /* renamed from: r, reason: collision with root package name */
    private Map<String, String> f40019r;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.mbridge.msdk.dycreator.baseview.extview.MBExtAcquireRewardPopView$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f40020a;

        static {
            int[] iArr = new int[c.values().length];
            f40020a = iArr;
            try {
                iArr[c.id.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40020a[c.background.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40020a[c.padding.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f40020a[c.gravity.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f40020a[c.visibility.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f40020a[c.layout_width.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f40020a[c.layout_height.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f40020a[c.layout_centerHorizontal.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f40020a[c.layout_alignParentBottom.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f40020a[c.layout_alignParentTop.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f40020a[c.layout_centerVertical.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f40020a[c.layout_below.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f40020a[c.layout_above.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f40020a[c.layout_toLeftOf.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f40020a[c.layout_toRightOf.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f40020a[c.layout_toEndOf.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f40020a[c.layout_margin.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f40020a[c.layout_marginLeft.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f40020a[c.layout_marginRight.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f40020a[c.layout_marginTop.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f40020a[c.layout_marginBottom.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f40020a[c.layout_alignParentRight.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f40020a[c.layout_alignParentLeft.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f40020a[c.layout_alignTop.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f40020a[c.layout_alignLeft.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f40020a[c.layout_alignRight.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f40020a[c.layout_alignBottom.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f40020a[c.layout_centerInParent.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f40020a[c.layout_alignParentEnd.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
        }
    }

    public MBExtAcquireRewardPopView(Context context) {
        super(context);
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        Map<String, String> map = this.f40019r;
        return (map == null || !map.containsKey("mbridgeAction")) ? "" : this.f40019r.get("mbridgeAction");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.f40019r;
        return (map == null || !map.containsKey("mbridgeData")) ? "" : this.f40019r.get("mbridgeData");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.f40019r;
        return (map == null || !map.containsKey("mbridgeEffect")) ? "" : this.f40019r.get("mbridgeEffect");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.f40019r;
        return (map == null || !map.containsKey("mbridgeReport")) ? "" : this.f40019r.get("mbridgeReport");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.f40019r;
        return (map == null || !map.containsKey("mbridgeStrategy")) ? "" : this.f40019r.get("mbridgeStrategy");
    }

    public void setAttributeSet(AttributeSet attributeSet) throws NumberFormatException {
        String[] strArrSplit;
        HashMap<String, c> mapC = b.a().c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            c cVar = mapC.get(attributeSet.getAttributeName(i10));
            if (cVar != null) {
                int i11 = AnonymousClass1.f40020a[cVar.ordinal()];
                if (i11 == 1) {
                    String attributeValue = attributeSet.getAttributeValue(i10);
                    if (attributeValue.startsWith("@+id/")) {
                        setId(attributeValue.substring(5).hashCode());
                    }
                } else if (i11 == 2) {
                    Log.i("litongtest", "设置背景颜色");
                    String attributeValue2 = attributeSet.getAttributeValue(i10);
                    if (attributeValue2.startsWith("#")) {
                        try {
                            strArrSplit = attributeValue2.split("-");
                        } catch (Exception unused) {
                            strArrSplit = null;
                        }
                        if (strArrSplit != null && strArrSplit.length <= 2) {
                            setBackgroundColor(b.a().d(attributeSet.getAttributeValue(i10)));
                        } else if (strArrSplit == null || strArrSplit.length != 3) {
                            setBackgroundColor(b.a().d(attributeSet.getAttributeValue(i10)));
                        } else {
                            try {
                                GradientDrawable gradientDrawable = new GradientDrawable(GradientOrientationUtils.getOrientation(strArrSplit[2]), new int[]{Color.parseColor(strArrSplit[0]), Color.parseColor(strArrSplit[1])});
                                gradientDrawable.setGradientType(0);
                                setBackground(gradientDrawable);
                            } catch (Exception unused2) {
                                setBackgroundColor(b.a().d(attributeSet.getAttributeValue(i10)));
                            }
                        }
                    } else {
                        if (attributeValue2.startsWith("@drawable/")) {
                            attributeValue2 = attributeValue2.substring(10);
                        }
                        setBackgroundResource(h0.a(com.mbridge.msdk.foundation.controller.c.m().d(), attributeValue2, "drawable"));
                    }
                } else if (i11 == 3) {
                    int iA = b.a().a(attributeSet.getAttributeValue(i10));
                    setPadding(iA, iA, iA, iA);
                } else if (i11 == 4) {
                    setGravity(b.a().b(attributeSet.getAttributeValue(i10)));
                } else if (i11 == 5) {
                    String attributeValue3 = attributeSet.getAttributeValue(i10);
                    if (!TextUtils.isEmpty(attributeValue3)) {
                        if (attributeValue3.equals("invisible")) {
                            setVisibility(4);
                        } else if (attributeValue3.equalsIgnoreCase("gone")) {
                            setVisibility(8);
                        }
                    }
                }
            }
        }
    }

    public MBExtAcquireRewardPopView(Context context, AttributeSet attributeSet) {
        super(context);
        try {
            this.f40019r = com.mbridge.msdk.dycreator.utils.c.a(context, attributeSet);
            setAttributeSet(attributeSet);
            setLayoutParams(generateLayoutParams(attributeSet));
            com.mbridge.msdk.dycreator.utils.c.a(this.f40019r, this);
        } catch (Exception e10) {
            p0.b("MBExtAcquireRewardPopView", e10.getMessage());
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup
    public RelativeLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) throws NumberFormatException {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(0, 0);
        HashMap mapB = b.a().b();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            c cVar = (c) mapB.get(attributeSet.getAttributeName(i10));
            if (cVar != null) {
                switch (AnonymousClass1.f40020a[cVar.ordinal()]) {
                    case 6:
                        String attributeValue = attributeSet.getAttributeValue(i10);
                        if (!attributeValue.startsWith("fill") && !attributeValue.startsWith("match")) {
                            if (attributeValue.startsWith("w")) {
                                layoutParams.width = -2;
                                break;
                            } else {
                                layoutParams.width = b.a().a(attributeValue);
                                break;
                            }
                        } else {
                            layoutParams.width = -1;
                            break;
                        }
                    case 7:
                        String attributeValue2 = attributeSet.getAttributeValue(i10);
                        if (!attributeValue2.startsWith("fill") && !attributeValue2.startsWith("match")) {
                            if (attributeValue2.startsWith("wrap")) {
                                layoutParams.height = -2;
                                break;
                            } else {
                                layoutParams.height = b.a().a(attributeValue2);
                                break;
                            }
                        } else {
                            layoutParams.height = -1;
                            break;
                        }
                        break;
                    case 8:
                        if (attributeSet.getAttributeBooleanValue(i10, false)) {
                            layoutParams.addRule(14, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (attributeSet.getAttributeBooleanValue(i10, false)) {
                            layoutParams.addRule(12, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (attributeSet.getAttributeBooleanValue(i10, false)) {
                            layoutParams.addRule(10, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (attributeSet.getAttributeBooleanValue(i10, false)) {
                            layoutParams.addRule(15, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        String attributeValue3 = attributeSet.getAttributeValue(i10);
                        if (attributeValue3.startsWith("@+id")) {
                            a.t(attributeValue3, 5, layoutParams, 3);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        String attributeValue4 = attributeSet.getAttributeValue(i10);
                        if (attributeValue4.startsWith("@+id")) {
                            a.t(attributeValue4, 5, layoutParams, 2);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        String attributeValue5 = attributeSet.getAttributeValue(i10);
                        if (attributeValue5.startsWith("@+id")) {
                            a.t(attributeValue5, 5, layoutParams, 0);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        String attributeValue6 = attributeSet.getAttributeValue(i10);
                        if (attributeValue6.startsWith("@+id")) {
                            a.t(attributeValue6, 5, layoutParams, 1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        String attributeValue7 = attributeSet.getAttributeValue(i10);
                        if (attributeValue7.startsWith("@+id")) {
                            a.t(attributeValue7, 5, layoutParams, 17);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int iA = b.a().a(attributeSet.getAttributeValue(i10));
                        layoutParams.setMargins(iA, iA, iA, iA);
                        break;
                    case 18:
                        layoutParams.leftMargin = b.a().a(attributeSet.getAttributeValue(i10));
                        break;
                    case 19:
                        layoutParams.rightMargin = b.a().a(attributeSet.getAttributeValue(i10));
                        break;
                    case 20:
                        layoutParams.topMargin = b.a().a(attributeSet.getAttributeValue(i10));
                        break;
                    case 21:
                        layoutParams.bottomMargin = b.a().a(attributeSet.getAttributeValue(i10));
                        break;
                    case 22:
                        if (attributeSet.getAttributeBooleanValue(i10, false)) {
                            layoutParams.addRule(11, -1);
                            break;
                        } else {
                            break;
                        }
                    case 23:
                        if (attributeSet.getAttributeBooleanValue(i10, false)) {
                            layoutParams.addRule(9, -1);
                            break;
                        } else {
                            break;
                        }
                    case 24:
                        String attributeValue8 = attributeSet.getAttributeValue(i10);
                        if (attributeValue8.startsWith("@+id")) {
                            a.t(attributeValue8, 5, layoutParams, 6);
                            break;
                        } else {
                            break;
                        }
                    case 25:
                        String attributeValue9 = attributeSet.getAttributeValue(i10);
                        if (attributeValue9.startsWith("@+id")) {
                            a.t(attributeValue9, 5, layoutParams, 5);
                            break;
                        } else {
                            break;
                        }
                    case 26:
                        String attributeValue10 = attributeSet.getAttributeValue(i10);
                        if (attributeValue10.startsWith("@+id")) {
                            a.t(attributeValue10, 5, layoutParams, 7);
                            break;
                        } else {
                            break;
                        }
                    case 27:
                        String attributeValue11 = attributeSet.getAttributeValue(i10);
                        if (attributeValue11.startsWith("@+id")) {
                            a.t(attributeValue11, 5, layoutParams, 8);
                            break;
                        } else {
                            break;
                        }
                    case 28:
                        if (attributeSet.getAttributeBooleanValue(i10, false)) {
                            layoutParams.addRule(13, -1);
                            break;
                        } else {
                            break;
                        }
                    case 29:
                        if (attributeSet.getAttributeBooleanValue(i10, false)) {
                            layoutParams.addRule(21, -1);
                            break;
                        } else {
                            break;
                        }
                }
            }
        }
        return layoutParams;
    }

    public MBExtAcquireRewardPopView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
    }
}
