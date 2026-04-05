package hp;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class f {
    public static void a(i iVar, int i10, io.bidmachine.media3.common.util.k kVar) {
        long eventTime = iVar.getEventTime(i10);
        List<in.b> cues = iVar.getCues(eventTime);
        if (cues.isEmpty()) {
            return;
        }
        if (i10 == iVar.getEventTimeCount() - 1) {
            throw new IllegalStateException();
        }
        long eventTime2 = iVar.getEventTime(i10 + 1) - iVar.getEventTime(i10);
        if (eventTime2 > 0) {
            kVar.accept(new c(cues, eventTime, eventTime2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void toCuesWithTiming(hp.i r12, hp.r r13, io.bidmachine.media3.common.util.k r14) {
        /*
            long r0 = r13.f59126a
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 0
            if (r4 != 0) goto Le
            r4 = r5
            goto L27
        Le:
            int r4 = r12.getNextEventTimeIndex(r0)
            r6 = -1
            if (r4 != r6) goto L19
            int r4 = r12.getEventTimeCount()
        L19:
            if (r4 <= 0) goto L27
            int r6 = r4 + (-1)
            long r6 = r12.getEventTime(r6)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 != 0) goto L27
            int r4 = r4 + (-1)
        L27:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L51
            int r2 = r12.getEventTimeCount()
            if (r4 >= r2) goto L51
            java.util.List r7 = r12.getCues(r0)
            long r2 = r12.getEventTime(r4)
            boolean r6 = r7.isEmpty()
            if (r6 != 0) goto L51
            long r8 = r13.f59126a
            int r6 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r6 >= 0) goto L51
            hp.c r6 = new hp.c
            long r10 = r2 - r8
            r6.<init>(r7, r8, r10)
            r14.accept(r6)
            r2 = 1
            goto L52
        L51:
            r2 = r5
        L52:
            r3 = r4
        L53:
            int r6 = r12.getEventTimeCount()
            if (r3 >= r6) goto L5f
            a(r12, r3, r14)
            int r3 = r3 + 1
            goto L53
        L5f:
            boolean r13 = r13.f59127b
            if (r13 == 0) goto L87
            if (r2 == 0) goto L67
            int r4 = r4 + (-1)
        L67:
            if (r5 >= r4) goto L6f
            a(r12, r5, r14)
            int r5 = r5 + 1
            goto L67
        L6f:
            if (r2 == 0) goto L87
            hp.c r6 = new hp.c
            java.util.List r7 = r12.getCues(r0)
            long r8 = r12.getEventTime(r4)
            long r12 = r12.getEventTime(r4)
            long r10 = r0 - r12
            r6.<init>(r7, r8, r10)
            r14.accept(r6)
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hp.f.toCuesWithTiming(hp.i, hp.r, io.bidmachine.media3.common.util.k):void");
    }
}
