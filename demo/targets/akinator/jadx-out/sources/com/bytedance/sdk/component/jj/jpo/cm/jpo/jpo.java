package com.bytedance.sdk.component.jj.jpo.cm.jpo;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo implements com.bytedance.sdk.component.jj.jpo.cm.jpo {

    /* renamed from: cm, reason: collision with root package name */
    private byte f18624cm;

    /* renamed from: if, reason: not valid java name */
    private int f63if;

    /* renamed from: jd, reason: collision with root package name */
    private jd f18625jd;

    /* renamed from: jj, reason: collision with root package name */
    private long f18626jj;
    protected JSONObject jpo;

    /* renamed from: ju, reason: collision with root package name */
    private String f18627ju;
    private long my;

    /* renamed from: qk, reason: collision with root package name */
    private long f18628qk;
    private byte wqx;
    private String xyk;

    /* renamed from: yd, reason: collision with root package name */
    private byte f18629yd;
    private String zz;

    public jpo(String str, JSONObject jSONObject) {
        this.zz = str;
        this.jpo = jSONObject;
    }

    public static com.bytedance.sdk.component.jj.jpo.cm.jpo wqx(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("type");
            int iOptInt2 = jSONObject.optInt(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
            jpo jpoVar = new jpo();
            jpoVar.jpo((byte) iOptInt);
            jpoVar.jd((byte) iOptInt2);
            jpoVar.jpo(jSONObject.optJSONObject(NotificationCompat.CATEGORY_EVENT));
            jpoVar.jpo(jSONObject.optString("localId"));
            jpoVar.jd(jSONObject.optString("genTime"));
            jpoVar.jpo(jSONObject.optInt("channel"));
            return jpoVar;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.component.jj.jpo.cm.jpo
    public byte cm() {
        return this.wqx;
    }

    /* renamed from: if, reason: not valid java name */
    public String m413if() {
        return this.xyk;
    }

    @Override // com.bytedance.sdk.component.jj.jpo.cm.jpo
    public byte jd() {
        return this.f18629yd;
    }

    @Override // com.bytedance.sdk.component.jj.jpo.cm.jpo
    public String jj() {
        if (TextUtils.isEmpty(this.zz)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("localId", this.zz);
            jSONObject.put(NotificationCompat.CATEGORY_EVENT, qk());
            jSONObject.put("genTime", m413if());
            jSONObject.put(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, (int) this.f18624cm);
            jSONObject.put("type", (int) this.wqx);
            jSONObject.put("channel", this.f63if);
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.component.jj.jpo.cm.jpo
    public jd jpo() {
        return this.f18625jd;
    }

    public String ju() {
        return this.f18627ju;
    }

    @Override // com.bytedance.sdk.component.jj.jpo.cm.jpo
    public byte my() {
        return this.f18624cm;
    }

    @Override // com.bytedance.sdk.component.jj.jpo.cm.jpo
    public synchronized JSONObject qk() {
        jd jdVar;
        try {
            if (this.jpo == null && (jdVar = this.f18625jd) != null) {
                this.jpo = jdVar.jpo(ju());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.jpo;
    }

    @Override // com.bytedance.sdk.component.jj.jpo.cm.jpo
    public long xyk() {
        return this.my;
    }

    @Override // com.bytedance.sdk.component.jj.jpo.cm.jpo
    public int yd() {
        return this.f63if;
    }

    @Override // com.bytedance.sdk.component.jj.jpo.cm.jpo
    public long zz() {
        return this.f18626jj;
    }

    @Override // com.bytedance.sdk.component.jj.jpo.cm.jpo
    public void jd(String str) {
        this.xyk = str;
    }

    @Override // com.bytedance.sdk.component.jj.jpo.cm.jpo
    public void jpo(JSONObject jSONObject) {
        this.jpo = jSONObject;
    }

    @Override // com.bytedance.sdk.component.jj.jpo.cm.jpo
    public void jd(long j10) {
        this.f18626jj = j10;
    }

    @Override // com.bytedance.sdk.component.jj.jpo.cm.jpo
    public void jpo(byte b10) {
        this.wqx = b10;
    }

    public jpo(String str, jd jdVar) {
        this.zz = str;
        this.f18625jd = jdVar;
    }

    @Override // com.bytedance.sdk.component.jj.jpo.cm.jpo
    public void jd(byte b10) {
        this.f18624cm = b10;
    }

    @Override // com.bytedance.sdk.component.jj.jpo.cm.jpo
    public void jpo(String str) {
        this.zz = str;
    }

    @Override // com.bytedance.sdk.component.jj.jpo.cm.jpo
    public void jpo(long j10) {
        this.my = j10;
    }

    @Override // com.bytedance.sdk.component.jj.jpo.cm.jpo
    public void jpo(int i10) {
        this.f63if = i10;
    }

    private jpo() {
    }

    public void wqx(byte b10) {
        this.f18629yd = b10;
    }

    @Override // com.bytedance.sdk.component.jj.jpo.cm.jpo
    public String wqx() {
        return this.zz;
    }

    @Override // com.bytedance.sdk.component.jj.jpo.cm.jpo
    public void wqx(long j10) {
        this.f18628qk = j10;
    }
}
