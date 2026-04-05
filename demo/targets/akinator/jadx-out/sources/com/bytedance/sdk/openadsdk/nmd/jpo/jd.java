package com.bytedance.sdk.openadsdk.nmd.jpo;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.p001if.jj;
import com.bytedance.sdk.openadsdk.utils.va;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd extends jpo {

    /* renamed from: cm, reason: collision with root package name */
    private final FrameLayout f21317cm;

    /* renamed from: jd, reason: collision with root package name */
    private volatile boolean f21318jd;

    /* renamed from: jj, reason: collision with root package name */
    private String f21319jj;
    private FrameLayout my;
    private jj wqx;

    public jd(Context context, dt dtVar, int i10, boolean z10, FrameLayout frameLayout, String str) {
        super(context, dtVar, i10, z10, frameLayout);
        this.f21317cm = frameLayout;
        this.f21319jj = str;
        jd(false);
        int iWqx = va.wqx(context);
        int iMy = va.my(context);
        if (i10 == 1) {
            if (iWqx <= iMy) {
                this.jpo.layout(0, 0, iWqx, iMy);
                return;
            }
        } else {
            if (i10 != 2) {
                return;
            }
            if (iWqx > iMy) {
                this.jpo.layout(0, 0, iWqx, iMy);
                return;
            }
        }
        this.jpo.layout(0, 0, iMy, iWqx);
    }

    public void xyk() {
        super.jpo(true, new jj() { // from class: com.bytedance.sdk.openadsdk.nmd.jpo.jd.1
            @Override // com.bytedance.sdk.openadsdk.p001if.jj
            public void jpo() {
                if (jd.this.wqx != null) {
                    jd.this.wqx.jpo();
                } else {
                    jd.this.f21318jd = true;
                }
            }
        });
    }

    public String zz() {
        return this.f21319jj;
    }

    public void jpo(FrameLayout frameLayout, jj jjVar) {
        this.my = frameLayout;
        frameLayout.addView(this.f21317cm);
        this.wqx = jjVar;
        if (this.f21318jd) {
            this.wqx.jpo();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.nmd.jpo.jpo
    public void jpo() throws JSONException {
        this.my.setVisibility(0);
        super.jpo();
    }
}
