package com.bytedance.sdk.component.jj.jpo.jpo.jpo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class my implements com.bytedance.sdk.component.jj.jpo.jpo.my {
    public static final my jpo = new my();

    /* renamed from: jd, reason: collision with root package name */
    private volatile SQLiteDatabase f18725jd;

    @Override // com.bytedance.sdk.component.jj.jpo.jpo.my
    public String cm() {
        return "logstats";
    }

    @Override // com.bytedance.sdk.component.jj.jpo.jpo.my
    public String jd() {
        return "adevent";
    }

    @Override // com.bytedance.sdk.component.jj.jpo.jpo.my
    public String jj() {
        return null;
    }

    @Override // com.bytedance.sdk.component.jj.jpo.jpo.my
    public SQLiteDatabase jpo(Context context) {
        if (this.f18725jd == null) {
            synchronized (this) {
                try {
                    if (this.f18725jd == null) {
                        this.f18725jd = new cm(context).getWritableDatabase();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f18725jd;
    }

    @Override // com.bytedance.sdk.component.jj.jpo.jpo.my
    public String my() {
        return "logstatsbatch";
    }

    @Override // com.bytedance.sdk.component.jj.jpo.jpo.my
    public String wqx() {
        return null;
    }

    @Override // com.bytedance.sdk.component.jj.jpo.jpo.my
    public String jpo() {
        return "loghighpriority";
    }
}
