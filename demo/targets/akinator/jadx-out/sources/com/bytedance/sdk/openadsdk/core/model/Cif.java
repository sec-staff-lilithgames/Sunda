package com.bytedance.sdk.openadsdk.core.model;

import android.util.SparseArray;
import com.bytedance.sdk.openadsdk.core.wqx.wqx;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.bytedance.sdk.openadsdk.core.model.if, reason: invalid class name */
/* loaded from: classes4.dex */
public class Cif {

    /* renamed from: au, reason: collision with root package name */
    private final SparseArray<wqx.jpo> f20671au;

    /* renamed from: cm, reason: collision with root package name */
    private final float f20672cm;
    private final String hna;

    /* renamed from: if, reason: not valid java name */
    private final int f130if;

    /* renamed from: jd, reason: collision with root package name */
    private final int[] f20673jd;

    /* renamed from: jj, reason: collision with root package name */
    private final float f20674jj;
    private final int[] jpo;

    /* renamed from: ju, reason: collision with root package name */
    private final int f20675ju;
    private final float my;
    private final int oya;
    private final JSONObject prr;

    /* renamed from: qk, reason: collision with root package name */
    private final long f20676qk;

    /* renamed from: sq, reason: collision with root package name */
    private final JSONObject f20677sq;
    private final float wqx;
    private final long xyk;

    /* renamed from: yd, reason: collision with root package name */
    private final int f20678yd;
    private final int zz;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.sdk.openadsdk.core.model.if$jpo */
    public static class jpo {

        /* renamed from: au, reason: collision with root package name */
        private int f20679au;

        /* renamed from: cm, reason: collision with root package name */
        private long f20680cm;
        private int hna;

        /* renamed from: if, reason: not valid java name */
        private int f131if;

        /* renamed from: jd, reason: collision with root package name */
        int f20681jd;

        /* renamed from: jj, reason: collision with root package name */
        private float f20682jj;
        float jpo;

        /* renamed from: jr, reason: collision with root package name */
        private JSONObject f20683jr;

        /* renamed from: ju, reason: collision with root package name */
        private int[] f20684ju;
        private long my;
        private JSONObject nmd;
        private int opi;
        private int oya;
        private SparseArray<wqx.jpo> prr;

        /* renamed from: qk, reason: collision with root package name */
        private float f20685qk;

        /* renamed from: sq, reason: collision with root package name */
        private String f20686sq;
        float wqx;
        private float xyk;

        /* renamed from: yd, reason: collision with root package name */
        private int[] f20687yd;
        private float zz;

        public jpo cm(float f10) {
            this.f20685qk = f10;
            return this;
        }

        public jpo jd(JSONObject jSONObject) {
            this.nmd = jSONObject;
            return this;
        }

        public jpo jj(float f10) {
            this.zz = f10;
            return this;
        }

        public jpo jpo(int i10) {
            this.opi = i10;
            return this;
        }

        public jpo my(float f10) {
            this.xyk = f10;
            return this;
        }

        public jpo wqx(int i10) {
            this.f20681jd = i10;
            return this;
        }

        public jpo cm(int i10) {
            this.f131if = i10;
            return this;
        }

        public jpo jd(int i10) {
            this.hna = i10;
            return this;
        }

        public jpo jj(int i10) {
            this.oya = i10;
            return this;
        }

        public jpo jpo(JSONObject jSONObject) {
            this.f20683jr = jSONObject;
            return this;
        }

        public jpo my(int i10) {
            this.f20679au = i10;
            return this;
        }

        public jpo wqx(float f10) {
            this.f20682jj = f10;
            return this;
        }

        public jpo jd(float f10) {
            this.wqx = f10;
            return this;
        }

        public jpo jpo(SparseArray<wqx.jpo> sparseArray) {
            this.prr = sparseArray;
            return this;
        }

        public jpo jd(long j10) {
            this.my = j10;
            return this;
        }

        public jpo jpo(float f10) {
            this.jpo = f10;
            return this;
        }

        public jpo jd(int[] iArr) {
            this.f20684ju = iArr;
            return this;
        }

        public jpo jpo(long j10) {
            this.f20680cm = j10;
            return this;
        }

        public jpo jpo(int[] iArr) {
            this.f20687yd = iArr;
            return this;
        }

        public jpo jpo(String str) {
            this.f20686sq = str;
            return this;
        }

        public Cif jpo() {
            return new Cif(this);
        }
    }

    public JSONObject jpo() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = this.f20677sq;
            if (jSONObject2 != null) {
                try {
                    Iterator<String> itKeys = jSONObject2.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject.putOpt(next, this.f20677sq.opt(next));
                    }
                } catch (Exception unused) {
                }
            }
            int[] iArr = this.jpo;
            if (iArr != null && iArr.length == 2) {
                jSONObject.putOpt("ad_x", Integer.valueOf(iArr[0])).putOpt("ad_y", Integer.valueOf(this.jpo[1]));
            }
            int[] iArr2 = this.f20673jd;
            if (iArr2 != null && iArr2.length == 2) {
                jSONObject.putOpt("width", Integer.valueOf(iArr2[0])).putOpt("height", Integer.valueOf(this.f20673jd[1]));
            }
            jSONObject.putOpt("down_x", Float.toString(this.wqx)).putOpt("down_y", Float.toString(this.f20672cm)).putOpt("up_x", Float.toString(this.my)).putOpt("up_y", Float.toString(this.f20674jj)).putOpt("down_time", Long.valueOf(this.f20676qk)).putOpt("up_time", Long.valueOf(this.xyk)).putOpt("toolType", Integer.valueOf(this.zz)).putOpt("deviceId", Integer.valueOf(this.f20678yd)).putOpt("source", Integer.valueOf(this.f20675ju)).putOpt("ft", jpo(this.f20671au, this.f130if)).putOpt("click_area_type", this.hna);
            int i10 = this.oya;
            if (i10 > 0) {
                jSONObject.putOpt("areaType", Integer.valueOf(i10));
            }
            JSONObject jSONObject3 = this.prr;
            if (jSONObject3 != null) {
                jSONObject.putOpt("rectInfo", jSONObject3);
            }
        } catch (Exception unused2) {
        }
        return jSONObject;
    }

    private Cif(jpo jpoVar) {
        this.jpo = jpoVar.f20687yd;
        this.f20673jd = jpoVar.f20684ju;
        this.wqx = jpoVar.zz;
        this.f20672cm = jpoVar.xyk;
        this.my = jpoVar.f20685qk;
        this.f20674jj = jpoVar.f20682jj;
        this.f20676qk = jpoVar.my;
        this.xyk = jpoVar.f20680cm;
        this.zz = jpoVar.f131if;
        this.f20678yd = jpoVar.f20679au;
        this.f20675ju = jpoVar.oya;
        this.f130if = jpoVar.hna;
        this.f20671au = jpoVar.prr;
        this.hna = jpoVar.f20686sq;
        this.oya = jpoVar.opi;
        this.prr = jpoVar.f20683jr;
        this.f20677sq = jpoVar.nmd;
    }

    public static JSONObject jpo(SparseArray<wqx.jpo> sparseArray, int i10) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            if (sparseArray != null) {
                for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                    wqx.jpo jpoVarValueAt = sparseArray.valueAt(i11);
                    if (jpoVarValueAt != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.putOpt("force", Double.valueOf(jpoVarValueAt.wqx)).putOpt("mr", Double.valueOf(jpoVarValueAt.f21017jd)).putOpt("phase", Integer.valueOf(jpoVarValueAt.jpo)).putOpt("ts", Long.valueOf(jpoVarValueAt.f21016cm));
                        jSONArray.put(jSONObject2);
                        jSONObject.putOpt("ftc", Integer.valueOf(i10)).putOpt("info", jSONArray);
                    }
                }
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
