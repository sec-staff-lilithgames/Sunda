package com.applovin.shadow.okhttp3.internal.http2;

import com.applovin.shadow.okio.BufferedSource;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface PushObserver {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final PushObserver CANCEL = new Companion.PushObserverCancel();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class PushObserverCancel implements PushObserver {
            @Override // com.applovin.shadow.okhttp3.internal.http2.PushObserver
            public boolean onData(int i10, BufferedSource source, int i11, boolean z10) throws IOException {
                e0.checkNotNullParameter(source, "source");
                source.skip(i11);
                return true;
            }

            @Override // com.applovin.shadow.okhttp3.internal.http2.PushObserver
            public boolean onHeaders(int i10, List<Header> responseHeaders, boolean z10) {
                e0.checkNotNullParameter(responseHeaders, "responseHeaders");
                return true;
            }

            @Override // com.applovin.shadow.okhttp3.internal.http2.PushObserver
            public boolean onRequest(int i10, List<Header> requestHeaders) {
                e0.checkNotNullParameter(requestHeaders, "requestHeaders");
                return true;
            }

            @Override // com.applovin.shadow.okhttp3.internal.http2.PushObserver
            public void onReset(int i10, ErrorCode errorCode) {
                e0.checkNotNullParameter(errorCode, "errorCode");
            }
        }

        private Companion() {
        }
    }

    boolean onData(int i10, BufferedSource bufferedSource, int i11, boolean z10) throws IOException;

    boolean onHeaders(int i10, List<Header> list, boolean z10);

    boolean onRequest(int i10, List<Header> list);

    void onReset(int i10, ErrorCode errorCode);
}
