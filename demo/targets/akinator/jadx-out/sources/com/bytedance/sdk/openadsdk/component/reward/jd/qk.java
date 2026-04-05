package com.bytedance.sdk.openadsdk.component.reward.jd;

import android.app.Activity;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.openadsdk.component.reward.view.zz;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.opi;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.utils.hna;
import com.bytedance.sdk.openadsdk.utils.tic;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class qk extends jd {
    private ViewGroup hna;
    private String opi;
    private final int prr;

    /* renamed from: sq, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.component.reward.view.qk f19847sq;

    public qk(com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar) {
        super(jpoVar);
        this.opi = "fullscreen_interstitial_ad";
        this.prr = this.f19843jd.iqh();
    }

    private void jd(dt dtVar) {
        if (dtVar == null || this.f19847sq == null) {
            return;
        }
        sz();
        jpo((ImageView) this.f19847sq);
    }

    private void jpo(ImageView imageView) {
        List<opi> listFri;
        opi opiVar;
        dt dtVar = this.f19843jd;
        if (dtVar == null || (listFri = dtVar.fri()) == null || listFri.size() <= 0 || (opiVar = listFri.get(0)) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.zz.cm.jpo(listFri.get(0)).wqx(1).jpo(com.bytedance.sdk.openadsdk.zz.wqx.jpo(this.f19843jd, opiVar.jpo(), imageView));
    }

    private boolean kln() {
        dt dtVar = this.f19843jd;
        return dtVar != null && dtVar.cql() == 2;
    }

    private void rv() {
        FrameLayout frameLayout = new FrameLayout(this.jpo.vrc);
        this.hna = frameLayout;
        frameLayout.setId(hna.cmw);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.hna.setLayoutParams(layoutParams);
        View viewJu = this.jpo.tic.ju();
        if (viewJu != null) {
            layoutParams.bottomMargin = viewJu.getHeight();
        }
        com.bytedance.sdk.openadsdk.component.reward.view.qk qkVar = new com.bytedance.sdk.openadsdk.component.reward.view.qk(this.jpo.vrc);
        this.f19847sq = qkVar;
        qkVar.setId(hna.f21566zw);
        FrameLayout.LayoutParams layoutParams2 = this.jpo.f19914jd.ll() == 1 ? new FrameLayout.LayoutParams(-1, -2) : new FrameLayout.LayoutParams(-2, -1);
        layoutParams2.gravity = 17;
        this.f19847sq.setLayoutParams(layoutParams2);
        this.hna.addView(this.f19847sq);
        uu();
    }

    private void sz() {
        opi opiVar;
        List<opi> listFri = this.f19843jd.fri();
        if (listFri == null || listFri.size() <= 0 || (opiVar = listFri.get(0)) == null) {
            return;
        }
        try {
            int iJd = opiVar.jd();
            int iWqx = opiVar.wqx();
            if (iJd != 0 && iWqx != 0) {
                this.f19847sq.setRatio(iJd / iWqx);
                return;
            }
            int i10 = this.prr;
            if (i10 == 33) {
                this.f19847sq.setRatio(1.0f);
            } else if (i10 == 3) {
                this.f19847sq.setRatio(1.91f);
            } else {
                this.f19847sq.setRatio(0.56f);
            }
        } catch (Exception e10) {
            nmd.wqx("TTAD.RFTI", e10.getMessage());
        }
    }

    private void uu() {
        if (this.hna == null) {
            return;
        }
        jpo((View) this.f19847sq);
    }

    private com.bytedance.sdk.openadsdk.jr.jpo.jpo.jj wqx(dt dtVar) {
        if (dtVar.pzk() == 4) {
            return new com.bytedance.sdk.openadsdk.jr.jpo.jpo.cm(sq.jpo(), this.opi);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.jd.jd
    public boolean jj() {
        return kln();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.jd.jd
    public boolean my() {
        return kln();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.jd.jd
    public void qk() {
        if (com.bytedance.sdk.openadsdk.core.model.nmd.jd(this.f19843jd)) {
            this.f19844jj.jd(8);
        }
        this.xyk.wqx(false);
        this.xyk.cm(false);
        if (this.f19843jd.cql() == 2) {
            this.xyk.jpo(false);
            this.f19844jj.jj(8);
            return;
        }
        this.xyk.jpo(this.f19843jd.bl());
        if (this.jpo.voc) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 900;
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.jpo;
            int iDuq = (int) (jpoVar.hmu.duq() * 1000.0d);
            jpoVar.zz = iDuq;
            messageObtain.arg1 = iDuq;
            this.jpo.xk.sendMessage(messageObtain);
        }
    }

    public void jpo(View view) {
        if (view == null || this.jpo.vrc == null || this.f19843jd == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.wqx.jd jpoVar = this.f104if;
        if (jpoVar == null) {
            Activity activity = this.jpo.vrc;
            dt dtVar = this.f19843jd;
            String str = this.opi;
            jpoVar = new com.bytedance.sdk.openadsdk.core.wqx.jpo(activity, dtVar, str, tic.jpo(str));
            jpoVar.jpo(wqx(this.f19843jd));
            HashMap map = new HashMap();
            map.put("click_scence", 1);
            jpoVar.jpo(map);
        }
        Activity activity2 = this.jpo.vrc;
        if (activity2 != null) {
            jpoVar.jpo(activity2);
        }
        view.setOnTouchListener(jpoVar);
        view.setOnClickListener(jpoVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.jd.jd
    public void jpo(FrameLayout frameLayout) {
        try {
            rv();
            jd(this.f19843jd);
            frameLayout.addView(this.hna);
        } catch (Exception e10) {
            Log.e("TTAD.RFTI", "bindAd: ", e10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.jd.jd
    public void jpo(zz zzVar) {
        if (com.bytedance.sdk.openadsdk.core.model.nmd.jd(this.f19843jd)) {
            cm.jpo(zzVar, this.f19843jd);
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.jpo;
            jpoVar.aix.jpo((long) (jpoVar.hmu.duq() * 1000.0d));
        } else {
            if (!com.bytedance.sdk.openadsdk.core.model.nmd.cm(this.f19843jd) && !com.bytedance.sdk.openadsdk.core.model.nmd.qk(this.f19843jd)) {
                super.jpo(zzVar);
                return;
            }
            cm.jd(zzVar, this.f19843jd);
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar2 = this.jpo;
            if (jpoVar2.f19927tl) {
                return;
            }
            jpoVar2.aix.jpo((long) (jpoVar2.hmu.duq() * 1000.0d));
        }
    }

    public static boolean jpo(dt dtVar) {
        return !dt.my(dtVar) && dtVar.sy() == 100.0f;
    }
}
