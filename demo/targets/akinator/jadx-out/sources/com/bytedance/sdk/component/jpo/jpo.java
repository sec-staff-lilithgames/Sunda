package com.bytedance.sdk.component.jpo;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.sdk.component.jpo.jj;
import j1.o2;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class jpo {

    /* renamed from: jd, reason: collision with root package name */
    protected ju f18764jd;
    protected Context jpo;
    protected String my;

    /* renamed from: qk, reason: collision with root package name */
    jj f18766qk;
    protected qk wqx;

    /* renamed from: cm, reason: collision with root package name */
    protected Handler f18763cm = new Handler(Looper.getMainLooper());

    /* renamed from: jj, reason: collision with root package name */
    protected volatile boolean f18765jj = false;
    private final Map<String, jj> xyk = new HashMap();

    public void invokeMethod(final String str) {
        if (this.f18765jj) {
            return;
        }
        this.f18763cm.post(new Runnable() { // from class: com.bytedance.sdk.component.jpo.jpo.1
            @Override // java.lang.Runnable
            public void run() {
                oya oyaVarJpo;
                if (jpo.this.f18765jj) {
                    return;
                }
                try {
                    oyaVarJpo = jpo.this.jpo(new JSONObject(str));
                } catch (Exception unused) {
                    oyaVarJpo = null;
                }
                if (!oya.jpo(oyaVarJpo)) {
                    jpo.this.jpo(oyaVarJpo);
                    return;
                }
                Objects.toString(oyaVarJpo);
                if (oyaVarJpo != null) {
                    jpo.this.jd(jr.jpo(new hna(oyaVarJpo.jpo, "Failed to parse invocation.")), oyaVarJpo);
                }
            }
        });
    }

    public void jd() {
        this.f18766qk.jpo();
        Iterator<jj> it = this.xyk.values().iterator();
        while (it.hasNext()) {
            it.next().jpo();
        }
        this.f18763cm.removeCallbacksAndMessages(null);
        this.f18765jj = true;
    }

    public abstract void jd(zz zzVar);

    public abstract Context jpo(zz zzVar);

    public abstract String jpo();

    public abstract void jpo(String str);

    public final void wqx(zz zzVar) {
        this.jpo = jpo(zzVar);
        this.wqx = zzVar.f18786cm;
        this.f18764jd = zzVar.xyk;
        this.f18766qk = new jj(zzVar, this);
        this.my = zzVar.f18791yd;
        jd(zzVar);
    }

    public void jpo(String str, oya oyaVar) {
        jpo(str);
    }

    public final void jpo(oya oyaVar) {
        String strJpo;
        if (this.f18765jj || (strJpo = jpo()) == null) {
            return;
        }
        jj jjVarJd = jd(oyaVar.f18774qk);
        if (jjVarJd == null) {
            oyaVar.toString();
            if (this.f18764jd != null) {
                jpo();
            }
            jd(jr.jpo(new hna(-4, o2.o(new StringBuilder("Namespace "), oyaVar.f18774qk, " unknown."))), oyaVar);
            return;
        }
        my myVar = new my();
        myVar.f18768jd = strJpo;
        myVar.jpo = this.jpo;
        myVar.wqx = jjVarJd;
        try {
            jj.jpo jpoVarJpo = jjVarJd.jpo(oyaVar, myVar);
            if (jpoVarJpo == null) {
                oyaVar.toString();
                if (this.f18764jd != null) {
                    jpo();
                }
                jd(jr.jpo(new hna(-2, "Function " + oyaVar.f18771cm + " is not registered.")), oyaVar);
                return;
            }
            if (jpoVarJpo.jpo) {
                jd(jpoVarJpo.f18762jd, oyaVar);
            }
            if (this.f18764jd != null) {
                jpo();
            }
        } catch (Exception e10) {
            oyaVar.toString();
            jd(jr.jpo(e10), oyaVar);
        }
    }

    public final void jd(String str, oya oyaVar) {
        JSONObject jSONObject;
        if (this.f18765jj || TextUtils.isEmpty(oyaVar.f18773jj)) {
            return;
        }
        if (!str.startsWith("{") || !str.endsWith("}")) {
            xyk.jpo(new IllegalArgumentException("Illegal callback data: ".concat(str)));
        }
        try {
            jSONObject = new JSONObject(str);
        } catch (Exception unused) {
            jSONObject = new JSONObject();
        }
        jpo(au.jpo().jpo("__msg_type", "callback").jpo("__callback_id", oyaVar.f18773jj).jpo("__params", jSONObject).jd(), oyaVar);
    }

    private jj jd(String str) {
        if (!TextUtils.equals(str, this.my) && !TextUtils.isEmpty(str)) {
            return this.xyk.get(str);
        }
        return this.f18766qk;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public oya jpo(JSONObject jSONObject) throws JSONException {
        String strOptString;
        if (this.f18765jj) {
            return null;
        }
        String strOptString2 = jSONObject.optString("__callback_id");
        String strOptString3 = jSONObject.optString("func");
        if (jpo() == null) {
            return null;
        }
        try {
            String string = jSONObject.getString("__msg_type");
            String strValueOf = "";
            try {
                Object objOpt = jSONObject.opt("params");
                if (objOpt == null) {
                    strOptString = strValueOf;
                } else if (objOpt instanceof JSONObject) {
                    strOptString = String.valueOf((JSONObject) objOpt);
                } else {
                    if (objOpt instanceof String) {
                        strValueOf = (String) objOpt;
                    } else {
                        strValueOf = String.valueOf(objOpt);
                    }
                    strOptString = strValueOf;
                }
            } catch (Throwable unused) {
                strOptString = jSONObject.optString("params");
            }
            String string2 = jSONObject.getString("JSSDK");
            String strOptString4 = jSONObject.optString("namespace");
            return oya.jpo().jpo(string2).jd(string).wqx(strOptString3).cm(strOptString).my(strOptString2).jj(strOptString4).qk(jSONObject.optString("__iframe_url")).jpo();
        } catch (JSONException unused2) {
            return oya.jpo(strOptString2, -1);
        }
    }
}
