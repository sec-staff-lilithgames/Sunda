package com.bytedance.adsdk.jpo.jd.jd.jpo;

import com.ironsource.C3191e4;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;
import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class qk implements com.bytedance.adsdk.jpo.jd.jd.jpo {
    private final Object jpo;

    public qk(String str) {
        if (str.equalsIgnoreCase("true")) {
            this.jpo = Boolean.TRUE;
        } else if (str.equalsIgnoreCase("false")) {
            this.jpo = Boolean.FALSE;
        } else {
            if (!str.equalsIgnoreCase(AbstractJsonLexerKt.NULL)) {
                throw new IllegalArgumentException();
            }
            this.jpo = null;
        }
    }

    @Override // com.bytedance.adsdk.jpo.jd.jd.jpo
    public String jd() {
        Object obj = this.jpo;
        return obj != null ? obj.toString() : "NULL";
    }

    @Override // com.bytedance.adsdk.jpo.jd.jd.jpo
    public Object jpo(Map<String, JSONObject> map) {
        return this.jpo;
    }

    public String toString() {
        return i.e(new StringBuilder("KeywordNode [keywordValue="), this.jpo, C3191e4.i.f36531e);
    }

    @Override // com.bytedance.adsdk.jpo.jd.jd.jpo
    public com.bytedance.adsdk.jpo.jd.cm.my jpo() {
        return com.bytedance.adsdk.jpo.jd.cm.jj.CONSTANT;
    }
}
