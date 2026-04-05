package com.bytedance.sdk.openadsdk.api.open;

import com.bytedance.sdk.openadsdk.api.PAGRequest;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class PAGAppOpenRequest extends PAGRequest {
    private int jpo;

    public int getTimeout() {
        return this.jpo;
    }

    public void setTimeout(int i10) {
        this.jpo = i10;
    }
}
