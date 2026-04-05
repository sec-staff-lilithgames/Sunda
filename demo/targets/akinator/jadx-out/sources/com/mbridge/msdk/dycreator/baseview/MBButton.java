package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import com.google.android.gms.internal.play_billing.a;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.utils.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class MBButton extends Button implements InterBase {

    /* renamed from: a, reason: collision with root package name */
    private Map<String, String> f39822a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, Boolean> f39823b;

    /* renamed from: c, reason: collision with root package name */
    private String f39824c;

    public MBButton(Context context) {
        super(context);
        this.f39824c = "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        Map<String, String> map = this.f39822a;
        return (map == null || !map.containsKey("mbridgeAction")) ? "" : this.f39822a.get("mbridgeAction");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.f39822a;
        return (map == null || !map.containsKey("mbridgeData")) ? "" : this.f39822a.get("mbridgeData");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.f39822a;
        return (map == null || !map.containsKey("mbridgeEffect")) ? "" : this.f39822a.get("mbridgeEffect");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.f39822a;
        return (map == null || !map.containsKey("mbridgeReport")) ? "" : this.f39822a.get("mbridgeReport");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.f39822a;
        return (map == null || !map.containsKey("mbridgeStrategy")) ? "" : this.f39822a.get("mbridgeStrategy");
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.f39823b;
        if (map != null && map.containsKey("mbridgeAttached") && this.f39823b.get("mbridgeAttached").booleanValue()) {
            a.e("mbridgeAttached").b(this.f39824c);
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.f39823b;
        if (map != null && map.containsKey("mbridgeDetached") && this.f39823b.get("mbridgeDetached").booleanValue()) {
            a.e("mbridgeDetached").b(this.f39824c);
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f39823b = c.a(str);
        if (campaignEx != null) {
            this.f39824c = campaignEx.getCampaignUnitId();
        }
    }

    public MBButton(Context context, AttributeSet attributeSet) {
        super(context);
        this.f39824c = "";
        this.f39822a = c.a(context, attributeSet);
        com.mbridge.msdk.dycreator.utils.a.a(this, attributeSet);
        c.a(this.f39822a, this);
    }

    public MBButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f39824c = "";
    }
}
