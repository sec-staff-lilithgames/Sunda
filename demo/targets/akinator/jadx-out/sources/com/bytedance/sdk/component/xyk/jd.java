package com.bytedance.sdk.component.xyk;

import android.os.SystemClock;
import com.bytedance.sdk.component.utils.prr;
import com.ironsource.C3191e4;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
class jd implements Comparable, Runnable {

    /* renamed from: cm, reason: collision with root package name */
    private Thread f19021cm = null;

    /* renamed from: jd, reason: collision with root package name */
    private jpo f19022jd;
    private xyk jpo;
    private long wqx;

    public jd(xyk xykVar, jpo jpoVar) {
        this.wqx = 0L;
        this.jpo = xykVar;
        this.f19022jd = jpoVar;
        this.wqx = SystemClock.uptimeMillis();
    }

    private void jpo(String str, String str2, long j10) {
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (obj instanceof jd) {
            return this.jpo.compareTo(((jd) obj).jpo());
        }
        return 0;
    }

    public boolean equals(Object obj) {
        xyk xykVar;
        return (obj instanceof jd) && (xykVar = this.jpo) != null && xykVar.equals(((jd) obj).jpo());
    }

    public int hashCode() {
        return this.jpo.hashCode();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // java.lang.Runnable
    public void run() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        this.f19021cm = Thread.currentThread();
        xyk xykVar = this.jpo;
        if (xykVar != null) {
            xykVar.run();
        }
        long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
        if (this.f19022jd != null) {
            cm.jpo();
        }
        if (prr.jpo()) {
            jpo jpoVar = this.f19022jd;
            if (jpoVar != null) {
                jpoVar.jpo();
            }
            xyk xykVar2 = this.jpo;
            if (xykVar2 != null) {
                xykVar2.getName();
            }
            String strJpo = this.f19022jd.jpo();
            strJpo.getClass();
            char c10 = 65535;
            switch (strJpo.hashCode()) {
                case 3107:
                    if (strJpo.equals("ad")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3366:
                    if (strJpo.equals("io")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 107332:
                    if (strJpo.equals("log")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 3237136:
                    if (strJpo.equals(C3191e4.a.f36368f)) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 212371911:
                    if (strJpo.equals("computation")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            String name = AbstractJsonLexerKt.NULL;
            switch (c10) {
                case 0:
                case 3:
                    if (jUptimeMillis2 > 2000) {
                        jpo jpoVar2 = this.f19022jd;
                        String strJpo2 = jpoVar2 != null ? jpoVar2.jpo() : AbstractJsonLexerKt.NULL;
                        xyk xykVar3 = this.jpo;
                        if (xykVar3 != null) {
                            name = xykVar3.getName();
                        }
                        jpo(strJpo2, name, jUptimeMillis2);
                        break;
                    }
                    break;
                case 1:
                    if (jUptimeMillis2 > 5000) {
                        jpo jpoVar3 = this.f19022jd;
                        String strJpo3 = jpoVar3 != null ? jpoVar3.jpo() : AbstractJsonLexerKt.NULL;
                        xyk xykVar4 = this.jpo;
                        if (xykVar4 != null) {
                            name = xykVar4.getName();
                        }
                        jpo(strJpo3, name, jUptimeMillis2);
                        break;
                    }
                    break;
                case 2:
                    if (jUptimeMillis2 > 3000) {
                        jpo jpoVar4 = this.f19022jd;
                        String strJpo4 = jpoVar4 != null ? jpoVar4.jpo() : AbstractJsonLexerKt.NULL;
                        xyk xykVar5 = this.jpo;
                        if (xykVar5 != null) {
                            name = xykVar5.getName();
                        }
                        jpo(strJpo4, name, jUptimeMillis2);
                        break;
                    }
                    break;
                case 4:
                    if (jUptimeMillis2 > 1000) {
                        jpo jpoVar5 = this.f19022jd;
                        String strJpo5 = jpoVar5 != null ? jpoVar5.jpo() : AbstractJsonLexerKt.NULL;
                        xyk xykVar6 = this.jpo;
                        if (xykVar6 != null) {
                            name = xykVar6.getName();
                        }
                        jpo(strJpo5, name, jUptimeMillis2);
                        break;
                    }
                    break;
            }
        }
    }

    public xyk jpo() {
        return this.jpo;
    }
}
