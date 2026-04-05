package hi;

import android.app.ApplicationExitInfo;
import android.content.Context;
import com.applovin.impl.aa;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f58870a;

    /* renamed from: b, reason: collision with root package name */
    public final ni.b f58871b;

    /* renamed from: c, reason: collision with root package name */
    public final oi.a f58872c;

    /* renamed from: d, reason: collision with root package name */
    public final ji.h f58873d;

    /* renamed from: e, reason: collision with root package name */
    public final ji.u f58874e;

    /* renamed from: f, reason: collision with root package name */
    public final n0 f58875f;

    /* renamed from: g, reason: collision with root package name */
    public final ii.g f58876g;

    public s0(b0 b0Var, ni.b bVar, oi.a aVar, ji.h hVar, ji.u uVar, n0 n0Var, ii.g gVar) {
        this.f58870a = b0Var;
        this.f58871b = bVar;
        this.f58872c = aVar;
        this.f58873d = hVar;
        this.f58874e = uVar;
        this.f58875f = n0Var;
        this.f58876g = gVar;
    }

    public static f2.e.d a(f2.e.d dVar, ji.h hVar, ji.u uVar, Map map) {
        f2.e.d.b builder = dVar.toBuilder();
        String logString = hVar.getLogString();
        if (logString != null) {
            builder.setLog(f2.e.d.AbstractC0730d.builder().setContent(logString).build());
        } else {
            ei.f.getLogger().v("No log data to include with this event.");
        }
        List<f2.c> listB = b(uVar.getCustomKeys(map));
        List<f2.c> listB2 = b(uVar.getInternalKeys());
        if (!listB.isEmpty() || !listB2.isEmpty()) {
            builder.setApp(dVar.getApp().toBuilder().setCustomAttributes(listB).setInternalKeys(listB2).build());
        }
        return builder.build();
    }

    public static List b(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(f2.c.builder().setKey((String) entry.getKey()).setValue((String) entry.getValue()).build());
        }
        Collections.sort(arrayList, new af.i(24));
        return Collections.unmodifiableList(arrayList);
    }

    public static String convertInputStreamToString(InputStream inputStream) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[Segment.SIZE];
                while (true) {
                    int i10 = bufferedInputStream.read(bArr);
                    if (i10 == -1) {
                        String string = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                        byteArrayOutputStream.close();
                        bufferedInputStream.close();
                        return string;
                    }
                    byteArrayOutputStream.write(bArr, 0, i10);
                }
            } finally {
            }
        } catch (Throwable th2) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static s0 create(Context context, n0 n0Var, ni.d dVar, a aVar, ji.h hVar, ji.u uVar, qi.d dVar2, pi.j jVar, r0 r0Var, m mVar, ii.g gVar) {
        return new s0(new b0(context, n0Var, aVar, dVar2, jVar), new ni.b(dVar, jVar, mVar), oi.a.create(context, jVar, r0Var), hVar, uVar, n0Var, gVar);
    }

    public final void c(Throwable th2, Thread thread, String str, ji.d dVar, boolean z10) {
        boolean zEquals = str.equals("crash");
        f2.e.d dVarCaptureEventData = this.f58870a.captureEventData(th2, thread, str, dVar.getTimestamp(), 4, 8, z10);
        Map<String, String> additionalCustomKeys = dVar.getAdditionalCustomKeys();
        ji.h hVar = this.f58873d;
        ji.u uVar = this.f58874e;
        f2.e.d dVarA = a(dVarCaptureEventData, hVar, uVar, additionalCustomKeys);
        List<f2.e.d.AbstractC0731e> rolloutsState = uVar.getRolloutsState();
        if (!rolloutsState.isEmpty()) {
            f2.e.d.b builder = dVarA.toBuilder();
            builder.setRollouts(f2.e.d.f.builder().setRolloutAssignments(rolloutsState).build());
            dVarA = builder.build();
        }
        if (z10) {
            this.f58871b.persistEvent(dVarA, dVar.getSessionId(), zEquals);
        } else {
            this.f58876g.f59615b.submit(new aa(this, dVarA, dVar, zEquals, 9));
        }
    }

    public void finalizeSessionWithNativeEvent(String str, List<q0> list, f2.a aVar) {
        ei.f.getLogger().d("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        Iterator<q0> it = list.iterator();
        while (it.hasNext()) {
            f2.d.b bVarAsFilePayload = it.next().asFilePayload();
            if (bVarAsFilePayload != null) {
                arrayList.add(bVarAsFilePayload);
            }
        }
        this.f58871b.finalizeSessionWithNativeEvent(str, f2.d.builder().setFiles(Collections.unmodifiableList(arrayList)).build(), aVar);
    }

    public void finalizeSessions(long j10, String str) {
        this.f58871b.finalizeReports(str, j10);
    }

    public boolean hasReportsToSend() {
        return this.f58871b.hasFinalizedReports();
    }

    public SortedSet<String> listSortedOpenSessionIds() {
        return this.f58871b.getOpenSessionIds();
    }

    public void onBeginSession(String str, long j10) {
        this.f58871b.persistReport(this.f58870a.captureReportData(str, j10));
    }

    public void persistFatalEvent(Throwable th2, Thread thread, String str, long j10) {
        ei.f.getLogger().v("Persisting fatal event for session " + str);
        c(th2, thread, "crash", new ji.d(str, j10), true);
    }

    public void persistNonFatalEvent(Throwable th2, Thread thread, ji.d dVar) {
        ei.f.getLogger().v("Persisting non-fatal event for session " + dVar.getSessionId());
        c(th2, thread, "error", dVar, false);
    }

    public void persistRelevantAppExitInfoEvent(String str, List<ApplicationExitInfo> list, ji.h hVar, ji.u uVar) {
        String strConvertInputStreamToString;
        ApplicationExitInfo applicationExitInfoB;
        ni.b bVar = this.f58871b;
        long startTimestampMillis = bVar.getStartTimestampMillis(str);
        Iterator<ApplicationExitInfo> it = list.iterator();
        do {
            strConvertInputStreamToString = null;
            if (it.hasNext()) {
                applicationExitInfoB = sn.t.b(it.next());
                if (applicationExitInfoB.getTimestamp() < startTimestampMillis) {
                }
            }
            applicationExitInfoB = null;
            break;
        } while (applicationExitInfoB.getReason() != 6);
        if (applicationExitInfoB == null) {
            ei.f.getLogger().v("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        try {
            InputStream traceInputStream = applicationExitInfoB.getTraceInputStream();
            if (traceInputStream != null) {
                strConvertInputStreamToString = convertInputStreamToString(traceInputStream);
            }
        } catch (IOException e10) {
            ei.f.getLogger().w("Could not get input trace in application exit info: " + applicationExitInfoB.toString() + " Error: " + e10);
        }
        f2.e.d dVarCaptureAnrEventData = this.f58870a.captureAnrEventData(f2.a.builder().setImportance(applicationExitInfoB.getImportance()).setProcessName(applicationExitInfoB.getProcessName()).setReasonCode(applicationExitInfoB.getReason()).setTimestamp(applicationExitInfoB.getTimestamp()).setPid(applicationExitInfoB.getPid()).setPss(applicationExitInfoB.getPss()).setRss(applicationExitInfoB.getRss()).setTraceFile(strConvertInputStreamToString).build());
        ei.f.getLogger().d("Persisting anr for session " + str);
        f2.e.d dVarA = a(dVarCaptureAnrEventData, hVar, uVar, Collections.EMPTY_MAP);
        List<f2.e.d.AbstractC0731e> rolloutsState = uVar.getRolloutsState();
        if (!rolloutsState.isEmpty()) {
            f2.e.d.b builder = dVarA.toBuilder();
            builder.setRollouts(f2.e.d.f.builder().setRolloutAssignments(rolloutsState).build());
            dVarA = builder.build();
        }
        bVar.persistEvent(dVarA, str, true);
    }

    public void removeAllReports() {
        this.f58871b.deleteAllReports();
    }

    public Task<Void> sendReports(Executor executor) {
        return sendReports(executor, null);
    }

    public Task<Void> sendReports(Executor executor, String str) {
        List<c0> listLoadFinalizedReports = this.f58871b.loadFinalizedReports();
        ArrayList arrayList = new ArrayList();
        Iterator<c0> it = listLoadFinalizedReports.iterator();
        while (it.hasNext()) {
            c0 next = it.next();
            if (str == null || str.equals(next.getSessionId())) {
                if (next.getReport().getFirebaseInstallationId() == null || next.getReport().getFirebaseAuthenticationToken() == null) {
                    m0 m0VarFetchTrueFid = this.f58875f.fetchTrueFid(true);
                    next = c0.create(next.getReport().withFirebaseInstallationId(m0VarFetchTrueFid.getFid()).withFirebaseAuthenticationToken(m0VarFetchTrueFid.getAuthToken()), next.getSessionId(), next.getReportFile());
                }
                arrayList.add(this.f58872c.enqueueReport(next, str != null).continueWith(executor, new ha.a(this, 2)));
            }
        }
        return Tasks.whenAll(arrayList);
    }
}
