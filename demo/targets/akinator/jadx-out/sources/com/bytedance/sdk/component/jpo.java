package com.bytedance.sdk.component;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {

    /* renamed from: au, reason: collision with root package name */
    private static ArrayMap<File, jpo> f18746au = null;

    /* renamed from: if, reason: not valid java name */
    private static ArrayMap<String, File> f72if = null;

    /* renamed from: jd, reason: collision with root package name */
    private static boolean f18747jd = false;
    protected static InterfaceC0086jpo jpo;

    /* renamed from: cm, reason: collision with root package name */
    private final Object f18748cm;

    /* renamed from: jj, reason: collision with root package name */
    private volatile boolean f18749jj;

    /* renamed from: ju, reason: collision with root package name */
    private final File f18750ju;
    private Properties my;

    /* renamed from: qk, reason: collision with root package name */
    private int f18751qk;
    private final Object wqx;
    private long xyk;

    /* renamed from: yd, reason: collision with root package name */
    private final File f18752yd;
    private long zz;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jd {

        /* renamed from: cm, reason: collision with root package name */
        volatile boolean f18754cm;

        /* renamed from: jd, reason: collision with root package name */
        final Properties f18755jd;
        final long jpo;
        boolean my;
        final CountDownLatch wqx;

        public void jpo(boolean z10, boolean z11) {
            this.my = z10;
            this.f18754cm = z11;
            this.wqx.countDown();
        }

        private jd(long j10, Properties properties) {
            this.wqx = new CountDownLatch(1);
            this.f18754cm = false;
            this.my = false;
            this.jpo = j10;
            this.f18755jd = properties;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.sdk.component.jpo$jpo, reason: collision with other inner class name */
    public interface InterfaceC0086jpo {
        ExecutorService getExecutorService();

        HandlerThread getSafeHandlerThread(String str, int i10);
    }

    private jpo(File file) {
        Object obj = new Object();
        this.wqx = obj;
        this.f18748cm = new Object();
        this.my = new Properties();
        this.f18749jj = false;
        this.f18751qk = 0;
        this.f18752yd = file;
        this.f18750ju = jpo(file);
        synchronized (obj) {
            this.f18749jj = false;
        }
        InterfaceC0086jpo interfaceC0086jpo = jpo;
        if (interfaceC0086jpo == null || interfaceC0086jpo.getExecutorService() == null) {
            new Thread("TTPropHelper") { // from class: com.bytedance.sdk.component.jpo.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    jpo.this.jpo();
                }
            }.start();
        } else {
            jpo.getExecutorService().execute(new Runnable() { // from class: com.bytedance.sdk.component.jpo.2
                @Override // java.lang.Runnable
                public void run() {
                    jpo.this.jpo();
                }
            });
        }
    }

    public static /* synthetic */ long jj(jpo jpoVar) {
        long j10 = jpoVar.xyk;
        jpoVar.xyk = 1 + j10;
        return j10;
    }

    public static /* synthetic */ int my(jpo jpoVar) {
        int i10 = jpoVar.f18751qk;
        jpoVar.f18751qk = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int zz(jpo jpoVar) {
        int i10 = jpoVar.f18751qk;
        jpoVar.f18751qk = i10 - 1;
        return i10;
    }

    private void cm() throws InterruptedException {
        while (!this.f18749jj) {
            try {
                this.wqx.wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public wqx jd() {
        return new wqx();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class wqx implements SharedPreferences.Editor {

        /* renamed from: jd, reason: collision with root package name */
        private final Object f18784jd = new Object();
        private final Map<String, Object> wqx = new HashMap();

        /* renamed from: cm, reason: collision with root package name */
        private boolean f18783cm = false;

        public wqx() {
        }

        private jd jd() {
            Properties properties;
            long j10;
            Object obj;
            boolean z10;
            synchronized (jpo.this.wqx) {
                try {
                    if (jpo.this.f18751qk > 0) {
                        Properties properties2 = new Properties();
                        properties2.putAll(jpo.this.my);
                        jpo.this.my = properties2;
                    }
                    properties = jpo.this.my;
                    jpo.my(jpo.this);
                    synchronized (this.f18784jd) {
                        try {
                            boolean z11 = false;
                            if (this.f18783cm) {
                                if (properties.isEmpty()) {
                                    z10 = false;
                                } else {
                                    properties.clear();
                                    z10 = true;
                                }
                                this.f18783cm = false;
                                z11 = z10;
                            }
                            for (Map.Entry<String, Object> entry : this.wqx.entrySet()) {
                                String key = entry.getKey();
                                Object value = entry.getValue();
                                if (value == this || value == null) {
                                    if (properties.containsKey(key)) {
                                        properties.remove(key);
                                        z11 = true;
                                    }
                                } else if (!properties.containsKey(key) || (obj = properties.get(key)) == null || !obj.equals(String.valueOf(value))) {
                                    properties.put(key, String.valueOf(value));
                                    z11 = true;
                                }
                            }
                            this.wqx.clear();
                            if (z11) {
                                jpo.jj(jpo.this);
                            }
                            j10 = jpo.this.xyk;
                        } finally {
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return new jd(j10, properties);
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            jpo.this.jpo(jd(), false);
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            long jCurrentTimeMillis = jpo.f18747jd ? System.currentTimeMillis() : 0L;
            jd jdVarJd = jd();
            jpo.this.jpo(jdVarJd, true);
            try {
                jdVarJd.wqx.await();
                if (jpo.f18747jd) {
                    Log.d("TTPropHelper", jpo.this.f18752yd.getName() + ":" + jdVarJd.jpo + " committed after " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
                }
                return jdVarJd.f18754cm;
            } catch (InterruptedException unused) {
                if (!jpo.f18747jd) {
                    return false;
                }
                Log.d("TTPropHelper", jpo.this.f18752yd.getName() + ":" + jdVarJd.jpo + " committed after " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
                return false;
            } catch (Throwable th2) {
                if (jpo.f18747jd) {
                    Log.d("TTPropHelper", jpo.this.f18752yd.getName() + ":" + jdVarJd.jpo + " committed after " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
                }
                throw th2;
            }
        }

        public wqx jpo(String str, Set<String> set) {
            synchronized (this.f18784jd) {
                this.wqx.put(str, set == null ? null : new HashSet(set));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public /* synthetic */ SharedPreferences.Editor putStringSet(String str, Set set) {
            return jpo(str, (Set<String>) set);
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
        public wqx putInt(String str, int i10) {
            synchronized (this.f18784jd) {
                this.wqx.put(str, Integer.valueOf(i10));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
        public wqx putLong(String str, long j10) {
            synchronized (this.f18784jd) {
                this.wqx.put(str, Long.valueOf(j10));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
        public wqx putFloat(String str, float f10) {
            synchronized (this.f18784jd) {
                this.wqx.put(str, Float.valueOf(f10));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
        public wqx putString(String str, String str2) {
            synchronized (this.f18784jd) {
                this.wqx.put(str, str2);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
        public wqx putBoolean(String str, boolean z10) {
            synchronized (this.f18784jd) {
                this.wqx.put(str, Boolean.valueOf(z10));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
        public wqx remove(String str) {
            synchronized (this.f18784jd) {
                this.wqx.put(str, this);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
        public wqx clear() {
            synchronized (this.f18784jd) {
                this.f18783cm = true;
            }
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0115 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0122 A[Catch: all -> 0x0127, TryCatch #6 {all -> 0x0127, blocks: (B:39:0x0090, B:40:0x0092, B:78:0x011e, B:80:0x0122, B:84:0x012b, B:86:0x0134, B:88:0x013c, B:90:0x0148, B:98:0x0193, B:99:0x0194, B:59:0x00f0, B:77:0x011d, B:63:0x00f7, B:97:0x0192, B:96:0x0189), top: B:118:0x0090, inners: #3, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0134 A[Catch: all -> 0x0127, TryCatch #6 {all -> 0x0127, blocks: (B:39:0x0090, B:40:0x0092, B:78:0x011e, B:80:0x0122, B:84:0x012b, B:86:0x0134, B:88:0x013c, B:90:0x0148, B:98:0x0193, B:99:0x0194, B:59:0x00f0, B:77:0x011d, B:63:0x00f7, B:97:0x0192, B:96:0x0189), top: B:118:0x0090, inners: #3, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0148 A[Catch: all -> 0x0127, TRY_LEAVE, TryCatch #6 {all -> 0x0127, blocks: (B:39:0x0090, B:40:0x0092, B:78:0x011e, B:80:0x0122, B:84:0x012b, B:86:0x0134, B:88:0x013c, B:90:0x0148, B:98:0x0193, B:99:0x0194, B:59:0x00f0, B:77:0x011d, B:63:0x00f7, B:97:0x0192, B:96:0x0189), top: B:118:0x0090, inners: #3, #10 }] */
    /* JADX WARN: Type inference failed for: r11v18, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void jd(com.bytedance.sdk.component.jpo.jd r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.jpo.jd(com.bytedance.sdk.component.jpo$jd, boolean):void");
    }

    public static void jpo(InterfaceC0086jpo interfaceC0086jpo) {
        jpo = interfaceC0086jpo;
    }

    public static jpo jpo(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "tt_prop";
        }
        synchronized (jpo.class) {
            try {
                if (f72if == null) {
                    f72if = new ArrayMap<>();
                }
                File file = f72if.get(str);
                if (file == null) {
                    file = new File(context.getFilesDir(), str);
                    f72if.put(str, file);
                }
                if (f18746au == null) {
                    f18746au = new ArrayMap<>();
                }
                jpo jpoVar = f18746au.get(file);
                if (jpoVar != null) {
                    return jpoVar;
                }
                jpo jpoVar2 = new jpo(file);
                f18746au.put(file, jpoVar2);
                return jpoVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static File jpo(File file) {
        return new File(file.getPath() + ".bak");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void jpo() {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.jpo.jpo():void");
    }

    public String jpo(String str, String str2) {
        String property;
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        synchronized (this.wqx) {
            cm();
            property = this.my.getProperty(str, str2);
        }
        return property;
    }

    public int jpo(String str, int i10) {
        int i11;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.wqx) {
                try {
                    try {
                        cm();
                        i11 = Integer.parseInt(this.my.getProperty(str, String.valueOf(i10)));
                    } catch (NumberFormatException e10) {
                        Log.e("TTPropHelper", e10.getMessage());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return i11;
        }
        return i10;
    }

    public long jpo(String str, long j10) {
        long j11;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.wqx) {
                try {
                    try {
                        cm();
                        j11 = Long.parseLong(this.my.getProperty(str, String.valueOf(j10)));
                    } catch (NumberFormatException e10) {
                        Log.e("TTPropHelper", e10.getMessage());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return j11;
        }
        return j10;
    }

    public float jpo(String str, float f10) {
        float f11;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.wqx) {
                try {
                    try {
                        cm();
                        f11 = Float.parseFloat(this.my.getProperty(str, String.valueOf(f10)));
                    } catch (NumberFormatException e10) {
                        Log.e("TTPropHelper", e10.getMessage());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return f11;
        }
        return f10;
    }

    public boolean jpo(String str, boolean z10) {
        boolean z11;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.wqx) {
                try {
                    try {
                        cm();
                        z11 = Boolean.parseBoolean(this.my.getProperty(str, String.valueOf(z10)));
                    } catch (NumberFormatException e10) {
                        Log.e("TTPropHelper", e10.getMessage());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return z11;
        }
        return z10;
    }

    public boolean jpo(String str) {
        boolean zContainsKey;
        synchronized (this.wqx) {
            try {
                try {
                    cm();
                    zContainsKey = this.my.containsKey(str);
                } catch (NumberFormatException e10) {
                    Log.e("TTPropHelper", e10.getMessage());
                    return false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zContainsKey;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(final jd jdVar, final boolean z10) {
        boolean z11;
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.jpo.3
            @Override // java.lang.Runnable
            public void run() {
                synchronized (jpo.this.f18748cm) {
                    try {
                        jpo.this.jd(jdVar, z10);
                    } catch (OutOfMemoryError unused) {
                    }
                }
                synchronized (jpo.this.wqx) {
                    jpo.zz(jpo.this);
                }
            }
        };
        if (z10) {
            synchronized (this.wqx) {
                z11 = this.f18751qk == 1;
            }
            if (z11) {
                runnable.run();
                return;
            }
        }
        com.bytedance.sdk.component.jd.jpo(runnable, true ^ z10);
    }
}
