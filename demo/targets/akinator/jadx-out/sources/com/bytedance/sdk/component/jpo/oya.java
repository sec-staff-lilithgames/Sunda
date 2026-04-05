package com.bytedance.sdk.component.jpo;

import android.text.TextUtils;
import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class oya {

    /* renamed from: cm, reason: collision with root package name */
    public final String f18771cm;

    /* renamed from: jd, reason: collision with root package name */
    public final String f18772jd;

    /* renamed from: jj, reason: collision with root package name */
    public final String f18773jj;
    public final int jpo;
    public final String my;

    /* renamed from: qk, reason: collision with root package name */
    public final String f18774qk;
    public final String wqx;
    public final String xyk;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class jpo {

        /* renamed from: cm, reason: collision with root package name */
        private String f18775cm;

        /* renamed from: jd, reason: collision with root package name */
        private String f18776jd;

        /* renamed from: jj, reason: collision with root package name */
        private String f18777jj;
        private String jpo;
        private String my;

        /* renamed from: qk, reason: collision with root package name */
        private String f18778qk;
        private String wqx;

        private jpo() {
        }

        public jpo cm(String str) {
            this.f18775cm = str;
            return this;
        }

        public jpo jd(String str) {
            this.f18776jd = str;
            return this;
        }

        public jpo jj(String str) {
            this.f18777jj = str;
            return this;
        }

        public jpo jpo(String str) {
            this.jpo = str;
            return this;
        }

        public jpo my(String str) {
            this.my = str;
            return this;
        }

        public jpo qk(String str) {
            this.f18778qk = str;
            return this;
        }

        public jpo wqx(String str) {
            this.wqx = str;
            return this;
        }

        public oya jpo() {
            return new oya(this);
        }
    }

    public static jpo jpo() {
        return new jpo();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("methodName: ");
        sb2.append(this.f18771cm);
        sb2.append(", params: ");
        sb2.append(this.my);
        sb2.append(", callbackId: ");
        sb2.append(this.f18773jj);
        sb2.append(", type: ");
        sb2.append(this.wqx);
        sb2.append(", version: ");
        return o2.o(sb2, this.f18772jd, ", ");
    }

    private oya(String str, int i10) {
        this.f18772jd = null;
        this.wqx = null;
        this.f18771cm = null;
        this.my = null;
        this.f18773jj = str;
        this.f18774qk = null;
        this.jpo = i10;
        this.xyk = null;
    }

    public static oya jpo(String str, int i10) {
        return new oya(str, i10);
    }

    public static boolean jpo(oya oyaVar) {
        return oyaVar == null || oyaVar.jpo != 1 || TextUtils.isEmpty(oyaVar.f18771cm) || TextUtils.isEmpty(oyaVar.my);
    }

    private oya(jpo jpoVar) {
        this.f18772jd = jpoVar.jpo;
        this.wqx = jpoVar.f18776jd;
        this.f18771cm = jpoVar.wqx;
        this.my = jpoVar.f18775cm;
        this.f18773jj = jpoVar.my;
        this.f18774qk = jpoVar.f18777jj;
        this.jpo = 1;
        this.xyk = jpoVar.f18778qk;
    }
}
