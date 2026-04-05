package com.bytedance.sdk.component.jj.jpo.jpo;

import com.bytedance.sdk.component.jj.jpo.xyk;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd extends jpo {

    /* renamed from: jd, reason: collision with root package name */
    private final wqx f18702jd;
    private final cm jpo;
    private final Queue<String> wqx;

    public jd() {
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        this.wqx = concurrentLinkedQueue;
        this.jpo = new jj(concurrentLinkedQueue);
        this.f18702jd = new wqx();
    }

    @Override // com.bytedance.sdk.component.jj.jpo.jpo.cm
    public synchronized void jpo(com.bytedance.sdk.component.jj.jpo.cm.jpo jpoVar, int i10) {
        cm cmVar;
        if (i10 != 5) {
            try {
                if (xyk.qk().hna().jpo(xyk.qk().jj()) && (cmVar = this.jpo) != null && jpoVar != null) {
                    cmVar.jpo(jpoVar, i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        wqx wqxVar = this.f18702jd;
        if (wqxVar != null && jpoVar != null) {
            wqxVar.jpo(jpoVar, i10);
        }
    }

    @Override // com.bytedance.sdk.component.jj.jpo.jpo.cm
    public synchronized void jpo(int i10, List<com.bytedance.sdk.component.jj.jpo.cm.jpo> list) {
        try {
            Iterator<com.bytedance.sdk.component.jj.jpo.cm.jpo> it = list.iterator();
            while (it.hasNext()) {
                this.wqx.remove(it.next().wqx());
            }
            cm cmVar = this.jpo;
            if (cmVar != null) {
                cmVar.jpo(i10, list);
            }
            wqx wqxVar = this.f18702jd;
            if (wqxVar != null) {
                wqxVar.jpo(i10, list);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0018 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:3:0x0001, B:5:0x0009, B:7:0x000f, B:66:0x014b, B:69:0x0152, B:70:0x0156, B:72:0x015c, B:76:0x016e, B:11:0x0018, B:13:0x002b, B:15:0x0031, B:16:0x003d, B:18:0x0043, B:21:0x0054, B:22:0x005f, B:24:0x0065, B:25:0x006f, B:27:0x0075, B:29:0x0085, B:30:0x008d, B:31:0x0091, B:33:0x0097, B:34:0x00a5, B:35:0x00b0, B:37:0x00b6, B:38:0x00c4, B:39:0x00c9, B:41:0x00d2, B:43:0x00d8, B:44:0x00db, B:46:0x00e3, B:48:0x00e9, B:49:0x00f2, B:51:0x00f8, B:52:0x0106, B:54:0x010f, B:55:0x0113, B:57:0x0119, B:59:0x0125, B:60:0x0129, B:61:0x0134, B:63:0x013a), top: B:81:0x0001 }] */
    @Override // com.bytedance.sdk.component.jj.jpo.jpo.cm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized java.util.List<com.bytedance.sdk.component.jj.jpo.cm.jpo> jpo(int r7, int r8, java.util.List<java.lang.String> r9) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.jj.jpo.jpo.jd.jpo(int, int, java.util.List):java.util.List");
    }

    @Override // com.bytedance.sdk.component.jj.jpo.jpo.cm
    public synchronized boolean jpo(int i10, boolean z10) {
        if (this.jpo.jpo(i10, z10)) {
            com.bytedance.sdk.component.jj.jpo.wqx.jd.jpo(com.bytedance.sdk.component.jj.jpo.jd.cm.f18630cm.sz(), 1);
            return true;
        }
        if ((i10 != 1 && i10 != 2) || !this.f18702jd.jpo(i10, z10)) {
            return false;
        }
        com.bytedance.sdk.component.jj.jpo.wqx.jd.jpo(com.bytedance.sdk.component.jj.jpo.jd.cm.f18630cm.kln(), 1);
        return true;
    }

    @Override // com.bytedance.sdk.component.jj.jpo.jpo.cm
    public void jpo(int i10, long j10) {
        this.f18702jd.jpo(i10, j10);
        this.jpo.jpo(i10, j10);
    }
}
