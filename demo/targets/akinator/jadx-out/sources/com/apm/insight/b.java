package com.apm.insight;

import android.text.TextUtils;
import org.json.JSONArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class b implements ICrashCallback, IOOMCallback {

    /* renamed from: a, reason: collision with root package name */
    private IOOMCallback f12825a;

    /* renamed from: b, reason: collision with root package name */
    private ICrashCallback f12826b;

    /* renamed from: c, reason: collision with root package name */
    private String f12827c;

    public b(String str, ICrashCallback iCrashCallback) {
        this.f12827c = str;
        this.f12826b = iCrashCallback;
    }

    public final void a(CrashType crashType, Throwable th2, Thread thread, long j10, JSONArray jSONArray) {
        CrashType crashType2;
        Throwable th3;
        Thread thread2;
        long j11;
        if (this.f12825a == null || jSONArray == null) {
            return;
        }
        int i10 = 0;
        while (i10 < jSONArray.length()) {
            if (TextUtils.equals(a.a(jSONArray.optJSONObject(i10), "header", "aid"), this.f12827c)) {
                crashType2 = crashType;
                th3 = th2;
                thread2 = thread;
                j11 = j10;
                this.f12825a.onCrash(crashType2, th3, thread2, j11);
            } else {
                crashType2 = crashType;
                th3 = th2;
                thread2 = thread;
                j11 = j10;
            }
            i10++;
            crashType = crashType2;
            th2 = th3;
            thread = thread2;
            j10 = j11;
        }
    }

    @Override // com.apm.insight.ICrashCallback
    public final void onCrash(CrashType crashType, String str, Thread thread) {
    }

    @Override // com.apm.insight.IOOMCallback
    public final void onCrash(CrashType crashType, Throwable th2, Thread thread, long j10) {
    }

    public b(String str, IOOMCallback iOOMCallback) {
        this.f12827c = str;
        this.f12825a = iOOMCallback;
    }

    public final void a(CrashType crashType, String str, Thread thread, JSONArray jSONArray) {
        if (this.f12826b == null || jSONArray == null) {
            return;
        }
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            if (TextUtils.equals(a.a(jSONArray.optJSONObject(i10), "header", "aid"), this.f12827c)) {
                this.f12826b.onCrash(crashType, str, thread);
            }
        }
    }

    public final void a(CrashType crashType, String str, String str2, String str3) {
        d dVarA;
        if (this.f12826b == null || (dVarA = d.a(this.f12827c)) == null || !dVarA.a(str3, str2)) {
            return;
        }
        this.f12826b.onCrash(crashType, str, null);
    }
}
