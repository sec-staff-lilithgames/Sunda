package com.bytedance.sdk.openadsdk.common;

import a.b;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.rq;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.rv;
import java.io.File;
import java.io.FileFilter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {

    /* renamed from: cm, reason: collision with root package name */
    private final C0106jpo f19730cm;

    /* renamed from: jj, reason: collision with root package name */
    private final Map<dt, Long> f19731jj = b.u();
    private final String my;
    private final Context wqx;
    private static final HashMap<String, jpo> jpo = new HashMap<>();

    /* renamed from: jd, reason: collision with root package name */
    private static final HashMap<String, C0106jpo> f19729jd = new HashMap<>();

    private jpo(Context context, String str) {
        this.wqx = context;
        C0106jpo c0106jpo = f19729jd.get(str);
        this.f19730cm = c0106jpo == null ? new C0106jpo(str) : c0106jpo;
        this.my = str;
    }

    public boolean cm(String str) {
        return this.f19730cm.qk(str);
    }

    public String jd(String str) {
        try {
            String strJd = this.f19730cm.jd(str);
            if (TextUtils.isEmpty(strJd)) {
                return null;
            }
            return strJd;
        } catch (Throwable unused) {
            return null;
        }
    }

    public void wqx(String str) {
        this.f19730cm.jj(str);
    }

    public static jpo jpo(String str) {
        jpo jpoVar;
        HashMap<String, jpo> map = jpo;
        jpo jpoVar2 = map.get(str);
        if (jpoVar2 != null) {
            return jpoVar2;
        }
        synchronized (jpo.class) {
            try {
                jpoVar = map.get(str);
                if (jpoVar == null) {
                    jpoVar = new jpo(com.bytedance.sdk.openadsdk.core.sq.jpo(), str);
                    map.put(str, jpoVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jpoVar;
    }

    private String jd() {
        return CacheDirFactory.getICacheDir(0).jpo();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.sdk.openadsdk.common.jpo$jpo, reason: collision with other inner class name */
    public static class C0106jpo {
        protected final String jpo;

        /* renamed from: qk, reason: collision with root package name */
        private final HashSet<String> f19735qk = new HashSet<>();

        /* renamed from: jd, reason: collision with root package name */
        String f19733jd = "material_data";
        String wqx = "has_played";

        /* renamed from: cm, reason: collision with root package name */
        String f19732cm = "create_time";
        String my = "in_use_process";

        /* renamed from: jj, reason: collision with root package name */
        String f19734jj = "req_id";

        public C0106jpo(String str) {
            this.jpo = TextUtils.isEmpty(str) ? "" : str;
        }

        public long cm(String str) {
            try {
                return com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo(jpo(str), this.f19732cm, 0L);
            } catch (Throwable unused) {
                return 0L;
            }
        }

        public String jd(String str) {
            try {
                return com.bytedance.sdk.openadsdk.multipro.cm.cm.jd(jpo(str), this.f19733jd, null);
            } catch (Throwable unused) {
                return null;
            }
        }

        public void jj(String str) {
            try {
                com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo(jpo(str), this.my, rq.jd(com.bytedance.sdk.openadsdk.core.sq.jpo()));
                this.f19735qk.add(str);
            } catch (Throwable unused) {
            }
        }

        public String jpo(String str) {
            if (TextUtils.isEmpty(str)) {
                str = "0";
            }
            return b.o(new StringBuilder(), this.jpo, "_cache_", str);
        }

        public boolean my(String str) {
            try {
                return com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo(jpo(str), this.wqx, true);
            } catch (Throwable unused) {
                return true;
            }
        }

        public boolean qk(String str) {
            String strJpo;
            String strJd;
            try {
                strJpo = jpo(str);
                strJd = com.bytedance.sdk.openadsdk.multipro.cm.cm.jd(strJpo, this.my, "");
            } catch (Throwable unused) {
            }
            if (TextUtils.isEmpty(strJd)) {
                return false;
            }
            if (strJd.equals(rq.jd(com.bytedance.sdk.openadsdk.core.sq.jpo())) && !this.f19735qk.contains(str)) {
                com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo(strJpo, this.my, "");
                return false;
            }
            return true;
        }

        public String wqx(String str) {
            try {
                return com.bytedance.sdk.openadsdk.multipro.cm.cm.jd(jpo(str), this.f19734jj, null);
            } catch (Throwable unused) {
                return null;
            }
        }

        public void xyk(String str) {
            try {
                com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo(jpo(str));
                this.f19735qk.remove(str);
            } catch (Throwable unused) {
            }
        }

        public void jpo(AdSlot adSlot, String str, String str2) {
            try {
                String codeId = adSlot.getCodeId();
                String strJpo = jpo(codeId);
                com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo(strJpo, this.wqx, Boolean.FALSE);
                com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo(strJpo, this.f19732cm, Long.valueOf(System.currentTimeMillis()));
                com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo(strJpo, this.f19733jd, str);
                com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo(strJpo, this.my, "");
                com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo(strJpo, this.f19734jj, str2);
                this.f19735qk.remove(codeId);
            } catch (Throwable unused) {
            }
        }
    }

    public static void jpo(String str, C0106jpo c0106jpo) {
        f19729jd.put(str, c0106jpo);
    }

    public void jpo(String str, dt dtVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strWqx = this.f19730cm.wqx(str);
        String strHbg = dtVar != null ? dtVar.hbg() : "";
        if (TextUtils.isEmpty(strWqx) || TextUtils.isEmpty(strHbg) || strWqx.equals(strHbg)) {
            this.f19730cm.xyk(str);
        }
    }

    public void jpo() {
        String str;
        File[] fileArrListFiles;
        try {
            boolean zQk = com.bytedance.sdk.openadsdk.core.zz.qk(this.my);
            if (zQk) {
                str = "files";
            } else {
                str = "shared_prefs";
            }
            File file = new File(this.wqx.getDataDir(), str);
            if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles(new FileFilter() { // from class: com.bytedance.sdk.openadsdk.common.jpo.1
                @Override // java.io.FileFilter
                public boolean accept(File file2) {
                    if (file2 != null) {
                        return file2.getName().contains(jpo.this.my);
                    }
                    return false;
                }
            })) != null) {
                for (File file2 : fileArrListFiles) {
                    if (zQk) {
                        try {
                            com.bytedance.sdk.component.utils.qk.wqx(file2);
                        } catch (Throwable unused) {
                        }
                    } else {
                        this.wqx.deleteSharedPreferences(file2.getName().replace(".xml", ""));
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        try {
            File file3 = new File(jd());
            if (file3.exists() && file3.isDirectory()) {
                com.bytedance.sdk.component.utils.qk.wqx(file3);
            }
        } catch (Throwable unused3) {
        }
    }

    public void jpo(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.jpo jpoVar) {
        dt dtVarJj;
        if ((jpoVar != null && jpoVar.jj() != null && jpoVar.jj().rf()) || jpoVar == null || adSlot == null || !TextUtils.isEmpty(adSlot.getBidAdm()) || (dtVarJj = jpoVar.jj()) == null || dtVarJj.yyf() == 2) {
            return;
        }
        try {
            this.f19730cm.jpo(adSlot, jpoVar.oya(), jpoVar.jd());
        } catch (Throwable unused) {
        }
    }

    public boolean jpo(com.bytedance.sdk.openadsdk.core.model.jpo jpoVar, boolean z10) {
        if (jpoVar == null || !jpoVar.my()) {
            return false;
        }
        if (z10) {
            Iterator<dt> it = jpoVar.cm().iterator();
            while (it.hasNext()) {
                if (!jpo(it.next())) {
                    it.remove();
                }
            }
        }
        return jpoVar.my();
    }

    public String jpo(String str, long j10) {
        long jCm = this.f19730cm.cm(str);
        boolean zMy = this.f19730cm.my(str);
        if (System.currentTimeMillis() - jCm >= j10 || zMy) {
            return null;
        }
        return jd(str);
    }

    private boolean jpo(dt dtVar) {
        if (dtVar != null) {
            return rv.wqx(dtVar) || dtVar.ww() != null;
        }
        return false;
    }
}
