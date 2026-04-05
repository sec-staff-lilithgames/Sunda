package com.bykv.vk.openvk.jpo.jpo.jpo.wqx;

import android.os.Build;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx implements Serializable {

    /* renamed from: au, reason: collision with root package name */
    private String f16756au;
    private String hna;

    /* renamed from: jd, reason: collision with root package name */
    public String f16760jd;

    /* renamed from: jj, reason: collision with root package name */
    private jd f16761jj;

    /* renamed from: jr, reason: collision with root package name */
    private boolean f16762jr;
    private int nmd;
    private boolean opi;
    private int oya;
    private int prr;

    /* renamed from: qk, reason: collision with root package name */
    private jd f16765qk;

    /* renamed from: rq, reason: collision with root package name */
    private int f16766rq;

    /* renamed from: se, reason: collision with root package name */
    private int f16767se;

    /* renamed from: sq, reason: collision with root package name */
    private long f16768sq;
    public int wqx;
    private String xyk;
    private boolean zz;

    /* renamed from: yd, reason: collision with root package name */
    private int f16770yd = 204800;

    /* renamed from: ju, reason: collision with root package name */
    private int f16763ju = 0;

    /* renamed from: if, reason: not valid java name */
    private int f3if = 0;
    protected float jpo = -1.0f;

    /* renamed from: cm, reason: collision with root package name */
    public final HashMap<String, Object> f16757cm = new HashMap<>();

    /* renamed from: tu, reason: collision with root package name */
    private int f16769tu = 10000;

    /* renamed from: dt, reason: collision with root package name */
    private int f16758dt = 10000;
    private int hmu = 10000;

    /* renamed from: nq, reason: collision with root package name */
    private int f16764nq = 0;
    public int my = 1;

    /* renamed from: hx, reason: collision with root package name */
    private JSONObject f16759hx = new JSONObject();

    public wqx(String str, jd jdVar, jd jdVar2, int i10, int i11) {
        this.nmd = 0;
        this.f16766rq = 0;
        this.xyk = str;
        this.f16761jj = jdVar;
        this.f16765qk = jdVar2;
        this.nmd = i10;
        this.f16766rq = i11;
    }

    public boolean au() {
        if (oya()) {
            return this.f16765qk.rq();
        }
        jd jdVar = this.f16761jj;
        if (jdVar != null) {
            return jdVar.rq();
        }
        return true;
    }

    public int cm() {
        return this.f16759hx.optInt("pitaya_cache_size", 0);
    }

    public jd dt() {
        return this.f16761jj;
    }

    public jd hmu() {
        return this.f16765qk;
    }

    public String hna() {
        if (oya()) {
            return this.f16765qk.ju();
        }
        jd jdVar = this.f16761jj;
        if (jdVar != null) {
            return jdVar.ju();
        }
        return null;
    }

    /* renamed from: if, reason: not valid java name */
    public long m376if() {
        if (oya()) {
            return this.f16765qk.my();
        }
        jd jdVar = this.f16761jj;
        if (jdVar != null) {
            return jdVar.my();
        }
        return 0L;
    }

    public boolean jd() {
        return this.f16767se == 2;
    }

    public int jj() {
        if (oya()) {
            return this.f16765qk.prr();
        }
        jd jdVar = this.f16761jj;
        if (jdVar != null) {
            return jdVar.prr();
        }
        return 0;
    }

    public void jpo(int i10) {
        this.f16767se = i10;
    }

    public int jr() {
        return this.f16769tu;
    }

    public boolean ju() {
        return this.opi;
    }

    public String my() {
        return this.xyk;
    }

    public int nmd() {
        return this.f16758dt;
    }

    public boolean nq() {
        return this.zz;
    }

    public int opi() {
        return this.nmd;
    }

    public boolean oya() {
        jd jdVar;
        if (this.f16766rq != 1 || (jdVar = this.f16765qk) == null || TextUtils.isEmpty(jdVar.ju())) {
            return false;
        }
        return com.bykv.vk.openvk.jpo.jpo.jpo.wqx.jj() == 2 ? Build.VERSION.SDK_INT >= 26 : this.nmd == 1;
    }

    public float prr() {
        float f10 = this.jpo;
        if (f10 != -1.0f) {
            return f10;
        }
        if (oya()) {
            return this.f16765qk.xyk();
        }
        jd jdVar = this.f16761jj;
        if (jdVar != null) {
            return jdVar.xyk();
        }
        return -1.0f;
    }

    public boolean qk() {
        return this.f16762jr;
    }

    public int rq() {
        return this.hmu;
    }

    public String sq() {
        if (oya()) {
            return this.f16765qk.oya();
        }
        jd jdVar = this.f16761jj;
        if (jdVar != null) {
            return jdVar.oya();
        }
        return null;
    }

    public int tu() {
        return this.f16764nq;
    }

    public JSONObject wqx() {
        return this.f16759hx;
    }

    public int xyk() {
        return this.oya;
    }

    public long yd() {
        return this.f16768sq;
    }

    public int zz() {
        return this.prr;
    }

    public void cm(String str) {
        this.f16760jd = str;
    }

    public void jd(String str) {
        this.f16756au = str;
    }

    public boolean jpo() {
        int i10 = this.f16767se;
        return i10 == 1 || i10 == 2;
    }

    public synchronized Object my(String str) {
        return this.f16757cm.get(str);
    }

    public void qk(int i10) {
        this.hmu = i10;
    }

    public void wqx(int i10) {
        this.prr = i10;
    }

    public void xyk(int i10) {
        this.f16764nq = i10;
    }

    public void cm(int i10) {
        this.wqx = i10;
    }

    public void jd(int i10) {
        this.oya = i10;
    }

    public void jpo(String str) {
        this.xyk = str;
    }

    public void my(int i10) {
        this.f16769tu = i10;
    }

    public void wqx(String str) {
        this.hna = str;
    }

    public void jd(boolean z10) {
        this.zz = z10;
    }

    public void jpo(long j10) {
        this.f16768sq = j10;
    }

    public void jj(int i10) {
        this.f16758dt = i10;
    }

    public void jpo(boolean z10) {
        this.opi = z10;
    }

    public synchronized void jpo(String str, Object obj) {
        this.f16757cm.put(str, obj);
    }
}
