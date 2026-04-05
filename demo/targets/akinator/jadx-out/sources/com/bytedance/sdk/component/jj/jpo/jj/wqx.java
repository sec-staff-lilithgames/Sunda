package com.bytedance.sdk.component.jj.jpo.jj;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.amazon.device.ads.DtbConstants;
import com.bytedance.sdk.component.jj.jpo.xyk;
import com.mbridge.msdk.foundation.download.Command;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx implements jd {

    /* renamed from: jd, reason: collision with root package name */
    private final my f18689jd;
    private final Context jpo;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class jpo extends com.bytedance.sdk.component.jj.jpo.my.my {

        /* renamed from: cm, reason: collision with root package name */
        private final Map<String, String> f18693cm;

        /* renamed from: jd, reason: collision with root package name */
        private final cm f18694jd;
        private final String wqx;

        private String wqx(String str) {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            if (str.contains("{TS}") || str.contains("__TS__")) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                str = str.replace("{TS}", String.valueOf(jCurrentTimeMillis)).replace("__TS__", String.valueOf(jCurrentTimeMillis));
            }
            return ((str.contains("{UID}") || str.contains("__UID__")) && !TextUtils.isEmpty(this.wqx)) ? str.replace("{UID}", this.wqx).replace("__UID__", this.wqx) : str;
        }

        public String jd(String str) {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            try {
                return str.replace("[ss_random]", String.valueOf(wqx.wqx().nextLong())).replace("[ss_timestamp]", String.valueOf(System.currentTimeMillis()));
            } catch (Exception unused) {
                return str;
            }
        }

        public boolean jpo(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return str.startsWith(DtbConstants.HTTP) || str.startsWith(DtbConstants.HTTPS);
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.component.jj.jpo.my.cm cmVarJpo;
            com.bytedance.sdk.component.jj.jpo.my myVarHna = xyk.qk().hna();
            if (myVarHna == null || xyk.qk().jj() == null || !myVarHna.wqx() || !jpo(this.f18694jd.jd())) {
                return;
            }
            if (this.f18694jd.cm() >= myVarHna.wqx(this.f18694jd.jj())) {
                wqx.this.f18689jd.wqx(this.f18694jd);
                return;
            }
            try {
                myVarHna.au();
                if (this.f18694jd.ju()) {
                    wqx.this.f18689jd.jpo(this.f18694jd);
                }
                if (myVarHna.jpo(wqx.this.jpo())) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    String strJd = this.f18694jd.jd();
                    if (myVarHna.jj() == 0) {
                        strJd = wqx(this.f18694jd.jd());
                        if (this.f18694jd.wqx()) {
                            strJd = jd(strJd);
                        }
                    }
                    com.bytedance.sdk.component.jj.jpo.my.wqx wqxVarYd = myVarHna.yd();
                    if (wqxVarYd == null) {
                        return;
                    }
                    wqxVarYd.jpo(Command.HTTP_HEADER_USER_AGENT, myVarHna.zz());
                    wqxVarYd.jpo("csj_client_source_from", "1");
                    if (this.f18693cm != null) {
                        JSONObject jSONObject = new JSONObject();
                        for (Map.Entry<String, String> entry : this.f18693cm.entrySet()) {
                            jSONObject.put(entry.getKey(), entry.getValue());
                        }
                        wqxVarYd.jpo("csj_extra_info", jSONObject.toString());
                    }
                    wqxVarYd.jpo(strJd);
                    try {
                        cmVarJpo = wqxVarYd.jpo();
                        try {
                            myVarHna.jpo(cmVarJpo.jpo());
                        } catch (Throwable unused) {
                        }
                    } catch (Throwable unused2) {
                        cmVarJpo = null;
                    }
                    cm cmVar = this.f18694jd;
                    cmVar.jpo(cmVar.cm() + 1);
                    if (cmVarJpo != null && cmVarJpo.jpo()) {
                        wqx.this.f18689jd.wqx(this.f18694jd);
                        this.f18694jd.jd();
                        myVarHna.jpo(true, 200, System.currentTimeMillis() - jCurrentTimeMillis, this.f18694jd);
                        return;
                    }
                    if (cmVarJpo != null) {
                        this.f18694jd.jd(cmVarJpo.jd());
                        this.f18694jd.wqx(cmVarJpo.wqx());
                    }
                    if (cmVarJpo == null || cmVarJpo.jd() != 8848) {
                        this.f18694jd.jd();
                        if (this.f18694jd.cm() >= myVarHna.wqx(this.f18694jd.jj())) {
                            wqx.this.f18689jd.wqx(this.f18694jd);
                            this.f18694jd.jd();
                        } else {
                            wqx.this.f18689jd.jd(this.f18694jd);
                        }
                    } else {
                        cmVarJpo.wqx();
                        wqx.this.f18689jd.wqx(this.f18694jd);
                    }
                    myVarHna.jpo(false, this.f18694jd.xyk(), System.currentTimeMillis() - jCurrentTimeMillis, this.f18694jd);
                }
            } catch (Throwable unused3) {
            }
        }

        private jpo(cm cmVar, String str, Map<String, String> map) {
            super("AdsStats");
            this.f18694jd = cmVar;
            this.wqx = str;
            this.f18693cm = map;
        }
    }

    public wqx(Context context, my myVar) {
        this.jpo = context;
        this.f18689jd = myVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Random wqx() {
        if (Build.VERSION.SDK_INT < 26) {
            return new SecureRandom();
        }
        try {
            return SecureRandom.getInstanceStrong();
        } catch (Throwable unused) {
            return new SecureRandom();
        }
    }

    public Context jpo() {
        Context context = this.jpo;
        return context == null ? xyk.qk().jj() : context;
    }

    @Override // com.bytedance.sdk.component.jj.jpo.jj.jd
    public void jpo(String str, List<String> list, boolean z10, Map<String, String> map, int i10, String str2) {
        com.bytedance.sdk.component.jj.jpo.my myVarHna = xyk.qk().hna();
        if (myVarHna == null || xyk.qk().jj() == null || myVarHna.cm() == null || !myVarHna.wqx() || list == null || list.size() == 0) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            myVarHna.cm().execute(new jpo(new cm(UUID.randomUUID().toString() + "_" + System.currentTimeMillis(), it.next(), z10, i10, str2), str, map));
        }
    }

    @Override // com.bytedance.sdk.component.jj.jpo.jj.jd
    public Runnable jpo(final cm cmVar, final String str, final Map<String, String> map) {
        if (cmVar == null || TextUtils.isEmpty(cmVar.jpo())) {
            return null;
        }
        return new Runnable() { // from class: com.bytedance.sdk.component.jj.jpo.jj.wqx.1
            @Override // java.lang.Runnable
            public void run() {
                if (wqx.this.f18689jd.jpo(cmVar.jpo()) != null) {
                    new jpo(cmVar, str, map).run();
                }
            }
        };
    }

    @Override // com.bytedance.sdk.component.jj.jpo.jj.jd
    public void jpo(final String str, final boolean z10) {
        com.bytedance.sdk.component.jj.jpo.my myVarHna = xyk.qk().hna();
        if (myVarHna == null || xyk.qk().jj() == null || !myVarHna.wqx()) {
            return;
        }
        com.bytedance.sdk.component.jj.jpo.my.my myVar = new com.bytedance.sdk.component.jj.jpo.my.my("trackFailedUrls") { // from class: com.bytedance.sdk.component.jj.jpo.jj.wqx.2
            @Override // java.lang.Runnable
            public void run() {
                wqx.this.jpo(wqx.this.f18689jd.jpo(), str, z10);
            }
        };
        myVar.jpo(1);
        if (myVarHna.cm() != null) {
            myVarHna.cm().execute(myVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(List<cm> list, String str, boolean z10) {
        String str2;
        if (list == null || list.size() == 0) {
            return;
        }
        com.bytedance.sdk.component.jj.jpo.my myVarHna = xyk.qk().hna();
        for (cm cmVar : list) {
            if (myVarHna == null || myVarHna.cm() == null) {
                str2 = str;
            } else {
                cmVar.jpo(z10);
                str2 = str;
                myVarHna.cm().execute(new jpo(cmVar, str2, null));
            }
            str = str2;
        }
    }
}
