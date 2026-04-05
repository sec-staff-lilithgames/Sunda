package com.bytedance.sdk.openadsdk.core.xyk;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.openadsdk.core.settings.jj;
import com.bytedance.sdk.openadsdk.core.sq;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {

    /* renamed from: jd, reason: collision with root package name */
    private static volatile boolean f21018jd;
    private static volatile jpo jpo;
    private static volatile long wqx;

    /* renamed from: cm, reason: collision with root package name */
    private final Queue<C0136jpo> f21019cm = new LinkedList();

    /* renamed from: jj, reason: collision with root package name */
    private final jj f21020jj = sq.cm();
    private Handler my;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.sdk.openadsdk.core.xyk.jpo$jpo, reason: collision with other inner class name */
    public static class C0136jpo {

        /* renamed from: jd, reason: collision with root package name */
        private final String f21021jd;
        private final long jpo;

        private C0136jpo(long j10, String str) {
            this.jpo = j10;
            this.f21021jd = str;
        }
    }

    private jpo() {
    }

    private synchronized boolean jd(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iRq = this.f21020jj.rq();
        long jNmd = this.f21020jj.nmd();
        if (this.f21019cm.size() <= 0 || this.f21019cm.size() < iRq) {
            this.f21019cm.offer(new C0136jpo(jCurrentTimeMillis, str));
        } else {
            long jAbs = Math.abs(jCurrentTimeMillis - this.f21019cm.peek().jpo);
            if (jAbs <= jNmd) {
                jd(jNmd - jAbs);
                return true;
            }
            this.f21019cm.poll();
            this.f21019cm.offer(new C0136jpo(jCurrentTimeMillis, str));
        }
        return false;
    }

    public synchronized String wqx() {
        String str;
        try {
            HashMap map = new HashMap();
            for (C0136jpo c0136jpo : this.f21019cm) {
                if (map.containsKey(c0136jpo.f21021jd)) {
                    map.put(c0136jpo.f21021jd, Integer.valueOf(((Integer) map.get(c0136jpo.f21021jd)).intValue() + 1));
                } else {
                    map.put(c0136jpo.f21021jd, 1);
                }
            }
            str = "";
            int i10 = Integer.MIN_VALUE;
            for (String str2 : map.keySet()) {
                int iIntValue = ((Integer) map.get(str2)).intValue();
                if (i10 < iIntValue) {
                    str = str2;
                    i10 = iIntValue;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return str;
    }

    public static jpo jpo() {
        if (jpo == null) {
            synchronized (jpo.class) {
                try {
                    if (jpo == null) {
                        jpo = new jpo();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return jpo;
    }

    public synchronized boolean jpo(String str) {
        try {
            if (jd(str)) {
                jpo(true);
                jpo(wqx);
            } else {
                jpo(false);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f21018jd;
    }

    private synchronized void jpo(long j10) {
        try {
            if (this.my == null) {
                this.my = new Handler(Looper.getMainLooper());
            }
            this.my.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.xyk.jpo.1
                @Override // java.lang.Runnable
                public void run() {
                    jpo.this.jpo(false);
                }
            }, j10);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized boolean jd() {
        return f21018jd;
    }

    private synchronized void jd(long j10) {
        wqx = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void jpo(boolean z10) {
        f21018jd = z10;
    }
}
