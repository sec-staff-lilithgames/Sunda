package com.bytedance.sdk.openadsdk.core.zz;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.core.au.jd.jj;
import com.bytedance.sdk.openadsdk.core.rv;
import com.bytedance.sdk.openadsdk.utils.tic;
import com.bytedance.sdk.openadsdk.utils.va;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class jpo extends com.bytedance.sdk.openadsdk.core.jj.wqx {

    /* renamed from: cm, reason: collision with root package name */
    protected com.bytedance.sdk.openadsdk.wqx.wqx f21071cm;

    /* renamed from: if, reason: not valid java name */
    protected String f148if;

    /* renamed from: jd, reason: collision with root package name */
    protected Context f21072jd;

    /* renamed from: jj, reason: collision with root package name */
    protected String f21073jj;
    private com.bytedance.sdk.openadsdk.cm.qk jpo;

    /* renamed from: ju, reason: collision with root package name */
    protected boolean f21074ju;
    protected TTDislikeDialogAbstract my;

    /* renamed from: qk, reason: collision with root package name */
    protected int f21075qk;
    protected com.bytedance.sdk.openadsdk.core.model.dt wqx;
    protected int xyk;

    /* renamed from: yd, reason: collision with root package name */
    protected boolean f21076yd;
    protected int zz;

    public jpo(Context context) {
        super(context);
        this.f21073jj = "embeded_ad";
        this.f21076yd = true;
        this.f21074ju = true;
        setTag("tt_express_backup_fl_tag_26");
    }

    public String getDescription() {
        return !TextUtils.isEmpty(this.wqx.ozw()) ? this.wqx.ozw() : !TextUtils.isEmpty(this.wqx.xp()) ? this.wqx.xp() : "";
    }

    public String getNameOrSource() {
        com.bytedance.sdk.openadsdk.core.model.dt dtVar = this.wqx;
        return dtVar == null ? "" : (dtVar.xur() == null || TextUtils.isEmpty(this.wqx.xur().jd())) ? !TextUtils.isEmpty(this.wqx.as()) ? this.wqx.as() : "" : this.wqx.xur().jd();
    }

    public float getRealHeight() {
        return va.wqx(this.f21072jd, this.xyk);
    }

    public float getRealWidth() {
        return va.wqx(this.f21072jd, this.f21075qk);
    }

    @Override // android.view.View
    public Object getTag() {
        return "tt_express_backup_fl_tag_26";
    }

    public String getTitle() {
        return (this.wqx.xur() == null || TextUtils.isEmpty(this.wqx.xur().jd())) ? !TextUtils.isEmpty(this.wqx.as()) ? this.wqx.as() : !TextUtils.isEmpty(this.wqx.ozw()) ? this.wqx.ozw() : "" : this.wqx.xur().jd();
    }

    public com.bytedance.sdk.openadsdk.core.au.jd.jj getVideoView() {
        com.bytedance.sdk.openadsdk.core.au.jd.jj jjVar;
        com.bytedance.sdk.openadsdk.core.model.dt dtVar = this.wqx;
        if (dtVar != null && this.f21072jd != null) {
            if (com.bytedance.sdk.openadsdk.core.model.dt.my(dtVar)) {
                try {
                    jjVar = new com.bytedance.sdk.openadsdk.core.au.jd.jj(this.f21072jd, this.wqx, this.f21073jj, true, false, this.jpo);
                    jjVar.setVideoCacheUrl(this.f148if);
                    jjVar.setControllerStatusCallBack(new jj.jd() { // from class: com.bytedance.sdk.openadsdk.core.zz.jpo.2
                        @Override // com.bytedance.sdk.openadsdk.core.au.jd.jj.jd
                        public void jpo(boolean z10, long j10, long j11, long j12, boolean z11) {
                        }
                    });
                    jjVar.setIsAutoPlay(this.f21076yd);
                    jjVar.jpo(this.f21074ju, "bannerGetVideoView");
                } catch (Throwable unused) {
                }
                if (!com.bytedance.sdk.openadsdk.core.model.dt.my(this.wqx) && jjVar != null && jjVar.jpo(0L, true, false)) {
                    return jjVar;
                }
            } else {
                jjVar = null;
                if (!com.bytedance.sdk.openadsdk.core.model.dt.my(this.wqx)) {
                }
            }
        }
        return null;
    }

    public void jpo() {
        TTDislikeDialogAbstract tTDislikeDialogAbstract = this.my;
        if (tTDislikeDialogAbstract != null) {
            tTDislikeDialogAbstract.show();
            return;
        }
        com.bytedance.sdk.openadsdk.wqx.wqx wqxVar = this.f21071cm;
        if (wqxVar != null) {
            wqxVar.jpo();
        } else {
            TTDelegateActivity.jpo(this.wqx, (String) null);
        }
    }

    public abstract void jpo(View view, int i10, com.bytedance.sdk.openadsdk.core.model.hna hnaVar);

    public void setDislikeInner(rv rvVar) {
        if (rvVar instanceof com.bytedance.sdk.openadsdk.wqx.wqx) {
            this.f21071cm = (com.bytedance.sdk.openadsdk.wqx.wqx) rvVar;
        }
    }

    public void setDislikeOuter(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        com.bytedance.sdk.openadsdk.core.model.dt dtVar;
        if (tTDislikeDialogAbstract != null && (dtVar = this.wqx) != null) {
            tTDislikeDialogAbstract.setMaterialMeta(dtVar.fxd(), this.wqx.pve());
        }
        this.my = tTDislikeDialogAbstract;
    }

    @Override // android.view.View
    public void setTag(Object obj) {
        super.setTag("tt_express_backup_fl_tag_26");
    }

    public jpo(Context context, String str) {
        super(context);
        this.f21073jj = "embeded_ad";
        this.f21076yd = true;
        this.f21074ju = true;
        this.f148if = str;
        setTag("tt_express_backup_fl_tag_26");
    }

    public void jpo(View view, boolean z10) {
        com.bytedance.sdk.openadsdk.core.wqx.jd jdVar;
        if (view == null) {
            return;
        }
        if (z10) {
            Context context = this.f21072jd;
            com.bytedance.sdk.openadsdk.core.model.dt dtVar = this.wqx;
            String str = this.f21073jj;
            jdVar = new com.bytedance.sdk.openadsdk.core.wqx.jpo(context, dtVar, str, tic.jpo(str));
        } else {
            Context context2 = this.f21072jd;
            com.bytedance.sdk.openadsdk.core.model.dt dtVar2 = this.wqx;
            String str2 = this.f21073jj;
            jdVar = new com.bytedance.sdk.openadsdk.core.wqx.jd(context2, dtVar2, str2, tic.jpo(str2));
        }
        view.setOnTouchListener(jdVar);
        view.setOnClickListener(jdVar);
        jdVar.jpo(new jd() { // from class: com.bytedance.sdk.openadsdk.core.zz.jpo.1
            @Override // com.bytedance.sdk.openadsdk.core.zz.jd
            public void jpo(View view2, int i10, com.bytedance.sdk.openadsdk.core.model.hna hnaVar) {
                jpo.this.jpo(view2, i10, hnaVar);
            }
        });
    }

    public void jpo(int i10) {
        this.f21074ju = com.bytedance.sdk.openadsdk.core.sq.cm().jd(String.valueOf(this.zz));
        int iJd = com.bytedance.sdk.openadsdk.core.sq.cm().jd(i10);
        if (3 == iJd) {
            this.f21076yd = false;
            return;
        }
        int iWqx = com.bytedance.sdk.component.utils.opi.wqx(com.bytedance.sdk.openadsdk.core.sq.jpo());
        if (1 != iJd || !tic.cm(iWqx)) {
            if (2 == iJd) {
                if (tic.my(iWqx) || tic.cm(iWqx) || tic.jj(iWqx)) {
                    this.f21076yd = true;
                    return;
                }
                return;
            }
            if (5 != iJd) {
                return;
            }
            if (!tic.cm(iWqx) && !tic.jj(iWqx)) {
                return;
            }
        }
        this.f21076yd = true;
    }

    public void jpo(View view) {
        com.bytedance.sdk.openadsdk.core.model.dt dtVar = this.wqx;
        if (dtVar == null || dtVar.ww() == null || view == null) {
            return;
        }
        jpo(view, this.wqx.aix() == 1 && this.f21076yd);
    }
}
