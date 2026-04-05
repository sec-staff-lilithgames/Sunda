package com.vungle.ads.internal.downloader;

import e3.g;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface AssetDownloadListener {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DownloadError {
        public static final Companion Companion = new Companion(null);
        public static final int DEFAULT_SERVER_CODE = -1;
        private final Throwable cause;

        @ErrorReason
        private final int reason;
        private final int serverCode;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(u uVar) {
                this();
            }

            private Companion() {
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @Retention(RetentionPolicy.RUNTIME)
        public @interface ErrorReason {
            public static final Companion Companion = Companion.$$INSTANCE;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class Companion {
                private static int CONNECTION_ERROR;
                static final /* synthetic */ Companion $$INSTANCE = new Companion();
                private static int REQUEST_ERROR = 1;
                private static int DISK_ERROR = 2;
                private static int FILE_NOT_FOUND_ERROR = 3;
                private static int INTERNAL_ERROR = 4;

                private Companion() {
                }

                public final int getCONNECTION_ERROR() {
                    return CONNECTION_ERROR;
                }

                public final int getDISK_ERROR() {
                    return DISK_ERROR;
                }

                public final int getFILE_NOT_FOUND_ERROR() {
                    return FILE_NOT_FOUND_ERROR;
                }

                public final int getINTERNAL_ERROR() {
                    return INTERNAL_ERROR;
                }

                public final int getREQUEST_ERROR() {
                    return REQUEST_ERROR;
                }

                public final void setCONNECTION_ERROR(int i10) {
                    CONNECTION_ERROR = i10;
                }

                public final void setDISK_ERROR(int i10) {
                    DISK_ERROR = i10;
                }

                public final void setFILE_NOT_FOUND_ERROR(int i10) {
                    FILE_NOT_FOUND_ERROR = i10;
                }

                public final void setINTERNAL_ERROR(int i10) {
                    INTERNAL_ERROR = i10;
                }

                public final void setREQUEST_ERROR(int i10) {
                    REQUEST_ERROR = i10;
                }
            }
        }

        public DownloadError(int i10, Throwable cause, int i11) {
            e0.checkNotNullParameter(cause, "cause");
            this.serverCode = i10;
            this.cause = cause;
            this.reason = i11;
        }

        public final Throwable getCause() {
            return this.cause;
        }

        public final int getReason() {
            return this.reason;
        }

        public final int getServerCode() {
            return this.serverCode;
        }

        public String toString() {
            return "DownloadError(serverCode=" + this.serverCode + ", reason=" + this.reason + ", cause=" + this.cause + ')';
        }
    }

    void onError(DownloadError downloadError, DownloadRequest downloadRequest);

    void onProgress(Progress progress, DownloadRequest downloadRequest);

    void onStart(DownloadRequest downloadRequest);

    void onSuccess(File file, DownloadRequest downloadRequest);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Progress {
        private int progressPercent;
        private long readBytes;
        private long sizeBytes;
        private int status;
        private long timestampDownloadStart;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @Retention(RetentionPolicy.RUNTIME)
        public @interface ProgressStatus {
            public static final Companion Companion = Companion.$$INSTANCE;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class Companion {
                private static int STARTED;
                static final /* synthetic */ Companion $$INSTANCE = new Companion();
                private static int IN_PROGRESS = 1;
                private static int PAUSED = 2;
                private static int CANCELLED = 3;
                private static int DONE = 4;
                private static int LOST_CONNECTION = 5;
                private static int STATE_CHANGED = 6;
                private static int ERROR = 7;

                private Companion() {
                }

                public final int getCANCELLED() {
                    return CANCELLED;
                }

                public final int getDONE() {
                    return DONE;
                }

                public final int getERROR() {
                    return ERROR;
                }

                public final int getIN_PROGRESS() {
                    return IN_PROGRESS;
                }

                public final int getLOST_CONNECTION() {
                    return LOST_CONNECTION;
                }

                public final int getPAUSED() {
                    return PAUSED;
                }

                public final int getSTARTED() {
                    return STARTED;
                }

                public final int getSTATE_CHANGED() {
                    return STATE_CHANGED;
                }

                public final void setCANCELLED(int i10) {
                    CANCELLED = i10;
                }

                public final void setDONE(int i10) {
                    DONE = i10;
                }

                public final void setERROR(int i10) {
                    ERROR = i10;
                }

                public final void setIN_PROGRESS(int i10) {
                    IN_PROGRESS = i10;
                }

                public final void setLOST_CONNECTION(int i10) {
                    LOST_CONNECTION = i10;
                }

                public final void setPAUSED(int i10) {
                    PAUSED = i10;
                }

                public final void setSTARTED(int i10) {
                    STARTED = i10;
                }

                public final void setSTATE_CHANGED(int i10) {
                    STATE_CHANGED = i10;
                }
            }
        }

        public final int getProgressPercent() {
            return this.progressPercent;
        }

        public final long getReadBytes() {
            return this.readBytes;
        }

        public final long getSizeBytes() {
            return this.sizeBytes;
        }

        public final int getStatus() {
            return this.status;
        }

        public final long getTimestampDownloadStart() {
            return this.timestampDownloadStart;
        }

        public final void setProgressPercent(int i10) {
            this.progressPercent = i10;
        }

        public final void setReadBytes(long j10) {
            this.readBytes = j10;
        }

        public final void setSizeBytes(long j10) {
            this.sizeBytes = j10;
        }

        public final void setStatus(int i10) {
            this.status = i10;
        }

        public final void setTimestampDownloadStart(long j10) {
            this.timestampDownloadStart = j10;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Progress(status=");
            sb2.append(this.status);
            sb2.append(", percent=");
            sb2.append(this.progressPercent);
            sb2.append(", startAt=");
            sb2.append(this.timestampDownloadStart);
            sb2.append(", readed=");
            sb2.append(this.readBytes);
            sb2.append(", total=");
            return g.n(sb2, this.sizeBytes, ')');
        }

        @ProgressStatus
        public static /* synthetic */ void getStatus$annotations() {
        }
    }
}
