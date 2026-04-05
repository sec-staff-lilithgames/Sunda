package com.bytedance.sdk.component.adexpress.my;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.jpo.nmd;
import com.bytedance.sdk.component.zz.jj;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class my {

    /* renamed from: jj, reason: collision with root package name */
    private static int f18550jj = 10;
    private static final byte[] my = new byte[0];
    private static int xyk = 10;
    private static volatile my zz;

    /* renamed from: qk, reason: collision with root package name */
    private final AtomicBoolean f18553qk = new AtomicBoolean(false);
    private List<jj> jpo = new ArrayList();

    /* renamed from: jd, reason: collision with root package name */
    private List<jj> f18552jd = new ArrayList();
    private Map<Integer, wqx> wqx = new HashMap();

    /* renamed from: cm, reason: collision with root package name */
    private Map<Integer, cm> f18551cm = new HashMap();

    private my() {
        com.bytedance.sdk.component.adexpress.jpo.jpo.wqx wqxVarWqx = com.bytedance.sdk.component.adexpress.jpo.jpo.jpo.jpo().wqx();
        if (wqxVarWqx != null) {
            f18550jj = wqxVarWqx.yd();
            xyk = wqxVarWqx.ju();
        }
    }

    public static my jpo() {
        if (zz == null) {
            synchronized (my.class) {
                try {
                    if (zz == null) {
                        zz = new my();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return zz;
    }

    private void qk(jj jjVar) {
        try {
            jjVar.removeAllViews();
            jjVar.qk();
            jjVar.setWebChromeClient(null);
            jjVar.setWebViewClient(null);
            jjVar.setDownloadListener(null);
            jjVar.setJavaScriptEnabled(true);
            jjVar.setCacheMode(-1);
            jjVar.setSupportZoom(false);
            jjVar.setUseWideViewPort(true);
            jjVar.setJavaScriptCanOpenWindowsAutomatically(true);
            jjVar.setDomStorageEnabled(true);
            jjVar.setBuiltInZoomControls(false);
            jjVar.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
            jjVar.setLoadWithOverviewMode(false);
            jjVar.setDefaultTextEncodingName(C.UTF8_NAME);
            jjVar.setDefaultFontSize(16);
        } catch (Throwable unused) {
        }
    }

    public void cm(jj jjVar) {
        if (jjVar == null) {
            return;
        }
        if (this.jpo.size() >= f18550jj) {
            try {
                Context context = jjVar.getContext();
                if (context instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                }
                jjVar.hna();
                return;
            } catch (Throwable th2) {
                th2.getMessage();
                return;
            }
        }
        if (this.jpo.contains(jjVar)) {
            return;
        }
        try {
            Context context2 = jjVar.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                jjVar.setRecycler(true);
                this.jpo.add(jjVar);
                wqx();
            }
        } catch (Throwable th3) {
            wqx();
            th3.getMessage();
        }
    }

    public void jd(jj jjVar) {
        if (jjVar == null) {
            return;
        }
        qk(jjVar);
        jjVar.b_("SDK_INJECT_GLOBAL");
        jj(jjVar);
        jpo(jjVar);
    }

    public void jj(jj jjVar) {
        if (jjVar == null) {
            return;
        }
        wqx wqxVar = this.wqx.get(Integer.valueOf(jjVar.hashCode()));
        if (wqxVar != null) {
            wqxVar.jpo(null);
        }
        jjVar.b_("SDK_INJECT_GLOBAL");
    }

    public boolean my(jj jjVar) {
        if (jjVar == null) {
            return false;
        }
        try {
            Context context = jjVar.getContext();
            if (context instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
            }
            jjVar.hna();
            return true;
        } catch (Throwable th2) {
            th2.getMessage();
            return true;
        }
    }

    public void wqx(jj jjVar) {
        if (jjVar == null) {
            return;
        }
        qk(jjVar);
        jjVar.b_("SDK_INJECT_GLOBAL");
        jj(jjVar);
        cm(jjVar);
    }

    public jj jd(Context context, String str) {
        if (wqx() <= 0) {
            return null;
        }
        if (com.bytedance.sdk.component.adexpress.cm.my.jpo(str) && wqx() <= 1) {
            wqx();
            return null;
        }
        jj jjVarRemove = this.jpo.remove(0);
        if (jjVarRemove == null) {
            return null;
        }
        try {
            Context context2 = jjVarRemove.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context.getApplicationContext());
                jjVarRemove.setRecycler(false);
                wqx();
            }
            return jjVarRemove;
        } catch (Throwable unused) {
            wqx();
            return null;
        }
    }

    public int wqx() {
        return this.jpo.size();
    }

    public jj jpo(Context context, String str) {
        if (cm() <= 0) {
            return null;
        }
        if (com.bytedance.sdk.component.adexpress.cm.my.jpo(str) && cm() <= 1) {
            cm();
            return null;
        }
        jj jjVarRemove = this.f18552jd.remove(0);
        if (jjVarRemove == null) {
            return null;
        }
        try {
            Context context2 = jjVarRemove.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context.getApplicationContext());
                jjVarRemove.setRecycler(false);
                cm();
            }
            return jjVarRemove;
        } catch (Throwable unused) {
            cm();
            return null;
        }
    }

    public int cm() {
        return this.f18552jd.size();
    }

    public void jd() {
        for (jj jjVar : this.jpo) {
            if (jjVar != null) {
                try {
                    Context context = jjVar.getContext();
                    if (context instanceof MutableContextWrapper) {
                        ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                    }
                    jjVar.hna();
                } catch (Throwable th2) {
                    th2.getMessage();
                }
            }
        }
        this.jpo.clear();
        for (jj jjVar2 : this.f18552jd) {
            if (jjVar2 != null) {
                try {
                    Context context2 = jjVar2.getContext();
                    if (context2 instanceof MutableContextWrapper) {
                        ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                    }
                    jjVar2.hna();
                } catch (Throwable th3) {
                    th3.getMessage();
                }
            }
        }
        this.f18552jd.clear();
    }

    public void jpo(jj jjVar) {
        if (jjVar == null) {
            return;
        }
        if (this.f18552jd.size() >= xyk) {
            try {
                Context context = jjVar.getContext();
                if (context instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                }
                jjVar.hna();
                return;
            } catch (Throwable th2) {
                th2.getMessage();
                return;
            }
        }
        if (this.f18552jd.contains(jjVar)) {
            return;
        }
        try {
            Context context2 = jjVar.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                jjVar.setRecycler(true);
                this.f18552jd.add(jjVar);
                cm();
            }
        } catch (Throwable th3) {
            cm();
            th3.getMessage();
        }
    }

    public void jd(int i10) {
        synchronized (my) {
            xyk = i10;
        }
    }

    public void jpo(jj jjVar, jd jdVar) {
        if (jjVar == null || jdVar == null) {
            return;
        }
        wqx wqxVar = this.wqx.get(Integer.valueOf(jjVar.hashCode()));
        if (wqxVar != null) {
            wqxVar.jpo(jdVar);
        } else {
            wqxVar = new wqx(jdVar);
            this.wqx.put(Integer.valueOf(jjVar.hashCode()), wqxVar);
        }
        jjVar.jpo(wqxVar, "SDK_INJECT_GLOBAL");
    }

    public void jpo(WebView webView, nmd nmdVar, String str) {
        if (webView == null || nmdVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        cm cmVar = this.f18551cm.get(Integer.valueOf(webView.hashCode()));
        if (cmVar != null) {
            cmVar.jpo(nmdVar);
        } else {
            cmVar = new cm(nmdVar);
            this.f18551cm.put(Integer.valueOf(webView.hashCode()), cmVar);
        }
        webView.addJavascriptInterface(cmVar, str);
    }

    public void jpo(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return;
        }
        cm cmVar = this.f18551cm.get(Integer.valueOf(webView.hashCode()));
        if (cmVar != null) {
            cmVar.jpo(null);
        }
        webView.removeJavascriptInterface(str);
    }

    public void jpo(int i10) {
        synchronized (my) {
            f18550jj = i10;
        }
    }
}
