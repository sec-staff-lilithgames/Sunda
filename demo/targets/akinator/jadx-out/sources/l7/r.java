package l7;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.lifecycle.k0;
import kotlinx.coroutines.Job;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final a7.m f72643a;

    /* renamed from: b, reason: collision with root package name */
    public final q7.x f72644b;

    /* renamed from: c, reason: collision with root package name */
    public final q7.r f72645c;

    public r(a7.m mVar, q7.x xVar, q7.v vVar) {
        this.f72643a = mVar;
        this.f72644b = xVar;
        this.f72645c = q7.f.HardwareBitmapService(vVar);
    }

    public final boolean allowHardwareWorkerThread(o oVar) {
        return !q7.a.isHardware(oVar.getConfig()) || this.f72645c.allowHardwareWorkerThread();
    }

    public final f errorResult(i iVar, Throwable th2) {
        Drawable error;
        if (!(th2 instanceof m) || (error = iVar.getFallback()) == null) {
            error = iVar.getError();
        }
        return new f(error, iVar, th2);
    }

    public final boolean isConfigValidForHardware(i iVar, Bitmap.Config config) {
        if (!q7.a.isHardware(config)) {
            return true;
        }
        if (!iVar.getAllowHardware()) {
            return false;
        }
        n7.d target = iVar.getTarget();
        if (target instanceof n7.e) {
            View view = ((n7.e) target).getView();
            if (view.isAttachedToWindow() && !view.isHardwareAccelerated()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l7.o options(l7.i r19, m7.j r20) {
        /*
            r18 = this;
            r0 = r18
            java.util.List r1 = r19.getTransformations()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L20
            android.graphics.Bitmap$Config[] r1 = q7.n.getVALID_TRANSFORMATION_CONFIGS()
            android.graphics.Bitmap$Config r2 = r19.getBitmapConfig()
            boolean r1 = uu.k0.contains(r1, r2)
            if (r1 == 0) goto L1b
            goto L20
        L1b:
            r2 = r19
        L1d:
            r6 = r20
            goto L3c
        L20:
            android.graphics.Bitmap$Config r1 = r19.getBitmapConfig()
            r2 = r19
            boolean r1 = r0.isConfigValidForHardware(r2, r1)
            if (r1 == 0) goto L1d
            q7.r r1 = r0.f72645c
            r6 = r20
            boolean r1 = r1.allowHardwareMainThread(r6)
            if (r1 == 0) goto L3c
            android.graphics.Bitmap$Config r1 = r2.getBitmapConfig()
        L3a:
            r4 = r1
            goto L3f
        L3c:
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
            goto L3a
        L3f:
            q7.x r1 = r0.f72644b
            boolean r1 = r1.isOnline()
            if (r1 == 0) goto L4e
            l7.b r1 = r2.getNetworkCachePolicy()
        L4b:
            r17 = r1
            goto L51
        L4e:
            l7.b r1 = l7.b.DISABLED
            goto L4b
        L51:
            boolean r1 = r2.getAllowRgb565()
            if (r1 == 0) goto L68
            java.util.List r1 = r2.getTransformations()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L68
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8
            if (r4 == r1) goto L68
            r1 = 1
        L66:
            r9 = r1
            goto L6a
        L68:
            r1 = 0
            goto L66
        L6a:
            m7.c r1 = r6.getWidth()
            m7.d r3 = m7.d.f74053a
            boolean r1 = kotlin.jvm.internal.e0.areEqual(r1, r3)
            if (r1 != 0) goto L87
            m7.c r1 = r6.getHeight()
            boolean r1 = kotlin.jvm.internal.e0.areEqual(r1, r3)
            if (r1 == 0) goto L81
            goto L87
        L81:
            m7.i r1 = r2.getScale()
        L85:
            r7 = r1
            goto L8a
        L87:
            m7.i r1 = m7.i.f74063c
            goto L85
        L8a:
            l7.o r2 = new l7.o
            android.content.Context r3 = r19.getContext()
            android.graphics.ColorSpace r5 = r19.getColorSpace()
            boolean r8 = q7.l.getAllowInexactSize(r19)
            boolean r10 = r19.getPremultipliedAlpha()
            java.lang.String r11 = r19.getDiskCacheKey()
            xv.f0 r12 = r19.getHeaders()
            l7.t r13 = r19.getTags()
            l7.p r14 = r19.getParameters()
            l7.b r15 = r19.getMemoryCachePolicy()
            l7.b r16 = r19.getDiskCachePolicy()
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: l7.r.options(l7.i, m7.j):l7.o");
    }

    public final q requestDelegate(i iVar, Job job) {
        k0 lifecycle = iVar.getLifecycle();
        n7.d target = iVar.getTarget();
        return target instanceof n7.e ? new v(this.f72643a, iVar, (n7.e) target, lifecycle, job) : new a(lifecycle, job);
    }
}
