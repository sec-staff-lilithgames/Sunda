package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class DynamicRootView extends FrameLayout implements com.bytedance.sdk.component.adexpress.dynamic.cm, com.bytedance.sdk.component.adexpress.theme.jpo {
    private String bgColor;
    private Map<Integer, String> bgMaterialCenterCalcColor;
    private my dynamicBaseWidget;
    private int logoUnionHeight;
    private Context mContext;
    private com.bytedance.sdk.component.adexpress.dynamic.jj.jpo mDynamicClickListener;
    boolean mIsMute;
    private ThemeStatusBroadcastReceiver mReceiver;
    private com.bytedance.sdk.component.adexpress.jd.ju mRenderListener;
    private com.bytedance.sdk.component.adexpress.jd.au mRenderRequest;
    private ViewGroup mTimeOut;
    private com.bytedance.sdk.component.adexpress.dynamic.jd muteListener;
    protected final com.bytedance.sdk.component.adexpress.jd.oya renderResult;
    private int scoreCountWithIcon;
    private List<com.bytedance.sdk.component.adexpress.dynamic.wqx> timeOutListener;
    private int timedown;
    private com.bytedance.sdk.component.adexpress.dynamic.my videoListener;
    public View videoView;

    public DynamicRootView(Context context, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z10, com.bytedance.sdk.component.adexpress.jd.au auVar, com.bytedance.sdk.component.adexpress.dynamic.jj.jpo jpoVar) {
        super(context);
        this.mTimeOut = null;
        this.timedown = 0;
        this.timeOutListener = new ArrayList();
        this.logoUnionHeight = 0;
        this.scoreCountWithIcon = 0;
        this.mContext = context;
        com.bytedance.sdk.component.adexpress.jd.oya oyaVar = new com.bytedance.sdk.component.adexpress.jd.oya();
        this.renderResult = oyaVar;
        oyaVar.jpo(2);
        this.mDynamicClickListener = jpoVar;
        jpoVar.jpo(this);
        this.mReceiver = themeStatusBroadcastReceiver;
        themeStatusBroadcastReceiver.jpo(this);
        this.mIsMute = z10;
        this.mRenderRequest = auVar;
    }

    private void checkCanOpenLandingPage(com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar) {
        com.bytedance.sdk.component.adexpress.dynamic.cm.jj jjVarMy;
        com.bytedance.sdk.component.adexpress.dynamic.cm.my myVarYd = xykVar.yd();
        if (myVarYd == null || (jjVarMy = myVarYd.my()) == null) {
            return;
        }
        this.renderResult.jd(jjVarMy.zmh());
    }

    private boolean checkSizeValid() {
        my myVar = this.dynamicBaseWidget;
        return myVar.my > 0.0f && myVar.f18239jj > 0.0f;
    }

    private void setClipChildren(ViewGroup viewGroup, com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar) {
        ViewGroup viewGroup2;
        if (viewGroup == null || (viewGroup2 = (ViewGroup) viewGroup.getParent()) == null || !xykVar.hmu()) {
            return;
        }
        viewGroup2.setClipChildren(false);
        viewGroup2.setClipToPadding(false);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
        if (viewGroup3 != null) {
            viewGroup3.setClipChildren(false);
            viewGroup3.setClipToPadding(false);
        }
    }

    public void beginHideFromVisible() {
        beginShowFromInvisible(this.dynamicBaseWidget, 4);
    }

    public void beginShowFromInvisible() {
        beginShowFromInvisible(this.dynamicBaseWidget, 0);
    }

    public void callBackRenderFail(int i10, String str) {
        this.renderResult.jpo(false);
        this.renderResult.jd(i10);
        this.renderResult.jpo(str);
        this.mRenderListener.jpo(this.renderResult);
    }

    public String getBgColor() {
        return this.bgColor;
    }

    public Map<Integer, String> getBgMaterialCenterCalcColor() {
        return this.bgMaterialCenterCalcColor;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.jj.jpo getDynamicClickListener() {
        return this.mDynamicClickListener;
    }

    public int getLogoUnionHeight() {
        return this.logoUnionHeight;
    }

    public com.bytedance.sdk.component.adexpress.jd.ju getRenderListener() {
        return this.mRenderListener;
    }

    public com.bytedance.sdk.component.adexpress.jd.au getRenderRequest() {
        return this.mRenderRequest;
    }

    public int getScoreCountWithIcon() {
        return this.scoreCountWithIcon;
    }

    public ViewGroup getTimeOut() {
        return this.mTimeOut;
    }

    public List<com.bytedance.sdk.component.adexpress.dynamic.wqx> getTimeOutListener() {
        return this.timeOutListener;
    }

    public int getTimedown() {
        return this.timedown;
    }

    @Override // com.bytedance.sdk.component.adexpress.theme.jpo
    public void onThemeChanged(int i10) {
        my myVar = this.dynamicBaseWidget;
        if (myVar == null) {
            return;
        }
        myVar.jpo(i10);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.cm
    public void onvideoComplate() {
        try {
            this.videoListener.jpo();
        } catch (Exception unused) {
        }
    }

    public void render(com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar, int i10) {
        this.dynamicBaseWidget = renderDynamicView(xykVar, this, i10);
        this.renderResult.jpo(true);
        this.renderResult.jpo(this.dynamicBaseWidget.my);
        this.renderResult.jd(this.dynamicBaseWidget.f18239jj);
        this.renderResult.jpo(this.videoView);
        this.mRenderListener.jpo(this.renderResult);
    }

    public my renderDynamicView(com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar, ViewGroup viewGroup, int i10) {
        if (xykVar == null) {
            return null;
        }
        List<com.bytedance.sdk.component.adexpress.dynamic.cm.xyk> listJu = xykVar.ju();
        my myVarJpo = com.bytedance.sdk.component.adexpress.dynamic.jpo.jd.jpo(this.mContext, this, xykVar);
        if (myVarJpo instanceof uu) {
            callBackRenderFail(i10 == 3 ? 128 : Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, "unknow widget");
            return null;
        }
        checkCanOpenLandingPage(xykVar);
        myVarJpo.wqx();
        if (viewGroup != null) {
            viewGroup.addView(myVarJpo);
            setClipChildren(viewGroup, xykVar);
        }
        if (listJu == null || listJu.size() <= 0) {
            return null;
        }
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.cm.xyk> it = listJu.iterator();
        while (it.hasNext()) {
            renderDynamicView(it.next(), myVarJpo, i10);
        }
        return myVarJpo;
    }

    public void setBgColor(String str) {
        this.bgColor = str;
    }

    public void setBgMaterialCenterCalcColor(Map<Integer, String> map) {
        this.bgMaterialCenterCalcColor = map;
    }

    public void setLogoUnionHeight(int i10) {
        this.logoUnionHeight = i10;
    }

    public void setMuteListener(com.bytedance.sdk.component.adexpress.dynamic.jd jdVar) {
        this.muteListener = jdVar;
    }

    public void setRenderListener(com.bytedance.sdk.component.adexpress.jd.ju juVar) {
        this.mRenderListener = juVar;
        this.mDynamicClickListener.jpo(juVar);
    }

    public void setScoreCountWithIcon(int i10) {
        this.scoreCountWithIcon = i10;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.cm
    public void setSoundMute(boolean z10) {
        com.bytedance.sdk.component.adexpress.dynamic.jd jdVar = this.muteListener;
        if (jdVar != null) {
            jdVar.setSoundMute(z10);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.cm
    public void setTime(CharSequence charSequence, int i10, int i11, boolean z10) {
        for (int i12 = 0; i12 < this.timeOutListener.size(); i12++) {
            if (this.timeOutListener.get(i12) != null) {
                this.timeOutListener.get(i12).jpo(charSequence, i10 == 1, i11, z10);
            }
        }
    }

    public void setTimeOut(ViewGroup viewGroup) {
        this.mTimeOut = viewGroup;
    }

    public void setTimeOutListener(com.bytedance.sdk.component.adexpress.dynamic.wqx wqxVar) {
        this.timeOutListener.add(wqxVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.cm
    public void setTimeUpdate(int i10) {
        this.videoListener.setTimeUpdate(i10);
    }

    public void setTimedown(int i10) {
        this.timedown = i10;
    }

    public void setVideoListener(com.bytedance.sdk.component.adexpress.dynamic.my myVar) {
        this.videoListener = myVar;
    }

    public void updateRenderInfoForVideo(double d10, double d11, double d12, double d13, float f10) {
        this.renderResult.wqx(d10);
        this.renderResult.cm(d11);
        this.renderResult.my(d12);
        this.renderResult.jj(d13);
        this.renderResult.jpo(f10);
        this.renderResult.jd(f10);
        this.renderResult.wqx(f10);
        this.renderResult.cm(f10);
    }

    public void beginShowFromInvisible(my myVar, int i10) {
        if (myVar == null) {
            return;
        }
        if (myVar.getBeginInvisibleAndShow()) {
            myVar.setVisibility(i10);
            View view = myVar.prr;
            if (view != null) {
                view.setVisibility(i10);
            }
        }
        int childCount = myVar.getChildCount();
        if (childCount <= 0) {
            return;
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            if (myVar.getChildAt(i11) instanceof my) {
                beginShowFromInvisible((my) myVar.getChildAt(i11), i10);
            }
        }
    }
}
