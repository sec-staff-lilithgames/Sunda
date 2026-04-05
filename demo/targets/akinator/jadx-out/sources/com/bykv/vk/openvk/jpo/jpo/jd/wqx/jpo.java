package com.bykv.vk.openvk.jpo.jpo.jd.wqx;

import com.bykv.vk.openvk.jpo.jpo.jd.wqx.wqx;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class jpo implements wqx {

    /* renamed from: cm, reason: collision with root package name */
    private wqx.jpo f16733cm;

    /* renamed from: jd, reason: collision with root package name */
    private wqx.my f16734jd;

    /* renamed from: jj, reason: collision with root package name */
    private wqx.qk f16735jj;
    protected boolean jpo = false;
    private wqx.jj my;

    /* renamed from: qk, reason: collision with root package name */
    private wqx.InterfaceC0051wqx f16736qk;
    private wqx.jd wqx;
    private wqx.cm xyk;

    public final void cm() {
        try {
            wqx.jj jjVar = this.my;
            if (jjVar != null) {
                jjVar.wqx(this);
            }
        } catch (Throwable unused) {
        }
    }

    public final void jd() {
        try {
            wqx.my myVar = this.f16734jd;
            if (myVar != null) {
                myVar.jd(this);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jd.wqx.wqx
    public final void jpo(wqx.my myVar) {
        this.f16734jd = myVar;
    }

    public final void wqx() {
        try {
            wqx.jd jdVar = this.wqx;
            if (jdVar != null) {
                jdVar.jpo(this);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jd.wqx.wqx
    public final void jpo(wqx.jd jdVar) {
        this.wqx = jdVar;
    }

    public final boolean jd(int i10, int i11) {
        try {
            wqx.cm cmVar = this.xyk;
            if (cmVar != null) {
                if (cmVar.jd(this, i10, i11)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jd.wqx.wqx
    public final void jpo(wqx.jpo jpoVar) {
        this.f16733cm = jpoVar;
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jd.wqx.wqx
    public final void jpo(wqx.jj jjVar) {
        this.my = jjVar;
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jd.wqx.wqx
    public final void jpo(wqx.InterfaceC0051wqx interfaceC0051wqx) {
        this.f16736qk = interfaceC0051wqx;
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jd.wqx.wqx
    public final void jpo(wqx.cm cmVar) {
        this.xyk = cmVar;
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jd.wqx.wqx
    public final void jpo(wqx.qk qkVar) {
        this.f16735jj = qkVar;
    }

    public void jpo() {
        this.f16734jd = null;
        this.f16733cm = null;
        this.wqx = null;
        this.my = null;
        this.f16735jj = null;
        this.f16736qk = null;
        this.xyk = null;
    }

    public final void jpo(int i10) {
        try {
            wqx.jpo jpoVar = this.f16733cm;
            if (jpoVar != null) {
                jpoVar.jpo(this, i10);
            }
        } catch (Throwable unused) {
        }
    }

    public final void jpo(int i10, int i11, int i12, int i13) {
        try {
            wqx.qk qkVar = this.f16735jj;
            if (qkVar != null) {
                qkVar.jpo(this, i10, i11, i12, i13);
            }
        } catch (Throwable unused) {
        }
    }

    public final boolean jpo(int i10, int i11) {
        try {
            wqx.InterfaceC0051wqx interfaceC0051wqx = this.f16736qk;
            if (interfaceC0051wqx != null) {
                if (interfaceC0051wqx.jpo(this, i10, i11)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jd.wqx.wqx
    public void jpo(boolean z10) {
        this.jpo = z10;
    }
}
