package af;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.offline.DownloadRequest;
import com.google.android.exoplayer2.scheduler.Requirements;
import com.google.android.exoplayer2.scheduler.RequirementsWatcher;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.n1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import rf.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h {

    /* renamed from: q, reason: collision with root package name */
    public static final Requirements f4329q = new Requirements(1);

    /* renamed from: a, reason: collision with root package name */
    public final Context f4330a;

    /* renamed from: b, reason: collision with root package name */
    public final v f4331b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f4332c;

    /* renamed from: d, reason: collision with root package name */
    public final b f4333d;

    /* renamed from: e, reason: collision with root package name */
    public final g f4334e;

    /* renamed from: f, reason: collision with root package name */
    public final CopyOnWriteArraySet f4335f;

    /* renamed from: g, reason: collision with root package name */
    public int f4336g;

    /* renamed from: h, reason: collision with root package name */
    public int f4337h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4338i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4339j;

    /* renamed from: k, reason: collision with root package name */
    public int f4340k;

    /* renamed from: l, reason: collision with root package name */
    public int f4341l;

    /* renamed from: m, reason: collision with root package name */
    public int f4342m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4343n;

    /* renamed from: o, reason: collision with root package name */
    public List f4344o;

    /* renamed from: p, reason: collision with root package name */
    public RequirementsWatcher f4345p;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final c f4346a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f4347b;

        /* renamed from: c, reason: collision with root package name */
        public final List f4348c;

        /* renamed from: d, reason: collision with root package name */
        public final Exception f4349d;

        public a(c cVar, boolean z10, List<c> list, Exception exc) {
            this.f4346a = cVar;
            this.f4347b = z10;
            this.f4348c = list;
            this.f4349d = exc;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends Handler {

        /* renamed from: n, reason: collision with root package name */
        public static final /* synthetic */ int f4350n = 0;

        /* renamed from: a, reason: collision with root package name */
        public boolean f4351a;

        /* renamed from: b, reason: collision with root package name */
        public final HandlerThread f4352b;

        /* renamed from: c, reason: collision with root package name */
        public final v f4353c;

        /* renamed from: d, reason: collision with root package name */
        public final r f4354d;

        /* renamed from: e, reason: collision with root package name */
        public final Handler f4355e;

        /* renamed from: f, reason: collision with root package name */
        public final ArrayList f4356f;

        /* renamed from: g, reason: collision with root package name */
        public final HashMap f4357g;

        /* renamed from: h, reason: collision with root package name */
        public int f4358h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f4359i;

        /* renamed from: j, reason: collision with root package name */
        public int f4360j;

        /* renamed from: k, reason: collision with root package name */
        public int f4361k;

        /* renamed from: l, reason: collision with root package name */
        public int f4362l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f4363m;

        public b(HandlerThread handlerThread, v vVar, r rVar, Handler handler, int i10, int i11, boolean z10) {
            super(handlerThread.getLooper());
            this.f4352b = handlerThread;
            this.f4353c = vVar;
            this.f4354d = rVar;
            this.f4355e = handler;
            this.f4360j = i10;
            this.f4361k = i11;
            this.f4359i = z10;
            this.f4356f = new ArrayList();
            this.f4357g = new HashMap();
        }

        public static c a(c cVar, int i10, int i11) {
            return new c(cVar.f4318a, i10, cVar.f4320c, System.currentTimeMillis(), cVar.f4321d, i11, 0, cVar.f4324g);
        }

        public final c b(String str, boolean z10) {
            int iC = c(str);
            if (iC != -1) {
                return (c) this.f4356f.get(iC);
            }
            if (!z10) {
                return null;
            }
            try {
                return this.f4353c.getDownload(str);
            } catch (IOException e10) {
                f0.e("DownloadManager", "Failed to load download: " + str, e10);
                return null;
            }
        }

        public final int c(String str) {
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f4356f;
                if (i10 >= arrayList.size()) {
                    return -1;
                }
                if (((c) arrayList.get(i10)).f4318a.f27873b.equals(str)) {
                    return i10;
                }
                i10++;
            }
        }

        public final void d(c cVar) {
            int i10 = cVar.f4319b;
            com.google.android.exoplayer2.util.a.checkState((i10 == 3 || i10 == 4) ? false : true);
            int iC = c(cVar.f4318a.f27873b);
            ArrayList arrayList = this.f4356f;
            if (iC == -1) {
                arrayList.add(cVar);
                Collections.sort(arrayList, new i(0));
            } else {
                boolean z10 = cVar.f4320c != ((c) arrayList.get(iC)).f4320c;
                arrayList.set(iC, cVar);
                if (z10) {
                    Collections.sort(arrayList, new i(0));
                }
            }
            try {
                this.f4353c.putDownload(cVar);
            } catch (IOException e10) {
                f0.e("DownloadManager", "Failed to update index.", e10);
            }
            this.f4355e.obtainMessage(2, new a(cVar, false, new ArrayList(arrayList), null)).sendToTarget();
        }

        public final c e(c cVar, int i10, int i11) {
            com.google.android.exoplayer2.util.a.checkState((i10 == 3 || i10 == 4) ? false : true);
            c cVarA = a(cVar, i10, i11);
            d(cVarA);
            return cVarA;
        }

        public final void f(c cVar, int i10) {
            if (i10 == 0) {
                if (cVar.f4319b == 1) {
                    e(cVar, 0, 0);
                }
            } else if (i10 != cVar.f4322e) {
                int i11 = cVar.f4319b;
                if (i11 == 0 || i11 == 2) {
                    i11 = 1;
                }
                d(new c(cVar.f4318a, i11, cVar.f4320c, System.currentTimeMillis(), cVar.f4321d, i10, 0, cVar.f4324g));
            }
        }

        public final void g() {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                ArrayList arrayList = this.f4356f;
                if (i10 >= arrayList.size()) {
                    return;
                }
                c cVar = (c) arrayList.get(i10);
                DownloadRequest downloadRequest = cVar.f4318a;
                String str = downloadRequest.f27873b;
                HashMap map = this.f4357g;
                k kVar = (k) map.get(str);
                int i12 = cVar.f4319b;
                r rVar = this.f4354d;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            com.google.android.exoplayer2.util.a.checkNotNull(kVar);
                            com.google.android.exoplayer2.util.a.checkState(!kVar.f4368f);
                            if (this.f4359i || this.f4358h != 0 || i11 >= this.f4360j) {
                                e(cVar, 0, 0);
                                kVar.cancel(false);
                            }
                        } else {
                            if (i12 != 5 && i12 != 7) {
                                throw new IllegalStateException();
                            }
                            if (kVar != null) {
                                if (!kVar.f4368f) {
                                    kVar.cancel(false);
                                }
                            } else if (!this.f4363m) {
                                k kVar2 = new k(cVar.f4318a, rVar.createDownloader(downloadRequest), cVar.f4324g, true, this.f4361k, this);
                                map.put(downloadRequest.f27873b, kVar2);
                                this.f4363m = true;
                                kVar2.start();
                            }
                        }
                    } else if (kVar != null) {
                        com.google.android.exoplayer2.util.a.checkState(!kVar.f4368f);
                        kVar.cancel(false);
                    }
                } else if (kVar != null) {
                    com.google.android.exoplayer2.util.a.checkState(!kVar.f4368f);
                    kVar.cancel(false);
                } else if (this.f4359i || this.f4358h != 0 || this.f4362l >= this.f4360j) {
                    kVar = null;
                } else {
                    c cVarE = e(cVar, 2, 0);
                    DownloadRequest downloadRequest2 = cVarE.f4318a;
                    k kVar3 = new k(cVarE.f4318a, rVar.createDownloader(downloadRequest2), cVarE.f4324g, false, this.f4361k, this);
                    map.put(downloadRequest2.f27873b, kVar3);
                    int i13 = this.f4362l;
                    this.f4362l = i13 + 1;
                    if (i13 == 0) {
                        sendEmptyMessageDelayed(11, 5000L);
                    }
                    kVar3.start();
                    kVar = kVar3;
                }
                if (kVar != null && !kVar.f4368f) {
                    i11++;
                }
                i10++;
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) throws IOException {
            int i10 = 7;
            i = 0;
            int i11 = 0;
            switch (message.what) {
                case 0:
                    int i12 = message.arg1;
                    ArrayList arrayList = this.f4356f;
                    v vVar = this.f4353c;
                    this.f4358h = i12;
                    try {
                        try {
                            vVar.setDownloadingStatesToQueued();
                            vVar.getDownloads(0, 1, 2, 5, 7);
                            throw null;
                        } catch (IOException e10) {
                            f0.e("DownloadManager", "Failed to load index.", e10);
                            arrayList.clear();
                            n1.closeQuietly(null);
                            this.f4355e.obtainMessage(0, new ArrayList(arrayList)).sendToTarget();
                            g();
                            break;
                        }
                    } catch (Throwable th2) {
                        n1.closeQuietly(null);
                        throw th2;
                    }
                case 1:
                    this.f4359i = message.arg1 != 0;
                    g();
                    i11 = 1;
                    this.f4355e.obtainMessage(1, i11, this.f4357g.size()).sendToTarget();
                    return;
                case 2:
                    this.f4358h = message.arg1;
                    g();
                    i11 = 1;
                    this.f4355e.obtainMessage(1, i11, this.f4357g.size()).sendToTarget();
                    return;
                case 3:
                    String str = (String) message.obj;
                    int i13 = message.arg1;
                    v vVar2 = this.f4353c;
                    ArrayList arrayList2 = this.f4356f;
                    if (str == null) {
                        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                            f((c) arrayList2.get(i14), i13);
                        }
                        try {
                            vVar2.setStopReason(i13);
                        } catch (IOException e11) {
                            f0.e("DownloadManager", "Failed to set manual stop reason", e11);
                        }
                    } else {
                        c cVarB = b(str, false);
                        if (cVarB != null) {
                            f(cVarB, i13);
                        } else {
                            try {
                                vVar2.setStopReason(str, i13);
                            } catch (IOException e12) {
                                f0.e("DownloadManager", "Failed to set manual stop reason: ".concat(str), e12);
                            }
                        }
                    }
                    g();
                    i11 = 1;
                    this.f4355e.obtainMessage(1, i11, this.f4357g.size()).sendToTarget();
                    return;
                case 4:
                    this.f4360j = message.arg1;
                    g();
                    i11 = 1;
                    this.f4355e.obtainMessage(1, i11, this.f4357g.size()).sendToTarget();
                    return;
                case 5:
                    this.f4361k = message.arg1;
                    i11 = 1;
                    this.f4355e.obtainMessage(1, i11, this.f4357g.size()).sendToTarget();
                    return;
                case 6:
                    DownloadRequest downloadRequest = (DownloadRequest) message.obj;
                    int i15 = message.arg1;
                    c cVarB2 = b(downloadRequest.f27873b, true);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (cVarB2 != null) {
                        Requirements requirements = h.f4329q;
                        int i16 = cVarB2.f4319b;
                        long j10 = (i16 == 5 || cVarB2.isTerminalState()) ? jCurrentTimeMillis : cVarB2.f4320c;
                        if (i16 != 5 && i16 != 7) {
                            i10 = i15 != 0 ? 1 : 0;
                        }
                        d(new c(cVarB2.f4318a.copyWithMergedRequest(downloadRequest), i10, j10, jCurrentTimeMillis, -1L, i15, 0));
                    } else {
                        d(new c(downloadRequest, i15 != 0 ? 1 : 0, jCurrentTimeMillis, jCurrentTimeMillis, -1L, i15, 0));
                    }
                    g();
                    i11 = 1;
                    this.f4355e.obtainMessage(1, i11, this.f4357g.size()).sendToTarget();
                    return;
                case 7:
                    String str2 = (String) message.obj;
                    c cVarB3 = b(str2, true);
                    if (cVarB3 == null) {
                        f0.e("DownloadManager", "Failed to remove nonexistent download: " + str2);
                    } else {
                        e(cVarB3, 5, 0);
                        g();
                    }
                    i11 = 1;
                    this.f4355e.obtainMessage(1, i11, this.f4357g.size()).sendToTarget();
                    return;
                case 8:
                    v vVar3 = this.f4353c;
                    ArrayList arrayList3 = this.f4356f;
                    ArrayList arrayList4 = new ArrayList();
                    try {
                        vVar3.getDownloads(3, 4);
                        throw null;
                    } catch (IOException unused) {
                        f0.e("DownloadManager", "Failed to load downloads.");
                        for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                            arrayList3.set(i17, a((c) arrayList3.get(i17), 5, 0));
                        }
                        for (int i18 = 0; i18 < arrayList4.size(); i18++) {
                            arrayList3.add(a((c) arrayList4.get(i18), 5, 0));
                        }
                        Collections.sort(arrayList3, new i(0));
                        try {
                            vVar3.setStatesToRemoving();
                        } catch (IOException e13) {
                            f0.e("DownloadManager", "Failed to update index.", e13);
                        }
                        ArrayList arrayList5 = new ArrayList(arrayList3);
                        for (int i19 = 0; i19 < arrayList3.size(); i19++) {
                            this.f4355e.obtainMessage(2, new a((c) arrayList3.get(i19), false, arrayList5, null)).sendToTarget();
                        }
                        g();
                        break;
                    }
                case 9:
                    k kVar = (k) message.obj;
                    String str3 = kVar.f4365b.f27873b;
                    this.f4357g.remove(str3);
                    boolean z10 = kVar.f4368f;
                    if (z10) {
                        this.f4363m = false;
                    } else {
                        int i20 = this.f4362l - 1;
                        this.f4362l = i20;
                        if (i20 == 0) {
                            removeMessages(11);
                        }
                    }
                    if (kVar.f4371i) {
                        g();
                    } else {
                        Exception exc = kVar.f4372j;
                        if (exc != null) {
                            f0.e("DownloadManager", "Task failed: " + kVar.f4365b + ", " + z10, exc);
                        }
                        c cVar = (c) com.google.android.exoplayer2.util.a.checkNotNull(b(str3, false));
                        int i21 = cVar.f4319b;
                        if (i21 == 2) {
                            com.google.android.exoplayer2.util.a.checkState(!z10);
                            ArrayList arrayList6 = this.f4356f;
                            c cVar2 = new c(cVar.f4318a, exc == null ? 3 : 4, cVar.f4320c, System.currentTimeMillis(), cVar.f4321d, cVar.f4322e, exc == null ? 0 : 1, cVar.f4324g);
                            arrayList6.remove(c(cVar2.f4318a.f27873b));
                            try {
                                this.f4353c.putDownload(cVar2);
                            } catch (IOException e14) {
                                f0.e("DownloadManager", "Failed to update index.", e14);
                            }
                            this.f4355e.obtainMessage(2, new a(cVar2, false, new ArrayList(arrayList6), exc)).sendToTarget();
                        } else {
                            if (i21 != 5 && i21 != 7) {
                                throw new IllegalStateException();
                            }
                            com.google.android.exoplayer2.util.a.checkState(z10);
                            ArrayList arrayList7 = this.f4356f;
                            int i22 = cVar.f4319b;
                            DownloadRequest downloadRequest2 = cVar.f4318a;
                            if (i22 == 7) {
                                int i23 = cVar.f4322e;
                                e(cVar, i23 == 0 ? 0 : 1, i23);
                                g();
                            } else {
                                arrayList7.remove(c(downloadRequest2.f27873b));
                                try {
                                    this.f4353c.removeDownload(downloadRequest2.f27873b);
                                } catch (IOException unused2) {
                                    f0.e("DownloadManager", "Failed to remove from database");
                                }
                                this.f4355e.obtainMessage(2, new a(cVar, true, new ArrayList(arrayList7), null)).sendToTarget();
                            }
                        }
                        g();
                    }
                    this.f4355e.obtainMessage(1, i11, this.f4357g.size()).sendToTarget();
                    return;
                case 10:
                    k kVar2 = (k) message.obj;
                    long j11 = n1.toLong(message.arg1, message.arg2);
                    c cVar3 = (c) com.google.android.exoplayer2.util.a.checkNotNull(b(kVar2.f4365b.f27873b, false));
                    if (j11 == cVar3.f4321d || j11 == -1) {
                        return;
                    }
                    d(new c(cVar3.f4318a, cVar3.f4319b, cVar3.f4320c, System.currentTimeMillis(), j11, cVar3.f4322e, cVar3.f4323f, cVar3.f4324g));
                    return;
                case 11:
                    ArrayList arrayList8 = this.f4356f;
                    for (int i24 = 0; i24 < arrayList8.size(); i24++) {
                        c cVar4 = (c) arrayList8.get(i24);
                        if (cVar4.f4319b == 2) {
                            try {
                                this.f4353c.putDownload(cVar4);
                            } catch (IOException e15) {
                                f0.e("DownloadManager", "Failed to update index.", e15);
                            }
                        }
                    }
                    sendEmptyMessageDelayed(11, 5000L);
                    return;
                case 12:
                    Iterator it = this.f4357g.values().iterator();
                    while (it.hasNext()) {
                        ((k) it.next()).cancel(true);
                    }
                    try {
                        this.f4353c.setDownloadingStatesToQueued();
                    } catch (IOException e16) {
                        f0.e("DownloadManager", "Failed to update index.", e16);
                    }
                    this.f4356f.clear();
                    this.f4352b.quit();
                    synchronized (this) {
                        this.f4351a = true;
                        notifyAll();
                    }
                    return;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    public h(Context context, be.b bVar, rf.b bVar2, qf.o oVar, Executor executor) {
        this(context, new af.a(bVar), new af.b(new e.a().setCache(bVar2).setUpstreamDataSourceFactory(oVar), executor));
    }

    public final void a() {
        Iterator it = this.f4335f.iterator();
        while (it.hasNext()) {
            ((o) ((j) it.next())).onWaitingForRequirementsChanged(this, this.f4343n);
        }
    }

    public void addDownload(DownloadRequest downloadRequest) {
        addDownload(downloadRequest, 0);
    }

    public void addListener(j jVar) {
        com.google.android.exoplayer2.util.a.checkNotNull(jVar);
        this.f4335f.add(jVar);
    }

    public final void b(RequirementsWatcher requirementsWatcher, int i10) {
        Requirements requirements = requirementsWatcher.getRequirements();
        if (this.f4342m != i10) {
            this.f4342m = i10;
            this.f4336g++;
            this.f4333d.obtainMessage(2, i10, 0).sendToTarget();
        }
        boolean zD = d();
        Iterator it = this.f4335f.iterator();
        while (it.hasNext()) {
            ((o) ((j) it.next())).onRequirementsStateChanged(this, requirements, i10);
        }
        if (zD) {
            a();
        }
    }

    public final void c(boolean z10) {
        if (this.f4339j == z10) {
            return;
        }
        this.f4339j = z10;
        this.f4336g++;
        this.f4333d.obtainMessage(1, z10 ? 1 : 0, 0).sendToTarget();
        boolean zD = d();
        Iterator it = this.f4335f.iterator();
        while (it.hasNext()) {
            ((o) ((j) it.next())).onDownloadsPausedChanged(this, z10);
        }
        if (zD) {
            a();
        }
    }

    public final boolean d() {
        boolean z10;
        if (this.f4339j || this.f4342m == 0) {
            z10 = false;
        } else {
            for (int i10 = 0; i10 < this.f4344o.size(); i10++) {
                if (((c) this.f4344o.get(i10)).f4319b == 0) {
                    z10 = true;
                    break;
                }
            }
            z10 = false;
        }
        boolean z11 = this.f4343n != z10;
        this.f4343n = z10;
        return z11;
    }

    public Looper getApplicationLooper() {
        return this.f4332c.getLooper();
    }

    public List<c> getCurrentDownloads() {
        return this.f4344o;
    }

    public e getDownloadIndex() {
        return this.f4331b;
    }

    public boolean getDownloadsPaused() {
        return this.f4339j;
    }

    public int getMaxParallelDownloads() {
        return this.f4340k;
    }

    public int getMinRetryCount() {
        return this.f4341l;
    }

    public int getNotMetRequirements() {
        return this.f4342m;
    }

    public Requirements getRequirements() {
        return this.f4345p.getRequirements();
    }

    public boolean isIdle() {
        return this.f4337h == 0 && this.f4336g == 0;
    }

    public boolean isInitialized() {
        return this.f4338i;
    }

    public boolean isWaitingForRequirements() {
        return this.f4343n;
    }

    public void pauseDownloads() {
        c(true);
    }

    public void release() {
        synchronized (this.f4333d) {
            try {
                b bVar = this.f4333d;
                if (bVar.f4351a) {
                    return;
                }
                bVar.sendEmptyMessage(12);
                boolean z10 = false;
                while (true) {
                    b bVar2 = this.f4333d;
                    if (bVar2.f4351a) {
                        break;
                    }
                    try {
                        bVar2.wait();
                    } catch (InterruptedException unused) {
                        z10 = true;
                    }
                }
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                this.f4332c.removeCallbacksAndMessages(null);
                this.f4345p.stop();
                this.f4344o = Collections.EMPTY_LIST;
                this.f4336g = 0;
                this.f4337h = 0;
                this.f4338i = false;
                this.f4342m = 0;
                this.f4343n = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void removeAllDownloads() {
        this.f4336g++;
        this.f4333d.obtainMessage(8).sendToTarget();
    }

    public void removeDownload(String str) {
        this.f4336g++;
        this.f4333d.obtainMessage(7, str).sendToTarget();
    }

    public void removeListener(j jVar) {
        this.f4335f.remove(jVar);
    }

    public void resumeDownloads() {
        c(false);
    }

    public void setMaxParallelDownloads(int i10) {
        com.google.android.exoplayer2.util.a.checkArgument(i10 > 0);
        if (this.f4340k == i10) {
            return;
        }
        this.f4340k = i10;
        this.f4336g++;
        this.f4333d.obtainMessage(4, i10, 0).sendToTarget();
    }

    public void setMinRetryCount(int i10) {
        com.google.android.exoplayer2.util.a.checkArgument(i10 >= 0);
        if (this.f4341l == i10) {
            return;
        }
        this.f4341l = i10;
        this.f4336g++;
        this.f4333d.obtainMessage(5, i10, 0).sendToTarget();
    }

    public void setRequirements(Requirements requirements) {
        if (requirements.equals(this.f4345p.getRequirements())) {
            return;
        }
        this.f4345p.stop();
        RequirementsWatcher requirementsWatcher = new RequirementsWatcher(this.f4330a, this.f4334e, requirements);
        this.f4345p = requirementsWatcher;
        b(this.f4345p, requirementsWatcher.start());
    }

    public void setStopReason(String str, int i10) {
        this.f4336g++;
        this.f4333d.obtainMessage(3, i10, 0, str).sendToTarget();
    }

    public void addDownload(DownloadRequest downloadRequest, int i10) {
        this.f4336g++;
        this.f4333d.obtainMessage(6, i10, 0, downloadRequest).sendToTarget();
    }

    public h(Context context, v vVar, r rVar) {
        this.f4330a = context.getApplicationContext();
        this.f4331b = vVar;
        this.f4340k = 3;
        this.f4341l = 5;
        this.f4339j = true;
        this.f4344o = Collections.EMPTY_LIST;
        this.f4335f = new CopyOnWriteArraySet();
        Handler handlerCreateHandlerForCurrentOrMainLooper = n1.createHandlerForCurrentOrMainLooper(new f(this, 0));
        this.f4332c = handlerCreateHandlerForCurrentOrMainLooper;
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadManager");
        handlerThread.start();
        b bVar = new b(handlerThread, vVar, rVar, handlerCreateHandlerForCurrentOrMainLooper, this.f4340k, this.f4341l, this.f4339j);
        this.f4333d = bVar;
        g gVar = new g(this, 0);
        this.f4334e = gVar;
        RequirementsWatcher requirementsWatcher = new RequirementsWatcher(context, gVar, f4329q);
        this.f4345p = requirementsWatcher;
        int iStart = requirementsWatcher.start();
        this.f4342m = iStart;
        this.f4336g = 1;
        bVar.obtainMessage(0, iStart, 0).sendToTarget();
    }
}
