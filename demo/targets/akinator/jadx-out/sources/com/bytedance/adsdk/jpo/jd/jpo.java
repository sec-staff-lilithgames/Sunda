package com.bytedance.adsdk.jpo.jd;

import com.bytedance.adsdk.jpo.jd.wqx.jpo.cm;
import com.bytedance.adsdk.jpo.jd.wqx.jpo.jd;
import com.bytedance.adsdk.jpo.jd.wqx.jpo.jj;
import com.bytedance.adsdk.jpo.jd.wqx.jpo.my;
import com.bytedance.adsdk.jpo.jd.wqx.jpo.qk;
import com.bytedance.adsdk.jpo.jd.wqx.jpo.wqx;
import com.bytedance.adsdk.jpo.jd.wqx.jpo.xyk;
import com.bytedance.adsdk.jpo.jd.wqx.jpo.yd;
import com.bytedance.adsdk.jpo.jd.wqx.jpo.zz;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {
    private static final com.bytedance.adsdk.jpo.jd.wqx.jpo jpo;

    /* renamed from: cm, reason: collision with root package name */
    private Deque<com.bytedance.adsdk.jpo.jd.jd.jpo> f17666cm = new LinkedList();

    /* renamed from: jd, reason: collision with root package name */
    private final com.bytedance.adsdk.jpo.jd.wqx.jpo f17667jd;
    private String my;
    private com.bytedance.adsdk.jpo.jd.jd.jpo wqx;

    static {
        int i10 = 8;
        jj[] jjVarArr = {new yd(), new cm(), new zz(), new jd(), new my(), new com.bytedance.adsdk.jpo.jd.wqx.jpo.jpo(), new qk(), new wqx(), new xyk()};
        final com.bytedance.adsdk.jpo.jd.wqx.jpo jpoVar = new com.bytedance.adsdk.jpo.jd.wqx.jpo() { // from class: com.bytedance.adsdk.jpo.jd.jpo.1
            @Override // com.bytedance.adsdk.jpo.jd.wqx.jpo
            public int jpo(String str, int i11, Deque<com.bytedance.adsdk.jpo.jd.jd.jpo> deque) {
                return i11;
            }
        };
        while (i10 >= 0) {
            final jj jjVar = jjVarArr[i10];
            i10--;
            jpoVar = new com.bytedance.adsdk.jpo.jd.wqx.jpo() { // from class: com.bytedance.adsdk.jpo.jd.jpo.2
                @Override // com.bytedance.adsdk.jpo.jd.wqx.jpo
                public int jpo(String str, int i11, Deque<com.bytedance.adsdk.jpo.jd.jd.jpo> deque) {
                    return jjVar.jpo(str, i11, deque, jpoVar);
                }
            };
        }
        jpo = jpoVar;
    }

    private jpo(String str, com.bytedance.adsdk.jpo.jd.wqx.jpo jpoVar) {
        this.f17667jd = jpoVar;
        this.my = str;
        try {
            jpo();
        } catch (Exception e10) {
            throw new com.bytedance.adsdk.jpo.jpo.jd(str, e10);
        }
    }

    public static jpo jpo(String str) {
        return new jpo(str, jpo);
    }

    private void jpo() {
        int length = this.my.length();
        int i10 = 0;
        while (i10 < length) {
            int iJpo = this.f17667jd.jpo(this.my, i10, this.f17666cm);
            if (iJpo == i10) {
                throw new IllegalArgumentException("Unrecognized expression, unrecognized characters encountered during parsing:" + this.my.substring(0, i10));
            }
            i10 = iJpo;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            com.bytedance.adsdk.jpo.jd.jd.jpo jpoVarPollFirst = this.f17666cm.pollFirst();
            if (jpoVarPollFirst == null) {
                this.wqx = com.bytedance.adsdk.jpo.jd.my.jd.jpo(arrayList, this.my, i10);
                this.f17666cm = null;
                return;
            }
            arrayList.add(0, jpoVarPollFirst);
        }
    }

    public <T> T jpo(JSONObject jSONObject) {
        HashMap map = new HashMap();
        map.put("default_key", jSONObject);
        return (T) jpo(map);
    }

    public <T> T jpo(Map<String, JSONObject> map) {
        return (T) this.wqx.jpo(map);
    }
}
