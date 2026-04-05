package com.squareup.picasso;

import a.b;
import android.net.NetworkInfo;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestHandler;
import java.io.IOException;
import xv.h;
import xv.o0;
import xv.v0;
import xv.w0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
class NetworkRequestHandler extends RequestHandler {
    private static final String SCHEME_HTTP = "http";
    private static final String SCHEME_HTTPS = "https";
    private final Downloader downloader;
    private final Stats stats;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class ContentLengthException extends IOException {
        public ContentLengthException(String str) {
            super(str);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ResponseException extends IOException {
        final int code;
        final int networkPolicy;

        public ResponseException(int i10, int i11) {
            super(b.e(i10, "HTTP "));
            this.code = i10;
            this.networkPolicy = i11;
        }
    }

    public NetworkRequestHandler(Downloader downloader, Stats stats) {
        this.downloader = downloader;
        this.stats = stats;
    }

    private static o0 createRequest(Request request, int i10) {
        h hVarBuild;
        if (i10 == 0) {
            hVarBuild = null;
        } else if (NetworkPolicy.isOfflineOnly(i10)) {
            hVarBuild = h.f93648p;
        } else {
            h.a aVar = new h.a();
            if (!NetworkPolicy.shouldReadFromDiskCache(i10)) {
                aVar.noCache();
            }
            if (!NetworkPolicy.shouldWriteToDiskCache(i10)) {
                aVar.noStore();
            }
            hVarBuild = aVar.build();
        }
        o0.a aVarUrl = new o0.a().url(request.uri.toString());
        if (hVarBuild != null) {
            aVarUrl.cacheControl(hVarBuild);
        }
        return aVarUrl.build();
    }

    @Override // com.squareup.picasso.RequestHandler
    public boolean canHandleRequest(Request request) {
        String scheme = request.uri.getScheme();
        return SCHEME_HTTP.equals(scheme) || "https".equals(scheme);
    }

    @Override // com.squareup.picasso.RequestHandler
    public int getRetryCount() {
        return 2;
    }

    @Override // com.squareup.picasso.RequestHandler
    public RequestHandler.Result load(Request request, int i10) throws IOException {
        v0 v0VarLoad = this.downloader.load(createRequest(request, i10));
        w0 w0VarBody = v0VarLoad.body();
        if (!v0VarLoad.isSuccessful()) {
            w0VarBody.close();
            throw new ResponseException(v0VarLoad.code(), request.networkPolicy);
        }
        Picasso.LoadedFrom loadedFrom = v0VarLoad.cacheResponse() == null ? Picasso.LoadedFrom.NETWORK : Picasso.LoadedFrom.DISK;
        if (loadedFrom == Picasso.LoadedFrom.DISK && w0VarBody.contentLength() == 0) {
            w0VarBody.close();
            throw new ContentLengthException("Received response with 0 content-length header.");
        }
        if (loadedFrom == Picasso.LoadedFrom.NETWORK && w0VarBody.contentLength() > 0) {
            this.stats.dispatchDownloadFinished(w0VarBody.contentLength());
        }
        return new RequestHandler.Result(w0VarBody.source(), loadedFrom);
    }

    @Override // com.squareup.picasso.RequestHandler
    public boolean shouldRetry(boolean z10, NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }

    @Override // com.squareup.picasso.RequestHandler
    public boolean supportsReplay() {
        return true;
    }
}
