package fo;

import com.google.android.gms.tasks.TaskCompletionSource;
import fo.e;
import gn.v1;
import hi.c0;
import java.util.List;
import mh.q1;
import nh.we;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class c implements i, jd.m {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f55817b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f55818c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f55819e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f55820f;

    public /* synthetic */ c(boolean z10, Object obj, Object obj2, Object obj3) {
        this.f55818c = obj;
        this.f55819e = obj2;
        this.f55817b = z10;
        this.f55820f = obj3;
    }

    @Override // fo.i
    public List create(int i10, v1 v1Var, int[] iArr) {
        final e eVar = (e) this.f55818c;
        final g gVar = (g) this.f55819e;
        int[] iArr2 = (int[]) this.f55820f;
        we weVar = e.f55823j;
        return e.a.createForTrackGroup(i10, v1Var, gVar, iArr, this.f55817b, new q1() { // from class: fo.d
            /* JADX WARN: Removed duplicated region for block: B:38:0x0065 A[FALL_THROUGH] */
            @Override // mh.q1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean apply(java.lang.Object r9) {
                /*
                    r8 = this;
                    io.bidmachine.media3.common.b r9 = (io.bidmachine.media3.common.b) r9
                    nh.we r0 = fo.e.f55823j
                    fo.e r0 = r1
                    r0.getClass()
                    fo.g r1 = r2
                    boolean r1 = r1.f55905y0
                    r2 = 1
                    if (r1 == 0) goto L8f
                    int r1 = r9.E
                    r3 = -1
                    if (r1 == r3) goto L8f
                    r4 = 2
                    if (r1 <= r4) goto L8f
                    java.lang.String r1 = r9.f60665o
                    r5 = 0
                    r6 = 32
                    if (r1 != 0) goto L20
                    goto L65
                L20:
                    int r7 = r1.hashCode()
                    switch(r7) {
                        case -2123537834: goto L49;
                        case 187078296: goto L3e;
                        case 187078297: goto L33;
                        case 1504578661: goto L28;
                        default: goto L27;
                    }
                L27:
                    goto L53
                L28:
                    java.lang.String r4 = "audio/eac3"
                    boolean r1 = r1.equals(r4)
                    if (r1 != 0) goto L31
                    goto L53
                L31:
                    r3 = 3
                    goto L53
                L33:
                    java.lang.String r7 = "audio/ac4"
                    boolean r1 = r1.equals(r7)
                    if (r1 != 0) goto L3c
                    goto L53
                L3c:
                    r3 = r4
                    goto L53
                L3e:
                    java.lang.String r4 = "audio/ac3"
                    boolean r1 = r1.equals(r4)
                    if (r1 != 0) goto L47
                    goto L53
                L47:
                    r3 = r2
                    goto L53
                L49:
                    java.lang.String r4 = "audio/eac3-joc"
                    boolean r1 = r1.equals(r4)
                    if (r1 != 0) goto L52
                    goto L53
                L52:
                    r3 = r5
                L53:
                    switch(r3) {
                        case 0: goto L57;
                        case 1: goto L57;
                        case 2: goto L57;
                        case 3: goto L57;
                        default: goto L56;
                    }
                L56:
                    goto L65
                L57:
                    int r1 = io.bidmachine.media3.common.util.a1.f60679a
                    if (r1 < r6) goto L8f
                    fo.e$f r1 = r0.f55828h
                    if (r1 == 0) goto L8f
                    boolean r1 = r1.isSpatializationSupported()
                    if (r1 == 0) goto L8f
                L65:
                    int r1 = io.bidmachine.media3.common.util.a1.f60679a
                    if (r1 < r6) goto L8e
                    fo.e$f r1 = r0.f55828h
                    if (r1 == 0) goto L8e
                    boolean r1 = r1.isSpatializationSupported()
                    if (r1 == 0) goto L8e
                    fo.e$f r1 = r0.f55828h
                    boolean r1 = r1.isAvailable()
                    if (r1 == 0) goto L8e
                    fo.e$f r1 = r0.f55828h
                    boolean r1 = r1.isEnabled()
                    if (r1 == 0) goto L8e
                    fo.e$f r1 = r0.f55828h
                    gn.h r0 = r0.f55829i
                    boolean r9 = r1.canBeSpatialized(r0, r9)
                    if (r9 == 0) goto L8e
                    goto L8f
                L8e:
                    return r5
                L8f:
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: fo.d.apply(java.lang.Object):boolean");
            }
        }, iArr2[i10]);
    }

    @Override // jd.m
    public void onSchedule(Exception exc) {
        oi.c cVar = (oi.c) this.f55818c;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f55819e;
        c0 c0Var = (c0) this.f55820f;
        cVar.getClass();
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
            return;
        }
        if (this.f55817b) {
            cVar.flushScheduledReportsIfAble();
        }
        taskCompletionSource.trySetResult(c0Var);
    }
}
