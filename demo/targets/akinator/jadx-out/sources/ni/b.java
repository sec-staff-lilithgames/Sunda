package ni;

import af.i;
import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import ei.f;
import hi.c0;
import hi.k;
import hi.m;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import ji.u;
import ki.f2;
import pi.g;
import pi.j;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class b {

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f76837e = Charset.forName(C.UTF8_NAME);

    /* renamed from: f, reason: collision with root package name */
    public static final int f76838f = 15;

    /* renamed from: g, reason: collision with root package name */
    public static final li.c f76839g = new li.c();

    /* renamed from: h, reason: collision with root package name */
    public static final i f76840h = new i(29);

    /* renamed from: i, reason: collision with root package name */
    public static final k f76841i = new k(2);

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f76842a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    public final d f76843b;

    /* renamed from: c, reason: collision with root package name */
    public final j f76844c;

    /* renamed from: d, reason: collision with root package name */
    public final m f76845d;

    public b(d dVar, j jVar, m mVar) {
        this.f76843b = dVar;
        this.f76844c = jVar;
        this.f76845d = mVar;
    }

    public static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public static String c(File file) throws IOException {
        byte[] bArr = new byte[Segment.SIZE];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i10 = fileInputStream.read(bArr);
                if (i10 <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f76837e);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public static void d(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f76837e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th2) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        d dVar = this.f76843b;
        arrayList.addAll(dVar.getPriorityReports());
        arrayList.addAll(dVar.getNativeReports());
        i iVar = f76840h;
        Collections.sort(arrayList, iVar);
        List<File> reports = dVar.getReports();
        Collections.sort(reports, iVar);
        arrayList.addAll(reports);
        return arrayList;
    }

    public void deleteAllReports() {
        d dVar = this.f76843b;
        a(dVar.getReports());
        a(dVar.getPriorityReports());
        a(dVar.getNativeReports());
    }

    public void finalizeReports(String str, long j10) {
        boolean z10;
        li.c cVar;
        d dVar = this.f76843b;
        dVar.cleanupPreviousFileSystems();
        SortedSet<String> openSessionIds = getOpenSessionIds();
        if (str != null) {
            openSessionIds.remove(str);
        }
        if (openSessionIds.size() > 8) {
            while (openSessionIds.size() > 8) {
                String strLast = openSessionIds.last();
                f.getLogger().d("Removing session over cap: " + strLast);
                dVar.deleteSessionFiles(strLast);
                openSessionIds.remove(strLast);
            }
        }
        for (String str2 : openSessionIds) {
            f.getLogger().v("Finalizing report for session " + str2);
            List<File> sessionFiles = dVar.getSessionFiles(str2, f76841i);
            if (sessionFiles.isEmpty()) {
                f.getLogger().v("Session " + str2 + " has no events.");
            } else {
                Collections.sort(sessionFiles);
                ArrayList arrayList = new ArrayList();
                Iterator<File> it = sessionFiles.iterator();
                while (true) {
                    z10 = false;
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        cVar = f76839g;
                        if (!zHasNext) {
                            break;
                        }
                        File next = it.next();
                        try {
                            arrayList.add(cVar.eventFromJson(c(next)));
                            if (!z10) {
                                String name = next.getName();
                                if (!name.startsWith(NotificationCompat.CATEGORY_EVENT) || !name.endsWith("_")) {
                                    break;
                                }
                            }
                            z10 = true;
                        } catch (IOException e10) {
                            f.getLogger().w("Could not add event to report for " + next, e10);
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    f.getLogger().w("Could not parse event files for session " + str2);
                } else {
                    String userId = u.readUserId(str2, dVar);
                    String appQualitySessionId = this.f76845d.getAppQualitySessionId(str2);
                    File sessionFile = dVar.getSessionFile(str2, "report");
                    try {
                        f2 f2VarWithEvents = cVar.reportFromJson(c(sessionFile)).withSessionEndFields(j10, z10, userId).withAppQualitySessionId(appQualitySessionId).withEvents(arrayList);
                        f2.e session = f2VarWithEvents.getSession();
                        if (session != null) {
                            f.getLogger().d("appQualitySessionId: " + appQualitySessionId);
                            d(z10 ? dVar.getPriorityReport(session.getIdentifier()) : dVar.getReport(session.getIdentifier()), cVar.reportToJson(f2VarWithEvents));
                        }
                    } catch (IOException e11) {
                        f.getLogger().w("Could not synthesize final report file for " + sessionFile, e11);
                    }
                }
            }
            dVar.deleteSessionFiles(str2);
        }
        int i10 = ((g) this.f76844c).getSettingsSync().f81381a.f81391b;
        ArrayList arrayListB = b();
        int size = arrayListB.size();
        if (size <= i10) {
            return;
        }
        Iterator it2 = arrayListB.subList(i10, size).iterator();
        while (it2.hasNext()) {
            ((File) it2.next()).delete();
        }
    }

    public void finalizeSessionWithNativeEvent(String str, f2.d dVar, f2.a aVar) {
        d dVar2 = this.f76843b;
        File sessionFile = dVar2.getSessionFile(str, "report");
        f.getLogger().d("Writing native session report for " + str + " to file: " + sessionFile);
        String appQualitySessionId = this.f76845d.getAppQualitySessionId(str);
        try {
            li.c cVar = f76839g;
            d(dVar2.getNativeReport(str), cVar.reportToJson(cVar.reportFromJson(c(sessionFile)).withNdkPayload(dVar).withApplicationExitInfo(aVar).withAppQualitySessionId(appQualitySessionId)));
        } catch (IOException e10) {
            f.getLogger().w("Could not synthesize final native report file for " + sessionFile, e10);
        }
    }

    public SortedSet<String> getOpenSessionIds() {
        return new TreeSet(this.f76843b.getAllOpenSessionIds()).descendingSet();
    }

    public long getStartTimestampMillis(String str) {
        return this.f76843b.getSessionFile(str, "start-time").lastModified();
    }

    public boolean hasFinalizedReports() {
        d dVar = this.f76843b;
        return (dVar.getReports().isEmpty() && dVar.getPriorityReports().isEmpty() && dVar.getNativeReports().isEmpty()) ? false : true;
    }

    public List<c0> loadFinalizedReports() {
        ArrayList arrayListB = b();
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListB.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            try {
                arrayList.add(c0.create(f76839g.reportFromJson(c(file)), file.getName(), file));
            } catch (IOException e10) {
                f.getLogger().w("Could not load report file " + file + "; deleting", e10);
                file.delete();
            }
        }
        return arrayList;
    }

    public void persistEvent(f2.e.d dVar, String str) {
        persistEvent(dVar, str, false);
    }

    public void persistReport(f2 f2Var) throws IOException {
        d dVar = this.f76843b;
        f2.e session = f2Var.getSession();
        if (session == null) {
            f.getLogger().d("Could not get session for report");
            return;
        }
        String identifier = session.getIdentifier();
        try {
            d(dVar.getSessionFile(identifier, "report"), f76839g.reportToJson(f2Var));
            File sessionFile = dVar.getSessionFile(identifier, "start-time");
            long startedAt = session.getStartedAt();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(sessionFile), f76837e);
            try {
                outputStreamWriter.write("");
                sessionFile.setLastModified(startedAt * 1000);
                outputStreamWriter.close();
            } finally {
            }
        } catch (IOException e10) {
            f.getLogger().d("Could not persist report for session " + identifier, e10);
        }
    }

    public void persistEvent(f2.e.d dVar, String str, boolean z10) {
        d dVar2 = this.f76843b;
        int i10 = ((g) this.f76844c).getSettingsSync().f81381a.f81390a;
        try {
            d(dVar2.getSessionFile(str, a.b.l(NotificationCompat.CATEGORY_EVENT, String.format(Locale.US, "%010d", Integer.valueOf(this.f76842a.getAndIncrement())), z10 ? "_" : "")), f76839g.eventToJson(dVar));
        } catch (IOException e10) {
            f.getLogger().w("Could not persist event for session " + str, e10);
        }
        List<File> sessionFiles = dVar2.getSessionFiles(str, new k(3));
        Collections.sort(sessionFiles, new a(0));
        int size = sessionFiles.size();
        for (File file : sessionFiles) {
            if (size <= i10) {
                return;
            }
            d.c(file);
            size--;
        }
    }
}
