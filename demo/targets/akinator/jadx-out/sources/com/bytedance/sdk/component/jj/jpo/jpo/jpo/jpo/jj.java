package com.bytedance.sdk.component.jj.jpo.jpo.jpo.jpo;

import a.b;
import android.content.Context;
import com.bytedance.sdk.component.jj.jpo.xyk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jj extends qk {
    public jj(Context context, com.bytedance.sdk.component.jj.jpo.cm.jd.jpo jpoVar) {
        super(context, jpoVar);
    }

    @Override // com.bytedance.sdk.component.jj.jpo.jpo.jpo.jpo.qk, com.bytedance.sdk.component.jj.jpo.jpo.jpo.jpo.wqx
    public String jd() {
        return xyk.qk().cm().my();
    }

    @Override // com.bytedance.sdk.component.jj.jpo.jpo.jpo.jpo.qk
    public byte jpo() {
        return (byte) 1;
    }

    @Override // com.bytedance.sdk.component.jj.jpo.jpo.jpo.jpo.qk
    public byte wqx() {
        return (byte) 3;
    }

    public static String jpo(String str) {
        return b.l("CREATE TABLE IF NOT EXISTS ", str, " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)");
    }
}
