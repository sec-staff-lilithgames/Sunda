package wm;

import io.bidmachine.iab.vast.t;
import io.bidmachine.iab.vast.w;
import java.util.Stack;
import ym.s;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final t f90737a;

    /* renamed from: b, reason: collision with root package name */
    public final d f90738b;

    /* renamed from: d, reason: collision with root package name */
    public int f90740d = 0;

    /* renamed from: c, reason: collision with root package name */
    public final Stack f90739c = new Stack();

    public e(t tVar, d dVar) {
        this.f90737a = tVar;
        this.f90738b = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x04a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:337:0x046f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:341:0x045e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:347:0x044d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:349:0x043c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:360:0x029d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:361:0x047d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:365:0x04cb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:414:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final wm.f a(ym.x r28, ym.t r29, wm.g r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wm.e.a(ym.x, ym.t, wm.g):wm.f");
    }

    public f process(String str) {
        io.bidmachine.iab.vast.e.d("VastProcessor", "process", new Object[0]);
        f fVar = new f();
        try {
            ym.t vast = s.parseVast(str);
            if (vast != null && vast.hasAd()) {
                return a(null, vast, new g(true, true, true));
            }
            fVar.f90743c = w.f60555c;
            return fVar;
        } catch (Exception unused) {
            fVar.f90743c = w.f60554b;
            return fVar;
        }
    }
}
