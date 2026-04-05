package com.bykv.vk.openvk.preload.geckox.f;

import com.bykv.vk.openvk.preload.geckox.f.a.c;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.utils.g;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    private String f17146a;

    /* renamed from: b, reason: collision with root package name */
    private String f17147b;

    /* renamed from: c, reason: collision with root package name */
    private volatile File f17148c;

    /* renamed from: d, reason: collision with root package name */
    private volatile Long f17149d;

    /* renamed from: e, reason: collision with root package name */
    private volatile com.bykv.vk.openvk.preload.geckox.f.a.a f17150e;

    /* renamed from: f, reason: collision with root package name */
    private AtomicBoolean f17151f = new AtomicBoolean(false);

    public a(String str, String str2) {
        this.f17146a = str;
        this.f17147b = str2;
    }

    private synchronized com.bykv.vk.openvk.preload.geckox.f.a.a d(String str) throws Exception {
        if (this.f17150e != null) {
            return this.f17150e;
        }
        File fileE = e(str);
        if (fileE == null) {
            throw new FileNotFoundException("channel no exist，channel:".concat(String.valueOf(str)));
        }
        File file = new File(fileE, "res.macv");
        File file2 = new File(fileE, "res");
        if (file2.exists() && file2.isDirectory()) {
            this.f17150e = new c(fileE);
        } else {
            if (!file.exists() || !file.isFile()) {
                throw new RuntimeException("can not find res, dir:" + fileE.getAbsolutePath());
            }
            this.f17150e = new com.bykv.vk.openvk.preload.geckox.f.a.b(fileE);
        }
        return this.f17150e;
    }

    private synchronized File e(String str) throws Exception {
        if (this.f17148c != null) {
            return this.f17148c;
        }
        if (this.f17149d != null && this.f17149d.longValue() == -1) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f17146a);
        String str2 = File.separator;
        sb2.append(str2);
        sb2.append(str);
        sb2.append(str2);
        sb2.append("select.lock");
        com.bykv.vk.openvk.preload.geckox.g.b bVarA = com.bykv.vk.openvk.preload.geckox.g.b.a(sb2.toString());
        try {
            if (this.f17149d == null) {
                this.f17149d = g.a(new File(this.f17146a, str));
            }
            if (this.f17149d == null) {
                this.f17149d = -1L;
                bVarA.a();
                return null;
            }
            File file = new File(this.f17146a, str2 + str + str2 + this.f17149d + str2 + "using.lock");
            this.f17148c = file.getParentFile();
            com.bykv.vk.openvk.preload.geckox.g.c.a(file.getAbsolutePath());
            File file2 = this.f17148c;
            bVarA.a();
            return file2;
        } catch (Throwable th2) {
            bVarA.a();
            throw th2;
        }
    }

    public final InputStream a(String str) throws Exception {
        return d(this.f17147b).a(a(this.f17147b, str));
    }

    public final boolean b(String str) throws Exception {
        return d(this.f17147b).b(a(this.f17147b, str));
    }

    public final int c(String str) {
        try {
            File file = new File(e(str), "res");
            if (!file.exists() || !file.isDirectory()) {
                return 0;
            }
            int length = file.listFiles().length;
            if (length > 0) {
                return length - 1;
            }
            return 0;
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    private static String a(String str, String str2) {
        return str2.substring(str.length() + 1);
    }

    public final String b() {
        return this.f17147b;
    }

    public final Long a() {
        return this.f17149d;
    }

    public final void c() throws Exception {
        if (this.f17151f.getAndSet(true)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f17146a);
        String str = File.separator;
        sb2.append(str);
        sb2.append(this.f17147b);
        sb2.append(str);
        sb2.append("select.lock");
        com.bykv.vk.openvk.preload.geckox.g.b bVarA = com.bykv.vk.openvk.preload.geckox.g.b.a(sb2.toString());
        GeckoLogger.d("gecko-file-lock", "channel version loader clean");
        try {
            if (this.f17148c == null) {
                return;
            }
            com.bykv.vk.openvk.preload.geckox.g.c.b(this.f17148c.getAbsolutePath() + str + "using.lock");
            bVarA.a();
            com.bykv.vk.openvk.preload.geckox.a.c.a(this.f17146a + str + this.f17147b);
        } finally {
            bVarA.a();
        }
    }
}
