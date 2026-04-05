package n6;

import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import j$.time.Duration;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import uu.c2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: j, reason: collision with root package name */
    public static final f f75717j;

    /* renamed from: a, reason: collision with root package name */
    public final d0 f75718a;

    /* renamed from: b, reason: collision with root package name */
    public final w6.r f75719b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f75720c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f75721d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f75722e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f75723f;

    /* renamed from: g, reason: collision with root package name */
    public final long f75724g;

    /* renamed from: h, reason: collision with root package name */
    public final long f75725h;

    /* renamed from: i, reason: collision with root package name */
    public final Set f75726i;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f75727a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f75728b;

        /* renamed from: c, reason: collision with root package name */
        public w6.r f75729c;

        /* renamed from: d, reason: collision with root package name */
        public d0 f75730d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f75731e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f75732f;

        /* renamed from: g, reason: collision with root package name */
        public long f75733g;

        /* renamed from: h, reason: collision with root package name */
        public long f75734h;

        /* renamed from: i, reason: collision with root package name */
        public final Set f75735i;

        public a() {
            this.f75729c = new w6.r(null, 1, null);
            this.f75730d = d0.f75705b;
            this.f75733g = -1L;
            this.f75734h = -1L;
            this.f75735i = new LinkedHashSet();
        }

        public final a addContentUriTrigger(Uri uri, boolean z10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(uri, "uri");
            this.f75735i.add(new c(uri, z10));
            return this;
        }

        public final f build() {
            Set set = uu.y0.toSet(this.f75735i);
            return new f(this.f75729c, this.f75730d, this.f75727a, this.f75728b, this.f75731e, this.f75732f, this.f75733g, this.f75734h, set);
        }

        public final a setRequiredNetworkRequest(NetworkRequest networkRequest, d0 networkType) {
            kotlin.jvm.internal.e0.checkNotNullParameter(networkRequest, "networkRequest");
            kotlin.jvm.internal.e0.checkNotNullParameter(networkType, "networkType");
            int i10 = Build.VERSION.SDK_INT;
            if (i10 < 28) {
                this.f75730d = networkType;
                return this;
            }
            if (i10 >= 31 && w6.p.f90428a.getNetworkSpecifier(networkRequest) != null) {
                throw new IllegalArgumentException("NetworkRequests with NetworkSpecifiers set aren't supported.");
            }
            this.f75729c = new w6.r(networkRequest);
            this.f75730d = d0.f75705b;
            return this;
        }

        public final a setRequiredNetworkType(d0 networkType) {
            kotlin.jvm.internal.e0.checkNotNullParameter(networkType, "networkType");
            this.f75730d = networkType;
            this.f75729c = new w6.r(null, 1, null);
            return this;
        }

        public final a setRequiresBatteryNotLow(boolean z10) {
            this.f75731e = z10;
            return this;
        }

        public final a setRequiresCharging(boolean z10) {
            this.f75727a = z10;
            return this;
        }

        public final a setRequiresDeviceIdle(boolean z10) {
            this.f75728b = z10;
            return this;
        }

        public final a setRequiresStorageNotLow(boolean z10) {
            this.f75732f = z10;
            return this;
        }

        public final a setTriggerContentMaxDelay(long j10, TimeUnit timeUnit) {
            kotlin.jvm.internal.e0.checkNotNullParameter(timeUnit, "timeUnit");
            this.f75734h = timeUnit.toMillis(j10);
            return this;
        }

        public final a setTriggerContentUpdateDelay(long j10, TimeUnit timeUnit) {
            kotlin.jvm.internal.e0.checkNotNullParameter(timeUnit, "timeUnit");
            this.f75733g = timeUnit.toMillis(j10);
            return this;
        }

        public final a setTriggerContentMaxDelay(Duration duration) {
            kotlin.jvm.internal.e0.checkNotNullParameter(duration, "duration");
            this.f75734h = w6.e.toMillisCompat(duration);
            return this;
        }

        public final a setTriggerContentUpdateDelay(Duration duration) {
            kotlin.jvm.internal.e0.checkNotNullParameter(duration, "duration");
            this.f75733g = w6.e.toMillisCompat(duration);
            return this;
        }

        public a(f constraints) {
            kotlin.jvm.internal.e0.checkNotNullParameter(constraints, "constraints");
            this.f75729c = new w6.r(null, 1, null);
            this.f75730d = d0.f75705b;
            this.f75733g = -1L;
            this.f75734h = -1L;
            this.f75735i = new LinkedHashSet();
            this.f75727a = constraints.requiresCharging();
            this.f75728b = constraints.requiresDeviceIdle();
            this.f75730d = constraints.getRequiredNetworkType();
            this.f75731e = constraints.requiresBatteryNotLow();
            this.f75732f = constraints.requiresStorageNotLow();
            this.f75733g = constraints.getContentTriggerUpdateDelayMillis();
            this.f75734h = constraints.getContentTriggerMaxDelayMillis();
            this.f75735i = uu.y0.toMutableSet(constraints.getContentUriTriggers());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {
        public b(kotlin.jvm.internal.u uVar) {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f75736a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f75737b;

        public c(Uri uri, boolean z10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(uri, "uri");
            this.f75736a = uri;
            this.f75737b = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!kotlin.jvm.internal.e0.areEqual(c.class, obj != null ? obj.getClass() : null)) {
                return false;
            }
            kotlin.jvm.internal.e0.checkNotNull(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
            c cVar = (c) obj;
            return kotlin.jvm.internal.e0.areEqual(this.f75736a, cVar.f75736a) && this.f75737b == cVar.f75737b;
        }

        public final Uri getUri() {
            return this.f75736a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f75737b) + (this.f75736a.hashCode() * 31);
        }

        public final boolean isTriggeredForDescendants() {
            return this.f75737b;
        }
    }

    static {
        new b(null);
        f75717j = new f(null, false, false, false, 15, null);
    }

    public /* synthetic */ f(d0 d0Var, boolean z10, boolean z11, boolean z12, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? d0.f75705b : d0Var, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? false : z11, (i10 & 8) != 0 ? false : z12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !kotlin.jvm.internal.e0.areEqual(f.class, obj.getClass())) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f75720c == fVar.f75720c && this.f75721d == fVar.f75721d && this.f75722e == fVar.f75722e && this.f75723f == fVar.f75723f && this.f75724g == fVar.f75724g && this.f75725h == fVar.f75725h && kotlin.jvm.internal.e0.areEqual(getRequiredNetworkRequest(), fVar.getRequiredNetworkRequest()) && this.f75718a == fVar.f75718a) {
            return kotlin.jvm.internal.e0.areEqual(this.f75726i, fVar.f75726i);
        }
        return false;
    }

    public final long getContentTriggerMaxDelayMillis() {
        return this.f75725h;
    }

    public final long getContentTriggerUpdateDelayMillis() {
        return this.f75724g;
    }

    public final Set<c> getContentUriTriggers() {
        return this.f75726i;
    }

    public final NetworkRequest getRequiredNetworkRequest() {
        return this.f75719b.getNetworkRequest();
    }

    public final w6.r getRequiredNetworkRequestCompat$work_runtime_release() {
        return this.f75719b;
    }

    public final d0 getRequiredNetworkType() {
        return this.f75718a;
    }

    public final boolean hasContentUriTriggers() {
        return !this.f75726i.isEmpty();
    }

    public int hashCode() {
        int iHashCode = ((((((((this.f75718a.hashCode() * 31) + (this.f75720c ? 1 : 0)) * 31) + (this.f75721d ? 1 : 0)) * 31) + (this.f75722e ? 1 : 0)) * 31) + (this.f75723f ? 1 : 0)) * 31;
        long j10 = this.f75724g;
        int i10 = (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f75725h;
        int iHashCode2 = (this.f75726i.hashCode() + ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31)) * 31;
        NetworkRequest requiredNetworkRequest = getRequiredNetworkRequest();
        return iHashCode2 + (requiredNetworkRequest != null ? requiredNetworkRequest.hashCode() : 0);
    }

    public final boolean requiresBatteryNotLow() {
        return this.f75722e;
    }

    public final boolean requiresCharging() {
        return this.f75720c;
    }

    public final boolean requiresDeviceIdle() {
        return this.f75721d;
    }

    public final boolean requiresStorageNotLow() {
        return this.f75723f;
    }

    public String toString() {
        return "Constraints{requiredNetworkType=" + this.f75718a + ", requiresCharging=" + this.f75720c + ", requiresDeviceIdle=" + this.f75721d + ", requiresBatteryNotLow=" + this.f75722e + ", requiresStorageNotLow=" + this.f75723f + ", contentTriggerUpdateDelayMillis=" + this.f75724g + ", contentTriggerMaxDelayMillis=" + this.f75725h + ", contentUriTriggers=" + this.f75726i + ", }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(d0 requiredNetworkType, boolean z10, boolean z11, boolean z12) {
        this(requiredNetworkType, z10, false, z11, z12);
        kotlin.jvm.internal.e0.checkNotNullParameter(requiredNetworkType, "requiredNetworkType");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ f(n6.d0 r2, boolean r3, boolean r4, boolean r5, boolean r6, int r7, kotlin.jvm.internal.u r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            if (r8 == 0) goto L6
            n6.d0 r2 = n6.d0.f75705b
        L6:
            r8 = r7 & 2
            r0 = 0
            if (r8 == 0) goto Lc
            r3 = r0
        Lc:
            r8 = r7 & 4
            if (r8 == 0) goto L11
            r4 = r0
        L11:
            r8 = r7 & 8
            if (r8 == 0) goto L16
            r5 = r0
        L16:
            r7 = r7 & 16
            if (r7 == 0) goto L21
            r8 = r0
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L27
        L21:
            r8 = r6
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L27:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n6.f.<init>(n6.d0, boolean, boolean, boolean, boolean, int, kotlin.jvm.internal.u):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(d0 requiredNetworkType, boolean z10, boolean z11, boolean z12, boolean z13) {
        this(requiredNetworkType, z10, z11, z12, z13, -1L, 0L, null, PsExtractor.AUDIO_STREAM, null);
        kotlin.jvm.internal.e0.checkNotNullParameter(requiredNetworkType, "requiredNetworkType");
    }

    public /* synthetic */ f(d0 d0Var, boolean z10, boolean z11, boolean z12, boolean z13, long j10, long j11, Set set, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? d0.f75705b : d0Var, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? false : z11, (i10 & 8) != 0 ? false : z12, (i10 & 16) != 0 ? false : z13, (i10 & 32) != 0 ? -1L : j10, (i10 & 64) != 0 ? -1L : j11, (i10 & 128) != 0 ? c2.emptySet() : set);
    }

    public f(d0 requiredNetworkType, boolean z10, boolean z11, boolean z12, boolean z13, long j10, long j11, Set<c> contentUriTriggers) {
        kotlin.jvm.internal.e0.checkNotNullParameter(requiredNetworkType, "requiredNetworkType");
        kotlin.jvm.internal.e0.checkNotNullParameter(contentUriTriggers, "contentUriTriggers");
        this.f75719b = new w6.r(null, 1, null);
        this.f75718a = requiredNetworkType;
        this.f75720c = z10;
        this.f75721d = z11;
        this.f75722e = z12;
        this.f75723f = z13;
        this.f75724g = j10;
        this.f75725h = j11;
        this.f75726i = contentUriTriggers;
    }

    public /* synthetic */ f(w6.r rVar, d0 d0Var, boolean z10, boolean z11, boolean z12, boolean z13, long j10, long j11, Set set, int i10, kotlin.jvm.internal.u uVar) {
        this(rVar, (i10 & 2) != 0 ? d0.f75705b : d0Var, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? false : z11, (i10 & 16) != 0 ? false : z12, (i10 & 32) == 0 ? z13 : false, (i10 & 64) != 0 ? -1L : j10, (i10 & 128) == 0 ? j11 : -1L, (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? c2.emptySet() : set);
    }

    public f(w6.r requiredNetworkRequestCompat, d0 requiredNetworkType, boolean z10, boolean z11, boolean z12, boolean z13, long j10, long j11, Set<c> contentUriTriggers) {
        kotlin.jvm.internal.e0.checkNotNullParameter(requiredNetworkRequestCompat, "requiredNetworkRequestCompat");
        kotlin.jvm.internal.e0.checkNotNullParameter(requiredNetworkType, "requiredNetworkType");
        kotlin.jvm.internal.e0.checkNotNullParameter(contentUriTriggers, "contentUriTriggers");
        this.f75719b = requiredNetworkRequestCompat;
        this.f75718a = requiredNetworkType;
        this.f75720c = z10;
        this.f75721d = z11;
        this.f75722e = z12;
        this.f75723f = z13;
        this.f75724g = j10;
        this.f75725h = j11;
        this.f75726i = contentUriTriggers;
    }

    public f(f other) {
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        this.f75720c = other.f75720c;
        this.f75721d = other.f75721d;
        this.f75719b = other.f75719b;
        this.f75718a = other.f75718a;
        this.f75722e = other.f75722e;
        this.f75723f = other.f75723f;
        this.f75726i = other.f75726i;
        this.f75724g = other.f75724g;
        this.f75725h = other.f75725h;
    }
}
