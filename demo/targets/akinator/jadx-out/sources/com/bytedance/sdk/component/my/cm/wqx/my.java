package com.bytedance.sdk.component.my.cm.wqx;

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
    private sq f18830cm;

    /* renamed from: jd, reason: collision with root package name */
    private ExecutorService f18831jd;

    /* renamed from: jj, reason: collision with root package name */
    private com.bytedance.sdk.component.my.wqx f18832jj;
    private Cif jpo;
    private opi my;

    /* renamed from: qk, reason: collision with root package name */
    private com.bytedance.sdk.component.my.jd f18833qk;
    private com.bytedance.sdk.component.my.cm wqx;
    private nmd xyk;

    /* renamed from: yd, reason: collision with root package name */
    private boolean f18834yd;
    private rq zz;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo {

        /* renamed from: cm, reason: collision with root package name */
        private sq f18835cm;

        /* renamed from: jd, reason: collision with root package name */
        private ExecutorService f18836jd;

        /* renamed from: jj, reason: collision with root package name */
        private com.bytedance.sdk.component.my.wqx f18837jj;
        private Cif jpo;
        private opi my;

        /* renamed from: qk, reason: collision with root package name */
        private com.bytedance.sdk.component.my.jd f18838qk;
        private com.bytedance.sdk.component.my.cm wqx;
        private nmd xyk;

        /* renamed from: yd, reason: collision with root package name */
        private boolean f18839yd;
        private rq zz;

        public jpo jpo(com.bytedance.sdk.component.my.jd jdVar) {
            this.f18838qk = jdVar;
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
            this.f18839yd = z10;
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
        return this.f18831jd;
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
        return this.f18830cm;
    }

    @Override // com.bytedance.sdk.component.my.au
    public com.bytedance.sdk.component.my.wqx qk() {
        return this.f18832jj;
    }

    @Override // com.bytedance.sdk.component.my.au
    public nmd wqx() {
        return this.xyk;
    }

    @Override // com.bytedance.sdk.component.my.au
    public com.bytedance.sdk.component.my.jd xyk() {
        return this.f18833qk;
    }

    @Override // com.bytedance.sdk.component.my.au
    public boolean yd() {
        return this.f18834yd;
    }

    @Override // com.bytedance.sdk.component.my.au
    public rq zz() {
        return this.zz;
    }

    private my(jpo jpoVar) {
        this.jpo = jpoVar.jpo;
        this.f18831jd = jpoVar.f18836jd;
        this.wqx = jpoVar.wqx;
        this.f18830cm = jpoVar.f18835cm;
        this.my = jpoVar.my;
        this.f18832jj = jpoVar.f18837jj;
        this.f18833qk = jpoVar.f18838qk;
        this.xyk = jpoVar.xyk;
        this.zz = jpoVar.zz;
        this.f18834yd = jpoVar.f18839yd;
    }

    public static my jpo(Context context) {
        return new jpo().jpo();
    }
}
