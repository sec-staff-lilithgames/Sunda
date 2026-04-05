package com.fyber.inneractive.sdk.external;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class InneractiveVideoError extends InneractiveError {

    /* renamed from: a, reason: collision with root package name */
    public final Error f23507a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f23508b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum Error {
        ERROR_NO_MEDIA_FILES("ErrorNoMediaFiles", true),
        ERROR_FAILED_PLAYING_MEDIA_FILE("ErrorPlayingMediaFile", false),
        ERROR_FAILED_PLAYING_ALL_MEDIA_FILES("ErrorPlayingAllMediaFile", true),
        ERROR_PRE_BUFFER_TIMEOUT("ErrorPreBufferTimeout", false),
        ERROR_BUFFER_TIMEOUT("ErrorBufferTimeout", false);

        private String errorString;
        private boolean isFatal;

        Error(String str, boolean z10) {
            this.errorString = str;
            this.isFatal = z10;
        }

        public String getErrorString() {
            return this.errorString;
        }

        public boolean isFatal() {
            return this.isFatal;
        }
    }

    public InneractiveVideoError(Error error) {
        this.f23507a = error;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveError
    public String description() {
        if (this.f23508b == null) {
            return this.f23507a.getErrorString();
        }
        return this.f23507a.getErrorString() + ": " + this.f23508b;
    }

    public Throwable getCause() {
        return this.f23508b;
    }

    public Error getPlayerError() {
        return this.f23507a;
    }

    public InneractiveVideoError(Error error, Throwable th2) {
        this(error);
        this.f23508b = th2;
    }
}
