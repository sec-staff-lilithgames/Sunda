package com.bytedance.sdk.component.my.wqx;

import android.content.Context;
import com.bytedance.sdk.component.my.Cif;
import com.bytedance.sdk.component.my.au;
import com.bytedance.sdk.component.my.nmd;
import com.bytedance.sdk.component.my.opi;
import com.bytedance.sdk.component.my.rq;
import com.bytedance.sdk.component.my.sq;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class my implements au {

    /* renamed from: cm, reason: collision with root package name */
    private sq f18931cm;

    /* renamed from: jd, reason: collision with root package name */
    private ExecutorService f18932jd;

    /* renamed from: jj, reason: collision with root package name */
    private com.bytedance.sdk.component.my.wqx f18933jj;
    private Cif jpo;
    private opi my;

    /* renamed from: qk, reason: collision with root package name */
    private com.bytedance.sdk.component.my.jd f18934qk;
    private com.bytedance.sdk.component.my.cm wqx;
    private nmd xyk;

    /* renamed from: yd, reason: collision with root package name */
    private boolean f18935yd;
    private rq zz;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo {

        /* renamed from: cm, reason: collision with root package name */
        private sq f18936cm;

        /* renamed from: jd, reason: collision with root package name */
        private ExecutorService f18937jd;

        /* renamed from: jj, reason: collision with root package name */
        private com.bytedance.sdk.component.my.wqx f18938jj;
        private Cif jpo;
        private opi my;

        /* renamed from: qk, reason: collision with root package name */
        private com.bytedance.sdk.component.my.jd f18939qk;
        private com.bytedance.sdk.component.my.cm wqx;
        private nmd xyk;

        /* renamed from: yd, reason: collision with root package name */
        private boolean f18940yd;
        private rq zz;

        public jpo jpo(com.bytedance.sdk.component.my.jd jdVar) {
            this.f18939qk = jdVar;
            return this;
        }

        public jpo jpo(rq rqVar) {
            this.zz = rqVar;
            return this;
        }

        public jpo jpo(nmd nmdVar) {
            this.xyk = nmdVar;
            return this;
        }

        public jpo jpo(com.bytedance.sdk.component.my.cm cmVar) {
            this.wqx = cmVar;
            return this;
        }

        public jpo jpo(boolean z10) {
            this.f18940yd = z10;
            return this;
        }

        public my jpo() {
            return new my(this);
        }
    }

    @Override // com.bytedance.sdk.component.my.au
    public com.bytedance.sdk.component.my.cm cm() {
        return this.wqx;
    }

    @Override // com.bytedance.sdk.component.my.au
    public ExecutorService jd() {
        return this.f18932jd;
    }

    @Override // com.bytedance.sdk.component.my.au
    public opi jj() {
        return this.my;
    }

    @Override // com.bytedance.sdk.component.my.au
    public Cif jpo() {
        return this.jpo;
    }

    @Override // com.bytedance.sdk.component.my.au
    public sq my() {
        return this.f18931cm;
    }

    @Override // com.bytedance.sdk.component.my.au
    public com.bytedance.sdk.component.my.wqx qk() {
        return this.f18933jj;
    }

    @Override // com.bytedance.sdk.component.my.au
    public nmd wqx() {
        return this.xyk;
    }

    @Override // com.bytedance.sdk.component.my.au
    public com.bytedance.sdk.component.my.jd xyk() {
        return this.f18934qk;
    }

    @Override // com.bytedance.sdk.component.my.au
    public boolean yd() {
        return this.f18935yd;
    }

    @Override // com.bytedance.sdk.component.my.au
    public rq zz() {
        return this.zz;
    }

    private my(jpo jpoVar) {
        this.jpo = jpoVar.jpo;
        this.f18932jd = jpoVar.f18937jd;
        this.wqx = jpoVar.wqx;
        this.f18931cm = jpoVar.f18936cm;
        this.my = jpoVar.my;
        this.f18933jj = jpoVar.f18938jj;
        this.f18934qk = jpoVar.f18939qk;
        this.xyk = jpoVar.xyk;
        this.zz = jpoVar.zz;
        this.f18935yd = jpoVar.f18940yd;
    }

    public static my jpo(Context context) {
        return new jpo().jpo();
    }
}
