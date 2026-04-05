package com.bytedance.sdk.openadsdk.api;

import android.os.Bundle;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class PAGRequest {

    /* renamed from: jd, reason: collision with root package name */
    private Map<String, Object> f19443jd;
    private String jpo;
    private Bundle wqx = null;

    public final void addNetworkExtrasBundle(Class<?> cls, Bundle bundle) {
        if (this.wqx == null) {
            this.wqx = new Bundle();
        }
        this.wqx.putBundle(cls.getName(), bundle);
    }

    public String getAdString() {
        return this.jpo;
    }

    public Map<String, Object> getExtraInfo() {
        return this.f19443jd;
    }

    public Bundle getNetworkExtrasBundle() {
        return this.wqx;
    }

    public void setAdString(String str) {
        this.jpo = str;
    }

    public void setExtraInfo(Map<String, Object> map) {
        this.f19443jd = map;
    }
}
