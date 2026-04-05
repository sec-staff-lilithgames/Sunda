package com.mbridge.msdk.dycreator.baseview;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.internal.play_billing.a;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.baseview.inter.InterEffect;
import com.mbridge.msdk.dycreator.engine.b;
import com.mbridge.msdk.dycreator.engine.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.p0;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class MBTextView extends TextView implements InterBase, InterEffect {

    /* renamed from: a, reason: collision with root package name */
    private boolean f39916a;
    public AttributeSet attrs;

    /* renamed from: b, reason: collision with root package name */
    private Animator f39917b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, String> f39918c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, Boolean> f39919d;

    /* renamed from: e, reason: collision with root package name */
    private String f39920e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.mbridge.msdk.dycreator.baseview.MBTextView$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f39921a;

        static {
            int[] iArr = new int[c.values().length];
            f39921a = iArr;
            try {
                iArr[c.layout_width.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39921a[c.layout_height.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public MBTextView(Context context) {
        super(context);
        this.f39916a = false;
        this.f39920e = "";
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        HashMap mapB = b.a().b();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            c cVar = (c) mapB.get(attributeSet.getAttributeName(i10));
            if (cVar != null) {
                int i11 = AnonymousClass1.f39921a[cVar.ordinal()];
                if (i11 == 1) {
                    String attributeValue = attributeSet.getAttributeValue(i10);
                    if (attributeValue.startsWith(InneractiveMediationDefs.GENDER_FEMALE) || attributeValue.startsWith("m")) {
                        layoutParams.width = -1;
                    } else if (attributeValue.startsWith("wrap")) {
                        layoutParams.width = -2;
                    } else {
                        layoutParams.width = b.a().a(attributeValue);
                    }
                } else if (i11 == 2) {
                    String attributeValue2 = attributeSet.getAttributeValue(i10);
                    if (attributeValue2.startsWith(InneractiveMediationDefs.GENDER_FEMALE) || attributeValue2.startsWith("m")) {
                        layoutParams.height = -1;
                    } else if (attributeValue2.startsWith("wrap")) {
                        layoutParams.height = -2;
                    } else {
                        layoutParams.height = b.a().a(attributeValue2);
                    }
                }
            }
        }
        return layoutParams;
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        Map<String, String> map = this.f39918c;
        return (map == null || !map.containsKey("mbridgeAction")) ? "" : this.f39918c.get("mbridgeAction");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.f39918c;
        return (map == null || !map.containsKey("mbridgeData")) ? "" : this.f39918c.get("mbridgeData");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.f39918c;
        return (map == null || !map.containsKey("mbridgeEffect")) ? "" : this.f39918c.get("mbridgeEffect");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.f39918c;
        return (map == null || !map.containsKey("mbridgeReport")) ? "" : this.f39918c.get("mbridgeReport");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.f39918c;
        return (map == null || !map.containsKey("mbridgeStrategy")) ? "" : this.f39918c.get("mbridgeStrategy");
    }

    @Override // android.view.View
    public boolean isFocused() {
        if (this.f39916a) {
            return true;
        }
        return super.isFocused();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Animator animator = this.f39917b;
        if (animator != null) {
            try {
                animator.start();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        Map<String, Boolean> map = this.f39919d;
        if (map != null && map.containsKey("mbridgeAttached") && this.f39919d.get("mbridgeAttached").booleanValue()) {
            a.e("mbridgeAttached").b(this.f39920e);
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Animator animator = this.f39917b;
        if (animator != null) {
            try {
                animator.cancel();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        Map<String, Boolean> map = this.f39919d;
        if (map != null && map.containsKey("mbridgeDetached") && this.f39919d.get("mbridgeDetached").booleanValue()) {
            a.e("mbridgeDetached").b(this.f39920e);
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterEffect
    public void setAnimator(Animator animator) {
        this.f39917b = animator;
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f39919d = com.mbridge.msdk.dycreator.utils.c.a(str);
        if (campaignEx != null) {
            this.f39920e = campaignEx.getCampaignUnitId();
        }
    }

    public MBTextView(Context context, AttributeSet attributeSet) {
        super(context);
        this.f39916a = false;
        this.f39920e = "";
        this.attrs = attributeSet;
        try {
            this.f39918c = com.mbridge.msdk.dycreator.utils.c.a(context, attributeSet);
            com.mbridge.msdk.dycreator.utils.a.a(this, attributeSet);
            setLayoutParams(generateLayoutParams(attributeSet));
            com.mbridge.msdk.dycreator.utils.c.a(this.f39918c, this);
        } catch (Exception e10) {
            p0.b("TextView", e10.getMessage());
        }
    }

    public MBTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f39916a = false;
        this.f39920e = "";
    }
}
