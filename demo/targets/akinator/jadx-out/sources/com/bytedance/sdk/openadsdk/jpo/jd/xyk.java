package com.bytedance.sdk.openadsdk.jpo.jd;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.cm.qk;
import com.bytedance.sdk.openadsdk.core.hna;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.core.zz;
import com.bytedance.sdk.openadsdk.hmu.jd.my;
import com.bytedance.sdk.openadsdk.utils.nq;
import com.bytedance.sdk.openadsdk.utils.tic;
import com.bytedance.sdk.openadsdk.utils.uu;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class xyk extends PAGNativeAd {

    /* renamed from: cm, reason: collision with root package name */
    protected jpo f21234cm;

    /* renamed from: jd, reason: collision with root package name */
    protected final dt f21235jd;

    /* renamed from: jj, reason: collision with root package name */
    protected int f21236jj;
    protected hna jpo;
    protected int my;

    /* renamed from: qk, reason: collision with root package name */
    protected String f21237qk;
    protected final Context wqx;
    private boolean xyk;
    private boolean zz;

    public xyk(Context context, dt dtVar, int i10, boolean z10) {
        this.f21235jd = dtVar;
        this.wqx = context;
        this.my = i10;
        this.f21236jj = dtVar.jl();
        String strWqx = tic.wqx(i10);
        this.f21237qk = strWqx;
        if (z10) {
            this.f21234cm = new jpo(context, dtVar, strWqx);
            this.jpo = new hna(context, this, dtVar, jpo(i10), this.f21234cm);
        }
    }

    private List<View> jpo(List<View> list, List<View> list2) {
        LinkedList linkedList = new LinkedList();
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                linkedList.add(list.get(i10));
            }
        }
        if (list2 != null && !list2.isEmpty()) {
            int size2 = list2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                linkedList.add(list2.get(i11));
            }
        }
        return linkedList;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        dt dtVar = this.f21235jd;
        if (dtVar == null || dtVar.gy() == null) {
            return null;
        }
        try {
            return this.f21235jd.gy().get(str);
        } catch (Throwable th2) {
            nmd.wqx("TTNativeAdImpl", th2.getMessage());
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        dt dtVar = this.f21235jd;
        if (dtVar != null) {
            return dtVar.gy();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public PAGNativeAdData getNativeAdData() {
        return new cm(xyk());
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d10, String str, String str2) {
        if (this.zz) {
            return;
        }
        uu.jpo(this.f21235jd, d10, str, str2);
        this.zz = true;
    }

    public boolean qk() {
        dt dtVar = this.f21235jd;
        return (dtVar == null || dtVar.pzk() == 5 || sq.cm().wqx(this.f21236jj) != 1) ? false : true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void registerViewForInteraction(ViewGroup viewGroup, List<View> list, List<View> list2, View view, PAGNativeAdInteractionListener pAGNativeAdInteractionListener) {
        if (viewGroup == null || list == null || list.size() <= 0) {
            return;
        }
        jpo(viewGroup, null, list, list2, view, new qk(pAGNativeAdInteractionListener));
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d10) {
        if (this.xyk) {
            return;
        }
        uu.jpo(this.f21235jd, d10);
        this.xyk = true;
    }

    public jpo xyk() {
        return this.f21234cm;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void registerViewForInteraction(ViewGroup viewGroup, List<View> list, List<View> list2, View view, PAGNativeAdInteractionCallback pAGNativeAdInteractionCallback) {
        registerViewForInteraction(viewGroup, list, list2, view, (PAGNativeAdInteractionListener) pAGNativeAdInteractionCallback);
    }

    private String jpo(int i10) {
        if (i10 == 1) {
            return "banner_ad";
        }
        if (i10 != 2) {
            return "embeded_ad";
        }
        return "interaction";
    }

    public void jpo(String str) {
        this.f21237qk = str;
    }

    public void jpo(ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, View view, final jj jjVar) {
        if (viewGroup == null || list2 == null || list2.size() <= 0) {
            return;
        }
        if (qk()) {
            list3 = jpo(list2, list3);
        }
        List<View> list4 = list3;
        if (view != null && jjVar != null && jjVar.jd()) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.jpo.jd.xyk.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    final String strJpo = nq.jpo();
                    TTDelegateActivity.jpo(xyk.this.f21235jd, strJpo, new qk.jpo() { // from class: com.bytedance.sdk.openadsdk.jpo.jd.xyk.1.1
                        @Override // com.bytedance.sdk.openadsdk.core.cm.qk.jpo
                        public void jpo() {
                            jjVar.jpo();
                            zz.jd().jj(strJpo);
                            PAGMediaView pAGMediaViewJpo = xyk.this.xyk().jpo();
                            if (pAGMediaViewJpo != null) {
                                pAGMediaViewJpo.close();
                            }
                        }
                    });
                }
            });
        }
        this.jpo.jpo(viewGroup, list, list2, list4, jjVar);
        dt dtVar = this.f21235jd;
        com.bytedance.sdk.openadsdk.hmu.jd.my.jpo(viewGroup, this.f21235jd, (dtVar == null || dtVar.cql() != 2) ? null : new my.jpo(this.f21235jd.tl()));
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void showPrivacyActivity() {
    }
}
