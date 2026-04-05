package hi;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import b0.e2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class b0 {

    /* renamed from: f, reason: collision with root package name */
    public static final HashMap f58792f;

    /* renamed from: g, reason: collision with root package name */
    public static final String f58793g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f58794a;

    /* renamed from: b, reason: collision with root package name */
    public final n0 f58795b;

    /* renamed from: c, reason: collision with root package name */
    public final a f58796c;

    /* renamed from: d, reason: collision with root package name */
    public final qi.d f58797d;

    /* renamed from: e, reason: collision with root package name */
    public final pi.j f58798e;

    static {
        HashMap map = new HashMap();
        f58792f = map;
        e2.v(5, map, "armeabi", 6, "armeabi-v7a");
        e2.v(9, map, "arm64-v8a", 0, "x86");
        map.put("x86_64", 1);
        Locale locale = Locale.US;
        f58793g = "Crashlytics Android SDK/20.0.3";
    }

    public b0(Context context, n0 n0Var, a aVar, qi.d dVar, pi.j jVar) {
        this.f58794a = context;
        this.f58795b = n0Var;
        this.f58796c = aVar;
        this.f58797d = dVar;
        this.f58798e = jVar;
    }

    public static f2.e.d.a.b.c c(qi.e eVar, int i10, int i11, int i12) {
        String str = eVar.f83268b;
        String str2 = eVar.f83267a;
        StackTraceElement[] stackTraceElementArr = eVar.f83269c;
        int i13 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        qi.e eVar2 = eVar.f83270d;
        if (i12 >= i11) {
            qi.e eVar3 = eVar2;
            while (eVar3 != null) {
                eVar3 = eVar3.f83270d;
                i13++;
            }
        }
        f2.e.d.a.b.c.AbstractC0722a overflowCount = f2.e.d.a.b.c.builder().setType(str).setReason(str2).setFrames(d(stackTraceElementArr, i10)).setOverflowCount(i13);
        if (eVar2 != null && i13 == 0) {
            overflowCount.setCausedBy(c(eVar2, i10, i11, i12 + 1));
        }
        return overflowCount.build();
    }

    public static List d(StackTraceElement[] stackTraceElementArr, int i10) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            f2.e.d.a.b.AbstractC0725e.AbstractC0727b.AbstractC0728a importance = f2.e.d.a.b.AbstractC0725e.AbstractC0727b.builder().setImportance(i10);
            long lineNumber = 0;
            long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                lineNumber = stackTraceElement.getLineNumber();
            }
            arrayList.add(importance.setPc(jMax).setSymbol(str).setFile(fileName).setOffset(lineNumber).build());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final List a() {
        f2.e.d.a.b.AbstractC0719a.AbstractC0720a size = f2.e.d.a.b.AbstractC0719a.builder().setBaseAddress(0L).setSize(0L);
        a aVar = this.f58796c;
        return Collections.singletonList(size.setName(aVar.f58783e).setUuid(aVar.f58780b).build());
    }

    public final f2.e.d.c b(int i10) {
        Context context = this.f58794a;
        e eVar = e.get(context);
        Float batteryLevel = eVar.getBatteryLevel();
        Double dValueOf = batteryLevel != null ? Double.valueOf(batteryLevel.doubleValue()) : null;
        int batteryVelocity = eVar.getBatteryVelocity();
        boolean proximitySensorEnabled = j.getProximitySensorEnabled(context);
        long jCalculateTotalRamInBytes = j.calculateTotalRamInBytes(context) - j.calculateFreeRamInBytes(context);
        if (jCalculateTotalRamInBytes <= 0) {
            jCalculateTotalRamInBytes = 0;
        }
        return f2.e.d.c.builder().setBatteryLevel(dValueOf).setBatteryVelocity(batteryVelocity).setProximityOn(proximitySensorEnabled).setOrientation(i10).setRamUsed(jCalculateTotalRamInBytes).setDiskUsed(j.calculateUsedDiskSpaceInBytes(Environment.getDataDirectory().getPath())).build();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ki.f2.e.d captureAnrEventData(ki.f2.a r8) {
        /*
            r7 = this;
            android.content.Context r0 = r7.f58794a
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.orientation
            ki.f2$e$d$b r1 = ki.f2.e.d.builder()
            java.lang.String r2 = "anr"
            ki.f2$e$d$b r1 = r1.setType(r2)
            long r2 = r8.getTimestamp()
            ki.f2$e$d$b r1 = r1.setTimestamp(r2)
            pi.j r2 = r7.f58798e
            pi.g r2 = (pi.g) r2
            pi.d r2 = r2.getSettingsSync()
            pi.d$a r2 = r2.f81382b
            boolean r2 = r2.f81389c
            if (r2 == 0) goto L76
            hi.a r2 = r7.f58796c
            java.util.List r3 = r2.f58781c
            int r3 = r3.size()
            if (r3 <= 0) goto L76
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.List r2 = r2.f58781c
            java.util.Iterator r2 = r2.iterator()
        L41:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L71
            java.lang.Object r4 = r2.next()
            hi.f r4 = (hi.f) r4
            ki.f2$a$a$a r5 = ki.f2.a.AbstractC0714a.builder()
            java.lang.String r6 = r4.getLibraryName()
            ki.f2$a$a$a r5 = r5.setLibraryName(r6)
            java.lang.String r6 = r4.getArch()
            ki.f2$a$a$a r5 = r5.setArch(r6)
            java.lang.String r4 = r4.getBuildId()
            ki.f2$a$a$a r4 = r5.setBuildId(r4)
            ki.f2$a$a r4 = r4.build()
            r3.add(r4)
            goto L41
        L71:
            java.util.List r2 = java.util.Collections.unmodifiableList(r3)
            goto L77
        L76:
            r2 = 0
        L77:
            ki.f2$a$b r3 = ki.f2.a.builder()
            int r4 = r8.getImportance()
            ki.f2$a$b r3 = r3.setImportance(r4)
            java.lang.String r4 = r8.getProcessName()
            ki.f2$a$b r3 = r3.setProcessName(r4)
            int r4 = r8.getReasonCode()
            ki.f2$a$b r3 = r3.setReasonCode(r4)
            long r4 = r8.getTimestamp()
            ki.f2$a$b r3 = r3.setTimestamp(r4)
            int r4 = r8.getPid()
            ki.f2$a$b r3 = r3.setPid(r4)
            long r4 = r8.getPss()
            ki.f2$a$b r3 = r3.setPss(r4)
            long r4 = r8.getRss()
            ki.f2$a$b r3 = r3.setRss(r4)
            java.lang.String r8 = r8.getTraceFile()
            ki.f2$a$b r8 = r3.setTraceFile(r8)
            ki.f2$a$b r8 = r8.setBuildIdMappingForArch(r2)
            ki.f2$a r8 = r8.build()
            int r2 = r8.getImportance()
            r3 = 100
            if (r2 == r3) goto Lcd
            r2 = 1
            goto Lce
        Lcd:
            r2 = 0
        Lce:
            ki.f2$e$d$a$a r3 = ki.f2.e.d.a.builder()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            ki.f2$e$d$a$a r2 = r3.setBackground(r2)
            java.lang.String r3 = r8.getProcessName()
            int r4 = r8.getPid()
            int r5 = r8.getImportance()
            ei.h r6 = ei.h.f54405a
            ki.f2$e$d$a$c r3 = r6.buildProcessDetails(r3, r4, r5)
            ki.f2$e$d$a$a r2 = r2.setCurrentProcessDetails(r3)
            ki.f2$e$d$a$a r2 = r2.setUiOrientation(r0)
            ki.f2$e$d$a$b$b r3 = ki.f2.e.d.a.b.builder()
            ki.f2$e$d$a$b$b r8 = r3.setAppExitInfo(r8)
            ki.f2$e$d$a$b$d$a r3 = ki.f2.e.d.a.b.AbstractC0723d.builder()
            java.lang.String r4 = "0"
            ki.f2$e$d$a$b$d$a r3 = r3.setName(r4)
            ki.f2$e$d$a$b$d$a r3 = r3.setCode(r4)
            r4 = 0
            ki.f2$e$d$a$b$d$a r3 = r3.setAddress(r4)
            ki.f2$e$d$a$b$d r3 = r3.build()
            ki.f2$e$d$a$b$b r8 = r8.setSignal(r3)
            java.util.List r3 = r7.a()
            ki.f2$e$d$a$b$b r8 = r8.setBinaries(r3)
            ki.f2$e$d$a$b r8 = r8.build()
            ki.f2$e$d$a$a r8 = r2.setExecution(r8)
            ki.f2$e$d$a r8 = r8.build()
            ki.f2$e$d$b r8 = r1.setApp(r8)
            ki.f2$e$d$c r0 = r7.b(r0)
            ki.f2$e$d$b r8 = r8.setDevice(r0)
            ki.f2$e$d r8 = r8.build()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: hi.b0.captureAnrEventData(ki.f2$a):ki.f2$e$d");
    }

    public f2.e.d captureEventData(Throwable th2, Thread thread, String str, long j10, int i10, int i11, boolean z10) {
        Context context = this.f58794a;
        int i12 = context.getResources().getConfiguration().orientation;
        qi.d dVar = this.f58797d;
        qi.e eVarMakeTrimmedThrowableData = qi.e.makeTrimmedThrowableData(th2, dVar);
        f2.e.d.b timestamp = f2.e.d.builder().setType(str).setTimestamp(j10);
        ei.h hVar = ei.h.f54405a;
        f2.e.d.a.c currentProcessDetails = hVar.getCurrentProcessDetails(context);
        f2.e.d.a.AbstractC0718a uiOrientation = f2.e.d.a.builder().setBackground(currentProcessDetails.getImportance() > 0 ? Boolean.valueOf(currentProcessDetails.getImportance() != 100) : null).setCurrentProcessDetails(currentProcessDetails).setAppProcessDetails(hVar.getAppProcessDetails(context)).setUiOrientation(i12);
        f2.e.d.a.b.AbstractC0721b abstractC0721bBuilder = f2.e.d.a.b.builder();
        ArrayList arrayList = new ArrayList();
        arrayList.add(f2.e.d.a.b.AbstractC0725e.builder().setName(thread.getName()).setImportance(i10).setFrames(d(eVarMakeTrimmedThrowableData.f83269c, i10)).build());
        if (z10) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(f2.e.d.a.b.AbstractC0725e.builder().setName(key.getName()).setImportance(0).setFrames(d(dVar.getTrimmedStackTrace(entry.getValue()), 0)).build());
                }
            }
        }
        return timestamp.setApp(uiOrientation.setExecution(abstractC0721bBuilder.setThreads(Collections.unmodifiableList(arrayList)).setException(c(eVarMakeTrimmedThrowableData, i10, i11, 0)).setSignal(f2.e.d.a.b.AbstractC0723d.builder().setName("0").setCode("0").setAddress(0L).build()).setBinaries(a()).build()).build()).setDevice(b(i12)).build();
    }

    public f2 captureReportData(String str, long j10) {
        f2.b sdkVersion = f2.builder().setSdkVersion("20.0.3");
        a aVar = this.f58796c;
        f2.b gmpAppId = sdkVersion.setGmpAppId(aVar.f58779a);
        n0 n0Var = this.f58795b;
        f2.b firebaseAuthenticationToken = gmpAppId.setInstallationUuid(n0Var.getInstallIds().getCrashlyticsInstallId()).setFirebaseInstallationId(n0Var.getInstallIds().getFirebaseInstallationId()).setFirebaseAuthenticationToken(n0Var.getInstallIds().getFirebaseAuthenticationToken());
        String str2 = aVar.f58784f;
        f2.b buildVersion = firebaseAuthenticationToken.setBuildVersion(str2);
        String str3 = aVar.f58785g;
        f2.b platform = buildVersion.setDisplayVersion(str3).setPlatform(4);
        f2.e.b generator = f2.e.builder().setStartedAt(j10).setIdentifier(str).setGenerator(f58793g);
        f2.e.a.AbstractC0716a installationUuid = f2.e.a.builder().setIdentifier(n0Var.getAppIdentifier()).setVersion(str2).setDisplayVersion(str3).setInstallationUuid(n0Var.getInstallIds().getCrashlyticsInstallId());
        ei.e eVar = aVar.f58786h;
        f2.e.b os2 = generator.setApp(installationUuid.setDevelopmentPlatform(eVar.getDevelopmentPlatform()).setDevelopmentPlatformVersion(eVar.getDevelopmentPlatformVersion()).build()).setOs(f2.e.AbstractC0732e.builder().setPlatform(3).setVersion(Build.VERSION.RELEASE).setBuildVersion(Build.VERSION.CODENAME).setJailbroken(j.isRooted()).build());
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        String str4 = Build.CPU_ABI;
        int iIntValue = 7;
        if (!TextUtils.isEmpty(str4)) {
            Integer num = (Integer) f58792f.get(str4.toLowerCase(Locale.US));
            if (num != null) {
                iIntValue = num.intValue();
            }
        }
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jCalculateTotalRamInBytes = j.calculateTotalRamInBytes(this.f58794a);
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        boolean zIsEmulator = j.isEmulator();
        int deviceState = j.getDeviceState();
        return platform.setSession(os2.setDevice(f2.e.c.builder().setArch(iIntValue).setModel(Build.MODEL).setCores(iAvailableProcessors).setRam(jCalculateTotalRamInBytes).setDiskSpace(blockCount).setSimulator(zIsEmulator).setState(deviceState).setManufacturer(Build.MANUFACTURER).setModelClass(Build.PRODUCT).build()).setGeneratorType(3).build()).build();
    }
}
