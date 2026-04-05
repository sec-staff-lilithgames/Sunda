package com.bytedance.sdk.openadsdk.core.p000if;

import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.p000if.jd.wqx;
import com.bytedance.sdk.openadsdk.core.p000if.wqx.jpo;
import com.unity3d.ads.beta.xyn.RnJusJ;
import j1.o2;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class wqx {

    /* renamed from: cm, reason: collision with root package name */
    protected jpo.jd f20422cm;

    /* renamed from: if, reason: not valid java name */
    private dt f121if;

    /* renamed from: jd, reason: collision with root package name */
    protected int f20423jd;

    /* renamed from: jj, reason: collision with root package name */
    protected List<com.bytedance.sdk.openadsdk.core.p000if.jd.wqx> f20424jj;
    protected int jpo;
    protected String my;

    /* renamed from: qk, reason: collision with root package name */
    protected List<com.bytedance.sdk.openadsdk.core.p000if.jd.wqx> f20426qk;
    protected jpo.EnumC0118jpo wqx;
    protected String xyk;

    /* renamed from: yd, reason: collision with root package name */
    private String f20427yd;

    /* renamed from: ju, reason: collision with root package name */
    private final AtomicBoolean f20425ju = new AtomicBoolean(false);
    protected String zz = "endcard_click";

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.sdk.openadsdk.core.if.wqx$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] jpo;

        static {
            int[] iArr = new int[jpo.jd.values().length];
            jpo = iArr;
            try {
                iArr[jpo.jd.STATIC_RESOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                jpo[jpo.jd.HTML_RESOURCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                jpo[jpo.jd.IFRAME_RESOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public wqx(int i10, int i11, jpo.EnumC0118jpo enumC0118jpo, jpo.jd jdVar, String str, List<com.bytedance.sdk.openadsdk.core.p000if.jd.wqx> list, List<com.bytedance.sdk.openadsdk.core.p000if.jd.wqx> list2, String str2) {
        this.f20424jj = new ArrayList();
        this.f20426qk = new ArrayList();
        this.jpo = i10;
        this.f20423jd = i11;
        this.wqx = enumC0118jpo;
        this.f20422cm = jdVar;
        this.my = str;
        this.f20424jj = list;
        this.f20426qk = list2;
        this.xyk = str2;
    }

    public String cm() {
        int i10 = AnonymousClass1.jpo[this.f20422cm.ordinal()];
        if (i10 == 1) {
            jpo.EnumC0118jpo enumC0118jpo = this.wqx;
            if (enumC0118jpo == jpo.EnumC0118jpo.IMAGE) {
                return o2.o(new StringBuilder("<html><head></head><body style=\"margin:0;padding:0\"><img src=\""), this.my, "\" width=\"100%\" style=\"max-width:100%;max-height:100%;\" /></body></html>");
            }
            if (enumC0118jpo == jpo.EnumC0118jpo.JAVASCRIPT) {
                return o2.o(new StringBuilder("<script src=\""), this.my, "\"></script>");
            }
            return null;
        }
        if (i10 == 2) {
            return this.my;
        }
        if (i10 != 3) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder("<iframe frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" style=\"border: 0px; margin: 0px;\" width=\"");
        sb2.append(this.jpo);
        sb2.append("\" height=\"");
        sb2.append(this.f20423jd);
        sb2.append("\" src=\"");
        return o2.o(sb2, this.my, "\"></iframe>");
    }

    public int jd() {
        return this.jpo;
    }

    public String jj() {
        return this.my;
    }

    public void jpo(long j10) {
        com.bytedance.sdk.openadsdk.core.p000if.jd.wqx.jpo(null, this.f20424jj, null, j10, this.f20427yd, new wqx.jd(this.zz, this.f121if), null);
    }

    public String my() {
        if (this.f20422cm == jpo.jd.STATIC_RESOURCE && this.wqx == jpo.EnumC0118jpo.IMAGE) {
            return this.my;
        }
        return null;
    }

    public int wqx() {
        return this.f20423jd;
    }

    public static float jpo(int i10, int i11, int i12, int i13, jpo.jd jdVar, jpo.EnumC0118jpo enumC0118jpo) {
        if (i11 == 0 || i13 == 0) {
            return 0.0f;
        }
        float f10 = i10;
        float f11 = i12;
        return jpo(jdVar, enumC0118jpo) / ((Math.abs((f10 - f11) / f10) + Math.abs((f10 / i11) - (f11 / i13))) + 1.0f);
    }

    public void jd(long j10) {
        if (this.f20425ju.compareAndSet(false, true)) {
            com.bytedance.sdk.openadsdk.core.p000if.jd.wqx.jd((dt) null, this.f20426qk, (com.bytedance.sdk.openadsdk.core.p000if.jpo.jpo) null, j10, this.f20427yd, (String) null);
        }
    }

    public static wqx jd(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int iOptInt = jSONObject.optInt("width");
        int iOptInt2 = jSONObject.optInt("height");
        String strOptString = jSONObject.optString("creativeType", jpo.EnumC0118jpo.jpo.toString());
        String strOptString2 = jSONObject.optString("resourceType", jpo.jd.HTML_RESOURCE.toString());
        String strOptString3 = jSONObject.optString("contentUrl");
        String strOptString4 = jSONObject.optString("clickThroughUri");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("clickTrackers");
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("creativeViewTrackers");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            arrayList.add(new wqx.jpo(jSONArrayOptJSONArray.optString(i10)).jpo());
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
            arrayList2.add(new wqx.jpo(jSONArrayOptJSONArray2.optString(i11)).jpo());
        }
        return new wqx(iOptInt, iOptInt2, jpo.EnumC0118jpo.valueOf(strOptString), jpo.jd.valueOf(strOptString2), strOptString3, arrayList, arrayList2, strOptString4);
    }

    private static float jpo(jpo.jd jdVar, jpo.EnumC0118jpo enumC0118jpo) {
        int i10 = AnonymousClass1.jpo[jdVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return i10 != 3 ? 0.0f : 1.0f;
            }
            return 1.2f;
        }
        if (jpo.EnumC0118jpo.JAVASCRIPT.equals(enumC0118jpo)) {
            return 1.0f;
        }
        return jpo.EnumC0118jpo.IMAGE.equals(enumC0118jpo) ? 0.8f : 0.0f;
    }

    public void jpo(String str) {
        this.f20427yd = str;
    }

    public JSONObject jpo() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", this.jpo);
        jSONObject.put("height", this.f20423jd);
        jSONObject.put("creativeType", this.wqx.toString());
        jSONObject.put(RnJusJ.xoajdjaRdAjZ, this.f20422cm.toString());
        jSONObject.put("contentUrl", this.my);
        jSONObject.put("clickThroughUri", this.xyk);
        jSONObject.put("clickTrackers", com.bytedance.sdk.openadsdk.core.p000if.jd.wqx.jpo(this.f20424jj));
        jSONObject.put("creativeViewTrackers", com.bytedance.sdk.openadsdk.core.p000if.jd.wqx.jpo(this.f20426qk));
        return jSONObject;
    }

    public void jpo(dt dtVar) {
        this.f121if = dtVar;
    }
}
