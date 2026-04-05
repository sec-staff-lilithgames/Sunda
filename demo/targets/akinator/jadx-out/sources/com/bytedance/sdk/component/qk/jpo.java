package com.bytedance.sdk.component.qk;

import android.os.Bundle;
import com.bytedance.sdk.component.jd.jpo.jpo.jpo.my;
import com.bytedance.sdk.component.jd.jpo.ju;
import com.bytedance.sdk.component.jd.jpo.xyk;
import com.bytedance.sdk.component.qk.jd.cm;
import com.bytedance.sdk.component.qk.wqx.wqx;
import j1.o2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {
    private static my jpo;

    /* renamed from: jd, reason: collision with root package name */
    private ju f18992jd;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.sdk.component.qk.jpo$jpo, reason: collision with other inner class name */
    public static final class C0090jpo {

        /* renamed from: jj, reason: collision with root package name */
        private Bundle f18995jj;
        private Set<String> my;

        /* renamed from: cm, reason: collision with root package name */
        final List<xyk> f18993cm = new ArrayList();
        int jpo = 10000;

        /* renamed from: jd, reason: collision with root package name */
        int f18994jd = 10000;
        int wqx = 10000;

        public C0090jpo jpo(boolean z10) {
            return this;
        }

        public C0090jpo wqx(long j10, TimeUnit timeUnit) {
            this.wqx = jpo("timeout", j10, timeUnit);
            return this;
        }

        public C0090jpo jd(long j10, TimeUnit timeUnit) {
            this.f18994jd = jpo("timeout", j10, timeUnit);
            return this;
        }

        public C0090jpo jpo(long j10, TimeUnit timeUnit) {
            this.jpo = jpo("timeout", j10, timeUnit);
            return this;
        }

        public C0090jpo jpo(xyk xykVar) {
            this.f18993cm.add(xykVar);
            return this;
        }

        private static int jpo(String str, long j10, TimeUnit timeUnit) {
            if (j10 < 0) {
                throw new IllegalArgumentException(o2.l(str, " < 0"));
            }
            if (timeUnit != null) {
                long millis = timeUnit.toMillis(j10);
                if (millis > 2147483647L) {
                    throw new IllegalArgumentException(o2.l(str, " too large."));
                }
                if (millis != 0 || j10 <= 0) {
                    return (int) millis;
                }
                throw new IllegalArgumentException(o2.l(str, " too small."));
            }
            throw new NullPointerException("unit == null");
        }

        public jpo jpo() {
            return new jpo(this);
        }
    }

    public static void jpo() {
        wqx.jpo(wqx.jpo.DEBUG);
    }

    public static boolean my() {
        my myVar = jpo;
        if (myVar == null) {
            return false;
        }
        return myVar.jpo();
    }

    public com.bytedance.sdk.component.qk.jd.jpo cm() {
        return new com.bytedance.sdk.component.qk.jd.jpo(this.f18992jd);
    }

    public cm jd() {
        return new cm(this.f18992jd);
    }

    public ju jj() {
        return this.f18992jd;
    }

    public com.bytedance.sdk.component.qk.jd.jd wqx() {
        return new com.bytedance.sdk.component.qk.jd.jd(this.f18992jd);
    }

    private jpo(C0090jpo c0090jpo) {
        ju.jpo jpoVar = new ju.jpo();
        long j10 = c0090jpo.jpo;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ju.jpo jpoVarJd = jpoVar.jpo(j10, timeUnit).wqx(c0090jpo.wqx, timeUnit).jd(c0090jpo.f18994jd, timeUnit);
        List<xyk> list = c0090jpo.f18993cm;
        if (list != null && list.size() > 0) {
            Iterator<xyk> it = c0090jpo.f18993cm.iterator();
            while (it.hasNext()) {
                jpoVarJd.jpo(it.next());
            }
        }
        if (c0090jpo.f18995jj != null) {
            Bundle unused = c0090jpo.f18995jj;
        }
        Set unused2 = c0090jpo.my;
        this.f18992jd = jpoVarJd.jpo();
    }

    public static void jpo(my myVar) {
        jpo = myVar;
    }
}
