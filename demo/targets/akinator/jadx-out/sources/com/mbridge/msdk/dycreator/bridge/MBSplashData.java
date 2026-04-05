package com.mbridge.msdk.dycreator.bridge;

import com.mbridge.msdk.dycreator.viewdata.base.a;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class MBSplashData implements a {

    /* renamed from: a, reason: collision with root package name */
    private DyOption f40138a;

    /* renamed from: b, reason: collision with root package name */
    private String f40139b;

    /* renamed from: c, reason: collision with root package name */
    private String f40140c;

    /* renamed from: d, reason: collision with root package name */
    private String f40141d;

    /* renamed from: e, reason: collision with root package name */
    private String f40142e;

    /* renamed from: f, reason: collision with root package name */
    private CampaignEx f40143f;

    /* renamed from: g, reason: collision with root package name */
    private int f40144g;

    /* renamed from: h, reason: collision with root package name */
    private int f40145h;

    /* renamed from: i, reason: collision with root package name */
    private float f40146i;

    /* renamed from: j, reason: collision with root package name */
    private float f40147j;

    /* renamed from: k, reason: collision with root package name */
    private int f40148k = 0;

    public MBSplashData(DyOption dyOption) {
        this.f40138a = dyOption;
        this.f40143f = dyOption.getCampaignEx();
    }

    public String getAdClickText() {
        return this.f40140c;
    }

    public String getAppInfo() {
        return this.f40139b;
    }

    @Override // com.mbridge.msdk.dycreator.viewdata.base.a
    public CampaignEx getBindData() {
        return this.f40143f;
    }

    public int getClickType() {
        return this.f40148k;
    }

    public String getCountDownText() {
        return this.f40141d;
    }

    public DyOption getDyOption() {
        return this.f40138a;
    }

    @Override // com.mbridge.msdk.dycreator.viewdata.base.a
    public DyOption getEffectData() {
        return this.f40138a;
    }

    public int getLogoImage() {
        return this.f40145h;
    }

    public String getLogoText() {
        return this.f40142e;
    }

    public int getNoticeImage() {
        return this.f40144g;
    }

    public float getxInScreen() {
        return this.f40146i;
    }

    public float getyInScreen() {
        return this.f40147j;
    }

    public void setAdClickText(String str) {
        this.f40140c = str;
    }

    public void setAppInfo(String str) {
        this.f40139b = str;
    }

    public void setClickType(int i10) {
        this.f40148k = i10;
    }

    public void setCountDownText(String str) {
        this.f40141d = str;
    }

    public void setLogoImage(int i10) {
        this.f40145h = i10;
    }

    public void setLogoText(String str) {
        this.f40142e = str;
    }

    public void setNoticeImage(int i10) {
        this.f40144g = i10;
    }

    public void setxInScreen(float f10) {
        this.f40146i = f10;
    }

    public void setyInScreen(float f10) {
        this.f40147j = f10;
    }
}
