package com.bytedance.sdk.openadsdk.component;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import com.bytedance.sdk.component.utils.jd;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.component.xyk.xyk;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.oya;
import com.bytedance.sdk.openadsdk.core.pdm;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.duq;
import com.bytedance.sdk.openadsdk.utils.nq;
import com.bytedance.sdk.openadsdk.utils.uu;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm extends PAGAppOpenAd {

    /* renamed from: cm, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.jpo.cm.jd f19756cm;

    /* renamed from: jd, reason: collision with root package name */
    private final dt f19757jd;
    private final Context jpo;

    /* renamed from: qk, reason: collision with root package name */
    private final boolean f19759qk;
    private final AdSlot wqx;
    private boolean xyk;
    private boolean zz;
    private final AtomicBoolean my = new AtomicBoolean(false);

    /* renamed from: jj, reason: collision with root package name */
    private final String f19758jj = nq.jpo();

    public cm(Context context, dt dtVar, boolean z10, AdSlot adSlot) {
        this.jpo = context;
        this.f19757jd = dtVar;
        this.f19759qk = z10;
        this.wqx = adSlot;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        dt dtVar = this.f19757jd;
        if (dtVar == null || dtVar.gy() == null) {
            return null;
        }
        try {
            return this.f19757jd.gy().get(str);
        } catch (Throwable th2) {
            nmd.wqx("TTAppOpenAdImpl", th2.getMessage());
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        dt dtVar = this.f19757jd;
        if (dtVar != null) {
            return dtVar.gy();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d10, String str, String str2) {
        if (this.zz) {
            return;
        }
        uu.jpo(this.f19757jd, d10, str, str2);
        this.zz = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd
    public void setAdInteractionCallback(PAGAppOpenAdInteractionCallback pAGAppOpenAdInteractionCallback) {
        this.f19756cm = new my(pAGAppOpenAdInteractionCallback);
        jpo();
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd
    public void setAdInteractionListener(PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener) {
        this.f19756cm = new my(pAGAppOpenAdInteractionListener);
        jpo();
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd
    public void show(Activity activity) {
        int rotation;
        if (activity != null && activity.isFinishing()) {
            activity = null;
        }
        if (this.my.getAndSet(true)) {
            return;
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("Cannot be called in a child thread ---- TTAppOpenAdImpl.showAppOpenAd");
        }
        IPMiBroadcastReceiver.jpo(this.jpo, this.f19757jd);
        Context contextJpo = activity != null ? activity : this.jpo;
        if (contextJpo == null) {
            contextJpo = sq.jpo();
        }
        try {
            rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        } catch (Exception unused) {
            rotation = 0;
        }
        Intent intent = new Intent(contextJpo, (Class<?>) TTAppOpenAdActivity.class);
        intent.putExtra("orientation_angle", rotation);
        intent.putExtra("ad_source", this.f19759qk ? 1 : 2);
        if (com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
            intent.putExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA, this.f19757jd.gum().toString());
            intent.putExtra(TTAdConstant.MULTI_PROCESS_META_MD5, this.f19758jj);
        } else {
            pdm.jpo().my();
            intent.putExtra("meta_index", pdm.jpo().jpo(this.f19757jd));
            pdm.jpo().jpo(this.f19756cm);
            this.f19756cm = null;
        }
        intent.putExtra("start_show_time", SystemClock.elapsedRealtime());
        com.bytedance.sdk.component.utils.jd.jpo(contextJpo, intent, new jd.InterfaceC0092jd() { // from class: com.bytedance.sdk.openadsdk.component.cm.2
            @Override // com.bytedance.sdk.component.utils.jd.InterfaceC0092jd
            public void jpo() {
            }

            @Override // com.bytedance.sdk.component.utils.jd.InterfaceC0092jd
            public void jpo(Throwable th2) {
            }
        });
        oya.jd().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.cm.3
            @Override // java.lang.Runnable
            public void run() {
                if (cm.this.wqx != null) {
                    try {
                        if (cm.this.f19757jd == null || dt.qk(cm.this.f19757jd) || cm.this.f19757jd.rf()) {
                            return;
                        }
                        jj jjVarJpo = jj.jpo(cm.this.jpo);
                        jjVarJpo.jj(Integer.parseInt(cm.this.wqx.getCodeId()));
                        jjVarJpo.jpo(cm.this.wqx);
                    } catch (Throwable unused2) {
                    }
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d10) {
        if (this.xyk) {
            return;
        }
        uu.jpo(this.f19757jd, d10);
        this.xyk = true;
    }

    private void jpo() {
        if (com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
            duq.wqx(new xyk("AppOpenAd_registerMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.component.cm.1
                @Override // java.lang.Runnable
                public void run() {
                    IListenerManager iListenerManagerAsInterface;
                    com.bytedance.sdk.openadsdk.multipro.aidl.jpo jpoVarJpo = com.bytedance.sdk.openadsdk.multipro.aidl.jpo.jpo();
                    if (cm.this.f19756cm == null || (iListenerManagerAsInterface = IListenerManager.Stub.asInterface(jpoVarJpo.jpo(7))) == null) {
                        return;
                    }
                    try {
                        iListenerManagerAsInterface.registerAppOpenAdListener(cm.this.f19758jj, new com.bytedance.sdk.openadsdk.multipro.aidl.jd.jpo(cm.this.f19756cm));
                        cm.this.f19756cm = null;
                    } catch (RemoteException e10) {
                        nmd.wqx("TTAppOpenAdImpl", e10.getMessage());
                    }
                }
            }, 5);
        }
    }
}
