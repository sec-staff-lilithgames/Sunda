package io.ktor.http;

import e3.g;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class ContentRange {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Bounded extends ContentRange {
        private final long from;

        /* renamed from: to, reason: collision with root package name */
        private final long f62173to;

        public Bounded(long j10, long j11) {
            super(null);
            this.from = j10;
            this.f62173to = j11;
        }

        public static /* synthetic */ Bounded copy$default(Bounded bounded, long j10, long j11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = bounded.from;
            }
            if ((i10 & 2) != 0) {
                j11 = bounded.f62173to;
            }
            return bounded.copy(j10, j11);
        }

        public final long component1() {
            return this.from;
        }

        public final long component2() {
            return this.f62173to;
        }

        public final Bounded copy(long j10, long j11) {
            return new Bounded(j10, j11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Bounded)) {
                return false;
            }
            Bounded bounded = (Bounded) obj;
            return this.from == bounded.from && this.f62173to == bounded.f62173to;
        }

        public final long getFrom() {
            return this.from;
        }

        public final long getTo() {
            return this.f62173to;
        }

        public int hashCode() {
            return Long.hashCode(this.f62173to) + (Long.hashCode(this.from) * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.from);
            sb2.append('-');
            sb2.append(this.f62173to);
            return sb2.toString();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Suffix extends ContentRange {
        private final long lastCount;

        public Suffix(long j10) {
            super(null);
            this.lastCount = j10;
        }

        public static /* synthetic */ Suffix copy$default(Suffix suffix, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = suffix.lastCount;
            }
            return suffix.copy(j10);
        }

        public final long component1() {
            return this.lastCount;
        }

        public final Suffix copy(long j10) {
            return new Suffix(j10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Suffix) && this.lastCount == ((Suffix) obj).lastCount;
        }

        public final long getLastCount() {
            return this.lastCount;
        }

        public int hashCode() {
            return Long.hashCode(this.lastCount);
        }

        public String toString() {
            return "-" + this.lastCount;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class TailFrom extends ContentRange {
        private final long from;

        public TailFrom(long j10) {
            super(null);
            this.from = j10;
        }

        public static /* synthetic */ TailFrom copy$default(TailFrom tailFrom, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = tailFrom.from;
            }
            return tailFrom.copy(j10);
        }

        public final long component1() {
            return this.from;
        }

        public final TailFrom copy(long j10) {
            return new TailFrom(j10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TailFrom) && this.from == ((TailFrom) obj).from;
        }

        public final long getFrom() {
            return this.from;
        }

        public int hashCode() {
            return Long.hashCode(this.from);
        }

        public String toString() {
            return g.n(new StringBuilder(), this.from, '-');
        }
    }

    public /* synthetic */ ContentRange(u uVar) {
        this();
    }

    private ContentRange() {
    }
}
