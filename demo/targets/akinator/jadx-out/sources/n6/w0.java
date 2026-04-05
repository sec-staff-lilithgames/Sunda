package n6;

import androidx.core.app.NotificationCompat;
import com.apm.insight.b.El.rJqlArycrfkilN;
import com.applovin.shadow.okio.Utf8;
import i2.hQ.aTNDubNmpwAqdU;
import java.util.Set;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final UUID f75791a;

    /* renamed from: b, reason: collision with root package name */
    public final x0 f75792b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f75793c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.work.b f75794d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.work.b f75795e;

    /* renamed from: f, reason: collision with root package name */
    public final int f75796f;

    /* renamed from: g, reason: collision with root package name */
    public final int f75797g;

    /* renamed from: h, reason: collision with root package name */
    public final f f75798h;

    /* renamed from: i, reason: collision with root package name */
    public final long f75799i;

    /* renamed from: j, reason: collision with root package name */
    public final b f75800j;

    /* renamed from: k, reason: collision with root package name */
    public final long f75801k;

    /* renamed from: l, reason: collision with root package name */
    public final int f75802l;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes.dex */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final long f75803a;

        /* renamed from: b, reason: collision with root package name */
        public final long f75804b;

        public b(long j10, long j11) {
            this.f75803a = j10;
            this.f75804b = j11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && kotlin.jvm.internal.e0.areEqual(b.class, obj.getClass())) {
                b bVar = (b) obj;
                if (bVar.f75803a == this.f75803a && bVar.f75804b == this.f75804b) {
                    return true;
                }
            }
            return false;
        }

        public final long getFlexIntervalMillis() {
            return this.f75804b;
        }

        public final long getRepeatIntervalMillis() {
            return this.f75803a;
        }

        public int hashCode() {
            return Long.hashCode(this.f75804b) + (Long.hashCode(this.f75803a) * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("PeriodicityInfo{repeatIntervalMillis=");
            sb2.append(this.f75803a);
            sb2.append(", flexIntervalMillis=");
            return e3.g.n(sb2, this.f75804b, AbstractJsonLexerKt.END_OBJ);
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w0(UUID id2, x0 state, Set<String> tags) {
        this(id2, state, tags, null, null, 0, 0, null, 0L, null, 0L, 0, 4088, null);
        kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
        kotlin.jvm.internal.e0.checkNotNullParameter(state, "state");
        kotlin.jvm.internal.e0.checkNotNullParameter(tags, "tags");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !kotlin.jvm.internal.e0.areEqual(w0.class, obj.getClass())) {
            return false;
        }
        w0 w0Var = (w0) obj;
        if (this.f75796f == w0Var.f75796f && this.f75797g == w0Var.f75797g && kotlin.jvm.internal.e0.areEqual(this.f75791a, w0Var.f75791a) && this.f75792b == w0Var.f75792b && kotlin.jvm.internal.e0.areEqual(this.f75794d, w0Var.f75794d) && kotlin.jvm.internal.e0.areEqual(this.f75798h, w0Var.f75798h) && this.f75799i == w0Var.f75799i && kotlin.jvm.internal.e0.areEqual(this.f75800j, w0Var.f75800j) && this.f75801k == w0Var.f75801k && this.f75802l == w0Var.f75802l && kotlin.jvm.internal.e0.areEqual(this.f75793c, w0Var.f75793c)) {
            return kotlin.jvm.internal.e0.areEqual(this.f75795e, w0Var.f75795e);
        }
        return false;
    }

    public final f getConstraints() {
        return this.f75798h;
    }

    public final int getGeneration() {
        return this.f75797g;
    }

    public final UUID getId() {
        return this.f75791a;
    }

    public final long getInitialDelayMillis() {
        return this.f75799i;
    }

    public final long getNextScheduleTimeMillis() {
        return this.f75801k;
    }

    public final androidx.work.b getOutputData() {
        return this.f75794d;
    }

    public final b getPeriodicityInfo() {
        return this.f75800j;
    }

    public final androidx.work.b getProgress() {
        return this.f75795e;
    }

    public final int getRunAttemptCount() {
        return this.f75796f;
    }

    public final x0 getState() {
        return this.f75792b;
    }

    public final int getStopReason() {
        return this.f75802l;
    }

    public final Set<String> getTags() {
        return this.f75793c;
    }

    public int hashCode() {
        int iD = o2.d((this.f75798h.hashCode() + ((((((this.f75795e.hashCode() + ((this.f75793c.hashCode() + ((this.f75794d.hashCode() + ((this.f75792b.hashCode() + (this.f75791a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.f75796f) * 31) + this.f75797g) * 31)) * 31, 31, this.f75799i);
        b bVar = this.f75800j;
        return Integer.hashCode(this.f75802l) + o2.d((iD + (bVar != null ? bVar.hashCode() : 0)) * 31, 31, this.f75801k);
    }

    public String toString() {
        return "WorkInfo{id='" + this.f75791a + "', state=" + this.f75792b + ", outputData=" + this.f75794d + ", tags=" + this.f75793c + ", progress=" + this.f75795e + ", runAttemptCount=" + this.f75796f + ", generation=" + this.f75797g + ", constraints=" + this.f75798h + ", initialDelayMillis=" + this.f75799i + ", periodicityInfo=" + this.f75800j + ", nextScheduleTimeMillis=" + this.f75801k + "}, stopReason=" + this.f75802l;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w0(UUID id2, x0 state, Set<String> tags, androidx.work.b outputData) {
        this(id2, state, tags, outputData, null, 0, 0, null, 0L, null, 0L, 0, 4080, null);
        kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
        kotlin.jvm.internal.e0.checkNotNullParameter(state, "state");
        kotlin.jvm.internal.e0.checkNotNullParameter(tags, "tags");
        kotlin.jvm.internal.e0.checkNotNullParameter(outputData, "outputData");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w0(UUID id2, x0 x0Var, Set<String> tags, androidx.work.b outputData, androidx.work.b progress) {
        this(id2, x0Var, tags, outputData, progress, 0, 0, null, 0L, null, 0L, 0, 4064, null);
        kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
        kotlin.jvm.internal.e0.checkNotNullParameter(x0Var, rJqlArycrfkilN.AwOgCgrOGMGkuV);
        kotlin.jvm.internal.e0.checkNotNullParameter(tags, "tags");
        kotlin.jvm.internal.e0.checkNotNullParameter(outputData, "outputData");
        kotlin.jvm.internal.e0.checkNotNullParameter(progress, "progress");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w0(UUID id2, x0 state, Set<String> tags, androidx.work.b outputData, androidx.work.b progress, int i10) {
        this(id2, state, tags, outputData, progress, i10, 0, null, 0L, null, 0L, 0, 4032, null);
        kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
        kotlin.jvm.internal.e0.checkNotNullParameter(state, "state");
        kotlin.jvm.internal.e0.checkNotNullParameter(tags, "tags");
        kotlin.jvm.internal.e0.checkNotNullParameter(outputData, "outputData");
        kotlin.jvm.internal.e0.checkNotNullParameter(progress, "progress");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w0(UUID uuid, x0 state, Set<String> tags, androidx.work.b outputData, androidx.work.b progress, int i10, int i11) {
        this(uuid, state, tags, outputData, progress, i10, i11, null, 0L, null, 0L, 0, Utf8.MASK_2BYTES, null);
        kotlin.jvm.internal.e0.checkNotNullParameter(uuid, aTNDubNmpwAqdU.OYbnynZXRxH);
        kotlin.jvm.internal.e0.checkNotNullParameter(state, "state");
        kotlin.jvm.internal.e0.checkNotNullParameter(tags, "tags");
        kotlin.jvm.internal.e0.checkNotNullParameter(outputData, "outputData");
        kotlin.jvm.internal.e0.checkNotNullParameter(progress, "progress");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w0(UUID id2, x0 state, Set<String> tags, androidx.work.b outputData, androidx.work.b progress, int i10, int i11, f constraints) {
        this(id2, state, tags, outputData, progress, i10, i11, constraints, 0L, null, 0L, 0, 3840, null);
        kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
        kotlin.jvm.internal.e0.checkNotNullParameter(state, "state");
        kotlin.jvm.internal.e0.checkNotNullParameter(tags, "tags");
        kotlin.jvm.internal.e0.checkNotNullParameter(outputData, "outputData");
        kotlin.jvm.internal.e0.checkNotNullParameter(progress, "progress");
        kotlin.jvm.internal.e0.checkNotNullParameter(constraints, "constraints");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w0(UUID id2, x0 state, Set<String> tags, androidx.work.b outputData, androidx.work.b progress, int i10, int i11, f constraints, long j10) {
        this(id2, state, tags, outputData, progress, i10, i11, constraints, j10, null, 0L, 0, 3584, null);
        kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
        kotlin.jvm.internal.e0.checkNotNullParameter(state, "state");
        kotlin.jvm.internal.e0.checkNotNullParameter(tags, "tags");
        kotlin.jvm.internal.e0.checkNotNullParameter(outputData, "outputData");
        kotlin.jvm.internal.e0.checkNotNullParameter(progress, "progress");
        kotlin.jvm.internal.e0.checkNotNullParameter(constraints, "constraints");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w0(UUID id2, x0 state, Set<String> tags, androidx.work.b outputData, androidx.work.b progress, int i10, int i11, f constraints, long j10, b bVar) {
        this(id2, state, tags, outputData, progress, i10, i11, constraints, j10, bVar, 0L, 0, 3072, null);
        kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
        kotlin.jvm.internal.e0.checkNotNullParameter(state, "state");
        kotlin.jvm.internal.e0.checkNotNullParameter(tags, "tags");
        kotlin.jvm.internal.e0.checkNotNullParameter(outputData, "outputData");
        kotlin.jvm.internal.e0.checkNotNullParameter(progress, "progress");
        kotlin.jvm.internal.e0.checkNotNullParameter(constraints, "constraints");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w0(UUID id2, x0 state, Set<String> tags, androidx.work.b outputData, androidx.work.b progress, int i10, int i11, f constraints, long j10, b bVar, long j11) {
        this(id2, state, tags, outputData, progress, i10, i11, constraints, j10, bVar, j11, 0, 2048, null);
        kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
        kotlin.jvm.internal.e0.checkNotNullParameter(state, "state");
        kotlin.jvm.internal.e0.checkNotNullParameter(tags, "tags");
        kotlin.jvm.internal.e0.checkNotNullParameter(outputData, "outputData");
        kotlin.jvm.internal.e0.checkNotNullParameter(progress, "progress");
        kotlin.jvm.internal.e0.checkNotNullParameter(constraints, "constraints");
    }

    public w0(UUID id2, x0 state, Set<String> tags, androidx.work.b outputData, androidx.work.b progress, int i10, int i11, f constraints, long j10, b bVar, long j11, int i12) {
        kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
        kotlin.jvm.internal.e0.checkNotNullParameter(state, "state");
        kotlin.jvm.internal.e0.checkNotNullParameter(tags, "tags");
        kotlin.jvm.internal.e0.checkNotNullParameter(outputData, "outputData");
        kotlin.jvm.internal.e0.checkNotNullParameter(progress, "progress");
        kotlin.jvm.internal.e0.checkNotNullParameter(constraints, "constraints");
        this.f75791a = id2;
        this.f75792b = state;
        this.f75793c = tags;
        this.f75794d = outputData;
        this.f75795e = progress;
        this.f75796f = i10;
        this.f75797g = i11;
        this.f75798h = constraints;
        this.f75799i = j10;
        this.f75800j = bVar;
        this.f75801k = j11;
        this.f75802l = i12;
    }

    public /* synthetic */ w0(UUID uuid, x0 x0Var, Set set, androidx.work.b bVar, androidx.work.b bVar2, int i10, int i11, f fVar, long j10, b bVar3, long j11, int i12, int i13, kotlin.jvm.internal.u uVar) {
        this(uuid, x0Var, set, (i13 & 8) != 0 ? androidx.work.b.f7481c : bVar, (i13 & 16) != 0 ? androidx.work.b.f7481c : bVar2, (i13 & 32) != 0 ? 0 : i10, (i13 & 64) != 0 ? 0 : i11, (i13 & 128) != 0 ? f.f75717j : fVar, (i13 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? 0L : j10, (i13 & 512) != 0 ? null : bVar3, (i13 & 1024) != 0 ? Long.MAX_VALUE : j11, (i13 & 2048) != 0 ? -256 : i12);
    }
}
