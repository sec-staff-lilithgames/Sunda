package io.ktor.websocket;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.a;
import kv.l;
import tu.x0;
import uu.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class WebSocketExtensionsConfig {
    private final List<a> installers = new ArrayList();
    private final Boolean[] rcv;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.websocket.WebSocketExtensionsConfig$install$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements l {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m4585invoke(Object obj) {
            e0.checkNotNullParameter(obj, "$this$null");
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m4585invoke(obj);
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.websocket.WebSocketExtensionsConfig$install$2, reason: invalid class name */
    public static final class AnonymousClass2 extends f0 implements a {
        final /* synthetic */ l $config;
        final /* synthetic */ WebSocketExtensionFactory<ConfigType, ?> $extension;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(WebSocketExtensionFactory<ConfigType, ?> webSocketExtensionFactory, l lVar) {
            super(0);
            this.$extension = webSocketExtensionFactory;
            this.$config = lVar;
        }

        @Override // kv.a
        public final WebSocketExtension<?> invoke() {
            return this.$extension.install(this.$config);
        }
    }

    public WebSocketExtensionsConfig() {
        Boolean bool = Boolean.FALSE;
        this.rcv = new Boolean[]{bool, bool, bool};
    }

    private final void checkConflicts(WebSocketExtensionFactory<?, ?> webSocketExtensionFactory) {
        boolean z10 = true;
        if ((!webSocketExtensionFactory.getRsv1() || !this.rcv[1].booleanValue()) && ((!webSocketExtensionFactory.getRsv2() || !this.rcv[2].booleanValue()) && (!webSocketExtensionFactory.getRsv3() || !this.rcv[3].booleanValue()))) {
            z10 = false;
        }
        if (z10) {
            throw new IllegalStateException("Failed to install extension. Please check configured extensions for conflicts.");
        }
    }

    public static /* synthetic */ void install$default(WebSocketExtensionsConfig webSocketExtensionsConfig, WebSocketExtensionFactory webSocketExtensionFactory, l lVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar = AnonymousClass1.INSTANCE;
        }
        webSocketExtensionsConfig.install(webSocketExtensionFactory, lVar);
    }

    public final List<WebSocketExtension<?>> build() {
        List<a> list = this.installers;
        ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((WebSocketExtension) ((a) it.next()).invoke());
        }
        return arrayList;
    }

    public final <ConfigType> void install(WebSocketExtensionFactory<ConfigType, ?> extension, l config) {
        e0.checkNotNullParameter(extension, "extension");
        e0.checkNotNullParameter(config, "config");
        checkConflicts(extension);
        this.installers.add(new AnonymousClass2(extension, config));
    }
}
