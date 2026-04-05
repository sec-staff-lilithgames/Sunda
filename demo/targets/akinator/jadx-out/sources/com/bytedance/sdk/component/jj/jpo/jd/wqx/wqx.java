package com.bytedance.sdk.component.jj.jpo.jd.wqx;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.bytedance.sdk.component.jj.jpo.jpo.cm;
import com.bytedance.sdk.component.jj.jpo.my;
import com.bytedance.sdk.component.jj.jpo.xyk;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx extends HandlerThread implements Handler.Callback {

    /* renamed from: jr, reason: collision with root package name */
    private static int f18667jr = 200;

    /* renamed from: sq, reason: collision with root package name */
    private static int f18668sq = 10;

    /* renamed from: au, reason: collision with root package name */
    private volatile Handler f18669au;

    /* renamed from: cm, reason: collision with root package name */
    private com.bytedance.sdk.component.jj.jpo.jd.wqx f18670cm;
    private final AtomicInteger hna;

    /* renamed from: if, reason: not valid java name */
    private final AtomicInteger f66if;

    /* renamed from: jd, reason: collision with root package name */
    private volatile boolean f18671jd;

    /* renamed from: jj, reason: collision with root package name */
    private volatile int f18672jj;
    protected cm jpo;

    /* renamed from: ju, reason: collision with root package name */
    private final long f18673ju;
    private final PriorityBlockingQueue<com.bytedance.sdk.component.jj.jpo.cm.jpo> my;
    private final int nmd;
    private long opi;
    private final List<com.bytedance.sdk.component.jj.jpo.cm.jpo> oya;
    private final AtomicInteger prr;

    /* renamed from: qk, reason: collision with root package name */
    private volatile long f18674qk;

    /* renamed from: rq, reason: collision with root package name */
    private final int f18675rq;

    /* renamed from: tu, reason: collision with root package name */
    private final int f18676tu;
    private final Object wqx;
    private volatile long xyk;

    /* renamed from: yd, reason: collision with root package name */
    private final long f18677yd;
    private final AtomicInteger zz;

    public wqx(PriorityBlockingQueue<com.bytedance.sdk.component.jj.jpo.cm.jpo> priorityBlockingQueue) {
        super("csj_log");
        this.f18671jd = true;
        this.wqx = new Object();
        this.f18674qk = 0L;
        this.xyk = 0L;
        this.zz = new AtomicInteger(0);
        this.f18677yd = 5000L;
        this.f18673ju = 5000000000L;
        this.f66if = new AtomicInteger(0);
        this.oya = new ArrayList();
        this.prr = new AtomicInteger(0);
        this.hna = new AtomicInteger(0);
        this.opi = ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
        this.nmd = 1;
        this.f18675rq = 2;
        this.f18676tu = 3;
        this.my = priorityBlockingQueue;
        this.jpo = new com.bytedance.sdk.component.jj.jpo.jpo.jd();
        if (com.bytedance.sdk.component.jj.jpo.jd.jd()) {
            return;
        }
        long jPrr = xyk.qk().hna().prr();
        if (jPrr > 0) {
            this.opi = jPrr;
        }
    }

    private void cm() {
        if (!isAlive()) {
            com.bytedance.sdk.component.jj.jpo.jd.cm.jpo.cm();
        } else {
            if (jpo()) {
                return;
            }
            wqx(6);
        }
    }

    private void jj() {
        com.bytedance.sdk.component.jj.jpo.wqx.jd.jpo(com.bytedance.sdk.component.jj.jpo.jd.cm.f18630cm.tu(), 1);
        jpo(false);
        com.bytedance.sdk.component.jj.jpo.jd.cm.jpo.wqx();
    }

    private void my() {
        while (jpo()) {
            try {
                com.bytedance.sdk.component.jj.jpo.jd.jpo.jpo jpoVar = com.bytedance.sdk.component.jj.jpo.jd.cm.f18630cm;
                com.bytedance.sdk.component.jj.jpo.wqx.jd.jpo(jpoVar.xyk(), 1);
                com.bytedance.sdk.component.jj.jpo.cm.jpo jpoVarPoll = this.my.poll(this.opi, TimeUnit.MILLISECONDS);
                int size = this.my.size();
                if (jpoVarPoll instanceof com.bytedance.sdk.component.jj.jpo.cm.jd) {
                    jpo(jpoVarPoll, size);
                } else if (jpoVarPoll == null) {
                    int iIncrementAndGet = this.zz.incrementAndGet();
                    com.bytedance.sdk.component.jj.jpo.wqx.jd.jpo(jpoVar.pe(), 1);
                    if (cm(iIncrementAndGet)) {
                        jj();
                        return;
                    } else if (iIncrementAndGet < 4) {
                        this.f18672jj = 1;
                        jd((com.bytedance.sdk.component.jj.jpo.cm.jpo) null);
                    }
                } else {
                    jpo(jpoVarPoll);
                    jd(jpoVarPoll);
                }
            } catch (Throwable th2) {
                th2.getMessage();
                com.bytedance.sdk.component.jj.jpo.wqx.jd.jpo(com.bytedance.sdk.component.jj.jpo.jd.cm.f18630cm.tic(), 1);
            }
        }
    }

    private void qk() throws JSONException {
        if (this.my.size() >= 100) {
            for (int i10 = 0; i10 < 100; i10++) {
                com.bytedance.sdk.component.jj.jpo.cm.jpo jpoVarPoll = this.my.poll();
                if (!(jpoVarPoll instanceof com.bytedance.sdk.component.jj.jpo.cm.jd) && jpoVarPoll != null) {
                    jpo(jpoVarPoll);
                }
            }
        }
    }

    private void wqx() {
        cm();
        com.bytedance.sdk.component.jj.jpo.wqx.jd.jpo(com.bytedance.sdk.component.jj.jpo.jd.cm.f18630cm.duq(), 1);
        wqx(1);
    }

    private boolean xyk() {
        if (com.bytedance.sdk.component.jj.jpo.jd.cm.jpo.f18633jd) {
            return this.f18672jj == 4 || this.f18672jj == 7 || this.f18672jj == 6 || this.f18672jj == 5 || this.f18672jj == 2;
        }
        return false;
    }

    private void yd() {
        long jNanoTime;
        com.bytedance.sdk.component.jj.jpo.jd.cm cmVar;
        if (this.f18669au.hasMessages(11)) {
            zz();
        } else {
            my(1);
        }
        com.bytedance.sdk.component.jj.jpo.jd.jpo.jpo jpoVar = com.bytedance.sdk.component.jj.jpo.jd.cm.f18630cm;
        com.bytedance.sdk.component.jj.jpo.wqx.jd.jpo(jpoVar.jd(), 1);
        if (this.f18672jj == 2) {
            com.bytedance.sdk.component.jj.jpo.wqx.jd.jpo(jpoVar.qk(), 1);
            synchronized (this.wqx) {
                try {
                    try {
                        long jNanoTime2 = System.nanoTime();
                        this.wqx.wait(5000L);
                        jNanoTime = System.nanoTime() - jNanoTime2;
                        cmVar = com.bytedance.sdk.component.jj.jpo.jd.cm.jpo;
                        if (!cmVar.f18633jd) {
                            boolean z10 = cmVar.wqx;
                        }
                    } catch (InterruptedException e10) {
                        e10.getMessage();
                    }
                    if (jNanoTime < 5000000000L && 5000000000L - jNanoTime >= 50000000) {
                        if (!cmVar.f18633jd && !cmVar.wqx) {
                            com.bytedance.sdk.component.jj.jpo.wqx.jd.jpo(jpoVar.dm(), 1);
                            wqx(2);
                            return;
                        }
                        com.bytedance.sdk.component.jj.jpo.wqx.jd.jpo(jpoVar.ju(), 1);
                        return;
                    }
                    com.bytedance.sdk.component.jj.jpo.wqx.jd.jpo(jpoVar.yd(), 1);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private void zz() {
        try {
            if (this.my.size() == 0 && this.f18669au.hasMessages(11) && jpo()) {
                jpo(false);
            }
        } catch (Exception e10) {
            e10.getMessage();
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i10 = message.what;
        try {
        } catch (Throwable th2) {
            th2.getMessage();
        }
        if (i10 == 1) {
            com.bytedance.sdk.component.jj.jpo.wqx.jd.jpo(com.bytedance.sdk.component.jj.jpo.jd.cm.f18630cm.zz(), 1);
            jd();
            jpo(true);
            my();
        } else {
            if (i10 != 2 && i10 != 3) {
                if (i10 == 11) {
                    ArrayList arrayList = new ArrayList(this.oya);
                    this.oya.clear();
                    jpo((List<com.bytedance.sdk.component.jj.jpo.cm.jpo>) arrayList, false, "timeout_dispatch");
                    yd();
                }
                return true;
            }
            wqx();
        }
        return true;
    }

    @Override // android.os.HandlerThread
    public void onLooperPrepared() {
        super.onLooperPrepared();
        this.f18669au = new Handler(getLooper(), this);
        com.bytedance.sdk.component.jj.jpo.jd.cm.jpo.jpo(this.f18669au);
        this.f18669au.sendEmptyMessage(1);
    }

    public static void jd(int i10) {
        f18667jr = i10;
    }

    private void jd() {
        long jSq = xyk.qk().sq();
        if (jSq <= 0) {
            return;
        }
        this.jpo.jpo(Integer.MAX_VALUE, jSq);
    }

    public static void jpo(int i10) {
        f18668sq = i10;
    }

    public void wqx(int i10) {
        try {
            boolean zJpo = jpo(i10, com.bytedance.sdk.component.jj.jpo.jd.cm.jpo.f18633jd);
            if (i10 != 6 && !zJpo) {
                return;
            }
            com.bytedance.sdk.component.jj.jpo.cm.jd jdVar = new com.bytedance.sdk.component.jj.jpo.cm.jd();
            jdVar.jd(i10);
            this.my.add(jdVar);
            my(3);
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    private boolean cm(int i10) {
        if (i10 < 4 || this.f66if.get() != 0) {
            return false;
        }
        com.bytedance.sdk.component.jj.jpo.jd.cm cmVar = com.bytedance.sdk.component.jj.jpo.jd.cm.jpo;
        return (cmVar.f18633jd || cmVar.wqx) ? false : true;
    }

    private void jd(com.bytedance.sdk.component.jj.jpo.cm.jpo jpoVar) {
        List<com.bytedance.sdk.component.jj.jpo.cm.jpo> listJpo;
        if (com.bytedance.sdk.component.jj.jpo.wqx.jpo.jd() && xyk.qk().jpo()) {
            return;
        }
        int i10 = 0;
        if (xyk()) {
            com.bytedance.sdk.component.jj.jpo.wqx.jpo.jpo(this.f18672jj);
            com.bytedance.sdk.component.jj.jpo.wqx.jd.jpo(com.bytedance.sdk.component.jj.jpo.jd.cm.f18630cm.m414if(), 1);
            if (this.my.size() != 0) {
                return;
            }
            if (!this.f18669au.hasMessages(2)) {
                com.bytedance.sdk.component.jj.jpo.jd.cm.jpo.f18633jd = false;
                this.xyk = 0L;
                this.f18674qk = 0L;
                this.prr.set(0);
                this.hna.set(0);
            } else {
                jpo(false);
                return;
            }
        }
        do {
            boolean zJpo = jpo(this.f18672jj, com.bytedance.sdk.component.jj.jpo.jd.cm.jpo.f18633jd);
            com.bytedance.sdk.component.jj.jpo.wqx.jpo.jpo(zJpo, this.f18672jj, jpoVar);
            com.bytedance.sdk.component.jj.jpo.wqx.jd.jpo(com.bytedance.sdk.component.jj.jpo.jd.cm.f18630cm.au(), 1);
            if (zJpo && (listJpo = this.jpo.jpo(this.f18672jj, -1, null)) != null) {
                listJpo.size();
                jpo(listJpo);
            } else {
                zz();
            }
            i10++;
            if (!zJpo) {
                return;
            }
        } while (i10 <= 6);
    }

    public void jpo(boolean z10) {
        this.f18671jd = z10;
    }

    public boolean jpo() {
        return this.f18671jd;
    }

    public boolean jpo(int i10, boolean z10) {
        my myVarHna = xyk.qk().hna();
        if (myVarHna == null || !myVarHna.jpo(xyk.qk().jj())) {
            return false;
        }
        return this.jpo.jpo(i10, z10);
    }

    public void jpo(com.bytedance.sdk.component.jj.jpo.cm.jpo jpoVar, boolean z10) {
        if (jpoVar == null) {
            return;
        }
        jpoVar.cm();
        if (z10) {
            if (this.f18669au != null) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(jpoVar);
                jpo((List<com.bytedance.sdk.component.jj.jpo.cm.jpo>) arrayList, true, "ignore_result_dispatch");
                return;
            }
            return;
        }
        this.my.add(jpoVar);
        my(2);
    }

    private void jpo(com.bytedance.sdk.component.jj.jpo.cm.jpo jpoVar, int i10) throws JSONException {
        this.zz.set(0);
        if (i10 == 0) {
            this.f18672jj = ((com.bytedance.sdk.component.jj.jpo.cm.jd) jpoVar).ju();
            if (this.f18672jj != 6) {
                com.bytedance.sdk.component.jj.jpo.wqx.jd.jpo(com.bytedance.sdk.component.jj.jpo.jd.cm.f18630cm.roc(), 1);
                jd(jpoVar);
                return;
            }
            return;
        }
        com.bytedance.sdk.component.jj.jpo.cm.jd jdVar = (com.bytedance.sdk.component.jj.jpo.cm.jd) jpoVar;
        if (jdVar.ju() == 1) {
            this.f18672jj = 1;
            jd(jpoVar);
        } else if (jdVar.ju() == 2) {
            qk();
            this.f18672jj = 2;
            jd(jpoVar);
        }
    }

    private void my(int i10) {
        if (!jpo()) {
            if (this.f18669au == null) {
                return;
            }
            com.bytedance.sdk.component.jj.jpo.jd.jpo.jpo jpoVar = com.bytedance.sdk.component.jj.jpo.jd.cm.f18630cm;
            com.bytedance.sdk.component.jj.jpo.wqx.jd.jpo(jpoVar.wqx(), 1);
            if (this.f18669au.hasMessages(1)) {
                return;
            }
            if (i10 == 1) {
                com.bytedance.sdk.component.jj.jpo.wqx.jd.jpo(jpoVar.jj(), 1);
            } else if (i10 == 2) {
                com.bytedance.sdk.component.jj.jpo.wqx.jd.jpo(jpoVar.cm(), 1);
            } else if (i10 == 3) {
                com.bytedance.sdk.component.jj.jpo.wqx.jd.jpo(jpoVar.my(), 1);
            }
            this.f18669au.sendEmptyMessage(1);
            return;
        }
        com.bytedance.sdk.component.jj.jpo.wqx.jd.jpo(com.bytedance.sdk.component.jj.jpo.jd.cm.f18630cm.jpo(), 1);
    }

    private void jd(List<com.bytedance.sdk.component.jj.jpo.cm.jpo> list) {
        this.oya.addAll(list);
        this.oya.size();
        my myVarHna = xyk.qk().hna();
        if (myVarHna != null && myVarHna.mo416if() != null) {
            f18668sq = myVarHna.mo416if().jd();
        }
        if (this.oya.size() >= f18668sq) {
            if (this.f18669au.hasMessages(11)) {
                this.f18669au.removeMessages(11);
            }
            ArrayList arrayList = new ArrayList(this.oya);
            this.oya.clear();
            jpo((List<com.bytedance.sdk.component.jj.jpo.cm.jpo>) arrayList, false, "max_size_dispatch");
            yd();
            return;
        }
        if (this.my.size() == 0) {
            jpo(false);
            if (this.f18669au.hasMessages(11)) {
                this.f18669au.removeMessages(11);
            }
            if (this.f18669au.hasMessages(1)) {
                this.f18669au.removeMessages(1);
            }
            long jJpo = f18667jr;
            if (myVarHna != null && myVarHna.mo416if() != null) {
                jJpo = myVarHna.mo416if().jpo();
            }
            this.f18669au.sendEmptyMessageDelayed(11, jJpo);
            return;
        }
        this.oya.size();
    }

    private void jpo(com.bytedance.sdk.component.jj.jpo.cm.jpo jpoVar) throws JSONException {
        this.zz.set(0);
        com.bytedance.sdk.component.jj.jpo.jd.cm cmVar = com.bytedance.sdk.component.jj.jpo.jd.cm.jpo;
        if (cmVar.f18633jd) {
            this.f18672jj = 5;
        } else if (cmVar.wqx) {
            this.f18672jj = 7;
        } else {
            this.f18672jj = 4;
        }
        com.bytedance.sdk.component.jj.jpo.wqx.jd.jpo(com.bytedance.sdk.component.jj.jpo.jd.cm.f18630cm.wcn(), 1);
        this.jpo.jpo(jpoVar, this.f18672jj);
        com.bytedance.sdk.component.jj.jpo.wqx.jpo.qk(jpoVar);
    }

    private void jpo(List<com.bytedance.sdk.component.jj.jpo.cm.jpo> list, String str) {
        jpo(str);
        jpo(list, false, str);
        yd();
    }

    private void jpo(List<com.bytedance.sdk.component.jj.jpo.cm.jpo> list) {
        if (list.size() != 0) {
            com.bytedance.sdk.component.jj.jpo.wqx.jpo.jpo(list, this.my.size());
            if (list.size() <= 1 && !com.bytedance.sdk.component.jj.jpo.wqx.jpo.wqx()) {
                com.bytedance.sdk.component.jj.jpo.cm.jpo jpoVar = list.get(0);
                if (jpoVar != null) {
                    if (jpoVar.my() == 1) {
                        jpo(list, "highPriority");
                        return;
                    }
                    if (jpoVar.cm() == 0 && jpoVar.my() == 2) {
                        if (jpoVar.jd() == 3) {
                            jpo(list, "version_v3");
                            return;
                        } else {
                            jd(list);
                            return;
                        }
                    }
                    if (jpoVar.cm() == 1) {
                        jpo(list, "stats");
                        return;
                    } else if (jpoVar.cm() == 3) {
                        jpo(list, "adType_v3");
                        return;
                    } else {
                        if (jpoVar.cm() == 2) {
                            jpo(list, "other");
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            jpo(list, "batchRead");
            return;
        }
        zz();
    }

    private void jd(List<com.bytedance.sdk.component.jj.jpo.cm.jpo> list, final boolean z10, final long j10) {
        this.f66if.incrementAndGet();
        com.bytedance.sdk.component.jj.jpo.wqx.jd.jpo(com.bytedance.sdk.component.jj.jpo.jd.cm.f18630cm.cql(), 1);
        try {
            HashMap map = new HashMap();
            Iterator<com.bytedance.sdk.component.jj.jpo.cm.jpo> it = list.iterator();
            while (it.hasNext()) {
                com.bytedance.sdk.component.jj.jpo.cm.jpo next = it.next();
                int iYd = next == null ? 0 : next.yd();
                if (map.get(Integer.valueOf(iYd)) == null) {
                    map.put(Integer.valueOf(iYd), new ArrayList());
                }
                ((List) map.get(Integer.valueOf(iYd))).add(next);
            }
            for (Integer num : map.keySet()) {
                if (num.intValue() != 0 && xyk.qk().wqx() != null && xyk.qk().wqx().get(num) != null) {
                    xyk.qk().wqx().get(num).jpo(list, new com.bytedance.sdk.component.jj.jpo.jd.jd() { // from class: com.bytedance.sdk.component.jj.jpo.jd.wqx.wqx.3
                        @Override // com.bytedance.sdk.component.jj.jpo.jd.jd
                        public void jpo(List<jpo> list2) {
                            try {
                                wqx.this.f66if.decrementAndGet();
                                if (list2 == null || list2.size() == 0) {
                                    return;
                                }
                                int size = list2.size();
                                for (int i10 = 0; i10 < size; i10++) {
                                    jpo jpoVar = list2.get(i10);
                                    if (jpoVar != null) {
                                        wqx.this.jpo(z10, jpoVar.jpo(), jpoVar.jd(), j10);
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                    });
                } else {
                    this.f18670cm.jpo(list, new com.bytedance.sdk.component.jj.jpo.jd.jd() { // from class: com.bytedance.sdk.component.jj.jpo.jd.wqx.wqx.2
                        @Override // com.bytedance.sdk.component.jj.jpo.jd.jd
                        public void jpo(List<jpo> list2) {
                            try {
                                wqx.this.f66if.decrementAndGet();
                                if (list2 == null || list2.size() == 0) {
                                    return;
                                }
                                int size = list2.size();
                                for (int i10 = 0; i10 < size; i10++) {
                                    jpo jpoVar = list2.get(i10);
                                    if (jpoVar != null) {
                                        wqx.this.jpo(z10, jpoVar.jpo(), jpoVar.jd(), j10);
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                    });
                }
            }
        } catch (Exception e10) {
            e10.getMessage();
            com.bytedance.sdk.component.jj.jpo.wqx.jd.jpo(com.bytedance.sdk.component.jj.jpo.jd.cm.f18630cm.tic(), 1);
            this.f66if.decrementAndGet();
        }
    }

    private void jpo(String str) {
        if (this.f18669au.hasMessages(11)) {
            this.f18669au.removeMessages(11);
        }
        if (this.oya.size() != 0) {
            ArrayList arrayList = new ArrayList(this.oya);
            this.oya.clear();
            jpo((List<com.bytedance.sdk.component.jj.jpo.cm.jpo>) arrayList, false, "before_".concat(String.valueOf(str)));
            yd();
            arrayList.size();
        }
    }

    private void jpo(List<com.bytedance.sdk.component.jj.jpo.cm.jpo> list, boolean z10, String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        com.bytedance.sdk.component.jj.jpo.wqx.jpo.jpo(list, this.f18672jj, str);
        com.bytedance.sdk.component.jj.jpo.jd.wqx wqxVarXyk = xyk.qk().xyk();
        this.f18670cm = wqxVarXyk;
        if (wqxVarXyk != null) {
            jd(list, z10, jCurrentTimeMillis);
        } else {
            jpo(list, z10, jCurrentTimeMillis);
        }
    }

    private void jpo(final List<com.bytedance.sdk.component.jj.jpo.cm.jpo> list, final boolean z10, final long j10) {
        my myVarHna = xyk.qk().hna();
        if (myVarHna != null) {
            Executor executorMy = myVarHna.my();
            if (list.get(0).my() == 1) {
                executorMy = myVarHna.cm();
            }
            if (executorMy == null) {
                return;
            }
            this.f66if.incrementAndGet();
            executorMy.execute(new com.bytedance.sdk.component.jj.jpo.my.my("csj_log_upload") { // from class: com.bytedance.sdk.component.jj.jpo.jd.wqx.wqx.1
                @Override // java.lang.Runnable
                public void run() {
                    wqx wqxVar = wqx.this;
                    wqxVar.jpo((List<com.bytedance.sdk.component.jj.jpo.cm.jpo>) list, z10, j10, wqxVar.f18672jj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(List<com.bytedance.sdk.component.jj.jpo.cm.jpo> list, boolean z10, long j10, int i10) {
        wqx wqxVar;
        Throwable th2;
        com.bytedance.sdk.component.jj.jpo.cm.jpo jpoVar;
        jd jdVarJpo;
        try {
            jpoVar = list.get(0);
            com.bytedance.sdk.component.jj.jpo.wqx.jd.jpo(com.bytedance.sdk.component.jj.jpo.jd.cm.f18630cm.cql(), 1);
        } catch (Throwable th3) {
            th = th3;
            wqxVar = this;
        }
        try {
            if (jpoVar.cm() == 0) {
                jdVarJpo = xyk.my().jpo(list);
                jpo(jdVarJpo, list);
                if (jdVarJpo != null) {
                    com.bytedance.sdk.component.jj.jpo.wqx.jpo.jpo(list, jdVarJpo.f18664cm);
                }
            } else {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONArray jSONArray = new JSONArray();
                    Iterator<com.bytedance.sdk.component.jj.jpo.cm.jpo> it = list.iterator();
                    while (it.hasNext()) {
                        jSONArray.put(it.next().qk());
                    }
                    jSONObject.put("stats_list", jSONArray);
                } catch (Exception e10) {
                    e10.getMessage();
                }
                jdVarJpo = xyk.my().jpo(jSONObject);
            }
            jd jdVar = jdVarJpo;
            this.f66if.decrementAndGet();
            wqxVar = this;
            try {
                wqxVar.jpo(z10, jdVar, list, j10);
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                th2.getMessage();
                com.bytedance.sdk.component.jj.jpo.wqx.jd.jpo(com.bytedance.sdk.component.jj.jpo.jd.cm.f18630cm.tic(), 1);
                wqxVar.f66if.decrementAndGet();
            }
        } catch (Throwable th5) {
            th2 = th5;
            wqxVar = this;
            th2.getMessage();
            com.bytedance.sdk.component.jj.jpo.wqx.jd.jpo(com.bytedance.sdk.component.jj.jpo.jd.cm.f18630cm.tic(), 1);
            wqxVar.f66if.decrementAndGet();
        }
    }

    private void jpo(jd jdVar, List<com.bytedance.sdk.component.jj.jpo.cm.jpo> list) {
        if (jdVar == null || !jdVar.jpo) {
            return;
        }
        List<Object> listJpo = com.bytedance.sdk.component.jj.jpo.jd.jpo();
        if (list == null || listJpo == null || listJpo.size() == 0) {
            return;
        }
        for (com.bytedance.sdk.component.jj.jpo.cm.jpo jpoVar : list) {
            if (jpoVar.my() == 1) {
                com.bytedance.sdk.component.jj.jpo.wqx.jpo.jpo(jpoVar);
                com.bytedance.sdk.component.jj.jpo.wqx.jpo.my(jpoVar);
                Iterator<Object> it = listJpo.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(boolean z10, jd jdVar, List<com.bytedance.sdk.component.jj.jpo.cm.jpo> list, long j10) {
        if (z10 || jdVar == null) {
            return;
        }
        int i10 = jdVar.f18665jd;
        int i11 = -2;
        if (jdVar.my) {
            i10 = -1;
        } else if (i10 < 0) {
            i10 = -2;
        }
        if (i10 == 510 || i10 == 511) {
            i10 = -2;
        }
        if (jdVar.jpo || ((i10 < 500 || i10 >= 509) && i10 <= 513)) {
            i11 = i10;
        }
        if (list != null) {
            list.size();
            this.f66if.get();
        }
        jpo(i11, list, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006a A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:5:0x0005, B:8:0x000b, B:55:0x00e4, B:57:0x00e8, B:58:0x00ed, B:18:0x0030, B:20:0x003e, B:24:0x0043, B:26:0x0050, B:28:0x0052, B:30:0x0060, B:31:0x0065, B:32:0x006a, B:34:0x0070, B:36:0x0074, B:38:0x0080, B:39:0x0085, B:41:0x008d, B:42:0x0092, B:43:0x00af, B:45:0x00bd, B:47:0x00bf, B:49:0x00cc, B:51:0x00ce, B:53:0x00dc, B:54:0x00e1, B:61:0x00f4), top: B:65:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00af A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:5:0x0005, B:8:0x000b, B:55:0x00e4, B:57:0x00e8, B:58:0x00ed, B:18:0x0030, B:20:0x003e, B:24:0x0043, B:26:0x0050, B:28:0x0052, B:30:0x0060, B:31:0x0065, B:32:0x006a, B:34:0x0070, B:36:0x0074, B:38:0x0080, B:39:0x0085, B:41:0x008d, B:42:0x0092, B:43:0x00af, B:45:0x00bd, B:47:0x00bf, B:49:0x00cc, B:51:0x00ce, B:53:0x00dc, B:54:0x00e1, B:61:0x00f4), top: B:65:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void jpo(int r6, java.util.List<com.bytedance.sdk.component.jj.jpo.cm.jpo> r7, long r8) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.jj.jpo.jd.wqx.wqx.jpo(int, java.util.List, long):void");
    }

    public void jpo(int i10, long j10) {
        if (this.f18669au == null) {
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = i10;
        if (i10 == 2) {
            this.f18669au.sendMessageDelayed(messageObtain, (((this.prr.incrementAndGet() - 1) % 4) + 1) * j10);
        } else if (i10 == 3) {
            this.f18669au.sendMessageDelayed(messageObtain, (((this.hna.incrementAndGet() - 1) % 4) + 1) * j10);
        }
    }
}
