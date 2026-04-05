package com.applovin.shadow.okhttp3.internal.http2;

import a.b;
import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okhttp3.internal.concurrent.Task;
import com.applovin.shadow.okhttp3.internal.concurrent.TaskQueue;
import com.applovin.shadow.okhttp3.internal.concurrent.TaskRunner;
import com.applovin.shadow.okhttp3.internal.http2.Http2Reader;
import com.applovin.shadow.okhttp3.internal.platform.Platform;
import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.BufferedSink;
import com.applovin.shadow.okio.BufferedSource;
import com.applovin.shadow.okio.ByteString;
import com.applovin.shadow.okio.Okio;
import j1.o2;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.b1;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.z0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import kv.a;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class Http2Connection implements Closeable {
    public static final int AWAIT_PING = 3;
    public static final Companion Companion = new Companion(null);
    private static final Settings DEFAULT_SETTINGS;
    public static final int DEGRADED_PING = 2;
    public static final int DEGRADED_PONG_TIMEOUT_NS = 1000000000;
    public static final int INTERVAL_PING = 1;
    public static final int OKHTTP_CLIENT_WINDOW_SIZE = 16777216;
    private long awaitPingsSent;
    private long awaitPongsReceived;
    private final boolean client;
    private final String connectionName;
    private final Set<Integer> currentPushRequests;
    private long degradedPingsSent;
    private long degradedPongDeadlineNs;
    private long degradedPongsReceived;
    private long intervalPingsSent;
    private long intervalPongsReceived;
    private boolean isShutdown;
    private int lastGoodStreamId;
    private final Listener listener;
    private int nextStreamId;
    private final Settings okHttpSettings;
    private Settings peerSettings;
    private final PushObserver pushObserver;
    private final TaskQueue pushQueue;
    private long readBytesAcknowledged;
    private long readBytesTotal;
    private final ReaderRunnable readerRunnable;
    private final TaskQueue settingsListenerQueue;
    private final Socket socket;
    private final Map<Integer, Http2Stream> streams;
    private final TaskRunner taskRunner;
    private long writeBytesMaximum;
    private long writeBytesTotal;
    private final Http2Writer writer;
    private final TaskQueue writerQueue;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder {
        private boolean client;
        public String connectionName;
        private Listener listener;
        private int pingIntervalMillis;
        private PushObserver pushObserver;
        public BufferedSink sink;
        public Socket socket;
        public BufferedSource source;
        private final TaskRunner taskRunner;

        public Builder(boolean z10, TaskRunner taskRunner) {
            e0.checkNotNullParameter(taskRunner, "taskRunner");
            this.client = z10;
            this.taskRunner = taskRunner;
            this.listener = Listener.REFUSE_INCOMING_STREAMS;
            this.pushObserver = PushObserver.CANCEL;
        }

        public static /* synthetic */ Builder socket$default(Builder builder, Socket socket, String str, BufferedSource bufferedSource, BufferedSink bufferedSink, int i10, Object obj) throws IOException {
            if ((i10 & 2) != 0) {
                str = Util.peerName(socket);
            }
            if ((i10 & 4) != 0) {
                bufferedSource = Okio.buffer(Okio.source(socket));
            }
            if ((i10 & 8) != 0) {
                bufferedSink = Okio.buffer(Okio.sink(socket));
            }
            return builder.socket(socket, str, bufferedSource, bufferedSink);
        }

        public final Http2Connection build() {
            return new Http2Connection(this);
        }

        public final boolean getClient$okhttp() {
            return this.client;
        }

        public final String getConnectionName$okhttp() {
            String str = this.connectionName;
            if (str != null) {
                return str;
            }
            e0.throwUninitializedPropertyAccessException("connectionName");
            return null;
        }

        public final Listener getListener$okhttp() {
            return this.listener;
        }

        public final int getPingIntervalMillis$okhttp() {
            return this.pingIntervalMillis;
        }

        public final PushObserver getPushObserver$okhttp() {
            return this.pushObserver;
        }

        public final BufferedSink getSink$okhttp() {
            BufferedSink bufferedSink = this.sink;
            if (bufferedSink != null) {
                return bufferedSink;
            }
            e0.throwUninitializedPropertyAccessException("sink");
            return null;
        }

        public final Socket getSocket$okhttp() {
            Socket socket = this.socket;
            if (socket != null) {
                return socket;
            }
            e0.throwUninitializedPropertyAccessException("socket");
            return null;
        }

        public final BufferedSource getSource$okhttp() {
            BufferedSource bufferedSource = this.source;
            if (bufferedSource != null) {
                return bufferedSource;
            }
            e0.throwUninitializedPropertyAccessException("source");
            return null;
        }

        public final TaskRunner getTaskRunner$okhttp() {
            return this.taskRunner;
        }

        public final Builder listener(Listener listener) {
            e0.checkNotNullParameter(listener, "listener");
            this.listener = listener;
            return this;
        }

        public final Builder pingIntervalMillis(int i10) {
            this.pingIntervalMillis = i10;
            return this;
        }

        public final Builder pushObserver(PushObserver pushObserver) {
            e0.checkNotNullParameter(pushObserver, "pushObserver");
            this.pushObserver = pushObserver;
            return this;
        }

        public final void setClient$okhttp(boolean z10) {
            this.client = z10;
        }

        public final void setConnectionName$okhttp(String str) {
            e0.checkNotNullParameter(str, "<set-?>");
            this.connectionName = str;
        }

        public final void setListener$okhttp(Listener listener) {
            e0.checkNotNullParameter(listener, "<set-?>");
            this.listener = listener;
        }

        public final void setPingIntervalMillis$okhttp(int i10) {
            this.pingIntervalMillis = i10;
        }

        public final void setPushObserver$okhttp(PushObserver pushObserver) {
            e0.checkNotNullParameter(pushObserver, "<set-?>");
            this.pushObserver = pushObserver;
        }

        public final void setSink$okhttp(BufferedSink bufferedSink) {
            e0.checkNotNullParameter(bufferedSink, "<set-?>");
            this.sink = bufferedSink;
        }

        public final void setSocket$okhttp(Socket socket) {
            e0.checkNotNullParameter(socket, "<set-?>");
            this.socket = socket;
        }

        public final void setSource$okhttp(BufferedSource bufferedSource) {
            e0.checkNotNullParameter(bufferedSource, "<set-?>");
            this.source = bufferedSource;
        }

        public final Builder socket(Socket socket) throws IOException {
            e0.checkNotNullParameter(socket, "socket");
            return socket$default(this, socket, null, null, null, 14, null);
        }

        public final Builder socket(Socket socket, String peerName) throws IOException {
            e0.checkNotNullParameter(socket, "socket");
            e0.checkNotNullParameter(peerName, "peerName");
            return socket$default(this, socket, peerName, null, null, 12, null);
        }

        public final Builder socket(Socket socket, String peerName, BufferedSource source) throws IOException {
            e0.checkNotNullParameter(socket, "socket");
            e0.checkNotNullParameter(peerName, "peerName");
            e0.checkNotNullParameter(source, "source");
            return socket$default(this, socket, peerName, source, null, 8, null);
        }

        public final Builder socket(Socket socket, String peerName, BufferedSource source, BufferedSink sink) throws IOException {
            String strK;
            e0.checkNotNullParameter(socket, "socket");
            e0.checkNotNullParameter(peerName, "peerName");
            e0.checkNotNullParameter(source, "source");
            e0.checkNotNullParameter(sink, "sink");
            setSocket$okhttp(socket);
            if (this.client) {
                strK = Util.okHttpName + ' ' + peerName;
            } else {
                strK = b.k("MockWebServer ", peerName);
            }
            setConnectionName$okhttp(strK);
            setSource$okhttp(source);
            setSink$okhttp(sink);
            return this;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final Settings getDEFAULT_SETTINGS() {
            return Http2Connection.DEFAULT_SETTINGS;
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class Listener {
        public static final Companion Companion = new Companion(null);
        public static final Listener REFUSE_INCOMING_STREAMS = new Listener() { // from class: com.applovin.shadow.okhttp3.internal.http2.Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1
            @Override // com.applovin.shadow.okhttp3.internal.http2.Http2Connection.Listener
            public void onStream(Http2Stream stream) throws IOException {
                e0.checkNotNullParameter(stream, "stream");
                stream.close(ErrorCode.REFUSED_STREAM, null);
            }
        };

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(u uVar) {
                this();
            }

            private Companion() {
            }
        }

        public void onSettings(Http2Connection connection, Settings settings) {
            e0.checkNotNullParameter(connection, "connection");
            e0.checkNotNullParameter(settings, "settings");
        }

        public abstract void onStream(Http2Stream http2Stream) throws IOException;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class ReaderRunnable implements Http2Reader.Handler, a {
        private final Http2Reader reader;
        final /* synthetic */ Http2Connection this$0;

        public ReaderRunnable(Http2Connection http2Connection, Http2Reader reader) {
            e0.checkNotNullParameter(reader, "reader");
            this.this$0 = http2Connection;
            this.reader = reader;
        }

        @Override // com.applovin.shadow.okhttp3.internal.http2.Http2Reader.Handler
        public void alternateService(int i10, String origin, ByteString protocol, String host, int i11, long j10) {
            e0.checkNotNullParameter(origin, "origin");
            e0.checkNotNullParameter(protocol, "protocol");
            e0.checkNotNullParameter(host, "host");
        }

        public final void applyAndAckSettings(boolean z10, Settings settings) {
            long initialWindowSize;
            int i10;
            Http2Stream[] http2StreamArr;
            e0.checkNotNullParameter(settings, "settings");
            final b1 b1Var = new b1();
            Http2Writer writer = this.this$0.getWriter();
            final Http2Connection http2Connection = this.this$0;
            synchronized (writer) {
                synchronized (http2Connection) {
                    try {
                        Settings peerSettings = http2Connection.getPeerSettings();
                        if (!z10) {
                            Settings settings2 = new Settings();
                            settings2.merge(peerSettings);
                            settings2.merge(settings);
                            settings = settings2;
                        }
                        b1Var.f71816b = settings;
                        initialWindowSize = settings.getInitialWindowSize() - peerSettings.getInitialWindowSize();
                        http2StreamArr = (initialWindowSize == 0 || http2Connection.getStreams$okhttp().isEmpty()) ? null : (Http2Stream[]) http2Connection.getStreams$okhttp().values().toArray(new Http2Stream[0]);
                        http2Connection.setPeerSettings((Settings) b1Var.f71816b);
                        TaskQueue taskQueue = http2Connection.settingsListenerQueue;
                        final String str = http2Connection.getConnectionName$okhttp() + " onSettings";
                        final boolean z11 = true;
                        taskQueue.schedule(new Task(str, z11) { // from class: com.applovin.shadow.okhttp3.internal.http2.Http2Connection$ReaderRunnable$applyAndAckSettings$lambda$7$lambda$6$$inlined$execute$default$1
                            @Override // com.applovin.shadow.okhttp3.internal.concurrent.Task
                            public long runOnce() {
                                http2Connection.getListener$okhttp().onSettings(http2Connection, (Settings) b1Var.f71816b);
                                return -1L;
                            }
                        }, 0L);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                try {
                    http2Connection.getWriter().applyAndAckSettings((Settings) b1Var.f71816b);
                } catch (IOException e10) {
                    http2Connection.failConnection(e10);
                }
            }
            if (http2StreamArr != null) {
                for (Http2Stream http2Stream : http2StreamArr) {
                    synchronized (http2Stream) {
                        http2Stream.addBytesToWriteWindow(initialWindowSize);
                    }
                }
            }
        }

        @Override // com.applovin.shadow.okhttp3.internal.http2.Http2Reader.Handler
        public void data(boolean z10, int i10, BufferedSource source, int i11) throws IOException {
            e0.checkNotNullParameter(source, "source");
            if (this.this$0.pushedStream$okhttp(i10)) {
                this.this$0.pushDataLater$okhttp(i10, source, i11, z10);
                return;
            }
            Http2Stream stream = this.this$0.getStream(i10);
            if (stream == null) {
                this.this$0.writeSynResetLater$okhttp(i10, ErrorCode.PROTOCOL_ERROR);
                long j10 = i11;
                this.this$0.updateConnectionFlowControl$okhttp(j10);
                source.skip(j10);
                return;
            }
            stream.receiveData(source, i11);
            if (z10) {
                stream.receiveHeaders(Util.EMPTY_HEADERS, true);
            }
        }

        public final Http2Reader getReader$okhttp() {
            return this.reader;
        }

        @Override // com.applovin.shadow.okhttp3.internal.http2.Http2Reader.Handler
        public void goAway(int i10, ErrorCode errorCode, ByteString debugData) {
            int i11;
            Object[] array;
            e0.checkNotNullParameter(errorCode, "errorCode");
            e0.checkNotNullParameter(debugData, "debugData");
            debugData.size();
            Http2Connection http2Connection = this.this$0;
            synchronized (http2Connection) {
                array = http2Connection.getStreams$okhttp().values().toArray(new Http2Stream[0]);
                http2Connection.isShutdown = true;
            }
            for (Http2Stream http2Stream : (Http2Stream[]) array) {
                if (http2Stream.getId() > i10 && http2Stream.isLocallyInitiated()) {
                    http2Stream.receiveRstStream(ErrorCode.REFUSED_STREAM);
                    this.this$0.removeStream$okhttp(http2Stream.getId());
                }
            }
        }

        @Override // com.applovin.shadow.okhttp3.internal.http2.Http2Reader.Handler
        public void headers(boolean z10, int i10, int i11, List<Header> headerBlock) {
            e0.checkNotNullParameter(headerBlock, "headerBlock");
            if (this.this$0.pushedStream$okhttp(i10)) {
                this.this$0.pushHeadersLater$okhttp(i10, headerBlock, z10);
                return;
            }
            final Http2Connection http2Connection = this.this$0;
            synchronized (http2Connection) {
                Http2Stream stream = http2Connection.getStream(i10);
                if (stream != null) {
                    stream.receiveHeaders(Util.toHeaders(headerBlock), z10);
                    return;
                }
                if (http2Connection.isShutdown) {
                    return;
                }
                if (i10 <= http2Connection.getLastGoodStreamId$okhttp()) {
                    return;
                }
                if (i10 % 2 == http2Connection.getNextStreamId$okhttp() % 2) {
                    return;
                }
                final Http2Stream http2Stream = new Http2Stream(i10, http2Connection, false, z10, Util.toHeaders(headerBlock));
                http2Connection.setLastGoodStreamId$okhttp(i10);
                http2Connection.getStreams$okhttp().put(Integer.valueOf(i10), http2Stream);
                TaskQueue taskQueueNewQueue = http2Connection.taskRunner.newQueue();
                final String str = http2Connection.getConnectionName$okhttp() + AbstractJsonLexerKt.BEGIN_LIST + i10 + "] onStream";
                final boolean z11 = true;
                taskQueueNewQueue.schedule(new Task(str, z11) { // from class: com.applovin.shadow.okhttp3.internal.http2.Http2Connection$ReaderRunnable$headers$lambda$2$$inlined$execute$default$1
                    @Override // com.applovin.shadow.okhttp3.internal.concurrent.Task
                    public long runOnce() {
                        try {
                            http2Connection.getListener$okhttp().onStream(http2Stream);
                            return -1L;
                        } catch (IOException e10) {
                            Platform.Companion.get().log("Http2Connection.Listener failure for " + http2Connection.getConnectionName$okhttp(), 4, e10);
                            try {
                                http2Stream.close(ErrorCode.PROTOCOL_ERROR, e10);
                                return -1L;
                            } catch (IOException unused) {
                                return -1L;
                            }
                        }
                    }
                }, 0L);
            }
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() throws Throwable {
            m346invoke();
            return x0.f87415a;
        }

        @Override // com.applovin.shadow.okhttp3.internal.http2.Http2Reader.Handler
        public void ping(boolean z10, final int i10, final int i11) {
            if (!z10) {
                TaskQueue taskQueue = this.this$0.writerQueue;
                final String str = this.this$0.getConnectionName$okhttp() + " ping";
                final Http2Connection http2Connection = this.this$0;
                final boolean z11 = true;
                taskQueue.schedule(new Task(str, z11) { // from class: com.applovin.shadow.okhttp3.internal.http2.Http2Connection$ReaderRunnable$ping$$inlined$execute$default$1
                    @Override // com.applovin.shadow.okhttp3.internal.concurrent.Task
                    public long runOnce() throws IOException {
                        http2Connection.writePing(true, i10, i11);
                        return -1L;
                    }
                }, 0L);
                return;
            }
            Http2Connection http2Connection2 = this.this$0;
            synchronized (http2Connection2) {
                try {
                    if (i10 == 1) {
                        http2Connection2.intervalPongsReceived++;
                    } else if (i10 == 2) {
                        http2Connection2.degradedPongsReceived++;
                    } else if (i10 == 3) {
                        http2Connection2.awaitPongsReceived++;
                        e0.checkNotNull(http2Connection2, "null cannot be cast to non-null type java.lang.Object");
                        http2Connection2.notifyAll();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.applovin.shadow.okhttp3.internal.http2.Http2Reader.Handler
        public void pushPromise(int i10, int i11, List<Header> requestHeaders) throws Throwable {
            e0.checkNotNullParameter(requestHeaders, "requestHeaders");
            this.this$0.pushRequestLater$okhttp(i11, requestHeaders);
        }

        @Override // com.applovin.shadow.okhttp3.internal.http2.Http2Reader.Handler
        public void rstStream(int i10, ErrorCode errorCode) {
            e0.checkNotNullParameter(errorCode, "errorCode");
            if (this.this$0.pushedStream$okhttp(i10)) {
                this.this$0.pushResetLater$okhttp(i10, errorCode);
                return;
            }
            Http2Stream http2StreamRemoveStream$okhttp = this.this$0.removeStream$okhttp(i10);
            if (http2StreamRemoveStream$okhttp != null) {
                http2StreamRemoveStream$okhttp.receiveRstStream(errorCode);
            }
        }

        @Override // com.applovin.shadow.okhttp3.internal.http2.Http2Reader.Handler
        public void settings(final boolean z10, final Settings settings) {
            e0.checkNotNullParameter(settings, "settings");
            TaskQueue taskQueue = this.this$0.writerQueue;
            final String str = this.this$0.getConnectionName$okhttp() + " applyAndAckSettings";
            final boolean z11 = true;
            taskQueue.schedule(new Task(str, z11) { // from class: com.applovin.shadow.okhttp3.internal.http2.Http2Connection$ReaderRunnable$settings$$inlined$execute$default$1
                @Override // com.applovin.shadow.okhttp3.internal.concurrent.Task
                public long runOnce() {
                    this.applyAndAckSettings(z10, settings);
                    return -1L;
                }
            }, 0L);
        }

        @Override // com.applovin.shadow.okhttp3.internal.http2.Http2Reader.Handler
        public void windowUpdate(int i10, long j10) {
            if (i10 == 0) {
                Http2Connection http2Connection = this.this$0;
                synchronized (http2Connection) {
                    http2Connection.writeBytesMaximum = http2Connection.getWriteBytesMaximum() + j10;
                    e0.checkNotNull(http2Connection, "null cannot be cast to non-null type java.lang.Object");
                    http2Connection.notifyAll();
                }
                return;
            }
            Http2Stream stream = this.this$0.getStream(i10);
            if (stream != null) {
                synchronized (stream) {
                    stream.addBytesToWriteWindow(j10);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.applovin.shadow.okhttp3.internal.http2.ErrorCode] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5, types: [com.applovin.shadow.okhttp3.internal.http2.Http2Reader, java.io.Closeable] */
        /* renamed from: invoke, reason: collision with other method in class */
        public void m346invoke() throws Throwable {
            ErrorCode errorCode;
            ErrorCode errorCode2 = ErrorCode.INTERNAL_ERROR;
            IOException e10 = null;
            try {
                try {
                    this.reader.readConnectionPreface(this);
                    while (this.reader.nextFrame(false, this)) {
                    }
                    ErrorCode errorCode3 = ErrorCode.NO_ERROR;
                    try {
                        this.this$0.close$okhttp(errorCode3, ErrorCode.CANCEL, null);
                        errorCode = errorCode3;
                    } catch (IOException e11) {
                        e10 = e11;
                        ErrorCode errorCode4 = ErrorCode.PROTOCOL_ERROR;
                        Http2Connection http2Connection = this.this$0;
                        http2Connection.close$okhttp(errorCode4, errorCode4, e10);
                        errorCode = http2Connection;
                        errorCode2 = this.reader;
                        Util.closeQuietly((Closeable) errorCode2);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    this.this$0.close$okhttp(errorCode, errorCode2, e10);
                    Util.closeQuietly(this.reader);
                    throw th;
                }
            } catch (IOException e12) {
                e10 = e12;
            } catch (Throwable th3) {
                th = th3;
                errorCode = errorCode2;
                this.this$0.close$okhttp(errorCode, errorCode2, e10);
                Util.closeQuietly(this.reader);
                throw th;
            }
            errorCode2 = this.reader;
            Util.closeQuietly((Closeable) errorCode2);
        }

        @Override // com.applovin.shadow.okhttp3.internal.http2.Http2Reader.Handler
        public void ackSettings() {
        }

        @Override // com.applovin.shadow.okhttp3.internal.http2.Http2Reader.Handler
        public void priority(int i10, int i11, int i12, boolean z10) {
        }
    }

    static {
        Settings settings = new Settings();
        settings.set(7, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        settings.set(5, 16384);
        DEFAULT_SETTINGS = settings;
    }

    public Http2Connection(Builder builder) {
        e0.checkNotNullParameter(builder, "builder");
        boolean client$okhttp = builder.getClient$okhttp();
        this.client = client$okhttp;
        this.listener = builder.getListener$okhttp();
        this.streams = new LinkedHashMap();
        String connectionName$okhttp = builder.getConnectionName$okhttp();
        this.connectionName = connectionName$okhttp;
        this.nextStreamId = builder.getClient$okhttp() ? 3 : 2;
        TaskRunner taskRunner$okhttp = builder.getTaskRunner$okhttp();
        this.taskRunner = taskRunner$okhttp;
        TaskQueue taskQueueNewQueue = taskRunner$okhttp.newQueue();
        this.writerQueue = taskQueueNewQueue;
        this.pushQueue = taskRunner$okhttp.newQueue();
        this.settingsListenerQueue = taskRunner$okhttp.newQueue();
        this.pushObserver = builder.getPushObserver$okhttp();
        Settings settings = new Settings();
        if (builder.getClient$okhttp()) {
            settings.set(7, 16777216);
        }
        this.okHttpSettings = settings;
        this.peerSettings = DEFAULT_SETTINGS;
        this.writeBytesMaximum = r2.getInitialWindowSize();
        this.socket = builder.getSocket$okhttp();
        this.writer = new Http2Writer(builder.getSink$okhttp(), client$okhttp);
        this.readerRunnable = new ReaderRunnable(this, new Http2Reader(builder.getSource$okhttp(), client$okhttp));
        this.currentPushRequests = new LinkedHashSet();
        if (builder.getPingIntervalMillis$okhttp() != 0) {
            final long nanos = TimeUnit.MILLISECONDS.toNanos(builder.getPingIntervalMillis$okhttp());
            final String strL = o2.l(connectionName$okhttp, " ping");
            taskQueueNewQueue.schedule(new Task(strL) { // from class: com.applovin.shadow.okhttp3.internal.http2.Http2Connection$special$$inlined$schedule$1
                @Override // com.applovin.shadow.okhttp3.internal.concurrent.Task
                public long runOnce() throws IOException {
                    boolean z10;
                    synchronized (this) {
                        if (this.intervalPongsReceived < this.intervalPingsSent) {
                            z10 = true;
                        } else {
                            this.intervalPingsSent++;
                            z10 = false;
                        }
                    }
                    if (z10) {
                        this.failConnection(null);
                        return -1L;
                    }
                    this.writePing(false, 1, 0);
                    return nanos;
                }
            }, nanos);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void failConnection(IOException iOException) throws IOException {
        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
        close$okhttp(errorCode, errorCode, iOException);
    }

    public static /* synthetic */ void start$default(Http2Connection http2Connection, boolean z10, TaskRunner taskRunner, int i10, Object obj) throws IOException {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            taskRunner = TaskRunner.INSTANCE;
        }
        http2Connection.start(z10, taskRunner);
    }

    public final synchronized void awaitPong() throws InterruptedException {
        while (this.awaitPongsReceived < this.awaitPingsSent) {
            e0.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            wait();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        close$okhttp(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }

    public final void close$okhttp(ErrorCode connectionCode, ErrorCode streamCode, IOException iOException) throws IOException {
        int i10;
        Object[] array;
        e0.checkNotNullParameter(connectionCode, "connectionCode");
        e0.checkNotNullParameter(streamCode, "streamCode");
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        try {
            shutdown(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.streams.isEmpty()) {
                array = null;
            } else {
                array = this.streams.values().toArray(new Http2Stream[0]);
                this.streams.clear();
            }
        }
        Http2Stream[] http2StreamArr = (Http2Stream[]) array;
        if (http2StreamArr != null) {
            for (Http2Stream http2Stream : http2StreamArr) {
                try {
                    http2Stream.close(streamCode, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.writer.close();
        } catch (IOException unused3) {
        }
        try {
            this.socket.close();
        } catch (IOException unused4) {
        }
        this.writerQueue.shutdown();
        this.pushQueue.shutdown();
        this.settingsListenerQueue.shutdown();
    }

    public final void flush() throws IOException {
        this.writer.flush();
    }

    public final boolean getClient$okhttp() {
        return this.client;
    }

    public final String getConnectionName$okhttp() {
        return this.connectionName;
    }

    public final int getLastGoodStreamId$okhttp() {
        return this.lastGoodStreamId;
    }

    public final Listener getListener$okhttp() {
        return this.listener;
    }

    public final int getNextStreamId$okhttp() {
        return this.nextStreamId;
    }

    public final Settings getOkHttpSettings() {
        return this.okHttpSettings;
    }

    public final Settings getPeerSettings() {
        return this.peerSettings;
    }

    public final long getReadBytesAcknowledged() {
        return this.readBytesAcknowledged;
    }

    public final long getReadBytesTotal() {
        return this.readBytesTotal;
    }

    public final ReaderRunnable getReaderRunnable() {
        return this.readerRunnable;
    }

    public final Socket getSocket$okhttp() {
        return this.socket;
    }

    public final synchronized Http2Stream getStream(int i10) {
        return this.streams.get(Integer.valueOf(i10));
    }

    public final Map<Integer, Http2Stream> getStreams$okhttp() {
        return this.streams;
    }

    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    public final Http2Writer getWriter() {
        return this.writer;
    }

    public final synchronized boolean isHealthy(long j10) {
        if (this.isShutdown) {
            return false;
        }
        if (this.degradedPongsReceived < this.degradedPingsSent) {
            if (j10 >= this.degradedPongDeadlineNs) {
                return false;
            }
        }
        return true;
    }

    public final Http2Stream newStream(List<Header> requestHeaders, boolean z10) throws IOException {
        e0.checkNotNullParameter(requestHeaders, "requestHeaders");
        return newStream(0, requestHeaders, z10);
    }

    public final synchronized int openStreamCount() {
        return this.streams.size();
    }

    public final void pushDataLater$okhttp(final int i10, BufferedSource source, final int i11, final boolean z10) throws IOException {
        e0.checkNotNullParameter(source, "source");
        final Buffer buffer = new Buffer();
        long j10 = i11;
        source.require(j10);
        source.read(buffer, j10);
        TaskQueue taskQueue = this.pushQueue;
        final String str = this.connectionName + AbstractJsonLexerKt.BEGIN_LIST + i10 + "] onData";
        final boolean z11 = true;
        taskQueue.schedule(new Task(str, z11) { // from class: com.applovin.shadow.okhttp3.internal.http2.Http2Connection$pushDataLater$$inlined$execute$default$1
            @Override // com.applovin.shadow.okhttp3.internal.concurrent.Task
            public long runOnce() {
                try {
                    boolean zOnData = this.pushObserver.onData(i10, buffer, i11, z10);
                    if (zOnData) {
                        this.getWriter().rstStream(i10, ErrorCode.CANCEL);
                    }
                    if (!zOnData && !z10) {
                        return -1L;
                    }
                    synchronized (this) {
                        this.currentPushRequests.remove(Integer.valueOf(i10));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            }
        }, 0L);
    }

    public final void pushHeadersLater$okhttp(final int i10, final List<Header> requestHeaders, final boolean z10) {
        e0.checkNotNullParameter(requestHeaders, "requestHeaders");
        TaskQueue taskQueue = this.pushQueue;
        final String str = this.connectionName + AbstractJsonLexerKt.BEGIN_LIST + i10 + "] onHeaders";
        final boolean z11 = true;
        taskQueue.schedule(new Task(str, z11) { // from class: com.applovin.shadow.okhttp3.internal.http2.Http2Connection$pushHeadersLater$$inlined$execute$default$1
            @Override // com.applovin.shadow.okhttp3.internal.concurrent.Task
            public long runOnce() {
                boolean zOnHeaders = this.pushObserver.onHeaders(i10, requestHeaders, z10);
                if (zOnHeaders) {
                    try {
                        this.getWriter().rstStream(i10, ErrorCode.CANCEL);
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
                if (!zOnHeaders && !z10) {
                    return -1L;
                }
                synchronized (this) {
                    this.currentPushRequests.remove(Integer.valueOf(i10));
                }
                return -1L;
            }
        }, 0L);
    }

    public final void pushRequestLater$okhttp(final int i10, final List<Header> requestHeaders) throws Throwable {
        Throwable th2;
        e0.checkNotNullParameter(requestHeaders, "requestHeaders");
        synchronized (this) {
            try {
                if (this.currentPushRequests.contains(Integer.valueOf(i10))) {
                    try {
                        writeSynResetLater$okhttp(i10, ErrorCode.PROTOCOL_ERROR);
                        return;
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
                this.currentPushRequests.add(Integer.valueOf(i10));
                TaskQueue taskQueue = this.pushQueue;
                final String str = this.connectionName + AbstractJsonLexerKt.BEGIN_LIST + i10 + "] onRequest";
                final boolean z10 = true;
                taskQueue.schedule(new Task(str, z10) { // from class: com.applovin.shadow.okhttp3.internal.http2.Http2Connection$pushRequestLater$$inlined$execute$default$1
                    @Override // com.applovin.shadow.okhttp3.internal.concurrent.Task
                    public long runOnce() {
                        if (!this.pushObserver.onRequest(i10, requestHeaders)) {
                            return -1L;
                        }
                        try {
                            this.getWriter().rstStream(i10, ErrorCode.CANCEL);
                            synchronized (this) {
                                this.currentPushRequests.remove(Integer.valueOf(i10));
                            }
                            return -1L;
                        } catch (IOException unused) {
                            return -1L;
                        }
                    }
                }, 0L);
            } catch (Throwable th4) {
                th2 = th4;
            }
        }
    }

    public final void pushResetLater$okhttp(final int i10, final ErrorCode errorCode) {
        e0.checkNotNullParameter(errorCode, "errorCode");
        TaskQueue taskQueue = this.pushQueue;
        final String str = this.connectionName + AbstractJsonLexerKt.BEGIN_LIST + i10 + "] onReset";
        final boolean z10 = true;
        taskQueue.schedule(new Task(str, z10) { // from class: com.applovin.shadow.okhttp3.internal.http2.Http2Connection$pushResetLater$$inlined$execute$default$1
            @Override // com.applovin.shadow.okhttp3.internal.concurrent.Task
            public long runOnce() {
                this.pushObserver.onReset(i10, errorCode);
                synchronized (this) {
                    this.currentPushRequests.remove(Integer.valueOf(i10));
                }
                return -1L;
            }
        }, 0L);
    }

    public final Http2Stream pushStream(int i10, List<Header> requestHeaders, boolean z10) throws IOException {
        e0.checkNotNullParameter(requestHeaders, "requestHeaders");
        if (this.client) {
            throw new IllegalStateException("Client cannot push requests.");
        }
        return newStream(i10, requestHeaders, z10);
    }

    public final boolean pushedStream$okhttp(int i10) {
        return i10 != 0 && (i10 & 1) == 0;
    }

    public final synchronized Http2Stream removeStream$okhttp(int i10) {
        Http2Stream http2StreamRemove;
        http2StreamRemove = this.streams.remove(Integer.valueOf(i10));
        e0.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return http2StreamRemove;
    }

    public final void sendDegradedPingLater$okhttp() {
        synchronized (this) {
            long j10 = this.degradedPongsReceived;
            long j11 = this.degradedPingsSent;
            if (j10 < j11) {
                return;
            }
            this.degradedPingsSent = j11 + 1;
            this.degradedPongDeadlineNs = System.nanoTime() + DEGRADED_PONG_TIMEOUT_NS;
            TaskQueue taskQueue = this.writerQueue;
            final String strO = o2.o(new StringBuilder(), this.connectionName, " ping");
            final boolean z10 = true;
            taskQueue.schedule(new Task(strO, z10) { // from class: com.applovin.shadow.okhttp3.internal.http2.Http2Connection$sendDegradedPingLater$$inlined$execute$default$1
                @Override // com.applovin.shadow.okhttp3.internal.concurrent.Task
                public long runOnce() throws IOException {
                    this.writePing(false, 2, 0);
                    return -1L;
                }
            }, 0L);
        }
    }

    public final void setLastGoodStreamId$okhttp(int i10) {
        this.lastGoodStreamId = i10;
    }

    public final void setNextStreamId$okhttp(int i10) {
        this.nextStreamId = i10;
    }

    public final void setPeerSettings(Settings settings) {
        e0.checkNotNullParameter(settings, "<set-?>");
        this.peerSettings = settings;
    }

    public final void setSettings(Settings settings) throws IOException {
        e0.checkNotNullParameter(settings, "settings");
        synchronized (this.writer) {
            synchronized (this) {
                if (this.isShutdown) {
                    throw new ConnectionShutdownException();
                }
                this.okHttpSettings.merge(settings);
            }
            this.writer.settings(settings);
        }
    }

    public final void shutdown(ErrorCode statusCode) throws IOException {
        e0.checkNotNullParameter(statusCode, "statusCode");
        synchronized (this.writer) {
            z0 z0Var = new z0();
            synchronized (this) {
                if (this.isShutdown) {
                    return;
                }
                this.isShutdown = true;
                int i10 = this.lastGoodStreamId;
                z0Var.f71866b = i10;
                this.writer.goAway(i10, statusCode, Util.EMPTY_BYTE_ARRAY);
            }
        }
    }

    public final void start() throws IOException {
        start$default(this, false, null, 3, null);
    }

    public final synchronized void updateConnectionFlowControl$okhttp(long j10) {
        long j11 = this.readBytesTotal + j10;
        this.readBytesTotal = j11;
        long j12 = j11 - this.readBytesAcknowledged;
        if (j12 >= this.okHttpSettings.getInitialWindowSize() / 2) {
            writeWindowUpdateLater$okhttp(0, j12);
            this.readBytesAcknowledged += j12;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.writer.maxDataLength());
        r6 = r2;
        r8.writeBytesTotal += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void writeData(int r9, boolean r10, com.applovin.shadow.okio.Buffer r11, long r12) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            com.applovin.shadow.okhttp3.internal.http2.Http2Writer r12 = r8.writer
            r12.data(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L6f
            monitor-enter(r8)
        L12:
            long r4 = r8.writeBytesTotal     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L60
            long r6 = r8.writeBytesMaximum     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L60
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L39
            java.util.Map<java.lang.Integer, com.applovin.shadow.okhttp3.internal.http2.Http2Stream> r2 = r8.streams     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L60
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L60
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L60
            if (r2 == 0) goto L31
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.e0.checkNotNull(r8, r2)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L60
            r8.wait()     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L60
            goto L12
        L2f:
            r9 = move-exception
            goto L6d
        L31:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L60
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L60
            throw r9     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L60
        L39:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L2f
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L2f
            com.applovin.shadow.okhttp3.internal.http2.Http2Writer r4 = r8.writer     // Catch: java.lang.Throwable -> L2f
            int r4 = r4.maxDataLength()     // Catch: java.lang.Throwable -> L2f
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2f
            long r4 = r8.writeBytesTotal     // Catch: java.lang.Throwable -> L2f
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2f
            long r4 = r4 + r6
            r8.writeBytesTotal = r4     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r8)
            long r12 = r12 - r6
            com.applovin.shadow.okhttp3.internal.http2.Http2Writer r4 = r8.writer
            if (r10 == 0) goto L5b
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L5b
            r5 = 1
            goto L5c
        L5b:
            r5 = r3
        L5c:
            r4.data(r5, r9, r11, r2)
            goto Ld
        L60:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2f
            r9.interrupt()     // Catch: java.lang.Throwable -> L2f
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2f
            r9.<init>()     // Catch: java.lang.Throwable -> L2f
            throw r9     // Catch: java.lang.Throwable -> L2f
        L6d:
            monitor-exit(r8)
            throw r9
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okhttp3.internal.http2.Http2Connection.writeData(int, boolean, com.applovin.shadow.okio.Buffer, long):void");
    }

    public final void writeHeaders$okhttp(int i10, boolean z10, List<Header> alternating) throws IOException {
        e0.checkNotNullParameter(alternating, "alternating");
        this.writer.headers(z10, i10, alternating);
    }

    public final void writePing(boolean z10, int i10, int i11) throws IOException {
        try {
            this.writer.ping(z10, i10, i11);
        } catch (IOException e10) {
            failConnection(e10);
        }
    }

    public final void writePingAndAwaitPong() throws InterruptedException, IOException {
        writePing();
        awaitPong();
    }

    public final void writeSynReset$okhttp(int i10, ErrorCode statusCode) throws IOException {
        e0.checkNotNullParameter(statusCode, "statusCode");
        this.writer.rstStream(i10, statusCode);
    }

    public final void writeSynResetLater$okhttp(final int i10, final ErrorCode errorCode) {
        e0.checkNotNullParameter(errorCode, "errorCode");
        TaskQueue taskQueue = this.writerQueue;
        final String str = this.connectionName + AbstractJsonLexerKt.BEGIN_LIST + i10 + "] writeSynReset";
        final boolean z10 = true;
        taskQueue.schedule(new Task(str, z10) { // from class: com.applovin.shadow.okhttp3.internal.http2.Http2Connection$writeSynResetLater$$inlined$execute$default$1
            @Override // com.applovin.shadow.okhttp3.internal.concurrent.Task
            public long runOnce() throws IOException {
                try {
                    this.writeSynReset$okhttp(i10, errorCode);
                    return -1L;
                } catch (IOException e10) {
                    this.failConnection(e10);
                    return -1L;
                }
            }
        }, 0L);
    }

    public final void writeWindowUpdateLater$okhttp(final int i10, final long j10) {
        TaskQueue taskQueue = this.writerQueue;
        final String str = this.connectionName + AbstractJsonLexerKt.BEGIN_LIST + i10 + "] windowUpdate";
        final boolean z10 = true;
        taskQueue.schedule(new Task(str, z10) { // from class: com.applovin.shadow.okhttp3.internal.http2.Http2Connection$writeWindowUpdateLater$$inlined$execute$default$1
            @Override // com.applovin.shadow.okhttp3.internal.concurrent.Task
            public long runOnce() throws IOException {
                try {
                    this.getWriter().windowUpdate(i10, j10);
                    return -1L;
                } catch (IOException e10) {
                    this.failConnection(e10);
                    return -1L;
                }
            }
        }, 0L);
    }

    private final Http2Stream newStream(int i10, List<Header> list, boolean z10) throws Throwable {
        Throwable th2;
        boolean z11 = !z10;
        synchronized (this.writer) {
            try {
                try {
                    synchronized (this) {
                        try {
                            if (this.nextStreamId > 1073741823) {
                                try {
                                    shutdown(ErrorCode.REFUSED_STREAM);
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    throw th2;
                                }
                            }
                            try {
                                if (this.isShutdown) {
                                    throw new ConnectionShutdownException();
                                }
                                int i11 = this.nextStreamId;
                                this.nextStreamId = i11 + 2;
                                Http2Stream http2Stream = new Http2Stream(i11, this, z11, false, null);
                                boolean z12 = !z10 || this.writeBytesTotal >= this.writeBytesMaximum || http2Stream.getWriteBytesTotal() >= http2Stream.getWriteBytesMaximum();
                                if (http2Stream.isOpen()) {
                                    this.streams.put(Integer.valueOf(i11), http2Stream);
                                }
                                if (i10 == 0) {
                                    this.writer.headers(z11, i11, list);
                                } else {
                                    if (this.client) {
                                        throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                                    }
                                    this.writer.pushPromise(i10, i11, list);
                                }
                                if (z12) {
                                    this.writer.flush();
                                }
                                return http2Stream;
                            } catch (Throwable th4) {
                                th = th4;
                                th2 = th;
                                throw th2;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                    throw th;
                }
            } catch (Throwable th7) {
                th = th7;
                throw th;
            }
        }
    }

    public final void start(boolean z10) throws IOException {
        start$default(this, z10, null, 2, null);
    }

    public final void start(boolean z10, TaskRunner taskRunner) throws IOException {
        e0.checkNotNullParameter(taskRunner, "taskRunner");
        if (z10) {
            this.writer.connectionPreface();
            this.writer.settings(this.okHttpSettings);
            if (this.okHttpSettings.getInitialWindowSize() != 65535) {
                this.writer.windowUpdate(0, r5 - Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            }
        }
        taskRunner.newQueue().schedule(new TaskQueue.AnonymousClass1(this.connectionName, true, this.readerRunnable), 0L);
    }

    public final void writePing() throws InterruptedException, IOException {
        synchronized (this) {
            this.awaitPingsSent++;
        }
        writePing(false, 3, 1330343787);
    }
}
