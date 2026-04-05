package com.bytedance.sdk.component.jd.jpo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class ju implements Cloneable {

    /* renamed from: cm, reason: collision with root package name */
    public long f18586cm;

    /* renamed from: jd, reason: collision with root package name */
    public long f18587jd;

    /* renamed from: jj, reason: collision with root package name */
    public long f18588jj;
    public List<xyk> jpo;
    public TimeUnit my;

    /* renamed from: qk, reason: collision with root package name */
    public TimeUnit f18589qk;
    public TimeUnit wqx;

    public ju(jpo jpoVar) {
        this.f18587jd = jpoVar.f18591jd;
        this.f18586cm = jpoVar.f18590cm;
        this.f18588jj = jpoVar.f18592jj;
        List<xyk> list = jpoVar.jpo;
        this.wqx = jpoVar.wqx;
        this.my = jpoVar.my;
        this.f18589qk = jpoVar.f18593qk;
        this.jpo = list;
    }

    public jpo jd() {
        return new jpo(this);
    }

    public abstract cm jpo();

    public abstract jd jpo(Cif cif);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class jpo {

        /* renamed from: cm, reason: collision with root package name */
        public long f18590cm;

        /* renamed from: jd, reason: collision with root package name */
        public long f18591jd;

        /* renamed from: jj, reason: collision with root package name */
        public long f18592jj;
        public final List<xyk> jpo;
        public TimeUnit my;

        /* renamed from: qk, reason: collision with root package name */
        public TimeUnit f18593qk;
        public TimeUnit wqx;

        public jpo() {
            this.jpo = new ArrayList();
            this.f18591jd = 10000L;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.wqx = timeUnit;
            this.f18590cm = 10000L;
            this.my = timeUnit;
            this.f18592jj = 10000L;
            this.f18593qk = timeUnit;
        }

        public jpo jd(long j10, TimeUnit timeUnit) {
            this.f18590cm = j10;
            this.my = timeUnit;
            return this;
        }

        public jpo jpo(long j10, TimeUnit timeUnit) {
            this.f18591jd = j10;
            this.wqx = timeUnit;
            return this;
        }

        public jpo wqx(long j10, TimeUnit timeUnit) {
            this.f18592jj = j10;
            this.f18593qk = timeUnit;
            return this;
        }

        public jpo jpo(xyk xykVar) {
            this.jpo.add(xykVar);
            return this;
        }

        public ju jpo() {
            return com.bytedance.sdk.component.jd.jpo.jpo.jpo.jpo(this);
        }

        public jpo(String str) {
            this.jpo = new ArrayList();
            this.f18591jd = 10000L;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.wqx = timeUnit;
            this.f18590cm = 10000L;
            this.my = timeUnit;
            this.f18592jj = 10000L;
            this.f18593qk = timeUnit;
        }

        public jpo(ju juVar) {
            this.jpo = new ArrayList();
            this.f18591jd = 10000L;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.wqx = timeUnit;
            this.f18590cm = 10000L;
            this.my = timeUnit;
            this.f18592jj = 10000L;
            this.f18593qk = timeUnit;
            this.f18591jd = juVar.f18587jd;
            this.wqx = juVar.wqx;
            this.f18590cm = juVar.f18586cm;
            this.my = juVar.my;
            this.f18592jj = juVar.f18588jj;
            this.f18593qk = juVar.f18589qk;
        }
    }
}
