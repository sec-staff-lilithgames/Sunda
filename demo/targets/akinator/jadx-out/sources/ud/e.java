package ud;

import android.app.job.JobInfo;
import com.inmobi.commons.core.configs.CrashConfig;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class e {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public xd.a f88418a;

        /* renamed from: b, reason: collision with root package name */
        public HashMap f88419b = new HashMap();

        public a addConfig(jd.h hVar, b bVar) {
            this.f88419b.put(hVar, bVar);
            return this;
        }

        public e build() {
            if (this.f88418a == null) {
                throw new NullPointerException("missing required property: clock");
            }
            if (this.f88419b.keySet().size() < jd.h.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            HashMap map = this.f88419b;
            this.f88419b = new HashMap();
            return new ud.a(this.f88418a, map);
        }

        public a setClock(xd.a aVar) {
            this.f88418a = aVar;
            return this;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class b {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static abstract class a {
            public abstract b build();

            public abstract a setDelta(long j10);

            public abstract a setFlags(Set<f> set);

            public abstract a setMaxAllowedDelay(long j10);
        }

        public static a builder() {
            return new ud.b().setFlags(Collections.EMPTY_SET);
        }

        public abstract long a();

        public abstract Set b();

        public abstract long c();
    }

    public static a builder() {
        return new a();
    }

    public static e getDefault(xd.a aVar) {
        return builder().addConfig(jd.h.f69502b, b.builder().setDelta(CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL).setMaxAllowedDelay(86400000L).build()).addConfig(jd.h.f69504e, b.builder().setDelta(1000L).setMaxAllowedDelay(86400000L).build()).addConfig(jd.h.f69503c, b.builder().setDelta(86400000L).setMaxAllowedDelay(86400000L).setFlags(Collections.unmodifiableSet(new HashSet(Arrays.asList(f.f88421c)))).build()).setClock(aVar).build();
    }

    public abstract xd.a a();

    public abstract Map b();

    public JobInfo.Builder configureJob(JobInfo.Builder builder, jd.h hVar, long j10, int i10) {
        builder.setMinimumLatency(getScheduleDelay(hVar, j10, i10));
        Set setB = ((b) b().get(hVar)).b();
        if (setB.contains(f.f88420b)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (setB.contains(f.f88422e)) {
            builder.setRequiresCharging(true);
        }
        if (setB.contains(f.f88421c)) {
            builder.setRequiresDeviceIdle(true);
        }
        return builder;
    }

    public Set<f> getFlags(jd.h hVar) {
        return ((b) b().get(hVar)).b();
    }

    public long getScheduleDelay(jd.h hVar, long j10, int i10) {
        long time = j10 - a().getTime();
        b bVar = (b) b().get(hVar);
        long jA = bVar.a();
        return Math.min(Math.max((long) (Math.pow(3.0d, i10 - 1) * jA * Math.max(1.0d, Math.log(10000.0d) / Math.log((jA > 1 ? jA : 2L) * r12))), time), bVar.c());
    }
}
