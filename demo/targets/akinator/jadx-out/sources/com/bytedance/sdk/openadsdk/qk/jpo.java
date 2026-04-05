package com.bytedance.sdk.openadsdk.qk;

import android.util.Pair;
import com.bykv.vk.openvk.preload.geckox.buffer.stream.BufferOutputStream;
import com.bykv.vk.openvk.preload.geckox.net.INetWork;
import com.bykv.vk.openvk.preload.geckox.net.Response;
import com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils;
import com.bytedance.sdk.component.jd.jpo.Cif;
import com.bytedance.sdk.component.jd.jpo.au;
import com.bytedance.sdk.component.jd.jpo.jj;
import com.bytedance.sdk.component.jd.jpo.ju;
import com.bytedance.sdk.component.jd.jpo.my;
import com.bytedance.sdk.component.jd.jpo.oya;
import com.bytedance.sdk.component.jd.jpo.wqx;
import com.bytedance.sdk.component.jd.jpo.zz;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo implements INetWork {

    /* renamed from: jd, reason: collision with root package name */
    protected ju f21467jd;
    protected ju jpo;

    public jpo() {
        ju.jpo jpoVar = new ju.jpo();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.jpo = jpoVar.jpo(10L, timeUnit).jd(10L, timeUnit).wqx(10L, timeUnit).jpo();
        this.f21467jd = new ju.jpo().jpo(10L, timeUnit).jd(30L, timeUnit).wqx(30L, timeUnit).jpo();
    }

    private Map<String, String> jpo(jj jjVar) {
        if (jjVar == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < jjVar.jpo(); i10++) {
            map.put(jjVar.jpo(i10), jjVar.jd(i10));
        }
        return map;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public Response doGet(String str) throws Exception {
        oya oyaVarJd = this.jpo.jpo(new Cif.jpo().jpo().jd(str).jpo("gecko").jd()).jd();
        return new Response(jpo(oyaVarJd.qk()), oyaVarJd.wqx() == 200 ? oyaVarJd.jj().jd() : null, oyaVarJd.wqx(), oyaVarJd.my());
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public Response doPost(String str, List<Pair<String, String>> list) throws Exception {
        my.jpo jpoVar = new my.jpo();
        if (list != null) {
            for (Pair<String, String> pair : list) {
                jpoVar.jpo((String) pair.first, (String) pair.second);
            }
        }
        oya oyaVarJd = this.jpo.jpo(new Cif.jpo().jd(str).jpo((au) jpoVar.jpo()).jpo("gecko").jd()).jd();
        return new Response(jpo(oyaVarJd.qk()), oyaVarJd.wqx() == 200 ? oyaVarJd.jj().jd() : null, oyaVarJd.wqx(), oyaVarJd.my());
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0044: MOVE (r7 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:69), block:B:12:0x0044 */
    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public void downloadFile(String str, long j10, BufferOutputStream bufferOutputStream) throws Exception {
        Exception e10;
        Closeable closeable;
        BufferedInputStream bufferedInputStream;
        Closeable closeable2 = null;
        int i10 = 0;
        try {
            try {
                try {
                    oya oyaVarJd = this.f21467jd.jpo(new Cif.jpo().jpo().jpo("gecko").jd(str).jd()).jd();
                    int iWqx = oyaVarJd.wqx();
                    try {
                        bufferedInputStream = new BufferedInputStream(oyaVarJd.jj().wqx());
                    } catch (Exception e11) {
                        e10 = e11;
                    }
                    try {
                        byte[] bArr = new byte[2048];
                        while (true) {
                            int i11 = bufferedInputStream.read(bArr, 0, 2048);
                            if (i11 == -1) {
                                CloseableUtils.close(bufferedInputStream);
                                return;
                            }
                            bufferOutputStream.write(bArr, 0, i11);
                        }
                    } catch (Exception e12) {
                        e10 = e12;
                        i10 = iWqx;
                        throw new RuntimeException("downloadFile failed, code: " + i10 + ", url:" + str + ", caused by:" + e10.getMessage(), e10);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    closeable2 = closeable;
                    CloseableUtils.close(closeable2);
                    throw th;
                }
            } catch (Exception e13) {
                e10 = e13;
            }
        } catch (Throwable th3) {
            th = th3;
            CloseableUtils.close(closeable2);
            throw th;
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public void syncDoGet(final String str) {
        this.jpo.jpo(new Cif.jpo().jpo().jd(str).jpo("gecko").jd()).jpo(new wqx() { // from class: com.bytedance.sdk.openadsdk.qk.jpo.1
            @Override // com.bytedance.sdk.component.jd.jpo.wqx
            public void jpo(com.bytedance.sdk.component.jd.jpo.jd jdVar, oya oyaVar) throws IOException {
            }

            @Override // com.bytedance.sdk.component.jd.jpo.wqx
            public void jpo(com.bytedance.sdk.component.jd.jpo.jd jdVar, IOException iOException) {
            }
        });
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public Response doPost(String str, String str2) throws Exception {
        oya oyaVarJd = this.jpo.jpo(new Cif.jpo().jd(str).jpo(au.jpo(zz.jpo("application/json; charset=utf-8"), str2)).jpo("gecko").jd()).jd();
        return new Response(jpo(oyaVarJd.qk()), oyaVarJd.wqx() == 200 ? oyaVarJd.jj().jd() : null, oyaVarJd.wqx(), oyaVarJd.my());
    }
}
