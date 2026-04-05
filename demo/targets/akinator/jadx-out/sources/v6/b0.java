package v6;

import androidx.core.app.NotificationCompat;
import androidx.work.OverwritingInputMerger;
import com.amazon.device.ads.DtbConstants;
import com.applovin.shadow.okio.Segment;
import com.inmobi.commons.core.configs.CrashConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import n6.x0;
import p0.o2;
import zb.VW.VPCjETNfjxu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class b0 {
    public static final String A;
    public static final sn.t B;

    /* renamed from: z, reason: collision with root package name */
    public static final a f89052z = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f89053a;

    /* renamed from: b, reason: collision with root package name */
    public x0 f89054b;

    /* renamed from: c, reason: collision with root package name */
    public final String f89055c;

    /* renamed from: d, reason: collision with root package name */
    public String f89056d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.work.b f89057e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.work.b f89058f;

    /* renamed from: g, reason: collision with root package name */
    public long f89059g;

    /* renamed from: h, reason: collision with root package name */
    public long f89060h;

    /* renamed from: i, reason: collision with root package name */
    public long f89061i;

    /* renamed from: j, reason: collision with root package name */
    public n6.f f89062j;

    /* renamed from: k, reason: collision with root package name */
    public int f89063k;

    /* renamed from: l, reason: collision with root package name */
    public n6.a f89064l;

    /* renamed from: m, reason: collision with root package name */
    public long f89065m;

    /* renamed from: n, reason: collision with root package name */
    public long f89066n;

    /* renamed from: o, reason: collision with root package name */
    public long f89067o;

    /* renamed from: p, reason: collision with root package name */
    public long f89068p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f89069q;

    /* renamed from: r, reason: collision with root package name */
    public n6.o0 f89070r;

    /* renamed from: s, reason: collision with root package name */
    public int f89071s;

    /* renamed from: t, reason: collision with root package name */
    public final int f89072t;

    /* renamed from: u, reason: collision with root package name */
    public long f89073u;

    /* renamed from: v, reason: collision with root package name */
    public int f89074v;

    /* renamed from: w, reason: collision with root package name */
    public final int f89075w;

    /* renamed from: x, reason: collision with root package name */
    public String f89076x;

    /* renamed from: y, reason: collision with root package name */
    public Boolean f89077y;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes.dex */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final long calculateNextRunTime(boolean z10, int i10, n6.a backoffPolicy, long j10, long j11, int i11, boolean z11, long j12, long j13, long j14, long j15) {
            kotlin.jvm.internal.e0.checkNotNullParameter(backoffPolicy, "backoffPolicy");
            if (j15 != Long.MAX_VALUE && z11) {
                return i11 == 0 ? j15 : qv.v.coerceAtLeast(j15, DtbConstants.MINIMUM_CONFIG_CHECK_IN_TTL_IN_MILLISECONDS + j11);
            }
            if (z10) {
                return qv.v.coerceAtMost(backoffPolicy == n6.a.f75681c ? j10 * i10 : (long) Math.scalb(j10, i10 - 1), 18000000L) + j11;
            }
            if (z11) {
                long j16 = i11 == 0 ? j11 + j12 : j11 + j14;
                return (j13 == j14 || i11 != 0) ? j16 : (j14 - j13) + j16;
            }
            if (j11 == -1) {
                return Long.MAX_VALUE;
            }
            return j11 + j12;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f89078a;

        /* renamed from: b, reason: collision with root package name */
        public final x0 f89079b;

        public b(String id2, x0 state) {
            kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
            kotlin.jvm.internal.e0.checkNotNullParameter(state, "state");
            this.f89078a = id2;
            this.f89079b = state;
        }

        public static /* synthetic */ b copy$default(b bVar, String str, x0 x0Var, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = bVar.f89078a;
            }
            if ((i10 & 2) != 0) {
                x0Var = bVar.f89079b;
            }
            return bVar.copy(str, x0Var);
        }

        public final String component1() {
            return this.f89078a;
        }

        public final x0 component2() {
            return this.f89079b;
        }

        public final b copy(String id2, x0 state) {
            kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
            kotlin.jvm.internal.e0.checkNotNullParameter(state, "state");
            return new b(id2, state);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.e0.areEqual(this.f89078a, bVar.f89078a) && this.f89079b == bVar.f89079b;
        }

        public int hashCode() {
            return this.f89079b.hashCode() + (this.f89078a.hashCode() * 31);
        }

        public String toString() {
            return "IdAndState(id=" + this.f89078a + ", state=" + this.f89079b + ')';
        }
    }

    static {
        String strTagWithPrefix = n6.c0.tagWithPrefix("WorkSpec");
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strTagWithPrefix, "tagWithPrefix(...)");
        A = strTagWithPrefix;
        B = new sn.t(7);
    }

    public b0(String id2, x0 state, String workerClassName, String inputMergerClassName, androidx.work.b bVar, androidx.work.b output, long j10, long j11, long j12, n6.f constraints, int i10, n6.a backoffPolicy, long j13, long j14, long j15, long j16, boolean z10, n6.o0 outOfQuotaPolicy, int i11, int i12, long j17, int i13, int i14, String str, Boolean bool) {
        kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
        kotlin.jvm.internal.e0.checkNotNullParameter(state, "state");
        kotlin.jvm.internal.e0.checkNotNullParameter(workerClassName, "workerClassName");
        kotlin.jvm.internal.e0.checkNotNullParameter(inputMergerClassName, "inputMergerClassName");
        kotlin.jvm.internal.e0.checkNotNullParameter(bVar, VPCjETNfjxu.BhXkpgAWMvyQU);
        kotlin.jvm.internal.e0.checkNotNullParameter(output, "output");
        kotlin.jvm.internal.e0.checkNotNullParameter(constraints, "constraints");
        kotlin.jvm.internal.e0.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        kotlin.jvm.internal.e0.checkNotNullParameter(outOfQuotaPolicy, "outOfQuotaPolicy");
        this.f89053a = id2;
        this.f89054b = state;
        this.f89055c = workerClassName;
        this.f89056d = inputMergerClassName;
        this.f89057e = bVar;
        this.f89058f = output;
        this.f89059g = j10;
        this.f89060h = j11;
        this.f89061i = j12;
        this.f89062j = constraints;
        this.f89063k = i10;
        this.f89064l = backoffPolicy;
        this.f89065m = j13;
        this.f89066n = j14;
        this.f89067o = j15;
        this.f89068p = j16;
        this.f89069q = z10;
        this.f89070r = outOfQuotaPolicy;
        this.f89071s = i11;
        this.f89072t = i12;
        this.f89073u = j17;
        this.f89074v = i13;
        this.f89075w = i14;
        this.f89076x = str;
        this.f89077y = bool;
    }

    public static /* synthetic */ b0 copy$default(b0 b0Var, String str, x0 x0Var, String str2, String str3, androidx.work.b bVar, androidx.work.b bVar2, long j10, long j11, long j12, n6.f fVar, int i10, n6.a aVar, long j13, long j14, long j15, long j16, boolean z10, n6.o0 o0Var, int i11, int i12, long j17, int i13, int i14, String str4, Boolean bool, int i15, Object obj) {
        Boolean bool2;
        String str5;
        long j18;
        long j19;
        long j20;
        long j21;
        n6.o0 o0Var2;
        int i16;
        int i17;
        long j22;
        int i18;
        x0 x0Var2;
        int i19;
        boolean z11;
        String str6;
        String str7;
        androidx.work.b bVar3;
        androidx.work.b bVar4;
        long j23;
        long j24;
        long j25;
        n6.f fVar2;
        int i20;
        n6.a aVar2;
        String str8 = (i15 & 1) != 0 ? b0Var.f89053a : str;
        x0 x0Var3 = (i15 & 2) != 0 ? b0Var.f89054b : x0Var;
        String str9 = (i15 & 4) != 0 ? b0Var.f89055c : str2;
        String str10 = (i15 & 8) != 0 ? b0Var.f89056d : str3;
        androidx.work.b bVar5 = (i15 & 16) != 0 ? b0Var.f89057e : bVar;
        androidx.work.b bVar6 = (i15 & 32) != 0 ? b0Var.f89058f : bVar2;
        long j26 = (i15 & 64) != 0 ? b0Var.f89059g : j10;
        long j27 = (i15 & 128) != 0 ? b0Var.f89060h : j11;
        long j28 = (i15 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? b0Var.f89061i : j12;
        n6.f fVar3 = (i15 & 512) != 0 ? b0Var.f89062j : fVar;
        int i21 = (i15 & 1024) != 0 ? b0Var.f89063k : i10;
        String str11 = str8;
        n6.a aVar3 = (i15 & 2048) != 0 ? b0Var.f89064l : aVar;
        x0 x0Var4 = x0Var3;
        long j29 = (i15 & 4096) != 0 ? b0Var.f89065m : j13;
        long j30 = (i15 & Segment.SIZE) != 0 ? b0Var.f89066n : j14;
        long j31 = (i15 & 16384) != 0 ? b0Var.f89067o : j15;
        long j32 = (i15 & 32768) != 0 ? b0Var.f89068p : j16;
        boolean z12 = (i15 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? b0Var.f89069q : z10;
        long j33 = j32;
        n6.o0 o0Var3 = (i15 & 131072) != 0 ? b0Var.f89070r : o0Var;
        int i22 = (i15 & 262144) != 0 ? b0Var.f89071s : i11;
        n6.o0 o0Var4 = o0Var3;
        int i23 = (i15 & 524288) != 0 ? b0Var.f89072t : i12;
        int i24 = i22;
        long j34 = (i15 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? b0Var.f89073u : j17;
        int i25 = (i15 & 2097152) != 0 ? b0Var.f89074v : i13;
        int i26 = (i15 & 4194304) != 0 ? b0Var.f89075w : i14;
        int i27 = i25;
        String str12 = (i15 & 8388608) != 0 ? b0Var.f89076x : str4;
        if ((i15 & 16777216) != 0) {
            str5 = str12;
            bool2 = b0Var.f89077y;
            j19 = j30;
            j20 = j31;
            j21 = j33;
            o0Var2 = o0Var4;
            i16 = i24;
            i17 = i23;
            j22 = j34;
            i18 = i27;
            i19 = i26;
            z11 = z12;
            str7 = str10;
            bVar3 = bVar5;
            bVar4 = bVar6;
            j23 = j26;
            j24 = j27;
            j25 = j28;
            fVar2 = fVar3;
            i20 = i21;
            aVar2 = aVar3;
            j18 = j29;
            x0Var2 = x0Var4;
            str6 = str9;
        } else {
            bool2 = bool;
            str5 = str12;
            j18 = j29;
            j19 = j30;
            j20 = j31;
            j21 = j33;
            o0Var2 = o0Var4;
            i16 = i24;
            i17 = i23;
            j22 = j34;
            i18 = i27;
            x0Var2 = x0Var4;
            i19 = i26;
            z11 = z12;
            str6 = str9;
            str7 = str10;
            bVar3 = bVar5;
            bVar4 = bVar6;
            j23 = j26;
            j24 = j27;
            j25 = j28;
            fVar2 = fVar3;
            i20 = i21;
            aVar2 = aVar3;
        }
        return b0Var.copy(str11, x0Var2, str6, str7, bVar3, bVar4, j23, j24, j25, fVar2, i20, aVar2, j18, j19, j20, j21, z11, o0Var2, i16, i17, j22, i18, i19, str5, bool2);
    }

    public final long calculateNextRunTime() {
        return f89052z.calculateNextRunTime(isBackedOff(), this.f89063k, this.f89064l, this.f89065m, this.f89066n, this.f89071s, isPeriodic(), this.f89059g, this.f89061i, this.f89060h, this.f89073u);
    }

    public final String component1() {
        return this.f89053a;
    }

    public final n6.f component10() {
        return this.f89062j;
    }

    public final int component11() {
        return this.f89063k;
    }

    public final n6.a component12() {
        return this.f89064l;
    }

    public final long component13() {
        return this.f89065m;
    }

    public final long component14() {
        return this.f89066n;
    }

    public final long component15() {
        return this.f89067o;
    }

    public final long component16() {
        return this.f89068p;
    }

    public final boolean component17() {
        return this.f89069q;
    }

    public final n6.o0 component18() {
        return this.f89070r;
    }

    public final int component19() {
        return this.f89071s;
    }

    public final x0 component2() {
        return this.f89054b;
    }

    public final int component20() {
        return this.f89072t;
    }

    public final long component21() {
        return this.f89073u;
    }

    public final int component22() {
        return this.f89074v;
    }

    public final int component23() {
        return this.f89075w;
    }

    public final String component24() {
        return this.f89076x;
    }

    public final Boolean component25() {
        return this.f89077y;
    }

    public final String component3() {
        return this.f89055c;
    }

    public final String component4() {
        return this.f89056d;
    }

    public final androidx.work.b component5() {
        return this.f89057e;
    }

    public final androidx.work.b component6() {
        return this.f89058f;
    }

    public final long component7() {
        return this.f89059g;
    }

    public final long component8() {
        return this.f89060h;
    }

    public final long component9() {
        return this.f89061i;
    }

    public final b0 copy(String id2, x0 state, String workerClassName, String inputMergerClassName, androidx.work.b input, androidx.work.b output, long j10, long j11, long j12, n6.f constraints, int i10, n6.a backoffPolicy, long j13, long j14, long j15, long j16, boolean z10, n6.o0 outOfQuotaPolicy, int i11, int i12, long j17, int i13, int i14, String str, Boolean bool) {
        kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
        kotlin.jvm.internal.e0.checkNotNullParameter(state, "state");
        kotlin.jvm.internal.e0.checkNotNullParameter(workerClassName, "workerClassName");
        kotlin.jvm.internal.e0.checkNotNullParameter(inputMergerClassName, "inputMergerClassName");
        kotlin.jvm.internal.e0.checkNotNullParameter(input, "input");
        kotlin.jvm.internal.e0.checkNotNullParameter(output, "output");
        kotlin.jvm.internal.e0.checkNotNullParameter(constraints, "constraints");
        kotlin.jvm.internal.e0.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        kotlin.jvm.internal.e0.checkNotNullParameter(outOfQuotaPolicy, "outOfQuotaPolicy");
        return new b0(id2, state, workerClassName, inputMergerClassName, input, output, j10, j11, j12, constraints, i10, backoffPolicy, j13, j14, j15, j16, z10, outOfQuotaPolicy, i11, i12, j17, i13, i14, str, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f89053a, b0Var.f89053a) && this.f89054b == b0Var.f89054b && kotlin.jvm.internal.e0.areEqual(this.f89055c, b0Var.f89055c) && kotlin.jvm.internal.e0.areEqual(this.f89056d, b0Var.f89056d) && kotlin.jvm.internal.e0.areEqual(this.f89057e, b0Var.f89057e) && kotlin.jvm.internal.e0.areEqual(this.f89058f, b0Var.f89058f) && this.f89059g == b0Var.f89059g && this.f89060h == b0Var.f89060h && this.f89061i == b0Var.f89061i && kotlin.jvm.internal.e0.areEqual(this.f89062j, b0Var.f89062j) && this.f89063k == b0Var.f89063k && this.f89064l == b0Var.f89064l && this.f89065m == b0Var.f89065m && this.f89066n == b0Var.f89066n && this.f89067o == b0Var.f89067o && this.f89068p == b0Var.f89068p && this.f89069q == b0Var.f89069q && this.f89070r == b0Var.f89070r && this.f89071s == b0Var.f89071s && this.f89072t == b0Var.f89072t && this.f89073u == b0Var.f89073u && this.f89074v == b0Var.f89074v && this.f89075w == b0Var.f89075w && kotlin.jvm.internal.e0.areEqual(this.f89076x, b0Var.f89076x) && kotlin.jvm.internal.e0.areEqual(this.f89077y, b0Var.f89077y);
    }

    public final Boolean getBackOffOnSystemInterruptions() {
        return this.f89077y;
    }

    public final int getGeneration() {
        return this.f89072t;
    }

    public final long getNextScheduleTimeOverride() {
        return this.f89073u;
    }

    public final int getNextScheduleTimeOverrideGeneration() {
        return this.f89074v;
    }

    public final int getPeriodCount() {
        return this.f89071s;
    }

    public final int getStopReason() {
        return this.f89075w;
    }

    public final String getTraceTag() {
        return this.f89076x;
    }

    public final boolean hasConstraints() {
        return !kotlin.jvm.internal.e0.areEqual(n6.f.f75717j, this.f89062j);
    }

    public int hashCode() {
        int iD = e3.g.d(this.f89075w, e3.g.d(this.f89074v, o2.d(e3.g.d(this.f89072t, e3.g.d(this.f89071s, (this.f89070r.hashCode() + com.google.android.gms.internal.play_billing.a.c(o2.d(o2.d(o2.d(o2.d((this.f89064l.hashCode() + e3.g.d(this.f89063k, (this.f89062j.hashCode() + o2.d(o2.d(o2.d((this.f89058f.hashCode() + ((this.f89057e.hashCode() + o2.e(o2.e((this.f89054b.hashCode() + (this.f89053a.hashCode() * 31)) * 31, 31, this.f89055c), 31, this.f89056d)) * 31)) * 31, 31, this.f89059g), 31, this.f89060h), 31, this.f89061i)) * 31, 31)) * 31, 31, this.f89065m), 31, this.f89066n), 31, this.f89067o), 31, this.f89068p), 31, this.f89069q)) * 31, 31), 31), 31, this.f89073u), 31), 31);
        String str = this.f89076x;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f89077y;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final boolean isBackedOff() {
        return this.f89054b == x0.f75806b && this.f89063k > 0;
    }

    public final boolean isPeriodic() {
        return this.f89060h != 0;
    }

    public final void setBackOffOnSystemInterruptions(Boolean bool) {
        this.f89077y = bool;
    }

    public final void setBackoffDelayDuration(long j10) {
        String str = A;
        if (j10 > 18000000) {
            n6.c0.get().warning(str, "Backoff delay duration exceeds maximum value");
        }
        if (j10 < 10000) {
            n6.c0.get().warning(str, "Backoff delay duration less than minimum value");
        }
        this.f89065m = qv.v.coerceIn(j10, 10000L, 18000000L);
    }

    public final void setNextScheduleTimeOverride(long j10) {
        this.f89073u = j10;
    }

    public final void setNextScheduleTimeOverrideGeneration(int i10) {
        this.f89074v = i10;
    }

    public final void setPeriodCount(int i10) {
        this.f89071s = i10;
    }

    public final void setPeriodic(long j10) {
        if (j10 < DtbConstants.MINIMUM_CONFIG_CHECK_IN_TTL_IN_MILLISECONDS) {
            n6.c0.get().warning(A, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        setPeriodic(qv.v.coerceAtLeast(j10, DtbConstants.MINIMUM_CONFIG_CHECK_IN_TTL_IN_MILLISECONDS), qv.v.coerceAtLeast(j10, DtbConstants.MINIMUM_CONFIG_CHECK_IN_TTL_IN_MILLISECONDS));
    }

    public final void setTraceTag(String str) {
        this.f89076x = str;
    }

    public String toString() {
        return o2.q(new StringBuilder("{WorkSpec: "), this.f89053a, AbstractJsonLexerKt.END_OBJ);
    }

    public final void setPeriodic(long j10, long j11) {
        String str = A;
        if (j10 < DtbConstants.MINIMUM_CONFIG_CHECK_IN_TTL_IN_MILLISECONDS) {
            n6.c0.get().warning(str, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        this.f89060h = qv.v.coerceAtLeast(j10, DtbConstants.MINIMUM_CONFIG_CHECK_IN_TTL_IN_MILLISECONDS);
        if (j11 < 300000) {
            n6.c0.get().warning(str, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (j11 > this.f89060h) {
            n6.c0.get().warning(str, "Flex duration greater than interval duration; Changed to " + j10);
        }
        this.f89061i = qv.v.coerceIn(j11, 300000L, this.f89060h);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f89080a;

        /* renamed from: b, reason: collision with root package name */
        public final x0 f89081b;

        /* renamed from: c, reason: collision with root package name */
        public final androidx.work.b f89082c;

        /* renamed from: d, reason: collision with root package name */
        public final long f89083d;

        /* renamed from: e, reason: collision with root package name */
        public final long f89084e;

        /* renamed from: f, reason: collision with root package name */
        public final long f89085f;

        /* renamed from: g, reason: collision with root package name */
        public final n6.f f89086g;

        /* renamed from: h, reason: collision with root package name */
        public final int f89087h;

        /* renamed from: i, reason: collision with root package name */
        public n6.a f89088i;

        /* renamed from: j, reason: collision with root package name */
        public long f89089j;

        /* renamed from: k, reason: collision with root package name */
        public long f89090k;

        /* renamed from: l, reason: collision with root package name */
        public int f89091l;

        /* renamed from: m, reason: collision with root package name */
        public final int f89092m;

        /* renamed from: n, reason: collision with root package name */
        public final long f89093n;

        /* renamed from: o, reason: collision with root package name */
        public final int f89094o;

        /* renamed from: p, reason: collision with root package name */
        public final List f89095p;

        /* renamed from: q, reason: collision with root package name */
        public final List f89096q;

        public c(String id2, x0 state, androidx.work.b output, long j10, long j11, long j12, n6.f constraints, int i10, n6.a backoffPolicy, long j13, long j14, int i11, int i12, long j15, int i13, List<String> tags, List<androidx.work.b> progress) {
            kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
            kotlin.jvm.internal.e0.checkNotNullParameter(state, "state");
            kotlin.jvm.internal.e0.checkNotNullParameter(output, "output");
            kotlin.jvm.internal.e0.checkNotNullParameter(constraints, "constraints");
            kotlin.jvm.internal.e0.checkNotNullParameter(backoffPolicy, "backoffPolicy");
            kotlin.jvm.internal.e0.checkNotNullParameter(tags, "tags");
            kotlin.jvm.internal.e0.checkNotNullParameter(progress, "progress");
            this.f89080a = id2;
            this.f89081b = state;
            this.f89082c = output;
            this.f89083d = j10;
            this.f89084e = j11;
            this.f89085f = j12;
            this.f89086g = constraints;
            this.f89087h = i10;
            this.f89088i = backoffPolicy;
            this.f89089j = j13;
            this.f89090k = j14;
            this.f89091l = i11;
            this.f89092m = i12;
            this.f89093n = j15;
            this.f89094o = i13;
            this.f89095p = tags;
            this.f89096q = progress;
        }

        public static /* synthetic */ c copy$default(c cVar, String str, x0 x0Var, androidx.work.b bVar, long j10, long j11, long j12, n6.f fVar, int i10, n6.a aVar, long j13, long j14, int i11, int i12, long j15, int i13, List list, List list2, int i14, Object obj) {
            String str2 = (i14 & 1) != 0 ? cVar.f89080a : str;
            x0 x0Var2 = (i14 & 2) != 0 ? cVar.f89081b : x0Var;
            return cVar.copy(str2, x0Var2, (i14 & 4) != 0 ? cVar.f89082c : bVar, (i14 & 8) != 0 ? cVar.f89083d : j10, (i14 & 16) != 0 ? cVar.f89084e : j11, (i14 & 32) != 0 ? cVar.f89085f : j12, (i14 & 64) != 0 ? cVar.f89086g : fVar, (i14 & 128) != 0 ? cVar.f89087h : i10, (i14 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? cVar.f89088i : aVar, (i14 & 512) != 0 ? cVar.f89089j : j13, (i14 & 1024) != 0 ? cVar.f89090k : j14, (i14 & 2048) != 0 ? cVar.f89091l : i11, (i14 & 4096) != 0 ? cVar.f89092m : i12, (i14 & Segment.SIZE) != 0 ? cVar.f89093n : j15, (i14 & 16384) != 0 ? cVar.f89094o : i13, (32768 & i14) != 0 ? cVar.f89095p : list, (i14 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? cVar.f89096q : list2);
        }

        public final String component1() {
            return this.f89080a;
        }

        public final long component10() {
            return this.f89089j;
        }

        public final long component11() {
            return this.f89090k;
        }

        public final int component12() {
            return this.f89091l;
        }

        public final int component13() {
            return this.f89092m;
        }

        public final long component14() {
            return this.f89093n;
        }

        public final int component15() {
            return this.f89094o;
        }

        public final List<String> component16() {
            return this.f89095p;
        }

        public final List<androidx.work.b> component17() {
            return this.f89096q;
        }

        public final x0 component2() {
            return this.f89081b;
        }

        public final androidx.work.b component3() {
            return this.f89082c;
        }

        public final long component4() {
            return this.f89083d;
        }

        public final long component5() {
            return this.f89084e;
        }

        public final long component6() {
            return this.f89085f;
        }

        public final n6.f component7() {
            return this.f89086g;
        }

        public final int component8() {
            return this.f89087h;
        }

        public final n6.a component9() {
            return this.f89088i;
        }

        public final c copy(String id2, x0 state, androidx.work.b output, long j10, long j11, long j12, n6.f constraints, int i10, n6.a backoffPolicy, long j13, long j14, int i11, int i12, long j15, int i13, List<String> tags, List<androidx.work.b> progress) {
            kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
            kotlin.jvm.internal.e0.checkNotNullParameter(state, "state");
            kotlin.jvm.internal.e0.checkNotNullParameter(output, "output");
            kotlin.jvm.internal.e0.checkNotNullParameter(constraints, "constraints");
            kotlin.jvm.internal.e0.checkNotNullParameter(backoffPolicy, "backoffPolicy");
            kotlin.jvm.internal.e0.checkNotNullParameter(tags, "tags");
            kotlin.jvm.internal.e0.checkNotNullParameter(progress, "progress");
            return new c(id2, state, output, j10, j11, j12, constraints, i10, backoffPolicy, j13, j14, i11, i12, j15, i13, tags, progress);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.e0.areEqual(this.f89080a, cVar.f89080a) && this.f89081b == cVar.f89081b && kotlin.jvm.internal.e0.areEqual(this.f89082c, cVar.f89082c) && this.f89083d == cVar.f89083d && this.f89084e == cVar.f89084e && this.f89085f == cVar.f89085f && kotlin.jvm.internal.e0.areEqual(this.f89086g, cVar.f89086g) && this.f89087h == cVar.f89087h && this.f89088i == cVar.f89088i && this.f89089j == cVar.f89089j && this.f89090k == cVar.f89090k && this.f89091l == cVar.f89091l && this.f89092m == cVar.f89092m && this.f89093n == cVar.f89093n && this.f89094o == cVar.f89094o && kotlin.jvm.internal.e0.areEqual(this.f89095p, cVar.f89095p) && kotlin.jvm.internal.e0.areEqual(this.f89096q, cVar.f89096q);
        }

        public final long getBackoffDelayDuration() {
            return this.f89089j;
        }

        public final n6.a getBackoffPolicy() {
            return this.f89088i;
        }

        public final n6.f getConstraints() {
            return this.f89086g;
        }

        public final long getFlexDuration() {
            return this.f89085f;
        }

        public final int getGeneration() {
            return this.f89092m;
        }

        public final String getId() {
            return this.f89080a;
        }

        public final long getInitialDelay() {
            return this.f89083d;
        }

        public final long getIntervalDuration() {
            return this.f89084e;
        }

        public final long getLastEnqueueTime() {
            return this.f89090k;
        }

        public final long getNextScheduleTimeOverride() {
            return this.f89093n;
        }

        public final androidx.work.b getOutput() {
            return this.f89082c;
        }

        public final int getPeriodCount() {
            return this.f89091l;
        }

        public final List<androidx.work.b> getProgress() {
            return this.f89096q;
        }

        public final int getRunAttemptCount() {
            return this.f89087h;
        }

        public final x0 getState() {
            return this.f89081b;
        }

        public final int getStopReason() {
            return this.f89094o;
        }

        public final List<String> getTags() {
            return this.f89095p;
        }

        public int hashCode() {
            return this.f89096q.hashCode() + j1.o2.c(e3.g.d(this.f89094o, o2.d(e3.g.d(this.f89092m, e3.g.d(this.f89091l, o2.d(o2.d((this.f89088i.hashCode() + e3.g.d(this.f89087h, (this.f89086g.hashCode() + o2.d(o2.d(o2.d((this.f89082c.hashCode() + ((this.f89081b.hashCode() + (this.f89080a.hashCode() * 31)) * 31)) * 31, 31, this.f89083d), 31, this.f89084e), 31, this.f89085f)) * 31, 31)) * 31, 31, this.f89089j), 31, this.f89090k), 31), 31), 31, this.f89093n), 31), 31, this.f89095p);
        }

        public final boolean isBackedOff() {
            return this.f89081b == x0.f75806b && this.f89087h > 0;
        }

        public final boolean isPeriodic() {
            return this.f89084e != 0;
        }

        public final void setBackoffDelayDuration(long j10) {
            this.f89089j = j10;
        }

        public final void setBackoffPolicy(n6.a aVar) {
            kotlin.jvm.internal.e0.checkNotNullParameter(aVar, "<set-?>");
            this.f89088i = aVar;
        }

        public final void setLastEnqueueTime(long j10) {
            this.f89090k = j10;
        }

        public final void setPeriodCount(int i10) {
            this.f89091l = i10;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("WorkInfoPojo(id=");
            sb2.append(this.f89080a);
            sb2.append(", state=");
            sb2.append(this.f89081b);
            sb2.append(", output=");
            sb2.append(this.f89082c);
            sb2.append(", initialDelay=");
            sb2.append(this.f89083d);
            sb2.append(", intervalDuration=");
            sb2.append(this.f89084e);
            sb2.append(", flexDuration=");
            sb2.append(this.f89085f);
            sb2.append(", constraints=");
            sb2.append(this.f89086g);
            sb2.append(", runAttemptCount=");
            sb2.append(this.f89087h);
            sb2.append(", backoffPolicy=");
            sb2.append(this.f89088i);
            sb2.append(", backoffDelayDuration=");
            sb2.append(this.f89089j);
            sb2.append(", lastEnqueueTime=");
            sb2.append(this.f89090k);
            sb2.append(", periodCount=");
            sb2.append(this.f89091l);
            sb2.append(", generation=");
            sb2.append(this.f89092m);
            sb2.append(", nextScheduleTimeOverride=");
            sb2.append(this.f89093n);
            sb2.append(", stopReason=");
            sb2.append(this.f89094o);
            sb2.append(", tags=");
            sb2.append(this.f89095p);
            sb2.append(", progress=");
            return j1.o2.p(sb2, this.f89096q, ')');
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v3 n6.w0, still in use, count: 2, list:
              (r2v3 n6.w0) from 0x007d: MOVE (r6v0 n6.w0) = (r2v3 n6.w0) (LINE:126)
              (r2v3 n6.w0) from 0x005c: MOVE (r6v3 n6.w0) = (r2v3 n6.w0) (LINE:93)
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
            	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
            	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
            */
        public final n6.w0 toWorkInfo() {
            /*
                r32 = this;
                r0 = r32
                java.util.List r1 = r0.f89096q
                r2 = r1
                java.util.Collection r2 = (java.util.Collection) r2
                boolean r2 = r2.isEmpty()
                if (r2 != 0) goto L16
                r2 = 0
                java.lang.Object r1 = r1.get(r2)
                androidx.work.b r1 = (androidx.work.b) r1
            L14:
                r7 = r1
                goto L19
            L16:
                androidx.work.b r1 = androidx.work.b.f7481c
                goto L14
            L19:
                n6.w0 r2 = new n6.w0
                java.lang.String r1 = r0.f89080a
                java.util.UUID r3 = java.util.UUID.fromString(r1)
                java.lang.String r1 = "fromString(...)"
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(r3, r1)
                java.util.HashSet r5 = new java.util.HashSet
                java.util.List r1 = r0.f89095p
                java.util.Collection r1 = (java.util.Collection) r1
                r5.<init>(r1)
                r8 = 0
                long r10 = r0.f89084e
                int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
                if (r1 == 0) goto L40
                n6.w0$b r1 = new n6.w0$b
                long r8 = r0.f89085f
                r1.<init>(r10, r8)
            L3e:
                r13 = r1
                goto L42
            L40:
                r1 = 0
                goto L3e
            L42:
                n6.x0 r1 = r0.f89081b
                n6.x0 r4 = n6.x0.f75806b
                if (r1 != r4) goto L7d
                v6.b0$a r14 = v6.b0.f89052z
                boolean r15 = r0.isBackedOff()
                n6.a r1 = r0.f89088i
                long r8 = r0.f89089j
                long r10 = r0.f89090k
                int r4 = r0.f89091l
                boolean r23 = r0.isPeriodic()
                r17 = r1
                r6 = r2
                long r1 = r0.f89084e
                r28 = r1
                long r1 = r0.f89093n
                int r12 = r0.f89087h
                r30 = r1
                long r1 = r0.f89083d
                r24 = r1
                long r1 = r0.f89085f
                r26 = r1
                r22 = r4
                r18 = r8
                r20 = r10
                r16 = r12
                long r1 = r14.calculateNextRunTime(r15, r16, r17, r18, r20, r22, r23, r24, r26, r28, r30)
            L7b:
                r14 = r1
                goto L84
            L7d:
                r6 = r2
                r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                goto L7b
            L84:
                int r1 = r0.f89094o
                n6.x0 r4 = r0.f89081b
                r2 = r6
                androidx.work.b r6 = r0.f89082c
                int r8 = r0.f89087h
                int r9 = r0.f89092m
                n6.f r10 = r0.f89086g
                long r11 = r0.f89083d
                r16 = r1
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r14, r16)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: v6.b0.c.toWorkInfo():n6.w0");
        }

        public /* synthetic */ c(String str, x0 x0Var, androidx.work.b bVar, long j10, long j11, long j12, n6.f fVar, int i10, n6.a aVar, long j13, long j14, int i11, int i12, long j15, int i13, List list, List list2, int i14, kotlin.jvm.internal.u uVar) {
            this(str, x0Var, bVar, (i14 & 8) != 0 ? 0L : j10, (i14 & 16) != 0 ? 0L : j11, (i14 & 32) != 0 ? 0L : j12, fVar, i10, (i14 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? n6.a.f75680b : aVar, (i14 & 512) != 0 ? 30000L : j13, (i14 & 1024) != 0 ? 0L : j14, (i14 & 2048) != 0 ? 0 : i11, i12, j15, i13, list, list2);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ b0(String str, x0 x0Var, String str2, String str3, androidx.work.b bVar, androidx.work.b bVar2, long j10, long j11, long j12, n6.f fVar, int i10, n6.a aVar, long j13, long j14, long j15, long j16, boolean z10, n6.o0 o0Var, int i11, int i12, long j17, int i13, int i14, String str4, Boolean bool, int i15, kotlin.jvm.internal.u uVar) {
        String str5;
        x0 x0Var2 = (i15 & 2) != 0 ? x0.f75806b : x0Var;
        if ((i15 & 8) != 0) {
            String name = OverwritingInputMerger.class.getName();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(name, "getName(...)");
            str5 = name;
        } else {
            str5 = str3;
        }
        this(str, x0Var2, str2, str5, (i15 & 16) != 0 ? androidx.work.b.f7481c : bVar, (i15 & 32) != 0 ? androidx.work.b.f7481c : bVar2, (i15 & 64) != 0 ? 0L : j10, (i15 & 128) != 0 ? 0L : j11, (i15 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? 0L : j12, (i15 & 512) != 0 ? n6.f.f75717j : fVar, (i15 & 1024) != 0 ? 0 : i10, (i15 & 2048) != 0 ? n6.a.f75680b : aVar, (i15 & 4096) != 0 ? CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL : j13, (i15 & Segment.SIZE) != 0 ? -1L : j14, (i15 & 16384) == 0 ? j15 : 0L, (32768 & i15) != 0 ? -1L : j16, (65536 & i15) != 0 ? false : z10, (131072 & i15) != 0 ? n6.o0.f75776b : o0Var, (262144 & i15) != 0 ? 0 : i11, (524288 & i15) != 0 ? 0 : i12, (1048576 & i15) != 0 ? Long.MAX_VALUE : j17, (2097152 & i15) != 0 ? 0 : i13, (4194304 & i15) != 0 ? -256 : i14, (8388608 & i15) != 0 ? null : str4, (i15 & 16777216) != 0 ? Boolean.FALSE : bool);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b0(String id2, String workerClassName_) {
        this(id2, null, workerClassName_, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, null, 33554426, null);
        kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
        kotlin.jvm.internal.e0.checkNotNullParameter(workerClassName_, "workerClassName_");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b0(String newId, b0 other) {
        this(newId, other.f89054b, other.f89055c, other.f89056d, new androidx.work.b(other.f89057e), new androidx.work.b(other.f89058f), other.f89059g, other.f89060h, other.f89061i, new n6.f(other.f89062j), other.f89063k, other.f89064l, other.f89065m, other.f89066n, other.f89067o, other.f89068p, other.f89069q, other.f89070r, other.f89071s, 0, other.f89073u, other.f89074v, other.f89075w, other.f89076x, other.f89077y, 524288, null);
        kotlin.jvm.internal.e0.checkNotNullParameter(newId, "newId");
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
    }
}
