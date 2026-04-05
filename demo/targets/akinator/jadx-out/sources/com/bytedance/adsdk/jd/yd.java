package com.bytedance.adsdk.jd;

import android.graphics.Bitmap;
import java.util.List;
import org.json.JSONArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class yd {

    /* renamed from: cm, reason: collision with root package name */
    private final String f17598cm;

    /* renamed from: jd, reason: collision with root package name */
    private final int f17599jd;

    /* renamed from: jj, reason: collision with root package name */
    private final String f17600jj;
    private final int jpo;

    /* renamed from: ju, reason: collision with root package name */
    private Bitmap f17601ju;
    private final String my;

    /* renamed from: qk, reason: collision with root package name */
    private final List<jpo> f17602qk;
    private final String wqx;
    private final String xyk;

    /* renamed from: yd, reason: collision with root package name */
    private final JSONArray f17603yd;
    private final int[][] zz;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo {

        /* renamed from: cm, reason: collision with root package name */
        public String f17604cm;

        /* renamed from: jd, reason: collision with root package name */
        public int f17605jd;

        /* renamed from: jj, reason: collision with root package name */
        public int f17606jj;
        public int jpo;
        public int my;

        /* renamed from: qk, reason: collision with root package name */
        public String f17607qk;
        public String wqx;
    }

    public yd(int i10, int i11, String str, String str2, String str3, String str4, List<jpo> list, String str5, int[][] iArr, JSONArray jSONArray) {
        this.jpo = i10;
        this.f17599jd = i11;
        this.wqx = str;
        this.f17598cm = str2;
        this.my = str3;
        this.f17600jj = str4;
        this.f17602qk = list;
        this.xyk = str5;
        this.zz = iArr;
        this.f17603yd = jSONArray;
    }

    public String cm() {
        return this.f17600jj;
    }

    public int jd() {
        return this.f17599jd;
    }

    public int[][] jj() {
        return this.zz;
    }

    public int jpo() {
        return this.jpo;
    }

    public Bitmap ju() {
        return this.f17601ju;
    }

    public String my() {
        return this.xyk;
    }

    public JSONArray qk() {
        return this.f17603yd;
    }

    public List<jpo> wqx() {
        return this.f17602qk;
    }

    public String xyk() {
        return this.wqx;
    }

    public String yd() {
        return this.my;
    }

    public String zz() {
        return this.f17598cm;
    }

    public void jpo(Bitmap bitmap) {
        this.f17601ju = bitmap;
    }
}
