package com.bytedance.sdk.openadsdk.core.au.wqx;

import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import android.webkit.WebResourceResponse;
import com.amazon.device.ads.DtbConstants;
import com.bytedance.sdk.component.utils.my;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.component.utils.qk;
import com.bytedance.sdk.component.xyk.xyk;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.rv;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.core.zz;
import com.bytedance.sdk.openadsdk.nmd.jpo.cm;
import com.bytedance.sdk.openadsdk.utils.duq;
import com.ironsource.G5;
import j1.o2;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {
    private static volatile jpo jpo;

    /* renamed from: jd, reason: collision with root package name */
    private String f20231jd;
    private final Map<dt, jd> wqx = new ConcurrentHashMap();

    /* renamed from: cm, reason: collision with root package name */
    private final Map<String, JSONObject> f20230cm = new ConcurrentHashMap();
    private final AtomicBoolean my = new AtomicBoolean(false);

    /* renamed from: jj, reason: collision with root package name */
    private final Set<String> f20232jj = Collections.synchronizedSet(new HashSet());

    /* renamed from: qk, reason: collision with root package name */
    private final ConcurrentHashMap<String, com.bytedance.sdk.component.qk.jd.jpo> f20233qk = new ConcurrentHashMap<>();
    private final Map<String, String> xyk = new ConcurrentHashMap();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jd {

        /* renamed from: cm, reason: collision with root package name */
        long f20238cm;

        /* renamed from: jd, reason: collision with root package name */
        long f20239jd;
        long jpo;
        long wqx;

        private jd() {
        }

        public jd cm(long j10) {
            this.f20238cm = j10;
            return this;
        }

        public long jd() {
            return this.f20238cm - this.wqx;
        }

        public long jpo() {
            return this.f20239jd - this.jpo;
        }

        public jd wqx(long j10) {
            this.wqx = j10;
            return this;
        }

        public jd jd(long j10) {
            this.f20239jd = j10;
            return this;
        }

        public jd jpo(long j10) {
            this.jpo = j10;
            return this;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.sdk.openadsdk.core.au.wqx.jpo$jpo, reason: collision with other inner class name */
    public interface InterfaceC0113jpo {
        void jpo(boolean z10);
    }

    private jpo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public File cm(File file) {
        File file2 = new File(file, "tt_open_ad_sdk_check_res.dat");
        return my(file2) ? file2 : new File(file, "tt_open_ad_sdk_check_res.dat");
    }

    private boolean my(File file) {
        return file != null && file.exists() && file.isFile() && file.canRead();
    }

    public static void wqx(File file) {
        try {
            if (!file.exists() || file.setLastModified(System.currentTimeMillis())) {
                return;
            }
            file.renameTo(file);
            file.lastModified();
        } catch (Throwable unused) {
        }
    }

    public void jd() {
        if (this.my.get()) {
            return;
        }
        duq.jpo(new xyk("PlayableCache_init") { // from class: com.bytedance.sdk.openadsdk.core.au.wqx.jpo.1
            @Override // java.lang.Runnable
            public void run() {
                File[] fileArrListFiles;
                try {
                    String strCm = jpo.this.cm();
                    if (!TextUtils.isEmpty(strCm)) {
                        File file = new File(strCm);
                        if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                            for (File file2 : fileArrListFiles) {
                                if (file2 != null) {
                                    try {
                                        File fileJpo = jpo.jpo(file2);
                                        if (fileJpo != null && fileJpo.exists()) {
                                            jpo.this.xyk.put(file2.getName(), fileJpo.getAbsolutePath());
                                        }
                                        jpo.this.jpo(jpo.this.cm(fileJpo), true);
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable unused2) {
                }
                com.bytedance.sdk.openadsdk.nmd.jpo.wqx.jpo().jpo(jpo.this.xyk);
                jpo.this.my.set(true);
            }
        });
    }

    private String my() {
        if (TextUtils.isEmpty(this.f20231jd)) {
            try {
                File file = new File(sq.jpo().getCacheDir(), "playable");
                if (!file.exists()) {
                    file.mkdirs();
                }
                this.f20231jd = file.getAbsolutePath();
            } catch (Throwable th2) {
                nmd.wqx("PlayableCache", "init root path error: ".concat(String.valueOf(th2)));
            }
        }
        return this.f20231jd;
    }

    public static void jd(File file) {
        wqx(file);
        try {
            zz.jd().oya().jpo(file);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String cm() {
        File file = new File(my(), "games");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    public static jpo jpo() {
        if (jpo == null) {
            synchronized (jpo.class) {
                try {
                    if (jpo == null) {
                        jpo = new jpo();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return jpo;
    }

    public void jd(dt dtVar) {
        if (dtVar == null || dtVar.ww() == null || TextUtils.isEmpty(dtVar.ww().au()) || !com.bytedance.sdk.openadsdk.rq.jpo.jpo("can_cancel_playable", false)) {
            return;
        }
        com.bytedance.sdk.component.qk.jd.jpo jpoVar = this.f20233qk.get(dtVar.ww().au());
        if (jpoVar != null) {
            jpoVar.jd();
        }
    }

    public Map<String, String> wqx() {
        return this.xyk;
    }

    public boolean jpo(dt dtVar) {
        if (this.my.get() && dtVar != null && dtVar.ww() != null && dtVar.ww().au() != null) {
            try {
                if (!TextUtils.isEmpty(this.xyk.get(my.jpo(dtVar.ww().au())))) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject jpo(File file, boolean z10) {
        byte[] bArrCm;
        String strJd;
        try {
            if (!my(file) || (bArrCm = qk.cm(file)) == null || bArrCm.length <= 0) {
                return null;
            }
            if (TextUtils.equals(file.getName(), "tt_open_ad_sdk_check_res.dat")) {
                strJd = com.bytedance.sdk.component.utils.jpo.wqx(new String(bArrCm));
            } else {
                strJd = com.bytedance.sdk.component.cm.jpo.jd(new String(bArrCm), com.bytedance.sdk.openadsdk.core.jpo.jd());
            }
            if (TextUtils.isEmpty(strJd)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(strJd);
            if (z10 && jSONObject.length() > 0) {
                this.f20230cm.put(file.getParentFile().getName(), jSONObject);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public WebResourceResponse jpo(String str, String str2, String str3) {
        WebResourceResponse webResourceResponseJpo;
        String mimeTypeFromExtension;
        File fileJpo;
        try {
            webResourceResponseJpo = com.bytedance.sdk.openadsdk.nmd.jpo.wqx.jpo().jpo(str3);
        } catch (Throwable th2) {
            nmd.jpo("PlayableCache", "playable intercept error: ", th2);
        }
        if (webResourceResponseJpo != null) {
            return webResourceResponseJpo;
        }
        if (this.my.get() && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            try {
                if ((str3.startsWith(DtbConstants.HTTP) || str3.startsWith(DtbConstants.HTTPS)) && str3.contains("?")) {
                    str3 = str3.split("\\?")[0];
                    if (str3.endsWith("/")) {
                        str3 = str3.substring(0, str3.length() - 1);
                    }
                }
                mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str3));
            } catch (Throwable unused) {
                mimeTypeFromExtension = null;
            }
            if (TextUtils.isEmpty(mimeTypeFromExtension)) {
                return null;
            }
            String strJpo = my.jpo(str);
            if (TextUtils.isEmpty(strJpo)) {
                return null;
            }
            String str4 = this.xyk.get(strJpo);
            if (!TextUtils.isEmpty(str4)) {
                fileJpo = new File(str4);
            } else {
                fileJpo = jpo(new File(cm(), strJpo));
                if (fileJpo != null && fileJpo.exists()) {
                    this.xyk.put(strJpo, fileJpo.getAbsolutePath());
                }
            }
            if (fileJpo != null && fileJpo.exists()) {
                String strJpo2 = jpo(str2);
                if (TextUtils.isEmpty(strJpo2)) {
                    return null;
                }
                String strReplace = str3.replace(strJpo2, "");
                if (!TextUtils.isEmpty(strReplace) && !strReplace.startsWith(DtbConstants.HTTPS) && !strReplace.startsWith(DtbConstants.HTTP)) {
                    File file = new File(fileJpo, strReplace);
                    if (file.exists() && jpo(strJpo, strReplace, file) && file.getCanonicalPath().startsWith(fileJpo.getCanonicalPath())) {
                        return new WebResourceResponse(mimeTypeFromExtension, G5.N, new FileInputStream(file));
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static File jpo(File file) {
        File[] fileArrListFiles;
        if (file != null && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null && fileArrListFiles.length != 0) {
            for (File file2 : fileArrListFiles) {
                if (file2 != null && file2.isFile() && "index.html".equals(file2.getName())) {
                    return file;
                }
            }
            for (File file3 : fileArrListFiles) {
                if (file3 != null && file3.isDirectory()) {
                    return jpo(file3);
                }
            }
        }
        return null;
    }

    private String jpo(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("\\?");
        if (strArrSplit != null && strArrSplit.length == 2) {
            String str2 = strArrSplit[0];
            if (str2 != null && str2.endsWith("/")) {
                str = str.substring(0, strArrSplit.length - 1);
            }
            String str3 = strArrSplit[0];
            if (str3 != null && str3.endsWith("index.html")) {
                str = strArrSplit[0];
            }
        }
        return str.replace("index.html", "");
    }

    private boolean jpo(String str, String str2, File file) {
        if (file != null && file.exists()) {
            JSONObject jSONObject = this.f20230cm.get(str);
            if (jSONObject == null) {
                return true;
            }
            String strOptString = jSONObject.optString(str2);
            if (strOptString != null && strOptString.equalsIgnoreCase(my.jpo(file))) {
                return true;
            }
        }
        return false;
    }

    public void jpo(final dt dtVar, final InterfaceC0113jpo interfaceC0113jpo) {
        File file;
        if (cm.jpo().jd() && dtVar != null && rv.jj(dtVar) && dtVar.gmx() != null && !TextUtils.isEmpty(dtVar.gmx().getBidAdm())) {
            com.bytedance.sdk.openadsdk.core.au.wqx.jd.jpo(dtVar, -705, "server bidding pre render");
            jpo(interfaceC0113jpo, false);
            return;
        }
        if (dtVar != null && dtVar.ww() != null && !TextUtils.isEmpty(dtVar.ww().au())) {
            final String strAu = dtVar.ww().au();
            if (this.f20232jj.contains(strAu)) {
                return;
            }
            this.wqx.put(dtVar, new jd().jpo(System.currentTimeMillis()));
            com.bytedance.sdk.openadsdk.core.au.wqx.jd.jpo(dtVar);
            String strJpo = my.jpo(strAu);
            final File file2 = new File(cm(), strJpo);
            String str = this.xyk.get(strJpo);
            if (TextUtils.isEmpty(str)) {
                file = jpo(file2);
                if (file != null && file.exists()) {
                    this.xyk.put(strJpo, file.getAbsolutePath());
                }
            } else {
                file = new File(str);
            }
            if (file != null && file.exists()) {
                com.bytedance.sdk.openadsdk.core.au.wqx.jd.jpo(dtVar, -702, (String) null);
                wqx(file2);
                this.wqx.remove(dtVar);
                jpo(interfaceC0113jpo, true);
                return;
            }
            try {
                qk.wqx(file2);
            } catch (Throwable unused) {
            }
            this.f20232jj.add(strAu);
            File file3 = new File(my(), o2.l(strJpo, ".zip"));
            com.bytedance.sdk.component.qk.jd.jpo jpoVarCm = com.bytedance.sdk.openadsdk.opi.jd.jd().wqx().cm();
            this.f20233qk.put(strAu, jpoVarCm);
            jpoVarCm.jd(strAu);
            jpoVarCm.jpo(file3.getParent(), file3.getName());
            jpoVarCm.jpo(7);
            jpoVarCm.jpo("playable_download");
            jpoVarCm.jpo(new com.bytedance.sdk.component.qk.jpo.jpo() { // from class: com.bytedance.sdk.openadsdk.core.au.wqx.jpo.2
                @Override // com.bytedance.sdk.component.qk.jpo.jpo
                public void jpo(com.bytedance.sdk.component.qk.jd.wqx wqxVar, final com.bytedance.sdk.component.qk.jd jdVar) {
                    jpo.this.f20232jj.remove(strAu);
                    jpo.this.f20233qk.remove(strAu);
                    final jd jdVar2 = (jd) jpo.this.wqx.remove(dtVar);
                    if (jdVar2 != null) {
                        jdVar2.jd(System.currentTimeMillis());
                    }
                    if (jdVar.jj() && jdVar.my() != null && jdVar.my().exists()) {
                        duq.jd(new xyk("downloadZip") { // from class: com.bytedance.sdk.openadsdk.core.au.wqx.jpo.2.1
                            @Override // java.lang.Runnable
                            public void run() {
                                boolean z10;
                                long jJpo;
                                long jJd;
                                try {
                                    jd jdVar3 = jdVar2;
                                    if (jdVar3 != null) {
                                        jdVar3.wqx(System.currentTimeMillis());
                                    }
                                    com.bytedance.sdk.component.utils.rv.jpo(jdVar.my().getAbsolutePath(), file2.getAbsolutePath());
                                    jd jdVar4 = jdVar2;
                                    if (jdVar4 != null) {
                                        jdVar4.cm(System.currentTimeMillis());
                                    }
                                    jd jdVar5 = jdVar2;
                                    if (jdVar5 != null) {
                                        jJpo = jdVar5.jpo();
                                        jJd = jdVar2.jd();
                                    } else {
                                        jJpo = 0;
                                        jJd = 0;
                                    }
                                    com.bytedance.sdk.openadsdk.core.au.wqx.jd.jpo(dtVar, jJpo, jJd);
                                    jpo.jd(file2);
                                    z10 = true;
                                    try {
                                        File fileJpo = jpo.jpo(file2);
                                        if (fileJpo != null && fileJpo.exists()) {
                                            jpo.this.xyk.put(file2.getName(), fileJpo.getAbsolutePath());
                                        }
                                        jpo.this.jpo(jpo.this.cm(fileJpo), true);
                                    } catch (Throwable unused2) {
                                    }
                                } catch (Throwable th2) {
                                    nmd.jpo("PlayableCache", "unzip error: ", th2);
                                    com.bytedance.sdk.openadsdk.core.au.wqx.jd.jpo(dtVar, -704, th2.getMessage());
                                    z10 = false;
                                }
                                try {
                                    jdVar.my().delete();
                                } catch (Throwable unused3) {
                                }
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                jpo.this.jpo(interfaceC0113jpo, z10);
                            }
                        });
                    } else {
                        com.bytedance.sdk.openadsdk.core.au.wqx.jd.jpo(dtVar, jdVar.jpo() != 0 ? jdVar.jpo() : -700, (String) null);
                        jpo.this.jpo(interfaceC0113jpo, false);
                    }
                }

                @Override // com.bytedance.sdk.component.qk.jpo.jpo
                public void jpo(com.bytedance.sdk.component.qk.jd.wqx wqxVar, IOException iOException) {
                    jpo.this.f20232jj.remove(strAu);
                    jpo.this.f20233qk.remove(strAu);
                    jpo.this.wqx.remove(dtVar);
                    com.bytedance.sdk.openadsdk.core.au.wqx.jd.jpo(dtVar, -700, iOException.getMessage());
                    jpo.this.jpo(interfaceC0113jpo, false);
                }
            });
            return;
        }
        com.bytedance.sdk.openadsdk.core.au.wqx.jd.jpo(dtVar, -701, (String) null);
        jpo(interfaceC0113jpo, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(final InterfaceC0113jpo interfaceC0113jpo, final boolean z10) {
        duq.jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.au.wqx.jpo.3
            @Override // java.lang.Runnable
            public void run() {
                InterfaceC0113jpo interfaceC0113jpo2 = interfaceC0113jpo;
                if (interfaceC0113jpo2 != null) {
                    interfaceC0113jpo2.jpo(z10);
                }
            }
        });
    }
}
