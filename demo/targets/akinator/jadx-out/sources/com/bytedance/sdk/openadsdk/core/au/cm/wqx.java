package com.bytedance.sdk.openadsdk.core.au.cm;

import com.bykv.vk.openvk.jpo.jpo.jd.wqx.cm;
import com.bykv.vk.openvk.jpo.jpo.jpo.jpo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx extends cm {

    /* renamed from: cm, reason: collision with root package name */
    private final jpo f20133cm;
    private final List<jd> jpo = Collections.synchronizedList(new ArrayList());

    /* renamed from: jd, reason: collision with root package name */
    private int f20134jd = 1;
    private int wqx = 1;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface jd extends jpo.InterfaceC0053jpo {
        void jpo(int i10, int i11);
    }

    public wqx() {
        jpo jpoVar = new jpo();
        this.f20133cm = jpoVar;
        super.jpo(jpoVar);
        jpo(500);
    }

    public static /* synthetic */ int jpo(wqx wqxVar) {
        int i10 = wqxVar.wqx;
        wqxVar.wqx = i10 + 1;
        return i10;
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jd.wqx.cm
    public long hna() {
        return super.hna() * this.f20134jd;
    }

    public int nmd() {
        return this.wqx;
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jd.wqx.cm
    public long sq() {
        long jSq = super.sq();
        return this.f20134jd == 1 ? jSq : ((this.wqx - 1) * super.hna()) + jSq;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class jpo implements jpo.InterfaceC0053jpo {
        private jpo() {
        }

        @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jpo.InterfaceC0053jpo
        public void cm(com.bykv.vk.openvk.jpo.jpo.jpo.jpo jpoVar) {
            Iterator it = wqx.this.jpo.iterator();
            while (it.hasNext()) {
                ((jd) it.next()).cm(jpoVar);
            }
        }

        @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jpo.InterfaceC0053jpo
        public void jd(com.bykv.vk.openvk.jpo.jpo.jpo.jpo jpoVar) {
            Iterator it = wqx.this.jpo.iterator();
            while (it.hasNext()) {
                ((jd) it.next()).jd(jpoVar);
            }
        }

        @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jpo.InterfaceC0053jpo
        public void jpo(com.bykv.vk.openvk.jpo.jpo.jpo.jpo jpoVar) {
            wqx.jpo(wqx.this);
            if (wqx.this.wqx > wqx.this.f20134jd) {
                Iterator it = wqx.this.jpo.iterator();
                while (it.hasNext()) {
                    ((jd) it.next()).jpo(jpoVar);
                }
            } else {
                Iterator it2 = wqx.this.jpo.iterator();
                while (it2.hasNext()) {
                    ((jd) it2.next()).jpo(wqx.this.wqx, wqx.this.f20134jd);
                }
                wqx.this.zz();
            }
        }

        @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jpo.InterfaceC0053jpo
        public void my(com.bykv.vk.openvk.jpo.jpo.jpo.jpo jpoVar) {
            Iterator it = wqx.this.jpo.iterator();
            while (it.hasNext()) {
                ((jd) it.next()).my(jpoVar);
            }
        }

        @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jpo.InterfaceC0053jpo
        public void wqx(com.bykv.vk.openvk.jpo.jpo.jpo.jpo jpoVar) {
            Iterator it = wqx.this.jpo.iterator();
            while (it.hasNext()) {
                ((jd) it.next()).wqx(jpoVar);
            }
        }

        @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jpo.InterfaceC0053jpo
        public void jd(com.bykv.vk.openvk.jpo.jpo.jpo.jpo jpoVar, int i10) {
            Iterator it = wqx.this.jpo.iterator();
            while (it.hasNext()) {
                ((jd) it.next()).jd(jpoVar, i10);
            }
        }

        @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jpo.InterfaceC0053jpo
        public void jpo(com.bykv.vk.openvk.jpo.jpo.jpo.jpo jpoVar, long j10) {
            Iterator it = wqx.this.jpo.iterator();
            while (it.hasNext()) {
                ((jd) it.next()).jpo(jpoVar, j10);
            }
        }

        @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jpo.InterfaceC0053jpo
        public void jpo(com.bykv.vk.openvk.jpo.jpo.jpo.jpo jpoVar, com.bykv.vk.openvk.jpo.jpo.jpo.wqx.jpo jpoVar2) {
            Iterator it = wqx.this.jpo.iterator();
            while (it.hasNext()) {
                ((jd) it.next()).jpo(jpoVar, jpoVar2);
            }
        }

        @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jpo.InterfaceC0053jpo
        public void jpo(com.bykv.vk.openvk.jpo.jpo.jpo.jpo jpoVar, boolean z10) {
            Iterator it = wqx.this.jpo.iterator();
            while (it.hasNext()) {
                ((jd) it.next()).jpo(jpoVar, z10);
            }
        }

        @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jpo.InterfaceC0053jpo
        public void jpo(com.bykv.vk.openvk.jpo.jpo.jpo.jpo jpoVar, int i10, int i11) {
            Iterator it = wqx.this.jpo.iterator();
            while (it.hasNext()) {
                ((jd) it.next()).jpo(jpoVar, i10, i11);
            }
        }

        @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jpo.InterfaceC0053jpo
        public void jpo(com.bykv.vk.openvk.jpo.jpo.jpo.jpo jpoVar, int i10, int i11, int i12) {
            Iterator it = wqx.this.jpo.iterator();
            while (it.hasNext()) {
                ((jd) it.next()).jpo(jpoVar, i10, i11, i12);
            }
        }

        @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jpo.InterfaceC0053jpo
        public void jpo(com.bykv.vk.openvk.jpo.jpo.jpo.jpo jpoVar, int i10) {
            Iterator it = wqx.this.jpo.iterator();
            while (it.hasNext()) {
                ((jd) it.next()).jpo(jpoVar, i10);
            }
        }

        @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jpo.InterfaceC0053jpo
        public void jpo(com.bykv.vk.openvk.jpo.jpo.jpo.jpo jpoVar, long j10, long j11) {
            Iterator it = wqx.this.jpo.iterator();
            while (it.hasNext()) {
                ((jd) it.next()).jpo(jpoVar, j10, j11);
            }
        }
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jd.wqx.cm
    public void jpo(jpo.InterfaceC0053jpo interfaceC0053jpo) {
        if (!(interfaceC0053jpo instanceof jd)) {
            super.jpo(interfaceC0053jpo);
        } else {
            if (this.jpo.contains(interfaceC0053jpo)) {
                return;
            }
            this.jpo.add((jd) interfaceC0053jpo);
        }
    }

    public void wqx(int i10) {
        this.f20134jd = Math.max(1, i10);
    }
}
