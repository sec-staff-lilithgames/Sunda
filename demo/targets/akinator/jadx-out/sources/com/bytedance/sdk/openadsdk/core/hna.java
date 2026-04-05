package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoMediaView;
import com.bytedance.sdk.openadsdk.core.qk;
import com.bytedance.sdk.openadsdk.core.wqx.jd;
import com.bytedance.sdk.openadsdk.core.wqx.wqx;
import com.bytedance.sdk.openadsdk.utils.va;
import com.bytedance.sdk.openadsdk.utils.vrc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class hna {

    /* renamed from: au, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.wqx.jd f20345au;

    /* renamed from: cm, reason: collision with root package name */
    private final PAGNativeAd f20346cm;

    /* renamed from: jd, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.jr.jpo.jpo.jj f20347jd;

    /* renamed from: jj, reason: collision with root package name */
    private final String f20348jj;
    private final com.bytedance.sdk.openadsdk.core.model.dt jpo;

    /* renamed from: ju, reason: collision with root package name */
    private com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx f20349ju;
    private com.bytedance.sdk.openadsdk.core.wqx.jpo oya;

    /* renamed from: qk, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.jpo.jd.jj f20350qk;
    private final Context wqx;
    private long xyk;

    /* renamed from: yd, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.jpo.jd.jpo f20351yd;
    private List<View> my = new ArrayList();
    private final com.bytedance.sdk.openadsdk.cm.qk zz = new com.bytedance.sdk.openadsdk.cm.qk();

    /* renamed from: if, reason: not valid java name */
    private final AtomicBoolean f118if = new AtomicBoolean(false);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo implements View.OnLayoutChangeListener {

        /* renamed from: jd, reason: collision with root package name */
        private final ViewGroup f20354jd;
        private final com.bytedance.sdk.openadsdk.cm.qk jpo;

        public jpo(com.bytedance.sdk.openadsdk.cm.qk qkVar, ViewGroup viewGroup) {
            this.jpo = qkVar;
            this.f20354jd = viewGroup;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.jpo.jpo(System.currentTimeMillis(), nzb.jpo(this.f20354jd));
        }
    }

    public hna(Context context, PAGNativeAd pAGNativeAd, com.bytedance.sdk.openadsdk.core.model.dt dtVar, String str, com.bytedance.sdk.openadsdk.jpo.jd.jpo jpoVar) {
        this.f20346cm = pAGNativeAd;
        this.jpo = dtVar;
        this.wqx = context;
        this.f20348jj = str;
        this.f20351yd = jpoVar;
        if (dtVar.pzk() == 4) {
            this.f20347jd = com.bytedance.sdk.openadsdk.jr.jpo.jpo.qk.jpo(context, str);
        }
    }

    private qk my(ViewGroup viewGroup) {
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof qk) {
                return (qk) childAt;
            }
        }
        return null;
    }

    private void cm(ViewGroup viewGroup) throws JSONException {
        com.bytedance.sdk.openadsdk.core.model.dt dtVar;
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.my != null) {
                JSONArray jSONArray = new JSONArray();
                for (View view : this.my) {
                    if (view != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.put("width", view.getWidth());
                            jSONObject2.put("height", view.getHeight());
                            jSONObject2.put("alpha", view.getAlpha());
                        } catch (Throwable unused) {
                        }
                        jSONArray.put(jSONObject2);
                    }
                }
                jSONObject.put("image_view", jSONArray.toString());
            }
            if (viewGroup != null) {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("width", viewGroup.getWidth());
                    jSONObject3.put("height", viewGroup.getHeight());
                    jSONObject3.put("alpha", viewGroup.getAlpha());
                } catch (Throwable unused2) {
                }
                jSONObject.put("root_view", jSONObject3.toString());
            }
            if (this.f20351yd.xyk() != null) {
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put("width", va.wqx(this.wqx, r11.getWidth()) * 1.0f);
                    jSONObject4.put("height", va.wqx(this.wqx, r11.getHeight()) * 1.0f);
                } catch (Throwable unused3) {
                }
                jSONObject.put("media_view", jSONObject4.toString());
            }
            com.bytedance.sdk.openadsdk.core.zz.nmd nmdVarJd = this.f20351yd.jd();
            if (nmdVarJd != null && (dtVar = this.jpo) != null) {
                jSONObject.put("dynamic_show_type", dtVar.tl());
                nmdVarJd.jpo(jSONObject, this.jpo);
            }
            com.bytedance.sdk.openadsdk.cm.wqx.jpo(this.jpo, this.f20348jj, jSONObject, (JSONObject) null);
            com.bytedance.sdk.openadsdk.hmu.jpo.wqx.jpo(this.jpo);
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.nmd.jpo("InteractionManager", "onShowFun json error", e10);
        }
    }

    private void jd(ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, com.bytedance.sdk.openadsdk.jpo.jd.jj jjVar) {
        this.f20350qk = jjVar;
        viewGroup.addOnLayoutChangeListener(new jpo(this.zz, viewGroup));
        this.my = list;
        jpo(list2, (com.bytedance.sdk.openadsdk.core.wqx.wqx) null);
        if (list != null) {
            for (View view : this.my) {
                if (view != null) {
                    view.setTag(520093762, Boolean.TRUE);
                }
            }
            if (list3 != null) {
                list3.addAll(list);
            }
        }
        jpo(list3, (com.bytedance.sdk.openadsdk.core.wqx.wqx) null);
    }

    private qk wqx(ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, com.bytedance.sdk.openadsdk.jpo.jd.jj jjVar) {
        this.f20350qk = jjVar;
        viewGroup.addOnLayoutChangeListener(new jpo(this.zz, viewGroup));
        this.my = list;
        qk qkVarMy = my(viewGroup);
        if (qkVarMy == null) {
            qkVarMy = new qk(this.wqx, viewGroup, false);
            viewGroup.addView(qkVarMy);
        }
        qkVarMy.jpo();
        qkVarMy.setRefClickViews(list2);
        if (list != null) {
            for (View view : this.my) {
                if (view != null) {
                    view.setTag(520093762, Boolean.TRUE);
                }
            }
            if (list3 != null) {
                list3.addAll(list);
            }
        }
        qkVarMy.setRefCreativeViews(list3);
        return qkVarMy;
    }

    public com.bytedance.sdk.openadsdk.cm.qk jpo() {
        return this.zz;
    }

    public void jpo(View view, int i10) {
        com.bytedance.sdk.openadsdk.jpo.jd.jj jjVar = this.f20350qk;
        if (jjVar != null) {
            jjVar.onAdClicked();
        }
    }

    public void jpo(ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, com.bytedance.sdk.openadsdk.jpo.jd.jj jjVar) {
        jd(viewGroup, list, list2, list3, jjVar);
        jpo(viewGroup);
        jpo(viewGroup, list2, list3);
    }

    private void jd(com.bytedance.sdk.openadsdk.core.wqx.jd jdVar, com.bytedance.sdk.openadsdk.core.wqx.jpo jpoVar) {
        com.bytedance.sdk.openadsdk.jpo.jd.jpo jpoVar2 = this.f20351yd;
        if (jpoVar2 != null && jpoVar2.jd() != null) {
            com.bytedance.sdk.openadsdk.core.zz.nmd nmdVarJd = this.f20351yd.jd();
            if ((jdVar instanceof com.bytedance.sdk.openadsdk.core.zz.zz) && (jpoVar instanceof com.bytedance.sdk.openadsdk.core.zz.xyk)) {
                nmdVarJd.setClickListener((com.bytedance.sdk.openadsdk.core.zz.zz) jdVar);
                nmdVarJd.setClickCreativeListener((com.bytedance.sdk.openadsdk.core.zz.xyk) jpoVar);
            }
            nmdVarJd.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.my() { // from class: com.bytedance.sdk.openadsdk.core.hna.3
                @Override // com.bytedance.sdk.openadsdk.core.widget.my
                public void jpo() {
                    if (hna.this.f20350qk != null) {
                        hna.this.f20350qk.onAdClicked();
                    }
                }
            });
        }
        com.bytedance.sdk.openadsdk.jpo.jd.jpo jpoVar3 = this.f20351yd;
        if (jpoVar3 != null && jpoVar3.jpo() != null) {
            this.f20351yd.jpo().setOnClickListener(jpoVar);
            this.f20351yd.jpo().setOnTouchListener(jpoVar);
        }
        com.bytedance.sdk.openadsdk.jpo.jd.jpo jpoVar4 = this.f20351yd;
        if (jpoVar4 != null) {
            jpoVar4.jpo(jpoVar);
            this.f20351yd.jpo(jdVar);
        }
    }

    private void jpo(List<View> list, com.bytedance.sdk.openadsdk.core.wqx.wqx wqxVar) {
        if (com.bytedance.sdk.component.utils.au.jd(list)) {
            for (View view : list) {
                if (view != null) {
                    view.setOnClickListener(wqxVar);
                    view.setOnTouchListener(wqxVar);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wqx(ViewGroup viewGroup) {
        this.zz.jpo(System.currentTimeMillis(), nzb.jpo(viewGroup));
    }

    public void jpo(com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx wqxVar) {
        this.f20349ju = wqxVar;
        com.bytedance.sdk.openadsdk.core.wqx.jd jdVar = this.f20345au;
        if (jdVar != null) {
            jdVar.jpo(wqxVar);
        }
        com.bytedance.sdk.openadsdk.core.wqx.jpo jpoVar = this.oya;
        if (jpoVar != null) {
            jpoVar.jpo(wqxVar);
        }
    }

    private void jpo(ViewGroup viewGroup) {
        HashMap map = new HashMap();
        map.put("click_scence", 1);
        Context contextJpo = viewGroup != null ? com.bytedance.sdk.component.utils.jd.jpo(viewGroup) : null;
        if (contextJpo == null) {
            contextJpo = this.wqx;
        }
        if (this.jpo.cql() == 2) {
            com.bytedance.sdk.openadsdk.core.model.dt dtVar = this.jpo;
            String str = this.f20348jj;
            this.f20345au = new com.bytedance.sdk.openadsdk.core.zz.zz(contextJpo, dtVar, str, com.bytedance.sdk.openadsdk.utils.tic.jpo(str));
        } else {
            com.bytedance.sdk.openadsdk.core.model.dt dtVar2 = this.jpo;
            String str2 = this.f20348jj;
            this.f20345au = new com.bytedance.sdk.openadsdk.core.wqx.jd(contextJpo, dtVar2, str2, com.bytedance.sdk.openadsdk.utils.tic.jpo(str2));
        }
        this.f20345au.jpo(viewGroup);
        this.f20345au.jpo(this.f20349ju);
        this.f20345au.jpo(this.f20347jd);
        this.f20345au.jpo(this.f20346cm);
        this.f20345au.jpo(map);
        this.f20345au.jpo(new jd.jpo() { // from class: com.bytedance.sdk.openadsdk.core.hna.1
            @Override // com.bytedance.sdk.openadsdk.core.wqx.jd.jpo
            public void jpo(View view, int i10) {
                if (hna.this.f20350qk != null) {
                    hna.this.f20350qk.onAdClicked();
                }
            }
        });
        if (this.jpo.cql() == 2) {
            Context context = this.wqx;
            com.bytedance.sdk.openadsdk.core.model.dt dtVar3 = this.jpo;
            String str3 = this.f20348jj;
            this.oya = new com.bytedance.sdk.openadsdk.core.zz.xyk(context, dtVar3, str3, com.bytedance.sdk.openadsdk.utils.tic.jpo(str3));
        } else {
            Context context2 = this.wqx;
            com.bytedance.sdk.openadsdk.core.model.dt dtVar4 = this.jpo;
            String str4 = this.f20348jj;
            this.oya = new com.bytedance.sdk.openadsdk.core.wqx.jpo(context2, dtVar4, str4, com.bytedance.sdk.openadsdk.utils.tic.jpo(str4));
        }
        this.oya.jpo(viewGroup);
        this.oya.jpo(this.f20349ju);
        this.oya.jpo(this.f20347jd);
        this.oya.jpo(this.f20346cm);
        this.oya.jpo(map);
        this.oya.jpo(new jd.jpo() { // from class: com.bytedance.sdk.openadsdk.core.hna.2
            @Override // com.bytedance.sdk.openadsdk.core.wqx.jd.jpo
            public void jpo(View view, int i10) {
                if (hna.this.f20350qk != null) {
                    hna.this.f20350qk.onAdClicked();
                }
                com.bytedance.sdk.openadsdk.hmu.jd.my.jpo(hna.this.jpo, 9);
                hna.this.f20351yd.au();
            }
        });
    }

    private void jd(final ViewGroup viewGroup) {
        vrc.jpo(viewGroup, true, 5, false, new vrc.jd() { // from class: com.bytedance.sdk.openadsdk.core.hna.6
            @Override // com.bytedance.sdk.openadsdk.utils.vrc.jd
            public void jd() {
                hna.this.jd();
            }

            @Override // com.bytedance.sdk.openadsdk.utils.vrc.jd
            public void jpo(boolean z10) {
                hna.this.jpo(z10, viewGroup);
            }

            @Override // com.bytedance.sdk.openadsdk.utils.vrc.jd
            public void jpo() {
                hna.this.wqx(viewGroup);
            }

            @Override // com.bytedance.sdk.openadsdk.utils.vrc.jd
            public void jpo(View view, boolean z10) throws JSONException {
                if (!z10) {
                    com.bytedance.sdk.openadsdk.hmu.jpo.wqx.jpo(hna.this.jpo, 8);
                } else {
                    com.bytedance.sdk.openadsdk.hmu.jpo.wqx.jpo(hna.this.jpo, 4);
                    hna.this.jpo(viewGroup, view);
                }
            }
        }, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jd() {
        if (this.xyk > 0) {
            com.bytedance.sdk.openadsdk.cm.wqx.jpo(String.valueOf(SystemClock.elapsedRealtime() - this.xyk), this.jpo, this.f20348jj, this.zz);
            this.xyk = 0L;
        }
    }

    private void jpo(ViewGroup viewGroup, qk qkVar, List<View> list, List<View> list2) {
        com.bytedance.sdk.openadsdk.core.wqx.jd jdVar = this.f20345au;
        if (jdVar == null || this.oya == null) {
            return;
        }
        qkVar.jpo(list, jdVar);
        qkVar.jpo(list2, this.oya);
        jpo(this.f20345au, this.oya);
        jpo(qkVar, viewGroup);
    }

    private void jpo(ViewGroup viewGroup, List<View> list, List<View> list2) {
        com.bytedance.sdk.openadsdk.core.wqx.jd jdVar = this.f20345au;
        if (jdVar == null || this.oya == null) {
            return;
        }
        jpo(list, jdVar);
        jpo(list2, this.oya);
        jpo(this.f20345au, this.oya);
        jd(viewGroup);
    }

    private void jpo(com.bytedance.sdk.openadsdk.core.wqx.jd jdVar, com.bytedance.sdk.openadsdk.core.wqx.jpo jpoVar) {
        if (this.jpo.cql() == 2) {
            jd(jdVar, jpoVar);
        } else {
            jpo(jpoVar);
        }
    }

    private void jpo(com.bytedance.sdk.openadsdk.core.wqx.jpo jpoVar) {
        if (com.bytedance.sdk.openadsdk.core.settings.au.jrx().wqx(String.valueOf(this.jpo.jl()))) {
            com.bytedance.sdk.openadsdk.jpo.jd.jpo jpoVar2 = this.f20351yd;
            if (jpoVar2 != null && jpoVar2.jpo() != null) {
                this.f20351yd.jpo().setOnClickListener(jpoVar);
                this.f20351yd.jpo().setOnTouchListener(jpoVar);
            }
            com.bytedance.sdk.openadsdk.jpo.jd.jpo jpoVar3 = this.f20351yd;
            if (jpoVar3 != null) {
                jpoVar3.jpo(jpoVar);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.jpo.jd.jpo jpoVar4 = this.f20351yd;
        if (jpoVar4 != null && jpoVar4.jpo() != null) {
            PAGMediaView pAGMediaViewJpo = this.f20351yd.jpo();
            com.bytedance.sdk.openadsdk.core.wqx.wqx wqxVar = new com.bytedance.sdk.openadsdk.core.wqx.wqx() { // from class: com.bytedance.sdk.openadsdk.core.hna.4
                @Override // com.bytedance.sdk.openadsdk.core.wqx.wqx
                public void jpo(View view, float f10, float f11, float f12, float f13, SparseArray<wqx.jpo> sparseArray, boolean z10) {
                    if (view instanceof PAGVideoMediaView) {
                        ((PAGVideoMediaView) view).handleInterruptVideo();
                    }
                }
            };
            pAGMediaViewJpo.setOnClickListener(wqxVar);
            pAGMediaViewJpo.setOnTouchListener(wqxVar);
        }
        com.bytedance.sdk.openadsdk.jpo.jd.jpo jpoVar5 = this.f20351yd;
        if (jpoVar5 != null) {
            jpoVar5.jpo((com.bytedance.sdk.openadsdk.core.wqx.jpo) null);
        }
    }

    private void jpo(qk qkVar, final ViewGroup viewGroup) {
        qkVar.setCallback(new qk.jpo() { // from class: com.bytedance.sdk.openadsdk.core.hna.5
            @Override // com.bytedance.sdk.openadsdk.core.qk.jpo
            public void jd() {
                hna.this.jd();
            }

            @Override // com.bytedance.sdk.openadsdk.core.qk.jpo
            public void jpo(boolean z10) {
                hna.this.jpo(z10, viewGroup);
            }

            @Override // com.bytedance.sdk.openadsdk.core.qk.jpo
            public void jpo() {
                hna.this.wqx(viewGroup);
            }

            @Override // com.bytedance.sdk.openadsdk.core.qk.jpo
            public void jpo(View view) throws JSONException {
                hna.this.jpo(viewGroup, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(boolean z10, ViewGroup viewGroup) {
        if (z10 && this.jpo.mc() && !this.jpo.dt()) {
            this.jpo.jj(true);
            com.bytedance.sdk.openadsdk.core.model.dt dtVar = this.jpo;
            com.bytedance.sdk.openadsdk.cm.wqx.jpo(dtVar, this.f20348jj, dtVar.sj());
        }
        if (!z10 && this.xyk > 0) {
            String strValueOf = String.valueOf(SystemClock.elapsedRealtime() - this.xyk);
            this.zz.jpo(System.currentTimeMillis(), nzb.jpo(viewGroup));
            com.bytedance.sdk.openadsdk.cm.wqx.jpo(strValueOf, this.jpo, this.f20348jj, this.zz);
            this.xyk = 0L;
            return;
        }
        this.zz.jpo(System.currentTimeMillis(), nzb.jpo(viewGroup));
        this.xyk = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(ViewGroup viewGroup, View view) throws JSONException {
        com.bytedance.sdk.openadsdk.core.p000if.cm cmVarJpo;
        if (this.f118if.get()) {
            return;
        }
        this.f118if.set(true);
        if (this.f20346cm instanceof com.bytedance.sdk.openadsdk.jpo.jd.jpo.wqx) {
            com.bytedance.sdk.openadsdk.core.zz.nmd nmdVarJd = this.f20351yd.jd();
            if (nmdVarJd != null) {
                nmdVarJd.opi();
            }
            ((com.bytedance.sdk.openadsdk.jpo.jd.jpo.wqx) this.f20346cm).jpo(true);
        }
        this.zz.jpo(System.currentTimeMillis(), nzb.jpo(viewGroup));
        this.xyk = SystemClock.elapsedRealtime();
        cm(viewGroup);
        com.bytedance.sdk.openadsdk.jpo.jd.jj jjVar = this.f20350qk;
        if (jjVar != null) {
            jjVar.jpo(this.f20346cm);
        }
        if (this.jpo.vt()) {
            com.bytedance.sdk.openadsdk.utils.tic.jpo(this.jpo, view);
        }
        com.bytedance.sdk.openadsdk.core.model.cm cmVarKc = this.jpo.kc();
        if (cmVarKc == null || (cmVarJpo = cmVarKc.jpo()) == null) {
            return;
        }
        cmVarJpo.jpo(0L);
    }
}
