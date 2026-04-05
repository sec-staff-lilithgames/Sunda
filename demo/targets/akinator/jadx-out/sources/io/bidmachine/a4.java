package io.bidmachine;

import android.content.Context;
import io.bidmachine.protobuf.sdk.ContextualData;
import io.bidmachine.protobuf.sdk.Session;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a4 {
    public static ContextualData.ImpressionData.Builder a(Map map) {
        try {
            final ContextualData.ImpressionData.Builder builderNewBuilder = ContextualData.ImpressionData.newBuilder();
            Integer numConvertToIntOrDefault = nm.j.convertToIntOrDefault(map.get("imimd"), null);
            Objects.requireNonNull(builderNewBuilder);
            final int i10 = 0;
            nm.j.ifNotNull(numConvertToIntOrDefault, new Executable() { // from class: io.bidmachine.y3
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    switch (i10) {
                        case 0:
                            builderNewBuilder.setImimd(((Integer) obj).intValue());
                            break;
                        case 1:
                            builderNewBuilder.setImd(((Integer) obj).intValue());
                            break;
                        case 2:
                            builderNewBuilder.setImwp(((Float) obj).floatValue());
                            break;
                        case 3:
                            builderNewBuilder.setWp(((Float) obj).floatValue());
                            break;
                        case 4:
                            builderNewBuilder.setImagency(obj.toString());
                            break;
                        default:
                            builderNewBuilder.setAgency(obj.toString());
                            break;
                    }
                }
            });
            final int i11 = 1;
            nm.j.ifNotNull(nm.j.convertToIntOrDefault(map.get("imd"), null), new Executable() { // from class: io.bidmachine.y3
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    switch (i11) {
                        case 0:
                            builderNewBuilder.setImimd(((Integer) obj).intValue());
                            break;
                        case 1:
                            builderNewBuilder.setImd(((Integer) obj).intValue());
                            break;
                        case 2:
                            builderNewBuilder.setImwp(((Float) obj).floatValue());
                            break;
                        case 3:
                            builderNewBuilder.setWp(((Float) obj).floatValue());
                            break;
                        case 4:
                            builderNewBuilder.setImagency(obj.toString());
                            break;
                        default:
                            builderNewBuilder.setAgency(obj.toString());
                            break;
                    }
                }
            });
            final int i12 = 2;
            nm.j.ifNotNull(nm.j.convertToFloatOrDefault(map.get("imwp"), null), new Executable() { // from class: io.bidmachine.y3
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    switch (i12) {
                        case 0:
                            builderNewBuilder.setImimd(((Integer) obj).intValue());
                            break;
                        case 1:
                            builderNewBuilder.setImd(((Integer) obj).intValue());
                            break;
                        case 2:
                            builderNewBuilder.setImwp(((Float) obj).floatValue());
                            break;
                        case 3:
                            builderNewBuilder.setWp(((Float) obj).floatValue());
                            break;
                        case 4:
                            builderNewBuilder.setImagency(obj.toString());
                            break;
                        default:
                            builderNewBuilder.setAgency(obj.toString());
                            break;
                    }
                }
            });
            final int i13 = 3;
            nm.j.ifNotNull(nm.j.convertToFloatOrDefault(map.get("wp"), null), new Executable() { // from class: io.bidmachine.y3
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    switch (i13) {
                        case 0:
                            builderNewBuilder.setImimd(((Integer) obj).intValue());
                            break;
                        case 1:
                            builderNewBuilder.setImd(((Integer) obj).intValue());
                            break;
                        case 2:
                            builderNewBuilder.setImwp(((Float) obj).floatValue());
                            break;
                        case 3:
                            builderNewBuilder.setWp(((Float) obj).floatValue());
                            break;
                        case 4:
                            builderNewBuilder.setImagency(obj.toString());
                            break;
                        default:
                            builderNewBuilder.setAgency(obj.toString());
                            break;
                    }
                }
            });
            final int i14 = 4;
            nm.j.ifNotNull(map.get("imagency"), new Executable() { // from class: io.bidmachine.y3
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    switch (i14) {
                        case 0:
                            builderNewBuilder.setImimd(((Integer) obj).intValue());
                            break;
                        case 1:
                            builderNewBuilder.setImd(((Integer) obj).intValue());
                            break;
                        case 2:
                            builderNewBuilder.setImwp(((Float) obj).floatValue());
                            break;
                        case 3:
                            builderNewBuilder.setWp(((Float) obj).floatValue());
                            break;
                        case 4:
                            builderNewBuilder.setImagency(obj.toString());
                            break;
                        default:
                            builderNewBuilder.setAgency(obj.toString());
                            break;
                    }
                }
            });
            final int i15 = 5;
            nm.j.ifNotNull(map.get("agency"), new Executable() { // from class: io.bidmachine.y3
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    switch (i15) {
                        case 0:
                            builderNewBuilder.setImimd(((Integer) obj).intValue());
                            break;
                        case 1:
                            builderNewBuilder.setImd(((Integer) obj).intValue());
                            break;
                        case 2:
                            builderNewBuilder.setImwp(((Float) obj).floatValue());
                            break;
                        case 3:
                            builderNewBuilder.setWp(((Float) obj).floatValue());
                            break;
                        case 4:
                            builderNewBuilder.setImagency(obj.toString());
                            break;
                        default:
                            builderNewBuilder.setAgency(obj.toString());
                            break;
                    }
                }
            });
            return builderNewBuilder;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Session.Builder b(Context context, AdsType adsType) {
        try {
            Session.Builder sessionId = Session.newBuilder().setSessionId(SessionManager.get().getSessionId());
            Session.Context.Builder builderC = c(context, adsType);
            Objects.requireNonNull(sessionId);
            nm.j.ifNotNull(builderC, new u0(sessionId, 7));
            return sessionId;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0072 A[PHI: r3
      0x0072: PHI (r3v9 int) = (r3v8 int), (r3v10 int), (r3v11 int), (r3v12 int) binds: [B:11:0x0066, B:13:0x0069, B:15:0x006c, B:17:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static io.bidmachine.protobuf.sdk.Session.Context.Builder c(android.content.Context r7, io.bidmachine.AdsType r8) {
        /*
            r0 = 0
            java.util.Date r1 = new java.util.Date     // Catch: java.lang.Throwable -> Lc9
            android.content.SharedPreferences r7 = jh.i.E(r7)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r2 = "first_app_launch_ms"
            r3 = 0
            long r5 = pr.m.optLong(r7, r2, r3)     // Catch: java.lang.Throwable -> Lc9
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 == 0) goto L14
            goto L1f
        L14:
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lc9
            java.lang.Long r3 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> Lc9
            pr.m.putLong(r7, r2, r3)     // Catch: java.lang.Throwable -> Lc9
        L1f:
            r1.<init>(r5)     // Catch: java.lang.Throwable -> Lc9
            io.bidmachine.SessionManager r7 = io.bidmachine.SessionManager.get()     // Catch: java.lang.Throwable -> Lc9
            io.bidmachine.protobuf.sdk.Session$Context$Builder r2 = io.bidmachine.protobuf.sdk.Session.Context.newBuilder()     // Catch: java.lang.Throwable -> Lc9
            int r3 = r7.getSessionDurationSec()     // Catch: java.lang.Throwable -> Lc9
            long r3 = (long) r3     // Catch: java.lang.Throwable -> Lc9
            io.bidmachine.protobuf.sdk.Session$Context$Builder r2 = r2.setSessionduration(r3)     // Catch: java.lang.Throwable -> Lc9
            int r7 = r7.getLastSessionDurationSec()     // Catch: java.lang.Throwable -> Lc9
            long r3 = (long) r7     // Catch: java.lang.Throwable -> Lc9
            io.bidmachine.protobuf.sdk.Session$Context$Builder r7 = r2.setLastSessionDuration(r3)     // Catch: java.lang.Throwable -> Lc9
            io.bidmachine.SessionManager r2 = io.bidmachine.SessionManager.get()     // Catch: java.lang.Throwable -> Lc9
            int r2 = r2.getSessionCount()     // Catch: java.lang.Throwable -> Lc9
            io.bidmachine.protobuf.sdk.Session$Context$Builder r7 = r7.setSc(r2)     // Catch: java.lang.Throwable -> Lc9
            java.util.Date r2 = new java.util.Date     // Catch: java.lang.Throwable -> Lc9
            long r3 = nm.h.currentTimeMillis()     // Catch: java.lang.Throwable -> Lc9
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Lc9
            int r1 = ur.a.daysBetween(r1, r2)     // Catch: java.lang.Throwable -> Lc9
            io.bidmachine.protobuf.sdk.Session$Context$Builder r7 = r7.setRetention(r1)     // Catch: java.lang.Throwable -> Lc9
            r1 = 0
            if (r8 != 0) goto L5d
            goto L73
        L5d:
            int[] r2 = io.bidmachine.z3.f62075a     // Catch: java.lang.Throwable -> Lc9
            int r3 = r8.ordinal()     // Catch: java.lang.Throwable -> Lc9
            r2 = r2[r3]     // Catch: java.lang.Throwable -> Lc9
            r3 = 1
            if (r2 == r3) goto L72
            r3 = 2
            if (r2 == r3) goto L72
            r3 = 3
            if (r2 == r3) goto L72
            r3 = 4
            if (r2 == r3) goto L72
            goto L73
        L72:
            r1 = r3
        L73:
            java.util.Map r1 = io.bidmachine.analytics.BidMachineAnalytics.getImpData(r1)     // Catch: java.lang.Throwable -> Lc9
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> Lc9
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Lc9
        L7f:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> Lc9
            if (r2 == 0) goto Lc8
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> Lc9
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> Lc9
            java.lang.Object r3 = r2.getKey()     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> Lc9
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> Lc9
            java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Throwable -> Lc9
            io.bidmachine.protobuf.sdk.ContextualData$Builder r4 = io.bidmachine.protobuf.sdk.ContextualData.newBuilder()     // Catch: java.lang.Throwable -> Lb9
            io.bidmachine.protobuf.sdk.ContextualData$Builder r3 = r4.setMediatorName(r3)     // Catch: java.lang.Throwable -> Lb9
            io.bidmachine.x3 r4 = new io.bidmachine.x3     // Catch: java.lang.Throwable -> Lb9
            r5 = 0
            r4.<init>()     // Catch: java.lang.Throwable -> Lb9
            nm.j.ifNotNull(r8, r4)     // Catch: java.lang.Throwable -> Lb9
            io.bidmachine.protobuf.sdk.ContextualData$ImpressionData$Builder r2 = a(r2)     // Catch: java.lang.Throwable -> Lb9
            java.util.Objects.requireNonNull(r3)     // Catch: java.lang.Throwable -> Lb9
            io.bidmachine.x3 r4 = new io.bidmachine.x3     // Catch: java.lang.Throwable -> Lb9
            r5 = 1
            r4.<init>()     // Catch: java.lang.Throwable -> Lb9
            nm.j.ifNotNull(r2, r4)     // Catch: java.lang.Throwable -> Lb9
            goto Lba
        Lb9:
            r3 = r0
        Lba:
            java.util.Objects.requireNonNull(r7)     // Catch: java.lang.Throwable -> Lc9
            io.bidmachine.u0 r2 = new io.bidmachine.u0     // Catch: java.lang.Throwable -> Lc9
            r4 = 8
            r2.<init>(r7, r4)     // Catch: java.lang.Throwable -> Lc9
            nm.j.ifNotNull(r3, r2)     // Catch: java.lang.Throwable -> Lc9
            goto L7f
        Lc8:
            return r7
        Lc9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.a4.c(android.content.Context, io.bidmachine.AdsType):io.bidmachine.protobuf.sdk.Session$Context$Builder");
    }
}
