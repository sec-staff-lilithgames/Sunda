package com.bytedance.adsdk.ugeno.jpo;

import j1.o2;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx {

    /* renamed from: cm, reason: collision with root package name */
    private String f17910cm;

    /* renamed from: jd, reason: collision with root package name */
    private long f17911jd;

    /* renamed from: jj, reason: collision with root package name */
    private jpo f17912jj;
    private Map<String, TreeMap<Float, String>> jpo;
    private long my;

    /* renamed from: qk, reason: collision with root package name */
    private String f17913qk;
    private int wqx;
    private String xyk;

    /* renamed from: yd, reason: collision with root package name */
    private JSONObject f17914yd;
    private int zz = 1;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo {

        /* renamed from: jd, reason: collision with root package name */
        public String f17915jd;
        public String jpo;
    }

    public int cm() {
        return this.wqx;
    }

    public Map<String, TreeMap<Float, String>> jd() {
        return this.jpo;
    }

    public long jj() {
        return this.my;
    }

    public JSONObject jpo() {
        return this.f17914yd;
    }

    public String my() {
        return this.f17910cm;
    }

    public jpo qk() {
        return this.f17912jj;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AnimationModel{mKeyFramesMap=");
        sb2.append(this.jpo);
        sb2.append(", mDuration=");
        sb2.append(this.f17911jd);
        sb2.append(", mPlayCount=");
        sb2.append(this.wqx);
        sb2.append(", mPlayDirection=");
        sb2.append(this.f17910cm);
        sb2.append(", mDelay=");
        sb2.append(this.my);
        sb2.append(", mName=");
        sb2.append(this.xyk);
        sb2.append(", mPlayState=");
        sb2.append(this.zz);
        sb2.append(", mTransformOrigin='");
        sb2.append(this.f17912jj);
        sb2.append("', mTimingFunction='");
        return o2.o(sb2, this.f17913qk, "'}");
    }

    public long wqx() {
        return this.f17911jd;
    }

    public String xyk() {
        return this.f17913qk;
    }

    public int yd() {
        return this.zz;
    }

    public String zz() {
        return this.xyk;
    }

    public void jd(long j10) {
        this.my = j10;
    }

    public void jpo(JSONObject jSONObject) {
        this.f17914yd = jSONObject;
    }

    public void wqx(String str) {
        this.xyk = str;
    }

    public void jd(String str) {
        this.f17913qk = str;
    }

    public void jpo(Map<String, TreeMap<Float, String>> map) {
        this.jpo = map;
    }

    public void jd(int i10) {
        this.zz = i10;
    }

    public void jpo(long j10) {
        this.f17911jd = j10;
    }

    public void jpo(int i10) {
        this.wqx = i10;
    }

    public void jpo(String str) {
        this.f17910cm = str;
    }

    public void jpo(jpo jpoVar) {
        this.f17912jj = jpoVar;
    }
}
