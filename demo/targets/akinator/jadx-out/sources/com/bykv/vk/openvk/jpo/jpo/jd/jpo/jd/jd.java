package com.bykv.vk.openvk.jpo.jpo.jd.jpo.jd;

import android.content.Context;
import com.applovin.shadow.okio.Segment;
import com.bykv.vk.openvk.jpo.jpo.jpo.my.jpo;
import com.bytedance.sdk.component.jd.jpo.Cif;
import com.bytedance.sdk.component.jd.jpo.ju;
import com.bytedance.sdk.component.jd.jpo.oya;
import com.bytedance.sdk.component.jd.jpo.prr;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd {

    /* renamed from: cm, reason: collision with root package name */
    private File f16685cm;

    /* renamed from: jd, reason: collision with root package name */
    private com.bykv.vk.openvk.jpo.jpo.jpo.wqx.wqx f16686jd;
    private Context jpo;
    private File my;
    private volatile boolean wqx = false;

    /* renamed from: jj, reason: collision with root package name */
    private final List<jpo.InterfaceC0054jpo> f16687jj = new ArrayList();

    /* renamed from: qk, reason: collision with root package name */
    private volatile boolean f16688qk = false;

    public jd(Context context, com.bykv.vk.openvk.jpo.jpo.jpo.wqx.wqx wqxVar) {
        this.f16685cm = null;
        this.my = null;
        this.jpo = context;
        this.f16686jd = wqxVar;
        this.f16685cm = com.bykv.vk.openvk.jpo.jpo.jd.cm.jd.jd(wqxVar.my(), wqxVar.sq());
        this.my = com.bykv.vk.openvk.jpo.jpo.jd.cm.jd.wqx(wqxVar.my(), wqxVar.sq());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cm() {
        try {
            this.my.delete();
            this.f16685cm.delete();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void my() {
        try {
            if (this.f16685cm.renameTo(this.my)) {
                return;
            }
            throw new IOException("Error renaming file " + this.f16685cm + " to " + this.my + " for completion!");
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    private void wqx() {
        ju.jpo jpoVarJd = com.bykv.vk.openvk.jpo.jpo.jpo.wqx.cm() != null ? com.bykv.vk.openvk.jpo.jpo.jpo.wqx.cm().jd() : new ju.jpo("v_preload");
        long jJr = this.f16686jd.jr();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        jpoVarJd.jpo(jJr, timeUnit).jd(this.f16686jd.nmd(), timeUnit).wqx(this.f16686jd.rq(), timeUnit);
        ju juVarJpo = jpoVarJd.jpo();
        Cif.jpo jpoVar = new Cif.jpo();
        final long length = this.f16685cm.length();
        int iJj = this.f16686jd.jj();
        boolean zAu = this.f16686jd.au();
        int iCm = this.f16686jd.cm();
        if (iCm > 0) {
            if (iCm >= this.f16686jd.m376if()) {
                zAu = true;
            } else {
                iJj = iCm;
            }
        }
        jpoVar.jpo("videoPreload").jpo(6);
        if (zAu) {
            jpoVar.jpo("RANGE", o2.n(length, "bytes=", "-")).jd(this.f16686jd.hna()).jpo().jd();
        } else {
            jpoVar.jpo("RANGE", "bytes=" + length + "-" + iJj).jd(this.f16686jd.hna()).jpo().jd();
        }
        juVarJpo.jpo(jpoVar.jd()).jpo(new com.bytedance.sdk.component.jd.jpo.wqx() { // from class: com.bykv.vk.openvk.jpo.jpo.jd.jpo.jd.jd.1
            @Override // com.bytedance.sdk.component.jd.jpo.wqx
            public void jpo(com.bytedance.sdk.component.jd.jpo.jd jdVar, IOException iOException) {
                jd jdVar2 = jd.this;
                jdVar2.jpo(jdVar2.f16686jd, 601, iOException.getMessage());
                wqx.jpo(jd.this.f16686jd);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r13v3 */
            @Override // com.bytedance.sdk.component.jd.jpo.wqx
            public void jpo(com.bytedance.sdk.component.jd.jpo.jd jdVar, oya oyaVar) throws IOException {
                InputStream inputStreamWqx;
                Closeable closeable;
                prr prrVarJj;
                RandomAccessFile randomAccessFile;
                long jJpo;
                long j10 = length;
                prr prrVar = null;
                try {
                } catch (Throwable th2) {
                    th = th2;
                    inputStreamWqx = null;
                    closeable = null;
                }
                if (oyaVar != null) {
                    boolean zCm = oyaVar.cm();
                    if (!zCm) {
                        jd jdVar2 = jd.this;
                        jdVar2.jpo(jdVar2.f16686jd, oyaVar.wqx(), oyaVar.my());
                        jd.this.jpo((Closeable) null);
                        jd.this.jpo((Closeable) null);
                        jd.this.jpo(prrVar);
                        jd.this.jpo(oyaVar);
                        jd.this.f16686jd.hna();
                        jd.this.f16686jd.jj();
                        wqx.jpo(jd.this.f16686jd);
                    }
                    prrVarJj = oyaVar.jj();
                    try {
                        prrVarJj = oyaVar.jj();
                        if (!zCm || prrVarJj == null) {
                            inputStreamWqx = null;
                            jJpo = 0;
                        } else {
                            jJpo = length + prrVarJj.jpo();
                            inputStreamWqx = prrVarJj.wqx();
                        }
                        try {
                        } catch (Throwable th3) {
                            th = th3;
                            randomAccessFile = prrVar;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        inputStreamWqx = null;
                        randomAccessFile = 0;
                    }
                    if (inputStreamWqx == null) {
                        jd jdVar3 = jd.this;
                        jdVar3.jpo(jdVar3.f16686jd, oyaVar.wqx(), oyaVar.my());
                    } else {
                        randomAccessFile = new RandomAccessFile(jd.this.f16685cm, "rw");
                        try {
                            byte[] bArr = new byte[Segment.SIZE];
                            int i10 = 0;
                            long j11 = 0;
                            while (true) {
                                int i11 = inputStreamWqx.read(bArr, i10, 8192 - i10);
                                if (i11 != -1) {
                                    if (jd.this.wqx) {
                                        jd jdVar4 = jd.this;
                                        jdVar4.jd(jdVar4.f16686jd, oyaVar.wqx());
                                        jd.this.jpo(randomAccessFile);
                                        break;
                                    } else {
                                        i10 += i11;
                                        j11 += i11;
                                        if (j11 % 8192 == 0 || j11 == jJpo - length) {
                                            com.bykv.vk.openvk.jpo.jpo.jd.cm.jd.jpo(randomAccessFile, bArr, Long.valueOf(j10).intValue(), i10, jd.this.f16686jd.sq());
                                            j10 += i10;
                                            i10 = 0;
                                        }
                                    }
                                } else {
                                    if (jd.this.f16686jd.au() && jJpo == jd.this.f16685cm.length()) {
                                        jd.this.my();
                                    }
                                    jd jdVar5 = jd.this;
                                    jdVar5.jpo(jdVar5.f16686jd, oyaVar.wqx());
                                    prrVar = randomAccessFile;
                                }
                            }
                            jd.this.jpo(inputStreamWqx);
                            jd.this.jpo(prrVarJj);
                        } catch (Throwable th5) {
                            th = th5;
                            prrVar = prrVarJj;
                            closeable = randomAccessFile;
                            try {
                                jd.this.cm();
                                jd jdVar6 = jd.this;
                                jdVar6.jpo(jdVar6.f16686jd, oyaVar != null ? oyaVar.wqx() : 601, th.getMessage());
                                jd.this.jpo(closeable);
                                jd.this.jpo(inputStreamWqx);
                                jd.this.jpo(prrVar);
                                jd.this.jpo(oyaVar);
                                jd.this.f16686jd.hna();
                                jd.this.f16686jd.jj();
                                wqx.jpo(jd.this.f16686jd);
                            } catch (Throwable th6) {
                                jd.this.jpo(closeable);
                                jd.this.jpo(inputStreamWqx);
                                jd.this.jpo(prrVar);
                                jd.this.jpo(oyaVar);
                                jd.this.f16686jd.hna();
                                jd.this.f16686jd.jj();
                                wqx.jpo(jd.this.f16686jd);
                                throw th6;
                            }
                        }
                        jd.this.jpo(oyaVar);
                        jd.this.f16686jd.hna();
                        jd.this.f16686jd.jj();
                        wqx.jpo(jd.this.f16686jd);
                    }
                } else {
                    jd jdVar7 = jd.this;
                    jdVar7.jpo(jdVar7.f16686jd, 601, "Network link failed.");
                    prrVarJj = null;
                    inputStreamWqx = null;
                }
                jd.this.jpo(prrVar);
                jd.this.jpo(inputStreamWqx);
                jd.this.jpo(prrVarJj);
                jd.this.jpo(oyaVar);
                jd.this.f16686jd.hna();
                jd.this.f16686jd.jj();
                wqx.jpo(jd.this.f16686jd);
            }
        });
    }

    private boolean jd() {
        if (this.my.exists()) {
            return true;
        }
        if (!this.f16686jd.au()) {
            if (this.f16685cm.length() >= this.f16686jd.jj()) {
                return true;
            }
            if (this.f16686jd.cm() > 0 && this.f16685cm.length() >= this.f16686jd.cm()) {
                return true;
            }
        }
        return false;
    }

    public void jpo(jpo.InterfaceC0054jpo interfaceC0054jpo) {
        if (this.f16688qk) {
            synchronized (jpo.InterfaceC0054jpo.class) {
                this.f16687jj.add(interfaceC0054jpo);
            }
            return;
        }
        this.f16687jj.add(interfaceC0054jpo);
        if (jd()) {
            this.f16686jd.xyk(1);
            jpo(this.f16686jd, 200);
            wqx.jpo(this.f16686jd);
        } else {
            this.f16688qk = true;
            this.f16686jd.xyk(0);
            wqx();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jd(com.bykv.vk.openvk.jpo.jpo.jpo.wqx.wqx wqxVar, int i10) {
        synchronized (jpo.InterfaceC0054jpo.class) {
            try {
                for (jpo.InterfaceC0054jpo interfaceC0054jpo : this.f16687jj) {
                    if (interfaceC0054jpo != null) {
                        interfaceC0054jpo.jd(wqxVar, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public com.bykv.vk.openvk.jpo.jpo.jpo.wqx.wqx jpo() {
        return this.f16686jd;
    }

    public void jpo(boolean z10) {
        this.wqx = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(com.bykv.vk.openvk.jpo.jpo.jpo.wqx.wqx wqxVar, int i10) {
        synchronized (jpo.InterfaceC0054jpo.class) {
            try {
                for (jpo.InterfaceC0054jpo interfaceC0054jpo : this.f16687jj) {
                    if (interfaceC0054jpo != null) {
                        interfaceC0054jpo.jpo(wqxVar, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(com.bykv.vk.openvk.jpo.jpo.jpo.wqx.wqx wqxVar, int i10, String str) {
        synchronized (jpo.InterfaceC0054jpo.class) {
            try {
                for (jpo.InterfaceC0054jpo interfaceC0054jpo : this.f16687jj) {
                    if (interfaceC0054jpo != null) {
                        interfaceC0054jpo.jpo(wqxVar, i10, str);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
