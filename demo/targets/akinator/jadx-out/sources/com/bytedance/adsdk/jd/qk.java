package com.bytedance.adsdk.jd;

import android.graphics.Rect;
import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class qk {

    /* renamed from: au, reason: collision with root package name */
    private float f17417au;

    /* renamed from: cm, reason: collision with root package name */
    private Map<String, yd> f17418cm;
    private wqx hna;

    /* renamed from: if, reason: not valid java name */
    private float f12if;

    /* renamed from: jj, reason: collision with root package name */
    private List<com.bytedance.adsdk.jd.wqx.jj> f17420jj;

    /* renamed from: jr, reason: collision with root package name */
    private jd f17421jr;

    /* renamed from: ju, reason: collision with root package name */
    private float f17422ju;
    private Map<String, com.bytedance.adsdk.jd.wqx.wqx> my;
    private jpo opi;
    private boolean oya;

    /* renamed from: qk, reason: collision with root package name */
    private SparseArray<com.bytedance.adsdk.jd.wqx.cm> f17423qk;
    private Map<String, List<com.bytedance.adsdk.jd.wqx.wqx.my>> wqx;
    private LongSparseArray<com.bytedance.adsdk.jd.wqx.wqx.my> xyk;

    /* renamed from: yd, reason: collision with root package name */
    private Rect f17425yd;
    private List<com.bytedance.adsdk.jd.wqx.wqx.my> zz;
    private final opi jpo = new opi();

    /* renamed from: jd, reason: collision with root package name */
    private final HashSet<String> f17419jd = new HashSet<>();
    private int prr = 0;

    /* renamed from: sq, reason: collision with root package name */
    private String f17424sq = "";

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jd {

        /* renamed from: jd, reason: collision with root package name */
        public int[][] f17426jd;
        public String jpo;
        public JSONArray wqx;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo {

        /* renamed from: cm, reason: collision with root package name */
        public int f17427cm;

        /* renamed from: jd, reason: collision with root package name */
        public Map<String, Object> f17428jd;

        /* renamed from: jj, reason: collision with root package name */
        public String f17429jj;
        public int jpo;
        public int my;

        /* renamed from: qk, reason: collision with root package name */
        public JSONArray f17430qk;
        public Map<String, Object> wqx;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class wqx {

        /* renamed from: cm, reason: collision with root package name */
        public String f17439cm;

        /* renamed from: jd, reason: collision with root package name */
        public String f17440jd;

        /* renamed from: jj, reason: collision with root package name */
        public String f17441jj;
        public int jpo;
        public int[] my;

        /* renamed from: qk, reason: collision with root package name */
        public JSONArray f17442qk;
        public String wqx;
    }

    public List<com.bytedance.adsdk.jd.wqx.wqx.my> au() {
        return this.zz;
    }

    public Rect cm() {
        return this.f17425yd;
    }

    public Map<String, yd> hna() {
        return this.f17418cm;
    }

    /* renamed from: if, reason: not valid java name */
    public float m380if() {
        return this.f17417au;
    }

    public int jd() {
        return this.prr;
    }

    public float jj() {
        return this.f17422ju;
    }

    public void jpo(Rect rect, float f10, float f11, float f12, List<com.bytedance.adsdk.jd.wqx.wqx.my> list, LongSparseArray<com.bytedance.adsdk.jd.wqx.wqx.my> longSparseArray, Map<String, List<com.bytedance.adsdk.jd.wqx.wqx.my>> map, Map<String, yd> map2, SparseArray<com.bytedance.adsdk.jd.wqx.cm> sparseArray, Map<String, com.bytedance.adsdk.jd.wqx.wqx> map3, List<com.bytedance.adsdk.jd.wqx.jj> list2, wqx wqxVar, String str, jpo jpoVar, jd jdVar) {
        this.f17425yd = rect;
        this.f17422ju = f10;
        this.f12if = f11;
        this.f17417au = f12;
        this.zz = list;
        this.xyk = longSparseArray;
        this.wqx = map;
        this.f17418cm = map2;
        this.f17423qk = sparseArray;
        this.my = map3;
        this.f17420jj = list2;
        this.hna = wqxVar;
        this.f17424sq = str;
        this.opi = jpoVar;
        this.f17421jr = jdVar;
    }

    public jpo ju() {
        return this.opi;
    }

    public float my() {
        return (long) ((sq() / this.f17417au) * 1000.0f);
    }

    public SparseArray<com.bytedance.adsdk.jd.wqx.cm> oya() {
        return this.f17423qk;
    }

    public Map<String, com.bytedance.adsdk.jd.wqx.wqx> prr() {
        return this.my;
    }

    public float qk() {
        return this.f12if;
    }

    public float sq() {
        return this.f12if - this.f17422ju;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        Iterator<com.bytedance.adsdk.jd.wqx.wqx.my> it = this.zz.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().jpo("\t"));
        }
        return sb2.toString();
    }

    public opi wqx() {
        return this.jpo;
    }

    public wqx xyk() {
        return this.hna;
    }

    public jd yd() {
        return this.f17421jr;
    }

    public String zz() {
        return this.f17424sq;
    }

    public void jd(boolean z10) {
        this.jpo.jpo(z10);
    }

    public com.bytedance.adsdk.jd.wqx.jj wqx(String str) {
        int size = this.f17420jj.size();
        for (int i10 = 0; i10 < size; i10++) {
            com.bytedance.adsdk.jd.wqx.jj jjVar = this.f17420jj.get(i10);
            if (jjVar.jpo(str)) {
                return jjVar;
            }
        }
        return null;
    }

    public List<com.bytedance.adsdk.jd.wqx.wqx.my> jd(String str) {
        return this.wqx.get(str);
    }

    public void jpo(String str) {
        this.f17419jd.add(str);
    }

    public void jpo(boolean z10) {
        this.oya = z10;
    }

    public void jpo(int i10) {
        this.prr += i10;
    }

    public boolean jpo() {
        return this.oya;
    }

    public com.bytedance.adsdk.jd.wqx.wqx.my jpo(long j10) {
        return this.xyk.get(j10);
    }

    public float jpo(float f10) {
        return com.bytedance.adsdk.jd.jj.my.jpo(this.f17422ju, this.f12if, f10);
    }
}
