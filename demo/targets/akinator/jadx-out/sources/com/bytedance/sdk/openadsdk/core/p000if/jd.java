package com.bytedance.sdk.openadsdk.core.p000if;

import com.bytedance.sdk.openadsdk.core.p000if.jd.wqx;
import com.bytedance.sdk.openadsdk.core.p000if.wqx.jpo;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd extends wqx {

    /* renamed from: ju, reason: collision with root package name */
    private long f20372ju;

    /* renamed from: yd, reason: collision with root package name */
    private long f20373yd;

    public jd(int i10, int i11, long j10, long j11, jpo.EnumC0118jpo enumC0118jpo, jpo.jd jdVar, String str, List<wqx> list, List<wqx> list2, String str2) {
        super(i10, i11, enumC0118jpo, jdVar, str, list, list2, str2);
        this.f20373yd = j10;
        this.f20372ju = j11;
        this.zz = "icon_click";
    }

    @Override // com.bytedance.sdk.openadsdk.core.p000if.wqx
    public JSONObject jpo() throws JSONException {
        JSONObject jSONObjectJpo = super.jpo();
        if (jSONObjectJpo != null) {
            jSONObjectJpo.put("offset", this.f20373yd);
            jSONObjectJpo.put(IronSourceConstants.EVENTS_DURATION, this.f20372ju);
        }
        return jSONObjectJpo;
    }

    public static jd jpo(JSONObject jSONObject) {
        wqx wqxVarJd = wqx.jd(jSONObject);
        if (wqxVarJd == null) {
            return null;
        }
        return new jd(wqxVarJd.jpo, wqxVarJd.f20423jd, jSONObject.optLong("offset", -1L), jSONObject.optLong(IronSourceConstants.EVENTS_DURATION, -1L), wqxVarJd.wqx, wqxVarJd.f20422cm, wqxVarJd.my, wqxVarJd.f20424jj, wqxVarJd.f20426qk, wqxVarJd.xyk);
    }
}
