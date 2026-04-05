package com.bytedance.sdk.openadsdk.sq.wqx;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {
    private final SharedPreferences jpo;

    public jpo(Context context) {
        this.jpo = context.getSharedPreferences("pag_monitor_record", 0);
    }

    public long jpo() {
        return this.jpo.getLong("last_upload_time", 0L);
    }

    public void jpo(long j10) {
        SharedPreferences.Editor editorEdit = this.jpo.edit();
        editorEdit.putLong("last_upload_time", j10);
        editorEdit.apply();
    }
}
