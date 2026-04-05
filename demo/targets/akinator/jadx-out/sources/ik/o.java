package ik;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f59710a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f59711b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final o getInstance() {
            return ((ek.k) ((ek.x) com.google.firebase.j.getApp(com.google.firebase.c.f29664a).get(ek.x.class))).getSessionsSettings();
        }
    }

    static {
        new a(null);
    }

    public o(c0 localOverrideSettings, c0 remoteSettings) {
        e0.checkNotNullParameter(localOverrideSettings, "localOverrideSettings");
        e0.checkNotNullParameter(remoteSettings, "remoteSettings");
        this.f59710a = localOverrideSettings;
        this.f59711b = remoteSettings;
    }

    public final double getSamplingRate() {
        Double samplingRate = this.f59710a.getSamplingRate();
        if (samplingRate != null) {
            double dDoubleValue = samplingRate.doubleValue();
            if (0.0d <= dDoubleValue && dDoubleValue <= 1.0d) {
                return dDoubleValue;
            }
        }
        Double samplingRate2 = this.f59711b.getSamplingRate();
        if (samplingRate2 != null) {
            double dDoubleValue2 = samplingRate2.doubleValue();
            if (0.0d <= dDoubleValue2 && dDoubleValue2 <= 1.0d) {
                return dDoubleValue2;
            }
        }
        return 1.0d;
    }

    /* renamed from: getSessionRestartTimeout-UwyO8pc, reason: not valid java name */
    public final long m4272getSessionRestartTimeoutUwyO8pc() {
        tv.f fVarMo4271getSessionRestartTimeoutFghU774 = this.f59710a.mo4271getSessionRestartTimeoutFghU774();
        if (fVarMo4271getSessionRestartTimeoutFghU774 != null) {
            long jM7225unboximpl = fVarMo4271getSessionRestartTimeoutFghU774.m7225unboximpl();
            if (tv.f.m7206isPositiveimpl(jM7225unboximpl) && tv.f.m7203isFiniteimpl(jM7225unboximpl)) {
                return jM7225unboximpl;
            }
        }
        tv.f fVarMo4271getSessionRestartTimeoutFghU7742 = this.f59711b.mo4271getSessionRestartTimeoutFghU774();
        if (fVarMo4271getSessionRestartTimeoutFghU7742 != null) {
            long jM7225unboximpl2 = fVarMo4271getSessionRestartTimeoutFghU7742.m7225unboximpl();
            if (tv.f.m7206isPositiveimpl(jM7225unboximpl2) && tv.f.m7203isFiniteimpl(jM7225unboximpl2)) {
                return jM7225unboximpl2;
            }
        }
        tv.e eVar = tv.f.f87433c;
        return tv.h.toDuration(30, tv.i.f87443h);
    }

    public final boolean getSessionsEnabled() {
        Boolean sessionEnabled = this.f59710a.getSessionEnabled();
        if (sessionEnabled != null) {
            return sessionEnabled.booleanValue();
        }
        Boolean sessionEnabled2 = this.f59711b.getSessionEnabled();
        if (sessionEnabled2 != null) {
            return sessionEnabled2.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        if (r6.updateSettings(r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateSettings(zu.d<? super tu.x0> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ik.p
            if (r0 == 0) goto L13
            r0 = r6
            ik.p r0 = (ik.p) r0
            int r1 = r0.f59715l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f59715l = r1
            goto L18
        L13:
            ik.p r0 = new ik.p
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f59713j
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f59715l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            tu.a0.throwOnFailure(r6)
            goto L59
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            ik.o r2 = r0.f59712i
            tu.a0.throwOnFailure(r6)
            goto L4b
        L3a:
            tu.a0.throwOnFailure(r6)
            r0.f59712i = r5
            r0.f59715l = r4
            ik.c0 r6 = r5.f59710a
            java.lang.Object r6 = r6.updateSettings(r0)
            if (r6 != r1) goto L4a
            goto L58
        L4a:
            r2 = r5
        L4b:
            ik.c0 r6 = r2.f59711b
            r2 = 0
            r0.f59712i = r2
            r0.f59715l = r3
            java.lang.Object r6 = r6.updateSettings(r0)
            if (r6 != r1) goto L59
        L58:
            return r1
        L59:
            tu.x0 r6 = tu.x0.f87415a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ik.o.updateSettings(zu.d):java.lang.Object");
    }
}
