package zn;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import ao.kwoC.zAQQWzBxnS;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.common.util.b0;
import io.bidmachine.media3.exoplayer.offline.DownloadRequest;
import io.bidmachine.media3.exoplayer.scheduler.Requirements;
import io.bidmachine.media3.exoplayer.scheduler.RequirementsWatcher;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import mn.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class g {

    /* renamed from: q, reason: collision with root package name */
    public static final Requirements f98326q = new Requirements(1);

    /* renamed from: a, reason: collision with root package name */
    public final Context f98327a;

    /* renamed from: b, reason: collision with root package name */
    public final v f98328b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f98329c;

    /* renamed from: d, reason: collision with root package name */
    public final b f98330d;

    /* renamed from: e, reason: collision with root package name */
    public final z9.h f98331e;

    /* renamed from: f, reason: collision with root package name */
    public final CopyOnWriteArraySet f98332f;

    /* renamed from: g, reason: collision with root package name */
    public int f98333g;

    /* renamed from: h, reason: collision with root package name */
    public int f98334h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f98335i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f98336j;

    /* renamed from: k, reason: collision with root package name */
    public int f98337k;

    /* renamed from: l, reason: collision with root package name */
    public int f98338l;

    /* renamed from: m, reason: collision with root package name */
    public int f98339m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f98340n;

    /* renamed from: o, reason: collision with root package name */
    public List f98341o;

    /* renamed from: p, reason: collision with root package name */
    public RequirementsWatcher f98342p;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final c f98343a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f98344b;

        /* renamed from: c, reason: collision with root package name */
        public final List f98345c;

        /* renamed from: d, reason: collision with root package name */
        public final Exception f98346d;

        public a(c cVar, boolean z10, List<c> list, Exception exc) {
            this.f98343a = cVar;
            this.f98344b = z10;
            this.f98345c = list;
            this.f98346d = exc;
        }
    }

    public g(Context context, kn.b bVar, mn.b bVar2, ln.h hVar, Executor executor) {
        this(context, new zn.a(bVar), new zn.b(new e.a().setCache(bVar2).setUpstreamDataSourceFactory(hVar), executor));
    }

    public final void a() {
        Iterator it = this.f98332f.iterator();
        while (it.hasNext()) {
            ((l) ((h) it.next())).onWaitingForRequirementsChanged(this, this.f98340n);
        }
    }

    public void addDownload(DownloadRequest downloadRequest) {
        addDownload(downloadRequest, 0);
    }

    public void addListener(h hVar) {
        io.bidmachine.media3.common.util.a.checkNotNull(hVar);
        this.f98332f.add(hVar);
    }

    public final void b(RequirementsWatcher requirementsWatcher, int i10) {
        Requirements requirements = requirementsWatcher.getRequirements();
        if (this.f98339m != i10) {
            this.f98339m = i10;
            this.f98333g++;
            this.f98330d.obtainMessage(3, i10, 0).sendToTarget();
        }
        boolean zD = d();
        Iterator it = this.f98332f.iterator();
        while (it.hasNext()) {
            ((l) ((h) it.next())).onRequirementsStateChanged(this, requirements, i10);
        }
        if (zD) {
            a();
        }
    }

    public final void c(boolean z10) {
        if (this.f98336j == z10) {
            return;
        }
        this.f98336j = z10;
        this.f98333g++;
        this.f98330d.obtainMessage(2, z10 ? 1 : 0, 0).sendToTarget();
        boolean zD = d();
        Iterator it = this.f98332f.iterator();
        while (it.hasNext()) {
            ((l) ((h) it.next())).onDownloadsPausedChanged(this, z10);
        }
        if (zD) {
            a();
        }
    }

    public final boolean d() {
        boolean z10;
        if (this.f98336j || this.f98339m == 0) {
            z10 = false;
        } else {
            for (int i10 = 0; i10 < this.f98341o.size(); i10++) {
                if (((c) this.f98341o.get(i10)).f98320b == 0) {
                    z10 = true;
                    break;
                }
            }
            z10 = false;
        }
        boolean z11 = this.f98340n != z10;
        this.f98340n = z10;
        return z11;
    }

    public Looper getApplicationLooper() {
        return this.f98329c.getLooper();
    }

    public List<c> getCurrentDownloads() {
        return this.f98341o;
    }

    public f getDownloadIndex() {
        return this.f98328b;
    }

    public boolean getDownloadsPaused() {
        return this.f98336j;
    }

    public int getMaxParallelDownloads() {
        return this.f98337k;
    }

    public int getMinRetryCount() {
        return this.f98338l;
    }

    public int getNotMetRequirements() {
        return this.f98339m;
    }

    public Requirements getRequirements() {
        return this.f98342p.getRequirements();
    }

    public boolean isIdle() {
        return this.f98334h == 0 && this.f98333g == 0;
    }

    public boolean isInitialized() {
        return this.f98335i;
    }

    public boolean isWaitingForRequirements() {
        return this.f98340n;
    }

    public void pauseDownloads() {
        c(true);
    }

    public void release() {
        synchronized (this.f98330d) {
            try {
                b bVar = this.f98330d;
                if (bVar.f98348a) {
                    return;
                }
                bVar.sendEmptyMessage(13);
                boolean z10 = false;
                while (true) {
                    b bVar2 = this.f98330d;
                    if (bVar2.f98348a) {
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
                this.f98329c.removeCallbacksAndMessages(null);
                this.f98342p.stop();
                this.f98341o = Collections.EMPTY_LIST;
                this.f98333g = 0;
                this.f98334h = 0;
                this.f98335i = false;
                this.f98339m = 0;
                this.f98340n = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void removeAllDownloads() {
        this.f98333g++;
        this.f98330d.obtainMessage(9).sendToTarget();
    }

    public void removeDownload(String str) {
        this.f98333g++;
        this.f98330d.obtainMessage(8, str).sendToTarget();
    }

    public void removeListener(h hVar) {
        this.f98332f.remove(hVar);
    }

    public void resumeDownloads() {
        c(false);
    }

    public void setMaxParallelDownloads(int i10) {
        io.bidmachine.media3.common.util.a.checkArgument(i10 > 0);
        if (this.f98337k == i10) {
            return;
        }
        this.f98337k = i10;
        this.f98333g++;
        this.f98330d.obtainMessage(5, i10, 0).sendToTarget();
    }

    public void setMinRetryCount(int i10) {
        io.bidmachine.media3.common.util.a.checkArgument(i10 >= 0);
        if (this.f98338l == i10) {
            return;
        }
        this.f98338l = i10;
        this.f98333g++;
        this.f98330d.obtainMessage(6, i10, 0).sendToTarget();
    }

    public void setRequirements(Requirements requirements) {
        if (requirements.equals(this.f98342p.getRequirements())) {
            return;
        }
        this.f98342p.stop();
        RequirementsWatcher requirementsWatcher = new RequirementsWatcher(this.f98327a, this.f98331e, requirements);
        this.f98342p = requirementsWatcher;
        b(this.f98342p, requirementsWatcher.start());
    }

    public void setStopReason(String str, int i10) {
        this.f98333g++;
        this.f98330d.obtainMessage(4, i10, 0, str).sendToTarget();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends Handler {

        /* renamed from: n, reason: collision with root package name */
        public static final /* synthetic */ int f98347n = 0;

        /* renamed from: a, reason: collision with root package name */
        public boolean f98348a;

        /* renamed from: b, reason: collision with root package name */
        public final HandlerThread f98349b;

        /* renamed from: c, reason: collision with root package name */
        public final v f98350c;

        /* renamed from: d, reason: collision with root package name */
        public final o f98351d;

        /* renamed from: e, reason: collision with root package name */
        public final Handler f98352e;

        /* renamed from: f, reason: collision with root package name */
        public final ArrayList f98353f;

        /* renamed from: g, reason: collision with root package name */
        public final HashMap f98354g;

        /* renamed from: h, reason: collision with root package name */
        public int f98355h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f98356i;

        /* renamed from: j, reason: collision with root package name */
        public int f98357j;

        /* renamed from: k, reason: collision with root package name */
        public int f98358k;

        /* renamed from: l, reason: collision with root package name */
        public int f98359l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f98360m;

        public b(HandlerThread handlerThread, v vVar, o oVar, Handler handler, int i10, int i11, boolean z10) {
            super(handlerThread.getLooper());
            this.f98349b = handlerThread;
            this.f98350c = vVar;
            this.f98351d = oVar;
            this.f98352e = handler;
            this.f98357j = i10;
            this.f98358k = i11;
            this.f98356i = z10;
            this.f98353f = new ArrayList();
            this.f98354g = new HashMap();
        }

        public static c a(c cVar, int i10, int i11) {
            return new c(cVar.f98319a, i10, cVar.f98321c, System.currentTimeMillis(), cVar.f98322d, i11, 0, cVar.f98325g);
        }

        public final int c(String str) {
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f98353f;
                if (i10 >= arrayList.size()) {
                    return -1;
                }
                if (((c) arrayList.get(i10)).f98319a.f61502b.equals(str)) {
                    return i10;
                }
                i10++;
            }
        }

        public final void d(c cVar) {
            int i10 = cVar.f98320b;
            io.bidmachine.media3.common.util.a.checkState((i10 == 3 || i10 == 4) ? false : true);
            int iC = c(cVar.f98319a.f61502b);
            ArrayList arrayList = this.f98353f;
            if (iC == -1) {
                arrayList.add(cVar);
                Collections.sort(arrayList, new ni.a(29));
            } else {
                boolean z10 = cVar.f98321c != ((c) arrayList.get(iC)).f98321c;
                arrayList.set(iC, cVar);
                if (z10) {
                    Collections.sort(arrayList, new ni.a(29));
                }
            }
            try {
                this.f98350c.putDownload(cVar);
            } catch (IOException e10) {
                b0.e("DownloadManager", "Failed to update index.", e10);
            }
            this.f98352e.obtainMessage(3, new a(cVar, false, new ArrayList(arrayList), null)).sendToTarget();
        }

        public final c e(c cVar, int i10, int i11) {
            io.bidmachine.media3.common.util.a.checkState((i10 == 3 || i10 == 4) ? false : true);
            c cVarA = a(cVar, i10, i11);
            d(cVarA);
            return cVarA;
        }

        public final void f(c cVar, int i10) {
            if (i10 == 0) {
                if (cVar.f98320b == 1) {
                    e(cVar, 0, 0);
                }
            } else if (i10 != cVar.f98323e) {
                int i11 = cVar.f98320b;
                if (i11 == 0 || i11 == 2) {
                    i11 = 1;
                }
                d(new c(cVar.f98319a, i11, cVar.f98321c, System.currentTimeMillis(), cVar.f98322d, i10, 0, cVar.f98325g));
            }
        }

        public final void g() {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                ArrayList arrayList = this.f98353f;
                if (i10 >= arrayList.size()) {
                    return;
                }
                c cVar = (c) arrayList.get(i10);
                DownloadRequest downloadRequest = cVar.f98319a;
                String str = downloadRequest.f61502b;
                HashMap map = this.f98354g;
                i iVar = (i) map.get(str);
                int i12 = cVar.f98320b;
                o oVar = this.f98351d;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            io.bidmachine.media3.common.util.a.checkNotNull(iVar);
                            io.bidmachine.media3.common.util.a.checkState(!iVar.f98364f);
                            if (this.f98356i || this.f98355h != 0 || i11 >= this.f98357j) {
                                e(cVar, 0, 0);
                                iVar.cancel(false);
                            }
                        } else {
                            if (i12 != 5 && i12 != 7) {
                                throw new IllegalStateException();
                            }
                            if (iVar != null) {
                                if (!iVar.f98364f) {
                                    iVar.cancel(false);
                                }
                            } else if (!this.f98360m) {
                                i iVar2 = new i(cVar.f98319a, oVar.createDownloader(downloadRequest), cVar.f98325g, true, this.f98358k, this);
                                map.put(downloadRequest.f61502b, iVar2);
                                this.f98360m = true;
                                iVar2.start();
                            }
                        }
                    } else if (iVar != null) {
                        io.bidmachine.media3.common.util.a.checkState(!iVar.f98364f);
                        iVar.cancel(false);
                    }
                } else if (iVar != null) {
                    io.bidmachine.media3.common.util.a.checkState(!iVar.f98364f);
                    iVar.cancel(false);
                } else if (this.f98356i || this.f98355h != 0 || this.f98359l >= this.f98357j) {
                    iVar = null;
                } else {
                    c cVarE = e(cVar, 2, 0);
                    DownloadRequest downloadRequest2 = cVarE.f98319a;
                    i iVar3 = new i(cVarE.f98319a, oVar.createDownloader(downloadRequest2), cVarE.f98325g, false, this.f98358k, this);
                    map.put(downloadRequest2.f61502b, iVar3);
                    int i13 = this.f98359l;
                    this.f98359l = i13 + 1;
                    if (i13 == 0) {
                        sendEmptyMessageDelayed(12, 5000L);
                    }
                    iVar3.start();
                    iVar = iVar3;
                }
                if (iVar != null && !iVar.f98364f) {
                    i11++;
                }
                i10++;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v32, types: [android.os.Handler] */
        /* JADX WARN: Type inference failed for: r10v10 */
        /* JADX WARN: Type inference failed for: r10v11 */
        /* JADX WARN: Type inference failed for: r10v5 */
        /* JADX WARN: Type inference failed for: r10v6, types: [int] */
        @Override // android.os.Handler
        public void handleMessage(Message message) throws IOException {
            boolean z10;
             = 0;
            ?? r10 = 0;
            switch (message.what) {
                case 1:
                    int i10 = message.arg1;
                    ArrayList arrayList = this.f98353f;
                    v vVar = this.f98350c;
                    this.f98355h = i10;
                    try {
                        try {
                            vVar.setDownloadingStatesToQueued();
                            vVar.getDownloads(0, 1, 2, 5, 7);
                            throw null;
                        } catch (IOException e10) {
                            b0.e("DownloadManager", "Failed to load index.", e10);
                            arrayList.clear();
                            a1.closeQuietly(null);
                            z10 = true;
                            this.f98352e.obtainMessage(1, new ArrayList(arrayList)).sendToTarget();
                            g();
                            break;
                        }
                    } catch (Throwable th2) {
                        a1.closeQuietly(null);
                        throw th2;
                    }
                case 2:
                    this.f98356i = message.arg1 != 0;
                    g();
                    z10 = true;
                    r10 = z10;
                    this.f98352e.obtainMessage(2, r10, this.f98354g.size()).sendToTarget();
                    return;
                case 3:
                    this.f98355h = message.arg1;
                    g();
                    z10 = true;
                    r10 = z10;
                    this.f98352e.obtainMessage(2, r10, this.f98354g.size()).sendToTarget();
                    return;
                case 4:
                    String str = (String) message.obj;
                    int i11 = message.arg1;
                    v vVar2 = this.f98350c;
                    ArrayList arrayList2 = this.f98353f;
                    if (str == null) {
                        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                            f((c) arrayList2.get(i12), i11);
                        }
                        try {
                            vVar2.setStopReason(i11);
                        } catch (IOException e11) {
                            b0.e("DownloadManager", "Failed to set manual stop reason", e11);
                        }
                    } else {
                        c cVarB = b(str, false);
                        if (cVarB != null) {
                            f(cVarB, i11);
                        } else {
                            try {
                                vVar2.setStopReason(str, i11);
                            } catch (IOException e12) {
                                b0.e("DownloadManager", "Failed to set manual stop reason: ".concat(str), e12);
                            }
                        }
                    }
                    g();
                    z10 = true;
                    r10 = z10;
                    this.f98352e.obtainMessage(2, r10, this.f98354g.size()).sendToTarget();
                    return;
                case 5:
                    this.f98357j = message.arg1;
                    g();
                    z10 = true;
                    r10 = z10;
                    this.f98352e.obtainMessage(2, r10, this.f98354g.size()).sendToTarget();
                    return;
                case 6:
                    this.f98358k = message.arg1;
                    z10 = true;
                    r10 = z10;
                    this.f98352e.obtainMessage(2, r10, this.f98354g.size()).sendToTarget();
                    return;
                case 7:
                    DownloadRequest downloadRequest = (DownloadRequest) message.obj;
                    int i13 = message.arg1;
                    c cVarB2 = b(downloadRequest.f61502b, true);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (cVarB2 != null) {
                        Requirements requirements = g.f98326q;
                        int i14 = cVarB2.f98320b;
                        d(new c(cVarB2.f98319a.copyWithMergedRequest(downloadRequest), (i14 == 5 || i14 == 7) ? 7 : i13 != 0 ? 1 : 0, (i14 == 5 || cVarB2.isTerminalState()) ? jCurrentTimeMillis : cVarB2.f98321c, jCurrentTimeMillis, -1L, i13, 0));
                    } else {
                        d(new c(downloadRequest, i13 != 0 ? 1 : 0, jCurrentTimeMillis, jCurrentTimeMillis, -1L, i13, 0));
                    }
                    g();
                    z10 = true;
                    r10 = z10;
                    this.f98352e.obtainMessage(2, r10, this.f98354g.size()).sendToTarget();
                    return;
                case 8:
                    String str2 = (String) message.obj;
                    c cVarB3 = b(str2, true);
                    if (cVarB3 == null) {
                        b0.e("DownloadManager", "Failed to remove nonexistent download: " + str2);
                    } else {
                        e(cVarB3, 5, 0);
                        g();
                    }
                    z10 = true;
                    r10 = z10;
                    this.f98352e.obtainMessage(2, r10, this.f98354g.size()).sendToTarget();
                    return;
                case 9:
                    v vVar3 = this.f98350c;
                    ArrayList arrayList3 = this.f98353f;
                    ArrayList arrayList4 = new ArrayList();
                    try {
                        vVar3.getDownloads(3, 4);
                        throw null;
                    } catch (IOException unused) {
                        b0.e("DownloadManager", "Failed to load downloads.");
                        for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                            arrayList3.set(i15, a((c) arrayList3.get(i15), 5, 0));
                        }
                        for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                            arrayList3.add(a((c) arrayList4.get(i16), 5, 0));
                        }
                        Collections.sort(arrayList3, new ni.a(29));
                        try {
                            vVar3.setStatesToRemoving();
                        } catch (IOException e13) {
                            b0.e("DownloadManager", "Failed to update index.", e13);
                        }
                        ArrayList arrayList5 = new ArrayList(arrayList3);
                        for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                            this.f98352e.obtainMessage(3, new a((c) arrayList3.get(i17), false, arrayList5, null)).sendToTarget();
                        }
                        g();
                        break;
                    }
                case 10:
                    i iVar = (i) message.obj;
                    String str3 = iVar.f98361b.f61502b;
                    this.f98354g.remove(str3);
                    boolean z11 = iVar.f98364f;
                    if (z11) {
                        this.f98360m = false;
                    } else {
                        int i18 = this.f98359l - 1;
                        this.f98359l = i18;
                        if (i18 == 0) {
                            removeMessages(12);
                        }
                    }
                    if (iVar.f98367i) {
                        g();
                    } else {
                        Exception exc = iVar.f98368j;
                        if (exc != null) {
                            b0.e("DownloadManager", "Task failed: " + iVar.f98361b + ", " + z11, exc);
                        }
                        c cVar = (c) io.bidmachine.media3.common.util.a.checkNotNull(b(str3, false));
                        int i19 = cVar.f98320b;
                        if (i19 == 2) {
                            io.bidmachine.media3.common.util.a.checkState(!z11);
                            ArrayList arrayList6 = this.f98353f;
                            c cVar2 = new c(cVar.f98319a, exc == null ? 3 : 4, cVar.f98321c, System.currentTimeMillis(), cVar.f98322d, cVar.f98323e, exc == null ? 0 : 1, cVar.f98325g);
                            arrayList6.remove(c(cVar2.f98319a.f61502b));
                            try {
                                this.f98350c.putDownload(cVar2);
                            } catch (IOException e14) {
                                b0.e("DownloadManager", "Failed to update index.", e14);
                            }
                            this.f98352e.obtainMessage(3, new a(cVar2, false, new ArrayList(arrayList6), exc)).sendToTarget();
                        } else {
                            if (i19 != 5 && i19 != 7) {
                                throw new IllegalStateException();
                            }
                            io.bidmachine.media3.common.util.a.checkState(z11);
                            ArrayList arrayList7 = this.f98353f;
                            int i20 = cVar.f98320b;
                            DownloadRequest downloadRequest2 = cVar.f98319a;
                            if (i20 == 7) {
                                int i21 = cVar.f98323e;
                                e(cVar, i21 == 0 ? 0 : 1, i21);
                                g();
                            } else {
                                arrayList7.remove(c(downloadRequest2.f61502b));
                                try {
                                    this.f98350c.removeDownload(downloadRequest2.f61502b);
                                } catch (IOException unused2) {
                                    b0.e("DownloadManager", "Failed to remove from database");
                                }
                                this.f98352e.obtainMessage(3, new a(cVar, true, new ArrayList(arrayList7), null)).sendToTarget();
                            }
                        }
                        g();
                    }
                    this.f98352e.obtainMessage(2, r10, this.f98354g.size()).sendToTarget();
                    return;
                case 11:
                    i iVar2 = (i) message.obj;
                    long j10 = a1.toLong(message.arg1, message.arg2);
                    c cVar3 = (c) io.bidmachine.media3.common.util.a.checkNotNull(b(iVar2.f98361b.f61502b, false));
                    if (j10 == cVar3.f98322d || j10 == -1) {
                        return;
                    }
                    d(new c(cVar3.f98319a, cVar3.f98320b, cVar3.f98321c, System.currentTimeMillis(), j10, cVar3.f98323e, cVar3.f98324f, cVar3.f98325g));
                    return;
                case 12:
                    ArrayList arrayList8 = this.f98353f;
                    for (int i22 = 0; i22 < arrayList8.size(); i22++) {
                        c cVar4 = (c) arrayList8.get(i22);
                        if (cVar4.f98320b == 2) {
                            try {
                                this.f98350c.putDownload(cVar4);
                            } catch (IOException e15) {
                                b0.e("DownloadManager", "Failed to update index.", e15);
                            }
                        }
                    }
                    sendEmptyMessageDelayed(12, 5000L);
                    return;
                case 13:
                    Iterator it = this.f98354g.values().iterator();
                    while (it.hasNext()) {
                        ((i) it.next()).cancel(true);
                    }
                    try {
                        this.f98350c.setDownloadingStatesToQueued();
                    } catch (IOException e16) {
                        b0.e("DownloadManager", "Failed to update index.", e16);
                    }
                    this.f98353f.clear();
                    this.f98349b.quit();
                    synchronized (this) {
                        this.f98348a = true;
                        notifyAll();
                    }
                    return;
                default:
                    throw new IllegalStateException();
            }
        }

        public final c b(String str, boolean z10) {
            int iC = c(str);
            if (iC != -1) {
                return (c) this.f98353f.get(iC);
            }
            if (z10) {
                try {
                    return this.f98350c.getDownload(str);
                } catch (IOException e10) {
                    b0.e(zAQQWzBxnS.RnVUSIn, "Failed to load download: " + str, e10);
                    return null;
                }
            }
            return null;
        }
    }

    public void addDownload(DownloadRequest downloadRequest, int i10) {
        this.f98333g++;
        this.f98330d.obtainMessage(7, i10, 0, downloadRequest).sendToTarget();
    }

    public g(Context context, v vVar, o oVar) {
        this.f98327a = context.getApplicationContext();
        this.f98328b = vVar;
        this.f98337k = 3;
        this.f98338l = 5;
        this.f98336j = true;
        this.f98341o = Collections.EMPTY_LIST;
        this.f98332f = new CopyOnWriteArraySet();
        Handler handlerCreateHandlerForCurrentOrMainLooper = a1.createHandlerForCurrentOrMainLooper(new af.f(this, 4));
        this.f98329c = handlerCreateHandlerForCurrentOrMainLooper;
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadManager");
        handlerThread.start();
        b bVar = new b(handlerThread, vVar, oVar, handlerCreateHandlerForCurrentOrMainLooper, this.f98337k, this.f98338l, this.f98336j);
        this.f98330d = bVar;
        z9.h hVar = new z9.h(this);
        this.f98331e = hVar;
        RequirementsWatcher requirementsWatcher = new RequirementsWatcher(context, hVar, f98326q);
        this.f98342p = requirementsWatcher;
        int iStart = requirementsWatcher.start();
        this.f98339m = iStart;
        this.f98333g = 1;
        bVar.obtainMessage(1, iStart, 0).sendToTarget();
    }
}
