package com.bytedance.sdk.component.jj.jpo;

import android.content.Context;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class xyk {

    /* renamed from: au, reason: collision with root package name */
    private static xyk f18739au;

    /* renamed from: yd, reason: collision with root package name */
    private static volatile com.bytedance.sdk.component.jj.jpo.my.jpo f18740yd;

    /* renamed from: cm, reason: collision with root package name */
    private volatile com.bytedance.sdk.component.jj.jpo.cm.jd.jpo f18741cm;

    /* renamed from: if, reason: not valid java name */
    private volatile Map<Integer, com.bytedance.sdk.component.jj.jpo.jd.wqx> f71if;

    /* renamed from: jd, reason: collision with root package name */
    private volatile com.bytedance.sdk.component.jj.jpo.cm.jd.jpo f18742jd;

    /* renamed from: jj, reason: collision with root package name */
    private volatile com.bytedance.sdk.component.jj.jpo.cm.jd.jpo f18743jj;
    private volatile Context jpo;

    /* renamed from: ju, reason: collision with root package name */
    private volatile com.bytedance.sdk.component.jj.jpo.jd.wqx f18744ju;
    private volatile com.bytedance.sdk.component.jj.jpo.cm.jd.jpo my;
    private final AtomicBoolean oya = new AtomicBoolean(false);
    private long prr;

    /* renamed from: qk, reason: collision with root package name */
    private volatile com.bytedance.sdk.component.jj.jpo.jpo.my f18745qk;
    private volatile com.bytedance.sdk.component.jj.jpo.cm.jd.jpo wqx;
    private volatile boolean xyk;
    private volatile my zz;

    private xyk() {
    }

    public static com.bytedance.sdk.component.jj.jpo.my.jpo my() {
        if (f18740yd == null) {
            synchronized (xyk.class) {
                try {
                    if (f18740yd == null) {
                        f18740yd = new com.bytedance.sdk.component.jj.jpo.my.jd();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f18740yd;
    }

    public static synchronized xyk qk() {
        try {
            if (f18739au == null) {
                f18739au = new xyk();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f18739au;
    }

    public com.bytedance.sdk.component.jj.jpo.cm.jd.jpo au() {
        return this.wqx;
    }

    public com.bytedance.sdk.component.jj.jpo.jpo.my cm() {
        return this.f18745qk;
    }

    public my hna() {
        return this.zz;
    }

    /* renamed from: if, reason: not valid java name */
    public com.bytedance.sdk.component.jj.jpo.cm.jd.jpo m417if() {
        return this.f18742jd;
    }

    public boolean jd() {
        return this.xyk;
    }

    public Context jj() {
        return this.jpo;
    }

    public boolean jpo() {
        return this.oya.get();
    }

    public void ju() {
        com.bytedance.sdk.component.jj.jpo.jd.cm.jpo.wqx();
    }

    public com.bytedance.sdk.component.jj.jpo.cm.jd.jpo oya() {
        return this.f18741cm;
    }

    public com.bytedance.sdk.component.jj.jpo.cm.jd.jpo prr() {
        return this.my;
    }

    public long sq() {
        return this.prr * 86400000;
    }

    public Map<Integer, com.bytedance.sdk.component.jj.jpo.jd.wqx> wqx() {
        return this.f71if;
    }

    public com.bytedance.sdk.component.jj.jpo.jd.wqx xyk() {
        return this.f18744ju;
    }

    public com.bytedance.sdk.component.jj.jpo.cm.jd.jpo yd() {
        return this.f18743jj;
    }

    public void zz() {
        com.bytedance.sdk.component.jj.jpo.jd.cm.jpo.jd();
    }

    public void cm(com.bytedance.sdk.component.jj.jpo.cm.jd.jpo jpoVar) {
        this.f18741cm = jpoVar;
    }

    public void jd(boolean z10) {
        this.xyk = z10;
    }

    public void jpo(boolean z10) {
        this.oya.set(z10);
    }

    public void wqx(com.bytedance.sdk.component.jj.jpo.cm.jd.jpo jpoVar) {
        this.wqx = jpoVar;
    }

    public void jd(com.bytedance.sdk.component.jj.jpo.cm.jd.jpo jpoVar) {
        this.f18742jd = jpoVar;
    }

    public void jpo(com.bytedance.sdk.component.jj.jpo.jpo.my myVar) {
        this.f18745qk = myVar;
    }

    public void jpo(Context context) {
        this.jpo = context;
    }

    public void jpo(com.bytedance.sdk.component.jj.jpo.jd.wqx wqxVar) {
        this.f18744ju = wqxVar;
    }

    public void jpo(com.bytedance.sdk.component.jj.jpo.cm.jd.jpo jpoVar) {
        this.f18743jj = jpoVar;
    }

    public void jpo(com.bytedance.sdk.component.jj.jpo.cm.jpo jpoVar) {
        if (jpoVar == null) {
            return;
        }
        jpoVar.jpo(System.currentTimeMillis());
        com.bytedance.sdk.component.jj.jpo.jd.cm.jpo.jpo(jpoVar, jpoVar.cm());
    }

    public void my(com.bytedance.sdk.component.jj.jpo.cm.jd.jpo jpoVar) {
        this.my = jpoVar;
    }

    public void jpo(String str, boolean z10) {
        com.bytedance.sdk.component.jj.jpo.jj.jpo.jpo().jpo(str, z10);
    }

    public void jpo(String str, List<String> list, boolean z10, Map<String, String> map, int i10, String str2) {
        com.bytedance.sdk.component.jj.jpo.jj.jpo.jpo().jpo(str, list, z10, map, i10, str2);
    }

    public void jpo(my myVar) {
        this.zz = myVar;
    }

    public void jpo(long j10) {
        this.prr = j10;
    }
}
