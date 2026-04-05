package com.bytedance.sdk.openadsdk.core.ju.jd;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.dt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo extends com.bytedance.adsdk.ugeno.zz.jj.jd {
    public jpo(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.zz.jj.jd
    public void ju(String str) {
        super.ju(str);
        if (TextUtils.isEmpty(str) || TextUtils.equals(AbstractJsonLexerKt.NULL, str)) {
            return;
        }
        try {
            String str2 = String.format(dt.jpo(this.f17811jd, "tt_comment_num"), Integer.valueOf(Integer.parseInt(str)));
            ((com.bytedance.adsdk.ugeno.zz.jj.jpo) this.my).setText("(" + str2 + ")");
        } catch (Exception unused) {
        }
    }
}
