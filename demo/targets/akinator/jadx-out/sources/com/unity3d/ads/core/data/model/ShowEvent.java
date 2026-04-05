package com.unity3d.ads.core.data.model;

import com.unity3d.ads.adplayer.model.ShowStatus;
import e3.g;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class ShowEvent {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class CancelTimeout extends ShowEvent {
        public static final CancelTimeout INSTANCE = new CancelTimeout();

        private CancelTimeout() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Clicked extends ShowEvent {
        public static final Clicked INSTANCE = new Clicked();

        private Clicked() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Completed extends ShowEvent {
        private final String reason;
        private final String reasonDebug;
        private final ShowStatus status;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Completed(ShowStatus status, String str, String str2) {
            super(null);
            e0.checkNotNullParameter(status, "status");
            this.status = status;
            this.reason = str;
            this.reasonDebug = str2;
        }

        public static /* synthetic */ Completed copy$default(Completed completed, ShowStatus showStatus, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                showStatus = completed.status;
            }
            if ((i10 & 2) != 0) {
                str = completed.reason;
            }
            if ((i10 & 4) != 0) {
                str2 = completed.reasonDebug;
            }
            return completed.copy(showStatus, str, str2);
        }

        public final ShowStatus component1() {
            return this.status;
        }

        public final String component2() {
            return this.reason;
        }

        public final String component3() {
            return this.reasonDebug;
        }

        public final Completed copy(ShowStatus status, String str, String str2) {
            e0.checkNotNullParameter(status, "status");
            return new Completed(status, str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Completed)) {
                return false;
            }
            Completed completed = (Completed) obj;
            return this.status == completed.status && e0.areEqual(this.reason, completed.reason) && e0.areEqual(this.reasonDebug, completed.reasonDebug);
        }

        public final String getReason() {
            return this.reason;
        }

        public final String getReasonDebug() {
            return this.reasonDebug;
        }

        public final ShowStatus getStatus() {
            return this.status;
        }

        public int hashCode() {
            int iHashCode = this.status.hashCode() * 31;
            String str = this.reason;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.reasonDebug;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Completed(status=");
            sb2.append(this.status);
            sb2.append(", reason=");
            sb2.append(this.reason);
            sb2.append(", reasonDebug=");
            return o2.q(sb2, this.reasonDebug, ')');
        }

        public /* synthetic */ Completed(ShowStatus showStatus, String str, String str2, int i10, u uVar) {
            this(showStatus, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Error extends ShowEvent {
        private final int errorCode;
        private final String message;
        private final String reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(String message, int i10, String reason) {
            super(null);
            e0.checkNotNullParameter(message, "message");
            e0.checkNotNullParameter(reason, "reason");
            this.message = message;
            this.errorCode = i10;
            this.reason = reason;
        }

        public static /* synthetic */ Error copy$default(Error error, String str, int i10, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = error.message;
            }
            if ((i11 & 2) != 0) {
                i10 = error.errorCode;
            }
            if ((i11 & 4) != 0) {
                str2 = error.reason;
            }
            return error.copy(str, i10, str2);
        }

        public final String component1() {
            return this.message;
        }

        public final int component2() {
            return this.errorCode;
        }

        public final String component3() {
            return this.reason;
        }

        public final Error copy(String message, int i10, String reason) {
            e0.checkNotNullParameter(message, "message");
            e0.checkNotNullParameter(reason, "reason");
            return new Error(message, i10, reason);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return e0.areEqual(this.message, error.message) && this.errorCode == error.errorCode && e0.areEqual(this.reason, error.reason);
        }

        public final int getErrorCode() {
            return this.errorCode;
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.reason.hashCode() + g.d(this.errorCode, this.message.hashCode() * 31, 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Error(message=");
            sb2.append(this.message);
            sb2.append(", errorCode=");
            sb2.append(this.errorCode);
            sb2.append(", reason=");
            return o2.q(sb2, this.reason, ')');
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class LeftApplication extends ShowEvent {
        public static final LeftApplication INSTANCE = new LeftApplication();

        private LeftApplication() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Started extends ShowEvent {
        public static final Started INSTANCE = new Started();

        private Started() {
            super(null);
        }
    }

    public /* synthetic */ ShowEvent(u uVar) {
        this();
    }

    private ShowEvent() {
    }
}
