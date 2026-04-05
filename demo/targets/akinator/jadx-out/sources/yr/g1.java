package yr;

import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import java.io.IOException;
import mh.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class g1 {

    /* renamed from: a, reason: collision with root package name */
    public final f1 f94904a;

    /* renamed from: b, reason: collision with root package name */
    public final as.d f94905b;

    /* renamed from: c, reason: collision with root package name */
    public int f94906c = Settings.DEFAULT_INITIAL_WINDOW_SIZE;

    /* renamed from: d, reason: collision with root package name */
    public final e1 f94907d = new e1(this, 0, Settings.DEFAULT_INITIAL_WINDOW_SIZE, null);

    public g1(f1 f1Var, as.d dVar) {
        this.f94904a = (f1) p1.checkNotNull(f1Var, NotificationCompat.CATEGORY_TRANSPORT);
        this.f94905b = (as.d) p1.checkNotNull(dVar, "frameWriter");
    }

    public e1 createState(d1 d1Var, int i10) {
        return new e1(this, i10, this.f94906c, (d1) p1.checkNotNull(d1Var, "stream"));
    }

    public void data(boolean z10, e1 e1Var, pw.g gVar, boolean z11) {
        p1.checkNotNull(gVar, "source");
        int iMin = Math.min(e1Var.f94882d, e1Var.f94886h.f94907d.f94882d);
        boolean zA = e1Var.a();
        int size = (int) gVar.size();
        if (zA || iMin < size) {
            if (!zA && iMin > 0) {
                e1Var.c(iMin, false, gVar);
            }
            e1Var.f94879a.write(gVar, (int) gVar.size());
            e1Var.f94885g = z10 | e1Var.f94885g;
        } else {
            e1Var.c(size, z10, gVar);
        }
        if (z11) {
            flush();
        }
    }

    public void flush() {
        try {
            this.f94905b.flush();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public boolean initialOutboundWindowSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(a.b.e(i10, "Invalid initial window size: "));
        }
        int i11 = i10 - this.f94906c;
        this.f94906c = i10;
        for (e1 e1Var : this.f94904a.getActiveStreams()) {
            e1Var.b(i11);
        }
        return i11 > 0;
    }

    public void notifyWhenNoPendingData(e1 e1Var, Runnable runnable) {
        p1.checkNotNull(runnable, "noPendingDataRunnable");
        if (!e1Var.a()) {
            runnable.run();
        } else {
            p1.checkState(e1Var.f94880b == null, "pending data notification already requested");
            e1Var.f94880b = runnable;
        }
    }

    public int windowUpdate(e1 e1Var, int i10) {
        if (e1Var == null) {
            int iB = this.f94907d.b(i10);
            writeStreams();
            return iB;
        }
        int iB2 = e1Var.b(i10);
        mf.c cVar = new mf.c();
        e1Var.d(Math.min(e1Var.f94882d, e1Var.f94886h.f94907d.f94882d), cVar);
        if (cVar.f74523a > 0) {
            flush();
        }
        return iB2;
    }

    /*  JADX ERROR: JadxOverflowException in pass: LoopRegionVisitor
        jadx.core.utils.exceptions.JadxOverflowException: LoopRegionVisitor.assignOnlyInLoop endless recursion
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public void writeStreams() {
        /*
            r13 = this;
            yr.f1 r0 = r13.f94904a
            yr.e1[] r1 = r0.getActiveStreams()
            java.util.List r2 = java.util.Arrays.asList(r1)
            java.util.Collections.shuffle(r2)
            yr.e1 r2 = r13.f94907d
            int r2 = r2.f94882d
            int r3 = r1.length
        L12:
            r4 = 0
            if (r3 <= 0) goto L6a
            if (r2 <= 0) goto L6a
            float r5 = (float) r2
            float r6 = (float) r3
            float r5 = r5 / r6
            double r5 = (double) r5
            double r5 = java.lang.Math.ceil(r5)
            int r5 = (int) r5
            r6 = r4
            r7 = r6
        L22:
            if (r7 >= r3) goto L68
            if (r2 <= 0) goto L68
            r8 = r1[r7]
            int r9 = r8.f94882d
            pw.g r10 = r8.f94879a
            long r11 = r10.size()
            int r11 = (int) r11
            int r9 = java.lang.Math.min(r9, r11)
            int r9 = java.lang.Math.max(r4, r9)
            int r11 = r8.f94883e
            int r9 = r9 - r11
            int r9 = java.lang.Math.min(r9, r5)
            int r9 = java.lang.Math.min(r2, r9)
            if (r9 <= 0) goto L4c
            int r11 = r8.f94883e
            int r11 = r11 + r9
            r8.f94883e = r11
            int r2 = r2 - r9
        L4c:
            int r9 = r8.f94882d
            long r10 = r10.size()
            int r10 = (int) r10
            int r9 = java.lang.Math.min(r9, r10)
            int r9 = java.lang.Math.max(r4, r9)
            int r10 = r8.f94883e
            int r9 = r9 - r10
            if (r9 <= 0) goto L65
            int r9 = r6 + 1
            r1[r6] = r8
            r6 = r9
        L65:
            int r7 = r7 + 1
            goto L22
        L68:
            r3 = r6
            goto L12
        L6a:
            mf.c r1 = new mf.c
            r1.<init>()
            yr.e1[] r0 = r0.getActiveStreams()
            int r2 = r0.length
            r3 = r4
        L75:
            if (r3 >= r2) goto L83
            r5 = r0[r3]
            int r6 = r5.f94883e
            r5.d(r6, r1)
            r5.f94883e = r4
            int r3 = r3 + 1
            goto L75
        L83:
            int r0 = r1.f74523a
            if (r0 <= 0) goto L8a
            r13.flush()
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yr.g1.writeStreams():void");
    }
}
