package io.ktor.websocket;

import a.b;
import io.ktor.util.AttributeKey;
import io.ktor.websocket.Frame;
import io.ktor.websocket.internals.DeflaterUtilsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kv.l;
import sv.n0;
import tu.v;
import uu.o0;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class WebSocketDeflateExtension implements WebSocketExtension<Config> {
    public static final Companion Companion = new Companion(null);
    private static final AttributeKey<WebSocketDeflateExtension> key = new AttributeKey<>("WebsocketDeflateExtension");
    private static final boolean rsv1 = true;
    private static final boolean rsv2 = false;
    private static final boolean rsv3 = false;
    private final Config config;
    private boolean decompressIncoming;
    private final Deflater deflater;
    private final WebSocketExtensionFactory<Config, ? extends WebSocketExtension<Config>> factory;
    private boolean incomingNoContextTakeover;
    private final Inflater inflater;
    private boolean outgoingNoContextTakeover;
    private final List<WebSocketExtensionHeader> protocols;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion implements WebSocketExtensionFactory<Config, WebSocketDeflateExtension> {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        @Override // io.ktor.websocket.WebSocketExtensionFactory
        public AttributeKey<WebSocketDeflateExtension> getKey() {
            return WebSocketDeflateExtension.key;
        }

        @Override // io.ktor.websocket.WebSocketExtensionFactory
        public boolean getRsv1() {
            return WebSocketDeflateExtension.rsv1;
        }

        @Override // io.ktor.websocket.WebSocketExtensionFactory
        public boolean getRsv2() {
            return WebSocketDeflateExtension.rsv2;
        }

        @Override // io.ktor.websocket.WebSocketExtensionFactory
        public boolean getRsv3() {
            return WebSocketDeflateExtension.rsv3;
        }

        private Companion() {
        }

        @Override // io.ktor.websocket.WebSocketExtensionFactory
        public WebSocketDeflateExtension install(l config) {
            e0.checkNotNullParameter(config, "config");
            Config config2 = new Config();
            config.invoke(config2);
            return new WebSocketDeflateExtension(config2);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Config {
        private boolean clientNoContextTakeOver;
        private boolean serverNoContextTakeOver;
        private int compressionLevel = -1;
        private l manualConfig = WebSocketDeflateExtension$Config$manualConfig$1.INSTANCE;
        private l compressCondition = WebSocketDeflateExtension$Config$compressCondition$1.INSTANCE;

        public final List<WebSocketExtensionHeader> build$ktor_websockets() {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.clientNoContextTakeOver) {
                arrayList2.add("client_no_context_takeover");
            }
            if (this.serverNoContextTakeOver) {
                arrayList2.add("server_no_context_takeover");
            }
            arrayList.add(new WebSocketExtensionHeader("permessage-deflate", arrayList2));
            this.manualConfig.invoke(arrayList);
            return arrayList;
        }

        public final void compressIf(l block) {
            e0.checkNotNullParameter(block, "block");
            this.compressCondition = new WebSocketDeflateExtension$Config$compressIf$1(block, this.compressCondition);
        }

        public final void compressIfBiggerThan(int i10) {
            compressIf(new WebSocketDeflateExtension$Config$compressIfBiggerThan$1(i10));
        }

        public final void configureProtocols(l block) {
            e0.checkNotNullParameter(block, "block");
            this.manualConfig = new WebSocketDeflateExtension$Config$configureProtocols$1(this.manualConfig, block);
        }

        public final boolean getClientNoContextTakeOver() {
            return this.clientNoContextTakeOver;
        }

        public final l getCompressCondition$ktor_websockets() {
            return this.compressCondition;
        }

        public final int getCompressionLevel() {
            return this.compressionLevel;
        }

        public final l getManualConfig$ktor_websockets() {
            return this.manualConfig;
        }

        public final boolean getServerNoContextTakeOver() {
            return this.serverNoContextTakeOver;
        }

        public final void setClientNoContextTakeOver(boolean z10) {
            this.clientNoContextTakeOver = z10;
        }

        public final void setCompressCondition$ktor_websockets(l lVar) {
            e0.checkNotNullParameter(lVar, "<set-?>");
            this.compressCondition = lVar;
        }

        public final void setCompressionLevel(int i10) {
            this.compressionLevel = i10;
        }

        public final void setManualConfig$ktor_websockets(l lVar) {
            e0.checkNotNullParameter(lVar, "<set-?>");
            this.manualConfig = lVar;
        }

        public final void setServerNoContextTakeOver(boolean z10) {
            this.serverNoContextTakeOver = z10;
        }
    }

    public WebSocketDeflateExtension(Config config) {
        e0.checkNotNullParameter(config, "config");
        this.config = config;
        this.factory = Companion;
        this.protocols = config.build$ktor_websockets();
        this.inflater = new Inflater(true);
        this.deflater = new Deflater(config.getCompressionLevel(), true);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // io.ktor.websocket.WebSocketExtension
    public boolean clientNegotiation(List<WebSocketExtensionHeader> negotiatedProtocols) {
        Object next;
        e0.checkNotNullParameter(negotiatedProtocols, "negotiatedProtocols");
        Iterator<T> it = negotiatedProtocols.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (e0.areEqual(((WebSocketExtensionHeader) next).getName(), "permessage-deflate")) {
                break;
            }
        }
        WebSocketExtensionHeader webSocketExtensionHeader = (WebSocketExtensionHeader) next;
        if (webSocketExtensionHeader == null) {
            return false;
        }
        this.incomingNoContextTakeover = this.config.getServerNoContextTakeOver();
        this.outgoingNoContextTakeover = this.config.getClientNoContextTakeOver();
        for (v vVar : webSocketExtensionHeader.parseParameters()) {
            String str = (String) vVar.component1();
            String str2 = (String) vVar.component2();
            switch (str.hashCode()) {
                case -708713803:
                    if (str.equals("client_no_context_takeover")) {
                        if (!n0.isBlank(str2)) {
                            throw new IllegalStateException(b.k("WebSocket permessage-deflate extension parameter client_no_context_takeover shouldn't have a value. Current: ", str2).toString());
                        }
                        this.outgoingNoContextTakeover = true;
                        break;
                    } else {
                        continue;
                    }
                case 646404390:
                    if (str.equals("client_max_window_bits") && !n0.isBlank(str2) && Integer.parseInt(str2) != 15) {
                        throw new IllegalStateException("Only 15 window size is supported.");
                    }
                    break;
                case 1266201133:
                    if (str.equals("server_no_context_takeover")) {
                        if (!n0.isBlank(str2)) {
                            throw new IllegalStateException(b.k("WebSocket permessage-deflate extension parameter server_no_context_takeover shouldn't have a value. Current: ", str2).toString());
                        }
                        this.incomingNoContextTakeover = true;
                        break;
                    } else {
                        continue;
                    }
                case 2034279582:
                    str.equals("server_max_window_bits");
                    break;
            }
        }
        return true;
    }

    @Override // io.ktor.websocket.WebSocketExtension
    public WebSocketExtensionFactory<Config, ? extends WebSocketExtension<Config>> getFactory() {
        return this.factory;
    }

    public final boolean getIncomingNoContextTakeover$ktor_websockets() {
        return this.incomingNoContextTakeover;
    }

    public final boolean getOutgoingNoContextTakeover$ktor_websockets() {
        return this.outgoingNoContextTakeover;
    }

    @Override // io.ktor.websocket.WebSocketExtension
    public List<WebSocketExtensionHeader> getProtocols() {
        return this.protocols;
    }

    @Override // io.ktor.websocket.WebSocketExtension
    public Frame processIncomingFrame(Frame frame) {
        e0.checkNotNullParameter(frame, "frame");
        if (!WebSocketDeflateExtensionKt.isCompressed(frame) && !this.decompressIncoming) {
            return frame;
        }
        this.decompressIncoming = true;
        byte[] bArrInflateFully = DeflaterUtilsKt.inflateFully(this.inflater, frame.getData());
        if (this.incomingNoContextTakeover) {
            this.inflater.reset();
        }
        if (frame.getFin()) {
            this.decompressIncoming = false;
        }
        return Frame.Companion.byType(frame.getFin(), frame.getFrameType(), bArrInflateFully, !rsv1, frame.getRsv2(), frame.getRsv3());
    }

    @Override // io.ktor.websocket.WebSocketExtension
    public Frame processOutgoingFrame(Frame frame) {
        e0.checkNotNullParameter(frame, "frame");
        if ((!(frame instanceof Frame.Text) && !(frame instanceof Frame.Binary)) || !((Boolean) this.config.getCompressCondition$ktor_websockets().invoke(frame)).booleanValue()) {
            return frame;
        }
        byte[] bArrDeflateFully = DeflaterUtilsKt.deflateFully(this.deflater, frame.getData());
        if (this.outgoingNoContextTakeover) {
            this.deflater.reset();
        }
        return Frame.Companion.byType(frame.getFin(), frame.getFrameType(), bArrDeflateFully, rsv1, frame.getRsv2(), frame.getRsv3());
    }

    @Override // io.ktor.websocket.WebSocketExtension
    public List<WebSocketExtensionHeader> serverNegotiation(List<WebSocketExtensionHeader> requestedProtocols) {
        Object next;
        e0.checkNotNullParameter(requestedProtocols, "requestedProtocols");
        Iterator<T> it = requestedProtocols.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (e0.areEqual(((WebSocketExtensionHeader) next).getName(), "permessage-deflate")) {
                break;
            }
        }
        WebSocketExtensionHeader webSocketExtensionHeader = (WebSocketExtensionHeader) next;
        if (webSocketExtensionHeader == null) {
            return p0.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (v vVar : webSocketExtensionHeader.parseParameters()) {
            String str = (String) vVar.component1();
            String str2 = (String) vVar.component2();
            Locale locale = Locale.getDefault();
            e0.checkNotNullExpressionValue(locale, "getDefault()");
            String lowerCase = str.toLowerCase(locale);
            e0.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            switch (lowerCase.hashCode()) {
                case -708713803:
                    if (!lowerCase.equals("client_no_context_takeover")) {
                        throw new IllegalStateException(("Unsupported extension parameter: (" + str + ", " + str2 + ')').toString());
                    }
                    if (!n0.isBlank(str2)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    this.incomingNoContextTakeover = true;
                    arrayList.add("client_no_context_takeover");
                case 646404390:
                    if (!lowerCase.equals("client_max_window_bits")) {
                        throw new IllegalStateException(("Unsupported extension parameter: (" + str + ", " + str2 + ')').toString());
                    }
                case 1266201133:
                    if (!lowerCase.equals("server_no_context_takeover")) {
                        throw new IllegalStateException(("Unsupported extension parameter: (" + str + ", " + str2 + ')').toString());
                    }
                    if (!n0.isBlank(str2)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    this.outgoingNoContextTakeover = true;
                    arrayList.add("server_no_context_takeover");
                case 2034279582:
                    if (!lowerCase.equals("server_max_window_bits")) {
                        throw new IllegalStateException(("Unsupported extension parameter: (" + str + ", " + str2 + ')').toString());
                    }
                    if (Integer.parseInt(str2) != 15) {
                        throw new IllegalStateException("Only 15 window size is supported");
                    }
                default:
                    throw new IllegalStateException(("Unsupported extension parameter: (" + str + ", " + str2 + ')').toString());
            }
        }
        return o0.listOf(new WebSocketExtensionHeader("permessage-deflate", arrayList));
    }

    public final void setIncomingNoContextTakeover$ktor_websockets(boolean z10) {
        this.incomingNoContextTakeover = z10;
    }

    public final void setOutgoingNoContextTakeover$ktor_websockets(boolean z10) {
        this.outgoingNoContextTakeover = z10;
    }
}
