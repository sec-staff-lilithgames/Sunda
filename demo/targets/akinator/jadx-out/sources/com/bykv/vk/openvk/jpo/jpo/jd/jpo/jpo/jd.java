package com.bykv.vk.openvk.jpo.jpo.jd.jpo.jpo;

import a.b;
import android.content.Context;
import com.applovin.shadow.okio.Segment;
import com.bytedance.sdk.component.jd.jpo.Cif;
import com.bytedance.sdk.component.jd.jpo.ju;
import com.bytedance.sdk.component.jd.jpo.oya;
import com.bytedance.sdk.component.jd.jpo.prr;
import com.bytedance.sdk.component.utils.nmd;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd implements wqx {

    /* renamed from: cm, reason: collision with root package name */
    private File f16692cm;

    /* renamed from: ju, reason: collision with root package name */
    private final com.bykv.vk.openvk.jpo.jpo.jpo.wqx.wqx f16695ju;
    private long my;
    private File wqx;

    /* renamed from: yd, reason: collision with root package name */
    private RandomAccessFile f16697yd;
    private volatile long jpo = -2147483648L;

    /* renamed from: jd, reason: collision with root package name */
    private final Object f16693jd = new Object();

    /* renamed from: jj, reason: collision with root package name */
    private volatile long f16694jj = -1;

    /* renamed from: qk, reason: collision with root package name */
    private volatile int f16696qk = -100;
    private volatile boolean xyk = false;
    private volatile boolean zz = false;

    public jd(Context context, com.bykv.vk.openvk.jpo.jpo.jpo.wqx.wqx wqxVar) {
        this.my = 0L;
        this.f16697yd = null;
        this.f16695ju = wqxVar;
        try {
            this.wqx = com.bykv.vk.openvk.jpo.jpo.jd.cm.jd.jd(wqxVar.my(), wqxVar.sq());
            this.f16692cm = com.bykv.vk.openvk.jpo.jpo.jd.cm.jd.wqx(wqxVar.my(), wqxVar.sq());
            if (cm()) {
                this.f16697yd = new RandomAccessFile(this.f16692cm, "r");
            } else {
                this.f16697yd = new RandomAccessFile(this.wqx, "rw");
            }
            if (cm()) {
                return;
            }
            this.my = this.wqx.length();
            jpo();
        } catch (Throwable unused) {
            wqxVar.hna();
        }
    }

    private boolean cm() {
        return this.f16692cm.exists();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jj() throws IOException {
        synchronized (this.f16693jd) {
            if (cm()) {
                this.f16695ju.hna();
                this.f16695ju.sq();
                return;
            }
            try {
            } finally {
            }
            if (!this.wqx.renameTo(this.f16692cm)) {
                throw new IOException("Error renaming file " + this.wqx + " to " + this.f16692cm + " for completion!");
            }
            RandomAccessFile randomAccessFile = this.f16697yd;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.f16697yd = new RandomAccessFile(this.f16692cm, "rw");
            this.f16695ju.sq();
            this.f16695ju.hna();
        }
    }

    private long my() {
        return cm() ? this.f16692cm.length() : this.wqx.length();
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jd.jpo.jpo.wqx
    public void jd() {
        try {
            if (!this.xyk) {
                this.f16697yd.close();
            }
            File file = this.wqx;
            if (file != null) {
                file.setLastModified(System.currentTimeMillis());
            }
            File file2 = this.f16692cm;
            if (file2 != null) {
                file2.setLastModified(System.currentTimeMillis());
            }
        } catch (Throwable unused) {
        }
        this.xyk = true;
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jd.jpo.jpo.wqx
    public long wqx() throws IOException {
        if (cm()) {
            this.jpo = this.f16692cm.length();
        } else {
            synchronized (this.f16693jd) {
                int i10 = 0;
                while (this.jpo == -2147483648L) {
                    try {
                        i10 += 15;
                        try {
                            this.f16693jd.wait(5L);
                            if (i10 > 20000) {
                                return -1L;
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("total length InterruptException");
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
        return this.jpo;
    }

    public void jpo() {
        ju.jpo jpoVar;
        if (com.bykv.vk.openvk.jpo.jpo.jpo.wqx.cm() != null) {
            jpoVar = com.bykv.vk.openvk.jpo.jpo.jpo.wqx.cm().jd();
        } else {
            jpoVar = new ju.jpo("v_cache");
        }
        long jJr = this.f16695ju.jr();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        jpoVar.jpo(jJr, timeUnit).jd(this.f16695ju.nmd(), timeUnit).wqx(this.f16695ju.rq(), timeUnit);
        ju juVarJpo = jpoVar.jpo();
        this.f16695ju.sq();
        juVarJpo.jpo(new Cif.jpo().jpo("RANGE", b.g(this.my, "-", new StringBuilder("bytes="))).jd(this.f16695ju.hna()).jpo().jpo("videoLoadWhenPlaying").jpo(9).jd()).jpo(new com.bytedance.sdk.component.jd.jpo.wqx() { // from class: com.bykv.vk.openvk.jpo.jpo.jd.jpo.jpo.jd.1
            @Override // com.bytedance.sdk.component.jd.jpo.wqx
            public void jpo(com.bytedance.sdk.component.jd.jpo.jd jdVar, IOException iOException) {
                jd.this.jpo(30000, iOException.getMessage());
            }

            @Override // com.bytedance.sdk.component.jd.jpo.wqx
            public void jpo(com.bytedance.sdk.component.jd.jpo.jd jdVar, oya oyaVar) throws IOException {
                prr prrVarJj;
                boolean z10;
                if (oyaVar == null) {
                    jd.this.jpo(Sdk.SDKError.Reason.AD_INTERNAL_INTEGRATION_ERROR_VALUE, "response is empty");
                    return;
                }
                InputStream inputStreamWqx = null;
                try {
                    try {
                        jd.this.zz = oyaVar.cm();
                        if (jd.this.zz) {
                            prrVarJj = oyaVar.jj();
                            try {
                                if (jd.this.zz && prrVarJj != null) {
                                    jd.this.jpo = prrVarJj.jpo() + jd.this.my;
                                    inputStreamWqx = prrVarJj.wqx();
                                }
                                if (inputStreamWqx == null) {
                                    jd.this.jpo(Sdk.SDKError.Reason.CONFIG_NOT_FOUND_ERROR_VALUE, "input_stream is empty");
                                    if (inputStreamWqx != null) {
                                        inputStreamWqx.close();
                                    }
                                    if (prrVarJj != null) {
                                        prrVarJj.close();
                                    }
                                    oyaVar.close();
                                    if (!jd.this.zz || jd.this.wqx.length() != jd.this.jpo) {
                                        return;
                                    }
                                    jd.this.jj();
                                }
                                byte[] bArr = new byte[Segment.SIZE];
                                long j10 = jd.this.my;
                                long j11 = 0;
                                loop0: while (true) {
                                    int i10 = 0;
                                    do {
                                        int i11 = inputStreamWqx.read(bArr, i10, 8192 - i10);
                                        if (i11 == -1) {
                                            break loop0;
                                        }
                                        i10 += i11;
                                        j11 += i11;
                                        z10 = j11 % 8192 == 0 || j11 == jd.this.jpo - jd.this.my;
                                        long unused = jd.this.jpo;
                                        long unused2 = jd.this.my;
                                        jd.this.f16695ju.sq();
                                        jd.this.f16695ju.hna();
                                    } while (!z10);
                                    synchronized (jd.this.f16693jd) {
                                        com.bykv.vk.openvk.jpo.jpo.jd.cm.jd.jpo(jd.this.f16697yd, bArr, Long.valueOf(j10).intValue(), i10, jd.this.f16695ju.sq());
                                    }
                                    j10 += i10;
                                }
                                long unused3 = jd.this.my;
                                long unused4 = jd.this.jpo;
                                long unused5 = jd.this.jpo;
                                long unused6 = jd.this.my;
                                jd.this.f16695ju.hna();
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    jd.this.jpo(Sdk.SDKError.Reason.AD_PUBLISHER_MISMATCH_VALUE, th.getMessage());
                                    if (inputStreamWqx != null) {
                                        inputStreamWqx.close();
                                    }
                                    if (prrVarJj != null) {
                                        prrVarJj.close();
                                    }
                                    oyaVar.close();
                                    if (jd.this.zz && jd.this.wqx.length() == jd.this.jpo) {
                                        jd.this.jj();
                                        return;
                                    }
                                    return;
                                } catch (Throwable th3) {
                                    if (inputStreamWqx != null) {
                                        try {
                                            inputStreamWqx.close();
                                        } catch (Throwable unused7) {
                                            throw th3;
                                        }
                                    }
                                    if (prrVarJj != null) {
                                        prrVarJj.close();
                                    }
                                    oyaVar.close();
                                    if (jd.this.zz && jd.this.wqx.length() == jd.this.jpo) {
                                        jd.this.jj();
                                    }
                                    throw th3;
                                }
                            }
                        } else {
                            jd.this.jpo(oyaVar.wqx(), oyaVar.my());
                            prrVarJj = null;
                        }
                        if (inputStreamWqx != null) {
                            inputStreamWqx.close();
                        }
                        if (prrVarJj != null) {
                            prrVarJj.close();
                        }
                        oyaVar.close();
                        if (!jd.this.zz || jd.this.wqx.length() != jd.this.jpo) {
                            return;
                        }
                        jd.this.jj();
                    } catch (Throwable th4) {
                        th = th4;
                        prrVarJj = null;
                    }
                } catch (Throwable unused8) {
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(int i10, String str) {
        JSONObject jSONObjectWqx;
        this.zz = false;
        this.f16696qk = i10;
        this.jpo = this.f16694jj;
        nmd.jd("CSJ_MediaDLPlay", "handleFailResponse: ", Integer.valueOf(i10), " ", str);
        com.bykv.vk.openvk.jpo.jpo.jpo.wqx.wqx wqxVar = this.f16695ju;
        if (wqxVar == null || !wqxVar.jpo() || (jSONObjectWqx = this.f16695ju.wqx()) == null) {
            return;
        }
        try {
            jSONObjectWqx.put("error_real_code", i10);
            jSONObjectWqx.put("error_real_msg", str);
        } catch (Throwable th2) {
            nmd.jpo("CSJ_MediaDLPlay", "handleFailResponse: ", th2);
        }
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jd.jpo.jpo.wqx
    public int jpo(long j10, byte[] bArr, int i10, int i11) throws IOException {
        try {
            if (j10 == this.jpo) {
                return -1;
            }
            int i12 = 0;
            int i13 = 0;
            while (!this.xyk) {
                synchronized (this.f16693jd) {
                    try {
                        if (j10 < my()) {
                            this.f16697yd.seek(j10);
                            i13 = this.f16697yd.read(bArr, i10, i11);
                        } else {
                            i12 += 33;
                            this.f16693jd.wait(33L);
                        }
                    } finally {
                    }
                }
                if (i13 > 0) {
                    return i13;
                }
                com.bykv.vk.openvk.jpo.jpo.jpo.wqx.wqx wqxVar = this.f16695ju;
                if (wqxVar != null && wqxVar.jpo() && this.f16696qk != -100 && (!this.zz || this.jpo == this.f16694jj)) {
                    throw new IOException();
                }
                if (i12 >= 20000) {
                    throw new SocketTimeoutException();
                }
            }
            return -1;
        } catch (Throwable th2) {
            if (th2 instanceof IOException) {
                throw th2;
            }
            throw new IOException();
        }
    }
}
