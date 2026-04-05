package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.common.jpo;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.rv;
import com.bytedance.sdk.openadsdk.core.sq;
import java.io.File;
import java.io.FileFilter;
import java.util.Iterator;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
class cm {
    private static volatile cm jpo;

    /* renamed from: jd, reason: collision with root package name */
    private final Context f19837jd;
    private final jpo.C0106jpo wqx;

    private cm(Context context) {
        this.f19837jd = context == null ? sq.jpo() : context.getApplicationContext();
        this.wqx = new jpo.C0106jpo("sp_full_screen_video");
    }

    public com.bytedance.sdk.openadsdk.core.model.jpo jd(String str, boolean z10) {
        com.bytedance.sdk.openadsdk.core.model.jpo jpoVarJd;
        long jCm = this.wqx.cm(str);
        boolean zMy = this.wqx.my(str);
        boolean zQk = this.wqx.qk(str);
        int iJd = my.jd();
        if (System.currentTimeMillis() - jCm < 10500000 && !zMy && (!z10 || iJd != 2 || !zQk)) {
            try {
                String strJd = this.wqx.jd(str);
                if (!TextUtils.isEmpty(strJd)) {
                    JSONObject jSONObject = new JSONObject(strJd);
                    if (jSONObject.has("cypher")) {
                        jSONObject = sq.wqx().jpo(jSONObject);
                    }
                    if (jSONObject.has("creatives")) {
                        jpoVarJd = com.bytedance.sdk.openadsdk.core.model.jpo.jd(jSONObject);
                    } else {
                        dt dtVarJpo = com.bytedance.sdk.openadsdk.core.jd.jpo(jSONObject);
                        com.bytedance.sdk.openadsdk.core.model.jpo jpoVar = new com.bytedance.sdk.openadsdk.core.model.jpo();
                        jpoVar.jpo(dtVarJpo);
                        jpoVarJd = jpoVar;
                    }
                    if (jpoVarJd != null && jpoVarJd.my()) {
                        Iterator<dt> it = jpoVarJd.cm().iterator();
                        while (it.hasNext()) {
                            if (!jpo(it.next())) {
                                it.remove();
                            }
                        }
                        if (jpoVarJd.my() && jpoVarJd.jj() != null) {
                            if (jpoVarJd.jj().gmx() != null) {
                                return jpoVarJd;
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public void jpo(String str, dt dtVar) {
        if (com.bytedance.sdk.openadsdk.utils.jd.jpo()) {
            com.bytedance.sdk.openadsdk.common.jpo.jpo("sp_full_screen_video_new").jpo(str, dtVar);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strWqx = this.wqx.wqx(str);
        String strHbg = dtVar != null ? dtVar.hbg() : "";
        if (TextUtils.isEmpty(strWqx) || TextUtils.isEmpty(strHbg) || strWqx.equals(strHbg)) {
            this.wqx.xyk(str);
        }
    }

    public void jpo() {
        File[] fileArrListFiles;
        String str;
        File[] fileArrListFiles2;
        if (com.bytedance.sdk.openadsdk.utils.jd.jpo()) {
            com.bytedance.sdk.openadsdk.common.jpo.jpo("sp_full_screen_video_new").jpo();
            return;
        }
        try {
            boolean zQk = com.bytedance.sdk.openadsdk.core.zz.qk("sp_full_screen_video");
            if (zQk) {
                str = "files";
            } else {
                str = "shared_prefs";
            }
            File file = new File(this.f19837jd.getDataDir(), str);
            if (file.exists() && file.isDirectory() && (fileArrListFiles2 = file.listFiles(new FileFilter() { // from class: com.bytedance.sdk.openadsdk.component.reward.cm.1
                @Override // java.io.FileFilter
                public boolean accept(File file2) {
                    if (file2 != null) {
                        return file2.getName().contains("sp_full_screen_video");
                    }
                    return false;
                }
            })) != null) {
                for (File file2 : fileArrListFiles2) {
                    if (zQk) {
                        try {
                            com.bytedance.sdk.component.utils.qk.wqx(file2);
                        } catch (Throwable unused) {
                        }
                    } else {
                        this.f19837jd.deleteSharedPreferences(file2.getName().replace(".xml", ""));
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        try {
            File cacheDir = this.f19837jd.getCacheDir();
            if (cacheDir == null || !cacheDir.exists() || !cacheDir.isDirectory() || (fileArrListFiles = cacheDir.listFiles(new FileFilter() { // from class: com.bytedance.sdk.openadsdk.component.reward.cm.2
                @Override // java.io.FileFilter
                public boolean accept(File file3) {
                    if (file3 != null) {
                        return file3.getName().contains("full_screen_video_cache");
                    }
                    return false;
                }
            })) == null) {
                return;
            }
            for (File file3 : fileArrListFiles) {
                try {
                    com.bytedance.sdk.component.utils.qk.wqx(file3);
                } catch (Throwable unused3) {
                }
            }
        } catch (Throwable unused4) {
        }
    }

    public void jpo(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.jpo jpoVar) {
        dt dtVarJj;
        if (jpoVar == null || jpoVar.jj() == null || !jpoVar.jj().rf()) {
            if (com.bytedance.sdk.openadsdk.utils.jd.jpo()) {
                com.bytedance.sdk.openadsdk.common.jpo.jpo("sp_full_screen_video_new").jpo(adSlot, jpoVar);
                return;
            }
            if (jpoVar == null || adSlot == null || !TextUtils.isEmpty(adSlot.getBidAdm()) || (dtVarJj = jpoVar.jj()) == null || dtVarJj.yyf() == 2) {
                return;
            }
            try {
                this.wqx.jpo(adSlot, jpoVar.au().toString(), jpoVar.jd());
            } catch (Throwable unused) {
            }
        }
    }

    public static cm jpo(Context context) {
        if (jpo == null) {
            synchronized (cm.class) {
                try {
                    if (jpo == null) {
                        jpo = new cm(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return jpo;
    }

    public String jpo(String str, boolean z10) {
        com.bytedance.sdk.openadsdk.common.jpo jpoVarJpo = com.bytedance.sdk.openadsdk.common.jpo.jpo("sp_full_screen_video_new");
        String strJpo = jpoVarJpo.jpo(str, 10500000L);
        if (z10 && !TextUtils.isEmpty(strJpo) && my.jd() == 2 && jpoVarJpo.cm(str)) {
            return null;
        }
        return strJpo;
    }

    public boolean jpo(com.bytedance.sdk.openadsdk.core.model.jpo jpoVar) {
        return com.bytedance.sdk.openadsdk.common.jpo.jpo("sp_full_screen_video_new").jpo(jpoVar, true);
    }

    private boolean jpo(dt dtVar) {
        if (dtVar != null) {
            return rv.wqx(dtVar) || dtVar.ww() != null;
        }
        return false;
    }

    public void jpo(String str) {
        if (com.bytedance.sdk.openadsdk.utils.jd.jpo()) {
            com.bytedance.sdk.openadsdk.common.jpo.jpo("sp_full_screen_video_new").wqx(str);
        } else {
            this.wqx.jj(str);
        }
    }
}
