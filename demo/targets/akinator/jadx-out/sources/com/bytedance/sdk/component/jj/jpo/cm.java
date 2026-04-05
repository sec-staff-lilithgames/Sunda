package com.bytedance.sdk.component.jj.jpo;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.rq;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm {
    public static final cm jpo = new cm();

    private boolean wqx() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }

    private void jd(jpo jpoVar, Context context) {
        wqx.jpo(context, "context == null");
        wqx.jpo(jpoVar, "AdLogConfig == null");
        wqx.jpo(jpoVar.cm(), "AdLogDepend ==null");
    }

    public void jd() {
        final my myVarHna = xyk.qk().hna();
        if (myVarHna == null || xyk.qk().jj() == null || myVarHna.cm() == null) {
            return;
        }
        if (xyk.qk().jd()) {
            if (jpo(xyk.qk().jj(), myVarHna)) {
                xyk.qk().ju();
                return;
            } else if (wqx()) {
                myVarHna.cm().execute(new com.bytedance.sdk.component.jj.jpo.my.my("stop") { // from class: com.bytedance.sdk.component.jj.jpo.cm.3
                    @Override // java.lang.Runnable
                    public void run() {
                        cm.this.jd(myVarHna.jj());
                    }
                });
                return;
            } else {
                jd(myVarHna.jj());
                return;
            }
        }
        xyk.qk().ju();
    }

    public void jpo(jpo jpoVar, Context context) {
        jd(jpoVar, context);
        xyk.qk().jpo(context);
        xyk.qk().jpo(jpoVar.yd());
        xyk.qk().jd(jpoVar.qk());
        xyk.qk().wqx(jpoVar.xyk());
        xyk.qk().jpo(jpoVar.jd());
        xyk.qk().cm(jpoVar.zz());
        xyk.qk().my(jpoVar.jj());
        xyk.qk().jpo(jpoVar.jpo() == null ? com.bytedance.sdk.component.jj.jpo.jpo.jpo.my.jpo : jpoVar.jpo());
        xyk.qk().jd(jpoVar.ju());
        xyk.qk().jpo(jpoVar.cm());
        xyk.qk().jpo(jpoVar.wqx());
        xyk.qk().jpo(jpoVar.my());
        com.bytedance.sdk.component.jj.jpo.jd.wqx.wqx.jpo(jpoVar.au());
        com.bytedance.sdk.component.jj.jpo.jd.wqx.wqx.jd(jpoVar.m415if());
        jpo(jpoVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jd(int i10) {
        if (i10 == 0) {
            com.bytedance.sdk.component.jj.jpo.jd.jd.jpo.jd();
        } else if (i10 == 1) {
            com.bytedance.sdk.component.jj.jpo.jd.jd.jd.jd();
        }
    }

    private void jd(final com.bytedance.sdk.component.jj.jpo.cm.jpo jpoVar) {
        final my myVarHna = xyk.qk().hna();
        if (jpoVar == null || myVarHna == null || xyk.qk().jj() == null || myVarHna.cm() == null) {
            return;
        }
        if (xyk.qk().jd()) {
            if (jpo(xyk.qk().jj(), myVarHna)) {
                xyk.qk().jpo(jpoVar);
                return;
            }
            wqx();
            if (wqx()) {
                myVarHna.cm().execute(new com.bytedance.sdk.component.jj.jpo.my.my("dispatchEvent") { // from class: com.bytedance.sdk.component.jj.jpo.cm.4
                    @Override // java.lang.Runnable
                    public void run() {
                        cm.this.jpo(jpoVar, myVarHna.jj());
                    }
                });
                return;
            } else {
                jpo(jpoVar, myVarHna.jj());
                return;
            }
        }
        xyk.qk().jpo(jpoVar);
    }

    private void jpo(jpo jpoVar) {
        Executor executorMy;
        if (Looper.myLooper() != Looper.getMainLooper() && com.bytedance.sdk.component.jj.jpo.wqx.jpo.jd()) {
            com.bytedance.sdk.component.jj.jpo.wqx.jpo.jpo();
            return;
        }
        my myVarCm = jpoVar.cm();
        if (myVarCm == null || !com.bytedance.sdk.component.jj.jpo.wqx.jpo.jd() || (executorMy = myVarCm.my()) == null) {
            return;
        }
        executorMy.execute(new Runnable() { // from class: com.bytedance.sdk.component.jj.jpo.cm.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.component.jj.jpo.wqx.jpo.jpo();
            }
        });
    }

    public void jpo(boolean z10) {
        xyk.qk().jpo(z10);
    }

    private boolean jpo(Context context, my myVar) {
        if (context == null || myVar == null) {
            return false;
        }
        if (myVar.jj() == 2) {
            return true;
        }
        if (myVar.jj() == 1) {
            return myVar.oya();
        }
        try {
            return rq.jpo(context);
        } catch (Throwable th2) {
            th2.getMessage();
            return true;
        }
    }

    public void jpo() {
        final my myVarHna = xyk.qk().hna();
        if (myVarHna == null || xyk.qk().jj() == null || myVarHna.cm() == null) {
            return;
        }
        if (xyk.qk().jd()) {
            if (jpo(xyk.qk().jj(), myVarHna)) {
                xyk.qk().zz();
                return;
            } else if (wqx()) {
                myVarHna.cm().execute(new com.bytedance.sdk.component.jj.jpo.my.my("start") { // from class: com.bytedance.sdk.component.jj.jpo.cm.2
                    @Override // java.lang.Runnable
                    public void run() {
                        cm.this.jpo(myVarHna.jj());
                    }
                });
                return;
            } else {
                jpo(myVarHna.jj());
                return;
            }
        }
        xyk.qk().zz();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(int i10) {
        if (i10 == 0) {
            com.bytedance.sdk.component.jj.jpo.jd.jd.jpo.jpo();
        } else if (i10 == 1) {
            com.bytedance.sdk.component.jj.jpo.jd.jd.jd.jpo();
        }
    }

    public void jpo(com.bytedance.sdk.component.jj.jpo.cm.jpo jpoVar) {
        jd(jpoVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(com.bytedance.sdk.component.jj.jpo.cm.jpo jpoVar, int i10) {
        if (i10 == 0) {
            com.bytedance.sdk.component.jj.jpo.jd.jd.jpo.jpo(jpoVar);
        } else if (i10 == 1) {
            com.bytedance.sdk.component.jj.jpo.jd.jd.jd.jpo(jpoVar);
        }
    }

    public void jpo(final String str, final List<String> list, final boolean z10, Map<String, String> map, final int i10, final String str2) {
        final my myVarHna = xyk.qk().hna();
        if (myVarHna == null || xyk.qk().jj() == null || myVarHna.cm() == null || !myVarHna.xyk()) {
            return;
        }
        if (myVarHna.jj() == 1) {
            if (list == null || list.isEmpty()) {
                return;
            }
        } else if (myVarHna.jj() == 0 && (TextUtils.isEmpty(str) || list == null || list.isEmpty())) {
            return;
        }
        if (xyk.qk().jd() && !jpo(xyk.qk().jj(), myVarHna)) {
            if (wqx()) {
                myVarHna.cm().execute(new com.bytedance.sdk.component.jj.jpo.my.my("trackFailed") { // from class: com.bytedance.sdk.component.jj.jpo.cm.5
                    @Override // java.lang.Runnable
                    public void run() {
                        cm.this.jpo(str, (List<String>) list, z10, myVarHna.jj(), i10, str2);
                    }
                });
                return;
            } else {
                jpo(str, list, z10, myVarHna.jj(), i10, str2);
                return;
            }
        }
        xyk.qk().jpo(str, list, z10, map, i10, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(String str, List<String> list, boolean z10, int i10, int i11, String str2) {
        if (i10 == 0) {
            com.bytedance.sdk.component.jj.jpo.jd.jd.jpo.jpo(str, list, z10);
        } else if (i10 == 1) {
            com.bytedance.sdk.component.jj.jpo.jd.jd.jd.jpo(str, list, z10, i11, str2);
        }
    }

    public void jpo(final String str, final boolean z10) {
        final my myVarHna = xyk.qk().hna();
        if (myVarHna == null || xyk.qk().jj() == null || myVarHna.cm() == null || !myVarHna.xyk() || (myVarHna.jj() == 0 && TextUtils.isEmpty(str))) {
            return;
        }
        if (xyk.qk().jd() && !jpo(xyk.qk().jj(), myVarHna)) {
            if (wqx()) {
                myVarHna.cm().execute(new com.bytedance.sdk.component.jj.jpo.my.my("trackFailed") { // from class: com.bytedance.sdk.component.jj.jpo.cm.6
                    @Override // java.lang.Runnable
                    public void run() {
                        cm.this.jpo(str, myVarHna.jj(), z10);
                    }
                });
                return;
            } else {
                jpo(str, myVarHna.jj(), z10);
                return;
            }
        }
        xyk.qk().jpo(str, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(String str, int i10, boolean z10) {
        if (i10 == 0) {
            com.bytedance.sdk.component.jj.jpo.jd.jd.jpo.jpo(str);
        } else if (i10 == 1) {
            com.bytedance.sdk.component.jj.jpo.jd.jd.jd.jpo(str, z10);
        }
    }
}
