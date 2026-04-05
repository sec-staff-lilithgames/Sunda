package com.bytedance.sdk.openadsdk.core.settings;

import android.os.SystemClock;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.openadsdk.core.settings.my;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.utils.duq;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.bytedance.sdk.openadsdk.core.settings.if, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class Cif implements my {

    /* renamed from: qk, reason: collision with root package name */
    private final String f20860qk;

    /* renamed from: yd, reason: collision with root package name */
    private jpo f20861yd;
    private final ConcurrentHashMap<String, Object> wqx = new ConcurrentHashMap<>();

    /* renamed from: cm, reason: collision with root package name */
    private final Object f20858cm = new Object();
    private final Object my = new Object();

    /* renamed from: jj, reason: collision with root package name */
    private final CountDownLatch f20859jj = new CountDownLatch(1);
    private Properties xyk = new Properties();
    private volatile boolean zz = false;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.sdk.openadsdk.core.settings.if$jpo */
    public interface jpo {
        void jd();

        void jpo();
    }

    public Cif(String str, jpo jpoVar) {
        this.f20860qk = str;
        this.f20861yd = jpoVar;
        duq.jpo(new com.bytedance.sdk.component.xyk.xyk("SetL_".concat(String.valueOf(str))) { // from class: com.bytedance.sdk.openadsdk.core.settings.if.1
            @Override // java.lang.Runnable
            public void run() {
                Cif.this.jpo(false);
            }
        });
    }

    private File jj() {
        return new File(sq.jpo().getFilesDir(), this.f20860qk);
    }

    private void my() throws InterruptedException {
        if (this.zz) {
            return;
        }
        try {
            SystemClock.elapsedRealtime();
            this.f20859jj.await(duq.jj() ? 4 : 8, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            nmd.jpo("SdkSettings.Prop", "awaitLoadedLocked: ", e10);
        }
    }

    public void cm() {
        jpo jpoVar = this.f20861yd;
        if (jpoVar != null) {
            jpoVar.jd();
        }
    }

    public void wqx() {
        File fileJj = jj();
        if (fileJj.exists()) {
            fileJj.delete();
        }
    }

    public boolean jd() {
        return this.zz;
    }

    public String jpo(String str, String str2) {
        if (str == null || str.isEmpty()) {
            return str2;
        }
        my();
        return this.xyk.getProperty(str, str2);
    }

    public int jpo(String str, int i10) {
        if (str != null && !str.isEmpty()) {
            my();
            try {
                return Integer.parseInt(this.xyk.getProperty(str, String.valueOf(i10)));
            } catch (NumberFormatException e10) {
                nmd.jpo("SdkSettings.Prop", "", e10);
            }
        }
        return i10;
    }

    public long jpo(String str, long j10) {
        if (str != null && !str.isEmpty()) {
            my();
            try {
                return Long.parseLong(this.xyk.getProperty(str, String.valueOf(j10)));
            } catch (NumberFormatException e10) {
                nmd.jpo("SdkSettings.Prop", "", e10);
            }
        }
        return j10;
    }

    public float jpo(String str, float f10) throws InterruptedException {
        if (str != null && !str.isEmpty()) {
            my();
            try {
                return Float.parseFloat(this.xyk.getProperty(str, String.valueOf(f10)));
            } catch (NumberFormatException e10) {
                nmd.jpo("SdkSettings.Prop", "", e10);
            }
        }
        return f10;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.sdk.openadsdk.core.settings.if$jd */
    public class jd implements my.jpo {

        /* renamed from: jd, reason: collision with root package name */
        private final Map<String, Object> f20862jd = new HashMap();
        private final Object wqx = new Object();

        public jd() {
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.my.jpo
        public void jpo() {
            Object obj;
            Properties properties = new Properties();
            synchronized (this.wqx) {
                try {
                    properties.putAll(Cif.this.xyk);
                    boolean z10 = false;
                    for (Map.Entry<String, Object> entry : this.f20862jd.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (value != this && value != null) {
                            if (properties.containsKey(key) && (obj = properties.get(key)) != null && obj.equals(value)) {
                            }
                            properties.put(key, String.valueOf(value));
                            z10 = true;
                        } else if (properties.containsKey(key)) {
                            properties.remove(key);
                            z10 = true;
                        }
                    }
                    this.f20862jd.clear();
                    if (z10) {
                        Cif.this.jpo(properties);
                        Cif.this.xyk = properties;
                        Cif.this.wqx.clear();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.my.jpo
        public my.jpo jpo(String str, String str2) {
            synchronized (this.wqx) {
                this.f20862jd.put(str, str2);
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.my.jpo
        public my.jpo jpo(String str, int i10) {
            synchronized (this.wqx) {
                this.f20862jd.put(str, Integer.valueOf(i10));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.my.jpo
        public my.jpo jpo(String str, long j10) {
            synchronized (this.wqx) {
                this.f20862jd.put(str, Long.valueOf(j10));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.my.jpo
        public my.jpo jpo(String str) {
            synchronized (this.wqx) {
                this.f20862jd.put(str, this);
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.my.jpo
        public my.jpo jpo(String str, float f10) {
            synchronized (this.wqx) {
                this.f20862jd.put(str, Float.valueOf(f10));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.my.jpo
        public my.jpo jpo(String str, boolean z10) {
            synchronized (this.wqx) {
                this.f20862jd.put(str, Boolean.valueOf(z10));
            }
            return this;
        }
    }

    public boolean jpo(String str, boolean z10) throws InterruptedException {
        if (str != null && !str.isEmpty()) {
            my();
            try {
                return Boolean.parseBoolean(this.xyk.getProperty(str, String.valueOf(z10)));
            } catch (Exception e10) {
                nmd.jpo("SdkSettings.Prop", "", e10);
            }
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00f9 A[Catch: all -> 0x000b, TryCatch #6 {all -> 0x000b, blocks: (B:4:0x0003, B:7:0x0009, B:11:0x000e, B:13:0x0019, B:22:0x0049, B:30:0x0061, B:23:0x004d, B:62:0x00f5, B:64:0x00f9, B:66:0x00fd, B:67:0x0100, B:68:0x0107, B:29:0x005e, B:41:0x007a, B:42:0x007d, B:43:0x0082, B:39:0x0074, B:44:0x0083, B:46:0x008d, B:48:0x0097, B:50:0x00ac, B:51:0x00bc, B:53:0x00c2, B:55:0x00d4, B:58:0x00dc, B:60:0x00e7, B:61:0x00ea, B:27:0x0055, B:37:0x006b, B:34:0x0066), top: B:79:0x0003, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void jpo(boolean r9) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.settings.Cif.jpo(boolean):void");
    }

    public my.jpo jpo() {
        return new jd();
    }

    public <T> T jpo(String str, T t10, my.jd<T> jdVar) throws InterruptedException {
        T tJd;
        if (str != null && !str.isEmpty()) {
            T t11 = (T) this.wqx.get(str);
            if (t11 != null) {
                return t11;
            }
            my();
            String property = this.xyk.getProperty(str, null);
            if (property != null && jdVar != null && (tJd = jdVar.jd(property)) != null) {
                this.wqx.put(str, tJd);
                return tJd;
            }
        }
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(Properties properties) {
        FileOutputStream fileOutputStream;
        synchronized (this.my) {
            File fileJj = jj();
            FileOutputStream fileOutputStream2 = null;
            try {
                try {
                    fileOutputStream = new FileOutputStream(fileJj);
                } catch (Exception e10) {
                    e = e10;
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                properties.store(fileOutputStream, (String) null);
                fileJj.getAbsolutePath();
                com.bytedance.sdk.openadsdk.utils.au.jpo(fileOutputStream);
            } catch (Exception e11) {
                e = e11;
                fileOutputStream2 = fileOutputStream;
                nmd.jpo("SdkSettings.Prop", "saveToLocal: ", e);
                if (fileOutputStream2 != null) {
                    com.bytedance.sdk.openadsdk.utils.au.jpo(fileOutputStream2);
                }
                au.kgu();
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream2 = fileOutputStream;
                if (fileOutputStream2 != null) {
                    com.bytedance.sdk.openadsdk.utils.au.jpo(fileOutputStream2);
                }
                throw th;
            }
        }
        au.kgu();
    }
}
