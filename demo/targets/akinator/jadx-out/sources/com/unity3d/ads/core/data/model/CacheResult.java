package com.unity3d.ads.core.data.model;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class CacheResult {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Failure extends CacheResult {
        private final CacheError error;
        private final Throwable reason;
        private final CacheSource source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(CacheError error, CacheSource source, Throwable th2) {
            super(null);
            e0.checkNotNullParameter(error, "error");
            e0.checkNotNullParameter(source, "source");
            this.error = error;
            this.source = source;
            this.reason = th2;
        }

        public static /* synthetic */ Failure copy$default(Failure failure, CacheError cacheError, CacheSource cacheSource, Throwable th2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                cacheError = failure.error;
            }
            if ((i10 & 2) != 0) {
                cacheSource = failure.source;
            }
            if ((i10 & 4) != 0) {
                th2 = failure.reason;
            }
            return failure.copy(cacheError, cacheSource, th2);
        }

        public final CacheError component1() {
            return this.error;
        }

        public final CacheSource component2() {
            return this.source;
        }

        public final Throwable component3() {
            return this.reason;
        }

        public final Failure copy(CacheError error, CacheSource source, Throwable th2) {
            e0.checkNotNullParameter(error, "error");
            e0.checkNotNullParameter(source, "source");
            return new Failure(error, source, th2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) obj;
            return this.error == failure.error && this.source == failure.source && e0.areEqual(this.reason, failure.reason);
        }

        public final CacheError getError() {
            return this.error;
        }

        public final Throwable getReason() {
            return this.reason;
        }

        public final CacheSource getSource() {
            return this.source;
        }

        public int hashCode() {
            int iHashCode = (this.source.hashCode() + (this.error.hashCode() * 31)) * 31;
            Throwable th2 = this.reason;
            return iHashCode + (th2 == null ? 0 : th2.hashCode());
        }

        public String toString() {
            return "Failure(error=" + this.error + ", source=" + this.source + ", reason=" + this.reason + ')';
        }

        public /* synthetic */ Failure(CacheError cacheError, CacheSource cacheSource, Throwable th2, int i10, u uVar) {
            this(cacheError, (i10 & 2) != 0 ? CacheSource.LOCAL : cacheSource, (i10 & 4) != 0 ? null : th2);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Success extends CacheResult {
        private final CachedFile cachedFile;
        private final CacheSource source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(CachedFile cachedFile, CacheSource source) {
            super(null);
            e0.checkNotNullParameter(cachedFile, "cachedFile");
            e0.checkNotNullParameter(source, "source");
            this.cachedFile = cachedFile;
            this.source = source;
        }

        public static /* synthetic */ Success copy$default(Success success, CachedFile cachedFile, CacheSource cacheSource, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                cachedFile = success.cachedFile;
            }
            if ((i10 & 2) != 0) {
                cacheSource = success.source;
            }
            return success.copy(cachedFile, cacheSource);
        }

        public final CachedFile component1() {
            return this.cachedFile;
        }

        public final CacheSource component2() {
            return this.source;
        }

        public final Success copy(CachedFile cachedFile, CacheSource source) {
            e0.checkNotNullParameter(cachedFile, "cachedFile");
            e0.checkNotNullParameter(source, "source");
            return new Success(cachedFile, source);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return e0.areEqual(this.cachedFile, success.cachedFile) && this.source == success.source;
        }

        public final CachedFile getCachedFile() {
            return this.cachedFile;
        }

        public final CacheSource getSource() {
            return this.source;
        }

        public int hashCode() {
            return this.source.hashCode() + (this.cachedFile.hashCode() * 31);
        }

        public String toString() {
            return "Success(cachedFile=" + this.cachedFile + ", source=" + this.source + ')';
        }
    }

    public /* synthetic */ CacheResult(u uVar) {
        this();
    }

    private CacheResult() {
    }
}
