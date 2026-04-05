package com.bytedance.sdk.openadsdk.wqx;

import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.core.cm.qk;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.utils.duq;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class yd {

    /* renamed from: au, reason: collision with root package name */
    private String f21647au;
    private String hna;

    /* renamed from: if, reason: not valid java name */
    private String f169if;

    /* renamed from: jj, reason: collision with root package name */
    protected IListenerManager f21648jj;

    /* renamed from: jr, reason: collision with root package name */
    private int f21649jr;

    /* renamed from: ju, reason: collision with root package name */
    private String f21650ju;
    private FilterWord nmd;
    private int opi;
    private String oya;
    private JSONObject prr;

    /* renamed from: sq, reason: collision with root package name */
    private dt f21652sq;
    public static FilterWord jpo = new FilterWord("", "");

    /* renamed from: jd, reason: collision with root package name */
    public static int f21646jd = 1;
    public static int wqx = 2;

    /* renamed from: cm, reason: collision with root package name */
    public static int f21645cm = 3;
    public static int my = 4;

    /* renamed from: qk, reason: collision with root package name */
    private final Set<wqx> f21651qk = new HashSet();
    private final Set<jd> xyk = new HashSet();
    private final Set<cm> zz = new HashSet();

    /* renamed from: yd, reason: collision with root package name */
    private final Set<jpo> f21653yd = new HashSet();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface cm {
        void jpo(String str);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface jd {
        void jpo(int i10);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface jpo {
        void jpo(List<FilterWord> list);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface wqx {
        void jpo(FilterWord filterWord);
    }

    private void yd() {
        Iterator<wqx> it = this.f21651qk.iterator();
        while (it.hasNext()) {
            it.next().jpo(this.nmd);
        }
    }

    public void cm() {
        if (!wqx() && !TextUtils.isEmpty(this.oya)) {
            this.nmd = new FilterWord("0:00", this.oya);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.nmd);
        if (!TextUtils.isEmpty(this.f21650ju)) {
            if (TextUtils.isEmpty(this.oya)) {
                com.bytedance.sdk.openadsdk.wqx.jd.jpo().jpo(this.f21650ju, arrayList, this.f169if);
            } else {
                if (this.prr == null) {
                    dt dtVar = this.f21652sq;
                    if (dtVar != null) {
                        this.prr = dtVar.gum();
                    } else {
                        try {
                            this.prr = new JSONObject(this.hna);
                        } catch (Throwable th2) {
                            nmd.jpo("TTDislikeManager", "creative info to json exception", th2);
                        }
                    }
                }
                com.bytedance.sdk.openadsdk.wqx.jd.jpo().jpo(this.f21650ju, arrayList, this.prr, this.oya, this.f169if);
            }
        }
        if (!TextUtils.isEmpty(this.f21647au)) {
            if (com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
                cm("onItemClickClosed");
            } else {
                qk.jpo jpoVarMy = com.bytedance.sdk.openadsdk.core.zz.jd().my(this.f21647au);
                if (jpoVarMy != null) {
                    jpoVarMy.jpo();
                    com.bytedance.sdk.openadsdk.core.zz.jd().jj(this.f21647au);
                }
            }
        }
        Iterator<jd> it = this.xyk.iterator();
        while (it.hasNext()) {
            it.next().jpo(f21646jd);
        }
        jpo(jpo);
        wqx("");
    }

    public void jd(String str) {
        this.f169if = str;
    }

    public void jj() {
        Iterator<jd> it = this.xyk.iterator();
        while (it.hasNext()) {
            it.next().jpo(my);
        }
    }

    public void my() {
        Iterator<jd> it = this.xyk.iterator();
        while (it.hasNext()) {
            it.next().jpo(wqx);
        }
    }

    public String qk() {
        return this.oya;
    }

    public boolean wqx() {
        FilterWord filterWord = this.nmd;
        return (filterWord == null || filterWord.equals(jpo)) ? false : true;
    }

    public int xyk() {
        return this.opi;
    }

    public boolean zz() {
        return this.opi < this.f21649jr;
    }

    public FilterWord jd() {
        return this.nmd;
    }

    public void jpo() {
        this.f21651qk.clear();
        this.xyk.clear();
        this.zz.clear();
        this.f21653yd.clear();
    }

    public void wqx(String str) {
        this.oya = str;
        Iterator<cm> it = this.zz.iterator();
        while (it.hasNext()) {
            it.next().jpo(this.oya);
        }
    }

    public void jpo(String str) {
        this.f21650ju = str;
    }

    public void jpo(FilterWord filterWord) {
        this.nmd = filterWord;
        yd();
    }

    public void jpo(wqx wqxVar) {
        this.f21651qk.add(wqxVar);
    }

    public void jpo(jd jdVar) {
        this.xyk.add(jdVar);
    }

    public void jpo(cm cmVar) {
        this.zz.add(cmVar);
    }

    public void jpo(jpo jpoVar) {
        this.f21653yd.add(jpoVar);
    }

    public void jpo(List<FilterWord> list) {
        Iterator<jpo> it = this.f21653yd.iterator();
        while (it.hasNext()) {
            it.next().jpo(list);
        }
    }

    public IListenerManager jpo(int i10) {
        if (this.f21648jj == null) {
            this.f21648jj = IListenerManager.Stub.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.jpo.jpo().jpo(i10));
        }
        return this.f21648jj;
    }

    public static void jpo(final int i10, final String str, final qk.jpo jpoVar) {
        if (com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
            duq.wqx(new com.bytedance.sdk.component.xyk.xyk("DislikeClosed_registerMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.wqx.yd.2
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.jpo jpoVarJpo = com.bytedance.sdk.openadsdk.multipro.aidl.jpo.jpo();
                    if (i10 != 6 || jpoVar == null) {
                        return;
                    }
                    try {
                        com.bytedance.sdk.openadsdk.multipro.aidl.jd.jd jdVar = new com.bytedance.sdk.openadsdk.multipro.aidl.jd.jd(str, jpoVar);
                        IListenerManager iListenerManagerAsInterface = IListenerManager.Stub.asInterface(jpoVarJpo.jpo(6));
                        if (iListenerManagerAsInterface != null) {
                            iListenerManagerAsInterface.registerDisLikeClosedListener(str, jdVar);
                        }
                    } catch (RemoteException e10) {
                        nmd.wqx("TTDislikeManager", e10.getMessage());
                    }
                }
            }, 5);
        }
    }

    public static void jpo(final int i10, final String str) {
        if (com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
            duq.wqx(new com.bytedance.sdk.component.xyk.xyk("DislikeClosed_unregisterMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.wqx.yd.3
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.jpo jpoVarJpo = com.bytedance.sdk.openadsdk.multipro.aidl.jpo.jpo();
                    if (i10 == 6) {
                        try {
                            IListenerManager iListenerManagerAsInterface = IListenerManager.Stub.asInterface(jpoVarJpo.jpo(6));
                            if (iListenerManagerAsInterface != null) {
                                iListenerManagerAsInterface.unregisterDisLikeClosedListener(str);
                            }
                        } catch (RemoteException unused) {
                        }
                    }
                }
            }, 5);
        }
    }

    private void cm(final String str) {
        duq.wqx(new com.bytedance.sdk.component.xyk.xyk("Reward_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.wqx.yd.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (TextUtils.isEmpty(yd.this.f21647au)) {
                        return;
                    }
                    yd.this.jpo(6).executeDisLikeClosedCallback(yd.this.f21647au, str);
                } catch (Throwable th2) {
                    nmd.jpo("TTDislikeManager", "executeRewardVideoCallback execute throw Exception : ", th2);
                }
            }
        }, 5);
    }

    public void jpo(String str, dt dtVar) {
        this.hna = str;
        this.f21652sq = dtVar;
    }

    public void jpo(int i10, int i11) {
        this.opi = i10;
        this.f21649jr = i11;
    }
}
