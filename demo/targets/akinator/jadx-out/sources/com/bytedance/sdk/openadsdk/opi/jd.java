package com.bytedance.sdk.openadsdk.opi;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.jd.jpo.Cif;
import com.bytedance.sdk.component.jd.jpo.cm;
import com.bytedance.sdk.component.jd.jpo.jpo.jpo.my;
import com.bytedance.sdk.component.jd.jpo.jpo.jpo.yd;
import com.bytedance.sdk.component.jd.jpo.oya;
import com.bytedance.sdk.component.jd.jpo.xyk;
import com.bytedance.sdk.component.my.hna;
import com.bytedance.sdk.component.my.ju;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.qk.jpo;
import com.bytedance.sdk.openadsdk.core.hmu;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.opi;
import com.bytedance.sdk.openadsdk.core.settings.au;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.opi.jpo.wqx;
import com.bytedance.sdk.openadsdk.utils.duq;
import com.bytedance.sdk.openadsdk.utils.va;
import com.moloco.sdk.BKC.KerkSviMAy;
import com.pgl.ssdk.ces.out.PglSSConfig;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd {
    private static volatile jd jpo;

    /* renamed from: cm, reason: collision with root package name */
    private final Map<String, JSONObject> f21408cm = new HashMap();

    /* renamed from: jd, reason: collision with root package name */
    private final com.bytedance.sdk.component.qk.jpo f21409jd;
    private wqx wqx;

    private jd(Context context) {
        int iJpo = jpo();
        jpo.C0090jpo c0090jpo = new jpo.C0090jpo();
        long j10 = iJpo;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        com.bytedance.sdk.component.qk.jpo jpoVarJpo = c0090jpo.jpo(j10, timeUnit).jd(j10, timeUnit).wqx(j10, timeUnit).jpo(new jpo()).jpo(true).jpo();
        this.f21409jd = jpoVarJpo;
        com.bytedance.sdk.component.jd.jpo.jpo.jpo.jpo.jpo(new yd() { // from class: com.bytedance.sdk.openadsdk.opi.jd.1
            @Override // com.bytedance.sdk.component.jd.jpo.jpo.jpo.yd
            public boolean jd() {
                return au.jrx().ykp();
            }

            @Override // com.bytedance.sdk.component.jd.jpo.jpo.jpo.yd
            public ExecutorService jpo() {
                if (au.jrx().ykp()) {
                    return duq.ju();
                }
                return null;
            }
        });
        com.bytedance.sdk.component.qk.jpo.jpo(new my() { // from class: com.bytedance.sdk.openadsdk.opi.jd.2
            @Override // com.bytedance.sdk.component.jd.jpo.jpo.jpo.my
            public boolean jpo() {
                return com.bytedance.sdk.openadsdk.rq.jpo.jpo("net_http_protocol", 0) == 1;
            }
        });
        cm cmVarJpo = jpoVarJpo.jj().jpo();
        if (cmVarJpo != null) {
            cmVarJpo.jpo(32);
        }
    }

    public static jd jd() {
        if (jpo == null) {
            synchronized (jd.class) {
                try {
                    if (jpo == null) {
                        jpo = new jd(sq.jpo());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return jpo;
    }

    private void my() {
        if (this.wqx == null) {
            this.wqx = new wqx();
        }
    }

    public wqx cm() {
        my();
        return this.wqx;
    }

    public com.bytedance.sdk.component.qk.jpo wqx() {
        return this.f21409jd;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes2.dex */
    public class jpo implements xyk {
        public jpo() {
        }

        @Override // com.bytedance.sdk.component.jd.jpo.xyk
        public oya jpo(xyk.jpo jpoVar) throws IOException {
            JSONObject jSONObjectJpo;
            Cif cifJpo = jpoVar.jpo();
            if (cifJpo.jd() != null && !cifJpo.jd().cm().isEmpty()) {
                List<String> listCm = cifJpo.jd().cm();
                StringBuilder sb2 = new StringBuilder();
                for (String str : listCm) {
                    sb2.append("/");
                    sb2.append(str);
                }
                String string = sb2.toString();
                if (!TextUtils.isEmpty(string) && string.equals("/monitor/collect/c/session")) {
                    return jpoVar.jpo(cifJpo);
                }
            }
            Cif.jpo jpoVarZz = cifJpo.zz();
            String strJd = com.bytedance.sdk.openadsdk.multipro.cm.cm.jd("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, KerkSviMAy.yEHcRm);
            if (!TextUtils.isEmpty(strJd) && (jSONObjectJpo = jd.this.jpo(strJd)) != null) {
                jpoVarZz.jd("transfer-param", jSONObjectJpo.optString(PglCryptUtils.KEY_MESSAGE));
                if (jSONObjectJpo.optInt("cypher") == 4) {
                    jpoVarZz.jd("cypher", "4");
                } else {
                    jpoVarZz.jd("cypher", "3");
                }
            }
            try {
                jpoVarZz.jd("x-pangle-target-idc", au.jrx().ez());
            } catch (Throwable unused) {
            }
            return jpoVar.jpo(jpoVarZz.jd());
        }
    }

    public int jpo() {
        try {
            return com.bytedance.sdk.openadsdk.rq.jpo.jpo("net_time_out", 10000);
        } catch (Throwable unused) {
            return 10000;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject jpo(String str) throws JSONException {
        JSONObject jSONObject = this.f21408cm.get(str);
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("ipv6", str);
        } catch (JSONException unused) {
        }
        JSONObject jSONObjectEncryptType4 = PangleEncryptManager.encryptType4(jSONObject2, new hmu(PangleEncryptConstant.CryptDataScene.UNKNOWN));
        this.f21408cm.put(str, jSONObjectEncryptType4);
        return jSONObjectEncryptType4;
    }

    public void jpo(String str, int i10, int i11, ImageView imageView, dt dtVar) {
        com.bytedance.sdk.openadsdk.zz.cm.jpo(str).jpo(i10).jd(i11).my(va.my(sq.jpo())).cm(va.wqx(sq.jpo())).wqx(1).jpo(com.bytedance.sdk.openadsdk.zz.wqx.jpo(dtVar, str, imageView));
    }

    public void jpo(int i10, final ImageView imageView, final dt dtVar) {
        if (dtVar == null || !TextUtils.isEmpty(dtVar.sq())) {
            com.bytedance.sdk.openadsdk.zz.cm.jpo(dtVar.sq()).jpo(i10).jd(i10).my(va.my(sq.jpo())).cm(va.wqx(sq.jpo())).wqx(1).jpo(com.bytedance.sdk.openadsdk.zz.wqx.jpo(dtVar, dtVar.sq(), imageView));
            if (imageView != null) {
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.opi.jd.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        if (imageView.getDrawable() != null) {
                            Intent intent = new Intent();
                            String strOpi = dtVar.opi();
                            intent.setAction("android.intent.action.VIEW");
                            intent.setData(Uri.parse(strOpi));
                            try {
                                com.bytedance.sdk.component.utils.jd.jpo(sq.jpo(), intent, null);
                            } catch (Exception unused) {
                            }
                        }
                    }
                });
            }
        }
    }

    public void jpo(opi opiVar, ImageView imageView, dt dtVar) {
        if (opiVar == null || TextUtils.isEmpty(opiVar.jpo()) || imageView == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.zz.cm.jpo(opiVar).wqx(1).jpo(com.bytedance.sdk.openadsdk.zz.wqx.jpo(dtVar, opiVar.jpo(), imageView));
    }

    public void jpo(opi opiVar, ImageView imageView, dt dtVar, hna hnaVar) {
        if (opiVar == null || TextUtils.isEmpty(opiVar.jpo()) || imageView == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.zz.cm.jpo(opiVar).wqx(1).jpo(com.bytedance.sdk.openadsdk.zz.wqx.jpo(dtVar, opiVar.jpo(), imageView, hnaVar));
    }

    public void jpo(String str, View view) {
        if (view == null || TextUtils.isEmpty(str)) {
            return;
        }
        final WeakReference weakReference = new WeakReference(view);
        com.bytedance.sdk.openadsdk.zz.cm.jpo(str).wqx(2).jpo(new com.bytedance.sdk.component.my.xyk() { // from class: com.bytedance.sdk.openadsdk.opi.jd.5
            @Override // com.bytedance.sdk.component.my.xyk
            public Bitmap jpo(Bitmap bitmap) {
                View view2 = (View) weakReference.get();
                if (view2 == null) {
                    return null;
                }
                return com.bytedance.sdk.component.adexpress.cm.jpo.jpo(view2.getContext(), bitmap, 10);
            }
        }).jpo(new hna() { // from class: com.bytedance.sdk.openadsdk.opi.jd.4
            @Override // com.bytedance.sdk.component.my.hna
            public void jpo(int i10, String str2, Throwable th2) {
            }

            @Override // com.bytedance.sdk.component.my.hna
            public void jpo(ju juVar) {
                final View view2;
                if (juVar == null) {
                    return;
                }
                final Object objJd = juVar.jd();
                if (!(objJd instanceof Bitmap) || (view2 = (View) weakReference.get()) == null) {
                    return;
                }
                if (!duq.jj()) {
                    view2.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.opi.jd.4.1
                        @Override // java.lang.Runnable
                        public void run() {
                            View view3 = view2;
                            if (view3 instanceof ImageView) {
                                ((ImageView) view3).setImageDrawable(new BitmapDrawable(view2.getResources(), (Bitmap) objJd));
                            } else {
                                view3.setBackground(new BitmapDrawable(view2.getResources(), (Bitmap) objJd));
                            }
                        }
                    });
                } else if (view2 instanceof ImageView) {
                    ((ImageView) view2).setImageDrawable(new BitmapDrawable(view2.getResources(), (Bitmap) objJd));
                } else {
                    view2.setBackground(new BitmapDrawable(view2.getResources(), (Bitmap) objJd));
                }
            }
        });
    }
}
